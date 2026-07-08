package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473400oRe {
    public EnumC2281151EQn[] LIZIZ;
    public String[] LJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public String LJJIFFI;
    public int LJJII;
    public List<C1474520oTS> LJJIII;
    public List<C1474520oTS> LJJIIJ;
    public List<C1474520oTS> LJJIIJZLJL;
    public List<C1474520oTS> LJJIIZ;
    public String LJJIIZI;
    public String LJJIJ;
    public String[] LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public C1471650oOp LJJIJL;
    public List<C1473440oRi> LJJIJLIJ;
    public List<C1469130oKl> LJJIL;
    public String LJJJIL;
    public String LJJJJ;
    public String LJJJJI;
    public JSONObject LJJJJLI;
    public long LJJJJLL;
    public String LJJJJZ;
    public String LJJLIIIJILLIZJL;
    public int[] LJJLIIIJJI;
    public C1468490oJj LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLJ;
    public int LJJLL;
    public int LJJZ;
    public String LJJZZI;
    public String LJJZZIII;
    public C1473410oRf LJLI;
    public List<C1473440oRi> LJLIIIL;
    public int LJLIIL;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJJI;
    public int LJLJJL;
    public String LJLJL;
    public int LJLJLJ;
    public C1473410oRf LJLJLLL;
    public int LIZ = 1;
    public final ArrayList<EnumC2281151EQn> LIZJ = new ArrayList<>();
    public final ArrayList<String> LIZLLL = new ArrayList<>();
    public String[] LJFF = null;
    public String LJI = "";
    public String LJII = "mp4";
    public String LJIIIIZZ = "";
    public boolean LJIIIZ = false;
    public boolean LJIIJ = false;
    public boolean LJIIJJI = false;
    public boolean LJIIL = false;
    public boolean LJIILIIL = false;
    public boolean LJIILJJIL = false;
    public boolean LJIILL = false;
    public boolean LJIILLIIL = false;
    public final int[] LJIIZILJ = {-1, -1};
    public boolean LJIJ = false;
    public float LJJIZ = 0.0f;
    public float LJJJ = 0.0f;
    public float LJJJI = 0.0f;
    public boolean LJJJJIZL = false;
    public HashMap<String, EnumC2281151EQn> LJJJJJ = new HashMap<String, EnumC2281151EQn>() { // from class: X.1EQo
        {
            put("240p", EnumC2281151EQn.L_Standard);
            put("360p", EnumC2281151EQn.Standard);
            put("480p", EnumC2281151EQn.High);
            put("540p", EnumC2281151EQn.H_High);
            put("720p", EnumC2281151EQn.SuperHigh);
            put("1080p", EnumC2281151EQn.ExtremelyHigh);
            put("2k", EnumC2281151EQn.TwoK);
            put("4k", EnumC2281151EQn.FourK);
            put("hdr", EnumC2281151EQn.HDR);
            put("1080p 50fps", EnumC2281151EQn.ExtremelyHigh_50F);
            put("2k 50fps", EnumC2281151EQn.TwoK_50F);
            put("4k 50fps", EnumC2281151EQn.FourK_50F);
            put("1080p 60fps", EnumC2281151EQn.ExtremelyHigh_60F);
            put("2k 60fps", EnumC2281151EQn.TwoK_60F);
            put("4k 60fps", EnumC2281151EQn.FourK_60F);
            put("1080p 120fps", EnumC2281151EQn.ExtremelyHigh_120F);
            put("2k 120fps", EnumC2281151EQn.TwoK_120F);
            put("4k 120fps", EnumC2281151EQn.FourK_120F);
            put("240p HDR", EnumC2281151EQn.L_Standard_HDR);
            put("360p HDR", EnumC2281151EQn.Standard_HDR);
            put("480p HDR", EnumC2281151EQn.High_HDR);
            put("540p HDR", EnumC2281151EQn.H_High_HDR);
            put("720p HDR", EnumC2281151EQn.SuperHigh_HDR);
            put("1080p HDR", EnumC2281151EQn.ExtremelyHigh_HDR);
            put("2k HDR", EnumC2281151EQn.TwoK_HDR);
            put("4k HDR", EnumC2281151EQn.FourK_HDR);
            put("8k", EnumC2281151EQn.EightK);
            put("1080p+", EnumC2281151EQn.ExtremelyHighPlus);
        }
    };
    public HashMap<String, EnumC2281151EQn> LJJJJJL = new HashMap<String, EnumC2281151EQn>() { // from class: X.0oRh
        {
            put("medium", EnumC2281151EQn.Standard);
            put("higher", EnumC2281151EQn.High);
            put("highest", EnumC2281151EQn.SuperHigh);
            put("original", EnumC2281151EQn.ExtremelyHigh);
            put("lossless", EnumC2281151EQn.FourK);
        }
    };
    public int LJJJJL = 0;
    public float LJJJJZI = 0.0f;
    public float LJJJLIIL = 0.0f;
    public float LJJJLL = 0.0f;
    public float LJJJLZIJ = 0.0f;
    public float LJJJZ = 0.0f;
    public float LJJL = 0.0f;
    public float LJJLI = 0.0f;
    public int LJJLIIIIJ = 0;
    public String LJJLIIIJ = "";
    public String LJJLIIIJLJLI = "";
    public String LJJLIIIJLLLLLLLZ = "";
    public String LJJLIIJ = "";
    public int LJJLIL = 0;
    public List<C1474520oTS> LJJLJLI = null;
    public int LJL = 0;
    public long LJLJI = 0;
    public long LJLJJLL = 0;
    public String LJLL = "";
    public String LJLLI = "";
    public String LJLLILLLL = "";
    public float LJLLJ = 0.0f;
    public float LJLLL = 0.0f;
    public final C1473390oRd LJLLLL = new C1473390oRd(this);
    public final C1470260oMa LJLLLLLL = new C1470260oMa(this);

    public final List LJII() {
        C1473400oRe c1473400oRe = this.LJLLLLLL.LIZ;
        if (c1473400oRe.LIZ == 2) {
            return null;
        }
        return c1473400oRe.LJJIIZ;
    }

    public final List<C1474520oTS> LJIIJ() {
        if (this.LIZ == 2) {
            return this.LJJLJLI;
        }
        List<C1474520oTS> list = this.LJJIII;
        List<C1474520oTS> list2 = (list == null || list.size() <= 0) ? null : this.LJJIII;
        List<C1474520oTS> list3 = this.LJJIIJ;
        return (list3 == null || list3.size() <= 0) ? list2 : this.LJJIIJ;
    }

    public final String LJIIL() {
        return LIZLLL(LJIIJ());
    }

    public static JSONObject LIZ(List<C1474520oTS> list) {
        JSONObject jSONObjectLJIILIIL;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    for (C1474520oTS c1474520oTS : list) {
                        if (c1474520oTS != null && (jSONObjectLJIILIIL = c1474520oTS.LJIILIIL()) != null) {
                            if (c1474520oTS.LJFF() == 0) {
                                jSONArray.put(jSONObjectLJIILIIL);
                            } else if (c1474520oTS.LJFF() == 1) {
                                jSONArray2.put(jSONObjectLJIILIIL);
                            }
                        }
                    }
                    if (jSONArray.length() > 0 || jSONArray2.length() > 0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("dynamic_video_list", jSONArray);
                        jSONObject.put("dynamic_audio_list", jSONArray2);
                        return jSONObject;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public final void LIZJ(JSONObject jSONObject) {
        this.LJLLLL.LIZ(jSONObject);
    }

    public final String LIZLLL(List<C1474520oTS> list) {
        JSONObject jSONObjectLIZ = LIZ(list);
        if (jSONObjectLIZ != null) {
            try {
                jSONObjectLIZ.put("did_profile_labels", LJIIIIZZ(261));
                jSONObjectLIZ.put("vid_profile_labels", LJIIIIZZ(262));
                jSONObjectLIZ.put("vq_score", LJFF(263));
                jSONObjectLIZ.put("sr_score", LJFF(264));
                return C786410Ut5.J3(jSONObjectLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return "";
            }
        }
        return "";
    }

    public final Boolean LJ(int i) {
        C1470260oMa c1470260oMa = this.LJLLLLLL;
        if (i != 106) {
            if (i != 222) {
                if (i != 253) {
                    if (i != 228) {
                        if (i != 229) {
                            switch (i) {
                                case 203:
                                    return Boolean.valueOf(c1470260oMa.LIZ.LJIIJJI);
                                case 204:
                                    return Boolean.valueOf(c1470260oMa.LIZ.LJIIIZ);
                                case 205:
                                    return Boolean.valueOf(c1470260oMa.LIZ.LJIIL);
                                case 206:
                                    return Boolean.valueOf(c1470260oMa.LIZ.LJIILJJIL);
                                case 207:
                                    return Boolean.valueOf(c1470260oMa.LIZ.LJIILIIL);
                                case 208:
                                    return Boolean.valueOf(c1470260oMa.LIZ.LJIILL);
                                default:
                                    c1470260oMa.getClass();
                                    return Boolean.FALSE;
                            }
                        }
                        return Boolean.valueOf(c1470260oMa.LIZ.LJIILLIIL);
                    }
                    return Boolean.valueOf(c1470260oMa.LIZ.LJIIJ);
                }
                return Boolean.valueOf(c1470260oMa.LIZ.LJIJ);
            }
            return Boolean.valueOf(c1470260oMa.LIZ.LJJI);
        }
        return Boolean.valueOf(c1470260oMa.LIZ.LJJ);
    }

    public final float LJFF(int i) {
        C1470260oMa c1470260oMa = this.LJLLLLLL;
        if (i != 224) {
            if (i != 225) {
                if (i != 236) {
                    if (i != 252) {
                        if (i != 239) {
                            if (i != 240) {
                                if (i != 263) {
                                    if (i != 264) {
                                        switch (i) {
                                            case 247:
                                                return c1470260oMa.LIZ.LJJJLZIJ;
                                            case 248:
                                                return c1470260oMa.LIZ.LJJJZ;
                                            case 249:
                                                return c1470260oMa.LIZ.LJJL;
                                            case 250:
                                                return c1470260oMa.LIZ.LJJLI;
                                            default:
                                                c1470260oMa.getClass();
                                                return 0.0f;
                                        }
                                    }
                                    return c1470260oMa.LIZ.LJLLL;
                                }
                                return c1470260oMa.LIZ.LJLLJ;
                            }
                            return c1470260oMa.LIZ.LJJJI;
                        }
                        return c1470260oMa.LIZ.LJJJ;
                    }
                    return c1470260oMa.LIZ.LJJJLL;
                }
                return c1470260oMa.LIZ.LJJIZ;
            }
            return c1470260oMa.LIZ.LJJJLIIL;
        }
        return c1470260oMa.LIZ.LJJJJZI;
    }

    public final int LJI(int i) {
        C1473400oRe c1473400oRe = this.LJLLLLLL.LIZ;
        int i2 = c1473400oRe.LIZ;
        if (i2 == 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 7) {
                        if (i != 209) {
                            if (i != 230) {
                                if (i != 232) {
                                    if (i != 242) {
                                        if (i == 251) {
                                            return c1473400oRe.LJJLIIIIJ;
                                        }
                                        return 0;
                                    }
                                    return c1473400oRe.LJLJJL;
                                }
                                return c1473400oRe.LJJLIL;
                            }
                            return c1473400oRe.LJIIZILJ[1];
                        }
                        return c1473400oRe.LJLIIL;
                    }
                    return c1473400oRe.LJL;
                }
                return c1473400oRe.LJJLL;
            }
            return c1473400oRe.LJJZ;
        }
        if (i != 3) {
            if (i != 4) {
                if (i != 7) {
                    if (i == 9) {
                        return i2;
                    }
                    if (i != 209) {
                        if (i != 227) {
                            if (i != 230) {
                                if (i != 232) {
                                    if (i != 242) {
                                        if (i == 251) {
                                            return c1473400oRe.LJJLIIIIJ;
                                        }
                                        return 0;
                                    }
                                    return c1473400oRe.LJLJJL;
                                }
                                return c1473400oRe.LJJLIL;
                            }
                            return c1473400oRe.LJIIZILJ[1];
                        }
                        return c1473400oRe.LJJII;
                    }
                    return c1473400oRe.LJLJLJ;
                }
                return c1473400oRe.LJJJJL;
            }
            return c1473400oRe.LJJIJIIJIL;
        }
        return c1473400oRe.LJJIJIL;
    }

    public final String LJIIIIZZ(int i) {
        C1470260oMa c1470260oMa = this.LJLLLLLL;
        if (i == 211) {
            return c1470260oMa.LIZ.LJII;
        }
        if (i == 215) {
            return c1470260oMa.LIZ.LJI;
        }
        if (i == 8) {
            return c1470260oMa.LIZ.LJIIIIZZ;
        }
        if (i == 233) {
            c1470260oMa.LIZ.getClass();
            return null;
        }
        if (i == 237) {
            return c1470260oMa.LIZ.LJJLIIIJLJLI;
        }
        if (i == 244) {
            return c1470260oMa.LIZ.LJJLIIIJLLLLLLLZ;
        }
        if (i == 261) {
            return c1470260oMa.LIZ.LJLL;
        }
        if (i == 262) {
            return c1470260oMa.LIZ.LJLLI;
        }
        if (i == 265) {
            return c1470260oMa.LIZ.LJLLILLLL;
        }
        if (i == 245) {
            return c1470260oMa.LIZ.LJJLIIIJL;
        }
        if (i == 260) {
            return c1470260oMa.LIZ.LJJLIIIJ;
        }
        C1473400oRe c1473400oRe = c1470260oMa.LIZ;
        if (c1473400oRe.LIZ == 2) {
            if (i != 2) {
                if (i != 7) {
                    if (i != 201) {
                        return "";
                    }
                    return c1473400oRe.LJJZZI;
                }
                return c1473400oRe.LJJZZIII;
            }
            return c1473400oRe.LJJLJ;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 7) {
                    if (i != 201) {
                        if (i != 221) {
                            if (i != 223) {
                                if (i != 226) {
                                    if (i != 235) {
                                        if (i != 241) {
                                            if (i != 246) {
                                                if (i != 104) {
                                                    if (i != 105) {
                                                        if (i != 217) {
                                                            if (i != 218) {
                                                                switch (i) {
                                                                    case 107:
                                                                        return c1473400oRe.LJIL;
                                                                    case 108:
                                                                        return c1473400oRe.LJJIIZI;
                                                                    case 109:
                                                                        return c1473400oRe.LJJIJ;
                                                                    default:
                                                                        return "";
                                                                }
                                                            }
                                                            return c1473400oRe.LJJJJ;
                                                        }
                                                        return c1473400oRe.LJJJJI;
                                                    }
                                                    return c1473400oRe.LJIJJLI;
                                                }
                                                return c1473400oRe.LJJIFFI;
                                            }
                                            return c1473400oRe.LJJLIIJ;
                                        }
                                        return c1473400oRe.LJLJJI;
                                    }
                                    return c1473400oRe.LJLILLLLZI;
                                }
                                return c1473400oRe.LJJLIIIJILLIZJL;
                            }
                            return c1473400oRe.LJJJJZ;
                        }
                        return c1473400oRe.LJLIL;
                    }
                    return c1473400oRe.LJLJL;
                }
                return c1473400oRe.LJJJIL;
            }
            return c1473400oRe.LJIJJ;
        }
        return c1473400oRe.LJIJI;
    }

    public final void LJIIJJI(int i, String str) {
        C1470260oMa c1470260oMa = this.LJLLLLLL;
        c1470260oMa.getClass();
        if (i != 218) {
            if (i != 245) {
                if (i == 246) {
                    c1470260oMa.LIZ.LJJLIIJ = str;
                    return;
                }
                return;
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                c1470260oMa.LIZ.LJJLIIIJL = str;
                return;
            }
        }
        c1470260oMa.LIZ.LJJJJ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0186 A[PHI: r2
      0x0186: PHI (r2v11 X.1EQn) = 
      (r2v10 X.1EQn)
      (r2v12 X.1EQn)
      (r2v13 X.1EQn)
      (r2v14 X.1EQn)
      (r2v15 X.1EQn)
      (r2v16 X.1EQn)
      (r2v17 X.1EQn)
      (r2v18 X.1EQn)
      (r2v19 X.1EQn)
      (r2v20 X.1EQn)
      (r2v21 X.1EQn)
      (r2v22 X.1EQn)
      (r2v23 X.1EQn)
      (r2v24 X.1EQn)
      (r2v25 X.1EQn)
      (r2v26 X.1EQn)
      (r2v27 X.1EQn)
      (r2v28 X.1EQn)
      (r2v29 X.1EQn)
      (r2v30 X.1EQn)
      (r2v31 X.1EQn)
      (r2v32 X.1EQn)
      (r2v33 X.1EQn)
      (r2v34 X.1EQn)
      (r2v35 X.1EQn)
      (r2v36 X.1EQn)
      (r2v37 X.1EQn)
     binds: [B:8:0x0042, B:12:0x0058, B:14:0x0064, B:16:0x0070, B:18:0x007c, B:20:0x0088, B:22:0x0094, B:24:0x00a0, B:26:0x00ac, B:28:0x00b8, B:30:0x00c4, B:32:0x00d0, B:34:0x00dc, B:36:0x00e8, B:38:0x00f4, B:40:0x0100, B:42:0x010c, B:44:0x0118, B:46:0x0124, B:48:0x0130, B:50:0x013c, B:52:0x0148, B:54:0x0154, B:56:0x0160, B:58:0x016c, B:60:0x0178, B:62:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1474520oTS LIZIZ(int r8, java.lang.String r9, org.json.JSONObject r10) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1473400oRe.LIZIZ(int, java.lang.String, org.json.JSONObject):X.0oTS");
    }

    public final C1474520oTS LJIIIZ(EnumC2281151EQn enumC2281151EQn, int i, Map<Integer, String> map) {
        List<C1474520oTS> listLJIIJ = LJIIJ();
        if (listLJIIJ != null && listLJIIJ.size() != 0) {
            for (C1474520oTS c1474520oTS : listLJIIJ) {
                if (c1474520oTS != null && i == c1474520oTS.LJFF()) {
                    if (map != null && map.containsKey(32)) {
                        String str = map.get(32);
                        if (!TextUtils.isEmpty(c1474520oTS.LIZ(32)) && c1474520oTS.LIZ(32).equals(str)) {
                            return c1474520oTS;
                        }
                    }
                    if (enumC2281151EQn == c1474520oTS.getResolution()) {
                        if (map != null && map.size() != 0) {
                            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                                int iIntValue = entry.getKey().intValue();
                                String value = entry.getValue();
                                if (TextUtils.isEmpty(value) || value.equals(c1474520oTS.LIZ(iIntValue))) {
                                }
                            }
                        }
                        return c1474520oTS;
                    }
                    continue;
                }
            }
        }
        return null;
    }
}
