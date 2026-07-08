package X;

import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.monitor.collector.c;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.reflect.Field;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V3R, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V3R extends c {
    public final C791450V2x LJ;
    public int LJFF;
    public volatile int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public C0V3S LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public int LJIIL;
    public long LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public C0V3U LJIILLIIL;
    public volatile boolean LJIIZILJ;
    public boolean LJIJ;
    public final C0V3G LJIJI;
    public volatile boolean LJIJJ;
    public final C0CAI LJIJJLI;

    public static final JSONArray LJFF() {
        return null;
    }

    @Override // com.bytedance.monitor.collector.c
    public final void LJ(int i) {
    }

    @Override // com.bytedance.monitor.collector.c
    public final Pair<String, ?> LIZ() {
        return new Pair<>(this.LIZ, LJI());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0V3U] */
    @Override // com.bytedance.monitor.collector.c
    public final void LIZJ() {
        super.LIZJ();
        if (this.LJIIZILJ) {
            return;
        }
        this.LJIIZILJ = true;
        int i = this.LIZJ;
        if (i == 0 || i == 1) {
            this.LJII = 100;
            this.LJIIIIZZ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        } else if (i == 2 || i == 3) {
            this.LJII = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            this.LJIIIIZZ = 200;
        }
        this.LJIIIZ = new C0V3S(this.LJII);
        this.LJIILLIIL = new AbstractC791470V2z() { // from class: X.0V3U
            @Override // X.AbstractC791470V2z
            public final void LIZ() {
                this.LIZ = false;
                C0V3R c0v3r = this.LIZLLL;
                c0v3r.LJFF++;
                c0v3r.LJII(AbstractC791470V2z.LIZIZ, false);
                C0V3R c0v3r2 = this.LIZLLL;
                c0v3r2.LJIILJJIL = c0v3r2.LJIILL;
                c0v3r2.LJIILL = "no message running";
                c0v3r2.LJIJJ = false;
            }

            @Override // X.AbstractC791470V2z
            public final boolean LIZJ() {
                return C791580V3k.LIZ(128);
            }

            @Override // X.AbstractC791470V2z
            public final void LIZIZ(String str) {
                this.LIZLLL.LJIJJ = true;
                this.LIZLLL.LJIILL = str;
                this.LIZ = true;
                this.LIZLLL.LJII(AbstractC791470V2z.LIZIZ, true);
            }
        };
        if (C791580V3k.LIZ(128)) {
            C0V30.LJFF(this.LJIILLIIL);
        }
        C20681088h.LIZIZ(C20681088h.LIZ());
    }

    public final JSONObject LJI() {
        Message messageLIZIZ;
        long jUptimeMillis = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            int i = 0;
            for (C0V35 c0v35 : (ArrayList) this.LJIIIZ.LIZ()) {
                if (c0v35 != null) {
                    i++;
                    jSONArray.put(c0v35.LIZIZ().put(FollowStatusChangeMethod.PARAM_UID, i));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("message", this.LJIILL);
            jSONObject2.put("currentMessageCost", jUptimeMillis - this.LJIIJJI);
            int i2 = this.LJIIL;
            long j = -1;
            try {
                if (C791560V3i.LJIIJJI) {
                    long jDoGetCpuTime = MonitorJni.doGetCpuTime(i2);
                    if (C0V3V.LIZIZ == -1) {
                        long jSysconf = C0V3V.LIZ;
                        if (jSysconf <= 0) {
                            jSysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
                            if (jSysconf <= 0) {
                                jSysconf = 100;
                            }
                            C0V3V.LIZ = jSysconf;
                        }
                        C0V3V.LIZIZ = 1000 / jSysconf;
                    }
                    j = C0V3V.LIZIZ * jDoGetCpuTime;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            jSONObject2.put("currentMessageCpu", j - this.LJIILIIL);
            jSONObject2.put("messageCount", this.LJFF);
            jSONObject2.put("start", this.LJIIJJI);
            jSONObject2.put("end", jUptimeMillis);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        MessageQueue messageQueueLIZ = C20681088h.LIZ();
        JSONArray jSONArray2 = new JSONArray();
        if (messageQueueLIZ != null) {
            try {
                synchronized (messageQueueLIZ) {
                    try {
                        messageLIZIZ = C20681088h.LIZIZ(messageQueueLIZ);
                    } catch (JSONException e) {
                    } finally {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (messageLIZIZ != null) {
                        int i3 = 0;
                        int i4 = 0;
                        while (messageLIZIZ != null && i4 < 100) {
                            i4++;
                            i3++;
                            JSONObject jSONObjectLJIIIZ = LJIIIZ(messageLIZIZ, jUptimeMillis);
                            jSONObjectLJIIIZ.put(FollowStatusChangeMethod.PARAM_UID, i3);
                            jSONArray2.put(jSONObjectLJIIIZ);
                            messageLIZIZ = C20681088h.LIZJ(messageLIZIZ);
                        }
                    }
                }
            } catch (Throwable e2) {
            }
        }
        try {
            jSONObject.put("history_message", jSONArray);
            jSONObject.put("current_message", jSONObject2);
            jSONObject.put("pending_messages", jSONArray2);
            jSONObject.put("check_time_info", LJFF());
            return jSONObject;
        } catch (JSONException e22) {
            return jSONObject;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0CAI] */
    public C0V3R(int i) {
        super(i, "block_looper_info");
        this.LJII = 100;
        this.LJIIIIZZ = 200;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = -1;
        this.LJIILIIL = -1L;
        this.LJIJJLI = new Runnable() { // from class: X.0CAI
            public long LL;
            public long LLILLJJLI;
            public int LLILLL = -1;
            public int LLILZ;
            public int LLILZIL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LooperDispatchMonitor@3401.<field>$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LooperDispatchMonitor@3401.<field>$1");
            }

            public final void LIZ() {
                SystemClock.uptimeMillis();
                this.LLILZLL.getClass();
                throw null;
            }
        };
        C088K c088k = C088K.LLILLJJLI;
        try {
            Handler handler = (Handler) C083F.LIZLLL();
            Field fieldLIZ = C1961107mD.LIZ(Handler.class, "mCallback");
            c088k.LL = (Handler.Callback) fieldLIZ.get(handler);
            fieldLIZ.set(handler, c088k);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LJ = new C791450V2x(this);
        this.LJIJI = null;
    }

    public static JSONObject LJIIIZ(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("when", message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            if (HandlerHook.getMessageObj(message.obj) != null) {
                jSONObject.put("obj", HandlerHook.getMessageObj(message.obj));
            }
            jSONObject.put("start", message.getWhen());
            jSONObject.put("end", -1);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    @Override // com.bytedance.monitor.collector.c
    public final Pair<String, ?> LIZIZ(long j, long j2) {
        try {
            return new Pair<>(this.LIZ, LJI());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LJII(long j, boolean z) {
        int i = this.LJI + 1;
        this.LJI = i;
        this.LJI = i & 65535;
        this.LJIJ = false;
        if (this.LJIIJ < 0) {
            this.LJIIJ = j;
        }
        if (this.LJIIJJI < 0) {
            this.LJIIJJI = j;
        }
        if (this.LJIIL < 0) {
            this.LJIIL = Process.myTid();
            this.LJIILIIL = SystemClock.currentThreadTimeMillis();
        }
        C088J c088j = C088K.LLILLL;
        C088K.LLILLL = null;
        long j2 = j - this.LJIIJ;
        long j3 = this.LJIIIIZZ;
        if (j2 > j3 || c088j != null) {
            long j4 = this.LJIIJJI;
            if (j - j4 <= j3 && c088j == null) {
                LJIIIIZZ(9, j, this.LJIILL, true, null);
            } else if (z) {
                if (this.LJFF == 0) {
                    LJIIIIZZ(1, j, "no message running", true, null);
                } else {
                    LJIIIIZZ(9, j4, this.LJIILJJIL, true, null);
                    LJIIIIZZ(1, j, "no message running", false, null);
                }
            } else if (this.LJFF == 0) {
                LJIIIIZZ(8, j, this.LJIILL, true, c088j);
            } else {
                LJIIIIZZ(9, j4, this.LJIILJJIL, false, null);
                LJIIIIZZ(8, j, this.LJIILL, true, c088j);
            }
        }
        this.LJIIJJI = j;
    }

    public final void LJIIIIZZ(int i, long j, String str, boolean z, C088J c088j) {
        this.LJIJ = true;
        C0V3S c0v3s = this.LJIIIZ;
        C0V35 c0v35 = c0v3s.LIZJ;
        if (c0v35 != null) {
            c0v35.LIZLLL = i;
            c0v3s.LIZJ = null;
        } else {
            c0v35 = new C0V35();
            c0v35.LIZLLL = i;
        }
        c0v35.LJFF = j - this.LJIIJ;
        if (z) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            c0v35.LJI = jCurrentThreadTimeMillis - this.LJIILIIL;
            this.LJIILIIL = jCurrentThreadTimeMillis;
        } else {
            c0v35.LJI = -1L;
        }
        c0v35.LJ = this.LJFF;
        c0v35.LJIIIIZZ = str;
        c0v35.LIZ = this.LJIIJ;
        c0v35.LIZIZ = j;
        c0v35.LIZJ = this.LJIIJJI;
        if (c088j != null) {
            c0v35.LJII = c088j;
        }
        C0V3S c0v3s2 = this.LJIIIZ;
        int size = ((ArrayList) c0v3s2.LIZLLL).size();
        int i2 = c0v3s2.LIZ;
        if (size < i2) {
            ((ArrayList) c0v3s2.LIZLLL).add(c0v35);
            c0v3s2.LIZIZ = ((ArrayList) c0v3s2.LIZLLL).size();
        } else {
            int i3 = c0v3s2.LIZIZ % i2;
            c0v3s2.LIZIZ = i3;
            C0V35 c0v352 = (C0V35) ListProtector.set(c0v3s2.LIZLLL, i3, c0v35);
            c0v352.LIZLLL = -1;
            c0v352.LJ = -1;
            c0v352.LJFF = -1L;
            c0v352.LJIIIIZZ = null;
            c0v352.LJIIIZ = null;
            c0v352.LJIIJ = null;
            c0v352.LJIIJJI = null;
            c0v352.LJIIL = null;
            c0v352.LJIILIIL = null;
            c0v352.LJII = null;
            c0v3s2.LIZJ = c0v352;
            c0v3s2.LIZIZ++;
        }
        this.LJFF = 0;
        this.LJIIJ = j;
    }
}
