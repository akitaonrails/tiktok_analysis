package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15rJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20650315rJ {
    public static final /* synthetic */ EnumC20650315rJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20650315rJ SYNCED;
    public static final EnumC20650315rJ SYNCING;
    public static final EnumC20650315rJ UN_SYNCED;

    public static InterfaceC2044707zh<EnumC20650315rJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20650315rJ enumC20650315rJ = new EnumC20650315rJ("SYNCING", 0);
        SYNCING = enumC20650315rJ;
        EnumC20650315rJ enumC20650315rJ2 = new EnumC20650315rJ("UN_SYNCED", 1);
        UN_SYNCED = enumC20650315rJ2;
        EnumC20650315rJ enumC20650315rJ3 = new EnumC20650315rJ("SYNCED", 2);
        SYNCED = enumC20650315rJ3;
        EnumC20650315rJ[] enumC20650315rJArr = {enumC20650315rJ, enumC20650315rJ2, enumC20650315rJ3};
        LL = enumC20650315rJArr;
        LLILLJJLI = new C2254308sP(enumC20650315rJArr);
    }

    public static EnumC20650315rJ[] values() {
        return (EnumC20650315rJ[]) LL.clone();
    }

    public static EnumC20650315rJ valueOf(String str) {
        return (EnumC20650315rJ) C08FF.LIZ(EnumC20650315rJ.class, str);
    }

    public EnumC20650315rJ(String str, int i) {
    }
}
