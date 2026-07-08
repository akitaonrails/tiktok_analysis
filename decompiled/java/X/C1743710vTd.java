package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743710vTd {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final ConcurrentHashMap<String, EnumC1743700vTc> LIZIZ = new ConcurrentHashMap<>();
    public static boolean LIZJ;

    public static void LIZ(C1537480q70 c1537480q70) {
        String str;
        if (c1537480q70 != null && (str = c1537480q70.containerId) != null) {
            ConcurrentHashMap<String, EnumC1743700vTc> concurrentHashMap = LIZIZ;
            if (concurrentHashMap.get(str) == EnumC1743700vTc.LL) {
                concurrentHashMap.remove(str);
                return;
            }
            concurrentHashMap.put(str, EnumC1743700vTc.LLILLL);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "destroy");
            c1537480q70.LJJIIJZLJL(jSONObject, "viewDisappearedWithType");
        }
    }

    public static void LIZIZ(final C1537480q70 c1537480q70) {
        final String str;
        if (c1537480q70 != null && (str = c1537480q70.containerId) != null) {
            c1537480q70.LJJIIJZLJL(null, "viewDisappeared");
            ConcurrentHashMap<String, EnumC1743700vTc> concurrentHashMap = LIZIZ;
            EnumC1743700vTc enumC1743700vTc = concurrentHashMap.get(str);
            if (enumC1743700vTc != null) {
                int i = C1743420vTA.LIZ[enumC1743700vTc.ordinal()];
                if (i != 1 && i != 2 && i != 3) {
                    if (i == 4) {
                        concurrentHashMap.put(str, EnumC1743700vTc.LLILLJJLI);
                        return;
                    }
                } else {
                    return;
                }
            }
            concurrentHashMap.put(str, EnumC1743700vTc.LLILLJJLI);
            final boolean z = LIZJ;
            C786410Ut5.LJLIIL(500L, LIZ, new Runnable() { // from class: X.0vTe
                public final void LIZ() throws JSONException {
                    ConcurrentHashMap<String, EnumC1743700vTc> concurrentHashMap2 = C1743710vTd.LIZIZ;
                    EnumC1743700vTc enumC1743700vTc2 = concurrentHashMap2.get(str);
                    if (enumC1743700vTc2 == null) {
                        return;
                    }
                    int iOrdinal = enumC1743700vTc2.ordinal();
                    if (iOrdinal != 1) {
                        if (iOrdinal == 3) {
                            if (z) {
                                C1537480q70 c1537480q702 = c1537480q70;
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("type", "appResignActive");
                                c1537480q702.LJJIIJZLJL(jSONObject, "viewDisappearedWithType");
                            } else {
                                C1537480q70 c1537480q703 = c1537480q70;
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("type", "covered");
                                c1537480q703.LJJIIJZLJL(jSONObject2, "viewDisappearedWithType");
                            }
                            c1537480q70.LJJIIJZLJL(null, "viewAppeared");
                        }
                    } else if (C1743710vTd.LIZJ) {
                        C1537480q70 c1537480q704 = c1537480q70;
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", "appResignActive");
                        c1537480q704.LJJIIJZLJL(jSONObject3, "viewDisappearedWithType");
                    } else {
                        C1537480q70 c1537480q705 = c1537480q70;
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("type", "covered");
                        c1537480q705.LJJIIJZLJL(jSONObject4, "viewDisappearedWithType");
                    }
                    concurrentHashMap2.remove(str);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ViewEventUtils@3da4.onPause$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ViewEventUtils@3da4.onPause$1");
                }
            });
        }
    }

    public static void LIZJ(C1537480q70 c1537480q70) {
        String str;
        if (c1537480q70 != null && (str = c1537480q70.containerId) != null) {
            ConcurrentHashMap<String, EnumC1743700vTc> concurrentHashMap = LIZIZ;
            EnumC1743700vTc enumC1743700vTc = concurrentHashMap.get(str);
            if (enumC1743700vTc != null) {
                int i = C1743420vTA.LIZ[enumC1743700vTc.ordinal()];
                if (i != 2) {
                    if (i == 3 || i == 4) {
                        concurrentHashMap.put(str, EnumC1743700vTc.LLILZ);
                        return;
                    }
                } else {
                    return;
                }
            }
            c1537480q70.LJJIIJZLJL(null, "viewAppeared");
        }
    }
}
