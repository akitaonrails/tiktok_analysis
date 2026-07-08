package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uZS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1708880uZS {
    public static final EnumC1708880uZS LEGACY;
    public static final /* synthetic */ EnumC1708880uZS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1708880uZS UNIFIED_V3;

    public static InterfaceC2044707zh<EnumC1708880uZS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1708880uZS enumC1708880uZS = new EnumC1708880uZS("LEGACY", 0);
        LEGACY = enumC1708880uZS;
        EnumC1708880uZS enumC1708880uZS2 = new EnumC1708880uZS("UNIFIED_V3", 1);
        UNIFIED_V3 = enumC1708880uZS2;
        EnumC1708880uZS[] enumC1708880uZSArr = {enumC1708880uZS, enumC1708880uZS2};
        LL = enumC1708880uZSArr;
        LLILLJJLI = new C2254308sP(enumC1708880uZSArr);
    }

    public static EnumC1708880uZS[] values() {
        return (EnumC1708880uZS[]) LL.clone();
    }

    public static EnumC1708880uZS valueOf(String str) {
        return (EnumC1708880uZS) C08FF.LIZ(EnumC1708880uZS.class, str);
    }

    public EnumC1708880uZS(String str, int i) {
    }
}
