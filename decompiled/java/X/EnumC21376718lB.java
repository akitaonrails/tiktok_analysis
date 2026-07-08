package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18lB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21376718lB {
    public static final C21376818lC Companion;
    public static final EnumC21376718lB LARGE;
    public static final /* synthetic */ EnumC21376718lB[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC21376718lB NORMAL;
    public static final Map<Integer, EnumC21376718lB> map;
    public final int LL;
    public final float LLILLJJLI;

    public static InterfaceC2044707zh<EnumC21376718lB> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.18lC] */
    static {
        EnumC21376718lB enumC21376718lB = new EnumC21376718lB(0, 0, 0.56f, "NORMAL");
        NORMAL = enumC21376718lB;
        EnumC21376718lB enumC21376718lB2 = new EnumC21376718lB(1, 1, 0.72f, "LARGE");
        LARGE = enumC21376718lB2;
        EnumC21376718lB[] enumC21376718lBArr = {enumC21376718lB, enumC21376718lB2};
        LLILLL = enumC21376718lBArr;
        LLILZ = new C2254308sP(enumC21376718lBArr);
        Companion = new Object() { // from class: X.18lC
        };
        EnumC21376718lB[] enumC21376718lBArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC21376718lBArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC21376718lB enumC21376718lB3 : enumC21376718lBArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC21376718lB3.LL), enumC21376718lB3);
        }
        map = linkedHashMap;
    }

    public static EnumC21376718lB[] values() {
        return (EnumC21376718lB[]) LLILLL.clone();
    }

    public final float getScale() {
        return this.LLILLJJLI;
    }

    public final int getSize() {
        return this.LL;
    }

    public static EnumC21376718lB valueOf(String str) {
        return (EnumC21376718lB) C08FF.LIZ(EnumC21376718lB.class, str);
    }

    public EnumC21376718lB(int i, int i2, float f, String str) {
        this.LL = i2;
        this.LLILLJJLI = f;
    }
}
