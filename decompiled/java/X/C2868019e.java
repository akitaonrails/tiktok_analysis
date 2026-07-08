package X;

import com.bytedance.android.livesdkapi.depend.model.live.GroupLiveSession;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.019e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2868019e {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(435));
    public static EnumC2851018n LIZIZ;
    public static EnumC774050UXz LIZJ;

    public static final Long LIZ(Room room) {
        if (room != null && LIZIZ(room)) {
            Map<String, String> mapLIZIZ = InterfaceC1094160eZy.j1.LIZIZ();
            if (mapLIZIZ == null) {
                mapLIZIZ = new LinkedHashMap<>();
            }
            String str = mapLIZIZ.get(String.valueOf(room.getId()));
            if (str != null) {
                return C2095008Iq.LJIILIIL(str);
            }
            return null;
        }
        return null;
    }

    public static final boolean LIZIZ(Room room) {
        GroupLiveSession groupLiveSession;
        if (room == null) {
            room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        }
        if (room == null || (groupLiveSession = room.groupLiveSession) == null || !groupLiveSession.isGroupLiveSession) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(long j, long j2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("store selected member; roomId=");
        sbLIZ.append(j);
        sbLIZ.append("; userId = ");
        sbLIZ.append(j2);
        C20441214yg.LIZIZ("Group_Live", C2188811AlT.LIZIZ(sbLIZ));
        C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1094160eZy.j1;
        Map<String, String> mapLIZIZ = c20337914i1.LIZIZ();
        if (mapLIZIZ == null) {
            mapLIZIZ = new LinkedHashMap<>();
        }
        String str = mapLIZIZ.get(String.valueOf(j));
        String strValueOf = String.valueOf(j2);
        if (!Intrinsics.LJFF(str, strValueOf)) {
            mapLIZIZ.put(String.valueOf(j), strValueOf);
            c20337914i1.LJFF(mapLIZIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("store selected member into disk; roomId=");
            sbLIZ2.append(j);
            sbLIZ2.append("; userId = ");
            sbLIZ2.append(j2);
            C20441214yg.LIZIZ("Group_Live", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
