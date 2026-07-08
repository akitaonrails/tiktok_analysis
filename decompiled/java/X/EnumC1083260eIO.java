package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eIO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083260eIO {
    public static final EnumC1083260eIO DRAGGING;
    public static final EnumC1083260eIO HIDE;
    public static final /* synthetic */ EnumC1083260eIO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1083260eIO SHOW;
    public String LL = "";

    public static InterfaceC2044707zh<EnumC1083260eIO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1083260eIO enumC1083260eIO = new EnumC1083260eIO("SHOW", 0);
        SHOW = enumC1083260eIO;
        EnumC1083260eIO enumC1083260eIO2 = new EnumC1083260eIO("HIDE", 1);
        HIDE = enumC1083260eIO2;
        EnumC1083260eIO enumC1083260eIO3 = new EnumC1083260eIO("DRAGGING", 2);
        DRAGGING = enumC1083260eIO3;
        EnumC1083260eIO[] enumC1083260eIOArr = {enumC1083260eIO, enumC1083260eIO2, enumC1083260eIO3};
        LLILLJJLI = enumC1083260eIOArr;
        LLILLL = new C2254308sP(enumC1083260eIOArr);
    }

    public static EnumC1083260eIO[] values() {
        return (EnumC1083260eIO[]) LLILLJJLI.clone();
    }

    public final String getFrom() {
        return this.LL;
    }

    public static EnumC1083260eIO valueOf(String str) {
        return (EnumC1083260eIO) C08FF.LIZ(EnumC1083260eIO.class, str);
    }

    public final void setFrom(String str) {
        this.LL = str;
    }

    public EnumC1083260eIO(String str, int i) {
    }
}
