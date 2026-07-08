package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iOa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1240860iOa {
    public static final C1240880iOc Companion;
    public static final /* synthetic */ EnumC1240860iOa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1240860iOa POST_DELIMITER;
    public static final EnumC1240860iOa PREFIX;
    public static final EnumC1240860iOa SUBSTRING;

    public static InterfaceC2044707zh<EnumC1240860iOa> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0iOc] */
    static {
        EnumC1240860iOa enumC1240860iOa = new EnumC1240860iOa("PREFIX", 0);
        PREFIX = enumC1240860iOa;
        EnumC1240860iOa enumC1240860iOa2 = new EnumC1240860iOa("POST_DELIMITER", 1);
        POST_DELIMITER = enumC1240860iOa2;
        EnumC1240860iOa enumC1240860iOa3 = new EnumC1240860iOa("SUBSTRING", 2);
        SUBSTRING = enumC1240860iOa3;
        EnumC1240860iOa[] enumC1240860iOaArr = {enumC1240860iOa, enumC1240860iOa2, enumC1240860iOa3};
        LL = enumC1240860iOaArr;
        LLILLJJLI = new C2254308sP(enumC1240860iOaArr);
        Companion = new Object() { // from class: X.0iOc
        };
    }

    public static EnumC1240860iOa[] values() {
        return (EnumC1240860iOa[]) LL.clone();
    }

    public static EnumC1240860iOa valueOf(String str) {
        return (EnumC1240860iOa) C08FF.LIZ(EnumC1240860iOa.class, str);
    }

    public EnumC1240860iOa(String str, int i) {
    }
}
