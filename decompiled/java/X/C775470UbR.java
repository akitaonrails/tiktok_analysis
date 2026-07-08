package X;

import com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: renamed from: X.0UbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.smoothhost.LivePreviewTabScene$onResume$1", f = "LivePreviewTabScene.kt", l = {181, 185}, m = "invokeSuspend")
public final class C775470UbR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C782920UnS LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C775470UbR(C782920UnS c782920UnS, Function0<Unit> function0, InterfaceC1364105Vn<? super C775470UbR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c782920UnS;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C775470UbR(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("LivePreviewTabScene@198f.onResume$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LivePreviewTabScene@198f.onResume$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            OpenLivePreparationTask openLivePreparationTask = OpenLivePreparationTask.LIZ;
            this.LL = 1;
            obj = openLivePreparationTask.LIZJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LivePreviewTabScene@198f.onResume$1");
                return objLJFF;
            }
        }
        LivePodcastResponse.ResponseData responseData = (LivePodcastResponse.ResponseData) obj;
        if (responseData != null) {
            C782920UnS c782920UnS = this.LLILLJJLI;
            Function0<Unit> function0 = this.LLILLL;
            if (c782920UnS.LLJJ && !c782920UnS.LLJJJIL) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("LivePreviewTabScene@198f.onResume$1");
                return unit2;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C783770Uop c783770Uop = new C783770Uop(responseData, c782920UnS, function0, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c783770Uop) == objLJFF) {
                C1C7U.LIZIZ("LivePreviewTabScene@198f.onResume$1");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("LivePreviewTabScene@198f.onResume$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
