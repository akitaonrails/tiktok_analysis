package X;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* JADX INFO: renamed from: X.13FV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13FV {
    public static final Class<? extends Object>[] LIZ = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean LIZ(Object obj) {
        if (obj instanceof C13FO) {
            C13FO c13fo = (C13FO) obj;
            if (c13fo.LJFF() != C13FT.LIZ && c13fo.LJFF() != C595410NWx.LIZ && c13fo.LJFF() != C631860OqO.LIZ) {
                return false;
            }
            T value = c13fo.getValue();
            if (value == 0) {
                return true;
            }
            return LIZ(value);
        }
        if ((obj instanceof InterfaceC1451105m9) && (obj instanceof Serializable)) {
            return false;
        }
        Class<? extends Object>[] clsArr = LIZ;
        int i = 0;
        while (!clsArr[i].isInstance(obj)) {
            i++;
            if (i >= 7) {
                return false;
            }
        }
        return true;
    }
}
