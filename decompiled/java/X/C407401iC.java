package X;

import android.text.SpannableStringBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01iC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comment.emoji.EmojiTextHelper$matchEmoji$3$1$onDrawableLoaded$3", f = "EmojiTextHelper.kt", l = {}, m = "invokeSuspend")
public final class C407401iC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function2<SpannableStringBuilder, Boolean, Unit> LL;
    public final /* synthetic */ SpannableStringBuilder LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C407401iC(Function2<? super SpannableStringBuilder, ? super Boolean, Unit> function2, SpannableStringBuilder spannableStringBuilder, InterfaceC1364105Vn<? super C407401iC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function2;
        this.LLILLJJLI = spannableStringBuilder;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C407401iC(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmojiTextHelper@efde.matchEmoji$3$1$onDrawableLoaded$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function2<SpannableStringBuilder, Boolean, Unit> function2 = this.LL;
        if (function2 != null) {
            function2.invoke(this.LLILLJJLI, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EmojiTextHelper@efde.matchEmoji$3$1$onDrawableLoaded$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
