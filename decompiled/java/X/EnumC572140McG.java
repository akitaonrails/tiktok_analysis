package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0McG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC572140McG {
    public static final EnumC572140McG HASHTAG;
    public static final /* synthetic */ EnumC572140McG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC572140McG TEXT;
    public static final EnumC572140McG TEXT_AND_HASHTAG;

    public static InterfaceC2044707zh<EnumC572140McG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC572140McG enumC572140McG = new EnumC572140McG("TEXT", 0);
        TEXT = enumC572140McG;
        EnumC572140McG enumC572140McG2 = new EnumC572140McG("HASHTAG", 1);
        HASHTAG = enumC572140McG2;
        EnumC572140McG enumC572140McG3 = new EnumC572140McG("TEXT_AND_HASHTAG", 2);
        TEXT_AND_HASHTAG = enumC572140McG3;
        EnumC572140McG[] enumC572140McGArr = {enumC572140McG, enumC572140McG2, enumC572140McG3};
        LL = enumC572140McGArr;
        LLILLJJLI = new C2254308sP(enumC572140McGArr);
    }

    public static EnumC572140McG[] values() {
        return (EnumC572140McG[]) LL.clone();
    }

    public static EnumC572140McG valueOf(String str) {
        return (EnumC572140McG) C08FF.LIZ(EnumC572140McG.class, str);
    }

    public EnumC572140McG(String str, int i) {
    }
}
