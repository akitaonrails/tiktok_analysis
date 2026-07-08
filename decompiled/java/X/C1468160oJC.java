package X;

import Y.ARunnableS0S2110000_13;
import Y.ARunnableS18S1100000_13;
import Y.ARunnableS32S0110000_13;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ttm.player.s;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.tts.oecverify.BdTuring;
import fyo.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oJC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468160oJC implements InterfaceC1467240oHi {
    public static int LLLJIL = 1;
    public static final Map LLLJL = new HashMap();
    public static volatile boolean LLLL = false;
    public final C1468140oJA LIZLLL;
    public final C1468230oJJ LJ;
    public final C1467110oHV LJFF;
    public final C1467140oHY LJI;
    public C1468180oJE LJII;
    public final C1468470oJh LJIIIIZZ;
    public C1468040oJ0 LJIIIZ;
    public C1467650oIN LJIIJ;
    public C1468270oJN LJIIJJI;
    public boolean LJIIL;
    public ArrayList LJIILL;
    public ArrayList<String> LJIILLIIL;
    public ArrayList LJIIZILJ;
    public ArrayList LJIJ;
    public ArrayList LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public String LJJI;
    public int LJJIIZI;
    public boolean LJJIJ;
    public Map LJJIJIIJI;
    public String LJJJI;
    public long LJJJIL;
    public int LJJJJIZL;
    public long LJJJJJ;
    public int LJJJJJL;
    public int LJJJJL;
    public int LJJJJLI;
    public String LJJJJZ;
    public int LJJJJZI;
    public int LJJJLIIL;
    public InterfaceC1467050oHP LJJJLL;
    public long LJJL;
    public long LJJLI;
    public int LJJLIIIIJ;
    public final Context LJJLIIIJ;
    public boolean LJL;
    public boolean LJLI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public String LJLJLJ;
    public C1468450oJf LJLJLLL;
    public C1468240oJK LJLL;
    public C1468320oJS LJLLI;
    public int LJLLILLLL;
    public C1467120oHW LJLLL;
    public C1467160oHa LJLLLL;
    public C1468300oJQ LJLLLLLL;
    public String LJLZ;
    public final C790090Uz1 LJZ;
    public C0V3P LJZI;
    public int LL;
    public boolean LLD;
    public boolean LLF;
    public int LLFF;
    public long LLFFF;
    public int LLFII;
    public int LLFZ;
    public InterfaceC1469660oLc LLI;
    public C1468350oJV LLJJIJI;
    public final C1468250oJL LLLJ;
    public int LJIILIIL = Integer.MIN_VALUE;
    public int LJIILJJIL = Integer.MIN_VALUE;
    public String LJJIFFI = "";
    public String LJJII = "";
    public int LJJIII = Integer.MIN_VALUE;
    public String LJJIIJ = "";
    public String LJJIIJZLJL = "";
    public int LJJIIZ = Integer.MIN_VALUE;
    public int LJJIJIIJIL = Integer.MIN_VALUE;
    public int LJJIJIL = Integer.MIN_VALUE;
    public int LJJIJL = Integer.MIN_VALUE;
    public int LJJIJLIJ = Integer.MIN_VALUE;
    public int LJJIL = Integer.MIN_VALUE;
    public int LJJIZ = Integer.MIN_VALUE;
    public long LJJJ = -2147483648L;
    public int LJJJJ = Integer.MIN_VALUE;
    public int LJJJJI = Integer.MIN_VALUE;
    public int LJJJJLL = Integer.MIN_VALUE;
    public long LJJJLZIJ = -2147483648L;
    public long LJJJZ = -2147483648L;
    public String LJJLIIIJILLIZJL = "";
    public int LJJLIIIJJI = -1002;
    public long LJJLIIIJJIZ = -2147483648L;
    public long LJJLIIIJL = -2147483648L;
    public int LJJLIIIJLJLI = Integer.MIN_VALUE;
    public int LJJLIIIJLLLLLLLZ = Integer.MIN_VALUE;
    public int LJJLIIJ = Integer.MIN_VALUE;
    public int LJJLIL = Integer.MIN_VALUE;
    public int LJJLJ = Integer.MIN_VALUE;
    public int LJJLJLI = Integer.MIN_VALUE;
    public long LJJLL = -2147483648L;
    public long LJJZ = -2147483648L;
    public long LJJZZI = -2147483648L;
    public int LJJZZIII = Integer.MIN_VALUE;
    public int LJLIIIL = Integer.MIN_VALUE;
    public int LJLIIL = Integer.MIN_VALUE;
    public int LJLIL = Integer.MIN_VALUE;
    public int LJLILLLLZI = Integer.MIN_VALUE;
    public float LJLJL = Float.MIN_VALUE;
    public int LJLLJ = 100;
    public int LJZL = 12;
    public final Map LLIFFJFJJ = new HashMap();
    public int LLII = Integer.MIN_VALUE;
    public int LLIIII = 0;
    public int LLIIIILZ = Integer.MIN_VALUE;
    public int LLIIIJ = Integer.MIN_VALUE;
    public int LLIIIL = Integer.MIN_VALUE;
    public int LLIIIZ = Integer.MIN_VALUE;
    public int LLIIJI = Integer.MIN_VALUE;
    public int LLIIJLIL = Integer.MIN_VALUE;
    public String LLIIL = "";
    public String LLIILII = "";
    public String LLIILZL = "";
    public long LLIIZ = -2147483648L;
    public String LLIL = null;
    public C1469110oKj LLILII = null;
    public int LLILIL = 0;
    public long LLILL = 0;
    public int LLILLIZIL = Integer.MIN_VALUE;
    public int LLILLJJLI = Integer.MIN_VALUE;
    public int LLILLL = Integer.MIN_VALUE;
    public int LLILZ = Integer.MIN_VALUE;
    public int LLILZIL = Integer.MIN_VALUE;
    public int LLILZLL = Integer.MIN_VALUE;
    public int LLIZ = Integer.MIN_VALUE;
    public int LLIZLLLIL = Integer.MIN_VALUE;
    public int LLJ = Integer.MIN_VALUE;
    public int LLJI = Integer.MIN_VALUE;
    public int LLJIJIL = Integer.MIN_VALUE;
    public int LLJILJIL = Integer.MIN_VALUE;
    public int LLJILJILJ = Integer.MIN_VALUE;
    public int LLJILLL = Integer.MIN_VALUE;
    public int LLJJ = Integer.MIN_VALUE;
    public String LLJJI = "";
    public long LLJJIII = -2147483648L;
    public ArrayList<String> LLJJIJIIJIL = new ArrayList<>();
    public ArrayList<String> LLJJIJIL = new ArrayList<>();
    public ArrayList<String> LLJJJ = new ArrayList<>();
    public ArrayList<String> LLJJJIL = new ArrayList<>();
    public ArrayList<String> LLJJJJ = new ArrayList<>();
    public ArrayList<String> LLJJJJJIL = new ArrayList<>();
    public ArrayList<String> LLJJJJLIIL = new ArrayList<>();
    public ArrayList<Integer> LLJJL = new ArrayList<>();
    public ArrayList<Integer> LLJJLIIIJLLLLLLLZ = new ArrayList<>();
    public ArrayList<String> LLJL = new ArrayList<>();
    public boolean LLJLIL = false;
    public e LLJLILLLLZIIL = null;
    public int LLJLL = -1;
    public long LLJLLIL = -2147483648L;
    public long LLJLLL = -2147483648L;
    public long LLJZ = -2147483648L;
    public long LLJZIJLIL = -2147483648L;
    public long LLL = -2147483648L;
    public int LLLF = Integer.MIN_VALUE;
    public HashMap<String, Object> LLLFF = null;
    public String LLLFFI = "default";
    public int LLLFZ = Integer.MIN_VALUE;
    public int LLLI = Integer.MIN_VALUE;
    public int LLLII = Integer.MIN_VALUE;
    public ArrayList<String> LLLIIII = new ArrayList<>();
    public float LLLIIIIL = Float.MIN_VALUE;
    public int LLLIIIL = Integer.MIN_VALUE;
    public long LLLIIL = -2147483648L;
    public HashMap<String, Object> LLLIILIL = null;
    public int LLLIL = Integer.MIN_VALUE;
    public String LLLILZ = "";
    public ArrayList<String> LLLILZJ = new ArrayList<>();
    public String LLLILZLLLI = "";
    public String LLLIZZ = "";
    public InterfaceC1468020oIy LIZIZ = null;
    public C1468170oJD LIZJ = new C1468170oJD();

    public static long LJJIJIIJI(int i, int i2) {
        long j;
        long j2;
        if (i == 1) {
            j = ((long) i2) * 10;
            j2 = 1;
        } else if (i == 2) {
            j = ((long) i2) * 10;
            j2 = 2;
        } else if (i == 3) {
            j = ((long) i2) * 10;
            j2 = 3;
        } else {
            if (i != 4) {
                return i2;
            }
            j = ((long) i2) * 10;
            j2 = 4;
        }
        return j - j2;
    }

    public final void LJJJJLI() {
        WeakReference<InterfaceC790020Uyu> weakReference;
        this.LJIIL = true;
        this.LJIILL = new ArrayList();
        this.LJIILLIIL = new ArrayList<>();
        this.LJIIZILJ = new ArrayList();
        this.LJIJ = new ArrayList();
        this.LJIJI = new ArrayList();
        this.LJIJJ = null;
        this.LJIJJLI = null;
        this.LJIL = null;
        this.LJJ = null;
        this.LJJI = null;
        this.LJJIFFI = null;
        this.LJJII = null;
        this.LJJIII = Integer.MIN_VALUE;
        this.LJJIIJZLJL = "";
        this.LJJIJIIJI = null;
        this.LJJIJIL = Integer.MIN_VALUE;
        this.LJJIJL = Integer.MIN_VALUE;
        this.LJJJJJL = 0;
        this.LJJJJL = 0;
        this.LJJJJIZL = 0;
        this.LJJJJLI = 0;
        this.LJJJJJ = 0L;
        this.LJJJLIIL = 0;
        this.LJJJJZI = 0;
        this.LJJL = 0L;
        this.LJJLI = 0L;
        this.LJJZZIII = Integer.MIN_VALUE;
        this.LJLIIL = Integer.MIN_VALUE;
        this.LJLIL = Integer.MIN_VALUE;
        this.LJLILLLLZI = Integer.MIN_VALUE;
        this.LJLI = false;
        this.LJL = false;
        this.LJJLIL = Integer.MIN_VALUE;
        this.LJJIJLIJ = Integer.MIN_VALUE;
        this.LJJIL = Integer.MIN_VALUE;
        this.LJJIIJ = null;
        this.LJJJJI = Integer.MIN_VALUE;
        C1468180oJE c1468180oJE = this.LJII;
        int i = c1468180oJE.LJJLIIJ;
        boolean z = c1468180oJE.LJJLI;
        C790010Uyt c790010Uyt = C1468180oJE.LJJZZI;
        if (c790010Uyt != null && (weakReference = c1468180oJE.LIZJ) != null) {
            ((ReentrantLock) c790010Uyt.LIZJ).lock();
            c790010Uyt.LIZLLL.remove(weakReference);
            ((ReentrantLock) c790010Uyt.LIZJ).unlock();
        }
        C1468180oJE c1468180oJE2 = new C1468180oJE(this.LIZIZ, this.LJLJJI, this.LJJLIIIJ);
        this.LJII = c1468180oJE2;
        c1468180oJE2.LJJLIIJ = i;
        c1468180oJE2.LJJLI = z;
        if (this.LJIIJJI != null) {
            C1468270oJN c1468270oJN = new C1468270oJN(c1468180oJE2);
            this.LJIIJJI = c1468270oJN;
            c1468270oJN.LIZ = this.LJLJL;
        }
        C1468140oJA c1468140oJA = this.LIZLLL;
        C1468180oJE c1468180oJE3 = this.LJII;
        c1468140oJA.LIZ = c1468180oJE3;
        C1468230oJJ c1468230oJJ = this.LJ;
        if (c1468230oJJ != null) {
            c1468230oJJ.LIZ = c1468180oJE3;
        }
        C1467110oHV c1467110oHV = this.LJFF;
        if (c1467110oHV != null) {
            c1467110oHV.LIZ = c1468180oJE3;
        }
        this.LJIIIIZZ.getClass();
        this.LJI.LIZ = c1468180oJE3;
        this.LLJJIJI = new C1468350oJV();
        this.LJLLLL = new C1467160oHa();
        this.LJZI = new C0V3P();
        C1468250oJL c1468250oJL = this.LLLJ;
        if (!((HashMap) c1468250oJL.LIZ).isEmpty()) {
            c1468250oJL.LIZ = new HashMap();
        }
        this.LLIILZL = null;
        this.LLIIZ = -2147483648L;
        this.LLILII = null;
        this.LLIL = null;
        this.LLILIL = 0;
        this.LLIIII = 0;
        this.LL = 0;
        this.LLILL = 0L;
        this.LLILLIZIL = Integer.MIN_VALUE;
        this.LLILLL = Integer.MIN_VALUE;
        this.LLILLJJLI = Integer.MIN_VALUE;
        this.LLILZ = Integer.MIN_VALUE;
        this.LLILZIL = Integer.MIN_VALUE;
        this.LLILZLL = Integer.MIN_VALUE;
        this.LLIZ = Integer.MIN_VALUE;
        this.LLIZLLLIL = Integer.MIN_VALUE;
        this.LLJ = Integer.MIN_VALUE;
        this.LLJI = Integer.MIN_VALUE;
        this.LLJIJIL = Integer.MIN_VALUE;
    }

    public final void LLF() {
        this.LJLJJI = true;
        this.LJII.LJJLIL = true;
    }

    @Override // X.InterfaceC1467240oHi
    public final int LJI() {
        C1468140oJA c1468140oJA = this.LIZLLL;
        if (c1468140oJA != null) {
            return c1468140oJA.LIZLLL.LJ;
        }
        return -1;
    }

    @Override // X.InterfaceC1467240oHi
    public final Map<String, Object> LJIIL() {
        return this.LLLJ.LIZ;
    }

    public final void LJIJ() {
        Map<String, Long> mapLIZ;
        InterfaceC1468020oIy interfaceC1468020oIy = this.LIZIZ;
        if (interfaceC1468020oIy == null || (mapLIZ = ((C1467030oHN) interfaceC1468020oIy).LIZ()) == null) {
            return;
        }
        HashMap map = (HashMap) mapLIZ;
        long jLJIILL = C795730VJj.LJIILL((Long) map.get("vps"));
        long jLJIILL2 = C795730VJj.LJIILL((Long) map.get("vds"));
        this.LJJL += jLJIILL;
        this.LJJLI += jLJIILL2;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_accumulateVPS accumVPS:");
        sbLIZ.append(this.LJJL);
        sbLIZ.append(", accumVDS:");
        sbLIZ.append(this.LJJLI);
        sbLIZ.append(", vps:");
        sbLIZ.append(jLJIILL);
        sbLIZ.append(", vds:");
        sbLIZ.append(jLJIILL2);
        C1471660oOq.LIZJ("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIJI() {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD.LJJLIIIJL <= 0) {
            c1468170oJD.LLLII = 1;
            c1468170oJD.LJJLIIIJL = ((C1467030oHN) this.LIZIZ).LIZLLL(7);
        }
        if (this.LIZJ.LJJLIIIJLJLI <= 0) {
            long jLIZLLL = ((C1467030oHN) this.LIZIZ).LIZLLL(10);
            if (jLIZLLL > this.LJJZZI) {
                this.LIZJ.LJJLIIIJLJLI = jLIZLLL;
            }
        }
        if (this.LIZJ.LJJLIIJ <= 0) {
            long jLIZLLL2 = ((C1467030oHN) this.LIZIZ).LIZLLL(11);
            if (jLIZLLL2 > this.LJJZZI) {
                this.LIZJ.LJJLIIJ = jLIZLLL2;
            }
        }
        C1468170oJD c1468170oJD2 = this.LIZJ;
        if (c1468170oJD2.LJJLIL <= 0) {
            c1468170oJD2.LJJLIL = ((C1467030oHN) this.LIZIZ).LIZLLL(51);
        }
        if (this.LIZJ.LJJLJ <= 0) {
            long jLIZLLL3 = ((C1467030oHN) this.LIZIZ).LIZLLL(52);
            if (jLIZLLL3 > this.LJJZZI) {
                this.LIZJ.LJJLJ = jLIZLLL3;
            }
        }
        if (this.LIZJ.LJJLJLI <= 0) {
            long jLIZLLL4 = ((C1467030oHN) this.LIZIZ).LIZLLL(53);
            if (jLIZLLL4 > this.LJJZZI) {
                this.LIZJ.LJJLJLI = jLIZLLL4;
            }
        }
        C1468170oJD c1468170oJD3 = this.LIZJ;
        if (c1468170oJD3.LJJLL <= 0) {
            c1468170oJD3.LJJLL = ((C1467030oHN) this.LIZIZ).LIZLLL(12);
        }
        C1468170oJD c1468170oJD4 = this.LIZJ;
        if (c1468170oJD4.LJJZ <= 0) {
            c1468170oJD4.LJJZ = ((C1467030oHN) this.LIZIZ).LIZLLL(13);
        }
        C1468170oJD c1468170oJD5 = this.LIZJ;
        if (c1468170oJD5.LJJZZI <= 0) {
            c1468170oJD5.LJJZZI = ((C1467030oHN) this.LIZIZ).LIZLLL(14);
        }
        C1468170oJD c1468170oJD6 = this.LIZJ;
        if (c1468170oJD6.LJJZZIII <= 0) {
            c1468170oJD6.LJJZZIII = ((C1467030oHN) this.LIZIZ).LIZLLL(15);
        }
        C1468170oJD c1468170oJD7 = this.LIZJ;
        if (c1468170oJD7.LJLJJI <= 0) {
            c1468170oJD7.LJLJJI = ((C1467030oHN) this.LIZIZ).LIZLLL(17);
        }
        C1468170oJD c1468170oJD8 = this.LIZJ;
        if (c1468170oJD8.LJLJJLL <= 0) {
            c1468170oJD8.LJLJJLL = ((C1467030oHN) this.LIZIZ).LIZLLL(16);
        }
        C1468170oJD c1468170oJD9 = this.LIZJ;
        if (c1468170oJD9.LJLJJL <= 0) {
            c1468170oJD9.LJLJJL = ((C1467030oHN) this.LIZIZ).LIZLLL(19);
        }
        C1468170oJD c1468170oJD10 = this.LIZJ;
        if (c1468170oJD10.LJLJL <= 0) {
            c1468170oJD10.LJLJL = ((C1467030oHN) this.LIZIZ).LIZLLL(18);
        }
        C1468170oJD c1468170oJD11 = this.LIZJ;
        if (c1468170oJD11.LLLF <= 0) {
            c1468170oJD11.LLLF = ((C1467030oHN) this.LIZIZ).LIZLLL(38);
        }
        C1468170oJD c1468170oJD12 = this.LIZJ;
        if (c1468170oJD12.LLLFF <= 0) {
            c1468170oJD12.LLLFF = ((C1467030oHN) this.LIZIZ).LIZLLL(39);
        }
        C1468170oJD c1468170oJD13 = this.LIZJ;
        if (c1468170oJD13.LJIIZILJ <= 0) {
            c1468170oJD13.LJIIZILJ = ((C1467030oHN) this.LIZIZ).LIZLLL(115);
        }
        C1468170oJD c1468170oJD14 = this.LIZJ;
        if (c1468170oJD14.LJIJ <= 0) {
            c1468170oJD14.LJIJ = ((C1467030oHN) this.LIZIZ).LIZLLL(116);
        }
        C1468170oJD c1468170oJD15 = this.LIZJ;
        if (c1468170oJD15.LJIJI <= 0) {
            c1468170oJD15.LJIJI = ((C1467030oHN) this.LIZIZ).LIZLLL(117);
        }
        C1468170oJD c1468170oJD16 = this.LIZJ;
        if (c1468170oJD16.LJIJJ <= 0) {
            c1468170oJD16.LJIJJ = ((C1467030oHN) this.LIZIZ).LIZLLL(118);
        }
        C1468170oJD c1468170oJD17 = this.LIZJ;
        if (c1468170oJD17.LJIJJLI <= 0) {
            c1468170oJD17.LJIJJLI = ((C1467030oHN) this.LIZIZ).LIZLLL(119);
        }
        C1468170oJD c1468170oJD18 = this.LIZJ;
        if (c1468170oJD18.LJIL <= 0) {
            c1468170oJD18.LJIL = ((C1467030oHN) this.LIZIZ).LIZLLL(120);
        }
    }

    public final void LJIJJ() {
        HashMap<String, Object> map = this.LLLIILIL;
        if (map != null) {
            if (map.containsKey("is_cast_live")) {
                this.LIZJ.w0 = ((Integer) this.LLLIILIL.get("is_cast_live")).intValue();
            }
            if (this.LLLIILIL.containsKey("cast_source_app_id")) {
                this.LIZJ.x0 = ((Integer) this.LLLIILIL.get("cast_source_app_id")).intValue();
            }
            if (this.LLLIILIL.containsKey("cast_scene_id")) {
                this.LIZJ.y0 = ((Integer) this.LLLIILIL.get("cast_scene_id")).intValue();
            }
            if (this.LLLIILIL.containsKey("cast_protocal")) {
                this.LIZJ.z0 = (String) this.LLLIILIL.get("cast_protocal");
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get CastInfo, castLive:");
            sbLIZ.append(this.LIZJ.w0);
            sbLIZ.append(", sourceAppId:");
            sbLIZ.append(this.LIZJ.x0);
            sbLIZ.append(", sceneId:");
            sbLIZ.append(this.LIZJ.y0);
            sbLIZ.append(", protocal:");
            sbLIZ.append(this.LIZJ.z0);
            TTVideoEngineLog.d("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final Map LJIJJLI() {
        HashMap map = new HashMap(7);
        map.put("format_open_input", Long.valueOf(this.LIZJ.LJII));
        map.put("tran_connect", Long.valueOf(this.LIZJ.LJJLIIIJLJLI));
        map.put("http_response", Long.valueOf(this.LIZJ.LJJLIIIJLLLLLLLZ));
        map.put("receive_first_video_frame", Long.valueOf(this.LIZJ.LJJLL));
        map.put("decode_first_video_frame", Long.valueOf(this.LIZJ.LJJZZI));
        map.put("render_first_video_frame", Long.valueOf(this.LIZJ.LJIIJJI));
        map.put("prepared", Long.valueOf(this.LIZJ.LJJIII));
        return map;
    }

    public final void LJIL() {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        if (this.LLIIIZ > 0) {
            HashMap map = new HashMap(26);
            C799510VXx.LIZIZ(this.LLIIIILZ, "sub_langs_c", map);
            C799510VXx.LIZJ(this.LIZJ.C, "sub_req_fin_ts", map);
            C799510VXx.LIZJ(this.LIZJ.D, "sub_load_fin_ts", map);
            C799510VXx.LIZJ(this.LIZJ.E, "sub_open_ts", map);
            C799510VXx.LIZJ(this.LIZJ.F, "sub_receive_ts", map);
            C799510VXx.LIZJ(this.LIZJ.G, "sub_render_ts", map);
            C799510VXx.LIZIZ(this.LLIIII, "sub_switch_c", map);
            C799510VXx.LIZIZ(this.LLIIIJ, "sub_enable", map);
            C799510VXx.LIZIZ(this.LLIIIL, "sub_enable_opt_load", map);
            C799510VXx.LIZIZ(this.LLIIIZ, "sub_thread_enable", map);
            if (!TextUtils.isEmpty(this.LLIILZL)) {
                C799510VXx.LJ("sub_error", this.LLIILZL, map);
                C799510VXx.LJ("sub_req_url", this.LLIIL, map);
            }
            C799510VXx.LIZIZ(this.LLILIL, "sub_switch_s_c", map);
            C799510VXx.LIZJ(this.LLIIZ, "sub_errc", map);
            C799510VXx.LJ("sub_cur_url", this.LLIL, map);
            C799510VXx.LIZIZ(this.LIZJ.j1 == 1 ? 1 : 0, "sub_new_cb", map);
            String strLJ = ((C1467030oHN) this.LIZIZ).LJ(166);
            if (strLJ != null) {
                C799510VXx.LJ("sub_detail", strLJ, map);
            }
            C799510VXx.LIZJ(this.LLILL, "sub_packet_num", map);
            C799510VXx.LIZIZ(this.LLILLIZIL, "sub_is_realtime_translated", map);
            C799510VXx.LIZIZ(this.LLILLL, "sub_load_finished_pts", map);
            C799510VXx.LIZIZ(this.LLILLJJLI, "sub_fst_pts", map);
            C799510VXx.LIZIZ(this.LLILZ, "sub_fst_report_idx", map);
            C799510VXx.LIZIZ(this.LLILZIL, "sub_fst_report_pts", map);
            C799510VXx.LIZIZ(this.LLILZLL, "sub_fst_add_sub_pts", map);
            C799510VXx.LIZIZ(this.LLIZ, "sub_fst_switch_pts", map);
            C799510VXx.LIZIZ(this.LLIZLLLIL, "sub_fst_switch_completed_pts", map);
            C799510VXx.LIZIZ(this.LLJ, "sub_fst_switch_report_idx", map);
            C799510VXx.LIZIZ(this.LLJI, "sub_fst_switch_report_pts", map);
            C799510VXx.LIZIZ(this.LLJIJIL, "sub_t_state", map);
            boolean z = this.LLILLL == Integer.MIN_VALUE && this.LLILZ != Integer.MIN_VALUE;
            boolean z2 = (this.LLIZLLLIL != Integer.MIN_VALUE || this.LLILZLL == Integer.MIN_VALUE || this.LLJ == Integer.MIN_VALUE) ? false : true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("_getSubEvents: fst_report_idx=");
            int i = this.LLILZ;
            Object objValueOf = "N/A";
            sbLIZ.append(i != Integer.MIN_VALUE ? Integer.valueOf(i) : "N/A");
            sbLIZ.append(", fst_pts=");
            int i2 = this.LLILLJJLI;
            sbLIZ.append(i2 != Integer.MIN_VALUE ? Integer.valueOf(i2) : "N/A");
            sbLIZ.append(", fst_report_pts=");
            int i3 = this.LLILZIL;
            sbLIZ.append(i3 != Integer.MIN_VALUE ? Integer.valueOf(i3) : "N/A");
            sbLIZ.append(", fst_switch_report_idx=");
            int i4 = this.LLJ;
            sbLIZ.append(i4 != Integer.MIN_VALUE ? Integer.valueOf(i4) : "N/A");
            sbLIZ.append(", fst_switch_pts=");
            if (z2) {
                strValueOf = "Missing";
            } else {
                int i5 = this.LLIZ;
                strValueOf = i5 != Integer.MIN_VALUE ? Integer.valueOf(i5) : "N/A";
            }
            sbLIZ.append(strValueOf);
            sbLIZ.append(", fst_switch_report_pts=");
            if (z2) {
                strValueOf2 = "Missing";
            } else {
                int i6 = this.LLJI;
                strValueOf2 = i6 != Integer.MIN_VALUE ? Integer.valueOf(i6) : "N/A";
            }
            sbLIZ.append(strValueOf2);
            sbLIZ.append(", load_finished_pts=");
            if (z) {
                strValueOf3 = "Missing";
            } else {
                int i7 = this.LLILLL;
                strValueOf3 = i7 != Integer.MIN_VALUE ? Integer.valueOf(i7) : "N/A";
            }
            sbLIZ.append(strValueOf3);
            sbLIZ.append(", fst_add_sub_pts=");
            int i8 = this.LLILZLL;
            sbLIZ.append(i8 != Integer.MIN_VALUE ? Integer.valueOf(i8) : "N/A");
            sbLIZ.append(", fst_switch_completed_pts=");
            if (z2) {
                objValueOf = "Missing";
            } else {
                int i9 = this.LLIZLLLIL;
                if (i9 != Integer.MIN_VALUE) {
                    objValueOf = Integer.valueOf(i9);
                }
            }
            sbLIZ.append(objValueOf);
            sbLIZ.append(", mSubIsRealtimeTranslated=");
            sbLIZ.append(this.LLILLIZIL == 1);
            sbLIZ.append(", mMDLGroupId=");
            sbLIZ.append(this.LIZJ.X0);
            C1471660oOq.LIZJ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZJ.LLJJIJI = map;
        }
    }

    public final String LJJJI() {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            return c1468170oJD.LLJLLIL;
        }
        return null;
    }

    public final void LLI() {
        if (this.LIZIZ == null || C1474810oTv.LJJIIZ()) {
            return;
        }
        ((C1467030oHN) this.LIZIZ).LJFF(2, LJIJJLI());
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.LLZIL = TTVideoEngine.LJJLIIIIJ();
        }
    }

    public final void LLIFFJFJJ() {
        Object obj;
        Object obj2;
        Object obj3;
        if (this.LJJLIIIIJ != 4 || this.LJIIL) {
            this.LJJLIIIIJ = 2;
            this.LJIIL = false;
            long jLongValue = 0;
            if (this.LJLIIIL == 1) {
                C1468170oJD c1468170oJD = this.LIZJ;
                if (c1468170oJD.LJJII <= 0) {
                    c1468170oJD.LJJII = System.currentTimeMillis();
                }
            }
            C1468170oJD c1468170oJD2 = this.LIZJ;
            if (c1468170oJD2.LJJIIJ <= 0) {
                c1468170oJD2.LJJIIJ = System.currentTimeMillis();
                C1468140oJA c1468140oJA = this.LIZLLL;
                if (c1468140oJA != null) {
                    c1468140oJA.LJI = System.currentTimeMillis();
                }
                C1467110oHV c1467110oHV = this.LJFF;
                if (c1467110oHV != null) {
                    c1467110oHV.LJFF = System.currentTimeMillis();
                }
                C1467140oHY c1467140oHY = this.LJI;
                if (c1467140oHY != null) {
                    c1467140oHY.LJ = System.currentTimeMillis();
                }
                C1468180oJE c1468180oJE = this.LJII;
                InterfaceC1468020oIy interfaceC1468020oIy = c1468180oJE.LIZ;
                if (interfaceC1468020oIy != null) {
                    c1468180oJE.LJJIJ = ((C1467030oHN) interfaceC1468020oIy).LJ(0);
                    c1468180oJE.LJJIJIIJI = ((C1467030oHN) c1468180oJE.LIZ).LJ(146);
                    if (c1468180oJE.LJJIJL < 0) {
                        c1468180oJE.LJJIJL = ((C1467030oHN) c1468180oJE.LIZ).LIZJ(49);
                    }
                }
                Map map = c1468180oJE.LJJJJLL;
                if (map != null) {
                    Map map2 = (Map) ((HashMap) map).get("size");
                    long jLongValue2 = (map2 == null || (obj3 = map2.get(c1468180oJE.LJJJ)) == null) ? 0L : ((Number) obj3).longValue();
                    Map map3 = (Map) ((HashMap) c1468180oJE.LJJJJLL).get("audio_size");
                    if (map3 != null && map3.size() > 0 && c1468180oJE.LJJLIIIJ != -1 && (obj2 = map3.get(Integer.valueOf(c1468180oJE.LJJLIIIJ))) != null) {
                        jLongValue = ((Number) obj2).longValue();
                    }
                    c1468180oJE.LJJIIZI = jLongValue2 + jLongValue;
                    Map map4 = (Map) ((HashMap) c1468180oJE.LJJJJLL).get("vtype");
                    if (map4 != null && (obj = map4.get(c1468180oJE.LJJJ)) != null) {
                        c1468180oJE.LJJIJLIJ = (String) obj;
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("showedOneFrame vtype:");
                        sbLIZ.append(c1468180oJE.LJJIJLIJ);
                        sbLIZ.append(", currentResolution:");
                        sbLIZ.append(c1468180oJE.LJJJ);
                        C1471660oOq.LIZJ("VideoEventBase", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                InterfaceC1468020oIy interfaceC1468020oIy2 = this.LIZIZ;
                if (interfaceC1468020oIy2 != null) {
                    this.LIZJ.LLLZLZ = ((C1467030oHN) interfaceC1468020oIy2).LIZJ(63);
                    this.LIZJ.LLLZZ = ((C1467030oHN) this.LIZIZ).LIZJ(64);
                }
                if (this.LJIILIIL == 1 && ((C1467030oHN) this.LIZIZ).LIZJ(97) == 0) {
                    this.LJIILIIL = -1;
                }
            }
            LJJ(-2001, true);
            if (C1474810oTv.LJLIL() || C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) || LLLJIL != 0) {
                return;
            }
            this.LJII.LJIIJ();
        }
    }

    public final void LLIIIL() {
        this.LLIIII++;
    }

    public final void LLIIJLIL() {
        C1468490oJj c1468490oJjLJIJJ;
        C1467490oI7 c1467490oI7;
        C1468170oJD c1468170oJD;
        InterfaceC1468020oIy interfaceC1468020oIy = this.LIZIZ;
        if (interfaceC1468020oIy != null) {
            Map<String, Long> mapLIZ = ((C1467030oHN) interfaceC1468020oIy).LIZ();
            if (mapLIZ != null) {
                HashMap map = (HashMap) mapLIZ;
                long jLongValue = ((Number) map.get("vps")).longValue();
                long jLongValue2 = ((Number) map.get("vds")).longValue();
                long jLongValue3 = ((Number) map.get("single_vds")).longValue();
                long jLongValue4 = ((Number) map.get("accu_vds")).longValue();
                C1468170oJD c1468170oJD2 = this.LIZJ;
                c1468170oJD2.LJJIJLIJ = this.LJJL + jLongValue;
                if (this.LJJIJ) {
                    c1468170oJD2.LJJIL = this.LJJLI + jLongValue3;
                } else {
                    c1468170oJD2.LJJIL = this.LJJLI + jLongValue2;
                }
                c1468170oJD2.LJJIZ = this.LJJLI + jLongValue4;
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("_sendEvent accumVDS:");
                sbLIZ.append(this.LJJLI);
                sbLIZ.append(", vds:");
                sbLIZ.append(jLongValue2);
                sbLIZ.append(", single_vds:");
                sbLIZ.append(jLongValue3);
                sbLIZ.append(", mEvent.vds:");
                sbLIZ.append(this.LIZJ.LJJIL);
                sbLIZ.append(", accu_vds:");
                sbLIZ.append(jLongValue4);
                C1471660oOq.LIZJ("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ));
                if (!C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, 131072L)) {
                    final long j = this.LIZJ.LJJIJLIJ;
                    EngineThreadPool.addExecuteTask(new Runnable(j) { // from class: X.0UzC
                        public final long LL;

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("VideoInfoCollector$myVideoCollectorAddConsumeSize@1288.run");
                            try {
                                C790190UzB c790190UzB = C790190UzB.LIZLLL;
                                if (c790190UzB != null) {
                                    long j2 = this.LL;
                                    synchronized (c790190UzB) {
                                        if (j2 > 0) {
                                            c790190UzB.LIZJ += j2;
                                        }
                                    }
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("VideoInfoCollector$myVideoCollectorAddConsumeSize@1288.run");
                        }

                        {
                            this.LL = j;
                        }
                    });
                }
            }
            this.LIZJ.LLIIIL = ((C1467030oHN) this.LIZIZ).LJ(1);
            LJJJJ(((C1467030oHN) this.LIZIZ).LJ(2));
            this.LIZJ.LLIIIZ = ((C1467030oHN) this.LIZIZ).LJ(3);
            this.LIZJ.LLIIJI = ((C1467030oHN) this.LIZIZ).LJ(4);
            this.LIZJ.LJLLILLLL = ((C1467030oHN) this.LIZIZ).LIZJ(23);
            this.LIZJ.I1 = ((C1467030oHN) this.LIZIZ).LJ(174);
            this.LIZJ.H1 = ((C1467030oHN) this.LIZIZ).LJ(175);
            this.LIZJ.R1 = ((C1467030oHN) this.LIZIZ).LJ(176);
            this.LIZJ.LLJILJILJ = ((C1467030oHN) this.LIZIZ).LIZJ(34);
            this.LIZJ.LLJILJIL = ((C1467030oHN) this.LIZIZ).LIZJ(35);
            this.LIZJ.LLJILLL = ((C1467030oHN) this.LIZIZ).LIZJ(36);
            if (this.LIZJ.LJLLL == null) {
                String strLJ = ((C1467030oHN) this.LIZIZ).LJ(5);
                if (strLJ == null) {
                    strLJ = "";
                }
                this.LIZJ.LJLLL = strLJ;
            }
            String strLJ2 = ((C1467030oHN) this.LIZIZ).LJ(33);
            if (!TextUtils.isEmpty(strLJ2)) {
                this.LIZJ.LJLLLL = strLJ2;
            }
            LJIJI();
            this.LIZJ.LLIILII = ((C1467030oHN) this.LIZIZ).LIZJ(61);
            this.LIZJ.LLIILZL = ((C1467030oHN) this.LIZIZ).LIZJ(27);
            InterfaceC1468020oIy interfaceC1468020oIy2 = this.LIZIZ;
            if (interfaceC1468020oIy2 != null && (c1468170oJD = this.LIZJ) != null) {
                c1468170oJD.LLIIZ = ((C1467030oHN) interfaceC1468020oIy2).LIZJ(121);
            }
            this.LIZJ.LJLZ = ((C1467030oHN) this.LIZIZ).LIZJ(30);
            this.LIZJ.LLIZLLLIL = ((C1467030oHN) this.LIZIZ).LJ(31);
            this.LIZJ.LLJ = ((C1467030oHN) this.LIZIZ).LJ(32);
            this.LIZJ.LLJI = ((C1467030oHN) this.LIZIZ).LJ(111);
            C1468350oJV c1468350oJV = this.LLJJIJI;
            if (c1468350oJV.LIZJ > 0) {
                int i2 = c1468350oJV.LIZLLL;
                if (i2 == 0) {
                    this.LIZJ.LLILLL = 0;
                } else if (i2 == 1) {
                    this.LIZJ.LLILLL = 1;
                }
            }
            if (LLLJIL == 0) {
                this.LIZJ.LLLLJI = ((C1467030oHN) this.LIZIZ).LIZLLL(54);
                this.LIZJ.LLLLL = ((C1467030oHN) this.LIZIZ).LIZLLL(57);
                this.LIZJ.LLLLLIL = ((C1467030oHN) this.LIZIZ).LIZLLL(58);
            }
            int iLIZJ = ((C1467030oHN) this.LIZIZ).LIZJ(100);
            if (iLIZJ != 0) {
                this.LIZJ.LLLLII = iLIZJ;
            }
            this.LIZJ.LLLLLJIL = ((C1467030oHN) this.LIZIZ).LIZLLL(140);
            this.LIZJ.LLLLLJLJLL = ((C1467030oHN) this.LIZIZ).LIZLLL(141);
            this.LIZJ.LLLLLL = ((C1467030oHN) this.LIZIZ).LIZJ(142);
            C1468170oJD c1468170oJD3 = this.LIZJ;
            if (c1468170oJD3.LLLZLZ == Integer.MIN_VALUE) {
                c1468170oJD3.LLLZLZ = ((C1467030oHN) this.LIZIZ).LIZJ(63);
            }
            C1468170oJD c1468170oJD4 = this.LIZJ;
            if (c1468170oJD4.LLLZZ == Integer.MIN_VALUE) {
                c1468170oJD4.LLLZZ = ((C1467030oHN) this.LIZIZ).LIZJ(64);
            }
            this.LIZJ.LLLLLLL = ((C1467030oHN) this.LIZIZ).LIZJ(77);
            this.LIZJ.LLLLLLLLL = ((C1467030oHN) this.LIZIZ).LIZJ(147);
            this.LIZJ.LLLLLLZ = ((C1467030oHN) this.LIZIZ).LIZJ(155);
            int iLIZJ2 = ((C1467030oHN) this.LIZIZ).LIZJ(157);
            if (iLIZJ2 > 0) {
                this.LIZJ.LLLLLLZZ = ((C1467030oHN) this.LIZIZ).LIZJ(156) / iLIZJ2;
            }
            this.LIZJ.b0 = ((C1467030oHN) this.LIZIZ).LIZJ(87);
            this.LIZJ.LLLLLLLLLL = ((C1467030oHN) this.LIZIZ).LIZJ(167);
            this.LIZJ.LLLZL = ((C1467030oHN) this.LIZIZ).LJ(168);
            this.LIZJ.LLLLLLLZIL = ((C1467030oHN) this.LIZIZ).LIZJ(169);
            this.LIZJ.LLLZLL = ((C1467030oHN) this.LIZIZ).LJ(170);
            HashMap<String, Object> mapLJI = this.LJII.LJI();
            if (mapLJI != null) {
                this.LLJJL.add((Integer) mapLJI.get("power"));
                this.LLJJLIIIJLLLLLLLZ.add((Integer) mapLJI.get("isCharging"));
            }
            ((C1467030oHN) this.LIZIZ).LIZ.get();
            this.LIZJ.LLLJ = ((C1467030oHN) this.LIZIZ).LIZJ(114);
            long jLIZLLL = ((C1467030oHN) this.LIZIZ).LIZLLL(137);
            if (jLIZLLL > 0) {
                this.LIZJ.n0 = jLIZLLL;
            }
            long jLIZLLL2 = ((C1467030oHN) this.LIZIZ).LIZLLL(138);
            if (jLIZLLL2 > 0) {
                this.LIZJ.f193o0 = jLIZLLL2;
            }
            this.LIZJ.a1 = ((C1467030oHN) this.LIZIZ).LIZJ(94);
            C1466990oHJ c1466990oHJ = ((C1467030oHN) this.LIZIZ).LIZ.get();
            if (c1466990oHJ != null && (c1467490oI7 = c1466990oHJ.K5) != null && c1467490oI7.LIZJ != 0) {
                c1467490oI7.LIZ(c1467490oI7.LJ, c1467490oI7.LJFF);
                InterfaceC1467500oI8 interfaceC1467500oI8 = c1467490oI7.LIZIZ;
                double dLIZIZ = interfaceC1467500oI8 != null ? interfaceC1467500oI8.LIZIZ(c1467490oI7.LIZLLL) : 0.0d;
                if (dLIZIZ == 0.0d) {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("this:");
                    sbLIZ2.append(c1467490oI7);
                    sbLIZ2.append(", no vmafScore return zero");
                    TTVideoEngineLog.d("VodQualityHelper", C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    float fMax = Math.max(c1467490oI7.LJI, 0.0f);
                    float fExp = (float) (100.0d - ((100.0d - dLIZIZ) * Math.exp((fMax / 100.0f) - 1.0f)));
                    int i4 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("this:");
                    sbLIZ3.append(c1467490oI7);
                    sbLIZ3.append(", vqScore:");
                    sbLIZ3.append(fMax);
                    sbLIZ3.append(", vmafScore:");
                    sbLIZ3.append(dLIZIZ);
                    sbLIZ3.append(", final:");
                    sbLIZ3.append(fExp);
                    TTVideoEngineLog.d("VodQualityHelper", C2188811AlT.LIZIZ(sbLIZ3));
                    HashMap<String, Object> map2 = new HashMap<>();
                    map2.put("vqs", Float.valueOf(fMax));
                    map2.put("vms", Double.valueOf(dLIZIZ));
                    map2.put("vods", Float.valueOf(fExp));
                    if (!TextUtils.isEmpty(c1467490oI7.LJII)) {
                        map2.put("mvmaf", c1467490oI7.LJII);
                    }
                    ArrayList<String> arrayList = c1467490oI7.LJIIIIZZ;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        map2.put("pr", c1467490oI7.LJIIIIZZ);
                    }
                    map2.put("v", Integer.valueOf(c1467490oI7.LJIIIZ));
                    this.LLLFF = map2;
                    this.LIZJ.l1 = map2;
                }
            }
        }
        int i5 = this.LJJIJIL;
        if (i5 > 0) {
            this.LJII.LJJIIZ = i5;
        }
        Context context = this.LJJLIIIJ;
        if (context != null) {
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "VideoEventLogger");
            this.LIZJ.LLLZI = sharedPreferencesLIZJ.getString("playersessionid", "");
            SharedPreferences.Editor editorEdit = sharedPreferencesLIZJ.edit();
            editorEdit.putString("playersessionid", this.LJII.LJIILL);
            editorEdit.apply();
        }
        C1468170oJD c1468170oJD5 = this.LIZJ;
        C1468180oJE c1468180oJE = this.LJII;
        c1468170oJD5.LLLLZLLLI = c1468180oJE.LJIILL;
        c1468170oJD5.LLJJIJIL = this.LJJLIIIJJI;
        c1468170oJD5.LJLLLLLL = this.LJJJJLL;
        c1468170oJD5.LJZ = this.LJJJJZ;
        c1468170oJD5.LLFFF = this.LJJIJL;
        c1468170oJD5.LLFII = this.LJJIZ;
        c1468170oJD5.LJJIJL = this.LJIJI;
        c1468170oJD5.LJJJJI = c1468180oJE.LJJIZ;
        c1468170oJD5.LJJJJ = c1468180oJE.LJJJ;
        c1468170oJD5.LJJLIIIJJI = this.LJJIIZ;
        c1468170oJD5.LJZL = this.LJJIIZI;
        c1468170oJD5.LJJJ = this.LJJIJLIJ;
        c1468170oJD5.LJJJI = this.LJJIL;
        c1468170oJD5.LLFZ = this.LJJIJIIJIL;
        c1468170oJD5.LLI = this.LJIILIIL;
        c1468170oJD5.LLILIL = this.LJJJJ;
        if (SystemClock.elapsedRealtime() - C1297580js4.LIZIZ >= 300000) {
            EngineThreadPool.addExecuteTask(new RunnableC1297570js3());
        }
        c1468170oJD5.LLILLIZIL = C1297580js4.LIZ;
        C1468170oJD c1468170oJD6 = this.LIZJ;
        c1468170oJD6.LJJIJIIJIL = this.LJJJJJL;
        c1468170oJD6.LJJIJIL = this.LJJJJLI;
        c1468170oJD6.LLLLIILLL = this.LJJLIIIJJIZ;
        c1468170oJD6.LLLLIL = this.LJJLIIIJL;
        c1468170oJD6.LLLLLILLIL = this.LJJLIIIJLJLI;
        c1468170oJD6.LLLLLLIL = this.LJJLIIIJLLLLLLLZ;
        c1468170oJD6.LLLLLLJ = this.LJJLIIJ;
        c1468170oJD6.LLLLLZIL = this.LJJZZIII;
        c1468170oJD6.LLLLZ = this.LJLI;
        c1468170oJD6.LLLLLZL = this.LJL;
        c1468170oJD6.LLLLZI = this.LJLIIIL;
        c1468170oJD6.LLLJIL = this.LJJLIL;
        c1468170oJD6.LLLLIIIILLL = this.LJIILJJIL;
        long j2 = this.LJJJ;
        if (j2 > 0) {
            c1468170oJD6.LJLJLJ = j2;
        }
        c1468170oJD6.LJLJLLL = this.LJJJI;
        c1468170oJD6.LJLL = this.LJLJLJ;
        C1468140oJA c1468140oJA = this.LIZLLL;
        if (c1468140oJA != null) {
            c1468170oJD6.LLIFFJFJJ = c1468140oJA.LJ;
        }
        c1468170oJD6.LLII = this.LJJJJJ;
        c1468170oJD6.LLIIIJ = this.LJJJLIIL;
        c1468170oJD6.LL = this.LJJJJZI;
        c1468170oJD6.LLLLZIL = this.LJLIIL;
        c1468170oJD6.LLLLZLLIL = this.LJLIL;
        c1468170oJD6.LLLLZLL = this.LJLILLLLZI;
        c1468170oJD6.LLJIJIL = this.LJJLJ;
        c1468170oJD6.h = this.LLL;
        c1468170oJD6.g = this.LLJZIJLIL;
        C1468170oJD c1468170oJD7 = this.LIZJ;
        c1468170oJD7.f = this.LLJZ;
        c1468170oJD7.e = this.LLJLLL;
        c1468170oJD7.L = this.LLII;
        if (!C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, 2097152L)) {
            C1468170oJD c1468170oJD8 = this.LIZJ;
            if (C1309170kAl.LJI <= 0) {
                C1309170kAl.LJI = C0FUC.LIZ(this.LJJLIIIJ).x;
            }
            c1468170oJD8.M = C1309170kAl.LJI;
            C1468170oJD c1468170oJD9 = this.LIZJ;
            if (C1309170kAl.LJII <= 0) {
                C1309170kAl.LJII = C0FUC.LIZ(this.LJJLIIIJ).y;
            }
            c1468170oJD9.N = C1309170kAl.LJII;
            this.LIZJ.f185O = Resources.getSystem().getDisplayMetrics().densityDpi;
            this.LIZJ.P = Resources.getSystem().getDisplayMetrics().xdpi;
            this.LIZJ.Q = Resources.getSystem().getDisplayMetrics().ydpi;
        }
        C1468170oJD c1468170oJD10 = this.LIZJ;
        c1468170oJD10.f186X = this.LJLLL.LIZIZ;
        C1467160oHa c1467160oHa = this.LJLLLL;
        c1467160oHa.getClass();
        c1468170oJD10.f187Y = new ArrayList<>(c1467160oHa.LJ);
        C1468170oJD c1468170oJD11 = this.LIZJ;
        c1468170oJD11.Y0 = this.LJZI;
        c1468170oJD11.B0 = this.LLLF;
        c1468170oJD11.C0 = this.LLLFFI;
        c1468170oJD11.D0 = this.LLLFZ;
        c1468170oJD11.E0 = this.LLLI;
        c1468170oJD11.F0 = this.LLLII;
        HashMap map3 = new HashMap();
        for (int i6 = 0; i6 < this.LJIILL.size() && i6 < 3; i6++) {
            try {
                map3.put(C786410Ut5.j4("fetchretry%d", new Object[]{Integer.valueOf(i6)}), this.LJIILL.get(i6));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        for (int i7 = 0; i7 < this.LJIIZILJ.size() && i7 < 3; i7++) {
            map3.put(C786410Ut5.j4("ldns%d", new Object[]{Integer.valueOf(i7)}), ((e) this.LJIIZILJ.get(i7)).LJI());
        }
        for (int i8 = 0; i8 < this.LJIJ.size(); i8++) {
            if (i8 < 2 || i8 == this.LJIJ.size() - 1) {
                map3.put(C786410Ut5.j4("error%d", new Object[]{Integer.valueOf(i8)}), this.LJIJ.get(i8));
            }
        }
        if (!TextUtils.isEmpty(this.LJJIIJZLJL)) {
            map3.put("log", this.LJJIIJZLJL);
        }
        if (!TextUtils.isEmpty(this.LIZJ.LLLL)) {
            map3.put("tr_err_msg", this.LIZJ.LLLL);
        }
        this.LJJIIJZLJL = "";
        this.LIZJ.LJJLIIIJJIZ = map3;
        this.LJJLIIIJILLIZJL = map3.toString();
        String str = this.LJIJJ;
        if (str != null) {
            this.LIZJ.LJJJJZI = str;
        }
        String str2 = this.LJIJJLI;
        if (str2 != null) {
            this.LIZJ.LJJJLIIL = str2;
        }
        if (this.LJIL != null) {
            this.LIZJ.getClass();
        }
        String str3 = this.LJJ;
        if (str3 != null) {
            this.LIZJ.LJJJLL = str3;
        }
        String str4 = this.LJJI;
        if (str4 != null) {
            this.LIZJ.LJJJLZIJ = str4;
        }
        String str5 = this.LJJIFFI;
        if (str5 != null) {
            this.LIZJ.LJJJZ = str5;
        }
        String str6 = this.LJJII;
        if (str6 != null) {
            this.LIZJ.LJJL = str6;
        }
        C1468170oJD c1468170oJD12 = this.LIZJ;
        c1468170oJD12.LJJLI = this.LJJIII;
        Map map4 = this.LJJIJIIJI;
        if (map4 != null) {
            c1468170oJD12.LJZI = map4;
        }
        if (this.LLIILII != null) {
            c1468170oJD12.getClass();
        }
        if (this.LLIILZL != null) {
            this.LIZJ.getClass();
        }
        C1468170oJD c1468170oJD13 = this.LIZJ;
        if (c1468170oJD13.I <= 0) {
            c1468170oJD13.I = -2147483648L;
        }
        if (c1468170oJD13.H <= 0) {
            c1468170oJD13.H = -2147483648L;
        }
        if (c1468170oJD13.C <= 0) {
            c1468170oJD13.C = -2147483648L;
        }
        if (c1468170oJD13.D <= 0) {
            c1468170oJD13.D = -2147483648L;
        }
        c1468170oJD13.getClass();
        this.LIZJ.getClass();
        this.LIZJ.getClass();
        this.LIZJ.getClass();
        this.LIZJ.getClass();
        this.LIZJ.getClass();
        C1468170oJD c1468170oJD14 = this.LIZJ;
        c1468170oJD14.LLIL = this.LJJJJI;
        c1468170oJD14.LLILII = this.LJII.LJJLIIJ;
        c1468170oJD14.LLIZ = Integer.MIN_VALUE;
        c1468170oJD14.LLLLJ = LLLJIL;
        LLLJIL = 0;
        if (c1468170oJD14.LLJJJJLIIL < c1468170oJD14.LLJJJJJIL) {
            c1468170oJD14.LLJJJJLIIL = -2147483648L;
        }
        if (c1468170oJD14.LLJLIL < c1468170oJD14.LLJL) {
            c1468170oJD14.LLJLIL = -2147483648L;
        }
        c1468170oJD14.LIZ = this.LJJLL;
        c1468170oJD14.LIZIZ = this.LJJZ;
        c1468170oJD14.LJJ = c1468170oJD14.LIZLLL;
        c1468170oJD14.LIZJ = this.LJJZZI;
        if (c1468170oJD14.LJJIIZI <= 0 && c1468170oJD14.LJJIIJ > 0) {
            c1468170oJD14.LJJIIZI = System.currentTimeMillis();
        }
        C1468170oJD c1468170oJD15 = this.LIZJ;
        c1468170oJD15.l = this.LLJJIJIIJIL;
        c1468170oJD15.m = this.LLJJIJIL;
        c1468170oJD15.n = this.LLJJJ;
        c1468170oJD15.o = this.LLJJJIL;
        c1468170oJD15.p = this.LLJJJJ;
        c1468170oJD15.q = this.LLJJJJJIL;
        c1468170oJD15.r = this.LLJJJJLIIL;
        c1468170oJD15.s = this.LIZLLL.LJFF;
        C1468230oJJ c1468230oJJ = this.LJ;
        if (c1468230oJJ != null) {
            c1468170oJD15.t = c1468230oJJ.LJI;
        }
        C1467650oIN c1467650oIN = this.LJIIJ;
        c1467650oIN.getClass();
        c1468170oJD15.v = new ArrayList<>(c1467650oIN.LIZ);
        C1467110oHV c1467110oHV = this.LJFF;
        if (c1467110oHV != null) {
            C1468170oJD c1468170oJD16 = this.LIZJ;
            c1468170oJD16.u = c1467110oHV.LIZJ;
            c1468170oJD16.B = c1467110oHV.LIZLLL;
        }
        C1468170oJD c1468170oJD17 = this.LIZJ;
        c1468170oJD17.Z = this.LJIILLIIL;
        c1468170oJD17.y = this.LLJJL;
        c1468170oJD17.z = this.LLJJLIIIJLLLLLLLZ;
        c1468170oJD17.A = this.LLJL;
        c1468170oJD17.k1 = new ArrayList<>(Arrays.asList(Float.valueOf(this.LJII.LJJJJL), Float.valueOf(this.LJII.LJJJJJL)));
        C1468170oJD c1468170oJD18 = this.LIZJ;
        c1468170oJD18.s0 = this.LLLIIII;
        c1468170oJD18.t0 = this.LLLIIIIL;
        c1468170oJD18.u0 = this.LLLIIIL;
        c1468170oJD18.v0 = this.LLLIIL;
        C1467140oHY c1467140oHY = this.LJI;
        if (c1467140oHY.LIZJ) {
            c1467140oHY.LIZ("exit");
            LJJIIJZLJL(this.LJI.LIZIZ.LIZ);
        }
        C1468170oJD c1468170oJD19 = this.LIZJ;
        C1467140oHY c1467140oHY2 = this.LJI;
        c1468170oJD19.w = c1467140oHY2.LJII;
        c1468170oJD19.x = c1467140oHY2.LJI;
        c1468170oJD19.O0 = this.LLLILZJ;
        c1468170oJD19.P0 = this.LLLILZLLLI;
        c1468170oJD19.R0 = this.LLLIZZ;
        c1468170oJD19.S0 = this.LLLIL;
        c1468170oJD19.T0 = this.LLLILZ;
        c1468170oJD19.E2 = this.LLI;
        if (this.LLILL <= 0) {
            this.LLILL = -2147483648L;
        }
        C1468060oJ2 c1468060oJ2 = C790030Uyv.LIZ;
        if (!C790040Uyw.LJ(c1468060oJ2.LJIIIIZZ, 4194304L) && this.LLIIJLIL > 0) {
            HashMap map5 = new HashMap(11);
            C799510VXx.LIZJ(this.LIZJ.H, "mask_open_ts", map5);
            C799510VXx.LIZJ(this.LIZJ.I, "mask_opened_ts", map5);
            C799510VXx.LIZIZ(this.LLIIJI, "mask_enable", map5);
            C799510VXx.LIZIZ(this.LLIIJLIL, "mask_thread_enable", map5);
            C799510VXx.LIZIZ(this.LLJILJILJ, "mask_range_opt", map5);
            C799510VXx.LIZIZ(this.LLJILLL, "mask_enable_mdl", map5);
            C799510VXx.LIZIZ(this.LLJJ, "mask_delay_loading", map5);
            C799510VXx.LIZJ(this.LLJJIII, "mask_file_size", map5);
            int i9 = this.LLJILJIL;
            if (i9 < 0) {
                C799510VXx.LIZIZ(i9, "mask_errc", map5);
                C799510VXx.LJ("mask_url", this.LLIILII, map5);
                C799510VXx.LJ("mask_file_hash", this.LLJJI, map5);
            }
            this.LIZJ.LLJJIJIIJIL = map5;
        }
        if (!C790040Uyw.LJ(c1468060oJ2.LJIIIIZZ, 8388608L)) {
            LJIL();
        }
        if (this.LJJJLZIJ > 0) {
            this.LIZJ.LLJJJ = (int) (SystemClock.elapsedRealtime() - this.LJJJLZIJ);
        }
        C1468230oJJ c1468230oJJ2 = this.LJ;
        if (c1468230oJJ2 != null) {
            this.LIZJ.LLJJJJ = c1468230oJJ2.LJFF;
        }
        if (C1468480oJi.LIZ()) {
            this.LIZJ.LLJLL = System.currentTimeMillis() - System.currentTimeMillis();
        }
        LJJI();
        LJIJJ();
        InterfaceC1467050oHP interfaceC1467050oHP = this.LJJJLL;
        if (interfaceC1467050oHP != null && (c1468490oJjLJIJJ = interfaceC1467050oHP.LJIJJ()) != null && c1468490oJjLJIJJ.LIZIZ(0) == 1) {
            C1468170oJD c1468170oJD20 = this.LIZJ;
            c1468170oJD20.p0 = 1;
            c1468170oJD20.q0 = c1468490oJjLJIJJ.LIZIZ(1);
            this.LIZJ.r0 = c1468490oJjLJIJJ.LIZIZ(2);
            this.LIZJ.A0 = c1468490oJjLJIJJ.LIZIZ(3);
        }
        this.LLLJ.LIZ(this.LJII, this.LIZJ);
    }

    public final void LJJI() {
        if (C1474810oTv.LJJIIZ()) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        treeMap.putAll(LLLJL);
        treeMap.putAll(this.LLIFFJFJJ);
        int i = this.LJII.LJJIII;
        if (i != 0) {
            treeMap.put("v_hw", Integer.valueOf(i));
        }
        int i2 = this.LJII.LJJIIJZLJL;
        if (i2 != 0) {
            treeMap.put("a_hw", Integer.valueOf(i2));
        }
        int i3 = this.LJIILIIL;
        if (i3 > 0) {
            treeMap.put("async_init", Integer.valueOf(i3));
        }
        int i4 = this.LJIILJJIL;
        if (i4 > 0) {
            treeMap.put("codec_pool", Integer.valueOf(i4));
        }
        if (this.LJII.LJJIJ.equals("bytevc1")) {
            treeMap.put("bytevc1", 1);
        } else if (this.LJII.LJJIJ.equals("bytevc2")) {
            treeMap.put("bytevc2", 1);
        }
        int i5 = this.LJJLJLI;
        if (i5 > 0) {
            treeMap.put("network_timeout", Integer.valueOf(i5));
        }
        int i6 = this.LJJLJ;
        if (i6 > 0) {
            treeMap.put("buffer_timeout", Integer.valueOf(i6));
        }
        int i7 = this.LLJJIJI.LIZ;
        if (i7 > 0) {
            treeMap.put("buffer_directly", Integer.valueOf(i7));
        }
        int i8 = this.LLJJIJI.LIZIZ;
        if (i8 > 0) {
            treeMap.put("first_buf_end_ms", Integer.valueOf(i8));
        }
        int i9 = this.LIZJ.LLLJL;
        if (i9 > 0) {
            treeMap.put("oes_texture", Integer.valueOf(i9));
        }
        int i10 = this.LJLIIL;
        if (i10 > 0) {
            treeMap.put("sr", Integer.valueOf(i10));
        }
        C1468350oJV c1468350oJV = this.LLJJIJI;
        if (c1468350oJV.LIZJ > 0) {
            int i11 = c1468350oJV.LIZLLL;
            if (i11 == 0) {
                treeMap.put("volume_balance", 1);
                LJIIJ(Integer.valueOf(((C1467030oHN) this.LIZIZ).LIZJ(81)), "volume_balance");
            } else if (i11 == 1) {
                treeMap.put("volume_balancev2", 1);
                LJIIJ(Integer.valueOf(((C1467030oHN) this.LIZIZ).LIZJ(81)), "volume_balancev2");
            } else if (i11 == 4) {
                treeMap.put("volume_balance_tob", 1);
            }
        }
        int i12 = this.LJJJJI;
        if (i12 > 0) {
            treeMap.put("bash", Integer.valueOf(i12));
        }
        this.LJII.getClass();
        int i13 = this.LLJJIJI.LJ;
        if (i13 > 0) {
            treeMap.put("engine_looper", Integer.valueOf(i13));
        }
        int i14 = this.LLJJIJI.LJFF;
        if (i14 > 0) {
            treeMap.put("auto_range", Integer.valueOf(i14));
        }
        int i15 = this.LLJJIJI.LJI;
        if (i15 > 0) {
            treeMap.put("hw_drop", Integer.valueOf(i15));
        }
        int i16 = this.LLJJIJI.LJII;
        if (i16 > 0) {
            treeMap.put("enable_https", Integer.valueOf(i16));
        }
        int i17 = this.LIZJ.LLJLLL;
        if (i17 > 0) {
            treeMap.put("enable_hijack", Integer.valueOf(i17));
        }
        int i18 = this.LIZJ.LLJZ;
        if (i18 > 0) {
            treeMap.put("hijack_retry", Integer.valueOf(i18));
        }
        int i19 = this.LLJJIJI.LJIIIIZZ;
        if (i19 > 0) {
            treeMap.put("fallback_api", Integer.valueOf(i19));
        }
        int i20 = this.LLJJIJI.LJIIIZ;
        if (i20 > 0) {
            treeMap.put("async_pos", Integer.valueOf(i20));
        }
        this.LJII.getClass();
        int i21 = this.LJII.LJJLIIJ;
        if (i21 > 0) {
            treeMap.put("mdl_type", Integer.valueOf(i21));
        }
        int i22 = this.LLJJIJI.LJIIJ;
        if (i22 > 0) {
            treeMap.put("enable_loadcontrol", Integer.valueOf(i22));
        }
        int i23 = this.LLJJIJI.LJIIJJI;
        if (i23 == 5) {
            if (this.LJII.LJJIII == 0) {
                treeMap.put("render_type", 5);
            } else {
                treeMap.put("render_type", 3);
            }
        } else if (i23 >= 0) {
            treeMap.put("render_type", Integer.valueOf(i23));
        }
        treeMap.put("image_scale", Integer.valueOf(this.LLJJIJI.LJIIL));
        int i24 = this.LJJLIL;
        if (i24 >= 0) {
            treeMap.put("mc_render", Integer.valueOf(i24));
        }
        int i25 = this.LLJJIJI.LJIILIIL;
        if (i25 >= 0) {
            treeMap.put("audio_render_type", Integer.valueOf(i25));
        }
        int i26 = this.LLJJIJI.LJIILJJIL;
        if (i26 > 0) {
            treeMap.put("skip_find_stream", Integer.valueOf(i26));
        }
        int i27 = this.LLJJIJI.LJIILL;
        if (i27 > 0) {
            treeMap.put("async_prepare", Integer.valueOf(i27));
        }
        int i28 = this.LLJJIJI.LJIILLIIL;
        if (i28 > 0) {
            treeMap.put("frc_level", Integer.valueOf(i28));
        }
        int i29 = this.LLJJIJI.LJIIZILJ;
        if (i29 > 0) {
            treeMap.put("lazy_seek", Integer.valueOf(i29));
        }
        int i30 = this.LLJJIJI.LJIJ;
        if (i30 > 0) {
            treeMap.put("keep_formater_alive", Integer.valueOf(i30));
        }
        int i31 = this.LIZJ.LLJILLL;
        if (i31 > 0) {
            treeMap.put("dis_short_seek", Integer.valueOf(i31));
        }
        int i32 = this.LIZJ.LLJILJILJ;
        if (i32 > 0) {
            treeMap.put("pref_near_sample", Integer.valueOf(i32));
        }
        int i33 = this.LLIIIZ;
        if (i33 > 0) {
            treeMap.put("sub_thread_enable", Integer.valueOf(i33));
        }
        int i34 = this.LLIIJLIL;
        if (i34 > 0) {
            treeMap.put("mask_thread_enable", Integer.valueOf(i34));
        }
        if ((this.LLJJIJI.LJIJI & 1) == 1) {
            treeMap.put("hdr_pq", 1);
        }
        if ((this.LLJJIJI.LJIJI & 2) == 2) {
            treeMap.put("hdr_hlg", 1);
        }
        if (this.LLJJIJI.LJIJJ > 0) {
            treeMap.put("abr_startup", 1);
        }
        int i35 = this.LLJJIJI.LJJIII;
        if (i35 > 0) {
            treeMap.put("gear_strategy", Integer.valueOf(i35));
        }
        int i36 = this.LLJJIJI.LJJIIJ;
        if (i36 > 0) {
            treeMap.put("sr_strategy", Integer.valueOf(i36));
        }
        if (this.LLJJIJI.LJIJJLI > 0) {
            treeMap.put("thread_priority", 1);
        }
        if (this.LLJJIJI.LJIL > 0) {
            treeMap.put("smooth_clock", 1);
        }
        if (this.LLJJIJI.LJJ > 0) {
            treeMap.put("disable_split_voice", 1);
        }
        if (this.LJII.LJJIII == 0 && this.LLJJIJI.LJJI > 0) {
            treeMap.put("yv12", 1);
        }
        if (this.LIZJ.LLLZZ == 28) {
            treeMap.put("heaacv2", 1);
        }
        if (this.LLJJIJI.LJJIFFI > 0) {
            treeMap.put("strategy_center", 1);
        } else {
            treeMap.put("strategy_center", 0);
        }
        int i37 = this.LLJJIJI.LJJII;
        if (i37 >= 0) {
            treeMap.put("drop_limit", Integer.valueOf(i37));
        }
        if (this.LLJJIJI.LJJIIJZLJL == 1) {
            treeMap.put("loop_way", 1);
        }
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        int iLJJIJ = dataLoaderHelper.LJJIJ(8);
        if (iLJJIJ > 0) {
            treeMap.put("mdl_socket_reuse", Integer.valueOf(iLJJIJ));
        }
        int iLJJIJ2 = dataLoaderHelper.LJJIJ(1001);
        if (iLJJIJ2 > 0) {
            treeMap.put("mdl_preconn", Integer.valueOf(iLJJIJ2));
        }
        if (dataLoaderHelper.LJJIJ(7) > 0) {
            treeMap.put("mdl_externdns", 1);
            if (TextUtils.equals(this.LJII.LJIJJ, "httpDNS_own") || TextUtils.equals(this.LJII.LJIJJ, "httpDNS_google") || TextUtils.equals(this.LJII.LJIJJ, "customDNSInnerByteDanceHTTPDNS")) {
                treeMap.put("mdl_httpdns", 1);
            }
        }
        int iLJJIJ3 = dataLoaderHelper.LJJIJ(114);
        if (iLJJIJ3 > 0) {
            treeMap.put("mdl_predns", Integer.valueOf(iLJJIJ3));
        }
        int iLJJIJ4 = dataLoaderHelper.LJJIJ(105);
        if (iLJJIJ4 > 0) {
            treeMap.put("mdl_dns_refresh", Integer.valueOf(iLJJIJ4));
        }
        int iLJJIJ5 = dataLoaderHelper.LJJIJ(103);
        if (iLJJIJ5 > 0) {
            treeMap.put("mdl_dns_parallel", Integer.valueOf(iLJJIJ5));
        }
        int iLJJIJ6 = dataLoaderHelper.LJJIJ(115);
        if (iLJJIJ6 > 0) {
            treeMap.put("mdl_backip", Integer.valueOf(iLJJIJ6));
        }
        int iLJJIJ7 = dataLoaderHelper.LJJIJ(101);
        if (iLJJIJ7 > 0) {
            treeMap.put("mdl_session_reuse", Integer.valueOf(iLJJIJ7));
        }
        int iLJJIJ8 = dataLoaderHelper.LJJIJ(100);
        if (iLJJIJ8 == 3) {
            treeMap.put("mdl_tls_ver", Integer.valueOf(iLJJIJ8));
        }
        long jLJJIJIIJI = dataLoaderHelper.LJJIJIIJI(1152);
        String strLJJIJIL = dataLoaderHelper.LJJIJIL(9010);
        if (jLJJIJIIJI > 0 && !TextUtils.isEmpty(strLJJIJIL)) {
            treeMap.put("mdl_socket_monitor", 1);
        }
        this.LIZJ.c = treeMap;
    }

    public final C1468460oJg LJJIIJ() {
        if (C1474810oTv.LJJIIZ()) {
            return null;
        }
        C1468170oJD c1468170oJD = this.LIZJ;
        C1468460oJg c1468460oJg = new C1468460oJg();
        if (c1468170oJD != null) {
            long j = c1468170oJD.LJJLIIJ;
            long j2 = j > 0 ? j - c1468170oJD.LJJIFFI : 0L;
            long j3 = c1468170oJD.LJJLL;
            long j4 = c1468170oJD.LJJIFFI;
            c1468460oJg.LIZIZ = j3 - j4;
            c1468460oJg.LIZJ = c1468170oJD.LJJZZI - j4;
            c1468460oJg.LIZLLL = c1468170oJD.LJJIIJ - j4;
            c1468460oJg.LJFF = c1468170oJD.LLLLLZ - j4;
            long j5 = c1468170oJD.LLLLIILL;
            c1468460oJg.LJ = j5 > 0 ? j5 - j4 : 0L;
            c1468460oJg.LIZ.putLong("ffr_read_head_duration", j2);
            c1468460oJg.LIZ.putLong("ffr_read_first_data_duration", c1468460oJg.LIZIZ);
            c1468460oJg.LIZ.putLong("ffr_decode_duration", c1468460oJg.LIZJ);
            c1468460oJg.LIZ.putLong("ffr_render_duration", c1468460oJg.LIZLLL);
            c1468460oJg.LIZ.putLong("ffr_playback_buffering_duration", c1468460oJg.LJ);
            c1468460oJg.LIZ.putLong("ffr_prender_duration", c1468460oJg.LJFF);
        }
        return c1468460oJg;
    }

    public final void LJJII() {
        LJIJ();
    }

    public C1468160oJC(Context context) {
        this.LJII = new C1468180oJE(null, this.LJLJJI, context);
        C1468230oJJ c1468230oJJ = new C1468230oJJ(this.LJII);
        this.LJ = c1468230oJJ;
        this.LJFF = new C1467110oHV(this.LJII);
        if (!C1474810oTv.LJJIIZ()) {
            this.LJIIJJI = new C1468270oJN(this.LJII);
        }
        this.LIZLLL = new C1468140oJA(this.LJII, c1468230oJJ);
        this.LJI = new C1467140oHY(this.LJII);
        this.LJIIIIZZ = new C1468470oJh(this.LJII);
        if (C790090Uz1.LIZJ == null) {
            synchronized (C790090Uz1.class) {
                try {
                    if (C790090Uz1.LIZJ == null) {
                        C790090Uz1.LIZJ = new C790090Uz1(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LJZ = C790090Uz1.LIZJ;
        this.LLJJIJI = new C1468350oJV();
        this.LJIILL = new ArrayList();
        this.LJIILLIIL = new ArrayList<>();
        this.LJIIZILJ = new ArrayList();
        this.LJIJ = new ArrayList();
        this.LJIJI = new ArrayList();
        this.LJIIL = true;
        this.LJJLIIIJ = context;
        this.LJLLL = new C1467120oHW(context);
        this.LJLLLL = new C1467160oHa();
        this.LJZI = new C0V3P();
        this.LLLJ = new C1468250oJL();
        if (!LLLL && C1474810oTv.LJLIL() && !C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            this.LJII.LJIIJ();
            LLLL = true;
        }
        if (C1474810oTv.LLJJI()) {
            this.LJLJLLL = new C1468450oJf(this);
            Application application = C1475000oUE.LIZ;
            C1468580oJs.LIZ.getClass();
            if (C1475000oUE.LJIILJJIL == null) {
                C1475000oUE.LJIILJJIL = new C1474960oUA(C1475000oUE.LIZ);
            }
            C1474960oUA c1474960oUA = C1475000oUE.LJIILJJIL;
            C1468450oJf c1468450oJf = this.LJLJLLL;
            if (!((CopyOnWriteArrayList) c1474960oUA.LIZ).contains(c1468450oJf)) {
                ((CopyOnWriteArrayList) c1474960oUA.LIZ).add(c1468450oJf);
            }
        }
    }

    @Override // X.InterfaceC1467240oHi
    public final void LJ(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.LLLIIIIL = j;
        }
    }

    @Override // X.InterfaceC1467240oHi
    public final void LJFF(String str) {
        this.LJJIIJ = str;
    }

    @Override // X.InterfaceC1467240oHi
    public final void LJII(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.LLLIIIL = j;
        }
    }

    @Override // X.InterfaceC1467240oHi
    public final void LJIIIIZZ(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.LLLIIII = j;
        }
    }

    @Override // X.InterfaceC1467240oHi
    public final void LJIIIZ(int i) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null && i != -1) {
            if (c1468170oJD.LLJZIJLIL == Integer.MIN_VALUE) {
                c1468170oJD.LLJZIJLIL = i;
            } else {
                c1468170oJD.LLL = i;
            }
        }
    }

    @Override // X.InterfaceC1467240oHi
    public final void LJIIJJI(int i) {
        this.LJII.LJJLIIJ = i;
    }

    @Override // X.InterfaceC1467240oHi
    public final void LJIILIIL(String str) {
        if (TextUtils.isEmpty(this.LJJJI)) {
            this.LJJJI = str;
        }
        if (this.LJJJ <= 0) {
            this.LJJJ = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC1467240oHi
    public final void LJIILJJIL(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.LLLIILIL = j;
        }
    }

    @Override // X.InterfaceC1467240oHi
    public final void LJIILL(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.LLLIIL = j;
        }
    }

    @Override // X.InterfaceC1467240oHi
    public final void LJIILLIIL(boolean z) {
        if (z) {
            this.LLILLIZIL = 1;
        }
    }

    public final void LJJIFFI(int i) {
        String strSubstring;
        C1468270oJN c1468270oJN;
        this.LIZJ.LLJJJIL = i;
        C1468240oJK c1468240oJK = this.LJLL;
        if (c1468240oJK != null) {
            c1468240oJK.cancel();
            this.LJLL = null;
        }
        C1468320oJS c1468320oJS = this.LJLLI;
        if (c1468320oJS != null) {
            c1468320oJS.cancel();
            this.LJLLI = null;
        }
        C1468230oJJ c1468230oJJ = this.LJ;
        if (c1468230oJJ != null) {
            this.LLFFF = c1468230oJJ.LJFF;
        }
        if (this.LJLJJLL && (c1468270oJN = this.LJIIJJI) != null) {
            c1468270oJN.LIZIZ();
            this.LJIIJJI.LJ = this.LJII;
        }
        if (TextUtils.isEmpty(this.LIZJ.LLLZ)) {
            String strDecode = this.LIZJ.i2;
            if (!TextUtils.isEmpty(this.LJIJJLI)) {
                strDecode = this.LJIJJLI;
            } else if (!TextUtils.isEmpty(this.LJJIIJ)) {
                strDecode = this.LJJIIJ;
            } else if (!TextUtils.isEmpty(this.LJIL)) {
                strDecode = this.LJIL;
            } else if (!TextUtils.isEmpty(strDecode)) {
            }
            try {
                strDecode = URLDecoder.decode(strDecode, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("exception:");
                sbLIZ.append(e.toString());
                C1471660oOq.LIZIZ("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ));
            } catch (IllegalArgumentException e2) {
                TryCatchGuardChecker.doCheck(e2);
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("exception:");
                sbLIZ2.append(e2.toString());
                C1471660oOq.LIZIZ("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ2));
            }
            int iIndexOf = strDecode.indexOf("&l=");
            if (iIndexOf > 0) {
                int iIndexOf2 = strDecode.indexOf("&", iIndexOf + 1);
                if (iIndexOf2 > 0) {
                    strSubstring = strDecode.substring(iIndexOf + 3, iIndexOf2);
                } else {
                    strSubstring = strDecode.substring(iIndexOf + 3);
                }
                this.LIZJ.LLLZ = strSubstring;
            }
        }
        if (this.LIZJ != null) {
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("sendEvent pt_new:");
            sbLIZ3.append(this.LIZJ.LIZLLL);
            sbLIZ3.append(", mEvent:");
            sbLIZ3.append(this.LIZJ);
            sbLIZ3.append(", eventBase:");
            sbLIZ3.append(this.LJII);
            C1471660oOq.LIZJ("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ3));
            if (this.LIZJ.LIZLLL > 0 || this.LJJZZI > 0) {
                LLIIJLIL();
                final Context context = this.LJJLIIIJ;
                final C1468170oJD c1468170oJD = this.LIZJ;
                final C1468180oJE c1468180oJE = this.LJII;
                final C1468300oJQ c1468300oJQ = this.LJLLLLLL;
                final C790090Uz1 c790090Uz1 = this.LJZ;
                EngineThreadPool.addExecuteTask(new Runnable(context, c1468170oJD, this, c1468180oJE, c1468300oJQ, c790090Uz1) { // from class: X.0WPV
                    public final C1468170oJD LL;
                    public final Context LLILLJJLI;
                    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
                    public final C1468160oJC LLILZ;
                    public final C1468180oJE LLILZIL;
                    public final InterfaceC1467850oIh LLILZLL;
                    public final C790090Uz1 LLIZ;

                    public final void LIZ() {
                        C1468160oJC c1468160oJC = this.LLILZ;
                        boolean z = c1468160oJC.LLD;
                        boolean z2 = c1468160oJC.LLF;
                        C1468170oJD c1468170oJD2 = this.LL;
                        String str = c1468170oJD2.W0;
                        String str2 = c1468170oJD2.K1;
                        int i5 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("AyncGetLogDataRunnable enter, enable merge oneplay:");
                        sbLIZ4.append(z);
                        sbLIZ4.append(", sessionId:");
                        sbLIZ4.append(str);
                        C1471660oOq.LIZJ("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ4));
                        C1468170oJD c1468170oJD3 = this.LL;
                        if (c1468170oJD3 == null) {
                            C1471660oOq.LIZIZ("VideoEventLoggerV2", "rEvent is null, return.");
                            return;
                        }
                        C1468160oJC.LLIIL(this.LLILLJJLI, c1468170oJD3, this.LLILZIL, this.LLILZLL);
                        JSONObject jSONObjectLIZJ = this.LL.LIZJ(this.LLILZIL);
                        boolean z3 = this.LLILZIL.LJJLIL;
                        C790090Uz1 c790090Uz12 = this.LLIZ;
                        String str3 = this.LL.LLLLZLLLI;
                        synchronized (c790090Uz12) {
                            if (((HashSet) c790090Uz12.LIZIZ).contains(str3) && c790090Uz12.LIZ != null) {
                                ((HashSet) c790090Uz12.LIZIZ).remove(str3);
                                EngineThreadPool.addExecuteTask(new ARunnableS18S1100000_13(c790090Uz12, str3, 15));
                            }
                        }
                        C790090Uz1 c790090Uz13 = this.LLIZ;
                        if (C790090Uz1.LIZLLL) {
                            c790090Uz13.getClass();
                        } else {
                            C0VSJ c0vsj = c790090Uz13.LIZ;
                            if (c0vsj != null) {
                                C790090Uz1.LIZLLL = true;
                                if (c0vsj.exists()) {
                                    File[] fileArrListFiles = c790090Uz13.LIZ.listFiles();
                                    if (fileArrListFiles == null) {
                                        C1471660oOq.LIZJ("EventSaver", "no file in directory");
                                    } else {
                                        for (File file : fileArrListFiles) {
                                            if (file != null && !file.isDirectory()) {
                                                StringBuilder sb = new StringBuilder();
                                                try {
                                                    BufferedReader bufferedReader = new BufferedReader(new C0VSF(file));
                                                    while (true) {
                                                        try {
                                                            String line = bufferedReader.readLine();
                                                            if (line == null) {
                                                                break;
                                                            } else {
                                                                sb.append(line);
                                                            }
                                                        } catch (Throwable th) {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            try {
                                                                bufferedReader.close();
                                                            } catch (Throwable th2) {
                                                                TryCatchGuardChecker.doCheck(th2);
                                                                th.addSuppressed(th2);
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    bufferedReader.close();
                                                } catch (IOException e3) {
                                                    TryCatchGuardChecker.doCheck(e3);
                                                }
                                                try {
                                                } catch (JSONException e4) {
                                                    e = e4;
                                                }
                                                try {
                                                    C0WPS.instance.addMergeEvent("last_direct_send", new JSONObject(sb.toString()), "", false);
                                                    int i6 = C2187451AjH.LIZ;
                                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                    sbLIZ5.append("saved event uploaded: ");
                                                    sbLIZ5.append(file.getName());
                                                    C1471660oOq.LIZJ("EventSaver", C2188811AlT.LIZIZ(sbLIZ5));
                                                } catch (JSONException e5) {
                                                    e = e5;
                                                    TryCatchGuardChecker.doCheck(e);
                                                }
                                                file.delete();
                                            }
                                        }
                                    }
                                } else {
                                    TTVideoEngineLog.w("EventSaver", "dir does not exist");
                                }
                            }
                        }
                        if (z) {
                            C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS0S2110000_13(str, jSONObjectLIZJ, z2, str2, 2));
                        } else {
                            C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS32S0110000_13(jSONObjectLIZJ, z3, 6));
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AsyncGetLogDataRunnable@f222.run");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AsyncGetLogDataRunnable@f222.run");
                    }

                    {
                        this.LL = c1468170oJD;
                        this.LLILLJJLI = context;
                        this.LLILZ = this;
                        this.LLILZIL = c1468180oJE;
                        this.LLILZLL = c1468300oJQ;
                        this.LLIZ = c790090Uz1;
                    }
                });
                this.LJIILL = new ArrayList();
                this.LJIILLIIL = new ArrayList<>();
                this.LJIIZILJ = new ArrayList();
                this.LJIJ = new ArrayList();
                C1467140oHY c1467140oHY = this.LJI;
                c1467140oHY.getClass();
                c1467140oHY.LIZIZ = new C1467130oHX();
                c1467140oHY.LJII = null;
                c1467140oHY.LJI = null;
                c1467140oHY.LIZJ = false;
                c1467140oHY.LIZLLL = 0;
                c1467140oHY.LJ = -2147483648L;
                c1467140oHY.LJFF = 0;
                this.LJJLIIIIJ = 0;
                this.LJJJLZIJ = -2147483648L;
                this.LJJL = 0L;
                this.LJJLI = 0L;
                this.LJJLIIIJJIZ = -2147483648L;
                this.LJJLIIIJL = -2147483648L;
                this.LJIIL = true;
                this.LJJJJJL = 0;
                this.LJJJJL = 0;
                this.LJJJJIZL = 0;
                this.LJJJJLI = 0;
                this.LJJJJJ = 0L;
                this.LJJIIZI = 0;
                this.LJJIJ = false;
                this.LJJJJZI = 0;
                this.LJJJLIIL = 0;
                this.LJJJZ = -2147483648L;
                this.LJJLL = -2147483648L;
                this.LJJZZI = -2147483648L;
                this.LJJZ = -2147483648L;
                this.LJJZZIII = Integer.MIN_VALUE;
                this.LJLI = false;
                this.LJL = false;
                this.LJLIIIL = Integer.MIN_VALUE;
                this.LJJJI = null;
                this.LJJJ = -2147483648L;
                this.LLJJIJIIJIL = new ArrayList<>();
                this.LLJJIJIL = new ArrayList<>();
                this.LLJJJ = new ArrayList<>();
                this.LLJJJIL = new ArrayList<>();
                this.LLJJJJ = new ArrayList<>();
                this.LLJJJJJIL = new ArrayList<>();
                this.LLJJJJLIIL = new ArrayList<>();
                this.LLJJL = new ArrayList<>();
                this.LLJJLIIIJLLLLLLLZ = new ArrayList<>();
                this.LLJL = new ArrayList<>();
                this.LLJLILLLLZIIL = null;
                this.LLJLLIL = -2147483648L;
                this.LLJLL = -1;
                this.LLJLLL = -2147483648L;
                this.LLJZ = -2147483648L;
                this.LLJZIJLIL = -2147483648L;
                this.LLL = -2147483648L;
                this.LLJLIL = false;
                this.LLIIIJ = Integer.MIN_VALUE;
                this.LLIIIL = Integer.MIN_VALUE;
                this.LLIIIZ = Integer.MIN_VALUE;
                this.LLIIJI = Integer.MIN_VALUE;
                this.LLIIJLIL = Integer.MIN_VALUE;
                this.LLIILII = null;
                this.LLIIL = null;
                this.LLIILZL = null;
                this.LLIIIILZ = Integer.MIN_VALUE;
                this.LLIIII = 0;
                this.LLJILJIL = Integer.MIN_VALUE;
                C1468350oJV c1468350oJV = this.LLJJIJI;
                c1468350oJV.LJIJI = 0;
                c1468350oJV.LJIJJ = 0;
                c1468350oJV.LJIJJLI = 0;
                C1467120oHW c1467120oHW = this.LJLLL;
                if (c1467120oHW.LIZJ && c1467120oHW.LIZ != null) {
                    c1467120oHW.LIZJ = false;
                    c1467120oHW.LIZ.getContentResolver().unregisterContentObserver(c1467120oHW.LJ);
                }
                this.LJLLL = new C1467120oHW(this.LJJLIIIJ);
                C1467160oHa c1467160oHa = this.LJLLLL;
                c1467160oHa.LIZ = 0;
                c1467160oHa.LIZIZ = 0;
                c1467160oHa.LJ.clear();
                ((HashMap) this.LLIFFJFJJ).clear();
                C1467650oIN c1467650oIN = this.LJIIJ;
                c1467650oIN.LIZJ = 0L;
                c1467650oIN.LIZ.clear();
                C1468350oJV c1468350oJV2 = this.LLJJIJI;
                c1468350oJV2.LJJIII = 0;
                c1468350oJV2.LJJIIJ = 0;
                this.LLLFFI = "after clear V2";
                this.LLLFZ = Integer.MIN_VALUE;
                this.LLLI = Integer.MIN_VALUE;
                this.LLLII = Integer.MIN_VALUE;
                this.LLLIIII = new ArrayList<>();
                this.LLLIIIIL = Float.MIN_VALUE;
                this.LLLIIIL = Integer.MIN_VALUE;
                this.LLLIIL = -2147483648L;
                this.LJLJLJ = null;
                this.LLJJIII = -2147483648L;
                this.LLJJ = Integer.MIN_VALUE;
                this.LLJJI = "";
                this.LLJILJILJ = Integer.MIN_VALUE;
                this.LLJILLL = Integer.MIN_VALUE;
                this.LLLILZJ = new ArrayList<>();
                this.LLLILZLLLI = "";
                this.LLLIZZ = "";
                this.LLLIL = Integer.MIN_VALUE;
                this.LLLILZ = "";
                this.LLIL = null;
                this.LLILII = null;
                this.LLIIZ = -2147483648L;
                this.LLILIL = 0;
                this.LL = 0;
                this.LLILL = 0L;
                C1468170oJD c1468170oJD2 = this.LIZJ;
                c1468170oJD2.B1 = 0;
                c1468170oJD2.z1 = 0;
                c1468170oJD2.A1 = 0;
                c1468170oJD2.C1 = 0;
            }
        }
        this.LIZJ = new C1468170oJD();
        C1468140oJA c1468140oJA = this.LIZLLL;
        synchronized (c1468140oJA.LIZJ) {
            try {
                c1468140oJA.LIZJ = new HashMap();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c1468140oJA.LJ = 0L;
        c1468140oJA.LJFF = new ArrayList<>();
        c1468140oJA.LJI = -2147483648L;
        c1468140oJA.LJII = 0;
        C1468230oJJ c1468230oJJ2 = this.LJ;
        if (c1468230oJJ2 != null) {
            c1468230oJJ2.LIZJ();
        }
        C1467110oHV c1467110oHV = this.LJFF;
        if (c1467110oHV != null) {
            c1467110oHV.LIZJ = new ArrayList<>();
            c1467110oHV.LIZLLL = 0;
            c1467110oHV.LJ = 0;
            c1467110oHV.LJFF = -2147483648L;
            c1467110oHV.LJI = -2147483648L;
            c1467110oHV.LJIIIZ = 0;
        }
        this.LJIIIIZZ.LIZ.clear();
    }

    public final void LJJIIJZLJL(int i) {
        HashMap map = new HashMap(2);
        map.put("type", Integer.valueOf(i));
        map.put("t", Long.valueOf(System.currentTimeMillis()));
        InterfaceC1468020oIy interfaceC1468020oIy = this.LIZIZ;
        if (interfaceC1468020oIy != null) {
            ((C1467030oHN) interfaceC1468020oIy).LJFF(6, map);
        }
    }

    public final void LJJIJIIJIL(boolean z) {
        this.LLD = z;
    }

    public final void LJJIJIL(boolean z) {
        this.LLF = z;
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.N1 = z;
        }
    }

    public final void LJJIJL(boolean z) {
        if (z) {
            this.LJJIIZ = 1;
        } else {
            this.LJJIIZ = 0;
        }
    }

    public final void LJJIJLIJ(InterfaceC1467050oHP interfaceC1467050oHP) {
        if (interfaceC1467050oHP != null) {
            LLIILII(interfaceC1467050oHP);
            C1468170oJD c1468170oJD = this.LIZJ;
            if (c1468170oJD.LJJIIJ <= 0) {
                c1468170oJD.LJJI = System.currentTimeMillis();
            }
            int i = this.LIZJ.LLLII;
            if (i == 1) {
                LJJ(-1005, true);
            } else {
                if (i != 0) {
                    return;
                }
                LJJ(-1004, true);
            }
        }
    }

    public final int LJJIL(int i) {
        if (i != 49) {
            if (i != 158) {
                if (i != 160) {
                    if (i != 162) {
                        if (i == 165) {
                            return this.LLFZ;
                        }
                        return -1;
                    }
                    return this.LJJJJJL;
                }
                return this.LLFII;
            }
            return this.LLFF;
        }
        C1468180oJE c1468180oJE = this.LJII;
        if (c1468180oJE != null) {
            return c1468180oJE.LJJIJL;
        }
        return -1;
    }

    public final long LJJIZ(int i) {
        if (i != 159) {
            if (i == 161 || i != 163) {
                return 0L;
            }
            return this.LIZLLL.LJ;
        }
        return this.LLFFF;
    }

    public final String LJJJ(int i) {
        HashMap<String, Object> map;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.d(th);
        }
        if (i != 47) {
            if (i != 86) {
                if (i == 173 && (map = this.LLLFF) != null && !map.isEmpty()) {
                    return C786410Ut5.J3(new JSONObject(map));
                }
                return "";
            }
            return this.LJII.LJIILL;
        }
        return this.LJII.LJJII;
    }

    public final void LJJJIL(e eVar) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null && c1468170oJD.LJJJJL == Integer.MIN_VALUE && c1468170oJD.LJJJJJL == Integer.MIN_VALUE && c1468170oJD.LJJJJLI == Integer.MIN_VALUE) {
            c1468170oJD.LJJJJJL = eVar.LIZLLL();
            C1468170oJD c1468170oJD2 = this.LIZJ;
            c1468170oJD2.LJJJJL = eVar.LIZ;
            c1468170oJD2.LJJJJLI = eVar.LIZIZ;
        }
    }

    public final void LJJJJ(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJJIIJZLJL);
            sbLIZ.append(str);
            this.LJJIIJZLJL = C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJI(int r9) {
        /*
            r8 = this;
            long r1 = java.lang.System.currentTimeMillis()
            r0 = 5
            r7 = 0
            if (r9 == r0) goto L25
            int r3 = r8.LJJLIIIIJ
            r0 = 4
            java.lang.String r5 = "wait"
            if (r3 != r0) goto L66
            X.0oJJ r0 = r8.LJ
            if (r0 == 0) goto L16
            r0.LIZ(r7, r5)
        L16:
            r4 = 0
        L17:
            int r3 = r8.LJJLIIIIJ
            r0 = 3
            if (r3 != r0) goto L5e
            X.0oJA r0 = r8.LIZLLL
            r0.LIZIZ(r5)
            X.0oJD r0 = r8.LIZJ
            r0.LLJJLIIIJLLLLLLLZ = r1
        L25:
            boolean r0 = r8.LLJLIL
            if (r0 == 0) goto L42
            X.0oIy r3 = r8.LIZIZ
            if (r3 == 0) goto L5b
            r0 = 67
            X.0oHN r3 = (X.C1467030oHN) r3
            int r0 = r3.LIZJ(r0)
            long r5 = (long) r0
        L36:
            X.0oHV r4 = r8.LJFF
            if (r4 == 0) goto L40
            int r3 = (int) r5
            java.lang.String r0 = "finish"
            r4.LIZ(r3, r0)
        L40:
            r8.LLJLIL = r7
        L42:
            boolean r0 = r8.LJIIL
            if (r0 == 0) goto L56
            X.0oJD r7 = r8.LIZJ
            long r5 = r7.LJJIIJ
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L56
            r7.LJJIJ = r1
        L52:
            r8.LJJIFFI(r9)
            return
        L56:
            X.0oJD r0 = r8.LIZJ
            r0.LJJIIZI = r1
            goto L52
        L5b:
            r5 = -1
            goto L36
        L5e:
            if (r4 == 0) goto L25
            X.0oJE r0 = r8.LJII
            r0.LJIILJJIL()
            goto L25
        L66:
            r4 = 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1468160oJC.LJJJJI(int):void");
    }

    public final void LJJJJIZL(int i) {
        InterfaceC1468020oIy interfaceC1468020oIy;
        int i2 = C2187451AjH.LIZ;
        C1471660oOq.LIZJ("VideoEventLoggerV2", "movie may stall");
        C1468140oJA c1468140oJA = this.LIZLLL;
        c1468140oJA.LIZLLL.LIZLLL = System.currentTimeMillis();
        c1468140oJA.LIZLLL.LJ = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("movie stall type:");
        sbLIZ.append(i);
        TTVideoEngineLog.d("VideoEventOneEvent", C2188811AlT.LIZIZ(sbLIZ));
        C1468180oJE c1468180oJE = c1468140oJA.LIZ;
        if (c1468180oJE != null) {
            c1468180oJE.LJIIL();
        }
        C1468180oJE c1468180oJE2 = c1468140oJA.LIZ;
        if (c1468180oJE2 != null && (interfaceC1468020oIy = c1468180oJE2.LIZ) != null) {
            c1468140oJA.LIZLLL.LJJII = ((C1467030oHN) interfaceC1468020oIy).LIZLLL(144);
            c1468140oJA.LIZLLL.LJJIII = ((C1467030oHN) c1468140oJA.LIZ.LIZ).LIZLLL(149);
            c1468140oJA.LIZLLL.LJJIIJ = ((C1467030oHN) c1468140oJA.LIZ.LIZ).LIZLLL(150);
        }
    }

    public final void LJJJJJL(int i) {
        C1474520oTS c1474520oTSLJIJI;
        InterfaceC1467050oHP interfaceC1467050oHP = this.LJJJLL;
        if (interfaceC1467050oHP != null && (c1474520oTSLJIJI = interfaceC1467050oHP.LJIJI(i)) != null) {
            int iLJFF = c1474520oTSLJIJI.LJFF();
            String strLIZ = c1474520oTSLJIJI.LIZ(6);
            if (iLJFF == 1) {
                if ("dash".equals(strLIZ) || "bash".equals(strLIZ)) {
                    this.LJII.LJJLIIIJ = i;
                }
            }
        }
    }

    public final void LJJJJL(int i) {
        LJJ(-2002, false);
        this.LJJLIIIIJ = 2;
        C1468230oJJ c1468230oJJ = this.LJ;
        if (c1468230oJJ != null) {
            c1468230oJJ.LIZ(i, "wait");
        }
    }

    public final void LJJJJLL(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD == null) {
            return;
        }
        c1468170oJD.LJJLIL = j;
    }

    public final void LJJJJZ(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD == null) {
            return;
        }
        c1468170oJD.LJJLJ = j;
    }

    public final void LJJJJZI(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD == null) {
            return;
        }
        c1468170oJD.LJJLJLI = j;
    }

    public final void LJJJLIIL(int i) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.o1 = i;
        }
    }

    public final void LJJJLL(int i) {
        boolean z;
        String str;
        if (this.LIZJ != null) {
            if (i != 150 && i != 300019) {
                z = false;
            } else {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            C1468170oJD c1468170oJD = this.LIZJ;
            if (boolValueOf.booleanValue()) {
                str = "image";
            } else {
                str = "video";
            }
            c1468170oJD.m1 = str;
            this.LIZJ.n1 = i;
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setImageType: ");
            sbLIZ.append(this.LIZJ.m1);
            TTVideoEngineLog.d("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJJJLZIJ(int i) {
        if (this.LIZJ != null) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setCloseSRReason: ");
            sbLIZ.append(i);
            TTVideoEngineLog.d("StrategyV2", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZJ.f194p1 = i;
        }
    }

    public final void LJJJZ(String str) {
        if (this.LJII != null && str != null && !str.isEmpty()) {
            this.LJII.getClass();
        }
    }

    public final void LJJL(String str) {
        if (this.LJII != null && str != null && !str.isEmpty()) {
            this.LJII.LJIJI = str;
        }
    }

    public final void LJJLI(String str) {
        C1468180oJE c1468180oJE = this.LJII;
        if (c1468180oJE != null) {
            c1468180oJE.LJIL = str;
        }
    }

    public final void LJJLIIIIJ(String str) {
        C1468180oJE c1468180oJE = this.LJII;
        if (c1468180oJE != null) {
            c1468180oJE.LJIJJLI = str;
        }
    }

    public final void LJJLIIIJ(String str) {
        if (this.LJII != null && str != null && !str.isEmpty()) {
            this.LJII.LJIJ = str;
        }
    }

    public final void LJJLIIIJILLIZJL(String str) {
        C1468180oJE c1468180oJE = this.LJII;
        if (TextUtils.isEmpty(c1468180oJE.LJJJLZIJ)) {
            c1468180oJE.LJJJLZIJ = str;
        }
        c1468180oJE.LJJJZ = str;
    }

    public final void LJJLIIIJJIZ(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.LLJJI = j;
            if (this.LJIIL && c1468170oJD.LLLII == 0) {
                LJJ(-1005, true);
            }
        }
    }

    public final void LJJLIIIJLLLLLLLZ(C1467030oHN c1467030oHN) {
        this.LIZIZ = c1467030oHN;
        this.LJII.LIZ = c1467030oHN;
    }

    public final void LJJLIIJ(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD == null) {
            return;
        }
        c1468170oJD.LJJZZIII = j;
    }

    public final void LJJLIL(long j) {
        C0X35.LJIIJJI("player_setsurface_to_renderstart", true);
        C0X35.LJIIJJI("player_prerender_onprepared_to_renderstart", true);
        C0X35.LIZ("player_renderstart_to_firstframe", true);
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.LJJZZI = j;
        }
    }

    public final void LJJLJ(int i) {
        this.LJJIZ = i;
    }

    public final void LJJLJLI(String str) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.q1 = str;
        }
    }

    public final void LJJLL(String str) {
        this.LJII.LJJJJIZL = str;
    }

    public final void LJJZ(int i) {
        this.LJII.LJJJJI = i;
    }

    public final void LJJZZIII(String str) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.r1 = str;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setEventType: ");
            sbLIZ.append(str);
            TTVideoEngineLog.d("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJL(InterfaceC1467050oHP interfaceC1467050oHP) {
        if (interfaceC1467050oHP == null) {
            return;
        }
        LLIILII(interfaceC1467050oHP);
    }

    public final void LJLI(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null && c1468170oJD.LLLLLZ <= 0) {
            c1468170oJD.LLLLLZ = j;
        }
    }

    public final void LJLIIL(int i) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.LJLLI = i;
        }
    }

    public final void LJLIL(C1468040oJ0 c1468040oJ0) {
        if (c1468040oJ0 != null) {
            this.LJIIIZ = c1468040oJ0;
            this.LJIIJ = new C1467650oIN(c1468040oJ0);
        }
    }

    public final void LJLILLLLZI(String str) {
        this.LJJ = str;
        C1468180oJE c1468180oJE = this.LJII;
        if (c1468180oJE != null) {
            c1468180oJE.getClass();
        }
    }

    public final void LJLJI(String str) {
        this.LJJI = str;
        C1468180oJE c1468180oJE = this.LJII;
        if (c1468180oJE != null) {
            c1468180oJE.LJIIZILJ = str;
        }
    }

    public final void LJLJJI(String str) {
        this.LJJIFFI = str;
        HashMap map = new HashMap(5);
        map.put("to", str);
        map.put("p", -1);
        map.put("t", Long.valueOf(System.currentTimeMillis()));
        map.put("c", 0);
        map.put("seam", Boolean.FALSE);
        C790040Uyw.LIZJ(C786410Ut5.J3(new JSONObject(map)), this.LLJJJ);
    }

    public final void LJLJJLL(int i) {
        C1468340oJU c1468340oJU;
        C1468340oJU c1468340oJU2;
        C1468340oJU c1468340oJU3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        switch (i) {
            case 63:
                if (this.LJJZ <= 0) {
                    this.LJJZ = jCurrentTimeMillis;
                }
                break;
            case 64:
                C1468170oJD c1468170oJD = this.LIZJ;
                if (c1468170oJD.LIZLLL <= 0) {
                    c1468170oJD.LIZLLL = jCurrentTimeMillis;
                }
                break;
            case 65:
                if (this.LJJLL <= 0) {
                    this.LJJLL = jCurrentTimeMillis;
                }
                break;
            default:
                switch (i) {
                    case 169:
                        C1468230oJJ c1468230oJJ = this.LJ;
                        if (c1468230oJJ != null && (c1468340oJU = c1468230oJJ.LIZJ) != null) {
                            c1468340oJU.LJIJJ = jCurrentTimeMillis;
                            break;
                        }
                        break;
                    case 170:
                        C1468230oJJ c1468230oJJ2 = this.LJ;
                        if (c1468230oJJ2 != null && (c1468340oJU2 = c1468230oJJ2.LIZJ) != null) {
                            c1468340oJU2.LJIJJLI = jCurrentTimeMillis;
                            break;
                        }
                        break;
                    case 171:
                        C1468230oJJ c1468230oJJ3 = this.LJ;
                        if (c1468230oJJ3 != null && (c1468340oJU3 = c1468230oJJ3.LIZJ) != null) {
                            c1468340oJU3.LJIL = jCurrentTimeMillis;
                            break;
                        }
                        break;
                }
                break;
        }
    }

    public final void LJLJL(boolean z) {
        this.LJJIJ = z;
    }

    public final void LJLJLJ(String str) {
        this.LLIILII = str;
    }

    public final void LJLJLLL(int i) {
        this.LJJLIL = i;
    }

    public final void LJLLI(s sVar) {
        if (this.LIZJ == null) {
            return;
        }
        try {
            if (TTVideoEngine.LJIIL == 0) {
                LJLLJ(sVar);
            } else {
                LJLLILLLL(sVar);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJLLILLLL(s sVar) {
        int iLIZJ;
        float f = sVar.LIZLLL;
        C1468180oJE c1468180oJE = this.LJII;
        if (c1468180oJE.LJJJJJ != f) {
            c1468180oJE.LJJJJJ = f;
            HashMap map = new HashMap(3);
            InterfaceC1468020oIy interfaceC1468020oIy = this.LIZIZ;
            if (interfaceC1468020oIy != null) {
                iLIZJ = ((C1467030oHN) interfaceC1468020oIy).LIZJ(67);
            } else {
                iLIZJ = -1;
            }
            map.put("to", Float.valueOf(this.LJII.LJJJJJ));
            map.put("p", Integer.valueOf(iLIZJ));
            map.put("t", Long.valueOf(System.currentTimeMillis()));
            C790040Uyw.LIZJ(C786410Ut5.J3(new JSONObject(map)), this.LLJJJIL);
        }
        if (f > 0.0f) {
            C1468180oJE c1468180oJE2 = this.LJII;
            c1468180oJE2.LJJJJJL = Math.max(c1468180oJE2.LJJJJJL, Math.min(f, 20.0f));
            C1468180oJE c1468180oJE3 = this.LJII;
            c1468180oJE3.LJJJJL = Math.min(c1468180oJE3.LJJJJL, Math.max(f, 0.0f));
        }
    }

    public final void LJLLJ(s sVar) {
        int iLIZJ;
        float f = sVar.LIZLLL;
        HashMap map = new HashMap(3);
        map.put("AFMode", Integer.valueOf(sVar.LIZIZ));
        map.put("pitch", Float.valueOf(sVar.LIZJ));
        map.put("speed", Float.valueOf(f));
        this.LJJIJIIJI = map;
        if (this.LJII.LJJJJJ != f || this.LLJJJIL.isEmpty()) {
            C1468180oJE c1468180oJE = this.LJII;
            c1468180oJE.LJJJJJ = f;
            if (f != 1.0f) {
                c1468180oJE.getClass();
                this.LLFZ = 1;
            }
            HashMap map2 = new HashMap(3);
            InterfaceC1468020oIy interfaceC1468020oIy = this.LIZIZ;
            if (interfaceC1468020oIy != null) {
                iLIZJ = ((C1467030oHN) interfaceC1468020oIy).LIZJ(67);
            } else {
                iLIZJ = -1;
            }
            map2.put("to", Float.valueOf(this.LJII.LJJJJJ));
            map2.put("p", Integer.valueOf(iLIZJ));
            map2.put("t", Long.valueOf(System.currentTimeMillis()));
            C790040Uyw.LIZJ(C786410Ut5.J3(new JSONObject(map2)), this.LLJJJIL);
        }
        if (f > 0.0f) {
            C1468180oJE c1468180oJE2 = this.LJII;
            c1468180oJE2.LJJJJJL = Math.max(c1468180oJE2.LJJJJJL, Math.min(f, 20.0f));
            C1468180oJE c1468180oJE3 = this.LJII;
            c1468180oJE3.LJJJJL = Math.min(c1468180oJE3.LJJJJL, Math.max(f, 0.0f));
        }
    }

    public final void LJLLL(String str) {
        if (this.LIZJ != null && !TextUtils.isEmpty(str)) {
            this.LIZJ.LJLLL = str;
        }
    }

    public final void LJLLLL(String str) {
        if (TextUtils.isEmpty(this.LJLJLJ)) {
            this.LJLJLJ = str;
        }
    }

    public final void LJLLLLLL(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD == null) {
            return;
        }
        c1468170oJD.LJJZ = j;
    }

    public final void LJLZ(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD == null) {
            return;
        }
        c1468170oJD.LJJLL = j;
    }

    public final void LJZI(String str) {
        if (TextUtils.isEmpty(str)) {
            this.LLILII = null;
            return;
        }
        try {
            this.LLILII = new C1469110oKj(new JSONObject(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("VideoEventLoggerV2", "parse subinfo json error");
        }
    }

    public final void LJZL(String str) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.LLJLLIL = str;
        }
        this.LJII.LJJJJLI = str;
    }

    public final void LL(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD == null) {
            return;
        }
        c1468170oJD.LJJLIIIJLJLI = j;
    }

    public final void LLD(long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD == null) {
            return;
        }
        c1468170oJD.LJJLIIJ = j;
    }

    public final void LLFF(int i) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.O1 = i;
        }
    }

    public final void LLFFF(float f) {
        HashMap map = new HashMap(2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put("distc", Float.valueOf(f));
        map.put("t", Long.valueOf(jCurrentTimeMillis));
        this.LLLIIII.add(C786410Ut5.J3(new JSONObject(map)));
    }

    public final void LLFII(int i) {
        this.LLLIIIL = i;
    }

    public final void LLFZ(long j) {
        InterfaceC1468020oIy interfaceC1468020oIy = this.LIZIZ;
        if (interfaceC1468020oIy != null) {
            this.LIZJ.z1 = ((C1467030oHN) interfaceC1468020oIy).LIZJ(172);
        }
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD.LJJIIJ > 0 && c1468170oJD.LJJIIZ <= 0) {
            c1468170oJD.LJJIIZ = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLII(int r12) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1468160oJC.LLII(int):void");
    }

    public final void LLIIIILZ(int i) {
        if (i <= -1) {
            this.LLIIZ = LJJIJIIJI(3, i);
        }
    }

    public final void LLIIJI(boolean z) {
        int iLIZJ;
        C1468230oJJ c1468230oJJ;
        if (z) {
            if (this.LJJLIIIIJ == 4 && (c1468230oJJ = this.LJ) != null) {
                c1468230oJJ.LIZ(0, "wait");
            }
            if (this.LJJLIIIIJ == 3) {
                this.LJJLIIIIJ = 2;
            }
        }
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.LLJLIL = System.currentTimeMillis();
            C1468170oJD c1468170oJD2 = this.LIZJ;
            long j = c1468170oJD2.LLJL;
            if (j > 0) {
                long j2 = c1468170oJD2.LLJLIL - j;
                InterfaceC1468020oIy interfaceC1468020oIy = this.LIZIZ;
                if (interfaceC1468020oIy != null) {
                    iLIZJ = ((C1467030oHN) interfaceC1468020oIy).LIZJ(67);
                } else {
                    iLIZJ = -1;
                }
                HashMap map = new HashMap(5);
                map.put("to", this.LJII.LJJJ);
                map.put("p", Integer.valueOf(iLIZJ));
                map.put("t", Long.valueOf(System.currentTimeMillis()));
                map.put("c", Long.valueOf(j2));
                map.put("seam", Boolean.valueOf(z));
                C790040Uyw.LIZJ(C786410Ut5.J3(new JSONObject(map)), this.LLJJJ);
            }
        }
        if (z) {
            LJJ(-2005, false);
        }
    }

    public final void LLIILII(InterfaceC1467050oHP interfaceC1467050oHP) {
        if (interfaceC1467050oHP == null) {
            return;
        }
        this.LJII.LJIIJJI(interfaceC1467050oHP);
        this.LJJJLL = interfaceC1467050oHP;
        C0V3P c0v3p = this.LJZI;
        c0v3p.getClass();
        String strLJJII = interfaceC1467050oHP.LJJII(245);
        if (!TextUtils.isEmpty(strLJJII)) {
            try {
                c0v3p.LIZ.putAll(C0V3P.LIZIZ(new JSONObject(strLJJII)));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LLIIZ(int i) {
        this.LJIILJJIL = i;
    }

    public final void LLIL(int i) {
        C1468180oJE c1468180oJE = this.LJII;
        c1468180oJE.LJJIII = i;
        c1468180oJE.LJJIIJ = i;
    }

    @Override // X.InterfaceC1467240oHi
    public final void LIZ(int i, String str) {
        switch (i) {
            case 15:
                this.LIZJ.LLLZ = str;
                break;
            case 53:
                this.LJII.getClass();
                break;
            case 86:
                this.LJII.LJIJJ = str;
                break;
            case 113:
                C1468300oJQ c1468300oJQ = this.LJLLLLLL;
                if (c1468300oJQ != null) {
                    c1468300oJQ.LIZIZ = str;
                } else {
                    this.LJLZ = str;
                }
                break;
            case 114:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                C1468170oJD c1468170oJD = this.LIZJ;
                sbLIZ.append(c1468170oJD.M1);
                sbLIZ.append(str);
                c1468170oJD.M1 = C2188811AlT.LIZIZ(sbLIZ);
                break;
            case 128:
                this.LLLFFI = str;
                break;
            case 135:
                try {
                    ((ConcurrentHashMap) this.LIZJ.j).put("sc", new JSONObject(str));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
                break;
            case 141:
                ((HashMap) this.LIZJ.i).put("headers", str);
                break;
            case 146:
                this.LLJJI = str;
                break;
            case 151:
                try {
                    ((ConcurrentHashMap) this.LIZJ.j).put("smi", new JSONArray(str));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return;
                }
                break;
            case 152:
                this.LIZJ.LLLZIIL = str;
                break;
            case 153:
                this.LIZJ.LLLZIL = str;
                break;
            case 154:
                this.LJII.LJJIFFI = str;
                break;
            case 156:
                this.LIZJ.X0 = str;
                break;
            case 176:
                this.LIZJ.i1 = str;
                break;
            case 189:
                this.LIZJ.I0 = str;
                break;
            case 201:
                this.LIZJ.G1 = str;
                break;
            case 202:
                this.LIZJ.f184J = str;
                break;
            case 209:
                this.LIZJ.getClass();
                break;
            case 210:
                this.LIZJ.K1 = str;
                break;
            case 211:
                this.LIZJ.L1 = str;
                break;
            case 222:
                this.LIZJ.S1 = str;
                break;
            case 225:
                this.LIZJ.T1 = str;
                break;
            case 229:
                this.LIZJ.U1 = str;
                break;
            case 230:
                this.LIZJ.g2 = str;
                break;
            case 231:
                this.LIZJ.h2 = str;
                break;
            case 236:
                this.LIZJ.w2 = str;
                break;
            case 237:
                this.LIZJ.y2 = str;
                break;
            case 244:
                this.LIZJ.i2 = str;
                break;
            case 245:
                this.LIZJ.j2 = str;
                break;
            case 248:
                this.LIZJ.z2 = str;
                break;
            case 249:
                this.LIZJ.A2 = str;
                break;
            case 252:
                this.LIZJ.F1 = str;
                break;
            case 254:
                this.LIZJ.V1 = str;
                break;
        }
    }

    @Override // X.InterfaceC1467240oHi
    public final void LIZIZ(int i, long j) {
        if (i != 87) {
            if (i != 88) {
                if (i != 98) {
                    if (i != 99) {
                        if (i != 136) {
                            if (i != 137) {
                                if (i != 197) {
                                    if (i != 198) {
                                        switch (i) {
                                            case 21:
                                                this.LJJLIIIJJIZ = j;
                                                break;
                                            case 56:
                                                this.LJJLIIIJL = j;
                                                break;
                                            case 66:
                                                this.LIZJ.LJ = j;
                                                break;
                                            case 67:
                                                this.LIZJ.LJFF = j;
                                                break;
                                            case 68:
                                                this.LIZJ.LJI = j;
                                                break;
                                            case 69:
                                                this.LIZJ.LJII = j;
                                                break;
                                            case 70:
                                                this.LIZJ.LJIIIZ = j;
                                                break;
                                            case 71:
                                                this.LIZJ.LJIIJ = j;
                                                break;
                                            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                                                this.LIZJ.LJIILJJIL = j;
                                                break;
                                            case 73:
                                                this.LIZJ.LJIILIIL = j;
                                                break;
                                            case 74:
                                                this.LIZJ.LJIILLIIL = j;
                                                break;
                                            case 75:
                                                this.LIZJ.LJIILL = j;
                                                break;
                                            case 76:
                                                this.LIZJ.LJIIJJI = j;
                                                break;
                                            case 77:
                                                C1468170oJD c1468170oJD = this.LIZJ;
                                                c1468170oJD.LJIIL = j;
                                                c1468170oJD.LJJIIJZLJL = System.currentTimeMillis();
                                                break;
                                            case 78:
                                                this.LIZJ.LJIIIIZZ = j;
                                                break;
                                            case 101:
                                                ((HashMap) this.LIZJ.i).put("gs_bitrate", Long.valueOf(j));
                                                break;
                                            case 103:
                                                ((HashMap) this.LIZJ.i).put("gs_speed", Long.valueOf(j));
                                                break;
                                            case 147:
                                                this.LLJJIII = j;
                                                break;
                                            case 200:
                                                this.LIZJ.E1 = j;
                                                break;
                                            case 226:
                                                if (this.LIZJ.e2.size() < 10) {
                                                    this.LIZJ.e2.add(Long.valueOf(j));
                                                }
                                                break;
                                            case 234:
                                                this.LIZJ.q2 = j;
                                                break;
                                            case 235:
                                                this.LIZJ.r2 = j;
                                                break;
                                            default:
                                                switch (i) {
                                                    case 82:
                                                        this.LIZJ.D = j;
                                                        break;
                                                    case 83:
                                                        this.LIZJ.C = j;
                                                        break;
                                                    case 84:
                                                        this.LIZJ.H = j;
                                                        break;
                                                    case 85:
                                                        this.LIZJ.I = j;
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 105:
                                                                ((HashMap) this.LIZJ.i).put("gs_select_begin", Long.valueOf(j));
                                                                break;
                                                            case 106:
                                                                ((HashMap) this.LIZJ.i).put("gs_select_end", Long.valueOf(j));
                                                                break;
                                                            case 107:
                                                                ((HashMap) this.LIZJ.i).put("gs_on_before_begin", Long.valueOf(j));
                                                                break;
                                                            case 108:
                                                                ((HashMap) this.LIZJ.i).put("gs_on_before_end", Long.valueOf(j));
                                                                break;
                                                            case 109:
                                                                ((HashMap) this.LIZJ.i).put("gs_on_after_begin", Long.valueOf(j));
                                                                break;
                                                            case 110:
                                                                ((HashMap) this.LIZJ.i).put("gs_on_after_end", Long.valueOf(j));
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 120:
                                                                        this.LIZJ.LJIIZILJ = j;
                                                                        break;
                                                                    case 121:
                                                                        this.LIZJ.LJIJ = j;
                                                                        break;
                                                                    case 122:
                                                                        this.LIZJ.LJIJI = j;
                                                                        break;
                                                                    case 123:
                                                                        this.LIZJ.LJIJJ = j;
                                                                        break;
                                                                    case 124:
                                                                        this.LIZJ.LJIJJLI = j;
                                                                        break;
                                                                    case 125:
                                                                        this.LIZJ.LJIL = j;
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case 186:
                                                                                this.LIZJ.E = j;
                                                                                break;
                                                                            case 187:
                                                                                this.LIZJ.F = j;
                                                                                break;
                                                                            case 188:
                                                                                this.LIZJ.G = j;
                                                                                break;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 190:
                                                                                        this.LLILL = j;
                                                                                        break;
                                                                                    case 191:
                                                                                        this.LIZJ.J0 = j;
                                                                                        break;
                                                                                    case 192:
                                                                                        this.LIZJ.K0 = j;
                                                                                        break;
                                                                                    case 193:
                                                                                        this.LIZJ.M0 = j;
                                                                                        break;
                                                                                    case 194:
                                                                                        this.LIZJ.L0 = j;
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        return;
                                    }
                                    this.LIZJ.t1 = j;
                                    return;
                                }
                                this.LIZJ.v1 = j;
                                return;
                            }
                            ((ConcurrentHashMap) this.LIZJ.j).put("bad", Long.valueOf(j));
                            return;
                        }
                        ((ConcurrentHashMap) this.LIZJ.j).put("bbd", Long.valueOf(j));
                        return;
                    }
                    this.LIZJ.LLZ = j;
                    C1467110oHV c1467110oHV = this.LJFF;
                    if (c1467110oHV == null) {
                        return;
                    }
                    c1467110oHV.LJIIIIZZ = j;
                    return;
                }
                this.LIZJ.LLLZZIL = j;
                C1467110oHV c1467110oHV2 = this.LJFF;
                if (c1467110oHV2 == null) {
                    return;
                }
                c1467110oHV2.LJII = j;
                return;
            }
            this.LIZJ.LJJIII = j;
            return;
        }
        this.LIZJ.LJJLIIIJLLLLLLLZ = j;
    }

    @Override // X.InterfaceC1467240oHi
    public final void LIZJ(int i, int i2) {
        int iLIZJ;
        C1468340oJU c1468340oJU;
        if (i != 54) {
            if (i != 55) {
                if (i != 59) {
                    if (i != 60) {
                        if (i != 111) {
                            boolean z = true;
                            if (i != 112) {
                                if (i != 126) {
                                    if (i != 127) {
                                        switch (i) {
                                            case BdTuring.TYPE_EMAIL /* 11 */:
                                                this.LJJZZIII = i2;
                                                break;
                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                if (i2 != 1) {
                                                    z = false;
                                                }
                                                this.LJL = z;
                                                break;
                                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                if (i2 != 1) {
                                                    z = false;
                                                }
                                                this.LJLI = z;
                                                break;
                                            case 14:
                                                this.LJLIIIL = i2;
                                                break;
                                            default:
                                                switch (i) {
                                                    case 16:
                                                        this.LJII.LJJIIJZLJL = i2;
                                                        break;
                                                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                        C1468270oJN c1468270oJN = this.LJIIJJI;
                                                        if (c1468270oJN != null && i2 > 0) {
                                                            c1468270oJN.LIZJ = i2;
                                                            break;
                                                        }
                                                        break;
                                                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                                        if (i2 != 0) {
                                                            this.LJLJJLL = true;
                                                            C1468270oJN c1468270oJN2 = this.LJIIJJI;
                                                            if (c1468270oJN2 != null) {
                                                                if (Math.random() > c1468270oJN2.LIZ) {
                                                                    c1468270oJN2.LIZIZ = false;
                                                                } else {
                                                                    c1468270oJN2.LIZIZ = true;
                                                                }
                                                            }
                                                        } else {
                                                            this.LJLJJLL = false;
                                                            C1468270oJN c1468270oJN3 = this.LJIIJJI;
                                                            if (c1468270oJN3 != null) {
                                                                c1468270oJN3.LIZIZ();
                                                            }
                                                        }
                                                        break;
                                                    case 19:
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 22:
                                                                this.LJLLILLLL = i2;
                                                                break;
                                                            case 23:
                                                                this.LJLLJ = i2;
                                                                break;
                                                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                                                this.LJJLJ = i2;
                                                                break;
                                                            case 25:
                                                                this.LJJLJLI = i2;
                                                                break;
                                                            case 26:
                                                                this.LLJJIJI.LIZ = i2;
                                                                break;
                                                            case 27:
                                                                this.LLJJIJI.LIZIZ = i2;
                                                                break;
                                                            default:
                                                                if (i != 195) {
                                                                    if (i != 196) {
                                                                        if (i != 227) {
                                                                            if (i != 228) {
                                                                                switch (i) {
                                                                                    case 29:
                                                                                        this.LLJJIJI.LIZJ = i2;
                                                                                        break;
                                                                                    case 30:
                                                                                        this.LLJJIJI.LJ = i2;
                                                                                        break;
                                                                                    case 31:
                                                                                        this.LLJJIJI.LJFF = i2;
                                                                                        break;
                                                                                    case 32:
                                                                                        this.LLJJIJI.LJI = i2;
                                                                                        break;
                                                                                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                                                                        this.LLJJIJI.LJII = i2;
                                                                                        break;
                                                                                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                                                                        this.LLJJIJI.LJIIIIZZ = i2;
                                                                                        break;
                                                                                    case 35:
                                                                                        this.LLJJIJI.LJIIIZ = i2;
                                                                                        break;
                                                                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                                                                        this.LLJJIJI.LJIIJ = i2;
                                                                                        break;
                                                                                    case 37:
                                                                                        this.LLJJIJI.LJIIJJI = i2;
                                                                                        break;
                                                                                    case 38:
                                                                                        this.LLJJIJI.LJIIL = i2;
                                                                                        break;
                                                                                    case 39:
                                                                                        this.LLJJIJI.LJIILIIL = i2;
                                                                                        break;
                                                                                    case 40:
                                                                                        this.LLJJIJI.LJIILJJIL = i2;
                                                                                        break;
                                                                                    case 41:
                                                                                        this.LLJJIJI.LJIILL = i2;
                                                                                        break;
                                                                                    case 42:
                                                                                        this.LLJJIJI.LJIILLIIL = i2;
                                                                                        break;
                                                                                    case 43:
                                                                                        this.LLJJIJI.LJIIZILJ = i2;
                                                                                        break;
                                                                                    case 44:
                                                                                        this.LLJJIJI.LJIJ = i2;
                                                                                        break;
                                                                                    case 45:
                                                                                        HashMap map = new HashMap(3);
                                                                                        InterfaceC1468020oIy interfaceC1468020oIy = this.LIZIZ;
                                                                                        if (interfaceC1468020oIy != null) {
                                                                                            iLIZJ = ((C1467030oHN) interfaceC1468020oIy).LIZJ(67);
                                                                                        } else {
                                                                                            iLIZJ = -1;
                                                                                        }
                                                                                        map.put("s", Integer.valueOf(i2));
                                                                                        map.put("p", Integer.valueOf(iLIZJ));
                                                                                        map.put("t", Long.valueOf(System.currentTimeMillis()));
                                                                                        C790040Uyw.LIZJ(C786410Ut5.J3(new JSONObject(map)), this.LLJJJJ);
                                                                                        break;
                                                                                    case 46:
                                                                                        this.LLIIJLIL = i2;
                                                                                        break;
                                                                                    case 47:
                                                                                        this.LLIIIZ = i2;
                                                                                        break;
                                                                                    case 48:
                                                                                        this.LLIIJI = i2;
                                                                                        break;
                                                                                    case 49:
                                                                                        this.LLIIIJ = i2;
                                                                                        break;
                                                                                    case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                                                                        this.LLIIIL = i2;
                                                                                        break;
                                                                                    case BaseNotice.CREATOR /* 62 */:
                                                                                        this.LJJLIIJ = i2;
                                                                                        break;
                                                                                    case 100:
                                                                                        this.LJZL = i2;
                                                                                        C1468230oJJ c1468230oJJ = this.LJ;
                                                                                        if (c1468230oJJ != null) {
                                                                                            if ((i2 & 1) == 0) {
                                                                                                z = false;
                                                                                            }
                                                                                            c1468230oJJ.LJII = z;
                                                                                        }
                                                                                        break;
                                                                                    case 102:
                                                                                        ((HashMap) this.LIZJ.i).put("gs_reason", Integer.valueOf(i2));
                                                                                        break;
                                                                                    case 104:
                                                                                        ((HashMap) this.LIZJ.i).put("gs_error", Integer.valueOf(i2));
                                                                                        break;
                                                                                    case 155:
                                                                                        C1468230oJJ c1468230oJJ2 = this.LJ;
                                                                                        if (c1468230oJJ2 != null && (c1468340oJU = c1468230oJJ2.LIZJ) != null) {
                                                                                            c1468340oJU.LJIJI = i2;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 199:
                                                                                        this.LIZJ.D1 = i2;
                                                                                        break;
                                                                                    case 224:
                                                                                        this.LLJIJIL = i2;
                                                                                        break;
                                                                                    case 239:
                                                                                        this.LIZJ.s2 = i2;
                                                                                        break;
                                                                                    case 240:
                                                                                        this.LIZJ.u2 = i2;
                                                                                        break;
                                                                                    case 243:
                                                                                        this.LIZJ.LLZILL = i2;
                                                                                        break;
                                                                                    case 246:
                                                                                        this.LIZJ.C2 = i2;
                                                                                        break;
                                                                                    case 247:
                                                                                        this.LIZJ.f195p2 = i2;
                                                                                        break;
                                                                                    case 251:
                                                                                        this.LIZJ.LLLLILI = i2;
                                                                                        break;
                                                                                    case 253:
                                                                                        C1468170oJD c1468170oJD = this.LIZJ;
                                                                                        if (i2 <= 0) {
                                                                                            z = false;
                                                                                        }
                                                                                        c1468170oJD.D2 = z;
                                                                                        break;
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case 129:
                                                                                                this.LLLFZ = i2;
                                                                                                break;
                                                                                            case 130:
                                                                                                this.LLLI = i2;
                                                                                                break;
                                                                                            case 131:
                                                                                                this.LLLII = i2;
                                                                                                break;
                                                                                            case 132:
                                                                                                this.LLLF = i2;
                                                                                                break;
                                                                                            case 133:
                                                                                                ((ConcurrentHashMap) this.LIZJ.j).put("ess", Integer.valueOf(i2));
                                                                                                this.LLJJIJI.LJJIIJ = i2;
                                                                                                break;
                                                                                            case 134:
                                                                                                ((ConcurrentHashMap) this.LIZJ.j).put("eas", Integer.valueOf(i2));
                                                                                                break;
                                                                                            default:
                                                                                                switch (i) {
                                                                                                    case 138:
                                                                                                        ((ConcurrentHashMap) this.LIZJ.j).put("ss", Integer.valueOf(i2));
                                                                                                        break;
                                                                                                    case 139:
                                                                                                        ((ConcurrentHashMap) this.LIZJ.j).put("sfr", Integer.valueOf(i2));
                                                                                                        break;
                                                                                                    case 140:
                                                                                                        ((ConcurrentHashMap) this.LIZJ.j).put("sm", Integer.valueOf(i2));
                                                                                                        break;
                                                                                                    default:
                                                                                                        switch (i) {
                                                                                                            case 142:
                                                                                                                this.LIZJ.m0 = i2;
                                                                                                                break;
                                                                                                            case 143:
                                                                                                                this.LLJILJILJ = i2;
                                                                                                                break;
                                                                                                            case 144:
                                                                                                                this.LLJILLL = i2;
                                                                                                                break;
                                                                                                            case 145:
                                                                                                                this.LLJJ = i2;
                                                                                                                break;
                                                                                                            default:
                                                                                                                switch (i) {
                                                                                                                    case 148:
                                                                                                                        ((ConcurrentHashMap) this.LIZJ.j).put("srs", Integer.valueOf(i2));
                                                                                                                        break;
                                                                                                                    case 149:
                                                                                                                        ((ConcurrentHashMap) this.LIZJ.j).put("sut", Integer.valueOf(i2));
                                                                                                                        break;
                                                                                                                    case 150:
                                                                                                                        ((ConcurrentHashMap) this.LIZJ.j).put("so", Integer.valueOf(i2));
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        switch (i) {
                                                                                                                            case 172:
                                                                                                                                C1468170oJD c1468170oJD2 = this.LIZJ;
                                                                                                                                if (i2 != 1) {
                                                                                                                                    z = false;
                                                                                                                                }
                                                                                                                                c1468170oJD2.b1 = z;
                                                                                                                                break;
                                                                                                                            case 173:
                                                                                                                                this.LIZJ.c1 = i2;
                                                                                                                                break;
                                                                                                                            case 174:
                                                                                                                                this.LIZJ.d1 = i2;
                                                                                                                                break;
                                                                                                                            case 175:
                                                                                                                                this.LIZJ.e1 = i2;
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                switch (i) {
                                                                                                                                    case 177:
                                                                                                                                        if (i2 <= 0) {
                                                                                                                                            z = false;
                                                                                                                                        }
                                                                                                                                        this.LJLJJL = z;
                                                                                                                                        break;
                                                                                                                                    case 178:
                                                                                                                                        this.LIZJ.f1 = i2;
                                                                                                                                        break;
                                                                                                                                    case 179:
                                                                                                                                        this.LIZJ.h1 = i2;
                                                                                                                                        break;
                                                                                                                                    case 180:
                                                                                                                                        this.LIZJ.g1 = i2;
                                                                                                                                        break;
                                                                                                                                    case 181:
                                                                                                                                        this.LIZJ.LLLIL = i2;
                                                                                                                                        break;
                                                                                                                                    case 182:
                                                                                                                                        this.LIZJ.LLLILZJ = i2;
                                                                                                                                        break;
                                                                                                                                    case 183:
                                                                                                                                        this.LIZJ.LLLILZ = i2;
                                                                                                                                        break;
                                                                                                                                    case 184:
                                                                                                                                        this.LIZJ.j1 = i2;
                                                                                                                                        break;
                                                                                                                                    case 185:
                                                                                                                                        this.LLJJIJI.LJJIIJZLJL = i2;
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        switch (i) {
                                                                                                                                            case 212:
                                                                                                                                                this.LLILLL = i2;
                                                                                                                                                break;
                                                                                                                                            case 213:
                                                                                                                                                this.LLILLJJLI = i2;
                                                                                                                                                break;
                                                                                                                                            case 214:
                                                                                                                                                this.LLILZ = i2;
                                                                                                                                                break;
                                                                                                                                            case 215:
                                                                                                                                                this.LLILZIL = i2;
                                                                                                                                                break;
                                                                                                                                            case 216:
                                                                                                                                                this.LLILZLL = i2;
                                                                                                                                                break;
                                                                                                                                            case 217:
                                                                                                                                                if (i2 != this.LLILLJJLI) {
                                                                                                                                                    this.LLIZ = i2;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 218:
                                                                                                                                                this.LLIZLLLIL = i2;
                                                                                                                                                break;
                                                                                                                                            case 219:
                                                                                                                                                this.LLJ = i2;
                                                                                                                                                break;
                                                                                                                                            case 220:
                                                                                                                                                this.LLJI = i2;
                                                                                                                                                break;
                                                                                                                                            case 221:
                                                                                                                                                C1468170oJD c1468170oJD3 = this.LIZJ;
                                                                                                                                                if (c1468170oJD3 != null) {
                                                                                                                                                    c1468170oJD3.P1 = i2;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                switch (i) {
                                                                                                                                                    case 79:
                                                                                                                                                        this.LJLIIL = i2;
                                                                                                                                                        break;
                                                                                                                                                    case 80:
                                                                                                                                                        this.LJLIL = i2;
                                                                                                                                                        break;
                                                                                                                                                    case 81:
                                                                                                                                                        this.LJLILLLLZI = i2;
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        switch (i) {
                                                                                                                                                            case 89:
                                                                                                                                                                this.LIZJ.K = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 90:
                                                                                                                                                                if (i2 > 0) {
                                                                                                                                                                    C1468350oJV c1468350oJV = this.LLJJIJI;
                                                                                                                                                                    c1468350oJV.LJIJI = i2 | c1468350oJV.LJIJI;
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                            case 91:
                                                                                                                                                                this.LLJJIJI.LJIJJ = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 92:
                                                                                                                                                                if (i2 > 0) {
                                                                                                                                                                    this.LLJJIJI.LJIJJLI = i2;
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                            case 93:
                                                                                                                                                                this.LLJJIJI.LJIL = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 94:
                                                                                                                                                                this.LLJJIJI.LJJ = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 95:
                                                                                                                                                                this.LLII = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 96:
                                                                                                                                                                this.LLJJIJI.LJJIFFI = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 97:
                                                                                                                                                                this.LLJJIJI.LJJII = i2;
                                                                                                                                                                break;
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.LIZJ.a2 = i2;
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            this.LIZJ.Z1 = i2;
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        this.LIZJ.y1 = i2;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    this.LIZJ.x1 = i2;
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        return;
                                    }
                                    this.LLJJIJI.LJJIII = i2;
                                    return;
                                }
                                C1468180oJE c1468180oJE = this.LJII;
                                if (i2 != 1) {
                                    z = false;
                                }
                                c1468180oJE.LJJLI = z;
                                return;
                            }
                            C1468180oJE c1468180oJE2 = this.LJII;
                            if (i2 != 1) {
                                z = false;
                            }
                            c1468180oJE2.LJJL = z;
                            return;
                        }
                        this.LIZJ.d0 = i2;
                        return;
                    }
                    this.LJJLIIIJLLLLLLLZ = i2;
                    return;
                }
                this.LJJLIIIJLJLI = i2;
                return;
            }
            this.LLJJIJI.LJJI = i2;
            return;
        }
        this.LLJJIJI.LIZLLL = i2;
    }

    @Override // X.InterfaceC1467240oHi
    public final void LIZLLL(String str, String str2) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD.Q1 == null) {
            c1468170oJD.Q1 = new HashMap();
        }
        this.LIZJ.Q1.put(str, str2);
    }

    @Override // X.InterfaceC1467240oHi
    public final void LJIIJ(Object obj, String str) {
        Map map;
        if (!C1474810oTv.LJIILL() && (map = this.LIZJ.d) != null) {
            ((ConcurrentHashMap) map).put(str, obj);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mFeaturesCore, key:");
            sbLIZ.append(str);
            sbLIZ.append(", value:");
            sbLIZ.append(obj);
            TTVideoEngineLog.d("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJJ(int i, boolean z) {
        if (this.LIZJ == null) {
            return;
        }
        if (z) {
            this.LJJLIIIJJI = i;
            if (i != -1002 && i != -1003 && i != -1004 && i != -1005) {
                if (i != -2003 && i != -2002) {
                    this.LJJJLZIJ = -2147483648L;
                    return;
                } else {
                    this.LJJJLZIJ = SystemClock.elapsedRealtime();
                    return;
                }
            }
            if (this.LJJJLZIJ > 0) {
                return;
            }
            this.LJJJLZIJ = SystemClock.elapsedRealtime();
            return;
        }
        this.LJJLIIIJJI = -2001;
        this.LJJJLZIJ = -2147483648L;
    }

    public final void LJJIII(Object obj, String str) {
        if (!TextUtils.isEmpty(str) && obj != null && !C1474810oTv.LJJIIZ()) {
            ((HashMap) this.LLIFFJFJJ).put(str, obj);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addFeature, key:");
            sbLIZ.append(str);
            sbLIZ.append(", value:");
            sbLIZ.append(obj);
            TTVideoEngineLog.d("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJJIIZ(String str, String str2) {
        this.LJII.LIZJ(str, str2);
    }

    public final void LJJIIZI(int i, long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD == null) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                c1468170oJD.LJLJJLL = j;
                return;
            }
            return;
        }
        c1468170oJD.LJLJJI = j;
    }

    public final void LJJIJ(int i, long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD == null) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                c1468170oJD.LJLJL = j;
                return;
            }
            return;
        }
        c1468170oJD.LJLJJL = j;
    }

    public final void LJJJJJ(int i, e eVar) {
        HashMap mapLJI = eVar.LJI();
        mapLJI.put("apiver", Integer.valueOf(i));
        this.LJIILL.add(mapLJI);
    }

    public final void LJJLIIIJJI(EnumC1471520oOc enumC1471520oOc, Object obj) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("brian setCustomInfo key:");
        sbLIZ.append(enumC1471520oOc);
        sbLIZ.append(", value:");
        sbLIZ.append(obj);
        TTVideoEngineLog.d("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZJ != null) {
            try {
                switch (C1471510oOb.LIZ[enumC1471520oOc.ordinal()]) {
                    case 1:
                        this.LLJLLL = ((Long) obj).longValue();
                        break;
                    case 2:
                        this.LLJZ = ((Long) obj).longValue();
                        break;
                    case 3:
                        break;
                    case 4:
                        this.LLJZIJLIL = ((Long) obj).longValue();
                        break;
                    case 5:
                        this.LLL = ((Long) obj).longValue();
                        break;
                    case 6:
                        if (obj instanceof HashMap) {
                            this.LLLIILIL = (HashMap) obj;
                        }
                        break;
                    case 7:
                        this.LLLIL = ((Integer) obj).intValue();
                        break;
                    case 8:
                        this.LLLILZ = (String) obj;
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        this.LIZJ.W0 = (String) obj;
                        break;
                    default:
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("setCustomInfo invalid key:");
                        sbLIZ2.append(enumC1471520oOc);
                        sbLIZ2.append(", value:");
                        sbLIZ2.append(obj);
                        C1471660oOq.LIZIZ("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ2));
                        break;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("setCustomInfo fail:");
                sbLIZ3.append(e.toString());
                C1471660oOq.LIZIZ("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
    }

    public final void LJJLIIIJL(int i, long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null && c1468170oJD.LJJLIIIJL <= 0) {
            c1468170oJD.LJJLIIIJL = j;
            c1468170oJD.LLLII = i;
        }
    }

    public final void LJJLIIIJLJLI(int i, long j) {
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.LLJJ = j;
            c1468170oJD.LLLII = i;
            if (this.LJIIL && i == 0) {
                LJJ(-1004, true);
            }
        }
    }

    public final void LJJZZI(String str, String str2) {
        C1468170oJD c1468170oJD = this.LIZJ;
        c1468170oJD.m2 = str;
        c1468170oJD.f192n2 = str2;
    }

    public final void LJLIIIL(float f, int i) {
        if (i != 20) {
            if (i != 238) {
                if (i != 232) {
                    if (i != 233) {
                        if (i != 241) {
                            if (i == 242) {
                                this.LIZJ.v2 = f;
                                return;
                            }
                            return;
                        }
                        this.LIZJ.t2 = f;
                        return;
                    }
                    this.LIZJ.b2 = f;
                    return;
                }
                this.LIZJ.c2 = f;
                return;
            }
            this.LIZJ.d2 = f;
            return;
        }
        this.LJLJL = f;
        C1468270oJN c1468270oJN = this.LJIIJJI;
        if (c1468270oJN == null) {
            return;
        }
        c1468270oJN.LIZ = f;
    }

    public final void LJLJJL(String str, String str2) {
        this.LJIJJLI = str;
        C1468180oJE c1468180oJE = this.LJII;
        if (c1468180oJE != null) {
            c1468180oJE.LJIILLIIL = str;
        }
        this.LJIL = str2;
    }

    public final void LJLL(String str, String str2) {
        C1468170oJD c1468170oJD = this.LIZJ;
        c1468170oJD.k2 = str;
        c1468170oJD.l2 = str2;
    }

    public final void LJZ(int i, String str) {
        C1468180oJE c1468180oJE = this.LJII;
        switch (i) {
            case 0:
                c1468180oJE.LJJII = "local_url";
                break;
            case 1:
                c1468180oJE.LJJII = "dir_url";
                break;
            case 2:
                c1468180oJE.LJJII = "playitem";
                break;
            case 3:
                c1468180oJE.LJJII = "preload";
                break;
            case 4:
                c1468180oJE.LJJII = "feed";
                break;
            case 5:
                c1468180oJE.LJJII = "vid";
                break;
            case 6:
                c1468180oJE.LJJII = "fd";
                break;
            case 7:
                c1468180oJE.LJJII = "mds";
                break;
        }
        c1468180oJE.LJJI = str;
        if (i != 6 && i != 0) {
            if (i != 1 && i != 4 && i != 2 && i != 3 && i != 7) {
                if (i == 5) {
                    this.LJJLIIIJJI = -1002;
                    return;
                }
                return;
            }
            this.LJJLIIIJJI = -1004;
            return;
        }
        this.LJJLIIIJJI = -1005;
    }

    public final void LLIIII(int i, int i2) {
        if (i <= -1) {
            this.LLIIZ = LJJIJIIJI(2, i);
        }
        C1469110oKj c1469110oKj = this.LLILII;
        if (c1469110oKj != null) {
            this.LLIL = c1469110oKj.LIZ(i2);
        }
    }

    public final void LLIIIJ(int i, int i2) {
        if (i <= -1) {
            this.LLIIZ = LJJIJIIJI(4, i);
        } else {
            this.LLILIL++;
        }
        C1469110oKj c1469110oKj = this.LLILII;
        if (c1469110oKj != null) {
            this.LLIL = c1469110oKj.LIZ(i2);
        }
    }

    public final void LLIILZL(int i, int i2) {
        this.LJIILIIL = i;
        this.LJJJJ = i2;
    }

    @Override // X.InterfaceC1467240oHi
    public final void LJIIZILJ(int i, e eVar, String str) {
        HashMap map = new HashMap();
        if (eVar != null) {
            map = eVar.LJI();
        }
        map.put("result", Integer.valueOf(i));
        if (str != null) {
            map.put("filehash", str);
        }
        C790040Uyw.LIZIZ(2, C786410Ut5.J3(new JSONObject(map)), this.LJIILLIIL);
        if (i != 0) {
            this.LIZJ.m0 = 3;
        }
    }

    public final void LLIIIZ(String str, String str2, boolean z) {
        long jLIZJ;
        C1468230oJJ c1468230oJJ;
        if (z) {
            if (this.LJJLIIIIJ == 4 && (c1468230oJJ = this.LJ) != null) {
                c1468230oJJ.LIZ(0, "switch");
            }
            if (this.LJJLIIIIJ == 3) {
                this.LIZLLL.LIZIZ("switch");
                this.LIZJ.LLJJLIIIJLLLLLLLZ = System.currentTimeMillis();
            }
        }
        if (this.LLJLIL) {
            InterfaceC1468020oIy interfaceC1468020oIy = this.LIZIZ;
            if (interfaceC1468020oIy != null) {
                jLIZJ = ((C1467030oHN) interfaceC1468020oIy).LIZJ(67);
            } else {
                jLIZJ = -1;
            }
            C1467110oHV c1467110oHV = this.LJFF;
            if (c1467110oHV != null) {
                c1467110oHV.LIZ((int) jLIZJ, "switch");
            }
            this.LLJLIL = false;
        }
        this.LIZJ.LJJIIZI = System.currentTimeMillis();
        if (!str.equals(str2)) {
            this.LJJJJZI++;
        }
        this.LJII.LIZJ(str, str2);
        C1468170oJD c1468170oJD = this.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.LLJL = System.currentTimeMillis();
        }
        if (z) {
            LJJ(-2005, true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLIIL(android.content.Context r12, X.C1468170oJD r13, X.C1468180oJE r14, X.InterfaceC1467850oIh r15) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1468160oJC.LLIIL(android.content.Context, X.0oJD, X.0oJE, X.0oIh):void");
    }
}
