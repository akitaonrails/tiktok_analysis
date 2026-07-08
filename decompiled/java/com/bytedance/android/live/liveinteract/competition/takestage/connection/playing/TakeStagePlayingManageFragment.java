package com.bytedance.android.live.liveinteract.competition.takestage.connection.playing;

import X.AbstractC981010bdT;
import X.C098200Yq;
import X.C1117360fBO;
import X.C13BV;
import X.C15438062q;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C785410UrT;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C950220apo;
import X.C954460awe;
import X.C963140bAe;
import X.C978980baC;
import X.C981900beu;
import X.C982390bfh;
import X.C982910bgX;
import X.C983460bhQ;
import X.EnumC973950bS5;
import X.EnumC983140bgu;
import X.InterfaceC963450bB9;
import X.RunnableC781530UlD;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.competition.core.timer.CompetitionCountTimeEvent;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionScoreChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class TakeStagePlayingManageFragment extends TakeStagePlayingManageContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zyw8JTUpPSYnISoiZzsyIyHELIOSA/PS40LWsvJiE9LSY4ICA9ZjUgKDY6JiJiHS44LRY4KCg2GCktMCY9LwgtJy40LQM+KCg+LSs4";
    public Function2<? super EnumC983140bgu, ? super Long, Unit> LLILZ = AFwS299S0000000_15.get$arr$(14);
    public long LLILZIL = C950220apo.LJ();
    public List<Long> LLILZLL;
    public List<C954460awe> LLIZ;
    public String LLIZLLLIL;
    public final ArrayList<C982910bgX> LLJ;
    public C982910bgX LLJI;
    public final C1117360fBO LLJIJIL;
    public RunnableC781530UlD LLJILJIL;
    public C16F5 LLJILJILJ;
    public View LLJILLL;
    public C16FS LLJJ;
    public LiveDialog LLJJI;
    public LiveDialog LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = this.LLJJIJI ? SpannableString.valueOf(C497740JfY.LJIJI(2131856719)) : SpannableString.valueOf(C497740JfY.LJIJI(2131851809));
        c978980baC.LJIILIIL = false;
        c978980baC.LJIIL = true;
        c978980baC.LIZIZ = !this.LLJJIJI;
        c978980baC.LJIIIIZZ = true;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(getContext());
        View view = null;
        if (layoutInflaterNe != null) {
            View view2 = getView();
            View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hs_, view2 instanceof ViewGroup ? (ViewGroup) view2 : null, false);
            if (viewTd != null) {
                C500260Jjc.LJLIIIL(500L, viewTd, new AwS594S0100000_15(this, 14));
                view = viewTd;
            }
        }
        c978980baC.LJII = view;
        return c978980baC;
    }

    public TakeStagePlayingManageFragment() {
        List<C954460awe> listLJJLI = C915980Zwa.LJII().LJJLI();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLI, 10));
        Iterator<C954460awe> it2 = listLJJLI.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        this.LLILZLL = arrayList;
        this.LLIZ = C13BV.INSTANCE;
        this.LLIZLLLIL = EnumC973950bS5.SWITCH_ICON.getValue();
        this.LLJ = new ArrayList<>();
        this.LLJIJIL = new C1117360fBO();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LiveDialog liveDialog = this.LLJJI;
        if (liveDialog != null) {
            liveDialog.dismiss();
            C785410UrT.LIZ(liveDialog);
        }
        LiveDialog liveDialog2 = this.LLJJIII;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
            C785410UrT.LIZ(liveDialog2);
        }
        InterfaceC963450bB9 interfaceC963450bB9 = this.LL;
        if (interfaceC963450bB9 != null) {
            interfaceC963450bB9.dismiss();
        }
        AbstractC981010bdT abstractC981010bdT = (AbstractC981010bdT) this.LLILLL;
        if (abstractC981010bdT != null) {
            abstractC981010bdT.LJIIJ();
        }
    }

    public final String PR(long j) {
        C983460bhQ c983460bhQ;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (c983460bhQ = (C983460bhQ) dataChannelLJ.gg0(CompetitionCountTimeEvent.class)) != null && c983460bhQ.LIZLLL == j) {
            return C963140bAe.LJIIL(c983460bhQ.LJ);
        }
        return "00:00";
    }

    public final C982390bfh RR(long j) {
        C981900beu c981900beu;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (c981900beu = (C981900beu) dataChannelLJ.gg0(CompetitionScoreChangeEvent.class)) != null) {
            return c981900beu.LIZJ.get(Long.valueOf(j));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c8  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.bytedance.android.live.base.model.ImageModel] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r29v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v3 */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r41, android.os.Bundle r42) {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.competition.takestage.connection.playing.TakeStagePlayingManageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gc9, viewGroup, false);
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
