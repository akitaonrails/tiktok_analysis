package X;

import androidx.fragment.app.Fragment;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.profile.business.effect.EffectProfileDetailJediWidget;
import com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AFwS325S0000000_35;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS470S0200000_35;

/* JADX INFO: renamed from: X.1EBU, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EBU implements InterfaceC1603360rpG {
    public final EffectProfileListViewModel LL;
    public EffectProfileDetailJediWidget LLILLJJLI;
    public boolean LLILLL;

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return i + 10000;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final void unInit() {
    }

    @Override // X.InterfaceC1603360rpG
    public final /* bridge */ /* synthetic */ Object getViewModel() {
        return this.LL;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isLoading() {
        return this.LLILLL;
    }

    public C1EBU(EffectProfileListViewModel effectProfileListViewModel) {
        this.LL = effectProfileListViewModel;
    }

    @Override // X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        EffectProfileListViewModel effectProfileListViewModel = this.LL;
        if (effectProfileListViewModel != null) {
            EffectProfileDetailJediWidget effectProfileDetailJediWidget = this.LLILLJJLI;
            if (effectProfileDetailJediWidget == null) {
                effectProfileDetailJediWidget = null;
            }
            DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) interfaceC1209780haS;
            final AwS470S0200000_35 awS470S0200000_35 = new AwS470S0200000_35(detailFragmentPanel, this, 3);
            final AFwS283S0000000_35 aFwS283S0000000_35 = AFwS283S0000000_35.get$arr$(130);
            final AFwS325S0000000_35 aFwS325S0000000_35 = AFwS325S0000000_35.get$arr$(3);
            C11DN<Object, InterfaceC960503pD> c11dn = new C11DN<Object, InterfaceC960503pD>(aFwS283S0000000_35, aFwS325S0000000_35, awS470S0200000_35) { // from class: X.1EBZ
                public final Function1<InterfaceC960503pD, Unit> LIZ;
                public final Function2<InterfaceC960503pD, Throwable, Unit> LIZIZ;
                public final Function2<InterfaceC960503pD, List<? extends Object>, Unit> LIZJ;

                @Override // X.C11DN
                public final Function2<InterfaceC960503pD, Throwable, Unit> LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.C11DN
                public final Function2<InterfaceC960503pD, List<? extends Object>, Unit> LIZIZ() {
                    return this.LIZJ;
                }

                @Override // X.C11DN
                public final Function1<InterfaceC960503pD, Unit> LIZJ() {
                    return this.LIZ;
                }

                {
                    this.LIZ = aFwS283S0000000_35;
                    this.LIZIZ = aFwS325S0000000_35;
                    this.LIZJ = awS470S0200000_35;
                }
            };
            final AwS401S0200000_35 awS401S0200000_35 = new AwS401S0200000_35(detailFragmentPanel, this, 46);
            final AwS470S0200000_35 awS470S0200000_352 = new AwS470S0200000_35(detailFragmentPanel, this, 4);
            final AwS470S0200000_35 awS470S0200000_353 = new AwS470S0200000_35(detailFragmentPanel, this, 5);
            ListViewModel.mR2(effectProfileListViewModel, effectProfileDetailJediWidget, null, c11dn, new C11DN<Object, InterfaceC960503pD>(awS401S0200000_35, awS470S0200000_352, awS470S0200000_353) { // from class: X.1EBY
                public final Function1<InterfaceC960503pD, Unit> LIZ;
                public final Function2<InterfaceC960503pD, Throwable, Unit> LIZIZ;
                public final Function2<InterfaceC960503pD, List<? extends Object>, Unit> LIZJ;

                @Override // X.C11DN
                public final Function2<InterfaceC960503pD, Throwable, Unit> LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.C11DN
                public final Function2<InterfaceC960503pD, List<? extends Object>, Unit> LIZIZ() {
                    return this.LIZJ;
                }

                @Override // X.C11DN
                public final Function1<InterfaceC960503pD, Unit> LIZJ() {
                    return this.LIZ;
                }

                {
                    this.LIZ = awS401S0200000_35;
                    this.LIZIZ = awS470S0200000_352;
                    this.LIZJ = awS470S0200000_353;
                }
            }, 242);
        }
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        if (this.LL == null) {
            return false;
        }
        fragment.requireActivity();
        this.LLILLJJLI = new EffectProfileDetailJediWidget();
        C214820195e c214820195eLIZ = C214817195b.LIZ(fragment.getView(), fragment);
        EffectProfileDetailJediWidget effectProfileDetailJediWidget = this.LLILLJJLI;
        if (effectProfileDetailJediWidget == null) {
            effectProfileDetailJediWidget = null;
        }
        c214820195eLIZ.LIZLLL(effectProfileDetailJediWidget);
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        EffectProfileListViewModel effectProfileListViewModel;
        if (i != 1) {
            if (i == 4 && (effectProfileListViewModel = this.LL) != null) {
                effectProfileListViewModel.nR2();
                return;
            }
            return;
        }
        EffectProfileListViewModel effectProfileListViewModel2 = this.LL;
        if (effectProfileListViewModel2 == null) {
            return;
        }
        effectProfileListViewModel2.refresh();
    }
}
