package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC919120a1e {
    public static final EnumC919120a1e AUDIENCE_SENDER;
    public static final EnumC919120a1e ENEMY_ANCHOR;
    public static final EnumC919120a1e ENEMY_AUDIENCE;
    public static final /* synthetic */ EnumC919120a1e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC919120a1e TEAM_ANCHOR;
    public static final EnumC919120a1e TEAM_AUDIENCE;
    public static final EnumC919120a1e UNKNOWN;

    public static InterfaceC2044707zh<EnumC919120a1e> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC919120a1e enumC919120a1e = new EnumC919120a1e("UNKNOWN", 0);
        UNKNOWN = enumC919120a1e;
        EnumC919120a1e enumC919120a1e2 = new EnumC919120a1e("TEAM_ANCHOR", 1);
        TEAM_ANCHOR = enumC919120a1e2;
        EnumC919120a1e enumC919120a1e3 = new EnumC919120a1e("ENEMY_ANCHOR", 2);
        ENEMY_ANCHOR = enumC919120a1e3;
        EnumC919120a1e enumC919120a1e4 = new EnumC919120a1e("AUDIENCE_SENDER", 3);
        AUDIENCE_SENDER = enumC919120a1e4;
        EnumC919120a1e enumC919120a1e5 = new EnumC919120a1e("TEAM_AUDIENCE", 4);
        TEAM_AUDIENCE = enumC919120a1e5;
        EnumC919120a1e enumC919120a1e6 = new EnumC919120a1e("ENEMY_AUDIENCE", 5);
        ENEMY_AUDIENCE = enumC919120a1e6;
        EnumC919120a1e[] enumC919120a1eArr = {enumC919120a1e, enumC919120a1e2, enumC919120a1e3, enumC919120a1e4, enumC919120a1e5, enumC919120a1e6};
        LL = enumC919120a1eArr;
        LLILLJJLI = new C2254308sP(enumC919120a1eArr);
    }

    public static EnumC919120a1e[] values() {
        return (EnumC919120a1e[]) LL.clone();
    }

    public static EnumC919120a1e valueOf(String str) {
        return (EnumC919120a1e) C08FF.LIZ(EnumC919120a1e.class, str);
    }

    public EnumC919120a1e(String str, int i) {
    }
}
