package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.118F, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editSticker.text.effect.EffectTextMgr$getEffectTextFontFromNet$2", f = "EffectTextMgr.kt", l = {359, 362}, m = "invokeSuspend")
public final class C118F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C2280608we>>, Object> {
    public boolean LL;
    public AnonymousClass1231 LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public C2280608we LLILZLL;
    public int LLIZ;
    public final /* synthetic */ AnonymousClass1231 LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118F(AnonymousClass1231 anonymousClass1231, String str, boolean z, InterfaceC1364105Vn<? super C118F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = anonymousClass1231;
        this.LLJ = str;
        this.LLJI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C118F(this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0087 A[Catch: Exception -> 0x0137, TryCatch #1 {Exception -> 0x0137, blocks: (B:7:0x0028, B:19:0x0081, B:21:0x0087, B:30:0x00be, B:31:0x00c5, B:33:0x00cb, B:34:0x00f1, B:38:0x0103, B:39:0x010e, B:41:0x0114, B:43:0x011a, B:44:0x0120, B:45:0x0133, B:17:0x006e, B:18:0x0071, B:11:0x0038, B:13:0x0065), top: B:54:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[Catch: Exception -> 0x0139, TRY_LEAVE, TryCatch #0 {Exception -> 0x0139, blocks: (B:24:0x00ac, B:26:0x00b4), top: B:52:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a9 -> B:52:0x00ac). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118F.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C2280608we>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
