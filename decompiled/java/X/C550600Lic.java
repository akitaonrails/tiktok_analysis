package X;

import com.ss.android.ugc.aweme.portrait.service.AIPortraitFileServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.service.AIPortraitFileServiceImpl$uploadImage$1", f = "AIPortraitFileServiceImpl.kt", l = {57, 67, 69, 83}, m = "invokeSuspend")
public final class C550600Lic extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIPortraitFileServiceImpl LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550600Lic(AIPortraitFileServiceImpl aIPortraitFileServiceImpl, String str, String str2, InterfaceC1364105Vn<? super C550600Lic> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aIPortraitFileServiceImpl;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C550600Lic c550600Lic = new C550600Lic(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c550600Lic.LLILLJJLI = obj;
        return c550600Lic;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C550600Lic.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
