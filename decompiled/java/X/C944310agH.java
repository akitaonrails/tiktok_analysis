package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.platform.common.helper.SeiAppDataResp;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0agH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C944310agH {
    public final InterfaceC944530agd LIZ;

    public C944310agH(InterfaceC944530agd interfaceC944530agd) {
        this.LIZ = interfaceC944530agd;
    }

    public final void LIZ(C945320ahu c945320ahu) {
        SeiAppData seiAppDataLIZ;
        Long l;
        String str = c945320ahu.LIZIZ;
        if (!TextUtils.isEmpty(str)) {
            try {
                SeiAppDataResp seiAppDataResp = (SeiAppDataResp) C19748512Ol.LIZJ.LJII(str, SeiAppDataResp.class);
                if (seiAppDataResp != null && !TextUtils.isEmpty(seiAppDataResp.seiAppDataStr)) {
                    this.LIZ.getClass();
                    String str2 = seiAppDataResp.seiAppDataStr;
                    LiveSeiStruct liveSeiStruct = c945320ahu.LIZ;
                    if (liveSeiStruct != null) {
                        seiAppDataLIZ = liveSeiStruct.LIZ;
                    } else {
                        seiAppDataLIZ = C473260IhA.LIZ(str2);
                    }
                    if (seiAppDataLIZ != null) {
                        LiveSeiStruct liveSeiStruct2 = c945320ahu.LIZ;
                        if (liveSeiStruct2 != null && (l = liveSeiStruct2.ts) != null) {
                            l.longValue();
                        }
                        ((C944270agD) this.LIZ).LJJLIIIJILLIZJL(seiAppDataLIZ);
                        return;
                    }
                    return;
                }
                this.LIZ.getClass();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJII(e);
            }
        }
    }
}
