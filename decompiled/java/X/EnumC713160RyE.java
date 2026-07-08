package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC713160RyE {
    public static final EnumC713160RyE DETAIL;
    public static final EnumC713160RyE FEED;
    public static final EnumC713160RyE IMMERSIVE;
    public static final /* synthetic */ EnumC713160RyE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC713160RyE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC713160RyE enumC713160RyE = new EnumC713160RyE("FEED", 0);
        FEED = enumC713160RyE;
        EnumC713160RyE enumC713160RyE2 = new EnumC713160RyE("DETAIL", 1);
        DETAIL = enumC713160RyE2;
        EnumC713160RyE enumC713160RyE3 = new EnumC713160RyE("IMMERSIVE", 2);
        IMMERSIVE = enumC713160RyE3;
        EnumC713160RyE[] enumC713160RyEArr = {enumC713160RyE, enumC713160RyE2, enumC713160RyE3};
        LL = enumC713160RyEArr;
        LLILLJJLI = new C2254308sP(enumC713160RyEArr);
    }

    public static EnumC713160RyE[] values() {
        return (EnumC713160RyE[]) LL.clone();
    }

    public static EnumC713160RyE valueOf(String str) {
        return (EnumC713160RyE) C08FF.LIZ(EnumC713160RyE.class, str);
    }

    public EnumC713160RyE(String str, int i) {
    }
}
