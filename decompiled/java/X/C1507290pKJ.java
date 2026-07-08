package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pKJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.lemon.profile.Lemon8ProfileContentSyncHelper$updateWhenShow$1", f = "Lemon8ProfileContentSyncHelper.kt", l = {310}, m = "invokeSuspend")
public final class C1507290pKJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1507290pKJ(String str, InterfaceC1364105Vn<? super C1507290pKJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1507290pKJ c1507290pKJ = new C1507290pKJ(this.LLILLL, interfaceC1364105Vn);
        c1507290pKJ.LLILLJJLI = obj;
        return c1507290pKJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6 A[Catch: all -> 0x00c5, TryCatch #1 {all -> 0x00c5, blocks: (B:15:0x0058, B:16:0x005b, B:21:0x0064, B:23:0x0068, B:24:0x006a, B:28:0x0078, B:29:0x007a, B:31:0x008a, B:33:0x0090, B:34:0x00a2, B:36:0x00a6, B:40:0x00b2, B:39:0x00ab, B:41:0x00bd), top: B:68:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1507290pKJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
