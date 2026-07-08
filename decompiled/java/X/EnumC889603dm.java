package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03dm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC889603dm {
    public static final EnumC889603dm CC;
    public static final EnumC889603dm DC;
    public static final /* synthetic */ EnumC889603dm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC889603dm PREPAID;
    public static final EnumC889603dm UNKONWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC889603dm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC889603dm enumC889603dm = new EnumC889603dm("UNKONWN", 0, 0);
        UNKONWN = enumC889603dm;
        EnumC889603dm enumC889603dm2 = new EnumC889603dm("DC", 1, 1);
        DC = enumC889603dm2;
        EnumC889603dm enumC889603dm3 = new EnumC889603dm("CC", 2, 2);
        CC = enumC889603dm3;
        EnumC889603dm enumC889603dm4 = new EnumC889603dm("PREPAID", 3, 3);
        PREPAID = enumC889603dm4;
        EnumC889603dm[] enumC889603dmArr = {enumC889603dm, enumC889603dm2, enumC889603dm3, enumC889603dm4};
        LLILLJJLI = enumC889603dmArr;
        LLILLL = new C2254308sP(enumC889603dmArr);
    }

    public static EnumC889603dm[] values() {
        return (EnumC889603dm[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC889603dm valueOf(String str) {
        return (EnumC889603dm) C08FF.LIZ(EnumC889603dm.class, str);
    }

    public EnumC889603dm(String str, int i, int i2) {
        this.LL = i2;
    }
}
