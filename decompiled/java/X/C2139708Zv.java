package X;

import com.bytedance.crash.Npth;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.asve.editor.ASNLEEditor$setNLEMonitor$1$onEvent$3", f = "ASNLEEditor.kt", l = {}, m = "invokeSuspend")
public final class C2139708Zv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C082W LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ HashMap<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2139708Zv(String str, C082W c082w, String str2, HashMap<String, String> map, InterfaceC1364105Vn<? super C2139708Zv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c082w;
        this.LLILLL = str2;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2139708Zv(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ASNLEEditor@ec40.setNLEMonitor$1$onEvent$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Npth.reportBizException(this.LL, this.LLILLJJLI, this.LLILLL, null, this.LLILZ, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ASNLEEditor@ec40.setNLEMonitor$1$onEvent$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
