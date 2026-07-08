package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bean.GroupChatInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.IFeedSkylightCommonService;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SiM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.group.GroupChatWithStoryRepoImpl$schedulePreloadGroupStoryDetail$1$task$1", f = "GroupChatWithStoryRepoImpl.kt", l = {439}, m = "invokeSuspend")
public final class C728800SiM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C729670Sjl>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C729600Sje LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C728800SiM(C729600Sje c729600Sje, String str, InterfaceC1364105Vn<? super C728800SiM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c729600Sje;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C728800SiM c728800SiM = new C728800SiM(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c728800SiM.LLILLJJLI = obj;
        return c728800SiM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean zIsEmpty;
        List listLIZ;
        Object objLJJJ = obj;
        C1C7U.LIZ("GroupChatWithStoryRepoImpl@ed73.schedulePreloadGroupStoryDetail$1$task$1");
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
                String str = this.LLILZ;
                IFeedSkylightCommonService iFeedSkylightCommonServiceLJ = C614770O9j.LIZIZ.LJ();
                EnumC1596540reG enumC1596540reG = EnumC1596540reG.GROUP_CHAT;
                int type = EnumC1582650rHr.GROUP_CHAT_PRELOAD.getType();
                String strLIZ = new GroupChatInfo(str).LIZ();
                Long lLJFF = C2286608xc.LJFF(((Number) C18005073j.LIZ.getValue()).intValue());
                this.LL = 1;
                objLJJJ = iFeedSkylightCommonServiceLJ.LJJJ(0L, lLJFF, null, enumC1596540reG, 0, 0, null, 0, type, strLIZ, null, null, null, this);
                if (objLJJJ == objLJFF) {
                    C1C7U.LIZIZ("GroupChatWithStoryRepoImpl@ed73.schedulePreloadGroupStoryDetail$1$task$1");
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
        C729670Sjl c729670SjlLJIIJ = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        StoryGetFeedByPageResponse storyGetFeedByPageResponse = (StoryGetFeedByPageResponse) c098200Yq;
        if (storyGetFeedByPageResponse != null) {
            C729600Sje c729600Sje = this.LLILLL;
            String str2 = this.LLILZ;
            long cursor = storyGetFeedByPageResponse.getCursor();
            boolean hasMore = storyGetFeedByPageResponse.getHasMore();
            List<Aweme> awemes = storyGetFeedByPageResponse.getAwemes();
            if (awemes != null) {
                listLIZ = C728810SiN.LIZ(this.LLILZ, awemes);
            } else {
                listLIZ = C13BV.INSTANCE;
            }
            c729670SjlLJIIJ = c729600Sje.LJIIJ(cursor, str2, listLIZ, true, hasMore);
        }
        C729600Sje c729600Sje2 = this.LLILLL;
        Map<String, C729690Sjn> map = c729600Sje2.LIZ;
        String str3 = this.LLILZ;
        synchronized (map) {
            try {
                c729600Sje2.LIZ.remove(str3);
                zIsEmpty = c729600Sje2.LIZ.isEmpty();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (zIsEmpty) {
            this.LLILLL.LJIIIIZZ();
        }
        C1C7U.LIZIZ("GroupChatWithStoryRepoImpl@ed73.schedulePreloadGroupStoryDetail$1$task$1");
        return c729670SjlLJIIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C729670Sjl> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
