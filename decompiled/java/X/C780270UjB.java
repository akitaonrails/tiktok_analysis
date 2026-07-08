package X;

import android.content.Context;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UjB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780270UjB implements InterfaceC1266960j4g {
    public final WeakReference<Context> LIZ;
    public final InterfaceC780300UjE LIZIZ;
    public final Map<String, String> LIZJ;
    public InterfaceC774920UaY LIZLLL;

    public C780270UjB(C776310Ucn c776310Ucn) {
        String str;
        this.LIZ = new WeakReference<>(c776310Ucn.LIZ);
        this.LIZIZ = c776310Ucn.LJIJI;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LIZJ = concurrentHashMap;
        InterfaceC780290UjD interfaceC780290UjDZC0 = C781270Ukn.LJIJJ().ZC0();
        if (interfaceC780290UjDZC0 != null && (str = interfaceC780290UjDZC0.get()) != null) {
            concurrentHashMap.put("cpu_soc", str);
        } else {
            InterfaceC780290UjD interfaceC780290UjDZC02 = C781270Ukn.LJIJJ().ZC0();
            if (interfaceC780290UjDZC02 != null) {
                interfaceC780290UjDZC02.LIZ(new InterfaceC780310UjF() { // from class: X.0UjC
                    @Override // X.InterfaceC780310UjF
                    public final void LIZ(String str2) {
                        ((ConcurrentHashMap) this.LIZ.LIZJ).put("cpu_soc", str2);
                    }
                });
            }
        }
        concurrentHashMap.put("rtmp_type", String.valueOf(c776310Ucn.LIZJ));
    }

    @Override // X.InterfaceC1266870j4X
    public final void LIZ(String str, JSONObject jSONObject) throws JSONException {
        Boolean boolValueOf;
        Object c098200Yq;
        long j;
        String strLIZ;
        for (String str2 : ((ConcurrentHashMap) this.LIZJ).keySet()) {
            if (jSONObject != null) {
                try {
                    jSONObject.put(str2, ((ConcurrentHashMap) this.LIZJ).get(str2));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        C0UZJ c0uzjRC0 = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).rC0();
        Context context = this.LIZ.get();
        if (c0uzjRC0 != null && context != null && (strLIZ = c0uzjRC0.LIZ(context)) != null && jSONObject != null) {
            jSONObject.put("gpu_name", strLIZ);
        }
        this.LIZIZ.LIZ(str, jSONObject);
        long j2 = 0;
        Boolean boolValueOf2 = null;
        if (jSONObject == null) {
            boolValueOf = null;
        } else {
            try {
                boolValueOf = Boolean.valueOf(jSONObject.has("real_bitrate"));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("get BitRate error ");
                sbLIZ.append(e2.getMessage());
                C20441214yg.LJ("LogMonitor", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            if (jSONObject == null) {
                j = 0;
            } else {
                j = JSONObjectProtectorUtils.getLong(jSONObject, "real_bitrate");
            }
            C773220UUu.LIZ.getClass();
            C773220UUu.LJFF.put("video_bitrate", String.valueOf(j));
            InterfaceC774920UaY interfaceC774920UaY = this.LIZLLL;
            if (interfaceC774920UaY != null) {
                interfaceC774920UaY.HA(j);
            }
        }
        if (jSONObject != null) {
            try {
                boolValueOf2 = Boolean.valueOf(jSONObject.has("real_video_framerate"));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        if (C500260Jjc.LJJJI(boolValueOf2)) {
            if (jSONObject != null) {
                j2 = JSONObjectProtectorUtils.getLong(jSONObject, "real_video_framerate");
            }
            C773220UUu.LIZ.getClass();
            C773220UUu.LJFF.put("video_framerate", String.valueOf(j2));
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("get FrameRate error ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C20441214yg.LJ("LogMonitor", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
