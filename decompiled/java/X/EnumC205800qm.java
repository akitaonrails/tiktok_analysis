package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00qm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC205800qm {
    public static final /* synthetic */ EnumC205800qm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC205800qm OPEN_STREAK_PET_STICKER_PANEL;
    public static final EnumC205800qm REFRESH_STREAK_STICKER;
    public static final EnumC205800qm UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC205800qm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC205800qm enumC205800qm = new EnumC205800qm("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC205800qm;
        EnumC205800qm enumC205800qm2 = new EnumC205800qm("REFRESH_STREAK_STICKER", 1, "refresh_streak_sticker");
        REFRESH_STREAK_STICKER = enumC205800qm2;
        EnumC205800qm enumC205800qm3 = new EnumC205800qm("OPEN_STREAK_PET_STICKER_PANEL", 2, "open_streak_pet_streak_panel");
        OPEN_STREAK_PET_STICKER_PANEL = enumC205800qm3;
        EnumC205800qm[] enumC205800qmArr = {enumC205800qm, enumC205800qm2, enumC205800qm3};
        LLILLJJLI = enumC205800qmArr;
        LLILLL = new C2254308sP(enumC205800qmArr);
    }

    public static EnumC205800qm[] values() {
        return (EnumC205800qm[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC205800qm valueOf(String str) {
        return (EnumC205800qm) C08FF.LIZ(EnumC205800qm.class, str);
    }

    public EnumC205800qm(String str, int i, String str2) {
        this.LL = str2;
    }
}
