package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.video.util.PreVideoPlayTimeUtil$addPlayRecord$1", f = "PreVideoPlayTimeUtil.kt", l = {}, m = "invokeSuspend")
public final class C1321905Fh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1321905Fh(String str, InterfaceC1364105Vn<? super C1321905Fh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1321905Fh(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreVideoPlayTimeUtil@fb3b.addPlayRecord$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Long l = C1322105Fj.LLILLL.get(this.LL);
        if (l != null) {
            C1322005Fi c1322005Fi = new C1322005Fi(this.LL, l.longValue());
            C1322105Fj.LLILLJJLI.getClass();
            Keva kevaLIZ = C1322105Fj.LIZ();
            String str = this.LL;
            C1322105Fj.LLILZIL.getValue().getClass();
            kevaLIZ.storeString(str, C1227904rF.LJI(c1322005Fi));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("1 ");
            sbLIZ.append(C1322105Fj.LIZ().getString(this.LL, ""));
            sbLIZ.append(" add record");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreVideoPlayTimeUtil@fb3b.addPlayRecord$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
