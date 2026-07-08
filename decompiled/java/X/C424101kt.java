package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01kt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.MVUploadFrameTask$resizePicturesForAINew$2$deferred$1$1", f = "MVUploadFrameTask.kt", l = {}, m = "invokeSuspend")
public final class C424101kt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C2274708vh LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C424101kt(String str, C2274708vh c2274708vh, int i, InterfaceC1364105Vn<? super C424101kt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c2274708vh;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C424101kt(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        float fIntValue;
        C1C7U.LIZ("MVUploadFrameTask@878b.resizePicturesForAINew$2$deferred$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String absolutePath = null;
        if (!C2286708xd.LIZJ(this.LL)) {
            LJIILL(-2, "resizePicturesForAINew filePath is null", "");
            C1C7U.LIZIZ("MVUploadFrameTask@878b.resizePicturesForAINew$2$deferred$1$1");
            return null;
        }
        try {
            if (((Boolean) C424201ku.LIZ.getValue()).booleanValue()) {
                Bitmap bitmapLJFF = C2471909mP.LJFF(this.LLILLJJLI.LIZIZ, this.LL);
                if (bitmapLJFF != null) {
                    absolutePath = LJIJI(bitmapLJFF, this.LLILLL, null).getAbsolutePath();
                }
            } else {
                Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(this.LL, null);
                C2274708vh c2274708vh = this.LLILLJJLI;
                float fIntValue2 = c2274708vh.LIZIZ;
                if (bitmapLIZLLL == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FileAdapterUtils.decodeBitmap failed.exists:");
                    sbLIZ.append(C2286708xd.LIZJ(this.LL));
                    c2274708vh.LJIILL(-2, C2188811AlT.LIZIZ(sbLIZ), "");
                }
                if (bitmapLIZLLL != null) {
                    C2274708vh c2274708vh2 = this.LLILLJJLI;
                    int i = this.LLILLL;
                    Pair pairLIZ = C2275108vl.LIZ(c2274708vh2.LIZIZ, bitmapLIZLLL);
                    if (((Boolean) C424401kw.LIZ.getValue()).booleanValue()) {
                        fIntValue2 = ((Number) pairLIZ.getFirst()).intValue();
                        fIntValue = ((Number) pairLIZ.getSecond()).intValue();
                    } else {
                        fIntValue = fIntValue2;
                    }
                    absolutePath = c2274708vh2.LJIJI(C476901tP.LIZIZ(bitmapLIZLLL, fIntValue2, fIntValue), i, null).getAbsolutePath();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2274708vh c2274708vh3 = this.LLILLJJLI;
            String message = e.getMessage();
            if (message == null) {
                message = "resizePicturesForAINew exception";
            }
            c2274708vh3.LJIILL(-2, message, "");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("resizePicturesForAI fail err: ");
            sbLIZ2.append(e);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1C7U.LIZIZ("MVUploadFrameTask@878b.resizePicturesForAINew$2$deferred$1$1");
        return absolutePath;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
