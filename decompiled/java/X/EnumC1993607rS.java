package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1993607rS {
    public static final /* synthetic */ EnumC1993607rS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1993607rS PHOTO;
    public static final EnumC1993607rS VIDEO;

    public static InterfaceC2044707zh<EnumC1993607rS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1993607rS enumC1993607rS = new EnumC1993607rS("PHOTO", 0);
        PHOTO = enumC1993607rS;
        EnumC1993607rS enumC1993607rS2 = new EnumC1993607rS("VIDEO", 1);
        VIDEO = enumC1993607rS2;
        EnumC1993607rS[] enumC1993607rSArr = {enumC1993607rS, enumC1993607rS2};
        LL = enumC1993607rSArr;
        LLILLJJLI = new C2254308sP(enumC1993607rSArr);
    }

    public static EnumC1993607rS[] values() {
        return (EnumC1993607rS[]) LL.clone();
    }

    public static EnumC1993607rS valueOf(String str) {
        return (EnumC1993607rS) C08FF.LIZ(EnumC1993607rS.class, str);
    }

    public EnumC1993607rS(String str, int i) {
    }
}
