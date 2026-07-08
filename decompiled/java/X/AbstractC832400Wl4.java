package X;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Wl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC832400Wl4<T extends IInterface> extends AbstractC832390Wl3<T> implements InterfaceC831160Wj4, InterfaceC832950Wlx {
    public static volatile Executor zaa;
    public final C831470WjZ zab;
    public final Set<Scope> zac;
    public final Account zad;

    @Override // X.AbstractC832390Wl3
    public final Account getAccount() {
        return this.zad;
    }

    @Override // X.AbstractC832390Wl3
    public final Executor getBindServiceExecutor() {
        return null;
    }

    public final C831470WjZ getClientSettings() {
        return this.zab;
    }

    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // X.AbstractC832390Wl3
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }

    @Override // X.InterfaceC831160Wj4
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    private final Set<Scope> zaa(Set<Scope> set) {
        validateScopes(set);
        Iterator<Scope> it2 = set.iterator();
        while (it2.hasNext()) {
            if (!set.contains(it2.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    public AbstractC832400Wl4(Context context, Handler handler, int i, C831470WjZ c831470WjZ) {
        super(context, handler, AbstractC832430Wl7.LIZ(context), GoogleApiAvailability.getInstance(), i, null, null);
        C0W3J.LJIIIIZZ(c831470WjZ);
        this.zab = c831470WjZ;
        this.zad = c831470WjZ.LIZ;
        Set<Scope> set = c831470WjZ.LIZJ;
        zaa(set);
        this.zac = set;
    }

    public AbstractC832400Wl4(Context context, Looper looper, int i, C831470WjZ c831470WjZ) {
        this(context, looper, AbstractC832430Wl7.LIZ(context), GoogleApiAvailability.getInstance(), i, c831470WjZ, null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC832400Wl4(Context context, Looper looper, int i, C831470WjZ c831470WjZ, InterfaceC832280Wks interfaceC832280Wks, InterfaceC832890Wlr interfaceC832890Wlr) {
        C832440Wl8 c832440Wl8LIZ = AbstractC832430Wl7.LIZ(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        C0W3J.LJIIIIZZ(interfaceC832280Wks);
        C0W3J.LJIIIIZZ(interfaceC832890Wlr);
        this(context, looper, c832440Wl8LIZ, googleApiAvailability, i, c831470WjZ, interfaceC832280Wks, interfaceC832890Wlr);
    }

    public AbstractC832400Wl4(Context context, Looper looper, int i, C831470WjZ c831470WjZ, InterfaceC832260Wkq interfaceC832260Wkq, InterfaceC832270Wkr interfaceC832270Wkr) {
        this(context, looper, i, c831470WjZ, (InterfaceC832280Wks) interfaceC832260Wkq, (InterfaceC832890Wlr) interfaceC832270Wkr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC832400Wl4(Context context, Looper looper, AbstractC832430Wl7 abstractC832430Wl7, GoogleApiAvailability googleApiAvailability, int i, C831470WjZ c831470WjZ, final InterfaceC832280Wks interfaceC832280Wks, final InterfaceC832890Wlr interfaceC832890Wlr) {
        InterfaceC832770Wlf interfaceC832770Wlf;
        if (interfaceC832280Wks == null) {
            interfaceC832770Wlf = null;
        } else {
            interfaceC832770Wlf = new InterfaceC832770Wlf() { // from class: X.0Wkt
                @Override // X.InterfaceC832770Wlf
                public final void Js(int i2) {
                    interfaceC832280Wks.Js(i2);
                }

                @Override // X.InterfaceC832770Wlf
                public final void zk(Bundle bundle) {
                    interfaceC832280Wks.zk(bundle);
                }
            };
        }
        super(context, looper, abstractC832430Wl7, googleApiAvailability, i, interfaceC832770Wlf, interfaceC832890Wlr != null ? new InterfaceC832830Wll() { // from class: X.0Wlb
            @Override // X.InterfaceC832830Wll
            public final void LJJJZ(ConnectionResult connectionResult) {
                interfaceC832890Wlr.LJJJZ(connectionResult);
            }
        } : null, c831470WjZ.LJI);
        this.zab = c831470WjZ;
        this.zad = c831470WjZ.LIZ;
        Set<Scope> set = c831470WjZ.LIZJ;
        zaa(set);
        this.zac = set;
    }
}
