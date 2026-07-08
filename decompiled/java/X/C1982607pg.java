package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1982607pg implements InterfaceC1979907pF {
    public final EnumC1982507pf LIZ;

    @Override // X.InterfaceC1979907pF
    public final String LIZJ() {
        return this.LIZ.getLiterals();
    }

    public final String toString() {
        return LIZJ();
    }

    @Override // X.InterfaceC1979907pF
    public final InterfaceC205300qh LIZIZ() {
        return this.LIZ;
    }

    public C1982607pg(EnumC1982507pf enumC1982507pf) {
        this.LIZ = enumC1982507pf;
    }

    @Override // X.InterfaceC1979907pF
    public final Object LIZ(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }
}
