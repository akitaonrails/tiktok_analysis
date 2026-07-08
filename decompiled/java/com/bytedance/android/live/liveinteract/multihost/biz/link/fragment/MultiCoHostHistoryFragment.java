package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.AbstractC960410b6F;
import X.AbstractC963000bAQ;
import X.C098200Yq;
import X.C1117360fBO;
import X.C15EQ;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501540Jlg;
import X.C766270U4b;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C955510ayL;
import X.C955540ayO;
import X.C955590ayT;
import X.C955650ayZ;
import X.C955810ayp;
import X.C960880b70;
import X.C963030bAT;
import X.C963040bAU;
import X.C963050bAV;
import X.C963060bAW;
import X.C963070bAX;
import X.C963080bAY;
import X.C963110bAb;
import X.C963120bAc;
import X.C963170bAh;
import X.C963190bAj;
import X.C963260bAq;
import X.C978980baC;
import X.InterfaceC246900xP;
import X.InterfaceC956060azE;
import X.InterfaceC956210azT;
import X.InterfaceC957060b0q;
import X.InterfaceC958410b31;
import X.RunnableC781530UlD;
import Y.AsS42S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostHistoryContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.LivingNoticeManager;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCoHostHistoryFragment extends MultiCoHostHistoryContract$AbsView implements InterfaceC956060azE, InterfaceC956210azT, InterfaceC957060b0q, InterfaceC246900xP {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISAgHELIOSPGsuIDV9JCwiImE1OiQrJCo9PGsBPCMnIQYjASAgPA0lOjs8OjwKOy40JSAiPQ==";
    public Function1<? super Long, Unit> LLILZ;
    public DataChannel LLILZIL;
    public View LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public RunnableC781530UlD LLJI;
    public final RecyclerView.RecycledViewPool LLILZLL = new RecyclerView.RecycledViewPool();
    public final C1117360fBO LLJIJIL = new C1117360fBO();

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostHistoryContract$AbsView
    public final void Kh(Throwable th) {
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostHistoryContract$AbsView
    public final MultiCoHostHistoryFragment PR() {
        return this;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131851693));
        c978980baC.LIZIZ = true;
        c978980baC.LIZJ = (int) (((double) C497740JfY.LJJI(C497740JfY.LJIILLIIL())) * 0.7d);
        c978980baC.LJIJI = R.drawable.dv3;
        c978980baC.LJIILIIL = false;
        c978980baC.LIZLLL = true;
        return c978980baC;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostHistoryContract$AbsView
    public final void SR() {
        if (this.mStatusViewValid) {
            C955650ayZ.LIZIZ();
        }
    }

    @Override // X.InterfaceC246900xP
    public final void U() {
        if (this.mStatusViewValid) {
            C500260Jjc.LJIILIIL(this.LLIZLLLIL);
            if (this.LLJIJIL.LL.size() == 0) {
                C500260Jjc.LLFFF(this.LLJ);
            }
        }
    }

    @Override // X.InterfaceC246900xP
    public final void gM() {
        if (this.mStatusViewValid) {
            C500260Jjc.LJIILIIL(this.LLIZLLLIL);
            if (this.LLJIJIL.LL.size() == 0) {
                C500260Jjc.LLFFF(this.LLJ);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostHistoryContract$AbsView
    public final void ht() {
        C766270U4b.LIZLLL(2131843537);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        T t = this.LLILLL;
        if (t != 0) {
            t.LJIIIIZZ();
        }
        this.LLILLL = null;
    }

    @Override // X.InterfaceC956210azT
    public final void Kc(Room room) {
        AbstractC963000bAQ abstractC963000bAQ;
        if (this.mStatusViewValid && (abstractC963000bAQ = (AbstractC963000bAQ) this.LLILLL) != null) {
            abstractC963000bAQ.LJIIJ(room);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostHistoryContract$AbsView
    public final void RR(Throwable th) {
        if (this.mStatusViewValid && !(th instanceof MultiCoHostViolationException)) {
            C501540Jlg.LIZJ(getContext(), th);
        }
    }

    @Override // X.InterfaceC957060b0q
    public final void hk(C955590ayT c955590ayT) {
        AbstractC963000bAQ abstractC963000bAQ;
        if (this.mStatusViewValid && (abstractC963000bAQ = (AbstractC963000bAQ) this.LLILLL) != null) {
            abstractC963000bAQ.LJIILL(c955590ayT);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostHistoryContract$AbsView
    public final void UR(int i, Object obj) {
        if (!this.mStatusViewValid) {
            return;
        }
        this.LLJIJIL.notifyItemChanged(i, obj);
    }

    @Override // X.InterfaceC956060azE
    public final void ns(C955590ayT c955590ayT, Room room) {
        AbstractC963000bAQ abstractC963000bAQ;
        if (this.mStatusViewValid && (abstractC963000bAQ = (AbstractC963000bAQ) this.LLILLL) != null) {
            abstractC963000bAQ.LJIIJJI(room);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LivingNoticeManager livingNoticeManager;
        super.onViewCreated(view, bundle);
        this.LLIZ = view.findViewById(R.id.tsc);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0bAa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        }, view);
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) view.findViewById(R.id.jpy);
        this.LLJI = runnableC781530UlD;
        if (runnableC781530UlD != null) {
            Context context = getContext();
            if (context != null) {
                livingNoticeManager = new LivingNoticeManager(context);
                livingNoticeManager.setOrientation(1);
            } else {
                livingNoticeManager = null;
            }
            runnableC781530UlD.setLayoutManager(livingNoticeManager);
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LLJI;
        if (runnableC781530UlD2 != null) {
            C15EQ c15eq = new C15EQ();
            c15eq.LLIZ = false;
            runnableC781530UlD2.setItemAnimator(c15eq);
        }
        RunnableC781530UlD runnableC781530UlD3 = this.LLJI;
        if (runnableC781530UlD3 != null) {
            runnableC781530UlD3.setAdapter(this.LLJIJIL);
        }
        RunnableC781530UlD runnableC781530UlD4 = this.LLJI;
        if (runnableC781530UlD4 != null) {
            runnableC781530UlD4.LIZLLL();
        }
        RunnableC781530UlD runnableC781530UlD5 = this.LLJI;
        if (runnableC781530UlD5 != null) {
            new C955510ayL(runnableC781530UlD5, null);
        }
        this.LLIZLLLIL = view.findViewById(R.id.jpo);
        this.LLJ = view.findViewById(R.id.jpf);
        this.LLJIJIL.LLLI(C963070bAX.class, new AbstractC960410b6F<C963070bAX, C963080bAY>() { // from class: X.0bAR
            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "CoHostHistoryDateViewBinder";
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gs7, viewGroup, false);
                return new AbstractC960400b6E<C963070bAX>(viewTd) { // from class: X.0bAY
                    public final C16F5 LLILZ;

                    @Override // X.AbstractC960400b6E
                    public final String getName() {
                        return "CoHostHistoryDateViewHolder";
                    }

                    {
                        C16F5 c16f5;
                        super(viewTd);
                        if (viewTd instanceof C16F5) {
                            c16f5 = (C16F5) viewTd;
                        } else {
                            c16f5 = null;
                        }
                        this.LLILZ = c16f5;
                    }

                    @Override // X.AbstractC960400b6E
                    public final void I5(List list, int i, Object obj) {
                        int i2;
                        String strLJIJI;
                        C963070bAX c963070bAX = (C963070bAX) obj;
                        C16F5 c16f5 = this.LLILZ;
                        if (c16f5 != null) {
                            long jLIZ = C158B.LIZ();
                            long j = c963070bAX.LJ;
                            SimpleDateFormat simpleDateFormat = C963140bAe.LIZ;
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(new Date(j));
                            int i3 = calendar.get(1);
                            calendar.setTime(new Date(jLIZ));
                            if (calendar.get(1) == i3) {
                                if (C963140bAe.LJ(c963070bAX.LJ, jLIZ)) {
                                    strLJIJI = C497740JfY.LJIJI(2131851700);
                                } else {
                                    long j2 = c963070bAX.LJ;
                                    Calendar calendar2 = Calendar.getInstance();
                                    calendar2.setTime(new Date(j2));
                                    calendar2.add(6, 1);
                                    if (C963140bAe.LJ(calendar2.getTime().getTime(), jLIZ)) {
                                        strLJIJI = C497740JfY.LJIJI(2131851701);
                                    } else {
                                        long j3 = c963070bAX.LJ;
                                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM d");
                                        simpleDateFormat2.setTimeZone(TimeZone.getDefault());
                                        strLJIJI = simpleDateFormat2.format(new Date(j3));
                                    }
                                }
                            } else {
                                long j4 = c963070bAX.LJ;
                                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("MMM d,yyyy");
                                simpleDateFormat3.setTimeZone(TimeZone.getDefault());
                                strLJIJI = simpleDateFormat3.format(new Date(j4));
                            }
                            c16f5.setText(strLJIJI);
                        }
                        C16F5 c16f52 = this.LLILZ;
                        if (c16f52 != null) {
                            if (c963070bAX.LJFF) {
                                i2 = 8;
                            } else {
                                i2 = 24;
                            }
                            C500260Jjc.LJLJL(C439101nJ.LIZ(i2), c16f52);
                        }
                    }
                };
            }
        });
        this.LLJIJIL.LLLI(C963040bAU.class, new AbstractC960410b6F<C963040bAU, C963170bAh>() { // from class: X.0bAg
            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "CoHostHistoryLoadMoreViewBinder";
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gs5, viewGroup, false);
                return new AbstractC960400b6E<C963040bAU>(viewTd) { // from class: X.0bAh
                    public final C01GW LLILZ;

                    @Override // X.AbstractC960400b6E
                    public final String getName() {
                        return "CoHostHistoryLoadMoreViewHolder";
                    }

                    @Override // X.AbstractC960400b6E
                    public final void onViewAttachedToWindow() {
                        super.onViewAttachedToWindow();
                        View view2 = (View) this.LLILZ.getValue();
                        if (view2 != null) {
                            C500260Jjc.LLFFF(view2);
                        }
                    }

                    @Override // X.AbstractC960400b6E
                    public final void onViewDetachedFromWindow() {
                        super.onViewDetachedFromWindow();
                        View view2 = (View) this.LLILZ.getValue();
                        if (view2 != null) {
                            C500260Jjc.LJIILIIL(view2);
                        }
                    }

                    {
                        super(viewTd);
                        this.LLILZ = C292401Bi.LIZ(new AwS559S0100000_15(viewTd, 913));
                    }

                    @Override // X.AbstractC960400b6E
                    public final /* bridge */ /* synthetic */ void I5(List list, int i, Object obj) {
                    }
                };
            }
        });
        this.LLJIJIL.LLLI(C963050bAV.class, new AbstractC960410b6F<C963050bAV, C963030bAT>() { // from class: X.0bAS
            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "CoHostHistoryNoMoreViewBinder";
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gs6, viewGroup, false);
                return new AbstractC960400b6E<C963050bAV>(viewTd) { // from class: X.0bAT
                    @Override // X.AbstractC960400b6E
                    public final String getName() {
                        return "CoHostHistoryNoMoreViewHolder";
                    }

                    @Override // X.AbstractC960400b6E
                    public final /* bridge */ /* synthetic */ void I5(List list, int i, Object obj) {
                    }
                };
            }
        });
        C1117360fBO c1117360fBO = this.LLJIJIL;
        final DataChannel dataChannel = this.LLILZIL;
        c1117360fBO.LLLI(C955810ayp.class, new AbstractC960410b6F<C955810ayp, C963260bAq>(this, this, this, dataChannel) { // from class: X.0bAP
            public final InterfaceC956060azE LIZIZ;
            public final InterfaceC956210azT LIZJ;
            public final InterfaceC957060b0q LIZLLL;
            public final DataChannel LJ;

            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "CoHostHistoryUserBinder";
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                C963260bAq c963260bAq = new C963260bAq(C786410Ut5.Td(layoutInflater, R.layout.gsa, viewGroup, false), this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
                C962260b9E.LIZJ.getClass();
                return c963260bAq;
            }

            {
                this.LIZIZ = this;
                this.LIZJ = this;
                this.LIZLLL = this;
                this.LJ = dataChannel;
            }
        });
        this.LLJIJIL.LLLI(C963110bAb.class, new AbstractC960410b6F<C963110bAb, C963120bAc>() { // from class: X.0bAd
            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "CoHostHistoryStartTimeViewBinder";
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new AbstractC960400b6E<C963110bAb>(C786410Ut5.Td(layoutInflater, R.layout.gs_, viewGroup, false)) { // from class: X.0bAc
                    public final C01GW LLILZ;

                    @Override // X.AbstractC960400b6E
                    public final String getName() {
                        return "CoHostHistoryStartTimeViewHolder";
                    }

                    {
                        super(view);
                        this.LLILZ = C292401Bi.LIZ(new AwS559S0100000_15(view, 914));
                    }

                    @Override // X.AbstractC960400b6E
                    public final void I5(List list, int i, Object obj) {
                        String strLJII;
                        C963110bAb c963110bAb = (C963110bAb) obj;
                        TextView textView = (TextView) this.LLILZ.getValue();
                        if (textView != null) {
                            if (c963110bAb.LJ > 0) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(C963140bAe.LJII(c963110bAb.LJI));
                                sbLIZ.append(" | ");
                                sbLIZ.append(C786410Ut5.j4(C497740JfY.LJIJI(2131851695), Arrays.copyOf(new Object[]{Integer.valueOf(c963110bAb.LJ)}, 1)));
                                strLJII = C2188811AlT.LIZIZ(sbLIZ);
                            } else if (c963110bAb.LJFF > 0) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(C963140bAe.LJII(c963110bAb.LJI));
                                sbLIZ2.append(" | ");
                                sbLIZ2.append(C786410Ut5.j4(C497740JfY.LJIJI(2131851702), Arrays.copyOf(new Object[]{Integer.valueOf(c963110bAb.LJFF)}, 1)));
                                strLJII = C2188811AlT.LIZIZ(sbLIZ2);
                            } else {
                                strLJII = C963140bAe.LJII(c963110bAb.LJI);
                            }
                            textView.setText(strLJII);
                        }
                    }
                };
            }
        });
        C1117360fBO c1117360fBO2 = this.LLJIJIL;
        final RecyclerView.RecycledViewPool recycledViewPool = this.LLILZLL;
        c1117360fBO2.LLLI(C963060bAW.class, new AbstractC960410b6F<C963060bAW, C963190bAj>(recycledViewPool) { // from class: X.0bAi
            public final RecyclerView.RecycledViewPool LIZIZ;

            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "CoHostHistoryDetailListViewBinder";
            }

            {
                this.LIZIZ = recycledViewPool;
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C963190bAj(C786410Ut5.Td(layoutInflater, R.layout.gs8, viewGroup, false), this.LIZIZ);
            }
        });
        T t = this.LLILLL;
        if (t != 0) {
            t.onCreate();
        }
        C500260Jjc.LLFFF(this.LLIZLLLIL);
        AbstractC963000bAQ abstractC963000bAQ = (AbstractC963000bAQ) this.LLILLL;
        if (abstractC963000bAQ != null) {
            abstractC963000bAQ.LJIILJJIL();
        }
        RunnableC781530UlD runnableC781530UlD6 = this.LLJI;
        if (runnableC781530UlD6 != null) {
            runnableC781530UlD6.addOnScrollListener(new AsS42S0100000_15(this, 11));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel != null) {
            dataChannel.BQ2(this, IsViewerLimitedStatusChannel.class, new AwS594S0100000_15(this, 472));
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gjs, viewGroup, false);
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

    @Override // X.InterfaceC956210azT
    public final void GP(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j) {
        if (!this.mStatusViewValid) {
            return;
        }
        C960880b70.LIZ(c955590ayT, getContext(), this.LLILZIL);
        C915980Zwa.LJI().LIZ().LLJJI(c955540ayO);
        AbstractC963000bAQ abstractC963000bAQ = (AbstractC963000bAQ) this.LLILLL;
        if (abstractC963000bAQ != null) {
            abstractC963000bAQ.LJIIIZ(c955590ayT, c955540ayO, z, j);
        }
    }

    @Override // X.InterfaceC246900xP
    public final void ez(int i, int i2, int i3, List list) {
        if (!this.mStatusViewValid) {
            return;
        }
        this.LLJIJIL.LL = list;
        int iMin = Math.min(i2, i3);
        if (iMin > 0) {
            this.LLJIJIL.notifyItemRangeChanged(i, iMin);
        }
        if (i3 > i2) {
            this.LLJIJIL.notifyItemRangeInserted(i + iMin, i3 - iMin);
        } else {
            this.LLJIJIL.notifyItemRangeRemoved(i + iMin, i2 - iMin);
        }
    }

    @Override // X.InterfaceC956060azE
    public final void ce(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j, InterfaceC958410b31 interfaceC958410b31) {
        long id;
        if (!this.mStatusViewValid) {
            return;
        }
        Function1<? super Long, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            User owner = c955590ayT.LJ.getOwner();
            if (owner != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            function1.invoke(Long.valueOf(id));
        }
        C915980Zwa.LJI().LIZ().LLJJI(c955540ayO);
        AbstractC963000bAQ abstractC963000bAQ = (AbstractC963000bAQ) this.LLILLL;
        if (abstractC963000bAQ != null) {
            abstractC963000bAQ.LJIIL(c955590ayT, c955540ayO, z, j);
        }
    }
}
