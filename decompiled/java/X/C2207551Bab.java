package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.samsung.sdk.sperf.CustomParams;
import com.samsung.sdk.sperf.PerformanceManager;
import com.samsung.sdk.sperf.SPerf;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207551Bab extends C2207491BaV implements InterfaceC2207401BaM {
    public final PerformanceManager LIZIZ;
    public C2207571Bad LIZJ;

    @Override // X.InterfaceC2207401BaM
    public final boolean LIZJ(EnumC2207531BaZ enumC2207531BaZ) {
        C2207571Bad c2207571Bad = this.LIZJ;
        return c2207571Bad != null && c2207571Bad.LIZ().contains(enumC2207531BaZ);
    }

    public C2207551Bab(Context context) {
        if (Build.VERSION.SDK_INT >= 29 && SPerf.initialize(context)) {
            PerformanceManager performanceManager = PerformanceManager.getInstance();
            this.LIZIZ = performanceManager;
            if (performanceManager != null) {
                HashSet<EnumC2207531BaZ> hashSet = new HashSet();
                hashSet.add(EnumC2207531BaZ.PRESET_SCENE);
                hashSet.add(EnumC2207531BaZ.CPU_FREQ_MIN);
                hashSet.add(EnumC2207531BaZ.CPU_FREQ_MAX);
                hashSet.add(EnumC2207531BaZ.CPU_CORE_MIN);
                hashSet.add(EnumC2207531BaZ.CPU_CORE_MAX);
                hashSet.add(EnumC2207531BaZ.GPU_FREQ_MIN);
                hashSet.add(EnumC2207531BaZ.GPU_FREQ_MAX);
                hashSet.add(EnumC2207531BaZ.BUS_FREQ_MIN);
                hashSet.add(EnumC2207531BaZ.BUS_FREQ_MAX);
                hashSet.add(EnumC2207531BaZ.TASK_PRIORITY);
                hashSet.add(EnumC2207531BaZ.CPU_AFFINITY);
                hashSet.add(EnumC2207531BaZ.IDLE_STATE);
                C2207491BaV.LIZ.addAll(hashSet);
                C2207571Bad c2207571Bad = new C2207571Bad();
                this.LIZJ = c2207571Bad;
                c2207571Bad.LJ(hashSet);
                for (EnumC2207531BaZ enumC2207531BaZ : hashSet) {
                    switch (C1ET6.LIZ[enumC2207531BaZ.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            C2207661Bam c2207661Bam = new C2207661Bam(5, LSPassThroughRecordSizeConfig.DEFAULT, true);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(c2207661Bam);
                            this.LIZJ.LIZIZ(enumC2207531BaZ, arrayList);
                            break;
                        case 7:
                        case 8:
                        case BdTuring.TYPE_EMAIL /* 11 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            this.LIZJ.LIZJ(new C2207671Ban(0, 5));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            C2207571Bad c2207571Bad2 = this.LIZJ;
                            EnumC2005807tQ enumC2005807tQ = EnumC2005807tQ.BIND_CLUSTER;
                            c2207571Bad2.getClass();
                            String string = Integer.toString(enumC2005807tQ.ordinal());
                            c2207571Bad2.LIZ.remove("cpu_core_limit_by");
                            c2207571Bad2.LIZ.put("cpu_core_limit_by", string);
                            break;
                        default:
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("SsCapabilityProvider not support this capability ");
                            sbLIZ.append(enumC2207531BaZ);
                            C2188811AlT.LIZIZ(sbLIZ);
                            C2207231Ba5.LIZ(6);
                            break;
                    }
                }
                HashMap map = new HashMap();
                EnumC2207601Bag enumC2207601Bag = EnumC2207601Bag.LEVEL_9;
                EnumC19857412mi enumC19857412mi = EnumC19857412mi.PLATFORM;
                map.put(enumC2207601Bag, new C2207471BaT(0, Integer.MAX_VALUE, enumC19857412mi, enumC2207601Bag));
                EnumC2207601Bag enumC2207601Bag2 = EnumC2207601Bag.LEVEL_8;
                map.put(enumC2207601Bag2, new C2207471BaT(0, Integer.MAX_VALUE, enumC19857412mi, enumC2207601Bag2));
                EnumC2207601Bag enumC2207601Bag3 = EnumC2207601Bag.LEVEL_7;
                EnumC19857412mi enumC19857412mi2 = EnumC19857412mi.VENDOR;
                map.put(enumC2207601Bag3, new C2207471BaT(3, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag2));
                EnumC2207601Bag enumC2207601Bag4 = EnumC2207601Bag.LEVEL_6;
                map.put(enumC2207601Bag4, new C2207471BaT(3, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag2));
                EnumC2207601Bag enumC2207601Bag5 = EnumC2207601Bag.LEVEL_5;
                map.put(enumC2207601Bag5, new C2207471BaT(2, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag5));
                EnumC2207601Bag enumC2207601Bag6 = EnumC2207601Bag.LEVEL_4;
                map.put(enumC2207601Bag6, new C2207471BaT(2, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag6));
                EnumC2207601Bag enumC2207601Bag7 = EnumC2207601Bag.LEVEL_3;
                map.put(enumC2207601Bag7, new C2207471BaT(1, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag7));
                EnumC2207601Bag enumC2207601Bag8 = EnumC2207601Bag.LEVEL_2;
                map.put(enumC2207601Bag8, new C2207471BaT(1, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag8));
                EnumC2207601Bag enumC2207601Bag9 = EnumC2207601Bag.LEVEL_1;
                map.put(enumC2207601Bag9, new C2207471BaT(0, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag9));
                EnumC2207601Bag enumC2207601Bag10 = EnumC2207601Bag.LEVEL_0;
                map.put(enumC2207601Bag10, new C2207471BaT(0, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag10));
                C13DT c13dt = C13DU.LIZ;
                c13dt.LIZIZ(enumC19857412mi2, EnumC2207531BaZ.CPU_FREQ_MIN, map);
                c13dt.LIZIZ(enumC19857412mi2, EnumC2207531BaZ.CPU_FREQ_MAX, map);
                HashMap map2 = new HashMap();
                map2.put(enumC2207601Bag, new C2207471BaT(0, Integer.MAX_VALUE, enumC19857412mi, enumC2207601Bag));
                map2.put(enumC2207601Bag2, new C2207471BaT(0, Integer.MAX_VALUE, enumC19857412mi, enumC2207601Bag2));
                map2.put(enumC2207601Bag3, new C2207471BaT(3, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag2));
                map2.put(enumC2207601Bag4, new C2207471BaT(3, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag2));
                map2.put(enumC2207601Bag5, new C2207471BaT(2, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag5));
                map2.put(enumC2207601Bag6, new C2207471BaT(2, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag6));
                map2.put(enumC2207601Bag7, new C2207471BaT(1, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag7));
                map2.put(enumC2207601Bag8, new C2207471BaT(1, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag8));
                map2.put(enumC2207601Bag9, new C2207471BaT(0, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag9));
                map2.put(enumC2207601Bag10, new C2207471BaT(0, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag10));
                c13dt.LIZIZ(enumC19857412mi2, EnumC2207531BaZ.GPU_FREQ_MIN, map2);
                c13dt.LIZIZ(enumC19857412mi2, EnumC2207531BaZ.GPU_FREQ_MAX, map2);
                HashMap map3 = new HashMap();
                map3.put(enumC2207601Bag, new C2207471BaT(3, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag));
                map3.put(enumC2207601Bag2, new C2207471BaT(3, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag2));
                map3.put(enumC2207601Bag3, new C2207471BaT(2, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag3));
                map3.put(enumC2207601Bag4, new C2207471BaT(2, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag4));
                map3.put(enumC2207601Bag5, new C2207471BaT(2, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag5));
                map3.put(enumC2207601Bag6, new C2207471BaT(1, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag6));
                map3.put(enumC2207601Bag7, new C2207471BaT(1, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag7));
                map3.put(enumC2207601Bag8, new C2207471BaT(1, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag8));
                map3.put(enumC2207601Bag9, new C2207471BaT(0, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag9));
                map3.put(enumC2207601Bag10, new C2207471BaT(0, LSPassThroughRecordSizeConfig.DEFAULT, enumC19857412mi2, enumC2207601Bag10));
                c13dt.LIZIZ(enumC19857412mi2, EnumC2207531BaZ.BUS_FREQ_MIN, map3);
                c13dt.LIZIZ(enumC19857412mi2, EnumC2207531BaZ.BUS_FREQ_MAX, map3);
                HashMap map4 = new HashMap();
                map4.put(enumC2207601Bag, new C2207471BaT(4, 99999999, enumC19857412mi2, enumC2207601Bag));
                map4.put(enumC2207601Bag2, new C2207471BaT(4, 99999999, enumC19857412mi2, enumC2207601Bag2));
                map4.put(enumC2207601Bag3, new C2207471BaT(3, 99999999, enumC19857412mi2, enumC2207601Bag3));
                map4.put(enumC2207601Bag4, new C2207471BaT(3, 99999999, enumC19857412mi2, enumC2207601Bag4));
                map4.put(enumC2207601Bag5, new C2207471BaT(2, 99999999, enumC19857412mi2, enumC2207601Bag5));
                map4.put(enumC2207601Bag6, new C2207471BaT(2, 99999999, enumC19857412mi2, enumC2207601Bag6));
                map4.put(enumC2207601Bag7, new C2207471BaT(1, 99999999, enumC19857412mi2, enumC2207601Bag7));
                map4.put(enumC2207601Bag8, new C2207471BaT(1, 99999999, enumC19857412mi2, enumC2207601Bag8));
                map4.put(enumC2207601Bag9, new C2207471BaT(0, 99999999, enumC19857412mi2, enumC2207601Bag9));
                map4.put(enumC2207601Bag10, new C2207471BaT(0, 99999999, enumC19857412mi2, enumC2207601Bag10));
                c13dt.LIZIZ(enumC19857412mi2, EnumC2207531BaZ.TASK_PRIORITY, map4);
                if (C2207221Ba4.LIZ.LIZ() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("vendor", "ss");
                        C2207221Ba4.LIZ("vboost_event_active", jSONObject);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                C2207231Ba5.LIZ(4);
            }
        }
    }

    @Override // X.InterfaceC2207401BaM
    public final Object LIZ(C2207451BaR c2207451BaR) {
        CustomParams customParams;
        int i;
        int i2;
        int i3;
        CustomParams customParams2;
        int iStart;
        if (this.LIZIZ == null) {
            return null;
        }
        switch (C1ET6.LIZ[c2207451BaR.LIZ.ordinal()]) {
            case 1:
                customParams = new CustomParams();
                customParams.add(1, c2207451BaR.LIZJ, (int) c2207451BaR.LJFF);
                iStart = this.LIZIZ.start(customParams);
                return Integer.valueOf(iStart);
            case 2:
                customParams = new CustomParams();
                customParams.add(3, c2207451BaR.LIZJ, (int) c2207451BaR.LJFF);
                iStart = this.LIZIZ.start(customParams);
                return Integer.valueOf(iStart);
            case 3:
                customParams = new CustomParams();
                customParams.add(5, c2207451BaR.LIZJ, (int) c2207451BaR.LJFF);
                iStart = this.LIZIZ.start(customParams);
                return Integer.valueOf(iStart);
            case 4:
                customParams = new CustomParams();
                customParams.add(0, c2207451BaR.LIZJ, (int) c2207451BaR.LJFF);
                iStart = this.LIZIZ.start(customParams);
                return Integer.valueOf(iStart);
            case 5:
                customParams = new CustomParams();
                customParams.add(2, c2207451BaR.LIZJ, (int) c2207451BaR.LJFF);
                iStart = this.LIZIZ.start(customParams);
                return Integer.valueOf(iStart);
            case 6:
                customParams = new CustomParams();
                customParams.add(4, c2207451BaR.LIZJ, (int) c2207451BaR.LJFF);
                iStart = this.LIZIZ.start(customParams);
                return Integer.valueOf(iStart);
            case 7:
                customParams = new CustomParams();
                i = c2207451BaR.LIZJ;
                i2 = (int) c2207451BaR.LJFF;
                i3 = 7;
                customParams.add(i3, i, i2);
                iStart = this.LIZIZ.start(customParams);
                return Integer.valueOf(iStart);
            case 8:
                customParams = new CustomParams();
                i = c2207451BaR.LIZJ;
                i2 = (int) c2207451BaR.LJFF;
                i3 = 6;
                customParams.add(i3, i, i2);
                iStart = this.LIZIZ.start(customParams);
                return Integer.valueOf(iStart);
            case BdTuring.TYPE_ECAF /* 9 */:
                if (c2207451BaR.LIZJ > 5) {
                    c2207451BaR.LIZJ = 5;
                }
                if (c2207451BaR.LIZJ < 0) {
                    c2207451BaR.LIZJ = 0;
                }
                customParams = new CustomParams();
                customParams.add(9, c2207451BaR.LIZJ, 99999999);
                iStart = this.LIZIZ.start(customParams);
                return Integer.valueOf(iStart);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                if (EnumC1781480wSY.GOLD != null && EnumC1781480wSY.SUPER != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("bind tid:");
                    sbLIZ.append(0);
                    sbLIZ.append(" to little core");
                    C2188811AlT.LIZIZ(sbLIZ);
                    C2207231Ba5.LIZ(3);
                    customParams2 = new CustomParams();
                    customParams2.add(8, 2, 99999999);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("bind tid:");
                    sbLIZ2.append(0);
                    sbLIZ2.append(" to big core");
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C2207231Ba5.LIZ(3);
                    customParams2 = new CustomParams();
                    customParams2.add(8, 1, 99999999);
                }
                iStart = this.LIZIZ.start(customParams2);
                return Integer.valueOf(iStart);
            case BdTuring.TYPE_EMAIL /* 11 */:
                C2207501BaW c2207501BaW = c2207451BaR.LIZLLL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("SamSung provider process scene ");
                sbLIZ3.append(c2207501BaW.LIZ.getDesc());
                C2188811AlT.LIZIZ(sbLIZ3);
                C2207231Ba5.LIZ(4);
                switch (C1ET6.LIZIZ[c2207501BaW.LIZ.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    case 14:
                    case 15:
                    case 16:
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    case 19:
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                    case 35:
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case BaseNotice.RECOMMEND_LIVE /* 50 */:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                        LIZLLL(0);
                        LIZLLL(1);
                        LIZLLL(2);
                        break;
                    default:
                        C2207231Ba5.LIZ(5);
                        break;
                }
                return 1;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                customParams = new CustomParams();
                i = c2207451BaR.LIZJ;
                i2 = (int) c2207451BaR.LJFF;
                i3 = 10;
                customParams.add(i3, i, i2);
                iStart = this.LIZIZ.start(customParams);
                return Integer.valueOf(iStart);
            default:
                C2207231Ba5.LIZ(5);
                return 0;
        }
    }

    @Override // X.InterfaceC2207401BaM
    public final Object LIZIZ(C2207451BaR c2207451BaR) {
        int iStart;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("restore ability ");
        sbLIZ.append(c2207451BaR.LIZ.toString());
        C2188811AlT.LIZIZ(sbLIZ);
        C2207231Ba5.LIZ(3);
        if (this.LIZIZ == null) {
            return null;
        }
        int i = C1ET6.LIZ[c2207451BaR.LIZ.ordinal()];
        if (i == 10) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("reset tid:");
            sbLIZ2.append(0);
            sbLIZ2.append(" core bind");
            C2188811AlT.LIZIZ(sbLIZ2);
            C2207231Ba5.LIZ(3);
            CustomParams customParams = new CustomParams();
            customParams.add(8, 0, 99999999);
            iStart = this.LIZIZ.start(customParams);
        } else {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    iStart = this.LIZIZ.stop();
                    break;
                default:
                    return 0;
            }
        }
        return Integer.valueOf(iStart);
    }

    public final int LIZLLL(int i) {
        int i2;
        if (i >= 0 && i <= 2) {
            PerformanceManager performanceManager = this.LIZIZ;
            if (performanceManager == null) {
                return -1;
            }
            if (i != 0) {
                if (i != 1) {
                    i2 = 256;
                } else {
                    i2 = 128;
                }
            } else {
                i2 = 64;
            }
            return performanceManager.start(i2, 6000);
        }
        C2207231Ba5.LIZ(6);
        return -1;
    }
}
