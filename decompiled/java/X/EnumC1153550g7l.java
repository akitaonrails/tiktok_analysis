package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153550g7l {
    public static final EnumC1153550g7l ERROR;
    public static final /* synthetic */ EnumC1153550g7l[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1153550g7l WARNING;

    public static InterfaceC2044707zh<EnumC1153550g7l> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153550g7l enumC1153550g7l = new EnumC1153550g7l("ERROR", 0);
        ERROR = enumC1153550g7l;
        EnumC1153550g7l enumC1153550g7l2 = new EnumC1153550g7l("WARNING", 1);
        WARNING = enumC1153550g7l2;
        EnumC1153550g7l[] enumC1153550g7lArr = {enumC1153550g7l, enumC1153550g7l2};
        LL = enumC1153550g7lArr;
        LLILLJJLI = new C2254308sP(enumC1153550g7lArr);
    }

    public static EnumC1153550g7l[] values() {
        return (EnumC1153550g7l[]) LL.clone();
    }

    public static EnumC1153550g7l valueOf(String str) {
        return (EnumC1153550g7l) C08FF.LIZ(EnumC1153550g7l.class, str);
    }

    public EnumC1153550g7l(String str, int i) {
    }
}
