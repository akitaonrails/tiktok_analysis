package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Zi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20031613Zi {
    public final int LIZ = 0;
    public ArrayList<Object> LIZIZ;

    public final C20031613Zi LIZIZ() {
        Object obj;
        C20031613Zi c20031613Zi;
        C20031613Zi c20031613ZiLIZIZ;
        ArrayList<Object> arrayList = this.LIZIZ;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = ListProtector.get(arrayList, size);
                if (obj instanceof C20031613Zi) {
                    obj.getClass();
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        return (!(obj instanceof C20031613Zi) || (c20031613Zi = (C20031613Zi) obj) == null || (c20031613ZiLIZIZ = c20031613Zi.LIZIZ()) == null) ? this : c20031613ZiLIZIZ;
    }

    public final boolean LIZ(C13Z7 c13z7) {
        ArrayList<Object> arrayList = this.LIZIZ;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(arrayList, i);
            if (Intrinsics.LJFF(obj, c13z7) || ((obj instanceof C20031613Zi) && ((C20031613Zi) obj).LIZ(c13z7))) {
                return true;
            }
        }
        return false;
    }

    public final boolean LIZJ(C13Z7 c13z7) {
        ArrayList<Object> arrayList = this.LIZIZ;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = ListProtector.get(arrayList, size);
                if (obj instanceof C13Z7) {
                    if (Intrinsics.LJFF(obj, c13z7)) {
                        ListProtector.remove(arrayList, size);
                    }
                } else if ((obj instanceof C20031613Zi) && !((C20031613Zi) obj).LIZJ(c13z7)) {
                    ListProtector.remove(arrayList, size);
                }
            }
            if (arrayList.isEmpty()) {
                this.LIZIZ = null;
                return false;
            }
        }
        return true;
    }
}
