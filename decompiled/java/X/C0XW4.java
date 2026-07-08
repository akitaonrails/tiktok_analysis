package X;

import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.oneclicklogin.OIDCToken;
import com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XW4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService$oneClickLoginNew$block$1", f = "OneClickLoginService.kt", l = {746, 754, 762, 765, 776, 779, 784, 788}, m = "invokeSuspend")
public final class C0XW4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C846060XGy LL;
    public int LLILLJJLI;
    public final /* synthetic */ OIDCToken LLILLL;
    public final /* synthetic */ OneClickLoginService LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ BaseLoginMethod LLILZLL;
    public final /* synthetic */ C259800zU<EnumC23111093t> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ InterfaceC852200Xbu LLJ;
    public final /* synthetic */ Map<String, Object> LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ C0XWB LLJILJIL;
    public final /* synthetic */ C19EG LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ Function2<Throwable, EnumC23111093t, Unit> LLJJ;
    public final /* synthetic */ Function0<Unit> LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0XW4(OIDCToken oIDCToken, OneClickLoginService oneClickLoginService, String str, BaseLoginMethod baseLoginMethod, C259800zU<EnumC23111093t> c259800zU, String str2, InterfaceC852200Xbu interfaceC852200Xbu, Map<String, Object> map, String str3, C0XWB c0xwb, C19EG c19eg, boolean z, Function2<? super Throwable, ? super EnumC23111093t, Unit> function2, Function0<Unit> function0, InterfaceC1364105Vn<? super C0XW4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = oIDCToken;
        this.LLILZ = oneClickLoginService;
        this.LLILZIL = str;
        this.LLILZLL = baseLoginMethod;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = str2;
        this.LLJ = interfaceC852200Xbu;
        this.LLJI = map;
        this.LLJIJIL = str3;
        this.LLJILJIL = c0xwb;
        this.LLJILJILJ = c19eg;
        this.LLJILLL = z;
        this.LLJJ = function2;
        this.LLJJI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0XW4(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[Catch: Exception -> 0x01a4, CancellationException -> 0x01c5, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x01c5, Exception -> 0x01a4, blocks: (B:46:0x0108, B:47:0x010b, B:49:0x0119, B:8:0x0024, B:10:0x0028, B:12:0x002e, B:17:0x0044, B:20:0x004b, B:23:0x005e, B:27:0x0071, B:32:0x008c, B:34:0x0092, B:37:0x00b1, B:42:0x00c6, B:50:0x0125, B:55:0x0161, B:18:0x0047, B:16:0x0041, B:31:0x0089, B:41:0x00c3, B:54:0x015e, B:59:0x01a0), top: B:73:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119 A[Catch: Exception -> 0x01a4, CancellationException -> 0x01c5, TryCatch #2 {CancellationException -> 0x01c5, Exception -> 0x01a4, blocks: (B:46:0x0108, B:47:0x010b, B:49:0x0119, B:8:0x0024, B:10:0x0028, B:12:0x002e, B:17:0x0044, B:20:0x004b, B:23:0x005e, B:27:0x0071, B:32:0x008c, B:34:0x0092, B:37:0x00b1, B:42:0x00c6, B:50:0x0125, B:55:0x0161, B:18:0x0047, B:16:0x0041, B:31:0x0089, B:41:0x00c3, B:54:0x015e, B:59:0x01a0), top: B:73:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125 A[Catch: Exception -> 0x01a4, CancellationException -> 0x01c5, TryCatch #2 {CancellationException -> 0x01c5, Exception -> 0x01a4, blocks: (B:46:0x0108, B:47:0x010b, B:49:0x0119, B:8:0x0024, B:10:0x0028, B:12:0x002e, B:17:0x0044, B:20:0x004b, B:23:0x005e, B:27:0x0071, B:32:0x008c, B:34:0x0092, B:37:0x00b1, B:42:0x00c6, B:50:0x0125, B:55:0x0161, B:18:0x0047, B:16:0x0041, B:31:0x0089, B:41:0x00c3, B:54:0x015e, B:59:0x01a0), top: B:73:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARN: Type inference failed for: r2v20, types: [T, X.093t] */
    /* JADX WARN: Type inference failed for: r2v27, types: [T, X.093t] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XW4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
