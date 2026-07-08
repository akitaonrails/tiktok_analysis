package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.sticker.helper.CommentStickerDetailView$bind$5$1", f = "CommentStickerClickHelper.kt", l = {}, m = "invokeSuspend")
public final class C444230HbR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C454220HrY LL;
    public final /* synthetic */ CharSequence LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C444230HbR(C454220HrY c454220HrY, CharSequence charSequence, InterfaceC1364105Vn<? super C444230HbR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c454220HrY;
        this.LLILLJJLI = charSequence;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C444230HbR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentStickerDetailView@2dcc.bind$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LL.setText(this.LLILLJJLI);
        this.LL.LL.setHighlightColor(0);
        C786410Ut5.LLLLZLL(this.LL.LL, 0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentStickerDetailView@2dcc.bind$5$1");
        return unit;
    }
}
