package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gAF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1155090gAF {
    public static final EnumC1155090gAF AFTER_ANIMATE;
    public static final EnumC1155090gAF BEFORE_ANIMATE;
    public static final /* synthetic */ EnumC1155090gAF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1155090gAF RUNNING_ANIMATE;

    public static InterfaceC2044707zh<EnumC1155090gAF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1155090gAF enumC1155090gAF = new EnumC1155090gAF("BEFORE_ANIMATE", 0);
        BEFORE_ANIMATE = enumC1155090gAF;
        EnumC1155090gAF enumC1155090gAF2 = new EnumC1155090gAF("RUNNING_ANIMATE", 1);
        RUNNING_ANIMATE = enumC1155090gAF2;
        EnumC1155090gAF enumC1155090gAF3 = new EnumC1155090gAF("AFTER_ANIMATE", 2);
        AFTER_ANIMATE = enumC1155090gAF3;
        EnumC1155090gAF[] enumC1155090gAFArr = {enumC1155090gAF, enumC1155090gAF2, enumC1155090gAF3};
        LL = enumC1155090gAFArr;
        LLILLJJLI = new C2254308sP(enumC1155090gAFArr);
    }

    public static EnumC1155090gAF[] values() {
        return (EnumC1155090gAF[]) LL.clone();
    }

    public static EnumC1155090gAF valueOf(String str) {
        return (EnumC1155090gAF) C08FF.LIZ(EnumC1155090gAF.class, str);
    }

    public EnumC1155090gAF(String str, int i) {
    }
}
