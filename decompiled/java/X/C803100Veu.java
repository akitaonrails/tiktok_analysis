package X;

import org.json.JSONArray;

/* JADX INFO: renamed from: X.0Veu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803100Veu extends C802970Veh {
    public final String LJII;
    public final String[] LJIIIIZZ;

    @Override // X.C802970Veh
    public final String toString() {
        return this.LJII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C803100Veu(JSONArray jSONArray) {
        super(21, 33, 0);
        this.LJIIIIZZ = new String[]{"enableXasan", "debug", "maxSimultaneousAlloc", "sampleRate", "monitorAllocSize", "monitorType", "monitorBugType", "soName"};
        if (jSONArray != null && jSONArray.length() < 10) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < jSONArray.length(); i++) {
                String[] strArr = this.LJIIIIZZ;
                if (i >= strArr.length) {
                    break;
                }
                sb.append(strArr[i]);
                sb.append("=");
                sb.append(jSONArray.optString(i));
                sb.append("\n");
            }
            this.LJII = sb.toString();
        }
    }
}
