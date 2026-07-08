package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC821710WLh implements InterfaceC821860WLw {
    public static final C821720WLi Companion;
    public static final EnumC821710WLh JSI_RASP_BLOCKED;
    public static final /* synthetic */ EnumC821710WLh[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final Map<Integer, InterfaceC821860WLw> codeMap;
    public final int LL = 501;
    public final String LLILLJJLI = "Blocked by RASP";
    public Boolean LLILLL;

    public static InterfaceC2044707zh<EnumC821710WLh> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0WLi] */
    static {
        EnumC821710WLh enumC821710WLh = new EnumC821710WLh(Boolean.TRUE);
        JSI_RASP_BLOCKED = enumC821710WLh;
        EnumC821710WLh[] enumC821710WLhArr = {enumC821710WLh};
        LLILZ = enumC821710WLhArr;
        LLILZIL = new C2254308sP(enumC821710WLhArr);
        Companion = new Object() { // from class: X.0WLi
        };
        EnumC821710WLh[] enumC821710WLhArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC821710WLhArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC821710WLh enumC821710WLh2 : enumC821710WLhArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC821710WLh2.getCode()), enumC821710WLh2);
        }
        codeMap = linkedHashMap;
    }

    public static EnumC821710WLh[] values() {
        return (EnumC821710WLh[]) LLILZ.clone();
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

    public EnumC821710WLh(Boolean bool) {
        this.LLILLL = bool;
    }

    public static EnumC821710WLh valueOf(String str) {
        return (EnumC821710WLh) C08FF.LIZ(EnumC821710WLh.class, str);
    }

    public void setIntercept(Boolean bool) {
        this.LLILLL = bool;
    }
}
