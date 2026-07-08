package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1671280tao implements InterfaceC1688870u3B {
    public static final EnumC1671280tao ACTIVITY_STATUS;
    public static final EnumC1671280tao ACTIVITY_STATUS_V2;
    public static final EnumC1671280tao AI_REMIX_REUSE;
    public static final EnumC1671280tao COMMENTS;
    public static final EnumC1671280tao DIRECT_MESSAGES;
    public static final EnumC1671280tao DOWNLOADS;
    public static final EnumC1671280tao FAVORITE_SOUND;
    public static final EnumC1671280tao FOLLOWING_LIST;
    public static final EnumC1671280tao INTERACTIONS_SECTION_HEADER;
    public static final EnumC1671280tao LIKED_VIDEO;
    public static final /* synthetic */ EnumC1671280tao[] LLIZ;
    public static final /* synthetic */ C2254308sP LLIZLLLIL;
    public static final EnumC1671280tao MENTION;
    public static final EnumC1671280tao PROFILE_VIEW_HISTORY;
    public static final EnumC1671280tao REUSE_OF_CONTENT;
    public static final EnumC1671280tao SHARED_LINKS;
    public static final EnumC1671280tao VIDEO_VIEW_HISTORY;
    public static final EnumC1671280tao VIEWERS;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;

    public static InterfaceC2044707zh<EnumC1671280tao> getEntries() {
        return LLIZLLLIL;
    }

    static {
        EnumC1671280tao enumC1671280tao = new EnumC1671280tao("INTERACTIONS_SECTION_HEADER", null, "interaction_section_group", "sectionInteraction", 0, true, "sectionInteraction", 33);
        INTERACTIONS_SECTION_HEADER = enumC1671280tao;
        EnumC1671280tao enumC1671280tao2 = new EnumC1671280tao("COMMENTS", "comment_entrance", null, null, 1, false, null, 62);
        COMMENTS = enumC1671280tao2;
        EnumC1671280tao enumC1671280tao3 = new EnumC1671280tao("MENTION", "mention_entrance", null, null, 2, false, null, 62);
        MENTION = enumC1671280tao3;
        EnumC1671280tao enumC1671280tao4 = new EnumC1671280tao("DIRECT_MESSAGES", "direct_message_entrance", null, null, 3, false, null, 62);
        DIRECT_MESSAGES = enumC1671280tao4;
        EnumC1671280tao enumC1671280tao5 = new EnumC1671280tao("ACTIVITY_STATUS", "activity_status_entrance", null, null, 4, false, null, 62);
        ACTIVITY_STATUS = enumC1671280tao5;
        EnumC1671280tao enumC1671280tao6 = new EnumC1671280tao("ACTIVITY_STATUS_V2", "activity_status_v2_entrance", null, null, 5, false, null, 62);
        ACTIVITY_STATUS_V2 = enumC1671280tao6;
        EnumC1671280tao enumC1671280tao7 = new EnumC1671280tao("REUSE_OF_CONTENT", "content_reuse_entrance", null, null, 6, false, null, 62);
        REUSE_OF_CONTENT = enumC1671280tao7;
        EnumC1671280tao enumC1671280tao8 = new EnumC1671280tao("AI_REMIX_REUSE", "ai_remix_reuse_entrance", null, null, 7, false, null, 62);
        AI_REMIX_REUSE = enumC1671280tao8;
        EnumC1671280tao enumC1671280tao9 = new EnumC1671280tao("SHARED_LINKS", "display_profile_entrance", null, null, 8, false, null, 62);
        SHARED_LINKS = enumC1671280tao9;
        EnumC1671280tao enumC1671280tao10 = new EnumC1671280tao("DOWNLOADS", "download_entrance", null, null, 9, false, null, 62);
        DOWNLOADS = enumC1671280tao10;
        EnumC1671280tao enumC1671280tao11 = new EnumC1671280tao("FOLLOWING_LIST", "following_list_permission_entrance", null, null, 10, false, null, 62);
        FOLLOWING_LIST = enumC1671280tao11;
        EnumC1671280tao enumC1671280tao12 = new EnumC1671280tao("LIKED_VIDEO", "liked_videos_permission_entrance", null, null, 11, false, null, 62);
        LIKED_VIDEO = enumC1671280tao12;
        EnumC1671280tao enumC1671280tao13 = new EnumC1671280tao("FAVORITE_SOUND", "favorite_music_entrance", null, null, 12, false, null, 62);
        FAVORITE_SOUND = enumC1671280tao13;
        EnumC1671280tao enumC1671280tao14 = new EnumC1671280tao("VIEWERS", "viewer_history_entrance", null, null, 13, false, null, 62);
        VIEWERS = enumC1671280tao14;
        EnumC1671280tao enumC1671280tao15 = new EnumC1671280tao("VIDEO_VIEW_HISTORY", "video_view_history_entrance", null, null, 14, false, null, 62);
        VIDEO_VIEW_HISTORY = enumC1671280tao15;
        EnumC1671280tao enumC1671280tao16 = new EnumC1671280tao("PROFILE_VIEW_HISTORY", "profile_view_history_entrance", null, null, 15, false, null, 62);
        PROFILE_VIEW_HISTORY = enumC1671280tao16;
        EnumC1671280tao[] enumC1671280taoArr = {enumC1671280tao, enumC1671280tao2, enumC1671280tao3, enumC1671280tao4, enumC1671280tao5, enumC1671280tao6, enumC1671280tao7, enumC1671280tao8, enumC1671280tao9, enumC1671280tao10, enumC1671280tao11, enumC1671280tao12, enumC1671280tao13, enumC1671280tao14, enumC1671280tao15, enumC1671280tao16};
        LLIZ = enumC1671280taoArr;
        LLIZLLLIL = new C2254308sP(enumC1671280taoArr);
    }

    public static EnumC1671280tao[] values() {
        return (EnumC1671280tao[]) LLIZ.clone();
    }

    @Override // X.InterfaceC19211810Ea
    public String getContentType() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC19211810Ea
    public boolean getHeadingItem() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19211810Ea
    public String getIdentifier() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC19211810Ea
    public String getKey() {
        return this.LLILLL;
    }

    public final String getPageTag() {
        return this.LL;
    }

    @Override // X.InterfaceC19211910Eb
    public String getTag() {
        return this.LLILLJJLI;
    }

    public static EnumC1671280tao valueOf(String str) {
        return (EnumC1671280tao) C08FF.LIZ(EnumC1671280tao.class, str);
    }

    public EnumC1671280tao(String str, String str2, String str3, String str4, int i, boolean z, String str5, int i2) {
        String str6;
        str2 = (i2 & 1) != 0 ? "" : str2;
        str3 = (i2 & 2) != 0 ? str2 : str3;
        str4 = (i2 & 4) != 0 ? str2 : str4;
        str5 = (i2 & 8) != 0 ? "cellDisclosure" : str5;
        z = (i2 & 16) != 0 ? false : z;
        if ((i2 & 32) != 0) {
            str6 = str2;
        } else {
            str6 = null;
        }
        this.LL = str2;
        this.LLILLJJLI = str3;
        this.LLILLL = str4;
        this.LLILZ = str5;
        this.LLILZIL = z;
        this.LLILZLL = str6;
    }
}
