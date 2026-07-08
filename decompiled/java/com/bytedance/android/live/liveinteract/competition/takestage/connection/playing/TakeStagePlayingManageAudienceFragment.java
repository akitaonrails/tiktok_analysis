package com.bytedance.android.live.liveinteract.competition.takestage.connection.playing;

import X.AbstractC981040bdW;
import X.C098200Yq;
import X.C1117360fBO;
import X.C11JL;
import X.C13BV;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C954460awe;
import X.C978980baC;
import X.C981900beu;
import X.C982390bfh;
import X.C982910bgX;
import X.EnumC982940bga;
import X.EnumC983140bgu;
import X.RunnableC781530UlD;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionScoreChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class TakeStagePlayingManageAudienceFragment extends TakeStagePlayingManageAudienceContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zyw8JTUpPSYnISoiZzsyIyA/PS40HELIOSLWsvJiE9LSY4ICA9ZjUgKDY6JiJiHS44LRY4KCg2GCktMCY9LwgtJy40LQQ5LSY2JiYpDz0yLygpJzs=";
    public Function2<? super EnumC983140bgu, ? super Long, Unit> LLILZ;
    public long LLILZIL;
    public boolean LLIZ;
    public boolean LLJ;
    public C982910bgX LLJIJIL;
    public RunnableC781530UlD LLJILJILJ;
    public C11JL LLJILLL;
    public long LLJJ;
    public EnumC982940bga LLILZLL = EnumC982940bga.PLAYING;
    public List<C954460awe> LLIZLLLIL = C13BV.INSTANCE;
    public final ArrayList<C982910bgX> LLJI = new ArrayList<>();
    public final C1117360fBO LLJILJIL = new C1117360fBO();

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        boolean z = this.LLIZ;
        SpannableString spannableStringValueOf = (z && this.LLILZLL == EnumC982940bga.FINAL_CALL) ? SpannableString.valueOf(C497740JfY.LJIJI(2131851732)) : (z && this.LLILZLL != EnumC982940bga.FINAL_RESULT && this.LLILZLL == EnumC982940bga.PLAYING) ? SpannableString.valueOf(C497740JfY.LJIJI(2131856719)) : SpannableString.valueOf(C497740JfY.LJIJI(2131851751));
        c978980baC.LIZ = spannableStringValueOf;
        c978980baC.LJIILIIL = false;
        c978980baC.LJIIL = true;
        c978980baC.LIZIZ = !this.LLIZ;
        c978980baC.LJIIIIZZ = true;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(getContext());
        View view = null;
        if (layoutInflaterNe != null) {
            View view2 = getView();
            View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hs_, view2 instanceof ViewGroup ? (ViewGroup) view2 : null, false);
            if (viewTd != null) {
                C500260Jjc.LJLIIIL(500L, viewTd, new AwS594S0100000_15(this, 10));
                view = viewTd;
            }
        }
        c978980baC.LJII = view;
        return c978980baC;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC981040bdW abstractC981040bdW = (AbstractC981040bdW) this.LLILLL;
        if (abstractC981040bdW != null) {
            abstractC981040bdW.LJIIJ();
        }
        C11JL c11jl = this.LLJILLL;
        if (c11jl != null) {
            C500260Jjc.LJJLIIIJLJLI(c11jl);
        }
        this.LLJILLL = null;
    }

    public final C982390bfh PR(long j) {
        C981900beu c981900beu;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (c981900beu = (C981900beu) dataChannelLJ.gg0(CompetitionScoreChangeEvent.class)) != null) {
            return c981900beu.LIZJ.get(Long.valueOf(j));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022c  */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.0bfO] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r41, android.os.Bundle r42) {
        /*
            Method dump skipped, instruction units count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.competition.takestage.connection.playing.TakeStagePlayingManageAudienceFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gc_, viewGroup, false);
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
