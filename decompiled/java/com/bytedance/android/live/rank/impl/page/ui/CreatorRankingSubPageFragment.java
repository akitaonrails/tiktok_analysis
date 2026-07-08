package com.bytedance.android.live.rank.impl.page.ui;

import X.C01GW;
import X.C1749280vcc;
import X.C1778070wN3;
import X.C1785300wYi;
import X.C1785320wYk;
import X.C1785370wYp;
import X.C1785390wYr;
import X.C1785460wYy;
import X.C1786390waT;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C860850Xpr;
import X.C861890XrX;
import X.InterfaceC1785410wYt;
import X.InterfaceC1786180wa8;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS0S0601000_1;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import com.bytedance.android.live.rank.impl.page.ui.cell.CreatorRankingRankCell;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class CreatorRankingSubPageFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/ZjHELIOSUtLip9PSxiCj02KTEjOx0yJi4lJygAPSccKCg2DjctLiI2JjE=";
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLL;
    public C1749280vcc LLILZ;
    public long LLILZIL;

    public final InterfaceC1786180wa8 MR() {
        return (InterfaceC1786180wa8) this.LL.getValue();
    }

    public final CreatorRankingPageViewModel NR() {
        return (CreatorRankingPageViewModel) this.LLILLJJLI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLILZIL = 0L;
        this.LLILLL = null;
        this.LLILZ = null;
        super.onDestroyView();
    }

    public CreatorRankingSubPageFragment() {
        super(R.layout.gh9);
        this.LL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 101));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 102));
    }

    public final boolean OR(C1778070wN3 c1778070wN3) {
        C1778070wN3 c1778070wN32;
        C1785300wYi c1785300wYi;
        if (getView() != null && isAdded()) {
            C1785320wYk c1785320wYk = ((C1785460wYy) NR().LLILLJJLI.getValue()).LJ;
            if (c1785320wYk != null && (c1785300wYi = c1785320wYk.LIZLLL) != null) {
                c1778070wN32 = c1785300wYi.LIZLLL;
            } else {
                c1778070wN32 = null;
            }
            return Intrinsics.LJFF(c1778070wN32, c1778070wN3);
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("arg_rank_type");
        } else {
            i = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated rankType=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("CreatorRankingSubPageFragment", C2188811AlT.LIZIZ(sbLIZ));
        super.onViewCreated(view, bundle);
        this.LLILLL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.f96);
        this.LLILZ = (C1749280vcc) view.findViewById(R.id.f9_);
        C1749280vcc c1749280vcc = this.LLILZ;
        if (c1749280vcc != null) {
            C1786390waT c1786390waT = C1786390waT.LIZ;
            Context contextRequireContext = requireContext();
            c1786390waT.getClass();
            C1786390waT.LIZ(c1749280vcc, contextRequireContext);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(getViewLifecycleOwner());
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILLL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(CreatorRankingRankCell.class);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C860850Xpr(this, i, null), 3);
    }

    public final boolean PR(C861890XrX c861890XrX, long j, int i, Function0<Boolean> function0, Function0<Unit> function02, Function0<Unit> function03) {
        C1785320wYk c1785320wYk;
        C1785390wYr c1785390wYr;
        LinearLayoutManager linearLayoutManager;
        int iIntValue;
        if (c861890XrX.LIZ.type != i || (c1785320wYk = ((C1785460wYy) NR().LLILLJJLI.getValue()).LJ) == null || !Intrinsics.LJFF(c1785320wYk.LIZ, c861890XrX)) {
            return false;
        }
        InterfaceC1785410wYt interfaceC1785410wYt = c1785320wYk.LIZIZ;
        if (!(interfaceC1785410wYt instanceof C1785390wYr) || (c1785390wYr = (C1785390wYr) interfaceC1785410wYt) == null) {
            return false;
        }
        List<C1785370wYp> list = c1785390wYr.LIZIZ.LIZIZ.LIZ;
        if (list.isEmpty()) {
            return false;
        }
        Iterator<C1785370wYp> it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().LIZIZ == j) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() < 0 && ((iIntValue = (numValueOf = Integer.valueOf((int) (j - 1))).intValue()) < 0 || iIntValue >= list.size())) {
            return false;
        }
        int iIntValue2 = numValueOf.intValue();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLL;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return false;
        }
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            if (!function0.invoke().booleanValue()) {
                function02.invoke();
                return true;
            }
            linearLayoutManager.scrollToPositionWithOffset(iIntValue2, 0);
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS0S0601000_1(viewOnAttachStateChangeListenerC20604515jv, function0, function02, linearLayoutManager, iIntValue2, viewOnAttachStateChangeListenerC20604515jv, function03, 0));
            return true;
        }
        if (!function0.invoke().booleanValue()) {
            function02.invoke();
            return true;
        }
        viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(iIntValue2);
        function03.invoke();
        return true;
    }
}
