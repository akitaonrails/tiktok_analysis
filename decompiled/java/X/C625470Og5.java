package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.common.CommonInfoForClient;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.offlinemode.api.OfflineModeApi;
import com.ss.android.ugc.aweme.offlinemode.experiment.DefaultOfflineModeConfig;
import com.ss.android.ugc.aweme.offlinemode.repo.IOfflineCacheLifecycleListener;
import com.ss.android.ugc.aweme.offlinepush.api.IOfflinePushService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS1S0020000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Og5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625470Og5 implements InterfaceC624740Oeu, InterfaceC586170Myt {
    public static final C625470Og5 LL;
    public static final C01GW LLILLJJLI;
    public static final C01GW LLILLL;
    public static final C19319410i8 LLILZ;
    public static long LLILZIL;
    public static final CopyOnWriteArrayList<InterfaceC625450Og3> LLILZLL;
    public static final CopyOnWriteArrayList<InterfaceC608020Nt2> LLIZ;
    public static C054G LLIZLLLIL;
    public static AnonymousClass0956 LLJ;
    public static AnonymousClass0956 LLJI;
    public static final IAccountUserService LLJIJIL;
    public static C0NII LLJILJIL;
    public static volatile EnumC624980OfI LLJILJILJ;
    public static volatile boolean LLJILLL;
    public static int LLJJ;
    public static volatile EnumC624770Oex LLJJI;
    public static volatile boolean LLJJIII;
    public static volatile boolean LLJJIJI;
    public static volatile boolean LLJJIJIIJIL;
    public static volatile boolean LLJJIJIL;
    public static volatile int LLJJJ;

    static {
        C625470Og5 c625470Og5 = new C625470Og5();
        LL = c625470Og5;
        LLILLJJLI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(412));
        LLILLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(411));
        C19319410i8 c19319410i8 = new C19319410i8("OfflineModeManager");
        LLILZ = c19319410i8;
        LLILZIL = System.currentTimeMillis();
        LLILZLL = new CopyOnWriteArrayList<>();
        LLIZ = new CopyOnWriteArrayList<>();
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        LLIZLLLIL = c054gLIZ;
        LLJ = C23250099c.LIZLLL(c054gLIZ, null, C099V.LAZY, new C1390205cK(null), 1);
        LLJIJIL = C0XQ7.LJFF();
        LLJILJILJ = EnumC624980OfI.SYSTEM_RESUME;
        LLJJI = C625420Og0.LJFF();
        c19319410i8.LJIIIZ("OfflineMoManager init");
        if (C625820Oge.LIZ()) {
            C625420Og0.LIZ();
            C0XQ7.LJ();
            C0XQ7.LIZ.LJIILL(c625470Og5);
            D0();
        }
        LLJJIJIL = true;
    }

    public static boolean E0() {
        if (LLJILJIL != null) {
            return true;
        }
        try {
            if (!C0BVQ.LIZ()) {
                return false;
            }
            C0NII c0nii = new C0NII();
            C0NEM.LIZ.LIZIZ(c0nii);
            LLJILJIL = c0nii;
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LLILZ.LJI("Failed to initialize CommonCachePoolDelegate", e);
            return false;
        }
    }

    public static boolean F0() {
        IAccountUserService iAccountUserService = LLJIJIL;
        if (!iAccountUserService.isLogin()) {
            LLILZ.LJIIIZ("initiateDefaultEnableState: skip - not logged in");
            return false;
        }
        if (!C297210Bkt.LIZ() && C625420Og0.LJ() == 1) {
            C625420Og0.LJIIIIZZ().LIZJ("default_enable_state", 0);
            C625420Og0.LJIIIIZZ().LIZJ("default_enable_consumed_count", 0);
            C625420Og0.LJIIIIZZ().LIZLLL("default_enable_mob_sent", false);
            C625720OgU.LIZIZ().LIZLLL("first_visit_intro_shown", false);
            C625720OgU.LIZIZ().LIZLLL("first_playback_toast_shown", false);
            C625720OgU.LIZIZ().LIZJ("default_on_last_video_toast_dismiss_count", 0);
            C625720OgU.LIZIZ().LIZLLL("inbox_message_sent", false);
            LLILZ.LJIIIZ("initiateDefaultEnableState: exp disabled, need cleanup");
            return true;
        }
        if (C625420Og0.LJ() != 0 || C625420Og0.LJFF() != EnumC624770Oex.UNINITIALIZED) {
            return false;
        }
        long jLJI = C625420Og0.LJI();
        if (jLJI > 0 && (System.currentTimeMillis() - jLJI) / 86400000 < 180) {
            return false;
        }
        long registerTime = iAccountUserService.getCurUser().getRegisterTime();
        TimeUnit timeUnit = TimeUnit.DAYS;
        C625770OgZ.LIZ.getClass();
        C01GW c01gw = C625770OgZ.LIZJ;
        long seconds = timeUnit.toSeconds(((DefaultOfflineModeConfig) c01gw.getValue()).newUserProtectDays);
        if (registerTime > 0 && (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - registerTime < seconds) {
            return false;
        }
        double dLJI = C0WYJ.LJI() / ((double) 1073741824);
        if (dLJI < ((DefaultOfflineModeConfig) c01gw.getValue()).minAvailableStorageGb || ((Boolean) C261720ANm.LIZ.getValue()).booleanValue()) {
            return false;
        }
        if (!C625420Og0.LJIIIIZZ().getBoolean("default_enable_mob_sent", false)) {
            C625130OfX.LJ(C625130OfX.LIZ, "auto_open_offline_mode", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 131071);
            C625420Og0.LJIIIIZZ().LIZLLL("default_enable_mob_sent", true);
        }
        if (!C297210Bkt.LIZ()) {
            return false;
        }
        int i = dLJI > ((DefaultOfflineModeConfig) c01gw.getValue()).lowStorageThresholdGb ? C0BVL.LIZ() ? 60 : 50 : 20;
        C625420Og0.LJIIJ(i);
        C625420Og0.LJIIIIZZ().LIZJ("default_enable_state", 1);
        C19319410i8 c19319410i8 = LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initiateDefaultEnableState: enabled, cacheCount=");
        sbLIZ.append(i);
        sbLIZ.append(", storage=");
        sbLIZ.append(dLJI);
        sbLIZ.append("GB");
        c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public static void L0() {
        C01GW c01gw = C625420Og0.LIZ;
        C625420Og0.LJIIIIZZ().LJIIIIZZ("key_last_enter_offline_detail_timestamp", System.currentTimeMillis());
    }

    @Override // X.InterfaceC624740Oeu
    public final Object LJJ() {
        C625530OgB.LIZ.getClass();
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = C625530OgB.LIZLLL();
        String curSecUserId = C625530OgB.LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            return C13BV.INSTANCE;
        }
        long jLJI = C625530OgB.LJI();
        LL.getClass();
        List<C796910VNx> listLJJIIJZLJL = interfaceC625570OgFLIZLLL.LJJIIJZLJL(jLJI, LLILZIL, curSecUserId);
        ArrayList arrayList = new ArrayList();
        for (C796910VNx c796910VNx : listLJJIIJZLJL) {
            C625530OgB.LIZ.getClass();
            arrayList.add(C625530OgB.LJJ(c796910VNx));
        }
        return arrayList;
    }

    @Override // X.InterfaceC624740Oeu
    public final void LLJLL() {
        LLILZ.LJIIIZ("pauseDownload()");
        LLJ.LIZIZ(null);
        C625460Og4.LIZ.getClass();
        C625460Og4.LJIILLIIL(true);
    }

    @Override // X.InterfaceC624740Oeu
    public final C625850Ogh Q() {
        C625530OgB.LIZ.getClass();
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = C625530OgB.LIZLLL();
        String curSecUserId = C625530OgB.LIZLLL.getCurSecUserId();
        long jLJI = C625530OgB.LJI();
        LL.getClass();
        return interfaceC625570OgFLIZLLL.LJII(jLJI, LLILZIL, curSecUserId);
    }

    @Override // X.InterfaceC624740Oeu
    public final EnumC624960OfG o0() {
        C625460Og4.LIZ.getClass();
        return C625460Og4.LIZIZ();
    }

    @Override // X.InterfaceC624740Oeu
    public final boolean w0() {
        long j = LLILZIL - C625420Og0.LJIIIIZZ().getLong("key_last_update_cache_time", 0L);
        C625530OgB.LIZ.getClass();
        return j > C625530OgB.LJI();
    }

    public static void D0() {
        LLJJI = C625420Og0.LJFF();
        int i = C624850Of5.LIZ[C625420Og0.LJFF().ordinal()];
        if ((i == 1 || i == 2 || i == 3) && C625420Og0.LIZJ() < C625420Og0.LIZ()) {
            C844470XAv.LIZ.getClass();
            C625420Og0.LJIILIIL(!C0XF1.LIZLLL(C844470XAv.LIZ()) ? EnumC624770Oex.PAUSE_NO_NETWORK : (!C625420Og0.LJIIIZ() || C0XF1.LJ(C844470XAv.LIZ())) ? EnumC624770Oex.DOWNLOADING : EnumC624770Oex.PAUSE_NOT_WIFI);
        }
        C23250099c.LIZLLL(LLIZLLLIL, null, null, new C625560OgE(null), 3);
    }

    public static boolean G0() {
        return C297210Bkt.LIZ() && C625420Og0.LJ() == 1;
    }

    public static void J0() {
        if (C0BMC.LIZ()) {
            C19319410i8 c19319410i8 = LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[UpdateExp][tryTriggerUpdate] isDownloaded: ");
            EnumC624770Oex enumC624770OexLJFF = C625420Og0.LJFF();
            EnumC624770Oex enumC624770Oex = EnumC624770Oex.DOWNLOADED;
            sbLIZ.append(enumC624770OexLJFF == enumC624770Oex);
            c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (C625420Og0.LJFF() != enumC624770Oex || LLJJIII) {
                c19319410i8.LJIIIZ("[UpdateExp][tryTriggerUpdate] not meetUpdateConditions, skip");
                return;
            }
            AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(LLIZLLLIL, null, C099V.LAZY, new C1390105cJ(null), 1);
            LLJI = anonymousClass0956LIZLLL;
            anonymousClass0956LIZLLL.start();
        }
    }

    public final boolean H0() {
        EnumC624770Oex enumC624770Oex;
        if (!G0() || C625420Og0.LJFF() != EnumC624770Oex.UNINITIALIZED) {
            return false;
        }
        EnumC624960OfG enumC624960OfGO0 = o0();
        if (enumC624960OfGO0 != null) {
            int i = C624850Of5.LIZIZ[enumC624960OfGO0.ordinal()];
            if (i == 1) {
                enumC624770Oex = EnumC624770Oex.PAUSE_STORAGE;
            } else if (i == 2) {
                enumC624770Oex = EnumC624770Oex.PAUSE_NO_NETWORK;
            } else {
                if (i != 3) {
                    return false;
                }
                enumC624770Oex = EnumC624770Oex.PAUSE_NOT_WIFI;
            }
            C625420Og0.LJIILIIL(enumC624770Oex);
        } else {
            LLJJIII(EnumC624980OfI.DEFAULT_ENABLE);
        }
        C19319410i8 c19319410i8 = LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bootTask: default enable triggered, downloadState=");
        sbLIZ.append(C625420Og0.LJFF().getValue());
        sbLIZ.append(", cacheCount=");
        sbLIZ.append(C625420Og0.LIZ());
        c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        C625130OfX.LJ(C625130OfX.LIZ, "click_download_offline_mode_video", null, "auto_download", null, null, Integer.valueOf(C625420Og0.LIZ()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, C625420Og0.LJII(), null, null, -38, 114687);
        return true;
    }

    public final void I0() {
        int iIntValue;
        if (G0() && C625420Og0.LIZLLL() >= 10 && C625420Og0.LIZ() < (iIntValue = ((Number) C13LP.LJJJJZI(C624670Oen.LJ())).intValue()) && C625420Og0.LJFF() != EnumC624770Oex.USER_PAUSE && C625420Og0.LJFF() != EnumC624770Oex.UNINITIALIZED) {
            C625420Og0.LJIIJ(iIntValue);
            if (C625420Og0.LJFF() == EnumC624770Oex.DOWNLOADED) {
                EnumC624960OfG enumC624960OfGO0 = o0();
                if (enumC624960OfGO0 != null) {
                    int i = C624850Of5.LIZIZ[enumC624960OfGO0.ordinal()];
                    C625420Og0.LJIILIIL(i != 1 ? i != 2 ? i != 3 ? C625420Og0.LJFF() : EnumC624770Oex.PAUSE_NOT_WIFI : EnumC624770Oex.PAUSE_NO_NETWORK : EnumC624770Oex.PAUSE_STORAGE);
                } else {
                    C625420Og0.LJIILIIL(EnumC624770Oex.DOWNLOADING);
                }
            }
            C19319410i8 c19319410i8 = LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bootTask: FYP consumption expand triggered, consumedCount=");
            sbLIZ.append(C625420Og0.LIZLLL());
            sbLIZ.append(", targetCount=");
            sbLIZ.append(iIntValue);
            sbLIZ.append(", downloadState=");
            sbLIZ.append(C625420Og0.LJFF().getValue());
            c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            C625130OfX.LJ(C625130OfX.LIZ, "click_download_offline_mode_video", null, "auto_download", null, null, Integer.valueOf(iIntValue), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, C625420Og0.LJII(), null, null, -38, 114687);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tryFypConsumptionExpand: expanded to ");
            sbLIZ2.append(iIntValue);
            c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC624740Oeu
    public final int LJIIJ() {
        return C625420Og0.LIZ();
    }

    @Override // X.InterfaceC624740Oeu
    public final int LJIILIIL() {
        return C625420Og0.LIZJ();
    }

    @Override // X.InterfaceC624740Oeu
    public final boolean LJJLJ() {
        return C625420Og0.LJIIIZ();
    }

    @Override // X.InterfaceC624740Oeu
    public final EnumC624770Oex LLIIJI() {
        return C625420Og0.LJFF();
    }

    @Override // X.InterfaceC624740Oeu
    public final boolean LLLILZJ() {
        return C625420Og0.LJIIIIZZ().getBoolean("key_first_enter_setting_panel", true);
    }

    @Override // X.InterfaceC624740Oeu
    public final boolean LLLLLLZ() {
        return C625420Og0.LJIIIIZZ().getBoolean("key_first_enter_panel", true);
    }

    @Override // X.InterfaceC624740Oeu
    public final void LLLLZ() {
        C625420Og0.LJIIIIZZ().LIZLLL("key_first_enter_setting_panel", false);
    }

    @Override // X.InterfaceC624740Oeu
    public final void LLLZZ() {
        C625420Og0.LJIIIIZZ().LIZLLL("key_first_enter_panel", false);
    }

    @Override // X.InterfaceC624740Oeu
    public final double q0() {
        return C625420Og0.LIZIZ();
    }

    public static void LLJLILLLLZIIL(List list) {
        Object c098200Yq;
        Iterator<InterfaceC625450Og3> it2 = LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().RX0(list);
        }
        C625460Og4.LIZ.getClass();
        C625460Og4.LIZLLL(list);
        C625530OgB.LIZ.getClass();
        String curSecUserId = C625530OgB.LIZLLL.getCurSecUserId();
        if (curSecUserId != null) {
            C625530OgB.LIZLLL().LJJI(curSecUserId, list);
        }
        MLDataCenterService.Companion.getClass();
        C1349505Px.LIZ.removeAwemeContentListForScore(list);
        C01GW c01gw = C625420Og0.LIZ;
        C625420Og0.LJIIJJI(C625460Og4.LJII() / 1024.0d);
        C625420Og0.LJIIL(C625530OgB.LIZIZ());
        if (C625420Og0.LIZJ() < C625420Og0.LIZ() && C625420Og0.LJFF() == EnumC624770Oex.DOWNLOADED) {
            C625420Og0.LJIILIIL(EnumC624770Oex.DOWNLOADING);
        }
        if (!list.isEmpty()) {
            C625690OgR.LIZ.getClass();
            if (!list.isEmpty()) {
                try {
                    IOfflineCacheLifecycleListener iOfflineCacheLifecycleListener = (IOfflineCacheLifecycleListener) PluggableExtentionKt.pluggableSpi$default(IOfflineCacheLifecycleListener.class, false, false, false, 14, null);
                    if (iOfflineCacheLifecycleListener != null) {
                        iOfflineCacheLifecycleListener.LIZ(list);
                        c098200Yq = Unit.LIZ;
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C625690OgR.LIZIZ.LIZ("onRecordsInvalidated failed", thM5exceptionOrNullimpl);
                }
            }
        }
    }

    @Override // X.InterfaceC624740Oeu
    public final Object C(InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) {
        C625530OgB.LIZ.getClass();
        return C625530OgB.LJIJJ();
    }

    @Override // X.InterfaceC624740Oeu
    public final void J(EnumC624770Oex enumC624770Oex) {
        int value;
        LLILZ.LJIIIZ("initDownloadWithBlock()");
        C625460Og4.LIZ.getClass();
        C625460Og4.LJIILLIIL(false);
        C01GW c01gw = C625420Og0.LIZ;
        if (enumC624770Oex != null) {
            int i = C624870Of7.LIZ[enumC624770Oex.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        value = EnumC624960OfG.NOT_WIFI.getValue();
                    }
                } else {
                    value = EnumC624960OfG.NO_NET.getValue();
                }
            } else {
                value = EnumC624960OfG.STORAGE_NOT_ENOUGH.getValue();
            }
            C625420Og0.LJIIIIZZ().LIZJ("keva_end_reason", value);
        }
        C625420Og0.LJIILIIL(enumC624770Oex);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb A[Catch: Exception -> 0x016e, LOOP:0: B:40:0x00e5->B:42:0x00eb, LOOP_END, TryCatch #0 {Exception -> 0x016e, blocks: (B:46:0x0106, B:47:0x0109, B:49:0x0118, B:50:0x0120, B:53:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x0146, B:60:0x014a, B:62:0x0150, B:65:0x0158, B:67:0x016a, B:38:0x00c9, B:39:0x00cc, B:40:0x00e5, B:42:0x00eb, B:43:0x00f9, B:24:0x0070, B:25:0x0073, B:27:0x0087, B:28:0x0096, B:30:0x009c, B:34:0x00a4, B:35:0x00a6, B:19:0x004d, B:21:0x0053), top: B:72:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118 A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:46:0x0106, B:47:0x0109, B:49:0x0118, B:50:0x0120, B:53:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x0146, B:60:0x014a, B:62:0x0150, B:65:0x0158, B:67:0x016a, B:38:0x00c9, B:39:0x00cc, B:40:0x00e5, B:42:0x00eb, B:43:0x00f9, B:24:0x0070, B:25:0x0073, B:27:0x0087, B:28:0x0096, B:30:0x009c, B:34:0x00a4, B:35:0x00a6, B:19:0x004d, B:21:0x0053), top: B:72:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128 A[Catch: Exception -> 0x016e, TRY_ENTER, TryCatch #0 {Exception -> 0x016e, blocks: (B:46:0x0106, B:47:0x0109, B:49:0x0118, B:50:0x0120, B:53:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x0146, B:60:0x014a, B:62:0x0150, B:65:0x0158, B:67:0x016a, B:38:0x00c9, B:39:0x00cc, B:40:0x00e5, B:42:0x00eb, B:43:0x00f9, B:24:0x0070, B:25:0x0073, B:27:0x0087, B:28:0x0096, B:30:0x009c, B:34:0x00a4, B:35:0x00a6, B:19:0x004d, B:21:0x0053), top: B:72:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:46:0x0106, B:47:0x0109, B:49:0x0118, B:50:0x0120, B:53:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x0146, B:60:0x014a, B:62:0x0150, B:65:0x0158, B:67:0x016a, B:38:0x00c9, B:39:0x00cc, B:40:0x00e5, B:42:0x00eb, B:43:0x00f9, B:24:0x0070, B:25:0x0073, B:27:0x0087, B:28:0x0096, B:30:0x009c, B:34:0x00a4, B:35:0x00a6, B:19:0x004d, B:21:0x0053), top: B:72:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K0(X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625470Og5.K0(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.13BV] */
    @Override // X.InterfaceC624740Oeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIIJ(X.InterfaceC1364105Vn<? super X.C607970Nsx> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C625680OgQ
            if (r0 == 0) goto L77
            r5 = r13
            X.0OgQ r5 = (X.C625680OgQ) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L7d
            X.C155000ia.LIZIZ(r4)
        L22:
            java.util.List r4 = (java.util.List) r4
            X.0Nsx r0 = new X.0Nsx
            r0.<init>(r4)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r4)
            X.0OgB r0 = X.C625530OgB.LIZ
            r6 = 5
            r5.LLILLL = r1
            r0.getClass()
            X.0OgF r5 = X.C625530OgB.LIZLLL()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C625530OgB.LIZLLL
            java.lang.String r11 = r0.getCurSecUserId()
            if (r11 != 0) goto L46
            X.13BV r4 = X.C13BV.INSTANCE
        L43:
            if (r4 != r3) goto L22
            return r3
        L46:
            long r7 = X.C625530OgB.LJI()
            X.0Og5 r0 = X.C625470Og5.LL
            r0.getClass()
            long r9 = X.C625470Og5.LLILZIL
            java.util.List r0 = r5.LJIJJ(r6, r7, r9, r11)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r0.iterator()
        L5e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r1 = r2.next()
            X.0VNx r1 = (X.C796910VNx) r1
            X.0OgB r0 = X.C625530OgB.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C625530OgB.LJJ(r1)
            r4.add(r0)
            goto L5e
        L77:
            X.0OgQ r5 = new X.0OgQ
            r5.<init>(r12, r13)
            goto L12
        L7d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625470Og5.LJJLIIIIJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    @Override // X.InterfaceC624740Oeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJLIIL(X.InterfaceC1364105Vn r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C625650OgN
            if (r0 == 0) goto L53
            r6 = r8
            X.0OgN r6 = (X.C625650OgN) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L64
            int r3 = r6.LLILLJJLI
            int r2 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L27:
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            int r0 = r0 + r2
            if (r0 >= r3) goto L59
            X.0Nsx r1 = new X.0Nsx
            r1.<init>(r5)
            return r1
        L36:
            X.C155000ia.LIZIZ(r5)
            int r3 = X.C625420Og0.LIZ()
            X.0OgB r0 = X.C625530OgB.LIZ
            r6.LL = r4
            r6.LLILLJJLI = r3
            r6.LLILZIL = r1
            r0.getClass()
            r0 = 20
            java.lang.Object r5 = X.C625530OgB.LIZJ(r0)
            if (r5 != r2) goto L51
            return r2
        L51:
            r2 = 0
            goto L27
        L53:
            X.0OgN r6 = new X.0OgN
            r6.<init>(r7, r8)
            goto L12
        L59:
            X.0Nsx r1 = new X.0Nsx
            int r3 = r3 - r2
            java.util.List r0 = r5.subList(r4, r3)
            r1.<init>(r0)
            return r1
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625470Og5.LJLIIL(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC624740Oeu
    public final void LLILZLL(int i) {
        C19319410i8 c19319410i8 = LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCacheCount: ");
        sbLIZ.append(i);
        c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (i > C625420Og0.LIZ() && C625420Og0.LJFF() == EnumC624770Oex.DOWNLOADED) {
            C625460Og4.LIZ.getClass();
            C625460Og4.LJIILLIIL(true);
            C625420Og0.LJIIJ(i);
            return;
        }
        if (i <= C625420Og0.LIZ() && C625420Og0.LIZJ() >= i) {
            C625420Og0.LJIILIIL(EnumC624770Oex.DOWNLOADED);
            C625420Og0.LJIIJ(i);
            C625460Og4.LIZ.getClass();
            C625460Og4.LJIILLIIL(false);
            if (C625420Og0.LIZJ() > i) {
                C23250099c.LIZLLL(LLIZLLLIL, null, null, new C1390305cL(i, null), 3);
                return;
            }
        }
        C625460Og4.LIZ.getClass();
        C625460Og4.LJIILLIIL(false);
        C625420Og0.LJIIJ(i);
    }

    @Override // X.InterfaceC624740Oeu
    public final void LLJJIII(EnumC624980OfI enumC624980OfI) {
        if (LLJ.isActive() || LLJ.isCompleted() || LLJ.isCancelled()) {
            LLJ.LIZIZ(null);
            C625460Og4.LIZ.getClass();
            C625460Og4.LJIILLIIL(false);
            LLJ = C23250099c.LIZLLL(LLIZLLLIL, null, C099V.LAZY, new C1390205cK(null), 1);
        }
        LLJILJILJ = enumC624980OfI;
        LJLLI(2, "trigger_download");
        LLJ.start();
    }

    @Override // X.InterfaceC624740Oeu
    public final void LLLIZZ(InterfaceC625450Og3 interfaceC625450Og3) {
        LLILZLL.remove(interfaceC625450Og3);
    }

    @Override // X.InterfaceC624740Oeu
    public final void LLLLLIL(InterfaceC625450Og3 interfaceC625450Og3) {
        LLILZLL.add(interfaceC625450Og3);
    }

    @Override // X.InterfaceC624740Oeu
    public final void LLZL(boolean z) {
        C625420Og0.LJIILJJIL(z);
        C844470XAv.LIZ.getClass();
        if (!C0XF1.LIZLLL(C844470XAv.LIZ())) {
            if (C625420Og0.LJFF() == EnumC624770Oex.DOWNLOADING) {
                LLILZ.LJIIIZ("no network show pause_no_network");
                C625460Og4.LIZ.getClass();
                C625460Og4.LJIILLIIL(false);
                C625460Og4.LJIIJJI(EnumC624960OfG.NO_NET.getValue());
                C625420Og0.LJIILIIL(EnumC624770Oex.PAUSE_NO_NETWORK);
                return;
            }
            return;
        }
        if (C0XF1.LJ(C844470XAv.LIZ())) {
            return;
        }
        EnumC624770Oex enumC624770OexLJFF = C625420Og0.LJFF();
        EnumC624770Oex enumC624770Oex = EnumC624770Oex.DOWNLOADING;
        if (enumC624770OexLJFF == enumC624770Oex && C625420Og0.LJIIIZ()) {
            LLILZ.LJIIIZ("not wifi show pause_not_wifi");
            C625460Og4.LIZ.getClass();
            C625460Og4.LJIILLIIL(false);
            C625460Og4.LJIIJJI(EnumC624960OfG.NOT_WIFI.getValue());
            C625420Og0.LJIILIIL(EnumC624770Oex.PAUSE_NOT_WIFI);
            return;
        }
        if (!C625420Og0.LJFF().isPauseByNet() || C625420Og0.LJIIIZ()) {
            return;
        }
        LLILZ.LJIIIZ("mobile show downloading");
        EnumC624980OfI enumC624980OfI = EnumC624980OfI.SYSTEM_RESUME;
        LLJJIII(enumC624980OfI);
        C625460Og4.LIZ.getClass();
        C625460Og4.LJIIL(enumC624980OfI);
        C625420Og0.LJIILIIL(enumC624770Oex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0616 A[Catch: Exception -> 0x064c, LOOP:0: B:169:0x0610->B:171:0x0616, LOOP_END, TryCatch #27 {Exception -> 0x064c, blocks: (B:168:0x0605, B:169:0x0610, B:171:0x0616, B:172:0x0624), top: B:332:0x0605 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06b2 A[Catch: Exception -> 0x06d9, TryCatch #17 {Exception -> 0x06d9, blocks: (B:227:0x06a0, B:229:0x06b2, B:230:0x06c1, B:232:0x06c7), top: B:312:0x06a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06c7 A[Catch: Exception -> 0x06d9, TryCatch #17 {Exception -> 0x06d9, blocks: (B:227:0x06a0, B:229:0x06b2, B:230:0x06c1, B:232:0x06c7), top: B:312:0x06a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x051f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x059c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0697 A[EXC_TOP_SPLITTER, PHI: r2 r3 r7 r8 r9 r10 r11 r12 r16 r17 r18 r19
      0x0697: PHI (r2v11 int) = (r2v5 int), (r2v12 int) binds: [B:117:0x044b, B:173:0x0644] A[DONT_GENERATE, DONT_INLINE]
      0x0697: PHI (r3v11 ??) = (r3v23 ??), (r3v24 ??) binds: [B:117:0x044b, B:173:0x0644] A[DONT_GENERATE, DONT_INLINE]
      0x0697: PHI (r7v9 ??) = (r7v29 ??), (r7v30 ??) binds: [B:117:0x044b, B:173:0x0644] A[DONT_GENERATE, DONT_INLINE]
      0x0697: PHI (r8v10 int) = (r8v2 int), (r8v11 int) binds: [B:117:0x044b, B:173:0x0644] A[DONT_GENERATE, DONT_INLINE]
      0x0697: PHI (r9v8 int) = (r9v2 int), (r9v9 int) binds: [B:117:0x044b, B:173:0x0644] A[DONT_GENERATE, DONT_INLINE]
      0x0697: PHI (r10v9 int) = (r10v2 int), (r10v10 int) binds: [B:117:0x044b, B:173:0x0644] A[DONT_GENERATE, DONT_INLINE]
      0x0697: PHI (r11v21 X.013C) = (r11v2 X.013C), (r11v26 X.013C) binds: [B:117:0x044b, B:173:0x0644] A[DONT_GENERATE, DONT_INLINE]
      0x0697: PHI (r12v90 java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>) = 
      (r12v38 java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>)
      (r12v95 java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>)
     binds: [B:117:0x044b, B:173:0x0644] A[DONT_GENERATE, DONT_INLINE]
      0x0697: PHI (r16v4 int) = (r16v2 int), (r16v5 int) binds: [B:117:0x044b, B:173:0x0644] A[DONT_GENERATE, DONT_INLINE]
      0x0697: PHI (r17v4 X.013C) = (r17v2 X.013C), (r17v5 X.013C) binds: [B:117:0x044b, B:173:0x0644] A[DONT_GENERATE, DONT_INLINE]
      0x0697: PHI (r18v8 java.lang.String) = (r18v2 java.lang.String), (r18v9 java.lang.String) binds: [B:117:0x044b, B:173:0x0644] A[DONT_GENERATE, DONT_INLINE]
      0x0697: PHI (r19v4 com.ss.android.ugc.aweme.feed.model.FeedItemList) = (r19v2 com.ss.android.ugc.aweme.feed.model.FeedItemList), (r19v5 com.ss.android.ugc.aweme.feed.model.FeedItemList) binds: [B:117:0x044b, B:173:0x0644] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x044d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x033d A[Catch: Exception -> 0x06fa, TryCatch #41 {Exception -> 0x06fa, blocks: (B:73:0x0339, B:75:0x033d, B:77:0x034d, B:78:0x0351, B:99:0x0395, B:104:0x03b5), top: B:358:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x038f A[Catch: Exception -> 0x03b2, TryCatch #10 {Exception -> 0x03b2, blocks: (B:80:0x0357, B:86:0x036b, B:88:0x037a, B:89:0x037c, B:91:0x0382, B:97:0x038f, B:101:0x03a4), top: B:299:0x0357 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.05Vn] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0Og5] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x03a4 -> B:52:0x0279). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x05fb -> B:346:0x05ff). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:200:0x0670
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N0(X.InterfaceC1364105Vn<? super kotlin.Unit> r70) {
        /*
            Method dump skipped, instruction units count: 1890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625470Og5.N0(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC624740Oeu
    public final void f(boolean z) {
        if (LLJILLL) {
            if (z) {
                L0();
            }
        } else {
            LLJILLL = true;
            boolean zF0 = F0();
            C625460Og4.LIZ.getClass();
            C625460Og4.LIZJ();
            new C625860Ogi().LIZ(new AwS1S0020000_2(z, zF0, 1));
        }
    }

    @Override // X.InterfaceC624740Oeu
    public final void LJLLI(int i, String str) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        if (!C0BMC.LIZ()) {
            return;
        }
        if (Intrinsics.LJFF(str, "reach_bottom") && C297230Bkv.LIZ()) {
            LLJJIII = true;
        }
        C19319410i8 c19319410i8 = LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[UpdateExp][tryCancelUpdate] from ");
        sbLIZ.append(str);
        sbLIZ.append(", isActive: ");
        AnonymousClass0956 anonymousClass0956 = LLJI;
        if (anonymousClass0956 != null) {
            boolValueOf = Boolean.valueOf(anonymousClass0956.isActive());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", isCompleted: ");
        AnonymousClass0956 anonymousClass09562 = LLJI;
        if (anonymousClass09562 != null) {
            boolValueOf2 = Boolean.valueOf(anonymousClass09562.isCompleted());
        } else {
            boolValueOf2 = null;
        }
        sbLIZ.append(boolValueOf2);
        sbLIZ.append(", isCancelled: ");
        AnonymousClass0956 anonymousClass09563 = LLJI;
        if (anonymousClass09563 != null) {
            boolValueOf3 = Boolean.valueOf(anonymousClass09563.isCancelled());
        } else {
            boolValueOf3 = null;
        }
        sbLIZ.append(boolValueOf3);
        c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!LLJJIJIL) {
            LLJJIJIL = true;
            C23250099c.LIZLLL(LLIZLLLIL, null, null, new C597410Nbv(i, null), 3);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[UpdateExp][tryCancelUpdate] update finished realUpdatedCount ");
            sbLIZ2.append(LLJJJ);
            sbLIZ2.append(", endReason ");
            sbLIZ2.append(i);
            sbLIZ2.append(" (1 finish 2 cancel)");
            c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        AnonymousClass0956 anonymousClass09564 = LLJI;
        if (anonymousClass09564 != null) {
            anonymousClass09564.LIZIZ(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJLZ(java.lang.String r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C625670OgP
            if (r0 == 0) goto L7b
            r5 = r8
            X.0OgP r5 = (X.C625670OgP) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7b
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 != r3) goto L81
            java.lang.Object r7 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            X.0T30 r0 = com.ss.android.ugc.aweme.ml.api.MLDataCenterService.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.ml.api.IMLDataCenterService r1 = X.C1349505Px.LIZ
            java.util.List r0 = java.util.Collections.singletonList(r7)
            r1.removeAwemeContentListForScore(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L35:
            X.C155000ia.LIZIZ(r1)
            X.10i8 r2 = X.C625470Og5.LLILZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[UpdateExp][deleteVideoByAid] aid "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.LJIIIZ(r0)
            X.0Og4 r1 = X.C625460Og4.LIZ
            java.util.List r0 = java.util.Collections.singletonList(r7)
            r1.getClass()
            X.C625460Og4.LIZLLL(r0)
            X.0OgB r0 = X.C625530OgB.LIZ
            r5.LL = r7
            r5.LLILZ = r3
            r0.getClass()
            X.0OgF r1 = X.C625530OgB.LIZLLL()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C625530OgB.LIZLLL
            java.lang.String r0 = r0.getCurSecUserId()
            if (r0 != 0) goto L76
            r0 = 0
        L6f:
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            if (r0 != r4) goto L24
            return r4
        L76:
            int r0 = r1.LJI(r0, r7)
            goto L6f
        L7b:
            X.0OgP r5 = new X.0OgP
            r5.<init>(r6, r8)
            goto L12
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625470Og5.LJLZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC624740Oeu
    public final Object LLLLLLLLL(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        int iLJJJIL;
        C19319410i8 c19319410i8 = LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[UpdateExp]updateWatchState aid: ");
        sbLIZ.append(str);
        sbLIZ.append(", state: ");
        sbLIZ.append(true);
        c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        C625530OgB.LIZ.getClass();
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = C625530OgB.LIZLLL();
        String curSecUserId = C625530OgB.LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            iLJJJIL = 0;
        } else {
            iLJJJIL = interfaceC625570OgFLIZLLL.LJJJIL(curSecUserId, str);
        }
        return C2286608xc.LJ(iLJJJIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:102:0x0472, B:97:0x0465], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:107:0x047f, B:110:0x048a], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:110:0x048a, B:107:0x047f], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:113:0x0493, B:540:0x0607], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:115:0x0499, B:119:0x04a8], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:119:0x04a8, B:115:0x0499], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:150:0x0592, B:532:0x0582], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:154:0x05a2, B:155:0x05a3], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:155:0x05a3, B:154:0x05a2], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:162:0x05b0, B:166:0x05bb], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:166:0x05bb, B:162:0x05b0], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:187:0x0624, B:113:0x0493], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:197:0x0644, B:201:0x0655], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:201:0x0655, B:197:0x0644], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:247:0x06e8, B:526:0x06b0], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:292:0x07a9, B:623:0x076a], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:372:0x0942, B:374:0x0955], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:374:0x0955, B:372:0x0942], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:508:0x0636, B:195:0x0641], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:532:0x0582, B:150:0x0592], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:540:0x0607, B:113:0x0493], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:580:0x0653, B:201:0x0655], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:623:0x076a, B:292:0x07a9], limit reached: 646 */
    /* JADX WARN: Path cross not found for [B:97:0x0465, B:102:0x0472], limit reached: 646 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0476 A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x047f A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04ba A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0644 A[Catch: Exception -> 0x0671, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x0671, blocks: (B:190:0x062e, B:197:0x0644), top: B:522:0x062e }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x065b A[Catch: Exception -> 0x06a9, TryCatch #39 {Exception -> 0x06a9, blocks: (B:200:0x0653, B:201:0x0655, B:203:0x065b, B:209:0x0668, B:218:0x0683, B:224:0x069f), top: B:580:0x0653 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07ac A[Catch: Exception -> 0x07d5, TRY_LEAVE, TryCatch #61 {Exception -> 0x07d5, blocks: (B:282:0x076a, B:284:0x076e, B:285:0x0787, B:287:0x078d, B:289:0x0795, B:290:0x0797, B:294:0x07ac, B:298:0x07bf, B:300:0x07d1, B:260:0x0711, B:261:0x0715, B:262:0x0722, B:264:0x0728, B:266:0x0731, B:268:0x0737, B:272:0x073f, B:274:0x0743, B:275:0x0747), top: B:623:0x076a }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x07bf A[Catch: Exception -> 0x07d5, TRY_ENTER, TryCatch #61 {Exception -> 0x07d5, blocks: (B:282:0x076a, B:284:0x076e, B:285:0x0787, B:287:0x078d, B:289:0x0795, B:290:0x0797, B:294:0x07ac, B:298:0x07bf, B:300:0x07d1, B:260:0x0711, B:261:0x0715, B:262:0x0722, B:264:0x0728, B:266:0x0731, B:268:0x0737, B:272:0x073f, B:274:0x0743, B:275:0x0747), top: B:623:0x076a }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x08eb A[Catch: Exception -> 0x0919, TRY_LEAVE, TryCatch #52 {Exception -> 0x0919, blocks: (B:346:0x08e1, B:348:0x08eb), top: B:606:0x08e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0942 A[Catch: Exception -> 0x0970, TRY_LEAVE, TryCatch #0 {Exception -> 0x0970, blocks: (B:370:0x0931, B:372:0x0942), top: B:502:0x0931 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0959 A[Catch: Exception -> 0x096e, TRY_LEAVE, TryCatch #1 {Exception -> 0x096e, blocks: (B:373:0x0944, B:374:0x0955, B:376:0x0959), top: B:504:0x0944 }] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x09e7 A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0a20 A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0a38 A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0a70 A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0aa0 A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0ac5 A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0b19 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0b2f A[Catch: Exception -> 0x0bc1, TRY_LEAVE, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0931 A[EXC_TOP_SPLITTER, PHI: r1 r5 r6 r7 r8 r9 r17 r18 r19 r20 r21 r22 r23 r24 r26 r27
      0x0931: PHI (r1v3 com.ss.android.ugc.aweme.feed.model.FeedItemList) = (r1v2 com.ss.android.ugc.aweme.feed.model.FeedItemList), (r1v4 com.ss.android.ugc.aweme.feed.model.FeedItemList) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r5v2 X.0OfI) = (r5v1 X.0OfI), (r5v3 X.0OfI) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r6v1 java.util.List) = (r6v0 java.util.List), (r6v2 java.util.List) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v2 java.lang.String) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r8v3 X.013C) = (r8v2 X.013C), (r8v12 X.013C) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r9v1 X.013C) = (r9v0 X.013C), (r9v2 X.013C) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r17v1 int) = (r17v0 int), (r17v2 int) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r18v1 int) = (r18v0 int), (r18v2 int) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r19v1 int) = (r19v0 int), (r19v3 int) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r20v1 int) = (r20v0 int), (r20v2 int) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r21v1 int) = (r21v0 int), (r21v2 int) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r22v1 int) = (r22v0 int), (r22v2 int) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r23v1 int) = (r23v0 int), (r23v2 int) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r24v1 int) = (r24v0 int), (r24v2 int) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r26v1 int) = (r26v0 int), (r26v2 int) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE]
      0x0931: PHI (r27v1 int) = (r27v0 int), (r27v2 int) binds: [B:367:0x092b, B:328:0x088c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0582 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0607 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:570:0x088e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0302 A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:623:0x076a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x030e A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:684:0x0668 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0628 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0360 A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0377 A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b9 A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0400 A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0424 A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0465 A[Catch: Exception -> 0x0bc1, TryCatch #65 {Exception -> 0x0bc1, blocks: (B:494:0x0b1a, B:495:0x0b1d, B:497:0x0b2f, B:489:0x0aea, B:490:0x0aed, B:491:0x0af8, B:15:0x0055, B:470:0x0a34, B:472:0x0a38, B:476:0x0a68, B:478:0x0a70, B:484:0x0aa0, B:475:0x0a65, B:457:0x09bf, B:112:0x0491, B:117:0x049d, B:466:0x09e7, B:467:0x0a1a, B:469:0x0a20, B:486:0x0ac5, B:119:0x04a8, B:121:0x04ba, B:93:0x0451, B:94:0x0454, B:95:0x045f, B:97:0x0465, B:99:0x0469, B:104:0x0476, B:105:0x0479, B:107:0x047f, B:37:0x01fb, B:75:0x0373, B:77:0x0377, B:81:0x03b1, B:83:0x03b9, B:89:0x0400, B:80:0x03ae, B:71:0x034e, B:72:0x0351, B:74:0x0360, B:90:0x0424, B:57:0x02f4, B:58:0x02f7, B:59:0x02fc, B:61:0x0302, B:63:0x030e, B:65:0x0316, B:67:0x031a, B:68:0x0325, B:42:0x0271, B:44:0x0279, B:46:0x027c, B:48:0x0282, B:50:0x028c, B:52:0x02c7), top: B:608:0x0024 }] */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v139, types: [X.013C, X.0OfI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x0605 -> B:113:0x0493). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x0622 -> B:113:0x0493). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:219:0x068e -> B:113:0x0493). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x0690 -> B:113:0x0493). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:375:0x0957 -> B:113:0x0493). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:376:0x0959 -> B:113:0x0493). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:456:0x09bd -> B:457:0x09bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:479:0x0a99 -> B:470:0x0a34). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x03f9 -> B:75:0x0373). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:379:0x0970
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLZLLIL(X.EnumC624980OfI r51, X.InterfaceC1364105Vn<? super kotlin.Unit> r52) {
        /*
            Method dump skipped, instruction units count: 3074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625470Og5.LLZLLIL(X.0OfI, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0179  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v10, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v11, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    @Override // X.InterfaceC624740Oeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.String r12, X.InterfaceC1364105Vn r13) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625470Og5.x(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M0(java.lang.String r15, java.util.List<java.lang.String> r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625470Og5.M0(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    @Override // X.InterfaceC624740Oeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(boolean r14, boolean r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625470Og5.h(boolean, boolean, X.05Vn):java.lang.Object");
    }

    public static FeedItemList C0(int i, int i2, Boolean bool, int i3) {
        int i4;
        CommonInfoForClient commonInfoForClient;
        IOfflinePushService iOfflinePushServiceLIZ;
        if (i2 < 0) {
            i4 = 0;
        } else {
            i4 = i2;
        }
        ComposePbAndJson<C1620570sH1, FeedItemList> composePbAndJson = ((OfflineModeApi.OfflineModeApiDefinition) OfflineModeApi.LIZ.getValue()).offlineFeedList(i, i2, bool, C13LZ.LJ(i3, 0, i4)).execute().LIZIZ;
        Integer numValueOf = Integer.valueOf(i);
        String str = C1605000rru.LIZ;
        FeedItemList feedItemListLIZJ = composePbAndJson.LIZJ(new C1620390sGj(composePbAndJson, numValueOf));
        if (feedItemListLIZJ != null && (commonInfoForClient = feedItemListLIZJ.commonInfoForClient) != null && (iOfflinePushServiceLIZ = C625780Oga.LIZ()) != null) {
            iOfflinePushServiceLIZ.LJ(commonInfoForClient.userHighActiveTime, commonInfoForClient.regionHighActiveTime);
        }
        return feedItemListLIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.13BV] */
    @Override // X.InterfaceC624740Oeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJ(java.lang.String r19, java.lang.Integer r20, boolean r21, X.InterfaceC1364105Vn<? super X.C607970Nsx> r22) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625470Og5.LJJLIIIJ(java.lang.String, java.lang.Integer, boolean, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z) {
            LLILZIL = System.currentTimeMillis();
            C2296808zG.LIZJ(LLIZLLLIL, null);
            LLJ.LIZIZ(null);
            LJLLI(2, "onAccountResult success");
            LLJJIII = false;
            LLJJIJIIJIL = false;
            C0NII c0nii = LLJILJIL;
            if (c0nii != null) {
                C0NEM.LIZ.LIZJ(c0nii);
                C2296808zG.LIZJ(c0nii.LIZJ, null);
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            LLIZLLLIL = C2296808zG.LIZ(c1dfb);
            LLILZLL.clear();
            LLJILJILJ = EnumC624980OfI.SYSTEM_RESUME;
            C625460Og4.LIZ.getClass();
            try {
                C2296808zG.LIZJ(C625460Og4.LIZIZ, null);
                C625460Og4.LIZIZ = C2296808zG.LIZ(c1dfb);
                C625460Og4.LIZJ = false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C19319410i8 c19319410i8 = C625460Og4.LIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onLoginOrLogoutSuccess failed ");
                sbLIZ.append(e);
                c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            C625460Og4.LIZ.getClass();
            C625460Og4.LIZJ();
            D0();
            new C625860Ogi().LIZ(AFwS229S0000000_2.get$arr$(631));
        }
    }
}
