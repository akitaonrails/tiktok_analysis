package X;

import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CoX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoEnterUtil$showTakoSheet$1$2", f = "TakoEnterUtil.kt", l = {}, m = "invokeSuspend")
public final class C324950CoX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoEnterParams LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324950CoX(TakoEnterParams takoEnterParams, long j, boolean z, String str, InterfaceC1364105Vn<? super C324950CoX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoEnterParams;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324950CoX(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoEnterUtil@4341.showTakoSheet$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        TakoEnterParams takoEnterParams = this.LL;
        String str = takoEnterParams.enterFrom;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = takoEnterParams.enterMethod;
        if (str3 != null) {
            str2 = str3;
        }
        long j = this.LLILLJJLI;
        C1862330yYx.LJJLIL(c1862330yYx, str, str2, j, this.LLILLL, j, this.LLILZ, 64);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoEnterUtil@4341.showTakoSheet$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
