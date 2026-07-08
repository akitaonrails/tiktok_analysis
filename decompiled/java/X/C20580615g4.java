package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.experiment.thought.StoryThoughtHolidayConfigSettings;
import com.ss.android.ugc.aweme.story.note.prompt.IFriendInteractionSettingsService;

/* JADX INFO: renamed from: X.15g4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20580615g4 {
    public static C20580415g2 LIZ(Context context, boolean z, boolean z2) {
        StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig storyThoughtHolidayConfigLIZJ;
        if (!z) {
            IFriendInteractionSettingsService iFriendInteractionSettingsService = (IFriendInteractionSettingsService) ServiceManager.get().getService(IFriendInteractionSettingsService.class);
            String immersiveViewGuidanceText = null;
            if (iFriendInteractionSettingsService != null && (storyThoughtHolidayConfigLIZJ = iFriendInteractionSettingsService.LIZJ()) != null) {
                immersiveViewGuidanceText = storyThoughtHolidayConfigLIZJ.getImmersiveViewGuidanceText(z2);
            }
            if (C123100dR.LIZ(immersiveViewGuidanceText)) {
                return new C20580415g2(immersiveViewGuidanceText, EnumC19387610t8.HOLIDAY);
            }
        }
        C1256470inl.LL.getClass();
        String str = C1256470inl.LLILLJJLI;
        if (C123100dR.LIZ(str)) {
            return new C20580415g2(str, EnumC19387610t8.DYNAMIC);
        }
        return new C20580415g2(context.getString(2131849044), EnumC19387610t8.DEFAULT);
    }
}
