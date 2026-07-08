package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VjB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC805750VjB {
    public static final EnumC805750VjB FOLLOW;
    public static final EnumC805750VjB INBOX;
    public static final /* synthetic */ EnumC805750VjB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC805750VjB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC805750VjB enumC805750VjB = new EnumC805750VjB("FOLLOW", 0);
        FOLLOW = enumC805750VjB;
        EnumC805750VjB enumC805750VjB2 = new EnumC805750VjB("INBOX", 1);
        INBOX = enumC805750VjB2;
        EnumC805750VjB[] enumC805750VjBArr = {enumC805750VjB, enumC805750VjB2};
        LL = enumC805750VjBArr;
        LLILLJJLI = new C2254308sP(enumC805750VjBArr);
    }

    public static EnumC805750VjB[] values() {
        return (EnumC805750VjB[]) LL.clone();
    }

    public static EnumC805750VjB valueOf(String str) {
        return (EnumC805750VjB) C08FF.LIZ(EnumC805750VjB.class, str);
    }

    public EnumC805750VjB(String str, int i) {
    }
}
