package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.social.thought.api.ThoughtApi;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInteractionInfo;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInteractionListResponse;
import com.ss.android.ugc.aweme.social.thought.ui.like.SocialThoughtInteractionVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Cfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.like.SocialThoughtInteractionVM$loadMore$2", f = "SocialThoughtInteractionVM.kt", l = {102}, m = "invokeSuspend")
public final class C319520Cfm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ SocialThoughtInteractionVM LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319520Cfm(String str, String str2, SocialThoughtInteractionVM socialThoughtInteractionVM, InterfaceC1364105Vn<? super C319520Cfm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = socialThoughtInteractionVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C319520Cfm c319520Cfm = new C319520Cfm(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c319520Cfm.LLILLJJLI = obj;
        return c319520Cfm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object value;
        Object value2;
        C319530Cfn c319530Cfn;
        List<ThoughtInteractionInfo> list;
        List<ThoughtInteractionInfo> interactions;
        C1C7U.LIZ("SocialThoughtInteractionVM@bca0.loadMore$2");
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
                ThoughtApi thoughtApi = ThoughtApi.LIZIZ;
                this.LL = 1;
                obj = thoughtApi.getThoughtInteractionList(str, str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SocialThoughtInteractionVM@bca0.loadMore$2");
                    return objLJFF;
                }
            }
            c098200Yq = (ThoughtInteractionListResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        SocialThoughtInteractionVM socialThoughtInteractionVM = this.LLILZIL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            ThoughtInteractionListResponse thoughtInteractionListResponse = (ThoughtInteractionListResponse) c098200Yq;
            C2252321DDq c2252321DDq = socialThoughtInteractionVM.LL;
            do {
                value2 = c2252321DDq.getValue();
                c319530Cfn = (C319530Cfn) value2;
                list = c319530Cfn.LIZIZ;
                interactions = thoughtInteractionListResponse.getInteractions();
                if (interactions == null) {
                    interactions = C13BV.INSTANCE;
                }
            } while (!c2252321DDq.compareAndSet(value2, C319530Cfn.LIZ(c319530Cfn, C13LP.LJLIL(interactions, list), thoughtInteractionListResponse.getNextPageToken(), Intrinsics.LJFF(thoughtInteractionListResponse.getHasMore(), true), false, null, 1)));
        }
        SocialThoughtInteractionVM socialThoughtInteractionVM2 = this.LLILZIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C2252321DDq c2252321DDq2 = socialThoughtInteractionVM2.LL;
            do {
                value = c2252321DDq2.getValue();
            } while (!c2252321DDq2.compareAndSet(value, C319530Cfn.LIZ((C319530Cfn) value, null, null, false, false, thM5exceptionOrNullimpl, 15)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtInteractionVM@bca0.loadMore$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
