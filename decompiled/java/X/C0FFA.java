package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0FFA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FFA {
    public static final C0FFA LIZ = new C0FFA();

    public static RectF LIZLLL(View view) {
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    public static Pair LJ(NLETrackSlot nLETrackSlot) {
        String resourceFile;
        NLEResourceNode resource;
        NLEResourceAV aVFile;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null && aVFile.getHeight() != 0 && aVFile.getWidth() != 0) {
            return new Pair(Float.valueOf(aVFile.getWidth()), Float.valueOf(aVFile.getHeight()));
        }
        C2356009La c2356009La = C2356009La.LIZ;
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
            resourceFile = resource.getResourceFile();
        } else {
            resourceFile = null;
        }
        c2356009La.getClass();
        VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ = C2356009La.LIZ(resourceFile);
        if (vEVideoFileInfoLIZ == null || vEVideoFileInfoLIZ.rotation % 180 != 0) {
            return null;
        }
        return new Pair(Float.valueOf(vEVideoFileInfoLIZ.width), Float.valueOf(vEVideoFileInfoLIZ.height));
    }

    public static boolean LJFF(NLEModel nLEModel) {
        NLETrack mainTrack;
        NLETrackSlot nLETrackSlot;
        Pair pairLJ;
        if (nLEModel == null || (mainTrack = nLEModel.getMainTrack()) == null || mainTrack.getSortedSlots().size() != 1) {
            return false;
        }
        Iterator<NLETrackSlot> it2 = mainTrack.getSortedSlots().iterator();
        while (it2.hasNext()) {
            if (!u4.LJJJLIIL(it2.next())) {
                return false;
            }
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLLLJ(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList2);
        }
        if (arrayList2.size() != 1) {
            return false;
        }
        Iterator<NLETrack> it4 = nLEModel.getTracks().iterator();
        while (it4.hasNext()) {
            if (C351220Dpo.LLLLILI(it4.next())) {
                return false;
            }
        }
        VecNLETrackSlotSPtr slots = mainTrack.getSlots();
        ArrayList arrayList3 = new ArrayList();
        for (NLETrackSlot nLETrackSlot2 : slots) {
            if (u4.LJJJLIIL(nLETrackSlot2)) {
                arrayList3.add(nLETrackSlot2);
            }
        }
        if (arrayList3.size() != 1 || (pairLJ = LJ((nLETrackSlot = (NLETrackSlot) ListProtector.get(arrayList3, 0)))) == null || ((Number) pairLJ.getFirst()).floatValue() < ((Number) pairLJ.getSecond()).floatValue() || nLETrackSlot.hasTransformX() || nLETrackSlot.hasTransformY() || nLETrackSlot.hasTransformZ() || C351220Dpo.LJJLIIJ(nLETrackSlot) != 0.0f || nLETrackSlot.getScale() != 1.0f || NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) == null || NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()).getClip() != null) {
            return false;
        }
        return true;
    }

    public static RectF LIZIZ(RectF rectF, NLEModel nLEModel) {
        NLETrack mainTrack;
        NLETrackSlot nLETrackSlot;
        Pair pairLJ;
        if (nLEModel == null || (mainTrack = nLEModel.getMainTrack()) == null) {
            return null;
        }
        VecNLETrackSlotSPtr slots = mainTrack.getSlots();
        ArrayList arrayList = new ArrayList();
        for (NLETrackSlot nLETrackSlot2 : slots) {
            if (u4.LJJJLIIL(nLETrackSlot2)) {
                arrayList.add(nLETrackSlot2);
            }
        }
        if (arrayList.size() != 1 || (nLETrackSlot = (NLETrackSlot) ListProtector.get(arrayList, 0)) == null || (pairLJ = LJ(nLETrackSlot)) == null) {
            return null;
        }
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (((Number) pairLJ.getFirst()).floatValue() == 0.0f || ((Number) pairLJ.getSecond()).floatValue() == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return null;
        }
        Pair pairLIZ = LIZ(((Number) pairLJ.getFirst()).floatValue() / ((Number) pairLJ.getSecond()).floatValue(), fWidth, fHeight);
        float f = fHeight * 0.5f;
        float f2 = 2;
        return new RectF(rectF.left, f - ((((Number) pairLIZ.getSecond()).floatValue() * nLETrackSlot.getScale()) / f2), rectF.right, f + ((((Number) pairLIZ.getSecond()).floatValue() * nLETrackSlot.getScale()) / f2));
    }

    public static RectF LIZJ(StickerItemModel stickerItemModel, RectF rectF) {
        float f = stickerItemModel.initWidth;
        float f2 = stickerItemModel.initHeight;
        float fWidth = stickerItemModel.currentOffsetX * rectF.width();
        float fHeight = stickerItemModel.currentOffsetY * rectF.height();
        float f3 = stickerItemModel.scale;
        float f4 = stickerItemModel.rotateAngle;
        float f5 = 2;
        float f6 = (f * f3) / f5;
        float f7 = (f2 * f3) / f5;
        RectF rectF2 = new RectF(fWidth - f6, fHeight - f7, f6 + fWidth, f7 + fHeight);
        Matrix matrix = new Matrix();
        matrix.postRotate(f4, fWidth, fHeight);
        matrix.mapRect(rectF2);
        return rectF2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0233 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.bytedance.ies.nle.editor_jni.NLEModel r55, com.ss.android.ugc.aweme.creative.model.CreativeModel r56) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FFA.LJI(com.bytedance.ies.nle.editor_jni.NLEModel, com.ss.android.ugc.aweme.creative.model.CreativeModel):void");
    }

    public static void LJII(View view, VideoPublishEditModel videoPublishEditModel) {
        if (view != null && videoPublishEditModel != null) {
            synchronized (videoPublishEditModel.creativeModel.landscapeVideoModel) {
                try {
                    videoPublishEditModel.creativeModel.landscapeVideoModel.surfaceViewWidth = view.getWidth();
                    videoPublishEditModel.creativeModel.landscapeVideoModel.surfaceViewHeight = view.getHeight();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static Pair LIZ(float f, float f2, float f3) {
        float f4 = f2 / f3;
        Float fValueOf = Float.valueOf(1280.0f);
        Float fValueOf2 = Float.valueOf(720.0f);
        if (f4 > f) {
            float f5 = f * f3;
            if (Math.abs(f5) <= Float.MAX_VALUE && Math.abs(f3) <= Float.MAX_VALUE) {
                return new Pair(Float.valueOf(f5), Float.valueOf(f3));
            }
            return new Pair(fValueOf2, fValueOf);
        }
        float f6 = f2 / f;
        if (Math.abs(f2) <= Float.MAX_VALUE && Math.abs(f6) <= Float.MAX_VALUE) {
            return new Pair(Float.valueOf(f2), Float.valueOf(f6));
        }
        return new Pair(fValueOf2, fValueOf);
    }
}
