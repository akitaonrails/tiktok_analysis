package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0Riu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703660Riu<T> extends C09AY implements Function1<Function2<? super T, ? super InterfaceC700750ReD, ? extends T>, Unit> {
    public final /* synthetic */ C703650Rit<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C703660Riu(C703650Rit<T> c703650Rit) {
        super(1);
        this.LL = c703650Rit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        C703650Rit<T> c703650Rit = this.LL;
        synchronized (c703650Rit) {
            try {
                c703650Rit.LIZ.LIZJ().invoke(obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }
}
