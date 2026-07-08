package X;

import android.content.Context;
import android.net.ConnectivityManager;
import com.ss.android.ugc.aweme.main.assems.MainActivityBusinessAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589980rTg extends C09AY implements Function0<ConnectivityManager> {
    public final /* synthetic */ MainActivityBusinessAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589980rTg(MainActivityBusinessAssem mainActivityBusinessAssem) {
        super(0);
        this.LL = mainActivityBusinessAssem;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.net.ConnectivityManager, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ConnectivityManager invoke() {
        Context context = this.LL.getContext();
        if (context != null) {
            return C786410Ut5.H2(context, "connectivity");
        }
        return null;
    }
}
