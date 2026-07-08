package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hsu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1221220hsu {
    public static final EnumC1221220hsu DOWNLOADING;
    public static final EnumC1221220hsu IDLE;
    public static final /* synthetic */ EnumC1221220hsu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1221220hsu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1221220hsu enumC1221220hsu = new EnumC1221220hsu("IDLE", 0);
        IDLE = enumC1221220hsu;
        EnumC1221220hsu enumC1221220hsu2 = new EnumC1221220hsu("DOWNLOADING", 1);
        DOWNLOADING = enumC1221220hsu2;
        EnumC1221220hsu[] enumC1221220hsuArr = {enumC1221220hsu, enumC1221220hsu2};
        LL = enumC1221220hsuArr;
        LLILLJJLI = new C2254308sP(enumC1221220hsuArr);
    }

    public static EnumC1221220hsu[] values() {
        return (EnumC1221220hsu[]) LL.clone();
    }

    public static EnumC1221220hsu valueOf(String str) {
        return (EnumC1221220hsu) C08FF.LIZ(EnumC1221220hsu.class, str);
    }

    public EnumC1221220hsu(String str, int i) {
    }
}
