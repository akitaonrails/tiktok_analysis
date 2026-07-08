package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0snt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640950snt implements InterfaceC1640820sng {
    public final FrameLayout LIZ;
    public final LifecycleOwner LIZIZ;
    public final ArrayList<ViewGroup> LIZJ;
    public final Stack<C1640970snv> LIZLLL = new Stack<>();
    public final C11RK<Pair<EnumC1641510son, Boolean>> LJ = new C11RK<>();

    @Override // X.InterfaceC1640820sng
    public final C19475711Hn LIZ() {
        C11RK<Pair<EnumC1641510son, Boolean>> c11rk = this.LJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1640820sng
    public final void LIZJ() {
        if (!this.LIZLLL.empty()) {
            C1640970snv c1640970snvPop = this.LIZLLL.pop();
            C786410Ut5.LJJJZ(c1640970snvPop.LIZ, this.LIZ);
            this.LJ.onNext(new Pair<>(c1640970snvPop.LIZIZ, Boolean.FALSE));
        }
        if (this.LIZLLL.empty()) {
            LIZLLL(true);
        } else {
            C786410Ut5.LJLLLLLL(0, this.LIZLLL.peek().LIZ);
        }
    }

    @Override // X.InterfaceC1640820sng
    public final void LIZIZ(C1640940sns c1640940sns) {
        C1640970snv c1640970snvPeek;
        if (this.LIZLLL.empty()) {
            c1640970snvPeek = null;
        } else {
            c1640970snvPeek = this.LIZLLL.peek();
        }
        View viewInvoke = c1640940sns.LIZIZ.invoke();
        this.LIZLLL.push(new C1640970snv(viewInvoke, c1640940sns.LIZ));
        if (c1640970snvPeek != null) {
            C786410Ut5.LJLLLLLL(8, c1640970snvPeek.LIZ);
        } else {
            LIZLLL(false);
        }
        FrameLayout frameLayout = this.LIZ;
        C786410Ut5.LJLLLLLL(0, viewInvoke);
        frameLayout.addView(viewInvoke);
    }

    public final void LIZLLL(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        Iterator<ViewGroup> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            C786410Ut5.LJLZ(i, it2.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1640950snt(FrameLayout frameLayout, LifecycleOwner lifecycleOwner) {
        this.LIZ = frameLayout;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = C1697810uHb.LJ(frameLayout.findViewById(R.id.kms), frameLayout.findViewById(R.id.kn1));
    }
}
