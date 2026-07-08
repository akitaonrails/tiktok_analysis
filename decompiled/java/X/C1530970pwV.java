package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530970pwV {
    public static int LIZ;
    public static int LIZIZ;
    public static JSONObject LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static int LJFF;
    public static boolean LJI = true;
    public static final C1530950pwT LJII = new InterfaceC1530960pwU() { // from class: X.0pwT
        public static JSONObject LIZIZ(C1532710pzJ c1532710pzJ, C1532170pyR c1532170pyR, InterfaceC1532190pyT interfaceC1532190pyT) throws JSONException {
            long jLongValue;
            String str;
            String str2;
            C08AB c08ab;
            ArrayList<C443120HZe<String, Long, Integer>> arrayList;
            Object objLJJJLL;
            Long version;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("res_from", c1532170pyR.LIZIZ);
            if (interfaceC1532190pyT != null && (version = interfaceC1532190pyT.getVersion()) != null) {
                jLongValue = version.longValue();
            } else {
                jLongValue = 0;
            }
            jSONObject.put("res_version", jLongValue);
            C1529350ptt c1529350ptt = c1532710pzJ.LJJIIJ;
            String str3 = null;
            if (c1529350ptt != null) {
                str = c1529350ptt.LIZ;
            } else {
                str = null;
            }
            jSONObject.put("gecko_access_key", str);
            C1529350ptt c1529350ptt2 = c1532710pzJ.LJJIIJ;
            if (c1529350ptt2 != null) {
                str2 = c1529350ptt2.LIZIZ;
            } else {
                str2 = null;
            }
            jSONObject.put("gecko_channel", str2);
            C1529350ptt c1529350ptt3 = c1532710pzJ.LJJIIJ;
            if (c1529350ptt3 != null) {
                str3 = c1529350ptt3.LIZJ;
            }
            jSONObject.put("gecko_bundle", str3);
            C1541080qCo<C1532310pyf> c1541080qCo = c1532710pzJ.LJJIIZI;
            if (c1541080qCo != null && (c08ab = c1541080qCo.LJIIL) != null && (arrayList = c08ab.LIZJ) != null && (objLJJJLL = C13LP.LJJJLL(arrayList)) != null) {
                jSONObject.put("client_start_timing", objLJJJLL);
            }
            return jSONObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC1530960pwU
        public final boolean LIZ(C1532710pzJ c1532710pzJ, AbstractC1532350pyj<?> abstractC1532350pyj, InterfaceC1532190pyT interfaceC1532190pyT, C1532170pyR c1532170pyR, boolean z) throws JSONException {
            C1540860qCS c1540860qCSLJIIJ;
            String str;
            C1540860qCS c1540860qCSLJIIJ2;
            String str2;
            Type type = abstractC1532350pyj.LIZ;
            String str3 = "";
            Long version = null;
            if (type instanceof File) {
                AbstractC1530000puw abstractC1530000puw = C1529990puv.LIZ;
                C1541080qCo<C1532310pyf> c1541080qCo = c1532710pzJ.LJJIIZI;
                if (c1541080qCo != null && (c1540860qCSLJIIJ2 = c1541080qCo.LJIIJ()) != null && (str2 = c1540860qCSLJIIJ2.LIZ) != null) {
                    str3 = str2;
                }
                return abstractC1530000puw.preloadLocalFileToEngine(str3, c1532710pzJ.LJJIII.LIZ, LIZIZ(c1532710pzJ, c1532170pyR, interfaceC1532190pyT), ((File) type).getAbsolutePath(), Long.valueOf(C1535630q41.LJIIL));
            }
            if (type instanceof byte[]) {
                AbstractC1530000puw abstractC1530000puw2 = C1529990puv.LIZ;
                C1541080qCo<C1532310pyf> c1541080qCo2 = c1532710pzJ.LJJIIZI;
                if (c1541080qCo2 != null && (c1540860qCSLJIIJ = c1541080qCo2.LJIIJ()) != null && (str = c1540860qCSLJIIJ.LIZ) != null) {
                    str3 = str;
                }
                String str4 = c1532710pzJ.LJJIII.LIZ;
                EnumC1533980q1M enumC1533980q1M = c1532710pzJ.LJIJ;
                Map<String, ? extends Object> map = c1532710pzJ.LJ;
                JSONObject jSONObjectLIZIZ = LIZIZ(c1532710pzJ, c1532170pyR, interfaceC1532190pyT);
                if (interfaceC1532190pyT != null) {
                    version = interfaceC1532190pyT.getVersion();
                }
                return abstractC1530000puw2.preloadBytesToEngine(str3, str4, enumC1533980q1M, map, jSONObjectLIZIZ, version, (byte[]) type, Long.valueOf(C1535630q41.LJIIL));
            }
            return false;
        }
    };

    public static void LIZ(int i) {
        LIZ = i;
    }

    public static void LIZIZ(int i) {
        LIZIZ = i;
    }

    public static void LIZJ(boolean z) {
        LJI = z;
    }

    public static void LIZLLL(boolean z) {
        LJ = z;
    }

    public static void LJ(boolean z) {
        LIZLLL = z;
    }

    public static void LJFF(int i) {
        LJFF = i;
    }

    public static void LJI(JSONObject jSONObject) {
        LIZJ = jSONObject;
    }
}
