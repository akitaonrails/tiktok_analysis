package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.BulletinDataCenter$observe$1", f = "BulletinDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C605830NpV extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0OI4 LLILLJJLI;
    public final /* synthetic */ C0OIH<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605830NpV(C0OI4 c0oi4, C0OIH<Object> c0oih, InterfaceC1364105Vn<? super C605830NpV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0oi4;
        this.LLILLL = c0oih;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C605830NpV c605830NpV = new C605830NpV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c605830NpV.LL = obj;
        return c605830NpV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lRemove;
        C1C7U.LIZ("BulletinDataCenter@f17c.observe$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL != null) {
            C605840NpW c605840NpW = this.LLILLJJLI.LJ;
            String str = this.LLILLL.LIZ;
            if (!c605840NpW.LIZJ.contains(str) && (lRemove = c605840NpW.LIZIZ.remove(str)) != null) {
                long jLongValue = lRemove.longValue();
                c605840NpW.LIZJ.add(str);
                long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                C455801q0 c455801q0 = C455801q0.LIZ;
                long j = c605840NpW.LIZ;
                c455801q0.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BBArch [Monitor] dispatch: field=");
                sbLIZ.append(str);
                sbLIZ.append(", ");
                sbLIZ.append(jCurrentTimeMillis);
                sbLIZ.append("ms, bbId=");
                sbLIZ.append(j);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(j, "channel_id");
                c2344009Gk.LJIIIIZZ("field", str);
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "latency_ms");
                C20684815ws.LJIILLIIL("bb_arch_dc_dispatch", c2344009Gk.LIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinDataCenter@f17c.observe$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
