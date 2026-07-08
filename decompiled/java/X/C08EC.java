package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08EC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08EC {
    public static final <E> E[] LIZ(int i) {
        if (i >= 0) {
            return (E[]) new Object[i];
        }
        "capacity must be non-negative.".toString();
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final void LIZIZ(int i, int i2, Object[] objArr) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final <T> boolean LIZJ(T[] tArr, int i, int i2, List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!Intrinsics.LJFF(tArr[i + i3], ListProtector.get(list, i3))) {
                return false;
            }
        }
        return true;
    }

    public static final <T> String LIZLLL(T[] tArr, int i, int i2, Collection<? extends T> collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append(e3.e);
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            T t = tArr[i + i3];
            if (t == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(t);
            }
        }
        sb.append(e3.f);
        return sb.toString();
    }
}
