package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC718920SHy {
    public static final EnumC718920SHy CHARACTER_AND;
    public static final EnumC718920SHy CHARACTER_GREATER_THAN;
    public static final EnumC718920SHy CHARACTER_LINE_BREAK;
    public static final EnumC718920SHy CHARACTER_LOWER_THAN;
    public static final C719170SIx Companion;
    public static final /* synthetic */ EnumC718920SHy[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final char LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC718920SHy> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0SIx] */
    static {
        EnumC718920SHy enumC718920SHy = new EnumC718920SHy("CHARACTER_LINE_BREAK", 0, '\n', "<br>");
        CHARACTER_LINE_BREAK = enumC718920SHy;
        EnumC718920SHy enumC718920SHy2 = new EnumC718920SHy("CHARACTER_LOWER_THAN", 1, '<', "&lt;");
        CHARACTER_LOWER_THAN = enumC718920SHy2;
        EnumC718920SHy enumC718920SHy3 = new EnumC718920SHy("CHARACTER_GREATER_THAN", 2, '>', "&gt;");
        CHARACTER_GREATER_THAN = enumC718920SHy3;
        EnumC718920SHy enumC718920SHy4 = new EnumC718920SHy("CHARACTER_AND", 3, '&', "&amp;");
        CHARACTER_AND = enumC718920SHy4;
        EnumC718920SHy[] enumC718920SHyArr = {enumC718920SHy, enumC718920SHy2, enumC718920SHy3, enumC718920SHy4};
        LLILLL = enumC718920SHyArr;
        LLILZ = new C2254308sP(enumC718920SHyArr);
        Companion = new Object() { // from class: X.0SIx
        };
    }

    public static EnumC718920SHy[] values() {
        return (EnumC718920SHy[]) LLILLL.clone();
    }

    public final String getMarkup() {
        return this.LLILLJJLI;
    }

    public final char getText() {
        return this.LL;
    }

    public static EnumC718920SHy valueOf(String str) {
        return (EnumC718920SHy) C08FF.LIZ(EnumC718920SHy.class, str);
    }

    public EnumC718920SHy(String str, int i, char c, String str2) {
        this.LL = c;
        this.LLILLJJLI = str2;
    }
}
