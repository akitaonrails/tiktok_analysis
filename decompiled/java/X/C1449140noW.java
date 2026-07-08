package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectTemplateEffect;

/* JADX INFO: renamed from: X.0noW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449140noW {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Effect effect) {
        int source;
        if (C1446840nko.LJ(effect)) {
            source = 102;
        } else if (effect instanceof MobileEffectTemplateEffect) {
            source = 101;
        } else {
            source = effect.getSource();
        }
        return String.valueOf(source);
    }
}
