package com.bytedance.android.live.liveinteract.matchv2.connection.individualmatch.coordinator.inviter.view;

import X.C098200Yq;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C289101Ab;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C954460awe;
import X.C973100bQi;
import X.C973660bRc;
import X.C977610bXz;
import X.C977630bY1;
import X.C978340bZA;
import X.C978440bZK;
import X.C978750bZp;
import X.C978980baC;
import X.EnumC973700bRg;
import X.EnumC974980bTk;
import Y.AObserverS219S0100000_15;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIcyClashMatchSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes16.dex */
public final class IndividualMatchInviterFragment extends IndividualMatchInviterContract$View {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyoiJyowPCwjJ2E6JiElPyY3HELIOSPSQgJC4nKy1iKiA8OiElJy4nJzdiICElITEpO2ElISA7ZwY9LCw6ICsmKSkBKDswIAwiPyYnLTcKOy40JSAiPQ==";
    public C977610bXz LLILZ;
    public C977630bY1 LLILZIL;
    public boolean LLILZLL;
    public GiftMode LLIZ;
    public C973100bQi LLIZLLLIL;
    public C289101Ab LLJ;
    public C16FS LLJI;
    public final C978750bZp LLJIJIL = new C978750bZp(this);
    public DataChannel LLJILJIL;
    public boolean LLJILJILJ;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(getString(2131853313));
        c978980baC.LJIILIIL = false;
        GiftMode giftMode = this.LLIZ;
        c978980baC.LIZJ = ((giftMode == null || giftMode.giftId == 0) ? 0 : 30) + 305;
        c978980baC.LJIIIIZZ = true;
        c978980baC.LJII = this.LLJIJIL.LIZIZ(this.LLJILJIL, false, this.LL, true);
        c978980baC.LJIJI = 0;
        c978980baC.LIZ();
        c978980baC.LIZIZ();
        return c978980baC;
    }

    public final List<C954460awe> PR() {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        if (this.LLILZLL) {
            C977630bY1 c977630bY1 = this.LLILZIL;
            if (c977630bY1 == null || (mutableLiveData2 = c977630bY1.LIZJ) == null) {
                return null;
            }
            return (List) mutableLiveData2.getValue();
        }
        C977610bXz c977610bXz = this.LLILZ;
        if (c977610bXz == null || (mutableLiveData = c977610bXz.LIZLLL) == null) {
            return null;
        }
        return (List) mutableLiveData.getValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C978340bZA.LIZLLL();
    }

    public final void RR(boolean z) {
        if (z) {
            C16FS c16fs = this.LLJI;
            if (c16fs != null) {
                c16fs.LJ();
            }
            C16FS c16fs2 = this.LLJI;
            if (c16fs2 != null) {
                c16fs2.setEnabled(false);
                return;
            }
            return;
        }
        C16FS c16fs3 = this.LLJI;
        if (c16fs3 != null) {
            c16fs3.LJIIL();
        }
        C16FS c16fs4 = this.LLJI;
        if (c16fs4 == null) {
            return;
        }
        c16fs4.setEnabled(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void SR(java.util.Map<java.lang.Long, java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r6.LLILZLL
            if (r0 == 0) goto L2a
            X.0bY1 r0 = r6.LLILZIL
            if (r0 == 0) goto L3f
            androidx.lifecycle.MutableLiveData r0 = r0.LJIILLIIL
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L3f
            boolean r4 = r0.booleanValue()
        L18:
            X.0bQi r0 = r6.LLIZLLLIL
            if (r0 == 0) goto L29
            java.util.List r3 = r6.PR()
            java.util.Map r2 = X.C2097608Jq.LJ()
            r5 = 0
            r1 = r7
            r0.l0(r1, r2, r3, r4, r5)
        L29:
            return
        L2a:
            X.0bXz r0 = r6.LLILZ
            if (r0 == 0) goto L3f
            androidx.lifecycle.MutableLiveData r0 = r0.LJIIJ
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L3f
            boolean r4 = r0.booleanValue()
            goto L18
        L3f:
            r4 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchv2.connection.individualmatch.coordinator.inviter.view.IndividualMatchInviterFragment.SR(java.util.Map):void");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C973100bQi c973100bQi;
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = (C973100bQi) view.findViewById(R.id.o29);
        this.LLJ = (C289101Ab) view.findViewById(R.id.o25);
        this.LLJI = (C16FS) view.findViewById(R.id.cwy);
        if (C915980Zwa.LJII().LLILZLL(true).size() == 3 && (c973100bQi = this.LLIZLLLIL) != null) {
            c973100bQi.e0();
        }
        C289101Ab c289101Ab = this.LLJ;
        if (c289101Ab != null) {
            C289101Ab.e0(c289101Ab, this.LLIZ, null, LiveCoHostIcyClashMatchSetting.INSTANCE.isEnable(), 2);
        }
        if (this.LLILZLL) {
            C977630bY1 c977630bY1 = this.LLILZIL;
            if (c977630bY1 != null) {
                c977630bY1.LJIIJ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 21));
                c977630bY1.LJIJ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 22));
                c977630bY1.LJIILLIIL.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 23));
                c977630bY1.LJIIIIZZ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 24));
                c977630bY1.LJIIJJI.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 25));
            }
        } else {
            C977610bXz c977610bXz = this.LLILZ;
            if (c977610bXz != null) {
                c977610bXz.LJII.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 26));
                c977610bXz.LJIIL.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 27));
                c977610bXz.LJIIJ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 28));
                c977610bXz.LJFF.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 29));
                c977610bXz.LJIILIIL.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 30));
            }
        }
        C973660bRc c973660bRc = C973660bRc.LIZ;
        C973660bRc.LJJJZ(false, null, null, EnumC974980bTk.WITHDRAW, null, this.LLJILJILJ, false, EnumC973700bRg.INVITE_WAITING, false, null, null, false, C978440bZK.LJ(this.LLJILJIL), null, 12096);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g7q, viewGroup, false);
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
