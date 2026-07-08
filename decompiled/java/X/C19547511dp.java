package X;

import Y.ACallableS432S0100000_29;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11dp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19547511dp {
    public C2472609mW LIZIZ;
    public C19547811ds LIZJ;
    public long LIZLLL;
    public boolean LJI;
    public final LinkedBlockingQueue<C19547611dq> LIZ = new LinkedBlockingQueue<>();
    public final CopyOnWriteArrayList<String> LJ = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<String, String> LJFF = new ConcurrentHashMap<>();
    public final C19548011du LJII = new InterfaceC19548611e0() { // from class: X.11du
        @Override // X.InterfaceC19548611e0
        public final void LIZ(EnumC19548111dv enumC19548111dv) {
            int i = C19548211dw.LIZ[enumC19548111dv.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C19547511dp c19547511dp = this.LIZ;
                    c19547511dp.getClass();
                    C201955140j.LIZIZ("VoiceConversionStream", "manager realDestroy");
                    c19547511dp.LJI = false;
                    c19547511dp.LIZ.clear();
                    C2472609mW c2472609mW = c19547511dp.LIZIZ;
                    if (c2472609mW != null) {
                        c2472609mW.cancel();
                    }
                    C19547811ds c19547811ds = c19547511dp.LIZJ;
                    if (c19547811ds != null) {
                        c19547811ds.LIZIZ = null;
                    }
                    c19547511dp.LIZJ = null;
                    c19547511dp.LIZLLL = 0L;
                    c19547511dp.LJFF.clear();
                    c19547511dp.LJ.clear();
                    return;
                }
                return;
            }
            this.LIZ.LIZLLL = 0L;
        }
    };

    public final void LIZIZ() throws JSONException {
        C2472609mW c2472609mW;
        if (this.LIZJ == null) {
            this.LIZIZ = new C2472609mW();
            C19547811ds c19547811ds = new C19547811ds();
            c19547811ds.LIZJ = this.LJII;
            C19547811ds c19547811ds2 = this.LIZJ;
            if (c19547811ds2 != null) {
                c19547811ds2.LIZIZ = new InterfaceC19548711e1() { // from class: X.11dx
                    @Override // X.InterfaceC19548711e1
                    public final void LIZ(int i, int i2, long j, long j2, String str, String str2, String str3, String str4, String str5) {
                        this.LIZ.LIZLLL = j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("status: ");
                        sbLIZ.append(i);
                        sbLIZ.append(", statusCode :");
                        sbLIZ.append(i2);
                        sbLIZ.append(",filePath:");
                        sbLIZ.append(str4);
                        C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
            }
            this.LIZJ = c19547811ds;
            if (!this.LJI && (c2472609mW = this.LIZIZ) != null) {
                C2472709mX c2472709mXLIZ = c2472609mW.LIZ();
                this.LJI = true;
                C15O7.LIZIZ(new ACallableS432S0100000_29(this, 13), C15O7.LJI, c2472709mXLIZ);
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("passport-auth", "session");
        C0CHQ.LIZ().getAccountService().getSDKVersion();
        jSONObject.put("sdk-version", "2");
        jSONObject.put("x-tt-token", C0CHQ.LIZ().getAccountService().getUserTTToken());
        String strJ3 = C786410Ut5.J3(jSONObject);
        LinkedBlockingQueue<C19547611dq> linkedBlockingQueue = this.LIZ;
        C19547611dq c19547611dq = new C19547611dq();
        c19547611dq.LIZ = 0;
        c19547611dq.LIZLLL = strJ3;
        c19547611dq.LIZIZ = "wss://sami.tiktokv.com/internal/api/v1/ws";
        c19547611dq.LIZJ = "vtSCUDJCnW";
        linkedBlockingQueue.add(c19547611dq);
    }

    public final void LIZLLL() {
        C19547611dq c19547611dq;
        C19547811ds c19547811ds = this.LIZJ;
        if (c19547811ds != null && (c19547611dq = c19547811ds.LIZLLL) != null) {
            c19547611dq.LJ = 0;
            c19547611dq.LJFF = 0;
            c19547611dq.LJI = 0;
            c19547611dq.LJII = 0;
            c19547611dq.LJIILIIL = 0;
            c19547611dq.LJIIIIZZ.clear();
            c19547611dq.LJIIIZ.clear();
            c19547611dq.LJIIJ.clear();
            c19547611dq.LJIIJJI.clear();
            c19547611dq.LJIJJ.clear();
            c19547611dq.LJIJJLI.clear();
            c19547611dq.LJIILL = EnumC1153690g7z.IDE;
            c19547611dq.LJIIL = "";
            c19547611dq.LJIILLIIL = "";
            c19547611dq.LJIILJJIL = false;
            c19547611dq.LJIJI = -1L;
            c19547611dq.LJIIZILJ = "";
            c19547611dq.LJIJ = "";
        }
        this.LIZLLL = 0L;
    }

    public final boolean LIZJ(String str) {
        if (str != null && str.length() != 0) {
            return this.LJ.contains(str);
        }
        String str2 = (String) C13LP.LJJJLL(this.LJ);
        if (str2 == null || str2.length() <= 0) {
            return false;
        }
        return true;
    }

    public final void LIZ(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeProcessing ");
        sbLIZ.append(z);
        sbLIZ.append(" filePath:");
        sbLIZ.append(str);
        C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
        String str2 = this.LJFF.get(str);
        if (z) {
            if (str2 != null && !this.LJ.contains(str2)) {
                this.LJ.add(str2);
                return;
            }
            return;
        }
        if (str2 == null || !this.LJ.contains(str2)) {
            return;
        }
        this.LJ.remove(str2);
    }

    public final void LJ(String str, int i, List<String> list, List<String> list2, List<Long> list3, List<Long> list4, List<Long> list5, List<Long> list6, String str2) {
        this.LJFF.put(str2, str);
        LIZ(str2, true);
        LinkedBlockingQueue<C19547611dq> linkedBlockingQueue = this.LIZ;
        C19547611dq c19547611dq = new C19547611dq();
        c19547611dq.LIZ = 1;
        c19547611dq.LJIILLIIL = str;
        c19547611dq.LJIILIIL = i;
        c19547611dq.LJIIIIZZ = new ArrayList(list);
        c19547611dq.LJIIIZ = new ArrayList(list2);
        c19547611dq.LJIIJ = new ArrayList(list3);
        c19547611dq.LJIIJJI = new ArrayList(list4);
        c19547611dq.LJIJJ = new ArrayList(list5);
        c19547611dq.LJIJJLI = new ArrayList(list6);
        c19547611dq.LJIIL = str2;
        linkedBlockingQueue.add(c19547611dq);
    }
}
