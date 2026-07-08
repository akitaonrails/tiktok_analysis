package X;

import Y.AComparatorS22S0000000_3;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import android.util.SparseArray;
import androidx.fragment.app.FragmentState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.08H7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08H7 {
    public static String LIZIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i / 1024.0f);
        sbLIZ.append("K");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static int LIZJ(Object obj) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeValue(obj);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            return iDataSize;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(Bundle bundle, StringBuilder sb, int i) {
        Class<Bundle> superclass = Bundle.class;
        do {
            try {
                Method declaredMethod = superclass.getDeclaredMethod("getMap", new Class[0]);
                declaredMethod.setAccessible(true);
                Map map = (Map) declaredMethod.invoke(bundle, new Object[0]);
                if (map != null) {
                    ArrayList<C08H6> arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(new C08H6(LIZJ(entry.getValue()), Pair.create(entry.getKey(), entry.getValue())));
                    }
                    Collections.sort(arrayList, new AComparatorS22S0000000_3(3));
                    for (C08H6 c08h6 : arrayList) {
                        Pair pair = (Pair) c08h6.LIZIZ;
                        String str = (String) pair.first;
                        Object obj = pair.second;
                        for (int i2 = 0; i2 < i; i2++) {
                            sb.append(' ');
                        }
                        sb.append("key: ");
                        sb.append(str);
                        sb.append(", size: ");
                        sb.append(LIZIZ(c08h6.LIZ));
                        sb.append('\n');
                        if (obj instanceof Bundle) {
                            LIZ((Bundle) obj, sb, i + 4);
                        } else if (obj instanceof FragmentState) {
                            FragmentState fragmentState = (FragmentState) obj;
                            int iLIZJ = LIZJ(fragmentState);
                            int i3 = i + 4;
                            for (int i4 = 0; i4 < i3; i4++) {
                                sb.append(' ');
                            }
                            sb.append("FragmentState: ");
                            sb.append(fragmentState.LL);
                            sb.append(", size: ");
                            sb.append(LIZIZ(iLIZJ));
                            sb.append('\n');
                        } else {
                            if (!(obj instanceof List)) {
                                if ((obj instanceof SparseArray) || (obj instanceof Parcelable[])) {
                                }
                            } else {
                                int i5 = 0;
                                while (true) {
                                    List list = (List) obj;
                                    if (i5 >= list.size()) {
                                        break;
                                    }
                                    Object obj2 = ListProtector.get(list, i5);
                                    if (obj2 instanceof Bundle) {
                                        LIZ((Bundle) obj2, sb, i + 4);
                                    }
                                    i5++;
                                }
                            }
                            if (obj instanceof SparseArray) {
                                int i6 = 0;
                                while (true) {
                                    SparseArray sparseArray = (SparseArray) obj;
                                    if (i6 >= sparseArray.size()) {
                                        break;
                                    }
                                    Object objValueAt = sparseArray.valueAt(i6);
                                    if (objValueAt instanceof Bundle) {
                                        LIZ((Bundle) objValueAt, sb, i + 4);
                                    }
                                    i6++;
                                }
                            }
                            if (obj instanceof Parcelable[]) {
                                int i7 = 0;
                                while (true) {
                                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                                    if (i7 < parcelableArr.length) {
                                        Parcelable parcelable = parcelableArr[i7];
                                        if (parcelable instanceof Bundle) {
                                            LIZ((Bundle) parcelable, sb, i + 4);
                                        }
                                        i7++;
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    return;
                }
            }
        } while (superclass != Object.class);
    }
}
