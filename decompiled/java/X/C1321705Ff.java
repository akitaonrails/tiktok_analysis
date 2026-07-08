package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.video.util.PreVideoPlayTimeUtil$onReadyToStartVideoPlay$1", f = "PreVideoPlayTimeUtil.kt", l = {}, m = "invokeSuspend")
public final class C1321705Ff extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1321705Ff(long j, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1321705Ff(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreVideoPlayTimeUtil@fb3b.onReadyToStartVideoPlay$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        if (str == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PreVideoPlayTimeUtil@fb3b.onReadyToStartVideoPlay$1");
            return unit;
        }
        C1322105Fj.LLILLL.put(str, C2286608xc.LJFF(this.LLILLJJLI));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PreVideoPlayTimeUtil@fb3b.onReadyToStartVideoPlay$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
