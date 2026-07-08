package X;

import android.graphics.Bitmap;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08nq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.creative.camera.core.image.IMTakePhotoProcessorImpl$takePhotoAndSave$2", f = "IMTakePhotoProcessorImpl.kt", l = {}, m = "invokeSuspend")
public final class C2226008nq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2226008nq(Bitmap bitmap, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2226008nq(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJ;
        BufferedOutputStream bufferedOutputStream;
        C1C7U.LIZ("IMTakePhotoProcessorImpl@e8d0.takePhotoAndSave$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            bufferedOutputStream = new BufferedOutputStream(new C0VSV(new C0VSJ(this.LL)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onError: ");
            sbLIZ.append(e);
            objLJ = C2286608xc.LJ(Log.e("TAG", C2188811AlT.LIZIZ(sbLIZ)));
        }
        try {
            this.LLILLJJLI.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
            bufferedOutputStream.flush();
            C2107108Nh.LIZ(bufferedOutputStream, null);
            objLJ = Unit.LIZ;
            C1C7U.LIZIZ("IMTakePhotoProcessorImpl@e8d0.takePhotoAndSave$2");
            return objLJ;
        } catch (Throwable th) {
            th = th;
            try {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    th = null;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(bufferedOutputStream, th);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
