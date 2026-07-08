package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PvJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC660390PvJ {
    public static final EnumC660390PvJ AIGC_LABEL;
    public static final EnumC660390PvJ BIG_COMMENT;
    public static final /* synthetic */ EnumC660390PvJ[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC660390PvJ NO_PRIORITY;
    public static final EnumC660390PvJ PHOTO_COMMENT;
    public static final EnumC660390PvJ PHOTO_POI;
    public static final EnumC660390PvJ PHOTO_POI_COMPONENT_TYPE;
    public final int LL;
    public final InterfaceC660490PvT LLILLJJLI;

    public static InterfaceC2044707zh<EnumC660390PvJ> getEntries() {
        return LLILZ;
    }

    static {
        EnumC660390PvJ enumC660390PvJ = new EnumC660390PvJ("PHOTO_POI_COMPONENT_TYPE", 0, 40, new InterfaceC660490PvT() { // from class: X.0Pvb
        });
        PHOTO_POI_COMPONENT_TYPE = enumC660390PvJ;
        EnumC660390PvJ enumC660390PvJ2 = new EnumC660390PvJ("PHOTO_POI", 1, 40, C660560Pva.LIZ);
        PHOTO_POI = enumC660390PvJ2;
        EnumC660390PvJ enumC660390PvJ3 = new EnumC660390PvJ("PHOTO_COMMENT", 2, 60, C660550PvZ.LIZ);
        PHOTO_COMMENT = enumC660390PvJ3;
        EnumC660390PvJ enumC660390PvJ4 = new EnumC660390PvJ("BIG_COMMENT", 3, 61, C660540PvY.LIZ);
        BIG_COMMENT = enumC660390PvJ4;
        EnumC660390PvJ enumC660390PvJ5 = new EnumC660390PvJ("AIGC_LABEL", 4, 65, new InterfaceC660490PvT() { // from class: X.0PvX
        });
        AIGC_LABEL = enumC660390PvJ5;
        EnumC660390PvJ enumC660390PvJ6 = new EnumC660390PvJ("NO_PRIORITY", 5, Integer.MAX_VALUE, C659270PtV.LIZ);
        NO_PRIORITY = enumC660390PvJ6;
        EnumC660390PvJ[] enumC660390PvJArr = {enumC660390PvJ, enumC660390PvJ2, enumC660390PvJ3, enumC660390PvJ4, enumC660390PvJ5, enumC660390PvJ6};
        LLILLL = enumC660390PvJArr;
        LLILZ = new C2254308sP(enumC660390PvJArr);
    }

    public static EnumC660390PvJ[] values() {
        return (EnumC660390PvJ[]) LLILLL.clone();
    }

    public final InterfaceC660490PvT getAnchorNewType() {
        return this.LLILLJJLI;
    }

    public final int getPriority() {
        return this.LL;
    }

    public static EnumC660390PvJ valueOf(String str) {
        return (EnumC660390PvJ) C08FF.LIZ(EnumC660390PvJ.class, str);
    }

    public EnumC660390PvJ(String str, int i, int i2, InterfaceC660490PvT interfaceC660490PvT) {
        this.LL = i2;
        this.LLILLJJLI = interfaceC660490PvT;
    }
}
