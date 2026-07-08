package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC605950Nph {
    public static final EnumC605950Nph CHANNEL_LIST_EVENT_TYPE_CHANGE_COMMENT_STATUS;
    public static final EnumC605950Nph CHANNEL_LIST_EVENT_TYPE_DELETE;
    public static final EnumC605950Nph CHANNEL_LIST_EVENT_TYPE_UNKNOWN;
    public static final EnumC605950Nph CHANNEL_LIST_EVENT_TYPE_UPDATE_INTERACTION;
    public static final EnumC605950Nph CHANNEL_LIST_EVENT_TYPE_WITHDRAW;
    public static final /* synthetic */ EnumC605950Nph[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC605950Nph> getEntries() {
        return LLILLL;
    }

    static {
        EnumC605950Nph enumC605950Nph = new EnumC605950Nph("CHANNEL_LIST_EVENT_TYPE_UNKNOWN", 0, 0);
        CHANNEL_LIST_EVENT_TYPE_UNKNOWN = enumC605950Nph;
        EnumC605950Nph enumC605950Nph2 = new EnumC605950Nph("CHANNEL_LIST_EVENT_TYPE_WITHDRAW", 1, 1);
        CHANNEL_LIST_EVENT_TYPE_WITHDRAW = enumC605950Nph2;
        EnumC605950Nph enumC605950Nph3 = new EnumC605950Nph("CHANNEL_LIST_EVENT_TYPE_DELETE", 2, 2);
        CHANNEL_LIST_EVENT_TYPE_DELETE = enumC605950Nph3;
        EnumC605950Nph enumC605950Nph4 = new EnumC605950Nph("CHANNEL_LIST_EVENT_TYPE_UPDATE_INTERACTION", 3, 3);
        CHANNEL_LIST_EVENT_TYPE_UPDATE_INTERACTION = enumC605950Nph4;
        EnumC605950Nph enumC605950Nph5 = new EnumC605950Nph("CHANNEL_LIST_EVENT_TYPE_CHANGE_COMMENT_STATUS", 4, 99);
        CHANNEL_LIST_EVENT_TYPE_CHANGE_COMMENT_STATUS = enumC605950Nph5;
        EnumC605950Nph[] enumC605950NphArr = {enumC605950Nph, enumC605950Nph2, enumC605950Nph3, enumC605950Nph4, enumC605950Nph5};
        LLILLJJLI = enumC605950NphArr;
        LLILLL = new C2254308sP(enumC605950NphArr);
    }

    public static EnumC605950Nph[] values() {
        return (EnumC605950Nph[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC605950Nph valueOf(String str) {
        return (EnumC605950Nph) C08FF.LIZ(EnumC605950Nph.class, str);
    }

    public EnumC605950Nph(String str, int i, int i2) {
        this.LL = i2;
    }
}
