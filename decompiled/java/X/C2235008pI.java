package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.longpresspanel.api.CommentShareResponse;
import com.ss.android.ugc.aweme.comment.longpresspanel.api.ICommentShareApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08pI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment$doAclCheckLogic$1$1", f = "CommentLongPressFragment.kt", l = {480}, m = "invokeSuspend")
public final class C2235008pI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends CommentShareResponse>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2235008pI(String str, String str2, InterfaceC1364105Vn<? super C2235008pI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2235008pI c2235008pI = new C2235008pI(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2235008pI.LLILLJJLI = obj;
        return c2235008pI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("CommentLongPressFragment@922.doAclCheckLogic$1$1");
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
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                ICommentShareApi.LIZ.getClass();
                ICommentShareApi iCommentShareApi = (ICommentShareApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(ICommentShareApi.class);
                this.LL = 1;
                obj = iCommentShareApi.requestCommentShareInfo(str, str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CommentLongPressFragment@922.doAclCheckLogic$1$1");
                    return objLJFF;
                }
            }
            c098200Yq = (CommentShareResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("CommentLongPressFragment@922.doAclCheckLogic$1$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends CommentShareResponse>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
