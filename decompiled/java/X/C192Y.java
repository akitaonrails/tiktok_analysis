package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.192Y, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C192Y extends C193N<C05YF, C214741192d, C214740192c> {
    public static final int LLJILJIL = 8;
    public final C19A3 LLIZ;
    public final Function0<C214741192d> LLIZLLLIL;
    public final C214740192c LLJ;
    public final C10J3 LLJI;
    public final InterfaceC1738600vLO LLJIJIL;

    @Override // X.C193N, X.C193O
    public void Q3() {
    }

    @Override // X.C193N
    public AnonymousClass1931<?, C214741192d, C214740192c> F4() {
        final AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 272);
        return new AnonymousClass1931<C214738192a, C214741192d, C214740192c>(awS576S0100000_32) { // from class: X.192Z
            public final Function0<View> LIZJ;
            public C214738192a LIZLLL;

            {
                this.LIZJ = awS576S0100000_32;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [X.0vLS, X.192a] */
            @Override // X.AnonymousClass1931
            public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
                ViewGroup viewGroup2;
                C214738192a c214738192a = this.LIZLLL;
                if (c214738192a == null) {
                    final View viewInvoke = this.LIZJ.invoke();
                    ViewParent parent = viewInvoke.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                        C786410Ut5.LJJJLZIJ(viewInvoke, viewGroup2);
                    }
                    ?? r0 = new AbstractC1738640vLS(viewInvoke) { // from class: X.192a
                    };
                    this.LIZLLL = r0;
                    return r0;
                }
                return c214738192a;
            }

            @Override // X.AnonymousClass1931
            public final /* bridge */ /* synthetic */ void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj) {
            }
        };
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJ;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJIJIL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJI;
    }

    public C214740192c K4() {
        return this.LLJ;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C214741192d> o2() {
        return this.LLIZLLLIL;
    }

    public C192Y(C1DRG c1drg, C19A3 c19a3) {
        super(c1drg);
        this.LLIZ = c19a3;
        this.LLIZLLLIL = AFwS223S0000000_32.get$arr$(88);
        this.LLJ = new C214740192c();
        this.LLJI = AnonymousClass1938.LIZ;
        this.LLJIJIL = EnumC214771193h.TCM;
    }
}
