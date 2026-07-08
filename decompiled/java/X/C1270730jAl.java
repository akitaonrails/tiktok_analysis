package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0jAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270730jAl {
    public static TEFrameSizei LIZ(int i, int i2, boolean z, List list) {
        int i3;
        boolean z2 = false;
        if (z) {
            double d = (((double) i2) * 1.0d) / ((double) i);
            for (int size = list.size() - 1; size >= 0; size--) {
                TEFrameSizei tEFrameSizei = (TEFrameSizei) ListProtector.get(list, size);
                int i4 = tEFrameSizei.width;
                if (i4 >= i && (i3 = tEFrameSizei.height) >= i2) {
                    if (i4 > i * 2) {
                        break;
                    }
                    if (Double.doubleToLongBits(d) == Double.doubleToLongBits((((double) i3) * 1.0d) / ((double) i4))) {
                        return tEFrameSizei;
                    }
                }
            }
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                TEFrameSizei tEFrameSizei2 = (TEFrameSizei) ListProtector.get(list, size2);
                if (tEFrameSizei2.width >= i && tEFrameSizei2.height >= i2) {
                    return tEFrameSizei2;
                }
            }
        }
        Iterator it2 = list.iterator();
        boolean z3 = false;
        boolean z4 = false;
        while (it2.hasNext()) {
            TEFrameSizei tEFrameSizei3 = (TEFrameSizei) it2.next();
            int i5 = tEFrameSizei3.width;
            if (i5 == i && tEFrameSizei3.height == i2) {
                return tEFrameSizei3;
            }
            if (i5 == 960) {
                if (tEFrameSizei3.height == 540) {
                    z2 = true;
                }
            } else if (i5 == 1280) {
                if (tEFrameSizei3.height == 720) {
                    z3 = true;
                }
            } else if (i5 == 1920 && tEFrameSizei3.height == 1080) {
                z4 = true;
            }
        }
        if (z2 && i <= 960 && i2 <= 540) {
            return new TEFrameSizei(960, 540);
        }
        if (z3 && i <= 1280 && i2 <= 720) {
            return new TEFrameSizei(1280, 720);
        }
        if (!z4 || i > 1920 || i2 > 1080) {
            return null;
        }
        return new TEFrameSizei(1920, 1080);
    }
}
