package X;

/* JADX INFO: renamed from: X.1AFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2176421AFs {
    V3_EVENT(0),
    V1_EVENT(1),
    LOG_DATA(2),
    LAUNCH(3),
    TERMINATE(4),
    ITEM_IMPRESSION(5);

    public final int LL;

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(name());
        sbLIZ.append("-");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getLabel() {
        return this.LL;
    }

    public static EnumC2176421AFs fromLabel(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return V3_EVENT;
                    }
                    return TERMINATE;
                }
                return LAUNCH;
            }
            return LOG_DATA;
        }
        return V1_EVENT;
    }

    public static EnumC2176421AFs parse(String str) {
        for (EnumC2176421AFs enumC2176421AFs : values()) {
            if (enumC2176421AFs.name().equals(str)) {
                return enumC2176421AFs;
            }
        }
        return V3_EVENT;
    }

    public static EnumC2176421AFs valueOf(String str) {
        return (EnumC2176421AFs) C08FF.LIZ(EnumC2176421AFs.class, str);
    }

    EnumC2176421AFs(int i) {
        this.LL = i;
    }
}
