package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1771620wCe {
    public static final EnumC1771620wCe FIRST_CHUNK;
    public static final /* synthetic */ EnumC1771620wCe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1771620wCe SECOND_CHUNK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1771620wCe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1771620wCe enumC1771620wCe = new EnumC1771620wCe("FIRST_CHUNK", 0, "first_chunk");
        FIRST_CHUNK = enumC1771620wCe;
        EnumC1771620wCe enumC1771620wCe2 = new EnumC1771620wCe("SECOND_CHUNK", 1, "second_chunk");
        SECOND_CHUNK = enumC1771620wCe2;
        EnumC1771620wCe[] enumC1771620wCeArr = {enumC1771620wCe, enumC1771620wCe2};
        LLILLJJLI = enumC1771620wCeArr;
        LLILLL = new C2254308sP(enumC1771620wCeArr);
    }

    public static EnumC1771620wCe[] values() {
        return (EnumC1771620wCe[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1771620wCe valueOf(String str) {
        return (EnumC1771620wCe) C08FF.LIZ(EnumC1771620wCe.class, str);
    }

    public EnumC1771620wCe(String str, int i, String str2) {
        this.LL = str2;
    }
}
