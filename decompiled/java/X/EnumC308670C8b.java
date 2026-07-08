package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC308670C8b {
    public static final EnumC308670C8b CASE_C;
    public static final EnumC308670C8b CASE_DEFAULT;
    public static final /* synthetic */ EnumC308670C8b[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC308670C8b> getEntries() {
        return LLILZ;
    }

    static {
        EnumC308670C8b enumC308670C8b = new EnumC308670C8b("CASE_DEFAULT", 0, 0, 2);
        CASE_DEFAULT = enumC308670C8b;
        EnumC308670C8b enumC308670C8b2 = new EnumC308670C8b("CASE_C", 1, 3, ((Number) C0B1Q.LIZ.getValue()).intValue());
        CASE_C = enumC308670C8b2;
        EnumC308670C8b[] enumC308670C8bArr = {enumC308670C8b, enumC308670C8b2};
        LLILLL = enumC308670C8bArr;
        LLILZ = new C2254308sP(enumC308670C8bArr);
    }

    public static EnumC308670C8b[] values() {
        return (EnumC308670C8b[]) LLILLL.clone();
    }

    public final int getLineCount() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC308670C8b valueOf(String str) {
        return (EnumC308670C8b) C08FF.LIZ(EnumC308670C8b.class, str);
    }

    public EnumC308670C8b(String str, int i, int i2, int i3) {
        this.LL = i2;
        this.LLILLJJLI = i3;
    }
}
