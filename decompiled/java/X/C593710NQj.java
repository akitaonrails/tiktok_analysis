package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.compliance.protection.amberalert.AmberAlertStorage;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.AmberAlert;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.AmberAlertDetail;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.DigitalWellbeingResponse;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.ScreenTimeSetting;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C593710NQj {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(65));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(66));

    public static void LIZ() {
        C11NZ<DigitalWellbeingResponse> c11nzLIZIZ;
        boolean zLJI = MethodIDManager.LJI(137829);
        if (((Boolean) C593690NQh.LIZ.getValue()).booleanValue()) {
            C593700NQi c593700NQi = (C593700NQi) LIZ.getValue();
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("report_to_tea", "1"));
            C593720NQk c593720NQk = new C593720NQk(null);
            C09BB c09bb = c593700NQi.LIZ;
            c09bb.getClass();
            c11nzLIZIZ = C11NZ.LJIJJLI(new C09B9(c09bb, "/tiktok/v1/digital_wellbeing/settings/", mapLIZJ, c593720NQk));
        } else {
            c11nzLIZIZ = ((InterfaceC593730NQl) LIZIZ.getValue()).LIZIZ();
        }
        C632140Oqq.LIZLLL(c11nzLIZIZ, "/tiktok/v1/digital_wellbeing/settings/", null).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.15au
            @Override // X.C09JN
            public final void accept(Object obj) {
                long jLongValue;
                Integer num;
                C1C7U.LIZ("DigitalWellbeingProtectionApiManager@d01b.getDigitalWellbeingSetting$1");
                DigitalWellbeingResponse digitalWellbeingResponse = (DigitalWellbeingResponse) obj;
                if (C1601630rmT.LIZ() || C1601660rmW.LIZ()) {
                    Keva keva = C20548715av.LIZ;
                    AmberAlert amberAlert = digitalWellbeingResponse.getAmberAlert();
                    if (amberAlert != null && Intrinsics.LJFF(amberAlert.onAlert, Boolean.TRUE) && !amberAlert.amberAlertDetails.isEmpty()) {
                        for (AmberAlertDetail amberAlertDetail : amberAlert.amberAlertDetails) {
                            String str = amberAlertDetail.amberAlertId;
                            if (str != null && str.length() != 0) {
                                String str2 = amberAlertDetail.amberAlertId;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                AmberAlertStorage amberAlertStorageLIZ = C20548715av.LIZ(str2);
                                if (amberAlertStorageLIZ == null) {
                                    String str3 = amberAlertDetail.amberAlertId;
                                    if (str3 != null && str3.length() != 0) {
                                        String str4 = amberAlertDetail.amberAlertId;
                                        Long l = amberAlertDetail.lastUpdateTime;
                                        if (l != null) {
                                            jLongValue = l.longValue();
                                        } else {
                                            jLongValue = 0;
                                        }
                                        amberAlertStorageLIZ = new AmberAlertStorage(str4, jLongValue, 0L, 0);
                                        C20548715av.LIZ.storeString(amberAlertDetail.amberAlertId, GsonProtectorUtils.toJson(C08JS.LIZIZ(), amberAlertStorageLIZ));
                                        C20548715av.LIZJ.getClass();
                                        C20548715av.LIZJ = new C20548815aw(true, amberAlertStorageLIZ);
                                        break;
                                    }
                                } else {
                                    Long l2 = amberAlertDetail.lastUpdateTime;
                                    long j = amberAlertStorageLIZ.lastUpdateTime;
                                    if (l2 == null || l2.longValue() != j || (System.currentTimeMillis() - amberAlertStorageLIZ.lastShownTimeStamp >= C20548715av.LIZIZ && amberAlertStorageLIZ.totalShownTimes < 3)) {
                                        C20548715av.LIZJ.getClass();
                                        C20548715av.LIZJ = new C20548815aw(true, amberAlertStorageLIZ);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                ScreenTimeSetting screenTimeSetting = digitalWellbeingResponse.getScreenTimeSetting();
                if (screenTimeSetting != null && (num = screenTimeSetting.minorUpsell) != null && num.intValue() == 1) {
                    C1440005kM.LIZ(new IEvent() { // from class: X.15XU
                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent post() {
                            C1440005kM.LIZ(this);
                            return this;
                        }

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent postSticky() {
                            C1440005kM.LIZIZ(this);
                            return this;
                        }
                    });
                }
                C1C7U.LIZIZ("DigitalWellbeingProtectionApiManager@d01b.getDigitalWellbeingSetting$1");
            }
        }, new C09JN() { // from class: X.0NQm
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("DigitalWellbeingProtectionApiManager@d01b.getDigitalWellbeingSetting$2");
                C1C7U.LIZIZ("DigitalWellbeingProtectionApiManager@d01b.getDigitalWellbeingSetting$2");
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
