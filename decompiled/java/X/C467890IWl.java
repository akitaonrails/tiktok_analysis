package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0IWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467890IWl {
    public static String LIZ() {
        String url;
        ItemTab itemTab;
        List<ItemTab> listLIZJ = C471000IdW.LJ().LIZJ();
        if (listLIZJ == null || (itemTab = (ItemTab) C13LP.LJJJLZIJ(0, listLIZJ)) == null || (url = itemTab.getUrl()) == null) {
            url = "";
        }
        String str = TextUtils.isEmpty(url) ? "" : url;
        if (TextUtils.isEmpty(str) || !a0.LJJIIZI(str, "/webcast/feed/", false)) {
            return str;
        }
        if ((!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse()) || a0.LJJIIZI(str, "&debug=true", false)) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("&debug=true");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
