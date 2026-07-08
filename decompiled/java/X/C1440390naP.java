package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0naP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440390naP {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        C201950140e c201950140e = C201950140e.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldBlockSave: streaming-entry session still has HTTP NLE resources (");
        sbLIZ.append(str);
        sbLIZ.append("), skip save");
        C201955140j.LIZLLL(c201950140e, "StreamingEntryDraftGate", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        if (!C1440380naO.LIZIZ(videoPublishEditModel)) {
            return false;
        }
        boolean zLIZ = C348750Dlp.LIZ(nLEModel);
        if (zLIZ) {
            C201955140j.LIZLLL(C201950140e.LIZIZ, "StreamingEntryDraftGate", "shouldBlockSave: streaming-entry session still has HTTP NLE resources, skip save");
        }
        return zLIZ;
    }
}
