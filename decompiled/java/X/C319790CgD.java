package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.VoiceChangeLogicComponent$seek$1", f = "VoiceChangeApiComponent.kt", l = {}, m = "invokeSuspend")
public final class C319790CgD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19541711ct LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319790CgD(C19541711ct c19541711ct, int i, String str, InterfaceC1364105Vn<? super C319790CgD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19541711ct;
        this.LLILLJJLI = i;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319790CgD(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceChangeLogicComponent@80a3.seek$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function2<? super Integer, ? super String, Unit> function2 = this.LL.LLJ;
        if (function2 != null) {
            function2.invoke(C2286608xc.LJ(this.LLILLJJLI), this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceChangeLogicComponent@80a3.seek$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
