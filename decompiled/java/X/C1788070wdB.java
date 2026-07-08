package X;

import java.util.UUID;
import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.0wdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788070wdB implements InterfaceC560980LzM<C1788080wdC, C1787830wcn> {
    public final InterfaceC1788520wdu LIZ;
    public final InterfaceC1786800wb8 LIZIZ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "create_restore_order";
    }

    public C1788070wdB(InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1788520wdu interfaceC1788520wdu) {
        this.LIZ = interfaceC1788520wdu;
        this.LIZIZ = interfaceC1786800wb8;
    }

    @Override // X.InterfaceC560980LzM
    public final Object LIZ(C1788080wdC c1788080wdC, InterfaceC1364105Vn<? super C1787830wcn> interfaceC1364105Vn) {
        C1788080wdC c1788080wdC2 = c1788080wdC;
        C1788060wdA c1788060wdA = c1788080wdC2.LIZJ;
        C1787830wcn c1787830wcn = new C1787830wcn(c1788080wdC2, UUID.randomUUID().toString(), "", EnumC1787550wcL.RESTORE, EnumC1787060wbY.PURCHASED, new C993960byM("", "", c1788060wdA.LIZJ, c1788080wdC2.LIZIZ, "{}", this.LIZIZ.getChannel().name()), c1788060wdA, new C1787840wco(this.LIZ.currentTimeMillis()), c1788080wdC2.LIZLLL);
        InterfaceC1786480wac interfaceC1786480wacLJ = this.LIZ.LJ();
        C1788140wdI c1788140wdI = C1788140wdI.LIZJ;
        AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27(this, c1787830wcn, 92);
        c1788140wdI.getClass();
        interfaceC1786480wacLJ.LIZ(new C1786590wan(c1788140wdI, awS393S0200000_27));
        return c1787830wcn;
    }
}
