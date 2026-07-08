package X;

import Y.ARunnableS0S1000000_2;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpAwemeInfo;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Rdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700410Rdf {
    public static final C700410Rdf LIZ = new C700410Rdf();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"bottom_banner_promote_ads", "left_container_cla_caption", "bottom_banner_anti_addiction", "bottom_banner_ai_creator_assistant"});
    public static final Map<String, String> LIZJ = C2097608Jq.LJIIIIZZ(new Pair("standardized_bottom_button", "bottom_button"), new Pair("high_tag_standardized_container", "high_tag"), new Pair("meta_tag_standardized_container", "meta_tag"), new Pair("anchor_template", "anchor"), new Pair("anchor_ucg_template", "anchor"), new Pair("anchor_auto_cut", "anchor"), new Pair("anchor_pugc_template", "anchor"), new Pair("anchor_tt_capcut_template", "anchor"), new Pair("anchor_aigt_template", "anchor"), new Pair("anchor_sgt_template", "anchor"));
    public static final Set<String> LIZLLL = Collections.singleton("");
    public static Aweme LJ;

    public static String LIZIZ(GlobalComponentData globalComponentData) {
        if (globalComponentData.getShowStrategy() == 1) {
            return "unrestricted";
        }
        if (globalComponentData.getShowStrategy() == 2) {
            return "must_show";
        }
        if (globalComponentData.getShowStrategy() == 0) {
            return "normal";
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZLLL(View view) {
        View view2;
        Object tag;
        FcpAwemeInfo fcpAwemeInfo;
        if (view == null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent != 0; parent = parent.getParent()) {
            if (parent instanceof InterfaceC703980RjQ) {
                if (!(parent instanceof ViewGroup) || (view2 = (View) parent) == null || (tag = view2.getTag(C700100RdA.LJII)) == null) {
                    return;
                }
                Object tag2 = view2.getTag(C700100RdA.LJIIIIZZ);
                if ((tag2 instanceof FcpAwemeInfo) && (fcpAwemeInfo = (FcpAwemeInfo) tag2) != null) {
                    LJ(view, tag, fcpAwemeInfo, true);
                    return;
                }
                return;
            }
        }
    }

    public static void LIZJ(C2344009Gk c2344009Gk, C699090RbX c699090RbX) {
        String strLIZIZ = LIZIZ(c699090RbX.LLILLJJLI);
        if (strLIZIZ != null) {
            c2344009Gk.LJFF("component_avoid_type", strLIZIZ);
        }
    }

    public static void LJFF(String str, C699090RbX c699090RbX, EnumC702720RhO enumC702720RhO) {
        String genreType;
        String genreType2;
        String aid;
        String authorUid;
        String matchedContainerKey = c699090RbX.LLILLJJLI.getMatchedContainerKey();
        String str2 = c699090RbX.LLILZLL;
        String str3 = c699090RbX.LLILZIL;
        if (!TextUtils.isEmpty(str) && !C13LP.LJJJJ(str, C698800Rb4.LJ)) {
            Aweme aweme = LJ;
            Integer numValueOf = null;
            if (aweme != null) {
                genreType = AwemeExtKt.getGenreType(aweme);
            } else {
                genreType = null;
            }
            if (!TextUtils.isEmpty(genreType)) {
                Aweme aweme2 = LJ;
                if (aweme2 != null) {
                    genreType2 = AwemeExtKt.getGenreType(aweme2);
                } else {
                    genreType2 = null;
                }
            } else {
                genreType2 = "video";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(C700120RdC.LIZ(str2) ? 1 : 0, "hit_fcp");
            c2344009Gk.LJIIIIZZ("enter_from", str3);
            Aweme aweme3 = LJ;
            if (aweme3 != null) {
                aid = aweme3.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            Aweme aweme4 = LJ;
            if (aweme4 != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme4);
            } else {
                authorUid = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            c2344009Gk.LJIIIIZZ("component_key", str);
            c2344009Gk.LJIIIIZZ("component_type", C700460Rdk.LIZIZ(matchedContainerKey));
            Aweme aweme5 = LJ;
            if (aweme5 != null) {
                numValueOf = Integer.valueOf(aweme5.getAwemeType());
            }
            c2344009Gk.LJ(numValueOf, "aweme_type");
            c2344009Gk.LJIIIIZZ("aweme_genres", genreType2);
            c2344009Gk.LIZJ(enumC702720RhO.getValue(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            LIZJ(c2344009Gk, c699090RbX);
            C20684815ws.LJIILLIIL("occupied_hidden_core_fdmt_component", c2344009Gk.LIZ);
            IFeedDebugService iFeedDebugService = (IFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IFeedDebugService.class, false, false, false, 14, null);
            if (iFeedDebugService != null) {
                iFeedDebugService.LIZJ();
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LJ(View view, Object obj, FcpAwemeInfo fcpAwemeInfo, boolean z) {
        String str;
        String str2;
        boolean z2;
        String str3;
        String str4;
        Function2<String, View, Map<String, String>> function2;
        Map<String, String> mapInvoke;
        InterfaceC1631620sYq<String, C2344009Gk, View, Unit> interfaceC1631620sYq;
        PaidContentInfo paidContentInfo;
        if (obj instanceof C699090RbX) {
            C699090RbX c699090RbX = (C699090RbX) obj;
            String str5 = c699090RbX.LLILZ;
            Object tag = view.getTag(C700100RdA.LJIIIZ);
            if (!(tag instanceof String) || (str = (String) tag) == null) {
                str = "";
            }
            C700450Rdj c700450RdjVN0 = c699090RbX.LL.vN0();
            String strH3 = c699090RbX.LL.H3();
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(strH3) && !C13LP.LJJJJ(str5, LIZIZ) && !Intrinsics.LJFF("no_click", str) && !C13LP.LJJJJ(str5, C698800Rb4.LJ)) {
                String str6 = c699090RbX.LLILZLL;
                String str7 = c699090RbX.LLILZIL;
                boolean zLJFF = Intrinsics.LJFF(c699090RbX.LLJILJILJ, Boolean.TRUE);
                if (view.getTag(C700100RdA.LJIIJ) != null && z) {
                    return;
                }
                String matchedContainerKey = c699090RbX.LLILLJJLI.getMatchedContainerKey();
                C20653815rs.LIZJ(C20653815rs.LIZ, fcpAwemeInfo.groupId, str5, str);
                try {
                    if ((Intrinsics.LJFF(str5, "genre_tag_photo") || Intrinsics.LJFF(str5, "low_tag_photo")) && view.getTag(R.id.em7) == null) {
                        C20684815ws.onEventV3("fcp_tag_container_click_event_error");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (!TextUtils.isEmpty(fcpAwemeInfo.genreType)) {
                    str2 = fcpAwemeInfo.genreType;
                } else {
                    str2 = "video";
                }
                if (((Boolean) C266590Acb.LIZ.getValue()).booleanValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String str8 = "positive";
                if (!z2) {
                    str3 = "positive";
                } else {
                    str3 = "default";
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(C700120RdC.LIZ(str6) ? 1 : 0, "hit_fcp");
                c2344009Gk.LJIIIIZZ("enter_from", str7);
                c2344009Gk.LJIIIIZZ("group_id", fcpAwemeInfo.groupId);
                c2344009Gk.LJIIIIZZ("author_id", fcpAwemeInfo.authorId);
                c2344009Gk.LJIIIIZZ("component_key", str5);
                c2344009Gk.LJIIIIZZ("component_type", C700460Rdk.LIZIZ(matchedContainerKey));
                c2344009Gk.LIZJ(fcpAwemeInfo.awemeType, "aweme_type");
                c2344009Gk.LJIIIIZZ("aweme_genres", str2);
                c2344009Gk.LJIIIIZZ("enter_method", fcpAwemeInfo.enterMethod);
                c2344009Gk.LIZJ(zLJFF ? 1 : 0, "should_preload");
                Aweme aweme = LJ;
                if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null) {
                    c2344009Gk.LIZLLL(paidContentInfo.getCategory(), "series_category");
                }
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "merge_feed_component_click_event", true, false) && !z) {
                    c2344009Gk.LIZJ(1, "use_custom_click");
                }
                LIZJ(c2344009Gk, c699090RbX);
                C1612650s4F.LIZIZ.appendPaidContentFcpComponentParam(LJ, c2344009Gk);
                C698670Rar.LIZ.getClass();
                String strLJIIIZ = c2344009Gk.LJIIIZ("enter_from");
                String strLJIIIZ2 = c2344009Gk.LJIIIZ("component_key");
                if (u.LJIJI("homepage_hot", strLJIIIZ, true) && a0.LJJIIZI(strLJIIIZ2, "anchor", false)) {
                    C698670Rar.LJII++;
                }
                C700460Rdk.LIZ(c2344009Gk, LJ);
                if (!C0C64.LJIILLIIL().LJIIIZ(31744, "merge_feed_component_click_event", true, false) && !z) {
                    str4 = "custom_click_core_fdmt_component";
                } else {
                    str4 = "click_core_fdmt_component";
                }
                boolean z3 = true;
                if (!((Boolean) C283400B8w.LIZ.getValue()).booleanValue()) {
                    z3 = false;
                }
                if (z3) {
                    if (!Intrinsics.LJFF(str, "positive") && !Intrinsics.LJFF(str, "negative")) {
                        C20684815ws.LJFF().submit(new ARunnableS0S1000000_2(str5, 3));
                    }
                    if (Intrinsics.LJFF(str, "positive") || Intrinsics.LJFF(str, "negative")) {
                        c2344009Gk.LJFF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
                    }
                } else {
                    if (Intrinsics.LJFF("negative", str)) {
                        str8 = "negative";
                    }
                    c2344009Gk.LJFF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str8);
                }
                if ((c700450RdjVN0 instanceof C700040Rd4) && (interfaceC1631620sYq = ((C700040Rd4) c700450RdjVN0).LJ) != null) {
                    interfaceC1631620sYq.invoke(str4, c2344009Gk, view);
                    return;
                }
                if (c700450RdjVN0 != null && c700450RdjVN0.LIZIZ != null && (function2 = c700450RdjVN0.LIZIZ) != null && (mapInvoke = function2.invoke(str4, view)) != null) {
                    for (Map.Entry<String, String> entry : mapInvoke.entrySet()) {
                        if (C703302op.LIZ(entry.getValue())) {
                            c2344009Gk.LJFF(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C699940Rcu.LIZ(c2344009Gk, fcpAwemeInfo.groupId, str5);
                C20684815ws.LJIILLIIL(str4, c2344009Gk.LIZ);
            }
        }
    }

    public static C2344009Gk LIZ(String str, Aweme aweme, C699090RbX c699090RbX, Integer num, String str2) {
        String genreType;
        String genreType2;
        String aid;
        String authorUid;
        int iIntValue;
        String matchedContainerKey = c699090RbX.LLILLJJLI.getMatchedContainerKey();
        String str3 = c699090RbX.LLILZLL;
        String str4 = c699090RbX.LLILZIL;
        boolean zLJFF = Intrinsics.LJFF(c699090RbX.LLJILJILJ, Boolean.TRUE);
        Integer numValueOf = null;
        if (TextUtils.isEmpty(str) || C13LP.LJJJJ(str, C698800Rb4.LJ)) {
            return null;
        }
        if (aweme != null) {
            genreType = AwemeExtKt.getGenreType(aweme);
        } else {
            genreType = null;
        }
        if (!TextUtils.isEmpty(genreType)) {
            if (aweme != null) {
                genreType2 = AwemeExtKt.getGenreType(aweme);
            } else {
                genreType2 = null;
            }
        } else {
            genreType2 = "video";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(C700120RdC.LIZ(str3) ? 1 : 0, "hit_fcp");
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str3);
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LJIIIIZZ("component_key", str);
        c2344009Gk.LJIIIIZZ("component_type", C700460Rdk.LIZIZ(matchedContainerKey));
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        }
        c2344009Gk.LJ(numValueOf, "aweme_type");
        c2344009Gk.LJIIIIZZ("aweme_genres", genreType2);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        c2344009Gk.LIZJ(iIntValue, "position");
        c2344009Gk.LIZJ(zLJFF ? 1 : 0, "should_preload");
        LIZJ(c2344009Gk, c699090RbX);
        return c2344009Gk;
    }

    public static void LJI(String str, Aweme aweme, C699090RbX c699090RbX, Integer num, String str2, C700450Rdj c700450Rdj) {
        Function2<String, C2344009Gk, Unit> function2;
        C2344009Gk c2344009GkLIZ = LIZ(str, aweme, c699090RbX, num, str2);
        if (c2344009GkLIZ == null) {
            return;
        }
        C1612650s4F.LIZIZ.appendPaidContentFcpComponentParam(aweme, c2344009GkLIZ);
        C698670Rar.LIZ.getClass();
        C698670Rar.LIZJ(c2344009GkLIZ);
        C700460Rdk.LIZ(c2344009GkLIZ, aweme);
        if ((c700450Rdj instanceof C700040Rd4) && (function2 = ((C700040Rd4) c700450Rdj).LIZLLL) != null) {
            function2.invoke("show_core_fdmt_component", c2344009GkLIZ);
        } else if (c700450Rdj != null && c700450Rdj.LIZ != null) {
            Function2<String, C2344009Gk, Unit> function22 = c700450Rdj.LIZ;
            if (function22 != null) {
                function22.invoke("show_core_fdmt_component", c2344009GkLIZ);
            }
        } else {
            C20684815ws.LJIILLIIL("show_core_fdmt_component", c2344009GkLIZ.LIZ);
        }
        IFeedDebugService iFeedDebugService = (IFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IFeedDebugService.class, false, false, false, 14, null);
        if (iFeedDebugService != null) {
            iFeedDebugService.LIZJ();
        }
    }
}
