package com.bytedance.android.live.effect.karaoke.view;

import X.C098200Yq;
import X.C0DXQ;
import X.C0JDJ;
import X.C1161920gLG;
import X.C1685300txQ;
import X.C1834150xpV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19P4;
import X.C20337914i1;
import X.C20743716Ff;
import X.C23250099c;
import X.C417090GXb;
import X.C465220IMe;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C761720TuM;
import X.C763810Txj;
import X.C764290TyV;
import X.C764320TyY;
import X.C764340Tya;
import X.C764410Tyh;
import X.C765590U1l;
import X.C765700U1w;
import X.C785990UsP;
import X.C786410Ut5;
import X.InterfaceC761860Tua;
import X.InterfaceC766480U4w;
import Y.ACListenerS141S0100000_6;
import Y.ACListenerS147S0100000_12;
import Y.ACListenerS79S0300000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.EchoModeChannel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.karaoke.view.KaraokeSettingFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeSettingFragment extends BaseFragment implements C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyHELIOSQyOiQjIip9PiwpPmEYKTctJiQ2GyA4PSY9LwM+KCg+LSs4";
    public View LL;
    public C20743716Ff LLILLJJLI;
    public View LLILLL;
    public C20743716Ff LLILZ;
    public C20743716Ff LLILZIL;
    public View LLILZLL;
    public TextView LLIZ;
    public C19P4 LLIZLLLIL;
    public TextView LLJ;
    public C19P4 LLJI;
    public C417090GXb LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public TextView LLJILLL;
    public RecyclerView LLJJ;
    public C761720TuM LLJJI;
    public KaraokeViewModel LLJJIII;
    public DataChannel LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        C20337914i1<Integer> c20337914i1;
        C20337914i1<Integer> c20337914i12;
        super.onViewCreated(view, bundle);
        this.LLJJIJI = C475510Ikn.LJ(this);
        this.LL = view.findViewById(R.id.bn2);
        this.LLILLJJLI = (C20743716Ff) view.findViewById(R.id.nup);
        this.LLILLL = view.findViewById(R.id.nuq);
        this.LLILZ = (C20743716Ff) view.findViewById(R.id.pu3);
        this.LLILZIL = (C20743716Ff) view.findViewById(R.id.stt);
        this.LLILZLL = view.findViewById(R.id.stk);
        this.LLIZLLLIL = (C19P4) view.findViewById(R.id.vocal_volume_progress);
        this.LLIZ = (TextView) view.findViewById(R.id.vocal_volume_value);
        this.LLJI = (C19P4) view.findViewById(R.id.a0i);
        this.LLJ = (TextView) view.findViewById(R.id.a0k);
        this.LLJIJIL = (C417090GXb) view.findViewById(R.id.y5r);
        this.LLJILJIL = view.findViewById(R.id.y5p);
        this.LLJILJILJ = view.findViewById(R.id.y5q);
        this.LLJILLL = (TextView) view.findViewById(R.id.y5s);
        this.LLJJ = (RecyclerView) view.findViewById(R.id.vqh);
        View view2 = this.LL;
        if (view2 == null) {
            view2 = null;
        }
        C500260Jjc.LJLIIIL(500L, view2, new AwS585S0100000_6(this, 446));
        C20743716Ff c20743716Ff = this.LLILZIL;
        if (c20743716Ff == null) {
            c20743716Ff = null;
        }
        InterfaceC761860Tua echoHelper = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getEchoHelper();
        if (echoHelper != null) {
            DataChannel dataChannel = this.LLJJIJI;
            if (dataChannel != null) {
                dataChannel.EQ2(this, EchoModeChannel.class, new AwS591S0100000_12(c20743716Ff, 1214));
            }
            c20743716Ff.setToggleEnabled(false);
            c20743716Ff.setDebounceClickEnabled(true);
            c20743716Ff.setDelayInterval(500L);
            c20743716Ff.setEnabled(false);
            c20743716Ff.setDisabledAlpha(1.0f);
            C1834150xpV.LJIIJ(c20743716Ff, true);
            C786410Ut5.k8(c20743716Ff, new ACListenerS79S0300000_12(echoHelper, this, c20743716Ff, 28));
        }
        C20743716Ff c20743716Ff2 = this.LLILZIL;
        if (c20743716Ff2 == null) {
            c20743716Ff2 = null;
        }
        c20743716Ff2.setSaveEnabled(false);
        C20743716Ff c20743716Ff3 = this.LLILLJJLI;
        if (c20743716Ff3 == null) {
            c20743716Ff3 = null;
        }
        c20743716Ff3.setSaveEnabled(false);
        C20743716Ff c20743716Ff4 = this.LLILZ;
        if (c20743716Ff4 == null) {
            c20743716Ff4 = null;
        }
        c20743716Ff4.setSaveEnabled(false);
        View view3 = this.LLILLL;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 475), view3);
        C20743716Ff c20743716Ff5 = this.LLILLJJLI;
        if (c20743716Ff5 == null) {
            c20743716Ff5 = null;
        }
        C786410Ut5.A7(c20743716Ff5, new C785990UsP(this, 38));
        C20743716Ff c20743716Ff6 = this.LLILZ;
        if (c20743716Ff6 == null) {
            c20743716Ff6 = null;
        }
        C786410Ut5.A7(c20743716Ff6, new C785990UsP(this, 39));
        KaraokeViewModel karaokeViewModelLIZJ = C765700U1w.LIZJ(C475510Ikn.LJ(this));
        this.LLJJIII = karaokeViewModelLIZJ;
        if (karaokeViewModelLIZJ != null && !karaokeViewModelLIZJ.KQ2()) {
            C20743716Ff c20743716Ff7 = this.LLILZIL;
            if (c20743716Ff7 == null) {
                c20743716Ff7 = null;
            }
            C786410Ut5.LLJJJIL(c20743716Ff7, 8);
            View view4 = this.LLILZLL;
            if (view4 == null) {
                view4 = null;
            }
            C786410Ut5.LJLLLLLL(8, view4);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C764290TyV(this, null), 3);
        C19P4 c19p4 = this.LLIZLLLIL;
        if (c19p4 == null) {
            c19p4 = null;
        }
        c19p4.LIZJ(100, 0, 0, true);
        C19P4 c19p42 = this.LLJI;
        if (c19p42 == null) {
            c19p42 = null;
        }
        c19p42.LIZJ(100, 0, 0, true);
        C19P4 c19p43 = this.LLIZLLLIL;
        if (c19p43 == null) {
            c19p43 = null;
        }
        KaraokeViewModel karaokeViewModel = this.LLJJIII;
        if (karaokeViewModel != null) {
            numValueOf = Integer.valueOf(karaokeViewModel.HQ2());
        } else {
            numValueOf = null;
        }
        c19p43.setPercent(C765700U1w.LJ(numValueOf));
        TextView textView = this.LLIZ;
        if (textView == null) {
            textView = null;
        }
        KaraokeViewModel karaokeViewModel2 = this.LLJJIII;
        if (karaokeViewModel2 != null) {
            C765590U1l c765590U1l = karaokeViewModel2.LLJLLIL;
            int iLJIIJJI = karaokeViewModel2.LL.LJIIJJI();
            c765590U1l.getClass();
            if (C763810Txj.LIZ(Integer.valueOf(iLJIIJJI))) {
                c20337914i12 = InterfaceC766480U4w.LJJLIIIJ;
            } else {
                c20337914i12 = InterfaceC766480U4w.LJJLIIIJLJLI;
            }
            numValueOf2 = Integer.valueOf(c20337914i12.LIZIZ().intValue());
        } else {
            numValueOf2 = null;
        }
        textView.setText(String.valueOf(numValueOf2));
        C19P4 c19p44 = this.LLJI;
        if (c19p44 == null) {
            c19p44 = null;
        }
        KaraokeViewModel karaokeViewModel3 = this.LLJJIII;
        if (karaokeViewModel3 != null) {
            numValueOf3 = Integer.valueOf(karaokeViewModel3.HQ2());
        } else {
            numValueOf3 = null;
        }
        c19p44.setPercent(C765700U1w.LIZLLL(numValueOf3));
        TextView textView2 = this.LLJ;
        if (textView2 == null) {
            textView2 = null;
        }
        KaraokeViewModel karaokeViewModel4 = this.LLJJIII;
        if (karaokeViewModel4 != null) {
            C765590U1l c765590U1l2 = karaokeViewModel4.LLJLLIL;
            int iLJIIJJI2 = karaokeViewModel4.LL.LJIIJJI();
            c765590U1l2.getClass();
            if (C763810Txj.LIZ(Integer.valueOf(iLJIIJJI2))) {
                c20337914i1 = InterfaceC766480U4w.LJJLIIIJILLIZJL;
            } else {
                c20337914i1 = InterfaceC766480U4w.LJJLIIIJLLLLLLLZ;
            }
            numValueOf4 = Integer.valueOf(c20337914i1.LIZIZ().intValue());
        } else {
            numValueOf4 = null;
        }
        textView2.setText(String.valueOf(numValueOf4));
        C19P4 c19p45 = this.LLIZLLLIL;
        if (c19p45 == null) {
            c19p45 = null;
        }
        c19p45.setOnLevelChangeListener(new C764410Tyh() { // from class: X.0Tyd
            @Override // X.C764410Tyh, X.C19P8
            public final void onStart() {
                KaraokeSettingFragment karaokeSettingFragment = this.LIZ;
                KaraokeViewModel karaokeViewModel5 = karaokeSettingFragment.LLJJIII;
                karaokeSettingFragment.LLJJIJIIJIL = C765700U1w.LJ(karaokeViewModel5 != null ? Integer.valueOf(karaokeViewModel5.HQ2()) : null);
            }

            @Override // X.C764410Tyh, X.C19P8
            public final void LIZ(int i) {
                C20337914i1<Integer> c20337914i13;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFreeze: ");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("Karaoke#SeekBar", C2188811AlT.LIZIZ(sbLIZ));
                float fLIZIZ = C765700U1w.LIZIZ(this.LIZ.LLJJIJIIJIL);
                float fLIZIZ2 = C765700U1w.LIZIZ(i);
                boolean zKQ2 = false;
                if (fLIZIZ != fLIZIZ2) {
                    C0U17 c0u17 = C0U17.LIZ;
                    KaraokeSettingFragment karaokeSettingFragment = this.LIZ;
                    DataChannel dataChannel2 = karaokeSettingFragment.LLJJIJI;
                    KaraokeViewModel karaokeViewModel5 = karaokeSettingFragment.LLJJIII;
                    if (karaokeViewModel5 != null) {
                        zKQ2 = karaokeViewModel5.KQ2();
                    }
                    c0u17.LJIILL(dataChannel2, "vocal", fLIZIZ2, zKQ2);
                }
                KaraokeViewModel karaokeViewModel6 = this.LIZ.LLJJIII;
                if (karaokeViewModel6 != null) {
                    C765590U1l c765590U1l3 = karaokeViewModel6.LLJLLIL;
                    int iLJIIJJI3 = karaokeViewModel6.LL.LJIIJJI();
                    c765590U1l3.getClass();
                    if (C763810Txj.LIZ(Integer.valueOf(iLJIIJJI3))) {
                        c20337914i13 = InterfaceC766480U4w.LJJLIIIJ;
                    } else {
                        c20337914i13 = InterfaceC766480U4w.LJJLIIIJLJLI;
                    }
                    c20337914i13.LJFF(Integer.valueOf(i));
                }
            }

            @Override // X.C19P8
            public final void LIZJ(int i) {
                C0U1H c0u1hIQ2;
                AbstractC765580U1k abstractC765580U1k;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onChanged: ");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("Karaoke#SeekBar", C2188811AlT.LIZIZ(sbLIZ));
                KaraokeViewModel karaokeViewModel5 = this.LIZ.LLJJIII;
                TextView textView3 = null;
                if (karaokeViewModel5 != null && (c0u1hIQ2 = karaokeViewModel5.IQ2()) != null && (abstractC765580U1k = c0u1hIQ2.LIZJ) != null) {
                    abstractC765580U1k.LLJJIJIL(C765700U1w.LIZIZ(i));
                }
                TextView textView4 = this.LIZ.LLIZ;
                if (textView4 != null) {
                    textView3 = textView4;
                }
                textView3.setText(String.valueOf(i));
            }
        });
        C19P4 c19p46 = this.LLJI;
        if (c19p46 == null) {
            c19p46 = null;
        }
        c19p46.setOnLevelChangeListener(new C764410Tyh() { // from class: X.0Tyc
            @Override // X.C764410Tyh, X.C19P8
            public final void onStart() {
                KaraokeSettingFragment karaokeSettingFragment = this.LIZ;
                KaraokeViewModel karaokeViewModel5 = karaokeSettingFragment.LLJJIII;
                karaokeSettingFragment.LLJJIJIL = C765700U1w.LIZLLL(karaokeViewModel5 != null ? Integer.valueOf(karaokeViewModel5.HQ2()) : null);
            }

            @Override // X.C764410Tyh, X.C19P8
            public final void LIZ(int i) {
                C20337914i1<Integer> c20337914i13;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFreeze: ");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("Karaoke#SeekBar", C2188811AlT.LIZIZ(sbLIZ));
                float fLIZ = C765700U1w.LIZ(this.LIZ.LLJJIJIL);
                float fLIZ2 = C765700U1w.LIZ(i);
                boolean zKQ2 = false;
                if (fLIZ != fLIZ2) {
                    C0U17 c0u17 = C0U17.LIZ;
                    KaraokeSettingFragment karaokeSettingFragment = this.LIZ;
                    DataChannel dataChannel2 = karaokeSettingFragment.LLJJIJI;
                    KaraokeViewModel karaokeViewModel5 = karaokeSettingFragment.LLJJIII;
                    if (karaokeViewModel5 != null) {
                        zKQ2 = karaokeViewModel5.KQ2();
                    }
                    c0u17.LJIILL(dataChannel2, "instrumental", fLIZ2, zKQ2);
                }
                KaraokeViewModel karaokeViewModel6 = this.LIZ.LLJJIII;
                if (karaokeViewModel6 != null) {
                    C765590U1l c765590U1l3 = karaokeViewModel6.LLJLLIL;
                    int iLJIIJJI3 = karaokeViewModel6.LL.LJIIJJI();
                    c765590U1l3.getClass();
                    if (C763810Txj.LIZ(Integer.valueOf(iLJIIJJI3))) {
                        c20337914i13 = InterfaceC766480U4w.LJJLIIIJILLIZJL;
                    } else {
                        c20337914i13 = InterfaceC766480U4w.LJJLIIIJLLLLLLLZ;
                    }
                    c20337914i13.LJFF(Integer.valueOf(i));
                }
            }

            @Override // X.C19P8
            public final void LIZJ(int i) {
                C0U1H c0u1hIQ2;
                AbstractC765580U1k abstractC765580U1k;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onChanged: ");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("Karaoke#SeekBar", C2188811AlT.LIZIZ(sbLIZ));
                KaraokeViewModel karaokeViewModel5 = this.LIZ.LLJJIII;
                TextView textView3 = null;
                if (karaokeViewModel5 != null && (c0u1hIQ2 = karaokeViewModel5.IQ2()) != null && (abstractC765580U1k = c0u1hIQ2.LIZJ) != null) {
                    abstractC765580U1k.LLJILJIL(C765700U1w.LIZ(i));
                }
                TextView textView4 = this.LIZ.LLJ;
                if (textView4 != null) {
                    textView3 = textView4;
                }
                textView3.setText(String.valueOf(i));
            }
        });
        View view5 = this.LLJILJIL;
        if (view5 == null) {
            view5 = null;
        }
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 166), view5);
        View view6 = this.LLJILJILJ;
        if (view6 == null) {
            view6 = null;
        }
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 167), view6);
        C417090GXb c417090GXb = this.LLJIJIL;
        if (c417090GXb == null) {
            c417090GXb = null;
        }
        c417090GXb.setOnToneChangeListener(new AwS591S0100000_12(this, 1215));
        this.LLJJI = new C761720TuM(this.LLJJIJI, this, this.LLJJIII);
        RecyclerView recyclerView = this.LLJJ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new C0DXQ(18.0f, 18.0f, 12.0f));
        C761720TuM c761720TuM = this.LLJJI;
        if (c761720TuM == null) {
            c761720TuM = null;
        }
        recyclerView.setAdapter(c761720TuM);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        DataChannel dataChannel2 = this.LLJJIJI;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, EchoModeChannel.class, new AwS591S0100000_12(this, 75));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C764320TyY(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C764340Tya(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gwp, viewGroup, false);
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
