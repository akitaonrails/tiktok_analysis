package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14wV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20427714wV extends C20427614wU {
    public final int LIZLLL;
    public String LJ;

    @Override // X.C20427614wU
    /* JADX INFO: renamed from: LIZ */
    public final boolean LIZIZ(C20427614wU c20427614wU) {
        if (super.LIZIZ(c20427614wU) && (c20427614wU instanceof C20427714wV)) {
            C20427714wV c20427714wV = (C20427714wV) c20427614wU;
            if (c20427714wV.LIZLLL == this.LIZLLL && Intrinsics.LJFF(c20427714wV.LJ, this.LJ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C20427614wU, X.InterfaceC951240arS
    public final /* bridge */ /* synthetic */ boolean LIZIZ(C20427614wU c20427614wU) {
        return LIZIZ(c20427614wU);
    }

    @Override // X.C20427614wU
    /* JADX INFO: renamed from: LIZJ */
    public final boolean LJII(C20427614wU c20427614wU) {
        if (super.LJII(c20427614wU) && (c20427614wU instanceof C20427714wV)) {
            C20427714wV c20427714wV = (C20427714wV) c20427614wU;
            if (c20427714wV.LIZLLL == this.LIZLLL && Intrinsics.LJFF(c20427714wV.LJ, this.LJ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C20427614wU, X.InterfaceC951240arS
    public final /* bridge */ /* synthetic */ boolean LJII(C20427614wU c20427614wU) {
        return LJII(c20427614wU);
    }

    public C20427714wV(String str, boolean z, int i) {
        super(str, z);
        this.LIZLLL = i;
        this.LJ = "";
    }
}
