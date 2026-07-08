package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.ui.gradient.IMMessageBubbleUtils;
import com.ss.android.ugc.aweme.models.MessageBubbleStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZY5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ui.gradient.IMMessageBubbleUtils$bindCustomBubble$1$drawable$1", f = "IMMessageBubbleUtils.kt", l = {}, m = "invokeSuspend")
public final class C0ZY5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMMessageBubbleUtils LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ MessageBubbleStyle LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZY5(IMMessageBubbleUtils iMMessageBubbleUtils, View view, MessageBubbleStyle messageBubbleStyle, boolean z, Function0<Unit> function0, InterfaceC1364105Vn<? super C0ZY5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMMessageBubbleUtils;
        this.LLILLJJLI = view;
        this.LLILLL = messageBubbleStyle;
        this.LLILZ = z;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZY5(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMessageBubbleUtils@3713.bindCustomBubble$1$drawable$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIILLIIL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMMessageBubbleUtils@3713.bindCustomBubble$1$drawable$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
