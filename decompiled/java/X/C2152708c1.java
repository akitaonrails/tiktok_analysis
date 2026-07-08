package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08c1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoiceDownloader$ensureDownload$deferred$1", f = "BulletinVoiceDownloader.kt", l = {267}, m = "invokeSuspend")
public final class C2152708c1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2231808om LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ AtomicInteger LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2152708c1(C2231808om c2231808om, String str, String str2, String str3, AtomicInteger atomicInteger, InterfaceC1364105Vn<? super C2152708c1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2231808om;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = atomicInteger;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2152708c1 c2152708c1 = new C2152708c1(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c2152708c1.LLILLJJLI = obj;
        return c2152708c1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C2231808om c2231808om;
        C1C7U.LIZ("BulletinVoiceDownloader@2869.ensureDownload$deferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    c2231808om = (C2231808om) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                c2231808om = this.LLILLL;
                String str = this.LLILZ;
                String str2 = this.LLILZIL;
                String str3 = this.LLILZLL;
                AtomicInteger atomicInteger = this.LLIZ;
                this.LLILLJJLI = c2231808om;
                this.LL = 1;
                obj = c2231808om.LIZIZ(str, str2, str3, atomicInteger, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BulletinVoiceDownloader@2869.ensureDownload$deferred$1");
                    return objLJFF;
                }
            }
            c098200Yq = (String) obj;
            if (c098200Yq != null) {
                c2231808om.LIZ.LJIIL();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C0OPX.LJIIIIZZ("BulletinVoiceDownloader: async caught " + thM5exceptionOrNullimpl.getClass().getSimpleName() + ": " + thM5exceptionOrNullimpl.getMessage());
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("BulletinVoiceDownloader@2869.ensureDownload$deferred$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
