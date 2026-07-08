package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0l4A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343520l4A {
    public final RecyclerView LIZ;
    public int LJFF;
    public boolean LJII;
    public LinearLayoutManager LJIIIIZZ;
    public RecyclerView.RecycledViewPool LJIIIZ;
    public C21673319rv LJIIJ;
    public List<? extends RecyclerView.ViewHolder> LJIIJJI;
    public List<Integer> LJIIL;
    public Field LJIILIIL;
    public Field LJIILJJIL;
    public Field LJIILL;
    public boolean LJIILLIIL;
    public final Map<Integer, RecyclerView.ViewHolder> LIZIZ = new HashMap();
    public final Set<Integer> LIZJ = new HashSet();
    public final Set<Integer> LIZLLL = new HashSet();
    public final Map<Integer, Integer> LJ = new HashMap();
    public final int LJI = 5;
    public final boolean LJIIZILJ = true;
    public final int LJIJ = ((Number) C0A88.LIZ.getValue()).intValue();

    public final void LIZ() {
        if (!((HashMap) this.LIZIZ).isEmpty()) {
            try {
                if (this.LJIIIZ == null) {
                    RecyclerView recyclerView = this.LIZ;
                    this.LJIIIZ = recyclerView != null ? recyclerView.getRecycledViewPool() : null;
                }
                Iterator it2 = ((HashMap) this.LIZIZ).entrySet().iterator();
                while (it2.hasNext()) {
                    RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ((Map.Entry) it2.next()).getValue();
                    RecyclerView.RecycledViewPool recycledViewPool = this.LJIIIZ;
                    if (recycledViewPool != null) {
                        recycledViewPool.putRecycledView(viewHolder);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            ((HashMap) this.LIZIZ).clear();
        }
        if (!this.LIZJ.isEmpty()) {
            ((HashSet) this.LIZJ).clear();
        }
        ((HashSet) this.LIZLLL).clear();
        ((HashMap) this.LJ).clear();
    }

    public final void LIZJ() {
        RecyclerView recyclerView = this.LIZ;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        this.LJIIIIZZ = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        Field declaredField = RecyclerView.class.getDeclaredField("mRecycler");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(this.LIZ);
        this.LJIIJ = obj instanceof C21673319rv ? (C21673319rv) obj : null;
        Field declaredField2 = C21673319rv.class.getDeclaredField("LIZJ");
        declaredField2.setAccessible(true);
        Object obj2 = declaredField2.get(this.LJIIJ);
        this.LJIIJJI = obj2 instanceof List ? (List) obj2 : null;
        this.LJIIL = new ArrayList();
    }

    public C1343520l4A(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
        ((Number) C0A87.LIZ.getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJI(X.C1343520l4A r3, int r4) {
        /*
            java.util.Map<java.lang.Integer, androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r3.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = r1.containsKey(r0)
            r2 = 1
            if (r0 != 0) goto L1f
            java.util.List<java.lang.Integer> r1 = r3.LJIIL
            if (r1 == 0) goto L20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.contains(r0)
            if (r0 != r2) goto L20
        L1f:
            return r2
        L20:
            java.util.Set<java.lang.Integer> r1 = r3.LIZLLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.util.HashSet r1 = (java.util.HashSet) r1
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L1f
            java.util.Set<java.lang.Integer> r1 = r3.LIZJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.util.HashSet r1 = (java.util.HashSet) r1
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L1f
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1343520l4A.LJI(X.0l4A, int):boolean");
    }

    public final void LIZLLL(int i, int i2) {
        RecyclerView.RecycledViewPool recycledViewPool;
        if (((HashMap) this.LIZIZ).isEmpty()) {
            return;
        }
        if (this.LJIIIZ == null) {
            RecyclerView recyclerView = this.LIZ;
            if (recyclerView != null) {
                recycledViewPool = recyclerView.getRecycledViewPool();
            } else {
                recycledViewPool = null;
            }
            this.LJIIIZ = recycledViewPool;
        }
        int i3 = i2 + i;
        Iterator it2 = ((HashMap) this.LIZIZ).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) entry.getValue();
            if (i <= iIntValue && iIntValue < i3) {
                try {
                    RecyclerView.RecycledViewPool recycledViewPool2 = this.LJIIIZ;
                    if (recycledViewPool2 != null) {
                        recycledViewPool2.putRecycledView(viewHolder);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                ((HashSet) this.LIZJ).remove(Integer.valueOf(iIntValue));
                ((HashMap) this.LJ).remove(Integer.valueOf(iIntValue));
                it2.remove();
            }
        }
    }

    public final void LIZIZ(AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry, int i, int i2) throws IllegalAccessException, NoSuchFieldException {
        boolean z;
        View view;
        ViewGroup.LayoutParams layoutParams;
        RecyclerView recyclerView;
        RecyclerView.RecycledViewPool recycledViewPool;
        if (((HashSet) this.LIZJ).contains(Integer.valueOf(i2))) {
            return;
        }
        RecyclerView.ViewHolder viewHolderOnCreateViewHolder = null;
        if (this.LJIIIZ == null) {
            RecyclerView recyclerView2 = this.LIZ;
            if (recyclerView2 != null) {
                recycledViewPool = recyclerView2.getRecycledViewPool();
            } else {
                recycledViewPool = null;
            }
            this.LJIIIZ = recycledViewPool;
        }
        RecyclerView.RecycledViewPool recycledViewPool2 = this.LJIIIZ;
        if (recycledViewPool2 != null) {
            viewHolderOnCreateViewHolder = recycledViewPool2.getRecycledView(i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vh pos = ");
        sbLIZ.append(i2);
        sbLIZ.append(", type=");
        sbLIZ.append(i);
        sbLIZ.append(", From pool=");
        boolean z2 = false;
        if (viewHolderOnCreateViewHolder != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (viewHolderOnCreateViewHolder != null || ((recyclerView = this.LIZ) != null && (viewHolderOnCreateViewHolder = abstractC21673619ry.onCreateViewHolder(recyclerView, i)) != null)) {
            String name = viewHolderOnCreateViewHolder.getClass().getName();
            if (a0.LJJIIZI(name, "CommentItemCell", false) || a0.LJJIIZI(name, "CommentSecondaryItemCell", false)) {
                if (this.LJIILJJIL == null) {
                    Field declaredField = RecyclerView.ViewHolder.class.getDeclaredField("mItemViewType");
                    this.LJIILJJIL = declaredField;
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                    }
                }
                if (this.LJIILIIL == null) {
                    Field declaredField2 = RecyclerView.ViewHolder.class.getDeclaredField("mPosition");
                    this.LJIILIIL = declaredField2;
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                }
                Field field = this.LJIILJJIL;
                if (field != null) {
                    field.set(viewHolderOnCreateViewHolder, Integer.valueOf(i));
                }
                Field field2 = this.LJIILIIL;
                if (field2 != null) {
                    field2.set(viewHolderOnCreateViewHolder, Integer.valueOf(i2));
                }
                if (viewHolderOnCreateViewHolder != null && (view = viewHolderOnCreateViewHolder.itemView) != null) {
                    if (view.getLayoutParams() instanceof RecyclerView.LayoutParams) {
                        layoutParams = view.getLayoutParams();
                    } else {
                        layoutParams = new RecyclerView.LayoutParams(view.getLayoutParams());
                    }
                    C786410Ut5.W5(view, layoutParams);
                    if (this.LJIILL == null) {
                        Field declaredField3 = RecyclerView.LayoutParams.class.getDeclaredField("mViewHolder");
                        this.LJIILL = declaredField3;
                        if (declaredField3 != null) {
                            declaredField3.setAccessible(true);
                        }
                    }
                    Field field3 = this.LJIILL;
                    if (field3 != null) {
                        field3.set(layoutParams, viewHolderOnCreateViewHolder);
                    }
                    C21673319rv c21673319rv = this.LJIIJ;
                    if (c21673319rv != null) {
                        c21673319rv.LIZJ(i2, view);
                    }
                    ((HashMap) this.LIZIZ).put(Integer.valueOf(i2), viewHolderOnCreateViewHolder);
                    ((HashSet) this.LIZJ).add(Integer.valueOf(i2));
                    ((HashMap) this.LJ).put(Integer.valueOf(i2), Integer.valueOf(this.LJFF));
                    return;
                }
                return;
            }
        }
        ((HashSet) this.LIZLLL).add(Integer.valueOf(i2));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("disAllowedViewHolder vh pos = ");
        sbLIZ2.append(i2);
        sbLIZ2.append(", type=");
        sbLIZ2.append(i);
        sbLIZ2.append(", From pool=");
        if (viewHolderOnCreateViewHolder != null) {
            z2 = true;
        }
        sbLIZ2.append(z2);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (viewHolderOnCreateViewHolder != null) {
            try {
                RecyclerView.RecycledViewPool recycledViewPool3 = this.LJIIIZ;
                if (recycledViewPool3 != null) {
                    recycledViewPool3.putRecycledView(viewHolderOnCreateViewHolder);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void LJ(int i, C1343520l4A c1343520l4A, C118300cf c118300cf, AbstractC21673619ry abstractC21673619ry) throws IllegalAccessException, NoSuchFieldException {
        int i2 = i - c1343520l4A.LJIJ;
        int i3 = 0;
        if (i2 < 0) {
            i2 = 0;
        }
        int i4 = i - 1;
        if (i4 >= 0) {
            i3 = i4;
        }
        while (i3 >= i2 && c118300cf.element < 1) {
            if (c1343520l4A.LJIILLIIL && c1343520l4A.LJIIZILJ) {
                return;
            }
            if (!LJI(c1343520l4A, i3)) {
                c1343520l4A.LIZIZ(abstractC21673619ry, abstractC21673619ry.getItemViewType(i3), i3);
                if (((HashMap) c1343520l4A.LIZIZ).containsKey(Integer.valueOf(i3))) {
                    c118300cf.element++;
                }
            }
            i3--;
        }
    }

    public static final void LJFF(int i, int i2, C118300cf c118300cf, C1343520l4A c1343520l4A, AbstractC21673619ry abstractC21673619ry) throws IllegalAccessException, NoSuchFieldException {
        while (true) {
            i++;
            if (i < i2 && c118300cf.element < 1) {
                if (c1343520l4A.LJIILLIIL && c1343520l4A.LJIIZILJ) {
                    return;
                }
                if (!LJI(c1343520l4A, i)) {
                    c1343520l4A.LIZIZ(abstractC21673619ry, abstractC21673619ry.getItemViewType(i), i);
                    if (((HashMap) c1343520l4A.LIZIZ).containsKey(Integer.valueOf(i))) {
                        c118300cf.element++;
                    }
                }
            } else {
                return;
            }
        }
    }
}
