package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1404580mee {
    public static final EnumC1404580mee IMAGE;
    public static final /* synthetic */ EnumC1404580mee[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1404580mee STORY;
    public static final EnumC1404580mee TTEP;
    public static final EnumC1404580mee VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1404580mee> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1404580mee enumC1404580mee = new EnumC1404580mee("VIDEO", 0, "normal");
        VIDEO = enumC1404580mee;
        EnumC1404580mee enumC1404580mee2 = new EnumC1404580mee("IMAGE", 1, "image_album");
        IMAGE = enumC1404580mee2;
        EnumC1404580mee enumC1404580mee3 = new EnumC1404580mee("TTEP", 2, "ttep");
        TTEP = enumC1404580mee3;
        EnumC1404580mee enumC1404580mee4 = new EnumC1404580mee("STORY", 3, "story");
        STORY = enumC1404580mee4;
        EnumC1404580mee[] enumC1404580meeArr = {enumC1404580mee, enumC1404580mee2, enumC1404580mee3, enumC1404580mee4};
        LLILLJJLI = enumC1404580meeArr;
        LLILLL = new C2254308sP(enumC1404580meeArr);
    }

    public static EnumC1404580mee[] values() {
        return (EnumC1404580mee[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static EnumC1404580mee valueOf(String str) {
        return (EnumC1404580mee) C08FF.LIZ(EnumC1404580mee.class, str);
    }

    public EnumC1404580mee(String str, int i, String str2) {
        this.LL = str2;
    }
}
