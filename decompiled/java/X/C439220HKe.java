package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.socialavatar.network.AIGCTaskResponse;
import com.ss.android.ugc.aweme.socialavatar.network.LegacySocialAvatarCreationApi;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.network.SafeLegacySocialAvatarNetworkAPIImpl$getAIGCTaskList$2", f = "SafeLegacySocialAvatarNetworkAPIImpl.kt", l = {27}, m = "invokeSuspend")
public final class C439220HKe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AIGCTaskResponse>, Object> {
    public int LL;
    public final /* synthetic */ C439230HKf LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C439220HKe(C439230HKf c439230HKf, String str, InterfaceC1364105Vn<? super C439220HKe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c439230HKf;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C439220HKe(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AIGCTaskResponse aIGCTaskResponse;
        C1C7U.LIZ("SafeLegacySocialAvatarNetworkAPIImpl@7b61.getAIGCTaskList$2");
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
                C439230HKf c439230HKf = this.LLILLJJLI;
                String str = this.LLILLL;
                LegacySocialAvatarCreationApi legacySocialAvatarCreationApi = c439230HKf.LIZIZ;
                List<String> listSingletonList = Collections.singletonList(str);
                List<Integer> list = c439230HKf.LIZJ;
                this.LL = 1;
                obj = legacySocialAvatarCreationApi.getAIGCTaskList(listSingletonList, list, 0, 1, true, "ai_moji", this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SafeLegacySocialAvatarNetworkAPIImpl@7b61.getAIGCTaskList$2");
                    return objLJFF;
                }
            }
            aIGCTaskResponse = (AIGCTaskResponse) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            aIGCTaskResponse = null;
        }
        C1C7U.LIZIZ("SafeLegacySocialAvatarNetworkAPIImpl@7b61.getAIGCTaskList$2");
        return aIGCTaskResponse;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AIGCTaskResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
