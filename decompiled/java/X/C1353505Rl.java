package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Rl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2$observeGroupChatEnableStatus$1$1", f = "InboxFragmentV2.kt", l = {667}, m = "invokeSuspend")
public final class C1353505Rl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InboxFragmentV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1353505Rl(InboxFragmentV2 inboxFragmentV2, InterfaceC1364105Vn<? super C1353505Rl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inboxFragmentV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1353505Rl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxFragmentV2@d7b5.observeGroupChatEnableStatus$1$1");
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
            C1759206uk.LIZ.getClass();
            C2252321DDq c2252321DDq = C1759206uk.LIZIZ;
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 60);
            this.LL = 1;
            if (c2252321DDq.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("InboxFragmentV2@d7b5.observeGroupChatEnableStatus$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxFragmentV2@d7b5.observeGroupChatEnableStatus$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
