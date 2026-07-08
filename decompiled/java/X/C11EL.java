package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11EL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C11EL extends C2217421BqW implements Function1<Throwable, Unit> {
    public C11EL(Object obj) {
        super(1, obj, C11EJ.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) throws Throwable {
        Throwable cause = th;
        this.receiver.getClass();
        while (true) {
            if (cause == null) {
                break;
            }
            if (cause.getCause() != null) {
                cause = cause.getCause();
            } else if (cause != null) {
                throw cause;
            }
        }
        return Unit.LIZ;
    }
}
