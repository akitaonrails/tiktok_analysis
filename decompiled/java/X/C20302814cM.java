package X;

import Y.ARunnableS103S0000000_30;
import com.bytedance.applog.AppLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14cM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20302814cM implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AppLog.setInsertEventOptEnabled(true);
        AppLog.setBatchProcessEventCount(25);
        AppLog.setBatchProcessInterval(800);
        C786410Ut5.LJLIIL(1000L, C799570VYd.LIZIZ(), new ARunnableS103S0000000_30(1));
        return null;
    }
}
