package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ztW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1913520ztW {
    public static final EnumC1913520ztW CLEAN;
    public static final EnumC1913520ztW GAME_PARTNERSHIP;
    public static final /* synthetic */ EnumC1913520ztW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1913520ztW NORMAL;
    public static final EnumC1913520ztW SEARCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1913520ztW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1913520ztW enumC1913520ztW = new EnumC1913520ztW("NORMAL", 0, "normal");
        NORMAL = enumC1913520ztW;
        EnumC1913520ztW enumC1913520ztW2 = new EnumC1913520ztW("SEARCH", 1, "search");
        SEARCH = enumC1913520ztW2;
        EnumC1913520ztW enumC1913520ztW3 = new EnumC1913520ztW("GAME_PARTNERSHIP", 2, "game_partnership");
        GAME_PARTNERSHIP = enumC1913520ztW3;
        EnumC1913520ztW enumC1913520ztW4 = new EnumC1913520ztW("CLEAN", 3, "clean");
        CLEAN = enumC1913520ztW4;
        EnumC1913520ztW[] enumC1913520ztWArr = {enumC1913520ztW, enumC1913520ztW2, enumC1913520ztW3, enumC1913520ztW4};
        LLILLJJLI = enumC1913520ztWArr;
        LLILLL = new C2254308sP(enumC1913520ztWArr);
    }

    public static EnumC1913520ztW[] values() {
        return (EnumC1913520ztW[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC1913520ztW valueOf(String str) {
        return (EnumC1913520ztW) C08FF.LIZ(EnumC1913520ztW.class, str);
    }

    public EnumC1913520ztW(String str, int i, String str2) {
        this.LL = str2;
    }
}
