package X;

import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L8K, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity$startCompressAndWait$1", f = "NLECutCompressActivity.kt", l = {135}, m = "invokeSuspend")
public final class C0L8K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ CutSource LLILLL;
    public final /* synthetic */ NLECutCompressActivity LLILZ;
    public final /* synthetic */ TemplateSourceConfig LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C537930L7v LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L8K(CutSource cutSource, NLECutCompressActivity nLECutCompressActivity, TemplateSourceConfig templateSourceConfig, String str, C537930L7v c537930L7v, InterfaceC1364105Vn<? super C0L8K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = cutSource;
        this.LLILZ = nLECutCompressActivity;
        this.LLILZIL = templateSourceConfig;
        this.LLILZLL = str;
        this.LLIZ = c537930L7v;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L8K(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L8K.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
