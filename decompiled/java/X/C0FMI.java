package X;

import com.ss.android.ugc.aweme.creative.model.edit.InspirationItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FMI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.inspiration.ui.ImageInspirationTextStickerPresenter$fetchTemplateResource$1", f = "ImageInspirationTextStickerPresenter.kt", l = {131, 135, 140, 141, 146, 161}, m = "invokeSuspend")
public final class C0FMI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public int LLILZ;
    public final /* synthetic */ C0FMH LLILZIL;
    public final /* synthetic */ InspirationItemData LLILZLL;
    public final /* synthetic */ C0FMP LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FMI(C0FMH c0fmh, InspirationItemData inspirationItemData, C0FMP c0fmp, int i, InterfaceC1364105Vn<? super C0FMI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c0fmh;
        this.LLILZLL = inspirationItemData;
        this.LLIZ = c0fmp;
        this.LLIZLLLIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FMI(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[Catch: Exception -> 0x0080, TryCatch #0 {Exception -> 0x0080, blocks: (B:7:0x0023, B:13:0x0043, B:15:0x0077, B:12:0x0040), top: B:53:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9 A[Catch: Exception -> 0x0132, TryCatch #1 {Exception -> 0x0132, blocks: (B:23:0x0088, B:25:0x00a9, B:27:0x00ad, B:39:0x010a, B:32:0x00c6, B:36:0x00e2, B:22:0x0085, B:38:0x0107, B:44:0x012e), top: B:53:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2 A[Catch: Exception -> 0x0132, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0132, blocks: (B:23:0x0088, B:25:0x00a9, B:27:0x00ad, B:39:0x010a, B:32:0x00c6, B:36:0x00e2, B:22:0x0085, B:38:0x0107, B:44:0x012e), top: B:53:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0175  */
    /* JADX WARN: Type inference failed for: r0v17, types: [long] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, X.0FMO] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FMI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
