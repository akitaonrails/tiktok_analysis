package X;

import com.ss.android.ugc.gamora.editor.music.experiment.AutoMusicRecommendConfig;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0o1B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1456990o1B {
    public static final AutoMusicRecommendConfig LIZ = new AutoMusicRecommendConfig("", 1.0d, false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(560));

    public static final boolean LIZ() {
        C19292410dm currentUser;
        C01GW c01gw = LIZIZ;
        if ((!((AutoMusicRecommendConfig) c01gw.getValue()).originRecordEnabled && !((AutoMusicRecommendConfig) c01gw.getValue()).originUploadEnabled) || C0CHQ.LIZ().getAccountService().LIZ()) {
            return false;
        }
        C19292410dm currentUser2 = C0CHQ.LIZ().getAccountService().getCurrentUser();
        return currentUser2 == null || currentUser2.LIZLLL() != 3 || (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_auto_music_in_ba_account", true, false) && (currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser()) != null && currentUser.LIZLLL() == 3);
    }
}
