package X;

import com.ss.android.ugc.aweme.ad.feed.shopping.FeedAdShoppingService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05rS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.shopping.FeedAdShoppingService$getShoppingCoupon$1", f = "FeedAdShoppingService.kt", l = {160, 173, 188}, m = "invokeSuspend")
public final class C1484005rS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public C259800zU LLILZLL;
    public C0XIR LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ FeedAdShoppingService LLJ;
    public final /* synthetic */ Aweme LLJI;
    public final /* synthetic */ Number LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ Function1<Object, Unit> LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1484005rS(FeedAdShoppingService feedAdShoppingService, Aweme aweme, Number number, String str, String str2, Function1<Object, Unit> function1, InterfaceC1364105Vn<? super C1484005rS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = feedAdShoppingService;
        this.LLJI = aweme;
        this.LLJIJIL = number;
        this.LLJILJIL = str;
        this.LLJILJILJ = str2;
        this.LLJILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1484005rS(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, java.lang.Integer] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1484005rS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
