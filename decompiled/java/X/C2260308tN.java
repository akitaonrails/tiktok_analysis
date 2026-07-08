package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lancet.AdjustSampleRateSetting;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08tN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2260308tN {
    public static final List<String> LIZ = Arrays.asList("LiveBroadcastSceneWrapperActivity", "LiveBroadcastActivity", "LivePlayActivity");
    public static final Random LIZIZ = new Random();

    public static boolean LIZ() {
        return LIZIZ.nextFloat() < AdjustSampleRateSetting.getSampleRate();
    }

    public static void LIZIZ(final int i, final long j, final Context context, final String str) {
        final String name = C786410Ut5.u3().getName();
        final long jCurrentTimeMillis = System.currentTimeMillis() - C1150504el.LIZ().LJJII;
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.08tM
            public final void LIZ() {
                String resourceEntryName;
                String str2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("action_type", str);
                    int i2 = i;
                    try {
                        C844470XAv.LIZ.getClass();
                        resourceEntryName = C844470XAv.LIZ().getResources().getResourceEntryName(i2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        resourceEntryName = null;
                    }
                    jSONObject.put("layout_name", resourceEntryName);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("0x");
                    sbLIZ.append(Integer.toHexString(i));
                    jSONObject.put("layout_id", C2188811AlT.LIZIZ(sbLIZ));
                    jSONObject.put("thread_name", name);
                    Context context2 = context;
                    if (context2 != null) {
                        jSONObject.put("ctx_name", context2.getClass().getSimpleName());
                    }
                    Activity topActivity = ActivityStack.getTopActivity();
                    if (topActivity != null) {
                        str2 = topActivity.getLocalClassName().split("\\.")[r1.length - 1];
                        jSONObject.put("activity_name", str2);
                    } else {
                        str2 = null;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("duration", j);
                    jSONObject2.put("app_time", jCurrentTimeMillis);
                    if (str2 != null) {
                        if (str2.equals("SAAActivity") && resourceEntryName != null && resourceEntryName.startsWith("ttlive")) {
                            if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LJFF(0.2d, "broadcast_side_view_inflate")) {
                                C793770VBv.LJII("broadcast_side_view_inflate", jSONObject, jSONObject2, null);
                                return;
                            }
                            return;
                        } else {
                            Iterator<String> it2 = C2260308tN.LIZ.iterator();
                            while (it2.hasNext()) {
                                if (it2.next().equals(str2)) {
                                    if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LJFF(0.2d, "broadcast_side_view_inflate")) {
                                        C793770VBv.LJII("broadcast_side_view_inflate", jSONObject, jSONObject2, null);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                    C793770VBv.LJII("view_inflate", jSONObject, jSONObject2, null);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ViewInflateLancet@5786.report$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ViewInflateLancet@5786.report$1");
            }
        });
    }
}
