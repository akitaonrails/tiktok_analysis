package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HIL, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.action.ShareActionHelperKt$showDeleteConfirmDialogInner$5", f = "ShareActionHelper.kt", l = {}, m = "invokeSuspend")
public final class C0HIL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C0HTT<C737030Svd> LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C013C LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HIL(Context context, C0HTT<C737030Svd> c0htt, Aweme aweme, String str, String str2, String str3, C013C c013c, Function0<Unit> function0, InterfaceC1364105Vn<? super C0HIL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = c0htt;
        this.LLILLL = aweme;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = c013c;
        this.LLIZLLLIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HIL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareActionHelperKt@b52e.showDeleteConfirmDialogInner$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1387490mD5.LJII(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ.element, this.LLIZLLLIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareActionHelperKt@b52e.showDeleteConfirmDialogInner$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
