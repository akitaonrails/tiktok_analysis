package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.ss.android.ugc.aweme.im.common.setting.StreakPetResourceDescription;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetResourceStatus;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS18S2200000_2;

/* JADX INFO: renamed from: X.06I0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06I0 {
    public static final C06I0 LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C01GW LIZLLL;
    public static final C054G LJ;
    public static final AtomicBoolean LJFF;
    public static final ConcurrentHashMap<String, StreakPetResourceStatus> LJI;
    public static final AtomicBoolean LJII;
    public static final ConcurrentHashMap<String, StreakPetResourceStatus> LJIIIIZZ;
    public static final ConcurrentHashMap<String, StreakPetResourceStatus> LJIIIZ;
    public static final C01GW LJIIJ;
    public static volatile boolean LJIIJJI;
    public static volatile boolean LJIIL;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C06I0.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C06I0 c06i0 = new C06I0();
        LIZIZ = c06i0;
        LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1106));
        C1598406Nq c1598406Nq = c06i0.LIZ;
        if (c1598406Nq == null) {
            synchronized (c06i0) {
                c1598406Nq = c06i0.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c06i0.LIZ = c1598406Nq;
                }
            }
        }
        LJ = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        LJFF = new AtomicBoolean(false);
        LJI = new ConcurrentHashMap<>();
        LJII = new AtomicBoolean(false);
        LJIIIIZZ = new ConcurrentHashMap<>();
        LJIIIZ = new ConcurrentHashMap<>();
        LJIIJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1107));
    }

    public static void LIZIZ(StreakPetData streakPetData) {
        Object objValueOf;
        if (streakPetData != null) {
            if (streakPetData.status == C06G0.StreakPetStatus_Invited.getValue()) {
                objValueOf = "1";
            } else {
                objValueOf = Integer.valueOf(C1571306Df.LIZ(streakPetData));
            }
            C23250099c.LIZLLL(LJ, null, null, new C06I3(streakPetData, objValueOf, null), 3);
        }
    }

    public static void LIZ(StreakPetResourceDescription streakPetResourceDescription, Function1 function1) {
        boolean z = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakPetResourceHelper start download ");
        sbLIZ.append(streakPetResourceDescription);
        C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        String str = streakPetResourceDescription.channel;
        String str2 = streakPetResourceDescription.bundle;
        Forest forest = (Forest) LIZLLL.getValue();
        if (forest != null) {
            RequestParams requestParams = new RequestParams(null, 1, null);
            requestParams.disableBuiltin = true;
            requestParams.resourceScene = EnumC1533980q1M.OTHER;
            Boolean bool = Boolean.TRUE;
            requestParams.enableMemoryCache = bool;
            requestParams.enableRequestReuse = true;
            requestParams.enableCDNCache = bool;
            requestParams.channel = str;
            requestParams.bundle = str2;
            forest.fetchResourceAsync("", requestParams, new AwS18S2200000_2(streakPetResourceDescription, (StreakPetResourceDescription) function1, (Function1<? super Boolean, Unit>) str, str2, (String) 1));
        }
    }
}
