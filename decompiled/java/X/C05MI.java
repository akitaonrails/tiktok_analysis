package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05MI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.thoughtbubble.ChatListThoughtBubbleUpdater$observeDataChangeAfterFilter$4", f = "ChatListThoughtBubbleUpdater.kt", l = {161}, m = "invokeSuspend")
public final class C05MI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ISocialThoughtDataCenterService LLILLL;
    public final /* synthetic */ Set<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05MI(ISocialThoughtDataCenterService iSocialThoughtDataCenterService, Set<String> set, InterfaceC1364105Vn<? super C05MI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = iSocialThoughtDataCenterService;
        this.LLILZ = set;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05MI c05mi = new C05MI(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c05mi.LLILLJJLI = obj;
        return c05mi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListThoughtBubbleUpdater@3b3c.observeDataChangeAfterFilter$4");
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
                ISocialThoughtDataCenterService iSocialThoughtDataCenterService = this.LLILLL;
                List<String> listLLIIII = C13LP.LLIIII(this.LLILZ);
                this.LL = 1;
                obj = iSocialThoughtDataCenterService.LIZLLL(listLLIIII, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ChatListThoughtBubbleUpdater@3b3c.observeDataChangeAfterFilter$4");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl((List) obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListThoughtBubbleUpdater@3b3c.observeDataChangeAfterFilter$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
