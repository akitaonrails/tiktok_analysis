package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import com.ss.android.ugc.aweme.channel.share.model.ShareChannelService;
import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0lsc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374800lsc {
    public static final C1374800lsc LIZ = new C1374800lsc();
    public static final Map<String, IChannelApi> LIZIZ = new LinkedHashMap();
    public static List<ShareChannelInfo> LIZJ = new ArrayList();

    static {
        List<IChannelApi> listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, IChannelApi.class, false);
        if (listLIZIZ == null) {
            listLIZIZ = new ArrayList();
        }
        for (IChannelApi iChannelApi : listLIZIZ) {
            LIZIZ.put(iChannelApi.getChannelKey(), iChannelApi);
        }
        LIZ.getClass();
        LIZJ();
    }

    public static void LIZJ() {
        List<ShareChannelInfo> list;
        List<ShareChannelInfo> listLJIIIZ = C1370370llT.LJ.LJIIIZ();
        LIZJ = listLJIIIZ;
        if (listLJIIIZ == null || listLJIIIZ.isEmpty() || (list = LIZJ) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (ShareChannelInfo shareChannelInfo : list) {
            arrayList.add(LIZIZ.put(shareChannelInfo.channelKey, new ShareChannelService(shareChannelInfo)));
        }
    }

    public static InterfaceC1369790lkX LIZIZ(String str, C1377070lwH c1377070lwH) {
        List<ShareChannelInfo> list = LIZJ;
        if (list == null || list.isEmpty()) {
            LIZJ();
        }
        IChannelApi iChannelApi = (IChannelApi) ((LinkedHashMap) LIZIZ).get(str);
        if (iChannelApi != null) {
            return iChannelApi.getChannel(c1377070lwH);
        }
        return null;
    }

    public static boolean LIZ(String str, C1377070lwH c1377070lwH, C1371600lnS c1371600lnS) {
        InterfaceC1369790lkX channel;
        IChannelApi iChannelApi = (IChannelApi) ((LinkedHashMap) LIZIZ).get(str);
        if (iChannelApi != null && (channel = iChannelApi.getChannel(c1377070lwH)) != null) {
            c1371600lnS.LIZIZ(channel);
            return true;
        }
        return false;
    }
}
