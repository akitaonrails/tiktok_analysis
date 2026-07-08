package X;

import Y.ACallableS414S0100000_7;
import Y.ACallableS60S1100000_7;
import com.bytedance.android.livesdk.livesetting.feed.LiveRecInfoPtyUploadSetting;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0IT5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IT5 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(9));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(10));

    public static void LIZ(Map map) {
        if (((Boolean) LIZ.getValue()).booleanValue()) {
            AbstractC19484711Kz.LJIJI(new ACallableS414S0100000_7(map, 2)).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.0IT3
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveRecoInfoManager@8a3b.updateRecoInfo$2");
                    C1C7U.LIZIZ("LiveRecoInfoManager@8a3b.updateRecoInfo$2");
                }
            }, new C09JN() { // from class: X.0IT4
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveRecoInfoManager@8a3b.updateRecoInfo$3");
                    C1C7U.LIZIZ("LiveRecoInfoManager@8a3b.updateRecoInfo$3");
                }
            });
        }
    }

    public static void LIZIZ(Long l, Map map) {
        String str;
        if (map != null && l != null) {
            l.longValue();
            if (!LiveRecInfoPtyUploadSetting.INSTANCE.enable() || (str = (String) map.get("rec_info")) == null) {
                return;
            }
            AbstractC19484711Kz.LJIJI(new ACallableS60S1100000_7(l, str, 1)).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.00Mr
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveRecoInfoManager@8a3b.uploadRecInfo2Pty$2");
                    C1C7U.LIZIZ("LiveRecoInfoManager@8a3b.uploadRecInfo2Pty$2");
                }
            }, new C09JN() { // from class: X.00Ms
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveRecoInfoManager@8a3b.uploadRecInfo2Pty$3");
                    C1C7U.LIZIZ("LiveRecoInfoManager@8a3b.uploadRecInfo2Pty$3");
                }
            });
        }
    }
}
