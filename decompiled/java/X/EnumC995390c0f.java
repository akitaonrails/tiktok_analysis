package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995390c0f {
    public static final EnumC995390c0f FAIL;
    public static final /* synthetic */ EnumC995390c0f[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC995390c0f SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC995390c0f> getEntries() {
        return LLILLL;
    }

    static {
        EnumC995390c0f enumC995390c0f = new EnumC995390c0f("SUCCESS", 0, 1);
        SUCCESS = enumC995390c0f;
        EnumC995390c0f enumC995390c0f2 = new EnumC995390c0f("FAIL", 1, 0);
        FAIL = enumC995390c0f2;
        EnumC995390c0f[] enumC995390c0fArr = {enumC995390c0f, enumC995390c0f2};
        LLILLJJLI = enumC995390c0fArr;
        LLILLL = new C2254308sP(enumC995390c0fArr);
    }

    public static EnumC995390c0f[] values() {
        return (EnumC995390c0f[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC995390c0f valueOf(String str) {
        return (EnumC995390c0f) C08FF.LIZ(EnumC995390c0f.class, str);
    }

    public EnumC995390c0f(String str, int i, int i2) {
        this.LL = i2;
    }
}
