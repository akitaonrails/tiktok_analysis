package X;

import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0et1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105970et1 extends C09AY implements Function0<Integer> {
    public C1105970et1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(GameLivePartnershipDropsSetting.INSTANCE.getConfig().dropsPreviewShowCnt);
    }
}
