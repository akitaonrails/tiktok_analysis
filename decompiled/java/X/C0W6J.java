package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0W6J, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W6J {
    public static int LJJIII(Parcel parcel) {
        int i = parcel.readInt();
        int iLJJIFFI = LJJIFFI(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (((char) i) == 20293) {
            int i2 = iLJJIFFI + iDataPosition;
            if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
                return i2;
            }
            throw new C816410W0x("Size read is invalid start=" + iDataPosition + " end=" + i2, parcel);
        }
        throw new C816410W0x("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
    }

    public static BigDecimal LIZ(int i, Parcel parcel) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iLJJIFFI == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i2 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iLJJIFFI);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i2);
    }

    public static Bundle LIZIZ(int i, Parcel parcel) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iLJJIFFI == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iLJJIFFI);
        return bundle;
    }

    public static byte[] LIZJ(int i, Parcel parcel) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iLJJIFFI == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iLJJIFFI);
        return bArrCreateByteArray;
    }

    public static int[] LIZLLL(int i, Parcel parcel) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iLJJIFFI == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iLJJIFFI);
        return iArrCreateIntArray;
    }

    public static ArrayList LJ(int i, Parcel parcel) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iLJJIFFI == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iLJJIFFI);
        return arrayList;
    }

    public static long[] LJFF(int i, Parcel parcel) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iLJJIFFI == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iLJJIFFI);
        return jArrCreateLongArray;
    }

    public static String LJII(int i, Parcel parcel) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iLJJIFFI == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iLJJIFFI);
        return string;
    }

    public static String[] LJIIIIZZ(int i, Parcel parcel) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iLJJIFFI == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iLJJIFFI);
        return strArrCreateStringArray;
    }

    public static ArrayList LJIIIZ(int i, Parcel parcel) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iLJJIFFI == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iLJJIFFI);
        return arrayListCreateStringArrayList;
    }

    public static void LJIIL(int i, Parcel parcel) {
        if (parcel.dataPosition() == i) {
            return;
        }
        throw new C816410W0x("Overread allowed size end=" + i, parcel);
    }

    public static boolean LJIILIIL(int i, Parcel parcel) {
        LJJIIJZLJL(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Boolean LJIILJJIL(int i, Parcel parcel) {
        boolean z;
        int iLJJIFFI = LJJIFFI(i, parcel);
        if (iLJJIFFI == 0) {
            return null;
        }
        LJJIIJ(parcel, iLJJIFFI, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static byte LJIILL(int i, Parcel parcel) {
        LJJIIJZLJL(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double LJIILLIIL(int i, Parcel parcel) {
        LJJIIJZLJL(parcel, i, 8);
        return parcel.readDouble();
    }

    public static Double LJIIZILJ(int i, Parcel parcel) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        if (iLJJIFFI == 0) {
            return null;
        }
        LJJIIJ(parcel, iLJJIFFI, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float LJIJ(int i, Parcel parcel) {
        LJJIIJZLJL(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float LJIJI(int i, Parcel parcel) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        if (iLJJIFFI == 0) {
            return null;
        }
        LJJIIJ(parcel, iLJJIFFI, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder LJIJJ(int i, Parcel parcel) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iLJJIFFI == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iLJJIFFI);
        return strongBinder;
    }

    public static int LJIJJLI(int i, Parcel parcel) {
        LJJIIJZLJL(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer LJIL(int i, Parcel parcel) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        if (iLJJIFFI == 0) {
            return null;
        }
        LJJIIJ(parcel, iLJJIFFI, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long LJJ(int i, Parcel parcel) {
        LJJIIJZLJL(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long LJJI(int i, Parcel parcel) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        if (iLJJIFFI == 0) {
            return null;
        }
        LJJIIJ(parcel, iLJJIFFI, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int LJJIFFI(int i, Parcel parcel) {
        if ((i & (-65536)) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static void LJJII(int i, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + LJJIFFI(i, parcel));
    }

    public static <T extends Parcelable> T LJI(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iLJJIFFI == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iLJJIFFI);
        return tCreateFromParcel;
    }

    public static <T> T[] LJIIJ(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iLJJIFFI == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iLJJIFFI);
        return tArr;
    }

    public static <T> ArrayList<T> LJIIJJI(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iLJJIFFI == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iLJJIFFI);
        return arrayListCreateTypedArrayList;
    }

    public static void LJJIIJ(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new C816410W0x("Expected size " + i2 + " got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
    }

    public static void LJJIIJZLJL(Parcel parcel, int i, int i2) {
        int iLJJIFFI = LJJIFFI(i, parcel);
        if (iLJJIFFI == i2) {
            return;
        }
        throw new C816410W0x("Expected size " + i2 + " got " + iLJJIFFI + " (0x" + Integer.toHexString(iLJJIFFI) + ")", parcel);
    }
}
