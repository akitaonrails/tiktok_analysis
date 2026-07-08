package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rh9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1598330rh9 {
    public static final EnumC1598330rh9 ACTIVE_STATUS;
    public static final EnumC1598330rh9 GENERAL;
    public static final EnumC1598330rh9 LIVE_SINGLE;
    public static final /* synthetic */ EnumC1598330rh9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1598330rh9 NONE;
    public static final EnumC1598330rh9 OTD_SINGLE;
    public static final EnumC1598330rh9 POST;
    public static final EnumC1598330rh9 STORY;
    public static final EnumC1598330rh9 STORY_WIDGET;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1598330rh9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1598330rh9 enumC1598330rh9 = new EnumC1598330rh9("NONE", 0, -1);
        NONE = enumC1598330rh9;
        EnumC1598330rh9 enumC1598330rh92 = new EnumC1598330rh9("GENERAL", 1, 0);
        GENERAL = enumC1598330rh92;
        EnumC1598330rh9 enumC1598330rh93 = new EnumC1598330rh9("ACTIVE_STATUS", 2, 1);
        ACTIVE_STATUS = enumC1598330rh93;
        EnumC1598330rh9 enumC1598330rh94 = new EnumC1598330rh9("STORY_WIDGET", 3, 2);
        STORY_WIDGET = enumC1598330rh94;
        EnumC1598330rh9 enumC1598330rh95 = new EnumC1598330rh9("STORY", 4, 3);
        STORY = enumC1598330rh95;
        EnumC1598330rh9 enumC1598330rh96 = new EnumC1598330rh9("LIVE_SINGLE", 5, 4);
        LIVE_SINGLE = enumC1598330rh96;
        EnumC1598330rh9 enumC1598330rh97 = new EnumC1598330rh9("POST", 6, 5);
        POST = enumC1598330rh97;
        EnumC1598330rh9 enumC1598330rh98 = new EnumC1598330rh9("OTD_SINGLE", 7, 6);
        OTD_SINGLE = enumC1598330rh98;
        EnumC1598330rh9[] enumC1598330rh9Arr = {enumC1598330rh9, enumC1598330rh92, enumC1598330rh93, enumC1598330rh94, enumC1598330rh95, enumC1598330rh96, enumC1598330rh97, enumC1598330rh98};
        LLILLJJLI = enumC1598330rh9Arr;
        LLILLL = new C2254308sP(enumC1598330rh9Arr);
    }

    public static EnumC1598330rh9[] values() {
        return (EnumC1598330rh9[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1598330rh9 valueOf(String str) {
        return (EnumC1598330rh9) C08FF.LIZ(EnumC1598330rh9.class, str);
    }

    public EnumC1598330rh9(String str, int i, int i2) {
        this.LL = i2;
    }
}
