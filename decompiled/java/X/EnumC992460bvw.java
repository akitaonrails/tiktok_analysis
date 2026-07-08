package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992460bvw {
    public static final EnumC992460bvw LL;
    public static final EnumC992460bvw LLILLJJLI;
    public static final EnumC992460bvw LLILLL;
    public static final EnumC992460bvw LLILZ;
    public static final /* synthetic */ EnumC992460bvw[] LLILZIL;

    static {
        EnumC992460bvw enumC992460bvw = new EnumC992460bvw("RECORD_ERROR", 0);
        LL = enumC992460bvw;
        EnumC992460bvw enumC992460bvw2 = new EnumC992460bvw("ASR_SUCCESS", 1);
        LLILLJJLI = enumC992460bvw2;
        EnumC992460bvw enumC992460bvw3 = new EnumC992460bvw("ASR_NO_VOICE", 2);
        LLILLL = enumC992460bvw3;
        EnumC992460bvw enumC992460bvw4 = new EnumC992460bvw("ASR_ERROR", 3);
        LLILZ = enumC992460bvw4;
        EnumC992460bvw[] enumC992460bvwArr = {enumC992460bvw, enumC992460bvw2, enumC992460bvw3, enumC992460bvw4};
        LLILZIL = enumC992460bvwArr;
        new C2254308sP(enumC992460bvwArr);
    }

    public static EnumC992460bvw[] values() {
        return (EnumC992460bvw[]) LLILZIL.clone();
    }

    public static EnumC992460bvw valueOf(String str) {
        return (EnumC992460bvw) C08FF.LIZ(EnumC992460bvw.class, str);
    }

    public EnumC992460bvw(String str, int i) {
    }
}
