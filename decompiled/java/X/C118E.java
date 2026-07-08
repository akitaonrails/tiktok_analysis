package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.118E, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editSticker.text.effect.EffectTextMgr$getEffectTextFromNet$2", f = "EffectTextMgr.kt", l = {323, 326, 329}, m = "invokeSuspend")
public final class C118E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C11UK>>, Object> {
    public Object LL;
    public AnonymousClass1231 LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public C11UK LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public final /* synthetic */ AnonymousClass1231 LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ List<C2280608we> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118E(AnonymousClass1231 anonymousClass1231, String str, boolean z, List<C2280608we> list, InterfaceC1364105Vn<? super C118E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = anonymousClass1231;
        this.LLJIJIL = str;
        this.LLJILJIL = z;
        this.LLJILJILJ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C118E(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[Catch: Exception -> 0x01a8, TryCatch #1 {Exception -> 0x01a8, blocks: (B:8:0x0033, B:22:0x00b6, B:24:0x00bc, B:42:0x0124, B:43:0x012b, B:45:0x0131, B:46:0x015f, B:50:0x0171, B:51:0x017c, B:53:0x0182, B:55:0x0188, B:56:0x018e, B:57:0x01a1, B:20:0x00a1, B:21:0x00a4, B:14:0x0069, B:16:0x0098), top: B:64:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6 A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:28:0x00de, B:30:0x00e6, B:31:0x00ef, B:27:0x00db), top: B:62:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:28:0x00de, B:30:0x00e6, B:31:0x00ef, B:27:0x00db), top: B:62:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e6 -> B:22:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0111 -> B:34:0x0114). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118E.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C11UK>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
