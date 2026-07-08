package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1771610wCd {
    public static final EnumC1771610wCd COMPLETE;
    public static final EnumC1771610wCd FAIL;
    public static final EnumC1771610wCd FIRST_CHUNK;
    public static final /* synthetic */ EnumC1771610wCd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1771610wCd SECOND_CHUNK;

    public static InterfaceC2044707zh<EnumC1771610wCd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1771610wCd enumC1771610wCd = new EnumC1771610wCd("FIRST_CHUNK", 0);
        FIRST_CHUNK = enumC1771610wCd;
        EnumC1771610wCd enumC1771610wCd2 = new EnumC1771610wCd("SECOND_CHUNK", 1);
        SECOND_CHUNK = enumC1771610wCd2;
        EnumC1771610wCd enumC1771610wCd3 = new EnumC1771610wCd("COMPLETE", 2);
        COMPLETE = enumC1771610wCd3;
        EnumC1771610wCd enumC1771610wCd4 = new EnumC1771610wCd("FAIL", 3);
        FAIL = enumC1771610wCd4;
        EnumC1771610wCd[] enumC1771610wCdArr = {enumC1771610wCd, enumC1771610wCd2, enumC1771610wCd3, enumC1771610wCd4};
        LL = enumC1771610wCdArr;
        LLILLJJLI = new C2254308sP(enumC1771610wCdArr);
    }

    public static EnumC1771610wCd[] values() {
        return (EnumC1771610wCd[]) LL.clone();
    }

    public static EnumC1771610wCd valueOf(String str) {
        return (EnumC1771610wCd) C08FF.LIZ(EnumC1771610wCd.class, str);
    }

    public EnumC1771610wCd(String str, int i) {
    }
}
