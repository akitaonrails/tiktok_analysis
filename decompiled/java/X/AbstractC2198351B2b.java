package X;

import Y.ARunnableS36S1200000_34;
import android.util.Base64;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pns.psi.PsiEncrypt;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.IDN;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2198351B2b {
    public final C2198401B2g LL;

    public AbstractC2198351B2b(C2198401B2g c2198401B2g) {
        this.LL = c2198401B2g;
    }

    public static URL LIZJ(boolean z) {
        String str;
        String str2;
        if (C1B2S.LIZIZ.LIZJ.endsWith("/")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1B2S.LIZIZ.LIZJ);
            if (z) {
                str2 = "api/private_verify/v1";
            } else {
                str2 = "api/verify/v1";
            }
            sbLIZ.append(str2);
            return new URL(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C1B2S.LIZIZ.LIZJ);
        if (z) {
            str = "/api/private_verify/v1";
        } else {
            str = "/api/verify/v1";
        }
        sbLIZ2.append(str);
        return new URL(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LIZLLL(String str) {
        String type = EnumC2086808Fm.Other.getType();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_type", type);
            jSONObject.put("error_code", -1);
            jSONObject.put("error_info", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        int i = C2198391B2f.LJI;
        if (i == 0) {
            C2198391B2f.LJI = 1;
            C2198391B2f.LJII = System.currentTimeMillis();
        } else if (i < 3) {
            if (System.currentTimeMillis() - C2198391B2f.LJII < 1800000) {
                C2198391B2f.LJI++;
            } else {
                C2198391B2f.LJI = 1;
                C2198391B2f.LJII = System.currentTimeMillis();
            }
        }
        if (C2198391B2f.LJI >= 3) {
            C2198391B2f.LJI = 0;
            C2198391B2f.LJII = 0L;
            C2198391B2f.LJIIIIZZ = System.currentTimeMillis();
        }
    }

    public static C1B2U LJ(String str) {
        int iHandleThisType_int;
        boolean z;
        C1B2U c1b2u = new C1B2U();
        System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        if (str != null && str.trim().length() != 0) {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("type")) {
                C2198441B2k.LIZ = JSONObjectProtectorUtils.getString(jSONObject, "type");
            }
            if (jSONObject.has("results")) {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "results");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    ArrayList arrayList2 = new ArrayList();
                    if (jSONObject2.has("reblinded_target_list") && !jSONObject2.isNull("reblinded_target_list")) {
                        JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "reblinded_target_list");
                        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                            String strOptString = jSONArray2.optString(i2, "");
                            if (strOptString != null && strOptString.trim().length() > 0) {
                                arrayList2.add(strOptString);
                            }
                        }
                        if (jSONObject2.has("encrypted_risks") && !jSONObject2.isNull("encrypted_risks")) {
                            arrayList.add(new Pair(arrayList2, JSONObjectProtectorUtils.getString(jSONObject2, "encrypted_risks")));
                        }
                    }
                }
            }
        }
        String str2 = C2198441B2k.LIZ;
        byte[] bArr = C2198391B2f.LIZ().LIZ;
        if (!arrayList.isEmpty() && bArr.length != 0) {
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    Pair pair = (Pair) obj;
                    List list = (List) pair.getFirst();
                    String str3 = (String) pair.getSecond();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        int[] iArr = {0};
                        int iTryDecryptAeadPayload_int = PsiEncrypt.LIZ.tryDecryptAeadPayload_int(bArr, Base64.decode((String) it2.next(), 2), str3, iArr);
                        if (iArr[0] == 0) {
                            arrayList3.add(Integer.valueOf(iTryDecryptAeadPayload_int));
                        }
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            iHandleThisType_int = PsiEncrypt.LIZ.handleThisType_int(C13LP.LLII(arrayList3), str2);
        } else {
            iHandleThisType_int = -1;
        }
        System.currentTimeMillis();
        c1b2u.LIZIZ = iHandleThisType_int;
        if (iHandleThisType_int > 3) {
            z = true;
        } else {
            z = false;
        }
        c1b2u.LIZJ = z;
        c1b2u.LIZLLL = 900L;
        if (iHandleThisType_int >= 0) {
            z2 = true;
        }
        c1b2u.LIZ = z2;
        return c1b2u;
    }

    public static C1B2U LJFF(String str) {
        JSONObject jSONObject = new JSONObject(str);
        C1B2U c1b2u = new C1B2U();
        c1b2u.LIZIZ = JSONObjectProtectorUtils.getInt(jSONObject, "risk");
        c1b2u.LIZJ = JSONObjectProtectorUtils.getBoolean(jSONObject, "show_mid_page");
        c1b2u.LIZLLL = JSONObjectProtectorUtils.getLong(jSONObject, "safe_duration");
        jSONObject.optBoolean("show_banner", false);
        jSONObject.optString("banner_text");
        c1b2u.LIZ = true;
        JSONObjectProtectorUtils.getInt(jSONObject, "risk");
        return c1b2u;
    }

    public final JSONObject LIZIZ(boolean z) throws JSONException {
        Object string;
        String protocol;
        String ascii;
        String path;
        String query;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aid", this.LL.LIZ);
        jSONObject.put(Scene.SCENE_SERVICE, this.LL.LIZIZ);
        jSONObject.put("ts", this.LL.LIZLLL);
        jSONObject.put("sync", this.LL.LJ);
        if (this.LL.LJFF < 3) {
            jSONObject.put("flag", true);
        } else {
            jSONObject.put("flag", false);
        }
        this.LL.getClass();
        String str = this.LL.LIZ + "|" + this.LL.LIZIZ + "|" + this.LL.LIZJ + "|" + this.LL.LIZLLL + "|seclink_verify";
        String ref = "";
        if (str == null) {
            string = null;
        } else {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
                for (byte b : bArrDigest) {
                    char[] cArr = C2198431B2j.LIZ;
                    char c = cArr[(b & 240) >> 4];
                    char c2 = cArr[b & 15];
                    sb.append(c);
                    sb.append(c2);
                }
                string = sb.toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                string = "";
            }
        }
        jSONObject.put("token", string);
        String str2 = this.LL.LIZJ;
        if (z) {
            try {
                System.currentTimeMillis();
                URL url = new URL(str2);
                if (url.getProtocol() == null) {
                    protocol = "";
                } else {
                    protocol = url.getProtocol();
                }
                if (url.getHost() == null || IDN.toASCII(url.getHost()) == null) {
                    ascii = "";
                } else {
                    ascii = IDN.toASCII(url.getHost());
                }
                if (url.getPath() == null) {
                    path = "";
                } else {
                    path = url.getPath();
                }
                if (url.getQuery() == null) {
                    query = "";
                } else {
                    query = url.getQuery();
                }
                if (url.getRef() != null) {
                    ref = url.getRef();
                }
                List listLIZ = C13MN.LIZ(Arrays.asList(PsiEncrypt.LIZ.breakdownUrl(protocol, ascii, path, query, ref)), C2198391B2f.LIZ().LIZ);
                JSONArray jSONArray = new JSONArray();
                for (Pair pair : (ArrayList) listLIZ) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("prefix", pair.getFirst());
                    jSONObject2.put("blinded_target", pair.getSecond());
                    jSONArray.put(jSONObject2);
                }
                System.currentTimeMillis();
                jSONObject.put("encrypted_request", jSONArray);
                return jSONObject;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return jSONObject;
            }
        }
        jSONObject.put("target", str2);
        return jSONObject;
    }

    public final void LJII(C1B2U c1b2u) {
        long j = c1b2u.LIZLLL;
        if (j > 0) {
            long j2 = j * 1000;
            C1B2W c1b2wLIZ = C1B2W.LIZ();
            c1b2wLIZ.getClass();
            if (j2 >= 0 && j2 != C1B2W.LIZJ) {
                C1B2W.LIZJ = j2;
                c1b2wLIZ.LIZIZ.edit().putLong("valid_time", j2).apply();
            }
        }
        C2198401B2g c2198401B2g = this.LL;
        InterfaceC2198451B2l interfaceC2198451B2l = c2198401B2g.LJI;
        if (interfaceC2198451B2l != null) {
            String str = c2198401B2g.LIZJ;
            C2198411B2h c2198411B2h = (C2198411B2h) interfaceC2198451B2l;
            InterfaceC2198421B2i interfaceC2198421B2i = c2198411B2h.LIZ.LJI;
            if (interfaceC2198421B2i != null) {
                c1b2u.LJ = str;
                interfaceC2198421B2i.LIZ(c1b2u);
            }
            if (c1b2u.LIZJ) {
                C786410Ut5.LJJZZIII(c2198411B2h.LIZ.LJII, new ARunnableS36S1200000_34(c2198411B2h, str, c1b2u, 5));
            }
            c2198411B2h.LIZ.LJFF = str;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSuccess url : ");
            sbLIZ.append(str);
            sbLIZ.append(", response : ");
            sbLIZ.append(c1b2u);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final void LIZ(C1B2U c1b2u, C1B2U c1b2u2) {
        int i;
        int i2;
        if (c1b2u != null && c1b2u2 != null && (i = c1b2u.LIZIZ) != (i2 = c1b2u2.LIZIZ)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("risk", i);
                jSONObject.put("pet_risk", i2);
                jSONObject.put("url", this.LL.LIZJ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C793770VBv.LJII("seclink_risk_diff_event", jSONObject, null, null);
        }
    }
}
