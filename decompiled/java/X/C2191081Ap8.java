package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Ap8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photo.speed.ImageDownloadSpeed$collectData$1", f = "ImageDownloadSpeed.kt", l = {}, m = "invokeSuspend")
public final class C2191081Ap8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Uri LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1494850p0F LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191081Ap8(Uri uri, long j, boolean z, C1494850p0F c1494850p0F, InterfaceC1364105Vn<? super C2191081Ap8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = uri;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = c1494850p0F;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2191081Ap8(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageDownloadSpeed@aaa.collectData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C2191501Apo.LJI++;
            String str = C2191131ApD.LIZ().generateSamplesStrategyName;
            if (str != null && str.length() > 0) {
                C2191501Apo.LIZ.getClass();
                ((AbstractC2191091Ap9) C2191501Apo.LJIIJJI.getValue()).LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
            } else {
                C2191501Apo.LIZ.getClass();
                C2191511App c2191511AppLIZ = ((AbstractC2191091Ap9) C2191501Apo.LJIIJ.getValue()).LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
                if (c2191511AppLIZ != null) {
                    C2191501Apo.LIZ(c2191511AppLIZ);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageDownloadSpeed@aaa.collectData$1");
        return unit;
    }
}
