package X;

import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10Sd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19248510Sd implements C10TG {
    public static final C19248510Sd LIZ = new C19248510Sd();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(577));

    public static Keva LJ() {
        return (Keva) LIZIZ.getValue();
    }

    @Override // X.C10TG
    public final void LIZ() {
        LJ().clear();
    }

    @Override // X.C10TG
    public final C10T0 LIZIZ() {
        if (DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId().length() == 0) {
            return new C10T0(null, null, null, null);
        }
        String string = LJ().getString("cache_date", "");
        if (string.length() <= 0) {
            string = null;
        }
        Integer numValueOf = Integer.valueOf(LJ().getInt("cache_age_range_lb", -1));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        Integer numValueOf2 = Integer.valueOf(LJ().getInt("cache_age_range_ub", -1));
        if (numValueOf2.intValue() <= 0) {
            numValueOf2 = null;
        }
        C10T0 c10t0 = new C10T0(string, numValueOf, numValueOf2, LJ().contains("cache_is_3p_age_range") ? Boolean.valueOf(LJ().getBoolean("cache_is_3p_age_range", false)) : null);
        return !c10t0.LIZ() ? new C10T0(null, null, null, null) : c10t0;
    }

    @Override // X.C10TG
    public final Integer LIZJ(int i) {
        if (i != AgeGateSdkRegistrationFlow.NEW_COMPONENT.getFlow() && i != AgeGateSdkRegistrationFlow.LOGIN_CONSENT.getFlow()) {
            return null;
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    @Override // X.C10TG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.Integer r6, java.lang.String r7, java.lang.Integer r8, java.lang.Integer r9, java.lang.String r10, java.lang.Integer r11) {
        /*
            r5 = this;
            r1 = 1
            if (r8 == 0) goto L78
            int r0 = r8.intValue()
            if (r0 != r1) goto L78
            com.bytedance.keva.Keva r0 = LJ()
            java.lang.String r1 = "cache_date"
            r0.erase(r1)
            com.bytedance.keva.Keva r0 = LJ()
            java.lang.String r4 = "cache_age_range_lb"
            r0.erase(r4)
            com.bytedance.keva.Keva r0 = LJ()
            java.lang.String r3 = "cache_age_range_ub"
            r0.erase(r3)
            com.bytedance.keva.Keva r0 = LJ()
            java.lang.String r2 = "cache_is_3p_age_range"
            r0.erase(r2)
            com.bytedance.keva.Keva r0 = LJ()
            r0.storeString(r1, r7)
            if (r9 == 0) goto L47
            int r0 = r9.intValue()
            if (r0 <= 0) goto L47
            int r1 = r9.intValue()
            com.bytedance.keva.Keva r0 = LJ()
            r0.storeInt(r4, r1)
        L47:
            if (r11 == 0) goto L60
            int r0 = r11.intValue()
            if (r0 <= 0) goto L5a
            int r1 = r11.intValue()
            com.bytedance.keva.Keva r0 = LJ()
            r0.storeInt(r3, r1)
        L5a:
            int r0 = r11.intValue()
            if (r0 > 0) goto L68
        L60:
            if (r9 == 0) goto L77
            int r0 = r9.intValue()
            if (r0 <= 0) goto L77
        L68:
            com.bytedance.keva.Keva r1 = LJ()
            java.lang.String r0 = "age_gate"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r0)
            r0 = r0 ^ 1
            r1.storeBoolean(r2, r0)
        L77:
            return
        L78:
            if (r6 == 0) goto L80
            int r0 = r6.intValue()
            if (r0 == r1) goto L77
        L80:
            r5.LIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19248510Sd.LIZLLL(java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer):void");
    }
}
