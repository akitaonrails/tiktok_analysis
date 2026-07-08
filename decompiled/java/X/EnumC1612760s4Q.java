package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1612760s4Q implements Serializable {
    public static final EnumC1612760s4Q ANCHOR;
    public static final EnumC1612760s4Q BOTTOM_BANNER;
    public static final EnumC1612760s4Q LIVE;
    public static final /* synthetic */ EnumC1612760s4Q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1612760s4Q SERIES_LIST;
    public static final EnumC1612760s4Q UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1612760s4Q> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1612760s4Q enumC1612760s4Q = new EnumC1612760s4Q("UNKNOWN", 0, 0);
        UNKNOWN = enumC1612760s4Q;
        EnumC1612760s4Q enumC1612760s4Q2 = new EnumC1612760s4Q("ANCHOR", 1, 1);
        ANCHOR = enumC1612760s4Q2;
        EnumC1612760s4Q enumC1612760s4Q3 = new EnumC1612760s4Q("SERIES_LIST", 2, 2);
        SERIES_LIST = enumC1612760s4Q3;
        EnumC1612760s4Q enumC1612760s4Q4 = new EnumC1612760s4Q("LIVE", 3, 3);
        LIVE = enumC1612760s4Q4;
        EnumC1612760s4Q enumC1612760s4Q5 = new EnumC1612760s4Q("BOTTOM_BANNER", 4, 4);
        BOTTOM_BANNER = enumC1612760s4Q5;
        EnumC1612760s4Q[] enumC1612760s4QArr = {enumC1612760s4Q, enumC1612760s4Q2, enumC1612760s4Q3, enumC1612760s4Q4, enumC1612760s4Q5};
        LLILLJJLI = enumC1612760s4QArr;
        LLILLL = new C2254308sP(enumC1612760s4QArr);
    }

    public static EnumC1612760s4Q[] values() {
        return (EnumC1612760s4Q[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1612760s4Q valueOf(String str) {
        return (EnumC1612760s4Q) C08FF.LIZ(EnumC1612760s4Q.class, str);
    }

    public EnumC1612760s4Q(String str, int i, int i2) {
        this.LL = i2;
    }
}
