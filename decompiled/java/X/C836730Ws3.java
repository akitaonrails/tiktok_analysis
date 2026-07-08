package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ws3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.android.live.walletnew.ui.LocationService$Companion$requestLocationData$1", f = "LocationService.kt", l = {111}, m = "invokeSuspend")
public final class C836730Ws3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ URL LLILLJJLI;
    public final /* synthetic */ InterfaceC596190NZx LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C836730Ws3(URL url, InterfaceC596190NZx interfaceC596190NZx, InterfaceC1364105Vn<? super C836730Ws3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = url;
        this.LLILLL = interfaceC596190NZx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C836730Ws3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("LocationService$Companion@e704.requestLocationData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1495520p1K c1495520p1K = new C1495520p1K();
                C0X33 c0x33 = new C0X33();
                URL url = this.LLILLJJLI;
                if (url != null) {
                    c0x33.LJIIIIZZ(C0XLQ.LJIIIZ(url.toString()));
                    c0x33.LIZLLL.LIZ("Connection", "Keep-Alive");
                    C0XLY c0xlyJ0 = C2204961BRm.j0(C1495500p1I.LIZJ(c1495520p1K, c0x33.LIZIZ(), false), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYC5pn5y+bK7cEWIKks1s5GiJFqpJzqS75gSyg5g==", null));
                    AbstractC842510X3h abstractC842510X3h = c0xlyJ0.LLIZ;
                    if (abstractC842510X3h != null) {
                        String strString = abstractC842510X3h.string();
                        if (strString == null) {
                            strString = "";
                        }
                        c0xlyJ0.close();
                        C1DFH c1dfh = C0PEM.LIZ;
                        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                        C596180NZw c596180NZw = new C596180NZw(this.LLILLL, strString, null);
                        this.LL = 1;
                        if (C23250099c.LJI(this, abstractC2238408pq, c596180NZw) == objLJFF) {
                            C1C7U.LIZIZ("LocationService$Companion@e704.requestLocationData$1");
                            return objLJFF;
                        }
                    } else {
                        this.LLILLL.LIZIZ("Internal Error");
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("LocationService$Companion@e704.requestLocationData$1");
                        return unit;
                    }
                } else {
                    throw new NullPointerException("url == null");
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("LocationService$Companion@e704.requestLocationData$1");
            return unit2;
        } catch (Error e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.LIZIZ("Internet Error");
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("LocationService$Companion@e704.requestLocationData$1");
            return unit3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
