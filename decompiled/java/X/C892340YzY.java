package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.actionbar.analytics.ActionBarAnalytics$trackActionBarButtonShow$1", f = "ActionBarAnalytics.kt", l = {71, 77}, m = "invokeSuspend")
public final class C892340YzY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public InterfaceC1493105sv LLILLJJLI;
    public C892350YzZ LLILLL;
    public int LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ C892350YzZ LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ InterfaceC1493105sv LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C892340YzY(Map<String, String> map, C892350YzZ c892350YzZ, String str, int i, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C892340YzY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = map;
        this.LLILZLL = c892350YzZ;
        this.LLIZ = str;
        this.LLIZLLLIL = i;
        this.LLJ = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C892340YzY(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C892340YzY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
