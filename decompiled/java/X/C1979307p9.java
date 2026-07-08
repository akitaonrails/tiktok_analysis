package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07p9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1979307p9 implements InterfaceC1979907pF {
    public InterfaceC1979907pF LIZ;
    public InterfaceC1979907pF LIZIZ;
    public InterfaceC1979907pF LIZJ;

    @Override // X.InterfaceC1979907pF
    public final String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LIZJ());
        sbLIZ.append("?");
        sbLIZ.append(this.LIZIZ.LIZJ());
        sbLIZ.append(":");
        sbLIZ.append(this.LIZJ.LIZJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String toString() {
        return LIZJ();
    }

    @Override // X.InterfaceC1979907pF
    public final InterfaceC205300qh LIZIZ() {
        return EnumC1983107pl.OPERATOR_RESULT;
    }

    @Override // X.InterfaceC1979907pF
    public final Object LIZ(Map<String, JSONObject> map) {
        Object objLIZ = this.LIZ.LIZ(map);
        if (objLIZ == null) {
            return null;
        }
        if (((Boolean) objLIZ).booleanValue()) {
            return this.LIZIZ.LIZ(map);
        }
        return this.LIZJ.LIZ(map);
    }
}
