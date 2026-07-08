package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ohs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC626580Ohs {
    public static final EnumC626580Ohs CONTINUE;
    public static final EnumC626580Ohs FINISH;
    public static final /* synthetic */ EnumC626580Ohs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC626580Ohs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC626580Ohs enumC626580Ohs = new EnumC626580Ohs("CONTINUE", 0, "continue");
        CONTINUE = enumC626580Ohs;
        EnumC626580Ohs enumC626580Ohs2 = new EnumC626580Ohs("FINISH", 1, "finish");
        FINISH = enumC626580Ohs2;
        EnumC626580Ohs[] enumC626580OhsArr = {enumC626580Ohs, enumC626580Ohs2};
        LLILLJJLI = enumC626580OhsArr;
        LLILLL = new C2254308sP(enumC626580OhsArr);
    }

    public static EnumC626580Ohs[] values() {
        return (EnumC626580Ohs[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC626580Ohs valueOf(String str) {
        return (EnumC626580Ohs) C08FF.LIZ(EnumC626580Ohs.class, str);
    }

    public EnumC626580Ohs(String str, int i, String str2) {
        this.LL = str2;
    }
}
