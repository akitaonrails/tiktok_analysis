package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC720100SMm {
    public static final EnumC720100SMm COLD_PRELOAD;
    public static final /* synthetic */ EnumC720100SMm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC720100SMm NONE;
    public static final EnumC720100SMm PLAYBACK;
    public static final EnumC720100SMm PRELOAD;
    public final int LL;

    public static InterfaceC2044707zh<EnumC720100SMm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC720100SMm enumC720100SMm = new EnumC720100SMm("NONE", 0, -1);
        NONE = enumC720100SMm;
        EnumC720100SMm enumC720100SMm2 = new EnumC720100SMm("PLAYBACK", 1, 1);
        PLAYBACK = enumC720100SMm2;
        EnumC720100SMm enumC720100SMm3 = new EnumC720100SMm("PRELOAD", 2, 2);
        PRELOAD = enumC720100SMm3;
        EnumC720100SMm enumC720100SMm4 = new EnumC720100SMm("COLD_PRELOAD", 3, 3);
        COLD_PRELOAD = enumC720100SMm4;
        EnumC720100SMm[] enumC720100SMmArr = {enumC720100SMm, enumC720100SMm2, enumC720100SMm3, enumC720100SMm4};
        LLILLJJLI = enumC720100SMmArr;
        LLILLL = new C2254308sP(enumC720100SMmArr);
    }

    public static EnumC720100SMm[] values() {
        return (EnumC720100SMm[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC720100SMm valueOf(String str) {
        return (EnumC720100SMm) C08FF.LIZ(EnumC720100SMm.class, str);
    }

    public EnumC720100SMm(String str, int i, int i2) {
        this.LL = i2;
    }
}
