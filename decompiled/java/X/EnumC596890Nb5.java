package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nb5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC596890Nb5 {
    public static final EnumC596890Nb5 BYTE_SYNC;
    public static final EnumC596890Nb5 FRONTIER;
    public static final /* synthetic */ EnumC596890Nb5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC596890Nb5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC596890Nb5 enumC596890Nb5 = new EnumC596890Nb5("BYTE_SYNC", 0, "byte_sync");
        BYTE_SYNC = enumC596890Nb5;
        EnumC596890Nb5 enumC596890Nb52 = new EnumC596890Nb5("FRONTIER", 1, "frontier");
        FRONTIER = enumC596890Nb52;
        EnumC596890Nb5[] enumC596890Nb5Arr = {enumC596890Nb5, enumC596890Nb52};
        LLILLJJLI = enumC596890Nb5Arr;
        LLILLL = new C2254308sP(enumC596890Nb5Arr);
    }

    public static EnumC596890Nb5[] values() {
        return (EnumC596890Nb5[]) LLILLJJLI.clone();
    }

    public final String getChannel() {
        return this.LL;
    }

    public static EnumC596890Nb5 valueOf(String str) {
        return (EnumC596890Nb5) C08FF.LIZ(EnumC596890Nb5.class, str);
    }

    public EnumC596890Nb5(String str, int i, String str2) {
        this.LL = str2;
    }
}
