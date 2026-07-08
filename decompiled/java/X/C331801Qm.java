package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.archive2.model.GetStoryOnThisDayInfoResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Qm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.service.StoryServiceImpl$requestOnThisDayInfoForAlbum$1", f = "StoryServiceImpl.kt", l = {567, 569}, m = "invokeSuspend")
public final class C331801Qm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<List<? extends Aweme>, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C331801Qm(Function1<? super List<? extends Aweme>, Unit> function1, InterfaceC1364105Vn<? super C331801Qm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C331801Qm c331801Qm = new C331801Qm(this.LLILLL, interfaceC1364105Vn);
        c331801Qm.LLILLJJLI = obj;
        return c331801Qm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("StoryServiceImpl@9399.requestOnThisDayInfoForAlbum$1");
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
                    C1C7U.LIZIZ("StoryServiceImpl@9399.requestOnThisDayInfoForAlbum$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            StoryApi storyApi = StoryApi.LIZIZ;
            this.LL = 1;
            obj = storyApi.getStoryOnThisDayInfo(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryServiceImpl@9399.requestOnThisDayInfoForAlbum$1");
                return objLJFF;
            }
        }
        c098200Yq = ((GetStoryOnThisDayInfoResponse) obj).getAwemes();
        C189200o6.m2constructorimpl(c098200Yq);
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = C13BV.INSTANCE;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C331901Qn c331901Qn = new C331901Qn((List) c098200Yq, null, this.LLILLL);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c331901Qn) == objLJFF) {
            C1C7U.LIZIZ("StoryServiceImpl@9399.requestOnThisDayInfoForAlbum$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryServiceImpl@9399.requestOnThisDayInfoForAlbum$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
