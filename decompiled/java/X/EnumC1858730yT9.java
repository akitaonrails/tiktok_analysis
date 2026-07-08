package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1858730yT9 {
    public static final EnumC1858730yT9 CANCEL_DISLIKE;
    public static final EnumC1858730yT9 CANCEL_LIKE;
    public static final EnumC1858730yT9 COPY;
    public static final EnumC1858730yT9 DELETE;
    public static final EnumC1858730yT9 DISLIKE;
    public static final EnumC1858730yT9 LIKE;
    public static final /* synthetic */ EnumC1858730yT9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1858730yT9 REPORT;
    public static final EnumC1858730yT9 SELECT_TEXT;
    public static final EnumC1858730yT9 SHARE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1858730yT9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1858730yT9 enumC1858730yT9 = new EnumC1858730yT9("LIKE", 0, "tikbot_like_message");
        LIKE = enumC1858730yT9;
        EnumC1858730yT9 enumC1858730yT92 = new EnumC1858730yT9("DISLIKE", 1, "tikbot_dislike_message");
        DISLIKE = enumC1858730yT92;
        EnumC1858730yT9 enumC1858730yT93 = new EnumC1858730yT9("CANCEL_LIKE", 2, "tikbot_cancel_like_message");
        CANCEL_LIKE = enumC1858730yT93;
        EnumC1858730yT9 enumC1858730yT94 = new EnumC1858730yT9("CANCEL_DISLIKE", 3, "tikbot_cancel_dislike_message");
        CANCEL_DISLIKE = enumC1858730yT94;
        EnumC1858730yT9 enumC1858730yT95 = new EnumC1858730yT9("COPY", 4, "copy");
        COPY = enumC1858730yT95;
        EnumC1858730yT9 enumC1858730yT96 = new EnumC1858730yT9("SELECT_TEXT", 5, "select_text");
        SELECT_TEXT = enumC1858730yT96;
        EnumC1858730yT9 enumC1858730yT97 = new EnumC1858730yT9("DELETE", 6, "delete");
        DELETE = enumC1858730yT97;
        EnumC1858730yT9 enumC1858730yT98 = new EnumC1858730yT9("REPORT", 7, "report");
        REPORT = enumC1858730yT98;
        EnumC1858730yT9 enumC1858730yT99 = new EnumC1858730yT9("SHARE", 8, "share_select");
        SHARE = enumC1858730yT99;
        EnumC1858730yT9[] enumC1858730yT9Arr = {enumC1858730yT9, enumC1858730yT92, enumC1858730yT93, enumC1858730yT94, enumC1858730yT95, enumC1858730yT96, enumC1858730yT97, enumC1858730yT98, enumC1858730yT99};
        LLILLJJLI = enumC1858730yT9Arr;
        LLILLL = new C2254308sP(enumC1858730yT9Arr);
    }

    public static EnumC1858730yT9[] values() {
        return (EnumC1858730yT9[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1858730yT9 valueOf(String str) {
        return (EnumC1858730yT9) C08FF.LIZ(EnumC1858730yT9.class, str);
    }

    public EnumC1858730yT9(String str, int i, String str2) {
        this.LL = str2;
    }
}
