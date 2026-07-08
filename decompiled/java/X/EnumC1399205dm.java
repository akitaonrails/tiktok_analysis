package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05dm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1399205dm {
    public static final EnumC1399205dm FULL_DATA;
    public static final /* synthetic */ EnumC1399205dm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1399205dm NONE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1399205dm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1399205dm enumC1399205dm = new EnumC1399205dm("NONE", 0, 0);
        NONE = enumC1399205dm;
        EnumC1399205dm enumC1399205dm2 = new EnumC1399205dm("FULL_DATA", 1, 1);
        FULL_DATA = enumC1399205dm2;
        EnumC1399205dm[] enumC1399205dmArr = {enumC1399205dm, enumC1399205dm2};
        LLILLJJLI = enumC1399205dmArr;
        LLILLL = new C2254308sP(enumC1399205dmArr);
    }

    public static EnumC1399205dm[] values() {
        return (EnumC1399205dm[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1399205dm valueOf(String str) {
        return (EnumC1399205dm) C08FF.LIZ(EnumC1399205dm.class, str);
    }

    public EnumC1399205dm(String str, int i, int i2) {
        this.LL = i2;
    }
}
