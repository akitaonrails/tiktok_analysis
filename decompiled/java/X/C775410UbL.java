package X;

import android.content.Context;
import android.os.Bundle;
import android.view.SurfaceView;
import com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.smoothhost.LivePreviewTabScene$initLivePreview$1", f = "LivePreviewTabScene.kt", l = {480, 481}, m = "invokeSuspend")
public final class C775410UbL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C782920UnS LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ SurfaceView LLILZ;
    public final /* synthetic */ C19EG LLILZIL;
    public final /* synthetic */ InterfaceC782930UnT LLILZLL;
    public final /* synthetic */ Bundle LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C775410UbL(C782920UnS c782920UnS, Context context, SurfaceView surfaceView, C19EG c19eg, InterfaceC782930UnT interfaceC782930UnT, Bundle bundle, Function0<Unit> function0, InterfaceC1364105Vn<? super C775410UbL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c782920UnS;
        this.LLILLL = context;
        this.LLILZ = surfaceView;
        this.LLILZIL = c19eg;
        this.LLILZLL = interfaceC782930UnT;
        this.LLIZ = bundle;
        this.LLIZLLLIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C775410UbL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLIZ = obj;
        C1C7U.LIZ("LivePreviewTabScene@198f.initLivePreview$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LivePreviewTabScene@198f.initLivePreview$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            OpenLivePreparationTask openLivePreparationTask = OpenLivePreparationTask.LIZ;
            this.LL = 1;
            objLIZ = openLivePreparationTask.LIZ(this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("LivePreviewTabScene@198f.initLivePreview$1");
                return objLJFF;
            }
        }
        String str = (String) ((Map) objLIZ).get("preSchedule");
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C775400UbK c775400UbK = new C775400UbK(str, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c775400UbK) == objLJFF) {
            C1C7U.LIZIZ("LivePreviewTabScene@198f.initLivePreview$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LivePreviewTabScene@198f.initLivePreview$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
