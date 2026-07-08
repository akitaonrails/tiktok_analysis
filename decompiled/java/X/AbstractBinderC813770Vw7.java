package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.service.notification.StatusBarNotification;
import androidx.browser.trusted.TrustedWebActivityService;

/* JADX INFO: renamed from: X.0Vw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractBinderC813770Vw7 extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC813770Vw7() {
        attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterfaceQueryLocalInterface;
        NotificationChannel notificationChannel;
        Bundle bundle;
        boolean z = false;
        Bundle bundle2 = null;
        Notification notificationBuild = null;
        Bundle bundle3 = null;
        if (i != 9) {
            if (i != 1598968902) {
                switch (i) {
                    case 2:
                        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        } else {
                            bundle = null;
                        }
                        BinderC2456109jr binderC2456109jr = (BinderC2456109jr) this;
                        binderC2456109jr.LJJJZ();
                        C814450VxD.LIZ(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
                        C814450VxD.LIZ(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
                        C814450VxD.LIZ(bundle, "android.support.customtabs.trusted.NOTIFICATION");
                        C814450VxD.LIZ(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
                        String string = bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG");
                        int i3 = bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID");
                        Notification notification = (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION");
                        String string2 = bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME");
                        TrustedWebActivityService trustedWebActivityService = binderC2456109jr.LL;
                        trustedWebActivityService.LIZIZ();
                        if (new C815520Vyw(trustedWebActivityService).LIZ()) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                String strLIZ = TrustedWebActivityService.LIZ(string2);
                                NotificationManager notificationManager = trustedWebActivityService.LL;
                                notificationManager.createNotificationChannel(new NotificationChannel(strLIZ, string2, 3));
                                if (notificationManager.getNotificationChannel(strLIZ).getImportance() != 0) {
                                    Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(trustedWebActivityService, notification);
                                    builderRecoverBuilder.setChannelId(strLIZ);
                                    notificationBuild = builderRecoverBuilder.build();
                                }
                                NotificationChannel notificationChannel2 = trustedWebActivityService.LL.getNotificationChannel(strLIZ);
                                if (notificationChannel2 == null || notificationChannel2.getImportance() != 0) {
                                    notification = notificationBuild;
                                    trustedWebActivityService.LL.notify(string, i3, notification);
                                    z = true;
                                }
                            } else {
                                trustedWebActivityService.LL.notify(string, i3, notification);
                                z = true;
                            }
                        }
                        Bundle bundle4 = new Bundle();
                        bundle4.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", z);
                        parcel2.writeNoException();
                        parcel2.writeInt(1);
                        bundle4.writeToParcel(parcel2, 1);
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                        if (parcel.readInt() != 0) {
                            bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        BinderC2456109jr binderC2456109jr2 = (BinderC2456109jr) this;
                        binderC2456109jr2.LJJJZ();
                        C814450VxD.LIZ(bundle3, "android.support.customtabs.trusted.PLATFORM_TAG");
                        C814450VxD.LIZ(bundle3, "android.support.customtabs.trusted.PLATFORM_ID");
                        String string3 = bundle3.getString("android.support.customtabs.trusted.PLATFORM_TAG");
                        int i4 = bundle3.getInt("android.support.customtabs.trusted.PLATFORM_ID");
                        TrustedWebActivityService trustedWebActivityService2 = binderC2456109jr2.LL;
                        trustedWebActivityService2.LIZIZ();
                        trustedWebActivityService2.LL.cancel(string3, i4);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                        BinderC2456109jr binderC2456109jr3 = (BinderC2456109jr) this;
                        binderC2456109jr3.LJJJZ();
                        int iLIZLLL = binderC2456109jr3.LL.LIZLLL();
                        parcel2.writeNoException();
                        parcel2.writeInt(iLIZLLL);
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                        BinderC2456109jr binderC2456109jr4 = (BinderC2456109jr) this;
                        binderC2456109jr4.LJJJZ();
                        TrustedWebActivityService trustedWebActivityService3 = binderC2456109jr4.LL;
                        trustedWebActivityService3.LIZIZ();
                        StatusBarNotification[] activeNotifications = trustedWebActivityService3.LL.getActiveNotifications();
                        Bundle bundle5 = new Bundle();
                        C786410Ut5.LJJIJLIJ(bundle5, "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", activeNotifications);
                        parcel2.writeNoException();
                        parcel2.writeInt(1);
                        bundle5.writeToParcel(parcel2, 1);
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        BinderC2456109jr binderC2456109jr5 = (BinderC2456109jr) this;
                        binderC2456109jr5.LJJJZ();
                        C814450VxD.LIZ(bundle2, "android.support.customtabs.trusted.CHANNEL_NAME");
                        String string4 = bundle2.getString("android.support.customtabs.trusted.CHANNEL_NAME");
                        TrustedWebActivityService trustedWebActivityService4 = binderC2456109jr5.LL;
                        trustedWebActivityService4.LIZIZ();
                        if (new C815520Vyw(trustedWebActivityService4).LIZ() && (Build.VERSION.SDK_INT < 26 || (notificationChannel = trustedWebActivityService4.LL.getNotificationChannel(TrustedWebActivityService.LIZ(string4))) == null || notificationChannel.getImportance() != 0)) {
                            z = true;
                        }
                        Bundle bundle6 = new Bundle();
                        bundle6.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", z);
                        parcel2.writeNoException();
                        parcel2.writeInt(1);
                        bundle6.writeToParcel(parcel2, 1);
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                        BinderC2456109jr binderC2456109jr6 = (BinderC2456109jr) this;
                        binderC2456109jr6.LJJJZ();
                        TrustedWebActivityService trustedWebActivityService5 = binderC2456109jr6.LL;
                        int iLIZLLL2 = trustedWebActivityService5.LIZLLL();
                        Bundle bundle7 = new Bundle();
                        if (iLIZLLL2 != -1) {
                            C786410Ut5.LJJIJL(bundle7, "android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(trustedWebActivityService5.getResources(), iLIZLLL2));
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(1);
                        bundle7.writeToParcel(parcel2, 1);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityService");
            return true;
        }
        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
        parcel.readString();
        if (parcel.readInt() != 0) {
            Bundle.CREATOR.createFromParcel(parcel);
        }
        final IBinder strongBinder = parcel.readStrongBinder();
        BinderC2456109jr binderC2456109jr7 = (BinderC2456109jr) this;
        binderC2456109jr7.LJJJZ();
        TrustedWebActivityService trustedWebActivityService6 = binderC2456109jr7.LL;
        if (strongBinder != null && ((iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback")) == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC813790Vw9))) {
            new InterfaceC813790Vw9(strongBinder) { // from class: X.0Vw8
                public final IBinder LL;

                @Override // android.os.IInterface
                public final IBinder asBinder() {
                    return this.LL;
                }

                {
                    this.LL = strongBinder;
                }
            };
        }
        trustedWebActivityService6.getClass();
        parcel2.writeNoException();
        parcel2.writeInt(0);
        return true;
    }
}
