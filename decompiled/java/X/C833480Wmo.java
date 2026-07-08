package X;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Wmo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833480Wmo extends AbstractC832400Wl4 {
    public final GoogleSignInOptions LL;

    @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // X.AbstractC832390Wl3
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // X.AbstractC832390Wl3
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
    public final boolean providesSignIn() {
        return true;
    }

    @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
    public final Intent getSignInIntent() {
        return C832350Wkz.LIZ(this.zzl, this.LL);
    }

    @Override // X.AbstractC832390Wl3
    public final /* synthetic */ IInterface createServiceInterface(final IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (iInterfaceQueryLocalInterface instanceof C833620Wn2) {
            return iInterfaceQueryLocalInterface;
        }
        return new C834590Wob(iBinder) { // from class: X.0Wn2
        };
    }

    public C833480Wmo(Context context, Looper looper, C831470WjZ c831470WjZ, GoogleSignInOptions googleSignInOptions, InterfaceC832260Wkq interfaceC832260Wkq, InterfaceC832270Wkr interfaceC832270Wkr) {
        C833470Wmn c833470Wmn;
        super(context, looper, 91, c831470WjZ, interfaceC832260Wkq, interfaceC832270Wkr);
        if (googleSignInOptions != null) {
            c833470Wmn = new C833470Wmn(googleSignInOptions);
        } else {
            c833470Wmn = new C833470Wmn();
        }
        c833470Wmn.LJIIIIZZ = C833580Wmy.LIZ();
        if (!c831470WjZ.LIZJ.isEmpty()) {
            Iterator<Scope> it2 = c831470WjZ.LIZJ.iterator();
            while (it2.hasNext()) {
                ((HashSet) c833470Wmn.LIZ).add(it2.next());
                c833470Wmn.LIZ.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.LL = c833470Wmn.LIZ();
    }
}
