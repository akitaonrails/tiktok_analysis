package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380650EwB extends PagerAdapter {
    public final Context LLILLJJLI;
    public final List<C380660EwC> LLILLL;
    public final Function2<C357590E0f, C380190EvR, Unit> LLILZ;
    public final SparseArray<C380720EwI> LLILZIL = new SparseArray<>();
    public String LLILZLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILLL.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        C380660EwC c380660EwC = (C380660EwC) C13LP.LJJJLZIJ(i, this.LLILLL);
        if (c380660EwC == null) {
            return "";
        }
        String str = c380660EwC.LIZ.LIZIZ;
        if (Intrinsics.LJFF(str, "aiCreate_models_tab_createVideo")) {
            return this.LLILLJJLI.getString(2131825420);
        }
        if (Intrinsics.LJFF(str, "aiCreate_models_tab_createImage")) {
            return this.LLILLJJLI.getString(2131825419);
        }
        String str2 = c380660EwC.LIZ.LIZ;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(java.lang.String r9) {
        /*
            r8 = this;
            r8.LLILZLL = r9
            android.util.SparseArray<X.0EwI> r0 = r8.LLILZIL
            int r7 = r0.size()
            r6 = 0
        L9:
            if (r6 >= r7) goto L73
            android.util.SparseArray<X.0EwI> r0 = r8.LLILZIL
            java.lang.Object r5 = r0.valueAt(r6)
            X.0EwI r5 = (X.C380720EwI) r5
            java.lang.String r2 = r5.LLILLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r9)
            if (r0 != 0) goto L6d
            r5.LLILLL = r9
            r4 = -1
            if (r2 == 0) goto L40
            java.util.List<X.0EvR> r0 = r5.LLILLJJLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
            r3 = 0
        L29:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r1.next()
            X.0EvR r0 = (X.C380190EvR) r0
            java.lang.String r0 = r0.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 != 0) goto L41
            int r3 = r3 + 1
            goto L29
        L40:
            r3 = -1
        L41:
            if (r9 == 0) goto L61
            java.util.List<X.0EvR> r0 = r5.LLILLJJLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L4c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r2.next()
            X.0EvR r0 = (X.C380190EvR) r0
            java.lang.String r0 = r0.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)
            if (r0 == 0) goto L70
            r4 = r1
        L61:
            java.lang.String r0 = "payload_selection"
            if (r3 < 0) goto L68
            r5.notifyItemChanged(r3, r0)
        L68:
            if (r4 < 0) goto L6d
            r5.notifyItemChanged(r4, r0)
        L6d:
            int r6 = r6 + 1
            goto L9
        L70:
            int r1 = r1 + 1
            goto L4c
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380650EwB.LJJIJIL(java.lang.String):void");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        C380660EwC c380660EwC = (C380660EwC) ListProtector.get(this.LLILLL, i);
        C380720EwI c380720EwI = new C380720EwI(new AwS371S0200000_5(this, c380660EwC, 39));
        final List<C380190EvR> list = c380660EwC.LIZIZ;
        final String str = this.LLILZLL;
        final ArrayList arrayList = new ArrayList(c380720EwI.LLILLJJLI);
        final String str2 = c380720EwI.LLILLL;
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(arrayList, list, str2, str) { // from class: X.0EvS
            public final List<C380190EvR> LIZ;
            public final List<C380190EvR> LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i2, int i3) {
                C380190EvR c380190EvR = (C380190EvR) ListProtector.get(this.LIZ, i2);
                C380190EvR c380190EvR2 = (C380190EvR) ListProtector.get(this.LIZIZ, i3);
                if (!Intrinsics.LJFF(c380190EvR.LIZJ, c380190EvR2.LIZJ) || !Intrinsics.LJFF(c380190EvR.LIZ, c380190EvR2.LIZ) || !Intrinsics.LJFF(c380190EvR.LIZIZ, c380190EvR2.LIZIZ) || !Intrinsics.LJFF(c380190EvR.LIZLLL, c380190EvR2.LIZLLL) || c380190EvR.LJ != c380190EvR2.LJ || !Intrinsics.LJFF(c380190EvR.LJIIJJI, c380190EvR2.LJIIJJI)) {
                    return false;
                }
                String str3 = c380190EvR.LIZJ;
                if (Intrinsics.LJFF(str3, this.LIZJ) == Intrinsics.LJFF(str3, this.LIZLLL)) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i2, int i3) {
                return Intrinsics.LJFF(((C380190EvR) ListProtector.get(this.LIZ, i2)).LIZJ, ((C380190EvR) ListProtector.get(this.LIZIZ, i3)).LIZJ);
            }

            {
                this.LIZ = arrayList;
                this.LIZIZ = list;
                this.LIZJ = str2;
                this.LIZLLL = str;
            }
        }, true);
        ((ArrayList) c380720EwI.LLILLJJLI).clear();
        ((ArrayList) c380720EwI.LLILLJJLI).addAll(list);
        c380720EwI.LLILLL = str;
        c21341918fZLIZ.LIZJ(c380720EwI);
        this.LLILZIL.put(i, c380720EwI);
        RecyclerView recyclerView = new RecyclerView(context);
        C786410Ut5.p6(recyclerView, new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(c380720EwI);
        viewGroup.addView(recyclerView);
        return recyclerView;
    }

    public C380650EwB(Context context, List list, AwS619S0100000_5 awS619S0100000_5) {
        this.LLILLJJLI = context;
        this.LLILLL = list;
        this.LLILZ = awS619S0100000_5;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        this.LLILZIL.remove(i);
        C786410Ut5.LJJJLZIJ((View) obj, viewGroup);
    }
}
