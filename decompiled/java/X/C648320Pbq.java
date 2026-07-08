package X;

import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.EcomSearchListPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Pbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.EcomSearchListPlayer$traversePlay$1", f = "EcomSearchListPlayer.kt", l = {264}, m = "invokeSuspend")
public final class C648320Pbq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EcomSearchListPlayer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C648320Pbq(EcomSearchListPlayer ecomSearchListPlayer, InterfaceC1364105Vn<? super C648320Pbq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = ecomSearchListPlayer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C648320Pbq c648320Pbq = new C648320Pbq(this.LLILLL, interfaceC1364105Vn);
        c648320Pbq.LLILLJJLI = obj;
        return c648320Pbq;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c8 -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C648320Pbq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
