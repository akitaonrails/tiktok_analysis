package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.models.MessageBubbleStyle;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZY4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ui.gradient.IMMessageBubbleUtils$bindCustomBubble$1$1", f = "IMMessageBubbleUtils.kt", l = {}, m = "invokeSuspend")
public final class C0ZY4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Drawable LLILLJJLI;
    public final /* synthetic */ C0ZY6 LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ MessageBubbleStyle LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZY4(Drawable drawable, C0ZY6 c0zy6, View view, View view2, MessageBubbleStyle messageBubbleStyle, Function0<Unit> function0, InterfaceC1364105Vn<? super C0ZY4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = drawable;
        this.LLILLL = c0zy6;
        this.LLILZ = view;
        this.LLILZIL = view2;
        this.LLILZLL = messageBubbleStyle;
        this.LLIZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0ZY4 c0zy4 = new C0ZY4(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0zy4.LL = obj;
        return c0zy4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMessageBubbleUtils@3713.bindCustomBubble$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C23118094a.LJIIIIZZ(((InterfaceC497601wk) this.LL).getCoroutineContext())) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMMessageBubbleUtils@3713.bindCustomBubble$1$1");
            return unit;
        }
        Drawable drawable = this.LLILLJJLI;
        if (drawable != null) {
            C0ZY6 c0zy6 = this.LLILLL;
            View view = this.LLILZ;
            View view2 = this.LLILZIL;
            MessageBubbleStyle messageBubbleStyle = this.LLILZLL;
            Function0<Unit> function0 = this.LLIZ;
            View viewLIZ = c0zy6.LIZ(view, true);
            if (viewLIZ != null) {
                viewLIZ.setBackground(null);
            }
            view2.setBackground(drawable);
            view2.setTag(R.id.bot, messageBubbleStyle.resourceId);
            function0.invoke();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMMessageBubbleUtils@3713.bindCustomBubble$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
