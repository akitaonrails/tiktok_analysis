package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.optimize.LivePhotoPreprocessManager$preprocess$1$1", f = "LivePhotoPreprocessManager.kt", l = {}, m = "invokeSuspend")
public final class C2487709ox extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2487509ov LL;
    public final /* synthetic */ C2488009p0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2487709ox(C2487509ov c2487509ov, C2488009p0 c2488009p0, InterfaceC1364105Vn<? super C2487709ox> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2487509ov;
        this.LLILLJJLI = c2488009p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2487709ox(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("LivePhotoPreprocessManager@e66.preprocess$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2487509ov c2487509ov = this.LL;
        C2488009p0 c2488009p0 = this.LLILLJJLI;
        c2487509ov.getClass();
        MediaModel mediaModel = c2488009p0.LIZ;
        C0VSJ c0vsj = new C0VSJ(c2488009p0.LIZJ);
        long jLastModified = c0vsj.lastModified();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        boolean z2 = true;
        if (jLastModified / j != mediaModel.modify) {
            z = true;
        } else {
            z = false;
        }
        if (!c0vsj.exists() || c0vsj.length() <= 0 || z) {
            try {
                if (!c0vsj.exists() || !z) {
                    z2 = false;
                }
                String strLIZ = C2487509ov.LIZ(c0vsj, mediaModel, z2);
                if (((Boolean) C2489409pE.LIZ.getValue()).booleanValue() && Intrinsics.LJFF(strLIZ, c0vsj.getAbsolutePath())) {
                    c0vsj.setLastModified(mediaModel.modify * j);
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C1450470nqf c1450470nqf = C1450470nqf.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("rotate live photo fail: ");
                sbLIZ.append(e.getStackTrace());
                C201955140j.LJII(c1450470nqf, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LivePhotoPreprocessManager@e66.preprocess$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
