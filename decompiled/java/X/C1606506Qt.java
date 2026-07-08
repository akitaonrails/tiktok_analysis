package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostInputIconAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Qt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostInputIconAssem$onViewCreated$1", f = "BotSharePostInputIconAssem.kt", l = {44}, m = "invokeSuspend")
public final class C1606506Qt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BotSharePostInputIconAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1606506Qt(BotSharePostInputIconAssem botSharePostInputIconAssem, InterfaceC1364105Vn<? super C1606506Qt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = botSharePostInputIconAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1606506Qt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BotSharePostInputIconAssem@9734.onViewCreated$1");
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
            BotSharePostInputIconAssem botSharePostInputIconAssem = this.LLILLJJLI;
            IInputFieldAbility iInputFieldAbilityHp = botSharePostInputIconAssem.LLJJIII;
            if (iInputFieldAbilityHp == null) {
                synchronized (botSharePostInputIconAssem) {
                    iInputFieldAbilityHp = botSharePostInputIconAssem.LLJJIII;
                    if (iInputFieldAbilityHp == null) {
                        iInputFieldAbilityHp = botSharePostInputIconAssem.hp();
                        botSharePostInputIconAssem.LLJJIII = iInputFieldAbilityHp;
                    }
                }
            }
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C1768806wI(iInputFieldAbilityHp.Kv(), 1));
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 16);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("BotSharePostInputIconAssem@9734.onViewCreated$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BotSharePostInputIconAssem@9734.onViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
