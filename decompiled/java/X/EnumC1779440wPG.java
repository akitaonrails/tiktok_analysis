package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779440wPG {
    public static final /* synthetic */ EnumC1779440wPG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1779440wPG PCS_COURSE;
    public final String LL = "course";

    public static InterfaceC2044707zh<EnumC1779440wPG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779440wPG enumC1779440wPG = new EnumC1779440wPG();
        PCS_COURSE = enumC1779440wPG;
        EnumC1779440wPG[] enumC1779440wPGArr = {enumC1779440wPG};
        LLILLJJLI = enumC1779440wPGArr;
        LLILLL = new C2254308sP(enumC1779440wPGArr);
    }

    public static EnumC1779440wPG[] values() {
        return (EnumC1779440wPG[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC1779440wPG valueOf(String str) {
        return (EnumC1779440wPG) C08FF.LIZ(EnumC1779440wPG.class, str);
    }
}
