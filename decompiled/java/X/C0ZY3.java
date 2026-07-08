package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ui.gradient.IMMessageBubbleUtils;
import com.ss.android.ugc.aweme.models.MessageBubbleStyle;
import com.ss.android.ugc.aweme.utils.IChatCustomizeImageLoadHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZY3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ui.gradient.IMMessageBubbleUtils$bindCustomBubble$1", f = "IMMessageBubbleUtils.kt", l = {414}, m = "invokeSuspend")
public final class C0ZY3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MessageBubbleStyle LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function1<Exception, Unit> LLILZLL;
    public final /* synthetic */ IMMessageBubbleUtils LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ C0ZY6 LLJ;
    public final /* synthetic */ View LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0ZY3(MessageBubbleStyle messageBubbleStyle, View view, boolean z, Function1<? super Exception, Unit> function1, IMMessageBubbleUtils iMMessageBubbleUtils, Function0<Unit> function0, C0ZY6 c0zy6, View view2, InterfaceC1364105Vn<? super C0ZY3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = messageBubbleStyle;
        this.LLILZ = view;
        this.LLILZIL = z;
        this.LLILZLL = function1;
        this.LLIZ = iMMessageBubbleUtils;
        this.LLIZLLLIL = function0;
        this.LLJ = c0zy6;
        this.LLJI = view2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0ZY3 c0zy3 = new C0ZY3(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c0zy3.LLILLJJLI = obj;
        return c0zy3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        Drawable drawable;
        Object imageDrawable = obj;
        C1C7U.LIZ("IMMessageBubbleUtils@3713.bindCustomBubble$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                try {
                    C155000ia.LIZIZ(imageDrawable);
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    this.LLILZLL.invoke(e);
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ.LLIILII(), null, new C0ZY5(this.LLIZ, this.LLILZ, this.LLILLL, this.LLILZIL, this.LLIZLLLIL, null), 2);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMMessageBubbleUtils@3713.bindCustomBubble$1");
                    return unit;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(imageDrawable);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            try {
                IChatCustomizeImageLoadHelper.LIZ.getClass();
                IChatCustomizeImageLoadHelper iChatCustomizeImageLoadHelperLIZ = C0ZYD.LIZ();
                if (iChatCustomizeImageLoadHelperLIZ != null) {
                    MessageBubbleStyle messageBubbleStyle = this.LLILLL;
                    Context context = this.LLILZ.getContext();
                    boolean z = this.LLILZIL;
                    this.LLILLJJLI = interfaceC497601wk;
                    this.LL = 1;
                    imageDrawable = iChatCustomizeImageLoadHelperLIZ.getImageDrawable(messageBubbleStyle, context, z, this);
                    if (imageDrawable == objLJFF) {
                        C1C7U.LIZIZ("IMMessageBubbleUtils@3713.bindCustomBubble$1");
                        return objLJFF;
                    }
                } else {
                    drawable = null;
                    C1DFH c1dfh2 = C0PEM.LIZ;
                    C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ.LLIILII(), null, new C0ZY4(drawable, this.LLJ, this.LLILZ, this.LLJI, this.LLILLL, this.LLIZLLLIL, null), 2);
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("IMMessageBubbleUtils@3713.bindCustomBubble$1");
                    return unit2;
                }
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                this.LLILZLL.invoke(e);
                C1DFH c1dfh3 = C0PEM.LIZ;
                C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ.LLIILII(), null, new C0ZY5(this.LLIZ, this.LLILZ, this.LLILLL, this.LLILZIL, this.LLIZLLLIL, null), 2);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("IMMessageBubbleUtils@3713.bindCustomBubble$1");
                return unit3;
            }
        }
        drawable = (Drawable) imageDrawable;
        C1DFH c1dfh22 = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ.LLIILII(), null, new C0ZY4(drawable, this.LLJ, this.LLILZ, this.LLJI, this.LLILLL, this.LLIZLLLIL, null), 2);
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("IMMessageBubbleUtils@3713.bindCustomBubble$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
