package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.strategy.IPreloadTaskCallbackListener;

/* JADX INFO: renamed from: X.0oV2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1475500oV2 extends C1475480oV0 {
    public C1475500oV2(final C1475200oUY c1475200oUY) {
        new IPreloadTaskCallbackListener(c1475200oUY) { // from class: X.0oV0
            public final InterfaceC1475560oV8 LIZ;

            {
                this.LIZ = c1475200oUY;
            }

            @Override // com.bytedance.vcloud.strategy.IPreloadTaskCallbackListener
            public final void preloadItemInfo(int i, String str, String str2) {
                int i2;
                String str3;
                if (this.LIZ != null) {
                    if (i == 4) {
                        i2 = 3;
                    } else {
                        i2 = 5;
                        if (i != 5) {
                            if (i == 2) {
                                i2 = 8;
                            } else if (i == 1) {
                                i2 = 7;
                            } else if (i == 6) {
                                i2 = 9;
                            } else {
                                i2 = 2;
                            }
                        }
                    }
                    C1475490oV1 c1475490oV1 = new C1475490oV1(i2);
                    if (!TextUtils.isEmpty(str) && str.contains(",")) {
                        String[] strArrSplit = str.split(",");
                        if (strArrSplit.length >= 3) {
                            long jLongValue = CastLongProtector.valueOf(strArrSplit[0]).longValue();
                            long jLongValue2 = CastLongProtector.valueOf(strArrSplit[1]).longValue();
                            String str4 = strArrSplit[2];
                            if (strArrSplit.length >= 4) {
                                str3 = strArrSplit[3];
                            } else {
                                str3 = "";
                            }
                            C1475430oUv c1475430oUv = new C1475430oUv();
                            c1475490oV1.LIZIZ = c1475430oUv;
                            c1475430oUv.LIZ = str4;
                            c1475430oUv.LJ = jLongValue;
                            c1475430oUv.LIZLLL = jLongValue2;
                            c1475430oUv.LIZJ = str3;
                        }
                    }
                    c1475490oV1.LIZLLL = str2;
                    this.LIZ.LIZ(c1475490oV1);
                }
            }
        };
    }
}
