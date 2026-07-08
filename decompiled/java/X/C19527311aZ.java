package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11aZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19527311aZ extends AbstractC19524811aA<String> {
    public final Map<String, String> LIZIZ;

    public C19527311aZ(Map<String, String> map) {
        super(map);
        this.LIZIZ = map;
    }

    @Override // X.AbstractC19524811aA
    public final void LIZ(InterfaceC19526611aS interfaceC19526611aS, C19525911aL c19525911aL) {
        Object objLJIIL = interfaceC19526611aS.LJIIL("speaker_name");
        Object obj = "";
        if (objLJIIL == null) {
            objLJIIL = "";
        }
        Object objLJIIL2 = interfaceC19526611aS.LJIIL("speaker_id");
        if (objLJIIL2 != null) {
            obj = objLJIIL2;
        }
        String str = this.LIZIZ.get("speaker_name");
        if (str == null) {
            this.LIZIZ.put("speaker_name", (String) objLJIIL);
        } else if (!Intrinsics.LJFF(str, objLJIIL)) {
            this.LIZIZ.put("speaker_name", "Multiple");
        }
        String str2 = this.LIZIZ.get("speaker_id");
        if (str2 == null) {
            this.LIZIZ.put("speaker_id", (String) obj);
        } else {
            if (Intrinsics.LJFF(str2, obj)) {
                return;
            }
            this.LIZIZ.put("speaker_id", "Multiple");
        }
    }
}
