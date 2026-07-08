package X;

import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670320QRa extends C09AY implements InterfaceC1631630sYr<String, C0QRQ, JSONObject, Map<String, String>, Unit> {
    public C670320QRa() {
        super(4);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, C0QRQ c0qrq, JSONObject jSONObject, Map<String, String> map) {
        C0QRW c0qrw;
        C0QRQ c0qrq2 = c0qrq;
        JSONObject jSONObject2 = jSONObject;
        Map<String, String> map2 = map;
        EnumC686550QwP enumC686550QwP = c0qrq2.LIZIZ;
        if (enumC686550QwP != null && (c0qrw = c0qrq2.LIZJ) != null) {
            int i = C0QRZ.LIZ[c0qrw.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && C278840AwM.LIZ() > 0) {
                        C670370QRf.LIZ.getClass();
                        C670370QRf.LIZIZ(enumC686550QwP, map2, jSONObject2);
                    }
                } else if (C278840AwM.LIZ() > 0) {
                    C670370QRf.LIZ.getClass();
                    C670370QRf.LIZIZ(enumC686550QwP, map2, jSONObject2);
                }
            } else if (C278840AwM.LIZ() > 0) {
                C670370QRf.LIZ.getClass();
                C670370QRf.LIZIZ(enumC686550QwP, map2, jSONObject2);
            }
        }
        return Unit.LIZ;
    }
}
