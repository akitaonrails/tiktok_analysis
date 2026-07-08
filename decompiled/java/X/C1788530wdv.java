package X;

import com.bytedance.iap.core.model.IAPProductDetail;
import com.bytedance.iap.core.model.IAPQueryRequest;
import java.util.List;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS17S0300100_27;
import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.0wdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788530wdv extends AbstractC1789510wfV<IAPQueryRequest, List<? extends IAPProductDetail>> {
    public final InterfaceC1786800wb8 LIZJ;
    public final InterfaceC1788520wdu LIZLLL;
    public final String LJ;
    public final C1788670we9 LJFF;
    public final C1787160wbi LJI;
    public final EnumC1787180wbk LJII;

    @Override // X.AbstractC1789150wev
    public final InterfaceC560980LzM<IAPQueryRequest, List<IAPProductDetail>> LIZIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC1789150wev
    public final /* bridge */ /* synthetic */ EnumC1787180wbk LIZJ() {
        return this.LJII;
    }

    @Override // X.AbstractC1789150wev
    public final /* bridge */ /* synthetic */ InterfaceC560980LzM<Exception, EnumC1787180wbk> LIZLLL() {
        return this.LJI;
    }

    @Override // X.AbstractC1789510wfV
    public final String LJI() {
        return this.LJ;
    }

    @Override // X.AbstractC1789510wfV
    public final void LJIIJ(IAPQueryRequest iAPQueryRequest) {
        C1788760weI c1788760weI = C1788760weI.LIZJ;
        AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27(iAPQueryRequest, this, 67);
        c1788760weI.getClass();
        this.LIZLLL.LJ().LIZ(new C1786590wan(c1788760weI, awS393S0200000_27));
    }

    public C1788530wdv(InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1788520wdu interfaceC1788520wdu) {
        super(interfaceC1788520wdu.LJ());
        this.LIZJ = interfaceC1786800wb8;
        this.LIZLLL = interfaceC1788520wdu;
        this.LJ = "query";
        this.LJFF = new C1788670we9(new C1788670we9(new C1788930weZ(new C1788670we9(new C1788930weZ(new C1786540wai(), AFwS269S0000000_27.get$arr$(335)), new C1786440waY(interfaceC1786800wb8, interfaceC1788520wdu.LJ())), AFwS269S0000000_27.get$arr$(336)), new C1780650wRD(interfaceC1786800wb8)), new C1789980wgG(interfaceC1788520wdu.LJJIIJ(), interfaceC1788520wdu.getCache()));
        this.LJI = new C1787160wbi(interfaceC1788520wdu.LIZIZ());
        this.LJII = EnumC1787180wbk.UNKNOWN_ERROR;
    }

    @Override // X.AbstractC1789510wfV
    public final void LJIIIZ(IAPQueryRequest iAPQueryRequest, long j, AbstractC1789120wes<List<? extends IAPProductDetail>, C1788880weU<EnumC1787180wbk>> abstractC1789120wes) {
        IAPQueryRequest iAPQueryRequest2 = iAPQueryRequest;
        if (abstractC1789120wes instanceof C1789100weq) {
            C1788870weT c1788870weT = C1788870weT.LIZJ;
            AwS17S0300100_27 awS17S0300100_27 = new AwS17S0300100_27(iAPQueryRequest2, (IAPQueryRequest) abstractC1789120wes, (AbstractC1789120wes<List<IAPProductDetail>, C1788880weU<EnumC1787180wbk>>) j, (long) this, (C1788530wdv) 2);
            c1788870weT.getClass();
            this.LIZLLL.LJ().LIZ(new C1786590wan(c1788870weT, awS17S0300100_27));
            return;
        }
        if (abstractC1789120wes instanceof C1789110wer) {
            C1788870weT c1788870weT2 = C1788870weT.LIZJ;
            AwS17S0300100_27 awS17S0300100_272 = new AwS17S0300100_27(iAPQueryRequest2, (IAPQueryRequest) abstractC1789120wes, (AbstractC1789120wes<List<IAPProductDetail>, C1788880weU<EnumC1787180wbk>>) j, (long) this, (C1788530wdv) 3);
            c1788870weT2.getClass();
            this.LIZLLL.LJ().LIZ(new C1786590wan(c1788870weT2, awS17S0300100_272));
            return;
        }
        throw new C1954807lC();
    }
}
