package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216710hld {
    public static final EnumC1216710hld DISLIKEMORE2;
    public static final /* synthetic */ EnumC1216710hld[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1216710hld NORMAL;
    public static final EnumC1216710hld SECONDDISLIKEREASON;

    public static InterfaceC2044707zh<EnumC1216710hld> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1216710hld enumC1216710hld = new EnumC1216710hld("DISLIKEMORE2", 0);
        DISLIKEMORE2 = enumC1216710hld;
        EnumC1216710hld enumC1216710hld2 = new EnumC1216710hld("SECONDDISLIKEREASON", 1);
        SECONDDISLIKEREASON = enumC1216710hld2;
        EnumC1216710hld enumC1216710hld3 = new EnumC1216710hld("NORMAL", 2);
        NORMAL = enumC1216710hld3;
        EnumC1216710hld[] enumC1216710hldArr = {enumC1216710hld, enumC1216710hld2, enumC1216710hld3};
        LL = enumC1216710hldArr;
        LLILLJJLI = new C2254308sP(enumC1216710hldArr);
    }

    public static EnumC1216710hld[] values() {
        return (EnumC1216710hld[]) LL.clone();
    }

    public static EnumC1216710hld valueOf(String str) {
        return (EnumC1216710hld) C08FF.LIZ(EnumC1216710hld.class, str);
    }

    public EnumC1216710hld(String str, int i) {
    }
}
