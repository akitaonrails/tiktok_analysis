package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC714970S2t {
    public static final EnumC714970S2t HIDE;
    public static final /* synthetic */ EnumC714970S2t[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC714970S2t NONE;
    public static final EnumC714970S2t REPLACE;
    public static final EnumC714970S2t SHOW;

    public static InterfaceC2044707zh<EnumC714970S2t> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC714970S2t enumC714970S2t = new EnumC714970S2t("NONE", 0);
        NONE = enumC714970S2t;
        EnumC714970S2t enumC714970S2t2 = new EnumC714970S2t("HIDE", 1);
        HIDE = enumC714970S2t2;
        EnumC714970S2t enumC714970S2t3 = new EnumC714970S2t("SHOW", 2);
        SHOW = enumC714970S2t3;
        EnumC714970S2t enumC714970S2t4 = new EnumC714970S2t("REPLACE", 3);
        REPLACE = enumC714970S2t4;
        EnumC714970S2t[] enumC714970S2tArr = {enumC714970S2t, enumC714970S2t2, enumC714970S2t3, enumC714970S2t4};
        LL = enumC714970S2tArr;
        LLILLJJLI = new C2254308sP(enumC714970S2tArr);
    }

    public static EnumC714970S2t[] values() {
        return (EnumC714970S2t[]) LL.clone();
    }

    public static EnumC714970S2t valueOf(String str) {
        return (EnumC714970S2t) C08FF.LIZ(EnumC714970S2t.class, str);
    }

    public EnumC714970S2t(String str, int i) {
    }
}
