package X;

import android.util.Pair;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NFj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590850NFj implements InterfaceC590840NFi, InterfaceC1475290oUh, InterfaceC1475300oUi, InterfaceC590890NFn {
    public static volatile FeedItemList LLILZ;
    public static boolean LLILZIL;
    public static volatile boolean LLILZLL;
    public static final C590850NFj LL = new C590850NFj();
    public static volatile String LLILLJJLI = "cold_initial";
    public static final ConcurrentHashMap<String, FeedItemList> LLILLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C590820NFg> LLIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void Dd(int i, String str, String str2, String str3) {
    }

    @Override // X.InterfaceC1475290oUh
    public final void LIZLLL(List<? extends SimVideoUrlModel> list) {
    }

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void LLLLZLLIL(String str) {
    }

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void Sm() {
    }

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void T8(List list) {
    }

    @Override // X.InterfaceC1475300oUi
    public final void Xi(String str, String str2, long j, long j2) {
    }

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void Z9() {
    }

    @Override // X.InterfaceC1475300oUi
    public final /* synthetic */ void ck() {
    }

    @Override // X.InterfaceC1475300oUi
    public final void qc(long j, long j2, String str) {
    }

    @Override // X.InterfaceC1475300oUi
    public final void t8(String str, long j, long j2, String str2) {
    }

    @Override // X.InterfaceC1475300oUi
    public final void tf(long j, long j2, String str, String str2) {
    }

    @Override // X.InterfaceC590890NFn
    public final FeedItemList LIZIZ() {
        String str = LLILLJJLI;
        if (str == null || str.length() == 0) {
            return null;
        }
        C1602860roS.LIZ.getClass();
        Map<String, Integer> mapLJ = C19254610Um.LIZIZ.LIZJ().LJ();
        Integer num = mapLJ.get("pre_is");
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = mapLJ.get(LLILLJJLI);
        return (LLILZLL || LLILZ == null || iIntValue <= (num2 != null ? num2.intValue() : 0)) ? LLILLL.get(LLILLJJLI) : LLILZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    @Override // X.InterfaceC590890NFn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.feed.model.FeedItemList> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C590860NFk
            if (r0 == 0) goto L58
            r6 = r8
            X.0NFk r6 = (X.C590860NFk) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 1
            java.lang.String r2 = "cold_initial"
            if (r0 == 0) goto L32
            if (r0 != r3) goto L5f
            X.C155000ia.LIZIZ(r1)
        L25:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.feed.model.FeedItemList> r1 = X.C590850NFj.LLILLL
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r1.get(r2)
            return r0
        L32:
            X.C155000ia.LIZIZ(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0NFg> r1 = X.C590850NFj.LLIZ
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L25
            java.lang.Object r0 = r1.get(r2)
            X.0NFg r0 = (X.C590820NFg) r0
            if (r0 == 0) goto L25
            X.0956 r1 = r0.LJ
            if (r1 == 0) goto L25
            boolean r0 = r1.isActive()
            if (r0 == 0) goto L25
            r6.LLILLL = r3
            java.lang.Object r0 = r1.LJJZ(r6)
            if (r0 != r5) goto L25
            return r5
        L58:
            X.0NFk r6 = new X.0NFk
            r6.<init>(r7, r8)
            goto L12
        L5e:
            return r4
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C590850NFj.LIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1475290oUh
    public final void LIZJ(Pair<SimVideoUrlModel, String> pair) {
        String sourceId;
        SimVideoUrlModel simVideoUrlModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload done, sourceId: ");
        if (pair != null && (simVideoUrlModel = (SimVideoUrlModel) pair.first) != null) {
            sourceId = simVideoUrlModel.getSourceId();
        } else {
            sourceId = null;
        }
        sbLIZ.append(sourceId);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1475290oUh
    public final void LJFF(SimVideoUrlModel simVideoUrlModel) {
        String sourceId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload error, sourceId: ");
        if (simVideoUrlModel != null) {
            sourceId = simVideoUrlModel.getSourceId();
        } else {
            sourceId = null;
        }
        sbLIZ.append(sourceId);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC590840NFi
    public final void LJ(FeedItemList feedItemList, String str) {
        Integer numValueOf;
        Aweme aweme;
        Integer num;
        if (feedItemList == null) {
            return;
        }
        int iIntValue = 0;
        if (Intrinsics.LJFF(str, "paid_ads")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("feed size: ");
            List<Aweme> items = feedItemList.getItems();
            if (items != null) {
                numValueOf = Integer.valueOf(items.size());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            List<Aweme> items2 = feedItemList.getItems();
            if (items2 != null && (aweme = (Aweme) C13LP.LJJJLL(items2)) != null && (num = feedItemList.nujInsertConfig) != null) {
                if (num.intValue() == 1 && C590980NFw.LJFF.compareAndSet(false, true)) {
                    C590980NFw.LIZIZ();
                }
                C590980NFw.LIZ.set(aweme);
                C590980NFw.LIZIZ.set(aweme.getAid());
                C590980NFw.LIZIZ();
                C587820N3s.LIZ.getClass();
                C587820N3s.LIZ(feedItemList);
                return;
            }
            return;
        }
        int iIntValue2 = -1;
        if (Intrinsics.LJFF(str, "pre_is")) {
            LLILZ = feedItemList;
            if (LLILZIL && !LLILZLL) {
                C1602860roS.LIZ.getClass();
                Map<String, Integer> mapLJ = C19254610Um.LIZIZ.LIZJ().LJ();
                Integer num2 = mapLJ.get("pre_is");
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                Integer num3 = mapLJ.get(LLILLJJLI);
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                }
                if (iIntValue > iIntValue2) {
                    LLILLJJLI = "pre_is";
                    return;
                }
                return;
            }
            return;
        }
        LLILLL.put(str, feedItemList);
        C1602860roS.LIZ.getClass();
        Map<String, Integer> mapLJ2 = C19254610Um.LIZIZ.LIZJ().LJ();
        Integer num4 = mapLJ2.get(str);
        if (num4 != null) {
            iIntValue = num4.intValue();
        }
        Integer num5 = mapLJ2.get(LLILLJJLI);
        if (num5 != null) {
            iIntValue2 = num5.intValue();
        }
        if (iIntValue > iIntValue2) {
            LLILLJJLI = str;
        }
    }

    public final void LJI(int i, String str, boolean z) {
        if (Intrinsics.LJFF(str, "cold_initial")) {
            C590870NFl.LIZ = this;
        }
        ConcurrentHashMap<String, C590820NFg> concurrentHashMap = LLIZ;
        if (concurrentHashMap.contains(str)) {
            return;
        }
        C590820NFg c590820NFg = new C590820NFg(str, i, z);
        c590820NFg.LJ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C590810NFf(c590820NFg, this, null), 2);
        concurrentHashMap.put(str, c590820NFg);
    }
}
