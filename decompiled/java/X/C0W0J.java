package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: renamed from: X.0W0J, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W0J {
    public static <T extends SafeParcelable> T LIZ(byte[] bArr, Parcelable.Creator<T> creator) {
        C0W3J.LJIIIIZZ(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    public static <T extends SafeParcelable> T LIZIZ(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) LIZ(byteArrayExtra, creator);
    }
}
