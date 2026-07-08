package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ggy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1175380ggy implements Serializable {
    public static final /* synthetic */ EnumC1175380ggy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1175380ggy SCENE_DISCOVERY_MAP_MODE;
    public static final EnumC1175380ggy SCENE_DISCOVERY_ONE;
    public static final EnumC1175380ggy SCENE_NON_REGION_POI_DETAIL;
    public static final EnumC1175380ggy SCENE_NON_REGION_POI_DETAIL_LANDING;
    public static final EnumC1175380ggy SCENE_REGION_POI_DETAIL;
    public static final EnumC1175380ggy SCENE_REGION_POI_DETAIL_LANDING;
    public static final EnumC1175380ggy SCENE_SEARCH_HOT_CARD;
    public static final EnumC1175380ggy SCENE_SEARCH_POI_CARD;
    public static final EnumC1175380ggy SCENE_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1175380ggy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1175380ggy enumC1175380ggy = new EnumC1175380ggy("SCENE_UNKNOWN", 0, 0);
        SCENE_UNKNOWN = enumC1175380ggy;
        EnumC1175380ggy enumC1175380ggy2 = new EnumC1175380ggy("SCENE_DISCOVERY_ONE", 1, 1);
        SCENE_DISCOVERY_ONE = enumC1175380ggy2;
        EnumC1175380ggy enumC1175380ggy3 = new EnumC1175380ggy("SCENE_DISCOVERY_MAP_MODE", 2, 2);
        SCENE_DISCOVERY_MAP_MODE = enumC1175380ggy3;
        EnumC1175380ggy enumC1175380ggy4 = new EnumC1175380ggy("SCENE_SEARCH_POI_CARD", 3, 3);
        SCENE_SEARCH_POI_CARD = enumC1175380ggy4;
        EnumC1175380ggy enumC1175380ggy5 = new EnumC1175380ggy("SCENE_SEARCH_HOT_CARD", 4, 4);
        SCENE_SEARCH_HOT_CARD = enumC1175380ggy5;
        EnumC1175380ggy enumC1175380ggy6 = new EnumC1175380ggy("SCENE_REGION_POI_DETAIL", 5, 5);
        SCENE_REGION_POI_DETAIL = enumC1175380ggy6;
        EnumC1175380ggy enumC1175380ggy7 = new EnumC1175380ggy("SCENE_REGION_POI_DETAIL_LANDING", 6, 6);
        SCENE_REGION_POI_DETAIL_LANDING = enumC1175380ggy7;
        EnumC1175380ggy enumC1175380ggy8 = new EnumC1175380ggy("SCENE_NON_REGION_POI_DETAIL_LANDING", 7, 7);
        SCENE_NON_REGION_POI_DETAIL_LANDING = enumC1175380ggy8;
        EnumC1175380ggy enumC1175380ggy9 = new EnumC1175380ggy("SCENE_NON_REGION_POI_DETAIL", 8, 8);
        SCENE_NON_REGION_POI_DETAIL = enumC1175380ggy9;
        EnumC1175380ggy[] enumC1175380ggyArr = {enumC1175380ggy, enumC1175380ggy2, enumC1175380ggy3, enumC1175380ggy4, enumC1175380ggy5, enumC1175380ggy6, enumC1175380ggy7, enumC1175380ggy8, enumC1175380ggy9};
        LLILLJJLI = enumC1175380ggyArr;
        LLILLL = new C2254308sP(enumC1175380ggyArr);
    }

    public static EnumC1175380ggy[] values() {
        return (EnumC1175380ggy[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static EnumC1175380ggy valueOf(String str) {
        return (EnumC1175380ggy) C08FF.LIZ(EnumC1175380ggy.class, str);
    }

    public EnumC1175380ggy(String str, int i, int i2) {
        this.LL = i2;
    }
}
