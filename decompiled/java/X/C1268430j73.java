package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j73, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1268430j73 implements InterfaceC1269880j9O {
    public WeakReference<C1269780j9E> LIZ;

    public C1268430j73(C1269780j9E c1269780j9E) {
        this.LIZ = new WeakReference<>(c1269780j9E);
    }

    @Override // X.InterfaceC1269880j9O
    public final void LIZLLL(final String str, final JSONObject jSONObject) {
        final C1269780j9E c1269780j9E = this.LIZ.get();
        if (c1269780j9E != null) {
            final long jNativeNanoTime = TimeUtils.nativeNanoTime() / 1000000;
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C786410Ut5.LJJZZIII(c1269780j9E.LL, new Runnable() { // from class: X.0j72
                public final void LIZ() {
                    JSONObject jSONObjectLIZIZ = c1269780j9E.LIZIZ(jCurrentTimeMillis);
                    if (jSONObjectLIZIZ != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = jSONObject;
                            if (jSONObject3 != null) {
                                Iterator<String> itKeys = jSONObject3.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    jSONObject2.put(next, jSONObject.get(next));
                                }
                            }
                            jSONObject2.put("clockMs", jNativeNanoTime);
                            jSONObject2.put("engine_api_name", str);
                            jSONObjectLIZIZ.put("event_key", "live_sdk_log").put("message", C786410Ut5.J3(jSONObject2));
                            InterfaceC1266880j4Y interfaceC1266880j4Y = c1269780j9E.LLILZIL;
                            if (interfaceC1266880j4Y != null) {
                                interfaceC1266880j4Y.LIZ(jSONObjectLIZIZ);
                            }
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveStreamLogService@648d.reportApiCall$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveStreamLogService@648d.reportApiCall$1");
                }
            });
        }
    }

    @Override // X.InterfaceC1269880j9O
    public final void LIZJ(final String str, final String str2, final JSONObject jSONObject) {
        final C1269780j9E c1269780j9E = this.LIZ.get();
        if (c1269780j9E != null) {
            final long jNativeNanoTime = TimeUtils.nativeNanoTime() / 1000000;
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C786410Ut5.LJJZZIII(c1269780j9E.LL, new Runnable() { // from class: X.0j6z
                public final void LIZ() {
                    JSONObject jSONObjectLIZIZ = c1269780j9E.LIZIZ(jCurrentTimeMillis);
                    if (jSONObjectLIZIZ != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = jSONObject;
                            if (jSONObject3 != null) {
                                Iterator<String> itKeys = jSONObject3.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    jSONObject2.put(next, jSONObject.get(next));
                                }
                            }
                            jSONObject2.put("clockMs", jNativeNanoTime);
                            jSONObjectLIZIZ.put("api", str2);
                            jSONObjectLIZIZ.put("event_key", str).put("message", C786410Ut5.J3(jSONObject2));
                            InterfaceC1266880j4Y interfaceC1266880j4Y = c1269780j9E.LLILZIL;
                            if (interfaceC1266880j4Y != null) {
                                interfaceC1266880j4Y.LIZ(jSONObjectLIZIZ);
                            }
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveStreamLogService@648d.reportApiCall$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveStreamLogService@648d.reportApiCall$2");
                }
            });
        }
    }

    @Override // X.InterfaceC1269880j9O
    public final void LIZ(final int i, final String str, String str2, Throwable th) {
        final String strLIZIZ = str2;
        if (th != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(" Cause:");
            sbLIZ.append(Log.getStackTraceString(th));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        final C1269780j9E c1269780j9E = this.LIZ.get();
        if (c1269780j9E != null) {
            final long jNativeNanoTime = TimeUtils.nativeNanoTime() / 1000000;
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C786410Ut5.LJJZZIII(c1269780j9E.LL, new Runnable() { // from class: X.0j74
                public final void LIZ() {
                    JSONObject jSONObjectLIZIZ = c1269780j9E.LIZIZ(jCurrentTimeMillis);
                    if (jSONObjectLIZIZ != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("clockMs", jNativeNanoTime);
                            jSONObject.put("level", i);
                            jSONObject.put("tag", str);
                            jSONObject.put("msg", strLIZIZ);
                            jSONObjectLIZIZ.put("event_key", "live_sdk_log").put("message", C786410Ut5.J3(jSONObject));
                            InterfaceC1266880j4Y interfaceC1266880j4Y = c1269780j9E.LLILZIL;
                            if (interfaceC1266880j4Y != null) {
                                interfaceC1266880j4Y.LIZ(jSONObjectLIZIZ);
                            }
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveStreamLogService@648d.uploadSDKLog$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveStreamLogService@648d.uploadSDKLog$1");
                }
            });
        }
    }

    @Override // X.InterfaceC1269880j9O
    public final void LIZIZ(final int i, final String str, final String str2, String str3, Throwable th) {
        final String strLIZIZ = str3;
        if (th != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(" Cause:");
            sbLIZ.append(Log.getStackTraceString(th));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        final C1269780j9E c1269780j9E = this.LIZ.get();
        if (c1269780j9E != null) {
            final long jNativeNanoTime = TimeUtils.nativeNanoTime() / 1000000;
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C786410Ut5.LJJZZIII(c1269780j9E.LL, new Runnable() { // from class: X.0j75
                public final void LIZ() {
                    JSONObject jSONObjectLIZIZ = c1269780j9E.LIZIZ(jCurrentTimeMillis);
                    if (jSONObjectLIZIZ != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("clockMs", jNativeNanoTime);
                            jSONObject.put("level", i);
                            jSONObject.put("tag", str);
                            jSONObject.put("msg", strLIZIZ);
                            jSONObjectLIZIZ.put("event_key", str2).put("message", C786410Ut5.J3(jSONObject));
                            InterfaceC1266880j4Y interfaceC1266880j4Y = c1269780j9E.LLILZIL;
                            if (interfaceC1266880j4Y != null) {
                                interfaceC1266880j4Y.LIZ(jSONObjectLIZIZ);
                            }
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveStreamLogService@648d.uploadSDKLogEvent$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveStreamLogService@648d.uploadSDKLogEvent$1");
                }
            });
        }
    }
}
