package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PeI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649840PeI<T extends Fragment> extends AbstractC649830PeH<T> {
    public static final /* synthetic */ int LLJILLL = 0;
    public final SearchContainerFragment LLJ;
    public final C19EG LLJI;
    public final InterfaceC664250Q3r LLJIJIL;
    public SearchResultParam LLJILJIL;
    public T LLJILJILJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        if (!(obj instanceof Fragment)) {
            obj = null;
        }
        HashMap<Integer, T> map = this.LLIZLLLIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, T> entry : map.entrySet()) {
            if (Intrinsics.LJFF(entry.getValue(), obj)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        if (!setKeySet.isEmpty()) {
            return ((Number) C13LP.LJJJJZ(setKeySet)).intValue();
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        return C644570PPz.LIZ(i, this.LLJI);
    }

    @Override // X.AbstractC650160Peo
    public final String LJJIZ(long j) {
        return C644560PPy.LJIILIIL((int) j);
    }

    @Override // X.AbstractC650160Peo, androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) throws Throwable {
        this.LLJILJILJ = (T) obj;
        super.LJJIIZ(viewGroup, i, obj);
    }

    public C649840PeI(SearchContainerFragment searchContainerFragment, FragmentManager fragmentManager, C19EG c19eg, int i, InterfaceC664250Q3r interfaceC664250Q3r) {
        super(fragmentManager, i);
        this.LLJ = searchContainerFragment;
        this.LLJI = c19eg;
        this.LLJIJIL = interfaceC664250Q3r;
    }
}
