package X;

import java.util.ArrayList;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0md3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1403590md3 {
    public static final C1403580md2 Companion;
    public static final EnumC1403590md3 EFFECT_LIST;
    public static final EnumC1403590md3 EFFECT_RESOURCE_ID_LIST;
    public static final /* synthetic */ EnumC1403590md3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final Set<String> PARAM_SET;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1403590md3> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0md2] */
    static {
        EnumC1403590md3 enumC1403590md3 = new EnumC1403590md3("EFFECT_LIST", 0, "effect_list");
        EFFECT_LIST = enumC1403590md3;
        EnumC1403590md3 enumC1403590md32 = new EnumC1403590md3("EFFECT_RESOURCE_ID_LIST", 1, "effect_resource_id_list");
        EFFECT_RESOURCE_ID_LIST = enumC1403590md32;
        EnumC1403590md3[] enumC1403590md3Arr = {enumC1403590md3, enumC1403590md32};
        LLILLJJLI = enumC1403590md3Arr;
        LLILLL = new C2254308sP(enumC1403590md3Arr);
        Companion = new Object() { // from class: X.0md2
        };
        EnumC1403590md3[] enumC1403590md3ArrValues = values();
        ArrayList arrayList = new ArrayList(enumC1403590md3ArrValues.length);
        for (EnumC1403590md3 enumC1403590md33 : enumC1403590md3ArrValues) {
            arrayList.add(enumC1403590md33.LL);
        }
        PARAM_SET = C13LP.LLIIJI(arrayList);
    }

    public static EnumC1403590md3[] values() {
        return (EnumC1403590md3[]) LLILLJJLI.clone();
    }

    public final String getParamName() {
        return this.LL;
    }

    public static EnumC1403590md3 valueOf(String str) {
        return (EnumC1403590md3) C08FF.LIZ(EnumC1403590md3.class, str);
    }

    public EnumC1403590md3(String str, int i, String str2) {
        this.LL = str2;
    }
}
