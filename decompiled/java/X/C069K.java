package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.069K, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.handler.bottomfooter.AimojiBottomMessageHandler$isValid$2", f = "AimojiBottomMessageHandler.kt", l = {}, m = "invokeSuspend")
public final class C069K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C06AH LL;
    public final /* synthetic */ C1645106cL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C069K(C06AH c06ah, C1645106cL c1645106cL, InterfaceC1364105Vn<? super C069K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c06ah;
        this.LLILLJJLI = c1645106cL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C069K(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AimojiBottomMessageHandler@b677.isValid$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL.LIZJ.noticeCode;
        if (str == null) {
            C1C7U.LIZIZ("AimojiBottomMessageHandler@b677.isValid$2");
            return false;
        }
        C1645106cL c1645106cL = this.LLILLJJLI;
        c1645106cL.LLJILJIL = c1645106cL.LJIIIZ(str).size();
        Boolean boolValueOf = Boolean.valueOf(!this.LLILLJJLI.LJIIIZ(str).isEmpty());
        C1C7U.LIZIZ("AimojiBottomMessageHandler@b677.isValid$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
