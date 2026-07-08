package X;

import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1680, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1680 extends C09AY implements Function0<Thread> {
    public AnonymousClass1680() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Thread invoke() {
        return Looper.getMainLooper().getThread();
    }
}
