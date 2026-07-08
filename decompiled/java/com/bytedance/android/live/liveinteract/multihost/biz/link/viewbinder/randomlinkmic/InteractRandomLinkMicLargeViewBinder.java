package com.bytedance.android.live.liveinteract.multihost.biz.link.viewbinder.randomlinkmic;

import X.AbstractC21673619ry;
import X.AbstractC960400b6E;
import X.AbstractC960410b6F;
import X.AbstractC960950b77;
import X.AbstractC962390b9R;
import X.C01GW;
import X.C0JT6;
import X.C1152520g66;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C16F5;
import X.C16FS;
import X.C1935407i4;
import X.C19ME;
import X.C20441214yg;
import X.C21382118m3;
import X.C2188811AlT;
import X.C356901a3;
import X.C419910GdJ;
import X.C439101nJ;
import X.C454590Hs9;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C943970afj;
import X.C949960apO;
import X.C950220apo;
import X.C955400ayA;
import X.C960270b61;
import X.C961820b8W;
import X.C962250b9D;
import X.C962320b9K;
import X.C962400b9S;
import X.C962420b9U;
import X.C962830bA9;
import X.InterfaceC1104970erP;
import X.InterfaceC21676519sR;
import X.InterfaceC962020b8q;
import X.RunnableC962410b9T;
import Y.ARunnableS115S0100000_15;
import Y.AsS42S0100000_15;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.LivingNoticeManager;
import com.bytedance.android.live.liveinteract.multihost.biz.link.viewbinder.randomlinkmic.InteractRandomLinkMicLargeViewBinder;
import com.bytedance.android.livesdk.chatroom.interact.model.QuickCohostContent;
import com.bytedance.android.livesdk.chatroom.interact.model.QuickCohostContentInfo;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS696S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class InteractRandomLinkMicLargeViewBinder extends AbstractC960410b6F<C961820b8W, InteractRandomLinkMicLargeViewHolder> {
    public final InterfaceC962020b8q LIZIZ;
    public final LifecycleOwner LIZJ;
    public final DataChannel LIZLLL;
    public final AbstractC960950b77 LJ;

    public static final class InteractRandomLinkMicLargeViewHolder extends AbstractC962390b9R<C961820b8W> implements InterfaceC21676519sR, DefaultLifecycleObserver, GenericLifecycleObserver {
        public static final /* synthetic */ int LLLILZ = 0;
        public final DataChannel LLJJLIIIJLLLLLLLZ;
        public final C01GW LLJL;
        public final C01GW LLJLIL;
        public final C01GW LLJLILLLLZIIL;
        public final C01GW LLJLL;
        public final C01GW LLJLLIL;
        public final C01GW LLJLLL;
        public final C01GW LLJZ;
        public final C01GW LLJZIJLIL;
        public final C01GW LLL;
        public final C01GW LLLF;
        public final C01GW LLLFF;
        public final C01GW LLLFFI;
        public final C01GW LLLFZ;
        public final C01GW LLLI;
        public final C01GW LLLII;
        public final C01GW LLLIIII;
        public final C01GW LLLIIIIL;
        public final C01GW LLLIIIL;
        public C962830bA9 LLLIIL;
        public int LLLIILIL;
        public RunnableC962410b9T LLLIL;

        @Override // X.AbstractC960400b6E
        public final String getName() {
            return "InteractRandomLinkMicLargeViewHolder";
        }

        @Override // X.InterfaceC21676519sR
        public final void m3(View view) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public final View h6() {
            return (View) this.LLJLILLLLZIIL.getValue();
        }

        public final RecyclerView i6() {
            return (RecyclerView) this.LLJL.getValue();
        }

        @Override // X.AbstractC962390b9R, X.AbstractC960400b6E
        public final void LLIILZL() {
            super.LLIILZL();
            C16F5 c16f5X1 = x1();
            if (c16f5X1 != null) {
                RunnableC962410b9T runnableC962410b9T = this.LLLIL;
                if (runnableC962410b9T != null) {
                    HandlerHook.viewRemoveCallbacks(c16f5X1, runnableC962410b9T);
                }
                this.LLLIL = null;
            }
            RecyclerView recyclerViewI6 = i6();
            if (recyclerViewI6 != null) {
                recyclerViewI6.removeOnChildAttachStateChangeListener(this);
            }
        }

        public final void r6() {
            LinearLayoutManager linearLayoutManager;
            AbstractC21673619ry adapter;
            RecyclerView recyclerViewI6 = i6();
            RecyclerView.LayoutManager layoutManager = recyclerViewI6 != null ? recyclerViewI6.getLayoutManager() : null;
            if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
                return;
            }
            if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
                C500260Jjc.LJIILIIL((View) this.LLJLIL.getValue());
            } else {
                View viewH6 = h6();
                if (C454590Hs9.LIZ(viewH6 != null ? viewH6.getContext() : null)) {
                    View view = (View) this.LLJLIL.getValue();
                    if (view != null) {
                        view.setBackgroundResource(R.drawable.e58);
                    }
                } else {
                    View view2 = (View) this.LLJLIL.getValue();
                    if (view2 != null) {
                        view2.setBackgroundResource(R.drawable.e57);
                    }
                }
                C500260Jjc.LLFFF((View) this.LLJLIL.getValue());
            }
            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            RecyclerView recyclerViewI62 = i6();
            if (iFindLastCompletelyVisibleItemPosition == ((recyclerViewI62 == null || (adapter = recyclerViewI62.getAdapter()) == null) ? 0 : adapter.getItemCount()) - 1) {
                C500260Jjc.LJIILIIL(h6());
                return;
            }
            View viewH62 = h6();
            if (C454590Hs9.LIZ(viewH62 != null ? viewH62.getContext() : null)) {
                View viewH63 = h6();
                if (viewH63 != null) {
                    viewH63.setBackgroundResource(R.drawable.e57);
                }
            } else {
                View viewH64 = h6();
                if (viewH64 != null) {
                    viewH64.setBackgroundResource(R.drawable.e58);
                }
            }
            C500260Jjc.LLFFF(h6());
        }

        @Override // X.InterfaceC956600b06
        public final DataChannel getDataChannel() {
            return this.LLJJLIIIJLLLLLLLZ;
        }

        @Override // X.AbstractC962390b9R
        public final void b6(C961820b8W c961820b8W) {
            List<QuickCohostContent> list;
            double dDoubleValue;
            QuickCohostContentInfo quickCohostContentInfo = c961820b8W.LJ.quickCohostContentInfo;
            if (quickCohostContentInfo == null || (list = quickCohostContentInfo.quickCohostContent) == null) {
                list = C13BV.INSTANCE;
            }
            if (!C960270b61.LIZ().isEmpty()) {
                N5(list, true);
            } else {
                Integer numValueOf = null;
                if (C962420b9U.LIZ()) {
                    if (C500260Jjc.LJJJJIZL(W5())) {
                        return;
                    }
                    C500260Jjc.LJIILIIL(T5());
                    C500260Jjc.LJIILIIL(V5());
                    View viewW5 = W5();
                    if (viewW5 != null) {
                        numValueOf = Integer.valueOf(viewW5.getVisibility());
                    }
                    if (C949960apO.LIZ()) {
                        C500260Jjc.LJIILLIIL((View) this.LLJJI.getValue());
                        C500260Jjc.LJIILLIIL(W5());
                    } else {
                        C0JT6<Double> c0jt6 = InterfaceC1104970erP.E2;
                        Double dLIZ = c0jt6.LIZ();
                        if (dLIZ != null) {
                            dDoubleValue = dLIZ.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        c0jt6.LIZJ(Double.valueOf(Math.min(dDoubleValue + ((double) 1), 3.0d)));
                        C500260Jjc.LLFFF((View) this.LLJJI.getValue());
                        C500260Jjc.LLFFF(W5());
                    }
                    if (numValueOf != null && numValueOf.intValue() == 4) {
                        return;
                    }
                    View view = (View) this.LLJLL.getValue();
                    if (view != null) {
                        C786410Ut5.I7(new AbS696S0100000_15(new C962400b9S(false, this, list, true, "normal_tag"), 7), view);
                    }
                    ImageView imageView = (ImageView) this.LLJLLIL.getValue();
                    if (imageView != null) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZIZ = C439101nJ.LIZ(16);
                        c419910GdJ.LIZJ = C439101nJ.LIZ(16);
                        c419910GdJ.LIZ = R.raw.icon_chevron_right_ltr;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.ezt);
                        imageView.setImageDrawable(c419910GdJ.LIZ(this.itemView.getContext()));
                    }
                    if (this.LLLIIL == null) {
                        C962830bA9 c962830bA9 = new C962830bA9();
                        this.LLLIIL = c962830bA9;
                        RecyclerView recyclerViewI6 = i6();
                        LivingNoticeManager livingNoticeManager = new LivingNoticeManager(this.itemView.getContext());
                        livingNoticeManager.setOrientation(0);
                        c962830bA9.LIZJ(recyclerViewI6, livingNoticeManager, 0, 6, true);
                        RecyclerView recyclerViewI62 = i6();
                        if (recyclerViewI62 != null) {
                            recyclerViewI62.addOnScrollListener(new AsS42S0100000_15(this, 3));
                        }
                    }
                    C962830bA9 c962830bA92 = this.LLLIIL;
                    if (c962830bA92 != null) {
                        c962830bA92.LIZ(C13LP.LL(list, 3));
                    }
                    this.LLLIILIL = 0;
                    RecyclerView recyclerViewI63 = i6();
                    if (recyclerViewI63 != null) {
                        recyclerViewI63.removeOnChildAttachStateChangeListener(this);
                    }
                    RecyclerView recyclerViewI64 = i6();
                    if (recyclerViewI64 != null) {
                        recyclerViewI64.addOnChildAttachStateChangeListener(this);
                    }
                } else {
                    if (C500260Jjc.LJJJJIZL(V5())) {
                        return;
                    }
                    C500260Jjc.LJIILIIL((View) this.LLJJI.getValue());
                    C500260Jjc.LJIILIIL(W5());
                    C500260Jjc.LJIILIIL(T5());
                    View viewV5 = V5();
                    if (viewV5 != null) {
                        numValueOf = Integer.valueOf(viewV5.getVisibility());
                    }
                    if (C949960apO.LIZ()) {
                        C500260Jjc.LJIILLIIL(V5());
                    } else {
                        C500260Jjc.LLFFF(V5());
                    }
                    if (numValueOf != null && numValueOf.intValue() == 4) {
                        return;
                    }
                    ImageView imageView2 = (ImageView) this.LLJJJIL.getValue();
                    if (imageView2 != null) {
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZIZ = C439101nJ.LIZ(12);
                        c419910GdJ2.LIZJ = C439101nJ.LIZ(12);
                        c419910GdJ2.LIZ = R.raw.icon_chevron_right_ltr;
                        c419910GdJ2.LJ = Integer.valueOf(R.attr.ezs);
                        imageView2.setImageDrawable(c419910GdJ2.LIZ(this.itemView.getContext()));
                    }
                    View viewV52 = V5();
                    if (viewV52 != null) {
                        C786410Ut5.I7(new AbS696S0100000_15(new C962400b9S(false, this, list, true, "simplified_tag"), 8), viewV52);
                    }
                }
            }
            this.LLILZ.getLifecycle().removeObserver(this);
            this.LLILZ.getLifecycle().addObserver(this);
        }

        @Override // X.InterfaceC21676519sR
        public final void g5(View view) {
            int itemCount;
            AbstractC21673619ry adapter;
            int i = this.LLLIILIL + 1;
            this.LLLIILIL = i;
            RecyclerView recyclerViewI6 = i6();
            if (recyclerViewI6 != null && (adapter = recyclerViewI6.getAdapter()) != null) {
                itemCount = adapter.getItemCount();
            } else {
                itemCount = 0;
            }
            if (i == itemCount) {
                RecyclerView recyclerViewI62 = i6();
                if (recyclerViewI62 != null) {
                    recyclerViewI62.removeOnChildAttachStateChangeListener(this);
                }
                RecyclerView recyclerViewI63 = i6();
                if (recyclerViewI63 != null) {
                    C950220apo.LJIJJLI(recyclerViewI63, new ARunnableS115S0100000_15(this, 69), false);
                }
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            String str;
            C356901a3.LIZIZ(this, lifecycleOwner);
            C962830bA9 c962830bA9 = this.LLLIIL;
            if (c962830bA9 != null && c962830bA9.LIZLLL) {
                C960270b61.LIZIZ("inviteList_dismiss", c962830bA9.LIZIZ());
            }
            if (this.LLJJL) {
                str = "edit";
            } else if (this.LLJJJJLIIL) {
                str = "more";
            } else {
                str = "quit";
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(C960270b61.LIZ(), null, null, null, 0, null, AFwS229S0000000_2.get$arr$(50), 31);
            C955400ayA c955400ayA = C955400ayA.LIZ;
            C955400ayA.LLIIL("quick_invite_card", str, "big_card", this.LLJJJJ, this.LLJJJJJIL, strLJJLIIIJ, !Intrinsics.LJFF(r13, strLJJLIIIJ), Boolean.valueOf(C500260Jjc.LJJJJIZL(W5())));
        }

        public static void d6(C16FS c16fs, boolean z) {
            boolean z2 = true;
            boolean zLJIJ = C950220apo.LJIJ(C915980Zwa.LJII().LLILZLL(true).size(), 0);
            if (!z || zLJIJ) {
                z2 = false;
            }
            c16fs.setEnabled(z2);
            c16fs.refreshDrawableState();
            c16fs.invalidate();
        }

        public final void e6(int i, boolean z) {
            C19ME c19me;
            View viewFindViewById = this.itemView.findViewById(R.id.dy5);
            if (viewFindViewById == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                if (z) {
                    c19me.endToStart = -1;
                    c19me.endToEnd = 0;
                    c19me.setMarginEnd(i + C439101nJ.LIZ(16));
                } else {
                    c19me.endToEnd = -1;
                    c19me.endToStart = R.id.bti;
                    c19me.setMarginEnd(C439101nJ.LIZ(8));
                }
                C786410Ut5.W5(viewFindViewById, c19me);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:116:0x02cd  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0322  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x021c  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0242  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x025a  */
        @Override // X.AbstractC960400b6E
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void I5(java.util.List r16, int r17, java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 821
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.viewbinder.randomlinkmic.InteractRandomLinkMicLargeViewBinder.InteractRandomLinkMicLargeViewHolder.I5(java.util.List, int, java.lang.Object):void");
        }

        public final int q6(TextView textView, int i, int i2) {
            int measuredWidth;
            int measuredWidth2;
            int iIntValue;
            View view;
            View viewFindViewById = this.itemView.findViewById(R.id.dy5);
            Integer[] numArr = new Integer[5];
            if (viewFindViewById != null) {
                measuredWidth = viewFindViewById.getMeasuredWidth();
            } else {
                measuredWidth = 0;
            }
            numArr[0] = Integer.valueOf(measuredWidth);
            numArr[1] = Integer.valueOf(this.itemView.getMeasuredWidth());
            Object parent = textView.getParent();
            Object obj = null;
            if ((parent instanceof View) && (view = (View) parent) != null) {
                measuredWidth2 = view.getMeasuredWidth();
            } else {
                measuredWidth2 = 0;
            }
            numArr[2] = Integer.valueOf(measuredWidth2);
            numArr[3] = Integer.valueOf(textView.getMeasuredWidth());
            numArr[4] = Integer.valueOf(textView.getRootView().getMeasuredWidth());
            Iterator it2 = C13LQ.LJIIJJI(numArr).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((Number) next).intValue() > 0) {
                    obj = next;
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 10000;
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iIntValue, Integer.MIN_VALUE);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            textView.setTextSize(i2, i);
            textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredHeight = textView.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                return measuredHeight;
            }
            if (layoutParams.height != measuredHeight) {
                layoutParams.height = measuredHeight;
                C786410Ut5.g6(textView, layoutParams);
            }
            textView.setMinHeight(measuredHeight);
            return measuredHeight;
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [X.0b9T, java.lang.Runnable] */
        public final void f6(final C16F5 c16f5, final int i, final int i2, final int i3) {
            int measuredWidth;
            RunnableC962410b9T runnableC962410b9T = this.LLLIL;
            if (runnableC962410b9T != null) {
                HandlerHook.viewRemoveCallbacks(c16f5, runnableC962410b9T);
            }
            this.LLLIL = null;
            boolean z = false;
            try {
                C21382118m3.LIZJ(c16f5, 0);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("InteractRandomLinkMicLargeViewHolder", "applyTitleAutoSize: disable autosize failed", e);
            }
            c16f5.setTextSize(i3, i2);
            int iQ6 = q6(c16f5, i2, i3);
            View viewFindViewById = this.itemView.findViewById(R.id.dy5);
            if (viewFindViewById != null) {
                measuredWidth = viewFindViewById.getMeasuredWidth();
            } else {
                measuredWidth = 0;
            }
            if (measuredWidth > 0) {
                z = true;
            }
            boolean z2 = !z;
            try {
                C21382118m3.LIZIZ(c16f5, i, i2, 1, i3);
            } catch (IllegalArgumentException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C20441214yg.LJFF("InteractRandomLinkMicLargeViewHolder", "applyTitleAutoSize: uniform autosize config failed", e2);
            }
            if (z2) {
                ?? r5 = new Runnable() { // from class: X.0b9T
                    public final void LIZ() {
                        this.LL.LLLIL = null;
                        if (c16f5.isAttachedToWindow()) {
                            InteractRandomLinkMicLargeViewBinder.InteractRandomLinkMicLargeViewHolder interactRandomLinkMicLargeViewHolder = this.LL;
                            TextView textView = c16f5;
                            interactRandomLinkMicLargeViewHolder.getClass();
                            try {
                                C21382118m3.LIZJ(textView, 0);
                            } catch (IllegalArgumentException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                C20441214yg.LJFF("InteractRandomLinkMicLargeViewHolder", "applyTitleAutoSize: disable autosize failed", e3);
                            }
                            c16f5.setTextSize(i3, i2);
                            this.LL.q6(c16f5, i2, i3);
                            InteractRandomLinkMicLargeViewBinder.InteractRandomLinkMicLargeViewHolder interactRandomLinkMicLargeViewHolder2 = this.LL;
                            TextView textView2 = c16f5;
                            int i4 = i;
                            int i5 = i2;
                            int i6 = i3;
                            interactRandomLinkMicLargeViewHolder2.getClass();
                            try {
                                C21382118m3.LIZIZ(textView2, i4, i5, 1, i6);
                            } catch (IllegalArgumentException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                C20441214yg.LJFF("InteractRandomLinkMicLargeViewHolder", "applyTitleAutoSize: uniform autosize config failed", e4);
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("InteractRandomLinkMicLargeViewBinder$InteractRandomLinkMicLargeViewHolder@752b.applyTitleAutoSize$deferredRunnable$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("InteractRandomLinkMicLargeViewBinder$InteractRandomLinkMicLargeViewHolder@752b.applyTitleAutoSize$deferredRunnable$1");
                    }
                };
                this.LLLIL = r5;
                HandlerHook.viewPost(c16f5, r5);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applyTitleAutoSize: pinned quick-invite title height=");
            sbLIZ.append(iQ6);
            sbLIZ.append("px at maxSize=");
            sbLIZ.append(i2);
            sbLIZ.append(" maxLines=");
            sbLIZ.append(c16f5.getMaxLines());
            sbLIZ.append(" deferredUntilLayout=");
            sbLIZ.append(z2);
            C20441214yg.LIZIZ("InteractRandomLinkMicLargeViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        }

        public InteractRandomLinkMicLargeViewHolder(View view, InterfaceC962020b8q interfaceC962020b8q, LifecycleOwner lifecycleOwner, DataChannel dataChannel, AbstractC960950b77 abstractC960950b77) {
            super(view, lifecycleOwner, abstractC960950b77);
            this.LLJJLIIIJLLLLLLLZ = dataChannel;
            this.LLJL = C1935407i4.LIZ(new AwS559S0100000_15(view, 491));
            this.LLJLIL = C1935407i4.LIZ(new AwS559S0100000_15(view, 492));
            this.LLJLILLLLZIIL = C1935407i4.LIZ(new AwS559S0100000_15(view, 490));
            this.LLJLL = C1935407i4.LIZ(new AwS559S0100000_15(view, 489));
            this.LLJLLIL = C1935407i4.LIZ(new AwS559S0100000_15(view, 488));
            this.LLJLLL = C1935407i4.LIZ(new AwS559S0100000_15(view, 495));
            this.LLJZ = C1935407i4.LIZ(new AwS559S0100000_15(view, 496));
            this.LLJZIJLIL = C1935407i4.LIZ(new AwS559S0100000_15(view, 482));
            this.LLL = C1935407i4.LIZ(new AwS559S0100000_15(view, 499));
            this.LLLF = C1935407i4.LIZ(new AwS559S0100000_15(view, 484));
            this.LLLFF = C1935407i4.LIZ(new AwS559S0100000_15(view, 497));
            this.LLLFFI = C1935407i4.LIZ(new AwS559S0100000_15(view, 498));
            this.LLLFZ = C1935407i4.LIZ(new AwS559S0100000_15(view, 485));
            this.LLLI = C1935407i4.LIZ(new AwS559S0100000_15(view, 486));
            this.LLLII = C1935407i4.LIZ(new AwS559S0100000_15(view, 487));
            this.LLLIIII = C1935407i4.LIZ(new AwS559S0100000_15(view, 493));
            this.LLLIIIIL = C1935407i4.LIZ(new AwS559S0100000_15(view, 494));
            this.LLLIIIL = C1935407i4.LIZ(new AwS559S0100000_15(view, 483));
        }
    }

    @Override // X.AbstractC960410b6F
    public final String LJIIIZ() {
        return "InteractRandomLinkMicLargeViewBinder";
    }

    @Override // X.AbstractC960410b6F
    public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        View viewLIZIZ = C943970afj.LIZIZ(layoutInflater, viewGroup.getContext(), C962250b9D.LJ(), viewGroup);
        InteractRandomLinkMicLargeViewHolder interactRandomLinkMicLargeViewHolder = new InteractRandomLinkMicLargeViewHolder(viewLIZIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
        C962320b9K.LIZ.getClass();
        C962320b9K.LIZIZ(interactRandomLinkMicLargeViewHolder);
        if (C1152520g66.LIZ()) {
            i = R.drawable.e5f;
        } else {
            i = R.drawable.e5e;
        }
        viewLIZIZ.setBackgroundResource(i);
        return interactRandomLinkMicLargeViewHolder;
    }

    public InteractRandomLinkMicLargeViewBinder(InterfaceC962020b8q interfaceC962020b8q, LifecycleOwner lifecycleOwner, DataChannel dataChannel, AbstractC960950b77 abstractC960950b77) {
        this.LIZIZ = interfaceC962020b8q;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = dataChannel;
        this.LJ = abstractC960950b77;
    }
}
