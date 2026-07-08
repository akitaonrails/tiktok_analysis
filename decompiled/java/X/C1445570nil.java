package X;

import Y.ACallableS12S0010000_3;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445570nil {
    public static final Map<String, String> LIZ = new LinkedHashMap();

    public static C1445580nim LIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        MatchedSoundInfo matchedSoundInfo;
        String id;
        C1445580nim c1445580nim = new C1445580nim();
        String editEffectListStr = videoPublishEditModel.getEditEffectListStr();
        boolean z2 = true;
        if (editEffectListStr.length() > 0 && !TextUtils.isEmpty(videoPublishEditModel.getStickers())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(editEffectListStr);
            sbLIZ.append(',');
            sbLIZ.append(videoPublishEditModel.getStickers());
            editEffectListStr = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (editEffectListStr.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (editEffectListStr = videoPublishEditModel.getStickers()) == null) {
            editEffectListStr = "";
        }
        c1445580nim.LIZIZ = editEffectListStr;
        c1445580nim.LIZ = videoPublishEditModel.getMusicId();
        c1445580nim.LIZJ = "";
        if (TextUtils.isEmpty(videoPublishEditModel.getUploadPath())) {
            videoPublishEditModel.setUploadPath((String) ((LinkedHashMap) LIZ).get(videoPublishEditModel.getCreationId()));
        }
        c1445580nim.LIZLLL = videoPublishEditModel.getUploadPath();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mShootWay", videoPublishEditModel.mShootWay);
        jSONObject.put("mIsFromDraft", videoPublishEditModel.mIsFromDraft);
        jSONObject.put("method", "getFromVideoEditModel");
        C786410Ut5.J3(jSONObject);
        String creationId = videoPublishEditModel.getCreationId();
        JSONObject jSONObject2 = new JSONObject();
        if (creationId == null) {
            creationId = "";
        }
        jSONObject2.put("creation_id", creationId);
        jSONObject2.put("title", "");
        C786410Ut5.J3(jSONObject2);
        String str = c1445580nim.LIZLLL;
        if (str != null && str.length() != 0) {
            z2 = false;
        }
        Long lLJIILIIL = null;
        if (!C0CHQ.LIZ().getAccountService().LIZ()) {
            C15O7.LIZIZ(new ACallableS12S0010000_3(z2, 0), C20684815ws.LJFF(), null);
        }
        MusicObject musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
        if (musicObject != null && (matchedSoundInfo = musicObject.matchedSongInfo) != null && (id = matchedSoundInfo.getId()) != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(id);
        }
        c1445580nim.LJ = lLJIILIIL;
        return c1445580nim;
    }
}
