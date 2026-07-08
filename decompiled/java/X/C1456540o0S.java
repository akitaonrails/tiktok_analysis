package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* JADX INFO: renamed from: X.0o0S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1456540o0S implements InterfaceC1456710o0j {
    public final Keva LIZ;

    public C1456540o0S(String str) {
        this.LIZ = KevaImpl.getRepo(str, 1);
    }

    @Override // X.InterfaceC1456710o0j
    public final int LIZJ(String str, String str2) {
        if (str2 != null) {
            return this.LIZ.getInt(str2, -1);
        }
        return this.LIZ.getInt(str, -1);
    }

    @Override // X.InterfaceC1456710o0j
    public final void LIZIZ(int i, String str, String str2) {
        if (str2 != null) {
            this.LIZ.storeInt(str2, i);
        } else {
            this.LIZ.storeInt(str, i);
        }
    }
}
