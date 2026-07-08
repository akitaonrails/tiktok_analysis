package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.098d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC23225098d {
    public static final EnumC23225098d ATTR_MISSING;
    public static final EnumC23225098d DECODE_FAIL;
    public static final EnumC23225098d HAS_FACE;
    public static final /* synthetic */ EnumC23225098d[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC23225098d NO_FACE;
    public static final EnumC23225098d SCAN_ERROR;

    public static InterfaceC2044707zh<EnumC23225098d> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC23225098d enumC23225098d = new EnumC23225098d("HAS_FACE", 0);
        HAS_FACE = enumC23225098d;
        EnumC23225098d enumC23225098d2 = new EnumC23225098d("NO_FACE", 1);
        NO_FACE = enumC23225098d2;
        EnumC23225098d enumC23225098d3 = new EnumC23225098d("ATTR_MISSING", 2);
        ATTR_MISSING = enumC23225098d3;
        EnumC23225098d enumC23225098d4 = new EnumC23225098d("SCAN_ERROR", 3);
        SCAN_ERROR = enumC23225098d4;
        EnumC23225098d enumC23225098d5 = new EnumC23225098d("DECODE_FAIL", 4);
        DECODE_FAIL = enumC23225098d5;
        EnumC23225098d[] enumC23225098dArr = {enumC23225098d, enumC23225098d2, enumC23225098d3, enumC23225098d4, enumC23225098d5};
        LL = enumC23225098dArr;
        LLILLJJLI = new C2254308sP(enumC23225098dArr);
    }

    public static EnumC23225098d[] values() {
        return (EnumC23225098d[]) LL.clone();
    }

    public static EnumC23225098d valueOf(String str) {
        return (EnumC23225098d) C08FF.LIZ(EnumC23225098d.class, str);
    }

    public EnumC23225098d(String str, int i) {
    }
}
