package X;

import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedVM;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05MM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedVM$restartLikeSync$1", f = "SocialThoughtAggregatedVM.kt", l = {}, m = "invokeSuspend")
public final class C05MM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ ISocialThoughtDataCenterService LLILLL;
    public final /* synthetic */ SocialThoughtAggregatedVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05MM(List<String> list, ISocialThoughtDataCenterService iSocialThoughtDataCenterService, SocialThoughtAggregatedVM socialThoughtAggregatedVM, InterfaceC1364105Vn<? super C05MM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = iSocialThoughtDataCenterService;
        this.LLILZ = socialThoughtAggregatedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05MM c05mm = new C05MM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c05mm.LL = obj;
        return c05mm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtAggregatedVM@9f7c.restartLikeSync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        List<String> list = this.LLILLJJLI;
        ISocialThoughtDataCenterService iSocialThoughtDataCenterService = this.LLILLL;
        SocialThoughtAggregatedVM socialThoughtAggregatedVM = this.LLILZ;
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05MN(iSocialThoughtDataCenterService, it2.next(), socialThoughtAggregatedVM, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtAggregatedVM@9f7c.restartLikeSync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
