package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0aCs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C926080aCs extends C2217421BqW implements InterfaceC1631620sYq<Integer, Integer, Integer, Unit> {
    public C926080aCs(C926090aCt c926090aCt) {
        super(3, c926090aCt, C926090aCt.class, "updatePanelStateForLog", "updatePanelStateForLog(III)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, Integer num2, Integer num3) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        C926090aCt c926090aCt = (C926090aCt) this.receiver;
        c926090aCt.LJI = iIntValue;
        c926090aCt.LJII = iIntValue2;
        c926090aCt.LJIIIIZZ = iIntValue3;
        return Unit.LIZ;
    }
}
