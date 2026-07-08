package com.bytedance.android.live.effect.panel;

import X.AnonymousClass0956;
import X.C01GW;
import X.C098200Yq;
import X.C0U61;
import X.C0U76;
import X.C0U78;
import X.C0U86;
import X.C0UD7;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19P4;
import X.C23118094a;
import X.C23250099c;
import X.C452501pT;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C761330Ttj;
import X.C761340Ttk;
import X.C764410Tyh;
import X.C766820U6e;
import X.C786410Ut5;
import X.InterfaceC1813060xHU;
import X.InterfaceC766830U6f;
import X.ViewOnClickListenerC1836610xtT;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.effect.ForceRefreshSmallItemBeautyListPanel;
import com.bytedance.android.live.effect.OnLiveEffectSelectedEvent;
import com.bytedance.android.live.effect.api.LinkVideoReleaseComposerManagerEvent;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.panel.LiveMultiGuestBeautyEffectFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveMultiGuestBeautyEffectFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4Zz8yJiHELIOSAgZwM6PiABPCMnIQI5LDwnCiAtPDsqDSMqLCwnDjctLiI2JjE=";
    public C0U78 LLILLJJLI;
    public C19P4 LLILLL;
    public ViewOnClickListenerC1836610xtT LLILZ;
    public TextView LLILZIL;
    public InterfaceC766830U6f LLILZLL;
    public DataChannel LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public LiveSmallItemBeautyViewModel LLJI;
    public boolean LLJIJIL;
    public AnonymousClass0956 LLJILJILJ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 57));
    public final C766820U6e LLJILJIL = new C0U86() { // from class: X.0U6e
        @Override // X.C0U86
        public final void LIZ(LiveEffect liveEffect, String str, boolean z) {
            if (Intrinsics.LJFF(str, C0UD4.LJ)) {
                DataChannel dataChannel = this.LIZ.LLIZ;
                if (dataChannel != null) {
                    dataChannel.FQ2(ForceRefreshSmallItemBeautyListPanel.class);
                    return;
                }
                return;
            }
            if (!Intrinsics.LJFF(str, "liveguestbeauty")) {
                return;
            }
            C0UD7 c0ud7 = C0UD7.LIZ;
            LiveEffect liveEffect2 = ((C0U6V) this.LIZ.LL.getValue()).LJFF;
            InterfaceC766830U6f interfaceC766830U6f = this.LIZ.LLILZLL;
            if (interfaceC766830U6f == null) {
                interfaceC766830U6f = null;
            }
            C0UD7.LJIIL(liveEffect2, interfaceC766830U6f.LJFF(), this.LIZ.LLIZ);
        }
    };

    public final void NR() {
        InterfaceC766830U6f interfaceC766830U6f = this.LLILZLL;
        if (interfaceC766830U6f == null) {
            interfaceC766830U6f = null;
        }
        boolean zLJJJI = false;
        if (this.LLIZLLLIL != null) {
            C0U78 c0u78 = this.LLILLJJLI;
            if (c0u78 == null) {
                c0u78 = null;
            }
            List<LiveEffect> listQr = c0u78.qr("liveguestbeauty");
            ArrayList<LiveEffect> arrayList = new ArrayList();
            for (LiveEffect liveEffect : listQr) {
                if (Intrinsics.LJFF(liveEffect.LLILL(), this.LLIZLLLIL)) {
                    arrayList.add(liveEffect);
                }
            }
            if (!arrayList.isEmpty()) {
                for (LiveEffect liveEffect2 : arrayList) {
                    if (!liveEffect2.LJIILIIL()) {
                        C0U78 c0u782 = this.LLILLJJLI;
                        if (c0u782 == null) {
                            c0u782 = null;
                        }
                        if (C500260Jjc.LJJJI(Boolean.valueOf(c0u782.LJJ(liveEffect2)))) {
                        }
                    }
                    zLJJJI = true;
                }
            }
            zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(zLJJJI));
        }
        interfaceC766830U6f.LIZ(zLJJJI);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLJILJILJ;
        if (anonymousClass0956 != null) {
            C23118094a.LIZIZ("fragment on destroy", null, anonymousClass0956);
        }
        C0U78 c0u78 = this.LLILLJJLI;
        (c0u78 != null ? c0u78 : null).tr(this.LLJILJIL);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC766830U6f interfaceC766830U6f = this.LLILZLL;
        C0U78 c0u78 = null;
        if (interfaceC766830U6f == null) {
            interfaceC766830U6f = null;
        }
        ImageView imageViewLJ = interfaceC766830U6f.LJ();
        if (imageViewLJ != null) {
            C500260Jjc.LJLIIIL(500L, imageViewLJ, new AwS591S0100000_12(this, 1020));
        }
        this.LLILZ = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.gxc);
        this.LLIZ = C475510Ikn.LJ(this);
        this.LLJIJIL = false;
        C0UD7.LJIIL = false;
        if (getActivity() != null) {
            this.LLJI = (LiveSmallItemBeautyViewModel) C0U61.LIZ(new C0U76("liveguestbeauty", false)).get(LiveSmallItemBeautyViewModel.class);
        }
        this.LLJILJILJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C761340Ttk(this, null), 3);
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = this.LLILZ;
        if (viewOnClickListenerC1836610xtT == null) {
            viewOnClickListenerC1836610xtT = null;
        }
        viewOnClickListenerC1836610xtT.LJI();
        DataChannel dataChannel = this.LLIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this, OnLiveEffectSelectedEvent.class, new AwS591S0100000_12(this, 96));
            dataChannel.BQ2(this, LinkVideoReleaseComposerManagerEvent.class, new AwS591S0100000_12(this, 97));
        }
        C19P4 c19p4 = this.LLILLL;
        if (c19p4 == null) {
            c19p4 = null;
        }
        c19p4.setOnLevelChangeListener(new C764410Tyh() { // from class: X.0U6d
            @Override // X.C764410Tyh, X.C19P8
            public final void LIZ(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFreeze: ");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("MultiGuestBeauty#AdjustPercentBar", C2188811AlT.LIZIZ(sbLIZ));
                LiveMultiGuestBeautyEffectFragment liveMultiGuestBeautyEffectFragment = this.LIZ;
                if (liveMultiGuestBeautyEffectFragment.LLJIJIL) {
                    C0UD7 c0ud7 = C0UD7.LIZ;
                    LiveEffect liveEffect = ((C0U6V) liveMultiGuestBeautyEffectFragment.LL.getValue()).LJFF;
                    InterfaceC766830U6f interfaceC766830U6f2 = this.LIZ.LLILZLL;
                    if (interfaceC766830U6f2 == null) {
                        interfaceC766830U6f2 = null;
                    }
                    C0UD7.LJIIL(liveEffect, interfaceC766830U6f2.LJFF(), this.LIZ.LLIZ);
                    this.LIZ.LLJIJIL = false;
                }
            }

            @Override // X.C19P8
            public final void LIZJ(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onChanged: ");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("MultiGuestBeauty#AdjustPercentBar", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LLJIJIL = true;
                C20337914i1<Boolean> c20337914i1 = InterfaceC934710aQn.Jb;
                if (C500260Jjc.LJJIFFI(c20337914i1.LIZIZ())) {
                    c20337914i1.LJFF(Boolean.TRUE);
                }
                C0U6V c0u6v = (C0U6V) this.LIZ.LL.getValue();
                c0u6v.LJIIIIZZ(i, c0u6v.LJFF);
                LiveEffect liveEffect = c0u6v.LJFF;
                if (liveEffect != null) {
                    c0u6v.LJ.LJIL(i, liveEffect, c0u6v.LIZLLL);
                }
                this.LIZ.NR();
                C0UD7.LJIIL = true;
            }
        });
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = this.LLILZ;
        if (viewOnClickListenerC1836610xtT2 == null) {
            viewOnClickListenerC1836610xtT2 = null;
        }
        viewOnClickListenerC1836610xtT2.setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0Tti
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C761310Tth(this.LIZ, null), 3);
            }
        });
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C761330Ttj(this, null), 3);
        C0U78 c0u782 = this.LLILLJJLI;
        if (c0u782 != null) {
            c0u78 = c0u782;
        }
        c0u78.Dr(this.LLJILJIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.h72, null, false);
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
