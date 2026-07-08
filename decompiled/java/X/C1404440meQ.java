package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0meQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404440meQ {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.isFastImport()) {
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ve_fast_import_ignore_recode", false)) {
            return false;
        }
        return true;
    }
}
