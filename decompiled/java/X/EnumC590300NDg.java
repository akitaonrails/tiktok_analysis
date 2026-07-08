package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC590300NDg {
    public static final EnumC590300NDg COMPLETE;
    public static final C590310NDh Companion;
    public static final /* synthetic */ EnumC590300NDg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC590300NDg NOT_CHECKED;
    public static final EnumC590300NDg NOT_COMPLETE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC590300NDg> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0NDh] */
    static {
        EnumC590300NDg enumC590300NDg = new EnumC590300NDg("NOT_CHECKED", 0, -1);
        NOT_CHECKED = enumC590300NDg;
        EnumC590300NDg enumC590300NDg2 = new EnumC590300NDg("NOT_COMPLETE", 1, 0);
        NOT_COMPLETE = enumC590300NDg2;
        EnumC590300NDg enumC590300NDg3 = new EnumC590300NDg("COMPLETE", 2, 1);
        COMPLETE = enumC590300NDg3;
        EnumC590300NDg[] enumC590300NDgArr = {enumC590300NDg, enumC590300NDg2, enumC590300NDg3};
        LLILLJJLI = enumC590300NDgArr;
        LLILLL = new C2254308sP(enumC590300NDgArr);
        Companion = new Object() { // from class: X.0NDh
        };
    }

    public static EnumC590300NDg[] values() {
        return (EnumC590300NDg[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC590300NDg valueOf(String str) {
        return (EnumC590300NDg) C08FF.LIZ(EnumC590300NDg.class, str);
    }

    public EnumC590300NDg(String str, int i, int i2) {
        this.LL = i2;
    }
}
