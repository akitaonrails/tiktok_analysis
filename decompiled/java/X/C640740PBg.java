package X;

import Y.AObserverS214S0100000_10;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0PBg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640740PBg implements C0PBY {
    public final /* synthetic */ C640700PBc LL = new C640700PBc();
    public final LifecycleOwner LLILLJJLI;
    public final C01GW LLILLL;

    @Override // X.C0PBY
    public final void Q1(List<? extends InterfaceC648350Pbt> list, C587060N0u c587060N0u) {
        this.LL.Q1(list, c587060N0u);
    }

    @Override // X.C0P74
    public final void LJL() {
        this.LL.LL = null;
    }

    @Override // X.C0P74
    public final void z1(C588600N6s c588600N6s) {
        this.LL.LL = c588600N6s;
    }

    public C640740PBg(SearchStateViewModel searchStateViewModel, LifecycleOwner lifecycleOwner) {
        this.LLILLJJLI = lifecycleOwner;
        searchStateViewModel.tacoClearPlayData.observe(this.LLILLJJLI, new AObserverS214S0100000_10(this, 115));
        this.LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1001));
    }
}
