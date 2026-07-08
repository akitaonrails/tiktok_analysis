package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wIC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1775060wIC extends AbstractC1771870wD3 {
    public C1389910mGz LLILLL;

    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        LIZIZ().getEventCenter().LJIIIIZZ("ec_mix_mall_motion_event_action_down", new InterfaceC606370NqN() { // from class: X.0wID
            @Override // X.InterfaceC606370NqN
            public final void LIZ(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
                C1390030mHB c1390030mHB;
                C599820Nfo.LIZ.getClass();
                C599820Nfo.LIZLLL();
                C1775060wIC c1775060wIC = this.LIZ;
                C1389910mGz c1389910mGz = c1775060wIC.LLILLL;
                if (c1389910mGz != null && (c1390030mHB = c1389910mGz.LIZLLL) != null && c1390030mHB.isShowing()) {
                    C1389910mGz c1389910mGz2 = c1775060wIC.LLILLL;
                    if (c1389910mGz2 != null) {
                        c1389910mGz2.LIZJ();
                    }
                    c1775060wIC.LLILLL = null;
                }
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMixMallShowBottomToast", new InterfaceC1775150wIL() { // from class: X.0wIE
            /* JADX WARN: Removed duplicated region for block: B:86:0x01e3  */
            @Override // X.InterfaceC1775150wIL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.Map r16, final java.util.Map r17, X.C21175917tt r18) {
                /*
                    Method dump skipped, instruction units count: 637
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1775080wIE.LIZ(java.util.Map, java.util.Map, X.17tt):void");
            }
        });
    }

    public static void LJIILIIL(String str, String str2, String str3) throws JSONException {
        if (Intrinsics.LJFF(str2, "common")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str3);
            C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), str));
        }
    }
}
