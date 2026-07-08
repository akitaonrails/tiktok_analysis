package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05W8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.MusicPanelLyricsEffectComponent$applyLyricsEffect$2", f = "MusicPanelLyricsEffectComponent.kt", l = {472, 494}, m = "invokeSuspend")
public final class C05W8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<InterfaceC1173304iR> LLILLL;
    public final /* synthetic */ C1465410oEl LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C05XL<Boolean> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05W8(AnonymousClass0957<? extends InterfaceC1173304iR> anonymousClass0957, C1465410oEl c1465410oEl, long j, String str, C05XL<Boolean> c05xl, InterfaceC1364105Vn<? super C05W8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0957;
        this.LLILZ = c1465410oEl;
        this.LLILZIL = j;
        this.LLILZLL = str;
        this.LLIZ = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05W8 c05w8 = new C05W8(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c05w8.LLILLJJLI = obj;
        return c05w8;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3 A[Catch: CancellationException -> 0x0132, all -> 0x0152, TryCatch #4 {CancellationException -> 0x0132, all -> 0x0152, blocks: (B:41:0x00c6, B:42:0x00c9, B:45:0x00d3, B:46:0x00e1, B:48:0x00e6, B:56:0x00fa, B:57:0x0108, B:58:0x0111, B:62:0x0118, B:65:0x0124, B:53:0x00ee, B:54:0x00ef, B:55:0x00f0, B:14:0x003a, B:15:0x003d, B:17:0x0044, B:20:0x004a, B:22:0x0064, B:23:0x006e, B:27:0x0081, B:28:0x0082, B:30:0x0088, B:31:0x0089, B:33:0x009c, B:34:0x00a1, B:36:0x00b0, B:68:0x0130, B:69:0x0131, B:11:0x002a), top: B:80:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0 A[Catch: CancellationException -> 0x0132, all -> 0x0152, TryCatch #4 {CancellationException -> 0x0132, all -> 0x0152, blocks: (B:41:0x00c6, B:42:0x00c9, B:45:0x00d3, B:46:0x00e1, B:48:0x00e6, B:56:0x00fa, B:57:0x0108, B:58:0x0111, B:62:0x0118, B:65:0x0124, B:53:0x00ee, B:54:0x00ef, B:55:0x00f0, B:14:0x003a, B:15:0x003d, B:17:0x0044, B:20:0x004a, B:22:0x0064, B:23:0x006e, B:27:0x0081, B:28:0x0082, B:30:0x0088, B:31:0x0089, B:33:0x009c, B:34:0x00a1, B:36:0x00b0, B:68:0x0130, B:69:0x0131, B:11:0x002a), top: B:80:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05W8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
