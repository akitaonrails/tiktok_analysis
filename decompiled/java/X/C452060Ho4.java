package X;

/* JADX INFO: renamed from: X.0Ho4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452060Ho4 extends C0HWE<C1323050kX9<AbstractC1327750kej>> {
    public int LIZ = 1;
    public final /* synthetic */ InterfaceC452050Ho3 LIZIZ;
    public final /* synthetic */ C1325540kbA LIZJ;
    public final /* synthetic */ C1325710kbR[] LIZLLL;

    @Override // X.C0HWE
    public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
        Throwable thLIZLLL = interfaceC1320200kSY.LIZLLL();
        C1325540kbA c1325540kbA = this.LIZJ;
        C1325710kbR[] c1325710kbRArr = this.LIZLLL;
        int i = this.LIZ;
        this.LIZ = i + 1;
        if (i >= c1325710kbRArr.length) {
            InterfaceC452050Ho3 interfaceC452050Ho3 = this.LIZIZ;
            new RuntimeException(thLIZLLL);
            interfaceC452050Ho3.onFailure();
            return;
        }
        c1325540kbA.LJI(c1325710kbRArr[i], null).LIZJ(this, C822690WPb.LIZ());
    }

    @Override // X.C0HWE
    public final void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
        this.LIZIZ.LIZ(interfaceC1320200kSY);
    }

    public C452060Ho4(InterfaceC452050Ho3 interfaceC452050Ho3, C1325540kbA c1325540kbA, C1325710kbR[] c1325710kbRArr) {
        this.LIZIZ = interfaceC452050Ho3;
        this.LIZJ = c1325540kbA;
        this.LIZLLL = c1325710kbRArr;
    }
}
