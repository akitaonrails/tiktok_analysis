package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20174413wk;
import X.C318610CeJ;
import X.C497010JeN;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.model.RandomMatchDataChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS440S0200000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class GuestMatchEntryFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZzogLTclJyk8ZiYjJCI8JmshKDswICAiPT0qZgI5LDwnBSQ4KicWJjE+MAkhKSIhLCEn";
    public DataChannel LL;
    public GuestMatchEntryViewModel LLILLJJLI;
    public Function0<Unit> LLILLL;
    public Function0<Unit> LLILZ;
    public Function0<Unit> LLILZIL;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C497010JeN.LIZ = new WeakReference<>(this.LL);
        C497010JeN.LIZJ();
        final DataChannel dataChannel = this.LL;
        this.LLILLJJLI = (GuestMatchEntryViewModel) new ViewModelProvider.Factory(dataChannel) { // from class: X.0D4a
            public final DataChannel LIZ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            {
                this.LIZ = dataChannel;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                if (cls.isAssignableFrom(GuestMatchEntryViewModel.class)) {
                    return new GuestMatchEntryViewModel(this.LIZ);
                }
                throw new IllegalArgumentException("Unknown ViewModel class");
            }
        }.create(GuestMatchEntryViewModel.class);
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, GuestMatchEntryRefreshLinkPlayerStateEvent.class, new AwS583S0100000_4(this, 11));
            dataChannel2.BQ2(this, RandomMatchDataChannel.class, new AwS583S0100000_4(this, 12));
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new C318610CeJ(this, null));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        GuestMatchEntryViewModel guestMatchEntryViewModel = this.LLILLJJLI;
        if (guestMatchEntryViewModel != null) {
            C20174413wk.LIZIZ(composeView, new C19719212De(-1642933619, new AwS440S0200000_4(composeView, guestMatchEntryViewModel, 1), true));
        }
        try {
            ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(composeView, this);
            composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return composeView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return composeView;
        }
    }
}
