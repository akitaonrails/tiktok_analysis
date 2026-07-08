package X;

import com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.processor.preload.task.SocialVibePreloadTask$onChatListDataNext$3", f = "SocialVibePreloadTask.kt", l = {53}, m = "invokeSuspend")
public final class C695810RRb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C0ZA0> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C695810RRb(List<C0ZA0> list, InterfaceC1364105Vn<? super C695810RRb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C695810RRb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialVibePreloadTask@7600.onChatListDataNext$3");
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
            IVibeEntranceService iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
            if (iVibeEntranceServiceLIZ != null) {
                List<C0ZA0> list = this.LLILLJJLI;
                this.LL = 1;
                if (iVibeEntranceServiceLIZ.LJIILJJIL(list, this) == objLJFF) {
                    C1C7U.LIZIZ("SocialVibePreloadTask@7600.onChatListDataNext$3");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialVibePreloadTask@7600.onChatListDataNext$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
