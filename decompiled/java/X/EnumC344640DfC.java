package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC344640DfC {
    public static final /* synthetic */ EnumC344640DfC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC344640DfC SCALE_ALPHA;
    public static final EnumC344640DfC SLIDE;

    public static InterfaceC2044707zh<EnumC344640DfC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC344640DfC enumC344640DfC = new EnumC344640DfC("SLIDE", 0);
        SLIDE = enumC344640DfC;
        EnumC344640DfC enumC344640DfC2 = new EnumC344640DfC("SCALE_ALPHA", 1);
        SCALE_ALPHA = enumC344640DfC2;
        EnumC344640DfC[] enumC344640DfCArr = {enumC344640DfC, enumC344640DfC2};
        LL = enumC344640DfCArr;
        LLILLJJLI = new C2254308sP(enumC344640DfCArr);
    }

    public static EnumC344640DfC[] values() {
        return (EnumC344640DfC[]) LL.clone();
    }

    public static EnumC344640DfC valueOf(String str) {
        return (EnumC344640DfC) C08FF.LIZ(EnumC344640DfC.class, str);
    }

    public EnumC344640DfC(String str, int i) {
    }
}
