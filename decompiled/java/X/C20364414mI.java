package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterVisibility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14mI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20364414mI extends AbstractC20368114mt {
    public final PlaybookAnchorViewModel LLILLJJLI;
    public final DataChannel LLILLL;
    public final C951190arN LLILZ;
    public final C20364614mK LLILZIL;
    public final Set<Long> LLILZLL;
    public boolean LLIZ;
    public final C20364814mM LLIZLLLIL;
    public final C20364714mL LLJ;

    @Override // X.AbstractC20368114mt
    public final void LIZ() {
        this.LLIZ = true;
        LIZIZ();
    }

    public final void LIZIZ() {
        C20360614lg c20360614lg;
        List<C20359414lU> list;
        int iLQ2 = this.LLILLJJLI.LQ2();
        C20379114of value = this.LLILLJJLI.LLILZ.getValue();
        if (value == null || (c20360614lg = value.LIZIZ) == null || (list = c20360614lg.LIZIZ) == null) {
            return;
        }
        if (iLQ2 >= 0 && iLQ2 < list.size()) {
            Iterator<C20361214lm> it2 = ((C20359414lU) ListProtector.get(list, iLQ2)).LIZJ.iterator();
            while (it2.hasNext()) {
                LIZJ(it2.next());
            }
        }
        int i = iLQ2 + 1;
        if (i < 0 || i >= list.size()) {
            return;
        }
        Iterator<C20361214lm> it3 = ((C20359414lU) ListProtector.get(list, i)).LIZJ.iterator();
        while (it3.hasNext()) {
            LIZJ(it3.next());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            this.LLILLJJLI.LLILZ.observe(lifecycleOwner, this.LLIZLLLIL);
            DataChannel dataChannel = this.LLILLL;
            if (dataChannel != null) {
                dataChannel.BQ2(lifecycleOwner, LiveCenterVisibility.class, this.LLJ);
            }
        }
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLJJLI;
        playbookAnchorViewModel.LLJJJJJIL.LJJIII.add(this.LLILZIL);
        LIZLLL(this.LLILLJJLI.LLILZ.getValue());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            this.LLILLJJLI.LLILZ.removeObserver(this.LLIZLLLIL);
            DataChannel dataChannel = this.LLILLL;
            if (dataChannel != null) {
                dataChannel.GQ2(lifecycleOwner, LiveCenterVisibility.class, this.LLJ);
            }
        }
    }

    public final void LIZJ(C20361214lm c20361214lm) {
        int iDQ2;
        long j;
        boolean zYQ2;
        Playbook playbook;
        MutableLiveData<C20379114of> mutableLiveData;
        C20379114of value;
        MutableLiveData<C20379114of> mutableLiveData2;
        C20379114of value2;
        Playbook playbook2;
        if (this.LLILZLL.contains(Long.valueOf(c20361214lm.LIZIZ))) {
            return;
        }
        this.LLILZLL.add(Long.valueOf(c20361214lm.LIZIZ));
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        DataChannel dataChannel = this.LLILLL;
        String str = c20361214lm.LIZ;
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLJJLI;
        if (playbookAnchorViewModel != null) {
            iDQ2 = playbookAnchorViewModel.DQ2(c20361214lm);
        } else {
            iDQ2 = -1;
        }
        int i = iDQ2 + 1;
        PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LLILLJJLI;
        if (playbookAnchorViewModel2 != null && (mutableLiveData2 = playbookAnchorViewModel2.LLILLL) != null && (value2 = mutableLiveData2.getValue()) != null && (playbook2 = value2.LIZ) != null) {
            j = playbook2.playbookId;
        } else {
            j = 0;
        }
        PlaybookAnchorViewModel playbookAnchorViewModel3 = this.LLILLJJLI;
        if (playbookAnchorViewModel3 != null) {
            zYQ2 = playbookAnchorViewModel3.yQ2();
        } else {
            zYQ2 = false;
        }
        PlaybookAnchorViewModel playbookAnchorViewModel4 = this.LLILLJJLI;
        if (playbookAnchorViewModel4 != null && (mutableLiveData = playbookAnchorViewModel4.LLILLL) != null && (value = mutableLiveData.getValue()) != null) {
            playbook = value.LIZ;
        } else {
            playbook = null;
        }
        C978360bZC.LJIILJJIL(dataChannel, "show", str, i, j, zYQ2, null, playbook, c20361214lm.LIZLLL, false, 1600);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(C20379114of c20379114of) {
        boolean z;
        int size;
        int size2;
        List<C20359414lU> list;
        C20359414lU c20359414lU;
        List<C20359414lU> list2;
        List<C20359414lU> list3;
        C20359414lU c20359414lU2;
        List<C20359414lU> list4;
        List<C20359414lU> list5;
        String str;
        if (c20379114of == null) {
            return;
        }
        C410901il c410901il = new C410901il();
        PlaybookContent playbookContent = c20379114of.LIZ.content;
        if (playbookContent != null && (str = playbookContent.title) != null) {
            c410901il.add(new C087400Um(str));
        }
        int iLQ2 = this.LLILLJJLI.LQ2();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (iLQ2 == -1) {
            z = true;
        } else {
            z = false;
        }
        C20360614lg c20360614lg = c20379114of.LIZIZ;
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (c20360614lg != null && (list5 = c20360614lg.LIZIZ) != null) {
            if (z) {
                arrayList2.add(Integer.valueOf(list5.size() - 2));
                arrayList2.add(Integer.valueOf(list5.size() - 1));
            } else {
                Iterator<C20359414lU> it2 = list5.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    it2.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (i == iLQ2 || i == iLQ2 + 1) {
                            arrayList2.add(Integer.valueOf(i));
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int iIntValue = ((Number) ListProtector.get(arrayList2, 0)).intValue();
            if (iIntValue >= 0) {
                C20360614lg c20360614lg2 = c20379114of.LIZIZ;
                if (c20360614lg2 != null && (list4 = c20360614lg2.LIZIZ) != null) {
                    size = list4.size();
                } else {
                    size = 0;
                }
                if (iIntValue <= size) {
                    C20360614lg c20360614lg3 = c20379114of.LIZIZ;
                    if (c20360614lg3 != null && (list3 = c20360614lg3.LIZIZ) != null && (c20359414lU2 = (C20359414lU) ListProtector.get(list3, iIntValue)) != null) {
                        int i3 = iIntValue + 1;
                        c410901il.add(new C1868250yiV(c20359414lU2, i3));
                        int i4 = 0;
                        for (C20361214lm c20361214lm : c20359414lU2.LIZJ) {
                            int i5 = i4 + 1;
                            if (i4 >= 0) {
                                C20361214lm c20361214lm2 = c20361214lm;
                                boolean z2 = false;
                                C20365414mS c20365414mSLJIIIZ = new C20365414mS(c20361214lm2, c20359414lU2.LIZJ.size(), i4, i3, str2, z2, z2, objArr3 == true ? 1 : 0, z2, 4080).LJIIIZ();
                                Function2<C20361214lm, Context, View> function2 = c20361214lm2.LIZJ.LJIIIZ;
                                if (function2 == null || function2.invoke(c20361214lm2, getContext()) == null) {
                                    c410901il.add(c20365414mSLJIIIZ);
                                }
                                arrayList.add(c20365414mSLJIIIZ);
                                C20365214mQ.LIZIZ(c20365414mSLJIIIZ, linkedHashMap);
                                i4 = i5;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    if (arrayList2.size() > 1) {
                        int iIntValue2 = ((Number) ListProtector.get(arrayList2, 1)).intValue();
                        if (iIntValue2 >= 0) {
                            C20360614lg c20360614lg4 = c20379114of.LIZIZ;
                            if (c20360614lg4 != null && (list2 = c20360614lg4.LIZIZ) != null) {
                                size2 = list2.size();
                            } else {
                                size2 = 0;
                            }
                            if (iIntValue2 <= size2) {
                                C20360614lg c20360614lg5 = c20379114of.LIZIZ;
                                if (c20360614lg5 != null && (list = c20360614lg5.LIZIZ) != null && (c20359414lU = (C20359414lU) ListProtector.get(list, iIntValue2)) != null) {
                                    int i6 = iIntValue2 + 1;
                                    c410901il.add(new C1868250yiV(c20359414lU, i6));
                                    int i7 = 0;
                                    for (C20361214lm c20361214lm3 : c20359414lU.LIZJ) {
                                        int i8 = i7 + 1;
                                        if (i7 >= 0) {
                                            C20361214lm c20361214lm4 = c20361214lm3;
                                            boolean z3 = false;
                                            C20365414mS c20365414mSLJIIIZ2 = new C20365414mS(c20361214lm4, c20359414lU.LIZJ.size(), i7, i6, objArr2 == true ? 1 : 0, z3, z3, objArr == true ? 1 : 0, z3, 4080).LJIIIZ();
                                            Function2<C20361214lm, Context, View> function22 = c20361214lm4.LIZJ.LJIIIZ;
                                            if (function22 == null || function22.invoke(c20361214lm4, getContext()) == null) {
                                                c410901il.add(c20365414mSLJIIIZ2);
                                            }
                                            arrayList.add(c20365414mSLJIIIZ2);
                                            C20365214mQ.LIZIZ(c20365414mSLJIIIZ2, linkedHashMap);
                                            i7 = i8;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C20365214mQ.LIZ((C20365414mS) it3.next(), linkedHashMap);
        }
        c410901il.add(new InterfaceC951240arS<Object>() { // from class: X.00UN
            public final String LIZ = "";

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C00UN) && Intrinsics.LJFF(this.LIZ, ((C00UN) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ViewMoreData(extra=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC951240arS
            public final boolean LIZIZ(Object obj) {
                C00UN c00un;
                String str3 = null;
                if ((obj instanceof C00UN) && (c00un = (C00UN) obj) != null) {
                    str3 = c00un.LIZ;
                }
                return Intrinsics.LJFF(str3, this.LIZ);
            }

            @Override // X.InterfaceC951240arS
            public final boolean LJII(Object obj) {
                return obj instanceof C00UN;
            }
        });
        this.LLILZ.LLLII(c410901il);
        if (this.LLIZ) {
            LIZIZ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.14mK] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.14mM] */
    public C20364414mI(Context context, final PlaybookAnchorViewModel playbookAnchorViewModel, final DataChannel dataChannel) {
        super(context, null, 0);
        this.LLILLJJLI = playbookAnchorViewModel;
        this.LLILLL = dataChannel;
        this.LLILZIL = new InterfaceC20365114mP() { // from class: X.14mK
            @Override // X.InterfaceC20365114mP
            public final void LIZ() {
                C20364414mI c20364414mI = this.LIZ;
                c20364414mI.LIZLLL(c20364414mI.LLILLJJLI.LLILZ.getValue());
            }
        };
        this.LLILZLL = new LinkedHashSet();
        C786410Ut5.Td(C1834150xpV.LIZJ(C786410Ut5.ne(context)), R.layout.dwm, this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.t0v);
        C951190arN c951190arN = new C951190arN();
        c951190arN.LLLI(C1868250yiV.class, new AbstractC960460b6K<C1868250yiV, C20362614m0>(dataChannel, playbookAnchorViewModel) { // from class: X.14m1
            public final DataChannel LIZIZ;
            public final PlaybookAnchorViewModel LIZJ;

            {
                this.LIZIZ = dataChannel;
                this.LIZJ = playbookAnchorViewModel;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C20362614m0(C786410Ut5.Td(layoutInflater, R.layout.dwj, viewGroup, false), this.LIZIZ, this.LIZJ);
            }
        });
        c951190arN.LLLI(C20365414mS.class, new AbstractC960460b6K<C20365414mS, C20366414mc>(dataChannel, playbookAnchorViewModel) { // from class: X.14mJ
            public final DataChannel LIZIZ;
            public final PlaybookAnchorViewModel LIZJ;

            {
                this.LIZIZ = dataChannel;
                this.LIZJ = playbookAnchorViewModel;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C20366414mc(C786410Ut5.Td(layoutInflater, R.layout.dwk, viewGroup, false), this.LIZIZ, this.LIZJ);
            }
        });
        c951190arN.LLLI(C087400Um.class, new AbstractC960460b6K<C087400Um, C1888030zEP>() { // from class: X.0zEQ
            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new AbstractC960470b6L<C087400Um>(C786410Ut5.Td(layoutInflater, R.layout.dwl, viewGroup, false)) { // from class: X.0zEP
                    public final TextView LL;

                    {
                        super(view);
                        this.LL = (TextView) view.findViewById(R.id.qs5);
                    }

                    @Override // X.AbstractC960470b6L
                    public final void I5(int i, Object obj) {
                        this.LL.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131855277), Arrays.copyOf(new Object[]{((C087400Um) obj).LIZ}, 1)));
                    }
                };
            }
        });
        final C20364914mN c20364914mN = new C20364914mN(this);
        c951190arN.LLLI(C00UN.class, new AbstractC960460b6K<C00UN, C20363814mC>(dataChannel, c20364914mN) { // from class: X.14mD
            public final DataChannel LIZIZ;
            public final Function0<Integer> LIZJ;

            {
                this.LIZIZ = dataChannel;
                this.LIZJ = c20364914mN;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C20363814mC(C786410Ut5.Td(layoutInflater, R.layout.dwn, viewGroup, false), this.LIZIZ, this.LIZJ);
            }
        });
        this.LLILZ = c951190arN;
        recyclerView.setAdapter(c951190arN);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.LLIZLLLIL = new Observer() { // from class: X.14mM
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.LL.LIZLLL((C20379114of) obj);
            }
        };
        this.LLJ = new C20364714mL(this);
    }
}
