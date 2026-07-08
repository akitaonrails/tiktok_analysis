package X;

import Y.ARunnableS30S0101000_19;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceItemBridge;
import com.ss.android.ugc.aweme.tako.TakoServiceImpl;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import com.ss.android.ugc.aweme.tako.experiment.TakoInfoModel;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.FeedEnterAwemeInfo;
import com.ss.android.ugc.aweme.tako.model.FeedIconBubbleInfo;
import com.ss.android.ugc.aweme.tako.model.FeedbarDrawCreateInfo;
import com.ss.android.ugc.aweme.tako.model.NimbleParams;
import com.ss.android.ugc.aweme.tako.model.SearchBingItem;
import com.ss.android.ugc.aweme.tako.model.SearchVideoItem;
import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.model.SuggestionWordInfo;
import com.ss.android.ugc.aweme.tako.model.TakoActionItem;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.model.TakoEntranceRequestInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import com.ss.android.ugc.aweme.tako.model.TakoImageItem;
import com.ss.android.ugc.aweme.tako.model.TakoSettingsEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.TakoBehaviorCollectData;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpData;
import com.ss.android.ugc.aweme.tako.router.model.TakoChatContainerData;
import com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS185S0400000_30;
import kotlin.jvm.internal.AwS491S0200000_30;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ybg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1864020ybg implements InterfaceC1864030ybh {
    public static final C1864020ybg LIZ = new C1864020ybg();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(702));
    public static final Map<String, Long> LIZJ = new LinkedHashMap();
    public static final Map<String, Aweme> LIZLLL = new LinkedHashMap();

    public static long LJIIJ(TakoEnterParams takoEnterParams) {
        String str;
        TakoBehaviorCollectData takoBehaviorCollectData = takoEnterParams.behaviorCollectData;
        if (takoBehaviorCollectData != null) {
            str = takoBehaviorCollectData.enterAwemeId;
        } else {
            str = null;
        }
        Long l = (Long) ((LinkedHashMap) LIZJ).get(str);
        if (l != null) {
            return l.longValue();
        }
        return takoEnterParams.videoLongestConsumptionDuration;
    }

    @Override // X.InterfaceC1864030ybh
    public final String LIZIZ(C2189821An6 c2189821An6) {
        String eventType;
        C14TF c14tf = C14TF.LIZIZ;
        if (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) {
            eventType = "";
        }
        return c14tf.LJIJJLI(eventType);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0g7H, java.lang.Object] */
    public static boolean LIZLLL(Context context, TakoEnterParams takoEnterParams) {
        final String screenType;
        EnumC1864410ycJ enumC1864410ycJ;
        boolean z;
        String value;
        String str;
        String str2;
        EnumC1864040ybi enumC1864040ybi;
        C1153170g79.LIZ.getClass();
        final Long lValueOf = null;
        if (((Boolean) C1153170g79.LIZIZ.getValue()).booleanValue()) {
            C1862720yZa.LIZ.getClass();
            C19EG c19egLIZ = C1862720yZa.LIZ(context);
            if (c19egLIZ != null) {
                Fragment fragmentLIZIZ = C1862720yZa.LIZIZ(c19egLIZ, C20230914Dz.LIZLLL(c19egLIZ));
                if ((fragmentLIZIZ instanceof TakoBaseFragment) && fragmentLIZIZ != null) {
                    TakoBaseFragment takoBaseFragment = (TakoBaseFragment) fragmentLIZIZ;
                    boolean zIsAdded = takoBaseFragment.isAdded();
                    boolean zIsVisible = takoBaseFragment.isVisible();
                    boolean z2 = !takoBaseFragment.isHidden();
                    Lifecycle.State currentState = takoBaseFragment.getLifecycle().getCurrentState();
                    boolean zIsAtLeast = currentState.isAtLeast(Lifecycle.State.STARTED);
                    C1153230g7F.LIZ.getClass();
                    if (!((Boolean) C1153230g7F.LIZJ.getValue()).booleanValue() ? !(!zIsAdded || !zIsVisible || !z2 || !zIsAtLeast) : !((enumC1864040ybi = takoBaseFragment.LLLILZJ) != EnumC1864040ybi.ON_CREATE && enumC1864040ybi != EnumC1864040ybi.ON_CREATE_VIEW && enumC1864040ybi != EnumC1864040ybi.ON_VIEW_CREATED && enumC1864040ybi != EnumC1864040ybi.ON_START && enumC1864040ybi != EnumC1864040ybi.ON_RESUME && (!zIsAdded || !z2 || !zIsAtLeast || !zIsVisible))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    EnumC1864040ybi enumC1864040ybi2 = takoBaseFragment.LLLILZJ;
                    if (enumC1864040ybi2 != null) {
                        value = enumC1864040ybi2.getValue();
                    } else {
                        value = null;
                    }
                    C1153180g7A.LIZ.getClass();
                    if (!((Boolean) C1153180g7A.LIZIZ.getValue()).booleanValue()) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJ(Boolean.valueOf(z), "isShowing");
                        if (takoEnterParams != null) {
                            str = takoEnterParams.enterMethod;
                        } else {
                            str = null;
                        }
                        c2344009Gk.LJIIIIZZ("enter_method", str);
                        if (takoEnterParams != null) {
                            str2 = takoEnterParams.enterFrom;
                        } else {
                            str2 = null;
                        }
                        c2344009Gk.LJIIIIZZ("enter_from", str2);
                        c2344009Gk.LJ(Boolean.valueOf(zIsAdded), "fragmentIsAdded");
                        c2344009Gk.LJ(Boolean.valueOf(zIsVisible), "fragmentIsVisible");
                        c2344009Gk.LJ(Boolean.valueOf(z2), "fragmentIsHidden");
                        c2344009Gk.LJ(currentState, "currentState");
                        c2344009Gk.LJIIIIZZ("showingState", value);
                        C20684815ws.LJIILLIIL("search_tako_debounce_fragment_state", c2344009Gk.LIZ);
                    }
                    if (z) {
                        C1163320gNW.LIZ(takoEnterParams, EnumC1153600g7q.FRAGMENT_HAS_SHOW);
                        return false;
                    }
                }
            }
        }
        C1153120g74.LIZ.getClass();
        if (((Number) C1153120g74.LIZIZ.getValue()).longValue() > 0) {
            C1153240g7G c1153240g7G = (C1153240g7G) LIZIZ.getValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1153240g7G.getClass();
            final String str3 = takoEnterParams.enterFrom;
            final String str4 = takoEnterParams.enterMethod;
            TakoChatContainerData takoChatContainerData = takoEnterParams.chatContainerData;
            if ((takoChatContainerData == null || (enumC1864410ycJ = takoChatContainerData.screenType) == null || (screenType = enumC1864410ycJ.getValue()) == null) && (screenType = takoEnterParams.getScreenType()) == null) {
                screenType = "";
            }
            AIBotInfo aIBotInfo = takoEnterParams.botInfo;
            if (aIBotInfo != null) {
                lValueOf = Long.valueOf(aIBotInfo.botId);
            }
            ?? r7 = new Object(str3, str4, screenType, lValueOf) { // from class: X.0g7H
                public final String LIZ;
                public final String LIZIZ;
                public final String LIZJ;
                public final Long LIZLLL;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1153250g7H)) {
                        return false;
                    }
                    C1153250g7H c1153250g7H = (C1153250g7H) obj;
                    return Intrinsics.LJFF(this.LIZ, c1153250g7H.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1153250g7H.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1153250g7H.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1153250g7H.LIZLLL);
                }

                public final int hashCode() {
                    int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
                    Long l = this.LIZLLL;
                    return iHashCode + (l == null ? 0 : l.hashCode());
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("EnterKey(enterFrom=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", enterMethod=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", screenType=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", botId=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = str3;
                    this.LIZIZ = str4;
                    this.LIZJ = screenType;
                    this.LIZLLL = lValueOf;
                }
            };
            if (Intrinsics.LJFF(r7, c1153240g7G.LIZIZ) && jCurrentTimeMillis - c1153240g7G.LIZJ < c1153240g7G.LIZ) {
                C1163320gNW.LIZ(takoEnterParams, EnumC1153600g7q.DOUBLE_CLICK);
                return false;
            }
            c1153240g7G.LIZIZ = r7;
            c1153240g7G.LIZJ = jCurrentTimeMillis;
        }
        return true;
    }

    public static void LJIILIIL(Context context, AbstractC1864010ybf abstractC1864010ybf) {
        List<? extends Aweme> list;
        Fragment fragmentLIZLLL;
        String strLIZ = abstractC1864010ybf.LIZ();
        String strLIZIZ = abstractC1864010ybf.LIZIZ();
        long j = abstractC1864010ybf.LIZ;
        InterfaceC19396010uU interfaceC19396010uU = null;
        TakoEnterParams takoEnterParams = new TakoEnterParams(strLIZ, strLIZIZ, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Long.valueOf(j), false, null, null, 0L, 0L, null, abstractC1864010ybf.LIZIZ, null, null, null, null, null, null, null, abstractC1864010ybf.LIZLLL, false, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, abstractC1864010ybf.LJFF, abstractC1864010ybf.LJ, abstractC1864010ybf.LJI, abstractC1864010ybf.LJII, abstractC1864010ybf.LJIIIIZZ, abstractC1864010ybf.LJIIIZ, abstractC1864010ybf.LJIIJ, abstractC1864010ybf.LJIIJJI, abstractC1864010ybf.LIZJ, -4, -65795, 1, null);
        LIZ.getClass();
        if (!LIZLLL(context, takoEnterParams)) {
            return;
        }
        TakoEnterMethodListExperiment.LIZIZ = takoEnterParams.enterMethod;
        C1858080yS6.LIZ.LIZ(takoEnterParams.processId);
        InterfaceC19395910uT interfaceC19395910uT = null;
        view = null;
        View view = null;
        if (((Boolean) C0AXA.LIZ.getValue()).booleanValue() && TakoEnterMethodListExperiment.LIZ(false) && !C342201Um.LIZIZ) {
            C342201Um.LIZIZ = true;
            C23250099c.LIZLLL((InterfaceC497601wk) C342201Um.LIZJ.getValue(), null, null, new C342101Ul(System.currentTimeMillis(), null), 3);
        }
        if (C20227614Cs.LIZ(abstractC1864010ybf.LIZLLL)) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (fragmentLIZLLL = abstractC1387200mCcLJ.LIZLLL()) != null) {
                view = fragmentLIZLLL.getView();
            }
            LJIIJJI(context, takoEnterParams, view);
            return;
        }
        if (C1862270yYr.LIZ(takoEnterParams)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C325200Cow(takoEnterParams, null), 3);
        }
        TakoCarriedUpData takoCarriedUpData = abstractC1864010ybf.LJIIIIZZ;
        if (takoCarriedUpData != null) {
            list = takoCarriedUpData.answerAwemeListCache;
        } else {
            list = null;
        }
        C13MK.LIZLLL(new AwS546S0100000_2(list, (List<? extends BaseComponentData>) 1074));
        if (!Intrinsics.LJFF(takoEnterParams.getScreenType(), "full_screen")) {
            boolean zLJFF = Intrinsics.LJFF(takoEnterParams.getScreenType(), "seven_split_screen");
            C20229014Dg c20229014Dg = abstractC1864010ybf.LJI.sevenScreenListeners;
            if (c20229014Dg != null) {
                interfaceC19396010uU = c20229014Dg.LIZ;
                interfaceC19395910uT = c20229014Dg.LIZIZ;
            }
            LJIIIIZZ(context, takoEnterParams, zLJFF, interfaceC19396010uU, interfaceC19395910uT);
            return;
        }
        LIZ.LJI(context, takoEnterParams);
    }

    public static void LJIILLIIL(long j, String str) {
        long jLongValue;
        if (str != null) {
            try {
                C1864420ycK.LIZ = str;
                Map<String, Long> map = LIZJ;
                Long l = (Long) ((LinkedHashMap) map).get(str);
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                map.put(str, Long.valueOf(Math.max(j, jLongValue)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "TAKO_ANR_OPT");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        if (r1 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119 A[PHI: r18
      0x0119: PHI (r18v10 boolean) = (r18v2 boolean), (r18v11 boolean) binds: [B:41:0x00d6, B:65:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011e A[PHI: r18 r19
      0x011e: PHI (r18v9 boolean) = (r18v3 boolean), (r18v10 boolean) binds: [B:44:0x00e0, B:68:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r19v8 boolean) = (r19v2 boolean), (r19v9 boolean) binds: [B:44:0x00e0, B:68:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0123 A[PHI: r18 r19 r20
      0x0123: PHI (r18v8 boolean) = (r18v4 boolean), (r18v9 boolean) binds: [B:47:0x00ea, B:71:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r19v7 boolean) = (r19v3 boolean), (r19v8 boolean) binds: [B:47:0x00ea, B:71:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r20v6 boolean) = (r20v2 boolean), (r20v7 boolean) binds: [B:47:0x00ea, B:71:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0128 A[PHI: r18 r19 r20 r21
      0x0128: PHI (r18v7 boolean) = (r18v5 boolean), (r18v8 boolean) binds: [B:50:0x00f4, B:74:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r19v6 boolean) = (r19v4 boolean), (r19v7 boolean) binds: [B:50:0x00f4, B:74:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r20v5 boolean) = (r20v3 boolean), (r20v6 boolean) binds: [B:50:0x00f4, B:74:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r21v4 boolean) = (r21v2 boolean), (r21v5 boolean) binds: [B:50:0x00f4, B:74:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(android.content.Context r26, com.ss.android.ugc.aweme.tako.model.TakoEnterParams r27) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1864020ybg.LJI(android.content.Context, com.ss.android.ugc.aweme.tako.model.TakoEnterParams):void");
    }

    public static void LJFF(C19EG c19eg, TakoEnterParams takoEnterParams, InterfaceC1631620sYq interfaceC1631620sYq) {
        if (!C1863380yae.LJJII.LJII(Integer.valueOf(takoEnterParams.botInfo.botSource), Long.valueOf(takoEnterParams.botInfo.botId), null) && C1859007Pw.LIZ()) {
            C324800CoI.LIZ.getClass();
            if (!C324800CoI.LIZ()) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19eg), C0PEM.LIZJ, null, new C324980Coa(takoEnterParams, c19eg, System.currentTimeMillis(), interfaceC1631620sYq, null), 2);
                return;
            }
        }
        interfaceC1631620sYq.invoke(Boolean.FALSE, 0L, null);
    }

    public static final void LJIIIZ(Context context, Map<String, String> map, Map<String, String> map2) {
        long botId;
        int botSource;
        TakoSettingsEnterParams takoSettingsEnterParams = new TakoSettingsEnterParams("", "", "", "", "", 1L, "", 1, "");
        String enterFrom = (String) C1856050yOp.LIZIZ("enter_from", map2);
        if (enterFrom == null) {
            enterFrom = takoSettingsEnterParams.getEnterFrom();
        }
        takoSettingsEnterParams.setEnterFrom(enterFrom);
        String enterMethod = (String) C1856050yOp.LIZIZ("enter_method", map2);
        if (enterMethod == null) {
            enterMethod = takoSettingsEnterParams.getEnterMethod();
        }
        takoSettingsEnterParams.setEnterMethod(enterMethod);
        String processId = (String) C1856050yOp.LIZIZ("process_id", map2);
        if (processId == null) {
            processId = takoSettingsEnterParams.getProcessId();
        }
        takoSettingsEnterParams.setProcessId(processId);
        String takoSessionId = (String) C1856050yOp.LIZIZ("tako_session_id", map2);
        if (takoSessionId == null) {
            takoSessionId = takoSettingsEnterParams.getTakoSessionId();
        }
        takoSettingsEnterParams.setTakoSessionId(takoSessionId);
        String takoChatId = (String) C1856050yOp.LIZIZ("tako_chat_id", map2);
        if (takoChatId == null) {
            takoChatId = takoSettingsEnterParams.getTakoChatId();
        }
        takoSettingsEnterParams.setTakoChatId(takoChatId);
        String searchId = (String) C1856050yOp.LIZIZ("search_id", map2);
        if (searchId == null) {
            searchId = takoSettingsEnterParams.getSearchId();
        }
        takoSettingsEnterParams.setSearchId(searchId);
        String str = (String) C1856050yOp.LIZIZ("bot_id", map2);
        if (str != null) {
            botId = CastLongProtector.parseLong(str);
        } else {
            botId = takoSettingsEnterParams.getBotId();
        }
        takoSettingsEnterParams.setBotId(botId);
        String str2 = (String) C1856050yOp.LIZIZ("chat_bot_source", map2);
        if (str2 != null) {
            botSource = CastIntegerProtector.parseInt(str2);
        } else {
            botSource = takoSettingsEnterParams.getBotSource();
        }
        takoSettingsEnterParams.setBotSource(botSource);
        String str3 = (String) C1856050yOp.LIZIZ("intent_type", map);
        if (str3 == null) {
            str3 = "";
        }
        takoSettingsEnterParams.setIntentType(str3);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//tako/settings");
        smartRouteBuildRoute.withParam("tako_settings_enter_param", takoSettingsEnterParams);
        smartRouteBuildRoute.open();
    }

    public static void LJIIJJI(Context context, TakoEnterParams takoEnterParams, View view) {
        AIBotInfo aIBotInfo = takoEnterParams.botInfo;
        long j = aIBotInfo.botId;
        if (j != 0 && j != 1 && aIBotInfo.botSource == 2 && 1 != 0) {
            if (C298860BnY.LIZ()) {
                LIZ.getClass();
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C063D(takoEnterParams, context, view, null), 3);
            } else {
                LIZ.getClass();
                C20232914Et c20232914Et = TakoServiceImpl.LJIIIIZZ;
                C20232914Et.LIZIZ();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1863880ybS(takoEnterParams, context, null), 3);
            }
        }
    }

    public static void LJIIL(TakoEnterParams takoEnterParams, boolean z, long j, String str) {
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str2 = takoEnterParams.processId;
        String str3 = takoEnterParams.enterFrom;
        String str4 = takoEnterParams.enterMethod;
        String subProcessId = takoEnterParams.getSubProcessId();
        String subEnterMethod = takoEnterParams.getSubEnterMethod();
        if (subEnterMethod == null) {
            subEnterMethod = "";
        }
        String strValueOf = String.valueOf(takoEnterParams.botInfo.botId);
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("process_id", str2);
        jSONObject.put("enter_from", str3);
        jSONObject.put("enter_method", str4);
        jSONObject.put("result", z);
        jSONObject.put("cost", j);
        jSONObject.put("reason", str);
        jSONObject.put("sub_process_id", subProcessId);
        jSONObject.put("sub_enter_method", subEnterMethod);
        jSONObject.put("bot_id", strValueOf);
        c20235014FoLIZ.LIZIZ("tikbot_perf_enter_aibot_result", jSONObject);
    }

    public static void LJIIIIZZ(Context context, TakoEnterParams takoEnterParams, boolean z, InterfaceC19396010uU interfaceC19396010uU, InterfaceC19395910uT interfaceC19395910uT) {
        String str;
        Activity activityLIZ;
        if (takoEnterParams != null) {
            str = takoEnterParams.enterMethod;
        } else {
            str = null;
        }
        TakoEnterMethodListExperiment.LIZIZ = str;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C14TF.LIZIZ.LJJJIL(activityLIZ, false, takoEnterParams.getSugSource(), z);
        }
        IFamilyPairingService iFamilyPairingServiceLJIIL = ComplianceServiceProvider.LJIIL();
        if (iFamilyPairingServiceLJIIL != null && iFamilyPairingServiceLJIIL.LJIIIZ()) {
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZIZ(2131834392);
            c1233040iBy.LIZLLL();
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = takoEnterParams.enterFrom;
            String str3 = takoEnterParams.enterMethod;
            c1862330yYx.getClass();
            C1862330yYx.LJIIIZ(str2, str3, false);
            return;
        }
        if (!C14FR.LIZ.LJIILIIL()) {
            C1862330yYx c1862330yYx2 = C1862330yYx.LIZ;
            String str4 = takoEnterParams.enterFrom;
            String str5 = takoEnterParams.enterMethod;
            c1862330yYx2.getClass();
            C1862330yYx.LJIIIZ(str4, str5, false);
            return;
        }
        if (context != null) {
            C0CS4.LIZIZ();
            C1864020ybg c1864020ybg = LIZ;
            TakoInfoModel takoInfoModel = C1852920yJm.LIZ;
            if (C123100dR.LIZ(takoInfoModel.botId) && C123100dR.LIZ(takoInfoModel.botName) && C123100dR.LIZ(C14TF.LIZIZ.LJJLIIIJLLLLLLLZ()) && c1864020ybg != null) {
                if (z) {
                    c1864020ybg.getClass();
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                    if (c19egLIZIZ != null) {
                        LJFF(c19egLIZIZ, takoEnterParams, new AwS185S0400000_30(takoEnterParams, interfaceC19396010uU, interfaceC19395910uT, c19egLIZIZ, 1));
                        return;
                    }
                    return;
                }
                c1864020ybg.getClass();
                C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ2 == null) {
                    return;
                }
                LJFF(c19egLIZIZ2, takoEnterParams, new AwS491S0200000_30(c19egLIZIZ2, takoEnterParams, 2));
                return;
            }
            c1864020ybg.getClass();
            C20232914Et c20232914Et = TakoServiceImpl.LJIIIIZZ;
            C20232914Et.LIZIZ();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1863880ybS(takoEnterParams, context, null), 3);
        }
    }

    @InterfaceC1294060jmO
    public static void LJIILJJIL(Context context, TakoEnterParams takoEnterParams, View view, List list, boolean z, InterfaceC19396010uU interfaceC19396010uU, InterfaceC19395910uT interfaceC19395910uT) {
        String str;
        if (context != null) {
            LIZ.getClass();
            if (!LIZLLL(context, takoEnterParams)) {
                return;
            }
            if (takoEnterParams != null) {
                str = takoEnterParams.enterMethod;
            } else {
                str = null;
            }
            TakoEnterMethodListExperiment.LIZIZ = str;
            C1858080yS6.LIZ.LIZ(takoEnterParams.processId);
            if (C20227614Cs.LIZ(takoEnterParams.botInfo)) {
                LJIIJJI(context, takoEnterParams, view);
                return;
            }
            if (C1862270yYr.LIZ(takoEnterParams)) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C325200Cow(takoEnterParams, null), 3);
            }
            if (takoEnterParams.openBySheet) {
                LJIIIIZZ(context, takoEnterParams, z, interfaceC19396010uU, interfaceC19395910uT);
            } else {
                C13MK.LIZLLL(new AwS546S0100000_2(list, (List<? extends BaseComponentData>) 1074));
                LIZ.LJI(context, takoEnterParams);
            }
        }
    }

    public static void LJIILL(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        if (str5 == null || str5.length() <= 0) {
            str5 = "full_screen";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//tako/ai_video/detail");
        smartRouteBuildRoute.withParam("video_from", "tako_ai_video_feed_video_from");
        smartRouteBuildRoute.withParam("enter_from", str2);
        smartRouteBuildRoute.withParam("enter_method", str3);
        smartRouteBuildRoute.withParam("tako_video_session_id", UUID.randomUUID().toString());
        smartRouteBuildRoute.withParam("tako_video_from_tako_inner", z);
        smartRouteBuildRoute.withParam("tako_screen_type", str5);
        if (str4 == null) {
            str4 = "";
        }
        smartRouteBuildRoute.withParam("tako_session_id", str4);
        if (str6 == null) {
            str6 = "";
        }
        smartRouteBuildRoute.withParam("tako_session_source", str6);
        if (str == null || str.length() == 0) {
            str = UUID.randomUUID().toString();
        }
        smartRouteBuildRoute.withParam("process_id", str);
        smartRouteBuildRoute.open();
    }

    public static void LJII(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6, View view) {
        boolean z2;
        String str7;
        String str8;
        if (context == null) {
            return;
        }
        C1606550ruP.LIZ.getClass();
        if (C1606550ruP.LIZ()) {
            BusinessCapabilityService.LIZ.getClass();
            BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
            if (businessCapabilityServiceLIZ != null) {
                EnumC1355300lNA enumC1355300lNA = EnumC1355300lNA.TAKO_AIVIDEO;
                businessCapabilityServiceLIZ.LIZ(enumC1355300lNA);
                AbstractC1883407Zg abstractC1883407ZgLJII = businessCapabilityServiceLIZ.LJII(enumC1355300lNA, C13LQ.LJLIIL(new EnumC1355290lN9[]{EnumC1355290lN9.AUDIO_FOCUS, EnumC1355290lN9.MICROPHONE}));
                if ((abstractC1883407ZgLJII instanceof C1883307Zf) && ((C1883307Zf) abstractC1883407ZgLJII).LIZIZ.contains(EnumC1355300lNA.VOICE_CALL)) {
                    z2 = true;
                    if (str5 != null && str5.length() > 0) {
                        str7 = str5;
                    } else {
                        str7 = "full_screen";
                    }
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    String str9 = "";
                    if (str2 == null) {
                        str8 = "";
                    } else {
                        str8 = str2;
                    }
                    if (str3 != null) {
                        str9 = str3;
                    }
                    C1862330yYx.LJIIJJI(c1862330yYx, str8, str9, str, str4, str6, str7, null);
                    if (view != null) {
                        C1212040he6.LIZIZ(2131822589, view);
                    } else {
                        Activity activityLIZ = C1388190mED.LIZ(context);
                        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                            C1212040he6.LIZJ(2131822589, activityLIZ);
                        } else {
                            C786410Ut5.LJJZZIII(C1212040he6.LIZ, new ARunnableS30S0101000_19(activityLIZ, 7));
                        }
                    }
                } else {
                    z2 = false;
                }
                businessCapabilityServiceLIZ.LIZJ(enumC1355300lNA);
                if (!(!z2)) {
                    return;
                }
            }
        }
        Activity activityLIZ2 = C1388190mED.LIZ(context);
        if (activityLIZ2 != null) {
            C1687300u0e.LIZ.getClass();
            if (((Number) C1687300u0e.LIZIZ.getValue()).intValue() != 2) {
                C449180HjQ c449180HjQ = C449180HjQ.LIZ;
                c449180HjQ.getClass();
                if (!C449180HjQ.LIZJ(activityLIZ2)) {
                    C141D c141d = new C141D(context, str, str2, str3, z, str4, str5, str6);
                    c449180HjQ.getClass();
                    C449180HjQ.LJ(activityLIZ2, c141d);
                    return;
                }
            }
        }
        LJIILL(context, str, str2, str3, z, str4, str5, str6);
    }

    @Override // X.InterfaceC1864030ybh
    public final void LIZ(Context context, String str, String str2, long j, AIBotInfo aIBotInfo, String str3, String str4, String str5, Map map, String str6, String str7, boolean z) {
        boolean zLJFF;
        String str8;
        Object objLIZIZ;
        if (map != null) {
            zLJFF = Intrinsics.LJFF(C1856050yOp.LIZIZ("is_intent", map), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        Integer num = null;
        if (zLJFF) {
            str8 = str4;
        } else {
            str8 = null;
        }
        if (map != null) {
            objLIZIZ = C1856050yOp.LIZIZ("card_type", map);
        } else {
            objLIZIZ = null;
        }
        if (objLIZIZ instanceof Integer) {
            num = (Integer) objLIZIZ;
        }
        C1864050ybj.LIZ(this, context, str, str2, j, null, str3, str4, str8, null, null, null, null, null, null, null, null, null, null, null, null, null, new TakoEventTracker(str3, "", num, "", null, 0), null, false, null, null, "tt_ai_bot", aIBotInfo, str5, str7, str6, null, z, null, null, null, null, null, null, null, null, null, null, null, null, null, -1883242736, 134217683);
    }

    @InterfaceC1294060jmO
    public static TakoEnterParams LJ(String str, String str2, long j, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, Long l, String str10, List list2, List list3, List list4, List list5, List list6, Map map, TakoEventTracker takoEventTracker, TakoActionItem takoActionItem, boolean z, Aweme aweme, FeedbarDrawCreateInfo feedbarDrawCreateInfo, String str11, String str12, AIBotInfo aIBotInfo, String str13, String str14, Integer num, boolean z2, String str15, String str16, String str17, boolean z3, FeedIconBubbleInfo feedIconBubbleInfo, SuggestionWordInfo suggestionWordInfo, TakoEntranceRequestInfo takoEntranceRequestInfo, String str18, String str19, String str20, String str21, String str22, SmartSearchItem smartSearchItem, boolean z4, boolean z5, boolean z6, String str23, String str24, Integer num2, NimbleParams nimbleParams, C665120Q7a c665120Q7a, String str25) {
        String strLIZIZ;
        String str26;
        String str27;
        Integer num3;
        String str28;
        String str29;
        Integer numValueOf;
        ArrayList arrayList;
        String str30;
        long jLongValue;
        long jLongValue2;
        FeedEnterAwemeInfo feedEnterAwemeInfo;
        String uri;
        UrlModel cover;
        UrlModel cover2;
        Long lValueOf;
        List<String> urlList;
        UrlModel cover3;
        String string = str17;
        String str31 = str4;
        String str32 = str6;
        String str33 = str8;
        String str34 = str3;
        List<String> urlList2 = null;
        if (!z6 && C123100dR.LIZ(str34)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str34);
            sbLIZ.append('-');
            sbLIZ.append(aIBotInfo.botId);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        String str35 = "";
        if (str34 == null) {
            str34 = "";
        }
        if (str31 == null) {
            str31 = "";
        }
        if (takoEventTracker != null) {
            str26 = takoEventTracker.logId;
            str27 = takoEventTracker.messageType;
            num3 = takoEventTracker.cardType;
            str28 = takoEventTracker.messageId;
            str29 = takoEventTracker.idList;
            numValueOf = Integer.valueOf(takoEventTracker.isQuoteVideo());
        } else {
            str26 = null;
            str27 = null;
            num3 = null;
            str28 = null;
            str29 = null;
            numValueOf = null;
        }
        if (str32 == null) {
            str32 = "";
        }
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Aweme aweme2 = (Aweme) it2.next();
                String aid = aweme2.getAid();
                if (aid == null) {
                    aid = "";
                }
                AwemeStatistics statistics = aweme2.getStatistics();
                if (statistics != null) {
                    lValueOf = Long.valueOf(statistics.getDiggCount());
                } else {
                    lValueOf = null;
                }
                long jLIZIZ = C0R2Q.LIZIZ(lValueOf);
                Video video = aweme2.getVideo();
                if (video == null || (cover3 = video.getCover()) == null || (urlList = cover3.getUrlList()) == null) {
                    urlList = C13BV.INSTANCE;
                }
                arrayList.add(new SearchVideoItem(aid, jLIZIZ, urlList));
            }
        } else {
            arrayList = null;
        }
        if (str7 == null) {
            str30 = "";
        } else {
            str30 = str7;
        }
        if (str33 == null) {
            str33 = "";
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = (Long) ((LinkedHashMap) LIZJ).get(str7);
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        if (str9 != null) {
            str35 = str9;
        }
        if (aweme != null) {
            String aid2 = aweme.getAid();
            String strValueOf = String.valueOf(aweme.getAwemeType());
            Video video2 = aweme.getVideo();
            if (video2 != null && (cover2 = video2.getCover()) != null) {
                uri = cover2.getUri();
            } else {
                uri = null;
            }
            Video video3 = aweme.getVideo();
            if (video3 != null && (cover = video3.getCover()) != null) {
                urlList2 = cover.getUrlList();
            }
            feedEnterAwemeInfo = new FeedEnterAwemeInfo(aid2, strValueOf, uri, urlList2);
        } else {
            feedEnterAwemeInfo = null;
        }
        if (string == null && (!Intrinsics.LJFF(str12, "tt_generate_picture_card") || strLIZIZ == null || strLIZIZ.length() <= 0 || (string = C14FK.LIZ.get(strLIZIZ)) == null)) {
            string = UUID.randomUUID().toString();
        }
        return new TakoEnterParams(str, str2, z, str34, str31, str26, str27, num3, str13, str28, str29, numValueOf, str11, str12, str19, str18, 0, null, str5, num, str32, list, takoActionItem, strLIZIZ, str10, arrayList, list3, feedbarDrawCreateInfo, list4, list5, list6, map, num2, Long.valueOf(j), false, str30, str33, jLongValue, jLongValue2, str35, null, null, string, str16, feedEnterAwemeInfo, suggestionWordInfo, feedIconBubbleInfo, str14, aIBotInfo, z2, z4, z5, str15, str20, str21, str22, null, z3, takoEntranceRequestInfo, smartSearchItem, str23, str24, nimbleParams, c665120Q7a, str25, null, null, null, null, null, null, null, null, null, 196608, 16777988, 1022, null);
    }

    @Override // X.InterfaceC1864030ybh
    public final void LIZJ(Context context, String str, String str2, long j, View view, String str3, String str4, String str5, List<String> list, String str6, String str7, String str8, String str9, Long l, String str10, List<? extends Aweme> list2, List<String> list3, List<SearchBingItem> list4, List<TakoImageItem> list5, List<ReferenceItemBridge> list6, Map<String, String> map, List<? extends Aweme> list7, TakoEventTracker takoEventTracker, TakoActionItem takoActionItem, boolean z, Aweme aweme, FeedbarDrawCreateInfo feedbarDrawCreateInfo, String str11, String str12, AIBotInfo aIBotInfo, String str13, String str14, Integer num, boolean z2, String str15, String str16, String str17, boolean z3, FeedIconBubbleInfo feedIconBubbleInfo, SuggestionWordInfo suggestionWordInfo, TakoEntranceRequestInfo takoEntranceRequestInfo, String str18, String str19, String str20, String str21, String str22, SmartSearchItem smartSearchItem, boolean z4, boolean z5, boolean z6, boolean z7, InterfaceC19396010uU interfaceC19396010uU, InterfaceC19395910uT interfaceC19395910uT, String str23, String str24, Integer num2, NimbleParams nimbleParams, C665120Q7a c665120Q7a, String str25) {
        LJIILJJIL(context, LJ(str, str2, j, str3, str4, str5, list, str6, str7, str8, str9, l, str10, list2, list3, list4, list5, list6, map, takoEventTracker, takoActionItem, z, aweme, feedbarDrawCreateInfo, str11, str12, aIBotInfo, str13, str14, num, z2, str15, str16, str17, z3, feedIconBubbleInfo, suggestionWordInfo, takoEntranceRequestInfo, str18, str19, str20, str21, str22, smartSearchItem, z4, z5, z6, str23, str24, num2, nimbleParams, c665120Q7a, str25), view, list7, z7, interfaceC19396010uU, interfaceC19395910uT);
    }
}
