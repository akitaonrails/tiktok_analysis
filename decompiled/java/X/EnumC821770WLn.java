package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC821770WLn implements InterfaceC821860WLw {
    public static final C821840WLu Companion;
    public static final /* synthetic */ EnumC821770WLn[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC821770WLn WEB_NAVIGATION_RAW_WEBVIEW_BLOCKED;
    public static final EnumC821770WLn WEB_NAVIGATION_URL_DIFF_BLOCKED;
    public static final Map<Integer, InterfaceC821860WLw> codeMap;
    public final int LL;
    public final String LLILLJJLI;
    public Boolean LLILLL;

    public static InterfaceC2044707zh<EnumC821770WLn> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0WLu] */
    static {
        Boolean bool = Boolean.TRUE;
        EnumC821770WLn enumC821770WLn = new EnumC821770WLn("WEB_NAVIGATION_URL_DIFF_BLOCKED", 0, 101, "web navigation url diff", bool);
        WEB_NAVIGATION_URL_DIFF_BLOCKED = enumC821770WLn;
        EnumC821770WLn enumC821770WLn2 = new EnumC821770WLn("WEB_NAVIGATION_RAW_WEBVIEW_BLOCKED", 1, 102, "web navigation raw webview blocked", bool);
        WEB_NAVIGATION_RAW_WEBVIEW_BLOCKED = enumC821770WLn2;
        EnumC821770WLn[] enumC821770WLnArr = {enumC821770WLn, enumC821770WLn2};
        LLILZ = enumC821770WLnArr;
        LLILZIL = new C2254308sP(enumC821770WLnArr);
        Companion = new Object() { // from class: X.0WLu
        };
        EnumC821770WLn[] enumC821770WLnArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC821770WLnArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC821770WLn enumC821770WLn3 : enumC821770WLnArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC821770WLn3.getCode()), enumC821770WLn3);
        }
        codeMap = linkedHashMap;
    }

    public static EnumC821770WLn[] values() {
        return (EnumC821770WLn[]) LLILZ.clone();
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

    public static EnumC821770WLn valueOf(String str) {
        return (EnumC821770WLn) C08FF.LIZ(EnumC821770WLn.class, str);
    }

    public void setIntercept(Boolean bool) {
        this.LLILLL = bool;
    }

    public EnumC821770WLn(String str, int i, int i2, String str2, Boolean bool) {
        this.LL = i2;
        this.LLILLJJLI = str2;
        this.LLILLL = bool;
    }
}
