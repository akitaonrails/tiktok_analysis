package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.socialavatar.experiment.SAAnimationConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Hbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C444470Hbp extends C2217421BqW implements Function0<String> {
    public C444470Hbp(C444420Hbk c444420Hbk) {
        super(0, c444420Hbk, C444420Hbk.class, "frontUrlDark", "frontUrlDark()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        SAAnimationConfig sAAnimationConfig;
        this.receiver.getClass();
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            sAAnimationConfig = C444480Hbq.LIZ;
            SAAnimationConfig sAAnimationConfig2 = (SAAnimationConfig) settingsManagerLIZLLL.LJIIIIZZ("social_avatar_creation_assets", SAAnimationConfig.class, sAAnimationConfig);
            if (sAAnimationConfig2 != null) {
                sAAnimationConfig = sAAnimationConfig2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sAAnimationConfig = C444480Hbq.LIZ;
        }
        return sAAnimationConfig.cameraBorder;
    }
}
