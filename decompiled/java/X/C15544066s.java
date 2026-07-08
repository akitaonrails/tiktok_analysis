package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.tiktok.pns.ui.ScheduleDowntimeServerDrivenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.ui.ScheduleDowntimeServerDrivenActivity$tryPlayMusic$1", f = "ScheduleDowntimeServerDrivenActivity.kt", l = {366}, m = "invokeSuspend")
public final class C15544066s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ScheduleDowntimeServerDrivenActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15544066s(ScheduleDowntimeServerDrivenActivity scheduleDowntimeServerDrivenActivity, InterfaceC1364105Vn<? super C15544066s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = scheduleDowntimeServerDrivenActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C15544066s c15544066s = new C15544066s(this.LLILLL, interfaceC1364105Vn);
        c15544066s.LLILLJJLI = obj;
        return c15544066s;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Music musicLJII;
        MusicModel musicModelConvertToMusicModel;
        C1C7U.LIZ("ScheduleDowntimeServerDrivenActivity@7a04.tryPlayMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ScheduleDowntimeServerDrivenActivity scheduleDowntimeServerDrivenActivity = this.LLILLL;
            IMusicService iMusicService = (IMusicService) PluggableExtentionKt.pluggableSpi$default(IMusicService.class, false, false, false, 14, null);
            c098200Yq = null;
            if (iMusicService != null && (musicLJII = iMusicService.LJII(scheduleDowntimeServerDrivenActivity.LLJI)) != null && (musicModelConvertToMusicModel = musicLJII.convertToMusicModel()) != null) {
                C1485060okS c1485060okS = new C1485060okS();
                c1485060okS.LJI = true;
                c1485060okS.LIZIZ = musicModelConvertToMusicModel.getUrl().getUrlList();
                scheduleDowntimeServerDrivenActivity.LLJILJILJ = c1485060okS;
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
                C15545066t c15545066t = new C15545066t(scheduleDowntimeServerDrivenActivity, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pqLLIILII, c15545066t) == objLJFF) {
                    C1C7U.LIZIZ("ScheduleDowntimeServerDrivenActivity@7a04.tryPlayMusic$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ScheduleDowntimeServerDrivenActivity@7a04.tryPlayMusic$1");
            return unit;
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ScheduleDowntimeServerDrivenActivity@7a04.tryPlayMusic$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
