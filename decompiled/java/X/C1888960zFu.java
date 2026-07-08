package X;

import com.ss.android.ugc.tiktok.tpsc.privacy.account.effectcount.EffectCountApi;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888960zFu {
    public static final C1888960zFu LIZ = new C1888960zFu();

    public static void LIZ() {
        EffectCountApi effectCountApi = (EffectCountApi) C1888980zFw.LIZ.getValue();
        EffectCountApi.LIZ.getClass();
        String str = C1888970zFv.LIZIZ;
        C1888930zFr.LIZIZ(effectCountApi.LIZ(str), str, C2097908Jt.LIZJ(new Pair("report_to_tea", "true"))).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0ym1
            @Override // X.C09JN
            public final void accept(Object obj) {
                String strLIZLLL;
                C1C7U.LIZ("EffectCountApiManager@1ab7.fetchPrivacyUserEffectCount$1");
                EffectCountApi.EffectCountResp effectCountResp = (EffectCountApi.EffectCountResp) obj;
                if (effectCountResp.getStatusCode() == 0) {
                    InterfaceC1519050pdH interfaceC1519050pdH = C1888900zFo.LIZ;
                    C1888900zFo.LIZIZ(effectCountResp.getInteractionVideoCount());
                    C1888900zFo.LIZJ(effectCountResp.getNoPAControlSettings());
                    Boolean boolValueOf = Boolean.valueOf(effectCountResp.getRemoveReminder());
                    if (!Intrinsics.LJFF(boolValueOf, C1888900zFo.LIZIZ)) {
                        C1888900zFo.LIZIZ = boolValueOf;
                        String strLIZLLL2 = null;
                        if (boolValueOf == null) {
                            InterfaceC1519050pdH interfaceC1519050pdH2 = C1888900zFo.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("privacy_user_remove_reminder_");
                            InterfaceC1888940zFs interfaceC1888940zFsLIZJ = C191871104n.LIZJ();
                            if (interfaceC1888940zFsLIZJ != null) {
                                strLIZLLL = interfaceC1888940zFsLIZJ.LIZLLL();
                            } else {
                                strLIZLLL = null;
                            }
                            sbLIZ.append(strLIZLLL);
                            interfaceC1519050pdH2.remove(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        InterfaceC1519050pdH interfaceC1519050pdH3 = C1888900zFo.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("privacy_user_remove_reminder_");
                        InterfaceC1888940zFs interfaceC1888940zFsLIZJ2 = C191871104n.LIZJ();
                        if (interfaceC1888940zFsLIZJ2 != null) {
                            strLIZLLL2 = interfaceC1888940zFsLIZJ2.LIZLLL();
                        }
                        sbLIZ2.append(strLIZLLL2);
                        interfaceC1519050pdH3.putBoolean(C2188811AlT.LIZIZ(sbLIZ2), Intrinsics.LJFF(boolValueOf, Boolean.TRUE));
                    }
                }
                C1C7U.LIZIZ("EffectCountApiManager@1ab7.fetchPrivacyUserEffectCount$1");
            }
        }, new C09JN() { // from class: X.00Pd
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("EffectCountApiManager@1ab7.fetchPrivacyUserEffectCount$2");
                C1C7U.LIZIZ("EffectCountApiManager@1ab7.fetchPrivacyUserEffectCount$2");
            }
        });
    }
}
