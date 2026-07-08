package X;

import Y.ACallableS250S0200000_22;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;
import v7.o;

/* JADX INFO: renamed from: X.0oH8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466880oH8 implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C1466880oH8 c1466880oH8, C15O7 c15o7) {
        boolean zLIZJ;
        Unit unit;
        boolean zLIZJ2;
        C1C7U.LIZ("ImageViewManager@63e.compileTempImageForChange$2");
        C1450940nrQ c1450940nrQ = (C1450940nrQ) c1466880oH8.l0;
        if (!c1450940nrQ.LJIILL && c1450940nrQ.LIZ.getVisibility() == 0 && c15o7.LJIIL() != null) {
            C786410Ut5.LJZI(8, ((C1450940nrQ) c1466880oH8.l0).LIZ);
            unit = null;
            ((C1450940nrQ) c1466880oH8.l0).LIZ.setImageURI(null);
            C1450940nrQ c1450940nrQ2 = (C1450940nrQ) c1466880oH8.l0;
            Bitmap bitmap = (Bitmap) c15o7.LJIIL();
            Boolean bool = (Boolean) c1466880oH8.l1;
            if (bool != null) {
                zLIZJ2 = bool.booleanValue();
            } else {
                zLIZJ2 = ((C1450940nrQ) c1466880oH8.l0).LIZJ();
            }
            c1450940nrQ2.LJII(bitmap, zLIZJ2);
            if (c15o7.LJIIL() != null) {
                ((C1450940nrQ) c1466880oH8.l0).LIZIZ.getEditImageInfo().setNeedCompileNle(false);
            }
            ((C1450940nrQ) c1466880oH8.l0).LJIIL(null);
            Function0 function0 = (Function0) c1466880oH8.l2;
            if (function0 != null) {
                function0.invoke();
                unit = Unit.LIZ;
            }
        } else {
            C1450940nrQ c1450940nrQ3 = (C1450940nrQ) c1466880oH8.l0;
            Bitmap bitmap2 = (Bitmap) c15o7.LJIIL();
            Boolean bool2 = (Boolean) c1466880oH8.l1;
            if (bool2 != null) {
                zLIZJ = bool2.booleanValue();
            } else {
                zLIZJ = ((C1450940nrQ) c1466880oH8.l0).LIZJ();
            }
            c1450940nrQ3.LJII(bitmap2, zLIZJ);
            if (c15o7.LJIIL() != null) {
                ((C1450940nrQ) c1466880oH8.l0).LIZIZ.getEditImageInfo().setNeedCompileNle(false);
            }
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("ImageViewManager@63e.compileTempImageForChange$2");
        return unit;
    }

    public static final Object then$1(C1466880oH8 c1466880oH8, C15O7 c15o7) throws Exception {
        C1C7U.LIZ("OriginalSoundUploadService@5e57.onHandleWork$2$uploadTask$2");
        if (!c15o7.LJIILL() && !c15o7.LJIILIIL()) {
            OriginalSoundUploadService originalSoundUploadService = (OriginalSoundUploadService) c1466880oH8.l0;
            C1441600ncM c1441600ncM = (C1441600ncM) c1466880oH8.l1;
            C1441540ncG c1441540ncG = (C1441540ncG) c1466880oH8.l2;
            originalSoundUploadService.getClass();
            OriginalSoundUploadService.LIZJ(c1441600ncM, c1441540ncG);
        } else if (c15o7.LJIILL()) {
            if ((c15o7.LJIIJJI() instanceof IllegalStateException) && c15o7.LJIIJJI().getMessage() != null && u.LJJIIJZLJL(c15o7.LJIIJJI().getMessage(), "file error", false)) {
                OriginalSoundUploadService originalSoundUploadService2 = (OriginalSoundUploadService) c1466880oH8.l0;
                C1441600ncM c1441600ncM2 = (C1441600ncM) c1466880oH8.l1;
                C1441540ncG c1441540ncG2 = (C1441540ncG) c1466880oH8.l2;
                originalSoundUploadService2.getClass();
                OriginalSoundUploadService.LIZJ(c1441600ncM2, c1441540ncG2);
            } else {
                throw c15o7.LJIIJJI();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OriginalSoundUploadService@5e57.onHandleWork$2$uploadTask$2");
        return unit;
    }

    public static final Object then$2(C1466880oH8 c1466880oH8, C15O7 c15o7) {
        VideoFramesUploadService videoFramesUploadService = (VideoFramesUploadService) c1466880oH8.l0;
        C1441410nc3 c1441410nc3 = (C1441410nc3) c1466880oH8.l1;
        C1441460nc8 c1441460nc8 = (C1441460nc8) c1466880oH8.l2;
        videoFramesUploadService.getClass();
        C1C7U.LIZ("VideoFramesUploadService@993f.onHandleWork$3L");
        if (c15o7.LJIILL()) {
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZIZ("extract_frame", c15o7.LJIIJJI());
            C1C7U.LIZIZ("VideoFramesUploadService@993f.onHandleWork$3L");
            return null;
        }
        Iterator it2 = ((ArrayList) c1441410nc3.LIZ).iterator();
        while (it2.hasNext()) {
            VideoFramesUploadService.LIZ((C1441520ncE) it2.next(), c1441460nc8);
        }
        C1C7U.LIZIZ("VideoFramesUploadService@993f.onHandleWork$3L");
        return null;
    }

    public static final Object then$3(C1466880oH8 c1466880oH8, C15O7 c15o7) {
        Object objLJIIIZ;
        C1C7U.LIZ("OriginalFrameUploadWaveTask@95c7.startModeration$uploadTask$1");
        if (c15o7.LJIILL()) {
            objLJIIIZ = C15O7.LJIIIZ(c15o7.LJIIJJI());
        } else {
            C1432910nOL c1432910nOL = (C1432910nOL) c1466880oH8.l0;
            C1432620nNs c1432620nNs = (C1432620nNs) c1466880oH8.l1;
            VideoPublishEditModel videoPublishEditModel = ((C1436690nUR) c1466880oH8.l2).LLIZ;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            c1432910nOL.getClass();
            o oVar = new o();
            C15O7.LIZ(new ACallableS250S0200000_22(videoPublishEditModel, c1432620nNs, oVar, 10));
            objLJIIIZ = oVar.LIZ;
        }
        C1C7U.LIZIZ("OriginalFrameUploadWaveTask@95c7.startModeration$uploadTask$1");
        return objLJIIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1466880oH8(Object obj, C1450940nrQ c1450940nrQ, Boolean bool, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
        this.l1 = c1450940nrQ;
        this.l2 = bool;
    }
}
