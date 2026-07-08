package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarEntranceControlModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HZ6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HZ6 extends C09AY implements Function0<SocialAvatarEntranceControlModel> {
    public C0HZ6() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarEntranceControlModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final SocialAvatarEntranceControlModel invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SocialAvatarEntranceControlModel socialAvatarEntranceControlModel = C0HZ7.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("social_avatar_entrance_control", SocialAvatarEntranceControlModel.class, socialAvatarEntranceControlModel);
        return LJIIIIZZ != 0 ? LJIIIIZZ : socialAvatarEntranceControlModel;
    }
}
