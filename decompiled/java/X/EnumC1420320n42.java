package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0n42, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1420320n42 {
    public static final EnumC1420320n42 CLICK_PLUS;
    public static final EnumC1420320n42 COLD_START;
    public static final EnumC1420320n42 HOT_START;
    public static final EnumC1420320n42 LANGUAGE_CHANGE;
    public static final /* synthetic */ EnumC1420320n42[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1420320n42> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1420320n42 enumC1420320n42 = new EnumC1420320n42("COLD_START", 0);
        COLD_START = enumC1420320n42;
        EnumC1420320n42 enumC1420320n422 = new EnumC1420320n42("HOT_START", 1);
        HOT_START = enumC1420320n422;
        EnumC1420320n42 enumC1420320n423 = new EnumC1420320n42("CLICK_PLUS", 2);
        CLICK_PLUS = enumC1420320n423;
        EnumC1420320n42 enumC1420320n424 = new EnumC1420320n42("LANGUAGE_CHANGE", 3);
        LANGUAGE_CHANGE = enumC1420320n424;
        EnumC1420320n42[] enumC1420320n42Arr = {enumC1420320n42, enumC1420320n422, enumC1420320n423, enumC1420320n424};
        LL = enumC1420320n42Arr;
        LLILLJJLI = new C2254308sP(enumC1420320n42Arr);
    }

    public static EnumC1420320n42[] values() {
        return (EnumC1420320n42[]) LL.clone();
    }

    public final int toPreloadTriggerValue() {
        int i = C1420330n43.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            throw new C1954807lC();
        }
        return 3;
    }

    public final String toRequestExtra() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", toPreloadTriggerValue());
        return C786410Ut5.J3(jSONObject);
    }

    public static EnumC1420320n42 valueOf(String str) {
        return (EnumC1420320n42) C08FF.LIZ(EnumC1420320n42.class, str);
    }

    public EnumC1420320n42(String str, int i) {
    }
}
