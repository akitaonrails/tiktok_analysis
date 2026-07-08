package X;

import java.util.Map;

/* JADX INFO: renamed from: X.11aK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19525811aK extends AbstractC19524811aA<String> {
    public final Map<String, String> LIZIZ;

    public C19525811aK(Map<String, String> map) {
        super(map);
        this.LIZIZ = map;
    }

    @Override // X.AbstractC19524811aA
    public final void LIZ(InterfaceC19526611aS interfaceC19526611aS, C19525911aL c19525911aL) {
        Object objLJIIL = interfaceC19526611aS.LJIIL("server_log_id");
        if (objLJIIL == null) {
            objLJIIL = "";
        }
        this.LIZIZ.put("server_log_id", (String) objLJIIL);
    }
}
