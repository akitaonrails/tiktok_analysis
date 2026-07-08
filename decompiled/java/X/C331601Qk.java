package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import com.ss.android.ugc.aweme.story.archive2.model.GetStoryOnThisDayInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Qk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel$requestOnThisDay$1", f = "StoryArchiveV2ArchiveViewModel.kt", l = {104, 111}, m = "invokeSuspend")
public final class C331601Qk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StoryArchiveV2ArchiveViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331601Qk(StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModel, InterfaceC1364105Vn<? super C331601Qk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = storyArchiveV2ArchiveViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C331601Qk c331601Qk = new C331601Qk(this.LLILLL, interfaceC1364105Vn);
        c331601Qk.LLILLJJLI = obj;
        return c331601Qk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("StoryArchiveV2ArchiveViewModel@f333.requestOnThisDay$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StoryArchiveV2ArchiveViewModel@f333.requestOnThisDay$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            System.currentTimeMillis();
            StoryApi storyApi = StoryApi.LIZIZ;
            this.LL = 1;
            obj = storyApi.getStoryOnThisDayInfo(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryArchiveV2ArchiveViewModel@f333.requestOnThisDay$1");
                return objLJFF;
            }
        }
        c098200Yq = (GetStoryOnThisDayInfoResponse) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = new GetStoryOnThisDayInfoResponse(null, 1, null);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C331701Ql c331701Ql = new C331701Ql(this.LLILLL, (GetStoryOnThisDayInfoResponse) c098200Yq, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c331701Ql) == objLJFF) {
            C1C7U.LIZIZ("StoryArchiveV2ArchiveViewModel@f333.requestOnThisDay$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryArchiveV2ArchiveViewModel@f333.requestOnThisDay$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
