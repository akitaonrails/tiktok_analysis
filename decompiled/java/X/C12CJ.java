package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12CJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ui.imagepreview.utils.ImageDynamicBgColorController$ensureExtracted$1", f = "ImageDynamicBgColorController.kt", l = {132, 136}, m = "invokeSuspend")
public final class C12CJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C12CI LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C12CL LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12CJ(C12CI c12ci, int i, String str, C12CL c12cl, InterfaceC1364105Vn<? super C12CJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c12ci;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = c12cl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12CJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:24:0x0078, B:25:0x007b, B:27:0x0093, B:28:0x009a, B:30:0x00c5, B:14:0x0035, B:15:0x0038, B:17:0x003c, B:20:0x004b, B:10:0x0025), top: B:41:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5 A[Catch: all -> 0x00dc, TRY_LEAVE, TryCatch #1 {all -> 0x00dc, blocks: (B:24:0x0078, B:25:0x007b, B:27:0x0093, B:28:0x009a, B:30:0x00c5, B:14:0x0035, B:15:0x0038, B:17:0x003c, B:20:0x004b, B:10:0x0025), top: B:41:0x0013 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12CJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
