package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Shg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.group.GroupChatWithStoryRepoImpl$loadSkylightListData$memberResponseDeffer$1", f = "GroupChatWithStoryRepoImpl.kt", l = {123}, m = "invokeSuspend")
public final class C728380Shg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super UserStoriesResponse>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C728380Shg(String str, boolean z, InterfaceC1364105Vn<? super C728380Shg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C728380Shg c728380Shg = new C728380Shg(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c728380Shg.LLILLJJLI = obj;
        return c728380Shg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("GroupChatWithStoryRepoImpl@ed73.loadSkylightListData$memberResponseDeffer$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLL;
                if (str != null && this.LLILZ) {
                    C11L6 c11l6LIZ = C728370Shf.LIZ(C728370Shf.LIZ, Collections.singletonList(str).toString(), null, 0, null, 14);
                    this.LL = 1;
                    obj = C11UD.LIZIZ(c11l6LIZ, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("GroupChatWithStoryRepoImpl@ed73.loadSkylightListData$memberResponseDeffer$1");
                        return objLJFF;
                    }
                } else {
                    C1C7U.LIZIZ("GroupChatWithStoryRepoImpl@ed73.loadSkylightListData$memberResponseDeffer$1");
                    return null;
                }
            }
            c098200Yq = (UserStoriesResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str2 = this.LLILLL;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadSkylightListData, load member: ");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("GroupChatWithStoryRepoImpl@ed73.loadSkylightListData$memberResponseDeffer$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super UserStoriesResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
