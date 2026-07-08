package X;

/* JADX INFO: renamed from: X.00Ra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C078400Ra extends C09AY implements InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Boolean> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C078400Ra(int i, int i2) {
        super(4);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // X.InterfaceC1631630sYr
    public final Boolean invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        boolean z;
        int iIntValue = num.intValue();
        num2.intValue();
        num3.intValue();
        int iIntValue2 = num4.intValue();
        if (this.LL == iIntValue && this.LLILLJJLI == iIntValue2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
