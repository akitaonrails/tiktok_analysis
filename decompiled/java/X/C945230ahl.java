package X;

import Y.AfS181S0100000_12;
import Y.AfS34S0210000_15;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostServerOptVersionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ahl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945230ahl {
    public final C11JN LIZ(AbstractC945220ahk abstractC945220ahk, boolean z) {
        int i = abstractC945220ahk.LIZ;
        String str = abstractC945220ahk.LIZIZ;
        Room roomLIZJ = C950220apo.LIZJ();
        if (roomLIZJ == null) {
            return null;
        }
        long id = roomLIZJ.getId();
        String secUid = roomLIZJ.getOwner().getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        Map<String, String> mapLIZJ = C2097908Jt.LIZJ(new Pair(str, String.valueOf(z)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cohost-arch-version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
        C11NZ<C470590Icr<Void>> c11nzUpdateAnchorSetting = coHostApi.updateAnchorSetting(id, secUid, i, mapLIZJ, linkedHashMap);
        if (c11nzUpdateAnchorSetting == null) {
            return null;
        }
        return c11nzUpdateAnchorSetting.LJJIJIIJIL(new AfS34S0210000_15(abstractC945220ahk, this, z, 4)).LJJIJIIJI(new AfS181S0100000_12(abstractC945220ahk, 154));
    }
}
