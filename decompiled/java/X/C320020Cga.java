package X;

import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.InputInnerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Cga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.InputInnerAssem$onReportTouchDownSend$1", f = "InputInnerAssem.kt", l = {}, m = "invokeSuspend")
public final class C320020Cga extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InputInnerAssem LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320020Cga(InputInnerAssem inputInnerAssem, boolean z, Long l, InterfaceC1364105Vn<? super C320020Cga> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = inputInnerAssem;
        this.LLILLJJLI = z;
        this.LLILLL = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320020Cga(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("InputInnerAssem@e064.onReportTouchDownSend$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = this.LL.getCommonParams().get("enter_from");
        String str2 = this.LL.getCommonParams().get("enter_method");
        String str3 = this.LL.getCommonParams().get("process_id");
        String str4 = this.LL.getCommonParams().get("tako_session_id");
        if (str4 == null) {
            str4 = "";
        }
        C1862330yYx.LJLL(c1862330yYx, str, str2, str3, Boolean.valueOf(this.LLILLJJLI), this.LLILLL, str4, this.LL.getCommonParams().get("tako_chat_id"));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InputInnerAssem@e064.onReportTouchDownSend$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
