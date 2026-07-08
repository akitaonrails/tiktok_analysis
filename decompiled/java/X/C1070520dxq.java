package X;

import Y.AfS66S0400000_16;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friends.model.BackFromSettingEvent;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformTokenStatus;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.setting.serverpush.api.SocialRelationDataCheckResponse;
import com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxViewModel;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS50S0500000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0dxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1070520dxq {
    public static final C1070520dxq LIZ = new C1070520dxq();
    public static boolean LIZIZ;
    public static FindCtxViewModel LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static C11JF LJII;
    public static int LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static boolean LJIIJJI;
    public static C11JF LJIIL;
    public static int LJIILIIL;
    public static long LJIILJJIL;
    public static long LJIILL;
    public static boolean LJIILLIIL;
    public static C11JF LJIIZILJ;
    public static int LJIJ;
    public static long LJIJI;
    public static long LJIJJ;

    public static void LJI() {
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        LIZLLL = c1076010e6h.LJIJI();
        LJ = c1076010e6h.LJJIJIIJI();
        LJFF = c1076010e6h.LJJII();
        LJI = false;
        LJIIIIZZ = 0;
        LJIIIZ = 0L;
        LJIIJ = 0L;
        LJIIJJI = false;
        LJIILIIL = 0;
        LJIILJJIL = 0L;
        LJIILL = 0L;
        LJIILLIIL = false;
        LJIJ = 0;
        LJIJI = 0L;
        LJIJJ = 0L;
    }

    public static boolean LJIIIIZZ() {
        Integer numLIZLLL = C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.MLBB).LIZLLL();
        return (numLIZLLL == null || numLIZLLL.intValue() == SocialPlatformTokenStatus.STATUS_UNKNOWN.getValue()) ? false : true;
    }

    public final void LJIIJ() {
        C11JF c11jf = LJII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = LJIIL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        C11JF c11jf3 = LJIIZILJ;
        if (c11jf3 != null) {
            c11jf3.dispose();
        }
        Keva.getRepo("contacts_sync_repo").storeBoolean("contacts_sync_is_removing", false);
        Keva.getRepo("facebook_sync_repo").storeBoolean("facebook_sync_is_removing", false);
        LIZJ = null;
        EventBus.LIZLLL().LJJI(this);
    }

    public static CharSequence LJ(Context context) {
        if (LJ) {
            String string = context.getString(2131847807);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(' ');
            sbLIZ.append(C20642515q3.LJI(2131829463));
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.p2(spannableString, new C785810Us7(context, 5), string.length(), string.length() + C20642515q3.LJI(2131829463).length() + 1, 33);
            return spannableString;
        }
        if (LJFF) {
            C338980DQq.LIZ.getClass();
            C844470XAv.LIZ.getClass();
            return C338980DQq.LIZ(C844470XAv.LIZ().getString(2131829470), context, null);
        }
        if (LIZLLL) {
            return context.getString(2131847807);
        }
        return context.getString(2131849483);
    }

    public static void LJII(ViewModelStoreOwner viewModelStoreOwner) {
        FindCtxViewModel findCtxViewModel = (FindCtxViewModel) new ViewModelProvider(viewModelStoreOwner).get(FindCtxViewModel.class);
        LIZJ = findCtxViewModel;
        if (findCtxViewModel != null) {
            C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
            findCtxViewModel.LL = c1076010e6h.LJIIJ().LIZJ();
            findCtxViewModel.LLILLJJLI = c1076010e6h.LJII().LIZJ();
            findCtxViewModel.LLILLL = C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.MLBB).LJ();
        }
    }

    public static void LJIILL(Context context) {
        if (LIZIZ) {
            C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
            if (c1076010e6h.LJ()) {
                InterfaceC1070550dxt interfaceC1070550dxt = (InterfaceC1070550dxt) C1948007k6.LIZ(context, InterfaceC1070550dxt.class);
                if (interfaceC1070550dxt != null) {
                    interfaceC1070550dxt.LIZ();
                }
                c1076010e6h.LJI("privacy_setting");
                FindCtxViewModel findCtxViewModel = LIZJ;
                if (findCtxViewModel != null) {
                    findCtxViewModel.vQ2(new C1070540dxs("contact", false));
                }
            }
            LIZIZ = false;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBackFromPermissionSettingEvent(BackFromSettingEvent backFromSettingEvent) {
        if (Intrinsics.LJFF("privacy_setting", backFromSettingEvent.enterFrom)) {
            LIZIZ = true;
        }
    }

    public static C1389890mGx LJFF(Context context, LifecycleOwner lifecycleOwner) {
        Fragment fragment;
        Activity activityLIZ;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            return new C1389890mGx(activityLIZ);
        }
        if (!(lifecycleOwner instanceof Fragment) || (fragment = (Fragment) lifecycleOwner) == null) {
            return null;
        }
        return new C1389890mGx(fragment);
    }

    public static void LJIIJJI(Context context, LifecycleOwner lifecycleOwner) {
        C1389890mGx c1389890mGxLJFF = LJFF(context, lifecycleOwner);
        if (c1389890mGxLJFF != null) {
            c1389890mGxLJFF.LJIIIZ(2131846225);
            c1389890mGxLJFF.LJIIJJI();
        }
        C1070560dxu.LIZ.getClass();
        C1070560dxu.LJFF(true);
    }

    public final void LJIIIZ(Integer num, String str) {
        int iIntValue;
        EventBus.LIZLLL().LJIJJ(this);
        C1070560dxu.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c2344009Gk.LIZJ(iIntValue, "is_rec");
        C20684815ws.LJIILLIIL("enter_sync_auth", c2344009Gk.LIZ);
    }

    public static void LJIJI(Context context, LifecycleOwner lifecycleOwner, boolean z) {
        InterfaceC497601wk viewModelScope;
        InterfaceC497601wk viewModelScope2;
        if (C1070510dxp.LIZJ()) {
            C1389890mGx c1389890mGxLJFF = LJFF(context, lifecycleOwner);
            if (c1389890mGxLJFF != null) {
                c1389890mGxLJFF.LJIIIZ(2131846225);
                c1389890mGxLJFF.LJIIJJI();
                return;
            }
            return;
        }
        if (z) {
            C1070560dxu.LIZ.getClass();
            C1070560dxu.LJI(1);
            FindCtxViewModel findCtxViewModel = LIZJ;
            if (findCtxViewModel != null && (viewModelScope2 = ViewModelKt.getViewModelScope(findCtxViewModel)) != null) {
                C23250099c.LIZLLL(viewModelScope2, null, null, new C1070060dx6(context, false, lifecycleOwner, null), 3);
                return;
            }
            return;
        }
        C1070560dxu.LIZ.getClass();
        C1070560dxu.LJII(1);
        FindCtxViewModel findCtxViewModel2 = LIZJ;
        if (findCtxViewModel2 == null || (viewModelScope = ViewModelKt.getViewModelScope(findCtxViewModel2)) == null) {
            return;
        }
        C23250099c.LIZLLL(viewModelScope, null, null, new C1070060dx6(context, true, lifecycleOwner, null), 3);
    }

    public static void LJIJJ(Context context, LifecycleOwner lifecycleOwner, boolean z) {
        InterfaceC497601wk viewModelScope;
        InterfaceC497601wk viewModelScope2;
        if (C1070510dxp.LIZ()) {
            C1389890mGx c1389890mGxLJFF = LJFF(context, lifecycleOwner);
            if (c1389890mGxLJFF != null) {
                c1389890mGxLJFF.LJIIIZ(2131846225);
                c1389890mGxLJFF.LJIIJJI();
                return;
            }
            return;
        }
        if (z) {
            C1070560dxu.LIZ.getClass();
            C1070560dxu.LJI(2);
            FindCtxViewModel findCtxViewModel = LIZJ;
            if (findCtxViewModel != null && (viewModelScope2 = ViewModelKt.getViewModelScope(findCtxViewModel)) != null) {
                C23250099c.LIZLLL(viewModelScope2, null, null, new C1070080dx8(context, false, lifecycleOwner, null), 3);
                return;
            }
            return;
        }
        C1070560dxu.LIZ.getClass();
        C1070560dxu.LJII(2);
        FindCtxViewModel findCtxViewModel2 = LIZJ;
        if (findCtxViewModel2 == null || (viewModelScope = ViewModelKt.getViewModelScope(findCtxViewModel2)) == null) {
            return;
        }
        C23250099c.LIZLLL(viewModelScope, null, null, new C1070080dx8(context, true, lifecycleOwner, null), 3);
    }

    public static void LJIJJLI(Context context, LifecycleOwner lifecycleOwner, boolean z) {
        InterfaceC497601wk viewModelScope;
        InterfaceC497601wk viewModelScope2;
        if (C1070510dxp.LIZIZ()) {
            C1389890mGx c1389890mGxLJFF = LJFF(context, lifecycleOwner);
            if (c1389890mGxLJFF != null) {
                c1389890mGxLJFF.LJIIIZ(2131846225);
                c1389890mGxLJFF.LJIIJJI();
                return;
            }
            return;
        }
        if (z) {
            C1070560dxu.LIZ.getClass();
            C1070560dxu.LJI(6);
            FindCtxViewModel findCtxViewModel = LIZJ;
            if (findCtxViewModel != null && (viewModelScope2 = ViewModelKt.getViewModelScope(findCtxViewModel)) != null) {
                C23250099c.LIZLLL(viewModelScope2, null, null, new C1070280dxS(context, lifecycleOwner, null), 3);
                return;
            }
            return;
        }
        C1070560dxu.LIZ.getClass();
        C1070560dxu.LJII(6);
        FindCtxViewModel findCtxViewModel2 = LIZJ;
        if (findCtxViewModel2 == null || (viewModelScope = ViewModelKt.getViewModelScope(findCtxViewModel2)) == null) {
            return;
        }
        C23250099c.LIZLLL(viewModelScope, null, null, new C1070300dxU(context, lifecycleOwner, null), 3);
    }

    public static void LIZ(final Context context, final LifecycleOwner lifecycleOwner, final Function1 function1, final Function1 function12) {
        PushSettingsApiManager.LIZJ(1).LJ(new InterfaceC2385309Wh() { // from class: X.0dxr
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("FindCtxSettingManager@b41b.checkContactRemoveStatus$1");
                if (C09UZ.LIZLLL(c15o7) && !u.LJIJI("error", ((BaseResponse) c15o7.LJIIL()).message, true)) {
                    if (((SocialRelationDataCheckResponse) c15o7.LJIIL()).getHasRemainingData()) {
                        if (C1070510dxp.LIZJ()) {
                            function1.invoke(1);
                            C1070520dxq.LJI = false;
                            function12.invoke(Boolean.FALSE);
                        } else {
                            function1.invoke(0);
                            C1070520dxq.LJI = true;
                            function12.invoke(Boolean.TRUE);
                        }
                    } else {
                        C11JF c11jf = C1070520dxq.LJII;
                        if (c11jf != null) {
                            c11jf.dispose();
                        }
                        if (C1070510dxp.LIZJ()) {
                            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C447701oh(context, lifecycleOwner, null), 3);
                        }
                        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
                        if ((c1076010e6h.LJJIJIIJI() && C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.EMAIL).LIZIZ()) || (c1076010e6h.LJJII() && C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.CONTACT).LIZIZ())) {
                            C1070520dxq.LJI = true;
                            function12.invoke(Boolean.TRUE);
                        } else {
                            C1070520dxq.LJI = false;
                            function12.invoke(Boolean.FALSE);
                        }
                        Keva.getRepo("contacts_sync_repo").storeBoolean("contacts_sync_is_removing", false);
                        function1.invoke(0);
                    }
                } else {
                    C1070520dxq.LJI = true;
                    function12.invoke(Boolean.TRUE);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FindCtxSettingManager@b41b.checkContactRemoveStatus$1");
                return unit;
            }
        }, C15O7.LJI, null);
    }

    public static void LIZIZ(final Context context, final LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12) {
        PushSettingsApiManager.LIZJ(2).LJ(new C1077450e91(function1, function12, 0), C15O7.LJI, null).LJ(new InterfaceC2385309Wh() { // from class: X.0TUm
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("FindCtxSettingManager@b41b.checkFBFriendsRemoveStatus$2");
                if (((Boolean) c15o7.LJIIL()).booleanValue()) {
                    C1070520dxq c1070520dxq = C1070520dxq.LIZ;
                    Context context2 = context;
                    LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                    c1070520dxq.getClass();
                    C1389890mGx c1389890mGxLJFF = C1070520dxq.LJFF(context2, lifecycleOwner2);
                    if (c1389890mGxLJFF != null) {
                        c1389890mGxLJFF.LJIIIZ(2131822132);
                        c1389890mGxLJFF.LJIIJJI();
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FindCtxSettingManager@b41b.checkFBFriendsRemoveStatus$2");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    public static void LIZJ(final Context context, final LifecycleOwner lifecycleOwner, final Function1 function1, final Function1 function12) {
        PushSettingsApiManager.LIZJ(6).LJ(new InterfaceC2385309Wh() { // from class: X.0dxo
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("FindCtxSettingManager@b41b.checkMLBBRemoveStatus$1");
                if (C09UZ.LIZLLL(c15o7) && !u.LJIJI("error", ((BaseResponse) c15o7.LJIIL()).message, true)) {
                    if (((SocialRelationDataCheckResponse) c15o7.LJIIL()).getHasRemainingData()) {
                        if (C1070510dxp.LIZIZ()) {
                            function1.invoke(1);
                            C1070520dxq.LJIILLIIL = false;
                            function12.invoke(Boolean.FALSE);
                        } else {
                            function1.invoke(0);
                            C1070520dxq.LJIILLIIL = true;
                            function12.invoke(Boolean.TRUE);
                        }
                    } else {
                        C11JF c11jf = C1070520dxq.LJIIZILJ;
                        if (c11jf != null) {
                            c11jf.dispose();
                        }
                        if (C1070510dxp.LIZIZ()) {
                            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C447801oi(context, lifecycleOwner, null), 3);
                        }
                        C1070520dxq.LJIILLIIL = false;
                        function12.invoke(Boolean.FALSE);
                        Keva.getRepo("mlbb_sync_repo").storeBoolean("mlbb_sync_is_removing", false);
                        function1.invoke(0);
                    }
                } else {
                    C1070520dxq.LJIILLIIL = true;
                    function12.invoke(Boolean.TRUE);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FindCtxSettingManager@b41b.checkMLBBRemoveStatus$1");
                return unit;
            }
        }, C15O7.LJI, null);
    }

    public static void LIZLLL(Context context, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12) {
        C11JF c11jf = LJIIZILJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LJIIZILJ = (C11JF) C11NZ.LJJJJJL(0L, 1L, TimeUnit.SECONDS).LJJLJLI(new AfS66S0400000_16(context, lifecycleOwner, function1, function12, 2));
    }

    public static void LJIILIIL(Context context, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12) {
        C1070560dxu.LIZ.getClass();
        C1070560dxu.LJFF(false);
        LJIIJJI = true;
        function12.invoke(Boolean.TRUE);
        function1.invoke(0);
        C1389890mGx c1389890mGxLJFF = LJFF(context, lifecycleOwner);
        if (c1389890mGxLJFF != null) {
            c1389890mGxLJFF.LJIIIZ(2131834214);
            c1389890mGxLJFF.LJIIJJI();
        }
    }

    public static void LJIILJJIL(Context context, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12) {
        C1070560dxu.LIZ.getClass();
        C1070560dxu.LJFF(false);
        LJIILLIIL = true;
        function12.invoke(Boolean.TRUE);
        function1.invoke(0);
        C1389890mGx c1389890mGxLJFF = LJFF(context, lifecycleOwner);
        if (c1389890mGxLJFF != null) {
            c1389890mGxLJFF.LJIIIZ(2131834214);
            c1389890mGxLJFF.LJIIJJI();
        }
    }

    public static void LJIIL(Context context, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, int i) {
        int i2;
        C11JF c11jf = LJII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        Keva.getRepo("contacts_sync_repo").storeBoolean("contacts_sync_is_removing", false);
        LJIIIIZZ = 0;
        LJIIIZ = 0L;
        LJIIJ = 0L;
        C1070560dxu.LIZ.getClass();
        C1070560dxu.LJFF(false);
        LJI = true;
        function12.invoke(Boolean.TRUE);
        function1.invoke(0);
        if (i == 2160) {
            i2 = 2131829462;
        } else {
            i2 = 2131829461;
        }
        C1389890mGx c1389890mGxLJFF = LJFF(context, lifecycleOwner);
        if (c1389890mGxLJFF != null) {
            c1389890mGxLJFF.LJIIIZ(i2);
            c1389890mGxLJFF.LJIIJJI();
        }
    }

    public static void LJIILLIIL(Context context, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, Function1 function13) {
        C1070560dxu.LIZ.getClass();
        C1070560dxu.LIZ(1);
        if (LJI) {
            C1070560dxu.LJ(1);
            if (context != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJFF(2131846227);
                c1397580mTM.LIZ(2131846224);
                C985403tE.LIZ(c1397580mTM, new AwS50S0500000_16(context, lifecycleOwner, function1, function13, function12, 0));
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
            return;
        }
        C1389890mGx c1389890mGxLJFF = LJFF(context, lifecycleOwner);
        if (c1389890mGxLJFF == null) {
            return;
        }
        c1389890mGxLJFF.LJIIIZ(2131850542);
        c1389890mGxLJFF.LJIIJJI();
    }

    public static void LJIIZILJ(Context context, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, Function1 function13) {
        C1070560dxu.LIZ.getClass();
        C1070560dxu.LIZ(2);
        if (LJIIJJI) {
            C1070560dxu.LJ(2);
            if (context != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJFF(2131822136);
                c1397580mTM.LIZ(2131846224);
                C985403tE.LIZ(c1397580mTM, new AwS50S0500000_16(context, lifecycleOwner, function1, function13, function12, 2));
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
            return;
        }
        C1389890mGx c1389890mGxLJFF = LJFF(context, lifecycleOwner);
        if (c1389890mGxLJFF == null) {
            return;
        }
        c1389890mGxLJFF.LJIIIZ(2131822133);
        c1389890mGxLJFF.LJIIJJI();
    }

    public static void LJIJ(Context context, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, Function1 function13) {
        C1070560dxu.LIZ.getClass();
        C1070560dxu.LIZ(6);
        if (LJIILLIIL) {
            C1070560dxu.LJ(6);
            if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                C632670Orh.LIZIZ(context, new C19719212De(1932225942, new C341320DZq(context, lifecycleOwner, function1, function13, function12), true));
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131837435);
            c1397580mTM.LIZ(2131837434);
            C985403tE.LIZ(c1397580mTM, new AwS50S0500000_16(context, lifecycleOwner, function1, function13, function12, 4));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        C1389890mGx c1389890mGxLJFF = LJFF(context, lifecycleOwner);
        if (c1389890mGxLJFF == null) {
            return;
        }
        c1389890mGxLJFF.LJIIIZ(2131837429);
        c1389890mGxLJFF.LJIIJJI();
    }
}
