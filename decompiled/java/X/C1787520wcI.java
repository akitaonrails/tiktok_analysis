package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS122S0400000_27;

/* JADX INFO: renamed from: X.0wcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1787520wcI implements InterfaceC560980LzM<Pair<? extends Pair<? extends EnumC1787510wcH, ? extends EnumC1780720wRK>, ? extends List<? extends C1788060wdA>>, Pair<? extends Pair<? extends EnumC1787510wcH, ? extends EnumC1780720wRK>, ? extends List<? extends C1788060wdA>>> {
    public final InterfaceC1786800wb8 LIZ;
    public final InterfaceC1786480wac LIZIZ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "query_un_ack";
    }

    public C1787520wcI(InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1786480wac interfaceC1786480wac) {
        this.LIZ = interfaceC1786800wb8;
        this.LIZIZ = interfaceC1786480wac;
    }

    @Override // X.InterfaceC560980LzM
    public final Object LIZ(Pair<? extends Pair<? extends EnumC1787510wcH, ? extends EnumC1780720wRK>, ? extends List<? extends C1788060wdA>> pair, InterfaceC1364105Vn<? super Pair<? extends Pair<? extends EnumC1787510wcH, ? extends EnumC1780720wRK>, ? extends List<? extends C1788060wdA>>> interfaceC1364105Vn) {
        Pair<? extends Pair<? extends EnumC1787510wcH, ? extends EnumC1780720wRK>, ? extends List<? extends C1788060wdA>> pair2 = pair;
        EnumC1787510wcH first = pair2.getFirst().getFirst();
        List<? extends C1788060wdA> second = pair2.getSecond();
        EnumC1780720wRK second2 = pair2.getFirst().getSecond();
        InterfaceC1786480wac interfaceC1786480wac = this.LIZIZ;
        C1787530wcJ c1787530wcJ = new C1786600wao<C1787540wcK>() { // from class: X.0wcJ
            {
                new C1787540wcK();
            }
        };
        AwS122S0400000_27 awS122S0400000_27 = new AwS122S0400000_27(first, (EnumC1787510wcH) second, (List<C1788060wdA>) second2, (EnumC1780720wRK) this, (C1787520wcI) 13);
        c1787530wcJ.getClass();
        interfaceC1786480wac.LIZ(new C1786590wan(c1787530wcJ, awS122S0400000_27));
        return pair2;
    }
}
