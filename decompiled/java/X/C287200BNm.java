package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C287200BNm extends C09AY implements Function0<Integer> {
    public C287200BNm() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("tt_story_guide_card_dislike_limit", 50));
    }
}
