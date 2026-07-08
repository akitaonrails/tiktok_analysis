package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.10ZM, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.tiktok.kmp.deeplink.s2l.shortlinkcache.ShortLinkCacheManager$cleanExpiredLinkCache$1", f = "ShortLinkCacheManager.kt", l = {354}, m = "invokeSuspend")
public final class C10ZM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public int LLILLJJLI;

    public C10ZM(InterfaceC1364105Vn<? super C10ZM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10ZM(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEV c1dev;
        INewUserDebugService iNewUserDebugServiceLIZIZ;
        long jLongValue;
        C1C7U.LIZ("ShortLinkCacheManager@ad2b.cleanExpiredLinkCache$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1865740yeS.LIZ.getClass();
            if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ = C1865740yeS.LIZIZ()) != null) {
                iNewUserDebugServiceLIZIZ.LJI("Short2LongCache", "cleanExpiredLinkCache When Start");
            }
            c1dev = C10ZO.LIZJ;
            this.LL = c1dev;
            this.LLILLJJLI = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("ShortLinkCacheManager@ad2b.cleanExpiredLinkCache$1");
                return objLJFF;
            }
        }
        try {
            C10ZO c10zo = C10ZO.LIZ;
            long epochMilliseconds = C19267610Zm.LIZ.now().toEpochMilliseconds();
            Long lLJIILIIL = C2095008Iq.LJIILIIL(C10ZP.LIZ("ShortLinkCache", "kMaxCacheTimeLimit"));
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            C10ZO.LIZJ(epochMilliseconds, jLongValue, false);
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ShortLinkCacheManager@ad2b.cleanExpiredLinkCache$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C10ZM(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
