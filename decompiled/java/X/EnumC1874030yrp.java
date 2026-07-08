package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yrp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1874030yrp {
    public static final EnumC1874030yrp ARRAY;
    public static final EnumC1874030yrp BOOL;
    public static final C1873090yqJ Companion;
    public static final EnumC1874030yrp DOUBLE;
    public static final EnumC1874030yrp FLOAT;
    public static final EnumC1874030yrp INT32;
    public static final /* synthetic */ EnumC1874030yrp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1874030yrp LONG;
    public static final EnumC1874030yrp NUMBER;
    public static final EnumC1874030yrp OBJECT;
    public static final EnumC1874030yrp STRING;
    public static final EnumC1874030yrp UNSUPPORTED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1874030yrp> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0yqJ] */
    static {
        EnumC1874030yrp enumC1874030yrp = new EnumC1874030yrp("STRING", 0, "string");
        STRING = enumC1874030yrp;
        EnumC1874030yrp enumC1874030yrp2 = new EnumC1874030yrp("BOOL", 1, "bool");
        BOOL = enumC1874030yrp2;
        EnumC1874030yrp enumC1874030yrp3 = new EnumC1874030yrp("NUMBER", 2, "number");
        NUMBER = enumC1874030yrp3;
        EnumC1874030yrp enumC1874030yrp4 = new EnumC1874030yrp("OBJECT", 3, "object");
        OBJECT = enumC1874030yrp4;
        EnumC1874030yrp enumC1874030yrp5 = new EnumC1874030yrp("ARRAY", 4, "array");
        ARRAY = enumC1874030yrp5;
        EnumC1874030yrp enumC1874030yrp6 = new EnumC1874030yrp("INT32", 5, "int32");
        INT32 = enumC1874030yrp6;
        EnumC1874030yrp enumC1874030yrp7 = new EnumC1874030yrp("LONG", 6, "long");
        LONG = enumC1874030yrp7;
        EnumC1874030yrp enumC1874030yrp8 = new EnumC1874030yrp("FLOAT", 7, "float");
        FLOAT = enumC1874030yrp8;
        EnumC1874030yrp enumC1874030yrp9 = new EnumC1874030yrp("DOUBLE", 8, "double");
        DOUBLE = enumC1874030yrp9;
        EnumC1874030yrp enumC1874030yrp10 = new EnumC1874030yrp("UNSUPPORTED", 9, null);
        UNSUPPORTED = enumC1874030yrp10;
        EnumC1874030yrp[] enumC1874030yrpArr = {enumC1874030yrp, enumC1874030yrp2, enumC1874030yrp3, enumC1874030yrp4, enumC1874030yrp5, enumC1874030yrp6, enumC1874030yrp7, enumC1874030yrp8, enumC1874030yrp9, enumC1874030yrp10};
        LLILLJJLI = enumC1874030yrpArr;
        LLILLL = new C2254308sP(enumC1874030yrpArr);
        Companion = new Object() { // from class: X.0yqJ
        };
    }

    public static EnumC1874030yrp[] values() {
        return (EnumC1874030yrp[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static final EnumC1874030yrp getValueByType(String str) {
        Companion.getClass();
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return UNSUPPORTED;
        }
    }

    public static EnumC1874030yrp valueOf(String str) {
        return (EnumC1874030yrp) C08FF.LIZ(EnumC1874030yrp.class, str);
    }

    public EnumC1874030yrp(String str, int i, String str2) {
        this.LL = str2;
    }
}
