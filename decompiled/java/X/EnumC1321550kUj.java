package X;

import kotlin.Pair;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1321550kUj {
    public static final EnumC1321550kUj LL;
    public static final EnumC1321550kUj LLILLJJLI;
    public static final EnumC1321550kUj LLILLL;
    public static final EnumC1321550kUj LLILZ;
    public static final /* synthetic */ EnumC1321550kUj[] LLILZIL;

    static {
        EnumC1321550kUj enumC1321550kUj = new EnumC1321550kUj("TOP_LEFT", 0);
        LL = enumC1321550kUj;
        EnumC1321550kUj enumC1321550kUj2 = new EnumC1321550kUj("TOP_RIGHT", 1);
        LLILLJJLI = enumC1321550kUj2;
        EnumC1321550kUj enumC1321550kUj3 = new EnumC1321550kUj("BOTTOM_RIGHT", 2);
        LLILLL = enumC1321550kUj3;
        EnumC1321550kUj enumC1321550kUj4 = new EnumC1321550kUj("BOTTOM_LEFT", 3);
        LLILZ = enumC1321550kUj4;
        EnumC1321550kUj[] enumC1321550kUjArr = {enumC1321550kUj, enumC1321550kUj2, enumC1321550kUj3, enumC1321550kUj4};
        LLILZIL = enumC1321550kUjArr;
        new C2254308sP(enumC1321550kUjArr);
    }

    public static EnumC1321550kUj[] values() {
        return (EnumC1321550kUj[]) LLILZIL.clone();
    }

    public static EnumC1321550kUj valueOf(String str) {
        return (EnumC1321550kUj) C08FF.LIZ(EnumC1321550kUj.class, str);
    }

    public EnumC1321550kUj(String str, int i) {
    }

    public final Pair<Float, Float> LIZJ(float f, float f2) {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return new Pair<>(Float.valueOf(f2), Float.valueOf(-f));
                    }
                    throw new C1954807lC();
                }
                return new Pair<>(Float.valueOf(-f), Float.valueOf(-f2));
            }
            return new Pair<>(Float.valueOf(-f2), Float.valueOf(f));
        }
        return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
    }
}
