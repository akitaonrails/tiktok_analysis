package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11Vy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19513211Vy {
    public static final EnumC19513211Vy ADD;
    public static final C11W0 Companion;
    public static final EnumC19513211Vy EDIT;
    public static final /* synthetic */ EnumC19513211Vy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19513211Vy> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.11W0] */
    static {
        EnumC19513211Vy enumC19513211Vy = new EnumC19513211Vy("ADD", 0, 0);
        ADD = enumC19513211Vy;
        EnumC19513211Vy enumC19513211Vy2 = new EnumC19513211Vy("EDIT", 1, 1);
        EDIT = enumC19513211Vy2;
        EnumC19513211Vy[] enumC19513211VyArr = {enumC19513211Vy, enumC19513211Vy2};
        LLILLJJLI = enumC19513211VyArr;
        LLILLL = new C2254308sP(enumC19513211VyArr);
        Companion = new Object() { // from class: X.11W0
        };
    }

    public static EnumC19513211Vy[] values() {
        return (EnumC19513211Vy[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC19513211Vy valueOf(String str) {
        return (EnumC19513211Vy) C08FF.LIZ(EnumC19513211Vy.class, str);
    }

    public EnumC19513211Vy(String str, int i, int i2) {
        this.LL = i2;
    }
}
