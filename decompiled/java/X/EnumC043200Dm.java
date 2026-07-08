package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Dm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC043200Dm {
    public static final EnumC043200Dm CAMPAIGN;
    public static final EnumC043200Dm EDP;
    public static final /* synthetic */ EnumC043200Dm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC043200Dm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC043200Dm enumC043200Dm = new EnumC043200Dm("EDP", 0);
        EDP = enumC043200Dm;
        EnumC043200Dm enumC043200Dm2 = new EnumC043200Dm("CAMPAIGN", 1);
        CAMPAIGN = enumC043200Dm2;
        EnumC043200Dm[] enumC043200DmArr = {enumC043200Dm, enumC043200Dm2};
        LL = enumC043200DmArr;
        LLILLJJLI = new C2254308sP(enumC043200DmArr);
    }

    public static EnumC043200Dm[] values() {
        return (EnumC043200Dm[]) LL.clone();
    }

    public static EnumC043200Dm valueOf(String str) {
        return (EnumC043200Dm) C08FF.LIZ(EnumC043200Dm.class, str);
    }

    public EnumC043200Dm(String str, int i) {
    }
}
