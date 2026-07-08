package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1813200xHi {
    public static final C1813230xHl Companion;
    public static final /* synthetic */ EnumC1813200xHi[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1813200xHi POSTED;
    public static final EnumC1813200xHi UNPOSTED;
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;

    public static InterfaceC2044707zh<EnumC1813200xHi> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0xHl] */
    static {
        EnumC1813200xHi enumC1813200xHi = new EnumC1813200xHi(0, 0, "UNPOSTED", "unposted", "highlight_draft");
        UNPOSTED = enumC1813200xHi;
        EnumC1813200xHi enumC1813200xHi2 = new EnumC1813200xHi(1, 1, "POSTED", "posted", "posted");
        POSTED = enumC1813200xHi2;
        EnumC1813200xHi[] enumC1813200xHiArr = {enumC1813200xHi, enumC1813200xHi2};
        LLILZ = enumC1813200xHiArr;
        LLILZIL = new C2254308sP(enumC1813200xHiArr);
        Companion = new Object() { // from class: X.0xHl
        };
    }

    public static EnumC1813200xHi[] values() {
        return (EnumC1813200xHi[]) LLILZ.clone();
    }

    public final String getLogName() {
        return this.LLILLL;
    }

    public final int getPosition() {
        return this.LLILLJJLI;
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1813200xHi valueOf(String str) {
        return (EnumC1813200xHi) C08FF.LIZ(EnumC1813200xHi.class, str);
    }

    public EnumC1813200xHi(int i, int i2, String str, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = i2;
        this.LLILLL = str3;
    }
}
