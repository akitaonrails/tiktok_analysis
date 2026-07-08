package X;

import Y.ARunnableS17S0201000_10;
import Y.ARunnableS29S0110000_10;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C652600Pik implements InterfaceC648720PcU {
    public boolean LIZ;
    public InterfaceC653000PjO LIZIZ;
    public RecyclerView LIZLLL;
    public InterfaceC648350Pbt LJ;
    public boolean LJFF;
    public boolean LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public C588600N6s LJIIIZ;
    public C664400Q4g LJIIJ;
    public InterfaceC652640Pio LJIIL;
    public int LIZJ = -1;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1293));

    @Override // X.InterfaceC648720PcU
    public final void LIZ() {
    }

    @Override // X.InterfaceC648720PcU
    public final void LIZJ() {
    }

    @Override // X.InterfaceC648720PcU
    public final void LJ() {
        this.LJFF = true;
        InterfaceC648350Pbt interfaceC648350Pbt = this.LJ;
        if (interfaceC648350Pbt != null) {
            interfaceC648350Pbt.W0(150L, null);
        } else {
            if (!this.LIZ) {
                this.LJI = true;
                return;
            }
            this.LJI = false;
            this.LJII = 0L;
            LJIIIIZZ();
        }
    }

    public final void LJII() {
        this.LJFF = true;
        C588600N6s c588600N6s = this.LJIIIZ;
        if (c588600N6s == null || c588600N6s.LIZIZ()) {
            InterfaceC648350Pbt interfaceC648350Pbt = this.LJ;
            if (interfaceC648350Pbt != null) {
                C664400Q4g c664400Q4g = this.LJIIJ;
                if (c664400Q4g == null) {
                    c664400Q4g = new C664400Q4g();
                    c664400Q4g.LJIIJ = "unknown";
                }
                interfaceC648350Pbt.setPlayMetrics(c664400Q4g);
            }
            InterfaceC648350Pbt interfaceC648350Pbt2 = this.LJ;
            if (interfaceC648350Pbt2 != null) {
                interfaceC648350Pbt2.W0(150L, null);
            }
        }
    }

    @Override // X.InterfaceC648720PcU
    public void LJFF() {
        if (this.LIZ) {
            this.LJFF = false;
            this.LJI = false;
            InterfaceC648350Pbt interfaceC648350Pbt = this.LJ;
            if (interfaceC648350Pbt != null) {
                interfaceC648350Pbt.LJJJLIIL();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.13BV] */
    public void LJIIIIZZ() {
        ?? arrayList;
        C652680Pis c652680Pis;
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            List<Integer> listLIZ = C641510PEf.LIZ(recyclerView);
            if (listLIZ.isEmpty()) {
                arrayList = C13BV.INSTANCE;
            } else {
                arrayList = new ArrayList();
                Iterator<Integer> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(it2.next().intValue());
                    if ((viewHolderFindViewHolderForAdapterPosition instanceof InterfaceC648350Pbt) && viewHolderFindViewHolderForAdapterPosition != null) {
                        arrayList.add(viewHolderFindViewHolderForAdapterPosition);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (InterfaceC648350Pbt interfaceC648350Pbt : arrayList) {
            View viewP0 = interfaceC648350Pbt.p0();
            if (viewP0 == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            int i = this.LIZJ;
            if (i != -1) {
                viewP0 = viewP0.findViewById(i);
            }
            arrayList2.add(new C652680Pis(interfaceC648350Pbt, viewP0));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (C641510PEf.LIZIZ(this.LIZLLL, false)) {
            c652680Pis = (C652680Pis) ListProtector.get(arrayList2, 0);
        } else {
            InterfaceC653000PjO interfaceC653000PjO = this.LIZIZ;
            c652680Pis = (C652680Pis) (interfaceC653000PjO != null ? interfaceC653000PjO : null).LIZJ(arrayList2);
            if (c652680Pis == null) {
                return;
            }
        }
        InterfaceC648350Pbt interfaceC648350Pbt2 = c652680Pis.LIZLLL;
        if (Intrinsics.LJFF(interfaceC648350Pbt2, this.LJ) || this.LJ == null) {
            Boolean boolZ3 = interfaceC648350Pbt2.z3();
            if (boolZ3 != null ? boolZ3.booleanValue() : interfaceC648350Pbt2.isPlaying()) {
                if (Intrinsics.LJFF(this.LJ, interfaceC648350Pbt2) || ((Number) C18107077h.LIZ.getValue()).intValue() != 0) {
                    return;
                }
                this.LJ = interfaceC648350Pbt2;
                return;
            }
        }
        if (!Intrinsics.LJFF(this.LJ, c652680Pis.LIZLLL)) {
            InterfaceC648350Pbt interfaceC648350Pbt3 = this.LJ;
            if (interfaceC648350Pbt3 != null) {
                interfaceC648350Pbt3.LJJJLIIL();
            }
            this.LJ = c652680Pis.LIZLLL;
        }
        LJII();
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.LJII;
        if (jCurrentTimeMillis > 1000) {
            return;
        }
        new C650460PfI<C652670Pir>(jCurrentTimeMillis) { // from class: X.0Pir
            {
                super("search_horizontal_trigger_time");
                LJIIZILJ("trigger_time", String.valueOf(jCurrentTimeMillis));
                LJIIZILJ("type", "native");
            }
        }.LJIILJJIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.13BV] */
    @Override // X.InterfaceC648720PcU
    public final void LJJLIIIJLLLLLLLZ() {
        ?? arrayList;
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            List<Integer> listLIZ = C641510PEf.LIZ(recyclerView);
            if (listLIZ.isEmpty()) {
                arrayList = C13BV.INSTANCE;
            } else {
                arrayList = new ArrayList();
                Iterator<Integer> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(it2.next().intValue());
                    if ((viewHolderFindViewHolderForAdapterPosition instanceof InterfaceC648350Pbt) && viewHolderFindViewHolderForAdapterPosition != null) {
                        arrayList.add(viewHolderFindViewHolderForAdapterPosition);
                    }
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC648350Pbt) it3.next()).LJJLIIIJLLLLLLLZ();
        }
    }

    @Override // X.InterfaceC648720PcU
    public final Boolean isActive() {
        return Boolean.valueOf(this.LJFF);
    }

    @Override // X.InterfaceC648720PcU
    public final void LIZIZ(C588600N6s c588600N6s) {
        this.LJIIIZ = c588600N6s;
    }

    public final void LJIIIZ(InterfaceC648350Pbt interfaceC648350Pbt) {
        C652630Pin c652630PinLIZIZ;
        InterfaceC648350Pbt interfaceC648350Pbt2;
        C588600N6s c588600N6s;
        InterfaceC648350Pbt interfaceC648350Pbt3;
        if (!Intrinsics.LJFF(this.LJ, interfaceC648350Pbt) && (interfaceC648350Pbt3 = this.LJ) != null) {
            interfaceC648350Pbt3.LJJJLIIL();
        }
        this.LJ = interfaceC648350Pbt;
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView != null && (c652630PinLIZIZ = C653830Pkj.LIZIZ(recyclerView)) != null && (interfaceC648350Pbt2 = c652630PinLIZIZ.LLILLJJLI) != null && (c588600N6s = this.LJIIIZ) != null) {
            c588600N6s.LIZ(new C588560N6o(Collections.singletonList(interfaceC648350Pbt2), false, null, 6));
        }
    }

    @Override // X.InterfaceC648720PcU
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
        this.LJIIJ = c664400Q4g;
    }

    @Override // X.InterfaceC648720PcU
    public void LIZLLL(final int i, final InterfaceC648120PbW interfaceC648120PbW) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        Boolean boolValueOf6;
        Boolean boolValueOf7;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("locateToTargetSubCard: ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        RecyclerView recyclerView = this.LIZLLL;
        Boolean boolValueOf8 = null;
        if (recyclerView != null) {
            boolValueOf = Boolean.valueOf(recyclerView.isLayoutRequested());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(':');
        RecyclerView recyclerView2 = this.LIZLLL;
        if (recyclerView2 != null) {
            boolValueOf2 = Boolean.valueOf(recyclerView2.isInLayout());
        } else {
            boolValueOf2 = null;
        }
        sbLIZ.append(boolValueOf2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i == -1) {
            LIZLLL(0, null);
            return;
        }
        RecyclerView recyclerView3 = this.LIZLLL;
        if (recyclerView3 != null) {
            if (recyclerView3.isLaidOut() && !recyclerView3.isLayoutRequested()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("inside do on layout: ");
                sbLIZ2.append(i);
                sbLIZ2.append(", ");
                RecyclerView recyclerView4 = this.LIZLLL;
                if (recyclerView4 != null) {
                    boolValueOf3 = Boolean.valueOf(recyclerView4.isLayoutRequested());
                } else {
                    boolValueOf3 = null;
                }
                sbLIZ2.append(boolValueOf3);
                sbLIZ2.append(':');
                RecyclerView recyclerView5 = this.LIZLLL;
                if (recyclerView5 != null) {
                    boolValueOf4 = Boolean.valueOf(recyclerView5.isInLayout());
                } else {
                    boolValueOf4 = null;
                }
                sbLIZ2.append(boolValueOf4);
                C2188811AlT.LIZIZ(sbLIZ2);
                RecyclerView recyclerView6 = this.LIZLLL;
                if (recyclerView6 != null) {
                    LJIIJJI(recyclerView6, i, 0);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("after scroll to: ");
                    sbLIZ3.append(i);
                    sbLIZ3.append(", ");
                    RecyclerView recyclerView7 = this.LIZLLL;
                    if (recyclerView7 != null) {
                        boolValueOf5 = Boolean.valueOf(recyclerView7.isLayoutRequested());
                    } else {
                        boolValueOf5 = null;
                    }
                    sbLIZ3.append(boolValueOf5);
                    sbLIZ3.append(':');
                    RecyclerView recyclerView8 = this.LIZLLL;
                    if (recyclerView8 != null) {
                        boolValueOf6 = Boolean.valueOf(recyclerView8.isInLayout());
                    } else {
                        boolValueOf6 = null;
                    }
                    sbLIZ3.append(boolValueOf6);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    RecyclerView recyclerView9 = this.LIZLLL;
                    if (recyclerView9 != null) {
                        if (recyclerView9.isLaidOut() && !recyclerView9.isLayoutRequested()) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("after scroll to inside on layout: ");
                            sbLIZ4.append(i);
                            sbLIZ4.append(", ");
                            RecyclerView recyclerView10 = this.LIZLLL;
                            if (recyclerView10 != null) {
                                boolValueOf7 = Boolean.valueOf(recyclerView10.isLayoutRequested());
                            } else {
                                boolValueOf7 = null;
                            }
                            sbLIZ4.append(boolValueOf7);
                            sbLIZ4.append(':');
                            RecyclerView recyclerView11 = this.LIZLLL;
                            if (recyclerView11 != null) {
                                boolValueOf8 = Boolean.valueOf(recyclerView11.isInLayout());
                            }
                            sbLIZ4.append(boolValueOf8);
                            C2188811AlT.LIZIZ(sbLIZ4);
                            RecyclerView recyclerView12 = this.LIZLLL;
                            if (recyclerView12 != null) {
                                HandlerHook.viewPost(recyclerView12, new ARunnableS17S0201000_10(i, this, interfaceC648120PbW, 11));
                            }
                        } else {
                            recyclerView9.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC652620Pim(i, interfaceC648120PbW, this));
                        }
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                recyclerView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0Pil
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        Boolean boolValueOf9;
                        Boolean boolValueOf10;
                        Boolean boolValueOf11;
                        Boolean boolValueOf12;
                        Boolean boolValueOf13;
                        view.removeOnLayoutChangeListener(this);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("inside do on layout: ");
                        sbLIZ5.append(i);
                        sbLIZ5.append(", ");
                        RecyclerView recyclerView13 = this.LIZLLL;
                        Boolean boolValueOf14 = null;
                        if (recyclerView13 != null) {
                            boolValueOf9 = Boolean.valueOf(recyclerView13.isLayoutRequested());
                        } else {
                            boolValueOf9 = null;
                        }
                        sbLIZ5.append(boolValueOf9);
                        sbLIZ5.append(':');
                        RecyclerView recyclerView14 = this.LIZLLL;
                        if (recyclerView14 != null) {
                            boolValueOf10 = Boolean.valueOf(recyclerView14.isInLayout());
                        } else {
                            boolValueOf10 = null;
                        }
                        sbLIZ5.append(boolValueOf10);
                        C2188811AlT.LIZIZ(sbLIZ5);
                        C652600Pik c652600Pik = this;
                        RecyclerView recyclerView15 = c652600Pik.LIZLLL;
                        if (recyclerView15 != null) {
                            c652600Pik.LJIIJJI(recyclerView15, i, 0);
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("after scroll to: ");
                            sbLIZ6.append(i);
                            sbLIZ6.append(", ");
                            RecyclerView recyclerView16 = this.LIZLLL;
                            if (recyclerView16 != null) {
                                boolValueOf11 = Boolean.valueOf(recyclerView16.isLayoutRequested());
                            } else {
                                boolValueOf11 = null;
                            }
                            sbLIZ6.append(boolValueOf11);
                            sbLIZ6.append(':');
                            RecyclerView recyclerView17 = this.LIZLLL;
                            if (recyclerView17 != null) {
                                boolValueOf12 = Boolean.valueOf(recyclerView17.isInLayout());
                            } else {
                                boolValueOf12 = null;
                            }
                            sbLIZ6.append(boolValueOf12);
                            C2188811AlT.LIZIZ(sbLIZ6);
                            RecyclerView recyclerView18 = this.LIZLLL;
                            if (recyclerView18 != null) {
                                if (recyclerView18.isLaidOut() && !recyclerView18.isLayoutRequested()) {
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append("after scroll to inside on layout: ");
                                    sbLIZ7.append(i);
                                    sbLIZ7.append(", ");
                                    RecyclerView recyclerView19 = this.LIZLLL;
                                    if (recyclerView19 != null) {
                                        boolValueOf13 = Boolean.valueOf(recyclerView19.isLayoutRequested());
                                    } else {
                                        boolValueOf13 = null;
                                    }
                                    sbLIZ7.append(boolValueOf13);
                                    sbLIZ7.append(':');
                                    RecyclerView recyclerView20 = this.LIZLLL;
                                    if (recyclerView20 != null) {
                                        boolValueOf14 = Boolean.valueOf(recyclerView20.isInLayout());
                                    }
                                    sbLIZ7.append(boolValueOf14);
                                    C2188811AlT.LIZIZ(sbLIZ7);
                                    C652600Pik c652600Pik2 = this;
                                    RecyclerView recyclerView21 = c652600Pik2.LIZLLL;
                                    if (recyclerView21 != null) {
                                        HandlerHook.viewPost(recyclerView21, new ARunnableS17S0201000_10(i, c652600Pik2, interfaceC648120PbW, 11));
                                        return;
                                    }
                                    return;
                                }
                                recyclerView18.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC652620Pim(i, interfaceC648120PbW, this));
                                return;
                            }
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                });
            }
        }
        RecyclerView recyclerView13 = this.LIZLLL;
        if (recyclerView13 != null && recyclerView13.isInLayout()) {
            RecyclerView recyclerView14 = this.LIZLLL;
            if (recyclerView14 != null) {
                recyclerView14.forceLayout();
                return;
            }
            return;
        }
        RecyclerView recyclerView15 = this.LIZLLL;
        if (recyclerView15 == null) {
            return;
        }
        recyclerView15.requestLayout();
    }

    public void LJIIJ(int i, InterfaceC648120PbW interfaceC648120PbW) {
        Object objFindViewHolderForAdapterPosition;
        InterfaceC648350Pbt interfaceC648350Pbt;
        Boolean boolValueOf;
        RecyclerView recyclerView = this.LIZLLL;
        Boolean boolValueOf2 = null;
        if (recyclerView != null) {
            objFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        } else {
            objFindViewHolderForAdapterPosition = null;
        }
        if (objFindViewHolderForAdapterPosition instanceof InterfaceC648350Pbt) {
            interfaceC648350Pbt = (InterfaceC648350Pbt) objFindViewHolderForAdapterPosition;
        } else {
            interfaceC648350Pbt = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playAtPosition: ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(interfaceC648350Pbt);
        sbLIZ.append(", ");
        RecyclerView recyclerView2 = this.LIZLLL;
        if (recyclerView2 != null) {
            boolValueOf = Boolean.valueOf(recyclerView2.isLayoutRequested());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(':');
        RecyclerView recyclerView3 = this.LIZLLL;
        if (recyclerView3 != null) {
            boolValueOf2 = Boolean.valueOf(recyclerView3.isInLayout());
        }
        sbLIZ.append(boolValueOf2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (interfaceC648350Pbt == null) {
            return;
        }
        this.LJ = interfaceC648350Pbt;
        LJII();
        if (interfaceC648120PbW != null) {
            interfaceC648120PbW.LIZ();
        }
    }

    @Override // X.InterfaceC648720PcU
    public final void LJJLL(Aweme aweme, C0PBW c0pbw) {
        InterfaceC652640Pio interfaceC652640Pio = this.LJIIL;
        if (interfaceC652640Pio == null) {
            return;
        }
        LIZLLL(interfaceC652640Pio.LIZ(aweme), c0pbw);
    }

    public void LJIIJJI(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                linearLayoutManager.scrollToPositionWithOffset(i, i2);
                return;
            }
            return;
        }
        recyclerView.scrollToPosition(i);
    }

    @Override // X.InterfaceC648720PcU
    public final void LJI(RecyclerView recyclerView, InterfaceC653000PjO interfaceC653000PjO, int i, boolean z) {
        this.LIZLLL = recyclerView;
        this.LIZIZ = interfaceC653000PjO;
        this.LIZJ = i;
        recyclerView.removeOnScrollListener((AbstractC1585810rMx) this.LJIIJJI.getValue());
        recyclerView.addOnScrollListener((AbstractC1585810rMx) this.LJIIJJI.getValue());
        HandlerHook.viewPost(recyclerView, new ARunnableS29S0110000_10(this, z, 5));
        if (((Number) C18107077h.LIZ.getValue()).intValue() != 0) {
            this.LJ = null;
        }
    }
}
