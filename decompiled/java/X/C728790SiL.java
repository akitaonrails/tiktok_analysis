package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bean.GroupChatInfo;
import com.ss.android.ugc.aweme.service.IFeedSkylightCommonService;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SiL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.group.GroupChatWithStoryRepoImpl$loadSkylightListData$groupResponseDeffer$1", f = "GroupChatWithStoryRepoImpl.kt", l = {107}, m = "invokeSuspend")
public final class C728790SiL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super StoryGetFeedByPageResponse>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C728790SiL(long j, Long l, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C728790SiL c728790SiL = new C728790SiL(this.LLILZ, this.LLILZIL, this.LLILLL, interfaceC1364105Vn);
        c728790SiL.LLILLJJLI = obj;
        return c728790SiL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object objLJJJ = obj;
        C1C7U.LIZ("GroupChatWithStoryRepoImpl@ed73.loadSkylightListData$groupResponseDeffer$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJJJ);
            } else {
                C155000ia.LIZIZ(objLJJJ);
                String str = this.LLILLL;
                long j = this.LLILZ;
                Long l = this.LLILZIL;
                IFeedSkylightCommonService iFeedSkylightCommonServiceLJ = C614770O9j.LIZIZ.LJ();
                EnumC1596540reG enumC1596540reG = EnumC1596540reG.GROUP_CHAT;
                int type = EnumC1582650rHr.GROUP_CHAT_REFRESH.getType();
                String strLIZ = new GroupChatInfo(str).LIZ();
                this.LL = 1;
                objLJJJ = iFeedSkylightCommonServiceLJ.LJJJ(j, l, null, enumC1596540reG, 0, 0, null, 0, type, strLIZ, null, null, null, this);
                if (objLJJJ == objLJFF) {
                    C1C7U.LIZIZ("GroupChatWithStoryRepoImpl@ed73.loadSkylightListData$groupResponseDeffer$1");
                    return objLJFF;
                }
            }
            c098200Yq = (StoryGetFeedByPageResponse) objLJJJ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1C7U.LIZIZ("GroupChatWithStoryRepoImpl@ed73.loadSkylightListData$groupResponseDeffer$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super StoryGetFeedByPageResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
