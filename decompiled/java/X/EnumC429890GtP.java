package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GtP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429890GtP {
    public static final EnumC429890GtP END;
    public static final EnumC429890GtP END_EFFECT;
    public static final EnumC429890GtP GIF;
    public static final /* synthetic */ EnumC429890GtP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429890GtP NORMAL;

    public static InterfaceC2044707zh<EnumC429890GtP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429890GtP enumC429890GtP = new EnumC429890GtP("GIF", 0);
        GIF = enumC429890GtP;
        EnumC429890GtP enumC429890GtP2 = new EnumC429890GtP("END", 1);
        END = enumC429890GtP2;
        EnumC429890GtP enumC429890GtP3 = new EnumC429890GtP("NORMAL", 2);
        NORMAL = enumC429890GtP3;
        EnumC429890GtP enumC429890GtP4 = new EnumC429890GtP("END_EFFECT", 3);
        END_EFFECT = enumC429890GtP4;
        EnumC429890GtP[] enumC429890GtPArr = {enumC429890GtP, enumC429890GtP2, enumC429890GtP3, enumC429890GtP4};
        LL = enumC429890GtPArr;
        LLILLJJLI = new C2254308sP(enumC429890GtPArr);
    }

    public static EnumC429890GtP[] values() {
        return (EnumC429890GtP[]) LL.clone();
    }

    public static EnumC429890GtP valueOf(String str) {
        return (EnumC429890GtP) C08FF.LIZ(EnumC429890GtP.class, str);
    }

    public EnumC429890GtP(String str, int i) {
    }
}
