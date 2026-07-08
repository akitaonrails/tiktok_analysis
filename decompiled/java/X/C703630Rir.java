package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703630Rir extends C09AY implements Function1<InterfaceC700750ReD, InterfaceC700750ReD> {
    public final /* synthetic */ C703650Rit<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C703630Rir(C703650Rit<T> c703650Rit) {
        super(1);
        this.LL = c703650Rit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC700750ReD invoke(InterfaceC700750ReD interfaceC700750ReD) {
        InterfaceC700750ReD interfaceC700750ReDInvoke;
        C703650Rit<T> c703650Rit = this.LL;
        synchronized (c703650Rit) {
            try {
                interfaceC700750ReDInvoke = c703650Rit.LIZ.LIZ().invoke(interfaceC700750ReD);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return interfaceC700750ReDInvoke;
    }
}
