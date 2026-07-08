package X;

import com.ss.android.ugc.aweme.ICoinService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.09Np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2362709Np {
    public static final List<C2362909Nr> LIZ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        arrayList.add(new C2362909Nr("com.google.mlkit.common.internal.MlKitInitProvider", "${applicationId}.mlkitinitprovider", false, false, null));
        arrayList.add(new C2362909Nr("com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider", "${applicationId}.WsChannelMultiProcessSharedProvider", false, false, null));
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("android.support.FILE_PROVIDER_PATHS", Integer.valueOf(R.xml.f946a3))};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        Objects.requireNonNull(key);
        Object value = entry.getValue();
        Objects.requireNonNull(value);
        if (map.put(key, value) != null) {
            throw new IllegalArgumentException("duplicate key: " + key);
        }
        arrayList.add(new C2362909Nr("com.bytedance.android.livesdk.TTLiveFileProvider", "${applicationId}.ttlive_provider", false, true, Collections.unmodifiableMap(map)));
        arrayList.add(new C2362909Nr("com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider", "${applicationId}.push.SHARE_PROVIDER_AUTHORITY", false, false, null));
        arrayList.add(new C2362909Nr("com.bytedance.bdinstall.BDInstallProvider", "${applicationId}.bdinstall.provider", false, false, null));
        arrayList.add(new C2362909Nr("com.bytedance.push.settings.storage.PushProvider", "${applicationId}.push.settings", false, false, null));
        arrayList.add(new C2362909Nr("com.ss.android.token.AuthTokenMultiProcessSharedProvider", "${applicationId}.auth_token.SHARE_PROVIDER_AUTHORITY", false, false, null));
        ICoinService iCoinService = (ICoinService) PluggableExtentionKt.pluggableSpi(ICoinService.class);
        if (iCoinService == null || iCoinService.LJIIJ().isEmpty()) {
            arrayList.add(new C2362909Nr("com.ss.android.common.util.MultiProcessSharedProvider", "com.ss.android.common.multiprocess.SHARE_PROVIDER_AUTHORITY${APP_ID}", true, false, null));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("com.ss.android.common.multiprocess.SHARE_PROVIDER_AUTHORITY");
            sbLIZ.append(iCoinService.LJIIJ());
            arrayList.add(new C2362909Nr("com.ss.android.common.util.MultiProcessSharedProvider", C2188811AlT.LIZIZ(sbLIZ), true, false, null));
        }
        arrayList.add(new C2362909Nr("org.jetbrains.compose.resources.AndroidContextProvider", "${applicationId}.resources.AndroidContextProvider", false, false, null));
    }
}
