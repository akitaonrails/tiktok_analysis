package com.bytedance.android.live.publicscreen.impl.caption.translate;

import X.AbstractC327690Csx;
import X.C03AV;
import X.C0CVI;
import X.C0DTA;
import X.C1697810uHb;
import X.C16F5;
import X.C327620Csq;
import X.C327710Csz;
import X.C346570DiJ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptionTranslateWidget extends CaptionTextWidgetV2 {
    @Override // com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2
    public final C03AV B1(C0CVI c0cvi) {
        C327710Csz c327710Csz = new C327710Csz(c0cvi, this, new C346570DiJ(this, 0));
        this.LLJLLIL = c327710Csz;
        return c327710Csz;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2
    public final C327620Csq C1(C0CVI c0cvi) {
        C16F5 c16f5 = this.LLJILJIL;
        if (c16f5 != null) {
            return new C327620Csq(c0cvi, c16f5.getPaint(), 20, CaptionTextWidgetV2.LLLFFI, new AwS583S0100000_4(this, 32), new AwS405S0200000_4(this, c0cvi, 6), this);
        }
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2
    public final CaptionViewModelV2 D1(C327620Csq c327620Csq) {
        return new CaptionViewModelV2(this.dataChannel, this.LLLF, this, c327620Csq, new AwS583S0100000_4(this, 33));
    }

    @Override // com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2
    public final AbstractC327690Csx E1(final C0DTA c0dta, final C03AV c03av, final C0CVI c0cvi, C327620Csq c327620Csq) {
        final AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(this, 440);
        final AwS618S0100000_4 awS618S0100000_4 = new AwS618S0100000_4(this, 60);
        final List listLJIIJJI = C1697810uHb.LJIIJJI(this.LLJZ, this.LLJLLL);
        AbstractC327690Csx abstractC327690Csx = new AbstractC327690Csx(c0dta, c03av, awS548S0100000_4, awS618S0100000_4, listLJIIJJI, c0cvi) { // from class: X.0CtF
            public final RecyclerView LJFF;
            public final C03AV LJI;
            public final Function0<Unit> LJII;
            public final Function2<? super Long, ? super Long, Unit> LJIIIIZZ;
            public final List<? extends AbstractC315550CYn> LJIIIZ;

            @Override // X.AbstractC327690Csx
            public final void LIZIZ(List<C327610Csp> list) {
                long j;
                LJFF();
                if (LIZ(list)) {
                    Function0<Unit> function0 = this.LJII;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list;
                    if (copyOnWriteArrayList.size() > 2) {
                        C327610Csp c327610Csp = (C327610Csp) ListProtector.get(copyOnWriteArrayList, copyOnWriteArrayList.size() - 3);
                        Function2<? super Long, ? super Long, Unit> function2 = this.LJIIIIZZ;
                        if (function2 != null) {
                            Long lValueOf = Long.valueOf(c327610Csp.LIZIZ);
                            C327630Csr c327630Csr = (C327630Csr) C13LP.LJJLIIIJL(c327610Csp.LJIIIZ);
                            if (c327630Csr != null) {
                                j = c327630Csr.LLILZIL;
                            } else {
                                j = 0;
                            }
                            function2.invoke(lValueOf, Long.valueOf(j));
                        }
                    }
                    C03AV c03av2 = this.LJI;
                    if (c03av2 != null) {
                        c03av2.LL = copyOnWriteArrayList;
                        c03av2.notifyItemInserted(c03av2.getItemCount());
                        c03av2.notifyItemChanged(c03av2.getItemCount());
                        RecyclerView recyclerView = this.LJFF;
                        if (recyclerView != null) {
                            recyclerView.smoothScrollToPosition(c03av2.getItemCount());
                        }
                    }
                }
            }

            @Override // X.AbstractC327690Csx
            public final void LIZLLL(List list) {
                throw new UnsupportedOperationException("TranslateRecyclerViewIDataChangeListener notifyLineRangeChange");
            }

            @Override // X.AbstractC327690Csx
            public final void LJ(List<C327610Csp> list) {
                List<C327610Csp> list2;
                Function0<Unit> function0;
                C03AV c03av2 = this.LJI;
                if (c03av2 != null) {
                    if (list != null) {
                        LJFF();
                        list2 = list;
                    } else {
                        list2 = c03av2.LL;
                    }
                    if (LIZ(list2)) {
                        if (list != null && (function0 = this.LJII) != null) {
                            function0.invoke();
                        }
                        c03av2.LL = list2;
                        c03av2.notifyDataSetChanged();
                        RecyclerView recyclerView = this.LJFF;
                        if (recyclerView != null) {
                            recyclerView.smoothScrollToPosition(c03av2.getItemCount());
                        }
                    }
                }
            }

            @Override // X.AbstractC327690Csx
            public final void LIZJ(int i, List list) {
                LJFF();
                if (LIZ(list)) {
                    Function0<Unit> function0 = this.LJII;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    C03AV c03av2 = this.LJI;
                    if (c03av2 != null) {
                        c03av2.notifyItemChanged(i);
                    }
                }
            }

            @Override // X.AbstractC327690Csx
            public final void LJI(int i, boolean z, List list) {
                C03AV c03av2;
                if (i <= list.size() && i >= 0 && (c03av2 = this.LJI) != null) {
                    if (LIZ(list) || z) {
                        for (int i2 = 0; i2 < i; i2++) {
                            ListProtector.remove(list, 0);
                        }
                        c03av2.LL = list;
                        c03av2.notifyItemRangeRemoved(0, i);
                        c03av2.notifyItemRangeChanged(0, i);
                    }
                }
            }

            {
                super(awS548S0100000_4, awS618S0100000_4, listLJIIJJI, c0cvi);
                this.LJFF = c0dta;
                this.LJI = c03av;
                this.LJII = awS548S0100000_4;
                this.LJIIIIZZ = awS618S0100000_4;
                this.LJIIIZ = listLJIIJJI;
            }
        };
        c327620Csq.LJIIJ(abstractC327690Csx);
        return abstractC327690Csx;
    }
}
