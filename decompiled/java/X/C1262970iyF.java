package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.page.PowerPageLoader;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS420S0200000_19;

/* JADX INFO: renamed from: X.0iyF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262970iyF extends AbstractC1263550izB implements InterfaceC1263010iyJ {
    public final C1262980iyG LLIZLLLIL;
    public String LLJ;
    public Function0<Unit> LLJI;

    @Override // X.InterfaceC1262810ixz
    public final void Eg(InterfaceC1261750iwH interfaceC1261750iwH) {
        this.LLIZLLLIL.Eg(interfaceC1261750iwH);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LJJLIIIJILLIZJL(String str, String str2, List list) {
        this.LLIZLLLIL.LJJLIIIJILLIZJL(str, str2, list);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLFZ(boolean z) {
        this.LLIZLLLIL.LLFZ(z);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLIIZ(RecyclerView recyclerView) {
        this.LLIZLLLIL.LLIIZ(recyclerView);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLL(Function1<? super C1261270ivV, C1261270ivV> function1) {
        this.LLIZLLLIL.LLL(function1);
    }

    @Override // X.InterfaceC1262810ixz
    public final void destroy() {
        this.LLIZLLLIL.destroy();
    }

    @Override // X.InterfaceC1262810ixz
    public final C1075800e6M getCurrentState() {
        return this.LLIZLLLIL.getCurrentState();
    }

    @Override // X.InterfaceC1262810ixz
    public final void ng(InterfaceC1261750iwH interfaceC1261750iwH) {
        this.LLIZLLLIL.ng(interfaceC1261750iwH);
    }

    @Override // X.InterfaceC1262810ixz
    public final void reset() {
        this.LLIZLLLIL.reset();
    }

    @Override // X.AbstractC1906720ziY
    public final AbstractC329610Cw3<?> LJIIJJI() {
        return (AbstractC329610Cw3) this.LLIZLLLIL.LLJ.getValue();
    }

    @Override // X.InterfaceC1263010iyJ
    public final C1262300ixA getConfig() {
        return this.LLIZLLLIL.LL;
    }

    @Override // X.InterfaceC1262810ixz
    public final AbstractC21673719rz getItemAnimator() {
        return this.LLIZLLLIL.LLJIJIL.getValue();
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        Function0<Unit> function0 = this.LLJI;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC1263010iyJ
    public final String LJJJLIIL() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1263010iyJ
    public final C20600815jK<InterfaceC1891350zJl> LJJZZI() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1263010iyJ
    public final boolean LJLJI() {
        return this.LLILLL;
    }

    public C1262970iyF(C1262980iyG c1262980iyG) {
        this.LLIZLLLIL = c1262980iyG;
    }

    @Override // X.InterfaceC1262810ixz
    public final void LJI(AbstractC1264080j02<C1261860iwS> abstractC1264080j02) {
        PowerPageLoader powerPageLoader = (PowerPageLoader) this.LLILZ.getValue();
        if (powerPageLoader != null && powerPageLoader.LLILZIL.LIZJ && !powerPageLoader.LLJIJIL) {
            powerPageLoader.LLJIJIL = true;
            powerPageLoader.LJIIIIZZ();
        }
        this.LLIZLLLIL.LJJLIIIJJIZ(this);
        this.LLIZLLLIL.LJI(abstractC1264080j02);
    }

    @Override // X.InterfaceC1263010iyJ
    public final void LJJLIIIJLJLI(AwS420S0200000_19 awS420S0200000_19) {
        this.LLJI = awS420S0200000_19;
    }

    @Override // X.InterfaceC1263010iyJ
    public final void LJLJJLL(Class<? extends PowerCell<?>>... clsArr) {
        LJIILIIL((Class[]) Arrays.copyOf(clsArr, clsArr.length));
    }

    @Override // X.InterfaceC1263010iyJ
    public final void LLJJ(String str) {
        this.LLJ = str;
    }
}
