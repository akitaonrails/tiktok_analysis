package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Etb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC379050Etb {
    public static final EnumC379050Etb FAST;
    public static final EnumC379050Etb HIGH_QUALITY;
    public static final /* synthetic */ EnumC379050Etb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC379050Etb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC379050Etb enumC379050Etb = new EnumC379050Etb("FAST", 0, "fast");
        FAST = enumC379050Etb;
        EnumC379050Etb enumC379050Etb2 = new EnumC379050Etb("HIGH_QUALITY", 1, "high_quality");
        HIGH_QUALITY = enumC379050Etb2;
        EnumC379050Etb[] enumC379050EtbArr = {enumC379050Etb, enumC379050Etb2};
        LLILLJJLI = enumC379050EtbArr;
        LLILLL = new C2254308sP(enumC379050EtbArr);
    }

    public static EnumC379050Etb[] values() {
        return (EnumC379050Etb[]) LLILLJJLI.clone();
    }

    public final String getModelName() {
        return this.LL;
    }

    public static EnumC379050Etb valueOf(String str) {
        return (EnumC379050Etb) C08FF.LIZ(EnumC379050Etb.class, str);
    }

    public EnumC379050Etb(String str, int i, String str2) {
        this.LL = str2;
    }
}
