package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.page.PowerPageLoader;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS420S0200000_19;

/* JADX INFO: renamed from: X.0iyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262990iyH extends AbstractC1263540izA implements InterfaceC1263010iyJ {
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
    public final C1075800e6M getCurrentState() {
        return this.LLIZLLLIL.getCurrentState();
    }

    @Override // X.AbstractC1906720ziY
    public final AbstractC329610Cw3<?> LJIIJJI() {
        return (AbstractC329610Cw3) this.LLIZLLLIL.LLJ.getValue();
    }

    @Override // X.InterfaceC1263010iyJ
    public final C1262300ixA getConfig() {
        return this.LLIZLLLIL.LL;
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

    public C1262990iyH(C1262980iyG c1262980iyG) {
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
