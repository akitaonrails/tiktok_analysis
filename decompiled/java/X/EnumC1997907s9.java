package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07s9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1997907s9 {
    public static final EnumC1997907s9 CONVERSATION_PROPERTY_TYPES_CAMERA_ICON;
    public static final EnumC1997907s9 CONVERSATION_PROPERTY_TYPES_RECENT_ACTIVITIES;
    public static final EnumC1997907s9 CONVERSATION_PROPERTY_TYPES_RECOMMENDED_CHAT;
    public static final EnumC1997907s9 CONVERSATION_PROPERTY_TYPES_SUGGESTED_STICKERS;
    public static final /* synthetic */ EnumC1997907s9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1997907s9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1997907s9 enumC1997907s9 = new EnumC1997907s9("CONVERSATION_PROPERTY_TYPES_RECOMMENDED_CHAT", 0, 0);
        CONVERSATION_PROPERTY_TYPES_RECOMMENDED_CHAT = enumC1997907s9;
        EnumC1997907s9 enumC1997907s92 = new EnumC1997907s9("CONVERSATION_PROPERTY_TYPES_CAMERA_ICON", 1, 1);
        CONVERSATION_PROPERTY_TYPES_CAMERA_ICON = enumC1997907s92;
        EnumC1997907s9 enumC1997907s93 = new EnumC1997907s9("CONVERSATION_PROPERTY_TYPES_SUGGESTED_STICKERS", 2, 2);
        CONVERSATION_PROPERTY_TYPES_SUGGESTED_STICKERS = enumC1997907s93;
        EnumC1997907s9 enumC1997907s94 = new EnumC1997907s9("CONVERSATION_PROPERTY_TYPES_RECENT_ACTIVITIES", 3, 3);
        CONVERSATION_PROPERTY_TYPES_RECENT_ACTIVITIES = enumC1997907s94;
        EnumC1997907s9[] enumC1997907s9Arr = {enumC1997907s9, enumC1997907s92, enumC1997907s93, enumC1997907s94};
        LLILLJJLI = enumC1997907s9Arr;
        LLILLL = new C2254308sP(enumC1997907s9Arr);
    }

    public static EnumC1997907s9[] values() {
        return (EnumC1997907s9[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1997907s9 valueOf(String str) {
        return (EnumC1997907s9) C08FF.LIZ(EnumC1997907s9.class, str);
    }

    public EnumC1997907s9(String str, int i, int i2) {
        this.LL = i2;
    }
}
