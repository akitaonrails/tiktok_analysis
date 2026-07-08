package X;

import com.ss.android.ugc.aweme.feed.model.ComponentContainerData;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.aweme.feed.model.RealtimeFcpConfig;
import com.ss.android.ugc.feed.platform.componentmanager.data.FcpTreeData;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Re2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700640Re2 {
    public final String LIZ;
    public final String LIZIZ;
    public final FcpTreeData LIZJ;
    public final Map<String, GlobalComponentData> LIZLLL;
    public final Map<String, ComponentContainerData> LJ;
    public final RealtimeFcpConfig LJFF;
    public final List<String> LJI;
    public final Map<String, GlobalComponentData> LJII;

    public static C700640Re2 LIZ(C700640Re2 c700640Re2, Map map, RealtimeFcpConfig realtimeFcpConfig, List list, Map map2, int i) {
        String str;
        String str2;
        FcpTreeData fcpTreeData;
        List list2 = list;
        RealtimeFcpConfig realtimeFcpConfig2 = realtimeFcpConfig;
        Map map3 = map2;
        Map map4 = map;
        Map<String, ComponentContainerData> map5 = null;
        if ((i & 1) != 0) {
            str = c700640Re2.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c700640Re2.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            fcpTreeData = c700640Re2.LIZJ;
        } else {
            fcpTreeData = null;
        }
        if ((i & 8) != 0) {
            map4 = c700640Re2.LIZLLL;
        }
        if ((i & 16) != 0) {
            map5 = c700640Re2.LJ;
        }
        if ((i & 32) != 0) {
            realtimeFcpConfig2 = c700640Re2.LJFF;
        }
        if ((i & 64) != 0) {
            list2 = c700640Re2.LJI;
        }
        if ((i & 128) != 0) {
            map3 = c700640Re2.LJII;
        }
        c700640Re2.getClass();
        return new C700640Re2(str, str2, fcpTreeData, map4, map5, realtimeFcpConfig2, list2, map3);
    }

    public C700640Re2(String str, String str2, FcpTreeData fcpTreeData, Map<String, GlobalComponentData> map, Map<String, ComponentContainerData> map2, RealtimeFcpConfig realtimeFcpConfig, List<String> list, Map<String, GlobalComponentData> map3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = fcpTreeData;
        this.LIZLLL = map;
        this.LJ = map2;
        this.LJFF = realtimeFcpConfig;
        this.LJI = list;
        this.LJII = map3;
    }
}
