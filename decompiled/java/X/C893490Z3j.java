package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.analytics.IMMessageReactionAnalytics$reportReactMessage$1", f = "IMMessageReactionAnalytics.kt", l = {77, 112}, m = "invokeSuspend")
public final class C893490Z3j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ InterfaceC1493105sv LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C893490Z3j(C869590Y9l c869590Y9l, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C893490Z3j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c869590Y9l;
        this.LLILZ = map;
        this.LLILZIL = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C893490Z3j(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea A[LOOP:0: B:47:0x00e4->B:49:0x00ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ec A[LOOP:1: B:72:0x01e6->B:74:0x01ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C893490Z3j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
