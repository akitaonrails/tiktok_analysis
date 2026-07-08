package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0IjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474710IjV {
    public static final HashMap<String, String> LIZ() {
        HashMap<String, String> map = new HashMap<>();
        map.put("anchor_id", UserService.getInstance().user().LJIJJLI().getIdStr());
        C783980UpA c783980UpA = (C783980UpA) DataChannelGlobal.LLILZ.gg0(C1148400fzS.class);
        map.put("is_new_anchor", (c783980UpA == null || c783980UpA.LIZ != 1) ? "1" : CardStruct.IStatusCode.DEFAULT);
        return map;
    }
}
