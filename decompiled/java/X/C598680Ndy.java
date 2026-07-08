package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ndy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.service.SkylightLayeredDiskCacheServiceImpl$storeSkylightPOData$1", f = "SkylightLayeredDiskCacheServiceImpl.kt", l = {211, 214, 228}, m = "invokeSuspend")
public final class C598680Ndy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public long LLILLJJLI;
    public long LLILLL;
    public Object LLILZ;
    public C099G LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ C610670NxJ LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C598680Ndy(int i, List<? extends InterfaceC1891350zJl> list, boolean z, boolean z2, C610670NxJ c610670NxJ, int i2, InterfaceC1364105Vn<? super C598680Ndy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = i;
        this.LLJ = list;
        this.LLJI = z;
        this.LLJIJIL = z2;
        this.LLJILJIL = c610670NxJ;
        this.LLJILJILJ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598680Ndy(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C598680Ndy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
