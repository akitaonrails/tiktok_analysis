package X;

import android.os.Looper;
import com.bytedance.assem.arch.threadpool.AssemMainHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12NW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12NW extends C09AY implements Function0<AssemMainHandler> {
    public C12NW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AssemMainHandler invoke() {
        return new AssemMainHandler(Looper.getMainLooper());
    }
}
