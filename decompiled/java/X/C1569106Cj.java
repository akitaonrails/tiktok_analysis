package X;

import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.UserInteractionRecord;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.impl.pet.datasource.StreakPetDataWrapper;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.06Cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1569106Cj {
    public static final C1569206Ck LJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJFF;
    public static final C1569106Cj LJI;
    public final C054G LIZ;
    public final Object LIZIZ;
    public final C06C6 LIZJ;
    public volatile C1598406Nq LIZLLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.06Ck] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1569106Cj.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LJFF = new InterfaceC2217461Bqa[]{c2217381BqS};
        LJ = new Object() { // from class: X.06Ck
        };
        LJI = new C1569106Cj();
    }

    public C1569106Cj() {
        C1598406Nq c1598406Nq = this.LIZLLL;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LIZLLL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LIZLLL = c1598406Nq;
                }
            }
        }
        this.LIZ = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()).plus(new C1770006wU(CoroutineExceptionHandler.LJJLIL, 8)));
        this.LIZIZ = new Object();
        this.LIZJ = C06C6.LIZIZ;
    }

    public static String LIZJ(String str) {
        if (C1567806Bw.LIZJ(str) == C06G4.USER) {
            return String.valueOf(C0YNP.LJII(str));
        }
        return str;
    }

    public static StreakPetData LIZLLL(String str) {
        StreakPetDataWrapper streakPetDataWrapperLJ;
        if (str == null || (streakPetDataWrapperLJ = LJ(str)) == null) {
            return null;
        }
        return streakPetDataWrapperLJ.streakPetData;
    }

    public static StreakPetDataWrapper LJ(String str) {
        if (str == null) {
            return null;
        }
        C06G4 c06g4LIZJ = C1567806Bw.LIZJ(str);
        if (((Boolean) C136400fa.LIZ.getValue()).booleanValue()) {
            String strLIZIZ = C1571306Df.LIZIZ(str);
            IMContactApi.LIZ.getClass();
            return C1571306Df.LJIIJJI(C069P.LIZ().LIZIZ().LIZ(strLIZIZ, c06g4LIZJ, EnumC1581606He.STREAK_PET));
        }
        IMContactApi.LIZ.getClass();
        return C1571306Df.LJIIJJI(C069P.LIZ().LIZIZ().LIZ(str, c06g4LIZJ, EnumC1581606He.STREAK_PET));
    }

    public static void LJFF(StreakPetDataWrapper streakPetDataWrapper) {
        String str;
        String str2;
        String strLIZIZ;
        if (((Boolean) C136400fa.LIZ.getValue()).booleanValue()) {
            StreakPetData streakPetData = streakPetDataWrapper.streakPetData;
            if (streakPetData != null && (str2 = streakPetData.conversationId) != null && (strLIZIZ = C1571306Df.LIZIZ(str2)) != null) {
                UserInteractionRecord userInteractionRecord = new UserInteractionRecord(strLIZIZ, C1567806Bw.LIZJ(str2), EnumC1581606He.STREAK_PET, C051M.LJ(streakPetDataWrapper, false));
                IMContactApi.LIZ.getClass();
                C069P.LIZ().LIZIZ().LIZIZ(userInteractionRecord);
                return;
            }
            return;
        }
        StreakPetData streakPetData2 = streakPetDataWrapper.streakPetData;
        if (streakPetData2 == null || (str = streakPetData2.conversationId) == null) {
            return;
        }
        UserInteractionRecord userInteractionRecord2 = new UserInteractionRecord(str, C1567806Bw.LIZJ(str), EnumC1581606He.STREAK_PET, C051M.LJ(streakPetDataWrapper, false));
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LIZIZ().LIZIZ(userInteractionRecord2);
    }

    public final void LJII(StreakPetData streakPetData) {
        StreakPetData streakPetData2;
        boolean z;
        boolean z2;
        synchronized (this.LIZIZ) {
            try {
                String str = streakPetData.conversationId;
                if (str == null) {
                    return;
                }
                StreakPetDataWrapper streakPetDataWrapperLJ = LJ(str);
                if (streakPetDataWrapperLJ != null) {
                    streakPetData2 = streakPetDataWrapperLJ.streakPetData;
                } else {
                    streakPetData2 = null;
                }
                if (streakPetData2 == null) {
                    int iLIZIZ = C1567806Bw.LIZIZ(str);
                    if ((!C296670Bk1.LIZ() || iLIZIZ != AbstractC1711506n3.LIZIZ) && (!C06D3.LIZ() || iLIZIZ != AbstractC1711506n3.LIZ)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    StreakExtension streakExtensionLIZ = C06HT.LIZ(str);
                    if (streakExtensionLIZ != null && streakExtensionLIZ.shouldDisplayPromotionalWidget) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z || !z2) {
                        C1590806Ks.LIZIZ("updateStreakPetVisibility failed, pre-check failed.");
                        return;
                    }
                }
                StreakPetDataWrapper streakPetDataWrapper = new StreakPetDataWrapper(streakPetData);
                boolean z3 = C1590806Ks.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("saveStreakPetDataWithLock ");
                sbLIZ.append(str);
                sbLIZ.append(" new data ");
                sbLIZ.append(streakPetData);
                C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                LJFF(streakPetDataWrapper);
                this.LIZJ.getClass();
                C06C6.LJFF(str, streakPetData2, streakPetData);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJI(BusinessCommandMessage businessCommandMessage, String str, C1CA6 c1ca6, C06CF c06cf) {
        Object objLJIIJ;
        String scene = str;
        String conversationId = businessCommandMessage.getConversationId();
        C2239531Cl5 c2239531Cl5 = c1ca6.pet_value;
        List<C1CA0> list = c1ca6.action_infos;
        if (conversationId == null) {
            objLJIIJ = null;
        } else {
            try {
                objLJIIJ = C1571306Df.LJIIJ(c2239531Cl5, conversationId, businessCommandMessage.getCreateTime());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                objLJIIJ = new C098200Yq(th);
                C189200o6.m2constructorimpl(objLJIIJ);
            }
        }
        C189200o6.m2constructorimpl(objLJIIJ);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLJIIJ);
        if (thM5exceptionOrNullimpl != null) {
            boolean z = C1590806Ks.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceiveCmdMessage toStreakPetData ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            sbLIZ.append(' ');
            sbLIZ.append(c2239531Cl5);
            C1590806Ks.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C189200o6.m7isFailureimpl(objLJIIJ)) {
            objLJIIJ = null;
        }
        StreakPetData streakPetData = (StreakPetData) objLJIIJ;
        C06C6 c06c6 = this.LIZJ;
        if (scene == null) {
            scene = businessCommandMessage.getScene();
        }
        c06c6.getClass();
        C1572806Du.LL.Q1(streakPetData, scene, list);
        boolean z2 = C1590806Ks.LIZ;
        C1590806Ks.LIZ("onReceiveCmdMessage-" + c1ca6.cmd_type + ' ' + c2239531Cl5 + ' ' + streakPetData + ' ' + C13LP.LJJLIIIJ(list, "action=", null, null, 0, null, AFwS229S0000000_2.get$arr$(580), 30) + " logid=" + businessCommandMessage.getLogId());
        c06cf.LIZIZ = C13LP.LJJLIIIJ(list, "action=", null, null, 0, null, AFwS229S0000000_2.get$arr$(581), 30);
        if (LIZ(streakPetData, null, null, businessCommandMessage.getCreateTime(), false, c06cf, businessCommandMessage.getLogId())) {
            Function1<C0Y7K, Unit> onResult = businessCommandMessage.getOnResult();
            if (onResult != null) {
                onResult.invoke(new C867580Y1s(null));
                return;
            }
            return;
        }
        Function1<C0Y7K, Unit> onResult2 = businessCommandMessage.getOnResult();
        if (onResult2 == null) {
            return;
        }
        onResult2.invoke(new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, "Saving streak command to DB failed", (Integer) null, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:6:0x0014, B:9:0x0028, B:11:0x0031, B:13:0x0035, B:18:0x003f, B:20:0x0077, B:21:0x0079, B:24:0x00a9, B:29:0x00bc, B:30:0x00be, B:38:0x00d1, B:40:0x00db, B:42:0x00e3, B:44:0x00eb, B:47:0x00f5, B:52:0x0104, B:55:0x010e, B:56:0x0110, B:58:0x0170, B:59:0x017e, B:49:0x00f9, B:51:0x0100, B:35:0x00cb), top: B:66:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[Catch: all -> 0x0190, TRY_ENTER, TryCatch #0 {all -> 0x0190, blocks: (B:6:0x0014, B:9:0x0028, B:11:0x0031, B:13:0x0035, B:18:0x003f, B:20:0x0077, B:21:0x0079, B:24:0x00a9, B:29:0x00bc, B:30:0x00be, B:38:0x00d1, B:40:0x00db, B:42:0x00e3, B:44:0x00eb, B:47:0x00f5, B:52:0x0104, B:55:0x010e, B:56:0x0110, B:58:0x0170, B:59:0x017e, B:49:0x00f9, B:51:0x0100, B:35:0x00cb), top: B:66:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData r32, java.lang.String r33, java.util.Map<java.lang.String, java.lang.String> r34, long r35, boolean r37, X.C06CF r38, java.lang.String r39) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1569106Cj.LIZ(com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData, java.lang.String, java.util.Map, long, boolean, X.06CF, java.lang.String):boolean");
    }
}
