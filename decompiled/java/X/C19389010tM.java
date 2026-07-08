package X;

import android.widget.Magnifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10tM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19389010tM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19389110tN LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19389010tM(C19389110tN c19389110tN) {
        super(0);
        this.LL = c19389110tN;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Magnifier magnifier = this.LL.LIZJ;
        if (magnifier != null) {
            magnifier.dismiss();
        }
        return Unit.LIZ;
    }
}
