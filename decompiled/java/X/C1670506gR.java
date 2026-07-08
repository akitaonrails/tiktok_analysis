package X;

import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.06gR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1670506gR implements C0Z7V {
    public static long LIZIZ;
    public static long LIZJ;
    public static Pair<Long, String> LIZLLL;
    public static Pair<Long, Integer> LJ;
    public static final C1670506gR LIZ = new C1670506gR();
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1670706gT());

    @Override // X.C0Z7V
    public final int LJIIIZ() {
        Pair<Long, Integer> pair = LJ;
        if (pair == null) {
            pair = new Pair<>(-1, -1);
        }
        Long first = pair.getFirst();
        int iIntValue = pair.getSecond().intValue();
        if (Intrinsics.LJFF(first, Long.valueOf(C461720I8s.LIZJ()))) {
            return iIntValue;
        }
        LJ = new Pair<>(Long.valueOf(C461720I8s.LIZJ()), -1);
        return -1;
    }

    @Override // X.C0Z7V
    public final void LJIIJ() {
        ((ConcurrentHashMap) LJFF.getValue()).clear();
    }

    @Override // X.C0Z7V
    public final void LIZ(long j) {
        LIZIZ = j;
    }

    @Override // X.C0Z7V
    public final String LIZIZ(long j) {
        boolean z;
        Pair<Long, String> pair = LIZLLL;
        if (pair == null) {
            pair = new Pair<>(-1, "");
        }
        Long first = pair.getFirst();
        String second = pair.getSecond();
        if ((first instanceof Long) && j == first.longValue()) {
            return second;
        }
        synchronized (this) {
            C01GW c01gw = LJFF;
            String str = (String) ((ConcurrentHashMap) c01gw.getValue()).get(Long.valueOf(j));
            if (str != null) {
                return str;
            }
            Pair<Long, String> pair2 = LIZLLL;
            if (pair2 == null || j != pair2.getFirst().longValue()) {
                z = false;
            } else {
                z = true;
            }
            String second2 = null;
            if (!z) {
                Object objLJ = C23250099c.LJ(C23271099x.INSTANCE, new C05LL(j, null));
                String str2 = (String) objLJ;
                LIZLLL = new Pair<>(Long.valueOf(j), str2);
                Long lValueOf = Long.valueOf(j);
                LIZ.getClass();
                ((ConcurrentHashMap) c01gw.getValue()).put(lValueOf, str2);
                return (String) objLJ;
            }
            Pair<Long, String> pair3 = LIZLLL;
            if (pair3 != null) {
                second2 = pair3.getSecond();
            }
            if (second2 == null) {
                second2 = "";
            }
            return second2;
        }
    }

    @Override // X.C0Z7V
    public final void LIZLLL(SessionInfo sessionInfo) {
        C909290Zln c909290Zln;
        ChatFeatureListConf chatFeatureListConfLJIJ;
        if ((sessionInfo instanceof C909290Zln) && (c909290Zln = (C909290Zln) sessionInfo) != null) {
            IIMBusinessChatService.LIZ.getClass();
            IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
            if (iIMBusinessChatService != null && (chatFeatureListConfLJIJ = iIMBusinessChatService.LJIJ(c909290Zln, null, c909290Zln.getFromUser())) != null && chatFeatureListConfLJIJ.isB2CChat() && chatFeatureListConfLJIJ.componentEnable(EnumC1660706er.EVENT_TRACKING.getId())) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new AnonymousClass0204(CoroutineExceptionHandler.LJJLIL, 8))), null, null, new C1704906lz(c909290Zln, null), 3);
            }
        }
    }

    @Override // X.C0Z7V
    public final void LJFF(long j) {
        LIZJ = j;
    }

    @Override // X.C0Z7V
    public final Map<String, String> LJI(SessionInfo sessionInfo) {
        C13DA c13da = new C13DA();
        c13da.put("biz_info_extra", sessionInfo.getBizInfoExtra());
        c13da.put("biz_event_tracking_extra", sessionInfo.getExtrasInfoMobParams());
        return c13da.build();
    }

    @Override // X.C0Z7V
    public final void LJII(C909290Zln c909290Zln) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1670406gQ(c909290Zln, null), 3);
    }

    @Override // X.C0Z7V
    public final void LJIIIIZZ(C909290Zln c909290Zln) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1670306gP(c909290Zln, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    @Override // X.C0Z7V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C869590Y9l r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1670606gS
            if (r0 == 0) goto L86
            r5 = r8
            X.06gS r5 = (X.C1670606gS) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r2 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r1 = 1
            if (r0 == 0) goto L58
            if (r0 != r1) goto L8c
            java.lang.Object r3 = r5.LLILLJJLI
            java.util.Map r3 = (java.util.Map) r3
            X.0Y9l r7 = r5.LL
            X.C155000ia.LIZIZ(r2)
        L28:
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L31
        L2c:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L31:
            r3.putAll(r2)
            boolean r0 = X.C896250ZDz.LIZIZ(r7)
            if (r0 == 0) goto L4b
            java.util.Map r1 = r7.getExt()
            java.lang.String r0 = "a:landing_msg_type"
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L4b
            java.lang.String r0 = "message_type"
            r3.put(r0, r1)
        L4b:
            X.0I0B r0 = X.C0I0B.LJFF
            r0.LIZIZ()
            java.lang.String r0 = "receive_b2c_message"
            X.C20684815ws.LJIILLIIL(r0, r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L58:
            X.C155000ia.LIZIZ(r2)
            boolean r0 = X.C896250ZDz.LIZIZ(r7)
            if (r0 != 0) goto L64
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L64:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.Class<com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics> r0 = com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics.class
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics r2 = (com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics) r2
            if (r2 == 0) goto L2c
            r5.LL = r7
            r5.LLILLJJLI = r3
            r5.LLILZIL = r1
            X.0YyA r1 = new X.0YyA
            r1.<init>()
            r0 = 0
            java.lang.Object r2 = r2.LJII(r7, r1, r0, r5)
            if (r2 != r4) goto L28
            return r4
        L86:
            X.06gS r5 = new X.06gS
            r5.<init>(r6, r8)
            goto L12
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1670506gR.LIZJ(X.0Y9l, X.05Vn):java.lang.Object");
    }

    @Override // X.C0Z7V
    public final void LJ(Long l, String str) {
        if (l != null && l.longValue() > 0) {
            l.longValue();
            LIZ.getClass();
            ((ConcurrentHashMap) LJFF.getValue()).put(l, str);
        }
    }
}
