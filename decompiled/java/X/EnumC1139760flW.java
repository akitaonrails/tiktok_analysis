package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0flW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1139760flW {
    public static final EnumC1139760flW ACTIVE;
    public static final EnumC1139760flW IDLE;
    public static final /* synthetic */ EnumC1139760flW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1139760flW RECOGNIZING;
    public static final EnumC1139760flW SETTLING;
    public static final EnumC1139760flW WAITING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1139760flW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1139760flW enumC1139760flW = new EnumC1139760flW("IDLE", 0, "idle");
        IDLE = enumC1139760flW;
        EnumC1139760flW enumC1139760flW2 = new EnumC1139760flW("WAITING", 1, "waiting");
        WAITING = enumC1139760flW2;
        EnumC1139760flW enumC1139760flW3 = new EnumC1139760flW("RECOGNIZING", 2, "recognizing");
        RECOGNIZING = enumC1139760flW3;
        EnumC1139760flW enumC1139760flW4 = new EnumC1139760flW("ACTIVE", 3, "active");
        ACTIVE = enumC1139760flW4;
        EnumC1139760flW enumC1139760flW5 = new EnumC1139760flW("SETTLING", 4, "settling");
        SETTLING = enumC1139760flW5;
        EnumC1139760flW[] enumC1139760flWArr = {enumC1139760flW, enumC1139760flW2, enumC1139760flW3, enumC1139760flW4, enumC1139760flW5};
        LLILLJJLI = enumC1139760flWArr;
        LLILLL = new C2254308sP(enumC1139760flWArr);
    }

    public static EnumC1139760flW[] values() {
        return (EnumC1139760flW[]) LLILLJJLI.clone();
    }

    public final boolean isInGaming() {
        return this == ACTIVE || this == SETTLING || this == RECOGNIZING;
    }

    public final String getStateName() {
        return this.LL;
    }

    public static EnumC1139760flW valueOf(String str) {
        return (EnumC1139760flW) C08FF.LIZ(EnumC1139760flW.class, str);
    }

    public EnumC1139760flW(String str, int i, String str2) {
        this.LL = str2;
    }
}
