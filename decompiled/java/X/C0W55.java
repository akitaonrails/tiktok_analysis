package X;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0W55, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0W55 extends Binder implements InterfaceC2463809l6 {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C0W55() {
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
    }

    public static InterfaceC2463809l6 LJJJZ(final IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC2463809l6)) {
            return (InterfaceC2463809l6) iInterfaceQueryLocalInterface;
        }
        return new InterfaceC2463809l6(iBinder) { // from class: X.0W54
            public final IBinder LL;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.LL;
            }

            {
                this.LL = iBinder;
            }

            @Override // X.InterfaceC2463809l6
            public final void LLJILJILJ(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.LL.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // X.InterfaceC2463809l6
            public final void LLJZIJLIL(Bundle bundle, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.LL.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // X.InterfaceC2463809l6
            public final void LLLFZ(Bundle bundle, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.LL.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // X.InterfaceC2463809l6
            public final void LLLILZJ(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.LL.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // X.InterfaceC2463809l6
            public final Bundle u(Bundle bundle, String str) {
                Bundle bundle2;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeString(str);
                    if (bundle == null) {
                        parcelObtain.writeInt(0);
                    } else {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    }
                    this.LL.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2);
                    } else {
                        bundle2 = null;
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return bundle2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // X.InterfaceC2463809l6
            public final void LLLLLZL(int i, Uri uri, boolean z, Bundle bundle) {
                int i2;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeInt(i);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    parcelObtain.writeInt(i2);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.LL.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        };
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Uri uri;
        if (i != 1598968902) {
            boolean z = false;
            Bundle bundle = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    int i3 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    ((C0W56) this).LLLILZJ(i3, bundle);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    String string = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    ((C0W56) this).LLJZIJLIL(bundle, string);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    ((C0W56) this).LLJILJILJ(bundle);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    String string2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    ((C0W56) this).LLLFZ(bundle, string2);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    int i4 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    } else {
                        uri = null;
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    ((C0W56) this).LLLLLZL(i4, uri, z, bundle);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    String string3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    Bundle bundleU = ((C0W56) this).u(bundle, string3);
                    parcel2.writeNoException();
                    if (bundleU != null) {
                        parcel2.writeInt(1);
                        bundleU.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
        return true;
    }
}
