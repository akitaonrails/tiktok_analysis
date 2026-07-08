package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1191410h6p {
    public static final EnumC1191410h6p DISLIKED;
    public static final EnumC1191410h6p LIKED;
    public static final /* synthetic */ EnumC1191410h6p[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1191410h6p NEUTRAL;

    public static InterfaceC2044707zh<EnumC1191410h6p> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1191410h6p enumC1191410h6p = new EnumC1191410h6p("LIKED", 0);
        LIKED = enumC1191410h6p;
        EnumC1191410h6p enumC1191410h6p2 = new EnumC1191410h6p("DISLIKED", 1);
        DISLIKED = enumC1191410h6p2;
        EnumC1191410h6p enumC1191410h6p3 = new EnumC1191410h6p("NEUTRAL", 2);
        NEUTRAL = enumC1191410h6p3;
        EnumC1191410h6p[] enumC1191410h6pArr = {enumC1191410h6p, enumC1191410h6p2, enumC1191410h6p3};
        LL = enumC1191410h6pArr;
        LLILLJJLI = new C2254308sP(enumC1191410h6pArr);
    }

    public static EnumC1191410h6p[] values() {
        return (EnumC1191410h6p[]) LL.clone();
    }

    public static EnumC1191410h6p valueOf(String str) {
        return (EnumC1191410h6p) C08FF.LIZ(EnumC1191410h6p.class, str);
    }

    public EnumC1191410h6p(String str, int i) {
    }
}
