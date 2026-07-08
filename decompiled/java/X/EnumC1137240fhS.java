package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fhS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1137240fhS {
    public static final /* synthetic */ EnumC1137240fhS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1137240fhS LOCAL;
    public static final EnumC1137240fhS REMOTE;

    public static InterfaceC2044707zh<EnumC1137240fhS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1137240fhS enumC1137240fhS = new EnumC1137240fhS("LOCAL", 0);
        LOCAL = enumC1137240fhS;
        EnumC1137240fhS enumC1137240fhS2 = new EnumC1137240fhS("REMOTE", 1);
        REMOTE = enumC1137240fhS2;
        EnumC1137240fhS[] enumC1137240fhSArr = {enumC1137240fhS, enumC1137240fhS2};
        LL = enumC1137240fhSArr;
        LLILLJJLI = new C2254308sP(enumC1137240fhSArr);
    }

    public static EnumC1137240fhS[] values() {
        return (EnumC1137240fhS[]) LL.clone();
    }

    public static EnumC1137240fhS valueOf(String str) {
        return (EnumC1137240fhS) C08FF.LIZ(EnumC1137240fhS.class, str);
    }

    public EnumC1137240fhS(String str, int i) {
    }
}
