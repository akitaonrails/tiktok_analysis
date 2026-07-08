package X;

import Y.AgS193S0200000_2;
import com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.069z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.recentactivity.ChatListRecentActivityUpdater$bindPage$1", f = "ChatListRecentActivityUpdater.kt", l = {74}, m = "invokeSuspend")
public final class C15629069z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C06A0 LLILLJJLI;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15629069z(C06A0 c06a0, InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1364105Vn<? super C15629069z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c06a0;
        this.LLILLL = interfaceC879010Ye3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15629069z(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListRecentActivityUpdater@43d6.bindPage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMRecentActivityService.LIZ.getClass();
            C05YD<Set<String>> c05ydLJFF = C1649006cy.LIZ().LIZ(C461720I8s.LIZIZ()).LJFF();
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(this.LLILLJJLI, this.LLILLL, 19);
            this.LL = 1;
            if (c05ydLJFF.collect(agS193S0200000_2, this) == objLJFF) {
                C1C7U.LIZIZ("ChatListRecentActivityUpdater@43d6.bindPage$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
