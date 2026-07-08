package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WLd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC821670WLd implements InterfaceC821860WLw {
    public static final C821680WLe Companion;
    public static final EnumC821670WLd JSB_RASP_BLOCKED;
    public static final /* synthetic */ EnumC821670WLd[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final Map<Integer, InterfaceC821860WLw> codeMap;
    public final int LL = 501;
    public final String LLILLJJLI = "Blocked by RASP";
    public Boolean LLILLL;

    public static InterfaceC2044707zh<EnumC821670WLd> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0WLe] */
    static {
        EnumC821670WLd enumC821670WLd = new EnumC821670WLd(Boolean.TRUE);
        JSB_RASP_BLOCKED = enumC821670WLd;
        EnumC821670WLd[] enumC821670WLdArr = {enumC821670WLd};
        LLILZ = enumC821670WLdArr;
        LLILZIL = new C2254308sP(enumC821670WLdArr);
        Companion = new Object() { // from class: X.0WLe
        };
        EnumC821670WLd[] enumC821670WLdArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC821670WLdArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC821670WLd enumC821670WLd2 : enumC821670WLdArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC821670WLd2.getCode()), enumC821670WLd2);
        }
        codeMap = linkedHashMap;
    }

    public static EnumC821670WLd[] values() {
        return (EnumC821670WLd[]) LLILZ.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("code:");
        sbLIZ.append(getCode());
        sbLIZ.append("; message:");
        sbLIZ.append(getDescription());
        sbLIZ.append("; intercept:");
        sbLIZ.append(getIntercept());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC821860WLw
    public int getCode() {
        return this.LL;
    }

    @Override // X.InterfaceC821860WLw
    public String getDescription() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC821860WLw
    public Boolean getIntercept() {
        return this.LLILLL;
    }

    public EnumC821670WLd(Boolean bool) {
        this.LLILLL = bool;
    }

    public static EnumC821670WLd valueOf(String str) {
        return (EnumC821670WLd) C08FF.LIZ(EnumC821670WLd.class, str);
    }

    public void setIntercept(Boolean bool) {
        this.LLILLL = bool;
    }
}
