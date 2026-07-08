package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WY3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.performance.DefaultReceiveMsgPerfTracker$startFpsTracking$1", f = "DefaultReceiveMsgPerfTracker.kt", l = {}, m = "invokeSuspend")
public final class C0WY3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0WY6 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WY3(C0WY6 c0wy6, String str, int i, InterfaceC1364105Vn<? super C0WY3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0wy6;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0WY3(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultReceiveMsgPerfTracker@18fe.startFpsTracking$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0WY6 c0wy6 = this.LL;
        String str = this.LLILLJJLI;
        int i = this.LLILLL;
        c0wy6.getClass();
        String strLJ = C0WY6.LJ(i, str);
        if (!this.LL.LIZLLL.containsKey(strLJ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("im-receive-msg-");
            sbLIZ.append(strLJ);
            C0V2A c0v2a = new C0V2A(C2188811AlT.LIZIZ(sbLIZ), true);
            String str2 = this.LLILLJJLI;
            int i2 = this.LLILLL;
            C0WY6 c0wy62 = this.LL;
            C0WY7 c0wy7 = new C0WY7(c0v2a, str2, i2);
            C0WY8 c0wy8 = new C0WY8(c0wy7, (InterfaceC497601wk) c0wy62.LJI.getValue());
            c0v2a.LIZJ(c0wy8);
            c0v2a.LIZLLL(c0wy8);
            c0wy62.LIZLLL.put(strLJ, c0wy7);
            c0v2a.LJFF();
            C0WY6 c0wy63 = this.LL;
            String str3 = this.LLILLJJLI;
            int i3 = this.LLILLL;
            c0wy63.getClass();
            String strLJ2 = C0WY6.LJ(i3, str3);
            C09AE c09ae = (C09AE) ((LinkedHashMap) c0wy63.LJ).get(strLJ2);
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            c0wy63.LJ.put(strLJ2, C23250099c.LIZLLL((InterfaceC497601wk) c0wy63.LJI.getValue(), null, null, new C0WY4(c0wy63, strLJ2, str3, i3, null), 3));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DefaultReceiveMsgPerfTracker@18fe.startFpsTracking$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DefaultReceiveMsgPerfTracker@18fe.startFpsTracking$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
