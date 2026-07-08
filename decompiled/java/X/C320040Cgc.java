package X;

import com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS583S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0Cgc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem$initInputView$1$18$1", f = "BottomInputAssem.kt", l = {}, m = "invokeSuspend")
public final class C320040Cgc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BottomInputAssem LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320040Cgc(BottomInputAssem bottomInputAssem, String str, InterfaceC1364105Vn<? super C320040Cgc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bottomInputAssem;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320040Cgc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BottomInputAssem@df38.initInputView$1$18$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU c259800zU = new C259800zU();
        BottomInputAssem bottomInputAssem = this.LL;
        bottomInputAssem.withState(bottomInputAssem.sp(), new AwS583S0100000_4(c259800zU, (C259800zU<String>) 288));
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = this.LL.getCommonParams().get("enter_from");
        String str2 = this.LL.getCommonParams().get("enter_method");
        String str3 = this.LL.getCommonParams().get("process_id");
        String str4 = this.LL.getCommonParams().get("tako_session_id");
        if (str4 == null) {
            str4 = "";
        }
        C1862330yYx.LJJJIL(c1862330yYx, str, str2, str3, str4, this.LL.getCommonParams().get("tako_chat_id"), (String) c259800zU.element, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BottomInputAssem@df38.initInputView$1$18$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
