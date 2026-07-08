package X;

import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinLiveEventPreloadAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardKV;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinLiveEventPreloadAssem$preloadLiveEventSparkPage$1", f = "BulletinLiveEventPreloadAssem.kt", l = {98}, m = "invokeSuspend")
public final class C466110IPp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinLiveEventPreloadAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<BulletinCardKV> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C466110IPp(BulletinLiveEventPreloadAssem bulletinLiveEventPreloadAssem, String str, List<BulletinCardKV> list, InterfaceC1364105Vn<? super C466110IPp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinLiveEventPreloadAssem;
        this.LLILLL = str;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C466110IPp(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinLiveEventPreloadAssem@88ef.preloadLiveEventSparkPage$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C498570Jgt c498570Jgt = new C498570Jgt(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c498570Jgt) == objLJFF) {
                C1C7U.LIZIZ("BulletinLiveEventPreloadAssem@88ef.preloadLiveEventSparkPage$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinLiveEventPreloadAssem@88ef.preloadLiveEventSparkPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
