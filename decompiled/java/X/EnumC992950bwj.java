package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992950bwj {
    public static final EnumC992950bwj ACTION_BAR;
    public static final EnumC992950bwj CHANNEL_BAR;
    public static final EnumC992950bwj CONCAT;
    public static final EnumC992950bwj IM_HEADER;
    public static final /* synthetic */ EnumC992950bwj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC992950bwj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992950bwj enumC992950bwj = new EnumC992950bwj("IM_HEADER", 0);
        IM_HEADER = enumC992950bwj;
        EnumC992950bwj enumC992950bwj2 = new EnumC992950bwj("CHANNEL_BAR", 1);
        CHANNEL_BAR = enumC992950bwj2;
        EnumC992950bwj enumC992950bwj3 = new EnumC992950bwj("ACTION_BAR", 2);
        ACTION_BAR = enumC992950bwj3;
        EnumC992950bwj enumC992950bwj4 = new EnumC992950bwj("CONCAT", 3);
        CONCAT = enumC992950bwj4;
        EnumC992950bwj[] enumC992950bwjArr = {enumC992950bwj, enumC992950bwj2, enumC992950bwj3, enumC992950bwj4};
        LL = enumC992950bwjArr;
        LLILLJJLI = new C2254308sP(enumC992950bwjArr);
    }

    public static EnumC992950bwj[] values() {
        return (EnumC992950bwj[]) LL.clone();
    }

    public static EnumC992950bwj valueOf(String str) {
        return (EnumC992950bwj) C08FF.LIZ(EnumC992950bwj.class, str);
    }

    public EnumC992950bwj(String str, int i) {
    }
}
