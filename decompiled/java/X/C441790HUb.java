package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.ChatroomInputButtonKt$assembleRedDot$1", f = "ChatroomInputButton.kt", l = {195}, m = "invokeSuspend")
public final class C441790HUb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IEmojiBtnAbility LLILLJJLI;
    public final /* synthetic */ InterfaceC332260D0u<C433890Gzr> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441790HUb(IEmojiBtnAbility iEmojiBtnAbility, InterfaceC332260D0u<C433890Gzr> interfaceC332260D0u, InterfaceC1364105Vn<? super C441790HUb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iEmojiBtnAbility;
        this.LLILLL = interfaceC332260D0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C441790HUb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatroomInputButtonKt@5cca.assembleRedDot$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<InterfaceC441910HUn> c05ydW90 = this.LLILLJJLI.W90();
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 142);
            this.LL = 1;
            if (c05ydW90.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("ChatroomInputButtonKt@5cca.assembleRedDot$1");
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
