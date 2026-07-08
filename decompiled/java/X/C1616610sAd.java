package X;

import Y.ACListenerS139S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.keva.Keva;
import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0sAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616610sAd implements InterfaceC1616630sAf {
    public static final C1616610sAd LIZ = new C1616610sAd();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(28));

    @Override // X.InterfaceC1616630sAf
    public final boolean LJIILJJIL() {
        return true;
    }

    public static Keva LJIJJ() {
        return (Keva) LIZIZ.getValue();
    }

    @Override // X.InterfaceC1616630sAf
    public final boolean LIZJ() {
        return !C1616560sAY.LIZ("ITabletDiff.optRefferalCard");
    }

    @Override // X.InterfaceC1616630sAf
    public final boolean LJ() {
        return !C1616560sAY.LIZ("ITabletDiff.enableDetailActivityOrientationBehind");
    }

    @Override // X.InterfaceC1616630sAf
    public final boolean LJIIIZ() {
        return !C1616560sAY.LIZ("ITabletDiff.needBlockLandscapeVideoOptimize");
    }

    @Override // X.InterfaceC1616630sAf
    public final boolean LJIILIIL() {
        return ((Boolean) C0AV9.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1616630sAf
    public final InterfaceC638140P1g LIZ() {
        return new InterfaceC638140P1g() { // from class: X.0sAZ
            @Override // X.InterfaceC638140P1g
            public final int LIZ() {
                return C1616560sAY.LIZ("ITabletDropHelper.getFeedCacheExpireTime") ? 0 : 96;
            }

            @Override // X.InterfaceC638140P1g
            public final boolean LIZIZ() {
                if (C1616560sAY.LIZ("ITabletDropHelper.needDropProgressBar") || !C589230N9d.LIZJ()) {
                    return false;
                }
                C20594415iI.LIZ.getClass();
                return C20594415iI.LIZ(null);
            }

            @Override // X.InterfaceC638140P1g
            public final boolean LIZJ() {
                if (C1616560sAY.LIZ("ITabletDropHelper.needDropDynamicCover") || !C589230N9d.LIZJ()) {
                    return false;
                }
                C20594415iI.LIZ.getClass();
                return C20594415iI.LIZ(null);
            }

            @Override // X.InterfaceC638140P1g
            public final boolean LJI() {
                if (C1616560sAY.LIZ("ITabletDropHelper.needDropMusicAnimation") || !C589230N9d.LIZJ()) {
                    return false;
                }
                C20594415iI.LIZ.getClass();
                return C20594415iI.LIZ(null);
            }

            @Override // X.InterfaceC638140P1g
            public final int LJII() {
                if (C1616560sAY.LIZ("ITabletDropHelper.progressBarInterval")) {
                    return 0;
                }
                if (LIZIZ()) {
                    return 600;
                }
                return DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            }

            @Override // X.InterfaceC638140P1g
            public final int LIZLLL(int i) {
                int iIntValue = ((Number) C264060AWm.LIZ.getValue()).intValue();
                if (iIntValue != 0) {
                    return iIntValue;
                }
                return i;
            }

            @Override // X.InterfaceC638140P1g
            public final int LJ(int i) {
                if (C1616560sAY.LIZ("ITabletDropHelper.loadMoreTriggerCountValue")) {
                    return i;
                }
                return 3;
            }

            @Override // X.InterfaceC638140P1g
            public final int LJFF(int i) {
                if (C1616560sAY.LIZ("ITabletDropHelper.playbackSpeedValue")) {
                    return i;
                }
                return 2;
            }

            @Override // X.InterfaceC638140P1g
            public final int LJIIIIZZ(int i) {
                if (C1616560sAY.LIZ("ITabletDropHelper.loadMoreTimingOptValue")) {
                    return i;
                }
                return 0;
            }

            @Override // X.InterfaceC638140P1g
            public final boolean LJIIIZ(boolean z) {
                if (C1616560sAY.LIZ("ITabletDropHelper.enableAutoVolumeAdjustment")) {
                    return z;
                }
                return false;
            }
        };
    }

    @Override // X.InterfaceC1616630sAf
    public final InterfaceC1246800iYA LIZIZ() {
        return C339220DRo.LIZ;
    }

    @Override // X.InterfaceC1616630sAf
    public final C1BMJ LIZLLL() {
        return new C1BMJ() { // from class: X.0sAc
            @Override // X.C1BMJ
            public final boolean LLJILJILJ() {
                return !C1616560sAY.LIZ("ITabletCommonAdapter.sparkPluginNeedHandle");
            }
        };
    }

    @Override // X.InterfaceC1616630sAf
    public final C188J LJFF() {
        return new C188J() { // from class: X.0DXt
            @Override // X.C188J
            public final boolean LIZ() {
                return true;
            }

            @Override // X.C188J
            public final void LIZIZ(View view) {
                C19ME c19me;
                C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(view.getContext(), null);
                int iMin = Math.min(c1389350mG5LIZJ.LIZIZ, c1389350mG5LIZJ.LIZJ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                if (iMin > 0) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                        c19me.endToEnd = -1;
                        c19me.startToStart = 0;
                        c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                        c19me.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                        ((ViewGroup.MarginLayoutParams) c19me).width = Math.min(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(517)), iMin);
                        C786410Ut5.W5(view, c19me);
                    }
                }
            }
        };
    }

    @Override // X.InterfaceC1616630sAf
    public final InterfaceC1249220ic4 LJI() {
        return C1616580sAa.LIZ;
    }

    @Override // X.InterfaceC1616630sAf
    public final InterfaceC1618310sDN LJII() {
        return new InterfaceC1618310sDN() { // from class: X.0sAX
            @Override // X.InterfaceC1618310sDN
            public final Pair LLLLII() {
                return C1616560sAY.LIZ("ITabletSearch.getDiscoverCoverViewSize") ? C1616510sAT.LIZ.LLLLII() : new Pair(Float.valueOf(180.0f), Float.valueOf(240.0f));
            }

            @Override // X.InterfaceC1618310sDN
            public final boolean LLLLIIL() {
                return ((Number) C0AVH.LIZ.getValue()).intValue() == 3;
            }

            @Override // X.InterfaceC1618310sDN
            public final int LJJLIIJ(int i) {
                if (i >= 650 && C589230N9d.LIZIZ()) {
                    if (((Boolean) C263970AWd.LIZ.getValue()).booleanValue()) {
                        return C0AVY.LIZ(i);
                    }
                    if (i > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(900))) {
                        return 5;
                    }
                    if (i > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(480))) {
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }

            @Override // X.InterfaceC1618310sDN
            public final int LLIIIILZ(int i) {
                if (C1616560sAY.LIZ("ITabletSearch.getDiscoverBannerHeight")) {
                    return i;
                }
                return (int) (C341940Daq.LIZ(460.0d) * 0.48104957f);
            }

            @Override // X.InterfaceC1618310sDN
            public final Pair LLJJIJIIJIL(int i, int i2) {
                if (C1616560sAY.LIZ("ITabletSearch.getDiscoverBannerMaxCountAndIndex")) {
                    return C1616510sAT.LIZ.LLJJIJIIJIL(i, i2);
                }
                int i3 = i * 10000;
                if (i3 >= 1000000) {
                    i3 = 1000000;
                }
                return new Pair(Integer.valueOf(i3), Integer.valueOf(i3 / 2));
            }

            @Override // X.InterfaceC1618310sDN
            public final boolean LLLILZ(int i, View view) {
                if (C1616560sAY.LIZ("ITabletSearch.setDiscoverBannerPadding")) {
                    return false;
                }
                int iLIZ = (i - C341940Daq.LIZ(460.0d)) / 2;
                view.setPadding(iLIZ, 0, iLIZ, 0);
                ViewPager viewPager = (ViewPager) view;
                viewPager.setPageMargin(C341940Daq.LIZ(2.0d));
                viewPager.setClipToPadding(false);
                return true;
            }
        };
    }

    @Override // X.InterfaceC1616630sAf
    public final C0T45 LJIIIIZZ() {
        return C0T45.LIZ;
    }

    @Override // X.InterfaceC1616630sAf
    public final InterfaceC827860Wdk LJIIJ() {
        return new InterfaceC827860Wdk() { // from class: X.0sAe
            @Override // X.InterfaceC827860Wdk
            public final int LIZ() {
                return C1389340mG4.LIZJ(null, null).LJFF ? 1 : 0;
            }

            @Override // X.InterfaceC827860Wdk
            public final String LIZIZ() {
                return "tablet";
            }

            @Override // X.InterfaceC827860Wdk
            public final int isPad() {
                return 1;
            }
        };
    }

    @Override // X.InterfaceC1616630sAf
    public final InterfaceC1583450rJ9 LJIIJJI() {
        return new InterfaceC1583450rJ9() { // from class: X.0AVW
            @Override // X.InterfaceC1583450rJ9
            public final boolean LJIIIZ() {
                return ((Number) C0AVU.LIZ.getValue()).intValue() == 1;
            }

            @Override // X.InterfaceC1583450rJ9
            public final boolean LLIILII() {
                return ((Boolean) C0AVX.LIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1583450rJ9
            public final boolean LLLILZLLLI() {
                return ((Boolean) C0AVV.LIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1583450rJ9
            public final int LJJLIIIIJ(int i) {
                if (!LLIILII()) {
                    return 2;
                }
                return C0AVY.LIZ(i);
            }

            @Override // X.InterfaceC1583450rJ9
            public final int LLIL(int i) {
                if (((Number) C0AVU.LIZ.getValue()).intValue() != 1) {
                    return 0;
                }
                return i;
            }
        };
    }

    @Override // X.InterfaceC1616630sAf
    public final InterfaceC1903240zcw LJIIL() {
        return new InterfaceC1903240zcw() { // from class: X.0zcv
            public static final Map<String, EnumC1903200zcs> LIZIZ;
            public static boolean LIZJ;
            public static boolean LIZLLL;
            public static boolean LJ;

            @Override // X.InterfaceC1903240zcw
            public final void LIZLLL() {
                LIZLLL = false;
            }

            static {
                EnumC1903200zcs enumC1903200zcs = EnumC1903200zcs.FOLLOWERS;
                EnumC1903200zcs enumC1903200zcs2 = EnumC1903200zcs.NOTIFICATIONS;
                EnumC1903200zcs enumC1903200zcs3 = EnumC1903200zcs.ACTIVITY;
                LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("inbox/followers", enumC1903200zcs), new Pair("user/inbox/follower", enumC1903200zcs), new Pair("im/chat/room", EnumC1903200zcs.CHAT), new Pair("inbox/bulletin_board", EnumC1903200zcs.BULLETIN), new Pair("user/notification", enumC1903200zcs2), new Pair("inbox/activity", enumC1903200zcs3), new Pair("inbox/merged_activity_followers", enumC1903200zcs3), new Pair("inbox/system_notice", enumC1903200zcs2));
                LIZLLL = true;
                LJ = true;
            }

            @Override // X.InterfaceC1903240zcw
            public final boolean LIZIZ() {
                if (LIZLLL) {
                    return true;
                }
                LIZLLL = true;
                return false;
            }

            @Override // X.InterfaceC1903240zcw
            public final boolean LJI() {
                return ((Boolean) C0AVG.LIZ.getValue()).booleanValue() && C1389340mG4.LJ() >= 790 && LJ;
            }

            @Override // X.InterfaceC1903240zcw
            public final void LJIIJ() {
                if (LJI()) {
                    C1440005kM.LIZ(new IEvent() { // from class: X.0zd2
                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent post() {
                            C1440005kM.LIZ(this);
                            return this;
                        }

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent postSticky() {
                            C1440005kM.LIZIZ(this);
                            return this;
                        }
                    });
                }
            }

            public static EnumC1903200zcs LJIIJJI(RouteIntent routeIntent) {
                String url;
                Object obj = null;
                if (routeIntent == null || (url = routeIntent.getUrl()) == null) {
                    return null;
                }
                int i = -1;
                if (u.LJIIZILJ(url, "/", false)) {
                    url = url.substring(0, url.length() - 1);
                }
                if (a0.LJJIJ(url, '?')) {
                    int length = url.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        if (url.charAt(i2) == '?') {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                    url = url.substring(0, i);
                }
                Iterator<T> it2 = LIZIZ.keySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (u.LJIIZILJ(url, (String) next, false)) {
                        obj = next;
                        break;
                    }
                }
                return LIZIZ.get(obj);
            }

            @Override // X.InterfaceC1903240zcw
            public final void LIZ(String str) {
                if (!LJI()) {
                    return;
                }
                C1440005kM.LIZ(new C1903290zd1(str));
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
            @Override // X.InterfaceC1903240zcw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZJ(com.bytedance.router.RouteIntent r6) {
                /*
                    r5 = this;
                    X.0zcs r0 = LJIIJJI(r6)
                    r2 = 0
                    if (r0 != 0) goto L8
                    return r2
                L8:
                    int[] r1 = X.C1903220zcu.LIZ
                    int r0 = r0.ordinal()
                    r1 = r1[r0]
                    r4 = 0
                    r3 = 1
                    if (r1 == r3) goto L3e
                    r0 = 2
                    if (r1 == r0) goto L3b
                    r0 = 3
                    if (r1 == r0) goto L38
                    r0 = 4
                    if (r1 == r0) goto L35
                    r0 = 5
                    if (r1 != r0) goto L78
                    if (r6 == 0) goto L33
                    android.content.Intent r0 = r6.getExtra()
                    if (r0 == 0) goto L33
                    android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Exception -> L2f
                    if (r1 == 0) goto L33
                    goto L6b
                L2f:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L33:
                    r1 = 0
                    goto L71
                L35:
                    boolean r2 = X.C1903230zcv.LIZJ
                    return r2
                L38:
                    boolean r2 = X.C1903230zcv.LIZJ
                    return r2
                L3b:
                    boolean r2 = X.C1903230zcv.LIZJ
                    return r2
                L3e:
                    boolean r0 = X.C1903230zcv.LIZJ
                    if (r0 != 0) goto L77
                    if (r6 == 0) goto L5c
                    android.content.Intent r0 = r6.getExtra()
                    if (r0 == 0) goto L5c
                    android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Exception -> L51
                    if (r1 == 0) goto L5c
                    goto L56
                L51:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    goto L5c
                L56:
                    java.lang.String r0 = "key_enter_chat_params"
                    java.io.Serializable r4 = r1.getSerializable(r0)
                L5c:
                    boolean r0 = r4 instanceof com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams
                    if (r0 == 0) goto L78
                    com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams r4 = (com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams) r4
                    if (r4 == 0) goto L78
                    boolean r0 = r4.getTabletOptimizationEnabled()
                    if (r0 != r3) goto L78
                    goto L77
                L6b:
                    java.lang.String r0 = "inbox_entry_point"
                    boolean r1 = r1.getBoolean(r0, r2)
                L71:
                    boolean r0 = X.C1903230zcv.LIZJ
                    if (r0 == 0) goto L78
                    if (r1 == 0) goto L78
                L77:
                    r2 = 1
                L78:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1903230zcv.LIZJ(com.bytedance.router.RouteIntent):boolean");
            }

            @Override // X.InterfaceC1903240zcw
            public final void LJ(String str) {
                if (!LJI()) {
                    return;
                }
                C1440005kM.LIZ(new C1903280zd0(str));
            }

            @Override // X.InterfaceC1903240zcw
            public final void LJII(boolean z) {
                LIZJ = z;
            }

            @Override // X.InterfaceC1903240zcw
            public final boolean LJIIIIZZ(RouteIntent routeIntent) {
                EnumC1903200zcs enumC1903200zcsLJIIJJI;
                Intent extra;
                if (!LJI() || (enumC1903200zcsLJIIJJI = LJIIJJI(routeIntent)) == null) {
                    return false;
                }
                Bundle extras = null;
                if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                    try {
                        extras = extra.getExtras();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                C1440005kM.LIZ(new C1903270zcz(new C1902240zbK(enumC1903200zcsLJIIJJI, extras)));
                return true;
            }

            @Override // X.InterfaceC1903240zcw
            public final void LJFF(int i, int i2) {
                if (i < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(790)) || i2 < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(790))) {
                    LJ = false;
                }
            }

            @Override // X.InterfaceC1903240zcw
            public final void LJIIIZ(View view, boolean z) {
                if (!LJI()) {
                    return;
                }
                StateListDrawable stateListDrawable = new StateListDrawable();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.o_, view.getContext());
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZ = Integer.valueOf(iIntValue);
                    Drawable drawableLIZ = c384050F3z.LIZ(view.getContext());
                    int[] iArr = new int[0];
                    if (!z) {
                        drawableLIZ = new ColorDrawable(0);
                    }
                    stateListDrawable.addState(iArr, drawableLIZ);
                    view.setForeground(stateListDrawable);
                }
            }
        };
    }

    @Override // X.InterfaceC1616630sAf
    public final InterfaceC1388170mEB LJIILL() {
        return C737710Swj.LIZ;
    }

    @Override // X.InterfaceC1616630sAf
    public final InterfaceC1371730lnf LJIILLIIL() {
        return new InterfaceC1371730lnf() { // from class: X.0DRn
            @Override // X.InterfaceC1371730lnf
            public final int LJ() {
                return C0AVK.LIZ();
            }

            @Override // X.InterfaceC1371730lnf
            public final boolean LJFF() {
                return LJIIIIZZ() || LJII() || LJIIIZ(null) || LJI(null);
            }

            @Override // X.InterfaceC1371730lnf
            public final boolean LJII() {
                return C0AVK.LIZ() == 2;
            }

            @Override // X.InterfaceC1371730lnf
            public final boolean LJIIIIZZ() {
                return C0AVK.LIZ() == 1;
            }

            @Override // X.InterfaceC1371730lnf
            public final int LIZIZ(boolean z) {
                if (!z && (LJIIIIZZ() || LJII())) {
                    return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }
                if (LJIIIIZZ() || LJII() || (!z && (LJIIIZ(null) || LJI(null)))) {
                    return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                if (!LJIIIZ(null) && !LJI(null)) {
                    return 0;
                }
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            }

            @Override // X.InterfaceC1371730lnf
            public final int LIZJ(boolean z) {
                if (!z && (LJIIIIZZ() || LJII())) {
                    return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }
                if (LJIIIIZZ() || LJII() || (!z && (LJIIIZ(null) || LJI(null)))) {
                    return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                }
                if (!LJIIIZ(null) && !LJI(null)) {
                    return 0;
                }
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            }

            @Override // X.InterfaceC1371730lnf
            public final boolean LJI(Integer num) {
                int iLIZIZ;
                if (C0AVK.LIZ() == 4) {
                    if (num != null) {
                        iLIZIZ = num.intValue();
                    } else {
                        iLIZIZ = C1389340mG4.LIZJ(null, null).LIZIZ();
                    }
                    if (iLIZIZ > 650) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC1371730lnf
            public final boolean LJIIIZ(Integer num) {
                int iLIZIZ;
                if (C0AVK.LIZ() == 3) {
                    if (num != null) {
                        iLIZIZ = num.intValue();
                    } else {
                        iLIZIZ = C1389340mG4.LIZJ(null, null).LIZIZ();
                    }
                    if (iLIZIZ > 650) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC1371730lnf
            public final void LIZLLL(int i, View view, View view2, boolean z) {
                if (i == 1) {
                    if (!LJIIIIZZ()) {
                        return;
                    }
                } else if (i == 2) {
                    if (!LJII()) {
                        return;
                    }
                } else {
                    if (i == 3) {
                        if (!LJIIIZ(null)) {
                            return;
                        }
                    } else if (i != 4 || !LJI(null)) {
                        return;
                    }
                    if (view != null) {
                        view.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(97));
                        view.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(129));
                    }
                    if (view2 == null) {
                        return;
                    }
                    view2.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(129));
                    return;
                }
                if (!C19252910Tv.LIZIZ.LIZLLL().LJIJI().LIZ(z)) {
                    return;
                }
                if (view != null) {
                    view.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(63));
                    view.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
                }
                if (view2 == null) {
                    return;
                }
                view2.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
            }

            @Override // X.InterfaceC1371730lnf
            public final void LIZ(Context context, int i, TuxSheet tuxSheet, View view, int i2, boolean z) {
                boolean z2;
                boolean z3;
                ViewGroup.LayoutParams layoutParams;
                int i3;
                ViewGroup.MarginLayoutParams marginLayoutParams;
                Dialog dialog;
                Window window;
                Window window2;
                FrameLayout frameLayout;
                FrameLayout.LayoutParams layoutParams2;
                int iLIZIZ = 0;
                if (i2 == 1) {
                    if (LJIIIIZZ()) {
                        z2 = true;
                    } else {
                        return;
                    }
                } else {
                    z2 = false;
                }
                if (i2 == 2 && LJII()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ViewGroup.LayoutParams layoutParams3 = null;
                if (!z2 && !z3) {
                    if (i2 == 3) {
                        if (LJIIIZ(null)) {
                            if (view != null) {
                                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                                if (layoutParams4 != null) {
                                    layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(650));
                                }
                                layoutParams3 = view.getLayoutParams();
                            }
                            if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                                layoutParams2.gravity = 81;
                            }
                            if (context != null) {
                                float dimension = context.getResources().getDimension(R.dimen.b2);
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setShape(0);
                                gradientDrawable.setCornerRadii(new float[]{dimension, dimension, dimension, dimension, 0.0f, 0.0f, 0.0f, 0.0f});
                                gradientDrawable.setColor(i);
                                if (view != null) {
                                    view.setBackground(gradientDrawable);
                                }
                            }
                            if (tuxSheet != null) {
                                Dialog dialog2 = tuxSheet.getDialog();
                                if (dialog2 != null && (frameLayout = (FrameLayout) dialog2.findViewById(R.id.v4a)) != null) {
                                    C786410Ut5.O7(frameLayout, new ACListenerS139S0100000_4(tuxSheet, 64));
                                }
                                Dialog dialog3 = tuxSheet.getDialog();
                                if (dialog3 != null && (window2 = dialog3.getWindow()) != null) {
                                    window2.setDimAmount(0.8f);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i2 != 4 || !LJI(null) || tuxSheet == null || (dialog = tuxSheet.getDialog()) == null || (window = dialog.getWindow()) == null) {
                        return;
                    }
                    window.setDimAmount(0.8f);
                    return;
                }
                if (view != null) {
                    layoutParams3 = view.getLayoutParams();
                }
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null && context != null) {
                    if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LIZ(z)) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(148));
                    }
                    marginLayoutParams.bottomMargin = iLIZIZ;
                }
                if (!C19252910Tv.LIZIZ.LIZLLL().LJIJI().LIZ(z) || view == null || (layoutParams = view.getLayoutParams()) == null) {
                    return;
                }
                if (z2) {
                    i3 = 428;
                } else {
                    i3 = 275;
                }
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
            }
        };
    }

    @Override // X.InterfaceC1616630sAf
    public final InterfaceC1345580l7U LJIIZILJ() {
        return new InterfaceC1345580l7U() { // from class: X.0lFr
            @Override // X.InterfaceC1345580l7U
            public final void LIZ() {
            }

            @Override // X.InterfaceC1345580l7U
            public final boolean LIZIZ() {
                if (C1616560sAY.LIZ("ITabletCommentHelper.blockDislike")) {
                    return false;
                }
                C20595015iO.LIZ.getClass();
                return C20595015iO.LJFF();
            }

            @Override // X.InterfaceC1345580l7U
            public final boolean LIZLLL() {
                return !C1616560sAY.LIZ("ITabletCommentHelper.blockDetailPageExperiment");
            }

            @Override // X.InterfaceC1345580l7U
            public final void LIZJ(C19EG c19eg, ViewPager viewPager, Configuration configuration, boolean z, int i) {
                int iLIZ;
                if (C1616560sAY.LIZ("ITabletCommentHelper.updateCommentPanelHeight") || C1616660sAi.LIZJ()) {
                    return;
                }
                C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                if (c19252910Tv.LIZLLL().LJIJI().LLJJJJ().LIZ(c19eg, z) || viewPager == null) {
                    return;
                }
                if (configuration != null) {
                    iLIZ = configuration.screenHeightDp;
                } else {
                    iLIZ = C1389340mG4.LIZJ(c19eg, null).LIZ();
                }
                C01GW c01gw = C2556009zy.LIZ;
                if (((Number) c01gw.getValue()).floatValue() > 0.0f && c19252910Tv.LIZLLL().LJIJI().LLJJJJ().LIZIZ(i) && z) {
                    viewPager.getLayoutParams().height = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZ))) * ((Number) c01gw.getValue()).floatValue());
                    viewPager.requestLayout();
                } else if (iLIZ < 700) {
                    viewPager.getLayoutParams().height = C341940Daq.LIZ(430.0d);
                    viewPager.requestLayout();
                } else {
                    viewPager.getLayoutParams().height = C341940Daq.LIZ(499.0d);
                    viewPager.requestLayout();
                }
            }
        };
    }

    @Override // X.InterfaceC1616630sAf
    public final InterfaceC19303410fY LJIJ() {
        return C10GZ.LIZ;
    }

    @Override // X.InterfaceC1616630sAf
    public final InterfaceC1616480sAQ LJIJI() {
        return C1616540sAW.LIZ;
    }

    @Override // X.InterfaceC1616630sAf
    public final InterfaceC1349080lD8 block() {
        return new InterfaceC1349080lD8() { // from class: X.0Bxt
            @Override // X.InterfaceC1349080lD8
            public final boolean LIZ() {
                return !C1616560sAY.LIZ("ITabletBlock.disableTextMode");
            }

            @Override // X.InterfaceC1349080lD8
            public final boolean LIZIZ() {
                return C1616560sAY.LIZ("ITabletBlock.disableStickerStore");
            }

            @Override // X.InterfaceC1349080lD8
            public final boolean LIZJ() {
                return !C1616560sAY.LIZ("ITabletBlock.disableNUJRevampAB");
            }

            @Override // X.InterfaceC1349080lD8
            public final boolean LIZLLL() {
                return !C1616560sAY.LIZ("ITabletBlock.disablePhotoModeDetailPage");
            }

            @Override // X.InterfaceC1349080lD8
            public final boolean LJ() {
                return !C1616560sAY.LIZ("ITabletBlock.disableDanmaku");
            }

            @Override // X.InterfaceC1349080lD8
            public final boolean LJFF() {
                return !C1616560sAY.LIZ("ITabletBlock.disableAutoSpeed");
            }

            @Override // X.InterfaceC1349080lD8
            public final boolean LJI() {
                return !C1616560sAY.LIZ("ITabletBlock.needBlockNowComment");
            }

            @Override // X.InterfaceC1349080lD8
            public final boolean LJII() {
                return !C1616560sAY.LIZ("ITabletBlock.needBlockSoftkeyboardReset");
            }

            @Override // X.InterfaceC1349080lD8
            public final boolean LJIIIZ() {
                return !C1616560sAY.LIZ("ITabletBlock.needBlockLandscapeFullScreen");
            }

            @Override // X.InterfaceC1349080lD8
            public final boolean LJIIIIZZ(boolean z) {
                if (((Boolean) C0AVQ.LIZ.getValue()).booleanValue()) {
                    return true;
                }
                return false;
            }
        };
    }
}
