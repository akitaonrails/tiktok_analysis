package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0NDP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NDP {
    public static List<Pair<Float, Integer>> LIZ = new ArrayList();
    public static final Map<String, Pair<Integer, Float>> LIZIZ = new LinkedHashMap();
    public static final Map<String, Pair<Integer, Float>> LIZJ = new LinkedHashMap();
    public static final Map<String, Pair<Integer, Float>> LIZLLL = new LinkedHashMap();
    public static final Map<String, Pair<Integer, Float>> LJ = new LinkedHashMap();
    public static final Map<String, Pair<Integer, Float>> LJFF = new LinkedHashMap();
    public static final Map<String, C0NDO> LJI = new LinkedHashMap();
    public static final Map<String, Integer> LJII = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:109:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZ(java.util.List r15) {
        /*
            Method dump skipped, instruction units count: 1882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NDP.LIZ(java.util.List):java.util.List");
    }

    public static List LIZIZ(List list) {
        int bitRate;
        String meta;
        C797930VRv.LIZ();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            Integer numValueOf = null;
            if (it2.hasNext()) {
                Aweme aweme = (Aweme) it2.next();
                C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                InterfaceC1477220oXo interfaceC1477220oXoLJIILLIIL = c1477400oY6.LJIILLIIL(aweme.getAid());
                if (interfaceC1477220oXoLJIILLIIL == null && (interfaceC1477220oXoLJIILLIIL = c1477400oY6.LJIJI(aweme.getAid())) == null) {
                    bitRate = 0;
                } else {
                    bitRate = interfaceC1477220oXoLJIILLIIL.getBitRate();
                }
                String aid = aweme.getAid();
                Video video = aweme.getVideo();
                if (video != null) {
                    meta = video.getMeta();
                } else {
                    meta = null;
                }
                Video video2 = aweme.getVideo();
                if (video2 != null) {
                    numValueOf = Integer.valueOf(video2.getDuration());
                }
                arrayList.add(new C590350NDl(null, null, aid, meta, numValueOf, Integer.valueOf(bitRate), 0.0f, null, (Integer) ((LinkedHashMap) LJII).get(aweme.getAid()), null, null));
            } else {
                return (List) C23250099c.LJ(C23271099x.INSTANCE, new C436150H8j(list, arrayList, null));
            }
        }
    }
}
