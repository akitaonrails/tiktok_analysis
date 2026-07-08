package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mention.model.MentionGeneralCheckResponse;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZ3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.util.MentionNetworkRequestHelperKt$getMentionCheckResponseWithCache$2$batchResponses$2$1", f = "MentionNetworkRequestHelper.kt", l = {281}, m = "invokeSuspend")
public final class C0CZ3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MentionGeneralCheckResponse>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CZ3(long j, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0CZ3 c0cz3 = new C0CZ3(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c0cz3.LLILLJJLI = obj;
        return c0cz3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("MentionNetworkRequestHelperKt@c7aa.getMentionCheckResponseWithCache$2$batchResponses$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                List<String> list = this.LLILLL;
                long j = this.LLILZ;
                C316410Cal c316410Cal = C316410Cal.LIZ;
                String string = list.toString();
                String string2 = Collections.singletonList(C2286608xc.LJFF(j)).toString();
                this.LL = 1;
                c316410Cal.getClass();
                obj = C316410Cal.LIZ(string, string2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MentionNetworkRequestHelperKt@c7aa.getMentionCheckResponseWithCache$2$batchResponses$2$1");
                    return objLJFF;
                }
            }
            c098200Yq = (MentionGeneralCheckResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1C7U.LIZIZ("MentionNetworkRequestHelperKt@c7aa.getMentionCheckResponseWithCache$2$batchResponses$2$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MentionGeneralCheckResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
