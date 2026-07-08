package com.bytedance.android.live.effect.beauty.multiguest;

import X.C098200Yq;
import X.C0U6W;
import X.C0U6Y;
import X.C0U78;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C23250099c;
import X.C454600HsA;
import X.C766850U6h;
import X.C786410Ut5;
import X.InterfaceC766800U6c;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.OnLiveEffectSelectedEvent;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveBeautySubItemMultiGuestFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4Zy02KTA4MGE+PSHELIOSk4ICgmLTY4ZwM6PiAOLC4mPDwfPC0aPCAhBDo/PCwLPCogPAM+KCg+LSs4";
    public Function0<Unit> LLILZIL;
    public Function1<? super LiveEffect, Unit> LLILZLL;
    public C0U78 LLIZLLLIL;
    public C16F5 LLJ;
    public final C0U6Y LL = new C0U6W() { // from class: X.0U6Y
        @Override // X.C0U6W
        public final void LLLLLLLLLL(int i, LiveEffect liveEffect) {
            if (C0U7C.LJIILL(liveEffect, this.LLILLL)) {
                C766270U4b.LIZLLL(2131841021);
                return;
            }
            if (!C766720U5u.LJIILLIIL(liveEffect)) {
                return;
            }
            LLLJ(this.LLILZIL);
            LLLILZ(i);
            this.LLILZIL = i;
            InterfaceC766800U6c interfaceC766800U6c = this.LLILZLL;
            if (interfaceC766800U6c != null) {
                interfaceC766800U6c.LIZ(liveEffect);
            }
        }

        @Override // X.C0U6W
        public final void LLLLLLIL(int i, C0U6Z c0u6z, LiveEffect liveEffect) {
            if (C766720U5u.LJIILLIIL(liveEffect)) {
                C786410Ut5.LJZI(8, c0u6z.LLILZ);
            } else {
                C786410Ut5.LJZI(0, c0u6z.LLILZ);
                C766720U5u.LJ(liveEffect, this.LLIZLLLIL);
            }
            if (C0U7C.LJIILL(liveEffect, this.LLILLL)) {
                C786410Ut5.T4(c0u6z.itemView, 0.4f);
            } else {
                C786410Ut5.T4(c0u6z.itemView, 1.0f);
            }
            if (this.LLILZIL == i) {
                C0U6W.LLLLLLL(c0u6z);
            } else {
                C0U6W.LLLLLLLLL(c0u6z);
            }
        }
    };
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public String LLILZ = "";
    public String LLIZ = "";

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C0U6Y c0u6y = this.LL;
        c0u6y.LLILLL = null;
        c0u6y.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("live_effect_panel_info")) == null) {
            string = "";
        }
        this.LLILLJJLI = string;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("live_effect_panel_name")) == null) {
            string2 = "";
        }
        this.LLILZ = string2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            arguments3.getString("live_effect_panel_key");
        }
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string3 = arguments4.getString("parent_effect_name")) == null) {
            string3 = "";
        }
        this.LLILLL = string3;
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string4 = arguments5.getString("live_effect_panel_name_enum")) != null) {
            str = string4;
        }
        this.LLIZ = str;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0U6Y c0u6y = this.LL;
        c0u6y.LLILLL = this.LLIZLLLIL;
        c0u6y.LLILZLL = new InterfaceC766800U6c() { // from class: X.0U6l
            @Override // X.InterfaceC766800U6c
            public final void LIZ(LiveEffect liveEffect) {
                C770170UJb.LIZIZ(String.valueOf(liveEffect));
                this.LIZ.getClass();
                DataChannel dataChannelLJ = C475510Ikn.LJ(this.LIZ);
                if (dataChannelLJ != null) {
                    dataChannelLJ.LC0(OnLiveEffectSelectedEvent.class, liveEffect);
                }
            }
        };
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.vm2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        recyclerView.setAdapter(this.LL);
        recyclerView.addItemDecoration(new C454600HsA());
        recyclerView.setItemAnimator(null);
        this.LL.LLILLJJLI = recyclerView;
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.q2z);
        this.LLJ = c16f5;
        if (c16f5 != null) {
            c16f5.setText(this.LLILLL);
        }
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.bn2), new ACListenerS147S0100000_12(this, 442));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C766850U6h(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gel, viewGroup, false);
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
