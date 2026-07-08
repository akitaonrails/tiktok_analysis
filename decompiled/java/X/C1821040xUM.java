package X;

import android.net.Uri;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xUM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821040xUM extends C09AY implements Function1<C1820790xTx, C1820790xTx> {
    public final /* synthetic */ Uri LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821040xUM(Uri uri) {
        super(1);
        this.LL = uri;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1820790xTx invoke(C1820790xTx c1820790xTx) {
        return C1820790xTx.LIZ(c1820790xTx, null, false, false, false, null, false, new C291001Au(new C1821300xUm(this.LL)), null, 191);
    }
}
