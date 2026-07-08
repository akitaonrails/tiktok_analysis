package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC620000OTm {
    public static final EnumC620000OTm INPUT;
    public static final /* synthetic */ EnumC620000OTm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC620000OTm VOICE;

    public static InterfaceC2044707zh<EnumC620000OTm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC620000OTm enumC620000OTm = new EnumC620000OTm("INPUT", 0);
        INPUT = enumC620000OTm;
        EnumC620000OTm enumC620000OTm2 = new EnumC620000OTm("VOICE", 1);
        VOICE = enumC620000OTm2;
        EnumC620000OTm[] enumC620000OTmArr = {enumC620000OTm, enumC620000OTm2};
        LL = enumC620000OTmArr;
        LLILLJJLI = new C2254308sP(enumC620000OTmArr);
    }

    public static EnumC620000OTm[] values() {
        return (EnumC620000OTm[]) LL.clone();
    }

    public static EnumC620000OTm valueOf(String str) {
        return (EnumC620000OTm) C08FF.LIZ(EnumC620000OTm.class, str);
    }

    public EnumC620000OTm(String str, int i) {
    }
}
