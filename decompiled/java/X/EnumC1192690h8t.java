package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1192690h8t {
    public static final EnumC1192690h8t DIALOG;
    public static final /* synthetic */ EnumC1192690h8t[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1192690h8t TOAST;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1192690h8t> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1192690h8t enumC1192690h8t = new EnumC1192690h8t("TOAST", 0, 0);
        TOAST = enumC1192690h8t;
        EnumC1192690h8t enumC1192690h8t2 = new EnumC1192690h8t("DIALOG", 1, 1);
        DIALOG = enumC1192690h8t2;
        EnumC1192690h8t[] enumC1192690h8tArr = {enumC1192690h8t, enumC1192690h8t2};
        LLILLJJLI = enumC1192690h8tArr;
        LLILLL = new C2254308sP(enumC1192690h8tArr);
    }

    public static EnumC1192690h8t[] values() {
        return (EnumC1192690h8t[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1192690h8t valueOf(String str) {
        return (EnumC1192690h8t) C08FF.LIZ(EnumC1192690h8t.class, str);
    }

    public EnumC1192690h8t(String str, int i, int i2) {
        this.LL = i2;
    }
}
