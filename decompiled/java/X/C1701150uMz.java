package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0uMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701150uMz {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(386));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(385));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(387));

    public final Keva LIZJ() {
        return (Keva) this.LIZIZ.getValue();
    }

    public final void LIZIZ() {
        for (Map.Entry<String, ?> entry : LIZJ().getAll().entrySet()) {
            String key = entry.getKey();
            if (((Integer) entry.getValue()).intValue() > 1) {
                C201954140i c201954140i = C201954140i.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LargeTransaction clear disk uuid: ");
                sbLIZ.append(key);
                C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
                LIZ(key);
            }
        }
        for (Map.Entry<String, ?> entry2 : ((Keva) this.LIZJ.getValue()).getAll().entrySet()) {
            String key2 = entry2.getKey();
            if (TimeUnit.MILLISECONDS.toHours(SystemClock.uptimeMillis() - ((Long) entry2.getValue()).longValue()) > 2) {
                C201954140i c201954140i2 = C201954140i.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("LargeTransaction clear disk uuid: ");
                sbLIZ2.append(key2);
                sbLIZ2.append(" by time");
                C201955140j.LJIILJJIL(c201954140i2, C2188811AlT.LIZIZ(sbLIZ2));
                LIZ(key2);
            } else {
                C201954140i c201954140i3 = C201954140i.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("LargeTransaction skip clear disk uuid: ");
                sbLIZ3.append(key2);
                sbLIZ3.append(" by time because time is not enough");
                C201955140j.LJIILJJIL(c201954140i3, C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
    }

    public final void LIZ(String str) {
        ((Keva) this.LIZ.getValue()).erase(str);
        LIZJ().erase(str);
        ((Keva) this.LIZJ.getValue()).erase(str);
    }

    public final void LIZLLL(String str, boolean z) {
        ((Keva) this.LIZ.getValue()).storeBoolean(str, z);
        ((Keva) this.LIZJ.getValue()).storeLong(str, SystemClock.uptimeMillis());
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LargeTransaction save bundle uuid: ");
        sbLIZ.append(str);
        sbLIZ.append(" recycle policy timestamp");
        C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJ(String str, byte[] bArr, boolean z) {
        ((Keva) this.LIZ.getValue()).storeBytesJustDisk(str, bArr);
        if (z) {
            ((Keva) this.LIZJ.getValue()).storeLong(str, SystemClock.uptimeMillis());
            C201954140i c201954140i = C201954140i.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LargeTransaction save bundle uuid: ");
            sbLIZ.append(str);
            sbLIZ.append(" recycle policy timestamp");
            C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LIZJ().storeInt(str, 1);
        C201954140i c201954140i2 = C201954140i.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LargeTransaction save bundle uuid: ");
        sbLIZ2.append(str);
        sbLIZ2.append(" recycle policy count ref");
        C201955140j.LJIILJJIL(c201954140i2, C2188811AlT.LIZIZ(sbLIZ2));
    }
}
