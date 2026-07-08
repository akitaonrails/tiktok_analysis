package X;

import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C356630DyX extends C09AY implements Function1<VideoPublishEditModel, Boolean> {
    public C356630DyX() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(VideoPublishEditModel videoPublishEditModel) {
        for (EffectPointModel effectPointModel : videoPublishEditModel.getEffectList()) {
            String extra = effectPointModel.getExtra();
            if (extra != null && extra.length() != 0) {
                JSONObject jSONObject = new JSONObject(effectPointModel.getExtra());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AIGCManager -> editEffectHaveAIGC -> extra = ");
                sbLIZ.append(jSONObject);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (jSONObject.optBoolean("is_aigc_content")) {
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }
}
