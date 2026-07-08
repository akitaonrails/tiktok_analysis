package X;

import com.ss.android.ugc.aweme.aigc.FileServiceImpl;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AIGCDownloadTimeoutExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.FileServiceImpl$downloadToCache$1", f = "FileServiceImpl.kt", l = {236, 249}, m = "invokeSuspend")
public final class C541870LMz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AIGCDownloadTimeoutExp.AIGCDownloadTimeoutConfig LL;
    public int LLILLJJLI;
    public final /* synthetic */ FileServiceImpl LLILLL;
    public final /* synthetic */ C0LN8 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ InterfaceC332260D0u<C0LN4<String>> LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541870LMz(int i, FileServiceImpl fileServiceImpl, C0LN8 c0ln8, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC332260D0u interfaceC332260D0u) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = fileServiceImpl;
        this.LLILZ = c0ln8;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = interfaceC332260D0u;
        this.LLIZLLLIL = i;
        this.LLJ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C541870LMz(this.LLIZLLLIL, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLJ, interfaceC1364105Vn, this.LLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541870LMz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
