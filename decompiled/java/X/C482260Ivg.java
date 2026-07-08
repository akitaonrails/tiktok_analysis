package X;

import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0Ivg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482260Ivg {
    public static DataChannel LIZIZ;
    public static final ConcurrentHashMap<Class<?>, Object> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, CopyOnWriteArrayList<OnMessageListener>> LIZJ = new ConcurrentHashMap<>();

    public static Object LIZJ(Class cls) {
        if (C500260Jjc.LJJJIL(LIZIZ)) {
            Object obj = LIZ.get(cls);
            if (obj == null) {
                C480460Ism.LIZ().getClass();
                return C480460Ism.LIZLLL(cls);
            }
            return obj;
        }
        C480460Ism.LIZ().getClass();
        return C480460Ism.LIZLLL(cls);
    }

    public static void LJ(OnMessageListener onMessageListener) {
        Iterator<T> it2 = LIZJ.values().iterator();
        while (it2.hasNext()) {
            ((CopyOnWriteArrayList) it2.next()).remove(onMessageListener);
        }
    }

    public static void LIZ(int i, OnMessageListener onMessageListener) {
        ConcurrentHashMap<Integer, CopyOnWriteArrayList<OnMessageListener>> concurrentHashMap = LIZJ;
        CopyOnWriteArrayList<OnMessageListener> copyOnWriteArrayList = concurrentHashMap.get(Integer.valueOf(i));
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        copyOnWriteArrayList.add(onMessageListener);
        concurrentHashMap.put(Integer.valueOf(i), copyOnWriteArrayList);
    }

    public static void LIZIZ(int i, PollMessage pollMessage) {
        CopyOnWriteArrayList<OnMessageListener> copyOnWriteArrayList = LIZJ.get(Integer.valueOf(i));
        if (copyOnWriteArrayList != null) {
            Iterator<OnMessageListener> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().onMessage(pollMessage);
            }
        }
    }

    public static void LIZLLL(Class cls, Object obj) {
        LIZ.put(cls, obj);
    }
}
