package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoPickFrameUploadTask$resizePictures$2$1$1", f = "AutoPickFrameUploadTask.kt", l = {}, m = "invokeSuspend")
public final class C448901ot extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C0LKL LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C448901ot(String str, String str2, int i, C0LKL c0lkl, InterfaceC1364105Vn<? super C448901ot> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = c0lkl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C448901ot(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Bitmap bitmapLJFF;
        C1C7U.LIZ("AutoPickFrameUploadTask@d4a9.resizePictures$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String absolutePath = null;
        if (!C2286708xd.LIZJ(this.LL)) {
            C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.resizePictures$2$1$1");
            return null;
        }
        try {
            bitmapLJFF = C2471909mP.LJFF(256, this.LL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resizePictures error: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJFF("AutoPickFrameUpload", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (bitmapLJFF == null) {
            C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.resizePictures$2$1$1");
            return null;
        }
        String str = this.LLILLJJLI;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LLILLL);
        sbLIZ2.append(".jpg");
        C0VSJ c0vsj = new C0VSJ(str, C2188811AlT.LIZIZ(sbLIZ2));
        this.LLILZ.getClass();
        C0LKL.LJJJJLL(bitmapLJFF, c0vsj);
        if (!bitmapLJFF.isRecycled()) {
            bitmapLJFF.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLJFF);
        }
        absolutePath = c0vsj.getAbsolutePath();
        C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.resizePictures$2$1$1");
        return absolutePath;
    }
}
