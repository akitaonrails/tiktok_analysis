package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i9E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1231340i9E {
    public static final EnumC1231340i9E CLICK_ACTION_DM_SETTING_PERMISSION_TURN_ON;
    public static final EnumC1231340i9E CLICK_ACTION_FOLLOW;
    public static final EnumC1231340i9E CLICK_ACTION_SCHEMA;
    public static final EnumC1231340i9E CLICK_ACTION_UNKNOWN;
    public static final EnumC1231340i9E CLICK_ACTION_VERIFY;
    public static final C1231370i9H Companion;
    public static final /* synthetic */ EnumC1231340i9E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1231340i9E> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0i9H] */
    static {
        EnumC1231340i9E enumC1231340i9E = new EnumC1231340i9E("CLICK_ACTION_UNKNOWN", 0, 0);
        CLICK_ACTION_UNKNOWN = enumC1231340i9E;
        EnumC1231340i9E enumC1231340i9E2 = new EnumC1231340i9E("CLICK_ACTION_SCHEMA", 1, 1);
        CLICK_ACTION_SCHEMA = enumC1231340i9E2;
        EnumC1231340i9E enumC1231340i9E3 = new EnumC1231340i9E("CLICK_ACTION_FOLLOW", 2, 2);
        CLICK_ACTION_FOLLOW = enumC1231340i9E3;
        EnumC1231340i9E enumC1231340i9E4 = new EnumC1231340i9E("CLICK_ACTION_VERIFY", 3, 3);
        CLICK_ACTION_VERIFY = enumC1231340i9E4;
        EnumC1231340i9E enumC1231340i9E5 = new EnumC1231340i9E("CLICK_ACTION_DM_SETTING_PERMISSION_TURN_ON", 4, 4);
        CLICK_ACTION_DM_SETTING_PERMISSION_TURN_ON = enumC1231340i9E5;
        EnumC1231340i9E[] enumC1231340i9EArr = {enumC1231340i9E, enumC1231340i9E2, enumC1231340i9E3, enumC1231340i9E4, enumC1231340i9E5};
        LLILLJJLI = enumC1231340i9EArr;
        LLILLL = new C2254308sP(enumC1231340i9EArr);
        Companion = new Object() { // from class: X.0i9H
        };
    }

    public static EnumC1231340i9E[] values() {
        return (EnumC1231340i9E[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1231340i9E valueOf(String str) {
        return (EnumC1231340i9E) C08FF.LIZ(EnumC1231340i9E.class, str);
    }

    public EnumC1231340i9E(String str, int i, int i2) {
        this.LL = i2;
    }
}
