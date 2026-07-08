package X;

import com.ss.android.ugc.aweme.base.service.FeedSkylightCommonServiceImpl;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k1E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.service.FeedSkylightCommonServiceImpl$fetchSkylightDataObservable$1", f = "FeedSkylightCommonServiceImpl.kt", l = {347, 361}, m = "invokeSuspend")
public final class C1303260k1E extends C09AX implements Function2<C094D<? super StoryGetFeedByPageResponse>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ FeedSkylightCommonServiceImpl LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ EnumC1596540reG LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ Boolean LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ Long LLJILJILJ;
    public final /* synthetic */ Long LLJILLL;
    public final /* synthetic */ String LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303260k1E(FeedSkylightCommonServiceImpl feedSkylightCommonServiceImpl, long j, Long l, String str, EnumC1596540reG enumC1596540reG, int i, int i2, Boolean bool, int i3, int i4, Long l2, Long l3, String str2, InterfaceC1364105Vn<? super C1303260k1E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = feedSkylightCommonServiceImpl;
        this.LLILZ = j;
        this.LLILZIL = l;
        this.LLILZLL = str;
        this.LLIZ = enumC1596540reG;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
        this.LLJI = bool;
        this.LLJIJIL = i3;
        this.LLJILJIL = i4;
        this.LLJILJILJ = l2;
        this.LLJILLL = l3;
        this.LLJJ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1303260k1E c1303260k1E = new C1303260k1E(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
        c1303260k1E.LLILLJJLI = obj;
        return c1303260k1E;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0955 anonymousClass0955;
        Object objLJJJ = obj;
        C1C7U.LIZ("FeedSkylightCommonServiceImpl@9b1f.fetchSkylightDataObservable$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJJJ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FeedSkylightCommonServiceImpl@9b1f.fetchSkylightDataObservable$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anonymousClass0955 = (AnonymousClass0955) this.LLILLJJLI;
            C155000ia.LIZIZ(objLJJJ);
        } else {
            C155000ia.LIZIZ(objLJJJ);
            anonymousClass0955 = (AnonymousClass0955) this.LLILLJJLI;
            FeedSkylightCommonServiceImpl feedSkylightCommonServiceImpl = this.LLILLL;
            long j = this.LLILZ;
            Long l = this.LLILZIL;
            String str = this.LLILZLL;
            EnumC1596540reG enumC1596540reG = this.LLIZ;
            int i2 = this.LLIZLLLIL;
            int i3 = this.LLJ;
            Boolean bool = this.LLJI;
            int i4 = this.LLJIJIL;
            int i5 = this.LLJILJIL;
            Long l2 = this.LLJILJILJ;
            Long l3 = this.LLJILLL;
            String str2 = this.LLJJ;
            this.LLILLJJLI = anonymousClass0955;
            this.LL = 1;
            objLJJJ = feedSkylightCommonServiceImpl.LJJJ(j, l, str, enumC1596540reG, i2, i3, bool, i4, i5, null, l2, l3, str2, this);
            if (objLJJJ == objLJFF) {
                C1C7U.LIZIZ("FeedSkylightCommonServiceImpl@9b1f.fetchSkylightDataObservable$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (anonymousClass0955.LJIJI(objLJJJ, this) == objLJFF) {
            C1C7U.LIZIZ("FeedSkylightCommonServiceImpl@9b1f.fetchSkylightDataObservable$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FeedSkylightCommonServiceImpl@9b1f.fetchSkylightDataObservable$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super StoryGetFeedByPageResponse> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
