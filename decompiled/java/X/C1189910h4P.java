package X;

import Y.ACListenerS121S0200000_18;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS15S0401000_18;
import kotlin.jvm.internal.AwS667S0100000_18;

/* JADX INFO: renamed from: X.0h4P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189910h4P extends AbstractC21673619ry<C1189920h4Q> {
    public final InterfaceC1631620sYq<Integer, PoiListApi.PostTag, Boolean, Unit> LL;
    public ColorStateList LLILZIL;
    public RecyclerView LLILZLL;
    public boolean LLIZ;
    public Function2<? super PoiListApi.PostTag, ? super Integer, Unit> LLIZLLLIL;
    public List<PoiListApi.PostTag> LLILLJJLI = C13BV.INSTANCE;
    public int LLILLL = -1;
    public boolean LLILZ = true;
    public final Set<Integer> LLJ = new LinkedHashSet();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C1189910h4P(AwS667S0100000_18 awS667S0100000_18) {
        this.LL = awS667S0100000_18;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLILZLL = recyclerView;
        if (this.LLIZ && recyclerView.getParent() != null) {
            this.LLIZ = false;
            notifyDataSetChanged();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        if (this.LLILZLL == recyclerView) {
            this.LLILZLL = null;
        }
    }

    public final void LLLFZ(C1189920h4Q c1189920h4Q, int i) {
        boolean z;
        View view = c1189920h4Q.itemView;
        if (i == this.LLILLL) {
            z = true;
        } else {
            z = false;
        }
        view.setSelected(z);
        c1189920h4Q.itemView.setEnabled(this.LLILZ);
        C786410Ut5.I7(new ACListenerS121S0200000_18(this, c1189920h4Q, 19), c1189920h4Q.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int i2;
        int iIntValue;
        int iIntValue2;
        C1189920h4Q c1189920h4Q = (C1189920h4Q) viewHolder;
        PoiListApi.PostTag postTag = (PoiListApi.PostTag) ListProtector.get(this.LLILLJJLI, i);
        String str = postTag.tagName;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = 8;
        if (z) {
            C786410Ut5.LJLLLLLL(8, c1189920h4Q.itemView);
            return;
        }
        C786410Ut5.LJLLLLLL(0, c1189920h4Q.itemView);
        c1189920h4Q.LLILLL.setText(str);
        ColorStateList colorStateList = this.LLILZIL;
        if (colorStateList == null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, c1189920h4Q.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, c1189920h4Q.itemView.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{iIntValue, iIntValue2});
            this.LLILZIL = colorStateList;
        }
        c1189920h4Q.LLILLL.setTextColor(colorStateList);
        Long l = postTag.tagVideoCount;
        if (l != null && l.longValue() > 0) {
            c1189920h4Q.LLILZ.setText(l.toString());
            C786410Ut5.LJLLLLLL(0, c1189920h4Q.LLILZ);
        } else {
            C786410Ut5.LJLLLLLL(8, c1189920h4Q.LLILZ);
        }
        Iterable iterable = postTag.tagIconUrlList;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        List listLJJII = C09RB.LJJII(C09RB.LJJI(C09RB.LJIIIZ(C09RB.LJIJI(new C1939607ik(iterable), AnonymousClass0207.get$arr$(40)), AnonymousClass0207.get$arr$(41)), 2));
        if (listLJJII.isEmpty()) {
            C786410Ut5.LJLLLLLL(8, c1189920h4Q.LLILLJJLI);
            C786410Ut5.LJLLLLLL(8, c1189920h4Q.LL);
            c1189920h4Q.LLILLJJLI.setSize(16);
        } else if (listLJJII.size() >= 2) {
            C786410Ut5.LJLLLLLL(8, c1189920h4Q.LLILLJJLI);
            c1189920h4Q.LL.setSize(20);
            C430200Gtu.LIZ(c1189920h4Q.LL, new C03IT(Collections.singletonList(ListProtector.get(listLJJII, 0))));
            C430200Gtu.LIZIZ(c1189920h4Q.LL, new C03IT(Collections.singletonList(ListProtector.get(listLJJII, 1))));
            C786410Ut5.LJLLLLLL(0, c1189920h4Q.LL);
        } else {
            C786410Ut5.LJLLLLLL(8, c1189920h4Q.LL);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
            c1189920h4Q.LLILLJJLI.setSize(15);
            ViewGroup.LayoutParams layoutParams = c1189920h4Q.LLILLJJLI.getLayoutParams();
            if (layoutParams.width != iLIZIZ || layoutParams.height != iLIZIZ) {
                layoutParams.width = iLIZIZ;
                layoutParams.height = iLIZIZ;
                C786410Ut5.H6(c1189920h4Q.LLILLJJLI, layoutParams);
            }
            C427660Gpo.LJIIJJI(c1189920h4Q.LLILLJJLI, new C03IT(Collections.singletonList(ListProtector.get(listLJJII, 0))), false, null, null, false, false, null, null, false, null, 1022);
            C786410Ut5.LJLLLLLL(0, c1189920h4Q.LLILLJJLI);
        }
        if (c1189920h4Q.LLILLJJLI.getVisibility() != 0 && c1189920h4Q.LL.getVisibility() != 0 && c1189920h4Q.LLILZ.getVisibility() != 0) {
            i3 = 12;
            i2 = 7;
        } else {
            i2 = 6;
        }
        c1189920h4Q.itemView.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
        LLLFZ(c1189920h4Q, i);
        Function2<? super PoiListApi.PostTag, ? super Integer, Unit> function2 = this.LLIZLLLIL;
        if (function2 == null) {
            return;
        }
        C2211631BhB.LJ(c1189920h4Q.itemView, new AwS15S0401000_18(c1189920h4Q, (C1189920h4Q) postTag, (PoiListApi.PostTag) i, (int) this, (C1189910h4P) function2, (Function2<? super PoiListApi.PostTag, ? super Integer, Unit>) 1));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1189920h4Q c1189920h4Q = new C1189920h4Q(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e69, viewGroup, false));
        try {
            View view = c1189920h4Q.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1189920h4Q.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1189920h4Q.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1189920h4Q.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1189920h4Q.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1189920h4Q.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1189920h4Q.class.getName();
        return c1189920h4Q;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C1189920h4Q c1189920h4Q = (C1189920h4Q) viewHolder;
        if (!list.isEmpty()) {
            if (!list.isEmpty()) {
                for (Object obj : list) {
                    if (obj == C1189900h4O.LIZ || obj == C1189890h4N.LIZ) {
                    }
                }
            }
            LLLFZ(c1189920h4Q, i);
            return;
        }
        super.onBindViewHolder(c1189920h4Q, i, list);
    }
}
