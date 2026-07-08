package com.bytedance.android.live.liveinteract.competition.takestage.connection.invitee;

import X.C098200Yq;
import X.C1117360fBO;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C497740JfY;
import X.C786410Ut5;
import X.C978980baC;
import X.C981290bdv;
import X.C982910bgX;
import X.RunnableC781530UlD;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class TakeStageInviteeFragment extends TakeStageInviteeContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zyw8JTUpPSYnISoiZzHELIOSsyIyA/PS40LWsvJiE9LSY4ICA9ZiwiPyYnLSBiHS44LRY4KCg2ASs6IDs2LQM+KCg+LSs4";
    public C981290bdv LLILZ;
    public C978980baC LLILZLL;
    public boolean LLIZ;
    public View LLIZLLLIL;
    public C16F5 LLJ;
    public C1324720kZq LLJI;
    public RunnableC781530UlD LLJILJILJ;
    public C16FS LLJILLL;
    public C16FS LLJJ;
    public C16FS LLJJI;
    public View LLJJIII;
    public boolean LLJJIJIIJIL;
    public Function0<Unit> LLILZIL = AFwS203S0000000_15.get$arr$(29);
    public final ArrayList<C982910bgX> LLJIJIL = new ArrayList<>();
    public final C1117360fBO LLJILJIL = new C1117360fBO();
    public long LLJJIJI = SystemClock.uptimeMillis();

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131851715));
        c978980baC.LJIILIIL = this.LLJJIJIIJIL;
        c978980baC.LJIIIIZZ = false;
        c978980baC.LIZIZ = true;
        c978980baC.LJIIJ = new AwS559S0100000_15(this, 114);
        c978980baC.LJIIJJI = new AwS559S0100000_15(this, 115);
        this.LLILZLL = c978980baC;
        return c978980baC;
    }

    public final boolean PR() {
        MutableLiveData mutableLiveData;
        C981290bdv c981290bdv;
        MutableLiveData mutableLiveData2;
        C981290bdv c981290bdv2 = this.LLILZ;
        return (c981290bdv2 == null || (mutableLiveData = c981290bdv2.LJIIJJI) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.FALSE) || (c981290bdv = this.LLILZ) == null || (mutableLiveData2 = c981290bdv.LJIILIIL) == null || !Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.FALSE)) ? false : true;
    }

    public final void RR() {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        C981290bdv c981290bdv = this.LLILZ;
        boolean zLJFF = (c981290bdv == null || (mutableLiveData2 = c981290bdv.LJIIJJI) == null) ? false : Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.TRUE);
        C981290bdv c981290bdv2 = this.LLILZ;
        boolean zLJFF2 = (c981290bdv2 == null || (mutableLiveData = c981290bdv2.LJIILIIL) == null) ? false : Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE);
        if (zLJFF) {
            C16FS c16fs = this.LLJILLL;
            if (c16fs != null) {
                c16fs.LJ();
            }
            C16FS c16fs2 = this.LLJILLL;
            if (c16fs2 != null) {
                c16fs2.setEnabled(false);
            }
            C16FS c16fs3 = this.LLJJ;
            if (c16fs3 != null) {
                c16fs3.LJIIL();
            }
            C16FS c16fs4 = this.LLJJ;
            if (c16fs4 != null) {
                c16fs4.setEnabled(false);
                return;
            }
            return;
        }
        if (zLJFF2) {
            C16FS c16fs5 = this.LLJILLL;
            if (c16fs5 != null) {
                c16fs5.LJIIL();
            }
            C16FS c16fs6 = this.LLJILLL;
            if (c16fs6 != null) {
                c16fs6.setEnabled(false);
            }
            C16FS c16fs7 = this.LLJJ;
            if (c16fs7 != null) {
                c16fs7.LJ();
            }
            C16FS c16fs8 = this.LLJJ;
            if (c16fs8 != null) {
                c16fs8.setEnabled(false);
                return;
            }
            return;
        }
        C16FS c16fs9 = this.LLJILLL;
        if (c16fs9 != null) {
            c16fs9.LJIIL();
        }
        C16FS c16fs10 = this.LLJILLL;
        if (c16fs10 != null) {
            c16fs10.setEnabled(true);
        }
        C16FS c16fs11 = this.LLJJ;
        if (c16fs11 != null) {
            c16fs11.LJIIL();
        }
        C16FS c16fs12 = this.LLJJ;
        if (c16fs12 != null) {
            c16fs12.setEnabled(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e3 A[PHI: r23
      0x02e3: PHI (r23v1 boolean) = (r23v0 boolean), (r23v3 boolean), (r23v3 boolean), (r23v3 boolean) binds: [B:111:0x02df, B:89:0x0251, B:91:0x0259, B:93:0x0267] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0225  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r38, android.os.Bundle r39) {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.competition.takestage.connection.invitee.TakeStageInviteeFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gc6, viewGroup, false);
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
