package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.0Dng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349900Dng {
    public static final /* synthetic */ int LIZ = 0;

    public static final Pair<Boolean, Integer> LIZ(int i, String str, boolean z) throws Throwable {
        C349910Dnh.LIZ("begin processNLEDraftFile");
        if (i >= 0 && i < 1) {
            if (z) {
                C349910Dnh.LIZ("upgradeNLEDraftFrom0To1 is advance draft");
            } else if (!C2286708xd.LIZJ(str)) {
                C349910Dnh.LIZ("upgradeNLEDraftFrom0To1 file not exists");
            } else {
                C0FGC.LIZ(2);
                NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                String strLJIJ = C2354709Kn.LJIJ(str);
                if (strLJIJ == null) {
                    strLJIJ = "";
                }
                nLEEditorLIZ.restore(strLJIJ);
                AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(496);
                ArrayList arrayList = new ArrayList();
                for (NLEResourceNode nLEResourceNode : nLEEditorLIZ.getModel().getAllResources()) {
                    NLEResourceAV nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast((NLENode) nLEResourceNode);
                    if (nLEResourceAVDynamicCast != null) {
                        if (nLEResourceAVDynamicCast.hasFileInfo() && !TextUtils.isEmpty(nLEResourceAVDynamicCast.getFileInfo()) && !C2286708xd.LIZJ(nLEResourceAVDynamicCast.getFileInfo())) {
                            arrayList.add(nLEResourceAVDynamicCast.getFileInfo());
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("lost file ");
                            sbLIZ.append(nLEResourceAVDynamicCast.getFileInfo());
                            C2188811AlT.LIZIZ(sbLIZ);
                            aFwS234S0000000_5.getClass();
                        }
                        if (nLEResourceAVDynamicCast.hasReverseResourceFile() && !TextUtils.isEmpty(nLEResourceAVDynamicCast.getReverseResourceFile()) && !C2286708xd.LIZJ(nLEResourceAVDynamicCast.getReverseResourceFile())) {
                            arrayList.add(nLEResourceAVDynamicCast.getReverseResourceFile());
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("lost file ");
                            sbLIZ2.append(nLEResourceAVDynamicCast.getReverseResourceFile());
                            C2188811AlT.LIZIZ(sbLIZ2);
                            aFwS234S0000000_5.getClass();
                        }
                    }
                    if (nLEResourceNode.hasResourceFile() && !TextUtils.isEmpty(nLEResourceNode.getResourceFile()) && !C2286708xd.LIZJ(nLEResourceNode.getResourceFile())) {
                        arrayList.add(nLEResourceNode.getResourceFile());
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("lost file ");
                        sbLIZ3.append(nLEResourceNode.getResourceFile());
                        C2188811AlT.LIZIZ(sbLIZ3);
                        aFwS234S0000000_5.getClass();
                    }
                }
                if (!arrayList.isEmpty()) {
                    C349910Dnh.LIZ("upgradeNLEDraftFrom0To1 nleData has lost file, remove nleData");
                    C2286708xd.LJIJ(str);
                }
            }
            i = 1;
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i));
    }
}
