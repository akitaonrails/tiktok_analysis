package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1084770eKp {
    public static final EnumC1084770eKp LEFT;
    public static final /* synthetic */ EnumC1084770eKp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1084770eKp RIGHT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1084770eKp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1084770eKp enumC1084770eKp = new EnumC1084770eKp("LEFT", 0, "left");
        LEFT = enumC1084770eKp;
        EnumC1084770eKp enumC1084770eKp2 = new EnumC1084770eKp("RIGHT", 1, "right");
        RIGHT = enumC1084770eKp2;
        EnumC1084770eKp[] enumC1084770eKpArr = {enumC1084770eKp, enumC1084770eKp2};
        LLILLJJLI = enumC1084770eKpArr;
        LLILLL = new C2254308sP(enumC1084770eKpArr);
    }

    public static EnumC1084770eKp[] values() {
        return (EnumC1084770eKp[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1084770eKp valueOf(String str) {
        return (EnumC1084770eKp) C08FF.LIZ(EnumC1084770eKp.class, str);
    }

    public EnumC1084770eKp(String str, int i, String str2) {
        this.LL = str2;
    }
}
