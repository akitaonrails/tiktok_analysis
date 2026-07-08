package com.bytedance.android.live.publicscreen.impl.caption.split;

import X.AbstractC327690Csx;
import X.C03AV;
import X.C0CVI;
import X.C0DTA;
import X.C1697810uHb;
import X.C16F5;
import X.C327570Csl;
import X.C327620Csq;
import X.C327920CtK;
import X.C346580DiK;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2;
import com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionViewModelV2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptionSplitWidget extends CaptionTextWidgetV2 {
    @Override // com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2
    public final C03AV B1(final C0CVI c0cvi) {
        final C346580DiK c346580DiK = new C346580DiK(this, 0);
        final AwS618S0100000_4 awS618S0100000_4 = new AwS618S0100000_4(this, 5);
        return new C03AV(c0cvi, c346580DiK, awS618S0100000_4) { // from class: X.0Ct0
            public final C0CVI LLILLJJLI;
            public final InterfaceC1685420txc<Long, Long, Long, Long, Map<String, String>, Unit> LLILLL;
            public final Function2<Long, Long, Unit> LLILZ;

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                CharSequence text;
                int size;
                C327630Csr c327630Csr;
                long jLongValue;
                long jLongValue2;
                long jLongValue3;
                TextView textView;
                List<Long> list;
                C03AW c03aw = (C03AW) viewHolder;
                long jLIZ = this.LLILLJJLI.LIZ();
                C327610Csp c327610Csp = (C327610Csp) ListProtector.get(this.LL, i);
                Iterator<C327630Csr> it2 = c327610Csp.LJIIIZ.iterator();
                while (it2.hasNext()) {
                    C327630Csr c327630Csr2 = it2.next().LLJJ;
                    if (c327630Csr2 != null && (list = c327630Csr2.LLJILLL) != null) {
                        ((ArrayList) list).add(Long.valueOf(jLIZ));
                    }
                }
                StringBuilder sb = new StringBuilder(c327610Csp.LIZIZ());
                TextView textView2 = c03aw.LL;
                if (textView2 != null) {
                    text = textView2.getText();
                } else {
                    text = null;
                }
                if (!Intrinsics.LJFF(text, sb) && (textView = c03aw.LL) != null) {
                    textView.setText(sb);
                }
                List<C327610Csp> list2 = this.LL;
                if (!list2.isEmpty() && !((C327610Csp) C13LP.LJJLIIIJJI(list2)).LJIIIZ.isEmpty()) {
                    int size2 = list2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i2 = size2 - 1;
                            if (list2.size() - size2 > 2) {
                                break;
                            }
                            C327610Csp c327610Csp2 = (C327610Csp) ListProtector.get(list2, size2);
                            int size3 = c327610Csp2.LJIIIZ.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i3 = size3 - 1;
                                    C327630Csr c327630Csr3 = (C327630Csr) ListProtector.get(c327610Csp2.LJIIIZ, size3);
                                    C327630Csr c327630Csr4 = c327630Csr3.LLJJ;
                                    if (c327630Csr4 != null && c327630Csr3.LLILZ && !c327630Csr4.LLJILJIL) {
                                        InterfaceC1685420txc<Long, Long, Long, Long, Map<String, String>, Unit> interfaceC1685420txc = this.LLILLL;
                                        Long lValueOf = Long.valueOf(c327630Csr4.LLIZ);
                                        Long lValueOf2 = Long.valueOf(c327630Csr4.LLILZLL);
                                        Long l = (Long) C13LP.LJJJLL(c327630Csr4.LLJILLL);
                                        if (l != null) {
                                            jLongValue2 = l.longValue();
                                        } else {
                                            jLongValue2 = 0;
                                        }
                                        Long lValueOf3 = Long.valueOf(jLongValue2);
                                        Long lValueOf4 = Long.valueOf(c327630Csr4.LLILZIL);
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        Long l2 = (Long) C13LP.LJJLIIIJL(c327630Csr4.LLJILLL);
                                        if (l2 != null) {
                                            jLongValue3 = l2.longValue();
                                        } else {
                                            jLongValue3 = 0;
                                        }
                                        linkedHashMap.put("caption_end_time", String.valueOf(jLongValue3));
                                        interfaceC1685420txc.invoke(lValueOf, lValueOf2, lValueOf3, lValueOf4, linkedHashMap);
                                        c327630Csr4.LLJILJIL = true;
                                    }
                                    if (i3 < 0) {
                                        break;
                                    } else {
                                        size3 = i3;
                                    }
                                }
                            }
                            if (i2 < 0) {
                                break;
                            } else {
                                size2 = i2;
                            }
                        }
                    }
                    if (list2.size() >= 3 && (size = list2.size() - 3) >= 0) {
                        int i4 = 0;
                        while (true) {
                            C327610Csp c327610Csp3 = (C327610Csp) ListProtector.get(list2, i4);
                            int size4 = c327610Csp3.LJIIIZ.size();
                            for (int i5 = 0; i5 < size4; i5++) {
                                C327630Csr c327630Csr5 = (C327630Csr) ListProtector.get(c327610Csp3.LJIIIZ, i5);
                                if (c327630Csr5.LLILZ && (c327630Csr = c327630Csr5.LLJJ) != null && !c327630Csr.LLJILJILJ) {
                                    Function2<Long, Long, Unit> function2 = this.LLILZ;
                                    Long l3 = (Long) C13LP.LJJJLL(c327630Csr.LLJILLL);
                                    if (l3 != null) {
                                        jLongValue = l3.longValue();
                                    } else {
                                        jLongValue = 0;
                                    }
                                    function2.invoke(Long.valueOf(jLIZ - jLongValue), Long.valueOf(c327630Csr.LLILZIL));
                                    c327630Csr.LLJILJILJ = true;
                                }
                            }
                            if (i4 != size) {
                                i4++;
                            } else {
                                return;
                            }
                        }
                    }
                }
            }

            {
                this.LLILLJJLI = c0cvi;
                this.LLILLL = c346580DiK;
                this.LLILZ = awS618S0100000_4;
            }
        };
    }

    @Override // com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2
    public final C327620Csq C1(C0CVI c0cvi) {
        C16F5 c16f5 = this.LLJILJIL;
        if (c16f5 != null) {
            return new C327570Csl(c0cvi, c16f5.getPaint(), CaptionTextWidgetV2.LLLFFI, new AwS583S0100000_4(this, 29), new AwS405S0200000_4(this, c0cvi, 5), this);
        }
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2
    public final CaptionViewModelV2 D1(C327620Csq c327620Csq) {
        return new C327920CtK(this.dataChannel, this.LLLF, this, c327620Csq, new AwS583S0100000_4(this, 30), new AwS583S0100000_4(this, 31));
    }

    @Override // com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2
    public final AbstractC327690Csx E1(final C0DTA c0dta, final C03AV c03av, final C0CVI c0cvi, C327620Csq c327620Csq) {
        final AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(this, 426);
        final AwS618S0100000_4 awS618S0100000_4 = new AwS618S0100000_4(this, 57);
        final List listLJIIJJI = C1697810uHb.LJIIJJI(this.LLJZ, this.LLJLLL);
        AbstractC327690Csx abstractC327690Csx = new AbstractC327690Csx(c0dta, c03av, awS548S0100000_4, awS618S0100000_4, listLJIIJJI, c0cvi) { // from class: X.0CtG
            public final RecyclerView LJFF;
            public final C03AV LJI;
            public final Function0<Unit> LJII;

            @Override // X.AbstractC327690Csx
            public final void LIZIZ(List<C327610Csp> list) {
                throw new UnsupportedOperationException("SplitRecyclerViewIDataChangeListener notifyLastLineInsert");
            }

            @Override // X.AbstractC327690Csx
            public final void LIZLLL(List list) {
                boolean z;
                RecyclerView recyclerView;
                if (!list.isEmpty()) {
                    LJFF();
                }
                C03AV c03av2 = this.LJI;
                if (c03av2 != null && LIZ(list)) {
                    Function0<Unit> function0 = this.LJII;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    int i = 0;
                    if (c03av2.LL.size() > list.size()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c03av2.LL = list;
                    if (z && (recyclerView = this.LJFF) != null) {
                        int itemCount = c03av2.getItemCount() - 1;
                        if (itemCount >= 0) {
                            i = itemCount;
                        }
                        recyclerView.scrollToPosition(i);
                    }
                    c03av2.notifyDataSetChanged();
                    RecyclerView recyclerView2 = this.LJFF;
                    if (recyclerView2 != null) {
                        recyclerView2.smoothScrollToPosition(c03av2.getItemCount());
                    }
                }
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
                throw new UnsupportedOperationException("SplitRecyclerViewIDataChangeListener notifyLineChange");
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
            }
        };
        c327620Csq.LJIIJ(abstractC327690Csx);
        return abstractC327690Csx;
    }
}
