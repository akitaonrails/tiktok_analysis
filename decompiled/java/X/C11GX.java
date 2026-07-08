package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;

/* JADX INFO: renamed from: X.11GX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11GX {
    public static final BackgroundModel[] LIZ = {new BackgroundModel(0, null, null, null, null)};

    public static final BackgroundModel[] LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BackgroundModel[] backgroundModelArr = LIZ;
        BackgroundModel[] backgroundModelArr2 = (BackgroundModel[]) settingsManagerLIZLLL.LJIIIIZZ("story_note_mvp_background", BackgroundModel[].class, backgroundModelArr);
        return backgroundModelArr2 != null ? backgroundModelArr2 : backgroundModelArr;
    }
}
