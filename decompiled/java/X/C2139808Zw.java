package X;

import com.bytedance.crash.Npth;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Zw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.asve.editor.ASNLEEditor$setNLEMonitor$1$onEvent$2", f = "ASNLEEditor.kt", l = {}, m = "invokeSuspend")
public final class C2139808Zw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Throwable LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ HashMap<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2139808Zw(Throwable th, String str, HashMap<String, String> map, InterfaceC1364105Vn<? super C2139808Zw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = th;
        this.LLILLJJLI = str;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2139808Zw(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ASNLEEditor@ec40.setNLEMonitor$1$onEvent$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Npth.reportBizException("nle_multi_thread_check", this.LL, this.LLILLJJLI, null, this.LLILLL, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ASNLEEditor@ec40.setNLEMonitor$1$onEvent$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
