package X;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00de, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC124400de {
    public static final C124500df Companion;
    public static final EnumC124400de DOCUMENT;
    public static final EnumC124400de ID;
    public static final /* synthetic */ EnumC124400de[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final float LL;

    public static InterfaceC2044707zh<EnumC124400de> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.00df] */
    static {
        EnumC124400de enumC124400de = new EnumC124400de(0.0f, "DOCUMENT", 0);
        DOCUMENT = enumC124400de;
        EnumC124400de enumC124400de2 = new EnumC124400de(1.0f, "ID", 1);
        ID = enumC124400de2;
        EnumC124400de[] enumC124400deArr = {enumC124400de, enumC124400de2};
        LLILLJJLI = enumC124400deArr;
        LLILLL = new C2254308sP(enumC124400deArr);
        Companion = new Object() { // from class: X.00df
        };
        InterfaceC2044707zh<EnumC124400de> entries = getEntries();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC124400de enumC124400de3 : entries) {
            linkedHashMap.put(Float.valueOf(enumC124400de3.LL), enumC124400de3);
        }
    }

    public static EnumC124400de[] values() {
        return (EnumC124400de[]) LLILLJJLI.clone();
    }

    public final float getId() {
        return this.LL;
    }

    public static EnumC124400de valueOf(String str) {
        return (EnumC124400de) C08FF.LIZ(EnumC124400de.class, str);
    }

    public EnumC124400de(float f, String str, int i) {
        this.LL = f;
    }
}
