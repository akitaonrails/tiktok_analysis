package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z2D, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z2D implements InterfaceC893120Z1y {
    public final String LIZ;
    public final C0Z2F LIZIZ;
    public final C2252331DDr LIZJ;
    public final C2252331DDr LIZLLL;
    public final C0Z2E LJ;

    @Override // X.InterfaceC893110Z1x
    public final void LJI() {
        C0Z2F c0z2f = this.LIZIZ;
        if (c0z2f != null) {
            String str = this.LIZ;
            if (str == null) {
                str = "";
            }
            c0z2f.LIZJ(str, this.LJ);
        }
    }

    @Override // X.InterfaceC893110Z1x
    public final void register() {
        int value;
        C0Z2F c0z2f = this.LIZIZ;
        if (c0z2f != null) {
            String str = this.LIZ;
            if (str == null) {
                str = "";
            }
            c0z2f.LJ(str, this.LJ);
        }
        C0Z2F c0z2f2 = this.LIZIZ;
        if (c0z2f2 != null) {
            String str2 = this.LIZ;
            value = c0z2f2.LJFF(Long.valueOf(C461720I8s.LIZJ()), str2 != null ? str2 : "");
        } else {
            value = C0Z9N.ORDINARY.getValue();
        }
        this.LIZJ.LIZJ(new C0Z2C(value));
    }

    @Override // X.InterfaceC893120Z1y
    public final C2252331DDr LIZ() {
        return this.LIZLLL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Z2E] */
    public C0Z2D(C0Z2F c0z2f, String str) {
        this.LIZ = str;
        this.LIZIZ = c0z2f;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, null, 6);
        this.LIZJ = c2252331DDrLIZIZ;
        this.LIZLLL = c2252331DDrLIZIZ;
        this.LJ = new C05QR() { // from class: X.0Z2E
            @Override // X.C05QR
            public final void WB2(String str2) {
            }

            @Override // X.C05QR
            public final void Ys1(C05QT c05qt, String str2, List list) {
                int value;
                if (!Intrinsics.LJFF(str2, this.LL.LIZ)) {
                    return;
                }
                C0Z2D c0z2d = this.LL;
                C0Z2F c0z2f2 = c0z2d.LIZIZ;
                if (c0z2f2 != null) {
                    value = c0z2f2.LJFF(Long.valueOf(C461720I8s.LIZJ()), c0z2d.LIZ);
                } else {
                    value = C0Z9N.ORDINARY.getValue();
                }
                this.LL.LIZJ.LIZJ(new C0Z2C(value));
            }
        };
    }
}
