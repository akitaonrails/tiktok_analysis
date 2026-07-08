package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.eventtrack.EventTrackUtil$mobFetchDanmakuResult$1", f = "EventTrackUtil.kt", l = {}, m = "invokeSuspend")
public final class C2237408pg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2237408pg(String str, Aweme aweme, boolean z, int i, long j, boolean z2, boolean z3, boolean z4, InterfaceC1364105Vn<? super C2237408pg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = aweme;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = j;
        this.LLILZLL = z2;
        this.LLIZ = z3;
        this.LLIZLLLIL = z4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2237408pg(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        C1C7U.LIZ("EventTrackUtil@d2e6.mobFetchDanmakuResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("enter_from", this.LL);
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2241008qG.LIZ.put("group_id", aid);
        c2241008qG.LIZ.put("result", Boolean.valueOf(this.LLILLL));
        c2241008qG.LIZ.put("error_code", C2286608xc.LJ(this.LLILZ));
        c2241008qG.LIZ.put("start_time", C2286608xc.LJFF(this.LLILZIL));
        c2241008qG.LIZ.put("is_prefetch", Boolean.valueOf(this.LLILZLL));
        c2241008qG.LIZ.put("is_retry", Boolean.valueOf(this.LLIZ));
        c2241008qG.LIZ.put("resultEmpty", Boolean.valueOf(this.LLIZLLLIL));
        C20684815ws.LJIJ("fetch_danmaku_result", c2241008qG.LJ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EventTrackUtil@d2e6.mobFetchDanmakuResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
