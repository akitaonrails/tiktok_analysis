package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0utO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1721240utO {
    public static final EnumC1721240utO FINISH;
    public static final /* synthetic */ EnumC1721240utO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1721240utO ZERO;

    public static InterfaceC2044707zh<EnumC1721240utO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1721240utO enumC1721240utO = new EnumC1721240utO("ZERO", 0);
        ZERO = enumC1721240utO;
        EnumC1721240utO enumC1721240utO2 = new EnumC1721240utO("FINISH", 1);
        FINISH = enumC1721240utO2;
        EnumC1721240utO[] enumC1721240utOArr = {enumC1721240utO, enumC1721240utO2};
        LL = enumC1721240utOArr;
        LLILLJJLI = new C2254308sP(enumC1721240utOArr);
    }

    public static EnumC1721240utO[] values() {
        return (EnumC1721240utO[]) LL.clone();
    }

    public static EnumC1721240utO valueOf(String str) {
        return (EnumC1721240utO) C08FF.LIZ(EnumC1721240utO.class, str);
    }

    public EnumC1721240utO(String str, int i) {
    }
}
