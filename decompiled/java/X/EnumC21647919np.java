package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21647919np {
    public static final /* synthetic */ EnumC21647919np[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21647919np PHASE_1;
    public static final EnumC21647919np PHASE_2;

    public static InterfaceC2044707zh<EnumC21647919np> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21647919np enumC21647919np = new EnumC21647919np("PHASE_1", 0);
        PHASE_1 = enumC21647919np;
        EnumC21647919np enumC21647919np2 = new EnumC21647919np("PHASE_2", 1);
        PHASE_2 = enumC21647919np2;
        EnumC21647919np[] enumC21647919npArr = {enumC21647919np, enumC21647919np2};
        LL = enumC21647919npArr;
        LLILLJJLI = new C2254308sP(enumC21647919npArr);
    }

    public static EnumC21647919np[] values() {
        return (EnumC21647919np[]) LL.clone();
    }

    public static EnumC21647919np valueOf(String str) {
        return (EnumC21647919np) C08FF.LIZ(EnumC21647919np.class, str);
    }

    public EnumC21647919np(String str, int i) {
    }
}
