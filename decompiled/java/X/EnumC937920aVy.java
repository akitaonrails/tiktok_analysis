package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC937920aVy {
    public static final EnumC937920aVy ANCHOR;
    public static final EnumC937920aVy AUDIENCE;
    public static final EnumC937920aVy GUEST;
    public static final /* synthetic */ EnumC937920aVy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC937920aVy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC937920aVy enumC937920aVy = new EnumC937920aVy("ANCHOR", 0);
        ANCHOR = enumC937920aVy;
        EnumC937920aVy enumC937920aVy2 = new EnumC937920aVy("GUEST", 1);
        GUEST = enumC937920aVy2;
        EnumC937920aVy enumC937920aVy3 = new EnumC937920aVy("AUDIENCE", 2);
        AUDIENCE = enumC937920aVy3;
        EnumC937920aVy[] enumC937920aVyArr = {enumC937920aVy, enumC937920aVy2, enumC937920aVy3};
        LL = enumC937920aVyArr;
        LLILLJJLI = new C2254308sP(enumC937920aVyArr);
    }

    public static EnumC937920aVy[] values() {
        return (EnumC937920aVy[]) LL.clone();
    }

    public static EnumC937920aVy valueOf(String str) {
        return (EnumC937920aVy) C08FF.LIZ(EnumC937920aVy.class, str);
    }

    public EnumC937920aVy(String str, int i) {
    }
}
