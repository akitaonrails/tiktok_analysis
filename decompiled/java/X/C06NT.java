package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.StoryGetStreaksInfoResponse;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import com.ss.android.ugc.aweme.story.streaks.IStoryStreaksService;
import com.ss.android.ugc.aweme.story.streaks.StoryStreaksServiceImpl;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06NT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06NT implements IStoryStreaksService {
    public static final C06NT LIZIZ = new C06NT();
    public final /* synthetic */ IStoryStreaksService LIZ;

    @Override // com.ss.android.ugc.aweme.story.streaks.IStoryStreaksService
    public final Pair<Boolean, Boolean> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.streaks.IStoryStreaksService
    public final void LIZIZ(Context context, StoryStreakEnterEditParam storyStreakEnterEditParam) {
        this.LIZ.LIZIZ(context, storyStreakEnterEditParam);
    }

    @Override // com.ss.android.ugc.aweme.story.streaks.IStoryStreaksService
    public final Map<String, Effect> LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.story.streaks.IStoryStreaksService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.story.streaks.IStoryStreaksService
    public final StoryGetStreaksInfoResponse LJ(String str) {
        return this.LIZ.LJ(str);
    }

    public C06NT() {
        IStoryStreaksService iStoryStreaksService;
        Object objLIZ = C04TD.LIZ(IStoryStreaksService.class, false);
        if (objLIZ != null) {
            iStoryStreaksService = (IStoryStreaksService) objLIZ;
        } else {
            if (C04TD.D5 == null) {
                synchronized (IStoryStreaksService.class) {
                    if (C04TD.D5 == null) {
                        C04TD.D5 = new StoryStreaksServiceImpl();
                    }
                }
            }
            iStoryStreaksService = C04TD.D5;
        }
        this.LIZ = iStoryStreaksService;
    }
}
