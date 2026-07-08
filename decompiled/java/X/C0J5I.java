package X;

import Y.ARunnableS107S0100000_7;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0J5I, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.WatchLaterGuideManager$fetchActivityTooltip$2", f = "WatchLaterGuideManager.kt", l = {}, m = "invokeSuspend")
public final class C0J5I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0J5H LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Room LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0J5I(C0J5H c0j5h, long j, long j2, long j3, List<String> list, String str, Room room, InterfaceC1364105Vn<? super C0J5I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0j5h;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
        this.LLILZIL = list;
        this.LLILZLL = str;
        this.LLIZ = room;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0J5I(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WatchLaterGuideManager@67fe.fetchActivityTooltip$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.LIZJ()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("WatchLaterGuideManager@67fe.fetchActivityTooltip$2");
            return unit;
        }
        C0J5L c0j5l = new C0J5L(null, 2, false, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, "live_toplive_watch_later_activity", 2058);
        C0J5H c0j5h = this.LL;
        C19EG c19eg = c0j5h.LIZ;
        if (c19eg != null) {
            Room room = this.LLIZ;
            View view = c0j5h.LIZIZ;
            if (view != null) {
                c0j5h.LJIIIIZZ = room;
                C0J71 c0j71 = new C0J71(c19eg, view, c0j5l);
                c0j71.LJ.add(c0j5h.LJIIJ);
                HandlerHook.viewPost(view, new ARunnableS107S0100000_7(c0j71, 141));
                c0j5h.LJI = c0j71;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("WatchLaterGuideManager@67fe.fetchActivityTooltip$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
