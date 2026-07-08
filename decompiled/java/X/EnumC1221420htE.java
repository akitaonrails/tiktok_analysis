package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0htE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1221420htE {
    public static final EnumC1221420htE AVATAR_CHANGE;
    public static final EnumC1221420htE DOWNLOAD_ALL_SELECTED;
    public static final EnumC1221420htE DOWNLOAD_NOT_ALL_SELECTED;
    public static final /* synthetic */ EnumC1221420htE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final boolean LL;

    public static InterfaceC2044707zh<EnumC1221420htE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1221420htE enumC1221420htE = new EnumC1221420htE("DOWNLOAD_ALL_SELECTED", 0, true);
        DOWNLOAD_ALL_SELECTED = enumC1221420htE;
        EnumC1221420htE enumC1221420htE2 = new EnumC1221420htE("DOWNLOAD_NOT_ALL_SELECTED", 1, true);
        DOWNLOAD_NOT_ALL_SELECTED = enumC1221420htE2;
        EnumC1221420htE enumC1221420htE3 = new EnumC1221420htE("AVATAR_CHANGE", 2, false);
        AVATAR_CHANGE = enumC1221420htE3;
        EnumC1221420htE[] enumC1221420htEArr = {enumC1221420htE, enumC1221420htE2, enumC1221420htE3};
        LLILLJJLI = enumC1221420htEArr;
        LLILLL = new C2254308sP(enumC1221420htEArr);
    }

    public static EnumC1221420htE[] values() {
        return (EnumC1221420htE[]) LLILLJJLI.clone();
    }

    public final boolean isDownload() {
        return this.LL;
    }

    public static EnumC1221420htE valueOf(String str) {
        return (EnumC1221420htE) C08FF.LIZ(EnumC1221420htE.class, str);
    }

    public EnumC1221420htE(String str, int i, boolean z) {
        this.LL = z;
    }
}
