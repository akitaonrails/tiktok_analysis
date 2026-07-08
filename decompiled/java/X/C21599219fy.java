package X;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: X.19fy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21599219fy<T> implements Parcelable.ClassLoaderCreator<T> {
    public final InterfaceC21599319fz<T> LIZ;

    public C21599219fy(InterfaceC21599319fz<T> interfaceC21599319fz) {
        this.LIZ = interfaceC21599319fz;
    }

    @Override // android.os.Parcelable.Creator
    public final T createFromParcel(Parcel parcel) {
        return this.LIZ.createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final T[] newArray(int i) {
        return this.LIZ.newArray(i);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final T createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.LIZ.createFromParcel(parcel, classLoader);
    }
}
