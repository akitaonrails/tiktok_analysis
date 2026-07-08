package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UI4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UI4 {
    public static final C0UI4 INSERT_STICKER_ANIMATION;
    public static final C0UI4 LIVE_ACADEMY_REWARD_ANIMATION;
    public static final C0UI4 LIVE_CAMPAIGN_ANIMATION;
    public static final C0UI4 LIVE_CENTER_PROMOTE_ANIMATION;
    public static final /* synthetic */ C0UI4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0UI4> getEntries() {
        return LLILLL;
    }

    static {
        C0UI4 c0ui4 = new C0UI4("LIVE_ACADEMY_REWARD_ANIMATION", 0, "LiveAcademyRewardAnimation");
        LIVE_ACADEMY_REWARD_ANIMATION = c0ui4;
        C0UI4 c0ui42 = new C0UI4("LIVE_CENTER_PROMOTE_ANIMATION", 1, "LiveCenterPromoteAnimation");
        LIVE_CENTER_PROMOTE_ANIMATION = c0ui42;
        C0UI4 c0ui43 = new C0UI4("LIVE_CAMPAIGN_ANIMATION", 2, "LiveCampaignAnimation");
        LIVE_CAMPAIGN_ANIMATION = c0ui43;
        C0UI4 c0ui44 = new C0UI4("INSERT_STICKER_ANIMATION", 3, "InsertStickerAnimation");
        INSERT_STICKER_ANIMATION = c0ui44;
        C0UI4[] c0ui4Arr = {c0ui4, c0ui42, c0ui43, c0ui44};
        LLILLJJLI = c0ui4Arr;
        LLILLL = new C2254308sP(c0ui4Arr);
    }

    public static C0UI4[] values() {
        return (C0UI4[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static C0UI4 valueOf(String str) {
        return (C0UI4) C08FF.LIZ(C0UI4.class, str);
    }

    public C0UI4(String str, int i, String str2) {
        this.LL = str2;
    }
}
