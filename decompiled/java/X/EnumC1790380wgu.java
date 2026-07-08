package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wgu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1790380wgu {
    public static final EnumC1790380wgu LL;
    public static final EnumC1790380wgu LLILLJJLI;
    public static final EnumC1790380wgu LLILLL;
    public static final EnumC1790380wgu LLILZ;
    public static final /* synthetic */ EnumC1790380wgu[] LLILZIL;

    static {
        EnumC1790380wgu enumC1790380wgu = new EnumC1790380wgu("PENDING", 0);
        EnumC1790380wgu enumC1790380wgu2 = new EnumC1790380wgu("RUNNING", 1);
        LL = enumC1790380wgu2;
        EnumC1790380wgu enumC1790380wgu3 = new EnumC1790380wgu("SUCCEEDED", 2);
        LLILLJJLI = enumC1790380wgu3;
        EnumC1790380wgu enumC1790380wgu4 = new EnumC1790380wgu("FAILED", 3);
        LLILLL = enumC1790380wgu4;
        EnumC1790380wgu enumC1790380wgu5 = new EnumC1790380wgu("CANCELLED", 4);
        LLILZ = enumC1790380wgu5;
        EnumC1790380wgu[] enumC1790380wguArr = {enumC1790380wgu, enumC1790380wgu2, enumC1790380wgu3, enumC1790380wgu4, enumC1790380wgu5};
        LLILZIL = enumC1790380wguArr;
        new C2254308sP(enumC1790380wguArr);
    }

    public static EnumC1790380wgu[] values() {
        return (EnumC1790380wgu[]) LLILZIL.clone();
    }

    public static EnumC1790380wgu valueOf(String str) {
        return (EnumC1790380wgu) C08FF.LIZ(EnumC1790380wgu.class, str);
    }

    public EnumC1790380wgu(String str, int i) {
    }
}
