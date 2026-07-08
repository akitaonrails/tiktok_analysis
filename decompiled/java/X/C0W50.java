package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0W50, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0W50 implements ServiceConnection {
    public Context mApplicationContext;

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, C817470W4z c817470W4z);

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(final ComponentName componentName, final IBinder iBinder) throws Throwable {
        final C0W53 c0w53;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "androidx/browser/customtabs/CustomTabsServiceConnection", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dTF6Tg0zW9KSV0UuUgGBdArd5WzTSLJm2jdlfRR5yJDnfYZwDzYlx9ioJnCLixW6qbU6SyX8+w==", new String[]{"01789"})));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                componentName = (ComponentName) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                iBinder = (IBinder) obj2;
            }
        }
        if (this.mApplicationContext != null) {
            if (iBinder == null) {
                c0w53 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof C0W53)) {
                    c0w53 = (C0W53) iInterfaceQueryLocalInterface;
                } else {
                    c0w53 = new C0W53(iBinder) { // from class: X.0W52
                        public final IBinder LL;

                        @Override // android.os.IInterface
                        public final IBinder asBinder() {
                            return this.LL;
                        }

                        {
                            this.LL = iBinder;
                        }

                        @Override // X.C0W53
                        public final boolean LLFII(C0W56 c0w56) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                                parcelObtain.writeStrongBinder(c0w56);
                                boolean z = false;
                                this.LL.transact(3, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() != 0) {
                                    z = true;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C0W53
                        public final boolean LLLIIIIL(long j) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                                parcelObtain.writeLong(j);
                                boolean z = false;
                                this.LL.transact(2, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() != 0) {
                                    z = true;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C0W53
                        public final boolean LLJJL(InterfaceC2463809l6 interfaceC2463809l6, Uri uri) {
                            IBinder iBinderAsBinder;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                                if (interfaceC2463809l6 == null) {
                                    iBinderAsBinder = null;
                                } else {
                                    iBinderAsBinder = interfaceC2463809l6.asBinder();
                                }
                                parcelObtain.writeStrongBinder(iBinderAsBinder);
                                boolean z = true;
                                if (uri == null) {
                                    parcelObtain.writeInt(0);
                                } else {
                                    parcelObtain.writeInt(1);
                                    uri.writeToParcel(parcelObtain, 0);
                                }
                                this.LL.transact(7, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() == 0) {
                                    z = false;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C0W53
                        public final boolean LLJILJIL(InterfaceC2463809l6 interfaceC2463809l6, Uri uri, Bundle bundle) {
                            IBinder iBinderAsBinder;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                                if (interfaceC2463809l6 == null) {
                                    iBinderAsBinder = null;
                                } else {
                                    iBinderAsBinder = interfaceC2463809l6.asBinder();
                                }
                                parcelObtain.writeStrongBinder(iBinderAsBinder);
                                boolean z = true;
                                if (uri != null) {
                                    parcelObtain.writeInt(1);
                                    uri.writeToParcel(parcelObtain, 0);
                                } else {
                                    parcelObtain.writeInt(0);
                                }
                                if (bundle == null) {
                                    parcelObtain.writeInt(0);
                                } else {
                                    parcelObtain.writeInt(1);
                                    bundle.writeToParcel(parcelObtain, 0);
                                }
                                this.LL.transact(11, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() == 0) {
                                    z = false;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C0W53
                        public final int o(InterfaceC2463809l6 interfaceC2463809l6, String str, Bundle bundle) {
                            IBinder iBinderAsBinder;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                                if (interfaceC2463809l6 == null) {
                                    iBinderAsBinder = null;
                                } else {
                                    iBinderAsBinder = interfaceC2463809l6.asBinder();
                                }
                                parcelObtain.writeStrongBinder(iBinderAsBinder);
                                parcelObtain.writeString(str);
                                if (bundle == null) {
                                    parcelObtain.writeInt(0);
                                } else {
                                    parcelObtain.writeInt(1);
                                    bundle.writeToParcel(parcelObtain, 0);
                                }
                                this.LL.transact(8, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                int i = parcelObtain2.readInt();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return i;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }

                        @Override // X.C0W53
                        public final boolean c(InterfaceC2463809l6 interfaceC2463809l6, Uri uri, Bundle bundle, List<Bundle> list) {
                            IBinder iBinderAsBinder;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                                if (interfaceC2463809l6 == null) {
                                    iBinderAsBinder = null;
                                } else {
                                    iBinderAsBinder = interfaceC2463809l6.asBinder();
                                }
                                parcelObtain.writeStrongBinder(iBinderAsBinder);
                                boolean z = true;
                                if (uri != null) {
                                    parcelObtain.writeInt(1);
                                    uri.writeToParcel(parcelObtain, 0);
                                } else {
                                    parcelObtain.writeInt(0);
                                }
                                if (bundle == null) {
                                    parcelObtain.writeInt(0);
                                } else {
                                    parcelObtain.writeInt(1);
                                    bundle.writeToParcel(parcelObtain, 0);
                                }
                                parcelObtain.writeTypedList(list);
                                this.LL.transact(4, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                if (parcelObtain2.readInt() == 0) {
                                    z = false;
                                }
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                return z;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        }
                    };
                }
            }
            onCustomTabsServiceConnected(componentName, new C817470W4z(c0w53, componentName) { // from class: X.0W51
            });
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
