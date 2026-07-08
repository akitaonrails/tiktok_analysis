package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxTrigger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1A1B, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A1B extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ MUFQuickDMBoxTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A1B(MUFQuickDMBoxTrigger mUFQuickDMBoxTrigger) {
        super(1);
        this.LL = mUFQuickDMBoxTrigger;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.LL.yp().LL = true;
        return Unit.LIZ;
    }
}
