package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1284940jXg {
    public static final EnumC1284940jXg INTERRUPT;
    public static final /* synthetic */ EnumC1284940jXg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1284940jXg MUTE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1284940jXg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1284940jXg enumC1284940jXg = new EnumC1284940jXg("INTERRUPT", 0, "interrupt");
        INTERRUPT = enumC1284940jXg;
        EnumC1284940jXg enumC1284940jXg2 = new EnumC1284940jXg("MUTE", 1, "mute");
        MUTE = enumC1284940jXg2;
        EnumC1284940jXg[] enumC1284940jXgArr = {enumC1284940jXg, enumC1284940jXg2};
        LLILLJJLI = enumC1284940jXgArr;
        LLILLL = new C2254308sP(enumC1284940jXgArr);
    }

    public static EnumC1284940jXg[] values() {
        return (EnumC1284940jXg[]) LLILLJJLI.clone();
    }

    public final String getPayload() {
        return this.LL;
    }

    public static EnumC1284940jXg valueOf(String str) {
        return (EnumC1284940jXg) C08FF.LIZ(EnumC1284940jXg.class, str);
    }

    public EnumC1284940jXg(String str, int i, String str2) {
        this.LL = str2;
    }
}
