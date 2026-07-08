package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0r8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576980r8i {
    public final String LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1890));
    public final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, byte[]> LIZLLL = new ConcurrentHashMap<>();

    public C1576980r8i(String str) {
        this.LIZ = str;
    }

    public static String LIZ(C1576980r8i c1576980r8i, String str) {
        String str2 = c1576980r8i.LIZJ.get(str);
        if (str2 == null) {
            str2 = null;
            String string = ((Keva) c1576980r8i.LIZIZ.getValue()).getString(str, null);
            if (string != null) {
                return string;
            }
        }
        return str2;
    }

    public final void LIZIZ(String str, String str2) {
        this.LIZJ.put(str, str2);
        ((Keva) this.LIZIZ.getValue()).storeString(str, str2);
    }

    public final void LIZJ(String str, byte[] bArr) {
        this.LIZLLL.put(str, bArr);
        ((Keva) this.LIZIZ.getValue()).storeBytes(str, bArr);
    }
}
