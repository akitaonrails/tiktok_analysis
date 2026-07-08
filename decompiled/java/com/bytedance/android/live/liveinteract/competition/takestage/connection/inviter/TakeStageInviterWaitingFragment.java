package com.bytedance.android.live.liveinteract.competition.takestage.connection.inviter;

import X.C098200Yq;
import X.C1117360fBO;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C497740JfY;
import X.C786410Ut5;
import X.C978340bZA;
import X.C978980baC;
import X.C981300bdw;
import X.C982910bgX;
import X.RunnableC781530UlD;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes16.dex */
public final class TakeStageInviterWaitingFragment extends TakeStageInviterWaitingContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zyw8JTUpPSYnISoiZzsyIyA/HELIOSPS40LWsvJiE9LSY4ICA9ZiwiPyYnLTdiHS44LRY4KCg2ASs6IDs2OhItIDs6JiIKOy40JSAiPQ==";
    public C981300bdw LLILZ;
    public CharSequence LLILZIL;
    public final ArrayList<C982910bgX> LLILZLL = new ArrayList<>();
    public final C1117360fBO LLIZ = new C1117360fBO();
    public RunnableC781530UlD LLIZLLLIL;
    public C16FS LLJ;
    public View LLJI;
    public DataChannel LLJIJIL;
    public boolean LLJILJIL;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        CharSequence charSequenceLJIJI = C497740JfY.LJIJI(2131853313);
        CharSequence charSequence = this.LLILZIL;
        if (charSequence != null && charSequence.length() > 0) {
            charSequenceLJIJI = charSequence;
        }
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(charSequenceLJIJI);
        c978980baC.LIZIZ = true;
        c978980baC.LJIILIIL = this.LLJILJIL;
        c978980baC.LJIIIIZZ = true;
        return c978980baC;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean RR() {
        /*
            r8 = this;
            com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService r0 = X.C915980Zwa.LIZIZ()
            r0.Af1()
            boolean r7 = X.C976850bWl.LIZ()
            com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService r0 = X.C915980Zwa.LIZIZ()
            X.0beE r2 = r0.M91(r7)
            r6 = 1
            r1 = 0
            if (r2 == 0) goto L64
            boolean r0 = r2.LJJIIZ
            if (r0 != r6) goto L64
            r5 = 1
        L1c:
            r2.LJJIIZ = r1
        L1e:
            com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService r0 = X.C915980Zwa.LIZIZ()
            X.0bSa r4 = r0.JV1(r1)
            com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService r0 = X.C915980Zwa.LIZIZ()
            X.0beE r0 = r0.M91(r1)
            if (r0 == 0) goto L61
            X.0beG r0 = r0.LJJIJIIJI
            if (r0 == 0) goto L61
            long r2 = r0.LJFF
        L36:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isRematch:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", time:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", state:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "TakeStageInviterWaitingFragment"
            X.C20441214yg.LIZIZ(r0, r1)
            if (r7 == 0) goto L60
            if (r5 != 0) goto L60
            r6 = 0
        L60:
            return r6
        L61:
            r2 = 0
            goto L36
        L64:
            r5 = 0
            if (r2 == 0) goto L1e
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.competition.takestage.connection.inviter.TakeStageInviterWaitingFragment.RR():boolean");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C978340bZA.LIZLLL();
    }

    public final void PR(boolean z) {
        if (z) {
            C16FS c16fs = this.LLJ;
            if (c16fs != null) {
                c16fs.LJ();
            }
            C16FS c16fs2 = this.LLJ;
            if (c16fs2 != null) {
                c16fs2.setEnabled(false);
                return;
            }
            return;
        }
        C16FS c16fs3 = this.LLJ;
        if (c16fs3 != null) {
            c16fs3.LJIIL();
        }
        C16FS c16fs4 = this.LLJ;
        if (c16fs4 == null) {
            return;
        }
        c16fs4.setEnabled(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024f A[PHI: r23
      0x024f: PHI (r23v1 boolean) = (r23v0 boolean), (r23v3 boolean), (r23v3 boolean), (r23v3 boolean) binds: [B:84:0x024b, B:62:0x01bf, B:64:0x01c7, B:66:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r38, android.os.Bundle r39) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.competition.takestage.connection.inviter.TakeStageInviterWaitingFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gc8, viewGroup, false);
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
