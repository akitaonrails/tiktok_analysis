package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mD7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.action.ShareActionHelperKt$showDeleteReeditBottomSheet$1", f = "ShareActionHelper.kt", l = {324}, m = "invokeSuspend")
public final class C1387510mD7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public IExternalService LL;
    public int LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ C0HTT<C737030Svd> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;
    public final /* synthetic */ Function0<Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1387510mD7(Aweme aweme, boolean z, Context context, C0HTT c0htt, String str, String str2, String str3, Function0 function0, Function0 function02, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aweme;
        this.LLILZ = z;
        this.LLILZIL = context;
        this.LLILZLL = c0htt;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
        this.LLJI = function0;
        this.LLJIJIL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1387510mD7(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0138  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1387510mD7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
