package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06BZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06BZ implements InterfaceC1566906Bn {
    public final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public volatile String LIZJ;
    public volatile String LIZLLL;

    @Override // X.InterfaceC884050YmB
    public final String LIZ() {
        return "streak_single_compensation_trigger";
    }

    @Override // X.InterfaceC1566906Bn
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1566906Bn, X.InterfaceC884050YmB
    public final void LIZJ(InterfaceC884020Ym8 interfaceC884020Ym8, List<? extends InterfaceC884440Ymo> list, boolean z, String str) {
    }

    @Override // X.InterfaceC1566906Bn
    public final void LIZLLL(String str, StreakData streakData, StreakData streakData2) {
    }

    @Override // X.InterfaceC1566906Bn
    public final void LJ(C06BD c06bd, EnumC1567006Bo enumC1567006Bo, String str, StreakData streakData, StreakData streakData2, Map<String, String> map) {
    }

    @Override // X.InterfaceC1566906Bn
    public final void LJFF(String str) {
    }

    @Override // X.InterfaceC1566906Bn
    public final void LJI(EnumC1578206Fw enumC1578206Fw, String str, StreakData streakData, EnumC1578706Gb enumC1578706Gb) {
    }

    @Override // X.InterfaceC1566906Bn
    public final void LLLIILIL(C1574906Ep c1574906Ep) {
        String str = this.LIZLLL;
        if (str == null || c1574906Ep.LIZIZ != 1 || !c1574906Ep.LIZJ.contains(str)) {
            return;
        }
        long jNanoTime = System.nanoTime();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1565706Bb(this, str, LSPassThroughRecordSizeConfig.DEFAULT + ((long) (((jNanoTime % r8) / 1000.0d) * ((double) C1565906Bd.LJ))), null), 3);
    }

    @Override // X.InterfaceC1566906Bn
    public final void LLLJIL(String str) {
        long jLongValue;
        long jLongValue2;
        long jMax;
        String str2;
        if (Intrinsics.LJFF(this.LIZLLL, str)) {
            this.LIZLLL = null;
        }
        boolean zLJFF = Intrinsics.LJFF(this.LIZJ, str);
        this.LIZJ = null;
        if (!zLJFF) {
            boolean z = C1590906Kt.LIZ;
            return;
        }
        Long l = this.LIZ.get(str);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = this.LIZIZ.get(str);
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        if (jLongValue2 > 0) {
            jMax = Math.max(jLongValue2 - jLongValue, 0L);
        } else {
            jMax = -1;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("conv_id", str);
        if (jLongValue2 > 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("receive_restore", str2);
        pairArr[2] = new Pair("duration", String.valueOf(jMax));
        C0I0B.LJFF.LIZIZ().sendEvent("streak_restore_inline_compensation", C2097608Jq.LJIIJ(pairArr));
    }

    @Override // X.InterfaceC1566906Bn
    public final void g(String str) {
        if (!C1565906Bd.LIZJ) {
            C1590906Kt.LIZ("StreakSingleCompensationTrigger: onEnterChatRoom, exp is false");
            return;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = str;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1565706Bb(this, str, 0L, null), 3);
    }

    public static void LJII(int i, String str) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("conv_id", str), new Pair("status_code", String.valueOf(i)));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("streak_restore_compensation_request", mapLJIIJ);
    }

    @Override // X.InterfaceC1566906Bn
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        if (C1565906Bd.LIZJ && list != null) {
            ArrayList<C869590Y9l> arrayList = new ArrayList();
            for (C869590Y9l c869590Y9l : list) {
                C869590Y9l c869590Y9l2 = c869590Y9l;
                if (c869590Y9l2.getMsgType() == 1) {
                    if (C13LP.LJJJJ(c869590Y9l2.getScene(), C06FJ.LIZ)) {
                        arrayList.add(c869590Y9l);
                    }
                }
            }
            ConcurrentHashMap<String, Long> concurrentHashMap = this.LIZIZ;
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (C869590Y9l c869590Y9l3 : arrayList) {
                Pair pair = new Pair(c869590Y9l3.getConversationId(), Long.valueOf(c869590Y9l3.getCreatedAt()));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            concurrentHashMap.putAll(linkedHashMap);
        }
    }
}
