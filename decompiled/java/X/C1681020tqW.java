package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681020tqW extends AbstractC20055413dY implements InterfaceC1680850tqF, InterfaceC20062713ej, InterfaceC1680840tqE {
    public final C1681030tqX LLJJ;
    public boolean LLJJI;
    public C1693050u9v LLJJIII;
    public Function1<? super C1681030tqX, C1681040tqY> LLJJIJI;

    @Override // X.InterfaceC1680840tqE
    public final long LIZIZ() {
        return C1296570jqR.LIZIZ(C20052513d5.LIZLLL(this, 128).LLILLL);
    }

    @Override // X.InterfaceC1680850tqF
    public final void LJLLLLLL() {
        C1693050u9v c1693050u9v = this.LLJJIII;
        if (c1693050u9v != null) {
            c1693050u9v.LIZJ();
        }
        this.LLJJI = false;
        this.LLJJ.LLILLJJLI = null;
        C1691800u7u.LIZ(this);
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        C1693050u9v c1693050u9v = this.LLJJIII;
        if (c1693050u9v != null) {
            c1693050u9v.LIZJ();
        }
    }

    @Override // X.InterfaceC1680840tqE
    public final InterfaceC1690500u5o getDensity() {
        return C20052513d5.LJFF(this).LLJJJJLIIL;
    }

    @Override // X.InterfaceC1680840tqE
    public final EnumC1671200tag getLayoutDirection() {
        return C20052513d5.LJFF(this).LLJJL;
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJLIIIJJIZ() {
        LJLLLLLL();
    }

    @Override // X.InterfaceC20062713ej
    public final void LLIILZL() {
        LJLLLLLL();
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZLL() {
        LJLLLLLL();
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZLLLIL() {
        LJLLLLLL();
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
        if (!this.LLJJI) {
            C1681030tqX c1681030tqX = this.LLJJ;
            c1681030tqX.LLILLJJLI = null;
            c1681030tqX.LLILLL = interfaceC1669010tX9;
            C20060813eQ.LIZ(this, new AwS426S0200000_25(this, c1681030tqX, 177));
            if (c1681030tqX.LLILLJJLI != null) {
                this.LLJJI = true;
            } else {
                C1696250uF5.LIZJ("DrawResult not defined, did you forget to call onDraw?");
                throw new C2197108jB();
            }
        }
        this.LLJJ.LLILLJJLI.LIZ.invoke(interfaceC1669010tX9);
    }

    public C1681020tqW(C1681030tqX c1681030tqX, Function1<? super C1681030tqX, C1681040tqY> function1) {
        this.LLJJ = c1681030tqX;
        this.LLJJIJI = function1;
        c1681030tqX.LL = this;
        new AwS569S0100000_25(this, 1080);
        c1681030tqX.getClass();
    }
}
