package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ek7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1100450ek7 {
    public final Context LL;
    public final int LLILLJJLI;
    public final C1100530ekF LLILLL;
    public View LLILZ;
    public C1100420ek4 LLILZIL;
    public final List<AbstractC1100460ek8> LLILZLL;

    public void LJIILJJIL() {
    }

    public void LJIL() {
    }

    public void LJJIIZ() {
    }

    public void LJJIIZI() {
    }

    public Pair<View, C19ME> LJJJ(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return null;
    }

    public final void LJII() {
        this.LLILLL.LIZJ(EnumC1100490ekB.END);
        LJIILJJIL();
    }

    public void LJJIZ() {
        if (this.LLILLL.LIZ != EnumC1100490ekB.END) {
            LJII();
        }
        C12ES.LIZIZ(this.LLILZ);
        Iterator<AbstractC1100460ek8> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIZ();
        }
    }

    public final void LJJJI() {
        this.LLILLL.LIZJ(EnumC1100490ekB.START);
        LJJIIZI();
    }

    public int LJIIJJI() {
        return this.LLILLJJLI;
    }

    public AbstractC1100450ek7(Context context, int i) {
        C1100530ekF c1100530ekF = new C1100530ekF();
        this.LL = context;
        this.LLILLJJLI = i;
        this.LLILLL = c1100530ekF;
        this.LLILZLL = new ArrayList();
    }

    public final void LJI(int i, AbstractC1100460ek8 abstractC1100460ek8) {
        ViewGroup viewGroup;
        C1100420ek4 c1100420ek4;
        View view;
        Context contextLJJIJ;
        LifecycleCoroutineScope lifecycleScope;
        View view2 = this.LLILZ;
        if (view2 != null && (viewGroup = (ViewGroup) view2.findViewById(i)) != null && (c1100420ek4 = this.LLILZIL) != null && (view = this.LLILZ) != null && (contextLJJIJ = C520010KaN.LJJIJ(view, true)) != null && (lifecycleScope = c1100420ek4.getLifecycleScope()) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C1100440ek6(abstractC1100460ek8, contextLJJIJ, viewGroup, this, null), 3);
        }
    }
}
