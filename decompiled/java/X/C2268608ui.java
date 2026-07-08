package X;

import android.graphics.Bitmap;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.vesdk.VEUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08ui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2268608ui {
    public String LIZ;
    public boolean LIZIZ;
    public Boolean LIZJ;
    public int LIZLLL;
    public String LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public Long LJIIL;
    public String LJIILIIL;
    public ConcurrentHashMap<String, n> LJIILJJIL;
    public final C01GW LJIILL;
    public final ConcurrentHashMap.KeySetView<AnonymousClass0957<Object>, Boolean> LJIILLIIL;
    public final C1DEV LJIIZILJ;

    public C2268608ui() {
        this(null, false, null, null, null, 16383);
    }

    public final String LIZ() {
        String strLJIL;
        k kVarLJJIIZ;
        ConcurrentHashMap<String, n> concurrentHashMap = this.LJIILJJIL;
        int iLJIIJJI = 0;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<Map.Entry<String, n>> it2 = concurrentHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                n value = it2.next().getValue();
                k kVarLJJIIZ2 = value.LJJIIZ("path");
                if (kVarLJJIIZ2 == null || (strLJIL = kVarLJJIIZ2.LJIL()) == null) {
                    strLJIL = "";
                }
                String str = (String) C13LP.LJJLIIIJL(a0.LJJLIIIJILLIZJL(strLJIL, new String[]{"/"}, iLJIIJJI, 6));
                if (str == null) {
                    str = "";
                }
                JSONObject jSONObject = new JSONObject();
                k kVarLJJIIZ3 = value.LJJIIZ("width");
                if (kVarLJJIIZ3 != null) {
                    iLJIIJJI = kVarLJJIIZ3.LJIIJJI();
                }
                jSONObject.put("width", iLJIIJJI);
                k kVarLJJIIZ4 = value.LJJIIZ("height");
                jSONObject.put("height", kVarLJJIIZ4 != null ? kVarLJJIIZ4.LJIIJJI() : 0);
                k kVarLJJIIZ5 = value.LJJIIZ("duration");
                jSONObject.put("duration", kVarLJJIIZ5 != null ? kVarLJJIIZ5.LJIIZILJ() : 0L);
                k kVarLJJIIZ6 = value.LJJIIZ("isVideo");
                jSONObject.put("isVideo", kVarLJJIIZ6 != null ? kVarLJJIIZ6.LJ() : false);
                k kVarLJJIIZ7 = value.LJJIIZ("hasAudio");
                jSONObject.put("hasAudio", kVarLJJIIZ7 != null ? kVarLJJIIZ7.LJ() : false);
                jSONObject.put("path", strLJIL);
                jSONObject.put("name", str);
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put("image");
                jSONObject.put("includes", jSONArray2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("meta", jSONObject);
                k kVarLJJIIZ8 = value.LJJIIZ("meta");
                h hVarLJIIL = kVarLJJIIZ8 != null ? kVarLJJIIZ8.LJIIL() : null;
                if (hVarLJIIL != null && hVarLJIIL.size() > 0) {
                    JSONArray jSONArray3 = new JSONArray();
                    int size = hVarLJIIL.size();
                    for (int i = 0; i < size; i++) {
                        k kVarLJJIIJZLJL = hVarLJIIL.LJJIIJZLJL(i);
                        String strLJIL2 = (kVarLJJIIJZLJL == null || (kVarLJJIIZ = kVarLJJIIJZLJL.LJIILIIL().LJJIIZ("name")) == null) ? null : kVarLJJIIZ.LJIL();
                        if (C123100dR.LIZ(strLJIL2)) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("name", strLJIL2);
                            jSONArray3.put(jSONObject3);
                        }
                    }
                    if (jSONArray3.length() > 0) {
                        jSONObject2.put("frame_infos", jSONArray3);
                    }
                }
                jSONArray.put(jSONObject2);
                iLJIIJJI = 0;
            }
            if (jSONArray.length() == 0) {
                return "";
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("image_info_list", jSONArray);
            return C786410Ut5.J3(jSONObject4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to build image_info_list rec_config from map: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LIZLLL(c1398350mUb, "UploadAssetsResult", C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
    }

    public static String LIZLLL(List list) {
        int i;
        int i2;
        h hVar = new h();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                String strLIZIZ = C0MH3.LIZIZ(C1330760kja.LIZ, str);
                if (strLIZIZ != null) {
                    str = strLIZIZ;
                }
                int i3 = 0;
                if (str.length() > 0) {
                    VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
                    boolean zLJIILL = C2286708xd.LJIILL(str);
                    n nVar = new n();
                    if (videoFileInfo != null) {
                        i = videoFileInfo.width;
                    } else {
                        i = 0;
                    }
                    nVar.LJJIII(Integer.valueOf(i), "width");
                    if (videoFileInfo != null) {
                        i2 = videoFileInfo.height;
                    } else {
                        i2 = 0;
                    }
                    nVar.LJJIII(Integer.valueOf(i2), "height");
                    if (!zLJIILL && videoFileInfo != null) {
                        i3 = videoFileInfo.duration;
                    }
                    nVar.LJJIII(Integer.valueOf(i3), "duration");
                    nVar.LJJII(Boolean.valueOf(!zLJIILL), "isVideo");
                    nVar.LJJII(Boolean.FALSE, "hasAudio");
                    nVar.LJJIIJ("path", str);
                    nVar.LJJIFFI("meta", new h());
                    hVar.LJJIFFI(nVar);
                }
            }
        }
        if (hVar.size() == 0) {
            return "";
        }
        return hVar.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be A[Catch: all -> 0x0183, TryCatch #0 {all -> 0x0183, blocks: (B:60:0x0129, B:61:0x012c, B:63:0x0135, B:64:0x013d, B:66:0x0143, B:67:0x0153, B:71:0x015f, B:73:0x0175, B:74:0x0178, B:70:0x015b, B:41:0x00aa, B:42:0x00ad, B:44:0x00be, B:45:0x00c6, B:47:0x00ef, B:48:0x00f2, B:27:0x006b, B:29:0x0073, B:32:0x007b, B:33:0x007f, B:35:0x0085, B:37:0x0091, B:38:0x009b, B:51:0x00fa, B:52:0x00fe, B:54:0x0104, B:56:0x0110, B:57:0x011a), top: B:83:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef A[Catch: all -> 0x0183, TryCatch #0 {all -> 0x0183, blocks: (B:60:0x0129, B:61:0x012c, B:63:0x0135, B:64:0x013d, B:66:0x0143, B:67:0x0153, B:71:0x015f, B:73:0x0175, B:74:0x0178, B:70:0x015b, B:41:0x00aa, B:42:0x00ad, B:44:0x00be, B:45:0x00c6, B:47:0x00ef, B:48:0x00f2, B:27:0x006b, B:29:0x0073, B:32:0x007b, B:33:0x007f, B:35:0x0085, B:37:0x0091, B:38:0x009b, B:51:0x00fa, B:52:0x00fe, B:54:0x0104, B:56:0x0110, B:57:0x011a), top: B:83:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135 A[Catch: all -> 0x0183, TryCatch #0 {all -> 0x0183, blocks: (B:60:0x0129, B:61:0x012c, B:63:0x0135, B:64:0x013d, B:66:0x0143, B:67:0x0153, B:71:0x015f, B:73:0x0175, B:74:0x0178, B:70:0x015b, B:41:0x00aa, B:42:0x00ad, B:44:0x00be, B:45:0x00c6, B:47:0x00ef, B:48:0x00f2, B:27:0x006b, B:29:0x0073, B:32:0x007b, B:33:0x007f, B:35:0x0085, B:37:0x0091, B:38:0x009b, B:51:0x00fa, B:52:0x00fe, B:54:0x0104, B:56:0x0110, B:57:0x011a), top: B:83:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b A[Catch: all -> 0x0183, TryCatch #0 {all -> 0x0183, blocks: (B:60:0x0129, B:61:0x012c, B:63:0x0135, B:64:0x013d, B:66:0x0143, B:67:0x0153, B:71:0x015f, B:73:0x0175, B:74:0x0178, B:70:0x015b, B:41:0x00aa, B:42:0x00ad, B:44:0x00be, B:45:0x00c6, B:47:0x00ef, B:48:0x00f2, B:27:0x006b, B:29:0x0073, B:32:0x007b, B:33:0x007f, B:35:0x0085, B:37:0x0091, B:38:0x009b, B:51:0x00fa, B:52:0x00fe, B:54:0x0104, B:56:0x0110, B:57:0x011a), top: B:83:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0175 A[Catch: all -> 0x0183, TryCatch #0 {all -> 0x0183, blocks: (B:60:0x0129, B:61:0x012c, B:63:0x0135, B:64:0x013d, B:66:0x0143, B:67:0x0153, B:71:0x015f, B:73:0x0175, B:74:0x0178, B:70:0x015b, B:41:0x00aa, B:42:0x00ad, B:44:0x00be, B:45:0x00c6, B:47:0x00ef, B:48:0x00f2, B:27:0x006b, B:29:0x0073, B:32:0x007b, B:33:0x007f, B:35:0x0085, B:37:0x0091, B:38:0x009b, B:51:0x00fa, B:52:0x00fe, B:54:0x0104, B:56:0x0110, B:57:0x011a), top: B:83:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0182 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<java.lang.String> r11, X.InterfaceC1364105Vn<? super java.lang.String> r12) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2268608ui.LIZIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    public final void LIZJ(String str, List<Pair<Bitmap, String>> list) {
        if (str != null && str.length() != 0) {
            this.LJIILLIIL.add(C23250099c.LIZIZ((InterfaceC497601wk) this.LJIILL.getValue(), null, null, new C2265008u8(this, str, list, null), 3));
        }
    }

    public C2268608ui(String str, boolean z, String str2, String str3, String str4, int i) {
        str = (i & 1) != 0 ? null : str;
        z = (i & 2) != 0 ? false : z;
        str2 = (i & 1024) != 0 ? null : str2;
        str3 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str3;
        str4 = (i & 8192) != 0 ? null : str4;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = null;
        this.LIZLLL = 0;
        this.LJ = null;
        this.LJFF = 0L;
        this.LJI = 0L;
        this.LJII = 0L;
        this.LJIIIIZZ = 0L;
        this.LJIIIZ = 0L;
        this.LJIIJ = str2;
        this.LJIIJJI = str3;
        this.LJIIL = null;
        this.LJIILIIL = str4;
        this.LJIILJJIL = new ConcurrentHashMap<>();
        this.LJIILL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(392));
        this.LJIILLIIL = ConcurrentHashMap.newKeySet();
        this.LJIIZILJ = C2191201ApK.LIZ();
    }
}
