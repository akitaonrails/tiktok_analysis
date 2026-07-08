package X;

import com.ss.android.ugc.aweme.rss.api.models.UpdateRssResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.rss.repo.RssRepoImpl$updateRss$resp$1", f = "RssRepo.kt", l = {65}, m = "invokeSuspend")
public final class C1165990gRp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super UpdateRssResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165990gRp(String str, InterfaceC1364105Vn<? super C1165990gRp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165990gRp(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RssRepoImpl@e91c.updateRss$resp$1");
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
            InterfaceC1166000gRq.LIZ.getClass();
            InterfaceC1166000gRq value = C1166010gRr.LIZIZ.getValue();
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = value.LIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RssRepoImpl@e91c.updateRss$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("RssRepoImpl@e91c.updateRss$resp$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super UpdateRssResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
