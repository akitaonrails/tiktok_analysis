package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235200iFS {
    public static final EnumC1235200iFS CHANGE;
    public static final /* synthetic */ EnumC1235200iFS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1235200iFS UNLINK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1235200iFS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235200iFS enumC1235200iFS = new EnumC1235200iFS("CHANGE", 0, "change");
        CHANGE = enumC1235200iFS;
        EnumC1235200iFS enumC1235200iFS2 = new EnumC1235200iFS("UNLINK", 1, "unlink");
        UNLINK = enumC1235200iFS2;
        EnumC1235200iFS[] enumC1235200iFSArr = {enumC1235200iFS, enumC1235200iFS2};
        LLILLJJLI = enumC1235200iFSArr;
        LLILLL = new C2254308sP(enumC1235200iFSArr);
    }

    public static EnumC1235200iFS[] values() {
        return (EnumC1235200iFS[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1235200iFS valueOf(String str) {
        return (EnumC1235200iFS) C08FF.LIZ(EnumC1235200iFS.class, str);
    }

    public EnumC1235200iFS(String str, int i, String str2) {
        this.LL = str2;
    }
}
