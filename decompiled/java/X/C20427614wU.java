package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14wU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20427614wU implements InterfaceC951240arS<C20427614wU> {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public boolean LIZIZ;

    public C20427614wU() {
        this("", false);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("path: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSelected: ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public boolean LIZIZ(C20427614wU c20427614wU) {
        if (c20427614wU != null && Intrinsics.LJFF(this.LIZ, c20427614wU.LIZ) && this.LIZIZ == c20427614wU.LIZIZ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public boolean LJII(C20427614wU c20427614wU) {
        if (c20427614wU != null && Intrinsics.LJFF(this.LIZ, c20427614wU.LIZ) && this.LIZIZ == c20427614wU.LIZIZ) {
            return true;
        }
        return false;
    }

    public C20427614wU(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
