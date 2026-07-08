package X;

import android.content.Context;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import com.ss.android.ugc.aweme.story.streaks.StoryStreaksServiceImpl;
import kotlin.Unit;

/* JADX INFO: renamed from: X.126P, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C126P extends C2217421BqW implements InterfaceC1685430txd<Context, String, StoryStreakEnterEditParam, String, String, Integer, Unit> {
    public C126P(StoryStreaksServiceImpl storyStreaksServiceImpl) {
        super(6, storyStreaksServiceImpl, StoryStreaksServiceImpl.class, "finishPreparingResources", "finishPreparingResources(Landroid/content/Context;Ljava/lang/String;Lcom/ss/android/ugc/aweme/story/model/streaks/StoryStreakEnterEditParam;Ljava/lang/String;Ljava/lang/String;I)V", 0);
    }

    @Override // X.InterfaceC1685430txd
    public final Unit invoke(Context context, String str, StoryStreakEnterEditParam storyStreakEnterEditParam, String str2, String str3, Integer num) {
        Context context2 = context;
        String str4 = str;
        StoryStreakEnterEditParam storyStreakEnterEditParam2 = storyStreakEnterEditParam;
        String str5 = str2;
        String str6 = str3;
        int iIntValue = num.intValue();
        StoryStreaksServiceImpl storyStreaksServiceImpl = (StoryStreaksServiceImpl) this.receiver;
        storyStreaksServiceImpl.getClass();
        if (storyStreakEnterEditParam2.getEnterByClickPostBtn()) {
            DialogC1389620mGW dialogC1389620mGW = storyStreaksServiceImpl.LIZ;
            if (dialogC1389620mGW != null) {
                C0FNV.LIZ(dialogC1389620mGW);
            }
            storyStreaksServiceImpl.LIZ = null;
            if (str5 != null && str6 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = storyStreaksServiceImpl.LIZIZ;
                long j2 = jCurrentTimeMillis - j;
                if (j > 0 && j2 < 60000) {
                    storyStreaksServiceImpl.LIZIZ = 0L;
                } else {
                    storyStreaksServiceImpl.LJFF(context2, str5, str6, str4, storyStreakEnterEditParam2);
                }
            } else {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context2);
                if (c19egLIZIZ != null) {
                    C1389880mGw c1389880mGw = new C1389880mGw(c19egLIZIZ);
                    c1389880mGw.LJIIIIZZ(2131848735);
                    c1389880mGw.LJIIJ();
                }
                C126M.LIZIZ(storyStreakEnterEditParam2, iIntValue);
            }
        } else if (str5 != null && str6 != null) {
            C126I.LIZ.getClass();
            if (C126I.LJI) {
                storyStreaksServiceImpl.LJFF(context2, str5, str6, str4, storyStreakEnterEditParam2);
            } else {
                System.currentTimeMillis();
                C126I.LJIIIIZZ = new C126V(str5, str6);
                C126I.LJ = false;
            }
        } else {
            C126I.LIZ.getClass();
            C126I.LJI = false;
            C126I.LJ = false;
        }
        return Unit.LIZ;
    }
}
