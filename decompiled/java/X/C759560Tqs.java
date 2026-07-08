package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: renamed from: X.0Tqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.GoLiveManagerOpt$init$2", f = "GoLiveManagerOpt.kt", l = {}, m = "invokeSuspend")
public final class C759560Tqs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<InterfaceC769940UIe> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ PreScheduleStream LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C759560Tqs(C259800zU<InterfaceC769940UIe> c259800zU, String str, PreScheduleStream preScheduleStream, InterfaceC1364105Vn<? super C759560Tqs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = str;
        this.LLILLL = preScheduleStream;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C759560Tqs(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, X.0jFr] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoLiveManagerOpt@1c94.init$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).initLiveBroadcastContext();
        this.LL.element = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLiveCoreInitUtil().LIZ(this.LLILLJJLI, this.LLILLL, true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init liveStreamTmp: ");
        sbLIZ.append(this.LL.element);
        C20441214yg.LIZIZ("GoLiveManagerOpt", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoLiveManagerOpt@1c94.init$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
