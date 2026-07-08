package X;

import Y.AfS2S0000100_12;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C744830TJp {
    public static final /* synthetic */ int LJ = 0;
    public final ConcurrentHashMap<Long, InterfaceC420801kM> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, Long> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, EnumC950510aqH> LIZJ = new ConcurrentHashMap<>();
    public DataChannel LIZLLL;

    public final void LIZIZ() {
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clear, disposableMap size = ");
                sbLIZ.append(this.LIZ.size());
                sbLIZ.append('}');
                C20441214yg.LJIIIZ("MultiCoHostTimeOut", C2188811AlT.LIZIZ(sbLIZ));
                Iterator<Map.Entry<Long, InterfaceC420801kM>> it2 = this.LIZ.entrySet().iterator();
                while (it2.hasNext()) {
                    LJ(it2.next().getKey().longValue());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("clear, e = ");
                sbLIZ2.append(e);
                C20441214yg.LJ("MultiCoHostTimeOut", C2188811AlT.LIZIZ(sbLIZ2));
            }
            this.LIZ.clear();
            this.LIZIZ.clear();
            this.LIZJ.clear();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.clear();
            this.LIZIZ.clear();
            this.LIZJ.clear();
            throw th;
        }
    }

    public final long LIZLLL(long j) {
        Long l = this.LIZIZ.get(Long.valueOf(j));
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final void LJ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeCountDown, uid = ");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("MultiCoHostTimeOut", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC420801kM interfaceC420801kM = this.LIZ.get(Long.valueOf(j));
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LIZ.remove(Long.valueOf(j));
        this.LIZIZ.remove(Long.valueOf(j));
        this.LIZJ.remove(Long.valueOf(j));
    }

    public final void LIZJ(long j, long j2, EnumC950510aqH enumC950510aqH) {
        if (j <= 0) {
            return;
        }
        this.LIZIZ.put(Long.valueOf(j), Long.valueOf(j2));
        this.LIZJ.put(Long.valueOf(j), enumC950510aqH);
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.LC0(MultiCoHostCountDownEvent.class, new C915460Zvk(j, j2, enumC950510aqH));
        }
    }

    public final void LIZ(final long j, final long j2, final EnumC950510aqH enumC950510aqH, final Function0 function0) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addCountDown, source = ");
        sbLIZ.append(enumC950510aqH);
        sbLIZ.append(", uid = ");
        sbLIZ.append(j);
        sbLIZ.append(", countdownSecond = ");
        sbLIZ.append(j2);
        C20441214yg.LJIIIZ("MultiCoHostTimeOut", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC420801kM interfaceC420801kM = this.LIZ.get(Long.valueOf(j));
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LIZ.put(Long.valueOf(j), new C11IW(C11NZ.LJJJJLL(1L, j2, 0L, 1L, TimeUnit.SECONDS).LJL(C1701940uOG.LIZIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new C09JN() { // from class: X.0T7B
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiCoHostTimeOutManager@6eb6.startCountDown$1");
                long jLongValue = j2 - ((Long) obj).longValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("startCountDown, uid = ");
                sbLIZ2.append(j);
                sbLIZ2.append(", value = ");
                sbLIZ2.append(jLongValue);
                C20441214yg.LJIIIZ("MultiCoHostTimeOut", C2188811AlT.LIZIZ(sbLIZ2));
                this.LIZJ(j, jLongValue, enumC950510aqH);
                C1C7U.LIZIZ("MultiCoHostTimeOutManager@6eb6.startCountDown$1");
            }
        }).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.0T7C
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("startCountDown, uid = ");
                sbLIZ2.append(j);
                sbLIZ2.append(", finish");
                C20441214yg.LJIIIZ("MultiCoHostTimeOut", C2188811AlT.LIZIZ(sbLIZ2));
                this.LIZJ(j, 0L, enumC950510aqH);
                function0.invoke();
            }
        }).LJJIJIIJI(new AfS2S0000100_12(j, 6))).LJIILL().LJIIZILJ());
    }
}
