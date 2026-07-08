package X;

import android.app.NotificationChannel;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.extension.LifecycleOwnerExtKt$onLifecycleEvent$1;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS148S0400000_19;
import kotlin.jvm.internal.AwS19S0202000_9;
import kotlin.jvm.internal.AwS239S0300000_30;
import kotlin.jvm.internal.AwS264S0300000_20;
import kotlin.jvm.internal.AwS307S0300000_30;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS421S0200000_20;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14cP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20303114cP {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;
    public static final String[] LIZIZ;
    public static final C1D1X LIZJ;

    static {
        C2217391BqT c2217391BqT = new C2217391BqT(C20303114cP.class, "brandDebug", "getBrandDebug()Ljava/lang/String;", 1);
        C13LE.LIZ.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217391BqT};
        LIZIZ = new String[]{"xiaomi", "poco", "redmi"};
        LIZJ = new C1D1X("keva_repo_im_notification", "notification_permission_brand", "");
    }

    public static final String LIZLLL() {
        C1D1X c1d1x = LIZJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZ;
        String str = (String) c1d1x.getValue(null, interfaceC2217461BqaArr[0]);
        if (str.length() != 0) {
            return str;
        }
        String lowerCase = Build.BRAND.toLowerCase(Locale.ROOT);
        c1d1x.setValue(null, interfaceC2217461BqaArr[0], lowerCase);
        return lowerCase;
    }

    public static final boolean LJFF() {
        return C13LQ.LJJIJIIJI(LIZLLL(), new String[]{"huawei", "honor"}) >= 0;
    }

    public static final boolean LJII(PowerManager powerManager) {
        return powerManager.isIgnoringBatteryOptimizations(C2213981Bky.LIZIZ.getApplicationContext().getPackageName());
    }

    public static final void LJIIIZ(String str) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("notifications_permissions_click", C2097608Jq.LJIIJ(new Pair("click_entry", str)));
    }

    public static final void LJIIJJI(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.setFlags(268468224);
                LIZ(context, intent);
            } catch (ActivityNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "MessageNotificationPermissionFragment-openNotificationSettings");
            }
        }
    }

    public static final C1685640txy LJIILL(InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIIJZLJL(-524933061);
        Context context = (Context) interfaceC1680500tpg.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        Object obj = C1680510tph.LIZIZ;
        if (objLJJ == obj) {
            objLJJ = (AudioManager) C786410Ut5.H2(context, "audio");
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        AudioManager audioManager = (AudioManager) objLJJ;
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (objLJJ2 == obj) {
            objLJJ2 = new AwS553S0100000_9(audioManager, 169);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        Function0 function0 = (Function0) objLJJ2;
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ3 = interfaceC1680500tpg.LJJ();
        if (objLJJ3 == obj) {
            objLJJ3 = new AwS553S0100000_9(audioManager, 168);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
        }
        Function0 function02 = (Function0) objLJJ3;
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ4 = interfaceC1680500tpg.LJJ();
        if (objLJJ4 == obj) {
            objLJJ4 = C20028913Yh.LJI(function02.invoke());
            interfaceC1680500tpg.LJJIJIIJI(objLJJ4);
        }
        C05P0 c05p0 = (C05P0) objLJJ4;
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ5 = interfaceC1680500tpg.LJJ();
        if (objLJJ5 == obj) {
            objLJJ5 = C20028913Yh.LJI(function0.invoke());
            interfaceC1680500tpg.LJJIJIIJI(objLJJ5);
        }
        C05P0 c05p02 = (C05P0) objLJJ5;
        interfaceC1680500tpg.LJ();
        Unit unit = Unit.LIZ;
        interfaceC1680500tpg.LJJIIJZLJL(-1224400529);
        boolean zLJII = interfaceC1680500tpg.LJII(audioManager) | interfaceC1680500tpg.LJII(context);
        Object objLJJ6 = interfaceC1680500tpg.LJJ();
        if (zLJII || objLJJ6 == obj) {
            objLJJ6 = new C14LM(context, c05p0, function02, c05p02, function0, audioManager);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ6);
        }
        interfaceC1680500tpg.LJ();
        C1680540tpk.LIZIZ(unit, (Function1) objLJJ6, interfaceC1680500tpg);
        C1685640txy c1685640txy = new C1685640txy(c05p0, c05p02);
        interfaceC1680500tpg.LJ();
        return c1685640txy;
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLY/bzzrBgM+9inPz57KedQ9LkfDLyI03tWb0YSRiCZJHPshcP5OAV394bYdDNR9bZZ/z0W8FeDsjJdBHINhuib8ZH3mi", null));
    }

    public static final boolean LJ(C815520Vyw c815520Vyw, boolean z) {
        if (!c815520Vyw.LIZ() || !LJIIIIZZ(c815520Vyw, "im_push", false)) {
            return false;
        }
        if (z && !LJIIIIZZ(c815520Vyw, "im_push_custom_tone", true)) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(Context context, PowerManager powerManager) {
        if (C13LQ.LJIILLIIL(Build.BRAND.toLowerCase(Locale.ROOT), LIZIZ)) {
            try {
                if (Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        if (LJFF()) {
            try {
                if (Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) {
                    return true;
                }
                return false;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return false;
            }
        }
        return powerManager.isPowerSaveMode();
    }

    public static final C594750NUj LJIIL(PowerManager powerManager, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIIJZLJL(573875583);
        Context context = (Context) interfaceC1680500tpg.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
        interfaceC1680500tpg.LJJIIJZLJL(1738631158);
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        Object obj = C1680510tph.LIZIZ;
        if (objLJJ == obj) {
            objLJJ = C20028913Yh.LJI(Boolean.valueOf(LJI(context, powerManager)));
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C05P0 c05p0 = (C05P0) objLJJ;
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJJIIJZLJL(-1746271574);
        boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ(c05p0) | interfaceC1680500tpg.LJII(context) | interfaceC1680500tpg.LJII(powerManager);
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (zLJJIIJ || objLJJ2 == obj) {
            objLJJ2 = new AwS264S0300000_20(context, powerManager, c05p0, 0);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        interfaceC1680500tpg.LJ();
        C1689210u3j.LJFF((Function0) objLJJ2, interfaceC1680500tpg, 0);
        Unit unit = Unit.LIZ;
        interfaceC1680500tpg.LJJIIJZLJL(-1746271574);
        boolean zLJJIIJ2 = interfaceC1680500tpg.LJJIIJ(c05p0) | interfaceC1680500tpg.LJII(powerManager) | interfaceC1680500tpg.LJII(context);
        Object objLJJ3 = interfaceC1680500tpg.LJJ();
        if (zLJJIIJ2 || objLJJ3 == obj) {
            objLJJ3 = new AwS239S0300000_30(context, powerManager, c05p0, 2);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
        }
        interfaceC1680500tpg.LJ();
        C1680540tpk.LIZIZ(unit, (Function1) objLJJ3, interfaceC1680500tpg);
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ4 = interfaceC1680500tpg.LJJ();
        if (objLJJ4 == obj) {
            objLJJ4 = C20028913Yh.LJI(Boolean.valueOf(LJII(powerManager)));
            interfaceC1680500tpg.LJJIJIIJI(objLJJ4);
        }
        C05P0 c05p02 = (C05P0) objLJJ4;
        interfaceC1680500tpg.LJ();
        Object objLJJ5 = interfaceC1680500tpg.LJJ();
        if (objLJJ5 == obj) {
            objLJJ5 = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, interfaceC1680500tpg);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ5);
        }
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ5;
        interfaceC1680500tpg.LJJIIJZLJL(-1224400529);
        boolean zLJJIIJ3 = interfaceC1680500tpg.LJJIIJ(c05p02) | interfaceC1680500tpg.LJII(powerManager) | interfaceC1680500tpg.LJII(interfaceC497601wk) | interfaceC1680500tpg.LJII(context);
        Object objLJJ6 = interfaceC1680500tpg.LJJ();
        if (zLJJIIJ3 || objLJJ6 == obj) {
            objLJJ6 = new AwS148S0400000_19(c05p02, (C05P0<Boolean>) powerManager, (PowerManager) interfaceC497601wk, (InterfaceC497601wk) context, (Context) 0);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ6);
        }
        interfaceC1680500tpg.LJ();
        C1689210u3j.LJFF((Function0) objLJJ6, interfaceC1680500tpg, 0);
        C594750NUj c594750NUj = new C594750NUj(c05p0, c05p02);
        interfaceC1680500tpg.LJ();
        return c594750NUj;
    }

    public static final C05QZ LJIILIIL(C815520Vyw c815520Vyw, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIIJZLJL(1784549929);
        Context context = (Context) interfaceC1680500tpg.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        Object obj = C1680510tph.LIZIZ;
        if (objLJJ == obj) {
            boolean z = true;
            if (C813810VwB.LIZIZ(c815520Vyw.LIZIZ) == 1) {
                z = false;
            }
            objLJJ = C20028913Yh.LJI(Boolean.valueOf(z));
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C05P0 c05p0 = (C05P0) objLJJ;
        interfaceC1680500tpg.LJ();
        Unit unit = Unit.LIZ;
        interfaceC1680500tpg.LJJIIJZLJL(-1746271574);
        boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ(c05p0) | interfaceC1680500tpg.LJII(c815520Vyw) | interfaceC1680500tpg.LJII(context);
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (zLJJIIJ || objLJJ2 == obj) {
            objLJJ2 = new AwS239S0300000_30(context, (Context) c05p0, (C05P0<Boolean>) c815520Vyw, (C815520Vyw) 3);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        interfaceC1680500tpg.LJ();
        C1680540tpk.LIZIZ(unit, (Function1) objLJJ2, interfaceC1680500tpg);
        C05QZ c05qz = new C05QZ(c05p0);
        interfaceC1680500tpg.LJ();
        return c05qz;
    }

    public static final C594760NUk LJIILJJIL(C815520Vyw c815520Vyw, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIIJZLJL(1403525047);
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = C20028913Yh.LJI(Boolean.valueOf(LJ(c815520Vyw, true)));
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C05P0 c05p0 = (C05P0) objLJJ;
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJJIIJZLJL(-1633490746);
        boolean zLJII = interfaceC1680500tpg.LJII(c815520Vyw);
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (zLJII || objLJJ2 == c1680520tpi) {
            objLJJ2 = new AwS431S0200000_30(c05p0, (C05P0<Boolean>) c815520Vyw, (C815520Vyw) 17);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        interfaceC1680500tpg.LJ();
        C1689210u3j.LJ((Function0) objLJJ2, interfaceC1680500tpg, 0);
        C594760NUk c594760NUk = new C594760NUk(c05p0);
        interfaceC1680500tpg.LJ();
        return c594760NUk;
    }

    public static final boolean LJIIIIZZ(C815520Vyw c815520Vyw, String str, boolean z) {
        IPushApi iPushApi;
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        String realChannelId = "im_push_custom_tone";
        if (Intrinsics.LJFF(str, "im_push_custom_tone") || ((iPushApi = (IPushApi) PluggableExtentionKt.pluggableSpiForReal(IPushApi.class)) != null && (realChannelId = iPushApi.getRealChannelId(str)) != null)) {
            str = realChannelId;
        }
        c815520Vyw.getClass();
        NotificationChannel notificationChannelLJIIIIZZ = C810550Vqv.LJIIIIZZ(c815520Vyw.LIZIZ, str);
        if (notificationChannelLJIIIIZZ != null) {
            if (new C810770VrH(notificationChannelLJIIIIZZ).LIZJ != 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static final void LJIILLIIL(C20303314cR c20303314cR, TuxTextView tuxTextView, C20742216Eq c20742216Eq) {
        int i;
        int i2 = 0;
        if (c20303314cR == null) {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, tuxTextView);
        if (c20303314cR == null) {
            return;
        }
        tuxTextView.setText(tuxTextView.getContext().getString(c20303314cR.LIZ));
        int i3 = c20303314cR.LJFF;
        if (i3 != 7) {
            tuxTextView.setTuxFont(i3);
            try {
                switch (c20303314cR.LJFF) {
                    case 1:
                        i = 24;
                        break;
                    case 2:
                        i = 20;
                        break;
                    case 3:
                        i = 17;
                        break;
                    case 4:
                        i = 15;
                        break;
                    case 5:
                        i = 14;
                        break;
                    case 6:
                        i = 13;
                        break;
                    case 7:
                        i = 12;
                        break;
                    case 8:
                        i = 11;
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        i = 10;
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        i = 16;
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        i = 32;
                        break;
                    default:
                        i = 18;
                        break;
                }
                C21382118m3.LIZIZ(tuxTextView, 1, i, 1, 1);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (c20303314cR.LJI != R.attr.a1j) {
            TypedValue typedValue = new TypedValue();
            tuxTextView.getContext().getTheme().resolveAttribute(c20303314cR.LJI, typedValue, true);
            tuxTextView.setTextColor(typedValue.data);
        }
        C19ME c19meLIZIZ = C1636506ax.LIZIZ(tuxTextView);
        C19ME c19me = null;
        if (c19meLIZIZ != null) {
            ((ViewGroup.MarginLayoutParams) c19meLIZIZ).width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c20303314cR.LIZIZ)));
            Boolean bool = c20303314cR.LIZJ;
            if (bool == null) {
                c19meLIZIZ.startToStart = c20742216Eq.getId();
                c19meLIZIZ.endToEnd = c20742216Eq.getId();
                tuxTextView.setTextAlignment(4);
            } else if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                c19meLIZIZ.startToStart = c20742216Eq.getId();
                c19meLIZIZ.endToEnd = -1;
                tuxTextView.setTextAlignment(5);
            } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                c19meLIZIZ.startToStart = -1;
                c19meLIZIZ.endToEnd = c20742216Eq.getId();
                tuxTextView.setTextAlignment(6);
            } else {
                throw new C1954807lC();
            }
            c19meLIZIZ.verticalBias = c20303314cR.LJ;
        } else {
            c19meLIZIZ = null;
        }
        C786410Ut5.R6(tuxTextView, c19meLIZIZ);
        C19ME c19meLIZIZ2 = C1636506ax.LIZIZ(c20742216Eq);
        if (c19meLIZIZ2 != null) {
            c19meLIZIZ2.guidePercent = c20303314cR.LIZLLL / 280.0f;
            c19me = c19meLIZIZ2;
        }
        C786410Ut5.n6(c20742216Eq, c19me);
    }

    public static final void LIZJ(Function1<? super String, Unit> function1, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Function0<Unit> function02 = function0;
        Function1<? super String, Unit> function12 = function1;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2048765297);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i6 != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = AFwS274S0000000_30.get$arr$(65);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                function12 = (Function1) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
            }
            if (i7 != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ2 == C1680510tph.LIZIZ) {
                    objLJJ2 = AFwS219S0000000_30.get$arr$(77);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                function02 = (Function0) objLJJ2;
                c13zcLJIIJ.LJJJJL(false);
            }
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = new C815520Vyw(context);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C815520Vyw c815520Vyw = (C815520Vyw) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = (PowerManager) C786410Ut5.H2(context, "power");
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C594760NUk c594760NUkLJIILJJIL = LJIILJJIL(c815520Vyw, c13zcLJIIJ);
            C05QZ c05qzLJIILIIL = LJIILIIL(c815520Vyw, c13zcLJIIJ);
            C1689210u3j.LJII(context.getString(2131827553), function02, false, null, C13Z4.LIZJ(-903151017, new C1689350u3x(context, c594760NUkLJIILJJIL.LIZ.getValue().booleanValue(), !c05qzLJIILIIL.LIZ.getValue().booleanValue(), function12, LJIILL(c13zcLJIIJ), LJIIL((PowerManager) objLJJ4, c13zcLJIIJ)), c13zcLJIIJ), c13zcLJIIJ, (i3 & 112) | 24576, 12);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS19S0202000_9(i, i2, function02, function12, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [X.0jqt, android.content.BroadcastReceiver] */
    public static final void LJIIJ(Context context, Integer num, final AbstractC20303614cU abstractC20303614cU, boolean z, Function0<Unit> function0) {
        if (z) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (abstractC20303614cU != null && num != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LIZIZ(context.getString(num.intValue()));
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cr6, null, false);
            int i = R.id.eu_;
            FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.eu_, viewTd);
            if (frameLayout != null) {
                i = R.id.hav;
                ImageView imageView = (ImageView) C1616006Uk.LIZ(R.id.hav, viewTd);
                if (imageView != null) {
                    i = R.id.haw;
                    LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.haw, viewTd);
                    if (linearLayout != null) {
                        i = R.id.kbf;
                        SmartImageView smartImageView = (SmartImageView) C1616006Uk.LIZ(R.id.kbf, viewTd);
                        if (smartImageView != null) {
                            i = R.id.nl7;
                            C1390410mHn c1390410mHn = (C1390410mHn) C1616006Uk.LIZ(R.id.nl7, viewTd);
                            if (c1390410mHn != null) {
                                i = R.id.npu;
                                C20742216Eq c20742216Eq = (C20742216Eq) C1616006Uk.LIZ(R.id.npu, viewTd);
                                if (c20742216Eq != null) {
                                    i = R.id.nr8;
                                    C1295960jpS c1295960jpS = (C1295960jpS) C1616006Uk.LIZ(R.id.nr8, viewTd);
                                    if (c1295960jpS != null) {
                                        i = R.id.tee;
                                        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.tee, viewTd);
                                        if (tuxTextView != null) {
                                            i = R.id.xk5;
                                            C20742216Eq c20742216Eq2 = (C20742216Eq) C1616006Uk.LIZ(R.id.xk5, viewTd);
                                            if (c20742216Eq2 != null) {
                                                i = R.id.xk6;
                                                C20742216Eq c20742216Eq3 = (C20742216Eq) C1616006Uk.LIZ(R.id.xk6, viewTd);
                                                if (c20742216Eq3 != null) {
                                                    i = R.id.xk9;
                                                    FrameLayout frameLayout2 = (FrameLayout) C1616006Uk.LIZ(R.id.xk9, viewTd);
                                                    if (frameLayout2 != null) {
                                                        i = R.id.xkj;
                                                        TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.xkj, viewTd);
                                                        if (tuxTextView2 != null) {
                                                            i = R.id.xkk;
                                                            TuxTextView tuxTextView3 = (TuxTextView) C1616006Uk.LIZ(R.id.xkk, viewTd);
                                                            if (tuxTextView3 != null) {
                                                                i = R.id.xvq;
                                                                TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.xvq, viewTd);
                                                                if (tuxIconView != null) {
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewTd;
                                                                    final C20303414cS c20303414cS = new C20303414cS(constraintLayout, frameLayout, imageView, linearLayout, smartImageView, c1390410mHn, c20742216Eq, c1295960jpS, tuxTextView, c20742216Eq2, c20742216Eq3, frameLayout2, tuxTextView2, tuxTextView3, tuxIconView);
                                                                    LJIIZILJ(c20303414cS, context, abstractC20303614cU, false, false, 12);
                                                                    ?? r2 = new BroadcastReceiver() { // from class: X.0jqt
                                                                        public final void LIZ(Context context2, Intent intent) {
                                                                            String action;
                                                                            boolean z2;
                                                                            if (intent != null) {
                                                                                action = intent.getAction();
                                                                            } else {
                                                                                action = null;
                                                                            }
                                                                            if (Intrinsics.LJFF(action, "android.intent.action.CONFIGURATION_CHANGED")) {
                                                                                if ((context2.getResources().getConfiguration().uiMode & 48) == 32) {
                                                                                    z2 = true;
                                                                                } else {
                                                                                    z2 = false;
                                                                                }
                                                                                C20303114cP.LJIIZILJ(c20303414cS, context2, abstractC20303614cU, z2, false, 8);
                                                                            }
                                                                        }

                                                                        @Override // android.content.BroadcastReceiver
                                                                        public final void onReceive(Context context2, Intent intent) {
                                                                            if (!C2214201BlK.LJIIJJI && intent != null) {
                                                                                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                                                                                    C2188191AkT.LIZIZ();
                                                                                }
                                                                            }
                                                                            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                                                                                LIZ(context2, intent);
                                                                            } else {
                                                                                C2408409cA.LIZ();
                                                                                LIZ(context2, intent);
                                                                            }
                                                                        }
                                                                    };
                                                                    C786410Ut5.LJIJJ(context, r2, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                                                                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                                                                    if (c19egLIZIZ != null) {
                                                                        AwS421S0200000_20 awS421S0200000_20 = new AwS421S0200000_20(context, (C1296850jqt) r2, 4);
                                                                        Lifecycle lifecycle = c19egLIZIZ.getLifecycle();
                                                                        lifecycle.addObserver(new LifecycleOwnerExtKt$onLifecycleEvent$1(Lifecycle.Event.ON_DESTROY, lifecycle, awS421S0200000_20));
                                                                    }
                                                                    C340180DVg.LIZ(c1397580mTM, constraintLayout, 0, 6);
                                                                    if (function0 != null) {
                                                                        C985403tE.LIZ(c1397580mTM, new AwS378S0200000_12(context, (Context) function0, (Function0<Unit>) 33));
                                                                    } else {
                                                                        C985403tE.LIZ(c1397580mTM, new AwS600S0100000_21(context, 131));
                                                                    }
                                                                    C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                                                                    c1397510mTF.LIZLLL();
                                                                    C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
                                                                    if (c19egLIZIZ2 == null) {
                                                                        return;
                                                                    }
                                                                    AwS574S0100000_30 awS574S0100000_30 = new AwS574S0100000_30(c1397510mTF, 60);
                                                                    Lifecycle lifecycle2 = c19egLIZIZ2.getLifecycle();
                                                                    lifecycle2.addObserver(new LifecycleOwnerExtKt$onLifecycleEvent$1(Lifecycle.Event.ON_DESTROY, lifecycle2, awS574S0100000_30));
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
        }
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    public static void LJIIZILJ(C20303414cS c20303414cS, Context context, AbstractC20303614cU abstractC20303614cU, boolean z, boolean z2, int i) {
        String strLIZIZ;
        if ((i & 4) != 0) {
            if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                z = true;
            } else {
                z = false;
            }
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        AwS307S0300000_30 awS307S0300000_30 = new AwS307S0300000_30(context, abstractC20303614cU, c20303414cS, 1);
        C786410Ut5.LJLLLLLL(0, c20303414cS.LLILZLL);
        c20303414cS.LLILZLL.LIZJ();
        C786410Ut5.LJLLLLLL(8, c20303414cS.LLILZ);
        C786410Ut5.LJLLLLLL(8, c20303414cS.LLJILJIL);
        C786410Ut5.LJLLLLLL(8, c20303414cS.LLJILJILJ);
        C786410Ut5.LJLLLLLL(8, c20303414cS.LLJILLL);
        C786410Ut5.LJLLLLLL(8, c20303414cS.LLJIJIL);
        if (abstractC20303614cU instanceof C20303514cT) {
            FrameLayout frameLayout = c20303414cS.LLILLJJLI;
            C19ME c19meLIZIZ = C1636506ax.LIZIZ(frameLayout);
            if (c19meLIZIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("280:");
                sbLIZ.append(((C20303514cT) abstractC20303614cU).LJFF);
                c19meLIZIZ.dimensionRatio = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                c19meLIZIZ = null;
            }
            C786410Ut5.a6(frameLayout, c19meLIZIZ);
            C786410Ut5.LJLLLLLL(0, c20303414cS.LLILZIL);
            C786410Ut5.LJLLLLLL(8, c20303414cS.LLIZ);
            C786410Ut5.LJLLLLLL(8, c20303414cS.LLILLL);
        } else if (abstractC20303614cU instanceof C20303714cV) {
            FrameLayout frameLayout2 = c20303414cS.LLILLJJLI;
            C19ME c19meLIZIZ2 = C1636506ax.LIZIZ(frameLayout2);
            if (c19meLIZIZ2 != null) {
                c19meLIZIZ2.dimensionRatio = "280:168";
            } else {
                c19meLIZIZ2 = null;
            }
            C786410Ut5.a6(frameLayout2, c19meLIZIZ2);
            C786410Ut5.LJLLLLLL(8, c20303414cS.LLILZIL);
            C786410Ut5.LJLLLLLL(0, c20303414cS.LLIZ);
            C786410Ut5.LJLLLLLL(0, c20303414cS.LLILLL);
            ImageView imageView = c20303414cS.LLILLL;
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nl;
            imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
        } else {
            throw new C1954807lC();
        }
        if (z) {
            strLIZIZ = abstractC20303614cU.LIZ();
        } else {
            strLIZIZ = abstractC20303614cU.LIZIZ();
        }
        Forest forestLIZ = C0T1N.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.disableBuiltin = true;
        requestParams.resourceScene = EnumC1533980q1M.OTHER;
        requestParams.enableRequestReuse = true;
        Boolean bool = Boolean.TRUE;
        requestParams.enableMemoryCache = bool;
        requestParams.enableCDNCache = bool;
        requestParams.channel = "messaging_alerts";
        requestParams.bundle = strLIZIZ;
        forestLIZ.fetchResourceAsync("", requestParams, new C19571311hf(c20303414cS, z2, awS307S0300000_30, strLIZIZ));
    }

    public static final void LIZIZ(String str, String str2, boolean z, boolean z2, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String str3;
        Function0<Unit> function02 = function0;
        String str4 = str;
        Function1<? super Boolean, Unit> function12 = function1;
        boolean z3 = z2;
        boolean z4 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(871915426);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str4)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i13 = i2 & 8;
        if (i13 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i14 = i2 & 16;
        if (i14 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i15 = i2 & 32;
        if (i15 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((i3 & 74899) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            str3 = str2;
        } else {
            String str5 = "";
            if (i10 != 0) {
                str4 = "";
            }
            if (i11 == 0) {
                str5 = str2;
            }
            if (i12 != 0) {
                z4 = true;
            }
            if (i13 != 0) {
                z3 = false;
            }
            if (i14 != 0) {
                function02 = null;
            }
            if (i15 != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = AFwS257S0000000_19.get$arr$(173);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                function12 = (Function1) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
            }
            str4 = str4;
            str3 = str5;
            C13ZT.LIZ(C1689320u3u.LIZ.LIZJ(C1689570u4J.LIZ), C13Z4.LIZJ(-1105796382, new C1244020iTg(str4, str3, z4, function12, z3, function02), c13zcLJIIJ), c13zcLJIIJ, 56);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            boolean z5 = z3;
            boolean z6 = z4;
            c20030013YsLJJJJZI.LIZLLL = new C1244030iTh(str4, str3, z6, z5, function02, function12, i, i2);
        }
    }
}
