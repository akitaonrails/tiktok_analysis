package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1674280tfe {
    public static final EnumC1674280tfe COMPLETE;
    public static final EnumC1674280tfe ERROR;
    public static final /* synthetic */ EnumC1674280tfe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1674280tfe LOADING;

    public static InterfaceC2044707zh<EnumC1674280tfe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1674280tfe enumC1674280tfe = new EnumC1674280tfe("LOADING", 0);
        LOADING = enumC1674280tfe;
        EnumC1674280tfe enumC1674280tfe2 = new EnumC1674280tfe("ERROR", 1);
        ERROR = enumC1674280tfe2;
        EnumC1674280tfe enumC1674280tfe3 = new EnumC1674280tfe("COMPLETE", 2);
        COMPLETE = enumC1674280tfe3;
        EnumC1674280tfe[] enumC1674280tfeArr = {enumC1674280tfe, enumC1674280tfe2, enumC1674280tfe3};
        LL = enumC1674280tfeArr;
        LLILLJJLI = new C2254308sP(enumC1674280tfeArr);
    }

    public static EnumC1674280tfe[] values() {
        return (EnumC1674280tfe[]) LL.clone();
    }

    public static EnumC1674280tfe valueOf(String str) {
        return (EnumC1674280tfe) C08FF.LIZ(EnumC1674280tfe.class, str);
    }

    public EnumC1674280tfe(String str, int i) {
    }
}
