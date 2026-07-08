package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oM2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469920oM2 implements InterfaceC1467050oHP {
    public String LIZ;
    public long LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public List<C1474520oTS> LJ;
    public int LJFF;
    public boolean LJI;
    public boolean LJIIJ;
    public String LJII = "";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public String LJIIJJI = "";

    @Override // X.InterfaceC1467050oHP
    public final String LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final String LJ(List<C1474520oTS> list) {
        return "";
    }

    @Override // X.InterfaceC1467050oHP
    public final String LJIILIIL() {
        return "mp4";
    }

    @Override // X.InterfaceC1467050oHP
    public final long LJIILJJIL(int i) {
        return 0L;
    }

    @Override // X.InterfaceC1467050oHP
    public final C1474520oTS LJIJI(int i) {
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final C1468490oJj LJIJJ() {
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final JSONObject LJIL() {
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final void LJJI(HashMap<String, EnumC2281151EQn> map) {
    }

    @Override // X.InterfaceC1467050oHP
    public final boolean LJJIII() {
        return false;
    }

    @Override // X.InterfaceC1467050oHP
    public final List<C1469130oKl> LJJIIJZLJL() {
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final JSONObject LIZ() {
        List<C1474520oTS> list = this.LJ;
        try {
            HashMap map = new HashMap();
            String str = this.LJIIIIZZ;
            if (str != null && !TextUtils.isEmpty(str)) {
                map.put("did_profile_labels", this.LJIIIIZZ);
            }
            String str2 = this.LJIIIZ;
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                map.put("vid_profile_labels", this.LJIIIZ);
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<C1474520oTS> it2 = list.iterator();
                while (it2.hasNext()) {
                    Map<String, Object> mapLJI = it2.next().LJI();
                    if (mapLJI != null) {
                        arrayList.add(mapLJI);
                    }
                }
                if (arrayList.size() > 0) {
                    map.put("infos", arrayList);
                }
            }
            return new JSONObject(map);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d(th);
            return null;
        }
    }

    @Override // X.InterfaceC1467050oHP
    public final String[] LIZJ() {
        HashSet hashSet = new HashSet();
        Iterator<C1474520oTS> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            String strLIZ = it2.next().LIZ(32);
            if (!TextUtils.isEmpty(strLIZ)) {
                hashSet.add(strLIZ);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    @Override // X.InterfaceC1467050oHP
    public final String[] LJIIIIZZ() {
        HashSet hashSet = new HashSet();
        Iterator<C1474520oTS> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            String strLIZ = it2.next().LIZ(8);
            if (!TextUtils.isEmpty(strLIZ)) {
                hashSet.add(strLIZ);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    @Override // X.InterfaceC1467050oHP
    public final boolean LJIIJJI() {
        if (TextUtils.isEmpty(LJJII(8))) {
            return false;
        }
        if (LJIIJ(EnumC1469940oM4.DASH)) {
            if (!TextUtils.isEmpty(null)) {
                throw null;
            }
        } else if (LJIIJ(EnumC1469940oM4.MP4) && LJJIFFI(222) && TextUtils.isEmpty(LJJ())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1467050oHP
    public final boolean LJIIL() {
        List<C1474520oTS> list = this.LJ;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // X.InterfaceC1467050oHP
    public final String LJJ() {
        Iterator<C1474520oTS> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            String strLIZ = it2.next().LIZ(5);
            if (!TextUtils.isEmpty(strLIZ)) {
                return strLIZ;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final EnumC2281151EQn[] LJJIIZ() {
        HashSet hashSet = new HashSet();
        Iterator<C1474520oTS> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().getResolution());
        }
        return (EnumC2281151EQn[]) hashSet.toArray(new EnumC2281151EQn[0]);
    }

    public final Set<EnumC1469940oM4> LJJIJ() {
        String strLIZ;
        HashSet hashSet = new HashSet();
        List<C1474520oTS> list = this.LJ;
        if (list != null) {
            for (C1474520oTS c1474520oTS : list) {
                if (c1474520oTS != null && (strLIZ = c1474520oTS.LIZ(6)) != null) {
                    if (strLIZ.equals("mp3")) {
                        hashSet.add(EnumC1469940oM4.MP3);
                    } else if (strLIZ.equals("dash")) {
                        hashSet.add(EnumC1469940oM4.DASH);
                    } else if (strLIZ.equals("hls")) {
                        hashSet.add(EnumC1469940oM4.HLS);
                    }
                }
            }
        }
        hashSet.add(EnumC1469940oM4.MP4);
        return hashSet;
    }

    @Override // X.InterfaceC1467050oHP
    public final JSONObject LJII() {
        HashSet hashSet = (HashSet) LJJIJ();
        String str = hashSet.contains(EnumC1469940oM4.MP3) ? "mp3" : hashSet.contains(EnumC1469940oM4.DASH) ? "dash" : hashSet.contains(EnumC1469940oM4.HLS) ? "hls" : hashSet.contains(EnumC1469940oM4.MP4) ? "mp4" : "";
        String strLJJII = LJJII(2);
        long j = this.LIZIZ;
        List<C1474520oTS> list = this.LJ;
        try {
            HashMap map = new HashMap();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<C1474520oTS> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LJIILJJIL());
                }
                map.put("infos", arrayList);
            }
            map.put("format", str);
            map.put("vid", strLJJII);
            map.put("bid", this.LJII);
            map.put("category", Integer.valueOf(LJIIZILJ(232)));
            map.put("placeholder", Integer.valueOf(LJIIZILJ(254)));
            map.put("duration", Long.valueOf(j));
            map.put("did_profile_labels", LJJII(261));
            map.put("vid_profile_labels", LJJII(262));
            map.put("trans_params", LJJII(265));
            map.put("enable_adaptive", Integer.valueOf(LJJIFFI(222) ? 1 : 0));
            if (C1474810oTv.LLJL()) {
                map.put("enable_dubbed", Integer.valueOf(this.LJIIJ ? 1 : 0));
            }
            map.put("loudness", Float.valueOf(LJFF(224)));
            map.put("peak", Float.valueOf(LJFF(225)));
            return new JSONObject(map);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d(th);
            return null;
        }
    }

    @Override // X.InterfaceC1467050oHP
    public final String LJIJ() {
        JSONObject jSONObjectLJII = LJII();
        if (jSONObjectLJII != null) {
            return C786410Ut5.J3(jSONObjectLJII);
        }
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final List<C1474520oTS> LJIILL() {
        return this.LJ;
    }

    @Override // X.InterfaceC1467050oHP
    public final String LIZLLL(EnumC2281151EQn enumC2281151EQn) {
        return enumC2281151EQn.toString(0);
    }

    @Override // X.InterfaceC1467050oHP
    public final float LJFF(int i) {
        if (i != 224) {
            if (i != 225) {
                return 0.0f;
            }
            return this.LIZLLL;
        }
        return this.LIZJ;
    }

    @Override // X.InterfaceC1467050oHP
    public final boolean LJIIJ(EnumC1469940oM4 enumC1469940oM4) {
        return ((HashSet) LJJIJ()).contains(enumC1469940oM4);
    }

    @Override // X.InterfaceC1467050oHP
    public final int LJIIZILJ(int i) {
        if (i != 3) {
            if (i == 7 || i != 232) {
                return 0;
            }
            return this.LJFF;
        }
        return (int) this.LIZIZ;
    }

    @Override // X.InterfaceC1467050oHP
    public final boolean LJJIFFI(int i) {
        if (i != 222) {
            return false;
        }
        return this.LJI;
    }

    @Override // X.InterfaceC1467050oHP
    public final String LJJII(int i) {
        if (i != 2) {
            if (i != 246) {
                if (i != 265) {
                    if (i != 261) {
                        if (i != 262) {
                            return null;
                        }
                        return this.LJIIIZ;
                    }
                    return this.LJIIIIZZ;
                }
                return this.LJIIJJI;
            }
            return this.LJII;
        }
        return this.LIZ;
    }

    public final int LJJIIZI(JSONObject jSONObject) {
        try {
            this.LIZ = jSONObject.optString("vid");
            String strOptString = jSONObject.optString("bid");
            this.LJII = strOptString;
            if (TextUtils.isEmpty(strOptString)) {
                this.LJII = this.LIZ;
            }
            this.LJFF = jSONObject.optInt("category");
            this.LIZIZ = jSONObject.optLong("duration");
            this.LJIIIIZZ = jSONObject.optString("did_profile_labels");
            this.LJIIIZ = jSONObject.optString("vid_profile_labels");
            this.LJIIJJI = jSONObject.optString("trans_params");
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "infos");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    C1474540oTU c1474540oTULIZ = new C1474550oTV().LIZ();
                    c1474540oTULIZ.LJIILL(JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
                    if (this.LJ == null) {
                        this.LJ = new ArrayList();
                    }
                    this.LJ.add(c1474540oTULIZ);
                }
            }
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[GearStrategy]fromMediaInfoJsonObject exception=");
            sbLIZ.append(e);
            C1471660oOq.LIZJ("TTVideoEngine.BareVideoModel", C2188811AlT.LIZIZ(sbLIZ));
            return -1;
        }
    }

    @Override // X.InterfaceC1467050oHP
    public final String[] LJI(EnumC2281151EQn enumC2281151EQn, Map<Integer, String> map) {
        C1474520oTS c1474520oTSLJIILLIIL = LJIILLIIL(enumC2281151EQn, map);
        if (c1474520oTSLJIILLIIL == null) {
            return new String[0];
        }
        return c1474520oTSLJIILLIIL.LJIIJ();
    }

    @Override // X.InterfaceC1467050oHP
    public final C1474520oTS LJIILLIIL(EnumC2281151EQn enumC2281151EQn, Map<Integer, String> map) {
        return LJJIIJ(enumC2281151EQn, LJIIZILJ(7), map);
    }

    @Override // X.InterfaceC1467050oHP
    public final C1474520oTS LJIIIZ(EnumC2281151EQn enumC2281151EQn, Map<Integer, String> map, boolean z) {
        return LJIJJLI(enumC2281151EQn, LJIIZILJ(7), map, z);
    }

    @Override // X.InterfaceC1467050oHP
    public final C1474520oTS LJJIIJ(EnumC2281151EQn enumC2281151EQn, int i, Map<Integer, String> map) {
        Iterator<C1474520oTS> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            C1474520oTS next = it2.next();
            if (next != null && enumC2281151EQn == next.getResolution() && i == next.LJFF()) {
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<Integer, String> entry : map.entrySet()) {
                        int iIntValue = entry.getKey().intValue();
                        String value = entry.getValue();
                        if (TextUtils.isEmpty(value) || value.equals(next.LIZ(iIntValue))) {
                        }
                    }
                    return next;
                }
                return next;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final C1474520oTS LJIJJLI(EnumC2281151EQn enumC2281151EQn, int i, Map<Integer, String> map, boolean z) {
        C1474520oTS c1474520oTSLJJIIJ = LJJIIJ(enumC2281151EQn, i, map);
        if (!z) {
            return c1474520oTSLJJIIJ;
        }
        EnumC2281151EQn[] allResolutions = EnumC2281151EQn.getAllResolutions();
        if (allResolutions.length <= 0) {
            return c1474520oTSLJJIIJ;
        }
        int length = allResolutions.length - 1;
        if (enumC2281151EQn != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= allResolutions.length) {
                    break;
                }
                if (allResolutions[i2].getIndex() == enumC2281151EQn.getIndex()) {
                    length = i2;
                    break;
                }
                i2++;
            }
        }
        int length2 = length;
        if (c1474520oTSLJJIIJ == null) {
            do {
                c1474520oTSLJJIIJ = LJJIIJ(allResolutions[length2], i, null);
                if (c1474520oTSLJJIIJ != null) {
                    break;
                }
                length2 = ((length2 + allResolutions.length) - 1) % allResolutions.length;
            } while (length2 != length);
        }
        return c1474520oTSLJJIIJ;
    }
}
