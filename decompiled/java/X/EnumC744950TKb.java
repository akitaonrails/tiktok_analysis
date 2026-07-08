package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC744950TKb {
    public static final EnumC744950TKb LL;
    public static final EnumC744950TKb LLILLJJLI;
    public static final EnumC744950TKb LLILLL;
    public static final EnumC744950TKb LLILZ;
    public static final EnumC744950TKb LLILZIL;
    public static final EnumC744950TKb LLILZLL;
    public static final /* synthetic */ EnumC744950TKb[] LLIZ;

    static {
        EnumC744950TKb enumC744950TKb = new EnumC744950TKb("AI_SUMMARY_SHOW", 0);
        LL = enumC744950TKb;
        EnumC744950TKb enumC744950TKb2 = new EnumC744950TKb("ON_BIND", 1);
        LLILLJJLI = enumC744950TKb2;
        EnumC744950TKb enumC744950TKb3 = new EnumC744950TKb("ON_SELECT", 2);
        LLILLL = enumC744950TKb3;
        EnumC744950TKb enumC744950TKb4 = new EnumC744950TKb("DELAY_SHOW", 3);
        LLILZ = enumC744950TKb4;
        EnumC744950TKb enumC744950TKb5 = new EnumC744950TKb("RESUME_PLAY", 4);
        LLILZIL = enumC744950TKb5;
        EnumC744950TKb enumC744950TKb6 = new EnumC744950TKb("HIGHLIGHT_FINISH", 5);
        LLILZLL = enumC744950TKb6;
        EnumC744950TKb[] enumC744950TKbArr = {enumC744950TKb, enumC744950TKb2, enumC744950TKb3, enumC744950TKb4, enumC744950TKb5, enumC744950TKb6};
        LLIZ = enumC744950TKbArr;
        new C2254308sP(enumC744950TKbArr);
    }

    public static EnumC744950TKb[] values() {
        return (EnumC744950TKb[]) LLIZ.clone();
    }

    public static EnumC744950TKb valueOf(String str) {
        return (EnumC744950TKb) C08FF.LIZ(EnumC744950TKb.class, str);
    }

    public EnumC744950TKb(String str, int i) {
    }
}
