package androidx.compose.runtime;

import X.C13FE;
import X.C13FF;
import X.C13FT;
import X.C13FU;
import X.C595410NWx;
import X.C631860OqO;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ParcelableSnapshotMutableState<T> extends C13FE<T> implements Parcelable {
    public static final C13FU Companion = new Object() { // from class: X.13FU
    };
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>>() { // from class: X.13FS
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return LIZ(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }

        public static ParcelableSnapshotMutableState LIZ(Parcel parcel, ClassLoader classLoader) {
            C13FF c13ff;
            if (classLoader == null) {
                classLoader = C13FS.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i = parcel.readInt();
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        c13ff = C631860OqO.LIZ;
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unsupported MutableState policy ");
                        sbLIZ.append(i);
                        sbLIZ.append(" was restored");
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    c13ff = C595410NWx.LIZ;
                }
            } else {
                c13ff = C13FT.LIZ;
            }
            return new ParcelableSnapshotMutableState(value, c13ff);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return LIZ(parcel, classLoader);
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableState(T t, C13FF<T> c13ff) {
        super(t, c13ff);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        C13FF<T> c13ffLJFF = LJFF();
        if (Intrinsics.LJFF(c13ffLJFF, C13FT.LIZ)) {
            i2 = 0;
        } else if (Intrinsics.LJFF(c13ffLJFF, C595410NWx.LIZ)) {
            i2 = 1;
        } else if (Intrinsics.LJFF(c13ffLJFF, C631860OqO.LIZ)) {
            i2 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i2);
    }
}
