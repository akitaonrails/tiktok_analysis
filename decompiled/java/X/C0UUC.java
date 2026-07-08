package X;

import com.bytedance.android.live.liveinteract.api.NotifyDeleteStickerEvent;
import com.bytedance.android.live.liveinteract.api.NotifySelectStickerEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastVoiceEffectSelectedChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0UUC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UUC {
    public static final C0UUC LIZ = new C0UUC();
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<C0UUD>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C0UUE> LIZJ = new ConcurrentHashMap<>();
    public static boolean LIZLLL;

    public final void LIZ(DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.CQ2(NotifyDeleteStickerEvent.class, this, AFwS245S0000000_12.get$arr$(191));
            dataChannel.CQ2(NotifySelectStickerEvent.class, this, AFwS245S0000000_12.get$arr$(192));
            dataChannel.CQ2(BroadcastVoiceEffectSelectedChannel.class, this, AFwS245S0000000_12.get$arr$(193));
        }
    }

    public final void LIZLLL(DataChannel dataChannel) {
        Iterator<Map.Entry<String, CopyOnWriteArrayList<C0UUD>>> it2 = LIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().clear();
        }
        LIZIZ.clear();
        LIZJ.clear();
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public static void LIZJ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
        CopyOnWriteArrayList<C0UUD> copyOnWriteArrayList = LIZIZ.get(enumC773040UUc.name());
        if (copyOnWriteArrayList != null) {
            for (C0UUD c0uud : copyOnWriteArrayList) {
                if (c0uud != null) {
                    c0uud.LIZIZ(enumC773040UUc, enumC771230UNd);
                }
            }
        }
    }

    public static void LIZIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd, String str) {
        LIZJ.put(enumC773040UUc.name(), new C0UUE(enumC771230UNd, str));
        CopyOnWriteArrayList<C0UUD> copyOnWriteArrayList = LIZIZ.get(enumC773040UUc.name());
        if (copyOnWriteArrayList != null) {
            for (C0UUD c0uud : copyOnWriteArrayList) {
                if (c0uud != null) {
                    c0uud.LIZ(enumC773040UUc, enumC771230UNd);
                }
            }
        }
    }
}
