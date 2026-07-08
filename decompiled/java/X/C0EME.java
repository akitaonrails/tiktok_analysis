package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0EME, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EME implements C0EMH {
    @Override // X.C0EMH
    public final String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isSupportCache() || C298040BmE.LIZ()) {
            Object obj = C1184304kD.LIZ.get(C1184304kD.LIZ(C0EMG.class.getName(), "getUsedFunctions"));
            if (obj != null) {
                return (String) obj;
            }
        }
        String nleData = videoPublishEditModel.getNleData();
        if (nleData != null && nleData.length() != 0) {
            C0EMG.LIZ.getClass();
            String strLIZIZ = C0EG7.LIZ.LIZIZ(videoPublishEditModel, true, true);
            if (videoPublishEditModel.isSupportCache() || C298040BmE.LIZ()) {
                C1184304kD.LIZ.put(C1184304kD.LIZ(C0EMG.class.getName(), "getUsedFunctions"), strLIZIZ);
            }
            return strLIZIZ;
        }
        if (videoPublishEditModel.isSupportCache() || C298040BmE.LIZ()) {
            C1184304kD.LIZ.put(C1184304kD.LIZ(C0EMG.class.getName(), "getUsedFunctions"), "");
        }
        return "";
    }
}
