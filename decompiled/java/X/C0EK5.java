package X;

import com.bytedance.ies.nle.editor_jni.NLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeGraphType;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyRecognizedWord;
import com.bytedance.ies.nle.editor_jni.NLETimePointPair;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecDouble;
import com.bytedance.ies.nle.editor_jni.VecInt;
import com.bytedance.ies.nle.editor_jni.VecNLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLEKeyframe;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.data.Word;
import com.ss.android.ugc.aweme.tools.sticker.core.BezierControlPoint;
import com.ss.android.ugc.aweme.tools.sticker.core.Keyframe;
import com.ss.android.ugc.aweme.tools.sticker.core.KeyframeInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.RichContentDependRes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0EK5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EK5 {
    public static final /* synthetic */ int LIZ = 0;

    public static List LJFF(NLETrackSlot nLETrackSlot) {
        String strName;
        List listLLIIII;
        BezierControlPoint bezierControlPoint;
        List listLLIIII2;
        List listLLIIII3;
        BezierControlPoint bezierControlPoint2;
        List listLLIIII4;
        List listLLIIII5;
        if (nLETrackSlot.getSwingKeyframes().isEmpty()) {
            return C13BV.INSTANCE;
        }
        VecNLEKeyframe swingKeyframes = nLETrackSlot.getSwingKeyframes();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(swingKeyframes, 10));
        for (NLEKeyframe nLEKeyframe : swingKeyframes) {
            NLEKeyframeType keyframeType = nLEKeyframe.getKeyframeType();
            String str = "";
            if (keyframeType == null || (strName = keyframeType.name()) == null) {
                strName = "";
            }
            String keyframeProperty = nLEKeyframe.getKeyframeProperty();
            if (keyframeProperty != null) {
                str = keyframeProperty;
            }
            VecNLECommonKeyframe keyframes = nLEKeyframe.getKeyframes();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(keyframes, 10));
            for (NLECommonKeyframe nLECommonKeyframe : keyframes) {
                VecDouble leftControlValue = nLECommonKeyframe.getLeftControlValue();
                Integer numValueOf = null;
                if (leftControlValue == null || (listLLIIII = C13LP.LLIIII(leftControlValue)) == null) {
                    listLLIIII = C13BV.INSTANCE;
                }
                if (!listLLIIII.isEmpty()) {
                    bezierControlPoint = new BezierControlPoint(Long.valueOf(nLECommonKeyframe.getLeftControlTime()), listLLIIII);
                } else {
                    NLETimePointPair leftControl = nLECommonKeyframe.getLeftControl();
                    if (leftControl != null) {
                        Long lValueOf = Long.valueOf(leftControl.getTime());
                        VecDouble value = leftControl.getValue();
                        if (value == null || (listLLIIII2 = C13LP.LLIIII(value)) == null) {
                            listLLIIII2 = C13BV.INSTANCE;
                        }
                        bezierControlPoint = new BezierControlPoint(lValueOf, listLLIIII2);
                    } else {
                        bezierControlPoint = null;
                    }
                }
                VecDouble rightControlValue = nLECommonKeyframe.getRightControlValue();
                if (rightControlValue == null || (listLLIIII3 = C13LP.LLIIII(rightControlValue)) == null) {
                    listLLIIII3 = C13BV.INSTANCE;
                }
                if (!listLLIIII3.isEmpty()) {
                    bezierControlPoint2 = new BezierControlPoint(Long.valueOf(nLECommonKeyframe.getRightControlTime()), listLLIIII3);
                } else {
                    NLETimePointPair rightControl = nLECommonKeyframe.getRightControl();
                    if (rightControl != null) {
                        Long lValueOf2 = Long.valueOf(rightControl.getTime());
                        VecDouble value2 = rightControl.getValue();
                        if (value2 == null || (listLLIIII4 = C13LP.LLIIII(value2)) == null) {
                            listLLIIII4 = C13BV.INSTANCE;
                        }
                        bezierControlPoint2 = new BezierControlPoint(lValueOf2, listLLIIII4);
                    } else {
                        bezierControlPoint2 = null;
                    }
                }
                Long lValueOf3 = Long.valueOf(nLECommonKeyframe.getTimeOffset());
                VecDouble value3 = nLECommonKeyframe.getValue();
                if (value3 == null || (listLLIIII5 = C13LP.LLIIII(value3)) == null) {
                    listLLIIII5 = C13BV.INSTANCE;
                }
                NLEKeyframeGraphType graphType = nLECommonKeyframe.getGraphType();
                if (graphType != null) {
                    numValueOf = Integer.valueOf(graphType.ordinal());
                }
                arrayList2.add(new Keyframe(lValueOf3, listLLIIII5, numValueOf, bezierControlPoint, bezierControlPoint2));
            }
            arrayList.add(new KeyframeInfo(strName, str, arrayList2));
        }
        return arrayList;
    }

    public static List LJI(NLEStyRecognizedWord nLEStyRecognizedWord) {
        Integer numValueOf;
        Integer numValueOf2;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        String str;
        boolean z;
        Integer num;
        Integer num2;
        Integer num3;
        VecString text = nLEStyRecognizedWord.getText();
        VecInt startTime = nLEStyRecognizedWord.getStartTime();
        VecInt endTime = nLEStyRecognizedWord.getEndTime();
        VecInt isKey = nLEStyRecognizedWord.getIsKey();
        Integer[] numArr = new Integer[3];
        Integer numValueOf3 = null;
        if (text != null) {
            numValueOf = Integer.valueOf(text.size());
        } else {
            numValueOf = null;
        }
        numArr[0] = numValueOf;
        if (startTime != null) {
            numValueOf2 = Integer.valueOf(startTime.size());
        } else {
            numValueOf2 = null;
        }
        numArr[1] = numValueOf2;
        if (endTime != null) {
            numValueOf3 = Integer.valueOf(endTime.size());
        }
        numArr[2] = numValueOf3;
        Integer num4 = (Integer) C13LP.LJJLL(C13LQ.LJIJI(numArr));
        if (num4 != null && (iIntValue = num4.intValue()) != 0) {
            ArrayList arrayList = new ArrayList(iIntValue);
            for (int i = 0; i < iIntValue; i++) {
                if (startTime != null && (num3 = startTime.get(i)) != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    iIntValue2 = 0;
                }
                long j = iIntValue2;
                if (endTime != null && (num2 = endTime.get(i)) != null) {
                    iIntValue3 = num2.intValue();
                } else {
                    iIntValue3 = 0;
                }
                long j2 = iIntValue3;
                if (text == null || (str = text.get(i)) == null) {
                    str = "";
                }
                if (isKey != null && (num = (Integer) C13LP.LJJJLZIJ(i, isKey)) != null && num.intValue() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new Word(j2, j, str, "", false, z));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static void LIZJ(NLETrackSlot nLETrackSlot, List list) {
        long jLongValue;
        long jLongValue2;
        if (list.isEmpty()) {
            return;
        }
        nLETrackSlot.removeAllSwingKeyframes();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            KeyframeInfo keyframeInfo = (KeyframeInfo) it2.next();
            String type = keyframeInfo.getType();
            if (type == null) {
                type = "";
            }
            NLEKeyframe nLEKeyframeCreate = NLEKeyframe.create(NLEKeyframeType.valueOf(type), keyframeInfo.getProperty());
            List<Keyframe> frames = keyframeInfo.getFrames();
            if (frames != null) {
                for (Keyframe keyframe : frames) {
                    if (nLEKeyframeCreate != null) {
                        NLECommonKeyframe nLECommonKeyframe = new NLECommonKeyframe();
                        BezierControlPoint left = keyframe.getLeft();
                        long jLongValue3 = 0;
                        if (left != null) {
                            Long timeOffset = left.getTimeOffset();
                            if (timeOffset != null) {
                                jLongValue2 = timeOffset.longValue();
                            } else {
                                jLongValue2 = 0;
                            }
                            nLECommonKeyframe.setLeftControlTime(jLongValue2);
                            VecDouble vecDouble = new VecDouble();
                            List<Double> controlValues = left.getControlValues();
                            if (controlValues == null) {
                                controlValues = C13BV.INSTANCE;
                            }
                            vecDouble.addAll(controlValues);
                            nLECommonKeyframe.setLeftControlValue(vecDouble);
                        }
                        BezierControlPoint right = keyframe.getRight();
                        if (right != null) {
                            Long timeOffset2 = right.getTimeOffset();
                            if (timeOffset2 != null) {
                                jLongValue = timeOffset2.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            nLECommonKeyframe.setRightControlTime(jLongValue);
                            VecDouble vecDouble2 = new VecDouble();
                            List<Double> controlValues2 = right.getControlValues();
                            if (controlValues2 == null) {
                                controlValues2 = C13BV.INSTANCE;
                            }
                            vecDouble2.addAll(controlValues2);
                            nLECommonKeyframe.setRightControlValue(vecDouble2);
                        }
                        VecDouble vecDouble3 = new VecDouble();
                        List<Double> value = keyframe.getValue();
                        if (value == null) {
                            value = C13BV.INSTANCE;
                        }
                        vecDouble3.addAll(value);
                        nLECommonKeyframe.setValue(vecDouble3);
                        Long time = keyframe.getTime();
                        if (time != null) {
                            jLongValue3 = time.longValue();
                        }
                        nLECommonKeyframe.setTimeOffset(jLongValue3);
                        Integer graphType = keyframe.getGraphType();
                        if (graphType != null) {
                            int iIntValue = graphType.intValue();
                            NLEKeyframeGraphType nLEKeyframeGraphType = NLEKeyframeGraphType.BEZIER;
                            if (iIntValue == nLEKeyframeGraphType.ordinal()) {
                                nLECommonKeyframe.setGraphType(nLEKeyframeGraphType);
                            }
                        }
                        nLEKeyframeCreate.addKeyframe(nLECommonKeyframe);
                    }
                }
            }
            if (nLEKeyframeCreate != null) {
                nLETrackSlot.addSwingKeyframe(nLEKeyframeCreate);
            }
        }
    }

    public static void LIZ(NLESegmentTextSticker nLESegmentTextSticker, String str, String str2) {
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.setResourceId(str);
        nLEResourceNode.setResourceFile(str2);
        nLEResourceNode.setExtra("biz_res_id", str);
        nLESegmentTextSticker.addRichContentResource(nLEResourceNode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0255  */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r65v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r67v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel LIZLLL(com.bytedance.ies.nle.editor_jni.NLETrackSlot r94, com.ss.android.vesdk.VESize r95, int r96) {
        /*
            Method dump skipped, instruction units count: 1711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EK5.LIZLLL(com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.ss.android.vesdk.VESize, int):com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel");
    }

    public static void LJ(Map map, Object obj, Object obj2) {
        try {
            if (((LinkedHashMap) map).get(obj) == null) {
                map.put(obj, obj2);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void LIZIZ(C0EK5 c0ek5, LinkedHashMap<String, RichContentDependRes> linkedHashMap, String str, String str2) {
        String str3;
        if (str != null && str.length() > 0) {
            str3 = str;
        } else if (str2 != null && str2.length() > 0) {
            str3 = str2;
        } else {
            return;
        }
        RichContentDependRes richContentDependRes = new RichContentDependRes(str, str2);
        c0ek5.getClass();
        LJ(linkedHashMap, str3, richContentDependRes);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x02cf, code lost:
    
        r5.removeSlot(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0467  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.lang.Integer r28, com.bytedance.ies.nle.editor_jni.NLETrackSlot r29, com.ss.android.vesdk.VESize r30, com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel r31, X.EnumC358580E4a r32) {
        /*
            Method dump skipped, instruction units count: 1802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EK5.LJII(java.lang.Integer, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.ss.android.vesdk.VESize, com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel, X.0E4a):void");
    }
}
