package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1B5H, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B5H extends Binder implements C1B5G {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C1B5H() {
        attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
        ClassLoader classLoader = getClass().getClassLoader();
        ((C1B5R) this).LJLLL(parcel.readHashMap(classLoader), parcel.readHashMap(classLoader), parcel.readHashMap(classLoader));
        parcel2.writeNoException();
        return true;
    }
}
