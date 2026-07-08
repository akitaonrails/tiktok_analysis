package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10oS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19358610oS {
    public static final /* synthetic */ EnumC19358610oS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19358610oS READ;
    public static final EnumC19358610oS WRITE;

    public static InterfaceC2044707zh<EnumC19358610oS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19358610oS enumC19358610oS = new EnumC19358610oS("WRITE", 0);
        WRITE = enumC19358610oS;
        EnumC19358610oS enumC19358610oS2 = new EnumC19358610oS("READ", 1);
        READ = enumC19358610oS2;
        EnumC19358610oS[] enumC19358610oSArr = {enumC19358610oS, enumC19358610oS2};
        LL = enumC19358610oSArr;
        LLILLJJLI = new C2254308sP(enumC19358610oSArr);
    }

    public static EnumC19358610oS[] values() {
        return (EnumC19358610oS[]) LL.clone();
    }

    public static EnumC19358610oS valueOf(String str) {
        return (EnumC19358610oS) C08FF.LIZ(EnumC19358610oS.class, str);
    }

    public EnumC19358610oS(String str, int i) {
    }
}
