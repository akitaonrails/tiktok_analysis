package X;

import com.tiktok.ssc.event.EventFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05EM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.tiktok.ssc.event.SSCEventCenter$registerListener$1", f = "SSCEventCenter.kt", l = {}, m = "invokeSuspend")
public final class C05EM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05EL LL;
    public final /* synthetic */ EventFilter LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05EM(C05EL c05el, EventFilter eventFilter, int i, boolean z, String str, InterfaceC1364105Vn<? super C05EM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05el;
        this.LLILLJJLI = eventFilter;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05EM(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SSCEventCenter@e397.registerListener$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C05EO.LIZ.put(this.LLILZIL, new C05EN(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SSCEventCenter@e397.registerListener$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
