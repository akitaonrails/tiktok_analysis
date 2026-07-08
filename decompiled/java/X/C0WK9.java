package X;

import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.SocketState;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WK9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WK9 {
    public final Map<Integer, IWsApp> LIZ = new ConcurrentHashMap();
    public final Map<Integer, IWsChannelClient> LIZIZ = new ConcurrentHashMap();
    public final Map<Integer, SocketState> LIZJ = new ConcurrentHashMap();
}
