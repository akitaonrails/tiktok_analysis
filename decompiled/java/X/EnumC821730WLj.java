package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC821730WLj implements InterfaceC821860WLw {
    public static final C821740WLk Companion;
    public static final EnumC821730WLj JSINJECTION_RASP_BLOCKED;
    public static final /* synthetic */ EnumC821730WLj[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final Map<Integer, InterfaceC821860WLw> codeMap;
    public final int LL = 501;
    public final String LLILLJJLI = "jsinjection_blocked_by_RASP";
    public Boolean LLILLL;

    public static InterfaceC2044707zh<EnumC821730WLj> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0WLk] */
    static {
        EnumC821730WLj enumC821730WLj = new EnumC821730WLj(Boolean.TRUE);
        JSINJECTION_RASP_BLOCKED = enumC821730WLj;
        EnumC821730WLj[] enumC821730WLjArr = {enumC821730WLj};
        LLILZ = enumC821730WLjArr;
        LLILZIL = new C2254308sP(enumC821730WLjArr);
        Companion = new Object() { // from class: X.0WLk
        };
        EnumC821730WLj[] enumC821730WLjArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC821730WLjArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC821730WLj enumC821730WLj2 : enumC821730WLjArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC821730WLj2.getCode()), enumC821730WLj2);
        }
        codeMap = linkedHashMap;
    }

    public static EnumC821730WLj[] values() {
        return (EnumC821730WLj[]) LLILZ.clone();
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

    public EnumC821730WLj(Boolean bool) {
        this.LLILLL = bool;
    }

    public static EnumC821730WLj valueOf(String str) {
        return (EnumC821730WLj) C08FF.LIZ(EnumC821730WLj.class, str);
    }

    public void setIntercept(Boolean bool) {
        this.LLILLL = bool;
    }
}
