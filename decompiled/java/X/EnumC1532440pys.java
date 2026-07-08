package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1532440pys {
    public static final EnumC1532440pys INTERCEPT;
    public static final EnumC1532440pys LIMITED;
    public static final /* synthetic */ EnumC1532440pys[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1532440pys NORMAL;
    public static final EnumC1532440pys PREEMPTED;

    public static InterfaceC2044707zh<EnumC1532440pys> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1532440pys enumC1532440pys = new EnumC1532440pys("INTERCEPT", 0);
        INTERCEPT = enumC1532440pys;
        EnumC1532440pys enumC1532440pys2 = new EnumC1532440pys("LIMITED", 1);
        LIMITED = enumC1532440pys2;
        EnumC1532440pys enumC1532440pys3 = new EnumC1532440pys("NORMAL", 2);
        NORMAL = enumC1532440pys3;
        EnumC1532440pys enumC1532440pys4 = new EnumC1532440pys("PREEMPTED", 3);
        PREEMPTED = enumC1532440pys4;
        EnumC1532440pys[] enumC1532440pysArr = {enumC1532440pys, enumC1532440pys2, enumC1532440pys3, enumC1532440pys4};
        LL = enumC1532440pysArr;
        LLILLJJLI = new C2254308sP(enumC1532440pysArr);
    }

    public static EnumC1532440pys[] values() {
        return (EnumC1532440pys[]) LL.clone();
    }

    public static EnumC1532440pys valueOf(String str) {
        return (EnumC1532440pys) C08FF.LIZ(EnumC1532440pys.class, str);
    }

    public EnumC1532440pys(String str, int i) {
    }
}
