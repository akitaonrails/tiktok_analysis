package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hWI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207200hWI implements InterfaceC1207170hWF {
    public final /* synthetic */ InterfaceC1207170hWF LIZ;
    public final /* synthetic */ C20656615sK LIZIZ;
    public final /* synthetic */ C1207520hWo LIZJ;

    @Override // X.InterfaceC1207170hWF
    public final void LIZ(C1208240hXy c1208240hXy) {
        int i;
        Integer numValueOf;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        InterfaceC1207170hWF interfaceC1207170hWF = this.LIZ;
        if (interfaceC1207170hWF != null) {
            interfaceC1207170hWF.LIZ(c1208240hXy);
        }
        C1207120hWA c1207120hWA = C1207120hWA.LIZ;
        C1207520hWo c1207520hWo = this.LIZJ;
        c1207120hWA.getClass();
        C1207220hWK c1207220hWK = c1208240hXy.LIZJ;
        if (c1207220hWK != null) {
            i = (int) c1207220hWK.LIZJ;
        } else {
            i = 0;
        }
        int i2 = i / 86400000;
        JSONObject jSONObject = new JSONObject();
        C1207220hWK c1207220hWK2 = c1208240hXy.LIZJ;
        String str7 = null;
        if (c1207220hWK2 != null) {
            numValueOf = Integer.valueOf(c1207220hWK2.LIZLLL);
        } else {
            numValueOf = null;
        }
        C2365509Or.LIZLLL(jSONObject, "show_index", numValueOf);
        C2365509Or.LIZLLL(jSONObject, "time_int", Integer.valueOf(i2));
        int i3 = C1207280hWQ.LIZ[c1208240hXy.LIZ.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    if (c1207520hWo != null) {
                        str5 = c1207520hWo.LIZ;
                        str6 = c1207520hWo.LIZIZ;
                    } else {
                        str5 = null;
                        str6 = null;
                    }
                    C1207120hWA.LIZIZ(str5, str6, null);
                    return;
                }
                return;
            }
            if (c1207520hWo != null) {
                str3 = c1207520hWo.LIZ;
                str4 = c1207520hWo.LIZIZ;
                str7 = c1207520hWo.LIZLLL;
            } else {
                str3 = null;
                str4 = null;
            }
            C2365509Or.LIZLLL(jSONObject, "enter_from", str3);
            C2365509Or.LIZLLL(jSONObject, "enter_method", str4);
            C2365509Or.LIZLLL(jSONObject, "previous_page", str7);
            C20684815ws.LJIJ("precise_location_permission_popup", jSONObject);
            return;
        }
        if (c1207520hWo != null) {
            str = c1207520hWo.LIZ;
            str2 = c1207520hWo.LIZIZ;
            str7 = c1207520hWo.LIZLLL;
        } else {
            str = null;
            str2 = null;
        }
        C2365509Or.LIZLLL(jSONObject, "enter_from", str);
        C2365509Or.LIZLLL(jSONObject, "enter_method", str2);
        C2365509Or.LIZLLL(jSONObject, "previous_page", str7);
        C20684815ws.LJIJ("precise_location_system_conversion_show", jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    @Override // X.InterfaceC1207170hWF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1208000hXa r16) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1207200hWI.LIZIZ(X.0hXa):void");
    }

    public C1207200hWI(InterfaceC1207170hWF interfaceC1207170hWF, C20656615sK c20656615sK, C1207520hWo c1207520hWo) {
        this.LIZ = interfaceC1207170hWF;
        this.LIZIZ = c20656615sK;
        this.LIZJ = c1207520hWo;
    }
}
