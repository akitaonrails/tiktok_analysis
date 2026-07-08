package X;

import Y.AgS97S1100000_4;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05MN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedVM$restartLikeSync$1$1$1", f = "SocialThoughtAggregatedVM.kt", l = {358}, m = "invokeSuspend")
public final class C05MN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ISocialThoughtDataCenterService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ SocialThoughtAggregatedVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05MN(ISocialThoughtDataCenterService iSocialThoughtDataCenterService, String str, SocialThoughtAggregatedVM socialThoughtAggregatedVM, InterfaceC1364105Vn<? super C05MN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iSocialThoughtDataCenterService;
        this.LLILLL = str;
        this.LLILZ = socialThoughtAggregatedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05MN(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtAggregatedVM@9f7c.restartLikeSync$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951LJI = this.LLILLJJLI.LJI(this.LLILLL, false);
            AgS97S1100000_4 agS97S1100000_4 = new AgS97S1100000_4(this.LLILZ, this.LLILLL, 0);
            this.LL = 1;
            if (anonymousClass0951LJI.collect(agS97S1100000_4, this) == objLJFF) {
                C1C7U.LIZIZ("SocialThoughtAggregatedVM@9f7c.restartLikeSync$1$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
