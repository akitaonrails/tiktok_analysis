package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.SocPubStatus;
import com.ss.android.ugc.aweme.model.StoryStatusResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.avatar.verify.FeedAvatarRingStatusVerifier$verifyBatch$2", f = "FeedAvatarRingStatusVerifier.kt", l = {39}, m = "invokeSuspend")
public final class C349501Xh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C349501Xh(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C349501Xh(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String str;
        Object objLJIILIIL = obj;
        C1C7U.LIZ("FeedAvatarRingStatusVerifier@750.verifyBatch$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean z = true;
        try {
            if (i != 0) {
                if (i == 1) {
                    str = (String) this.LL;
                    C155000ia.LIZIZ(objLJIILIIL);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJIILIIL);
                List<String> list = this.LLILLL;
                str = this.LLILZ;
                C1605650rsx c1605650rsx = C1605650rsx.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
                sbLIZ.append(']');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                this.LL = str;
                this.LLILLJJLI = 1;
                objLJIILIIL = c1605650rsx.LJIILIIL(strLIZIZ, true, "[FEED]", this);
                if (objLJIILIIL == objLJFF) {
                    C1C7U.LIZIZ("FeedAvatarRingStatusVerifier@750.verifyBatch$2");
                    return objLJFF;
                }
            }
            StoryStatusResponse storyStatusResponse = (StoryStatusResponse) objLJIILIIL;
            List<SocPubStatus> list2 = storyStatusResponse.statusList;
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            }
            if (!z) {
                C1604780rrY.LIZ.getClass();
                C1604780rrY.LIZ(storyStatusResponse, str);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("FeedAvatarRingStatusVerifier@750.verifyBatch$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
