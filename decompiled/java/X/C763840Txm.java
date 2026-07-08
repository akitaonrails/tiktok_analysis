package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Txm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C763840Txm extends FragmentStateAdapter {
    public final int LLJI;
    public final List<C763870Txp> LLJIJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLJIJIL).size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final boolean LLLI(long j) {
        List<C763870Txp> list = this.LLJIJIL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C763870Txp> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZJ == j) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        if (i >= ((ArrayList) this.LLJIJIL).size()) {
            return C765010Tzf.LIZ(this.LLJI, -1L, "");
        }
        return C765010Tzf.LIZ(this.LLJI, ((C763860Txo) ListProtector.get(this.LLJIJIL, i)).LIZ, ((C763860Txo) ListProtector.get(this.LLJIJIL, i)).LIZIZ);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, X.AbstractC21673619ry
    public final long getItemId(int i) {
        if (i >= ((ArrayList) this.LLJIJIL).size()) {
            return -10000L;
        }
        return ((C763860Txo) ListProtector.get(this.LLJIJIL, i)).LIZJ;
    }

    public C763840Txm(Fragment fragment, int i) {
        super(fragment);
        this.LLJI = i;
        this.LLJIJIL = new ArrayList();
    }
}
