package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.impl.pet.fe.StreakJSEventLogHandler;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS31S2100000_2;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS87S1200000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06Du, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1572806Du implements InterfaceC1573006Dw {
    public static final C1572806Du LL = new C1572806Du();
    public static final CopyOnWriteArrayList<InterfaceC1573006Dw> LLILLJJLI;

    static {
        CopyOnWriteArrayList<InterfaceC1573006Dw> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.addAll(C1697810uHb.LJIIJJI(new InterfaceC1573006Dw() { // from class: X.066J
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
            public final C054G LL;
            public volatile C1598406Nq LLILLJJLI;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(C066J.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
                C13LE.LIZ.getClass();
                LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            @Override // X.InterfaceC1573006Dw
            public final void Hf(StreakPetData streakPetData, StreakPetData streakPetData2, long j, boolean z, C06CF c06cf, String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void LLLIILIL(C1574906Ep c1574906Ep) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void LLLJIL(String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Oh(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Q1(StreakPetData streakPetData, String str, List<C1CA0> list) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Z7(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void de(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void g(String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void init() {
            }

            @Override // X.InterfaceC1573006Dw
            public final void k9(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void ne(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void uk(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void y2(String str, String str2, List list) {
            }

            {
                C1598406Nq c1598406Nq = this.LLILLJJLI;
                if (c1598406Nq == null) {
                    synchronized (this) {
                        c1598406Nq = this.LLILLJJLI;
                        if (c1598406Nq == null) {
                            c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                            this.LLILLJJLI = c1598406Nq;
                        }
                    }
                }
                this.LL = C2296808zG.LIZ(c1598406Nq.LIZIZ.plus(C2296908zH.LIZ()).plus(new C1770006wU(CoroutineExceptionHandler.LJJLIL, 19)));
            }

            @Override // X.InterfaceC1573006Dw
            public final void nm(String str, String str2, String str3, boolean z, long j, long j2) {
                long jCurrentTimeMillis;
                if (str3 != null) {
                    C23250099c.LIZLLL(this.LL, null, null, new C434801mc(str3, null), 3);
                }
                C066K c066k = C066K.LIZIZ;
                if (z) {
                    jCurrentTimeMillis = 0;
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                C0I0B.LJFF.LIZIZ();
                c066k.getClass();
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("conversation_id", str), new Pair("conversation_type", String.valueOf(C1567806Bw.LIZIZ(str))), new Pair("enter_from", str2), new Pair("click_time", String.valueOf(j)), new Pair("start_request_time", String.valueOf(j2)), new Pair("get_response_time", String.valueOf(jCurrentTimeMillis)));
                C06C6.LIZIZ.getClass();
                mapLJIIJ.put("pet_type", C1567906Bx.LIZJ(C06C6.LIZIZ(str)));
                C20684815ws.LJIILLIIL("streak_pet_accept_latency", mapLJIIJ);
            }
        }, new InterfaceC1573006Dw() { // from class: X.06D4
            @Override // X.InterfaceC1573006Dw
            public final void LLLIILIL(C1574906Ep c1574906Ep) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void LLLJIL(String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Oh(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Q1(StreakPetData streakPetData, String str, List<C1CA0> list) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Z7(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void de(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void g(String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void init() {
            }

            @Override // X.InterfaceC1573006Dw
            public final void k9(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void ne(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void nm(String str, String str2, String str3, boolean z, long j, long j2) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void uk(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void y2(String str, String str2, List list) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Hf(StreakPetData streakPetData, StreakPetData streakPetData2, long j, boolean z, C06CF c06cf, String str) {
                String string;
                long jLongValue;
                String str2 = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c06cf.LIZ);
                sbLIZ.append(" extra:");
                sbLIZ.append(c06cf.LIZIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Long lValueOf = Long.valueOf(j);
                String str3 = null;
                if (streakPetData2 != null) {
                    string = streakPetData2.toString();
                    str3 = streakPetData2.conversationId;
                } else {
                    string = null;
                }
                C0I0B.LJFF.LIZJ();
                if (C894660Z7w.LIZLLL()) {
                    synchronized (C06D5.LIZ) {
                        try {
                            List<C006S> list = C06D5.LIZIZ;
                            if (lValueOf != null) {
                                jLongValue = lValueOf.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            if (str2 == null) {
                                str2 = "null";
                            }
                            if (string == null) {
                                string = "null";
                            }
                            if (str3 == null) {
                                str3 = "";
                            }
                            ((ArrayList) list).add(new InterfaceC1891350zJl(strLIZIZ, str2, string, jLongValue, str3, z) { // from class: X.006S
                                public final String LL;
                                public final boolean LLILLJJLI;
                                public final long LLILLL;
                                public final String LLILZ;
                                public final String LLILZIL;
                                public final String LLILZLL;

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (!(obj instanceof C006S)) {
                                        return false;
                                    }
                                    C006S c006s = (C006S) obj;
                                    return Intrinsics.LJFF(this.LL, c006s.LL) && this.LLILLJJLI == c006s.LLILLJJLI && this.LLILLL == c006s.LLILLL && Intrinsics.LJFF(this.LLILZ, c006s.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c006s.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c006s.LLILZLL);
                                }

                                @Override // X.InterfaceC1891350zJl
                                public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                                    return null;
                                }

                                public final int hashCode() {
                                    return (((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode();
                                }

                                public final String toString() {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("StreakPetDataDebugInfo(source=");
                                    sbLIZ2.append(this.LL);
                                    sbLIZ2.append(", isAccepted=");
                                    sbLIZ2.append(this.LLILLJJLI);
                                    sbLIZ2.append(", timestamp=");
                                    sbLIZ2.append(this.LLILLL);
                                    sbLIZ2.append(", logId=");
                                    sbLIZ2.append(this.LLILZ);
                                    sbLIZ2.append(", response=");
                                    sbLIZ2.append(this.LLILZIL);
                                    sbLIZ2.append(", conversationId=");
                                    sbLIZ2.append(this.LLILZLL);
                                    sbLIZ2.append(')');
                                    return C2188811AlT.LIZIZ(sbLIZ2);
                                }

                                @Override // X.InterfaceC1891350zJl
                                public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                    return Intrinsics.LJFF(interfaceC1891350zJl, this);
                                }

                                @Override // X.InterfaceC1891350zJl
                                public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                    return Intrinsics.LJFF(interfaceC1891350zJl, this);
                                }

                                {
                                    this.LL = strLIZIZ;
                                    this.LLILLJJLI = z;
                                    this.LLILLL = jLongValue;
                                    this.LLILZ = str2;
                                    this.LLILZIL = string;
                                    this.LLILZLL = str3;
                                }
                            });
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        }, new InterfaceC1573006Dw() { // from class: X.066d
            @Override // X.InterfaceC1573006Dw
            public final void Hf(StreakPetData streakPetData, StreakPetData streakPetData2, long j, boolean z, C06CF c06cf, String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void LLLIILIL(C1574906Ep c1574906Ep) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void LLLJIL(String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Oh(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Z7(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void de(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void g(String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void init() {
            }

            @Override // X.InterfaceC1573006Dw
            public final void k9(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void ne(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void nm(String str, String str2, String str3, boolean z, long j, long j2) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void uk(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void y2(String str, String str2, List list) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Q1(StreakPetData streakPetData, String str, List<C1CA0> list) {
                String str2;
                EnumC1579606Gk enumC1579606GkLJIIIIZZ;
                if (streakPetData != null && (str2 = streakPetData.conversationId) != null) {
                    long j = streakPetData.inviterUid;
                    if (C13LP.LJJJJ(str, C1697810uHb.LJIIJJI("streak_pet_invitation", "streak_pet_ready")) && str != null) {
                        C066K c066k = C066K.LIZIZ;
                        C0I0B c0i0b = C0I0B.LJFF;
                        boolean zLIZJ = ((C1400340mXo) c0i0b.LIZ()).LIZJ(String.valueOf(j));
                        c0i0b.LIZIZ();
                        c066k.getClass();
                        C1575806Ey.LIZJ.getClass();
                        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str2);
                        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("conversation_id", str2), new Pair("conversation_type", String.valueOf(C1567806Bw.LIZIZ(str2))), new Pair("is_inviter", C066K.LIZ(zLIZJ)), new Pair(Scene.SCENE_SERVICE, str));
                        if (streakDataLJIIIIZZ != null && (enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakDataLJIIIIZZ, false)) != null) {
                            mapLJIIJ.put("streak_status", String.valueOf(enumC1579606GkLJIIIIZZ.ordinal()));
                        }
                        C06C6.LIZIZ.getClass();
                        StreakPetData streakPetDataLIZIZ = C06C6.LIZIZ(str2);
                        if (streakPetDataLIZIZ != null) {
                            mapLJIIJ.put("pet_status", String.valueOf(streakPetDataLIZIZ.status));
                            mapLJIIJ.put("pet_sub_status", String.valueOf(streakPetDataLIZIZ.subStatus));
                        }
                        C20684815ws.LJIILLIIL("receive_pet_cmd_message", mapLJIIJ);
                    }
                    if (Intrinsics.LJFF(str, "streak_pet_invitation")) {
                        C066L.LIZIZ.getClass();
                        ConcurrentHashMap<String, C066M> concurrentHashMap = C066L.LJ;
                        C066M c066m = concurrentHashMap.get(str2);
                        if (c066m != null) {
                            c066m.LJI = Long.valueOf(System.currentTimeMillis());
                        }
                        C066M c066mRemove = concurrentHashMap.remove(str2);
                        if (c066mRemove != null) {
                            C066L.LIZ(c066mRemove);
                        }
                    }
                    if (list != null) {
                        Iterator<C1CA0> it2 = list.iterator();
                        while (it2.hasNext()) {
                            EnumC15548066w enumC15548066w = it2.next().action_type;
                            if (enumC15548066w != null && C15530066e.LIZ[enumC15548066w.ordinal()] == 1) {
                                IStreakPetService.LIZ.getClass();
                                C1586906Jf.LIZ().LJJII().LIZ(new C15531066f(EnumC205800qm.REFRESH_STREAK_STICKER));
                            }
                        }
                    }
                }
            }
        }, new InterfaceC1573006Dw() { // from class: X.06Cv
            @Override // X.InterfaceC1573006Dw
            public final void Hf(StreakPetData streakPetData, StreakPetData streakPetData2, long j, boolean z, C06CF c06cf, String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void LLLIILIL(C1574906Ep c1574906Ep) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void LLLJIL(String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Oh(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Q1(StreakPetData streakPetData, String str, List<C1CA0> list) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Z7(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void de(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void g(String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void init() {
            }

            @Override // X.InterfaceC1573006Dw
            public final void ne(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void nm(String str, String str2, String str3, boolean z, long j, long j2) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void uk(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void y2(String str, String str2, List list) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void k9(StreakPetData streakPetData) {
                C1570106Ct.LJ.getClass();
                C1570106Ct c1570106Ct = C1570106Ct.LJI;
                C23250099c.LIZLLL(c1570106Ct.LIZIZ, null, null, new C1570206Cu(c1570106Ct, streakPetData.conversationId, null), 3);
            }
        }, new InterfaceC1573006Dw() { // from class: X.06Dz
            @Override // X.InterfaceC1573006Dw
            public final void LLLJIL(String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Q1(StreakPetData streakPetData, String str, List<C1CA0> list) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void g(String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void init() {
            }

            @Override // X.InterfaceC1573006Dw
            public final void k9(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void nm(String str, String str2, String str3, boolean z, long j, long j2) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void y2(String str, String str2, List list) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void LLLIILIL(C1574906Ep c1574906Ep) {
                boolean z = C1590906Kt.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SPWidget onCountdownTimerEnd countdownInfo ");
                sbLIZ.append(c1574906Ep);
                C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (c1574906Ep.LIZIZ == 1) {
                    for (String str : c1574906Ep.LIZJ) {
                        C06C6.LIZIZ.getClass();
                        List<C06C8> list = C06C6.LJI;
                        synchronized (list) {
                            try {
                                Iterator it2 = ((ArrayList) list).iterator();
                                while (it2.hasNext()) {
                                    ((C06C8) it2.next()).Ro1(str);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                }
            }

            @Override // X.InterfaceC1573006Dw
            public final void Oh(StreakPetData streakPetData) {
                C1574006Eg.LLILLJJLI.getClass();
                C1574006Eg.LIZ("streak_floating_widget_mounted");
                C1574006Eg.LIZ("streak_floating_widget_hidden_finished");
                C1574006Eg.LIZ("streak_floating_widget_campaign_bubble_show");
                C1574006Eg.LIZ("streak_widget_campaign_guide_finished");
            }

            @Override // X.InterfaceC1573006Dw
            public final void Z7(StreakPetData streakPetData) {
                C1574006Eg.LLILLJJLI.getClass();
                C1574006Eg.LIZ("streak_pet_open_card");
                C1574006Eg.LIZ("edit_streak_pet_fe_data");
                C0I0B c0i0b = C0I0B.LJFF;
                c0i0b.LIZJ();
                if (!C894660Z7w.LIZLLL()) {
                    c0i0b.LIZJ();
                    if (!C894660Z7w.LJ()) {
                        return;
                    }
                }
                C1574006Eg.LIZ("im_streak_pet_logger");
                C23250099c.LIZLLL(C1574006Eg.LLILZ, null, null, new C1574106Eh(StreakJSEventLogHandler.LLILZ, null), 3);
            }

            @Override // X.InterfaceC1573006Dw
            public final void de(StreakPetData streakPetData) {
                boolean z;
                if (C1571306Df.LJI(streakPetData)) {
                    z = streakPetData.isEggHidden;
                } else {
                    z = streakPetData.isHidden;
                }
                if (z) {
                    C1570106Ct.LJ.getClass();
                    C1570106Ct c1570106Ct = C1570106Ct.LJI;
                    C23250099c.LIZLLL(c1570106Ct.LIZIZ, null, null, new C1570206Cu(c1570106Ct, streakPetData.conversationId, null), 3);
                }
            }

            @Override // X.InterfaceC1573006Dw
            public final void ne(StreakPetData streakPetData) {
                C1574006Eg.LLILLJJLI.getClass();
                C1574006Eg.LIZIZ("streak_pet_open_card");
                C1574006Eg.LIZIZ("edit_streak_pet_fe_data");
                C0I0B c0i0b = C0I0B.LJFF;
                c0i0b.LIZJ();
                if (!C894660Z7w.LIZLLL()) {
                    c0i0b.LIZJ();
                    if (!C894660Z7w.LJ()) {
                        return;
                    }
                }
                C1574006Eg.LIZIZ("im_streak_pet_logger");
                C23250099c.LIZLLL(C1574006Eg.LLILZ, null, null, new C1574206Ei(StreakJSEventLogHandler.LLILZ, null), 3);
            }

            @Override // X.InterfaceC1573006Dw
            public final void uk(StreakPetData streakPetData) {
                C1574006Eg.LLILLJJLI.getClass();
                C1574006Eg.LIZIZ("streak_floating_widget_mounted");
                C1574006Eg.LIZIZ("streak_floating_widget_hidden_finished");
                C1574006Eg.LIZIZ("streak_floating_widget_campaign_bubble_show");
                C1574006Eg.LIZIZ("streak_widget_campaign_guide_finished");
            }

            @Override // X.InterfaceC1573006Dw
            public final void Hf(StreakPetData streakPetData, StreakPetData streakPetData2, long j, boolean z, C06CF c06cf, String str) {
                String str2;
                if (streakPetData2 != null && (str2 = streakPetData2.conversationId) != null && z && streakPetData2.status != EnumC1578506Fz.StreakPetStatus_Active.getValue()) {
                    C06E0.LIZ.getClass();
                    C0YNP.LJIIIIZZ(str2, "streak_widget_margin_top", "");
                    C0YNP.LJIIIIZZ(str2, "streak_widget_margin_left", "");
                }
            }
        }, new InterfaceC1573006Dw() { // from class: X.06Dy
            @Override // X.InterfaceC1573006Dw
            public final void LLLIILIL(C1574906Ep c1574906Ep) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void LLLJIL(String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Oh(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Q1(StreakPetData streakPetData, String str, List<C1CA0> list) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Z7(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void de(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void g(String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void init() {
            }

            @Override // X.InterfaceC1573006Dw
            public final void k9(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void ne(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void nm(String str, String str2, String str3, boolean z, long j, long j2) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void uk(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void y2(String str, String str2, List list) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Hf(StreakPetData streakPetData, StreakPetData streakPetData2, long j, boolean z, C06CF c06cf, String str) {
                String str2;
                boolean z2;
                Map mapLIZIZ;
                Map mapLIZIZ2;
                C06E4 c06e4 = C06E4.LIZ;
                if (streakPetData2 == null || (str2 = streakPetData2.conversationId) == null) {
                    str2 = "";
                }
                c06cf.getClass();
                if (!Intrinsics.LJFF(c06cf, C06CF.LJIIJ) && !Intrinsics.LJFF(c06cf, C06CF.LJIIJJI)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                String str3 = c06cf.LIZ;
                c06e4.getClass();
                Pair[] pairArr = new Pair[6];
                pairArr[0] = new Pair("conversation_id", str2);
                if (streakPetData != null) {
                    mapLIZIZ = C06E4.LIZIZ(streakPetData);
                } else {
                    mapLIZIZ = null;
                }
                pairArr[1] = new Pair("previous", mapLIZIZ);
                if (streakPetData2 != null) {
                    mapLIZIZ2 = C06E4.LIZIZ(streakPetData2);
                } else {
                    mapLIZIZ2 = null;
                }
                pairArr[2] = new Pair("current", mapLIZIZ2);
                pairArr[3] = new Pair("is_cmd", boolValueOf);
                pairArr[4] = new Pair("request_scene", str3);
                pairArr[5] = new Pair("request_log_id", str);
                TTMStrategyCenterManager.asyncEmitEventToGlobalStrategyEventStream("im_psp_pet_update", new JSONObject(C2097608Jq.LJIIIIZZ(pairArr)), (ExecutorService) null);
            }
        }, new InterfaceC1573006Dw() { // from class: X.066z
            public final C01GW LL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1178));
            public final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);

            @Override // X.InterfaceC1573006Dw
            public final void Hf(StreakPetData streakPetData, StreakPetData streakPetData2, long j, boolean z, C06CF c06cf, String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void LLLIILIL(C1574906Ep c1574906Ep) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Oh(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Q1(StreakPetData streakPetData, String str, List<C1CA0> list) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Z7(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void de(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void init() {
            }

            @Override // X.InterfaceC1573006Dw
            public final void k9(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void ne(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void nm(String str, String str2, String str3, boolean z, long j, long j2) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void uk(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void LLLJIL(String str) {
                ((AnonymousClass0674) this.LL.getValue()).LIZ = "";
                this.LLILLJJLI.set(false);
            }

            @Override // X.InterfaceC1573006Dw
            public final void g(String str) {
                ((AnonymousClass0674) this.LL.getValue()).LIZ = str;
                this.LLILLJJLI.set(true);
            }

            @Override // X.InterfaceC1573006Dw
            public final void y2(String str, String str2, List list) {
                if (str == null || str.length() == 0) {
                    C1590806Ks.LIZ("StreakPetActionTrigger conversation id is null");
                }
                AnonymousClass0674 anonymousClass0674 = (AnonymousClass0674) this.LL.getValue();
                if (str == null) {
                    str = "";
                }
                anonymousClass0674.LIZ = str;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        EnumC15548066w enumC15548066w = ((C1CA0) it2.next()).action_type;
                        if (enumC15548066w != null) {
                            int i = C15547066v.LIZ[enumC15548066w.ordinal()];
                            if (i != 1) {
                                if (i == 2) {
                                    IStreakPetService.LIZ.getClass();
                                    C1586906Jf.LIZ().LJJII().LIZ(new C15531066f(EnumC205800qm.REFRESH_STREAK_STICKER));
                                }
                            } else {
                                AnonymousClass0674 anonymousClass06742 = (AnonymousClass0674) this.LL.getValue();
                                C06CA c06ca = new C06CA() { // from class: X.0670
                                    @Override // X.C06CA
                                    public final void LIZ(StreakPetData streakPetData, boolean z) {
                                    }

                                    @Override // X.C06CA
                                    public final void onFailure() {
                                    }
                                };
                                anonymousClass06742.getClass();
                                C1569106Cj.LJ.getClass();
                                C1569106Cj c1569106Cj = C1569106Cj.LJI;
                                C23250099c.LIZLLL(c1569106Cj.LIZ, null, null, new C06C9("pet_status_msg", anonymousClass06742.LIZ, c1569106Cj, str2, c06ca, null), 3);
                            }
                        }
                    }
                }
            }
        }, new InterfaceC1573006Dw() { // from class: X.06CG
            @Override // X.InterfaceC1573006Dw
            public final void LLLIILIL(C1574906Ep c1574906Ep) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void LLLJIL(String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Oh(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Q1(StreakPetData streakPetData, String str, List<C1CA0> list) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Z7(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void de(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void g(String str) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void init() {
            }

            @Override // X.InterfaceC1573006Dw
            public final void k9(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void ne(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void nm(String str, String str2, String str3, boolean z, long j, long j2) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void uk(StreakPetData streakPetData) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void y2(String str, String str2, List list) {
            }

            @Override // X.InterfaceC1573006Dw
            public final void Hf(StreakPetData streakPetData, StreakPetData streakPetData2, long j, boolean z, C06CF c06cf, String str) {
                boolean z2;
                String str2;
                String str3;
                if (!z) {
                    return;
                }
                c06cf.getClass();
                if (!Intrinsics.LJFF(c06cf, C06CF.LJIIJ) && !Intrinsics.LJFF(c06cf, C06CF.LJIIJJI)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                String str4 = "";
                if (z2) {
                    if (streakPetData2 != null && (str3 = streakPetData2.conversationId) != null) {
                        str4 = str3;
                    }
                    C1580506Gt.LIZ(str4, true, streakPetData2, j);
                    return;
                }
                if (!Intrinsics.LJFF(c06cf, C06CF.LIZJ) && !Intrinsics.LJFF(c06cf, C06CF.LIZLLL) && !Intrinsics.LJFF(c06cf, C06CF.LJ) && !Intrinsics.LJFF(c06cf, C06CF.LJFF) && !Intrinsics.LJFF(c06cf, C06CF.LJI) && !Intrinsics.LJFF(c06cf, C06CF.LJII) && !Intrinsics.LJFF(c06cf, C06CF.LJIIIIZZ)) {
                    return;
                }
                if (streakPetData2 != null && (str2 = streakPetData2.conversationId) != null) {
                    str4 = str2;
                }
                C1580506Gt.LIZ(str4, false, streakPetData2, j);
            }
        }));
        LLILLJJLI = copyOnWriteArrayList;
    }

    @Override // X.InterfaceC1573006Dw
    public final void init() {
        LIZ(AFwS229S0000000_2.get$arr$(803));
    }

    public static void LIZ(Function1 function1) {
        Iterator<InterfaceC1573006Dw> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }

    @Override // X.InterfaceC1573006Dw
    public final void LLLIILIL(C1574906Ep c1574906Ep) {
        LIZ(new AwS581S0100000_2(c1574906Ep, 574));
    }

    @Override // X.InterfaceC1573006Dw
    public final void LLLJIL(String str) {
        LIZ(new AwS53S1000000_2(str, 25));
    }

    @Override // X.InterfaceC1573006Dw
    public final void Oh(StreakPetData streakPetData) {
        LIZ(new AwS581S0100000_2(streakPetData, 579));
    }

    @Override // X.InterfaceC1573006Dw
    public final void Z7(StreakPetData streakPetData) {
        LIZ(new AwS581S0100000_2(streakPetData, 575));
    }

    @Override // X.InterfaceC1573006Dw
    public final void de(StreakPetData streakPetData) {
        LIZ(new AwS581S0100000_2(streakPetData, 580));
    }

    @Override // X.InterfaceC1573006Dw
    public final void g(String str) {
        LIZ(new AwS53S1000000_2(str, 24));
    }

    @Override // X.InterfaceC1573006Dw
    public final void k9(StreakPetData streakPetData) {
        LIZ(new AwS581S0100000_2(streakPetData, 577));
    }

    @Override // X.InterfaceC1573006Dw
    public final void ne(StreakPetData streakPetData) {
        LIZ(new AwS581S0100000_2(streakPetData, 576));
    }

    @Override // X.InterfaceC1573006Dw
    public final void uk(StreakPetData streakPetData) {
        LIZ(new AwS581S0100000_2(streakPetData, 578));
    }

    @Override // X.InterfaceC1573006Dw
    public final void Q1(StreakPetData streakPetData, String str, List<C1CA0> list) {
        LIZ(new AwS87S1200000_2(streakPetData, (StreakPetData) str, (String) list, (List<C1CA0>) 9));
    }

    @Override // X.InterfaceC1573006Dw
    public final void y2(String str, String str2, List list) {
        LIZ(new AwS31S2100000_2(str, (String) list, (List<C1CA0>) str2, (String) 5));
    }

    @Override // X.InterfaceC1573006Dw
    public final void Hf(StreakPetData streakPetData, StreakPetData streakPetData2, long j, boolean z, C06CF c06cf, String str) {
        LIZ(new C1572906Dv(streakPetData, streakPetData2, j, z, c06cf, str));
    }

    @Override // X.InterfaceC1573006Dw
    public final void nm(String str, String str2, String str3, boolean z, long j, long j2) {
        LIZ(new C1573106Dx(str, str2, str3, z, j, j2));
    }
}
