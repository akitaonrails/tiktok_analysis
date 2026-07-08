package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0669, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.utils.StreakBannerManager$reportMaxEndTimeAccuracy$1", f = "StreakBannerManager.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0669 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0669(InterfaceC1493105sv interfaceC1493105sv, long j, long j2, InterfaceC1364105Vn<? super AnonymousClass0669> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0669(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("StreakBannerManager@7eae.reportMaxEndTimeAccuracy$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1493105sv interfaceC1493105sv = this.LL;
        Pair[] pairArr = new Pair[5];
        boolean z2 = false;
        pairArr[0] = new Pair("request_end_time", String.valueOf(this.LLILLJJLI));
        pairArr[1] = new Pair("current_end_time", String.valueOf(this.LLILLL));
        AtomicBoolean atomicBoolean = C15525065z.LIZ;
        long j = 604800;
        if (C1567806Bw.LJI() - this.LLILLJJLI >= j) {
            z = true;
        } else {
            z = false;
        }
        pairArr[2] = new Pair("request_over_7_days", String.valueOf(z));
        if (C1567806Bw.LJI() - this.LLILLL >= j) {
            z2 = true;
        }
        pairArr[3] = new Pair("current_over_7_days", String.valueOf(z2));
        pairArr[4] = new Pair("duration", String.valueOf(this.LLILLL - this.LLILLJJLI));
        interfaceC1493105sv.sendEvent("streak_invite_banner_performance", C2097608Jq.LJIIIIZZ(pairArr));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakBannerManager@7eae.reportMaxEndTimeAccuracy$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
