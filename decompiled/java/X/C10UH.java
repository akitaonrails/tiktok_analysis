package X;

import com.ss.android.common.applog.AppLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10UH, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C10UH extends C2217421BqW implements Function0<Unit> {
    public static final C10UH LL = new C10UH();

    public C10UH() {
        super(0, AppLog.class, "flush", "flush()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AppLog.flush();
        return Unit.LIZ;
    }
}
