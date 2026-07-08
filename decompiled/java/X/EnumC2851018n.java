package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.018n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2851018n {
    public static final EnumC2851018n INROOMRANKING;
    public static final /* synthetic */ EnumC2851018n[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2851018n NORMAL;
    public static final EnumC2851018n NOTGROUPLIVE;
    public static final EnumC2851018n TIMEDCOMPETITION;

    public static InterfaceC2044707zh<EnumC2851018n> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2851018n enumC2851018n = new EnumC2851018n("NOTGROUPLIVE", 0);
        NOTGROUPLIVE = enumC2851018n;
        EnumC2851018n enumC2851018n2 = new EnumC2851018n("NORMAL", 1);
        NORMAL = enumC2851018n2;
        EnumC2851018n enumC2851018n3 = new EnumC2851018n("TIMEDCOMPETITION", 2);
        TIMEDCOMPETITION = enumC2851018n3;
        EnumC2851018n enumC2851018n4 = new EnumC2851018n("INROOMRANKING", 3);
        INROOMRANKING = enumC2851018n4;
        EnumC2851018n[] enumC2851018nArr = {enumC2851018n, enumC2851018n2, enumC2851018n3, enumC2851018n4};
        LL = enumC2851018nArr;
        LLILLJJLI = new C2254308sP(enumC2851018nArr);
    }

    public static EnumC2851018n[] values() {
        return (EnumC2851018n[]) LL.clone();
    }

    public static EnumC2851018n valueOf(String str) {
        return (EnumC2851018n) C08FF.LIZ(EnumC2851018n.class, str);
    }

    public EnumC2851018n(String str, int i) {
    }
}
