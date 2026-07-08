package X;

import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentHDRFilter;

/* JADX INFO: renamed from: X.0DjB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347110DjB extends AbstractC348060Dki {
    public final C347130DjD LIZIZ;

    public C347110DjB(C347130DjD c347130DjD) {
        this.LIZIZ = c347130DjD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, com.bytedance.ies.nle.editor_jni.NLEFilter] */
    @Override // X.AbstractC348060Dki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor r11) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347110DjB.LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor):void");
    }

    public static void LJII(NLEFilter nLEFilter, C347120DjC c347120DjC) {
        NLESegmentFilter segment;
        if (nLEFilter != null) {
            segment = nLEFilter.getSegment();
        } else {
            segment = null;
        }
        NLESegmentHDRFilter nLESegmentHDRFilterDynamicCast = NLESegmentHDRFilter.dynamicCast((NLENode) segment);
        if (nLESegmentHDRFilterDynamicCast != null) {
            nLESegmentHDRFilterDynamicCast.getEffectSDKFilter().setResourceFile(c347120DjC.LIZIZ);
            nLESegmentHDRFilterDynamicCast.setFrameType(c347120DjC.LIZJ);
            nLESegmentHDRFilterDynamicCast.setFilePath(c347120DjC.LIZLLL);
            nLESegmentHDRFilterDynamicCast.setDenoise(!c347120DjC.LJ);
            Integer num = c347120DjC.LJFF;
            if (num != null) {
                nLESegmentHDRFilterDynamicCast.setAsfMode(num.intValue());
            }
            Integer num2 = c347120DjC.LJI;
            if (num2 != null) {
                nLESegmentHDRFilterDynamicCast.setHdrMode(num2.intValue());
            }
        }
    }
}
