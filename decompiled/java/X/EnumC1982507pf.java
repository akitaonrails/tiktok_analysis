package X;

import java.util.HashMap;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.07pf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC1982507pf implements InterfaceC205300qh {
    LEFT_PAREN(e3.h),
    RIGHT_PAREN(")"),
    LEFT_BRACKET(e3.e),
    RIGHT_BRACKET(e3.f),
    COMMA(",");

    public static final Map<String, EnumC1982507pf> LLILLJJLI;
    public final String LL;

    static {
        HashMap map = new HashMap(128);
        LLILLJJLI = map;
        for (EnumC1982507pf enumC1982507pf : map.values()) {
            LLILLJJLI.put(enumC1982507pf.getLiterals(), enumC1982507pf);
        }
    }

    public String getLiterals() {
        return this.LL;
    }

    public static boolean isSymbol(InterfaceC205300qh interfaceC205300qh) {
        return interfaceC205300qh instanceof EnumC1982507pf;
    }

    public static EnumC1982507pf literalsOf(String str) {
        return (EnumC1982507pf) ((HashMap) LLILLJJLI).get(str);
    }

    public static EnumC1982507pf valueOf(String str) {
        return (EnumC1982507pf) C08FF.LIZ(EnumC1982507pf.class, str);
    }

    EnumC1982507pf(String str) {
        this.LL = str;
    }
}
