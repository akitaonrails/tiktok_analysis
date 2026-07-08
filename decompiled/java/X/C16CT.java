package X;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.16CT, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16CT extends C09AY implements Function0<ConnectivityManager> {
    public C16CT() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ConnectivityManager invoke() {
        Context context = C798140VSq.LIZ;
        ConnectivityManager connectivityManagerH2 = context != null ? C786410Ut5.H2(context, "connectivity") : 0;
        if (connectivityManagerH2 instanceof ConnectivityManager) {
            return connectivityManagerH2;
        }
        return null;
    }
}
