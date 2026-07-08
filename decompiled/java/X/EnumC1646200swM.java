package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0swM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1646200swM {
    public static final EnumC1646200swM CAMERA_UPDATED;
    public static final EnumC1646200swM COVER_LOADED;
    public static final EnumC1646200swM IDLE;
    public static final EnumC1646200swM INIT;
    public static final /* synthetic */ EnumC1646200swM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1646200swM STARTED;
    public static final EnumC1646200swM SURFACE_CHANGED;

    public static InterfaceC2044707zh<EnumC1646200swM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1646200swM enumC1646200swM = new EnumC1646200swM("INIT", 0);
        INIT = enumC1646200swM;
        EnumC1646200swM enumC1646200swM2 = new EnumC1646200swM("STARTED", 1);
        STARTED = enumC1646200swM2;
        EnumC1646200swM enumC1646200swM3 = new EnumC1646200swM("COVER_LOADED", 2);
        COVER_LOADED = enumC1646200swM3;
        EnumC1646200swM enumC1646200swM4 = new EnumC1646200swM("SURFACE_CHANGED", 3);
        SURFACE_CHANGED = enumC1646200swM4;
        EnumC1646200swM enumC1646200swM5 = new EnumC1646200swM("CAMERA_UPDATED", 4);
        CAMERA_UPDATED = enumC1646200swM5;
        EnumC1646200swM enumC1646200swM6 = new EnumC1646200swM("IDLE", 5);
        IDLE = enumC1646200swM6;
        EnumC1646200swM[] enumC1646200swMArr = {enumC1646200swM, enumC1646200swM2, enumC1646200swM3, enumC1646200swM4, enumC1646200swM5, enumC1646200swM6};
        LL = enumC1646200swMArr;
        LLILLJJLI = new C2254308sP(enumC1646200swMArr);
    }

    public static EnumC1646200swM[] values() {
        return (EnumC1646200swM[]) LL.clone();
    }

    public static EnumC1646200swM valueOf(String str) {
        return (EnumC1646200swM) C08FF.LIZ(EnumC1646200swM.class, str);
    }

    public EnumC1646200swM(String str, int i) {
    }
}
