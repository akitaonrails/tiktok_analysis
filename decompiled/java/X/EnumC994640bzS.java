package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994640bzS {
    public static final EnumC994640bzS EXPRESS;
    public static final /* synthetic */ EnumC994640bzS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994640bzS NORMAL;

    public static InterfaceC2044707zh<EnumC994640bzS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994640bzS enumC994640bzS = new EnumC994640bzS("NORMAL", 0);
        NORMAL = enumC994640bzS;
        EnumC994640bzS enumC994640bzS2 = new EnumC994640bzS("EXPRESS", 1);
        EXPRESS = enumC994640bzS2;
        EnumC994640bzS[] enumC994640bzSArr = {enumC994640bzS, enumC994640bzS2};
        LL = enumC994640bzSArr;
        LLILLJJLI = new C2254308sP(enumC994640bzSArr);
    }

    public static EnumC994640bzS[] values() {
        return (EnumC994640bzS[]) LL.clone();
    }

    public static EnumC994640bzS valueOf(String str) {
        return (EnumC994640bzS) C08FF.LIZ(EnumC994640bzS.class, str);
    }

    public EnumC994640bzS(String str, int i) {
    }
}
