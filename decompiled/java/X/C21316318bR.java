package X;

import android.app.Activity;
import android.content.res.Configuration;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.18bR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21316318bR implements InterfaceC1763090vyt {
    public final ConcurrentHashMap<InterfaceC1766040w3e, InterfaceC487330J9f> LIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1763090vyt
    public final void LIZIZ(InterfaceC1766040w3e interfaceC1766040w3e) {
        InterfaceC487330J9f interfaceC487330J9fRemove = this.LIZ.remove(interfaceC1766040w3e);
        if (interfaceC487330J9fRemove != null) {
            C487280J9a.LIZJ(interfaceC487330J9fRemove);
        }
    }

    @Override // X.InterfaceC1763090vyt
    public final void LIZ(C19EG c19eg, final InterfaceC1766040w3e interfaceC1766040w3e) {
        C487280J9a.LIZ(c19eg.hashCode(), new InterfaceC487330J9f(this, interfaceC1766040w3e) { // from class: X.18bS
            public final /* synthetic */ InterfaceC1766040w3e LL;

            {
                this.LL = interfaceC1766040w3e;
                this.LIZ.put(interfaceC1766040w3e, this);
            }

            @Override // X.InterfaceC487330J9f
            public final void onConfigurationChanged(Activity activity, Configuration configuration) {
                this.LL.onConfigurationChanged(activity, configuration);
            }
        });
    }
}
