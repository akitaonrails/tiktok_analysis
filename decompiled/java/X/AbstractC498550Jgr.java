package X;

import X.AbstractC521080Kc6;
import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Jgr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC498550Jgr<T extends AbstractC521080Kc6> extends AbstractC498530Jgp<T> {
    public final Handler LIZIZ;
    public final Function2<AbstractC498550Jgr<T>, Boolean, Unit> LIZJ;

    public abstract void LJFF();

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC498550Jgr(Handler handler, Function2<? super AbstractC498550Jgr<T>, ? super Boolean, Unit> function2) {
        this.LIZIZ = handler;
        this.LIZJ = function2;
    }
}
