package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Kbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC520880Kbm {
    public static final EnumC520880Kbm DISABLED;
    public static final EnumC520880Kbm INUSE;
    public static final /* synthetic */ EnumC520880Kbm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC520880Kbm READY;

    public static InterfaceC2044707zh<EnumC520880Kbm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC520880Kbm enumC520880Kbm = new EnumC520880Kbm("DISABLED", 0);
        DISABLED = enumC520880Kbm;
        EnumC520880Kbm enumC520880Kbm2 = new EnumC520880Kbm("READY", 1);
        READY = enumC520880Kbm2;
        EnumC520880Kbm enumC520880Kbm3 = new EnumC520880Kbm("INUSE", 2);
        INUSE = enumC520880Kbm3;
        EnumC520880Kbm[] enumC520880KbmArr = {enumC520880Kbm, enumC520880Kbm2, enumC520880Kbm3};
        LL = enumC520880KbmArr;
        LLILLJJLI = new C2254308sP(enumC520880KbmArr);
    }

    public static EnumC520880Kbm[] values() {
        return (EnumC520880Kbm[]) LL.clone();
    }

    public static EnumC520880Kbm valueOf(String str) {
        return (EnumC520880Kbm) C08FF.LIZ(EnumC520880Kbm.class, str);
    }

    public EnumC520880Kbm(String str, int i) {
    }
}
