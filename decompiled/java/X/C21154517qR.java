package X;

import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS148S0110000_32;
import kotlin.jvm.internal.AwS161S0110000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.17qR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21154517qR extends AbstractC21154217qO implements InterfaceC1768080w6w {
    public SparkPopup LLIZLLLIL;
    public C2252611DEt LLJ;
    public volatile boolean LLJI;

    @Override // X.InterfaceC1768080w6w
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJ(int i) {
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJI() {
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJIIIIZZ(int i, boolean z) {
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJIIJ(boolean z) {
    }

    @Override // X.AbstractC21154217qO
    public final void LJIIL() {
    }

    public final void LJIILL() {
        if (!this.LLILZ || this.LLILZIL) {
            return;
        }
        C21157017qq.LIZ(this.LLILLJJLI, this, false, C21155317qZ.LJFF, null, 17);
    }

    @Override // X.InterfaceC1768080w6w
    public final void LIZ(boolean z) {
        if (!this.LLILZIL && this.LLJ != null && z) {
            new AwS576S0100000_32(this, 13);
            this.LL.LIZLLL.M4(this);
            C324990Cob.LIZIZ(this.LLJ);
            this.LLJ = null;
        }
    }

    @Override // X.AbstractC21154217qO
    public final void LJIIIZ(FrameLayout frameLayout) {
        C2252611DEt c2252611DEt = this.LLJ;
        if (c2252611DEt != null) {
            c2252611DEt.LJJIIZ(null);
        }
        this.LLJ = null;
        SparkPopup sparkPopup = this.LLIZLLLIL;
        if (sparkPopup != null) {
            sparkPopup.gS(true);
        }
        this.LLIZLLLIL = null;
    }

    public final void LJIILLIIL(Function0<Unit> function0) {
        function0.invoke();
        C1741560vQA.LIZJ(this.LLILLL.LJIIIZ, "open_success", 0L, null, 6);
    }

    public C21154517qR(C1771760wCs c1771760wCs, C21157017qq c21157017qq, C21155617qc c21155617qc) {
        super(c1771760wCs, c21157017qq, c21155617qc);
    }

    @Override // X.AbstractC21154217qO
    public final void LJIIJJI(FrameLayout frameLayout, FrameLayout frameLayout2, AwS161S0110000_32 awS161S0110000_32, AwS576S0100000_32 awS576S0100000_32, AwS576S0100000_32 awS576S0100000_322, AwS148S0110000_32 awS148S0110000_32) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C21158217r2(this, awS576S0100000_32, frameLayout, awS161S0110000_32, awS148S0110000_32, awS576S0100000_322, null), 3);
    }
}
