package X;

import Y.AfS176S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightColdStartOptSetting;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.follow.FollowGuideWidgetDialog;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.follow.FollowLiveDataFetchManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0J93, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J93 implements C0J9A {
    public static final C0J93 LIZ = new C0J93();

    @Override // X.C0J9A
    public final String LIZJ() {
        C519480KYw.LIZ.getClass();
        return C519480KYw.LJ;
    }

    @Override // X.C0J9A
    public final void LJ() {
        InterfaceC1106030et7.g7.LJFF(Boolean.TRUE);
    }

    @Override // X.C0J9A
    public final boolean LJIIJ() {
        C519480KYw.LIZ.getClass();
        if (1 == C519480KYw.LIZIZ()) {
            Long lLIZIZ = InterfaceC1106030et7.f7.LIZIZ();
            if ((lLIZIZ.longValue() <= 0 || System.currentTimeMillis() - lLIZIZ.longValue() <= 259200000) && C519480KYw.LIZJ > 0 && !InterfaceC1106030et7.g7.LIZIZ().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C0J9A
    public final boolean LJIIJJI() {
        C519480KYw.LIZ.getClass();
        return C519480KYw.LJII;
    }

    @Override // X.C0J9A
    public final C0J6Q LJIILIIL() {
        return new C487270J8z();
    }

    @Override // X.C0J9A
    public final C0J6Q LJIILJJIL() {
        return new C482800IwY();
    }

    @Override // X.C0J9A
    public final boolean LJIILL() {
        C519480KYw.LIZ.getClass();
        return C519480KYw.LJIIIIZZ;
    }

    @Override // X.C0J9A
    public final void LJIILLIIL() throws Throwable {
        C519480KYw.LIZ.getClass();
        C519480KYw.LJIIIZ();
    }

    @Override // X.C0J9A
    public final void LJIJ() {
        C20337914i1<Long> c20337914i1 = InterfaceC1106030et7.f7;
        if (c20337914i1.LIZIZ().longValue() <= 0) {
            c20337914i1.LJFF(Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // X.C0J9A
    public final boolean LJIJI() {
        C519480KYw.LIZ.getClass();
        return InterfaceC1106030et7.h7.LIZIZ().booleanValue();
    }

    @Override // X.C0J9A
    public final long LJIJJ() {
        C519480KYw.LIZ.getClass();
        return C519480KYw.LJI;
    }

    @Override // X.C0J9A
    public final void LJJI() {
        C519480KYw.LIZ.getClass();
        C519480KYw.LJIIIIZZ = true;
    }

    @Override // X.C0J9A
    public final Pair LJJIIJZLJL() {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).zD0();
        C0IO1 c0io1 = C0IO1.LIZ;
        return C0IO1.LIZ();
    }

    @Override // X.C0J9A
    public final boolean Na() {
        return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).Na();
    }

    @Override // X.C0J9A
    public final int getAnchorPosition() {
        C519480KYw.LIZ.getClass();
        return C519480KYw.LJFF;
    }

    @Override // X.C0J9A
    public final boolean getIsFollowWidgetExp() {
        C519480KYw.LIZ.getClass();
        return 1 == C519480KYw.LIZIZ();
    }

    @Override // X.C0J9A
    public final int getWidgetAnchorNum() {
        C519480KYw.LIZ.getClass();
        return C519480KYw.LIZLLL();
    }

    @Override // X.C0J9A
    public final boolean re() {
        return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).re();
    }

    @Override // X.C0J9A
    public final boolean LIZ() {
        int expGroup;
        return C0BK6.LIZ() && 2 <= (expGroup = FollowLiveBubbleSettings.INSTANCE.getExpGroup()) && expGroup < 4;
    }

    @Override // X.C0J9A
    public final HashSet<String> LIZLLL() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "inbox_2_follow_guide_debug", true) != 0 ? new HashSet<>() : InterfaceC1106030et7.z7.LIZIZ();
    }

    @Override // X.C0J9A
    public final void LJI() {
        if (FollowLiveDataFetchManager.LIZJ() && FollowLiveDataFetchManager.LIZ() && !FollowLiveDataFetchManager.LIZ) {
            FollowLiveDataFetchManager.LIZ = true;
            C0IT6 c0it6 = C0IT6.LIZ;
            AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(239);
            C11NZ.LJJJJZ(Unit.LIZ).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0IT8
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    Object c098200Yq;
                    C0IT6 c0it62 = C0IT6.LIZ;
                    if (!C0IT6.LIZIZ) {
                        C0IT6.LIZIZ = true;
                        if (LiveSkylightColdStartOptSetting.enableLocalCache()) {
                            Keva repo = Keva.getRepo("global_follow_live_data_repo");
                            try {
                                c098200Yq = (C0IT7) C293501Bt.LIZ().LJII(repo.getString("follow_live_data_extra", ""), C0IT7.class);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            C0IT7 c0it7 = (C0IT7) c098200Yq;
                            if (c0it7 != null) {
                                Long l = c0it7.LIZJ;
                                long curUserId = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId();
                                if (l != null && l.longValue() == curUserId) {
                                    long j = c0it7.LIZIZ;
                                    long localCacheExpireTime = LiveSkylightColdStartOptSetting.getLocalCacheExpireTime() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                                    long jCurrentTimeMillis = System.currentTimeMillis() - j;
                                    if (0 <= jCurrentTimeMillis && jCurrentTimeMillis <= localCacheExpireTime) {
                                        String string = repo.getString("follow_live_data", "");
                                        try {
                                            List list = (List) C293501Bt.LIZ().LJIIIIZZ(string, new TypeToken<List<Room>>() { // from class: X.0ITA
                                            }.getType());
                                            String str = c0it7.LIZ;
                                            C0IT6 c0it63 = C0IT6.LIZ;
                                            C0IT6.LIZLLL = new C0IT1(list, new C0IT7(str, j, Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId()), C0IV2.LOCAL_CACHE, SystemClock.uptimeMillis()));
                                            C0IT6.LIZJ = curUserId;
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("initLocalCachedData, size=");
                                            sbLIZ.append(list.size());
                                            C189200o6.m2constructorimpl(Integer.valueOf(Log.d("FollowDataCenter", C2188811AlT.LIZIZ(sbLIZ))));
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            C189200o6.m2constructorimpl(new C098200Yq(th2));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return Unit.LIZ;
                }
            }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(aFwS237S0000000_7, 169), new C516201zk(aFwS237S0000000_7, 148));
        }
    }

    @Override // X.C0J9A
    public final C0J90 LJJIIZI() {
        return C0J9F.LIZJ;
    }

    @Override // X.C0J9A
    public final void LIZIZ(String str) {
        Set<String> set = FollowLiveDataFetchManager.LJI;
        if (!set.contains(str)) {
            set.add(str);
            if (!FollowLiveDataFetchManager.LIZ()) {
                AFwS193S0000000_7 aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(206);
                if (FollowLiveDataFetchManager.LIZ && FollowLiveDataFetchManager.LIZJ() && LiveSkylightColdStartOptSetting.getGlobalFetchStrategy() == 2) {
                    aFwS193S0000000_7.invoke();
                }
            }
        }
    }

    @Override // X.C0J9A
    public final String LJII(String str) {
        return C1143780fs0.LJIIJ("tiktok_live_watch_resource_normal_1", str);
    }

    @Override // X.C0J9A
    public final void LJIIIZ(String str) {
        C19EG c19egLIZIZ;
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLJFF)) != null) {
            C519480KYw.LIZ.getClass();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("from_position", str, bundle);
            FollowGuideWidgetDialog followGuideWidgetDialog = new FollowGuideWidgetDialog();
            followGuideWidgetDialog.setArguments(bundle);
            FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            C1391850mK7.LIZIZ(followGuideWidgetDialog, "add_live_watch_nscreen");
            followGuideWidgetDialog.show(supportFragmentManager, "FollowAddWidgetGuideUtil");
        }
    }

    @Override // X.C0J9A
    public final InterfaceC662550Pyn LJIJJLI(C1322110kVd c1322110kVd) {
        return LJJIJIIJIL(c1322110kVd, true);
    }

    @Override // X.C0J9A
    public final void LJJ(HashSet<String> hashSet) {
        InterfaceC1106030et7.z7.LJFF(hashSet);
    }

    @Override // X.C0J9A
    public final String LJJIFFI(long j) {
        C519480KYw.LIZ.getClass();
        if (j <= 0) {
            return C519480KYw.LJ().getString("follow_anchor_live_info_0", "");
        }
        Keva kevaLJ = C519480KYw.LJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("follow_anchor_live_info_");
        sbLIZ.append(j);
        return kevaLJ.getString(C2188811AlT.LIZIZ(sbLIZ), "");
    }

    @Override // X.C0J9A
    public final boolean LJJII(boolean z) {
        Activity activityLJFF = C2214201BlK.LJFF();
        boolean z2 = false;
        if (activityLJFF == null) {
            return false;
        }
        C519480KYw.LIZ.getClass();
        if (C519480KYw.LJI(activityLJFF, z).length == 0) {
            z2 = true;
        }
        return !z2;
    }

    @Override // X.C0J9A
    public final void LJJIIZ(int i) {
        C519480KYw.LIZ.getClass();
        C519480KYw.LIZJ = i;
    }

    @Override // X.C0J9A
    public final void LJJIJ(boolean z) {
        C519480KYw.LIZ.getClass();
        C519480KYw.LJII = z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0J95] */
    public static C0J95 LJJIJIIJIL(C1322110kVd c1322110kVd, boolean z) {
        if (c1322110kVd == null) {
            return null;
        }
        final C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LJFF = z;
        c1143920fsE.LIZIZ = "tiktok_live_watch_resource_normal_1";
        c1143920fsE.LIZJ = "live_skylight_icon_anim_small_size.webp";
        c1143920fsE.LIZ = c1322110kVd;
        c1143920fsE.LJI = Integer.MAX_VALUE;
        C1143680frq.LJIIIIZZ(c1143920fsE);
        return new InterfaceC662550Pyn() { // from class: X.0J95
            @Override // X.InterfaceC662550Pyn
            public final void LIZ() {
                c1143920fsE.LJFF();
            }

            @Override // X.InterfaceC662550Pyn
            public final void LJIIZILJ() {
                c1143920fsE.LIZ();
            }
        };
    }

    @Override // X.C0J9A
    public final void LJFF(View view, String str) {
        C1143680frq.LJI(view, str, null, true);
    }

    @Override // X.C0J9A
    public final InterfaceC1590940rVE LJIIIIZZ(InterfaceC19244510Qp interfaceC19244510Qp, final WeakReference<Context> weakReference) {
        final C0J9C c0j9c = (C0J9C) interfaceC19244510Qp;
        return new AbstractC1593880rZy(c0j9c, weakReference) { // from class: X.0J9B
            public final C0J9C LJ;

            @Override // X.InterfaceC1590940rVE
            public final void LIZ() {
                C20684815ws.LJIILLIIL("tooltip_protection_check", LIZLLL("2002").LIZ);
            }

            @Override // X.InterfaceC1590940rVE
            public final boolean LIZIZ() {
                IntRange intRange = new IntRange(2, 3);
                FollowLiveBubbleConfig followLiveBubbleConfig = this.LJ.LIZ;
                Integer numValueOf = followLiveBubbleConfig != null ? Integer.valueOf(followLiveBubbleConfig.expGroup) : null;
                return numValueOf != null && intRange.LJLJL(numValueOf.intValue());
            }

            @Override // X.InterfaceC1590940rVE
            public final void q0(Function0<Unit> function0) {
                C0J6Q c0j6q;
                C0J6Q c0j6q2;
                C0J9C c0j9c2 = this.LJ;
                if (c0j9c2.LIZJ) {
                    WeakReference<C0J6Q> weakReference2 = c0j9c2.LIZIZ;
                    if (weakReference2 != null && (c0j6q2 = weakReference2.get()) != null) {
                        c0j6q2.LIZIZ("", true);
                        return;
                    }
                    return;
                }
                WeakReference<C0J6Q> weakReference3 = c0j9c2.LIZIZ;
                if (weakReference3 == null || (c0j6q = weakReference3.get()) == null) {
                    return;
                }
                c0j6q.LIZIZ("", false);
            }

            {
                super(c0j9c, weakReference);
                this.LJ = c0j9c;
            }
        };
    }

    @Override // X.C0J9A
    public final void LJIIL(ArrayList arrayList, int i) {
        C0J90 c0j90 = C0J9F.LIZJ;
        c0j90.LIZ = i;
        c0j90.LIZIZ = 0;
        c0j90.LIZJ = arrayList;
    }

    @Override // X.C0J9A
    public final void LJIIZILJ(C19EG c19eg, Intent intent) {
        String stringExtra;
        C519480KYw.LIZ.getClass();
        String stringExtra2 = null;
        try {
            stringExtra2 = intent.getStringExtra("follow_widget_enter_from_merge");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (Intrinsics.LJFF("follow_widget", stringExtra2)) {
            C519480KYw.LJII = true;
            C519480KYw.LJFF = intent.getIntExtra("follow_widget_click_position", 0);
            try {
                stringExtra = intent.getStringExtra("follow_widget_click_type");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
            C519480KYw.LJ = stringExtra;
            C519480KYw.LJI = intent.getLongExtra("follow_widget_click_room_id", 0L);
            intent.getLongExtra("follow_widget_click_anchor_id", 0L);
            if (C519480KYw.LJII) {
                if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
                    Activity activityLIZ = C0FNT.LIZ(c19eg);
                    if (activityLIZ != null) {
                        ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
                        C0XQS c0xqs = new C0XQS();
                        c0xqs.LIZ = activityLIZ;
                        c0xqs.LJ = new C521920KdS(c19eg, 1);
                        iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
                        return;
                    }
                    return;
                }
                C519480KYw.LJIIJJI(c19eg);
            }
        }
    }

    @Override // X.C0J9A
    public final InterfaceC662550Pyn LJJIJIIJI(C1322110kVd c1322110kVd, boolean z) {
        return LJJIJIIJIL(c1322110kVd, z);
    }

    @Override // X.C0J9A
    public final void LJIL(int i, long j, String str) {
        C519480KYw.LIZ.getClass();
        if (TextUtils.isEmpty(str)) {
            Keva kevaLJ = C519480KYw.LJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("follow_anchor_live_info_");
            sbLIZ.append(j);
            kevaLJ.storeString(C2188811AlT.LIZIZ(sbLIZ), "");
            return;
        }
        Keva kevaLJ2 = C519480KYw.LJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("follow_anchor_live_info_");
        sbLIZ2.append(j);
        kevaLJ2.storeString(C2188811AlT.LIZIZ(sbLIZ2), str);
        if (i != 0) {
            return;
        }
        C519480KYw.LJ().storeString("follow_anchor_live_info_0", str);
    }

    @Override // X.C0J9A
    public final void LJJIIJ(int i, Context context, List list) throws Throwable {
        C519480KYw.LIZ.getClass();
        C519480KYw.LIZJ = i;
        C519480KYw.LIZLLL = list;
        if (context != null) {
            C519480KYw.LJIIJ(context);
        } else {
            C519480KYw.LJIIIZ();
        }
        C519480KYw.LJ().storeInt("follow_anchor_live_num", i);
    }

    @Override // X.C0J9A
    public final InterfaceC19244510Qp LJJIII(WeakReference<View> weakReference, C0J97 c0j97, WeakReference<C0J6Q> weakReference2, boolean z) {
        FollowLiveBubbleConfig followLiveBubbleConfig;
        if (c0j97 != null) {
            followLiveBubbleConfig = new FollowLiveBubbleConfig();
            followLiveBubbleConfig.expGroup = c0j97.LIZ;
            followLiveBubbleConfig.diffTime = c0j97.LIZIZ;
        } else {
            followLiveBubbleConfig = null;
        }
        return new C0J9C(followLiveBubbleConfig, weakReference2, z);
    }
}
