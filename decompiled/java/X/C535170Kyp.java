package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kyp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiportrait.AiPortraitContentDataSource$fetchAiContentList$1$1$2", f = "AiPortraitContentDataSource.kt", l = {57}, m = "invokeSuspend")
public final class C535170Kyp extends C09AX implements Function2<Long, InterfaceC1364105Vn<? super C00EK>, Object> {
    public int LL;
    public /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ InterfaceC535110Kyj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535170Kyp(InterfaceC535110Kyj interfaceC535110Kyj, InterfaceC1364105Vn<? super C535170Kyp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC535110Kyj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C535170Kyp c535170Kyp = new C535170Kyp(this.LLILLL, interfaceC1364105Vn);
        c535170Kyp.LLILLJJLI = ((Number) obj).longValue();
        return c535170Kyp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZJ;
        C1C7U.LIZ("AiPortraitContentDataSource@8386.fetchAiContentList$1$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZJ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            InterfaceC535110Kyj interfaceC535110Kyj = this.LLILLL;
            this.LL = 1;
            objLIZJ = interfaceC535110Kyj.LIZJ(50, j, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("AiPortraitContentDataSource@8386.fetchAiContentList$1$1$2");
                return objLJFF;
            }
        }
        if (C189200o6.m7isFailureimpl(objLIZJ)) {
            objLIZJ = null;
        }
        C1C7U.LIZIZ("AiPortraitContentDataSource@8386.fetchAiContentList$1$1$2");
        return objLIZJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, InterfaceC1364105Vn<? super C00EK> interfaceC1364105Vn) {
        return ((a) create(Long.valueOf(l.longValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
