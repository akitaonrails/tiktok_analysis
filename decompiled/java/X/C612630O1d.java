package X;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0O1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612630O1d extends C09AY implements Function1<C612620O1c, C612620O1c> {
    public final /* synthetic */ Bitmap LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C612630O1d(Bitmap bitmap) {
        super(1);
        this.LL = bitmap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C612620O1c invoke(C612620O1c c612620O1c) {
        return C612620O1c.LIZ(c612620O1c, null, new C291001Au(this.LL), null, false, 13);
    }
}
