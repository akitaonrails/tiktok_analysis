package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vmg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1755520vmg {
    public static final EnumC1755520vmg CLOSE;
    public static final /* synthetic */ EnumC1755520vmg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1755520vmg NEXT;
    public static final EnumC1755520vmg RETURN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1755520vmg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1755520vmg enumC1755520vmg = new EnumC1755520vmg("RETURN", 0, 0);
        RETURN = enumC1755520vmg;
        EnumC1755520vmg enumC1755520vmg2 = new EnumC1755520vmg("NEXT", 1, 1);
        NEXT = enumC1755520vmg2;
        EnumC1755520vmg enumC1755520vmg3 = new EnumC1755520vmg("CLOSE", 2, 2);
        CLOSE = enumC1755520vmg3;
        EnumC1755520vmg[] enumC1755520vmgArr = {enumC1755520vmg, enumC1755520vmg2, enumC1755520vmg3};
        LLILLJJLI = enumC1755520vmgArr;
        LLILLL = new C2254308sP(enumC1755520vmgArr);
    }

    public static EnumC1755520vmg[] values() {
        return (EnumC1755520vmg[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1755520vmg valueOf(String str) {
        return (EnumC1755520vmg) C08FF.LIZ(EnumC1755520vmg.class, str);
    }

    public EnumC1755520vmg(String str, int i, int i2) {
        this.LL = i2;
    }
}
