package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20045413bw {
    public static final EnumC20045413bw CancelTraversal;
    public static final EnumC20045413bw ContinueTraversal;
    public static final /* synthetic */ EnumC20045413bw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20045413bw SkipSubtreeAndContinueTraversal;

    public static InterfaceC2044707zh<EnumC20045413bw> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC20045413bw valueOf(String str) {
        return (EnumC20045413bw) C08FF.LIZ(EnumC20045413bw.class, str);
    }

    public static EnumC20045413bw[] values() {
        return (EnumC20045413bw[]) LL.clone();
    }

    static {
        EnumC20045413bw enumC20045413bw = new EnumC20045413bw("ContinueTraversal", 0);
        ContinueTraversal = enumC20045413bw;
        EnumC20045413bw enumC20045413bw2 = new EnumC20045413bw("SkipSubtreeAndContinueTraversal", 1);
        SkipSubtreeAndContinueTraversal = enumC20045413bw2;
        EnumC20045413bw enumC20045413bw3 = new EnumC20045413bw("CancelTraversal", 2);
        CancelTraversal = enumC20045413bw3;
        EnumC20045413bw[] enumC20045413bwArr = {enumC20045413bw, enumC20045413bw2, enumC20045413bw3};
        LL = enumC20045413bwArr;
        LLILLJJLI = new C2254308sP(enumC20045413bwArr);
    }

    public EnumC20045413bw(String str, int i) {
    }
}
