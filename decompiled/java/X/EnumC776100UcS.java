package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC776100UcS {
    public static final /* synthetic */ EnumC776100UcS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC776100UcS NORMAL;
    public static final EnumC776100UcS PREVIEW_HEADER;
    public static final EnumC776100UcS SWITCH;

    public static InterfaceC2044707zh<EnumC776100UcS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC776100UcS enumC776100UcS = new EnumC776100UcS("NORMAL", 0);
        NORMAL = enumC776100UcS;
        EnumC776100UcS enumC776100UcS2 = new EnumC776100UcS("SWITCH", 1);
        SWITCH = enumC776100UcS2;
        EnumC776100UcS enumC776100UcS3 = new EnumC776100UcS("PREVIEW_HEADER", 2);
        PREVIEW_HEADER = enumC776100UcS3;
        EnumC776100UcS[] enumC776100UcSArr = {enumC776100UcS, enumC776100UcS2, enumC776100UcS3};
        LL = enumC776100UcSArr;
        LLILLJJLI = new C2254308sP(enumC776100UcSArr);
    }

    public static EnumC776100UcS[] values() {
        return (EnumC776100UcS[]) LL.clone();
    }

    public static EnumC776100UcS valueOf(String str) {
        return (EnumC776100UcS) C08FF.LIZ(EnumC776100UcS.class, str);
    }

    public EnumC776100UcS(String str, int i) {
    }
}
