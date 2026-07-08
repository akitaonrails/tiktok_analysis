package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.chatroom.assembler.ChatRoomAssembler;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05Va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatroom.assembler.ChatRoomAssembler$assembleOnFirstMessageListLayout$2", f = "ChatRoomAssembler2.kt", l = {668}, m = "invokeSuspend")
public final class C1362805Va extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ChatRoomAssembler LLILLJJLI;
    public final /* synthetic */ Function1<Assembler, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1362805Va(ChatRoomAssembler chatRoomAssembler, Function1<? super Assembler, Unit> function1, InterfaceC1364105Vn<? super C1362805Va> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = chatRoomAssembler;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1362805Va(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object ability;
        C05YD<Boolean> c05ydDX;
        C1C7U.LIZ("ChatRoomAssembler@5031.assembleOnFirstMessageListLayout$2");
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
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(this.LLILLJJLI.LIZ, null), ChatRoomScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(MessageListHasRenderedProvider.class);
            } else {
                ability = null;
            }
            if (!(ability instanceof MessageListHasRenderedProvider)) {
                ability = null;
            }
            MessageListHasRenderedProvider messageListHasRenderedProvider = (MessageListHasRenderedProvider) ability;
            if (messageListHasRenderedProvider != null && (c05ydDX = messageListHasRenderedProvider.dX()) != null) {
                C05A3 c05a3 = new C05A3(null);
                this.LL = 1;
                if (C09IC.LJIJ(c05ydDX, this, c05a3) == objLJFF) {
                    C1C7U.LIZIZ("ChatRoomAssembler@5031.assembleOnFirstMessageListLayout$2");
                    return objLJFF;
                }
            }
        }
        C723850SaN.LIZ(this.LLILLJJLI.LIZ, false, null, new AwS581S0100000_2((Function1) this.LLILLL, (Function1<Object, String>) 82), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatRoomAssembler@5031.assembleOnFirstMessageListLayout$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
