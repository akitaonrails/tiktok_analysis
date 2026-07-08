package X;

import Y.ARunnableS113S0100000_13;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import com.ss.android.ugc.aweme.ad.feed.ibe.setting.IBEConfigSettings;
import com.ss.android.ugc.aweme.commerce.CommercialVideoInfo;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS113S0400000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1063050dln implements InterfaceC987480bnu {
    public final InterfaceC1058410deJ LL;
    public C789490Uy3 LLILLJJLI;
    public long LLILLL;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    public final void LIZ() {
        C1063100dls.LIZIZ.LJFF = false;
        C789490Uy3 c789490Uy3 = this.LLILLJJLI;
        if (c789490Uy3 != null) {
            int visibility = c789490Uy3.getVisibility();
            c789490Uy3.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c789490Uy3);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB view = c789490Uy3.getView();
            if (view != null) {
                C0J3A.LIZIZ(view, "IBEHide", new Pair[0]);
            }
        }
    }

    @Override // X.InterfaceC987480bnu
    public final void LJJJJJL() {
        C1062900dlY c1062900dlY = C1063100dls.LIZ;
        C1063100dls.LIZIZ.LJ();
    }

    @Override // X.InterfaceC987480bnu
    public final void LLIIII() {
        C1062900dlY c1062900dlY = C1063100dls.LIZ;
        C1063100dls.LIZIZ.LIZLLL();
    }

    @Override // X.InterfaceC987480bnu
    public final void n5() {
        LIZ();
        C1062900dlY c1062900dlY = C1063100dls.LIZ;
        C1063160dly c1063160dly = C1063160dly.LJI;
        C1063100dls.LIZIZ.LIZJ();
        C1063100dls.LIZIZ = c1063160dly;
    }

    @Override // X.InterfaceC987480bnu
    public final void Fy0() {
        LIZ();
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1058410deJ Mh() {
        return this.LL;
    }

    public C1063050dln(C987620bo8 c987620bo8) {
        this.LL = c987620bo8;
    }

    public static long LIZIZ(Aweme aweme) {
        long duration = aweme.getVideo().getDuration();
        double d = IBEConfigSettings.LIZ().ibeHideTime;
        double d2 = LSPassThroughRecordSizeConfig.DEFAULT;
        if (duration <= C814420VxA.LIZJ(d * d2)) {
            return 0L;
        }
        return C814420VxA.LIZJ(IBEConfigSettings.LIZ().ibeShowTime * d2);
    }

    public final void LIZJ(View view) {
        this.LLILLJJLI = (C789490Uy3) view.findViewById(R.id.hs4);
    }

    @Override // X.InterfaceC987480bnu
    public final void WR1(Aweme aweme) {
        boolean z;
        List<IBEInfo> ibeInfos;
        IBEInfo iBEInfo;
        int iIntValue;
        Object c098200Yq;
        String strLJIIJ;
        if (aweme != null) {
            if (Intrinsics.LJFF(aweme.getAid(), C1063100dls.LIZIZ.LIZ) && System.currentTimeMillis() - this.LLILLL < 500) {
                z = true;
            } else {
                z = false;
            }
            this.LLILLL = System.currentTimeMillis();
            if (!z) {
                CommercialVideoInfo commercialVideoInfoLJ = C1009740cNo.LJ(aweme);
                InteractiveBrandedEffectInfo interactiveBrandedEffectInfo = null;
                if (commercialVideoInfoLJ != null && (ibeInfos = commercialVideoInfoLJ.getIbeInfos()) != null && (iBEInfo = (IBEInfo) C13LP.LJJLIIIJL(ibeInfos)) != null) {
                    InteractiveBrandedEffectInfo ibeMetaInfo = commercialVideoInfoLJ.getIbeMetaInfo();
                    if (ibeMetaInfo == null) {
                        C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
                        if (c0n0yLJLJJI != null && (((strLJIIJ = c0n0yLJLJJI.LJIIJ("information")) != null || (strLJIIJ = c0n0yLJLJJI.LJIIJ("com.android.information")) != null || (strLJIIJ = c0n0yLJLJJI.LJIIJ("com.apple.quicktime.information")) != null) && !TextUtils.isEmpty(strLJIIJ))) {
                            try {
                                JSONObject jSONObject = new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(strLJIIJ), "com.bytedance.info"));
                                if (jSONObject.has("interactive_branded_effect_infos")) {
                                    List list = (List) C7740030o.LIZ().getGson().LJIIIIZZ(JSONObjectProtectorUtils.getString(jSONObject, "interactive_branded_effect_infos"), new TypeToken<ArrayList<InteractiveBrandedEffectInfo>>() { // from class: X.0dlw
                                    }.getType());
                                    if (list != null && !list.isEmpty()) {
                                        interactiveBrandedEffectInfo = (InteractiveBrandedEffectInfo) C13LP.LJJLIIIJJI(list);
                                    }
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1AF0.LJ(e);
                            }
                        }
                        ibeMetaInfo = interactiveBrandedEffectInfo;
                    }
                    if (ibeMetaInfo == null) {
                        C1AF0.LIZLLL("Found IBEInfo in Aweme but no metadata in video.", C2097608Jq.LJIIIIZZ(new Pair("prop_id", iBEInfo.propId), new Pair("video_id", aweme.getAid())));
                        return;
                    }
                    this.LL.LIZ().LL();
                    C1062900dlY c1062900dlY = C1063100dls.LIZ;
                    C1054600dYA c1054600dYA = new C1054600dYA(aweme.getAid(), ibeMetaInfo);
                    C1063100dls.LIZIZ.LIZJ();
                    C1063100dls.LIZIZ = c1054600dYA;
                    c1054600dYA.LJFF();
                    InteractiveBrandedEffectInfo interactiveBrandedEffectInfo2 = C1063100dls.LIZIZ.LIZIZ;
                    if (interactiveBrandedEffectInfo2 != null) {
                        String str = iBEInfo.lynxSchema;
                        HashMap<String, Integer> map = C1057930ddX.LIZIZ;
                        Integer num = map.get(str);
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        map.put(str, Integer.valueOf(iIntValue + 1));
                        C1057930ddX c1057930ddX = new C1057930ddX(aweme, iBEInfo, new C1063150dlx(0, null, null, null, false, 15), this.LL);
                        C1063030dll.LIZ.getClass();
                        c1057930ddX.log(C1063030dll.LIZIZ);
                        LIZLLL(aweme, "ibeShouldShow", LIZIZ(aweme), true, new AwS560S0100000_16(c1057930ddX, 616));
                        try {
                            c098200Yq = C1063100dls.LIZ.LIZJ(iBEInfo.lynxSchema);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl == null) {
                            LJ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) c098200Yq, interactiveBrandedEffectInfo2, c1057930ddX, aweme);
                            return;
                        }
                        c1057930ddX.withContext(new C1063150dlx(0, null, null, EnumC1063200dm2.RETRY.getValue(), false, 23));
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if (activityLJFF != null) {
                            CommerceIBEService.LJFF().LIZIZ(iBEInfo, activityLJFF, c1057930ddX, new AwS113S0400000_16(this, interactiveBrandedEffectInfo2, c1057930ddX, aweme, 0), new AwS417S0200000_16(thM5exceptionOrNullimpl, c1057930ddX, 39));
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1063160dly c1063160dly = C1063160dly.LJI;
                C1063100dls.LIZIZ.LIZJ();
                C1063100dls.LIZIZ = c1063160dly;
            }
        }
    }

    public final void LJ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, InteractiveBrandedEffectInfo interactiveBrandedEffectInfo, C1057930ddX c1057930ddX, Aweme aweme) {
        AbstractC1063090dlr abstractC1063090dlr = C1063100dls.LIZIZ;
        abstractC1063090dlr.LJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        LIZLLL(aweme, "ibeShow", LIZIZ(aweme), false, new C1063060dlo(this, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, interactiveBrandedEffectInfo, c1057930ddX, aweme, abstractC1063090dlr.LIZ));
    }

    public final void LIZLLL(Aweme aweme, String str, long j, boolean z, Function0<Unit> function0) {
        VideoPlayTaskManager videoPlayTaskManagerLIZ = this.LL.LIZ();
        C988300bpE c988300bpE = new C988300bpE(str);
        c988300bpE.LIZJ = (int) j;
        c988300bpE.LIZIZ(aweme.getVideo().getDuration());
        c988300bpE.LJ = false;
        c988300bpE.LJFF = z;
        c988300bpE.LIZLLL = new ARunnableS113S0100000_13(function0, (Function0<Unit>) 140);
        videoPlayTaskManagerLIZ.LLIFFJFJJ(c988300bpE.LIZ());
    }
}
