package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0awH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954230awH {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C954240awI c954240awI) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2;
        Map<String, ? extends JSONObject> mapLJIIJ = C2097608Jq.LJIIJ(new Pair(c954240awI.LIZIZ, new JSONObject().put("stream_status", c954240awI.LIZ.getType())));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStreamStatusUpdateAtAnchorSide start, writing sei data: ");
        sbLIZ.append(mapLJIIJ);
        C20441214yg.LIZIZ("MultiCoHostResumeTracker", C2188811AlT.LIZIZ(sbLIZ));
        if (C963580bBM.LIZ()) {
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ != null) {
                interfaceC954180awCLJIIIZ.LJIJI("resume_cohost", mapLJIIJ);
            }
        } else {
            InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ2 != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ2.LLIIJLIL()) != null) {
                interfaceC937900aVwLLIIJLIL.LJIJI("resume_cohost", mapLJIIJ);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair(c954240awI.LIZIZ, new JSONObject()));
        if (C963580bBM.LIZ()) {
            InterfaceC954180awC interfaceC954180awCLJIIIZ3 = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ3 != null) {
                interfaceC954180awCLJIIIZ3.LJJIL(linkedHashMap, mapLJIIJ2);
                return;
            }
            return;
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ4 = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ4 == null || (interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLJIIIZ4.LLIIJLIL()) == null) {
            return;
        }
        interfaceC937900aVwLLIIJLIL2.LJJIL(linkedHashMap, mapLJIIJ2);
    }
}
