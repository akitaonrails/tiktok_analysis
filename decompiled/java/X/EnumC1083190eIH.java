package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eIH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083190eIH {
    public static final EnumC1083190eIH COHOST;
    public static final /* synthetic */ EnumC1083190eIH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1083190eIH MULTI_GRID;
    public static final EnumC1083190eIH MULTI_PANEL;
    public static final EnumC1083190eIH NORMAL;

    public static InterfaceC2044707zh<EnumC1083190eIH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1083190eIH enumC1083190eIH = new EnumC1083190eIH("NORMAL", 0);
        NORMAL = enumC1083190eIH;
        EnumC1083190eIH enumC1083190eIH2 = new EnumC1083190eIH("MULTI_GRID", 1);
        MULTI_GRID = enumC1083190eIH2;
        EnumC1083190eIH enumC1083190eIH3 = new EnumC1083190eIH("MULTI_PANEL", 2);
        MULTI_PANEL = enumC1083190eIH3;
        EnumC1083190eIH enumC1083190eIH4 = new EnumC1083190eIH("COHOST", 3);
        COHOST = enumC1083190eIH4;
        EnumC1083190eIH[] enumC1083190eIHArr = {enumC1083190eIH, enumC1083190eIH2, enumC1083190eIH3, enumC1083190eIH4};
        LL = enumC1083190eIHArr;
        LLILLJJLI = new C2254308sP(enumC1083190eIHArr);
    }

    public static EnumC1083190eIH[] values() {
        return (EnumC1083190eIH[]) LL.clone();
    }

    public static EnumC1083190eIH valueOf(String str) {
        return (EnumC1083190eIH) C08FF.LIZ(EnumC1083190eIH.class, str);
    }

    public EnumC1083190eIH(String str, int i) {
    }
}
