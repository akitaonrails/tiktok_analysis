package X;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: X.0Wn3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833630Wn3 extends AbstractC832400Wl4 {
    public final Context LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public final boolean LLILZIL;

    @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // X.AbstractC832390Wl3
    public final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // X.AbstractC832390Wl3
    public final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // X.AbstractC832390Wl3
    public final boolean requiresAccount() {
        return true;
    }

    @Override // X.AbstractC832390Wl3
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final Bundle LJ() {
        int i = this.LLILLJJLI;
        String packageName = this.LL.getPackageName();
        String str = this.LLILLL;
        int i2 = this.LLILZ;
        boolean z = this.LLILZIL;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        C786410Ut5.LJJJI("androidPackageName", packageName, bundle);
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJIJL(bundle, "com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    @Override // X.AbstractC832390Wl3
    public final Feature[] getApiFeatures() {
        return C833640Wn4.LIZIZ;
    }

    @Override // X.AbstractC832390Wl3
    public final /* synthetic */ IInterface createServiceInterface(final IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (iInterfaceQueryLocalInterface instanceof C833650Wn5) {
            return iInterfaceQueryLocalInterface;
        }
        return new C833660Wn6(iBinder) { // from class: X.0Wn5
        };
    }

    public C833630Wn3(Context context, Looper looper, C831470WjZ c831470WjZ, InterfaceC832260Wkq interfaceC832260Wkq, InterfaceC832270Wkr interfaceC832270Wkr, int i, int i2, boolean z) {
        String str;
        super(context, looper, 4, c831470WjZ, interfaceC832260Wkq, interfaceC832270Wkr);
        this.LL = context;
        this.LLILLJJLI = i;
        Account account = c831470WjZ.LIZ;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        this.LLILLL = str;
        this.LLILZ = i2;
        this.LLILZIL = z;
    }
}
