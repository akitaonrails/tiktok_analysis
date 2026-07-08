package com.bytedance.android.live.liveinteract.competition.takestage.connection.inviter;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.C098200Yq;
import X.C1117360fBO;
import X.C13LP;
import X.C158B;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C497740JfY;
import X.C500260Jjc;
import X.C754570Tip;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C946260ajQ;
import X.C954460awe;
import X.C974560bT4;
import X.C978980baC;
import X.C981210bdn;
import X.C981300bdw;
import X.C982910bgX;
import X.C982930bgZ;
import X.EnumC962960bAM;
import X.InterfaceC983770bhv;
import X.RunnableC781530UlD;
import Y.AObserverS219S0100000_15;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.competition.takestage.connection.inviter.TakeStageInviterSelectFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class TakeStageInviterSelectFragment extends TakeStageInviterSelectContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zyw8JTUpPSYnISoiZzsyIyHELIOSA/PS40LWsvJiE9LSY4ICA9ZiwiPyYnLTdiHS44LRY4KCg2ASs6IDs2OhYpJSowPAM+KCg+LSs4";
    public C981300bdw LLILZ;
    public C982910bgX LLIZ;
    public RunnableC781530UlD LLJ;
    public View LLJI;
    public C16FS LLJIJIL;
    public boolean LLJILJIL;
    public Function0<Unit> LLILZIL = AFwS203S0000000_15.get$arr$(30);
    public final ArrayList<C982910bgX> LLILZLL = new ArrayList<>();
    public final C1117360fBO LLIZLLLIL = new C1117360fBO();
    public final long LLJILJILJ = C158B.LIZ();

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131851791));
        c978980baC.LJIILIIL = false;
        c978980baC.LIZIZ = true;
        c978980baC.LJIIIIZZ = true;
        c978980baC.LJIIJ = new AwS559S0100000_15(this, 116);
        c978980baC.LJIIJJI = new AwS559S0100000_15(this, 117);
        return c978980baC;
    }

    public final void PR(boolean z) {
        if (z) {
            View view = this.LLJI;
            if (view != null) {
                C500260Jjc.LLFFF(view);
            }
            C16FS c16fs = this.LLJIJIL;
            if (c16fs != null) {
                c16fs.LJ();
            }
            C16FS c16fs2 = this.LLJIJIL;
            if (c16fs2 != null) {
                c16fs2.setEnabled(false);
                return;
            }
            return;
        }
        View view2 = this.LLJI;
        if (view2 != null) {
            C500260Jjc.LJIILIIL(view2);
        }
        C16FS c16fs3 = this.LLJIJIL;
        if (c16fs3 != null) {
            c16fs3.LJIIL();
        }
        C16FS c16fs4 = this.LLJIJIL;
        if (c16fs4 == null) {
            return;
        }
        c16fs4.setEnabled(true);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0be0] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        AbstractC21673719rz itemAnimator;
        super.onViewCreated(view, bundle);
        this.LLJ = (RunnableC781530UlD) view.findViewById(R.id.nse);
        this.LLJI = view.findViewById(R.id.v_take_stage_user_group_block);
        this.LLJIJIL = (C16FS) view.findViewById(R.id.cra);
        RunnableC781530UlD runnableC781530UlD = this.LLJ;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LLJ;
        if (runnableC781530UlD2 != null && (itemAnimator = runnableC781530UlD2.getItemAnimator()) != null && (itemAnimator instanceof AbstractC21674919sB)) {
            ((AbstractC21674919sB) itemAnimator).LLIZ = false;
        }
        RunnableC781530UlD runnableC781530UlD3 = this.LLJ;
        if (runnableC781530UlD3 != null) {
            runnableC781530UlD3.addItemDecoration(new C981210bdn((int) C497740JfY.LIZIZ(8.0f)));
        }
        RunnableC781530UlD runnableC781530UlD4 = this.LLJ;
        if (runnableC781530UlD4 != null) {
            runnableC781530UlD4.setAdapter(this.LLIZLLLIL);
        }
        this.LLIZLLLIL.LLLI(C982910bgX.class, new C982930bgZ(new InterfaceC983770bhv() { // from class: X.0be0
            @Override // X.InterfaceC983770bhv
            public final void LIZ(EnumC983290bh9 enumC983290bh9, C982910bgX c982910bgX) {
                TakeStageInviterSelectFragment takeStageInviterSelectFragment = this.LIZ;
                takeStageInviterSelectFragment.getClass();
                if (c982910bgX.LJFF) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateData, do nothing, item.isSelected=");
                    sbLIZ.append(c982910bgX.LJFF);
                    sbLIZ.append(", item=");
                    sbLIZ.append(c982910bgX);
                    C20441214yg.LIZIZ("TakeStageInviterFragment", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                takeStageInviterSelectFragment.LLIZ = c982910bgX;
                Iterator<C982910bgX> it2 = takeStageInviterSelectFragment.LLILZLL.iterator();
                while (it2.hasNext()) {
                    it2.next().LJFF = false;
                }
                c982910bgX.LJFF = true;
                takeStageInviterSelectFragment.LLIZLLLIL.notifyDataSetChanged();
            }
        }));
        PR(false);
        C16FS c16fs = this.LLJIJIL;
        if (c16fs != null) {
            C500260Jjc.LJLIIIL(500L, c16fs, new AwS594S0100000_15(this, 1173));
        }
        C981300bdw c981300bdw = this.LLILZ;
        if (c981300bdw != null) {
            c981300bdw.LJIILIIL.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 124));
        }
        this.LLILZLL.clear();
        List<C954460awe> listLJJLI = C915980Zwa.LJII().LJJLI();
        int i = 0;
        for (C954460awe c954460awe : listLJJLI) {
            int i2 = i + 1;
            ImageModel imageModel = null;
            if (i >= 0) {
                C954460awe c954460awe2 = c954460awe;
                ArrayList<C982910bgX> arrayList = this.LLILZLL;
                long j = c954460awe2.LJ;
                C754570Tip c754570Tip = c954460awe2.LJIJJ;
                if (c754570Tip != null) {
                    imageModel = c754570Tip.LIZJ;
                }
                String strLIZ = C946260ajQ.LIZ(c754570Tip);
                long j2 = c954460awe2.LJFF;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new C982910bgX(j, imageModel, strLIZ, j2, true, z, false, false, false, null, false, null, false, false, null, null, false, false, 0, 524224));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C1117360fBO c1117360fBO = this.LLIZLLLIL;
        ArrayList<C982910bgX> arrayList2 = this.LLILZLL;
        c1117360fBO.LL = arrayList2;
        this.LLIZ = (C982910bgX) C13LP.LJJJLZIJ(0, arrayList2);
        this.LLIZLLLIL.notifyDataSetChanged();
        if (listLJJLI.size() <= 2) {
            C16FS c16fs2 = this.LLJIJIL;
            if (c16fs2 != null) {
                c16fs2.setText(C497740JfY.LJIJI(2131851792));
            }
        } else {
            C16FS c16fs3 = this.LLJIJIL;
            if (c16fs3 != null) {
                c16fs3.setText(C497740JfY.LJIJI(2131853336));
            }
        }
        new C974560bT4().LJJIJIIJI(this.LLJILJIL, EnumC962960bAM.TAKE_THE_STAGE, C158B.LIZ() - this.LLJILJILJ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gc7, viewGroup, false);
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
