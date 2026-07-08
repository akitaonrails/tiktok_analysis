package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WY5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.performance.DefaultReceiveMsgPerfTracker$stopFpsTracking$1", f = "DefaultReceiveMsgPerfTracker.kt", l = {}, m = "invokeSuspend")
public final class C0WY5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0WY6 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WY5(C0WY6 c0wy6, String str, int i, int i2, int i3, int i4, int i5, int i6, InterfaceC1364105Vn<? super C0WY5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0wy6;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
        this.LLIZ = i5;
        this.LLIZLLLIL = i6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0WY5(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultReceiveMsgPerfTracker@18fe.stopFpsTracking$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0WY6 c0wy6 = this.LL;
        String str = this.LLILLJJLI;
        int i = this.LLILLL;
        c0wy6.getClass();
        String strLJ = C0WY6.LJ(i, str);
        C0WY7 c0wy7 = (C0WY7) ((LinkedHashMap) this.LL.LIZLLL).get(strLJ);
        if (c0wy7 != null) {
            int i2 = this.LLILZ;
            int i3 = this.LLILZIL;
            int i4 = this.LLILZLL;
            int i5 = this.LLIZ;
            int i6 = this.LLIZLLLIL;
            C0WY6 c0wy62 = this.LL;
            String str2 = this.LLILLJJLI;
            int i7 = this.LLILLL;
            c0wy7.LJ = i2;
            c0wy7.LJI = i3;
            c0wy7.LJII = i4;
            c0wy7.LJIIIIZZ = i5;
            c0wy7.LJIIIZ = i6;
            c0wy7.LIZ.LJI();
            c0wy62.LIZLLL.remove(strLJ);
            long jUptimeMillis = SystemClock.uptimeMillis();
            Keva keva = c0wy62.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last_fps_tracking_time_");
            sbLIZ.append(C0WY6.LJ(i7, str2));
            keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), jUptimeMillis);
        }
        C09AE c09ae = (C09AE) ((LinkedHashMap) this.LL.LJ).get(strLJ);
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LL.LJ.remove(strLJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultReceiveMsgPerfTracker@18fe.stopFpsTracking$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
