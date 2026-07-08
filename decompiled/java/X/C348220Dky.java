package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEStringFloatPairSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Dky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348220Dky extends AbstractC348060Dki {
    public final C348240Dl0 LIZIZ;
    public final boolean LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    @Override // X.AbstractC348060Dki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor r16) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C348220Dky.LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor):void");
    }

    public C348220Dky(C348240Dl0 c348240Dl0, boolean z) {
        this.LIZIZ = c348240Dl0;
        this.LIZJ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" 0.init ");
        sbLIZ.append(c348240Dl0);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIIIIZZ(NLESegmentComposerFilter nLESegmentComposerFilter, C348250Dl1 c348250Dl1) {
        String[] strArr = new String[1];
        String str = c348250Dl1.LIZ;
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        nLESegmentComposerFilter.setEffectTags(new VecString(strArr));
        for (Map.Entry<String, Float> entry : c348250Dl1.LIZJ.entrySet()) {
            String key = entry.getKey();
            float fFloatValue = entry.getValue().floatValue();
            VecNLEStringFloatPairSPtr effectNodeKeyValuePairs = nLESegmentComposerFilter.getEffectNodeKeyValuePairs();
            if (effectNodeKeyValuePairs != null) {
                for (NLEStringFloatPair nLEStringFloatPair : effectNodeKeyValuePairs) {
                    if (Intrinsics.LJFF(nLEStringFloatPair.getFirst(), key)) {
                        nLEStringFloatPair.setSecond(fFloatValue);
                        break;
                    }
                }
            }
            NLEStringFloatPair nLEStringFloatPair2 = new NLEStringFloatPair();
            nLEStringFloatPair2.setFirst(key);
            nLEStringFloatPair2.setSecond(fFloatValue);
            nLESegmentComposerFilter.addEffectNodeKeyValuePair(nLEStringFloatPair2);
        }
    }

    public final void LJII(NLETrack nLETrack, String str, C348250Dl1 c348250Dl1) {
        NLEResType nLEResType;
        String strInvoke;
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentComposerFilter nLESegmentComposerFilter = new NLESegmentComposerFilter();
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.setResourceId(c348250Dl1.LIZLLL);
        if (C123100dR.LIZ(nLEResourceNode.getName()) && (!a0.LJJJIL(nLEResourceNode.getName()))) {
            nLEResourceNode.setResourceName(c348250Dl1.LIZIZ);
        }
        if (this.LIZIZ.LIZ == EnumC356010DxX.BEAUTY) {
            nLEResType = NLEResType.BEAUTY;
        } else {
            nLEResType = NLEResType.COMPOSER;
        }
        nLEResourceNode.setResourceType(nLEResType);
        nLEResourceNode.setResourceFile(str);
        if (C1452960nug.LJIIIZ) {
            String str2 = c348250Dl1.LIZLLL;
            Function1<? super String, String> function1 = C0FGD.LIZ;
            if (function1 != null) {
                strInvoke = function1.invoke("composer_filter");
            } else {
                strInvoke = null;
            }
            nLEResourceNode.setExtra("biz_res_id", C0FGD.LIZ(str2, strInvoke));
        }
        nLESegmentComposerFilter.setEffectSDKFilter(nLEResourceNode);
        nLETrackSlot.setMainSegment(nLESegmentComposerFilter);
        nLETrackSlot.setStartTime(0L);
        nLETrackSlot.setEndTime(-2L);
        C348240Dl0 c348240Dl0 = this.LIZIZ;
        if (c348240Dl0.LIZ.getLevel() >= 0) {
            nLETrackSlot.setTransformZ(c348240Dl0.LIZ.getLevel());
        }
        LJIIIIZZ(NLESegmentComposerFilter.dynamicCast((NLENode) nLETrackSlot.getMainSegment()), c348250Dl1);
        if (this.LIZJ) {
            nLETrackSlot.setExtra("global_filter_type", "color_filter");
        }
        nLETrack.addSlot(nLETrackSlot);
    }
}
