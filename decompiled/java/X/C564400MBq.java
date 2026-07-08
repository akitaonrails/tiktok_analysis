package X;

import android.graphics.Bitmap;
import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.customize.ui.AIPortraitBeamLightBackgroundKt$AIPortraitBeamLightBackground$1$1", f = "AIPortraitBeamLightBackground.kt", l = {109}, m = "invokeSuspend")
public final class C564400MBq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public C05P0 LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C05P0<InterfaceC1680820tqC> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C564400MBq(C05P0<InterfaceC1680820tqC> c05p0, InterfaceC1364105Vn<? super C564400MBq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C564400MBq(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jElapsedRealtime;
        C05P0 c05p0;
        C1C7U.LIZ("AIPortraitBeamLightBackgroundKt@dcd7.AIPortraitBeamLightBackground$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                jElapsedRealtime = this.LL;
                c05p0 = this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jElapsedRealtime = SystemClock.elapsedRealtime();
            C201955140j.LIZLLL(C545870Laz.LIZIZ, "AuroraBg", "prepare start, imageCached=false");
            c05p0 = this.LLILZ;
            C1DFH c1dfh = C0PEM.LIZ;
            C1106490etr c1106490etr = new C1106490etr(null);
            this.LLILLJJLI = c05p0;
            this.LL = jElapsedRealtime;
            this.LLILLL = 1;
            obj = C23250099c.LJI(this, c1dfh, c1106490etr);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIPortraitBeamLightBackgroundKt@dcd7.AIPortraitBeamLightBackground$1$1");
                return objLJFF;
            }
        }
        Bitmap bitmap = C1667510tUj.LIZ;
        c05p0.setValue(obj);
        C545870Laz c545870Laz = C545870Laz.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ready, totalCost=");
        sbLIZ.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
        sbLIZ.append("ms");
        C201955140j.LIZLLL(c545870Laz, "AuroraBg", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitBeamLightBackgroundKt@dcd7.AIPortraitBeamLightBackground$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
