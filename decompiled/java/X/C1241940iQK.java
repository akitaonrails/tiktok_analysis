package X;

import com.ss.android.ugc.aweme.im.protocal.IMAccountsChunkProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iQK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.protocal.IMAccountsChunkProtocol$runMixSearch$2", f = "IMAccountsChunkProtocol.kt", l = {131, 138, 147}, m = "invokeSuspend")
public final class C1241940iQK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1241920iQI>, Object> {
    public C1916007ew LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ IMAccountsChunkProtocol LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241940iQK(IMAccountsChunkProtocol iMAccountsChunkProtocol, String str, long j, InterfaceC1364105Vn<? super C1241940iQK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = iMAccountsChunkProtocol;
        this.LLILZIL = str;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1241940iQK c1241940iQK = new C1241940iQK(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1241940iQK.LLILLL = obj;
        return c1241940iQK;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1241940iQK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1241920iQI> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
