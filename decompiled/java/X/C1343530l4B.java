package X;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0l4B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343530l4B extends RecyclerView.RecycledViewPool {
    public static Field LIZIZ;
    public static Field LIZJ;
    public static Field LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public InterfaceC1343210l3f LIZ;

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        Object obj;
        SparseArray sparseArray;
        Object obj2;
        Object obj3;
        ArrayList arrayList;
        Integer num;
        int itemViewType = viewHolder.getItemViewType();
        if (!LJ && !LJFF) {
            try {
                Field declaredField = RecyclerView.RecycledViewPool.class.getDeclaredField("mScrap");
                declaredField.setAccessible(true);
                LIZIZ = declaredField;
                Class<?> cls = Class.forName("androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData");
                Field declaredField2 = cls.getDeclaredField("mScrapHeap");
                declaredField2.setAccessible(true);
                LIZJ = declaredField2;
                Field declaredField3 = cls.getDeclaredField("mMaxScrap");
                declaredField3.setAccessible(true);
                LIZLLL = declaredField3;
                LJ = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJFF = true;
            }
        }
        if (!LJFF) {
            try {
                Field field = LIZIZ;
                Object obj4 = null;
                if (field != null) {
                    obj = field.get(this);
                } else {
                    obj = null;
                }
                if ((obj instanceof SparseArray) && (sparseArray = (SparseArray) obj) != null && (obj2 = sparseArray.get(itemViewType)) != null) {
                    Field field2 = LIZJ;
                    if (field2 != null) {
                        obj3 = field2.get(obj2);
                    } else {
                        obj3 = null;
                    }
                    if ((obj3 instanceof ArrayList) && (arrayList = (ArrayList) obj3) != null) {
                        Field field3 = LIZLLL;
                        if (field3 != null) {
                            obj4 = field3.get(obj2);
                        }
                        if ((obj4 instanceof Integer) && (num = (Integer) obj4) != null) {
                            if (num.intValue() <= arrayList.size()) {
                                if (viewHolder instanceof PowerCell) {
                                    try {
                                        ((PowerCell) viewHolder).dispatchDestroy();
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                    }
                                }
                                InterfaceC1343210l3f interfaceC1343210l3f = this.LIZ;
                                if (interfaceC1343210l3f != null) {
                                    interfaceC1343210l3f.LIZ(viewHolder);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        super.putRecycledView(viewHolder);
    }
}
