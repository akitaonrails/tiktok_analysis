package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0o5J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459550o5J implements InterfaceC572170McJ, Function0<C1DRG> {
    public final AbstractC214814194y LL;
    public final Function0<C1DRG> LLILLJJLI;
    public final Function0<Boolean> LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 773));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 771));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 779));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 778));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 775));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 777));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 772));
    public boolean LLJIJIL;
    public InterfaceC1461350o8D LLJILJIL;
    public InterfaceC1457600o2A LLJILJILJ;
    public InterfaceC1455610nyx LLJILLL;
    public InterfaceC1460000o62 LLJJ;
    public InterfaceC377540ErA LLJJI;
    public InterfaceC1453200nv4 LLJJIII;
    public InterfaceC1455850nzL LLJJIJI;
    public InterfaceC1459560o5K LLJJIJIIJIL;
    public C1456890o11 LLJJIJIL;

    public final void LIZIZ() {
        if (this.LLJIJIL) {
            return;
        }
        this.LLJIJIL = true;
        C1DRG c1drgInvoke = this.LLILLJJLI.invoke();
        if (c1drgInvoke == null) {
            return;
        }
        ((C0ETY) c1drgInvoke.LJII(C0ETY.class, null)).Sd(InterfaceC1461350o8D.class, new AwS601S0100000_22(this, 573));
        ((C0ETY) c1drgInvoke.LJII(C0ETY.class, null)).Sd(InterfaceC1457600o2A.class, new AwS601S0100000_22(this, 574));
        ((C0ETY) c1drgInvoke.LJII(C0ETY.class, null)).Sd(InterfaceC1455610nyx.class, new AwS601S0100000_22(this, 575));
        ((C0ETY) c1drgInvoke.LJII(C0ETY.class, null)).Sd(InterfaceC1460000o62.class, new AwS601S0100000_22(this, 576));
        ((C0ETY) c1drgInvoke.LJII(C0ETY.class, null)).Sd(InterfaceC377540ErA.class, new AwS601S0100000_22(this, 577));
        ((C0ETY) c1drgInvoke.LJII(C0ETY.class, null)).Sd(InterfaceC1453200nv4.class, new AwS601S0100000_22(this, 578));
        ((C0ETY) c1drgInvoke.LJII(C0ETY.class, null)).Sd(InterfaceC1455850nzL.class, new AwS601S0100000_22(this, 579));
        ((C0ETY) c1drgInvoke.LJII(C0ETY.class, null)).Sd(InterfaceC1459560o5K.class, new AwS601S0100000_22(this, 580));
    }

    public final void LIZLLL() {
        C1456890o11 c1456890o11 = this.LLJJIJIL;
        if (c1456890o11 != null) {
            LIZ(c1456890o11);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1DRG invoke() {
        return this.LLILLJJLI.invoke();
    }

    @Override // X.InterfaceC572170McJ
    public final void refresh() {
        InterfaceC1455610nyx interfaceC1455610nyx;
        if (!C365940EWi.LIZLLL((VideoPublishEditModel) this.LLJ.getValue())) {
            InterfaceC1455610nyx interfaceC1455610nyx2 = (InterfaceC1455610nyx) this.LLILZIL.getValue();
            if (interfaceC1455610nyx2 != null) {
                interfaceC1455610nyx2.refresh();
                return;
            }
            return;
        }
        C1DRG c1drgInvoke = this.LLILLJJLI.invoke();
        if (c1drgInvoke == null || (interfaceC1455610nyx = (InterfaceC1455610nyx) ((C0ETY) c1drgInvoke.LJII(C0ETY.class, null)).MY1(InterfaceC1460000o62.class)) == null) {
            return;
        }
        interfaceC1455610nyx.refresh();
    }

    public final InterfaceC1459560o5K LIZJ() {
        boolean z = LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent;
        boolean zBooleanValue = this.LLILLL.invoke().booleanValue();
        if (z && !zBooleanValue) {
            LIZIZ();
        }
        InterfaceC1459560o5K interfaceC1459560o5K = this.LLJJIJIIJIL;
        if (!z || zBooleanValue) {
            C1DRG c1drgInvoke = this.LLILLJJLI.invoke();
            interfaceC1459560o5K = null;
            if (c1drgInvoke != null) {
                return (InterfaceC1459560o5K) ((C0ETY) c1drgInvoke.LJII(C0ETY.class, null)).MY1(InterfaceC1459560o5K.class);
            }
        }
        return interfaceC1459560o5K;
    }

    /* JADX WARN: Removed duplicated region for block: B:243:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03f9  */
    @Override // X.InterfaceC572170McJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1456890o11 r14) {
        /*
            Method dump skipped, instruction units count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459550o5J.LIZ(X.0o11):void");
    }

    public C1459550o5J(AbstractC214814194y abstractC214814194y, AwS566S0100000_22 awS566S0100000_22, AwS566S0100000_22 awS566S0100000_222) {
        this.LL = abstractC214814194y;
        this.LLILLJJLI = awS566S0100000_22;
        this.LLILLL = awS566S0100000_222;
    }
}
