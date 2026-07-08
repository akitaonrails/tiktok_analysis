package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Nf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599410Nf9 {
    public final InterfaceC599460NfE LIZ;

    public C599410Nf9(InterfaceC599460NfE interfaceC599460NfE) {
        this.LIZ = interfaceC599460NfE;
    }

    public final void LIZ(EnumC599420NfA enumC599420NfA, EnumC599440NfC enumC599440NfC, String str, EnumC599400Nf8 enumC599400Nf8, Map<String, ? extends Object> map) {
        String source;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ.getTrackParams());
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("operation", Integer.valueOf(enumC599420NfA.getValue()));
        pairArr[1] = new Pair("data_key", str);
        pairArr[2] = new Pair("code", Integer.valueOf(enumC599440NfC.getCode()));
        pairArr[3] = new Pair("message", enumC599440NfC.getMessage());
        Object obj = "";
        if (enumC599400Nf8 == null || (source = enumC599400Nf8.getSource()) == null) {
            source = "";
        }
        pairArr[4] = new Pair("source", source);
        Object obj2 = null;
        if (map != null) {
            obj2 = map.get("schema");
        }
        if ((obj2 instanceof String) && obj2 != null) {
            obj = obj2;
        }
        pairArr[5] = new Pair("schema", obj);
        linkedHashMap.putAll(C2097608Jq.LJIIIIZZ(pairArr));
        C1018703yb.LJ("rd_tiktokec_sea_content_track_params_context", linkedHashMap);
    }
}
