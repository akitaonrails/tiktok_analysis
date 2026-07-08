package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10ZN, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.tiktok.kmp.deeplink.s2l.shortlinkcache.ShortLinkCacheManager$saveShortLink$1", f = "ShortLinkCacheManager.kt", l = {354}, m = "invokeSuspend")
public final class C10ZN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ long LLJIJIL;
    public final /* synthetic */ long LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10ZN(String str, int i, long j, long j2, String str2, String str3, InterfaceC1364105Vn<? super C10ZN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = str;
        this.LLJI = i;
        this.LLJIJIL = j;
        this.LLJILJIL = j2;
        this.LLJILJILJ = str2;
        this.LLJILLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10ZN(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10ZN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
