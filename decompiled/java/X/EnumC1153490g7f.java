package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153490g7f {
    public static final /* synthetic */ EnumC1153490g7f[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1153490g7f STYLE_V1;
    public final String LL = "v1";

    public static InterfaceC2044707zh<EnumC1153490g7f> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1153490g7f enumC1153490g7f = new EnumC1153490g7f();
        STYLE_V1 = enumC1153490g7f;
        EnumC1153490g7f[] enumC1153490g7fArr = {enumC1153490g7f};
        LLILLJJLI = enumC1153490g7fArr;
        LLILLL = new C2254308sP(enumC1153490g7fArr);
    }

    public static EnumC1153490g7f[] values() {
        return (EnumC1153490g7f[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1153490g7f valueOf(String str) {
        return (EnumC1153490g7f) C08FF.LIZ(EnumC1153490g7f.class, str);
    }
}
