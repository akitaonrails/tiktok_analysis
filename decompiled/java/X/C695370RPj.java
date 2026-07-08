package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0RPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695370RPj {
    public static final C695370RPj LIZ = new C695370RPj();

    public static C0RLH LIZ(Aweme aweme) {
        if (aweme != null && aweme.isPaidContent) {
            return new C0RLH() { // from class: X.0Bxr
                @Override // X.C0RLH
                public final boolean LIZ() {
                    return true;
                }

                @Override // X.C0RLH
                public final boolean LIZJ() {
                    return false;
                }

                @Override // X.C0RLH
                public final boolean LIZLLL() {
                    return false;
                }

                @Override // X.C0RLH
                public final boolean LIZIZ() {
                    SettingsManager.LIZLLL().getClass();
                    return SettingsManager.LIZ("paid_series_enable_full_screen_key", true);
                }
            };
        }
        if (C0SXF.LJJI(aweme)) {
            return new C0RLH() { // from class: X.0RPp
                @Override // X.C0RLH
                public final boolean LIZ() {
                    return false;
                }

                @Override // X.C0RLH
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.C0RLH
                public final boolean LIZJ() {
                    return true;
                }

                @Override // X.C0RLH
                public final boolean LIZLLL() {
                    return false;
                }
            };
        }
        return C305240Bxq.LIZ;
    }
}
