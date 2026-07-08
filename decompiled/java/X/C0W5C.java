package X;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0W5C, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0W5C extends C0W5B {
    public final /* synthetic */ CustomTabsService LLILLJJLI;

    public C0W5C(CustomTabsService customTabsService) {
        this.LLILLJJLI = customTabsService;
    }

    public static PendingIntent LJJJZ(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
        bundle.remove("android.support.customtabs.extra.SESSION_ID");
        return pendingIntent;
    }

    @Override // X.C0W53
    public final boolean LLFII(C0W56 c0w56) {
        return LLILLIZIL(c0w56, null);
    }

    @Override // X.C0W53
    public final boolean LLLIIIIL(long j) {
        return this.LLILLJJLI.LJIIIIZZ();
    }

    public final boolean LLILLIZIL(InterfaceC2463809l6 interfaceC2463809l6, PendingIntent pendingIntent) {
        final C2464009l8 c2464009l8 = new C2464009l8(interfaceC2463809l6, pendingIntent);
        try {
            IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: X.0W5D
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    IBinder iBinderAsBinder;
                    C0W5C c0w5c = this.LL;
                    C2464009l8 c2464009l82 = c2464009l8;
                    CustomTabsService customTabsService = c0w5c.LLILLJJLI;
                    customTabsService.getClass();
                    try {
                        synchronized (customTabsService.LL) {
                            try {
                                InterfaceC2463809l6 interfaceC2463809l62 = c2464009l82.LIZ;
                                if (interfaceC2463809l62 == null || (iBinderAsBinder = interfaceC2463809l62.asBinder()) == null) {
                                    return;
                                }
                                iBinderAsBinder.unlinkToDeath(customTabsService.LL.get(iBinderAsBinder), 0);
                                customTabsService.LL.remove(iBinderAsBinder);
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    } catch (NoSuchElementException th) {
                    }
                }
            };
            synchronized (this.LLILLJJLI.LL) {
                try {
                    interfaceC2463809l6.asBinder().linkToDeath(deathRecipient, 0);
                    this.LLILLJJLI.LL.put(interfaceC2463809l6.asBinder(), deathRecipient);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            return this.LLILLJJLI.LIZJ();
        } catch (RemoteException th) {
            return false;
        }
    }

    @Override // X.C0W53
    public final boolean LLJJL(InterfaceC2463809l6 interfaceC2463809l6, Uri uri) {
        CustomTabsService customTabsService = this.LLILLJJLI;
        new C2464009l8(interfaceC2463809l6, null);
        return customTabsService.LJFF();
    }

    @Override // X.C0W53
    public final boolean LLJILJIL(InterfaceC2463809l6 interfaceC2463809l6, Uri uri, Bundle bundle) {
        CustomTabsService customTabsService = this.LLILLJJLI;
        new C2464009l8(interfaceC2463809l6, LJJJZ(bundle));
        return customTabsService.LJFF();
    }

    @Override // X.C0W53
    public final int o(InterfaceC2463809l6 interfaceC2463809l6, String str, Bundle bundle) {
        CustomTabsService customTabsService = this.LLILLJJLI;
        new C2464009l8(interfaceC2463809l6, LJJJZ(bundle));
        return customTabsService.LIZLLL();
    }

    @Override // X.C0W53
    public final boolean c(InterfaceC2463809l6 interfaceC2463809l6, Uri uri, Bundle bundle, List<Bundle> list) {
        CustomTabsService customTabsService = this.LLILLJJLI;
        new C2464009l8(interfaceC2463809l6, LJJJZ(bundle));
        return customTabsService.LIZIZ();
    }
}
