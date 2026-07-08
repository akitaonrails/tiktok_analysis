package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qzy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC688760Qzy implements C13WE {
    public static final EnumC688760Qzy CANON_EQ;
    public static final EnumC688760Qzy COMMENTS;
    public static final EnumC688760Qzy DOT_MATCHES_ALL;
    public static final EnumC688760Qzy IGNORE_CASE;
    public static final EnumC688760Qzy LITERAL;
    public static final /* synthetic */ EnumC688760Qzy[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC688760Qzy MULTILINE;
    public static final EnumC688760Qzy UNIX_LINES;
    public final int LL;
    public final int LLILLJJLI;

    public EnumC688760Qzy() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC688760Qzy> getEntries() {
        return LLILZ;
    }

    static {
        EnumC688760Qzy enumC688760Qzy = new EnumC688760Qzy("IGNORE_CASE", 0, 2, 0, 2, null);
        IGNORE_CASE = enumC688760Qzy;
        EnumC688760Qzy enumC688760Qzy2 = new EnumC688760Qzy("MULTILINE", 1, 8, 0, 2, null);
        MULTILINE = enumC688760Qzy2;
        EnumC688760Qzy enumC688760Qzy3 = new EnumC688760Qzy("LITERAL", 2, 16, 0, 2, null);
        LITERAL = enumC688760Qzy3;
        EnumC688760Qzy enumC688760Qzy4 = new EnumC688760Qzy("UNIX_LINES", 3, 1, 0, 2, null);
        UNIX_LINES = enumC688760Qzy4;
        EnumC688760Qzy enumC688760Qzy5 = new EnumC688760Qzy("COMMENTS", 4, 4, 0, 2, null);
        COMMENTS = enumC688760Qzy5;
        EnumC688760Qzy enumC688760Qzy6 = new EnumC688760Qzy("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
        DOT_MATCHES_ALL = enumC688760Qzy6;
        EnumC688760Qzy enumC688760Qzy7 = new EnumC688760Qzy("CANON_EQ", 6, 128, 0, 2, null);
        CANON_EQ = enumC688760Qzy7;
        EnumC688760Qzy[] enumC688760QzyArr = {enumC688760Qzy, enumC688760Qzy2, enumC688760Qzy3, enumC688760Qzy4, enumC688760Qzy5, enumC688760Qzy6, enumC688760Qzy7};
        LLILLL = enumC688760QzyArr;
        LLILZ = new C2254308sP(enumC688760QzyArr);
    }

    public static EnumC688760Qzy[] values() {
        return (EnumC688760Qzy[]) LLILLL.clone();
    }

    @Override // X.C13WE
    public int getMask() {
        return this.LLILLJJLI;
    }

    @Override // X.C13WE
    public int getValue() {
        return this.LL;
    }

    public static EnumC688760Qzy valueOf(String str) {
        return (EnumC688760Qzy) C08FF.LIZ(EnumC688760Qzy.class, str);
    }

    public EnumC688760Qzy(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        i3 = (i4 & 2) != 0 ? i2 : i3;
        this.LL = i2;
        this.LLILLJJLI = i3;
    }
}
