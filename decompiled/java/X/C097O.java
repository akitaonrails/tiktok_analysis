package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.097O, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C097O {
    public final C05YC<AbstractC764660Tz6> LIZ;

    public C097O(C2252331DDr c2252331DDr) {
        this.LIZ = c2252331DDr;
    }

    public final Object LIZ(AbstractC764660Tz6 abstractC764660Tz6, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("emitState: ");
        sbLIZ.append(abstractC764660Tz6);
        C20441214yg.LIZIZ("KaraokeViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Object objEmit = this.LIZ.emit(abstractC764660Tz6, interfaceC1364105Vn);
        if (objEmit == C099R.LJFF()) {
            return objEmit;
        }
        return Unit.LIZ;
    }
}
