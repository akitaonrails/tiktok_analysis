package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import com.ss.android.ugc.aweme.story.archive2.model.GetAwemeDetailByIDResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Qh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel$tryRequestRealAwemeData$2", f = "StoryArchiveV2ArchiveViewModel.kt", l = {242, 250}, m = "invokeSuspend")
public final class C331301Qh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ StoryArchiveV2ArchiveViewModel LLILZ;
    public final /* synthetic */ Map<String, Aweme> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C331301Qh(String str, StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModel, Map<String, ? extends Aweme> map, InterfaceC1364105Vn<? super C331301Qh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = storyArchiveV2ArchiveViewModel;
        this.LLILZIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C331301Qh c331301Qh = new C331301Qh(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c331301Qh.LLILLJJLI = obj;
        return c331301Qh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("StoryArchiveV2ArchiveViewModel@f333.tryRequestRealAwemeData$2");
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
                    C1C7U.LIZIZ("StoryArchiveV2ArchiveViewModel@f333.tryRequestRealAwemeData$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            System.currentTimeMillis();
            String str = this.LLILLL;
            StoryApi storyApi = StoryApi.LIZIZ;
            this.LL = 1;
            obj = storyApi.getArchivedStoryDetailByIDs(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryArchiveV2ArchiveViewModel@f333.tryRequestRealAwemeData$2");
                return objLJFF;
            }
        }
        c098200Yq = (GetAwemeDetailByIDResponse) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = new GetAwemeDetailByIDResponse(null, null, 3, null);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C331401Qi c331401Qi = new C331401Qi(this.LLILZ, (GetAwemeDetailByIDResponse) c098200Yq, this.LLILZIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c331401Qi) == objLJFF) {
            C1C7U.LIZIZ("StoryArchiveV2ArchiveViewModel@f333.tryRequestRealAwemeData$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryArchiveV2ArchiveViewModel@f333.tryRequestRealAwemeData$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
