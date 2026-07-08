package X;

import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kvq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338360kvq {
    public static final C1338360kvq LIZ = new C1338360kvq();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final WeakHashMap<View, C1338380kvs> LIZJ = new WeakHashMap<>();

    public final void LIZ(WeakReference<View> weakReference, final WeakReference<C1338380kvs> weakReference2) {
        Object c098200Yq;
        View view = weakReference.get();
        if (view == null) {
            return;
        }
        try {
            C2211631BhB.LIZLLL(view, new AbstractC2211791BhR(weakReference2, this) { // from class: X.0kvt
                public final int LJ = 200;
                public final boolean LJFF = true;
                public final boolean LJI = true;
                public final C1338370kvr LJII;

                @Override // X.AbstractC2211791BhR
                public final float LJIIL() {
                    return 0.0f;
                }

                @Override // X.AbstractC2211791BhR
                public final int LIZJ() {
                    return this.LJ;
                }

                @Override // X.AbstractC2211791BhR
                public final InterfaceC2211921Bhe LJ() {
                    return this.LJII;
                }

                @Override // X.AbstractC2211791BhR
                public final boolean LJIIIIZZ() {
                    return this.LJFF;
                }

                @Override // X.AbstractC2211791BhR
                public final boolean LJIIIZ() {
                    return this.LJI;
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [X.0kvr] */
                {
                    this.LJII = new InterfaceC2211921Bhe() { // from class: X.0kvr
                        @Override // X.InterfaceC2211921Bhe
                        public final void LIZ(long j) {
                            long j2;
                            int i;
                            C1338380kvs c1338380kvs = weakReference2.get();
                            if (c1338380kvs != null) {
                                this.getClass();
                                try {
                                    String str = c1338380kvs.LIZ;
                                    int i2 = 1;
                                    if (str.length() > 0) {
                                        if (!Intrinsics.LJFF(c1338380kvs.LJI, str)) {
                                            c1338380kvs.LJI = str;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (c1338380kvs.LIZJ) {
                                        j2 = c1338380kvs.LIZIZ;
                                    } else {
                                        j2 = j;
                                    }
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("duration", j);
                                    jSONObject.put("image_load_duration", j2);
                                    if (c1338380kvs.LIZJ) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    jSONObject.put("image_loaded", i);
                                    if (!c1338380kvs.LIZLLL) {
                                        i2 = 0;
                                    }
                                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i2);
                                    jSONObject.put("sub_biz_tag", c1338380kvs.LJ);
                                    jSONObject.put("image_url", c1338380kvs.LIZ);
                                    for (Map.Entry<String, String> entry : c1338380kvs.LJFF.entrySet()) {
                                        String key = entry.getKey();
                                        String value = entry.getValue();
                                        if (C123100dR.LIZ(value)) {
                                            jSONObject.put(key, value);
                                        }
                                    }
                                    AppLogNewUtils.onEventV3("tikbot_image_monitor", jSONObject);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                    };
                }
            });
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
