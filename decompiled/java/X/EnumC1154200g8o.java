package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154200g8o {
    public static final /* synthetic */ EnumC1154200g8o[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1154200g8o Max999Plus;
    public static final EnumC1154200g8o Max99Plus;
    public static final EnumC1154200g8o Max9Plus;
    public static final EnumC1154200g8o Unlimited;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1154200g8o> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1154200g8o enumC1154200g8o = new EnumC1154200g8o("Unlimited", 0, Integer.MAX_VALUE);
        Unlimited = enumC1154200g8o;
        EnumC1154200g8o enumC1154200g8o2 = new EnumC1154200g8o("Max9Plus", 1, 9);
        Max9Plus = enumC1154200g8o2;
        EnumC1154200g8o enumC1154200g8o3 = new EnumC1154200g8o("Max99Plus", 2, 99);
        Max99Plus = enumC1154200g8o3;
        EnumC1154200g8o enumC1154200g8o4 = new EnumC1154200g8o("Max999Plus", 3, 999);
        Max999Plus = enumC1154200g8o4;
        EnumC1154200g8o[] enumC1154200g8oArr = {enumC1154200g8o, enumC1154200g8o2, enumC1154200g8o3, enumC1154200g8o4};
        LLILLJJLI = enumC1154200g8oArr;
        LLILLL = new C2254308sP(enumC1154200g8oArr);
    }

    public static EnumC1154200g8o[] values() {
        return (EnumC1154200g8o[]) LLILLJJLI.clone();
    }

    public final int getMaxCount() {
        return this.LL;
    }

    public static EnumC1154200g8o valueOf(String str) {
        return (EnumC1154200g8o) C08FF.LIZ(EnumC1154200g8o.class, str);
    }

    public EnumC1154200g8o(String str, int i, int i2) {
        this.LL = i2;
    }
}
