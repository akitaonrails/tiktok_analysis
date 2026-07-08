package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.api.IAnchorBusinessApi;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.text.a0;
import kotlin.text.u;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: renamed from: X.0mNK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393840mNK extends AbstractC707180Roa {
    public final View LLILZ;
    public final SmartImageView LLILZIL;
    public final View LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxTextView LLIZLLLIL;
    public AnchorCommonStruct LLJ;
    public InterfaceC1392640mLO LLJI;
    public final C054G LLJIJIL;
    public AnonymousClass0956 LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // X.InterfaceC713230RyL
    public final void LIZ() {
    }

    private final String getCCLandingPageInfo() {
        Aweme awemeLJJLIIIJJIZ;
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct anchorCommonStruct;
        Aweme awemeLJJLIIIJJIZ2;
        List<AnchorCommonStruct> anchors2;
        try {
            InterfaceC1392640mLO interfaceC1392640mLO = this.LLJI;
            boolean z = true;
            if ((interfaceC1392640mLO == null || (awemeLJJLIIIJJIZ2 = interfaceC1392640mLO.LJJLIIIJJIZ()) == null || (anchors2 = awemeLJJLIIIJJIZ2.getAnchors()) == null || !anchors2.isEmpty()) ? false : true) {
                return "";
            }
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLJI;
            String extra = (interfaceC1392640mLO2 == null || (awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ()) == null || (anchors = awemeLJJLIIIJJIZ.getAnchors()) == null || (anchorCommonStruct = anchors.get(0)) == null) ? null : anchorCommonStruct.getExtra();
            if (extra == null || !(!a0.LJJJIL(extra))) {
                z = false;
            }
            if (z && (new JSONTokener(extra).nextValue() instanceof JSONObject)) {
                return new JSONObject(extra).optString("cc_landing_page");
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return "";
        }
    }

    private final String getJumpCapCutParams() {
        n nVar = new n();
        for (Map.Entry entry : ((LinkedHashMap) C1197304mJ.LIZ()).entrySet()) {
            nVar.LJJIIJ((String) entry.getKey(), (String) entry.getValue());
        }
        return C1741890vQh.LJIIIIZZ(nVar);
    }

    public final IAnchorBusinessApi getAnchorBusinessApi() {
        return (IAnchorBusinessApi) this.LLJILJILJ.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public C1393840mNK(Context context) {
        super(context);
        this.LLJIJIL = C2296808zG.LIZIZ();
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(692));
        C786410Ut5.Sd(R.layout.b5c, C786410Ut5.ne(context), this);
        this.LLILZIL = (SmartImageView) findViewById(R.id.b2h);
        this.LLILZLL = findViewById(R.id.m8d);
        this.LLIZ = (TuxTextView) findViewById(R.id.b2n);
        this.LLIZLLLIL = (TuxTextView) findViewById(R.id.b2a);
        this.LLILZ = findViewById(R.id.b2j);
    }

    @Override // X.AbstractC707180Roa
    public final boolean LIZJ(C2344009Gk c2344009Gk) {
        String strCf;
        C1357400lQY c1357400lQY = C1357400lQY.LIZ;
        AnchorCommonStruct anchorCommonStruct = this.LLJ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLJI;
        String schema = null;
        if (interfaceC1392640mLO != null) {
            strCf = interfaceC1392640mLO.Cf();
        } else {
            strCf = null;
        }
        c1357400lQY.getClass();
        if (anchorCommonStruct != null && C1357400lQY.LIZIZ(anchorCommonStruct)) {
            C20684815ws.LJIILLIIL("guide_user_m2_show", C1357400lQY.LIZ(anchorCommonStruct, strCf, false));
        }
        if (getAnchorBusinessApi().LJIILLIIL()) {
            LJIILJJIL(1, 1000L);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJILJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJILJIL = C23250099c.LIZLLL(this.LLJIJIL, null, null, new C751560Tdy(this, null), 3);
        IAnchorBusinessApi anchorBusinessApi = getAnchorBusinessApi();
        AnchorCommonStruct anchorCommonStruct2 = this.LLJ;
        if (anchorCommonStruct2 != null) {
            schema = anchorCommonStruct2.getSchema();
        }
        anchorBusinessApi.LJIJI(getContext(), schema);
        return true;
    }

    public final Map<String, String> LJIILIIL(C2344009Gk c2344009Gk) {
        String strCf;
        String authorUid;
        String aid;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLJI;
        Aweme awemeLJJLIIIJJIZ = null;
        if (interfaceC1392640mLO != null) {
            strCf = interfaceC1392640mLO.Cf();
        } else {
            strCf = null;
        }
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLJI;
        if (interfaceC1392640mLO2 != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ();
        }
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("enter_from", strCf);
        String str = "";
        if (awemeLJJLIIIJJIZ == null || (authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (awemeLJJLIIIJJIZ != null && (aid = awemeLJJLIIIJJIZ.getAid()) != null) {
            str = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(awemeLJJLIIIJJIZ));
        return c2344009Gk.LIZ;
    }

    @Override // X.InterfaceC713230RyL
    public final void LJ(C2344009Gk c2344009Gk, Function1<? super Boolean, Unit> function1) {
        String strCf;
        String string;
        String authorUid;
        String aid;
        String id;
        String strCf2;
        String aid2;
        String strCf3;
        String strCf4;
        String strSubType;
        Aweme awemeLJJLIIIJJIZ;
        Aweme awemeLJJLIIIJJIZ2;
        Aweme awemeLJJLIIIJJIZ3;
        String authorUid2;
        String aid3;
        String strCf5;
        String aid4;
        String strCf6;
        String strCf7;
        String strSubType2;
        Aweme awemeLJJLIIIJJIZ4;
        Aweme awemeLJJLIIIJJIZ5;
        Aweme awemeLJJLIIIJJIZ6;
        Aweme awemeLJJLIIIJJIZ7;
        String strCf8;
        C1357400lQY c1357400lQY = C1357400lQY.LIZ;
        AnchorCommonStruct anchorCommonStruct = this.LLJ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLJI;
        if (interfaceC1392640mLO != null) {
            strCf = interfaceC1392640mLO.Cf();
        } else {
            strCf = null;
        }
        c1357400lQY.getClass();
        if (anchorCommonStruct != null && C1357400lQY.LIZIZ(anchorCommonStruct)) {
            C20684815ws.LJIILLIIL("guide_user_m2_click", C1357400lQY.LIZ(anchorCommonStruct, strCf, true));
        }
        if (getAnchorBusinessApi().LJIILIIL()) {
            LJIILJJIL(2, 0L);
        }
        AnchorCommonStruct anchorCommonStruct2 = this.LLJ;
        if (anchorCommonStruct2 != null) {
            String schema = anchorCommonStruct2.getSchema();
            if (schema != null) {
                Uri.Builder builderBuildUpon = UriProtector.parse(schema).buildUpon();
                if (getAnchorBusinessApi().LJIILL()) {
                    builderBuildUpon.appendQueryParameter("thread_strategy", "2");
                }
                if (getAnchorBusinessApi().LJIJJ()) {
                    builderBuildUpon.appendQueryParameter("video_level", String.valueOf(getAnchorBusinessApi().LJIILJJIL()));
                }
                String strLJIJ = getAnchorBusinessApi().LJIJ();
                if (strLJIJ != null) {
                    builderBuildUpon.appendQueryParameter("video_resolution", strLJIJ);
                }
                schema = builderBuildUpon.toString();
            }
            String str = "";
            if (schema == null) {
                string = "";
            } else {
                InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLJI;
                if (interfaceC1392640mLO2 != null) {
                    awemeLJJLIIIJJIZ7 = interfaceC1392640mLO2.LJJLIIIJJIZ();
                } else {
                    awemeLJJLIIIJJIZ7 = null;
                }
                Uri.Builder builderBuildUpon2 = UriProtector.parse(schema).buildUpon();
                InterfaceC1392640mLO interfaceC1392640mLO3 = this.LLJI;
                if (interfaceC1392640mLO3 == null || (strCf8 = interfaceC1392640mLO3.Cf()) == null) {
                    strCf8 = "";
                }
                Uri.Builder builderAppendQueryParameter = builderBuildUpon2.appendQueryParameter("entrance_from", strCf8);
                if (awemeLJJLIIIJJIZ7 != null && awemeLJJLIIIJJIZ7.getCcTemplateInfo() != null && awemeLJJLIIIJJIZ7.getCcTemplateInfo().isMatchThePolicy()) {
                    builderAppendQueryParameter.appendQueryParameter("music_copyright", awemeLJJLIIIJJIZ7.getCcTemplateInfo().getMusicCopyrightStr());
                }
                string = builderAppendQueryParameter.build().toString();
            }
            if (anchorCommonStruct2.isCCTemplate()) {
                Uri uri = UriProtector.parse(string);
                try {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "server_common_log");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } else {
                        JSONObject jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        jSONObject.put("tt_template_type", anchorCommonStruct2.subType());
                        jSONObject.put("tt_template_id", anchorCommonStruct2.getId());
                        string = C011J.LIZ(uri, "server_common_log", C786410Ut5.J3(jSONObject)).toString();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            String cCLandingPageInfo = getCCLandingPageInfo();
            if (!getAnchorBusinessApi().LJIJJLI() && cCLandingPageInfo.length() <= 0) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), string);
                smartRouteBuildRoute.withParam("anchor_event_map", (HashMap) LJIILIIL(c2344009Gk));
                InterfaceC1392640mLO interfaceC1392640mLO4 = this.LLJI;
                if (interfaceC1392640mLO4 == null || (awemeLJJLIIIJJIZ6 = interfaceC1392640mLO4.LJJLIIIJJIZ()) == null || (authorUid2 = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ6)) == null) {
                    authorUid2 = "";
                }
                smartRouteBuildRoute.withParam("author_id", authorUid2);
                InterfaceC1392640mLO interfaceC1392640mLO5 = this.LLJI;
                if (interfaceC1392640mLO5 == null || (awemeLJJLIIIJJIZ5 = interfaceC1392640mLO5.LJJLIIIJJIZ()) == null || (aid3 = awemeLJJLIIIJJIZ5.getAid()) == null) {
                    aid3 = "";
                }
                smartRouteBuildRoute.withParam("group_id", aid3);
                smartRouteBuildRoute.withParam("anchor_id", anchorCommonStruct2.getId());
                InterfaceC1392640mLO interfaceC1392640mLO6 = this.LLJI;
                if (interfaceC1392640mLO6 == null || (strCf5 = interfaceC1392640mLO6.Cf()) == null) {
                    strCf5 = "";
                }
                smartRouteBuildRoute.withParam("enter_from", strCf5);
                InterfaceC1392640mLO interfaceC1392640mLO7 = this.LLJI;
                if (interfaceC1392640mLO7 == null || (awemeLJJLIIIJJIZ4 = interfaceC1392640mLO7.LJJLIIIJJIZ()) == null || (aid4 = awemeLJJLIIIJJIZ4.getAid()) == null) {
                    aid4 = "";
                }
                smartRouteBuildRoute.withParam("from_group_id", aid4);
                InterfaceC1392640mLO interfaceC1392640mLO8 = this.LLJI;
                if (interfaceC1392640mLO8 != null) {
                    strCf6 = interfaceC1392640mLO8.Cf();
                } else {
                    strCf6 = null;
                }
                smartRouteBuildRoute.withParam("previous_page", strCf6);
                InterfaceC1392640mLO interfaceC1392640mLO9 = this.LLJI;
                if (interfaceC1392640mLO9 != null) {
                    strCf7 = interfaceC1392640mLO9.Cf();
                } else {
                    strCf7 = null;
                }
                smartRouteBuildRoute.withParam("detail_aweme_from", strCf7);
                smartRouteBuildRoute.withParam("jump_capcut_params", getJumpCapCutParams());
                AnchorCommonStruct anchorCommonStruct3 = this.LLJ;
                if (anchorCommonStruct3 != null && (strSubType2 = anchorCommonStruct3.subType()) != null) {
                    str = strSubType2;
                }
                smartRouteBuildRoute.withParam("anchor_subtype", str);
                smartRouteBuildRoute.withParam("anchor_click_time", SystemClock.elapsedRealtime());
                smartRouteBuildRoute.open();
                return;
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("cc_landing_page", cCLandingPageInfo));
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(string);
            sparkContext.LJJLIIIJILLIZJL(mapLIZJ);
            sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0Tea
                @Override // X.InterfaceC2217701Bqy
                public final Context LIZJ(Context context) {
                    return context;
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJIILLIIL(boolean z) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJIL(Activity activity, Context context) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIII(SparkActivity sparkActivity, boolean z) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIJIIJI(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJ(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJJ(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJLL(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJZI(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                    return false;
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLJLI(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLL(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void finish() {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void onActivityResult(int i, int i2, Intent intent) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void onRestoreInstanceState(Bundle bundle) {
                }

                @Override // X.InterfaceC1163130gND
                public final void release() {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJI(SparkActivity sparkActivity) {
                    if (!sparkActivity.isFinishing()) {
                        this.LL.getAnchorBusinessApi().LJIIJJI(new JSONObject().put("type", "cover"));
                    }
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                    this.LL.getAnchorBusinessApi().LJIIJJI(new JSONObject().put("type", "destroy"));
                }
            });
            Gson gson = C7740030o.LIZ().getGson();
            C628000OkA.LIZ.getClass();
            sparkContext.LJJJZ("anchor_event_map", GsonProtectorUtils.toJson(gson, LJIILIIL(C628000OkA.LIZIZ)));
            InterfaceC1392640mLO interfaceC1392640mLO10 = this.LLJI;
            if (interfaceC1392640mLO10 == null || (awemeLJJLIIIJJIZ3 = interfaceC1392640mLO10.LJJLIIIJJIZ()) == null || (authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ3)) == null) {
                authorUid = "";
            }
            sparkContext.LJJJZ("author_id", authorUid);
            InterfaceC1392640mLO interfaceC1392640mLO11 = this.LLJI;
            if (interfaceC1392640mLO11 == null || (awemeLJJLIIIJJIZ2 = interfaceC1392640mLO11.LJJLIIIJJIZ()) == null || (aid = awemeLJJLIIIJJIZ2.getAid()) == null) {
                aid = "";
            }
            sparkContext.LJJJZ("group_id", aid);
            AnchorCommonStruct anchorCommonStruct4 = this.LLJ;
            if (anchorCommonStruct4 == null || (id = anchorCommonStruct4.getId()) == null) {
                id = "";
            }
            sparkContext.LJJJZ("anchor_id", id);
            InterfaceC1392640mLO interfaceC1392640mLO12 = this.LLJI;
            if (interfaceC1392640mLO12 == null || (strCf2 = interfaceC1392640mLO12.Cf()) == null) {
                strCf2 = "";
            }
            sparkContext.LJJJZ("enter_from", strCf2);
            InterfaceC1392640mLO interfaceC1392640mLO13 = this.LLJI;
            if (interfaceC1392640mLO13 == null || (awemeLJJLIIIJJIZ = interfaceC1392640mLO13.LJJLIIIJJIZ()) == null || (aid2 = awemeLJJLIIIJJIZ.getAid()) == null) {
                aid2 = "";
            }
            sparkContext.LJJJZ("from_group_id", aid2);
            InterfaceC1392640mLO interfaceC1392640mLO14 = this.LLJI;
            if (interfaceC1392640mLO14 == null || (strCf3 = interfaceC1392640mLO14.Cf()) == null) {
                strCf3 = "";
            }
            sparkContext.LJJJZ("previous_page", strCf3);
            InterfaceC1392640mLO interfaceC1392640mLO15 = this.LLJI;
            if (interfaceC1392640mLO15 == null || (strCf4 = interfaceC1392640mLO15.Cf()) == null) {
                strCf4 = "";
            }
            sparkContext.LJJJZ("detail_aweme_from", strCf4);
            sparkContext.LJJJZ("jump_capcut_params", getJumpCapCutParams());
            AnchorCommonStruct anchorCommonStruct5 = this.LLJ;
            if (anchorCommonStruct5 != null && (strSubType = anchorCommonStruct5.subType()) != null) {
                str = strSubType;
            }
            sparkContext.LJJJZ("anchor_subtype", str);
            sparkContext.LJJJZ("anchor_click_time", String.valueOf(SystemClock.elapsedRealtime()));
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Context context = getContext();
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
    }

    public final void LJIILJJIL(int i, long j) {
        LifecycleOwner lifecycleOwnerLIZ = C948503nH.LIZ(this);
        if (lifecycleOwnerLIZ != null) {
            C948503nH.LJ(lifecycleOwnerLIZ, C0PEM.LIZJ.plus(new C854810Xg7(CoroutineExceptionHandler.LJJLIL, 1)), new C751580Te0(j, this, i, null));
        }
    }

    @Override // X.InterfaceC713230RyL
    public final void LJIIIIZZ(AnchorCommonStruct anchorCommonStruct, InterfaceC1392640mLO interfaceC1392640mLO, int i, Function0 function0) {
        TuxTextView tuxTextView;
        this.LLJ = anchorCommonStruct;
        this.LLJI = interfaceC1392640mLO;
        UrlModel icon = anchorCommonStruct.getIcon();
        if (icon != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(icon));
            c1331670kl3LJIIIIZZ.LJJ(this.LLILZIL);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        String keyword = anchorCommonStruct.getKeyword();
        if (keyword != null && (tuxTextView = this.LLIZ) != null) {
            tuxTextView.setText(u.LJJIFFI(keyword, "|", "·", false));
        }
        if (!interfaceC1392640mLO.LJIIIIZZ() && !C715400S4k.LIZIZ()) {
            float f = C715390S4j.LIZ;
            C715390S4j.LIZ(this.LLILZ);
        }
    }
}
