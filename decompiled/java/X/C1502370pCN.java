package X;

import Y.ARunnableS7S1000000_12;
import android.text.TextUtils;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0pCN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502370pCN implements C0CJP {
    @Override // X.C0CJP
    public final InterfaceC1500900pA0 LIZJ() {
        return new C337500DKy();
    }

    @Override // X.C0CJP
    public final Object LIZ(Object obj, String str) {
        InterfaceC1502380pCO interfaceC1502380pCOJA1 = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).jA1();
        if (interfaceC1502380pCOJA1 != null) {
            return interfaceC1502380pCOJA1.LIZ(obj, str);
        }
        return obj;
    }

    @Override // X.C0CJP
    public final HashMap<String, Object> LIZIZ(C0CJQ c0cjq, String str) {
        HashMap<String, Object> map = new HashMap<>();
        String strQ30 = ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).q30(str);
        if (TextUtils.isEmpty(strQ30)) {
            C486790J7d.LIZJ(new ARunnableS7S1000000_12(str, 3));
            map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
            return map;
        }
        String path = UriProtector.parse(strQ30).getPath();
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
        map.put("path", path);
        return map;
    }
}
