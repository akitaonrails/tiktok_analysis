package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r63, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1575330r63 {
    public static final EnumC1575330r63 ACCEPT;
    public static final EnumC1575330r63 INTRODUCTION;
    public static final EnumC1575330r63 INVITE;
    public static final EnumC1575330r63 INVITE_GAP;
    public static final /* synthetic */ EnumC1575330r63[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1575330r63 RE_INVITE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1575330r63> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1575330r63 enumC1575330r63 = new EnumC1575330r63("INVITE", 0, "invite");
        INVITE = enumC1575330r63;
        EnumC1575330r63 enumC1575330r632 = new EnumC1575330r63("INVITE_GAP", 1, "invite_gap");
        INVITE_GAP = enumC1575330r632;
        EnumC1575330r63 enumC1575330r633 = new EnumC1575330r63("RE_INVITE", 2, "re_invite");
        RE_INVITE = enumC1575330r633;
        EnumC1575330r63 enumC1575330r634 = new EnumC1575330r63("ACCEPT", 3, "accept");
        ACCEPT = enumC1575330r634;
        EnumC1575330r63 enumC1575330r635 = new EnumC1575330r63("INTRODUCTION", 4, "introduction");
        INTRODUCTION = enumC1575330r635;
        EnumC1575330r63[] enumC1575330r63Arr = {enumC1575330r63, enumC1575330r632, enumC1575330r633, enumC1575330r634, enumC1575330r635};
        LLILLJJLI = enumC1575330r63Arr;
        LLILLL = new C2254308sP(enumC1575330r63Arr);
    }

    public static EnumC1575330r63[] values() {
        return (EnumC1575330r63[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1575330r63 valueOf(String str) {
        return (EnumC1575330r63) C08FF.LIZ(EnumC1575330r63.class, str);
    }

    public EnumC1575330r63(String str, int i, String str2) {
        this.LL = str2;
    }
}
