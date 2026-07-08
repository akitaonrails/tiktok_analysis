package X;

import com.bytedance.pia.core.bridge.methods.BootGet;
import com.bytedance.pia.core.bridge.methods.CacheGetContentMethod;
import com.bytedance.pia.core.bridge.methods.CacheGetHeadersMethod;
import com.bytedance.pia.core.bridge.methods.CacheRemoveMethod;
import com.bytedance.pia.core.bridge.methods.CacheSaveMethod;
import com.bytedance.pia.core.bridge.methods.CacheUpdateManifestMethod;
import com.bytedance.pia.core.bridge.methods.SettingGet;
import com.bytedance.pia.core.bridge.methods.TracingGet;
import com.bytedance.pia.core.bridge.methods.WorkerCreate;
import com.bytedance.pia.core.bridge.methods.WorkerPostMessage;
import com.bytedance.pia.core.bridge.methods.WorkerRunTask;
import com.bytedance.pia.core.bridge.methods.WorkerTerminate;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1BOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204311BOz {
    public static final Map<String, C1BP1<?, ?>> LIZIZ;
    public final Map<String, C1BP1<?, ?>> LIZ = new HashMap();

    static {
        HashMap map = new HashMap();
        LIZIZ = map;
        map.put("pia.internal.setting.get", SettingGet.LIZ);
        map.put("pia.internal.worker.create", WorkerCreate.LIZ);
        map.put("pia.internal.worker.postMessage", WorkerPostMessage.LIZ);
        map.put("pia.internal.worker.terminate", WorkerTerminate.LIZ);
        map.put("pia.internal.worker.runTask", WorkerRunTask.LIZ);
        map.put("pia.internal.boot.get", BootGet.LIZ);
        map.put("pia.internal.cache.save", CacheSaveMethod.LIZ);
        map.put("pia.internal.cache.getContent", CacheGetContentMethod.LIZ);
        map.put("pia.internal.cache.remove", CacheRemoveMethod.LIZ);
        map.put("pia.internal.cache.getHeaders", CacheGetHeadersMethod.LIZ);
        map.put("pia.internal.cache.updateManifest", CacheUpdateManifestMethod.LIZ);
        map.put("pia.internal.tracing.get", TracingGet.LIZ);
    }
}
