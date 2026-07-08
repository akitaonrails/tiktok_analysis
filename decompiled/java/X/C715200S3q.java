package X;

import Y.ARunnableS111S0100000_11;
import android.view.View;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715200S3q extends C09AY implements Function1<View, Unit> {
    public static final /* synthetic */ int LL = 0;

    static {
        new C715200S3q();
    }

    public C715200S3q() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        FeedInfraTimingSensor.LL.getClass();
        new ARunnableS111S0100000_11(view, 5).run();
        return Unit.LIZ;
    }
}
