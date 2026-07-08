package X;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0e1W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072800e1W extends C09AY implements Function0<C1620050sGB> {
    public final /* synthetic */ C1072730e1P LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1072800e1W(C1072730e1P c1072730e1P) {
        super(0);
        this.LL = c1072730e1P;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1620050sGB invoke() {
        Context context = this.LL.LIZ.getContext();
        if (context != null) {
            return C0SHX.LIZ(context, null);
        }
        return null;
    }
}
