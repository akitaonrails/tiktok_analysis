package X;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Oy9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC636670Oy9 {
    public static final EnumC636670Oy9 CONS;
    public static final /* synthetic */ EnumC636670Oy9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC636670Oy9 PROS;
    public static final EnumC636670Oy9 REVIEWS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC636670Oy9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC636670Oy9 enumC636670Oy9 = new EnumC636670Oy9("REVIEWS", 0, "REVIEWS");
        REVIEWS = enumC636670Oy9;
        EnumC636670Oy9 enumC636670Oy92 = new EnumC636670Oy9("PROS", 1, "PROS");
        PROS = enumC636670Oy92;
        EnumC636670Oy9 enumC636670Oy93 = new EnumC636670Oy9("CONS", 2, "CONS");
        CONS = enumC636670Oy93;
        EnumC636670Oy9[] enumC636670Oy9Arr = {enumC636670Oy9, enumC636670Oy92, enumC636670Oy93};
        LLILLJJLI = enumC636670Oy9Arr;
        LLILLL = new C2254308sP(enumC636670Oy9Arr);
    }

    public static EnumC636670Oy9[] values() {
        return (EnumC636670Oy9[]) LLILLJJLI.clone();
    }

    public final String getText() {
        return this.LL;
    }

    public static EnumC636670Oy9 valueOf(String str) {
        return (EnumC636670Oy9) C08FF.LIZ(EnumC636670Oy9.class, str);
    }

    public EnumC636670Oy9(String str, int i, String str2) {
        this.LL = C786410Ut5.j4("<MERGED_%s>", Arrays.copyOf(new Object[]{str2}, 1));
    }
}
