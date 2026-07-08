package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1APk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178941APk {
    public final String LIZ;
    public final InterfaceC2179021APs LIZIZ;
    public final List<Pair<String, String>> LIZJ;
    public final boolean LIZLLL;

    public C2178941APk(C2178931APj c2178931APj) {
        c2178931APj.getClass();
        this.LIZ = c2178931APj.LIZ;
        InterfaceC2179021APs interfaceC2179021APs = c2178931APj.LIZIZ;
        if (interfaceC2179021APs == null) {
            this.LIZIZ = new InterfaceC2179021APs() { // from class: X.1APm
                @Override // X.InterfaceC2179021APs
                public final String executeGet(String str) {
                    throw new RuntimeException("no implementation");
                }

                @Override // X.InterfaceC2179021APs
                public final String LIZ(String str, byte[] bArr) {
                    throw new RuntimeException("no implementation");
                }
            };
        } else {
            this.LIZIZ = interfaceC2179021APs;
        }
        this.LIZJ = new ArrayList();
        this.LIZLLL = c2178931APj.LIZJ;
    }
}
