package X;

import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.event.QuickCoHostCountDownEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0b4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959540b4q implements InterfaceC960030b5d {
    public static final C959540b4q LIZ = new C959540b4q();
    public static final ConcurrentHashMap<Long, InterfaceC420801kM> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, Long> LIZJ = new ConcurrentHashMap<>();
    public static DataChannel LIZLLL;

    public static final void LIZIZ() {
        Iterator<Map.Entry<Long, InterfaceC420801kM>> it2 = LIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            C500260Jjc.LJJLIIIJLJLI(it2.next().getValue());
        }
        LIZIZ.clear();
        LIZJ.clear();
    }

    public final void LIZJ() {
        LIZIZ();
        LIZLLL = null;
    }

    public static final long LJ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCountDownValue uid = ");
        sbLIZ.append(j);
        sbLIZ.append(" value = ");
        ConcurrentHashMap<Long, Long> concurrentHashMap = LIZJ;
        sbLIZ.append(concurrentHashMap.get(Long.valueOf(j)));
        C20441214yg.LJIIIZ("QuickCoHostCountDownManager", C2188811AlT.LIZIZ(sbLIZ));
        Long l = concurrentHashMap.get(Long.valueOf(j));
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final void LIZLLL(long j, long j2, EnumC959860b5M enumC959860b5M) {
        if (j <= 0) {
            return;
        }
        LIZJ.put(Long.valueOf(j), Long.valueOf(j2));
        DataChannel dataChannel = LIZLLL;
        if (dataChannel != null) {
            dataChannel.LC0(QuickCoHostCountDownEvent.class, new C959910b5R(j, j2, enumC959860b5M));
        }
    }

    @Override // X.InterfaceC960030b5d
    public final void LIZ(final long j, final long j2, final EnumC959860b5M enumC959860b5M, final Function0<Unit> function0) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addCountDown, uid = ");
        sbLIZ.append(j);
        sbLIZ.append(", countdownSecond = ");
        sbLIZ.append(j2);
        sbLIZ.append(", source = ");
        sbLIZ.append(enumC959860b5M);
        C20441214yg.LJIIIZ("QuickCoHostCountDownManager", C2188811AlT.LIZIZ(sbLIZ));
        ConcurrentHashMap<Long, InterfaceC420801kM> concurrentHashMap = LIZIZ;
        InterfaceC420801kM interfaceC420801kM = concurrentHashMap.get(Long.valueOf(j));
        if (interfaceC420801kM != null) {
            C500260Jjc.LJJLIIIJLJLI(interfaceC420801kM);
        }
        concurrentHashMap.put(Long.valueOf(j), new C11IW(C11NZ.LJJJJLL(0L, j2 + 1, 0L, 1L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new C09JN() { // from class: X.00y9
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("QuickCoHostCountDownManager@d846.startCountDown$1");
                Long l = (Long) obj;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("startCountDown, uid=");
                sbLIZ2.append(j);
                sbLIZ2.append(", value=");
                sbLIZ2.append(j2 - l.longValue());
                C20441214yg.LJIIIZ("QuickCoHostCountDownManager", C2188811AlT.LIZIZ(sbLIZ2));
                C959540b4q.LIZLLL(j, j2 - l.longValue(), enumC959860b5M);
                C1C7U.LIZIZ("QuickCoHostCountDownManager@d846.startCountDown$1");
            }
        }).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.0b5G
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("completeCountDown, uid=");
                sbLIZ2.append(j);
                sbLIZ2.append(", finish");
                C20441214yg.LJIIIZ("QuickCoHostCountDownManager", C2188811AlT.LIZIZ(sbLIZ2));
                C959540b4q.LIZLLL(j, 0L, enumC959860b5M);
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        }).LJJIJIIJI(new C516301zl(j, 5))).LJIILL().LJIIZILJ());
    }
}
