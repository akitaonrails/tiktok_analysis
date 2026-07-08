package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC357140DzM {
    public static final /* synthetic */ EnumC357140DzM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC357140DzM REDO;
    public static final EnumC357140DzM UNDO;

    public static InterfaceC2044707zh<EnumC357140DzM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC357140DzM enumC357140DzM = new EnumC357140DzM("UNDO", 0);
        UNDO = enumC357140DzM;
        EnumC357140DzM enumC357140DzM2 = new EnumC357140DzM("REDO", 1);
        REDO = enumC357140DzM2;
        EnumC357140DzM[] enumC357140DzMArr = {enumC357140DzM, enumC357140DzM2};
        LL = enumC357140DzMArr;
        LLILLJJLI = new C2254308sP(enumC357140DzMArr);
    }

    public static EnumC357140DzM[] values() {
        return (EnumC357140DzM[]) LL.clone();
    }

    public static EnumC357140DzM valueOf(String str) {
        return (EnumC357140DzM) C08FF.LIZ(EnumC357140DzM.class, str);
    }

    public EnumC357140DzM(String str, int i) {
    }
}
