package X;

import Y.AObserverS188S0200000_28;
import Y.AObserverS216S0100000_12;
import Y.AObserverS230S0100000_28;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.FundraiserContainerFragment;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateContainerFragment;
import com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSContainerViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10kA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19332010kA extends AbstractC813200VvC {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC813200VvC
    public final void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        if (this.$t != 0) {
            super.onFragmentStopped(fragmentManager, fragment);
        } else {
            onFragmentStopped$0(this, fragmentManager, fragment);
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (1 - this.$t != 0) {
            super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        } else {
            onFragmentViewCreated$0(this, fragmentManager, fragment, view, bundle);
        }
    }

    public C19332010kA(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFragmentStopped$0(C19332010kA c19332010kA, FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentStopped(fragmentManager, fragment);
        ((FundraiserContainerFragment) c19332010kA.l0).NR();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onFragmentViewCreated$0(C19332010kA c19332010kA, FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        Fragment fragment2;
        LifecycleOwner viewLifecycleOwner;
        if (Intrinsics.LJFF(fragment, ((PNSAgeGateContainerFragment) c19332010kA.l0).MR())) {
            PNSAgeGateContainerFragment pNSAgeGateContainerFragment = (PNSAgeGateContainerFragment) c19332010kA.l0;
            C10WS c10wsMR = pNSAgeGateContainerFragment.MR();
            if (c10wsMR != null) {
                pNSAgeGateContainerFragment.PR().LLJILLL.observe(pNSAgeGateContainerFragment.getViewLifecycleOwner(), new AObserverS216S0100000_12(pNSAgeGateContainerFragment, 106));
                MutableLiveData<Integer> mutableLiveDataMM = c10wsMR.MM();
                if (mutableLiveDataMM != null) {
                    mutableLiveDataMM.observe(pNSAgeGateContainerFragment.getViewLifecycleOwner(), new AObserverS230S0100000_28(pNSAgeGateContainerFragment, 81));
                }
                c10wsMR.iz().observe(pNSAgeGateContainerFragment.getViewLifecycleOwner(), new AObserverS230S0100000_28(pNSAgeGateContainerFragment, 82));
                c10wsMR.bJ().observe(pNSAgeGateContainerFragment.getViewLifecycleOwner(), new AObserverS230S0100000_28(pNSAgeGateContainerFragment, 83));
            }
            PNSAgeGateContainerFragment pNSAgeGateContainerFragment2 = (PNSAgeGateContainerFragment) c19332010kA.l0;
            C10WS c10wsMR2 = pNSAgeGateContainerFragment2.MR();
            if (c10wsMR2 != 0 && (c10wsMR2 instanceof Fragment) && (fragment2 = (Fragment) c10wsMR2) != null && (viewLifecycleOwner = fragment2.getViewLifecycleOwner()) != null) {
                if (pNSAgeGateContainerFragment2.NR()) {
                    FlowLiveDataConversions.asLiveData(((PNSContainerViewModel) pNSAgeGateContainerFragment2.LLILZLL.getValue()).LLILLJJLI, C23271099x.INSTANCE, Mp4ScreenVideoLoadTimeout.CONTROL).observe(viewLifecycleOwner, new AObserverS230S0100000_28(pNSAgeGateContainerFragment2, 85));
                }
                pNSAgeGateContainerFragment2.PR().LLJJIJIL.observe(viewLifecycleOwner, new AObserverS230S0100000_28(c10wsMR2, 86));
                pNSAgeGateContainerFragment2.PR().LLJILJILJ.observe(viewLifecycleOwner, new AObserverS230S0100000_28(c10wsMR2, 87));
                pNSAgeGateContainerFragment2.PR().LLJJ.observe(viewLifecycleOwner, new AObserverS230S0100000_28(c10wsMR2, 88));
                pNSAgeGateContainerFragment2.PR().LLJJI.observe(viewLifecycleOwner, new AObserverS230S0100000_28(c10wsMR2, 89));
                pNSAgeGateContainerFragment2.PR().LLJJIII.observe(viewLifecycleOwner, new AObserverS230S0100000_28(c10wsMR2, 90));
                pNSAgeGateContainerFragment2.PR().LLJJIJI.observe(viewLifecycleOwner, new AObserverS230S0100000_28(c10wsMR2, 91));
                pNSAgeGateContainerFragment2.PR().LLJJIJIIJIL.observe(viewLifecycleOwner, new AObserverS188S0200000_28(c10wsMR2, pNSAgeGateContainerFragment2, 17));
                c10wsMR2.mD().observe(viewLifecycleOwner, new AObserverS188S0200000_28(c10wsMR2, pNSAgeGateContainerFragment2, 18));
                LiveData<C19258510Vz> liveDataUn = c10wsMR2.Un();
                if (liveDataUn != null) {
                    liveDataUn.observe(viewLifecycleOwner, new AObserverS230S0100000_28(pNSAgeGateContainerFragment2, 84));
                }
            }
            ((PNSAgeGateContainerFragment) c19332010kA.l0).getChildFragmentManager().LLIILZL(c19332010kA);
        }
        super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
    }
}
