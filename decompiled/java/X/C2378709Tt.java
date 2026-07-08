package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;

/* JADX INFO: renamed from: X.09Tt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2378709Tt {
    public static final ReadTextEffectBean LIZ(Effect effect) {
        try {
            ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = (ReadTextEffectSpeakerExtra) C2219091BtD.LIZJ().LJII(effect.getExtra(), ReadTextEffectSpeakerExtra.class);
            if (readTextEffectSpeakerExtra != null) {
                readTextEffectSpeakerExtra.speakerName = effect.getName();
            } else {
                readTextEffectSpeakerExtra = new ReadTextEffectSpeakerExtra(false, null, null, null, 0, 0, null, null, null, null, false, 0L, 0L, null, 16383, null);
            }
            return new ReadTextEffectBean(effect, readTextEffectSpeakerExtra);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2219091BtD.LIZLLL().LIZIZ(e);
            return null;
        }
    }

    public static final String LIZIZ(Effect effect) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCManager -> effect.extra = ");
        sbLIZ.append(effect.getExtra());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1446130njf.LIZ.getClass();
        if (C1446130njf.LIZIZ(effect, "is_aigc_content", false)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}
