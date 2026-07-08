package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.108s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C191980108s extends C2217421BqW implements InterfaceC1631620sYq<Integer, Integer, Throwable, Unit> {
    public C191980108s(Object obj) {
        super(3, obj, C191981108t.class, "onUpdateFailInner", "onUpdateFailInner(IILjava/lang/Throwable;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, Integer num2, Throwable th) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        Throwable th2 = th;
        C191981108t c191981108t = (C191981108t) this.receiver;
        c191981108t.LLJIJIL.LJFF(iIntValue2, c191981108t.LLJ.LIZLLL, th2);
        c191981108t.LJJII(iIntValue, iIntValue2, th2);
        return Unit.LIZ;
    }
}
