package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.aigc.asynctask.I2VTaskInput;
import defpackage.g1;

/* JADX INFO: renamed from: X.0LSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C543220LSe {
    public static final Keva LIZ = Keva.getRepo("repo_creation_async_task");

    public static String LIZ(I2VTaskInput i2VTaskInput) {
        NLEEditor nLEEditor;
        NLEModel model;
        NLETrackSlot nLETrackSlotLIZ;
        NLESegment mainSegment;
        NLEResourceNode resource;
        String resourceFile;
        if (i2VTaskInput == null || (nLEEditor = i2VTaskInput.LIZJ) == null || (model = nLEEditor.getModel()) == null || (nLETrackSlotLIZ = g1.LIZ(model, i2VTaskInput.LIZLLL)) == null || C0E5J.LJI(nLETrackSlotLIZ) || (mainSegment = nLETrackSlotLIZ.getMainSegment()) == null || (resource = mainSegment.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
            return null;
        }
        String strLIZ = C09N5.LIZ(C0CHQ.LIZ, UriProtector.parse(resourceFile));
        String strLIZ2 = C08F1.LIZ(new C0VSJ(strLIZ));
        String str = i2VTaskInput.LJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("genCacheKey: ");
        sbLIZ.append(resourceFile);
        sbLIZ.append(", ");
        sbLIZ.append(strLIZ);
        sbLIZ.append(' ');
        sbLIZ.append(strLIZ2);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(i2VTaskInput.LIZ);
        C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZ2);
        sbLIZ2.append(str);
        sbLIZ2.append(i2VTaskInput.LIZ.getCreationId());
        return C08F1.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static String LIZIZ(String str) {
        String string;
        if (str == null || (string = LIZ.getString(str, null)) == null || string.length() == 0 || !new C0VSJ(string).exists()) {
            return null;
        }
        return string;
    }
}
