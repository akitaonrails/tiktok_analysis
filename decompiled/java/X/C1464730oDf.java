package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0oDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464730oDf extends AbstractC2255721DQs<InterfaceC1464740oDg> implements InterfaceC1464740oDg, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1460120o6E.class, null);
    public final InterfaceC332260D0u<C1464760oDi> LLILLL = C1BNE.LIZ(null);
    public final InterfaceC332260D0u<Boolean> LLILZ;
    public final InterfaceC332260D0u<Unit> LLILZIL;
    public final InterfaceC332260D0u<Boolean> LLILZLL;
    public final C01GW LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1464730oDf.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/aweme/social/creation/edit/component/toolbar/StoryEditToolbarApi;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJ = 8;
    }

    public InterfaceC1464740oDg W1() {
        return this;
    }

    private final InterfaceC1660320tJ8 Z1() {
        return (InterfaceC1660320tJ8) this.LLIZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1464740oDg
    public AbstractC1664850tQR<C1678260tm4, InterfaceC1461640o8g<? extends C1678260tm4>> LLJLLL() {
        C259800zU c259800zU = new C259800zU();
        Z1().JM1(1800, new AwS639S0100000_25(c259800zU, (C259800zU<InterfaceC1664980tQe<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>) 51));
        T t = c259800zU.element;
        if (t instanceof AbstractC1664850tQR) {
            return (AbstractC1664850tQR) t;
        }
        return null;
    }

    @Override // X.InterfaceC564950MDt
    public void TE1() {
        this.LLILZIL.LIZJ(Unit.LIZ);
    }

    public final InterfaceC1460120o6E X1() {
        return (InterfaceC1460120o6E) this.LLILLJJLI.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.InterfaceC1464740oDg
    public C05YD<C1464760oDi> ht2() {
        return C09IC.LIZIZ(this.LLILLL);
    }

    @Override // X.InterfaceC1464740oDg
    public InterfaceC346201Wa<Boolean> Ov() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1464740oDg
    public InterfaceC346201Wa<Boolean> PB1() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1464740oDg
    public InterfaceC346201Wa<Unit> UK() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1464730oDf(C1DRG c1drg) {
        this.LL = c1drg;
        Boolean bool = Boolean.FALSE;
        this.LLILZ = C1BNE.LIZ(bool);
        this.LLILZIL = C1BNE.LIZ(null);
        this.LLILZLL = C1BNE.LIZ(bool);
        this.LLIZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 375));
    }

    @Override // X.InterfaceC564950MDt
    public void GB2(boolean z) {
        this.LLILZLL.LIZJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC564950MDt
    public void Q81(C1464760oDi c1464760oDi) {
        this.LLILLL.setValue(c1464760oDi);
    }

    @Override // X.InterfaceC564950MDt
    public void Uf0(Function2<? super Integer, ? super Integer, Unit> function2) {
        View view;
        View viewFindViewById;
        AbstractC1664850tQR<C1678260tm4, InterfaceC1461640o8g<? extends C1678260tm4>> abstractC1664850tQRLLJLLL = LLJLLL();
        if (abstractC1664850tQRLLJLLL != null && (view = abstractC1664850tQRLLJLLL.LIZJ) != null) {
            int[] iArr = new int[2];
            if ((view instanceof ViewGroup) && (viewFindViewById = view.findViewById(R.id.y74)) != null) {
                viewFindViewById.getLocationOnScreen(iArr);
            } else {
                view.getLocationOnScreen(iArr);
            }
            function2.invoke(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
        }
    }

    @Override // X.InterfaceC1464740oDg
    public void fl(C1460160o6I c1460160o6I) {
        this.LLILZ.LIZJ(Boolean.valueOf(c1460160o6I.LIZIZ));
    }
}
