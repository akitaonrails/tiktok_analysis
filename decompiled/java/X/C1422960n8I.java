package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.TemplateSearchTrendingItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0n8I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422960n8I {
    public final InterfaceC497601wk LIZ;
    public final h0<AbstractC788620Uwe> LIZIZ;
    public final h0 LIZJ;
    public final h0<C1422970n8J> LIZLLL;
    public final h0 LJ;
    public AnonymousClass0956 LJFF;
    public AnonymousClass0956 LJI;
    public int LJII;
    public int LJIIIIZZ;
    public String LJIIIZ;
    public List<String> LJIIJ;
    public String LJIIJJI;

    public final void LIZ() {
        if (this.LJI == null && this.LJIIJ.size() > 1) {
            InterfaceC497601wk interfaceC497601wk = this.LIZ;
            C1DFH c1dfh = C0PEM.LIZ;
            this.LJI = C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C1422950n8H(this, null), 2);
        }
    }

    public C1422960n8I(LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LIZ = lifecycleCoroutineScope;
        h0<AbstractC788620Uwe> h0Var = new h0<>(C788630Uwf.LIZ);
        this.LIZIZ = h0Var;
        this.LIZJ = h0Var;
        h0<C1422970n8J> h0Var2 = new h0<>(new C1422970n8J(0));
        this.LIZLLL = h0Var2;
        this.LJ = h0Var2;
        this.LJIIJ = C13BV.INSTANCE;
    }

    public final String LIZIZ(boolean z) {
        String str = this.LIZLLL.LIZJ().LJFF;
        if (str == null) {
            str = "";
        }
        String string = a0.LJLIIIL(str).toString();
        String str2 = null;
        if (z && string.length() > 0) {
            str2 = string;
        }
        if (string.length() > 0) {
            this.LJIIJJI = string;
        }
        return str2;
    }

    public final void LIZJ(List<TemplateSearchTrendingItem> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<TemplateSearchTrendingItem> it2 = list.iterator();
        while (it2.hasNext()) {
            String str = it2.next().title;
            if ((!a0.LJJJIL(str)) && str != null) {
                arrayList.add(str);
            }
        }
        List<String> listLL = C13LP.LL(arrayList, 5);
        this.LJIIJ = listLL;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = (String) C13LP.LJJJLL(listLL);
        this.LIZLLL.LJII(new C1422970n8J(0, (String) C13LP.LJJJLL(listLL), null, this.LJIIIZ, false, listLL));
        if (this.LJII > 0 && this.LJI == null) {
            LIZ();
        }
    }
}
