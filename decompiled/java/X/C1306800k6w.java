package X;

import com.bytedance.android.starship.strategy.CancelableJob;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS229S0300000_20;

/* JADX INFO: renamed from: X.0k6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306800k6w implements CancelableJob {
    public CancelableJob LIZ;

    @Override // com.bytedance.android.starship.strategy.CancelableJob
    public final void cancel() {
        CancelableJob cancelableJob = this.LIZ;
        if (cancelableJob != null) {
            cancelableJob.cancel();
        }
    }

    public C1306800k6w(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        C1306930k79.LIZ.LIZ(new AwS229S0300000_20(this, (C1306800k6w) c1306400k6I, (C1306400k6I) function1, (Function1<? super C1306060k5k, Unit>) 2));
    }
}
