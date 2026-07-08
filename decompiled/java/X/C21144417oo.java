package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.17oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21144417oo extends AbstractC21144517op implements InterfaceC21144617oq {
    public int LJIIL = -1;
    public int LJIILIIL = -1;
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 599));
    public final int LJIILL;
    public final String LJIILLIIL;
    public final InterfaceC21139217ny LJIIZILJ;

    @Override // X.InterfaceC21144617oq
    public final boolean LIZLLL() {
        return this.LJIIIIZZ != 0;
    }

    @Override // X.InterfaceC21144617oq
    public final void LJI() {
        LJIIL();
    }

    @Override // X.InterfaceC21144617oq
    public final ViewGroup.LayoutParams LIZJ(ViewGroup viewGroup) {
        Object c098200Yq;
        try {
            c098200Yq = viewGroup.generateLayoutParams(LJIILJJIL());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (ViewGroup.LayoutParams) c098200Yq;
    }

    @Override // X.InterfaceC21144617oq
    public final Context LJIIIIZZ(Context context) {
        int i = this.LJIIIIZZ;
        if (i != 0) {
            return new ContextThemeWrapper(context, i);
        }
        return null;
    }

    @Override // X.AbstractC21144517op
    public final void LJIIZILJ(AbstractC21144517op abstractC21144517op) {
        if (this.LJIILJJIL.getValue() instanceof C21046017Xm) {
            List<InterfaceC21144717or> listLIZ = ((InterfaceC21144717or) this.LJIILJJIL.getValue()).LIZ();
            if (listLIZ != null) {
                for (InterfaceC21144717or interfaceC21144717or : listLIZ) {
                    if (interfaceC21144717or instanceof AbstractC21144517op) {
                        ((AbstractC21144517op) interfaceC21144717or).LJIIZILJ(abstractC21144517op);
                    } else {
                        throw new IllegalStateException("child must be AbsCachedViewCreator");
                    }
                }
                return;
            }
            return;
        }
        InterfaceC21144717or interfaceC21144717or2 = (InterfaceC21144717or) this.LJIILJJIL.getValue();
        if (interfaceC21144717or2 instanceof AbstractC21144517op) {
            AbstractC21144517op abstractC21144517op2 = (AbstractC21144517op) interfaceC21144717or2;
            abstractC21144517op2.LJIIIZ = this;
            abstractC21144517op2.LJIIZILJ(abstractC21144517op);
            return;
        }
        throw new IllegalStateException("includeRoot must be AbsCachedViewCreator");
    }

    @Override // X.InterfaceC21144617oq
    public final void onViewCreated(View view) {
        int i = this.LJIIL;
        if (i != -1) {
            view.setId(i);
        }
        int i2 = this.LJIILIIL;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C786410Ut5.LJLLLLLL(8, view);
                    return;
                }
                return;
            }
            C786410Ut5.LJLLLLLL(4, view);
            return;
        }
        C786410Ut5.LJLLLLLL(0, view);
    }

    @Override // X.AbstractC21144517op
    public final View LJIILIIL(Context context, AttributeSet attributeSet) {
        throw new IllegalStateException("Cannot call IncludeViewCreator#createView().");
    }

    public C21144417oo(int i, String str, InterfaceC21139217ny interfaceC21139217ny) {
        this.LJIILL = i;
        this.LJIILLIIL = str;
        this.LJIIZILJ = interfaceC21139217ny;
    }
}
