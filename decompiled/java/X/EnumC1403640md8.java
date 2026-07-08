package X;

import java.util.ArrayList;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0md8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1403640md8 {
    public static final C1403600md4 Companion;
    public static final EnumC1403640md8 EFFECT_SOURCE;
    public static final EnumC1403640md8 IS_PROP_PANEL_CACHE_LIST;
    public static final /* synthetic */ EnumC1403640md8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1403640md8 MET_PARENT_RESOURCE_IDS;
    public static final Set<String> PARAM_SET;
    public static final EnumC1403640md8 PROP_CATEGORY;
    public static final EnumC1403640md8 PROP_IMPR_POSITION;
    public static final EnumC1403640md8 PROP_LIST;
    public static final EnumC1403640md8 PROP_PANEL_DELIVERY_SOURCE;
    public static final EnumC1403640md8 PROP_PANEL_PIN_TYPE;
    public static final EnumC1403640md8 PROP_SELECTED_FROM;
    public static final EnumC1403640md8 RESOURCE_LIST;
    public static final EnumC1403640md8 TAB_KEY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1403640md8> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.0md4] */
    static {
        EnumC1403640md8 enumC1403640md8 = new EnumC1403640md8("PROP_LIST", 0, "prop_list");
        PROP_LIST = enumC1403640md8;
        EnumC1403640md8 enumC1403640md82 = new EnumC1403640md8("RESOURCE_LIST", 1, "resource_list");
        RESOURCE_LIST = enumC1403640md82;
        EnumC1403640md8 enumC1403640md83 = new EnumC1403640md8("EFFECT_SOURCE", 2, "effect_source");
        EFFECT_SOURCE = enumC1403640md83;
        EnumC1403640md8 enumC1403640md84 = new EnumC1403640md8("PROP_SELECTED_FROM", 3, "prop_selected_from");
        PROP_SELECTED_FROM = enumC1403640md84;
        EnumC1403640md8 enumC1403640md85 = new EnumC1403640md8("MET_PARENT_RESOURCE_IDS", 4, "met_parent_resource_ids");
        MET_PARENT_RESOURCE_IDS = enumC1403640md85;
        EnumC1403640md8 enumC1403640md86 = new EnumC1403640md8("TAB_KEY", 5, "tab_key");
        TAB_KEY = enumC1403640md86;
        EnumC1403640md8 enumC1403640md87 = new EnumC1403640md8("PROP_IMPR_POSITION", 6, "prop_impr_position");
        PROP_IMPR_POSITION = enumC1403640md87;
        EnumC1403640md8 enumC1403640md88 = new EnumC1403640md8("PROP_PANEL_PIN_TYPE", 7, "prop_panel_pin_type");
        PROP_PANEL_PIN_TYPE = enumC1403640md88;
        EnumC1403640md8 enumC1403640md89 = new EnumC1403640md8("PROP_CATEGORY", 8, "prop_category");
        PROP_CATEGORY = enumC1403640md89;
        EnumC1403640md8 enumC1403640md810 = new EnumC1403640md8("IS_PROP_PANEL_CACHE_LIST", 9, "is_prop_panel_cache_list");
        IS_PROP_PANEL_CACHE_LIST = enumC1403640md810;
        EnumC1403640md8 enumC1403640md811 = new EnumC1403640md8("PROP_PANEL_DELIVERY_SOURCE", 10, "prop_panel_delivery_source");
        PROP_PANEL_DELIVERY_SOURCE = enumC1403640md811;
        EnumC1403640md8[] enumC1403640md8Arr = {enumC1403640md8, enumC1403640md82, enumC1403640md83, enumC1403640md84, enumC1403640md85, enumC1403640md86, enumC1403640md87, enumC1403640md88, enumC1403640md89, enumC1403640md810, enumC1403640md811};
        LLILLJJLI = enumC1403640md8Arr;
        LLILLL = new C2254308sP(enumC1403640md8Arr);
        Companion = new Object() { // from class: X.0md4
        };
        EnumC1403640md8[] enumC1403640md8ArrValues = values();
        ArrayList arrayList = new ArrayList(enumC1403640md8ArrValues.length);
        for (EnumC1403640md8 enumC1403640md812 : enumC1403640md8ArrValues) {
            arrayList.add(enumC1403640md812.LL);
        }
        PARAM_SET = C13LP.LLIIJI(arrayList);
    }

    public static EnumC1403640md8[] values() {
        return (EnumC1403640md8[]) LLILLJJLI.clone();
    }

    public final String getParamName() {
        return this.LL;
    }

    public static EnumC1403640md8 valueOf(String str) {
        return (EnumC1403640md8) C08FF.LIZ(EnumC1403640md8.class, str);
    }

    public EnumC1403640md8(String str, int i, String str2) {
        this.LL = str2;
    }
}
