package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560380LyO {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static WeakReference<BroadcastReceiver> LJIIJJI;
    public static WeakReference<Context> LJIIL;
    public static final C560380LyO LIZ = new C560380LyO();
    public static C560350LyL LJIILIIL = new C560350LyL();
    public static boolean LJIILJJIL = true;
    public static final Map<EnumC560450LyV, Pair<String, Boolean>> LJIILL = new LinkedHashMap();
    public static final List<EnumC560450LyV> LJIILLIIL = new ArrayList();
    public static EnumC560450LyV LJIIZILJ = EnumC560450LyV.NONE;
    public static final List<Boolean> LJIJ = new ArrayList();

    public static void LIZLLL() {
        LIZLLL = true;
        LIZJ = true;
        if (LJFF || LJII || LJI) {
            C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "onActivityCreated: isFromStitch or isFromStoryMediaPicker or isFromAnchorUpload");
            return;
        }
        LJIILIIL.LJIIJ = System.currentTimeMillis();
        C560350LyL c560350LyL = LJIILIIL;
        String str = c560350LyL.LJIIIIZZ;
        long j = c560350LyL.LJIIJ;
        if (str != null) {
            C560390LyP.LIZIZ().storeString("enter_way", str);
        }
        C560390LyP.LIZIZ().storeLong("enter_time", j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Start Creation Flow (onActivityCreated): enterWay = ");
        sbLIZ.append(LJIILIIL.LJIIIIZZ);
        sbLIZ.append(", enterTime = ");
        sbLIZ.append(LJIILIIL.LJIIJ);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJ() {
        LIZLLL = false;
        C560350LyL c560350LyL = LJIILIIL;
        if (c560350LyL.LJIIJ <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SAA onActivityDestroyed: enterTime is invalid, enterTime = ");
            sbLIZ.append(c560350LyL.LJIIJ);
            C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (LJFF) {
            C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "SAA onActivityDestroyed: isFromStitch");
            LJIILLIIL(new C560470LyX(EnumC560450LyV.OTHERS, jCurrentTimeMillis));
            return;
        }
        if (LJII) {
            C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "SAA onActivityDestroyed: isFromStoryMediaPicker");
            LJIILLIIL(new C560470LyX(EnumC560450LyV.ALBUM, jCurrentTimeMillis));
            return;
        }
        if (LJI) {
            C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "SAA onActivityDestroyed: isFromAiLiveAnchor");
            LJIILLIIL(new C560470LyX(EnumC560450LyV.ALBUM, jCurrentTimeMillis));
            return;
        }
        LJIILLIIL(new C560470LyX(EnumC560450LyV.NONE, jCurrentTimeMillis));
        if (c560350LyL.LJIIIZ.length() == 0) {
            c560350LyL.LJIIIZ = "others";
        }
        if (jCurrentTimeMillis <= 0) {
            c560350LyL.LJIIJJI = jCurrentTimeMillis;
        }
        C560380LyO c560380LyO = LIZ;
        String str = c560350LyL.LJIIIIZZ;
        String str2 = c560350LyL.LJIIIZ;
        long j = c560350LyL.LJIIJ;
        c560380LyO.getClass();
        LJIIJJI(j, jCurrentTimeMillis, str, str2);
        LIZ();
    }

    public static void LJIIJ() throws Exception {
        Activity activityLIZIZ;
        final AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(565);
        final AFwS194S0000000_8 aFwS194S0000000_82 = AFwS194S0000000_8.get$arr$(566);
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.0LyQ
            public final void LIZ(Intent intent) {
                String action;
                String action2 = null;
                if (intent != null) {
                    action = intent.getAction();
                } else {
                    action = null;
                }
                if (Intrinsics.LJFF(action, "android.intent.action.USER_PRESENT")) {
                    aFwS194S0000000_8.invoke();
                    return;
                }
                if (intent != null) {
                    action2 = intent.getAction();
                }
                if (!Intrinsics.LJFF(action2, "android.intent.action.SCREEN_OFF")) {
                    return;
                }
                aFwS194S0000000_82.invoke();
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    LIZ(intent);
                } else {
                    C2408409cA.LIZ();
                    LIZ(intent);
                }
            }
        };
        LJIIJJI = new WeakReference<>(broadcastReceiver);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null) {
            LJIIJJI = null;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerScreenBroadcast: context = ");
        sbLIZ.append(activityLIZIZ);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJIJJ(activityLIZIZ, broadcastReceiver, intentFilter);
        LJIIL = new WeakReference<>(activityLIZIZ);
    }

    public static void LJIILIIL() {
        BroadcastReceiver broadcastReceiver;
        WeakReference<Context> weakReference;
        Context context;
        WeakReference<BroadcastReceiver> weakReference2 = LJIIJJI;
        if (weakReference2 != null && (broadcastReceiver = weakReference2.get()) != null && (weakReference = LJIIL) != null && (context = weakReference.get()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unregisterScreenBroadcast: context = ");
            sbLIZ.append(context);
            C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.LJJIFFI(context, broadcastReceiver);
        }
        LJIIJJI = null;
        LJIIL = null;
    }

    public static void LIZ() {
        C560390LyP.LIZ();
        try {
            LJIILIIL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unregisterScreenBroadcast: error = ");
            sbLIZ.append(e.getMessage());
            sbLIZ.append(" \n ");
            sbLIZ.append(e.getStackTrace());
            C201955140j.LJFF("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        }
        LIZIZ = false;
        LIZJ = false;
        LJ = false;
        LJFF = false;
        LJI = false;
        LJII = false;
        LJIIIIZZ = false;
        LJIIIZ = false;
        LJIIJ = false;
        LJIILIIL = new C560350LyL();
        LJIILJJIL = true;
        ((LinkedHashMap) LJIILL).clear();
        ((ArrayList) LJIILLIIL).clear();
        ((ArrayList) LJIJ).clear();
    }

    public static void LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClickPublish: clickFrom = ");
        sbLIZ.append(str);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        LJIIIIZZ("publish");
    }

    public static void LJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClickSaveDraft: clickFrom = ");
        sbLIZ.append(str);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        LJIIIIZZ("save_draft");
    }

    public static void LJIIIIZZ(String str) {
        C560350LyL c560350LyL = LJIILIIL;
        c560350LyL.LJIIJJI = System.currentTimeMillis();
        c560350LyL.LJIIIZ = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNormalLeave: leaveWay = ");
        sbLIZ.append(str);
        sbLIZ.append(", leaveTime = ");
        sbLIZ.append(c560350LyL.LJIIJJI);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        LJIILLIIL(new C560470LyX(EnumC560450LyV.NONE, c560350LyL.LJIIJJI));
        C560380LyO c560380LyO = LIZ;
        String str2 = c560350LyL.LJIIIIZZ;
        long j = c560350LyL.LJIIJ;
        long j2 = c560350LyL.LJIIJJI;
        c560380LyO.getClass();
        LJIIJJI(j, j2, str2, str);
        LIZJ = false;
        C560390LyP.LIZ();
    }

    public static final void LJIILLIIL(C560470LyX c560470LyX) {
        EnumC560450LyV enumC560450LyV;
        EnumC560450LyV enumC560450LyV2 = c560470LyX.LIZ;
        long j = c560470LyX.LIZIZ;
        if (!LIZJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateCurrentPage: not in creation flow, newPage = ");
            sbLIZ.append(enumC560450LyV2);
            C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C560350LyL c560350LyL = LJIILIIL;
        EnumC560450LyV enumC560450LyV3 = c560350LyL.LJIILIIL;
        ArrayList arrayList = (ArrayList) LJIILLIIL;
        if (!arrayList.isEmpty()) {
            Object objLJJLIIIJJI = C13LP.LJJLIIIJJI(arrayList);
            EnumC560450LyV enumC560450LyV4 = EnumC560450LyV.NONE;
            if (objLJJLIIIJJI != enumC560450LyV4 && enumC560450LyV2 == C13LP.LJJLIIIJJI(arrayList) && enumC560450LyV3 != enumC560450LyV4 && enumC560450LyV3 != (enumC560450LyV = EnumC560450LyV.ALBUM)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateCurrentPage: old page = ");
                sbLIZ2.append(enumC560450LyV3);
                sbLIZ2.append(", new page = ");
                sbLIZ2.append(enumC560450LyV2);
                sbLIZ2.append(" -> ALBUM, enterTime = ");
                sbLIZ2.append(j);
                C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ2));
                long j2 = c560350LyL.LJIILJJIL;
                LIZ.getClass();
                LJIIL(enumC560450LyV3, j2, j);
                c560350LyL.LJIIL = enumC560450LyV3;
                c560350LyL.LJIILIIL = enumC560450LyV;
                c560350LyL.LJIILJJIL = j;
                return;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateCurrentPage: old page = ");
        sbLIZ3.append(enumC560450LyV3);
        sbLIZ3.append(", new page = ");
        sbLIZ3.append(enumC560450LyV2);
        sbLIZ3.append(", enterTime = ");
        sbLIZ3.append(j);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ3));
        EnumC560450LyV enumC560450LyV5 = EnumC560450LyV.NONE;
        if (enumC560450LyV3 == enumC560450LyV5) {
            c560350LyL.LJIIL = enumC560450LyV5;
            c560350LyL.LJIILIIL = enumC560450LyV2;
            c560350LyL.LJIILJJIL = j;
        } else if (enumC560450LyV2 != enumC560450LyV3) {
            long j3 = c560350LyL.LJIILJJIL;
            LIZ.getClass();
            LJIIL(enumC560450LyV3, j3, j);
            c560350LyL.LJIIL = enumC560450LyV3;
            c560350LyL.LJIILIIL = enumC560450LyV2;
            c560350LyL.LJIILJJIL = j;
        }
    }

    public static void LIZIZ(Lifecycle lifecycle, boolean z) {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        LIZJ = true;
        C560390LyP.LIZJ();
        if (!LJIIIZ && !LJIIIIZZ) {
            LJIILIIL = new C560350LyL();
        }
        LJIIIZ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init listeners: lifecycle = ");
        sbLIZ.append(lifecycle);
        sbLIZ.append(", isAIGCDraftScene = ");
        sbLIZ.append(z);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        try {
            C1906580ziK.LIZJ().LIZJ().LJLLLL(lifecycle, new C09JN() { // from class: X.0LyM
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String str;
                    C1C7U.LIZ("CreativeToolStayTimeMonitor@2d83.init$1");
                    if (((Boolean) obj).booleanValue()) {
                        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "BackgroundSwitch: app leave");
                        C560380LyO.LIZ.getClass();
                        C560350LyL c560350LyL = C560380LyO.LJIILIIL;
                        c560350LyL.LJIIJJI = System.currentTimeMillis();
                        c560350LyL.LJIIIZ = "app_leave";
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onAppLeave: leaveTime = ");
                        sbLIZ2.append(c560350LyL.LJIIJJI);
                        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ2));
                        C560380LyO.LJIILLIIL(new C560470LyX(EnumC560450LyV.NONE, c560350LyL.LJIIJJI));
                        C560380LyO.LJIIJJI(c560350LyL.LJIIJ, c560350LyL.LJIIJJI, c560350LyL.LJIIIIZZ, c560350LyL.LJIIIZ);
                        C560380LyO.LIZJ = false;
                        C560350LyL c560350LyL2 = C560380LyO.LJIILIIL;
                        if (c560350LyL2.LJ) {
                            str = "save_draft";
                        } else {
                            str = "";
                        }
                        c560350LyL2.LJIIIZ = str;
                        C560390LyP.LIZ();
                    } else {
                        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "BackgroundSwitch: app back");
                        C560380LyO.LIZ.getClass();
                        C560380LyO.LIZJ = true;
                        C560350LyL c560350LyL3 = C560380LyO.LJIILIIL;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        c560350LyL3.LJIIJ = jCurrentTimeMillis;
                        c560350LyL3.LJIIIIZZ = "app_resume";
                        C560390LyP.LIZIZ().storeString("enter_way", "app_resume");
                        C560390LyP.LIZIZ().storeLong("enter_time", jCurrentTimeMillis);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onAppBack: enterTime = ");
                        sbLIZ3.append(c560350LyL3.LJIIJ);
                        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ3));
                        C560380LyO.LJIILLIIL(new C560470LyX(c560350LyL3.LJIIL, c560350LyL3.LJIIJ));
                    }
                    C1C7U.LIZIZ("CreativeToolStayTimeMonitor@2d83.init$1");
                }
            });
            LJIIJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("init listeners: error = ");
            sbLIZ2.append(e.getMessage());
            sbLIZ2.append(" \n ");
            sbLIZ2.append(e.getStackTrace());
            C201955140j.LJFF("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static void LJIIIZ(String str, boolean z) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onQuitEditPage: quitBy = ");
        sbLIZ.append(str);
        sbLIZ.append(", isExitCreationFlow = ");
        sbLIZ.append(z);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            if (LJII) {
                C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "onQuitEditPage: back to story media picker");
                LJIILLIIL(new C560470LyX(EnumC560450LyV.ALBUM, System.currentTimeMillis()));
                return;
            }
            if (LJI) {
                C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "onQuitEditPage: back to anchor album");
                LJIILLIIL(new C560470LyX(EnumC560450LyV.ALBUM, System.currentTimeMillis()));
                return;
            }
            if (!Intrinsics.LJFF(str, "back_to_draft_box") && !LJIILIIL.LJ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("edit_exit_");
                sbLIZ2.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                strLIZIZ = "save_draft";
            }
            LJIIIIZZ(strLIZIZ);
        }
    }

    public static final void LJIILL(boolean z, boolean z2) {
        EnumC560450LyV enumC560450LyV;
        if (z) {
            enumC560450LyV = EnumC560450LyV.RECORD;
        } else if (z2) {
            enumC560450LyV = EnumC560450LyV.CREATE;
        } else {
            enumC560450LyV = EnumC560450LyV.NONE;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBottomTab: tab = ");
        sbLIZ.append(enumC560450LyV);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        LJIILLIIL(new C560470LyX(enumC560450LyV, System.currentTimeMillis()));
    }

    public static void LJIJ(EnumC560450LyV enumC560450LyV, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePageEnterFrom: page = ");
        sbLIZ.append(enumC560450LyV);
        sbLIZ.append(", enterFrom = ");
        sbLIZ.append(str);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        Map<EnumC560450LyV, Pair<String, Boolean>> map = LJIILL;
        if (str == null) {
            str = "";
        }
        map.put(enumC560450LyV, new Pair<>(str, Boolean.TRUE));
    }

    public static void LJII(String str, boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCloseRecord: leaveWay = ");
        sbLIZ.append(str);
        sbLIZ.append(", isLastScene = ");
        sbLIZ.append(z);
        sbLIZ.append(", closeRecordingAndTrimming = ");
        sbLIZ.append(z2);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        if ((!LJFF && !LJI && z) || z2) {
            LJIIIIZZ(str);
        }
    }

    public static void LJIIL(EnumC560450LyV enumC560450LyV, long j, long j2) {
        String str;
        String str2;
        String str3;
        if (j > 0 && j2 > j) {
            long j3 = j2 - j;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportPageStayTime: page = ");
            sbLIZ.append(enumC560450LyV);
            sbLIZ.append(", enterTime = ");
            sbLIZ.append(j);
            sbLIZ.append(", leaveTime = ");
            sbLIZ.append(j2);
            sbLIZ.append(", stayTime = ");
            sbLIZ.append(j3);
            C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
            Map<EnumC560450LyV, Pair<String, Boolean>> map = LJIILL;
            Pair pair = (Pair) ((LinkedHashMap) map).get(enumC560450LyV);
            if (pair == null || (str = (String) pair.getFirst()) == null) {
                str = LJIILIIL.LIZJ;
            }
            C560350LyL c560350LyL = LJIILIIL;
            C560420LyS c560420LyS = C560420LyS.LIZ;
            String str4 = c560350LyL.LIZ;
            String str5 = c560350LyL.LIZIZ;
            boolean z = c560350LyL.LJ;
            String str6 = c560350LyL.LJI;
            String str7 = c560350LyL.LJII;
            c560420LyS.getClass();
            int i = C560440LyU.LIZ[enumC560450LyV.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            str2 = "ttcrt_post_page_staytime";
                        }
                        map.put(enumC560450LyV, new Pair<>("", Boolean.FALSE));
                    }
                    str2 = "ttcrt_edit_page_staytime";
                } else {
                    str2 = "ttcrt_upload_page_staytime";
                }
            } else {
                str2 = "ttcrt_video_shoot_page_staytime";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("creation_id", str4);
            c2344009Gk.LJIIIIZZ("shoot_way", str5);
            if (z) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_draft", str3);
            c2344009Gk.LIZLLL(j, "enter_timestamp");
            c2344009Gk.LIZLLL(j2, "leave_timestamp");
            c2344009Gk.LIZLLL(j3, "stay_time");
            if (enumC560450LyV == EnumC560450LyV.ALBUM) {
                c2344009Gk.LJFF("album_from_page", str6);
                c2344009Gk.LJFF("album_from_scene", str7);
            } else {
                c2344009Gk.LJFF("enter_from", str);
            }
            C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
            map.put(enumC560450LyV, new Pair<>("", Boolean.FALSE));
        }
    }

    public static void LJIILJJIL(String str, String str2, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAIGCDraftInfo: creationId = ");
        sbLIZ.append(str);
        sbLIZ.append(", shootWay = ");
        sbLIZ.append(str2);
        sbLIZ.append(", isDraft = ");
        sbLIZ.append(z);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        C560350LyL c560350LyL = LJIILIIL;
        c560350LyL.LIZ = str;
        c560350LyL.LIZIZ = str2;
        c560350LyL.LJIIJ = System.currentTimeMillis();
        c560350LyL.LJ = z;
        if (z) {
            c560350LyL.LJIIIIZZ = "edit_draft";
            c560350LyL.LJIIIZ = "save_draft";
        }
    }

    public static final void LJIIZILJ(EnumC560450LyV enumC560450LyV, ShortVideoContext shortVideoContext, VideoPublishEditModel videoPublishEditModel) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateModelInfo: context = ");
        sbLIZ.append(shortVideoContext);
        sbLIZ.append(", model = ");
        sbLIZ.append(videoPublishEditModel);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        C560350LyL c560350LyL = LJIILIIL;
        String str2 = c560350LyL.LIZ;
        String str3 = "";
        if (shortVideoContext != null) {
            String creationId = shortVideoContext.getCreationId();
            if (creationId == null) {
                creationId = "";
            }
            c560350LyL.LIZ = creationId;
            String str4 = shortVideoContext.shootWay;
            if (str4 != null) {
                c560350LyL.LIZIZ = str4;
            }
            String str5 = shortVideoContext.enterFrom;
            if (str5 != null) {
                c560350LyL.LIZJ = str5;
            }
            if (LJIILJJIL) {
                if (shortVideoContext.publishStage == 50) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c560350LyL.LIZLLL = z4;
                if (!shortVideoContext.mIsFromDraft && !shortVideoContext.creativeModel.draftInfoModel.isDraft) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                c560350LyL.LJ = z5;
            }
        }
        if (videoPublishEditModel != null) {
            String creationId2 = videoPublishEditModel.getCreationId();
            if (creationId2 != null) {
                str3 = creationId2;
            }
            c560350LyL.LIZ = str3;
            String str6 = videoPublishEditModel.mShootWay;
            if (str6 != null) {
                c560350LyL.LIZIZ = str6;
            }
            String enterFrom = videoPublishEditModel.getEnterFrom();
            if (enterFrom != null) {
                c560350LyL.LIZJ = enterFrom;
            }
            if (LJIILJJIL) {
                int i = videoPublishEditModel.mDraftToEditFrom;
                if (i == 2) {
                    z = true;
                } else {
                    z = false;
                }
                c560350LyL.LIZLLL = z;
                if (!videoPublishEditModel.mIsFromDraft && !videoPublishEditModel.creativeModel.draftInfoModel.isDraft) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                c560350LyL.LJ = z2;
                if (i == 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c560350LyL.LJFF = z3;
            }
        }
        if (LJIILJJIL && (videoPublishEditModel != null || shortVideoContext != null)) {
            LJIILJJIL = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateModelInfo: creationId = ");
        sbLIZ2.append(c560350LyL.LIZ);
        sbLIZ2.append(", shootWay = ");
        sbLIZ2.append(c560350LyL.LIZIZ);
        sbLIZ2.append(", enterFrom = ");
        sbLIZ2.append(c560350LyL.LIZJ);
        sbLIZ2.append(", isDraft = ");
        sbLIZ2.append(c560350LyL.LJ);
        sbLIZ2.append(", continuePopUp = ");
        sbLIZ2.append(c560350LyL.LIZLLL);
        sbLIZ2.append(",isDeleteReeditDraft = ");
        sbLIZ2.append(c560350LyL.LJFF);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ2));
        if (c560350LyL.LJIIIIZZ.length() == 0) {
            if (c560350LyL.LIZLLL) {
                str = "continue_popup";
            } else if (c560350LyL.LJFF) {
                str = "delete_reedit";
            } else if (c560350LyL.LJ) {
                str = "edit_draft";
            } else {
                str = "shoot";
            }
            c560350LyL.LJIIIIZZ = str;
        }
        if (c560350LyL.LJ && c560350LyL.LJIIIZ.length() == 0) {
            c560350LyL.LJIIIZ = "save_draft";
        }
        Map<EnumC560450LyV, Pair<String, Boolean>> map = LJIILL;
        Pair pair = (Pair) ((LinkedHashMap) map).get(enumC560450LyV);
        if (pair == null || !((Boolean) pair.getSecond()).booleanValue()) {
            map.put(enumC560450LyV, new Pair<>(c560350LyL.LIZJ, Boolean.FALSE));
        }
        String str7 = c560350LyL.LIZ;
        String str8 = c560350LyL.LIZIZ;
        boolean z6 = c560350LyL.LJ;
        String str9 = c560350LyL.LJIIIIZZ;
        long j = c560350LyL.LJIIJ;
        C560390LyP.LIZIZ().storeString("creation_id", str7);
        C560390LyP.LIZIZ().storeString("shoot_way", str8);
        C560390LyP.LIZIZ().storeBoolean("is_draft", z6);
        C560390LyP.LIZIZ().storeString("enter_way", str9);
        C560390LyP.LIZIZ().storeLong("enter_time", j);
        if (!Intrinsics.LJFF(str2, LJIILIIL.LIZ)) {
            LIZJ = true;
        }
    }

    public static void LJIIJJI(long j, long j2, String str, String str2) {
        if (LIZJ && j > 0 && j2 > j) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportCameraStayTime: enterWay = ");
            sbLIZ.append(str);
            sbLIZ.append(", leaveWay = ");
            sbLIZ.append(str2);
            sbLIZ.append(", enterTime = ");
            sbLIZ.append(j);
            sbLIZ.append(", leaveTime = ");
            sbLIZ.append(j2);
            sbLIZ.append(", stayTime = ");
            sbLIZ.append(j2 - j);
            C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
            C560350LyL c560350LyL = LJIILIIL;
            C560420LyS c560420LyS = C560420LyS.LIZ;
            String str3 = c560350LyL.LIZ;
            String str4 = c560350LyL.LIZIZ;
            boolean z = c560350LyL.LJ;
            c560420LyS.getClass();
            C560420LyS.LIZ(str3, str4, str, j, j2, z, str2);
        }
    }
}
