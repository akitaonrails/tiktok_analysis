package X;

import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.live.MixedStreamConfig;

/* JADX INFO: renamed from: X.0jJH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1276010jJH {
    int startPushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig, IMixedStreamObserver iMixedStreamObserver);

    int stopPushStreamToCDN(String str);

    int updatePushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig);
}
