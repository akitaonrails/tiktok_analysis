package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.chatroom.GroupChatPageLiveAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatroom.GroupChatPageLiveAssem$onCreate$2$1", f = "GroupChatPageLiveAssem.kt", l = {60}, m = "invokeSuspend")
public final class C1611906Sv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GroupChatPageLiveAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1611906Sv(GroupChatPageLiveAssem groupChatPageLiveAssem, InterfaceC1364105Vn<? super C1611906Sv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = groupChatPageLiveAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1611906Sv(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252321DDq c2252321DDqDO2;
        C1C7U.LIZ("GroupChatPageLiveAssem@67d8.onCreate$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1612206Sy interfaceC1612206Sy = (InterfaceC1612206Sy) this.LLILLJJLI.LLILZIL.getValue();
            if (interfaceC1612206Sy != null && (c2252321DDqDO2 = interfaceC1612206Sy.dO2()) != null) {
                AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 11);
                this.LL = 1;
                if (c2252321DDqDO2.collect(agS283S0100000_2, this) == objLJFF) {
                    C1C7U.LIZIZ("GroupChatPageLiveAssem@67d8.onCreate$2$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("GroupChatPageLiveAssem@67d8.onCreate$2$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
