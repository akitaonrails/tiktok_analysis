package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.fetcher.VideoInfoFetcher;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import fyo.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VOY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VOY extends C0VOV {
    public EnumC2281151EQn LJIJJ;
    public String LJIJJLI = "h264";
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public VideoInfoFetcher LJJIFFI;
    public C1470240oMY LJJII;
    public int LJJIII;
    public Map<Integer, String> LJJIIJ;
    public HashMap<String, EnumC2281151EQn> LJJIIJZLJL;
    public EnumC2281151EQn LJJIIZ;
    public String LJJIIZI;
    public String LJJIJ;
    public String LJJIJIIJI;
    public int LJJIJIIJIL;

    public final void LJIIL() {
        int iLIZ;
        this.LJJIIZI = null;
        this.LJJIFFI = null;
        VideoInfoFetcher videoInfoFetcher = new VideoInfoFetcher(null);
        this.LJJIFFI = videoInfoFetcher;
        videoInfoFetcher.LJII = new InterfaceC1468830oKH(this) { // from class: X.0VOZ
            public final WeakReference<C0VOY> LIZ;

            @Override // X.InterfaceC1468830oKH
            public final void LIZ(e eVar) {
            }

            @Override // X.InterfaceC1468830oKH
            public final void onLog(String str) {
            }

            {
                this.LIZ = new WeakReference<>(this);
            }

            @Override // X.InterfaceC1468830oKH
            public final void LIZIZ(int i, String str) {
                C0VOY c0voy = this.LIZ.get();
                if (c0voy == null) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error info: apiString = ");
                sbLIZ.append(this.LIZIZ.LJJIIZI);
                sbLIZ.append(" authString = ");
                this.LIZIZ.getClass();
                sbLIZ.append((String) null);
                sbLIZ.append(" apiVersion = ");
                sbLIZ.append(this.LIZIZ.LJJIII);
                sbLIZ.append(" state = ");
                sbLIZ.append(i);
                c0voy.LJI(new e("kTTVideoErrorDomainFetchingInfo", -9996, i, C2188811AlT.LIZIZ(sbLIZ)));
            }

            @Override // X.InterfaceC1468830oKH
            public final void LIZJ(C1470240oMY c1470240oMY, e eVar) {
                C0VOY c0voy = this.LIZ.get();
                if (c0voy == null) {
                    return;
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("did fetch video modeo, videoId is ");
                sbLIZ.append(c0voy.LJIIL);
                TTVideoEngineLog.d("TTVideoEngine.DownloadVidTask", C2188811AlT.LIZIZ(sbLIZ));
                int i2 = c0voy.LJFF;
                if (i2 != 4 && i2 != 5) {
                    if (c1470240oMY != null) {
                        c0voy.LJIILIIL(c1470240oMY);
                        if (c0voy.LJFF == 3) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("but state is suspended. videoId = ");
                            sbLIZ2.append(c0voy.LJIIL);
                            TTVideoEngineLog.d("TTVideoEngine.DownloadVidTask", C2188811AlT.LIZIZ(sbLIZ2));
                            return;
                        }
                        c0voy.LJIIJJI(c1470240oMY);
                        return;
                    }
                    if (eVar != null) {
                        c0voy.LJI(eVar);
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("but state is canceled. videoId = ");
                sbLIZ3.append(c0voy.LJIIL);
                TTVideoEngineLog.d("TTVideoEngine.DownloadVidTask", C2188811AlT.LIZIZ(sbLIZ3));
            }
        };
        VideoInfoFetcher videoInfoFetcher2 = this.LJJIFFI;
        videoInfoFetcher2.LJIIIZ = this.LJJIIJZLJL;
        videoInfoFetcher2.LJIIL = this.LJIIL;
        videoInfoFetcher2.LJIIIZ(true);
        if (!TextUtils.isEmpty(this.LJJIJ)) {
            try {
                iLIZ = C795750VJl.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iLIZ = 0;
            }
            String strJ4 = C786410Ut5.j4("%s&method=%d", new Object[]{this.LJJIJ, Integer.valueOf(iLIZ)});
            this.LJJIIZI = strJ4;
            if (this.LJJI) {
                this.LJJIIZI = C795730VJj.LIZLLL(strJ4);
            }
            String strLIZ = C790040Uyw.LIZ(this.LJJIIZI);
            this.LJJIIZI = strLIZ;
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZJ("TTVideoEngine.DownloadVidTask", C786410Ut5.j4("[downloader] api string from fallback api:%s ,keySeed = %s", new Object[]{strLIZ, this.LJJIJIIJI}));
            VideoInfoFetcher videoInfoFetcher3 = this.LJJIFFI;
            videoInfoFetcher3.getClass();
            videoInfoFetcher3.LJI = true;
            this.LJJIFFI.LJII(0, this.LJJIIZI, null, this.LJJIJIIJI);
            return;
        }
        HashMap map = new HashMap();
        if (this.LJIJJLI.equals("bytevc2")) {
            map.put("codec_type", "4");
        } else if (this.LJIJJLI.equals("bytevc1")) {
            map.put("codec_type", "3");
        }
        if (this.LJIL) {
            map.put("format_type", "dash");
        }
        if (this.LJJ) {
            map.put("ssl", "1");
        }
        String strLIZ2 = C790040Uyw.LIZ(this.LJJIIZI);
        this.LJJIIZI = strLIZ2;
        this.LJJIFFI.LJII(this.LJJIII, strLIZ2, null, null);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[downloader] fetch videoModel, apiString = ");
        sbLIZ.append(this.LJJIIZI);
        C1471660oOq.LIZJ("TTVideoEngine.DownloadVidTask", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C0VOY LJIILJJIL() {
        C0VOY c0voy = new C0VOY();
        super.LJIIIZ();
        c0voy.LJJIJIIJIL = 0;
        c0voy.LIZJ = "vid_task";
        c0voy.LJJIII = 0;
        c0voy.LJIJJ = EnumC2281151EQn.Standard;
        return c0voy;
    }

    @Override // X.C0VOV
    public final JSONObject LIZJ() {
        HashMap map = new HashMap();
        C0VOV.LJFF("base_json", map, LIZLLL());
        C0VOV.LJ("codec_type", this.LJIJJLI, map);
        map.put("base_dash", Boolean.valueOf(this.LJIL));
        map.put("https", Boolean.valueOf(this.LJJ));
        map.put("boe", Boolean.valueOf(this.LJJI));
        C0VOV.LJ("resolution", EnumC2281151EQn.toString(this.LJIJJ), map);
        C0VOV.LJFF("param", map, this.LJJIIJ);
        HashMap<String, EnumC2281151EQn> map2 = this.LJJIIJZLJL;
        if (map2 != null && map2.size() > 0) {
            HashMap map3 = new HashMap();
            for (String str : this.LJJIIJZLJL.keySet()) {
                map3.put(str, EnumC2281151EQn.toString(this.LJJIIJZLJL.get(str)));
            }
            C0VOV.LJFF("resolution_map", map, map3);
        }
        map.put("api_version", Integer.valueOf(this.LJJIII));
        C0VOV.LJ("curr_resolution", EnumC2281151EQn.toString(this.LJJIIZ), map);
        JSONObject jSONObject = new JSONObject(map);
        try {
            try {
                C1470240oMY c1470240oMY = this.LJJII;
                if (c1470240oMY != null) {
                    jSONObject.putOpt("video_model", c1470240oMY.LJFF);
                }
                return jSONObject;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("TTVideoEngine.DownloadVidTask", "[downloader] jsonObject fail.");
                return jSONObject;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jSONObject;
        }
    }

    @Override // X.C0VOV
    public final void LJII() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[downloader] did call resume, videoId = ");
        sbLIZ.append(this.LJIIL);
        TTVideoEngineLog.d("TTVideoEngine.DownloadVidTask", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIJJI) {
            TTVideoEngineLog.d("TTVideoEngine.DownloadVidTask", "[downloader] task did canceled");
            return;
        }
        if (this.LJFF == 2) {
            TTVideoEngineLog.d("TTVideoEngine.DownloadVidTask", "[downloader] state is running");
            return;
        }
        super.LJII();
        C0VOT c0vot = this.LJIILJJIL;
        if (c0vot == null || c0vot.LIZLLL(this)) {
            this.LJJIJIIJIL = 0;
            LJIIIIZZ(2);
            C0VOT c0vot2 = this.LJIILJJIL;
            if (c0vot2 != null) {
                c0vot2.LIZJ(this);
            }
            C1470240oMY c1470240oMY = this.LJJII;
            if (c1470240oMY != null) {
                LJIIJJI(c1470240oMY);
            } else {
                LJIIL();
            }
        }
    }

    @Override // X.C0VOV
    public final boolean LIZ(e eVar) {
        if (!super.LIZ(eVar) || this.LJJIJIIJIL >= 10) {
            return false;
        }
        return true;
    }

    @Override // X.C0VOV
    public final void LIZIZ(JSONObject jSONObject) {
        super.LIZIZ(jSONObject.optJSONObject("base_json"));
        this.LJIJJLI = jSONObject.optString("codec_type");
        this.LJIL = jSONObject.optBoolean("base_dash");
        this.LJJ = jSONObject.optBoolean("https");
        this.LJJI = jSONObject.optBoolean("boe");
        EnumC2281151EQn enumC2281151EQnForString = EnumC2281151EQn.forString(jSONObject.optString("resolution"));
        this.LJIJJ = enumC2281151EQnForString;
        if (enumC2281151EQnForString == EnumC2281151EQn.Undefine) {
            this.LJIJJ = EnumC2281151EQn.Standard;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("param");
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
            this.LJJIIJ = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                ((HashMap) this.LJJIIJ).put(CastIntegerProtector.valueOf(next), jSONObjectOptJSONObject.optString(next));
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("resolution_map");
        if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
            this.LJJIIJZLJL = new HashMap<>();
            Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                this.LJJIIJZLJL.put(next2, EnumC2281151EQn.forString(jSONObjectOptJSONObject2.optString(next2)));
            }
        }
        this.LJJIII = jSONObject.optInt("api_version");
        this.LJJIIZ = EnumC2281151EQn.forString(jSONObject.optString("curr_resolution"));
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("video_model");
        if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.length() > 0) {
            C1470240oMY c1470240oMY = new C1470240oMY();
            try {
                c1470240oMY.LJJIJ(jSONObjectOptJSONObject3);
                LJIILIIL(c1470240oMY);
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    int i = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("TTVideoEngine.DownloadVidTask", "[downloader] ssignWithJson fail.");
                    LJIILIIL(null);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    LJIILIIL(c1470240oMY);
                    throw th2;
                }
            }
        }
    }

    @Override // X.C0VOV
    public final void LJI(e eVar) {
        if (LIZ(eVar)) {
            this.LJJIJIIJIL++;
            LJIIL();
        } else {
            super.LJI(eVar);
        }
    }

    public final boolean LJIIJ(C1474520oTS c1474520oTS) {
        String[] strArrLJIIJ = c1474520oTS.LJIIJ();
        String strLIZ = c1474520oTS.LIZ(15);
        if (strArrLJIIJ != null && strArrLJIIJ.length >= 1 && !TextUtils.isEmpty(strLIZ)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[downloader] download urlinfo videoId = ");
            sbLIZ.append(this.LJIIL);
            sbLIZ.append(" ");
            sbLIZ.append(c1474520oTS.getResolution().toString());
            sbLIZ.append(" filehash = ");
            sbLIZ.append(strLIZ);
            TTVideoEngineLog.d("TTVideoEngine.DownloadVidTask", C2188811AlT.LIZIZ(sbLIZ));
            this.LJIIIIZZ.add(strLIZ);
            this.LJIIIZ.put(strLIZ, Arrays.asList(strArrLJIIJ));
            DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
            String strLJJIFFI = dataLoaderHelper.LJJIFFI(strLIZ, this.LJIIL, strArrLJIIJ, this.LJIJ.version, this.LJIJI);
            C1476290oWJ.LIZ(strArrLJIIJ[0]);
            if (dataLoaderHelper.LJJJJZI(strLJJIFFI)) {
                return true;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("resume download fail. url = ");
            sbLIZ2.append(strLJJIFFI);
            sbLIZ2.append(" dataloader state is ");
            sbLIZ2.append(dataLoaderHelper.LJJJ());
            LJI(new e("kTTVideoErrorDomainDownload", -9996, 0, C2188811AlT.LIZIZ(sbLIZ2)));
            return false;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("error info  urls or filehash is null: apiString = ");
        sbLIZ3.append(this.LJJIIZI);
        sbLIZ3.append(" authString = ");
        sbLIZ3.append((String) null);
        sbLIZ3.append(" filehash = ");
        sbLIZ3.append(strLIZ);
        LJI(new e("kTTVideoErrorDomainFetchingInfo", -9996, 0, C2188811AlT.LIZIZ(sbLIZ3)));
        return false;
    }

    public final void LJIIJJI(C1470240oMY c1470240oMY) {
        this.LJIIIIZZ.clear();
        this.LJIIIZ = new HashMap<>();
        String strLIZIZ = c1470240oMY.LIZIZ();
        if (!TextUtils.isEmpty(strLIZIZ) && strLIZIZ.equals("segment_base")) {
            C1474520oTS c1474520oTSLJIJJLI = c1470240oMY.LJIJJLI(this.LJIJJ, 1, this.LJJIIJ, true);
            if (c1474520oTSLJIJJLI != null) {
                if (!LJIIJ(c1474520oTSLJIJJLI)) {
                    return;
                } else {
                    this.LJJIIZ = c1474520oTSLJIJJLI.getResolution();
                }
            }
            C1474520oTS c1474520oTSLJIJJLI2 = c1470240oMY.LJIJJLI(this.LJIJJ, 0, this.LJJIIJ, true);
            if (c1474520oTSLJIJJLI2 == null || !LJIIJ(c1474520oTSLJIJJLI2)) {
                return;
            }
            this.LJJIIZ = c1474520oTSLJIJJLI2.getResolution();
            return;
        }
        C1474520oTS c1474520oTSLJIIIZ = c1470240oMY.LJIIIZ(this.LJIJJ, this.LJJIIJ, true);
        if (c1474520oTSLJIIIZ == null || !LJIIJ(c1474520oTSLJIIIZ)) {
            return;
        }
        this.LJJIIZ = c1474520oTSLJIIIZ.getResolution();
    }

    public final void LJIILIIL(C1470240oMY c1470240oMY) {
        this.LJJII = c1470240oMY;
        String strLJJII = c1470240oMY.LJJII(217);
        String strLJJII2 = c1470240oMY.LJJII(218);
        if (!TextUtils.isEmpty(strLJJII)) {
            this.LJJIJ = strLJJII;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[downloader] set fallbackapi ");
            sbLIZ.append(strLJJII);
            C1471660oOq.LIZJ("TTVideoEngine.DownloadVidTask", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!TextUtils.isEmpty(strLJJII2)) {
            this.LJJIJIIJI = strLJJII2;
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[downloader] set keyseed ");
            sbLIZ2.append(this.LJJIJIIJI);
            C1471660oOq.LIZJ("TTVideoEngine.DownloadVidTask", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final boolean equals(Object obj) {
        ArrayList<String> arrayList;
        if (obj == null) {
            return false;
        }
        if (super.equals(obj)) {
            return true;
        }
        if (!obj.getClass().equals(C0VOY.class)) {
            return false;
        }
        C0VOY c0voy = (C0VOY) obj;
        ArrayList<String> arrayList2 = this.LJIIIIZZ;
        if (arrayList2 != null && arrayList2.size() > 0 && (arrayList = c0voy.LJIIIIZZ) != null) {
            return this.LJIIIIZZ.equals(arrayList);
        }
        String str = this.LJIIL;
        if (str != null) {
            String str2 = c0voy.LJIIL;
            if (str2 == null || !str.equals(str2)) {
                return false;
            }
        } else if (c0voy.LJIIL != null) {
            return false;
        }
        if (this.LJIL != c0voy.LJIL || !this.LJIJJLI.equals(c0voy.LJIJJLI) || this.LJIJJ != c0voy.LJIJJ) {
            return false;
        }
        return true;
    }
}
