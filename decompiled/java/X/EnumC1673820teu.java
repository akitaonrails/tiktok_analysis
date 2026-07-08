package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0teu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1673820teu {
    public static final C1673850tex Companion;
    public static final EnumC1673820teu FOLLOWING;
    public static final /* synthetic */ EnumC1673820teu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1673820teu REQUESTED;
    public static final EnumC1673820teu TO_FOLLOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1673820teu> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0tex] */
    static {
        EnumC1673820teu enumC1673820teu = new EnumC1673820teu("TO_FOLLOW", 0, 0);
        TO_FOLLOW = enumC1673820teu;
        EnumC1673820teu enumC1673820teu2 = new EnumC1673820teu("FOLLOWING", 1, 1);
        FOLLOWING = enumC1673820teu2;
        EnumC1673820teu enumC1673820teu3 = new EnumC1673820teu("REQUESTED", 2, 4);
        REQUESTED = enumC1673820teu3;
        EnumC1673820teu[] enumC1673820teuArr = {enumC1673820teu, enumC1673820teu2, enumC1673820teu3};
        LLILLJJLI = enumC1673820teuArr;
        LLILLL = new C2254308sP(enumC1673820teuArr);
        Companion = new Object() { // from class: X.0tex
        };
    }

    public static EnumC1673820teu[] values() {
        return (EnumC1673820teu[]) LLILLJJLI.clone();
    }

    public final int getStatusInt() {
        return this.LL;
    }

    public static EnumC1673820teu valueOf(String str) {
        return (EnumC1673820teu) C08FF.LIZ(EnumC1673820teu.class, str);
    }

    public EnumC1673820teu(String str, int i, int i2) {
        this.LL = i2;
    }
}
