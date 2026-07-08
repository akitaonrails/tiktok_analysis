package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.social.experiment.Config;

/* JADX INFO: renamed from: X.10sR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19383310sR {
    public static final Config LIZ = new Config(300, 0.66f);

    public static Config LIZ() {
        Config config = (Config) SettingsManager.LIZLLL().LJIIIIZZ("story_publish_anim_setting", Config.class, LIZ);
        return config == null ? new Config(300L, 0.66f) : config;
    }
}
