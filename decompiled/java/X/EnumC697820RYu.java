package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC697820RYu {
    public static final EnumC697820RYu APPEND;
    public static final /* synthetic */ EnumC697820RYu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC697820RYu OVERRIDE;
    public static final EnumC697820RYu PUTIFABSENT;

    public static InterfaceC2044707zh<EnumC697820RYu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC697820RYu enumC697820RYu = new EnumC697820RYu("OVERRIDE", 0);
        OVERRIDE = enumC697820RYu;
        EnumC697820RYu enumC697820RYu2 = new EnumC697820RYu("APPEND", 1);
        APPEND = enumC697820RYu2;
        EnumC697820RYu enumC697820RYu3 = new EnumC697820RYu("PUTIFABSENT", 2);
        PUTIFABSENT = enumC697820RYu3;
        EnumC697820RYu[] enumC697820RYuArr = {enumC697820RYu, enumC697820RYu2, enumC697820RYu3};
        LL = enumC697820RYuArr;
        LLILLJJLI = new C2254308sP(enumC697820RYuArr);
    }

    public static EnumC697820RYu[] values() {
        return (EnumC697820RYu[]) LL.clone();
    }

    public static EnumC697820RYu valueOf(String str) {
        return (EnumC697820RYu) C08FF.LIZ(EnumC697820RYu.class, str);
    }

    public EnumC697820RYu(String str, int i) {
    }
}
