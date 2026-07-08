package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC663360Q0g {
    public static final EnumC663360Q0g DEPRECATED;
    public static final EnumC663360Q0g EXPERIMENTAL;
    public static final /* synthetic */ EnumC663360Q0g[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC663360Q0g STABLE;

    public static InterfaceC2044707zh<EnumC663360Q0g> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC663360Q0g enumC663360Q0g = new EnumC663360Q0g("EXPERIMENTAL", 0);
        EXPERIMENTAL = enumC663360Q0g;
        EnumC663360Q0g enumC663360Q0g2 = new EnumC663360Q0g("DEPRECATED", 1);
        DEPRECATED = enumC663360Q0g2;
        EnumC663360Q0g enumC663360Q0g3 = new EnumC663360Q0g("STABLE", 2);
        STABLE = enumC663360Q0g3;
        EnumC663360Q0g[] enumC663360Q0gArr = {enumC663360Q0g, enumC663360Q0g2, enumC663360Q0g3};
        LL = enumC663360Q0gArr;
        LLILLJJLI = new C2254308sP(enumC663360Q0gArr);
    }

    public static EnumC663360Q0g[] values() {
        return (EnumC663360Q0g[]) LL.clone();
    }

    public static EnumC663360Q0g valueOf(String str) {
        return (EnumC663360Q0g) C08FF.LIZ(EnumC663360Q0g.class, str);
    }

    public EnumC663360Q0g(String str, int i) {
    }
}
