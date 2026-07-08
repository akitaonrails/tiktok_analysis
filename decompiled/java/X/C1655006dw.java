package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.ChatRoomAlphaVideoAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06dw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.ChatRoomAlphaVideoAssem$onViewCreated$5", f = "ChatRoomAlphaVideoAssem.kt", l = {131}, m = "invokeSuspend")
public final class C1655006dw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ChatRoomAlphaVideoAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1655006dw(ChatRoomAlphaVideoAssem chatRoomAlphaVideoAssem, InterfaceC1364105Vn<? super C1655006dw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = chatRoomAlphaVideoAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1655006dw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatRoomAlphaVideoAssem@24cf.onViewCreated$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDq = this.LLILLJJLI.Lo().LLILZLL;
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 28);
            this.LL = 1;
            if (c2252321DDq.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("ChatRoomAlphaVideoAssem@24cf.onViewCreated$5");
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
