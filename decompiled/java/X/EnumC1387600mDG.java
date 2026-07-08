package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mDG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1387600mDG {
    public static final /* synthetic */ EnumC1387600mDG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1387600mDG TIME_WINDOW_CALENDAR_DAY;
    public static final EnumC1387600mDG TIME_WINDOW_DURATION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1387600mDG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1387600mDG enumC1387600mDG = new EnumC1387600mDG("TIME_WINDOW_CALENDAR_DAY", 0, "calendar_day");
        TIME_WINDOW_CALENDAR_DAY = enumC1387600mDG;
        EnumC1387600mDG enumC1387600mDG2 = new EnumC1387600mDG("TIME_WINDOW_DURATION", 1, "second");
        TIME_WINDOW_DURATION = enumC1387600mDG2;
        EnumC1387600mDG[] enumC1387600mDGArr = {enumC1387600mDG, enumC1387600mDG2};
        LLILLJJLI = enumC1387600mDGArr;
        LLILLL = new C2254308sP(enumC1387600mDGArr);
    }

    public static EnumC1387600mDG[] values() {
        return (EnumC1387600mDG[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1387600mDG valueOf(String str) {
        return (EnumC1387600mDG) C08FF.LIZ(EnumC1387600mDG.class, str);
    }

    public EnumC1387600mDG(String str, int i, String str2) {
        this.LL = str2;
    }
}
