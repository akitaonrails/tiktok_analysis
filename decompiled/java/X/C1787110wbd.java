package X;

import kotlin.Pair;
import kotlin.jvm.internal.AwS122S0400000_27;

/* JADX INFO: renamed from: X.0wbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1787110wbd implements InterfaceC560980LzM<Pair<? extends Pair<? extends Exception, ? extends C1787830wcn>, ? extends EnumC1787180wbk>, C1787830wcn> {
    public final InterfaceC1786800wb8 LIZ;
    public final InterfaceC1788520wdu LIZIZ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "report_mp_order_fail";
    }

    public C1787110wbd(InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1788520wdu interfaceC1788520wdu) {
        this.LIZ = interfaceC1786800wb8;
        this.LIZIZ = interfaceC1788520wdu;
    }

    @Override // X.InterfaceC560980LzM
    public final Object LIZ(Pair<? extends Pair<? extends Exception, ? extends C1787830wcn>, ? extends EnumC1787180wbk> pair, InterfaceC1364105Vn<? super C1787830wcn> interfaceC1364105Vn) throws Exception {
        Pair<? extends Pair<? extends Exception, ? extends C1787830wcn>, ? extends EnumC1787180wbk> pair2 = pair;
        Exception first = pair2.getFirst().getFirst();
        EnumC1787180wbk second = pair2.getSecond();
        C1787830wcn second2 = pair2.getFirst().getSecond();
        InterfaceC1786480wac interfaceC1786480wacLJ = this.LIZIZ.LJ();
        C1787100wbc c1787100wbc = C1787100wbc.LIZJ;
        AwS122S0400000_27 awS122S0400000_27 = new AwS122S0400000_27(this, second2, first, second, 18);
        c1787100wbc.getClass();
        interfaceC1786480wacLJ.LIZ(new C1786590wan(c1787100wbc, awS122S0400000_27));
        throw first;
    }
}
