package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LQY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LQY implements AIGC<String> {
    public static final C0LQY AI_FOLLOW;
    public static final C0LQY AI_MV;
    public static final C0LQY AI_PORTRAIT;
    public static final C0LQY AI_REMIX;
    public static final C0LQY AI_THEATER;
    public static final /* synthetic */ C0LQY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0LQY> getEntries() {
        return LLILLL;
    }

    static {
        C0LQY c0lqy = new C0LQY("AI_THEATER", 0, "ai_theater");
        AI_THEATER = c0lqy;
        C0LQY c0lqy2 = new C0LQY("AI_MV", 1, "ai_mv");
        AI_MV = c0lqy2;
        C0LQY c0lqy3 = new C0LQY("AI_FOLLOW", 2, "ai_follow");
        AI_FOLLOW = c0lqy3;
        C0LQY c0lqy4 = new C0LQY("AI_REMIX", 3, "ai_remix");
        AI_REMIX = c0lqy4;
        C0LQY c0lqy5 = new C0LQY("AI_PORTRAIT", 4, "ai_portrait");
        AI_PORTRAIT = c0lqy5;
        C0LQY[] c0lqyArr = {c0lqy, c0lqy2, c0lqy3, c0lqy4, c0lqy5};
        LLILLJJLI = c0lqyArr;
        LLILLL = new C2254308sP(c0lqyArr);
    }

    public static C0LQY[] values() {
        return (C0LQY[]) LLILLJJLI.clone();
    }

    @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC
    public String getValue() {
        return this.LL;
    }

    public static C0LQY valueOf(String str) {
        return (C0LQY) C08FF.LIZ(C0LQY.class, str);
    }

    public boolean isFromChat(AIGC.AICreationSceneName aICreationSceneName) {
        return C549110LgD.LIZ(aICreationSceneName);
    }

    public C0LQY(String str, int i, String str2) {
        this.LL = str2;
    }
}
