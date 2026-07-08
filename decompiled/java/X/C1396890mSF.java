package X;

/* JADX INFO: renamed from: X.0mSF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396890mSF implements InterfaceC1396800mS6 {
    public final C1119470fEn<C1396930mSJ<AbstractC1396720mRy<AbstractC1384320m7y>>> LIZ = new C1119470fEn<>();
    public final C1119470fEn<InterfaceC1396920mSI> LIZIZ = new C1119470fEn<>();

    @Override // X.InterfaceC1396800mS6
    public final void LIZ(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy) {
        C1396930mSJ<AbstractC1396720mRy<AbstractC1384320m7y>> c1396930mSJLIZLLL = this.LIZ.LIZLLL(abstractC1396720mRy.LJFF());
        if (c1396930mSJLIZLLL == null) {
            c1396930mSJLIZLLL = new C1396930mSJ<>();
            this.LIZ.LJFF(abstractC1396720mRy.LJFF(), c1396930mSJLIZLLL);
        }
        abstractC1396720mRy.LJJII();
        int i = c1396930mSJLIZLLL.LIZIZ;
        for (int i2 = 0; i2 < i; i2++) {
            if (c1396930mSJLIZLLL.LIZ[i2] == abstractC1396720mRy) {
                return;
            }
        }
        int i3 = c1396930mSJLIZLLL.LIZIZ;
        Object[] objArr = c1396930mSJLIZLLL.LIZ;
        if (i3 < objArr.length) {
            objArr[i3] = abstractC1396720mRy;
            c1396930mSJLIZLLL.LIZIZ = i3 + 1;
        }
    }
}
