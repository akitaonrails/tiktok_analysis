package X;

/* JADX INFO: renamed from: X.0eJ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1083700eJ6 extends C09AY implements InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Boolean> {
    public C1083700eJ6() {
        super(4);
    }

    @Override // X.InterfaceC1631630sYr
    public final Boolean invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        num2.intValue();
        num3.intValue();
        int iIntValue2 = num4.intValue();
        boolean z = true;
        if ((iIntValue != 1 && iIntValue != 3 && iIntValue != 8) || iIntValue2 != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
