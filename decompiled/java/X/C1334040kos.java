package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.AFwS208S0000000_20;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334040kos {
    public static final C1334040kos LIZ = new C1334040kos();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"bulletin_list_photo_cover", "bulletin_list_video_cover"});
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(67));

    public static String LIZLLL(String str) {
        if (str.length() == 0) {
            return "unknown";
        }
        return C13LN.LL(8, str);
    }

    public static void LJII(C2344009Gk c2344009Gk, JSONObject jSONObject) {
        int iIntValue;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("headers");
            if (jSONObjectOptJSONObject == null) {
                return;
            }
            String strOptString = jSONObjectOptJSONObject.optString("x-imagex-extra", "");
            if (strOptString.length() == 0) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject(strOptString);
            Integer numValueOf = Integer.valueOf(jSONObject2.optInt("q", -1));
            if (numValueOf.intValue() > 0 || 0 != 0) {
                iIntValue = numValueOf.intValue();
            } else {
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("enc");
                if (jSONObjectOptJSONObject2 != null) {
                    Integer numValueOf2 = Integer.valueOf(jSONObjectOptJSONObject2.optInt("q", -1));
                    if (numValueOf2.intValue() > 0) {
                        iIntValue = numValueOf2.intValue();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            c2344009Gk.LIZJ(iIntValue, "compression_quality");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(C2344009Gk c2344009Gk, String str, int i) {
        if (i > 0) {
            c2344009Gk.LIZJ(i, str);
        }
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, String str, String str2) {
        if (str2.length() > 0) {
            c2344009Gk.LJFF(str, str2);
        }
    }

    public static void LJ(String str, String str2, JSONObject jSONObject) {
        String str3;
        String str4;
        if (str == null || !LIZIZ.contains(str) || jSONObject == null) {
            return;
        }
        if (jSONObject.optBoolean("isSuccess", false)) {
            str3 = "success";
        } else {
            str3 = "fail";
        }
        int iOptInt = jSONObject.optInt("from", -1);
        if (iOptInt != 0) {
            if (iOptInt != 1) {
                if (iOptInt != 2) {
                    str4 = "unknown";
                } else {
                    str4 = "disk";
                }
            } else {
                str4 = "memory";
            }
        } else {
            str4 = "network";
        }
        int iOptInt2 = jSONObject.optInt("duration", -1);
        int iOptInt3 = jSONObject.optInt("download_duration", -1);
        int iOptInt4 = jSONObject.optInt("decode_duration", -1);
        int iOptInt5 = jSONObject.optInt("queue_duration", -1);
        int iOptInt6 = jSONObject.optInt("cache_seek_duration", -1);
        int iOptInt7 = jSONObject.optInt("file_size", -1);
        int iOptInt8 = jSONObject.optInt("image_width", -1);
        int iOptInt9 = jSONObject.optInt("image_height", -1);
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append(']');
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[id:");
        sbLIZ2.append(str2);
        sbLIZ2.append(']');
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("status=");
        sbLIZ3.append(str3);
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("from=");
        sbLIZ4.append(str4);
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("duration=");
        sbLIZ5.append(iOptInt2);
        sbLIZ5.append("ms");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ5));
        if (iOptInt3 > 0) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("download=");
            sbLIZ6.append(iOptInt3);
            sbLIZ6.append("ms");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ6));
        }
        if (iOptInt4 > 0) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("decode=");
            sbLIZ7.append(iOptInt4);
            sbLIZ7.append("ms");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ7));
        }
        if (iOptInt5 > 0) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("queue=");
            sbLIZ8.append(iOptInt5);
            sbLIZ8.append("ms");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ8));
        }
        if (iOptInt6 > 0) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("cache_seek=");
            sbLIZ9.append(iOptInt6);
            sbLIZ9.append("ms");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ9));
        }
        if (iOptInt7 > 0) {
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("size=");
            sbLIZ10.append(iOptInt7 / 1024);
            sbLIZ10.append("KB");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ10));
        }
        if (iOptInt8 > 0 && iOptInt9 > 0) {
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("dim=");
            sbLIZ11.append(iOptInt8);
            sbLIZ11.append('x');
            sbLIZ11.append(iOptInt9);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ11));
        }
        C0OPX.LJII(C13LP.LJJLIIIJ(arrayList, " ", null, null, 0, null, null, 62));
    }

    public static void LJIIIIZZ(long j, String str, String str2) {
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("load_status", "fail");
            c2344009Gk.LJIIIIZZ("load_type", "network");
            c2344009Gk.LJIIIIZZ("biz_tag", str);
            c2344009Gk.LJIIIIZZ("fail_phase", "download");
            c2344009Gk.LJIIIIZZ("error_msg", str2);
            if (j > 0) {
                c2344009Gk.LIZJ((int) j, "duration");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bulletin_image_loaded_event (download failure): ");
            sbLIZ.append(c2344009Gk.LIZ);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            C20684815ws.LJIILLIIL("bulletin_image_loaded_event", c2344009Gk.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("reportDownloadFailure error: ");
            sbLIZ2.append(e.getMessage());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static C1334050kot LIZJ(C1334040kos c1334040kos, String str, String str2, long j, int i) {
        long j2 = j;
        String str3 = str2;
        String str4 = str;
        if ((i & 1) != 0) {
            str4 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            j2 = 0;
        }
        c1334040kos.getClass();
        return new C1334050kot(new C259800zU(), str4, str3, null, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(java.lang.String r5, java.lang.String r6, X.EnumC623730OdH r7, java.lang.String r8, long r9) {
        /*
            if (r5 == 0) goto L72
            java.util.Set<java.lang.String> r0 = X.C1334040kos.LIZIZ
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L72
            X.0OdH r0 = X.EnumC623730OdH.COMPLETE
            if (r7 == r0) goto L13
            X.0OdH r0 = X.EnumC623730OdH.ERROR
            if (r7 == r0) goto L13
            return
        L13:
            r3 = 0
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6f
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r9
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L6f
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r2 = " [total="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "ms]"
            r3.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r3)
        L37:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r0 = 91
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "] [id:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "] ["
            r1.append(r0)
            java.lang.String r0 = r7.name()
            r1.append(r0)
            r0 = 93
            r1.append(r0)
            r1.append(r2)
            r0 = 32
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJII(r0)
            return
        L6f:
            java.lang.String r2 = ""
            goto L37
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1334040kos.LJFF(java.lang.String, java.lang.String, X.0OdH, java.lang.String, long):void");
    }
}
