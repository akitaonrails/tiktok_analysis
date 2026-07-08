package X;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022740cim extends C09AY implements Function0<Handler> {
    public C1022740cim() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Handler invoke() {
        return C08D5.LIZ(Looper.getMainLooper());
    }
}
