package X;

import Y.AObserverS214S0100000_10;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0PTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645570PTv extends AbstractC645560PTu {
    public final ClickSearchViewModel LJII;
    public final Lifecycle LJIIIIZZ;
    public C653660PkS LJIIIZ;
    public ISearchContextAbility LJIIJ;
    public EnumC645610PTz LJIIJJI;
    public int LJIIL;

    @Override // X.AbstractC645560PTu
    public final ClickSearchViewModel LJ() {
        return this.LJII;
    }

    public C645570PTv(ClickSearchViewModel clickSearchViewModel, Lifecycle lifecycle) {
        Fragment fragment;
        super(EnumC645610PTz.GENERAL_REFACTOR, clickSearchViewModel);
        this.LJII = clickSearchViewModel;
        this.LJIIIIZZ = lifecycle;
        this.LJIIL = -1;
        this.LJII.BQ2(new AObserverS214S0100000_10(this, 97));
        AObserverS214S0100000_10 aObserverS214S0100000_10 = new AObserverS214S0100000_10(this, 98);
        WeakReference<Fragment> weakReference = clickSearchViewModel.LL;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            C325901Of.LIZJ(clickSearchViewModel.xQ2(), fragment, aObserverS214S0100000_10);
        }
    }
}
