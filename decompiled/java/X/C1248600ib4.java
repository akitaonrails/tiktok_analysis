package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.profile.platform.ab.ProfileInteractionTipsFrequencyData;

/* JADX INFO: renamed from: X.0ib4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248600ib4 {
    public static final ProfileInteractionTipsFrequencyData LIZ;

    static {
        ProfileInteractionTipsFrequencyData profileInteractionTipsFrequencyData = new ProfileInteractionTipsFrequencyData(4, 1);
        ProfileInteractionTipsFrequencyData profileInteractionTipsFrequencyData2 = (ProfileInteractionTipsFrequencyData) SettingsManager.LIZLLL().LJIIIIZZ("profile_interaction_tips_frequency", ProfileInteractionTipsFrequencyData.class, profileInteractionTipsFrequencyData);
        if (profileInteractionTipsFrequencyData2 != null) {
            profileInteractionTipsFrequencyData = profileInteractionTipsFrequencyData2;
        }
        LIZ = profileInteractionTipsFrequencyData;
    }
}
