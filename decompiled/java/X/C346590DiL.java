package X;

import com.bytedance.ies.nle.editor_jni.NLEMVExternalAlgorithmResult;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackMV;

/* JADX INFO: renamed from: X.0DiL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346590DiL {
    public static final void LIZ(NLETrackMV nLETrackMV, String str, String str2, String str3, int i) {
        NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult = new NLEMVExternalAlgorithmResult();
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.setResourceFile(str);
        nLEMVExternalAlgorithmResult.setPhoto(nLEResourceNode);
        nLEMVExternalAlgorithmResult.setAlgorithmName(str2);
        NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
        nLEResourceNode2.setResourceFile(str3);
        nLEMVExternalAlgorithmResult.setMask(nLEResourceNode2);
        nLEMVExternalAlgorithmResult.setResultInType(i);
        nLETrackMV.addMask(nLEMVExternalAlgorithmResult);
    }
}
