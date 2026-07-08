package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DG8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DG8 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Function1<UcpRecommendationItem, Unit> LL;
    public final List<UcpRecommendationItem> LLILLJJLI;
    public final List<AbstractC331870Czh> LLILLL;
    public boolean LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public final void LLLFZ(final List<? extends AbstractC331870Czh> list) {
        final List listLLIIII = C13LP.LLIIII(this.LLILLL);
        boolean z = false;
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.0DG7
            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return list.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return listLLIIII.size();
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                if (((AbstractC331870Czh) ListProtector.get(listLLIIII, i)).getContentHash() == ((AbstractC331870Czh) ListProtector.get(list, i2)).getContentHash()) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                AbstractC331870Czh abstractC331870Czh = (AbstractC331870Czh) ListProtector.get(listLLIIII, i);
                AbstractC331870Czh abstractC331870Czh2 = (AbstractC331870Czh) ListProtector.get(list, i2);
                if (Intrinsics.LJFF(abstractC331870Czh.getSlotKey(), abstractC331870Czh2.getSlotKey()) && abstractC331870Czh.getClass() == abstractC331870Czh2.getClass()) {
                    return true;
                }
                return false;
            }
        }, false);
        this.LLILLL.clear();
        this.LLILLL.addAll(list);
        if (!this.LLILLL.isEmpty()) {
            List<AbstractC331870Czh> list2 = this.LLILLL;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z = true;
            } else {
                Iterator<AbstractC331870Czh> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (!(it2.next() instanceof C08LM)) {
                        break;
                    }
                }
                z = true;
            }
        }
        this.LLILZ = z;
        c21341918fZLIZ.LIZJ(this);
    }

    public final void LLLI(boolean z) {
        if (this.LLILZ == z) {
            return;
        }
        this.LLILZ = z;
        if (z) {
            AbstractC331870Czh.Companion.getClass();
            LLLFZ(C331820Czc.LIZ());
            return;
        }
        List<AbstractC331870Czh> list = this.LLILLL;
        int i = 0;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            for (Object obj : (ArrayList) list) {
                if (!(obj instanceof C08LM) && !(obj instanceof C08LL)) {
                    return;
                }
            }
        }
        List<UcpRecommendationItem> list2 = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (UcpRecommendationItem ucpRecommendationItem : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C0D0F(ucpRecommendationItem, i));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        LLLFZ(arrayList);
    }

    public final void LLLII(List<UcpRecommendationItem> list) {
        this.LLILLJJLI.clear();
        this.LLILLJJLI.addAll(list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (UcpRecommendationItem ucpRecommendationItem : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C0D0F(ucpRecommendationItem, i));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        LLLIIIIL(arrayList);
    }

    public final void LLLIIIIL(List<? extends AbstractC331870Czh> list) {
        List<AbstractC331870Czh> list2 = this.LLILLL;
        if (list2.size() == list.size()) {
            Iterable iterableLJIIIZ = C1697810uHb.LJIIIZ(list2);
            if ((iterableLJIIIZ instanceof Collection) && ((Collection) iterableLJIIIZ).isEmpty()) {
                return;
            }
            Iterator<Integer> it2 = iterableLJIIIZ.iterator();
            while (((C531650Kt9) it2).hasNext()) {
                int iNextInt = ((AbstractC2098408Jy) it2).nextInt();
                AbstractC331870Czh abstractC331870Czh = (AbstractC331870Czh) ListProtector.get(list2, iNextInt);
                AbstractC331870Czh abstractC331870Czh2 = (AbstractC331870Czh) ListProtector.get(list, iNextInt);
                if (abstractC331870Czh.getClass() != abstractC331870Czh2.getClass() || !Intrinsics.LJFF(abstractC331870Czh.getSlotKey(), abstractC331870Czh2.getSlotKey()) || abstractC331870Czh.getContentHash() != abstractC331870Czh2.getContentHash()) {
                }
            }
            return;
        }
        LLLFZ(list);
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        int iHashCode;
        AbstractC331870Czh abstractC331870Czh = (AbstractC331870Czh) C13LP.LJJJLZIJ(i, this.LLILLL);
        if (abstractC331870Czh == null) {
            return -1L;
        }
        if (abstractC331870Czh instanceof C0D0F) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resolved:");
            sbLIZ.append(abstractC331870Czh.getSlotKey());
            iHashCode = C2188811AlT.LIZIZ(sbLIZ).hashCode();
        } else if (abstractC331870Czh instanceof C08LL) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tail_loading:");
            sbLIZ2.append(abstractC331870Czh.getSlotKey());
            iHashCode = C2188811AlT.LIZIZ(sbLIZ2).hashCode();
        } else if (abstractC331870Czh instanceof C08LM) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("skeleton:");
            sbLIZ3.append(abstractC331870Czh.getSlotKey());
            iHashCode = C2188811AlT.LIZIZ(sbLIZ3).hashCode();
        } else {
            throw new C1954807lC();
        }
        return iHashCode;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (C13LP.LJJJLZIJ(i, this.LLILLL) instanceof C0D0F) {
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0DG8(List<UcpRecommendationItem> list, Function1<? super UcpRecommendationItem, Unit> function1) {
        this.LL = function1;
        this.LLILLJJLI = list;
        AbstractC331870Czh.Companion.getClass();
        this.LLILLL = new ArrayList(C331820Czc.LIZ());
        this.LLILZ = true;
        setHasStableIds(true);
        if (true ^ ((ArrayList) list).isEmpty()) {
            LLLII(list);
            LLLI(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[PHI: r4
      0x0071: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v17 java.lang.String), (r4v17 java.lang.String) binds: [B:110:0x02f4, B:21:0x006b, B:23:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0233  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r22, int r23) {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DG8.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c0dgw;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (i == 1) {
            final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.i4i, viewGroup, false);
            c0dgw = new RecyclerView.ViewHolder(viewTd) { // from class: X.0DGu
            };
        } else {
            View viewTd2 = C786410Ut5.Td(layoutInflaterNe, R.layout.i4h, viewGroup, false);
            int i2 = R.id.l73;
            ImageView imageView = (ImageView) C1616006Uk.LIZ(R.id.l73, viewTd2);
            if (imageView != null) {
                i2 = R.id.m7_;
                View viewLIZ = C1616006Uk.LIZ(R.id.m7_, viewTd2);
                if (viewLIZ != null) {
                    int i3 = R.id.z3i;
                    TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.z3i, viewLIZ);
                    if (tuxTextView != null) {
                        i3 = R.id.z51;
                        TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.z51, viewLIZ);
                        if (tuxTextView2 != null) {
                            i3 = R.id.z5i;
                            TuxTextView tuxTextView3 = (TuxTextView) C1616006Uk.LIZ(R.id.z5i, viewLIZ);
                            if (tuxTextView3 != null) {
                                C336330DGl c336330DGl = new C336330DGl((LinearLayout) viewLIZ, tuxTextView, tuxTextView2, tuxTextView3);
                                i2 = R.id.n_y;
                                LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.n_y, viewTd2);
                                if (linearLayout != null) {
                                    i2 = R.id.sre;
                                    C1203340hQ4 c1203340hQ4 = (C1203340hQ4) C1616006Uk.LIZ(R.id.sre, viewTd2);
                                    if (c1203340hQ4 != null) {
                                        i2 = R.id.z5l;
                                        TuxTextView tuxTextView4 = (TuxTextView) C1616006Uk.LIZ(R.id.z5l, viewTd2);
                                        if (tuxTextView4 != null) {
                                            i2 = R.id.z5v;
                                            TuxTextView tuxTextView5 = (TuxTextView) C1616006Uk.LIZ(R.id.z5v, viewTd2);
                                            if (tuxTextView5 != null) {
                                                i2 = R.id.z72;
                                                TuxTextView tuxTextView6 = (TuxTextView) C1616006Uk.LIZ(R.id.z72, viewTd2);
                                                if (tuxTextView6 != null) {
                                                    c0dgw = new C0DGW(this, new C0DGR((LinearLayout) viewTd2, imageView, c336330DGl, linearLayout, c1203340hQ4, tuxTextView4, tuxTextView5, tuxTextView6));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ.getResources().getResourceName(i3)));
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewTd2.getResources().getResourceName(i2)));
        }
        try {
            View view = c0dgw.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0dgw.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0dgw.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0dgw.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0dgw.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0dgw.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0dgw.getClass().getName();
        return c0dgw;
    }
}
