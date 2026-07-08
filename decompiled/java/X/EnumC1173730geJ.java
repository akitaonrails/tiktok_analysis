package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0geJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1173730geJ {
    public static final EnumC1173730geJ CALENDAR;
    public static final EnumC1173730geJ LIST;
    public static final /* synthetic */ EnumC1173730geJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1173730geJ THOUGHT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1173730geJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1173730geJ enumC1173730geJ = new EnumC1173730geJ("CALENDAR", 0, "calendar");
        CALENDAR = enumC1173730geJ;
        EnumC1173730geJ enumC1173730geJ2 = new EnumC1173730geJ("THOUGHT", 1, "thought");
        THOUGHT = enumC1173730geJ2;
        EnumC1173730geJ enumC1173730geJ3 = new EnumC1173730geJ("LIST", 2, "story");
        LIST = enumC1173730geJ3;
        EnumC1173730geJ[] enumC1173730geJArr = {enumC1173730geJ, enumC1173730geJ2, enumC1173730geJ3};
        LLILLJJLI = enumC1173730geJArr;
        LLILLL = new C2254308sP(enumC1173730geJArr);
    }

    public static EnumC1173730geJ[] values() {
        return (EnumC1173730geJ[]) LLILLJJLI.clone();
    }

    public final String getTabName() {
        return this.LL;
    }

    public static EnumC1173730geJ valueOf(String str) {
        return (EnumC1173730geJ) C08FF.LIZ(EnumC1173730geJ.class, str);
    }

    public EnumC1173730geJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
