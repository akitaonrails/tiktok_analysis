package com.bytedance.android.live.effect.beauty.multiguest;

import X.C01GW;
import X.C098200Yq;
import X.C0U78;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1EOY;
import X.C23250099c;
import X.C452501pT;
import X.C475510Ikn;
import X.C766650U5n;
import X.C766860U6i;
import X.C786410Ut5;
import X.InterfaceC766680U5q;
import X.RunnableC781530UlD;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.effect.ForceRefreshSmallItemBeautyListPanel;
import com.bytedance.android.live.effect.OnLiveEffectSelectedEvent;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveBeautyItemMultiGuestFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4Zy02KTA4MGE+HELIOSPSk4ICgmLTY4ZwM6PiAOLC4mPDwFPSo+BTAgPSYUPSA/PQkhKSIhLCEn";
    public String LL;
    public String LLILLJJLI;
    public C0U78 LLILZ;
    public String LLILZLL;
    public final Set<String> LLILLL = new LinkedHashSet();
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 40));

    public final C766650U5n NR() {
        return (C766650U5n) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        NR().LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("live_effect_panel_name")) == null) {
            string = "";
        }
        this.LL = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string3 = arguments2.getString("live_effect_panel_key")) != null) {
            str = string3;
        }
        this.LLILLJJLI = str;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string2 = arguments3.getString("live_effect_panel_name_enum");
        } else {
            string2 = null;
        }
        this.LLILZLL = string2;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        NR().LLILZIL = new InterfaceC766680U5q() { // from class: X.0U6k
            @Override // X.InterfaceC766680U5q
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC766680U5q
            public final void LIZJ() {
            }

            @Override // X.InterfaceC766680U5q
            public final void LIZ(int i, LiveEffect liveEffect) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("index: ");
                sbLIZ.append(i);
                sbLIZ.append(' ');
                sbLIZ.append(liveEffect);
                C770170UJb.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                DataChannel dataChannelLJ = C475510Ikn.LJ(this.LIZ);
                if (dataChannelLJ != null) {
                    dataChannelLJ.LC0(OnLiveEffectSelectedEvent.class, liveEffect);
                }
            }
        };
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) view.findViewById(R.id.vm2);
        runnableC781530UlD.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        runnableC781530UlD.setAdapter(NR());
        runnableC781530UlD.setItemAnimator(null);
        NR().LLILLJJLI = runnableC781530UlD;
        C1EOY.LIZ.LJI(runnableC781530UlD);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C766860U6i(this, null), 3);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(this, ForceRefreshSmallItemBeautyListPanel.class, new AwS591S0100000_12(this, 1167));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gek, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
