package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oTU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474540oTU extends C1474520oTS {
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public EnumC2281151EQn LJLLLLLL;
    public String LJLZ;
    public String LJZ;
    public String LJZI;
    public String LJZL;
    public String LL;
    public String LLD;
    public String LLF;
    public String LLFF;
    public int LLFFF;
    public int LLFII;
    public List<String> LLFZ;
    public List<C1474560oTW> LLI;

    public C1474540oTU() {
        super(null);
        this.LJLJJI = -1;
        this.LJLJLJ = -1L;
        this.LJLL = -1L;
        this.LLF = "";
        this.LLFF = "";
        this.LLFFF = -1;
    }

    @Override // X.C1474520oTS
    public final C0VGN LJ() {
        return null;
    }

    @Override // X.C1474520oTS
    public final C1474520oTS LIZJ() {
        C1474540oTU c1474540oTU = new C1474540oTU();
        c1474540oTU.LLFZ = new ArrayList(this.LLFZ);
        c1474540oTU.LJIIIZ = this.LJIIIZ;
        c1474540oTU.LJIIJ = this.LJIIJ;
        c1474540oTU.LJIIJJI = this.LJIIJJI;
        c1474540oTU.LJIIL = this.LJIIL;
        c1474540oTU.LJLJJL = this.LJLJJL;
        c1474540oTU.LJLJJLL = this.LJLJJLL;
        c1474540oTU.LJIIZILJ = this.LJIIZILJ;
        c1474540oTU.LJZI = this.LJZI;
        c1474540oTU.LJIILLIIL = this.LJIILLIIL;
        c1474540oTU.LJIJI = this.LJIJI;
        c1474540oTU.LJIJJ = this.LJIJJ;
        c1474540oTU.LJLLJ = this.LJLLJ;
        c1474540oTU.LJLLI = this.LJLLI;
        c1474540oTU.LJJ = this.LJJ;
        c1474540oTU.LJJIFFI = this.LJJIFFI;
        c1474540oTU.LJJII = this.LJJII;
        c1474540oTU.LJJIII = this.LJJIII;
        c1474540oTU.LJLJLLL = this.LJLJLLL;
        c1474540oTU.LJJIIJZLJL = this.LJJIIJZLJL;
        c1474540oTU.LJJIIZ = this.LJJIIZ;
        c1474540oTU.LJJIIZI = this.LJJIIZI;
        c1474540oTU.LJLZ = this.LJLZ;
        c1474540oTU.LJLLLL = this.LJLLLL;
        c1474540oTU.LJLLILLLL = this.LJLLILLLL;
        c1474540oTU.LJLJJI = this.LJLJJI;
        c1474540oTU.LJJJJLI = this.LJJJJLI;
        c1474540oTU.LJJJJJ = this.LJJJJJ;
        c1474540oTU.LJLJL = this.LJLJL;
        c1474540oTU.LJLJLJ = this.LJLJLJ;
        c1474540oTU.LL = this.LL;
        c1474540oTU.LLD = this.LLD;
        c1474540oTU.LLF = this.LLF;
        c1474540oTU.LLFF = this.LLFF;
        c1474540oTU.LLFFF = this.LLFFF;
        c1474540oTU.LLFII = this.LLFII;
        return c1474540oTU;
    }

    @Override // X.C1474520oTS
    public final Map<String, Object> LJI() {
        String str = this.LLF;
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("fid_profile_labels", this.LLF);
        return map;
    }

    @Override // X.C1474520oTS
    public final String[] LJIIJ() {
        List<String> list = this.LLFZ;
        return list != null ? (String[]) list.toArray(new String[0]) : new String[0];
    }

    @Override // X.C1474520oTS
    public final Map<String, Object> LJIILJJIL() {
        String str;
        HashMap map = new HashMap();
        map.put("file_id", LIZ(28));
        map.put("media_type", this.LJLJJI == 0 ? "video" : "audio");
        map.put("file_size", Long.valueOf(LJIIIZ(12)));
        map.put("bitrate", Integer.valueOf(LIZIZ(3)));
        map.put("quality", LIZ(18));
        map.put("definition", LIZ(7));
        EnumC2281151EQn enumC2281151EQn = this.LJLLLLLL;
        map.put("resolution", Integer.valueOf(enumC2281151EQn != null ? enumC2281151EQn.getIndex() : 0));
        map.put("width", Integer.valueOf(LIZIZ(1)));
        map.put("height", Integer.valueOf(LIZIZ(2)));
        map.put("codec", LIZ(8));
        map.put("urls", LJIIJ());
        map.put("file_hash", LIZ(15));
        map.put("dec_info", LIZ(54));
        map.put("vmaf", LIZ(50));
        map.put("gearvqm", LIZ(58));
        map.put("fid_profile_labels", LIZ(51));
        map.put("audio_file_id", LIZ(49));
        map.put("hdr_type", Integer.valueOf(LIZIZ(52)));
        map.put("fps", Integer.valueOf(LIZIZ(53)));
        map.put("is_dubbed", Integer.valueOf(this.LJJJJL ? 1 : 0));
        if (C1474810oTv.LLJL() && (str = this.LJLLL) != null && str.equals("mp4") && this.LJLJLJ != -1) {
            map.put("mp4_audio_bitrate", Integer.valueOf(LIZIZ(59)));
        }
        JSONObject jSONObject = this.LJJJI;
        if (jSONObject != null) {
            map.put("preload_gear_data", jSONObject);
        }
        if (this.LLI != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (C1474560oTW c1474560oTW : (ArrayList) this.LLI) {
                    EnumC1471440oOU enumC1471440oOU = c1474560oTW.LIZ;
                    if (enumC1471440oOU == EnumC1471440oOU.Frame) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("g_");
                        sbLIZ.append(c1474560oTW.LIZIZ);
                        jSONObject2.put(C2188811AlT.LIZIZ(sbLIZ), c1474560oTW.LIZJ);
                    } else if (enumC1471440oOU == EnumC1471440oOU.TimeInSecond) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("t_");
                        sbLIZ2.append(c1474560oTW.LIZIZ);
                        jSONObject2.put(C2188811AlT.LIZIZ(sbLIZ2), c1474560oTW.LIZJ);
                    }
                }
                map.put("preload_gear_data", jSONObject2);
                return map;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return map;
    }

    @Override // X.C1474520oTS
    public final JSONObject LJIILIIL() {
        return super.LJIILIIL();
    }

    @Override // X.C1474520oTS
    public final int LJFF() {
        return this.LJLJJI;
    }

    @Override // X.C1474520oTS
    public final boolean LJII() {
        return this.LJJJJL;
    }

    @Override // X.C1474520oTS, X.InterfaceC1474570oTX
    public final EnumC2281151EQn getResolution() {
        return this.LJLLLLLL;
    }

    @Override // X.C1474520oTS, X.InterfaceC1474570oTX
    public final String LIZ(int i) {
        if (i != 5) {
            if (i != 6) {
                if (i != 7) {
                    if (i != 8) {
                        if (i != 15) {
                            if (i != 18) {
                                if (i != 28) {
                                    if (i != 58) {
                                        if (i != 31) {
                                            if (i != 32) {
                                                if (i != 54) {
                                                    if (i != 55) {
                                                        switch (i) {
                                                            case 49:
                                                                return this.LLFF;
                                                            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                                                return this.LL;
                                                            case 51:
                                                                return this.LLF;
                                                            default:
                                                                return null;
                                                        }
                                                    }
                                                    return this.LJJJJJL;
                                                }
                                                return this.LJLIIL;
                                            }
                                            return this.LJZL;
                                        }
                                        return this.LJLLLL;
                                    }
                                    return this.LLD;
                                }
                                return this.LJLLILLLL;
                            }
                            return this.LJLZ;
                        }
                        return this.LJLLI;
                    }
                    return this.LJLLJ;
                }
                return this.LJZ;
            }
            return this.LJLLL;
        }
        return this.LJZI;
    }

    @Override // X.C1474520oTS, X.InterfaceC1474570oTX
    public final int LIZIZ(int i) {
        long j;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 27) {
                        if (i != 59) {
                            if (i != 52) {
                                if (i != 53) {
                                    return 0;
                                }
                                return this.LLFII;
                            }
                            return this.LLFFF;
                        }
                        j = this.LJLJLJ;
                    } else {
                        j = 0;
                    }
                } else {
                    j = this.LJLJL;
                }
                return (int) j;
            }
            return this.LJLJJLL;
        }
        return this.LJLJJL;
    }

    @Override // X.C1474520oTS
    public final long LJIIIZ(int i) {
        if (i != 12) {
            if (i != 30) {
                return 0L;
            }
            return this.LJLL;
        }
        return this.LJLJLLL;
    }

    @Override // X.C1474520oTS
    public final void LJIIL(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        this.LLFZ = arrayList;
        Collections.addAll(arrayList, strArr);
    }

    public final void LJIILL(JSONObject jSONObject) {
        int i;
        try {
            this.LJLLILLLL = jSONObject.optString("file_id");
            if (jSONObject.optString("media_type").compareTo("audio") == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LJLJJI = i;
            this.LJLJLLL = jSONObject.optLong("file_size");
            this.LJLJL = jSONObject.optInt("bitrate");
            this.LJLZ = jSONObject.optString("quality");
            this.LJJ = jSONObject.optString("definition");
            this.LJLLLLLL = EnumC2281151EQn.valueOf(jSONObject.optInt("resolution", 0));
            this.LJLJJL = jSONObject.optInt("width");
            this.LJLJJLL = jSONObject.optInt("height");
            this.LJLLJ = jSONObject.optString("codec");
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "urls");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string = JSONArrayProtectorUtils.getString(jSONArray, i2);
                if (!TextUtils.isEmpty(string)) {
                    if (this.LLFZ == null) {
                        this.LLFZ = new ArrayList();
                    }
                    this.LLFZ.add(string);
                }
            }
            this.LJLLI = jSONObject.optString("file_hash");
            this.LLF = jSONObject.optString("fid_profile_labels");
            this.LLFF = jSONObject.optString("audio_info_id", "");
            this.LLFFF = jSONObject.optInt("hdr_type", -1);
            this.LLFII = jSONObject.optInt("fps", 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[GearStrategy]fromMediaInfoJsonObject exception=");
            sbLIZ.append(e);
            C1471660oOq.LIZJ("TTVideoEngine.BareVideoInfo", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
