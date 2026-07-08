package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.MessageListLongPressAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.MessageListLongPressAssem$setupSelectionMessageDefer$1", f = "MessageListLongPressAssem.kt", l = {168}, m = "invokeSuspend")
public final class C330250Cx5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageListLongPressAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330250Cx5(MessageListLongPressAssem messageListLongPressAssem, InterfaceC1364105Vn<? super C330250Cx5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageListLongPressAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330250Cx5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252331DDr c2252331DDrHe2;
        C1C7U.LIZ("MessageListLongPressAssem@16c3.setupSelectionMessageDefer$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMSelectTextAbility iMSelectTextAbility = (IMSelectTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILLJJLI), IMSelectTextAbility.class, null);
            if (iMSelectTextAbility != null && (c2252331DDrHe2 = iMSelectTextAbility.he2()) != null) {
                AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 14);
                this.LL = 1;
                if (C2252331DDr.LJIIJ(c2252331DDrHe2, agS295S0100000_14, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageListLongPressAssem@16c3.setupSelectionMessageDefer$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MessageListLongPressAssem@16c3.setupSelectionMessageDefer$1");
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
