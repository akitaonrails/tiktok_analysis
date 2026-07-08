package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fcj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1134310fcj {
    public static final EnumC1134310fcj ALL_COMPLETED;
    public static final EnumC1134310fcj ANY;
    public static final EnumC1134310fcj CLAIM;
    public static final EnumC1134310fcj IN_PROGRESS;
    public static final /* synthetic */ EnumC1134310fcj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1134310fcj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1134310fcj enumC1134310fcj = new EnumC1134310fcj("ANY", 0);
        ANY = enumC1134310fcj;
        EnumC1134310fcj enumC1134310fcj2 = new EnumC1134310fcj("IN_PROGRESS", 1);
        IN_PROGRESS = enumC1134310fcj2;
        EnumC1134310fcj enumC1134310fcj3 = new EnumC1134310fcj("CLAIM", 2);
        CLAIM = enumC1134310fcj3;
        EnumC1134310fcj enumC1134310fcj4 = new EnumC1134310fcj("ALL_COMPLETED", 3);
        ALL_COMPLETED = enumC1134310fcj4;
        EnumC1134310fcj[] enumC1134310fcjArr = {enumC1134310fcj, enumC1134310fcj2, enumC1134310fcj3, enumC1134310fcj4};
        LL = enumC1134310fcjArr;
        LLILLJJLI = new C2254308sP(enumC1134310fcjArr);
    }

    public static EnumC1134310fcj[] values() {
        return (EnumC1134310fcj[]) LL.clone();
    }

    public static EnumC1134310fcj valueOf(String str) {
        return (EnumC1134310fcj) C08FF.LIZ(EnumC1134310fcj.class, str);
    }

    public EnumC1134310fcj(String str, int i) {
    }
}
