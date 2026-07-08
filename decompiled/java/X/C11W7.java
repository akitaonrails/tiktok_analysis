package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.iap.component.IPgcPaymentService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS113S1000000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11W7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11W7 extends AbstractC1066890drz {
    public String LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final C0K77 LLJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).C3();
    public final C1055760da2 LLJILLL = new Observer() { // from class: X.0da2
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            AnchorCommonStruct anchorCommonStruct;
            String id;
            String secUid;
            List list = (List) obj;
            this.LL.getClass();
            C11W7 c11w7 = this.LL;
            int i = 0;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            for (Object obj2 : list) {
                InterfaceC1392640mLO interfaceC1392640mLO = c11w7.LL;
                if (interfaceC1392640mLO == null) {
                    interfaceC1392640mLO = null;
                }
                User author = interfaceC1392640mLO.LJJLIIIJJIZ().getAuthor();
                if (author != null) {
                    secUid = author.getSecUid();
                } else {
                    secUid = null;
                }
                if (Intrinsics.LJFF(obj2, secUid) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
            if (i <= 0 || (anchorCommonStruct = this.LL.LLIZ) == null || (id = anchorCommonStruct.getId()) == null) {
                return;
            }
            C11W7 c11w72 = this.LL;
            c11w72.getClass();
            c11w72.LJJIJIL(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid(), id);
        }
    };
    public final C01GW LLJJ = C452501pT.LIZIZ(new C1055780da4());
    public final C1055770da3 LLJJI = new C1055770da3(this, null);

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void It(View view, Aweme aweme, boolean z) {
    }

    public final void LJJIJIIJIL() {
        LifecycleOwner lifecycleOwner;
        n nVarLJIILIIL;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct == null || anchorCommonStruct.getId() == null) {
            return;
        }
        ComponentCallbacks2 componentCallbacks2LJIILJJIL = LJIILJJIL();
        String str = null;
        if (!(componentCallbacks2LJIILJJIL instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) componentCallbacks2LJIILJJIL) == null) {
            return;
        }
        if (C296970BkV.LIZ()) {
            C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(lifecycleOwner.getLifecycle()), null, null, new C11HE(this, null), 3);
        } else {
            if (!this.LLJILJILJ) {
                this.LLJ.LJIILJJIL().observe(lifecycleOwner, this.LLJILLL);
            }
            this.LLJILJILJ = true;
        }
        C0K77 c0k77 = this.LLJ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        if (c0k77.LJJI(interfaceC1392640mLO.LJJLIIIJJIZ().getAuthor())) {
            return;
        }
        p pVar = new p();
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        k kVar = GsonProtectorUtils.parse(pVar, anchorCommonStruct2 != null ? anchorCommonStruct2.getExtra() : null);
        if (kVar != null && (nVarLJIILIIL = kVar.LJIILIIL()) != null) {
            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("subscribe_state");
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, kVarLJJIIZ, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<String>() { // from class: X.11HG
                }.getType() : C2371409Qy.LIZJ(C13LE.LJ(String.class)));
                if (!(objFromJson instanceof String)) {
                    objFromJson = null;
                }
                str = (String) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LLJIJIL = str;
        LJJIJIIJI(str);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C11W7();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.SUBSCRIPTION_ANCHOR.getTYPE();
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        String str = Intrinsics.LJFF(AwemeExtKt.getAuthorUid(LJIIZILJ()), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID()) ? "creator" : "audience";
        return new C1400390mXt(new AwS113S1000000_29(str, 2), new AwS113S1000000_29(str, 3), new AwS113S1000000_29(str, 4), null, null, 24);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        String str;
        if (Intrinsics.LJFF(AwemeExtKt.getAuthorUid(LJIIZILJ()), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID())) {
            str = "creator";
        } else {
            str = "audience";
        }
        c2344009Gk.LJFF("user_type", str);
        LJJIIJ(c2344009Gk);
    }

    public final void LJJIJIIJI(String str) {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        String id = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String aid = interfaceC1392640mLO.LJJLIIIJJIZ().getAid();
        if (aid == null) {
            aid = "";
        }
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            id = anchorCommonStruct.getId();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("show_entrance", "video_anchor");
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LJIIIIZZ("video_anchor_id", id);
        c2344009Gk.LJIIIIZZ("subscribe_state", str);
        C20684815ws.LJIILLIIL("livesdk_subscribe_icon_show", c2344009Gk.LIZ);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LLLIZZ(Aweme aweme) {
        Activity activityLJIILJJIL = LJIILJJIL();
        if ((activityLJIILJJIL instanceof LifecycleOwner) && activityLJIILJJIL != null) {
            if (!C296970BkV.LIZ()) {
                this.LLJ.LJIILJJIL().removeObserver(this.LLJILLL);
            }
            this.LLJILJILJ = false;
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        LJJIIJZLJL(c2344009Gk);
        LJJIJIIJIL();
    }

    public final void LJJIJIL(String str, String str2) {
        if (this.LLJI == null) {
            this.LLJILJIL = true;
            C118V c118v = C118V.LIZ;
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            String authorUid = AwemeExtKt.getAuthorUid(interfaceC1392640mLO.LJJLIIIJJIZ());
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
            if (interfaceC1392640mLO2 == null) {
                interfaceC1392640mLO2 = null;
            }
            String aid = interfaceC1392640mLO2.LJJLIIIJJIZ().getAid();
            if (aid == null) {
                aid = "";
            }
            c118v.getClass();
            ((C118O) C118V.LIZIZ.create(C118O.class)).LIZJ(authorUid, str, str2, aid).LJ(new C19774512Yl(this, 16), C15O7.LJIIIIZZ, null);
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String str;
        String id;
        if (this.LLJILJIL) {
            return;
        }
        if (Intrinsics.LJFF(AwemeExtKt.getAuthorUid(LJIIZILJ()), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID())) {
            str = "creator";
        } else {
            str = "audience";
        }
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("user_type", str);
        LJJII(c2344009Gk, true, true);
        String str2 = this.LLJIJIL;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        InterfaceC1392640mLO interfaceC1392640mLO2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String aid = interfaceC1392640mLO.LJJLIIIJJIZ().getAid();
        String str3 = "";
        if (aid == null) {
            aid = "";
        }
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            id = anchorCommonStruct.getId();
        } else {
            id = null;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("click_position", "video_anchor");
        c2344009Gk2.LJIIIIZZ("group_id", aid);
        c2344009Gk2.LJIIIIZZ("video_anchor_id", id);
        c2344009Gk2.LJIIIIZZ("subscribe_state", str2);
        C20684815ws.LJIILLIIL("livesdk_subscribe_icon_click", c2344009Gk2.LIZ);
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 != null) {
            String string = this.LLJI;
            if (string == null && (string = anchorCommonStruct2.getSchema()) == null) {
                string = null;
            } else {
                C13DA c13da = new C13DA();
                c13da.put("group_id", LJIIZILJ().getAid());
                Map mapBuild = c13da.build();
                if (!mapBuild.isEmpty()) {
                    Uri uri = UriProtector.parse(string);
                    Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                    Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                    for (String str4 : queryParameterNames) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = (String) mapBuild.get(str4);
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str4);
                        }
                        builderClearQuery.appendQueryParameter(str4, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    }
                    for (Map.Entry entry : mapBuild.entrySet()) {
                        String str5 = (String) entry.getKey();
                        String str6 = (String) entry.getValue();
                        if (!queryParameterNames.contains(str5)) {
                            builderClearQuery.appendQueryParameter(str5, str6);
                        }
                    }
                    string = builderClearQuery.build().toString();
                }
            }
            if (C517260KQi.LIZ()) {
                C13DA c13da2 = new C13DA();
                c13da2.put("previous_page", "");
                c13da2.put("enter_from", LJIJJLI());
                c13da2.put("show_entrance", "video_anchor");
                c13da2.put("series_enter_entrance", "anchor_video");
                String groupId = LJIIZILJ().getGroupId();
                if (groupId == null) {
                    groupId = "";
                }
                c13da2.put("group_id", groupId);
                c13da2.put("has_preview", Boolean.FALSE);
                Map<String, ? extends Object> mapBuild2 = c13da2.build();
                if (!(!mapBuild2.isEmpty())) {
                    mapBuild2 = null;
                }
                IPgcPaymentService iPgcPaymentService = (IPgcPaymentService) PluggableExtentionKt.pluggableSpi$default(IPgcPaymentService.class, false, false, false, 14, null);
                if (iPgcPaymentService != null) {
                    if (string != null) {
                        str3 = string;
                    }
                    iPgcPaymentService.LJFF(str3, "", AwemeExtKt.getAuthorUid(LJIIZILJ()), null, mapBuild2, null);
                    return;
                }
                return;
            }
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
            if (interfaceC1392640mLO3 == null) {
                interfaceC1392640mLO3 = null;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(interfaceC1392640mLO3.LIZIZ(), string);
            smartRouteBuildRoute.withParam("anchor_event_map", (HashMap) LJIJ(c2344009Gk));
            InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
            if (interfaceC1392640mLO4 == null) {
                interfaceC1392640mLO4 = null;
            }
            smartRouteBuildRoute.withParam("author_id", AwemeExtKt.getAuthorUid(interfaceC1392640mLO4.LJJLIIIJJIZ()));
            InterfaceC1392640mLO interfaceC1392640mLO5 = this.LL;
            if (interfaceC1392640mLO5 == null) {
                interfaceC1392640mLO5 = null;
            }
            String aid2 = interfaceC1392640mLO5.LJJLIIIJJIZ().getAid();
            if (aid2 == null) {
                aid2 = "";
            }
            smartRouteBuildRoute.withParam("group_id", aid2);
            smartRouteBuildRoute.withParam("anchor_id", anchorCommonStruct2.getId());
            smartRouteBuildRoute.withParam("video_anchor_id", anchorCommonStruct2.getId());
            smartRouteBuildRoute.withParam("enter_from", LJIJJLI());
            smartRouteBuildRoute.withParam("pikachu", "pikachu");
            InterfaceC1392640mLO interfaceC1392640mLO6 = this.LL;
            if (interfaceC1392640mLO6 != null) {
                interfaceC1392640mLO2 = interfaceC1392640mLO6;
            }
            String aid3 = interfaceC1392640mLO2.LJJLIIIJJIZ().getAid();
            if (aid3 != null) {
                str3 = aid3;
            }
            smartRouteBuildRoute.withParam("from_group_id", str3);
            smartRouteBuildRoute.withParam("previous_page", LJIJJLI());
            smartRouteBuildRoute.withParam("detail_aweme_from", LJIJJLI());
            smartRouteBuildRoute.withParam("show_entrance", "video_anchor");
            smartRouteBuildRoute.open();
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        String extra;
        n nVarLJIILIIL;
        Type type;
        String str;
        Type type2;
        String str2;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct == null) {
            return null;
        }
        C1394720mOk c1394720mOkLIZ = C1066920ds2.LIZ(viewGroup.getContext());
        UrlModel thumbnail = anchorCommonStruct.getThumbnail();
        if (thumbnail != null) {
            c1394720mOkLIZ.setIcon(thumbnail);
        }
        AwS430S0200000_29 awS430S0200000_29 = new AwS430S0200000_29(this, c1394720mOkLIZ, 89);
        AwS430S0200000_29 awS430S0200000_292 = new AwS430S0200000_29(c1394720mOkLIZ, anchorCommonStruct, 88);
        p pVar = new p();
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 != null) {
            extra = anchorCommonStruct2.getExtra();
        } else {
            extra = null;
        }
        k kVar = GsonProtectorUtils.parse(pVar, extra);
        if (kVar != null && (nVarLJIILIIL = kVar.LJIILIIL()) != null) {
            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("multi_anchor_title");
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type2 = C2371409Qy.LIZJ(C13LE.LJ(String.class));
                } else {
                    type2 = new TypeToken<String>() { // from class: X.11W8
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, kVarLJJIIZ, type2);
                if (!(objFromJson instanceof String)) {
                    objFromJson = null;
                }
                str2 = (String) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (str2 == null) {
                awS430S0200000_29.invoke();
            } else {
                c1394720mOkLIZ.setTitle(str2);
            }
            k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("multi_anchor_subtitle");
            try {
                Gson gsonLJFF2 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJ(String.class));
                } else {
                    type = new TypeToken<String>() { // from class: X.11W9
                    }.getType();
                }
                Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, kVarLJJIIZ2, type);
                if (!(objFromJson2 instanceof String)) {
                    objFromJson2 = null;
                }
                str = (String) objFromJson2;
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (str == null) {
                awS430S0200000_292.invoke();
            } else {
                c1394720mOkLIZ.setSubTitle(str);
            }
        } else {
            awS430S0200000_29.invoke();
            awS430S0200000_292.invoke();
        }
        C786410Ut5.I7(new C12Y6(this, c2344009Gk, 3), c1394720mOkLIZ);
        viewGroup.addView(c1394720mOkLIZ);
        return c1394720mOkLIZ;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLIIL(C712520RxC c712520RxC, Dialog dialog, boolean z, boolean z2, boolean z3) {
        LJJIJIIJIL();
    }
}
