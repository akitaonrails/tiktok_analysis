package X;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0WWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824690WWt extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ CancellationSignal LL;
    public final /* synthetic */ C09AE LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C824690WWt(CancellationSignal cancellationSignal, AnonymousClass0956 anonymousClass0956) {
        super(1);
        this.LL = cancellationSignal;
        this.LLILLJJLI = anonymousClass0956;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.cancel();
        this.LLILLJJLI.LIZIZ(null);
        return Unit.LIZ;
    }
}
