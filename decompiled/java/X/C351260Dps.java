package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEResTag;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentHSLFilter;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;

/* JADX INFO: renamed from: X.0Dps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351260Dps {
    public static final /* synthetic */ int LIZ = 0;

    public static NLESegmentFilter LIZ(C351270Dpt c351270Dpt) {
        String nleName;
        NLESegmentFilter nLESegmentFilter;
        if (c351270Dpt.LIZJ == EnumC355950DxR.HSL) {
            if (c351270Dpt.LJI == null) {
                return null;
            }
            NLESegmentHSLFilter nLESegmentHSLFilter = new NLESegmentHSLFilter();
            nLESegmentHSLFilter.setColorType(c351270Dpt.LJI.LIZ);
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceName(c351270Dpt.LIZJ.getNleName());
            nLEResourceNode.setResourceFile(c351270Dpt.LIZ);
            nLEResourceNode.setResourceTag(NLEResTag.AMAZING);
            nLEResourceNode.setResourceType(NLEResType.FILTER);
            nLEResourceNode.setExtra("biz_res_id", C0FGD.LIZ(c351270Dpt.LJ, "editorpro_adjust"));
            nLESegmentHSLFilter.setEffectSDKFilter(nLEResourceNode);
            nLESegmentHSLFilter.setFilterName(NLEEditorJniJNI.NLEFilterName_getHSL());
            Double d = c351270Dpt.LJI.LIZIZ;
            if (d != null) {
                nLESegmentHSLFilter.setHue(d.doubleValue());
            }
            Double d2 = c351270Dpt.LJI.LIZJ;
            if (d2 != null) {
                nLESegmentHSLFilter.setSaturation(d2.doubleValue());
            }
            Double d3 = c351270Dpt.LJI.LIZLLL;
            nLESegmentFilter = nLESegmentHSLFilter;
            if (d3 != null) {
                nLESegmentHSLFilter.setLightness(d3.doubleValue());
                nLESegmentFilter = nLESegmentHSLFilter;
            }
        } else {
            NLESegmentFilter nLESegmentFilter2 = new NLESegmentFilter();
            NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
            nLEResourceNode2.setResourceName(c351270Dpt.LIZJ.getNleName());
            nLEResourceNode2.setResourceFile(c351270Dpt.LIZ);
            nLEResourceNode2.setResourceTag(NLEResTag.AMAZING);
            nLEResourceNode2.setResourceType(NLEResType.FILTER);
            nLEResourceNode2.setExtra("biz_res_id", C0FGD.LIZ(c351270Dpt.LJ, "editorpro_adjust"));
            nLESegmentFilter2.setEffectSDKFilter(nLEResourceNode2);
            if (c351270Dpt.LIZJ.getAdjustParamsName() != null) {
                NLEStringFloatPair nLEStringFloatPair = new NLEStringFloatPair();
                nLEStringFloatPair.setFirst(c351270Dpt.LIZJ.getAdjustParamsName());
                nLEStringFloatPair.setSecond(c351270Dpt.LIZIZ);
                nLESegmentFilter2.addAdjustParams(nLEStringFloatPair);
                if (c351270Dpt.LIZJ.getUseCombinePackage()) {
                    nleName = EnumC355950DxR.COMBINE_ADJUST.getNleName();
                } else {
                    nleName = c351270Dpt.LIZJ.getNleName();
                }
                nLESegmentFilter2.setFilterName(nleName);
            } else {
                nLESegmentFilter2.setIntensity(c351270Dpt.LIZIZ);
                nLESegmentFilter2.setFilterName(c351270Dpt.LIZJ.getNleName());
            }
            nLESegmentFilter = nLESegmentFilter2;
            if (c351270Dpt.LJFF) {
                nLESegmentFilter2.setApplyTargetType(2);
                nLESegmentFilter = nLESegmentFilter2;
            }
        }
        nLESegmentFilter.setExtra("adjust_filter_add_from", c351270Dpt.LIZLLL.name());
        return nLESegmentFilter;
    }
}
