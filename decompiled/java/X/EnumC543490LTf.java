package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LTf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC543490LTf {
    public static final EnumC543490LTf COMPLETED;
    public static final EnumC543490LTf DOWNLOADING;
    public static final EnumC543490LTf FAILED;
    public static final EnumC543490LTf IDLE;
    public static final /* synthetic */ EnumC543490LTf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC543490LTf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC543490LTf enumC543490LTf = new EnumC543490LTf("IDLE", 0);
        IDLE = enumC543490LTf;
        EnumC543490LTf enumC543490LTf2 = new EnumC543490LTf("DOWNLOADING", 1);
        DOWNLOADING = enumC543490LTf2;
        EnumC543490LTf enumC543490LTf3 = new EnumC543490LTf("COMPLETED", 2);
        COMPLETED = enumC543490LTf3;
        EnumC543490LTf enumC543490LTf4 = new EnumC543490LTf("FAILED", 3);
        FAILED = enumC543490LTf4;
        EnumC543490LTf[] enumC543490LTfArr = {enumC543490LTf, enumC543490LTf2, enumC543490LTf3, enumC543490LTf4};
        LL = enumC543490LTfArr;
        LLILLJJLI = new C2254308sP(enumC543490LTfArr);
    }

    public static EnumC543490LTf[] values() {
        return (EnumC543490LTf[]) LL.clone();
    }

    public static EnumC543490LTf valueOf(String str) {
        return (EnumC543490LTf) C08FF.LIZ(EnumC543490LTf.class, str);
    }

    public EnumC543490LTf(String str, int i) {
    }
}
