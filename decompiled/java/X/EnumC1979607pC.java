package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.07pC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC1979607pC implements InterfaceC205300qh {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD("%", 4);

    public static final Map<String, EnumC1979607pC> LLILLL = new HashMap(128);
    public static final Set<EnumC1979607pC> LLILZ = new HashSet();
    public final String LL;
    public final int LLILLJJLI;

    static {
        for (EnumC1979607pC enumC1979607pC : values()) {
            LLILLL.put(enumC1979607pC.getLiterals(), enumC1979607pC);
            LLILZ.add(enumC1979607pC);
        }
    }

    public String getLiterals() {
        return this.LL;
    }

    public int getPriority() {
        return this.LLILLJJLI;
    }

    public static boolean isOperator(InterfaceC205300qh interfaceC205300qh) {
        return interfaceC205300qh instanceof EnumC1979607pC;
    }

    public static EnumC1979607pC literalsOf(String str) {
        return (EnumC1979607pC) ((HashMap) LLILLL).get(str);
    }

    public static EnumC1979607pC valueOf(String str) {
        return (EnumC1979607pC) C08FF.LIZ(EnumC1979607pC.class, str);
    }

    EnumC1979607pC(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
