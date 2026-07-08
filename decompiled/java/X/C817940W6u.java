package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0W6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817940W6u {
    public static int LJJ(int i, Parcel parcel) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void LJJI(int i, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void LIZ(Parcel parcel, int i, boolean z) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void LIZIZ(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        parcel.writeInt(i | 262144);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void LIZJ(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iLJJ = LJJ(i, parcel);
        parcel.writeBundle(bundle);
        LJJI(iLJJ, parcel);
    }

    public static void LIZLLL(Parcel parcel, int i, byte b) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(b);
    }

    public static void LJFF(Parcel parcel, int i, double d) {
        parcel.writeInt(i | 524288);
        parcel.writeDouble(d);
    }

    public static void LJI(Parcel parcel, int i, Double d) {
        if (d == null) {
            return;
        }
        parcel.writeInt(i | 524288);
        parcel.writeDouble(d.doubleValue());
    }

    public static void LJII(Parcel parcel, int i, float f) {
        parcel.writeInt(i | 262144);
        parcel.writeFloat(f);
    }

    public static void LJIIIIZZ(Parcel parcel, int i, Float f) {
        if (f == null) {
            return;
        }
        parcel.writeInt(i | 262144);
        parcel.writeFloat(f.floatValue());
    }

    public static void LJIIIZ(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iLJJ = LJJ(i, parcel);
        parcel.writeStrongBinder(iBinder);
        LJJI(iLJJ, parcel);
    }

    public static void LJIIJ(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(i2);
    }

    public static void LJIIJJI(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iLJJ = LJJ(i, parcel);
        parcel.writeIntArray(iArr);
        LJJI(iLJJ, parcel);
    }

    public static void LJIIL(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iLJJ = LJJ(i, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) ListProtector.get(list, i2)).intValue());
        }
        LJJI(iLJJ, parcel);
    }

    public static void LJIILIIL(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        parcel.writeInt(i | 262144);
        parcel.writeInt(num.intValue());
    }

    public static void LJIILJJIL(int i, long j, Parcel parcel) {
        parcel.writeInt(i | 524288);
        parcel.writeLong(j);
    }

    public static void LJIILL(Parcel parcel, int i, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int iLJJ = LJJ(i, parcel);
        parcel.writeLongArray(jArr);
        LJJI(iLJJ, parcel);
    }

    public static void LJIILLIIL(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        parcel.writeInt(i | 524288);
        parcel.writeLong(l.longValue());
    }

    public static void LJIJI(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iLJJ = LJJ(i, parcel);
        parcel.writeStringArray(strArr);
        LJJI(iLJJ, parcel);
    }

    public static void LJIJJ(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iLJJ = LJJ(i, parcel);
        parcel.writeStringList(list);
        LJJI(iLJJ, parcel);
    }

    public static void LJJIFFI(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static void LJ(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                parcel.writeInt(i);
            }
        } else {
            int iLJJ = LJJ(i, parcel);
            parcel.writeByteArray(bArr);
            LJJI(iLJJ, parcel);
        }
    }

    public static void LJIJ(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                parcel.writeInt(i);
            }
        } else {
            int iLJJ = LJJ(i, parcel);
            parcel.writeString(str);
            LJJI(iLJJ, parcel);
        }
    }

    public static void LJIJJLI(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iLJJ = LJJ(i, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                LJJIFFI(parcel, parcelable, i2);
            }
        }
        LJJI(iLJJ, parcel);
    }

    public static <T extends Parcelable> void LJIL(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                parcel.writeInt(i);
                return;
            }
            return;
        }
        int iLJJ = LJJ(i, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) ListProtector.get(list, i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                LJJIFFI(parcel, parcelable, 0);
            }
        }
        LJJI(iLJJ, parcel);
    }

    public static void LJIIZILJ(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                parcel.writeInt(i);
            }
        } else {
            int iLJJ = LJJ(i, parcel);
            parcelable.writeToParcel(parcel, i2);
            LJJI(iLJJ, parcel);
        }
    }
}
