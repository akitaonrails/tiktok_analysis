package X;

/* JADX INFO: renamed from: X.0ruq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606820ruq extends AbstractC1606860ruu {
    public final Boolean LLILZ;
    public final InterfaceC1398730mVD LLILZIL;
    public final int LLILZLL;

    @Override // X.AbstractC1606860ruu
    public final InterfaceC1398730mVD LIZ() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1606860ruu
    public final Boolean LIZIZ() {
        return this.LLILZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1606820ruq(Boolean bool, InterfaceC1398730mVD interfaceC1398730mVD, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_unconsumed_story_");
        sbLIZ.append(bool);
        super(C2188811AlT.LIZIZ(sbLIZ), bool, interfaceC1398730mVD);
        this.LLILZ = bool;
        this.LLILZIL = interfaceC1398730mVD;
        this.LLILZLL = i;
    }
}
