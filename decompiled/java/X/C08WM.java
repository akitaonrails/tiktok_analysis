package X;

import com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08WM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl$onBind$job$1", f = "InboxGroupChatSocialStatusViewModelImpl.kt", l = {122}, m = "invokeSuspend")
public final class C08WM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InboxGroupChatSocialStatusViewModelImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08WM(InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl, String str, InterfaceC1364105Vn<? super C08WM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inboxGroupChatSocialStatusViewModelImpl;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08WM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.onBind$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long jLongValue = ((Number) C18037074p.LIZ.getValue()).longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.onBind$job$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLILZ.remove(this.LLILLL);
        if (!this.LLILLJJLI.LLILLL.contains(this.LLILLL)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.onBind$job$1");
            return unit;
        }
        if (!this.LLILLJJLI.xQ2(this.LLILLL)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.onBind$job$1");
            return unit2;
        }
        this.LLILLJJLI.vQ2(this.LLILLL, true);
        this.LLILLJJLI.zQ2();
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.onBind$job$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
