package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Shh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.group.GroupChatWithStoryRepoImpl$schedulePreloadMemberStoryDetail$task$1", f = "GroupChatWithStoryRepoImpl.kt", l = {507}, m = "invokeSuspend")
public final class C728390Shh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C729600Sje LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C728390Shh(C729600Sje c729600Sje, List<String> list, InterfaceC1364105Vn<? super C728390Shh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c729600Sje;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C728390Shh c728390Shh = new C728390Shh(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c728390Shh.LLILLJJLI = obj;
        return c728390Shh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean zIsEmpty;
        C1C7U.LIZ("GroupChatWithStoryRepoImpl@ed73.schedulePreloadMemberStoryDetail$task$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C11L6 c11l6LIZ = C728370Shf.LIZ(C728370Shf.LIZ, this.LLILZ.toString(), null, 0, null, 14);
                this.LL = 1;
                obj = C11UD.LIZIZ(c11l6LIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GroupChatWithStoryRepoImpl@ed73.schedulePreloadMemberStoryDetail$task$1");
                    return objLJFF;
                }
            }
            c098200Yq = (UserStoriesResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        String str = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        UserStoriesResponse userStoriesResponse = (UserStoriesResponse) c098200Yq;
        if (userStoriesResponse != null) {
            BaseResponse.ServerTimeExtra serverTimeExtra = userStoriesResponse.extra;
            if (serverTimeExtra != null) {
                str = serverTimeExtra.logid;
            }
            this.LLILLL.LJIIJJI(str, userStoriesResponse.getAwemes());
        }
        C729600Sje c729600Sje = this.LLILLL;
        Map<String, C729700Sjo> map = c729600Sje.LIZJ;
        List<String> list = this.LLILZ;
        synchronized (map) {
            try {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    c729600Sje.LIZJ.remove(it2.next());
                }
                zIsEmpty = c729600Sje.LIZJ.isEmpty();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (zIsEmpty) {
            this.LLILLL.LJIIIZ();
        }
        if (userStoriesResponse == null) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("GroupChatWithStoryRepoImpl@ed73.schedulePreloadMemberStoryDetail$task$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
