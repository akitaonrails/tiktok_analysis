package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0puh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1529850puh {
    public static final EnumC1529850puh LEISURE;
    public static final /* synthetic */ EnumC1529850puh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1529850puh NORMAL;
    public static final EnumC1529850puh STRESSFUL;

    public static InterfaceC2044707zh<EnumC1529850puh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1529850puh enumC1529850puh = new EnumC1529850puh("STRESSFUL", 0);
        STRESSFUL = enumC1529850puh;
        EnumC1529850puh enumC1529850puh2 = new EnumC1529850puh("NORMAL", 1);
        NORMAL = enumC1529850puh2;
        EnumC1529850puh enumC1529850puh3 = new EnumC1529850puh("LEISURE", 2);
        LEISURE = enumC1529850puh3;
        EnumC1529850puh[] enumC1529850puhArr = {enumC1529850puh, enumC1529850puh2, enumC1529850puh3};
        LL = enumC1529850puhArr;
        LLILLJJLI = new C2254308sP(enumC1529850puhArr);
    }

    public static EnumC1529850puh[] values() {
        return (EnumC1529850puh[]) LL.clone();
    }

    public static EnumC1529850puh valueOf(String str) {
        return (EnumC1529850puh) C08FF.LIZ(EnumC1529850puh.class, str);
    }

    public EnumC1529850puh(String str, int i) {
    }
}
