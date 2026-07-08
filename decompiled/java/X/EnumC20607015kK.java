package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15kK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20607015kK {
    public static final EnumC20607015kK End;
    public static final EnumC20607015kK Error;
    public static final /* synthetic */ EnumC20607015kK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20607015kK Loaded;
    public static final EnumC20607015kK Loading;

    public static InterfaceC2044707zh<EnumC20607015kK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20607015kK enumC20607015kK = new EnumC20607015kK("Loading", 0);
        Loading = enumC20607015kK;
        EnumC20607015kK enumC20607015kK2 = new EnumC20607015kK("Loaded", 1);
        Loaded = enumC20607015kK2;
        EnumC20607015kK enumC20607015kK3 = new EnumC20607015kK("Error", 2);
        Error = enumC20607015kK3;
        EnumC20607015kK enumC20607015kK4 = new EnumC20607015kK("End", 3);
        End = enumC20607015kK4;
        EnumC20607015kK[] enumC20607015kKArr = {enumC20607015kK, enumC20607015kK2, enumC20607015kK3, enumC20607015kK4};
        LL = enumC20607015kKArr;
        LLILLJJLI = new C2254308sP(enumC20607015kKArr);
    }

    public static EnumC20607015kK[] values() {
        return (EnumC20607015kK[]) LL.clone();
    }

    public static EnumC20607015kK valueOf(String str) {
        return (EnumC20607015kK) C08FF.LIZ(EnumC20607015kK.class, str);
    }

    public EnumC20607015kK(String str, int i) {
    }
}
