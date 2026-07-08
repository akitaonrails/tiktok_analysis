package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11wS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19663011wS {
    public static final EnumC19663011wS ANCHOR;
    public static final EnumC19663011wS AUDIENCE;
    public static final /* synthetic */ EnumC19663011wS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19663011wS PREVIEW;

    public static InterfaceC2044707zh<EnumC19663011wS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19663011wS enumC19663011wS = new EnumC19663011wS("PREVIEW", 0);
        PREVIEW = enumC19663011wS;
        EnumC19663011wS enumC19663011wS2 = new EnumC19663011wS("ANCHOR", 1);
        ANCHOR = enumC19663011wS2;
        EnumC19663011wS enumC19663011wS3 = new EnumC19663011wS("AUDIENCE", 2);
        AUDIENCE = enumC19663011wS3;
        EnumC19663011wS[] enumC19663011wSArr = {enumC19663011wS, enumC19663011wS2, enumC19663011wS3};
        LL = enumC19663011wSArr;
        LLILLJJLI = new C2254308sP(enumC19663011wSArr);
    }

    public static EnumC19663011wS[] values() {
        return (EnumC19663011wS[]) LL.clone();
    }

    public static EnumC19663011wS valueOf(String str) {
        return (EnumC19663011wS) C08FF.LIZ(EnumC19663011wS.class, str);
    }

    public EnumC19663011wS(String str, int i) {
    }
}
