package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserPlaySettingValue_ProtoDecoder implements C0IMD<UserPlaySettingValue> {
    public static UserPlaySettingValue LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserPlaySettingValue userPlaySettingValue = new UserPlaySettingValue();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                userPlaySettingValue.stringValue = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            userPlaySettingValue.int64Value = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        userPlaySettingValue.boolValue = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    userPlaySettingValue.fieldType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userPlaySettingValue;
            }
        }
    }

    @Override // X.C0IMD
    public final UserPlaySettingValue LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UserPlaySettingValue userPlaySettingValue) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserPlaySettingValue userPlaySettingValue, List list) {
    }
}
