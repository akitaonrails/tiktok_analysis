package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1175760gha implements Serializable {
    public static final EnumC1175760gha ACC_NEARBY;
    public static final /* synthetic */ EnumC1175760gha[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1175760gha REGION_POI_MAP_DISCOVERY;
    public static final EnumC1175760gha SCENE_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1175760gha> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1175760gha enumC1175760gha = new EnumC1175760gha("SCENE_UNKNOWN", 0, 0);
        SCENE_UNKNOWN = enumC1175760gha;
        EnumC1175760gha enumC1175760gha2 = new EnumC1175760gha("REGION_POI_MAP_DISCOVERY", 1, 1);
        REGION_POI_MAP_DISCOVERY = enumC1175760gha2;
        EnumC1175760gha enumC1175760gha3 = new EnumC1175760gha("ACC_NEARBY", 2, 2);
        ACC_NEARBY = enumC1175760gha3;
        EnumC1175760gha[] enumC1175760ghaArr = {enumC1175760gha, enumC1175760gha2, enumC1175760gha3};
        LLILLJJLI = enumC1175760ghaArr;
        LLILLL = new C2254308sP(enumC1175760ghaArr);
    }

    public static EnumC1175760gha[] values() {
        return (EnumC1175760gha[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static EnumC1175760gha valueOf(String str) {
        return (EnumC1175760gha) C08FF.LIZ(EnumC1175760gha.class, str);
    }

    public EnumC1175760gha(String str, int i, int i2) {
        this.LL = i2;
    }
}
