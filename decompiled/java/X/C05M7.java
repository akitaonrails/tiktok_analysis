package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05M7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.util.AllAlbumKeyCache$prewarm$1", f = "AllAlbumKeyCache.kt", l = {}, m = "invokeSuspend")
public final class C05M7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05M7(long j, Context context, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05M7 c05m7 = new C05M7(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
        c05m7.LL = obj;
        return c05m7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AllAlbumKeyCache@4c6c.prewarm$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LLILLJJLI;
        long j = this.LLILLL;
        try {
            C05UE.LIZ.set(C540060LGa.LIZJ(context));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[OPT-7 AllAlbumKey] prewarm cost=");
            sbLIZ.append(SystemClock.elapsedRealtime() - j);
            sbLIZ.append("ms");
            C189200o6.m2constructorimpl(C2286608xc.LJ(Log.d("SocMediaPickerPerf", C2188811AlT.LIZIZ(sbLIZ))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AllAlbumKeyCache@4c6c.prewarm$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
