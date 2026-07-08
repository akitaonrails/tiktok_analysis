package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k89, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1307550k89 {
    public static final /* synthetic */ EnumC1307550k89[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1307550k89 PASSIVE;
    public static final EnumC1307550k89 PROACTIVE;

    public static InterfaceC2044707zh<EnumC1307550k89> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1307550k89 enumC1307550k89 = new EnumC1307550k89("PROACTIVE", 0);
        PROACTIVE = enumC1307550k89;
        EnumC1307550k89 enumC1307550k892 = new EnumC1307550k89("PASSIVE", 1);
        PASSIVE = enumC1307550k892;
        EnumC1307550k89[] enumC1307550k89Arr = {enumC1307550k89, enumC1307550k892};
        LL = enumC1307550k89Arr;
        LLILLJJLI = new C2254308sP(enumC1307550k89Arr);
    }

    public static EnumC1307550k89[] values() {
        return (EnumC1307550k89[]) LL.clone();
    }

    public static EnumC1307550k89 valueOf(String str) {
        return (EnumC1307550k89) C08FF.LIZ(EnumC1307550k89.class, str);
    }

    public EnumC1307550k89(String str, int i) {
    }
}
