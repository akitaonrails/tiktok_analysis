package X;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTextViewOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.common.jato.util.ViewMethodInvokeHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.x;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105280eru {
    public static final ConcurrentHashSet<Integer> LIZ = new ConcurrentHashSet<>();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1105300erw());
    public static final ConcurrentHashMap<String, Class<? extends SimpleLiveTextView>> LIZJ = new ConcurrentHashMap<>(C2097608Jq.LJIIIIZZ(new Pair(C16F5.class.getName(), SimpleLiveTextView.class), new Pair(C20743416Fc.class.getName(), C20743416Fc.class), new Pair(SimpleLiveTextView.class.getName(), SimpleLiveTextView.class)));
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;

    static {
        new ConcurrentHashMap();
        LIZLLL = true;
    }

    public static final boolean LIZ(Context context, boolean z) {
        Integer num;
        if (C1114110f69.LIZ && (num = C1114110f69.LIZIZ.get()) != null) {
            int iIntValue = num.intValue();
            boolean zContains = LIZ.contains(Integer.valueOf(iIntValue));
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkSimpleLiveTextViewXmlHit -- result: ");
                sbLIZ.append(zContains);
                sbLIZ.append(" | xml_name:");
                sbLIZ.append(context.getResources().getResourceEntryName(iIntValue));
                C20441214yg.LJIIIZ("SimpleLiveTextViewProvider", C2188811AlT.LIZIZ(sbLIZ));
            }
            return zContains;
        }
        return false;
    }

    public static final void LIZIZ(Map map, Set set) {
        if (!LiveTextViewOptSetting.enable()) {
            return;
        }
        if (set != null) {
            LIZ.addAll(set);
        }
        if (map != null) {
            LIZJ.putAll(map);
        }
    }

    public static Pair LIZJ(Class cls, Object obj, Object obj2, Object obj3) {
        int i;
        if (LJ) {
            i = 4;
        } else {
            i = 2;
        }
        if (C2104908Ml.LIZ()) {
            ViewMethodInvokeHelper.invokeViewConstructByAttrs(cls, obj, obj2, obj3);
        }
        return new Pair(Boolean.valueOf(C2104908Ml.LIZ()), Integer.valueOf(i));
    }

    public static final SimpleLiveTextView LIZLLL(String str, Context context, AttributeSet attributeSet, boolean z) throws JSONException {
        long jNanoTime;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        int iIntValue;
        Class<? extends SimpleLiveTextView> cls = LIZJ.get(str);
        if (cls != null) {
            boolean zIsLocalTest = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();
            if (zIsLocalTest) {
                jNanoTime = System.nanoTime();
            } else {
                jNanoTime = 0;
            }
            if (zIsLocalTest) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap = null;
            }
            try {
                SimpleLiveTextView simpleLiveTextView = (SimpleLiveTextView) ((x) LIZIZ.getValue()).LIZJ(cls);
                Field field = SimpleLiveTextView.LLJJJJJIL;
                long jLIZ = C1105290erv.LIZ(jNanoTime, "alloc_duration_us", linkedHashMap);
                if (simpleLiveTextView == null) {
                    linkedHashMap2 = linkedHashMap;
                    try {
                        LJ(zIsLocalTest, -2, jNanoTime, 0, false, null, linkedHashMap, 48);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                    }
                } else {
                    Pair pairLIZJ = LIZJ(View.class, simpleLiveTextView, context, attributeSet);
                    boolean zBooleanValue = ((Boolean) pairLIZJ.getFirst()).booleanValue();
                    iIntValue = ((Number) pairLIZJ.getSecond()).intValue();
                    try {
                        C1105290erv.LIZ(jLIZ, "view_init_duration_us", linkedHashMap);
                        try {
                            if (zBooleanValue) {
                                if (simpleLiveTextView.LJJLI(context, attributeSet, z, linkedHashMap)) {
                                    linkedHashMap2 = linkedHashMap;
                                    LJ(zIsLocalTest, 0, jNanoTime, iIntValue, true, null, linkedHashMap, 32);
                                    LIZLLL = false;
                                    return simpleLiveTextView;
                                }
                                linkedHashMap2 = linkedHashMap;
                                LJ(zIsLocalTest, -4, jNanoTime, iIntValue, true, null, linkedHashMap2, 32);
                            } else {
                                iIntValue = iIntValue;
                                linkedHashMap2 = linkedHashMap;
                                LJ(zIsLocalTest, -3, jNanoTime, iIntValue, false, null, linkedHashMap2, 32);
                            }
                            simpleLiveTextView = null;
                            LIZLLL = false;
                            return simpleLiveTextView;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        linkedHashMap2 = linkedHashMap;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                linkedHashMap2 = linkedHashMap;
            }
            iIntValue = 0;
            TryCatchGuardChecker.doCheck(th);
            LIZLLL = false;
            LJ(zIsLocalTest, -1, jNanoTime, iIntValue, false, th.getMessage(), linkedHashMap2, 16);
            C1CC2.LIZ("SimpleLiveTextView create error", th);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static void LJ(boolean z, int i, long j, int i2, boolean z2, String str, Map map, int i3) throws JSONException {
        ?? r9 = z2;
        if ((i3 & 16) != 0) {
            r9 = 0;
        }
        if ((i3 & 32) != 0) {
            str = "";
        }
        if ((i3 & 64) != 0) {
            map = null;
        }
        if (z) {
            long jNanoTime = (System.nanoTime() - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            JSONObject jSONObjectPut = new JSONObject().put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i).put("type", i2).put("is_main_thread", Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()) ? 1 : 0).put("invoke_state", r9).put("is_first_invoke", LIZLLL ? 1 : 0);
            JSONObject jSONObjectPut2 = new JSONObject().put("duration_us", jNanoTime);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObjectPut2.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
                }
            }
            JSONObject jSONObject = new JSONObject();
            if (str != null && str.length() > 0) {
                jSONObject.put("reason", str);
            }
            C1CC2.LJ("ttlive_simple_live_text_view_create", jSONObjectPut, jSONObjectPut2, jSONObject);
        }
    }
}
