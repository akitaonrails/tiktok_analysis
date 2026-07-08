package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC358760E4s {
    public static final EnumC358760E4s AUTO_PLAY_SELECT;
    public static final EnumC358760E4s CANCEL;
    public static final C358750E4r Companion;
    public static final /* synthetic */ EnumC358760E4s[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC358760E4s NORMAL;
    public static final EnumC358760E4s USER_CLICK;

    public static InterfaceC2044707zh<EnumC358760E4s> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0E4r] */
    static {
        EnumC358760E4s enumC358760E4s = new EnumC358760E4s("NORMAL", 0);
        NORMAL = enumC358760E4s;
        EnumC358760E4s enumC358760E4s2 = new EnumC358760E4s("USER_CLICK", 1);
        USER_CLICK = enumC358760E4s2;
        EnumC358760E4s enumC358760E4s3 = new EnumC358760E4s("CANCEL", 2);
        CANCEL = enumC358760E4s3;
        EnumC358760E4s enumC358760E4s4 = new EnumC358760E4s("AUTO_PLAY_SELECT", 3);
        AUTO_PLAY_SELECT = enumC358760E4s4;
        EnumC358760E4s[] enumC358760E4sArr = {enumC358760E4s, enumC358760E4s2, enumC358760E4s3, enumC358760E4s4};
        LL = enumC358760E4sArr;
        LLILLJJLI = new C2254308sP(enumC358760E4sArr);
        Companion = new Object() { // from class: X.0E4r
        };
    }

    public static EnumC358760E4s[] values() {
        return (EnumC358760E4s[]) LL.clone();
    }

    public static EnumC358760E4s valueOf(String str) {
        return (EnumC358760E4s) C08FF.LIZ(EnumC358760E4s.class, str);
    }

    public EnumC358760E4s(String str, int i) {
    }
}
