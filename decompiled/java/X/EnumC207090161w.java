package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.161w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC207090161w {
    public static final /* synthetic */ EnumC207090161w[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC207090161w NONE;
    public static final EnumC207090161w THUMB_DOWN;
    public static final EnumC207090161w THUMB_UP;
    public final boolean LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC207090161w> getEntries() {
        return LLILZ;
    }

    static {
        EnumC207090161w enumC207090161w = new EnumC207090161w(0, "NONE", "none", false);
        NONE = enumC207090161w;
        EnumC207090161w enumC207090161w2 = new EnumC207090161w(1, "THUMB_UP", "like", true);
        THUMB_UP = enumC207090161w2;
        EnumC207090161w enumC207090161w3 = new EnumC207090161w(2, "THUMB_DOWN", "dislike", false);
        THUMB_DOWN = enumC207090161w3;
        EnumC207090161w[] enumC207090161wArr = {enumC207090161w, enumC207090161w2, enumC207090161w3};
        LLILLL = enumC207090161wArr;
        LLILZ = new C2254308sP(enumC207090161wArr);
    }

    public static EnumC207090161w[] values() {
        return (EnumC207090161w[]) LLILLL.clone();
    }

    public final boolean getBValue() {
        return this.LL;
    }

    public final String getStrValue() {
        return this.LLILLJJLI;
    }

    public static EnumC207090161w valueOf(String str) {
        return (EnumC207090161w) C08FF.LIZ(EnumC207090161w.class, str);
    }

    public EnumC207090161w(int i, String str, String str2, boolean z) {
        this.LL = z;
        this.LLILLJJLI = str2;
    }
}
