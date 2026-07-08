package X;

import com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager$getBatchAwemeCacheItem$3$loadingJobs$1$1", f = "AwemeFetchManager.kt", l = {131}, m = "invokeSuspend")
public final class C323540CmG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323540CmG(String str, InterfaceC1364105Vn<? super C323540CmG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323540CmG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemeFetchManager@5bcc.getBatchAwemeCacheItem$3$loadingJobs$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<InterfaceC327200CsA> c05ydLIZLLL = AwemeFetchManager.LIZIZ.LIZLLL(this.LLILLJJLI);
            if (c05ydLIZLLL != null) {
                C323530CmF c323530CmF = new C323530CmF(null);
                this.LL = 1;
                if (C09IC.LJIJ(c05ydLIZLLL, this, c323530CmF) == objLJFF) {
                    C1C7U.LIZIZ("AwemeFetchManager@5bcc.getBatchAwemeCacheItem$3$loadingJobs$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeFetchManager@5bcc.getBatchAwemeCacheItem$3$loadingJobs$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
