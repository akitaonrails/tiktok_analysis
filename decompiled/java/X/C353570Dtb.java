package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;

/* JADX INFO: renamed from: X.0Dtb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C353570Dtb {
    public final CreativeInfo LIZ;
    public EnumC356190Dxp LIZIZ = EnumC356190Dxp.LL;

    public C353570Dtb(CreativeInfo creativeInfo) {
        this.LIZ = creativeInfo;
    }

    public static void LIZ(NLETrackSlot nLETrackSlot, String str) {
        String resourceFile;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null) {
            C558340Lv6 c558340Lv6LIZLLL = C20137613qo.LIZ.LIZLLL(str);
            long jLIZLLL = C352310DrZ.LIZLLL(c558340Lv6LIZLLL.LJ);
            NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
            if (resource != null) {
                resource.setDuration(jLIZLLL);
            }
            int i = c558340Lv6LIZLLL.LIZLLL;
            if (i != 90 && i != 270) {
                NLEResourceNode resource2 = nLESegmentVideoDynamicCast.getResource();
                if (resource2 != null) {
                    resource2.setWidth(c558340Lv6LIZLLL.LIZIZ);
                }
                NLEResourceNode resource3 = nLESegmentVideoDynamicCast.getResource();
                if (resource3 != null) {
                    resource3.setHeight(c558340Lv6LIZLLL.LIZJ);
                }
            } else {
                NLEResourceNode resource4 = nLESegmentVideoDynamicCast.getResource();
                if (resource4 != null) {
                    resource4.setWidth(c558340Lv6LIZLLL.LIZJ);
                }
                NLEResourceNode resource5 = nLESegmentVideoDynamicCast.getResource();
                if (resource5 != null) {
                    resource5.setHeight(c558340Lv6LIZLLL.LIZIZ);
                }
            }
            NLEResourceAV aVFile = nLESegmentVideoDynamicCast.getAVFile();
            if (aVFile == null || (resourceFile = aVFile.getResourceFile()) == null) {
                resourceFile = "";
            }
            nLESegmentVideoDynamicCast.setExtra("ep_origin_media_path", resourceFile);
            NLEResourceAV aVFile2 = nLESegmentVideoDynamicCast.getAVFile();
            if (aVFile2 != null) {
                aVFile2.setResourceFile(str);
            }
            nLETrackSlot.setExtra("is_ep_reverse_video", String.valueOf(true));
            if (nLESegmentVideoDynamicCast.getTimeClipEnd() > jLIZLLL) {
                nLESegmentVideoDynamicCast.setTimeClipEnd(jLIZLLL);
            }
            float endTime = (nLETrackSlot.getEndTime() - nLETrackSlot.getStartTime()) / ((nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) / C351220Dpo.LIZ(nLESegmentVideoDynamicCast));
            if (endTime > 1.0f) {
                nLESegmentVideoDynamicCast.setSpeed(nLESegmentVideoDynamicCast.getSpeed() / endTime);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, X.0Dtf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.bytedance.ies.nle.editor_jni.NLETemplateModel r28, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r29, X.InterfaceC1364105Vn<? super X.C353610Dtf> r30) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353570Dtb.LIZIZ(com.bytedance.ies.nle.editor_jni.NLETemplateModel, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
