package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.eventtrack.EventTrackUtil$mobSendDanmakuResult$1", f = "EventTrackUtil.kt", l = {}, m = "invokeSuspend")
public final class C2237208pe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2237208pe(String str, Aweme aweme, boolean z, int i, InterfaceC1364105Vn<? super C2237208pe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = aweme;
        this.LLILLL = z;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2237208pe(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        C1C7U.LIZ("EventTrackUtil@d2e6.mobSendDanmakuResult$1");
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
        C20684815ws.LJIJ("send_danmaku_result", c2241008qG.LJ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EventTrackUtil@d2e6.mobSendDanmakuResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
