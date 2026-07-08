package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kz5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.StoryPublishHelper$storyCancelUploadSheet$job$1", f = "StoryPublishHelper.kt", l = {}, m = "invokeSuspend")
public final class C535330Kz5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<AwemeDraft> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535330Kz5(String str, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535330Kz5(this.LLILLJJLI, interfaceC1364105Vn, this.LL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        T tLJI;
        C1C7U.LIZ("StoryPublishHelper@650e.storyCancelUploadSheet$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU<AwemeDraft> c259800zU = this.LL;
        C1219980hqu c1219980hqu = C1219980hqu.LIZ;
        String str = this.LLILLJJLI;
        c1219980hqu.getClass();
        if (str == null) {
            tLJI = 0;
        } else {
            tLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(str, 0, null, 6, null), false, false, false, 14));
        }
        c259800zU.element = tLJI;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryPublishHelper@650e.storyCancelUploadSheet$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
