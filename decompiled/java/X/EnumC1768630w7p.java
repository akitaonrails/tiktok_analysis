package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@InterfaceC1294060jmO
public final class EnumC1768630w7p {
    public static final EnumC1768630w7p BOTTOM_TAB;
    public static final /* synthetic */ EnumC1768630w7p[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1768630w7p TOP_TAB;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1768630w7p> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1768630w7p enumC1768630w7p = new EnumC1768630w7p("BOTTOM_TAB", 0, 0);
        BOTTOM_TAB = enumC1768630w7p;
        EnumC1768630w7p enumC1768630w7p2 = new EnumC1768630w7p("TOP_TAB", 1, 1);
        TOP_TAB = enumC1768630w7p2;
        EnumC1768630w7p[] enumC1768630w7pArr = {enumC1768630w7p, enumC1768630w7p2};
        LLILLJJLI = enumC1768630w7pArr;
        LLILLL = new C2254308sP(enumC1768630w7pArr);
    }

    public static EnumC1768630w7p[] values() {
        return (EnumC1768630w7p[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1768630w7p valueOf(String str) {
        return (EnumC1768630w7p) C08FF.LIZ(EnumC1768630w7p.class, str);
    }

    public EnumC1768630w7p(String str, int i, int i2) {
        this.LL = i2;
    }
}
