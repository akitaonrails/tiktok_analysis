package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.BaseAIMusicUploadFrameTask$resizePicturesForAIWithoutSaveFile$2$deferred$1$1", f = "BaseAIMusicUploadFrameTask.kt", l = {}, m = "invokeSuspend")
public final class C424001ks extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ AbstractC2289508y5 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C424001ks(String str, AbstractC2289508y5 abstractC2289508y5, InterfaceC1364105Vn<? super C424001ks> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = abstractC2289508y5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C424001ks(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("BaseAIMusicUploadFrameTask@c042.resizePicturesForAIWithoutSaveFile$2$deferred$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = null;
        if (!C2286708xd.LIZJ(this.LL)) {
            this.LLILLJJLI.LJIILL(-2, "resizePicturesForAINew filePath is null", "");
            C1C7U.LIZIZ("BaseAIMusicUploadFrameTask@c042.resizePicturesForAIWithoutSaveFile$2$deferred$1$1");
            return null;
        }
        try {
            Bitmap bitmapLJFF = C2471909mP.LJFF(this.LLILLJJLI.LIZIZ, this.LL);
            if (bitmapLJFF == null) {
                AbstractC2289508y5 abstractC2289508y5 = this.LLILLJJLI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FileAdapterUtils.decodeBitmap failed.exists:");
                sbLIZ.append(C2286708xd.LIZJ(this.LL));
                abstractC2289508y5.LJIILL(-2, C2188811AlT.LIZIZ(sbLIZ), "");
            }
            bitmap = bitmapLJFF;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2289508y5 abstractC2289508y52 = this.LLILLJJLI;
            String message = e.getMessage();
            if (message == null) {
                message = "resizePicturesForAINew exception";
            }
            abstractC2289508y52.LJIILL(-2, message, "");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("resizePicturesForAI fail err: ");
            sbLIZ2.append(e);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1C7U.LIZIZ("BaseAIMusicUploadFrameTask@c042.resizePicturesForAIWithoutSaveFile$2$deferred$1$1");
        return bitmap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
