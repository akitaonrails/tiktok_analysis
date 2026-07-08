package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iCZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1233410iCZ {
    public static final EnumC1233410iCZ FAIL_FRIENDS_ONLY;
    public static final EnumC1233410iCZ FAIL_NORMAL;
    public static final EnumC1233410iCZ FAIL_PRIVATE;
    public static final EnumC1233410iCZ FAIL_SUBSCRIBERS_ONLY;
    public static final EnumC1233410iCZ FOLLOWED;
    public static final /* synthetic */ EnumC1233410iCZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1233410iCZ SUCCESS;

    public static InterfaceC2044707zh<EnumC1233410iCZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1233410iCZ enumC1233410iCZ = new EnumC1233410iCZ("SUCCESS", 0);
        SUCCESS = enumC1233410iCZ;
        EnumC1233410iCZ enumC1233410iCZ2 = new EnumC1233410iCZ("FOLLOWED", 1);
        FOLLOWED = enumC1233410iCZ2;
        EnumC1233410iCZ enumC1233410iCZ3 = new EnumC1233410iCZ("FAIL_NORMAL", 2);
        FAIL_NORMAL = enumC1233410iCZ3;
        EnumC1233410iCZ enumC1233410iCZ4 = new EnumC1233410iCZ("FAIL_PRIVATE", 3);
        FAIL_PRIVATE = enumC1233410iCZ4;
        EnumC1233410iCZ enumC1233410iCZ5 = new EnumC1233410iCZ("FAIL_FRIENDS_ONLY", 4);
        FAIL_FRIENDS_ONLY = enumC1233410iCZ5;
        EnumC1233410iCZ enumC1233410iCZ6 = new EnumC1233410iCZ("FAIL_SUBSCRIBERS_ONLY", 5);
        FAIL_SUBSCRIBERS_ONLY = enumC1233410iCZ6;
        EnumC1233410iCZ[] enumC1233410iCZArr = {enumC1233410iCZ, enumC1233410iCZ2, enumC1233410iCZ3, enumC1233410iCZ4, enumC1233410iCZ5, enumC1233410iCZ6};
        LL = enumC1233410iCZArr;
        LLILLJJLI = new C2254308sP(enumC1233410iCZArr);
    }

    public static EnumC1233410iCZ[] values() {
        return (EnumC1233410iCZ[]) LL.clone();
    }

    public static EnumC1233410iCZ valueOf(String str) {
        return (EnumC1233410iCZ) C08FF.LIZ(EnumC1233410iCZ.class, str);
    }

    public EnumC1233410iCZ(String str, int i) {
    }
}
