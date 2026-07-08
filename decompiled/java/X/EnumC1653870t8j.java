package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1653870t8j {
    public static final /* synthetic */ EnumC1653870t8j[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1653870t8j REVEAL;
    public static final EnumC1653870t8j STORY;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1653870t8j> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1653870t8j enumC1653870t8j = new EnumC1653870t8j("STORY", 0, 2131828282, "RecordBottomStory");
        STORY = enumC1653870t8j;
        EnumC1653870t8j enumC1653870t8j2 = new EnumC1653870t8j("REVEAL", 1, 2131849078, "Reveal");
        REVEAL = enumC1653870t8j2;
        EnumC1653870t8j[] enumC1653870t8jArr = {enumC1653870t8j, enumC1653870t8j2};
        LLILLL = enumC1653870t8jArr;
        LLILZ = new C2254308sP(enumC1653870t8jArr);
    }

    public static EnumC1653870t8j[] values() {
        return (EnumC1653870t8j[]) LLILLL.clone();
    }

    public final int getNameResId() {
        return this.LL;
    }

    public final String getTag() {
        return this.LLILLJJLI;
    }

    public static EnumC1653870t8j valueOf(String str) {
        return (EnumC1653870t8j) C08FF.LIZ(EnumC1653870t8j.class, str);
    }

    public EnumC1653870t8j(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
