package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0aqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950840aqo {
    public final Number LIZ;
    public final InterfaceC914930Zut<C960260b60> LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final Map<String, Object> LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartQuickCoHostParams(autoMatchEntrance=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", autoMatchScene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", poolId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() {
        Number number = this.LIZ;
        if (number != null && number.intValue() == 2) {
            return "league_match_campaign";
        }
        Map<String, Object> map = this.LJ;
        Object obj = map != null ? map.get("enter_from") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public /* synthetic */ C950840aqo(Number number, InterfaceC914930Zut interfaceC914930Zut, Integer num, int i) {
        this((i & 1) != 0 ? null : number, interfaceC914930Zut, (i & 4) != 0 ? null : num, null, null);
    }

    public C950840aqo(Number number, InterfaceC914930Zut<C960260b60> interfaceC914930Zut, Integer num, String str, Map<String, ? extends Object> map) {
        this.LIZ = number;
        this.LIZIZ = interfaceC914930Zut;
        this.LIZJ = num;
        this.LIZLLL = str;
        this.LJ = map;
    }
}
