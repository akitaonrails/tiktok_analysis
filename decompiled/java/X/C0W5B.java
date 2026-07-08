package X;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import androidx.browser.customtabs.CustomTabsService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0W5B, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0W5B extends Binder implements C0W53 {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C0W5B() {
        attachInterface(this, "android.support.customtabs.ICustomTabsService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Uri uri;
        Uri uri2;
        if (i != 1598968902) {
            Bundle bundle = null;
            Bundle bundle2 = null;
            Bundle bundle3 = null;
            Uri uri3 = null;
            Bundle bundle4 = null;
            Bundle bundle5 = null;
            Bundle bundle6 = null;
            Bundle bundle7 = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zLLLIIIIL = ((C0W5C) this).LLLIIIIL(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zLLLIIIIL ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zLLILLIZIL = ((C0W5C) this).LLILLIZIL(C0W55.LJJJZ(parcel.readStrongBinder()), null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zLLILLIZIL ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC2463809l6 interfaceC2463809l6LJJJZ = C0W55.LJJJZ(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    } else {
                        uri2 = null;
                    }
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    boolean zC = ((C0W5C) this).c(interfaceC2463809l6LJJJZ, uri2, bundle2, parcel.createTypedArrayList(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zC ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    Bundle bundleLIZ = ((C0W5C) this).LLILLJJLI.LIZ();
                    parcel2.writeNoException();
                    if (bundleLIZ != null) {
                        parcel2.writeInt(1);
                        bundleLIZ.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC2463809l6 interfaceC2463809l6LJJJZ2 = C0W55.LJJJZ(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    CustomTabsService customTabsService = ((C0W5C) this).LLILLJJLI;
                    new C2464009l8(interfaceC2463809l6LJJJZ2, C0W5C.LJJJZ(bundle3));
                    boolean zLJI = customTabsService.LJI();
                    parcel2.writeNoException();
                    parcel2.writeInt(zLJI ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC2463809l6 interfaceC2463809l6LJJJZ3 = C0W55.LJJJZ(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        uri3 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    boolean zLLJJL = ((C0W5C) this).LLJJL(interfaceC2463809l6LJJJZ3, uri3);
                    parcel2.writeNoException();
                    parcel2.writeInt(zLLJJL ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC2463809l6 interfaceC2463809l6LJJJZ4 = C0W55.LJJJZ(parcel.readStrongBinder());
                    String string = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    int iO = ((C0W5C) this).o(interfaceC2463809l6LJJJZ4, string, bundle4);
                    parcel2.writeNoException();
                    parcel2.writeInt(iO);
                    return true;
                case BdTuring.TYPE_ECAF /* 9 */:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC2463809l6 interfaceC2463809l6LJJJZ5 = C0W55.LJJJZ(parcel.readStrongBinder());
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        Uri.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    CustomTabsService customTabsService2 = ((C0W5C) this).LLILLJJLI;
                    new C2464009l8(interfaceC2463809l6LJJJZ5, C0W5C.LJJJZ(bundle5));
                    boolean zLJII = customTabsService2.LJII();
                    parcel2.writeNoException();
                    parcel2.writeInt(zLJII ? 1 : 0);
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC2463809l6 interfaceC2463809l6LJJJZ6 = C0W55.LJJJZ(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    boolean zLLILLIZIL2 = ((C0W5C) this).LLILLIZIL(interfaceC2463809l6LJJJZ6, C0W5C.LJJJZ(bundle6));
                    parcel2.writeNoException();
                    parcel2.writeInt(zLLILLIZIL2 ? 1 : 0);
                    return true;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC2463809l6 interfaceC2463809l6LJJJZ7 = C0W55.LJJJZ(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    } else {
                        uri = null;
                    }
                    if (parcel.readInt() != 0) {
                        bundle7 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    boolean zLLJILJIL = ((C0W5C) this).LLJILJIL(interfaceC2463809l6LJJJZ7, uri, bundle7);
                    parcel2.writeNoException();
                    parcel2.writeInt(zLLJILJIL ? 1 : 0);
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC2463809l6 interfaceC2463809l6LJJJZ8 = C0W55.LJJJZ(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        Uri.CREATOR.createFromParcel(parcel);
                    }
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    CustomTabsService customTabsService3 = ((C0W5C) this).LLILLJJLI;
                    new C2464009l8(interfaceC2463809l6LJJJZ8, C0W5C.LJJJZ(bundle));
                    boolean zLJ = customTabsService3.LJ();
                    parcel2.writeNoException();
                    parcel2.writeInt(zLJ ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("android.support.customtabs.ICustomTabsService");
        return true;
    }
}
