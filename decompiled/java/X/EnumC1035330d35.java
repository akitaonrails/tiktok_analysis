package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d35, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1035330d35 {
    public static final EnumC1035330d35 ICON;
    public static final /* synthetic */ EnumC1035330d35[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1035330d35 TITLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1035330d35> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1035330d35 enumC1035330d35 = new EnumC1035330d35("TITLE", 0, "music_title");
        TITLE = enumC1035330d35;
        EnumC1035330d35 enumC1035330d352 = new EnumC1035330d35("ICON", 1, "music_icon");
        ICON = enumC1035330d352;
        EnumC1035330d35[] enumC1035330d35Arr = {enumC1035330d35, enumC1035330d352};
        LLILLJJLI = enumC1035330d35Arr;
        LLILLL = new C2254308sP(enumC1035330d35Arr);
    }

    public static EnumC1035330d35[] values() {
        return (EnumC1035330d35[]) LLILLJJLI.clone();
    }

    public final String getAREA() {
        return this.LL;
    }

    public static EnumC1035330d35 valueOf(String str) {
        return (EnumC1035330d35) C08FF.LIZ(EnumC1035330d35.class, str);
    }

    public EnumC1035330d35(String str, int i, String str2) {
        this.LL = str2;
    }
}
