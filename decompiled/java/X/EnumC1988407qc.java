package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1988407qc {
    public static final EnumC1988407qc AID;
    public static final /* synthetic */ EnumC1988407qc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "Aid";

    public static InterfaceC2044707zh<EnumC1988407qc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1988407qc enumC1988407qc = new EnumC1988407qc();
        AID = enumC1988407qc;
        EnumC1988407qc[] enumC1988407qcArr = {enumC1988407qc};
        LLILLJJLI = enumC1988407qcArr;
        LLILLL = new C2254308sP(enumC1988407qcArr);
    }

    public static EnumC1988407qc[] values() {
        return (EnumC1988407qc[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1988407qc valueOf(String str) {
        return (EnumC1988407qc) C08FF.LIZ(EnumC1988407qc.class, str);
    }
}
