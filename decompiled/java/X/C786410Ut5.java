package X;

import Y.ACListenerS111S0200000_7;
import Y.ACListenerS121S0200000_18;
import Y.ACListenerS126S0200000_24;
import Y.ACListenerS148S0100000_13;
import Y.ACListenerS149S0100000_14;
import Y.ACListenerS152S0100000_17;
import Y.ACListenerS153S0100000_18;
import Y.ACListenerS160S0100000_26;
import Y.ACListenerS161S0100000_27;
import Y.ACListenerS41S0201000_6;
import Y.ACListenerS86S1100000_17;
import Y.ACListenerS89S1100000_28;
import Y.ACListenerS90S0300000_26;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.Dialog;
import android.app.Notification;
import android.app.ProgressDialog;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import avg.f;
import bfk.b0;
import com.byted.cast.capture.NotifyServer.ProjectionService;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.livesdk.broadcast.notification.BgVideoBroadcastService;
import com.bytedance.android.livesdk.broadcast.notification.BgVideoBroadcastService2;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.anrthanos.optimization.MessageLoggingOpt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.crash.Npth;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.third.container.SparkThirdWebViewInner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserSettingsActivity;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.morpheus.PluginEntity;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.bytedance.tt.reliability.monitor.bundlechecker.BundleAndIntentLancet;
import com.bytedance.tt.reliability.monitor.bundlechecker.BundleTooLargeChecker;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tt.reliability.queuemonitor.impl.MQCollector;
import com.bytedance.tt.reliability.queuemonitor.impl.MessageQueueHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.bytedance.tux.tag.TuxTag;
import com.bytedance.tux.widget.RadiusLayout;
import com.facebook.FacebookSdk;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.ar.core.InstallActivity;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationService;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.common.MediaSessionService;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchActivity;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import com.ss.android.ugc.aweme.im.common.view.IMSystemMsgTextView;
import com.ss.android.ugc.aweme.lancet.GetSystemServiceLancet;
import com.ss.android.ugc.aweme.lifecycle.task.KeepWarmJobService;
import com.ss.android.ugc.aweme.live.livehostimpl.BgBroadcastService;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.nxreword.proxy.NxStringLancet;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.settings.TTWebViewEnableStatusSettings;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.ui.TakoChatActivity;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.ss.android.ugc.aweme.utils.ToastHook;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutCL;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutLL;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.tiktok.report.ReportWebContainer;
import com.ss.android.ugc.tiktok.security.OptIABUAExp;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import jv6.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import oyl.d0;
import ttwebview.ym;

/* JADX INFO: renamed from: X.0Ut5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786410Ut5 {
    public static String D2() {
        String str = FacebookSdk.LJIIJ;
        j4("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1));
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Raw graph api version = ");
        sbLIZ.append(str);
        sbLIZ.append(" and hook graph api = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        return str;
    }

    public static int Y2(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int Z2(boolean z) {
        return z ? 1231 : 1237;
    }

    public static void E2() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Raw sdk version = ");
        sbLIZ.append("17.0.0");
        sbLIZ.append(" and hook version = ");
        sbLIZ.append("17.0.0");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static File W3() {
        File file;
        if (C786420Ut6.LJIIIZ && (file = C786420Ut6.LJIIZILJ) != null) {
            return file;
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        C786420Ut6.LJIIZILJ = externalStorageDirectory;
        return externalStorageDirectory;
    }

    public static String X3() {
        if (C786420Ut6.LJIIIZ && !TextUtils.isEmpty(C786420Ut6.LJIJ)) {
            return C786420Ut6.LJIJ;
        }
        String externalStorageState = Environment.getExternalStorageState();
        C786420Ut6.LJIJ = externalStorageState;
        return externalStorageState;
    }

    public static long a4() {
        if (C786420Ut6.LJIIIZ && !C786420Ut6.LIZ()) {
            long j = C786420Ut6.LJIIJJI;
            if (j >= 0) {
                return j;
            }
        }
        long totalRxBytes = TrafficStats.getTotalRxBytes();
        C786420Ut6.LJIIJJI = totalRxBytes;
        return totalRxBytes;
    }

    public static ExecutorService h4() {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.FIXED);
        c2123408ToLIZ.LIZJ = 1;
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:7:0x0010, B:9:0x0015, B:42:0x009a, B:43:0x009f, B:16:0x002c, B:18:0x0036, B:24:0x0046, B:25:0x004c, B:27:0x005c, B:29:0x0066, B:31:0x006a, B:33:0x0076, B:38:0x0086, B:39:0x008b, B:41:0x0091, B:12:0x0025, B:11:0x0020), top: B:50:0x0010, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String u2() {
        /*
            java.lang.String r0 = X.C786490UtD.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = X.C786490UtD.LIZ
            return r0
        Lb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            boolean r0 = X.C0V4R.LJ     // Catch: java.lang.Throwable -> La5
            r5 = 1
            if (r0 != 0) goto L25
            java.lang.String r0 = "miui.os.Build"
            java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> La5
            X.C0V4R.LIZLLL = r5     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> La5
            X.C0V4R.LJ = r5     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> La5
            goto L28
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La5
            X.C0V4R.LJ = r5     // Catch: java.lang.Throwable -> La5
        L25:
            boolean r0 = X.C0V4R.LIZLLL     // Catch: java.lang.Throwable -> La5
            goto L29
        L28:
            r0 = 1
        L29:
            if (r0 == 0) goto L2c
            goto L9a
        L2c:
            java.lang.String r1 = android.os.Build.DISPLAY     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "Flyme"
            int r0 = r1.indexOf(r0)     // Catch: java.lang.Throwable -> La5
            if (r0 >= 0) goto L41
            java.lang.String r1 = android.os.Build.USER     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "flyme"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> La5
            if (r0 != 0) goto L41
            goto L43
        L41:
            r0 = 1
            goto L44
        L43:
            r0 = 0
        L44:
            if (r0 == 0) goto L4c
            java.lang.String r0 = "FLYME-"
            r3.append(r0)     // Catch: java.lang.Throwable -> La5
            goto L9f
        L4c:
            X.07nF r1 = X.C1967507nF.LIZ()     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r4 = r1.LIZIZ(r0)     // Catch: java.lang.Throwable -> La5
            boolean r0 = X.C0V4R.LJI(r4)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L8b
            java.lang.String r1 = "angler"
            java.lang.String r0 = android.os.Build.BOARD     // Catch: java.lang.Throwable -> La5
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L83
            java.lang.String r2 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> La5
            if (r2 == 0) goto L83
            java.lang.String r1 = r2.toLowerCase()     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "nexus"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L83
            java.lang.String r1 = r2.toLowerCase()     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "6p"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L83
            goto L84
        L83:
            r5 = 0
        L84:
            if (r5 != 0) goto L8b
            java.lang.String r0 = "EMUI-"
            r3.append(r0)     // Catch: java.lang.Throwable -> La5
        L8b:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> La5
            if (r0 != 0) goto L9f
            r3.append(r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "-"
            r3.append(r0)     // Catch: java.lang.Throwable -> La5
            goto L9f
        L9a:
            java.lang.String r0 = "MIUI-"
            r3.append(r0)     // Catch: java.lang.Throwable -> La5
        L9f:
            java.lang.String r0 = android.os.Build.VERSION.INCREMENTAL     // Catch: java.lang.Throwable -> La5
            r3.append(r0)     // Catch: java.lang.Throwable -> La5
            goto La9
        La5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La9:
            java.lang.String r0 = r3.toString()
            X.C786490UtD.LIZ = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C786410Ut5.u2():java.lang.String");
    }

    public static CookieManager A2() {
        if (C1973707oF.LIZ()) {
            System.err.println("FlagsHookHelper: try hook flags method getInstanceHook");
            C1973707oF.LIZJ();
        } else {
            System.err.println("FlagsHookHelper: skip hook flags method getInstanceHook");
        }
        return CookieManager.getInstance();
    }

    public static String C2() {
        C0W7K.LJFF();
        String str = FacebookSdk.LJ;
        if (str != null) {
            return str;
        }
        throw new C1BJO("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static Thread u3() {
        return Thread.currentThread().getName().equals("FakeMainThread") ? Looper.getMainLooper().getThread() : Thread.currentThread();
    }

    public static Choreographer v2() {
        Choreographer choreographer;
        return (!Thread.currentThread().getName().equals("FakeMainThread") || (choreographer = C0CFN.LJ) == null) ? Choreographer.getInstance() : choreographer;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.08Op] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.webkit.CookieManager z2() {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C786410Ut5.z2():android.webkit.CookieManager");
    }

    public static void v3() {
    }

    public static void A4(AlertDialog alertDialog) {
        alertDialog.show();
        C785410UrT.LIZIZ(alertDialog);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(alertDialog);
        C816490W1f.LIZ(alertDialog);
    }

    public static void B(C430310Gu5 c430310Gu5) {
        int visibility = c430310Gu5.getVisibility();
        c430310Gu5.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c430310Gu5);
    }

    public static void B2(Context context) {
        try {
            C0W7Q.LIZIZ(context, "facebook.com");
            C0W7Q.LIZIZ(context, ".facebook.com");
            C0W7Q.LIZIZ(context, "https://facebook.com");
            C0W7Q.LIZIZ(context, "https://.facebook.com");
        } catch (Exception e) {
            try {
                TryCatchGuardChecker.doCheck(e);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[LOOP:0: B:16:0x0065->B:18:0x006b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void B4(android.app.Dialog r7) {
        /*
            r7.show()
            X.C785410UrT.LIZIZ(r7)
            android.view.Window r0 = r7.getWindow()
            android.view.View r4 = r0.getDecorView()
            if (r4 == 0) goto L96
            r0 = 2131400537(0x7f0a9759, float:1.842193E38)
            java.lang.Object r0 = r4.getTag(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r6 = 0
            if (r0 == 0) goto L22
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L41
        L22:
            int r3 = r7.hashCode()
            java.util.Map<java.lang.Integer, java.lang.Boolean> r2 = X.C482200Iva.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r1 = r2.get(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L96
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.remove(r0)
        L41:
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r5 = r7.findViewById(r0)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r3 = r5.findFocus()
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L88
            android.view.View r0 = r5.getChildAt(r6)
            boolean r0 = r0 instanceof X.GestureDetectorOnGestureListenerC1848660yCu
            if (r0 != 0) goto L88
            X.0yCu r2 = new X.0yCu
            android.content.Context r0 = r7.getContext()
            r2.<init>(r0)
        L65:
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L7a
            android.view.View r1 = r5.getChildAt(r6)
            LJJLIL(r6, r5)
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r2.addView(r1, r0)
            goto L65
        L7a:
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r0 = -1
            r1.<init>(r0, r0)
            r5.addView(r2, r1)
            if (r3 == 0) goto L88
            r3.requestFocus()
        L88:
            int r0 = r4.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131400538(0x7f0a975a, float:1.8421933E38)
            r4.setTag(r0, r1)
        L96:
            com.ss.android.ugc.aweme.PopupMonitorServiceImpl r0 = com.ss.android.ugc.aweme.PopupMonitorServiceImpl.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.PopupMonitorServiceImpl.LJJJ(r7)
            X.C816490W1f.LIZ(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C786410Ut5.B4(android.app.Dialog):void");
    }

    public static void C4(ProgressDialog progressDialog) {
        progressDialog.show();
        C785410UrT.LIZIZ(progressDialog);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(progressDialog);
        C816490W1f.LIZ(progressDialog);
    }

    public static void D4(DialogInterfaceC21560019Ze dialogInterfaceC21560019Ze) {
        dialogInterfaceC21560019Ze.show();
        C785410UrT.LIZIZ(dialogInterfaceC21560019Ze);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogInterfaceC21560019Ze);
        C816490W1f.LIZ(dialogInterfaceC21560019Ze);
    }

    public static void E4(LiveDialog liveDialog) {
        liveDialog.show();
        C785410UrT.LIZIZ(liveDialog);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(liveDialog);
        C816490W1f.LIZ(liveDialog);
    }

    public static String F3(Context context) {
        try {
            return WebSettings.getDefaultUserAgent(context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception happened when calling getDefaultUserAgent. ");
            sbLIZ.append(Arrays.toString(e.getStackTrace()));
            C2188811AlT.LIZIZ(sbLIZ);
            TTWebViewEnableStatusSettings.LIZ.getClass();
            if (TTWebViewEnableStatusSettings.LIZ().isTTWebViewEnabled) {
                TTWebViewHelper tTWebViewHelper = TTWebViewHelper.INSTANCE;
                if (tTWebViewHelper.isTTWebViewLoaded()) {
                    return tTWebViewHelper.getDefaultUserAgent();
                }
                return "";
            }
            return "";
        }
    }

    public static void F4(LiveActionSheetDialog liveActionSheetDialog) {
        liveActionSheetDialog.show();
        C785410UrT.LIZIZ(liveActionSheetDialog);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(liveActionSheetDialog);
        C816490W1f.LIZ(liveActionSheetDialog);
    }

    public static void G3(Printer printer) {
        C0V30.LJIIIIZZ(true);
        if (printer != null && !((ArrayList) C2097408Jo.LIZ.LLILLL).contains(printer)) {
            ((ArrayList) C2097408Jo.LIZ.LLILLL).add(printer);
            C2097408Jo.LIZ.LLILZIL = true;
        }
    }

    public static void G4(MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2) {
        multiLiveAsAnchorListDialogV2.show();
        C785410UrT.LIZIZ(multiLiveAsAnchorListDialogV2);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(multiLiveAsAnchorListDialogV2);
        C816490W1f.LIZ(multiLiveAsAnchorListDialogV2);
    }

    public static boolean H3(Context context) {
        if (!((Boolean) C302620Btc.LIZ.getValue()).booleanValue()) {
            if (context != null) {
                try {
                    NetworkInfo networkInfoLJIJ = LJIJ((ConnectivityManager) H2(context, "connectivity"));
                    if (networkInfoLJIJ != null) {
                        if (networkInfoLJIJ.isConnected()) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return false;
        }
        if (C0O0L.NOT_AVAILABLE != C036E.LIZ.LIZJ) {
            return true;
        }
        return false;
    }

    public static void H4(DialogC929590aIX dialogC929590aIX) {
        dialogC929590aIX.show();
        C785410UrT.LIZIZ(dialogC929590aIX);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogC929590aIX);
        C816490W1f.LIZ(dialogC929590aIX);
    }

    public static void Ha(C1195630hDd c1195630hDd) {
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1195630hDd);
        }
        c1195630hDd.setOnClickListener(null);
    }

    public static boolean I3(Context context) {
        NetworkInfo networkInfoLJIJ;
        if (!((Boolean) C302620Btc.LIZ.getValue()).booleanValue()) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) H2(context, "connectivity");
                if (connectivityManager != null && (networkInfoLJIJ = LJIJ(connectivityManager)) != null) {
                    if (networkInfoLJIJ.isConnected()) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        if (C0O0L.NOT_AVAILABLE != C036E.LIZ.LIZJ) {
            return true;
        }
        return false;
    }

    public static void I4(DialogC778400UgA dialogC778400UgA) {
        dialogC778400UgA.show();
        C785410UrT.LIZIZ(dialogC778400UgA);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogC778400UgA);
        C816490W1f.LIZ(dialogC778400UgA);
    }

    public static String J3(JSONObject jSONObject) {
        long jCurrentTimeMillis;
        boolean z = C09CF.LIZ;
        if (z) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        String string = jSONObject.toString();
        if (z) {
            C0VY1.LIZ(jCurrentTimeMillis);
        }
        return string;
    }

    public static void J4(DialogC1389620mGW dialogC1389620mGW) {
        dialogC1389620mGW.show();
        C785410UrT.LIZIZ(dialogC1389620mGW);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogC1389620mGW);
        C816490W1f.LIZ(dialogC1389620mGW);
    }

    public static Object K2(BgVideoBroadcastService2 bgVideoBroadcastService2) {
        return bgVideoBroadcastService2.getSystemService("notification");
    }

    public static void K4(DialogC1390150mHN dialogC1390150mHN) {
        dialogC1390150mHN.show();
        C785410UrT.LIZIZ(dialogC1390150mHN);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogC1390150mHN);
        C816490W1f.LIZ(dialogC1390150mHN);
    }

    public static Object L2(BgVideoBroadcastService bgVideoBroadcastService) {
        return bgVideoBroadcastService.getSystemService("notification");
    }

    public static Context L3(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (!C2409809cO.LIZIZ || applicationContext != null) {
            return applicationContext;
        }
        return C2409809cO.LIZ;
    }

    public static void L4(DialogC780480UjW dialogC780480UjW) {
        dialogC780480UjW.show();
        C785410UrT.LIZIZ(dialogC780480UjW);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogC780480UjW);
        C816490W1f.LIZ(dialogC780480UjW);
    }

    public static void LIZIZ(Dialog dialog) {
        dialog.dismiss();
        C785410UrT.LIZ(dialog);
    }

    public static void LIZJ(ProgressDialog progressDialog) {
        progressDialog.dismiss();
        C785410UrT.LIZ(progressDialog);
    }

    public static void LIZLLL(DialogC971210bNf dialogC971210bNf) {
        dialogC971210bNf.dismiss();
        C785410UrT.LIZ(dialogC971210bNf);
    }

    public static void LJ(DialogC972110bP7 dialogC972110bP7) {
        dialogC972110bP7.dismiss();
        C785410UrT.LIZ(dialogC972110bP7);
    }

    public static void LJFF(MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog) {
        multiGuestAsGuestModeratorManageDialog.dismiss();
        C785410UrT.LIZ(multiGuestAsGuestModeratorManageDialog);
    }

    public static void LJI(MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2) {
        multiLiveAsAnchorListDialogV2.dismiss();
        C785410UrT.LIZ(multiLiveAsAnchorListDialogV2);
    }

    public static void LJII(1JaJ r0) {
        r0.dismiss();
        C785410UrT.LIZ(r0);
    }

    public static void LJIIIIZZ(C110W c110w) {
        c110w.dismiss();
        C785410UrT.LIZ(c110w);
    }

    public static void LJIIIZ(C11G7 c11g7) {
        c11g7.dismiss();
        C785410UrT.LIZ(c11g7);
    }

    public static void LJIIJ(DialogC1389620mGW dialogC1389620mGW) {
        dialogC1389620mGW.dismiss();
        C785410UrT.LIZ(dialogC1389620mGW);
    }

    public static void LJIIJJI(DialogC1390150mHN dialogC1390150mHN) {
        dialogC1390150mHN.dismiss();
        C785410UrT.LIZ(dialogC1390150mHN);
    }

    public static void LJIIL(DialogC1802700x0m dialogC1802700x0m) {
        dialogC1802700x0m.dismiss();
        C785410UrT.LIZ(dialogC1802700x0m);
    }

    public static void LJIILIIL(ProgressDialogC1397800mTi progressDialogC1397800mTi) {
        progressDialogC1397800mTi.dismiss();
        C785410UrT.LIZ(progressDialogC1397800mTi);
    }

    public static void LJIILJJIL(DialogC1369990lkr dialogC1369990lkr) {
        dialogC1369990lkr.dismiss();
        C785410UrT.LIZ(dialogC1369990lkr);
    }

    public static void LJIILL(ProgressDialogC1397770mTf progressDialogC1397770mTf) {
        progressDialogC1397770mTf.dismiss();
        C785410UrT.LIZ(progressDialogC1397770mTf);
    }

    public static void LJIILLIIL(1JUH r0) {
        r0.show();
        C785410UrT.LIZIZ(r0);
    }

    public static NetworkInfo LJIJ(ConnectivityManager connectivityManager) {
        try {
            if (C2408409cA.LIZJ && C2408409cA.LIZLLL) {
                if (System.currentTimeMillis() - C2408409cA.LJIIIIZZ > 3000) {
                    C2408409cA.LIZIZ = true;
                }
                if (C2408409cA.LIZIZ || !C2408409cA.LJFF) {
                    C2408409cA.LIZ = connectivityManager.getActiveNetworkInfo();
                    C2408409cA.LJIIIIZZ = System.currentTimeMillis();
                    C2408409cA.LIZIZ = false;
                }
                return C2408409cA.LIZ;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                Class<?> cls = Class.forName("android.net.NetworkInfo");
                Class<?> cls2 = Integer.TYPE;
                return (NetworkInfo) cls.getConstructor(cls2, cls2, String.class, String.class).newInstance(1, 0, "CONNECTED", "CONNECTED");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }
    }

    public static Typeface LJJIII(File file) {
        String path;
        if (TypeFaceOptimizer.getSwitch() && (path = file.getPath()) != null) {
            if (TypeFaceLancet.cache.contains(path)) {
                return (Typeface) TypeFaceLancet.cache.get(path);
            }
            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
            if (typefaceCreateFromFile != null) {
                TypeFaceLancet.cache.put(path, typefaceCreateFromFile);
                return typefaceCreateFromFile;
            }
        }
        return Typeface.createFromFile(file);
    }

    public static Typeface LJJIIJ(String str) {
        if (TypeFaceOptimizer.getSwitch() && str != null) {
            if (TypeFaceLancet.cache.contains(str)) {
                return (Typeface) TypeFaceLancet.cache.get(str);
            }
            Typeface typefaceCreateFromFile = Typeface.createFromFile(str);
            if (typefaceCreateFromFile != null) {
                TypeFaceLancet.cache.put(str, typefaceCreateFromFile);
                return typefaceCreateFromFile;
            }
        }
        return Typeface.createFromFile(str);
    }

    public static void LJJJJ(Bitmap bitmap) {
        bitmap.recycle();
        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
    }

    public static void LJJJJI(ViewGroup viewGroup) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, null);
        viewGroup.removeAllViews();
    }

    public static void LJJJJIZL(FrameLayout frameLayout) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(frameLayout, null);
        frameLayout.removeAllViews();
    }

    public static void LJJJJJ(GridLayout gridLayout) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(gridLayout, null);
        gridLayout.removeAllViews();
    }

    public static void LJJJJJL(LinearLayout linearLayout) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(linearLayout, null);
        linearLayout.removeAllViews();
    }

    public static void LJJJJL(ConstraintLayout constraintLayout) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(constraintLayout, null);
        constraintLayout.removeAllViews();
    }

    public static void LJJJJLI(C426180GnQ c426180GnQ) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c426180GnQ, null);
        c426180GnQ.removeAllViews();
    }

    public static void LJJJJLL(C12KZ c12kz) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c12kz, null);
        c12kz.removeAllViews();
    }

    public static void LJJJJZ(C426160GnO c426160GnO) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c426160GnO, null);
        c426160GnO.removeAllViews();
    }

    public static void LJJJJZI(C21532619Oq c21532619Oq) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c21532619Oq, null);
        c21532619Oq.removeAllViews();
    }

    public static void LJJJLIIL(C939730aYt c939730aYt) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c939730aYt, null);
        c939730aYt.removeAllViews();
    }

    public static void LJJJLL(FrameLayout frameLayout) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(frameLayout, null);
        frameLayout.removeAllViewsInLayout();
    }

    public static C1516420pZ2 LJLJLLL(Context context) {
        return new C1516420pZ2(context.getResources().getDisplayMetrics().density, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    public static View LJLLLL(ViewStub viewStub) {
        String strLIZIZ;
        int layoutResource = viewStub.getLayoutResource();
        Context context = viewStub.getContext();
        try {
            return viewStub.inflate();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = (layoutResource >>> 24) & 127;
            if (i != 127) {
                int resourceName = 16;
                if (i > 16) {
                    if (context == null) {
                        context = ((LayoutInflater) viewStub).getContext();
                    }
                    a.install(context);
                    try {
                        return viewStub.inflate();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        StringBuilder sb = new StringBuilder();
                        try {
                            resourceName = context.getResources().getResourceName(layoutResource);
                            strLIZIZ = resourceName;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("0x");
                            CharsKt__CharJVMKt.checkRadix(resourceName);
                            sbLIZ.append(Integer.toString(layoutResource, resourceName));
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        sb.append("Error while inflating " + strLIZIZ);
                        sb.append('\n');
                        sb.append("context class: ".concat(context.getClass().getName()));
                        sb.append('\n');
                        sb.append("tux theme variant: " + ((Object) C1308910kAL.LJIIIIZZ(context)));
                        sb.append('\n');
                        sb.append("cause (first time): " + th.getMessage());
                        sb.append('\n');
                        sb.append("cause (this time): " + th2.getMessage());
                        sb.append('\n');
                        throw new IllegalStateException(sb.toString(), th2);
                    }
                }
            }
            throw th;
        }
    }

    public static Context M3(Application application) {
        Context applicationContext = application.getApplicationContext();
        if (!C2409809cO.LIZIZ || applicationContext != null) {
            return applicationContext;
        }
        return C2409809cO.LIZ;
    }

    public static void M4(C19GN c19gn) {
        c19gn.show();
        C785410UrT.LIZIZ(c19gn);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(c19gn);
        C816490W1f.LIZ(c19gn);
    }

    public static void M9(C1745300vWC c1745300vWC) {
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1745300vWC);
        }
        c1745300vWC.setOnClickListener(null);
    }

    public static Context N3(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (!C2409809cO.LIZIZ || applicationContext != null) {
            return applicationContext;
        }
        return C2409809cO.LIZ;
    }

    public static void N4(DialogC933230aOP dialogC933230aOP) {
        dialogC933230aOP.show();
        C785410UrT.LIZIZ(dialogC933230aOP);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogC933230aOP);
        C816490W1f.LIZ(dialogC933230aOP);
    }

    public static void O0(C19726612Ga c19726612Ga) {
        int visibility = c19726612Ga.getVisibility();
        c19726612Ga.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c19726612Ga);
    }

    public static Object O2(MediaSessionService mediaSessionService) {
        return mediaSessionService.getSystemService("notification");
    }

    public static Context O3(C19GS c19gs) {
        Context applicationContext = c19gs.getApplicationContext();
        if (!C2409809cO.LIZIZ || applicationContext != null) {
            return applicationContext;
        }
        return C2409809cO.LIZ;
    }

    public static void O4(ProgressDialogC1399790mWv progressDialogC1399790mWv) {
        progressDialogC1399790mWv.show();
        C785410UrT.LIZIZ(progressDialogC1399790mWv);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(progressDialogC1399790mWv);
        C816490W1f.LIZ(progressDialogC1399790mWv);
    }

    public static void O5(SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(swipeUpGuideStrengthenLayout);
        swipeUpGuideStrengthenLayout.setAlpha(0.0f);
    }

    public static Object P2(KeepWarmJobService keepWarmJobService) {
        return keepWarmJobService.getSystemService("power");
    }

    public static Context P3(C19EG c19eg) {
        Context applicationContext = c19eg.getApplicationContext();
        if (!C2409809cO.LIZIZ || applicationContext != null) {
            return applicationContext;
        }
        return C2409809cO.LIZ;
    }

    public static void P4(C0KW4 c0kw4) {
        c0kw4.show();
        C785410UrT.LIZIZ(c0kw4);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(c0kw4);
        C816490W1f.LIZ(c0kw4);
    }

    public static void Pd(ObjectAnimator objectAnimator) {
        InterfaceC1846560y9W interfaceC1846560y9WLIZ;
        if (C1848410yCV.LIZ && (interfaceC1846560y9WLIZ = C1847660yBI.LIZ()) != null && interfaceC1846560y9WLIZ.LJFF() && (objectAnimator instanceof ObjectAnimator) && objectAnimator != null) {
            Object target = objectAnimator.getTarget();
            if ((target instanceof View) && target != null) {
                final WeakReference weakReference = new WeakReference(target);
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: X.0DKB
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(weakReference.get());
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(weakReference.get());
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(weakReference.get());
                    }
                });
            }
        }
        objectAnimator.start();
    }

    public static Context Q3(AdvertiserSettingsActivity advertiserSettingsActivity) {
        Context applicationContext = advertiserSettingsActivity.getApplicationContext();
        if (!C2409809cO.LIZIZ || applicationContext != null) {
            return applicationContext;
        }
        return C2409809cO.LIZ;
    }

    public static LayoutInflater.Factory2 Qd(LayoutInflater layoutInflater) {
        if (NxRewordManager.LJIILIIL) {
            return (LayoutInflater.Factory2) C0J43.LIZ(layoutInflater, true);
        }
        return layoutInflater.getFactory2();
    }

    public static Context R3(CreatorToolsActivity creatorToolsActivity) {
        Context applicationContext = creatorToolsActivity.getApplicationContext();
        if (!C2409809cO.LIZIZ || applicationContext != null) {
            return applicationContext;
        }
        return C2409809cO.LIZ;
    }

    public static LayoutInflater.Factory2 Rd(C485720J3a c485720J3a) {
        if (NxRewordManager.LJIILIIL) {
            return (LayoutInflater.Factory2) C0J43.LIZ(c485720J3a, true);
        }
        return c485720J3a.getFactory2();
    }

    public static Context S3(SystemShareActivity systemShareActivity) {
        Context applicationContext = systemShareActivity.getApplicationContext();
        if (!C2409809cO.LIZIZ || applicationContext != null) {
            return applicationContext;
        }
        return C2409809cO.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        X.C2080308Cz.LIZJ = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Context T2(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C786410Ut5.T2(android.content.Context):android.content.Context");
    }

    public static Context T3(s sVar) {
        Context applicationContext = sVar.getApplicationContext();
        if (!C2409809cO.LIZIZ || applicationContext != null) {
            return applicationContext;
        }
        return C2409809cO.LIZ;
    }

    public static Type U2(Field field) {
        if (!C09CQ.LJI) {
            return field.getGenericType();
        }
        Class<?> type = field.getType();
        if (!type.isPrimitive() && type != String.class) {
            return field.getGenericType();
        }
        return type;
    }

    public static TypeVariable[] V2(Class cls) {
        if (!C09CQ.LJFF) {
            return cls.getTypeParameters();
        }
        Map<Class<?>, TypeVariable<Class<?>>[]> map = C09CQ.LJII;
        TypeVariable[] typeVariableArr = (TypeVariable[]) ((ConcurrentHashMap) map).get(cls);
        if (typeVariableArr != null) {
            return typeVariableArr;
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        ((ConcurrentHashMap) map).put(cls, typeParameters);
        return typeParameters;
    }

    public static Looper W2(HandlerThread handlerThread) {
        Looper looper;
        if (!C0X35.LJFF) {
            return handlerThread.getLooper();
        }
        boolean z = true;
        int i = 0;
        if (C202094145s.LJIIJ > 0 && !C786430Ut7.LIZIZ) {
            synchronized (C786430Ut7.class) {
                try {
                    if (!C786430Ut7.LIZIZ) {
                        try {
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C786430Ut7.LIZ = false;
                        }
                        if (C202094145s.LJIIJ > 0) {
                            C786430Ut7.LIZ = C08Q0.LJ(C1BWL.LIZ(), "cold_boot_lazy_handlerthread_opt_4560", false);
                            C786430Ut7.LIZIZ = true;
                        } else {
                            C786430Ut7.LIZ = false;
                        }
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        if (C786430Ut7.LIZ && Looper.myLooper() == Looper.getMainLooper()) {
            int i2 = -1;
            try {
                C786430Ut7.LIZ();
                Field field = C786430Ut7.LIZLLL;
                if (field != null) {
                    try {
                        i2 = field.getInt(handlerThread);
                    } catch (Throwable th2) {
                    }
                }
                if (i2 > 0) {
                    try {
                        C786430Ut7.LIZ();
                        Field field2 = C786430Ut7.LJ;
                        if (field2 != null) {
                            try {
                                i = field2.getInt(handlerThread);
                            } catch (Throwable th22) {
                                i = 0;
                            }
                            try {
                                Process.setThreadPriority(i2, -16);
                            } catch (Throwable th3) {
                                th = th3;
                                z = false;
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } else {
                            i = 0;
                            Process.setThreadPriority(i2, -16);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z = false;
                        TryCatchGuardChecker.doCheck(th);
                        looper = handlerThread.getLooper();
                        if (z) {
                            try {
                                Process.setThreadPriority(i2, i);
                                return looper;
                            } catch (Throwable th222) {
                            }
                        }
                        return looper;
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th5) {
                th = th5;
            }
            try {
                looper = handlerThread.getLooper();
                if (z && i2 > 0) {
                    Process.setThreadPriority(i2, i);
                    return looper;
                }
                return looper;
            } catch (Throwable th2222) {
                if (z && i2 > 0) {
                    try {
                        Process.setThreadPriority(i2, i);
                        throw th2222;
                    } catch (Throwable th22222) {
                        throw th22222;
                    }
                }
                throw th22222;
            }
        }
        return handlerThread.getLooper();
    }

    public static int X2(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public static void a3(Message message) {
        StackTraceElement[] stackTrace;
        try {
            C088G.LIZ(message);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (th.getClass().getName().contains("java.lang.IllegalStateException") && th.getMessage() != null && th.getMessage().contains("Broadcast already finished") && (stackTrace = th.getStackTrace()) != null && stackTrace.length != 0) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if ("android.content.BroadcastReceiver$PendingResult".equals(stackTraceElement.getClassName()) && "sendFinished".equals(stackTraceElement.getMethodName())) {
                        return;
                    }
                }
            }
            throw th;
        }
    }

    public static void aa(IMSystemMsgTextView iMSystemMsgTextView) {
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(iMSystemMsgTextView);
        }
        iMSystemMsgTextView.setOnClickListener(null);
    }

    public static String b3(Context context) {
        if (!TextUtils.isEmpty(C786440Ut8.LIZ) && !C786440Ut8.LIZ()) {
            return C786440Ut8.LIZ;
        }
        String strLIZLLL = C804420Vh2.LIZLLL(C804420Vh2.LJ(context));
        C786440Ut8.LIZ = strLIZLLL;
        return strLIZLLL;
    }

    public static String c3(Context context) {
        if (!TextUtils.isEmpty(C786440Ut8.LIZLLL) && !C786440Ut8.LIZ()) {
            return C786440Ut8.LIZLLL;
        }
        String networkAccessType = NetworkUtils.getNetworkAccessType(context);
        C786440Ut8.LIZLLL = networkAccessType;
        return networkAccessType;
    }

    public static ExecutorService c4(ThreadFactory threadFactory) {
        if (!(threadFactory instanceof C08UK) && !(threadFactory instanceof C08UL)) {
            if (C0WP5.LIZJ()) {
                return new C822650WOx(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
            }
            return PThreadExecutorsUtils.newCachedThreadPool(threadFactory);
        }
        return C823050WQl.LIZLLL();
    }

    public static String d3(Context context) {
        NetworkInfo networkInfoLJIJ;
        int iIntValue;
        if (!TextUtils.isEmpty(C786440Ut8.LIZIZ) && !C786440Ut8.LIZ()) {
            return C786440Ut8.LIZIZ;
        }
        String strValueOf = "wifi";
        try {
            networkInfoLJIJ = LJIJ((ConnectivityManager) H2(context, "connectivity"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (networkInfoLJIJ != null && networkInfoLJIJ.isAvailable()) {
            Integer numValueOf = null;
            int iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8thoe1CgUDWai5Rr1Y=", null));
            boolean z = true;
            if (1 == iLJLLILLLL) {
                WifiInfo wifiInfoLIZ = C786600UtO.LIZ((WifiManager) H2(N3(context), "wifi"));
                if (wifiInfoLIZ != null) {
                    numValueOf = Integer.valueOf(C2204961BRm.LJLLLL(wifiInfoLIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe3gIsdOVcSzDVFLDDbsyDm0XyAPCDatnQ==", null)));
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = -1;
                }
                if (iIntValue <= 4900 || iIntValue >= 5900) {
                    z = false;
                }
                if (z) {
                    strValueOf = "wifi5g";
                }
            } else if (iLJLLILLLL == 0) {
                TelephonyManager telephonyManager = (TelephonyManager) H2(context, "phone");
                switch (C804420Vh2.LIZ(telephonyManager)) {
                    case 1:
                        strValueOf = "gprs";
                        break;
                    case 2:
                        strValueOf = "edge";
                        break;
                    case 3:
                        strValueOf = "umts";
                        break;
                    case 4:
                        strValueOf = "cdma";
                        break;
                    case 5:
                        strValueOf = "evdo_0";
                        break;
                    case 6:
                        strValueOf = "evdo_a";
                        break;
                    case 7:
                        strValueOf = "1xrtt";
                        break;
                    case 8:
                        strValueOf = "hsdpa";
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        strValueOf = "hsupa";
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        strValueOf = "hspa";
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        strValueOf = "iden";
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        strValueOf = "evdo_b";
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        strValueOf = "lte";
                        break;
                    case 14:
                        strValueOf = "ehrpd";
                        break;
                    case 15:
                        strValueOf = "hspap";
                        break;
                    case 16:
                        strValueOf = "gsm";
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        strValueOf = "td_scdma";
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    default:
                        strValueOf = String.valueOf(C804420Vh2.LIZ(telephonyManager));
                        break;
                    case 19:
                        strValueOf = "lte_ca";
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        strValueOf = "nr";
                        break;
                }
            } else {
                strValueOf = "unknown";
            }
        } else {
            strValueOf = "none";
        }
        C786440Ut8.LIZIZ = strValueOf;
        return strValueOf;
    }

    public static ExecutorService d4(int i) {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.FIXED);
        c2123408ToLIZ.LIZJ = i;
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static EnumC804620VhM e3(Context context) {
        if (C786440Ut8.LIZJ != EnumC804620VhM.UNKNOWN && !C786440Ut8.LIZ()) {
            return C786440Ut8.LIZJ;
        }
        C804420Vh2.LIZIZ(context);
        if (System.currentTimeMillis() - C804420Vh2.LIZLLL > 2000) {
            C804420Vh2.LIZIZ = C804420Vh2.LJ(context);
            C804420Vh2.LIZLLL = System.currentTimeMillis();
        }
        EnumC804620VhM enumC804620VhM = C804420Vh2.LIZIZ;
        C786440Ut8.LIZJ = enumC804620VhM;
        return enumC804620VhM;
    }

    public static void ec(C19R6 c19r6) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19r6);
        c19r6.setScaleX(-1.0f);
    }

    public static ScheduledExecutorService f4(int i) {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SCHEDULED);
        c2123408ToLIZ.LIZJ = i;
        return (ScheduledExecutorService) C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static void h3(C1331670kl3 c1331670kl3) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread() && ((((Boolean) C256310A2r.LIZ.getValue()).booleanValue() && C2187451AjH.LJ) || ((Boolean) C256310A2r.LIZIZ.getValue()).booleanValue())) {
            c1331670kl3.LJIIJJI();
        } else {
            c1331670kl3.LJIIIZ();
        }
    }

    public static void hb(C1712060uea c1712060uea) {
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1712060uea);
        }
        c1712060uea.setOnClickListener(null);
    }

    public static ExecutorService i4(ThreadFactory threadFactory) {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.FIXED);
        c2123408ToLIZ.LIZJ = 1;
        c2123408ToLIZ.LJI = threadFactory;
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static void ia(C1180760gpe c1180760gpe) {
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1180760gpe);
        }
        c1180760gpe.setOnClickListener(null);
    }

    public static void je(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        try {
            C1389600mGU.LIZIZ(videoRecordPermissionActivity);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        videoRecordPermissionActivity.overridePendingTransition(0, 0);
    }

    public static void le(ReportWebContainer reportWebContainer) {
        try {
            C1389600mGU.LIZIZ(reportWebContainer);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        reportWebContainer.overridePendingTransition(0, 0);
    }

    public static void n4(Application application) throws PackageManager.NameNotFoundException {
        application.createPackageContext("com.google.android.gms", 0);
    }

    public static LayoutInflater ne(Context context) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (Build.VERSION.SDK_INT == 24) {
            try {
                if (C1308910kAL.LJIIIIZZ(context) == null) {
                    layoutInflaterFrom = layoutInflaterFrom.cloneInContext(new ContextThemeWrapper(context, R.style.xm));
                    return layoutInflaterFrom;
                }
                return layoutInflaterFrom;
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                context.getClass();
                return layoutInflaterFrom;
            }
        }
        if (C1308910kAL.LJIIIIZZ(context) == null) {
            return layoutInflaterFrom.cloneInContext(new ContextThemeWrapper(context, R.style.xm));
        }
        return layoutInflaterFrom;
    }

    public static void o0(C1189590h3t c1189590h3t) {
        int visibility = c1189590h3t.getVisibility();
        c1189590h3t.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1189590h3t);
    }

    public static void q1(C420840Geo c420840Geo) {
        int visibility = c420840Geo.getVisibility();
        c420840Geo.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c420840Geo);
    }

    public static void re(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                Object obj = ToastHook.LIZ.get(toast);
                Field field = ToastHook.LIZIZ;
                field.set(obj, new ToastHook.ToastHandlerWrapper((Handler) field.get(obj)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                CrashlyticsWrapperService.LIZLLL().logException(e);
            }
        }
        toast.show();
    }

    public static String t2(Locale locale) {
        String language = locale.getLanguage();
        if (Build.VERSION.SDK_INT >= 35 && ((Boolean) C260660AJk.LIZ.getValue()).booleanValue()) {
            if (language.equals("he")) {
                return "iw";
            }
            if (language.equals("yi")) {
                return "ji";
            }
            if (language.equals(FollowStatusChangeMethod.PARAM_UID)) {
                return "in";
            }
            return language;
        }
        return language;
    }

    public static void t3(Context context) {
        if (((Number) C1842307Jl.LIZ.getValue()).intValue() <= 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R$styleable.AppCompatTheme);
            try {
                typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowActionBar);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public static File w2(Context context) {
        File file = C786450Ut9.LIZIZ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        File cacheDir = context.getCacheDir();
        C786450Ut9.LIZIZ = cacheDir;
        return cacheDir;
    }

    public static Typeface w4(File file) {
        Typeface typeface;
        String path = file.getPath();
        if (!TextUtils.isEmpty(path)) {
            if (((Boolean) C2277681EDe.LIZIZ.getValue()).booleanValue()) {
                ConcurrentHashMap<String, WeakReference<Typeface>> concurrentHashMap = C2087408Fs.LIZ;
                WeakReference<Typeface> weakReference = concurrentHashMap.get(path);
                if (weakReference != null) {
                    typeface = weakReference.get();
                } else {
                    typeface = null;
                }
                if (typeface != null) {
                    return typeface;
                }
                Typeface typefaceLJJIII = LJJIII(file);
                concurrentHashMap.put(path, new WeakReference<>(typefaceLJJIII));
                return typefaceLJJIII;
            }
            if (((Boolean) C2277681EDe.LIZJ.getValue()).booleanValue()) {
                ConcurrentHashMap<String, Typeface> concurrentHashMap2 = C2087408Fs.LIZIZ;
                if (concurrentHashMap2.containsKey(path)) {
                    return concurrentHashMap2.get(path);
                }
                Typeface typefaceLJJIII2 = LJJIII(file);
                if (typefaceLJJIII2 != null) {
                    concurrentHashMap2.put(path, typefaceLJJIII2);
                    return typefaceLJJIII2;
                }
            } else if (((Boolean) C2277681EDe.LJFF.getValue()).booleanValue()) {
                try {
                    C2087408Fs.LIZ(0, file.length(), path);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        return LJJIII(file);
    }

    public static void x0(1LPr r2) {
        int visibility = r2.getVisibility();
        r2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, r2);
    }

    public static File x2(Context context) {
        File file = C786450Ut9.LIZ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        C1BY8.LIZIZ();
        C786450Ut9.LIZ = context.getExternalCacheDir();
        C1BY8.LIZ();
        return C786450Ut9.LIZ;
    }

    public static Typeface x4(String str) {
        Typeface typeface;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) C2277681EDe.LIZIZ.getValue()).booleanValue()) {
                ConcurrentHashMap<String, WeakReference<Typeface>> concurrentHashMap = C2087408Fs.LIZ;
                WeakReference<Typeface> weakReference = concurrentHashMap.get(str);
                if (weakReference != null) {
                    typeface = weakReference.get();
                } else {
                    typeface = null;
                }
                if (typeface != null) {
                    return typeface;
                }
                Typeface typefaceLJJIIJ = LJJIIJ(str);
                concurrentHashMap.put(str, new WeakReference<>(typefaceLJJIIJ));
                return typefaceLJJIIJ;
            }
            if (((Boolean) C2277681EDe.LIZJ.getValue()).booleanValue()) {
                ConcurrentHashMap<String, Typeface> concurrentHashMap2 = C2087408Fs.LIZIZ;
                if (concurrentHashMap2.containsKey(str)) {
                    return concurrentHashMap2.get(str);
                }
                Typeface typefaceLJJIIJ2 = LJJIIJ(str);
                if (typefaceLJJIIJ2 != null) {
                    concurrentHashMap2.put(str, typefaceLJJIIJ2);
                    return typefaceLJJIIJ2;
                }
            } else if (((Boolean) C2277681EDe.LJFF.getValue()).booleanValue()) {
                try {
                    C2087408Fs.LIZ(1, new C0VSJ(str).length(), str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        return LJJIIJ(str);
    }

    public static void y0(1LQ7 r2) {
        int visibility = r2.getVisibility();
        r2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, r2);
    }

    public static void A(C03D4 c03d4, int i) {
        int visibility = c03d4.getVisibility();
        c03d4.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c03d4);
    }

    public static void A0(C418030GaH c418030GaH, int i) {
        int visibility = c418030GaH.getVisibility();
        c418030GaH.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c418030GaH);
    }

    public static void A1(C1242680iRW c1242680iRW, int i) {
        int visibility = c1242680iRW.getVisibility();
        c1242680iRW.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1242680iRW);
    }

    public static void A3(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    public static void A5(C21415018rM c21415018rM, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21415018rM);
        c21415018rM.setAlpha(f);
    }

    public static void A6(C1091250eVH c1091250eVH, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1091250eVH);
        c1091250eVH.setLayoutParams(layoutParams);
    }

    public static void A7(C20743716Ff c20743716Ff, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (C1848410yCV.LIZ) {
            onCheckedChangeListener = new C786760Ute(onCheckedChangeListener);
        }
        c20743716Ff.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public static void A8(C498540Jgq c498540Jgq, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c498540Jgq);
        }
        c498540Jgq.setOnClickListener(onClickListener);
    }

    public static void A9(C1303280k1G c1303280k1G, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1303280k1G);
        }
        c1303280k1G.setOnClickListener(onClickListener);
    }

    public static void Aa(C20584715gj c20584715gj, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c20584715gj);
        }
        c20584715gj.setOnClickListener(aVar);
    }

    public static void Ab(View view, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setRotation(f);
    }

    public static void Ac(C1143100fqu c1143100fqu, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1143100fqu);
        c1143100fqu.setScaleY(f);
    }

    public static void Ad(C1353060lJY c1353060lJY, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1353060lJY);
        c1353060lJY.setTranslationY(f);
    }

    public static void B0(C1369580lkC c1369580lkC, int i) {
        int visibility = c1369580lkC.getVisibility();
        c1369580lkC.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1369580lkC);
    }

    public static void B1(ViewOnClickListenerC1238510iKn viewOnClickListenerC1238510iKn, int i) {
        int visibility = viewOnClickListenerC1238510iKn.getVisibility();
        viewOnClickListenerC1238510iKn.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, viewOnClickListenerC1238510iKn);
    }

    public static void B3(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnDrawListener onDrawListener) {
        viewTreeObserver.removeOnDrawListener(onDrawListener);
        C2187701Ajg.LIZIZ(viewTreeObserver, onDrawListener, ViewTreeObserver.OnDrawListener.class);
    }

    public static void B5(TuxTextView tuxTextView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxTextView);
        tuxTextView.setAlpha(f);
    }

    public static void B6(C1099610eil c1099610eil, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1099610eil);
        c1099610eil.setLayoutParams(layoutParams);
    }

    public static void B7(C1841350y17 c1841350y17, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (C1848410yCV.LIZ) {
            onCheckedChangeListener = new C786760Ute(onCheckedChangeListener);
        }
        c1841350y17.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public static void B8(C1117860fCC c1117860fCC, ACListenerS86S1100000_17 aCListenerS86S1100000_17) {
        View.OnClickListener fVar = aCListenerS86S1100000_17;
        View.OnClickListener aVar = aCListenerS86S1100000_17;
        aVar = aCListenerS86S1100000_17;
        if (C1848410yCV.LIZ) {
            if (aCListenerS86S1100000_17 != null) {
                fVar = new f(aCListenerS86S1100000_17);
                aVar = new mf.a(fVar);
            }
        } else if (aCListenerS86S1100000_17 != null) {
            aVar = new mf.a(fVar);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1117860fCC);
        }
        c1117860fCC.setOnClickListener(aVar);
    }

    public static void B9(C422820Gi0 c422820Gi0, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c422820Gi0);
        }
        c422820Gi0.setOnClickListener(onClickListener);
    }

    public static void Ba(C20584815gk c20584815gk, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c20584815gk);
        }
        c20584815gk.setOnClickListener(aVar);
    }

    public static void Bb(FrameLayout frameLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(frameLayout);
        frameLayout.setRotation(f);
    }

    public static void Bc(SmartImageView smartImageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(smartImageView);
        smartImageView.setScaleY(f);
    }

    public static void Bd(C453470HqL c453470HqL, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c453470HqL);
        c453470HqL.setTranslationY(f);
    }

    public static void C(C21459218yU c21459218yU, int i) {
        int visibility = c21459218yU.getVisibility();
        c21459218yU.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c21459218yU);
    }

    public static void C0(C787020Uu4 c787020Uu4, int i) {
        int visibility = c787020Uu4.getVisibility();
        c787020Uu4.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c787020Uu4);
    }

    public static void C1(C1645710svZ c1645710svZ, int i) {
        int visibility = c1645710svZ.getVisibility();
        c1645710svZ.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1645710svZ);
    }

    public static void C3(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    public static void C5(TuxNavBar tuxNavBar, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxNavBar);
        tuxNavBar.setAlpha(f);
    }

    public static void C6(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.setLayoutParams(layoutParams);
    }

    public static void C7(C21411818qq c21411818qq, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (C1848410yCV.LIZ) {
            onCheckedChangeListener = new C786760Ute(onCheckedChangeListener);
        }
        c21411818qq.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public static void C8(C1133700fbk c1133700fbk, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1133700fbk);
        }
        c1133700fbk.setOnClickListener(aVar);
    }

    public static void C9(C0HX6 c0hx6, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0hx6);
        }
        c0hx6.setOnClickListener(aVar);
    }

    public static void Ca(C417410GYh c417410GYh, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c417410GYh);
        }
        c417410GYh.setOnClickListener(aVar);
    }

    public static void Cb(ImageView imageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
        imageView.setRotation(f);
    }

    public static void Cc(TuxIconView tuxIconView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxIconView);
        tuxIconView.setScaleY(f);
    }

    public static void Cd(C0SU0 c0su0, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0su0);
        c0su0.setTranslationY(f);
    }

    public static void D(ViewOnClickListenerC1203580hQS viewOnClickListenerC1203580hQS, int i) {
        int visibility = viewOnClickListenerC1203580hQS.getVisibility();
        viewOnClickListenerC1203580hQS.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, viewOnClickListenerC1203580hQS);
    }

    public static void D0(C12XK c12xk, int i) {
        int visibility = c12xk.getVisibility();
        c12xk.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c12xk);
    }

    public static void D1(C19518211Xw c19518211Xw, int i) {
        int visibility = c19518211Xw.getVisibility();
        c19518211Xw.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19518211Xw);
    }

    public static void D3(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        C2187701Ajg.LIZIZ(viewTreeObserver, onPreDrawListener, ViewTreeObserver.OnPreDrawListener.class);
    }

    public static void D5(C20626615nU c20626615nU, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20626615nU);
        c20626615nU.setAlpha(f);
    }

    public static void D6(C1235870iGX c1235870iGX, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1235870iGX);
        c1235870iGX.setLayoutParams(layoutParams);
    }

    public static void D7(C0HZQ c0hzq, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (C1848410yCV.LIZ) {
            onCheckedChangeListener = new C786760Ute(onCheckedChangeListener);
        }
        c0hzq.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public static void D8(C1124780fNM c1124780fNM, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1124780fNM);
        }
        c1124780fNM.setOnClickListener(aVar);
    }

    public static void D9(C424620Gku c424620Gku, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c424620Gku);
        }
        c424620Gku.setOnClickListener(onClickListener);
    }

    public static void Da(C14J2 c14j2, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c14j2);
        }
        c14j2.setOnClickListener(aVar);
    }

    public static void Db(LiveIconView liveIconView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveIconView);
        liveIconView.setRotation(f);
    }

    public static void Dc(TuxTextView tuxTextView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxTextView);
        tuxTextView.setScaleY(f);
    }

    public static void Dd(C0STF c0stf, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0stf);
        c0stf.setTranslationY(f);
    }

    public static void E(1JoX r1, int i) {
        int visibility = r1.getVisibility();
        r1.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, r1);
    }

    public static void E0(C117W c117w, int i) {
        int visibility = c117w.getVisibility();
        c117w.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c117w);
    }

    public static void E1(C1688850u39 c1688850u39, int i) {
        int visibility = c1688850u39.getVisibility();
        c1688850u39.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1688850u39);
    }

    public static void E3(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
        C2187701Ajg.LIZIZ(viewTreeObserver, onScrollChangedListener, ViewTreeObserver.OnScrollChangedListener.class);
    }

    public static void E5(C426320Gne c426320Gne, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426320Gne);
        c426320Gne.setAlpha(f);
    }

    public static void E6(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnAttachStateChangeListenerC20604515jv);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutParams(layoutParams);
    }

    public static void E7(C0UPY c0upy, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0upy);
        }
        c0upy.setOnClickListener(aVar);
    }

    public static void E8(C1118180fCi c1118180fCi, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1118180fCi);
        }
        c1118180fCi.setOnClickListener(aVar);
    }

    public static void E9(RemoteImageView remoteImageView, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(remoteImageView);
        }
        remoteImageView.setOnClickListener(onClickListener);
    }

    public static void Ea(C19733312Ip c19733312Ip, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c19733312Ip);
        }
        c19733312Ip.setOnClickListener(aVar);
    }

    public static void Eb(SmartImageView smartImageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(smartImageView);
        smartImageView.setRotation(f);
    }

    public static void Ec(C1322110kVd c1322110kVd, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1322110kVd);
        c1322110kVd.setScaleY(f);
    }

    public static void Ed(float f, ViewGroup viewGroup) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewGroup);
        viewGroup.setX(f);
    }

    public static void F(C432020Gwq c432020Gwq, int i) {
        int visibility = c432020Gwq.getVisibility();
        c432020Gwq.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c432020Gwq);
    }

    public static void F0(C526940KlY c526940KlY, int i) {
        int visibility = c526940KlY.getVisibility();
        c526940KlY.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c526940KlY);
    }

    public static void F1(C19412810xC c19412810xC, int i) {
        int visibility = c19412810xC.getVisibility();
        c19412810xC.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19412810xC);
    }

    public static Object F2(Activity activity, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (GetSystemServiceLancet.LIZ) {
                synchronized (ClipboardManager.class) {
                    try {
                        systemService = activity.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(systemService, new GetSystemServiceLancet.UIThreadHandler((Handler) declaredField.get(systemService)));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C805380Via.LIZJ(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        GetSystemServiceLancet.LIZ = false;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return systemService;
            }
            return activity.getSystemService(str);
        }
        if (!GetSystemServiceLancet.LIZIZ && "connectivity".equals(str)) {
            try {
                new AnonymousClass0836().LIZLLL();
                GetSystemServiceLancet.LIZIZ = true;
                return activity.getSystemService(str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return activity.getSystemService(str);
            }
        }
        return activity.getSystemService(str);
    }

    public static void F5(C127K c127k, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c127k);
        c127k.setAlpha(f);
    }

    public static void F6(C427870Gq9 c427870Gq9, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c427870Gq9);
        c427870Gq9.setLayoutParams(layoutParams);
    }

    public static void F7(C1236570iHf c1236570iHf, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1236570iHf);
        }
        c1236570iHf.setOnClickListener(onClickListener);
    }

    public static void F8(C1106510ett c1106510ett, ACListenerS152S0100000_17 aCListenerS152S0100000_17) {
        View.OnClickListener fVar = aCListenerS152S0100000_17;
        View.OnClickListener aVar = aCListenerS152S0100000_17;
        aVar = aCListenerS152S0100000_17;
        if (C1848410yCV.LIZ) {
            if (aCListenerS152S0100000_17 != null) {
                fVar = new f(aCListenerS152S0100000_17);
                aVar = new mf.a(fVar);
            }
        } else if (aCListenerS152S0100000_17 != null) {
            aVar = new mf.a(fVar);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1106510ett);
        }
        c1106510ett.setOnClickListener(aVar);
    }

    public static void F9(C430210Gtv c430210Gtv, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c430210Gtv);
        }
        c430210Gtv.setOnClickListener(onClickListener);
    }

    public static void Fa(C369950Eev c369950Eev, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c369950Eev);
        }
        c369950Eev.setOnClickListener(aVar);
    }

    public static void Fb(TuxIconView tuxIconView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxIconView);
        tuxIconView.setRotation(f);
    }

    public static void Fc(RemoteImageView remoteImageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(remoteImageView);
        remoteImageView.setScaleY(f);
    }

    public static void Fd(View view, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setX(f);
    }

    public static void G(C7938038e c7938038e, int i) {
        int visibility = c7938038e.getVisibility();
        c7938038e.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c7938038e);
    }

    public static void G0(C1642110spl c1642110spl, int i) {
        int visibility = c1642110spl.getVisibility();
        c1642110spl.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1642110spl);
    }

    public static void G1(C19670811xi c19670811xi, int i) {
        int visibility = c19670811xi.getVisibility();
        c19670811xi.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19670811xi);
    }

    public static Object G2(Application application, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (GetSystemServiceLancet.LIZ) {
                synchronized (ClipboardManager.class) {
                    try {
                        systemService = application.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(systemService, new GetSystemServiceLancet.UIThreadHandler((Handler) declaredField.get(systemService)));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C805380Via.LIZJ(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        GetSystemServiceLancet.LIZ = false;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return systemService;
            }
            return application.getSystemService(str);
        }
        if (!GetSystemServiceLancet.LIZIZ && "connectivity".equals(str)) {
            try {
                new AnonymousClass0836().LIZLLL();
                GetSystemServiceLancet.LIZIZ = true;
                return application.getSystemService(str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return application.getSystemService(str);
            }
        }
        return application.getSystemService(str);
    }

    public static void G5(RadiusLayout radiusLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(radiusLayout);
        radiusLayout.setAlpha(f);
    }

    public static void G6(SmartImageView smartImageView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(smartImageView);
        smartImageView.setLayoutParams(layoutParams);
    }

    public static void G7(C1592950rYT c1592950rYT, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1592950rYT);
        }
        c1592950rYT.setOnClickListener(aVar);
    }

    public static void G8(C429470Gsj c429470Gsj, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c429470Gsj);
        }
        c429470Gsj.setOnClickListener(aVar);
    }

    public static void G9(SmartAvatarImageView smartAvatarImageView, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(smartAvatarImageView);
        }
        smartAvatarImageView.setOnClickListener(onClickListener);
    }

    public static void Ga(C1195640hDe c1195640hDe, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1195640hDe);
        }
        c1195640hDe.setOnClickListener(aVar);
    }

    public static void Gb(TuxTextView tuxTextView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxTextView);
        tuxTextView.setRotation(f);
    }

    public static void Gc(float f, ViewGroup viewGroup) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewGroup);
        viewGroup.setTranslationX(f);
    }

    public static void Gd(FrameLayout frameLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(frameLayout);
        frameLayout.setX(f);
    }

    public static void H(C419120Gc2 c419120Gc2, int i) {
        int visibility = c419120Gc2.getVisibility();
        c419120Gc2.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c419120Gc2);
    }

    public static void H0(ViewOnClickListenerC20639415pY viewOnClickListenerC20639415pY, int i) {
        int visibility = viewOnClickListenerC20639415pY.getVisibility();
        viewOnClickListenerC20639415pY.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, viewOnClickListenerC20639415pY);
    }

    public static void H1(C19670911xj c19670911xj, int i) {
        int visibility = c19670911xj.getVisibility();
        c19670911xj.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19670911xj);
    }

    public static Object H2(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (GetSystemServiceLancet.LIZ) {
                synchronized (ClipboardManager.class) {
                    try {
                        systemService = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(systemService, new GetSystemServiceLancet.UIThreadHandler((Handler) declaredField.get(systemService)));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C805380Via.LIZJ(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        GetSystemServiceLancet.LIZ = false;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return systemService;
            }
            return context.getSystemService(str);
        }
        if (!GetSystemServiceLancet.LIZIZ && "connectivity".equals(str)) {
            try {
                new AnonymousClass0836().LIZLLL();
                GetSystemServiceLancet.LIZIZ = true;
                return context.getSystemService(str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return context.getSystemService(str);
            }
        }
        return context.getSystemService(str);
    }

    public static void H5(C1322110kVd c1322110kVd, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1322110kVd);
        c1322110kVd.setAlpha(f);
    }

    public static void H6(C427660Gpo c427660Gpo, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c427660Gpo);
        c427660Gpo.setLayoutParams(layoutParams);
    }

    public static void H7(SurfaceView surfaceView, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(surfaceView);
        }
        surfaceView.setOnClickListener(onClickListener);
    }

    public static void H8(C1099610eil c1099610eil, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1099610eil);
        }
        c1099610eil.setOnClickListener(onClickListener);
    }

    public static void H9(C424560Gko c424560Gko, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c424560Gko);
        }
        c424560Gko.setOnClickListener(onClickListener);
    }

    public static void Hb(View view, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setRotationX(f);
    }

    public static void Hc(float f, TextView textView) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textView);
        textView.setTranslationX(f);
    }

    public static void Hd(ImageView imageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
        imageView.setX(f);
    }

    public static void I(C1763840w06 c1763840w06, int i) {
        int visibility = c1763840w06.getVisibility();
        c1763840w06.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1763840w06);
    }

    public static void I0(C0L0N c0l0n, int i) {
        int visibility = c0l0n.getVisibility();
        c0l0n.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0l0n);
    }

    public static void I1(C19671011xk c19671011xk, int i) {
        int visibility = c19671011xk.getVisibility();
        c19671011xk.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19671011xk);
    }

    public static Object I2(C19GS c19gs, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (GetSystemServiceLancet.LIZ) {
                synchronized (ClipboardManager.class) {
                    try {
                        systemService = c19gs.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(systemService, new GetSystemServiceLancet.UIThreadHandler((Handler) declaredField.get(systemService)));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C805380Via.LIZJ(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        GetSystemServiceLancet.LIZ = false;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return systemService;
            }
            return c19gs.getSystemService(str);
        }
        if (!GetSystemServiceLancet.LIZIZ && "connectivity".equals(str)) {
            try {
                new AnonymousClass0836().LIZLLL();
                GetSystemServiceLancet.LIZIZ = true;
                return c19gs.getSystemService(str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return c19gs.getSystemService(str);
            }
        }
        return c19gs.getSystemService(str);
    }

    public static void I5(RemoteImageView remoteImageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(remoteImageView);
        remoteImageView.setAlpha(f);
    }

    public static void I6(C426770GoN c426770GoN, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426770GoN);
        c426770GoN.setLayoutParams(layoutParams);
    }

    public static void I7(View.OnClickListener onClickListener, View view) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(view);
        }
        view.setOnClickListener(onClickListener);
    }

    public static void I8(C19R7 c19r7, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c19r7);
        }
        c19r7.setOnClickListener(aVar);
    }

    public static void I9(FeedBottomBannerView feedBottomBannerView, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(feedBottomBannerView);
        }
        feedBottomBannerView.setOnClickListener(onClickListener);
    }

    public static void Ia(C418730GbP c418730GbP, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c418730GbP);
        }
        c418730GbP.setOnClickListener(aVar);
    }

    public static void Ib(View view, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setRotationY(f);
    }

    public static void Ic(SurfaceView surfaceView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(surfaceView);
        surfaceView.setTranslationX(f);
    }

    public static void Id(C0GZU c0gzu, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gzu);
        c0gzu.setX(f);
    }

    public static void J(C1421960n6g c1421960n6g, int i) {
        int visibility = c1421960n6g.getVisibility();
        c1421960n6g.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1421960n6g);
    }

    public static void J0(ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX, int i) {
        int visibility = viewTreeObserverOnGlobalLayoutListenerC526930KlX.getVisibility();
        viewTreeObserverOnGlobalLayoutListenerC526930KlX.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, viewTreeObserverOnGlobalLayoutListenerC526930KlX);
    }

    public static void J1(C415600GRi c415600GRi, int i) {
        int visibility = c415600GRi.getVisibility();
        c415600GRi.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c415600GRi);
    }

    public static Object J2(C19EG c19eg, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (GetSystemServiceLancet.LIZ) {
                synchronized (ClipboardManager.class) {
                    try {
                        systemService = c19eg.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(systemService, new GetSystemServiceLancet.UIThreadHandler((Handler) declaredField.get(systemService)));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C805380Via.LIZJ(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        GetSystemServiceLancet.LIZ = false;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return systemService;
            }
            return c19eg.getSystemService(str);
        }
        if (!GetSystemServiceLancet.LIZIZ && "connectivity".equals(str)) {
            try {
                new AnonymousClass0836().LIZLLL();
                GetSystemServiceLancet.LIZIZ = true;
                return c19eg.getSystemService(str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return c19eg.getSystemService(str);
            }
        }
        return c19eg.getSystemService(str);
    }

    public static void J5(SmartAvatarImageView smartAvatarImageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(smartAvatarImageView);
        smartAvatarImageView.setAlpha(f);
    }

    public static void J6(C197039127h c197039127h, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c197039127h);
        c197039127h.setLayoutParams(layoutParams);
    }

    public static void J7(View.OnClickListener onClickListener, RecyclerView recyclerView) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(recyclerView);
        }
        recyclerView.setOnClickListener(aVar);
    }

    public static void J8(C19R6 c19r6, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c19r6);
        }
        c19r6.setOnClickListener(aVar);
    }

    public static void J9(C21458918yR c21458918yR, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c21458918yR);
        }
        c21458918yR.setOnClickListener(aVar);
    }

    public static void Ja(C1012300cRw c1012300cRw, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1012300cRw);
        }
        c1012300cRw.setOnClickListener(aVar);
    }

    public static void Jb(SmartImageView smartImageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(smartImageView);
        smartImageView.setRotationY(f);
    }

    public static void Jc(View view, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setTranslationX(f);
    }

    public static void Jd(TuxTextView tuxTextView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxTextView);
        tuxTextView.setX(f);
    }

    public static void K(C1744710vVF c1744710vVF, int i) {
        int visibility = c1744710vVF.getVisibility();
        c1744710vVF.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1744710vVF);
    }

    public static void K0(C528030KnJ c528030KnJ, int i) {
        int visibility = c528030KnJ.getVisibility();
        c528030KnJ.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c528030KnJ);
    }

    public static void K1(C426020GnA c426020GnA, int i) {
        int visibility = c426020GnA.getVisibility();
        c426020GnA.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c426020GnA);
    }

    public static String K3(int i, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        boolean z = C09CF.LIZ;
        if (z) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        String string = jSONObject.toString(i);
        if (z) {
            C0VY1.LIZ(jCurrentTimeMillis);
        }
        return string;
    }

    public static void K5(C1763840w06 c1763840w06, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1763840w06);
        c1763840w06.setAlpha(f);
    }

    public static void K6(C1748330vb5 c1748330vb5, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1748330vb5);
        c1748330vb5.setLayoutParams(layoutParams);
    }

    public static void K7(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(viewGroup);
        }
        viewGroup.setOnClickListener(onClickListener);
    }

    public static void K8(C1103220eoa c1103220eoa, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1103220eoa);
        }
        c1103220eoa.setOnClickListener(onClickListener);
    }

    public static void K9(C424580Gkq c424580Gkq, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c424580Gkq);
        }
        c424580Gkq.setOnClickListener(onClickListener);
    }

    public static void Ka(C1324800kZy c1324800kZy, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1324800kZy);
        }
        c1324800kZy.setOnClickListener(aVar);
    }

    public static void Kb(TuxIconView tuxIconView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxIconView);
        tuxIconView.setRotationY(f);
    }

    public static void Kc(FrameLayout frameLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(frameLayout);
        frameLayout.setTranslationX(f);
    }

    public static void Kd(float f, ViewGroup viewGroup) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewGroup);
        viewGroup.setY(f);
    }

    public static void L(C435470H5t c435470H5t, int i) {
        int visibility = c435470H5t.getVisibility();
        c435470H5t.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c435470H5t);
    }

    public static void L0(C415800GSc c415800GSc, int i) {
        int visibility = c415800GSc.getVisibility();
        c415800GSc.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c415800GSc);
    }

    public static void L1(C0EJZ c0ejz, int i) {
        int visibility = c0ejz.getVisibility();
        c0ejz.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0ejz);
    }

    public static void L5(C196925122x c196925122x, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c196925122x);
        c196925122x.setAlpha(f);
    }

    public static void L6(C1748440vbG c1748440vbG, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1748440vbG);
        c1748440vbG.setLayoutParams(layoutParams);
    }

    public static void L7(Button button, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(button);
        }
        button.setOnClickListener(onClickListener);
    }

    public static void L8(C418700GbM c418700GbM, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c418700GbM);
        }
        c418700GbM.setOnClickListener(onClickListener);
    }

    public static void L9(C1353500lKG c1353500lKG, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1353500lKG);
        }
        c1353500lKG.setOnClickListener(onClickListener);
    }

    public static void LJIIZILJ(Looper looper, Printer printer) {
        if (C082Q.LIZ == 1 && C082Q.LIZJ == Looper.myLooper()) {
            if (printer != null) {
                ArrayList<Printer> arrayList = C082Q.LIZIZ;
                if (!arrayList.contains(printer)) {
                    arrayList.add(printer);
                    return;
                }
                return;
            }
            try {
                if (!MessageLoggingOpt.needCut || !looper.equals(Looper.getMainLooper())) {
                    looper.setMessageLogging(printer);
                }
                C082Q.LJFF = true;
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        try {
            if (!MessageLoggingOpt.needCut || !looper.equals(Looper.getMainLooper())) {
                looper.setMessageLogging(printer);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (C082Q.LIZJ != Looper.myLooper()) {
            return;
        }
        C082Q.LIZLLL = printer;
    }

    public static void LJJIFFI(Context context, BroadcastReceiver broadcastReceiver) {
        ReceiverRegisterLancet.loge(broadcastReceiver, false);
        context.unregisterReceiver(broadcastReceiver);
    }

    public static void LJJII(org.chromium.content.browser.sms.a aVar, BroadcastReceiver broadcastReceiver) {
        ReceiverRegisterLancet.loge(broadcastReceiver, false);
        aVar.unregisterReceiver(broadcastReceiver);
    }

    public static void LJJIIJZLJL(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            BundleTooLargeChecker.recordBundleTooLargePoint("putAll_bundle", bundle2);
        }
        bundle.putAll(bundle2);
    }

    public static void LJJJLZIJ(View view, ViewGroup viewGroup) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, view);
        viewGroup.removeView(view);
    }

    public static void LJJJZ(View view, FrameLayout frameLayout) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(frameLayout, view);
        frameLayout.removeView(view);
    }

    public static void LJJL(View view, LinearLayout linearLayout) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(linearLayout, view);
        linearLayout.removeView(view);
    }

    public static void LJJLI(View view, ConstraintLayout constraintLayout) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(constraintLayout, view);
        constraintLayout.removeView(view);
    }

    public static void LJJLIIIIJ(View view, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, view);
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.removeView(view);
    }

    public static void LJJLIIIJ(RelativeLayout relativeLayout, View view) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(relativeLayout, view);
        relativeLayout.removeView(view);
    }

    public static void LJJLIIIJILLIZJL(LinearLayoutCompat linearLayoutCompat, View view) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(linearLayoutCompat, view);
        linearLayoutCompat.removeView(view);
    }

    public static void LJJLIIIJJI(C19V8 c19v8, View view) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c19v8, view);
        c19v8.removeView(view);
    }

    public static void LJJLIIIJJIZ(C12XH c12xh, View view) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c12xh, view);
        c12xh.removeView(view);
    }

    public static void LJJLIIIJL(C1773610wFr c1773610wFr, View view) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1773610wFr, view);
        c1773610wFr.removeView(view);
    }

    public static void LJJLIIIJLJLI(C1083340eIW c1083340eIW, View view) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1083340eIW, view);
        c1083340eIW.removeView(view);
    }

    public static void LJJLIIIJLLLLLLLZ(C1748440vbG c1748440vbG, View view) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1748440vbG, view);
        c1748440vbG.removeView(view);
    }

    public static void LJJLIIJ(C1846230y8z c1846230y8z, View view) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1846230y8z, view);
        c1846230y8z.removeView(view);
    }

    public static void LJJLIL(int i, ViewGroup viewGroup) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, null);
        viewGroup.removeViewAt(i);
    }

    public static void LJJLJ(int i, LinearLayout linearLayout) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(linearLayout, null);
        linearLayout.removeViewAt(i);
    }

    public static void LJJLJLI(View view, ViewGroup viewGroup) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, view);
        viewGroup.removeViewInLayout(view);
    }

    public static void LJJLL(View view, ConstraintLayout constraintLayout) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(constraintLayout, view);
        constraintLayout.removeViewInLayout(view);
    }

    public static boolean LJJZZIII(Handler handler, Runnable runnable) {
        ThreadLocal<Boolean> threadLocal;
        if (MQCollector.shouldTrack(handler)) {
            try {
                threadLocal = MessageQueueHook.GUARD;
                threadLocal.set(Boolean.TRUE);
                MQCollector.onPostMessage(handler, runnable);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                threadLocal = MessageQueueHook.GUARD;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                MessageQueueHook.GUARD.remove();
                throw th;
            }
            threadLocal.remove();
        }
        return handler.post(runnable);
    }

    public static boolean LJL(Handler handler, Runnable runnable) {
        ThreadLocal<Boolean> threadLocal;
        if (MQCollector.shouldTrack(handler)) {
            try {
                threadLocal = MessageQueueHook.GUARD;
                threadLocal.set(Boolean.TRUE);
                MQCollector.onPostMessage(handler, runnable);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                threadLocal = MessageQueueHook.GUARD;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                MessageQueueHook.GUARD.remove();
                throw th;
            }
            threadLocal.remove();
        }
        return HandlerHook.postAtFrontOfQueue(handler, runnable);
    }

    public static boolean LJLILLLLZI(Handler handler, int i) {
        ThreadLocal<Boolean> threadLocal;
        if (MQCollector.shouldTrack(handler)) {
            try {
                threadLocal = MessageQueueHook.GUARD;
                threadLocal.set(Boolean.TRUE);
                MQCollector.onMessage(handler, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                threadLocal = MessageQueueHook.GUARD;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                MessageQueueHook.GUARD.remove();
                throw th;
            }
            threadLocal.remove();
        }
        return handler.sendEmptyMessage(i);
    }

    public static boolean LJLJJL(Handler handler, Message message) {
        ThreadLocal<Boolean> threadLocal;
        if (MQCollector.shouldTrack(handler)) {
            try {
                threadLocal = MessageQueueHook.GUARD;
                threadLocal.set(Boolean.TRUE);
                MQCollector.onMessage(handler, message);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                threadLocal = MessageQueueHook.GUARD;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                MessageQueueHook.GUARD.remove();
                throw th;
            }
            threadLocal.remove();
        }
        return handler.sendMessage(message);
    }

    public static boolean LJLJJLL(Handler handler, Message message) {
        if (MQCollector.shouldTrack(handler) && MessageQueueHook.GUARD.get() == null) {
            MQCollector.onMessage(handler, message);
        }
        return HandlerHook.sendMessageAtFrontOfQueue(handler, message);
    }

    public static Dialog LJLL(DialogFragment dialogFragment, Bundle bundle) {
        Dialog dialogOnCreateDialog = dialogFragment.onCreateDialog(bundle);
        int iHashCode = dialogFragment.hashCode();
        HashMap map = (HashMap) C482200Iva.LIZ;
        Object obj = map.get(Integer.valueOf(iHashCode));
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(obj, bool)) {
            map.remove(Integer.valueOf(iHashCode));
            ((HashMap) C482200Iva.LIZIZ).put(Integer.valueOf(dialogOnCreateDialog.hashCode()), bool);
        }
        return dialogOnCreateDialog;
    }

    public static InputStream LJLLI(Class cls, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (C786460UtA.LIZ.contains(str)) {
                if (((Boolean) C0B4Z.LIZ.getValue()).booleanValue()) {
                    String str2 = "s-appsflyer" + str.substring(str.lastIndexOf(47));
                    try {
                        C844470XAv.LIZ.getClass();
                        return C844470XAv.LIZ().getAssets().open(str2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } else if (C786460UtA.LIZIZ.contains(str)) {
                if (((Boolean) C282140B4a.LIZ.getValue()).booleanValue()) {
                    String str3 = "s-google/" + str;
                    try {
                        C844470XAv.LIZ.getClass();
                        return C844470XAv.LIZ().getAssets().open(str3);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
            } else {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", str);
                    C793770VBv.LJII("ResAsStream", jSONObject, null, null);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
            return cls.getResourceAsStream(str);
        }
        return cls.getResourceAsStream(str);
    }

    public static void LJLLLLLL(int i, View view) {
        int visibility = view.getVisibility();
        view.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, view);
    }

    public static void LJLZ(int i, ViewGroup viewGroup) {
        int visibility = viewGroup.getVisibility();
        viewGroup.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, viewGroup);
    }

    public static void LJZ(int i, FrameLayout frameLayout) {
        int visibility = frameLayout.getVisibility();
        frameLayout.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, frameLayout);
    }

    public static void LJZI(int i, ImageView imageView) {
        int visibility = imageView.getVisibility();
        imageView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, imageView);
    }

    public static void LJZL(int i, LinearLayout linearLayout) {
        int visibility = linearLayout.getVisibility();
        linearLayout.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, linearLayout);
    }

    public static void LL(int i, ConstraintLayout constraintLayout) {
        int visibility = constraintLayout.getVisibility();
        constraintLayout.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, constraintLayout);
    }

    public static void LLD(int i, C1295960jpS c1295960jpS) {
        int visibility = c1295960jpS.getVisibility();
        c1295960jpS.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1295960jpS);
    }

    public static void LLF(int i, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        int visibility = viewOnAttachStateChangeListenerC20604515jv.getVisibility();
        viewOnAttachStateChangeListenerC20604515jv.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, viewOnAttachStateChangeListenerC20604515jv);
    }

    public static void LLFF(int i, SmartImageView smartImageView) {
        int visibility = smartImageView.getVisibility();
        smartImageView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, smartImageView);
    }

    public static void LLFFF(int i, C19U1 c19u1) {
        int visibility = c19u1.getVisibility();
        c19u1.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19u1);
    }

    public static void LLFII(int i, C426090GnH c426090GnH) {
        int visibility = c426090GnH.getVisibility();
        c426090GnH.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c426090GnH);
    }

    public static void LLFZ(int i, C19HL c19hl) {
        int visibility = c19hl.getVisibility();
        c19hl.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19hl);
    }

    public static void LLI(int i, C1775090wIF c1775090wIF) {
        int visibility = c1775090wIF.getVisibility();
        c1775090wIF.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1775090wIF);
    }

    public static void LLIFFJFJJ(C1236570iHf c1236570iHf, int i) {
        int visibility = c1236570iHf.getVisibility();
        c1236570iHf.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1236570iHf);
    }

    public static void LLII(C21592519et c21592519et, int i) {
        int visibility = c21592519et.getVisibility();
        c21592519et.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c21592519et);
    }

    public static void LLIIII(SurfaceView surfaceView, int i) {
        int visibility = surfaceView.getVisibility();
        surfaceView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, surfaceView);
    }

    public static void LLIIIILZ(TextureView textureView, int i) {
        int visibility = textureView.getVisibility();
        textureView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, textureView);
    }

    public static void LLIIIJ(ViewStub viewStub, int i) {
        int visibility = viewStub.getVisibility();
        viewStub.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, viewStub);
    }

    public static void LLIIIL(Button button, int i) {
        int visibility = button.getVisibility();
        button.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, button);
    }

    public static void LLIIIZ(CheckBox checkBox, int i) {
        int visibility = checkBox.getVisibility();
        checkBox.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, checkBox);
    }

    public static void LLIIJI(HorizontalScrollView horizontalScrollView, int i) {
        int visibility = horizontalScrollView.getVisibility();
        horizontalScrollView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, horizontalScrollView);
    }

    public static void LLIIJLIL(ProgressBar progressBar, int i) {
        int visibility = progressBar.getVisibility();
        progressBar.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, progressBar);
    }

    public static void LLIIL(RelativeLayout relativeLayout, int i) {
        int visibility = relativeLayout.getVisibility();
        relativeLayout.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, relativeLayout);
    }

    public static void LLIILII(ScrollView scrollView, int i) {
        int visibility = scrollView.getVisibility();
        scrollView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, scrollView);
    }

    public static void LLIILZL(SeekBar seekBar, int i) {
        int visibility = seekBar.getVisibility();
        seekBar.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, seekBar);
    }

    public static void LLIIZ(Space space, int i) {
        int visibility = space.getVisibility();
        space.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, space);
    }

    public static void LLIL(TextView textView, int i) {
        int visibility = textView.getVisibility();
        textView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, textView);
    }

    public static void LLILII(C19VE c19ve, int i) {
        int visibility = c19ve.getVisibility();
        c19ve.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19ve);
    }

    public static void LLILIL(AppCompatImageView appCompatImageView, int i) {
        int visibility = appCompatImageView.getVisibility();
        appCompatImageView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, appCompatImageView);
    }

    public static void LLILL(AppCompatTextView appCompatTextView, int i) {
        int visibility = appCompatTextView.getVisibility();
        appCompatTextView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, appCompatTextView);
    }

    public static void LLILLIZIL(LinearLayoutCompat linearLayoutCompat, int i) {
        int visibility = linearLayoutCompat.getVisibility();
        linearLayoutCompat.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, linearLayoutCompat);
    }

    public static void LLILLJJLI(C19V8 c19v8, int i) {
        int visibility = c19v8.getVisibility();
        c19v8.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19v8);
    }

    public static void LLILLL(CardView cardView, int i) {
        int visibility = cardView.getVisibility();
        cardView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, cardView);
    }

    public static void LLILZ(ComposeView composeView, int i) {
        int visibility = composeView.getVisibility();
        composeView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, composeView);
    }

    public static void LLILZIL(C1087110eOb c1087110eOb, int i) {
        int visibility = c1087110eOb.getVisibility();
        c1087110eOb.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1087110eOb);
    }

    public static void LLILZLL(C16G0 c16g0, int i) {
        int visibility = c16g0.getVisibility();
        c16g0.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c16g0);
    }

    public static void LLIZ(C21578619ce c21578619ce, int i) {
        int visibility = c21578619ce.getVisibility();
        c21578619ce.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c21578619ce);
    }

    public static void LLIZLLLIL(RecyclerView recyclerView, int i) {
        int visibility = recyclerView.getVisibility();
        recyclerView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, recyclerView);
    }

    public static void LLJ(ViewPager viewPager, int i) {
        int visibility = viewPager.getVisibility();
        viewPager.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, viewPager);
    }

    public static void LLJI(C20632315oP c20632315oP, int i) {
        int visibility = c20632315oP.getVisibility();
        c20632315oP.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c20632315oP);
    }

    public static void LLJIJIL(C1252970ii7 c1252970ii7, int i) {
        int visibility = c1252970ii7.getVisibility();
        c1252970ii7.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1252970ii7);
    }

    public static void LLJILJIL(C0GZU c0gzu, int i) {
        int visibility = c0gzu.getVisibility();
        c0gzu.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0gzu);
    }

    public static void LLJILJILJ(C21405218pm c21405218pm, int i) {
        int visibility = c21405218pm.getVisibility();
        c21405218pm.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c21405218pm);
    }

    public static void LLJILLL(MeasureLinearLayout measureLinearLayout, int i) {
        int visibility = measureLinearLayout.getVisibility();
        measureLinearLayout.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, measureLinearLayout);
    }

    public static void LLJJ(C418350Gan c418350Gan, int i) {
        int visibility = c418350Gan.getVisibility();
        c418350Gan.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c418350Gan);
    }

    public static void LLJJI(C1126540fQC c1126540fQC, int i) {
        int visibility = c1126540fQC.getVisibility();
        c1126540fQC.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1126540fQC);
    }

    public static void LLJJIII(C1324720kZq c1324720kZq, int i) {
        int visibility = c1324720kZq.getVisibility();
        c1324720kZq.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1324720kZq);
    }

    public static void LLJJIJI(C20745116Ft c20745116Ft, int i) {
        int visibility = c20745116Ft.getVisibility();
        c20745116Ft.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c20745116Ft);
    }

    public static void LLJJIJIIJIL(C19631511rN c19631511rN, int i) {
        int visibility = c19631511rN.getVisibility();
        c19631511rN.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19631511rN);
    }

    public static void LLJJIJIL(LiveIconView liveIconView, int i) {
        int visibility = liveIconView.getVisibility();
        liveIconView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, liveIconView);
    }

    public static void LLJJJ(C16FS c16fs, int i) {
        int visibility = c16fs.getVisibility();
        c16fs.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c16fs);
    }

    public static void LLJJJIL(C20743716Ff c20743716Ff, int i) {
        int visibility = c20743716Ff.getVisibility();
        c20743716Ff.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c20743716Ff);
    }

    public static void LLJJJJ(C16F5 c16f5, int i) {
        int visibility = c16f5.getVisibility();
        c16f5.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c16f5);
    }

    public static void LLJJJJJIL(C16FV c16fv, int i) {
        int visibility = c16fv.getVisibility();
        c16fv.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c16fv);
    }

    public static void LLJJJJLIIL(C20743416Fc c20743416Fc, int i) {
        int visibility = c20743416Fc.getVisibility();
        c20743416Fc.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c20743416Fc);
    }

    public static void LLJJL(C21538619Qy c21538619Qy, int i) {
        int visibility = c21538619Qy.getVisibility();
        c21538619Qy.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c21538619Qy);
    }

    public static void LLJJLIIIJLLLLLLLZ(C0UAV c0uav, int i) {
        int visibility = c0uav.getVisibility();
        c0uav.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0uav);
    }

    public static void LLJL(C985030bjx c985030bjx, int i) {
        int visibility = c985030bjx.getVisibility();
        c985030bjx.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c985030bjx);
    }

    public static void LLJLIL(C1146270fw1 c1146270fw1, int i) {
        int visibility = c1146270fw1.getVisibility();
        c1146270fw1.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1146270fw1);
    }

    public static void LLJLILLLLZIIL(C1145830fvJ c1145830fvJ, int i) {
        int visibility = c1145830fvJ.getVisibility();
        c1145830fvJ.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1145830fvJ);
    }

    public static void LLJLL(C430350Gu9 c430350Gu9, int i) {
        int visibility = c430350Gu9.getVisibility();
        c430350Gu9.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c430350Gu9);
    }

    public static void LLJLLIL(C427330GpH c427330GpH, int i) {
        int visibility = c427330GpH.getVisibility();
        c427330GpH.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c427330GpH);
    }

    public static void LLJLLL(C931950aML c931950aML, int i) {
        int visibility = c931950aML.getVisibility();
        c931950aML.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c931950aML);
    }

    public static void LLJZ(C0KVZ c0kvz, int i) {
        int visibility = c0kvz.getVisibility();
        c0kvz.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0kvz);
    }

    public static void LLJZIJLIL(C1811290xEd c1811290xEd, int i) {
        int visibility = c1811290xEd.getVisibility();
        c1811290xEd.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1811290xEd);
    }

    public static void LLL(C749790Tb7 c749790Tb7, int i) {
        int visibility = c749790Tb7.getVisibility();
        c749790Tb7.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c749790Tb7);
    }

    public static void LLLF(C1105630esT c1105630esT, int i) {
        int visibility = c1105630esT.getVisibility();
        c1105630esT.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1105630esT);
    }

    public static void LLLFF(C432120Gx0 c432120Gx0, int i) {
        int visibility = c432120Gx0.getVisibility();
        c432120Gx0.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c432120Gx0);
    }

    public static void LLLFFI(C1106360ete c1106360ete, int i) {
        int visibility = c1106360ete.getVisibility();
        c1106360ete.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1106360ete);
    }

    public static void LLLFZ(C498540Jgq c498540Jgq, int i) {
        int visibility = c498540Jgq.getVisibility();
        c498540Jgq.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c498540Jgq);
    }

    public static void LLLI(C499060Jhg c499060Jhg, int i) {
        int visibility = c499060Jhg.getVisibility();
        c499060Jhg.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c499060Jhg);
    }

    public static void LLLII(C472280Ifa c472280Ifa, int i) {
        int visibility = c472280Ifa.getVisibility();
        c472280Ifa.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c472280Ifa);
    }

    public static void LLLIIII(C0TE0 c0te0, int i) {
        int visibility = c0te0.getVisibility();
        c0te0.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0te0);
    }

    public static void LLLIIIIL(C1117870fCD c1117870fCD, int i) {
        int visibility = c1117870fCD.getVisibility();
        c1117870fCD.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1117870fCD);
    }

    public static void LLLIIIL(C1129900fVc c1129900fVc, int i) {
        int visibility = c1129900fVc.getVisibility();
        c1129900fVc.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1129900fVc);
    }

    public static void LLLIIL(C1147840fyY c1147840fyY, int i) {
        int visibility = c1147840fyY.getVisibility();
        c1147840fyY.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1147840fyY);
    }

    public static void LLLIILIL(C1091250eVH c1091250eVH, int i) {
        int visibility = c1091250eVH.getVisibility();
        c1091250eVH.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1091250eVH);
    }

    public static void LLLIL(C430340Gu8 c430340Gu8, int i) {
        int visibility = c430340Gu8.getVisibility();
        c430340Gu8.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c430340Gu8);
    }

    public static void LLLILZ(C1143100fqu c1143100fqu, int i) {
        int visibility = c1143100fqu.getVisibility();
        c1143100fqu.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1143100fqu);
    }

    public static void LLLILZJ(RunnableC781530UlD runnableC781530UlD, int i) {
        int visibility = runnableC781530UlD.getVisibility();
        runnableC781530UlD.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, runnableC781530UlD);
    }

    public static void LLLILZLLLI(C19P4 c19p4, int i) {
        int visibility = c19p4.getVisibility();
        c19p4.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19p4);
    }

    public static void LLLIZZ(C16FZ c16fz, int i) {
        int visibility = c16fz.getVisibility();
        c16fz.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c16fz);
    }

    public static void LLLJ(C1099610eil c1099610eil, int i) {
        int visibility = c1099610eil.getVisibility();
        c1099610eil.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1099610eil);
    }

    public static void LLLJIL(C19R6 c19r6, int i) {
        int visibility = c19r6.getVisibility();
        c19r6.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19r6);
    }

    public static void LLLJL(1Ndy r1, int i) {
        int visibility = r1.getVisibility();
        r1.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, r1);
    }

    public static void LLLL(1NfS r1, int i) {
        int visibility = r1.getVisibility();
        r1.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, r1);
    }

    public static void LLLLII(C19YY c19yy, int i) {
        int visibility = c19yy.getVisibility();
        c19yy.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19yy);
    }

    public static void LLLLIIIILLL(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, int i) {
        int visibility = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getVisibility();
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
    }

    public static void LLLLIIL(C1235900iGa c1235900iGa, int i) {
        int visibility = c1235900iGa.getVisibility();
        c1235900iGa.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1235900iGa);
    }

    public static void LLLLIILL(C1235870iGX c1235870iGX, int i) {
        int visibility = c1235870iGX.getVisibility();
        c1235870iGX.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1235870iGX);
    }

    public static void LLLLIILLL(C418880Gbe c418880Gbe, int i) {
        int visibility = c418880Gbe.getVisibility();
        c418880Gbe.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c418880Gbe);
    }

    public static void LLLLIL(C19Y3 c19y3, int i) {
        int visibility = c19y3.getVisibility();
        c19y3.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19y3);
    }

    public static void LLLLILI(C21279718Pj c21279718Pj, int i) {
        int visibility = c21279718Pj.getVisibility();
        c21279718Pj.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c21279718Pj);
    }

    public static void LLLLJ(C21631219l8 c21631219l8, int i) {
        int visibility = c21631219l8.getVisibility();
        c21631219l8.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c21631219l8);
    }

    public static void LLLLJI(C427870Gq9 c427870Gq9, int i) {
        int visibility = c427870Gq9.getVisibility();
        c427870Gq9.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c427870Gq9);
    }

    public static void LLLLL(ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, int i) {
        int visibility = viewOnAttachStateChangeListenerC20631115oD.getVisibility();
        viewOnAttachStateChangeListenerC20631115oD.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, viewOnAttachStateChangeListenerC20631115oD);
    }

    public static void LLLLLIL(C1302030jzF c1302030jzF, int i) {
        int visibility = c1302030jzF.getVisibility();
        c1302030jzF.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1302030jzF);
    }

    public static void LLLLLILLIL(C416200GTq c416200GTq, int i) {
        int visibility = c416200GTq.getVisibility();
        c416200GTq.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c416200GTq);
    }

    public static void LLLLLJIL(C427660Gpo c427660Gpo, int i) {
        int visibility = c427660Gpo.getVisibility();
        c427660Gpo.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c427660Gpo);
    }

    public static void LLLLLJLJLL(C430200Gtu c430200Gtu, int i) {
        int visibility = c430200Gtu.getVisibility();
        c430200Gtu.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c430200Gtu);
    }

    public static void LLLLLL(C427760Gpy c427760Gpy, int i) {
        int visibility = c427760Gpy.getVisibility();
        c427760Gpy.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c427760Gpy);
    }

    public static void LLLLLLIL(C426770GoN c426770GoN, int i) {
        int visibility = c426770GoN.getVisibility();
        c426770GoN.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c426770GoN);
    }

    public static void LLLLLLJ(C197039127h c197039127h, int i) {
        int visibility = c197039127h.getVisibility();
        c197039127h.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c197039127h);
    }

    public static void LLLLLLL(C1203130hPj c1203130hPj, int i) {
        int visibility = c1203130hPj.getVisibility();
        c1203130hPj.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1203130hPj);
    }

    public static void LLLLLLLLL(C19736512Jv c19736512Jv, int i) {
        int visibility = c19736512Jv.getVisibility();
        c19736512Jv.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19736512Jv);
    }

    public static void LLLLLLLLLL(C289601Ag c289601Ag, int i) {
        int visibility = c289601Ag.getVisibility();
        c289601Ag.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c289601Ag);
    }

    public static void LLLLLLLZIL(C1748330vb5 c1748330vb5, int i) {
        int visibility = c1748330vb5.getVisibility();
        c1748330vb5.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1748330vb5);
    }

    public static void LLLLLLZ(C12P4 c12p4, int i) {
        int visibility = c12p4.getVisibility();
        c12p4.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c12p4);
    }

    public static void LLLLLLZZ(TuxIconView tuxIconView, int i) {
        int visibility = tuxIconView.getVisibility();
        tuxIconView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, tuxIconView);
    }

    public static void LLLLLZ(C0HZQ c0hzq, int i) {
        int visibility = c0hzq.getVisibility();
        c0hzq.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0hzq);
    }

    public static void LLLLLZIL(C19M4 c19m4, int i) {
        int visibility = c19m4.getVisibility();
        c19m4.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19m4);
    }

    public static void LLLLLZL(C0I7D c0i7d, int i) {
        int visibility = c0i7d.getVisibility();
        c0i7d.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0i7d);
    }

    public static void LLLLZ(C1841350y17 c1841350y17, int i) {
        int visibility = c1841350y17.getVisibility();
        c1841350y17.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1841350y17);
    }

    public static void LLLLZI(C21411818qq c21411818qq, int i) {
        int visibility = c21411818qq.getVisibility();
        c21411818qq.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c21411818qq);
    }

    public static void LLLLZIL(C21415018rM c21415018rM, int i) {
        int visibility = c21415018rM.getVisibility();
        c21415018rM.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c21415018rM);
    }

    public static void LLLLZLL(TuxTextView tuxTextView, int i) {
        int visibility = tuxTextView.getVisibility();
        tuxTextView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, tuxTextView);
    }

    public static void LLLLZLLIL(C1203310hQ1 c1203310hQ1, int i) {
        int visibility = c1203310hQ1.getVisibility();
        c1203310hQ1.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1203310hQ1);
    }

    public static void LLLLZLLLI(TuxNavBar tuxNavBar, int i) {
        int visibility = tuxNavBar.getVisibility();
        tuxNavBar.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, tuxNavBar);
    }

    public static void LLLZ(C1749260vca c1749260vca, int i) {
        int visibility = c1749260vca.getVisibility();
        c1749260vca.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1749260vca);
    }

    public static void LLLZI(C1826520xdC c1826520xdC, int i) {
        int visibility = c1826520xdC.getVisibility();
        c1826520xdC.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1826520xdC);
    }

    public static void LLLZIIL(C1287400jbe c1287400jbe, int i) {
        int visibility = c1287400jbe.getVisibility();
        c1287400jbe.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1287400jbe);
    }

    public static void LLLZIL(C1066370dr9 c1066370dr9, int i) {
        int visibility = c1066370dr9.getVisibility();
        c1066370dr9.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1066370dr9);
    }

    public static void LLLZL(TuxSkeletonLayout tuxSkeletonLayout, int i) {
        int visibility = tuxSkeletonLayout.getVisibility();
        tuxSkeletonLayout.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, tuxSkeletonLayout);
    }

    public static void LLLZLL(C20627315nb c20627315nb, int i) {
        int visibility = c20627315nb.getVisibility();
        c20627315nb.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c20627315nb);
    }

    public static void LLLZLZ(C1749280vcc c1749280vcc, int i) {
        int visibility = c1749280vcc.getVisibility();
        c1749280vcc.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1749280vcc);
    }

    public static void LLLZZ(C426320Gne c426320Gne, int i) {
        int visibility = c426320Gne.getVisibility();
        c426320Gne.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c426320Gne);
    }

    public static void LLLZZIL(C1390410mHn c1390410mHn, int i) {
        int visibility = c1390410mHn.getVisibility();
        c1390410mHn.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1390410mHn);
    }

    public static void LLZ(C1390130mHL c1390130mHL, int i) {
        int visibility = c1390130mHL.getVisibility();
        c1390130mHL.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1390130mHL);
    }

    public static void LLZIL(C427480GpW c427480GpW, int i) {
        int visibility = c427480GpW.getVisibility();
        c427480GpW.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c427480GpW);
    }

    public static void LLZILL(TuxSpinner tuxSpinner, int i) {
        int visibility = tuxSpinner.getVisibility();
        tuxSpinner.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, tuxSpinner);
    }

    public static void LLZL(C481090Itn c481090Itn, int i) {
        int visibility = c481090Itn.getVisibility();
        c481090Itn.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c481090Itn);
    }

    public static void LLZLI(C1846060y8i c1846060y8i, int i) {
        int visibility = c1846060y8i.getVisibility();
        c1846060y8i.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1846060y8i);
    }

    public static void LLZLL(C127K c127k, int i) {
        int visibility = c127k.getVisibility();
        c127k.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c127k);
    }

    public static void LLZLLIL(TuxTag tuxTag, int i) {
        int visibility = tuxTag.getVisibility();
        tuxTag.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, tuxTag);
    }

    public static void LLZLLLL(C426160GnO c426160GnO, int i) {
        int visibility = c426160GnO.getVisibility();
        c426160GnO.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c426160GnO);
    }

    public static void LLZZ(RadiusLayout radiusLayout, int i) {
        int visibility = radiusLayout.getVisibility();
        radiusLayout.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, radiusLayout);
    }

    public static void LLZZJLIL(C16FB c16fb, int i) {
        int visibility = c16fb.getVisibility();
        c16fb.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c16fb);
    }

    public static void LLZZLLIL(C1322110kVd c1322110kVd, int i) {
        int visibility = c1322110kVd.getVisibility();
        c1322110kVd.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1322110kVd);
    }

    public static void LLZZZIL(C21532619Oq c21532619Oq, int i) {
        int visibility = c21532619Oq.getVisibility();
        c21532619Oq.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c21532619Oq);
    }

    public static void LLZZZZ(C16GX c16gx, int i) {
        int visibility = c16gx.getVisibility();
        c16gx.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c16gx);
    }

    public static void La(C419060Gbw c419060Gbw, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c419060Gbw);
        }
        c419060Gbw.setOnClickListener(onClickListener);
    }

    public static void Lb(float f, ViewGroup viewGroup) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewGroup);
        viewGroup.setScaleX(f);
    }

    public static void Lc(ImageView imageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
        imageView.setTranslationX(f);
    }

    public static void Ld(View view, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setY(f);
    }

    public static void M(C7937038d c7937038d, int i) {
        int visibility = c7937038d.getVisibility();
        c7937038d.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c7937038d);
    }

    public static void M0(C419260GcG c419260GcG, int i) {
        int visibility = c419260GcG.getVisibility();
        c419260GcG.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c419260GcG);
    }

    public static void M1(C368740Ecy c368740Ecy, int i) {
        int visibility = c368740Ecy.getVisibility();
        c368740Ecy.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c368740Ecy);
    }

    public static Object M2(SparkActivity sparkActivity, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (GetSystemServiceLancet.LIZ) {
                synchronized (ClipboardManager.class) {
                    try {
                        systemService = sparkActivity.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(systemService, new GetSystemServiceLancet.UIThreadHandler((Handler) declaredField.get(systemService)));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C805380Via.LIZJ(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        GetSystemServiceLancet.LIZ = false;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return systemService;
            }
            return sparkActivity.getSystemService(str);
        }
        if (!GetSystemServiceLancet.LIZIZ && "connectivity".equals(str)) {
            try {
                new AnonymousClass0836().LIZLLL();
                GetSystemServiceLancet.LIZIZ = true;
                return sparkActivity.getSystemService(str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return sparkActivity.getSystemService(str);
            }
        }
        return sparkActivity.getSystemService(str);
    }

    public static void M5(C453470HqL c453470HqL, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c453470HqL);
        c453470HqL.setAlpha(f);
    }

    public static void M6(TuxIconView tuxIconView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxIconView);
        tuxIconView.setLayoutParams(layoutParams);
    }

    public static void M7(CheckBox checkBox, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(checkBox);
        }
        checkBox.setOnClickListener(onClickListener);
    }

    public static void M8(C427280GpC c427280GpC, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c427280GpC);
        }
        c427280GpC.setOnClickListener(onClickListener);
    }

    public static void Ma(RoundingCornerLayout roundingCornerLayout, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(roundingCornerLayout);
        }
        roundingCornerLayout.setOnClickListener(aVar);
    }

    public static void Mb(float f, TextView textView) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textView);
        textView.setScaleX(f);
    }

    public static void Mc(LinearLayout linearLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(linearLayout);
        linearLayout.setTranslationX(f);
    }

    public static void Md(FrameLayout frameLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(frameLayout);
        frameLayout.setY(f);
    }

    public static void N(C1753460vjM c1753460vjM, int i) {
        int visibility = c1753460vjM.getVisibility();
        c1753460vjM.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1753460vjM);
    }

    public static void N0(C1461760o8s c1461760o8s, int i) {
        int visibility = c1461760o8s.getVisibility();
        c1461760o8s.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1461760o8s);
    }

    public static void N1(1MYh r1, int i) {
        int visibility = r1.getVisibility();
        r1.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, r1);
    }

    public static Object N2(DownloadNotificationService downloadNotificationService, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (GetSystemServiceLancet.LIZ) {
                synchronized (ClipboardManager.class) {
                    try {
                        systemService = downloadNotificationService.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(systemService, new GetSystemServiceLancet.UIThreadHandler((Handler) declaredField.get(systemService)));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C805380Via.LIZJ(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        GetSystemServiceLancet.LIZ = false;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return systemService;
            }
            return downloadNotificationService.getSystemService(str);
        }
        if (!GetSystemServiceLancet.LIZIZ && "connectivity".equals(str)) {
            try {
                new AnonymousClass0836().LIZLLL();
                GetSystemServiceLancet.LIZIZ = true;
                return downloadNotificationService.getSystemService(str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return downloadNotificationService.getSystemService(str);
            }
        }
        return downloadNotificationService.getSystemService(str);
    }

    public static void N5(C0GX3 c0gx3, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gx3);
        c0gx3.setAlpha(f);
    }

    public static void N6(C0HZQ c0hzq, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0hzq);
        c0hzq.setLayoutParams(layoutParams);
    }

    public static void N7(EditText editText, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(editText);
        }
        editText.setOnClickListener(aVar);
    }

    public static void N8(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(viewOnAttachStateChangeListenerC20604515jv);
        }
        viewOnAttachStateChangeListenerC20604515jv.setOnClickListener(aVar);
    }

    public static void N9(C038I c038i, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c038i);
        }
        c038i.setOnClickListener(aVar);
    }

    public static void Na(RoundingCornerLayoutCL roundingCornerLayoutCL, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(roundingCornerLayoutCL);
        }
        roundingCornerLayoutCL.setOnClickListener(aVar);
    }

    public static void Nb(SurfaceView surfaceView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(surfaceView);
        surfaceView.setScaleX(f);
    }

    public static void Nc(ConstraintLayout constraintLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(constraintLayout);
        constraintLayout.setTranslationX(f);
    }

    public static void Nd(ImageView imageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
        imageView.setY(f);
    }

    public static void O(C1765700w36 c1765700w36, int i) {
        int visibility = c1765700w36.getVisibility();
        c1765700w36.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1765700w36);
    }

    public static void O1(C420690GeZ c420690GeZ, int i) {
        int visibility = c420690GeZ.getVisibility();
        c420690GeZ.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c420690GeZ);
    }

    public static void O6(C19M4 c19m4, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19m4);
        c19m4.setLayoutParams(layoutParams);
    }

    public static void O7(FrameLayout frameLayout, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(frameLayout);
        }
        frameLayout.setOnClickListener(onClickListener);
    }

    public static void O8(C21279718Pj c21279718Pj, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c21279718Pj);
        }
        c21279718Pj.setOnClickListener(onClickListener);
    }

    public static void O9(C1761470vwH c1761470vwH, ACListenerS90S0300000_26 aCListenerS90S0300000_26) {
        View.OnClickListener fVar = aCListenerS90S0300000_26;
        View.OnClickListener aVar = aCListenerS90S0300000_26;
        aVar = aCListenerS90S0300000_26;
        if (C1848410yCV.LIZ) {
            if (aCListenerS90S0300000_26 != null) {
                fVar = new f(aCListenerS90S0300000_26);
                aVar = new mf.a(fVar);
            }
        } else if (aCListenerS90S0300000_26 != null) {
            aVar = new mf.a(fVar);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1761470vwH);
        }
        c1761470vwH.setOnClickListener(aVar);
    }

    public static void Oa(RoundingCornerLayoutLL roundingCornerLayoutLL, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(roundingCornerLayoutLL);
        }
        roundingCornerLayoutLL.setOnClickListener(aVar);
    }

    public static void Ob(View view, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setScaleX(f);
    }

    public static void Oc(RecyclerView recyclerView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(recyclerView);
        recyclerView.setTranslationX(f);
    }

    public static void Od(TuxTextView tuxTextView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxTextView);
        tuxTextView.setY(f);
    }

    public static void P(C212332187m c212332187m, int i) {
        int visibility = c212332187m.getVisibility();
        c212332187m.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c212332187m);
    }

    public static void P0(TabHost tabHost, int i) {
        int visibility = tabHost.getVisibility();
        tabHost.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, tabHost);
    }

    public static void P1(C123X c123x, int i) {
        int visibility = c123x.getVisibility();
        c123x.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c123x);
    }

    public static void P5(C1457840o2Y c1457840o2Y, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1457840o2Y);
        c1457840o2Y.setAlpha(f);
    }

    public static void P6(C0I7D c0i7d, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0i7d);
        c0i7d.setLayoutParams(layoutParams);
    }

    public static void P7(ImageButton imageButton, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(imageButton);
        }
        imageButton.setOnClickListener(onClickListener);
    }

    public static void P8(C427870Gq9 c427870Gq9, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c427870Gq9);
        }
        c427870Gq9.setOnClickListener(onClickListener);
    }

    public static void P9(C1763800w02 c1763800w02, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1763800w02);
        }
        c1763800w02.setOnClickListener(aVar);
    }

    public static void Pa(C370670Eg5 c370670Eg5, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c370670Eg5);
        }
        c370670Eg5.setOnClickListener(aVar);
    }

    public static void Pb(FrameLayout frameLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(frameLayout);
        frameLayout.setScaleX(f);
    }

    public static void Pc(C1295960jpS c1295960jpS, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1295960jpS);
        c1295960jpS.setTranslationX(f);
    }

    public static void Q(C18L9 c18l9, int i) {
        int visibility = c18l9.getVisibility();
        c18l9.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c18l9);
    }

    public static void Q0(C1037220d68 c1037220d68, int i) {
        int visibility = c1037220d68.getVisibility();
        c1037220d68.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1037220d68);
    }

    public static void Q1(C520440Kb4 c520440Kb4, int i) {
        int visibility = c520440Kb4.getVisibility();
        c520440Kb4.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c520440Kb4);
    }

    public static Object Q2(AddWikiActivity addWikiActivity, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (GetSystemServiceLancet.LIZ) {
                synchronized (ClipboardManager.class) {
                    try {
                        systemService = addWikiActivity.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(systemService, new GetSystemServiceLancet.UIThreadHandler((Handler) declaredField.get(systemService)));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C805380Via.LIZJ(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        GetSystemServiceLancet.LIZ = false;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return systemService;
            }
            return addWikiActivity.getSystemService(str);
        }
        if (!GetSystemServiceLancet.LIZIZ && "connectivity".equals(str)) {
            try {
                new AnonymousClass0836().LIZLLL();
                GetSystemServiceLancet.LIZIZ = true;
                return addWikiActivity.getSystemService(str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return addWikiActivity.getSystemService(str);
            }
        }
        return addWikiActivity.getSystemService(str);
    }

    public static void Q4(float f, TextureView textureView) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureView);
        textureView.setAlpha(f);
    }

    public static void Q5(C1473870oSP c1473870oSP, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1473870oSP);
        c1473870oSP.setAlpha(f);
    }

    public static void Q6(C21415018rM c21415018rM, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21415018rM);
        c21415018rM.setLayoutParams(layoutParams);
    }

    public static void Q7(ImageView imageView, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(imageView);
        }
        imageView.setOnClickListener(onClickListener);
    }

    public static void Q8(SmartImageView smartImageView, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(smartImageView);
        }
        smartImageView.setOnClickListener(onClickListener);
    }

    public static void Q9(C425430GmD c425430GmD, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c425430GmD);
        }
        c425430GmD.setOnClickListener(aVar);
    }

    public static void Qa(C1473870oSP c1473870oSP, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1473870oSP);
        }
        c1473870oSP.setOnClickListener(aVar);
    }

    public static void Qb(ImageView imageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
        imageView.setScaleX(f);
    }

    public static void Qc(C1324720kZq c1324720kZq, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324720kZq);
        c1324720kZq.setTranslationX(f);
    }

    public static void R(1MVc r1, int i) {
        int visibility = r1.getVisibility();
        r1.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, r1);
    }

    public static void R0(C0K3W c0k3w, int i) {
        int visibility = c0k3w.getVisibility();
        c0k3w.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0k3w);
    }

    public static void R1(AbstractC420810Gel abstractC420810Gel, int i) {
        int visibility = abstractC420810Gel.getVisibility();
        abstractC420810Gel.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, abstractC420810Gel);
    }

    public static Object R2(s sVar, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (GetSystemServiceLancet.LIZ) {
                synchronized (ClipboardManager.class) {
                    try {
                        systemService = sVar.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(systemService, new GetSystemServiceLancet.UIThreadHandler((Handler) declaredField.get(systemService)));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C805380Via.LIZJ(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        GetSystemServiceLancet.LIZ = false;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return systemService;
            }
            return sVar.getSystemService(str);
        }
        if (!GetSystemServiceLancet.LIZIZ && "connectivity".equals(str)) {
            try {
                new AnonymousClass0836().LIZLLL();
                GetSystemServiceLancet.LIZIZ = true;
                return sVar.getSystemService(str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return sVar.getSystemService(str);
            }
        }
        return sVar.getSystemService(str);
    }

    public static void R4(float f, ViewGroup viewGroup) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewGroup);
        viewGroup.setAlpha(f);
    }

    public static void R5(AbstractC420810Gel abstractC420810Gel, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC420810Gel);
        abstractC420810Gel.setAlpha(f);
    }

    public static void R6(TuxTextView tuxTextView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxTextView);
        tuxTextView.setLayoutParams(layoutParams);
    }

    public static void R7(LinearLayout linearLayout, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(linearLayout);
        }
        linearLayout.setOnClickListener(onClickListener);
    }

    public static void R8(C1581500rG0 c1581500rG0, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1581500rG0);
        }
        c1581500rG0.setOnClickListener(aVar);
    }

    public static void R9(C1748200vas c1748200vas, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1748200vas);
        }
        c1748200vas.setOnClickListener(aVar);
    }

    public static void Ra(C422840Gi2 c422840Gi2, ACListenerS121S0200000_18 aCListenerS121S0200000_18) {
        View.OnClickListener fVar = aCListenerS121S0200000_18;
        View.OnClickListener aVar = aCListenerS121S0200000_18;
        aVar = aCListenerS121S0200000_18;
        if (C1848410yCV.LIZ) {
            if (aCListenerS121S0200000_18 != null) {
                fVar = new f(aCListenerS121S0200000_18);
                aVar = new mf.a(fVar);
            }
        } else if (aCListenerS121S0200000_18 != null) {
            aVar = new mf.a(fVar);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c422840Gi2);
        }
        c422840Gi2.setOnClickListener(aVar);
    }

    public static void Rb(LinearLayout linearLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(linearLayout);
        linearLayout.setScaleX(f);
    }

    public static void Rc(C16F5 c16f5, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16f5);
        c16f5.setTranslationX(f);
    }

    public static void S(C1086520eNe c1086520eNe, int i) {
        int visibility = c1086520eNe.getVisibility();
        c1086520eNe.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1086520eNe);
    }

    public static void S0(C417410GYh c417410GYh, int i) {
        int visibility = c417410GYh.getVisibility();
        c417410GYh.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c417410GYh);
    }

    public static void S1(C365220ETo c365220ETo, int i) {
        int visibility = c365220ETo.getVisibility();
        c365220ETo.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c365220ETo);
    }

    public static Object S2(ym ymVar, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (GetSystemServiceLancet.LIZ) {
                synchronized (ClipboardManager.class) {
                    try {
                        systemService = ymVar.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(systemService, new GetSystemServiceLancet.UIThreadHandler((Handler) declaredField.get(systemService)));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C805380Via.LIZJ(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        GetSystemServiceLancet.LIZ = false;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return systemService;
            }
            return ymVar.getSystemService(str);
        }
        if (!GetSystemServiceLancet.LIZIZ && "connectivity".equals(str)) {
            try {
                new AnonymousClass0836().LIZLLL();
                GetSystemServiceLancet.LIZIZ = true;
                return ymVar.getSystemService(str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return ymVar.getSystemService(str);
            }
        }
        return ymVar.getSystemService(str);
    }

    public static void S4(float f, TextView textView) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textView);
        textView.setAlpha(f);
    }

    public static void S5(C21390118nL c21390118nL, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21390118nL);
        c21390118nL.setAlpha(f);
    }

    public static void S6(TuxNavBar tuxNavBar, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxNavBar);
        tuxNavBar.setLayoutParams(layoutParams);
    }

    public static void S7(RelativeLayout relativeLayout, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(relativeLayout);
        }
        relativeLayout.setOnClickListener(onClickListener);
    }

    public static void S8(C338760DPu c338760DPu, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c338760DPu);
        }
        c338760DPu.setOnClickListener(aVar);
    }

    public static void S9(C1610670s13 c1610670s13, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1610670s13);
        }
        c1610670s13.setOnClickListener(onClickListener);
    }

    public static void Sa(C1645710svZ c1645710svZ, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1645710svZ);
        }
        c1645710svZ.setOnClickListener(aVar);
    }

    public static void Sb(RelativeLayout relativeLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(relativeLayout);
        relativeLayout.setScaleX(f);
    }

    public static void Sc(C427870Gq9 c427870Gq9, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c427870Gq9);
        c427870Gq9.setTranslationX(f);
    }

    public static void T(C10LZ c10lz, int i) {
        int visibility = c10lz.getVisibility();
        c10lz.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c10lz);
    }

    public static void T0(C436650HAh c436650HAh, int i) {
        int visibility = c436650HAh.getVisibility();
        c436650HAh.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c436650HAh);
    }

    public static void T1(C1209550ha5 c1209550ha5, int i) {
        int visibility = c1209550ha5.getVisibility();
        c1209550ha5.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1209550ha5);
    }

    public static void T4(View view, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setAlpha(f);
    }

    public static void T5(C385340F8y c385340F8y, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c385340F8y);
        c385340F8y.setAlpha(f);
    }

    public static void T6(C20627315nb c20627315nb, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20627315nb);
        c20627315nb.setLayoutParams(layoutParams);
    }

    public static void T7(TextView textView, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(textView);
        }
        textView.setOnClickListener(onClickListener);
    }

    public static void T8(C427660Gpo c427660Gpo, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c427660Gpo);
        }
        c427660Gpo.setOnClickListener(onClickListener);
    }

    public static void T9(C21629019km c21629019km, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c21629019km);
        }
        c21629019km.setOnClickListener(aVar);
    }

    public static void Ta(C19518211Xw c19518211Xw, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c19518211Xw);
        }
        c19518211Xw.setOnClickListener(onClickListener);
    }

    public static void Tb(AppCompatImageView appCompatImageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(appCompatImageView);
        appCompatImageView.setScaleX(f);
    }

    public static void Tc(SmartImageView smartImageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(smartImageView);
        smartImageView.setTranslationX(f);
    }

    public static void U(C419320GcM c419320GcM, int i) {
        int visibility = c419320GcM.getVisibility();
        c419320GcM.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c419320GcM);
    }

    public static void U0(C1842270y2b c1842270y2b, int i) {
        int visibility = c1842270y2b.getVisibility();
        c1842270y2b.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1842270y2b);
    }

    public static void U1(1MAN r1, int i) {
        int visibility = r1.getVisibility();
        r1.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, r1);
    }

    public static void U4(FrameLayout frameLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(frameLayout);
        frameLayout.setAlpha(f);
    }

    public static void U5(SurfaceView surfaceView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(surfaceView);
        surfaceView.setLayoutParams(layoutParams);
    }

    public static void U6(C1749280vcc c1749280vcc, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1749280vcc);
        c1749280vcc.setLayoutParams(layoutParams);
    }

    public static void U7(C21412118qt c21412118qt, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c21412118qt);
        }
        c21412118qt.setOnClickListener(onClickListener);
    }

    public static void U8(C197039127h c197039127h, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c197039127h);
        }
        c197039127h.setOnClickListener(onClickListener);
    }

    public static void U9(C2252261DDk c2252261DDk, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c2252261DDk);
        }
        c2252261DDk.setOnClickListener(aVar);
    }

    public static void Ua(C418740GbQ c418740GbQ, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c418740GbQ);
        }
        c418740GbQ.setOnClickListener(aVar);
    }

    public static void Ub(ConstraintLayout constraintLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(constraintLayout);
        constraintLayout.setScaleX(f);
    }

    public static void Uc(TuxIconView tuxIconView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxIconView);
        tuxIconView.setTranslationX(f);
    }

    public static void Ud(LayoutInflater layoutInflater, LayoutInflater.Factory factory) {
        try {
            if (NxRewordManager.LJIILIIL && !(layoutInflater instanceof C0J4J)) {
                LayoutInflater.Factory factory2 = layoutInflater.getFactory();
                Field field = C0J43.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("layoutInflate setFactory : ");
                sbLIZ.append(factory);
                sbLIZ.append("----nxFactory: ");
                sbLIZ.append(factory2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("nxreword debug log ");
                sbLIZ2.append(layoutInflater);
                sbLIZ.append(Log.getStackTraceString(new Throwable(C2188811AlT.LIZIZ(sbLIZ2))));
                C2188811AlT.LIZIZ(sbLIZ);
                if (factory2 instanceof C0J4G) {
                    ((C0J4G) factory2).LIZ(factory);
                    return;
                }
                factory = new C0J4G(factory, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            PrintStream printStream = System.err;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            Field field2 = C0J43.LIZ;
            sbLIZ3.append("NxReword/inflateLancet");
            sbLIZ3.append("layoutInflateLancet setFactory: ");
            sbLIZ3.append(e.toString());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ3));
        }
        layoutInflater.setFactory(factory);
    }

    public static void V(C0SUT c0sut, int i) {
        int visibility = c0sut.getVisibility();
        c0sut.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0sut);
    }

    public static void V0(C1855350yNh c1855350yNh, int i) {
        int visibility = c1855350yNh.getVisibility();
        c1855350yNh.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1855350yNh);
    }

    public static void V1(C679690QlL c679690QlL, int i) {
        int visibility = c679690QlL.getVisibility();
        c679690QlL.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c679690QlL);
    }

    public static void V4(ImageView imageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
        imageView.setAlpha(f);
    }

    public static void V5(TextureView textureView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureView);
        textureView.setLayoutParams(layoutParams);
    }

    public static void V6(C1390410mHn c1390410mHn, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1390410mHn);
        c1390410mHn.setLayoutParams(layoutParams);
    }

    public static void V7(AppCompatImageView appCompatImageView, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(appCompatImageView);
        }
        appCompatImageView.setOnClickListener(onClickListener);
    }

    public static void V8(C1582570rHj c1582570rHj, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1582570rHj);
        }
        c1582570rHj.setOnClickListener(onClickListener);
    }

    public static void V9(C455230HtB c455230HtB, ACListenerS41S0201000_6 aCListenerS41S0201000_6) {
        View.OnClickListener fVar = aCListenerS41S0201000_6;
        View.OnClickListener aVar = aCListenerS41S0201000_6;
        aVar = aCListenerS41S0201000_6;
        if (C1848410yCV.LIZ) {
            if (aCListenerS41S0201000_6 != null) {
                fVar = new f(aCListenerS41S0201000_6);
                aVar = new mf.a(fVar);
            }
        } else if (aCListenerS41S0201000_6 != null) {
            aVar = new mf.a(fVar);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c455230HtB);
        }
        c455230HtB.setOnClickListener(aVar);
    }

    public static void Va(C418950Gbl c418950Gbl, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c418950Gbl);
        }
        c418950Gbl.setOnClickListener(onClickListener);
    }

    public static void Vb(C21405218pm c21405218pm, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21405218pm);
        c21405218pm.setScaleX(f);
    }

    public static void Vc(TuxTextView tuxTextView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxTextView);
        tuxTextView.setTranslationX(f);
    }

    public static void Vd(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        try {
            if (NxRewordManager.LJIILIIL) {
                LayoutInflater.Factory2 factory22 = layoutInflater.getFactory2();
                if (!(layoutInflater instanceof C0J4J)) {
                    Field field = C0J43.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("layoutInflateLancet setFactory2 : ");
                    sbLIZ.append(factory2);
                    sbLIZ.append("----nxFactory: ");
                    sbLIZ.append(factory22);
                    sbLIZ.append(" inflate : ");
                    sbLIZ.append(layoutInflater);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (factory22 instanceof C0J4G) {
                        ((C0J4G) factory22).LIZIZ(factory2);
                        return;
                    }
                    factory2 = new C0J4G(null, factory2);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            PrintStream printStream = System.err;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            Field field2 = C0J43.LIZ;
            sbLIZ2.append("NxReword/inflateLancet");
            sbLIZ2.append("layoutInflateLancet setFactory2: ");
            sbLIZ2.append(e.toString());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
        }
        layoutInflater.setFactory2(factory2);
    }

    public static void W(C708910RrN c708910RrN, int i) {
        int visibility = c708910RrN.getVisibility();
        c708910RrN.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c708910RrN);
    }

    public static void W0(C1854760yMk c1854760yMk, int i) {
        int visibility = c1854760yMk.getVisibility();
        c1854760yMk.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1854760yMk);
    }

    public static void W1(C0F4A c0f4a, int i) {
        int visibility = c0f4a.getVisibility();
        c0f4a.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0f4a);
    }

    public static void W4(LinearLayout linearLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(linearLayout);
        linearLayout.setAlpha(f);
    }

    public static void W5(View view, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setLayoutParams(layoutParams);
    }

    public static void W6(C1390130mHL c1390130mHL, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1390130mHL);
        c1390130mHL.setLayoutParams(layoutParams);
    }

    public static void W7(LinearLayoutCompat linearLayoutCompat, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(linearLayoutCompat);
        }
        linearLayoutCompat.setOnClickListener(aVar);
    }

    public static void W8(C1749190vcT c1749190vcT, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1749190vcT);
        }
        c1749190vcT.setOnClickListener(aVar);
    }

    public static void W9(C456220Hum c456220Hum, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c456220Hum);
        }
        c456220Hum.setOnClickListener(aVar);
    }

    public static void Wa(C1261130ivH c1261130ivH, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1261130ivH);
        }
        c1261130ivH.setOnClickListener(aVar);
    }

    public static void Wb(C1295960jpS c1295960jpS, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1295960jpS);
        c1295960jpS.setScaleX(f);
    }

    public static void Wc(C424620Gku c424620Gku, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424620Gku);
        c424620Gku.setTranslationX(f);
    }

    public static void Wd(C0J45 c0j45, C1091720eW2 c1091720eW2) {
        LayoutInflater.Factory2 c0j4g;
        try {
            c0j4g = c1091720eW2;
            if (NxRewordManager.LJIILIIL) {
                LayoutInflater.Factory2 factory2 = c0j45.getFactory2();
                c0j4g = c1091720eW2;
                if (!(c0j45 instanceof C0J4J)) {
                    Field field = C0J43.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("layoutInflateLancet setFactory2 : ");
                    sbLIZ.append(c1091720eW2);
                    sbLIZ.append("----nxFactory: ");
                    sbLIZ.append(factory2);
                    sbLIZ.append(" inflate : ");
                    sbLIZ.append(c0j45);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (factory2 instanceof C0J4G) {
                        ((C0J4G) factory2).LIZIZ(c1091720eW2);
                        return;
                    }
                    c0j4g = new C0J4G(null, c1091720eW2);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            PrintStream printStream = System.err;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            Field field2 = C0J43.LIZ;
            sbLIZ2.append("NxReword/inflateLancet");
            sbLIZ2.append("layoutInflateLancet setFactory2: ");
            sbLIZ2.append(e.toString());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
            c0j4g = c1091720eW2;
        }
        c0j45.setFactory2(c0j4g);
    }

    public static void X(C367310Eaf c367310Eaf, int i) {
        int visibility = c367310Eaf.getVisibility();
        c367310Eaf.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c367310Eaf);
    }

    public static void X0(C1855790yOP c1855790yOP, int i) {
        int visibility = c1855790yOP.getVisibility();
        c1855790yOP.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1855790yOP);
    }

    public static void X1(AbstractC1643790ssT abstractC1643790ssT, int i) {
        int visibility = abstractC1643790ssT.getVisibility();
        abstractC1643790ssT.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, abstractC1643790ssT);
    }

    public static void X4(ProgressBar progressBar, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(progressBar);
        progressBar.setAlpha(f);
    }

    public static void X5(ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewGroup);
        viewGroup.setLayoutParams(layoutParams);
    }

    public static void X6(TuxSpinner tuxSpinner, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxSpinner);
        tuxSpinner.setLayoutParams(layoutParams);
    }

    public static void X7(CardView cardView, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(cardView);
        }
        cardView.setOnClickListener(aVar);
    }

    public static void X8(C1749140vcO c1749140vcO, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1749140vcO);
        }
        c1749140vcO.setOnClickListener(onClickListener);
    }

    public static void X9(C1835410xrX c1835410xrX, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1835410xrX);
        }
        c1835410xrX.setOnClickListener(aVar);
    }

    public static void Xa(C0ULZ c0ulz, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0ulz);
        }
        c0ulz.setOnClickListener(aVar);
    }

    public static void Xb(C1126540fQC c1126540fQC, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126540fQC);
        c1126540fQC.setScaleX(f);
    }

    public static void Xc(C376330EpD c376330EpD, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c376330EpD);
        c376330EpD.setTranslationX(f);
    }

    public static String Xd(TypedArray typedArray, int i) {
        CharSequence text = NxStringLancet.getText(typedArray, i);
        if (text != null) {
            return text.toString();
        }
        return typedArray.getString(i);
    }

    public static void Y(C1610770s1D c1610770s1D, int i) {
        int visibility = c1610770s1D.getVisibility();
        c1610770s1D.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1610770s1D);
    }

    public static void Y0(ChoreographerFrameCallbackC1855380yNk choreographerFrameCallbackC1855380yNk, int i) {
        int visibility = choreographerFrameCallbackC1855380yNk.getVisibility();
        choreographerFrameCallbackC1855380yNk.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, choreographerFrameCallbackC1855380yNk);
    }

    public static void Y1(AbstractC1106180etM abstractC1106180etM, int i) {
        int visibility = abstractC1106180etM.getVisibility();
        abstractC1106180etM.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, abstractC1106180etM);
    }

    public static void Y4(RelativeLayout relativeLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(relativeLayout);
        relativeLayout.setAlpha(f);
    }

    public static void Y5(ViewStub viewStub, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewStub);
        viewStub.setLayoutParams(layoutParams);
    }

    public static void Y6(C127K c127k, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c127k);
        c127k.setLayoutParams(layoutParams);
    }

    public static void Y7(ConstraintLayout constraintLayout, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(constraintLayout);
        }
        constraintLayout.setOnClickListener(onClickListener);
    }

    public static void Y8(C1748470vbJ c1748470vbJ, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1748470vbJ);
        }
        c1748470vbJ.setOnClickListener(aVar);
    }

    public static void Y9(C1610770s1D c1610770s1D, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1610770s1D);
        }
        c1610770s1D.setOnClickListener(aVar);
    }

    public static void Ya(C1123170fKl c1123170fKl, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1123170fKl);
        }
        c1123170fKl.setOnClickListener(aVar);
    }

    public static void Yb(C1324720kZq c1324720kZq, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324720kZq);
        c1324720kZq.setScaleX(f);
    }

    public static void Yc(C376310EpB c376310EpB, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c376310EpB);
        c376310EpB.setTranslationX(f);
    }

    public static CharSequence Yd(TypedArray typedArray, int i) {
        CharSequence text = NxStringLancet.getText(typedArray, i);
        if (text != null) {
            return text;
        }
        return typedArray.getText(i);
    }

    public static void Z(C19749612Ow c19749612Ow, int i) {
        int visibility = c19749612Ow.getVisibility();
        c19749612Ow.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19749612Ow);
    }

    public static void Z0(C1323170kXL c1323170kXL, int i) {
        int visibility = c1323170kXL.getVisibility();
        c1323170kXL.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1323170kXL);
    }

    public static void Z1(C1819090xRD c1819090xRD, int i) {
        int visibility = c1819090xRD.getVisibility();
        c1819090xRD.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1819090xRD);
    }

    public static int Z3(AudioManager audioManager, int i) {
        int i2;
        if (i != 3) {
            return audioManager.getStreamMaxVolume(i);
        }
        if (C786420Ut6.LJIIIZ && (i2 = C786420Ut6.LJIIL) >= 0) {
            return i2;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(i);
        C786420Ut6.LJIIL = streamMaxVolume;
        return streamMaxVolume;
    }

    public static void Z4(C19VE c19ve, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19ve);
        c19ve.setAlpha(f);
    }

    public static void Z5(EditText editText, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(editText);
        editText.setLayoutParams(layoutParams);
    }

    public static void Z6(C1CRB c1crb, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1crb);
        c1crb.setLayoutParams(layoutParams);
    }

    public static void Z7(C16G0 c16g0, ViewOnClickListenerC1066290dr1 viewOnClickListenerC1066290dr1) {
        View.OnClickListener fVar = viewOnClickListenerC1066290dr1;
        View.OnClickListener aVar = viewOnClickListenerC1066290dr1;
        aVar = viewOnClickListenerC1066290dr1;
        if (C1848410yCV.LIZ) {
            if (viewOnClickListenerC1066290dr1 != null) {
                fVar = new f(viewOnClickListenerC1066290dr1);
                aVar = new mf.a(fVar);
            }
        } else if (viewOnClickListenerC1066290dr1 != null) {
            aVar = new mf.a(fVar);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c16g0);
        }
        c16g0.setOnClickListener(aVar);
    }

    public static void Z8(C421100GfE c421100GfE, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c421100GfE);
        }
        c421100GfE.setOnClickListener(aVar);
    }

    public static void Z9(C0SUL c0sul, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0sul);
        }
        c0sul.setOnClickListener(aVar);
    }

    public static void Za(C1123160fKk c1123160fKk, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1123160fKk);
        }
        c1123160fKk.setOnClickListener(aVar);
    }

    public static void Zb(LiveIconView liveIconView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveIconView);
        liveIconView.setScaleX(f);
    }

    public static void Zc(C368220Ec8 c368220Ec8, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c368220Ec8);
        c368220Ec8.setTranslationX(f);
    }

    public static void a(C21545019Tk c21545019Tk, int i) {
        int visibility = c21545019Tk.getVisibility();
        c21545019Tk.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c21545019Tk);
    }

    public static void a0(C12P2 c12p2, int i) {
        int visibility = c12p2.getVisibility();
        c12p2.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c12p2);
    }

    public static void a1(C418330Gal c418330Gal, int i) {
        int visibility = c418330Gal.getVisibility();
        c418330Gal.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c418330Gal);
    }

    public static void a2(C20665915tp c20665915tp, int i) {
        int visibility = c20665915tp.getVisibility();
        c20665915tp.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c20665915tp);
    }

    public static void a5(AppCompatImageView appCompatImageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(appCompatImageView);
        appCompatImageView.setAlpha(f);
    }

    public static void a6(FrameLayout frameLayout, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(frameLayout);
        frameLayout.setLayoutParams(layoutParams);
    }

    public static void a7(C426160GnO c426160GnO, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426160GnO);
        c426160GnO.setLayoutParams(layoutParams);
    }

    public static void a8(C753470Th3 c753470Th3, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c753470Th3);
        }
        c753470Th3.setOnClickListener(onClickListener);
    }

    public static void a9(TuxIconView tuxIconView, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(tuxIconView);
        }
        tuxIconView.setOnClickListener(onClickListener);
    }

    public static void ab(C1642680sqg c1642680sqg, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1642680sqg);
        }
        c1642680sqg.setOnClickListener(aVar);
    }

    public static void ac(C16F5 c16f5, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16f5);
        c16f5.setScaleX(f);
    }

    public static void ad(1MAN r0, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r0);
        r0.setTranslationX(f);
    }

    public static void b(TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd, int i) {
        int visibility = textureViewSurfaceTextureListenerC1288630jdd.getVisibility();
        textureViewSurfaceTextureListenerC1288630jdd.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, textureViewSurfaceTextureListenerC1288630jdd);
    }

    public static void b0(C426140GnM c426140GnM, int i) {
        int visibility = c426140GnM.getVisibility();
        c426140GnM.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c426140GnM);
    }

    public static void b1(C0F7E c0f7e, int i) {
        int visibility = c0f7e.getVisibility();
        c0f7e.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0f7e);
    }

    public static void b2(C1663510tOH c1663510tOH, int i) {
        int visibility = c1663510tOH.getVisibility();
        c1663510tOH.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1663510tOH);
    }

    public static int b4(GoogleApiAvailability googleApiAvailability, Context context) {
        if (C786420Ut6.LJIIIZ && C786420Ut6.LJI >= 0) {
            return C786420Ut6.LJI;
        }
        C786420Ut6.LJI = googleApiAvailability.isGooglePlayServicesAvailable(context);
        return C786420Ut6.LJI;
    }

    public static void b5(CardView cardView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(cardView);
        cardView.setAlpha(f);
    }

    public static void b6(HorizontalScrollView horizontalScrollView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(horizontalScrollView);
        horizontalScrollView.setLayoutParams(layoutParams);
    }

    public static void b7(RadiusLayout radiusLayout, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(radiusLayout);
        radiusLayout.setLayoutParams(layoutParams);
    }

    public static void b8(C1342000l1i c1342000l1i, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1342000l1i);
        }
        c1342000l1i.setOnClickListener(onClickListener);
    }

    public static void b9(C0HZQ c0hzq, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0hzq);
        }
        c0hzq.setOnClickListener(onClickListener);
    }

    public static void ba(C1582510rHd c1582510rHd, ACListenerS126S0200000_24 aCListenerS126S0200000_24) {
        View.OnClickListener fVar = aCListenerS126S0200000_24;
        View.OnClickListener aVar = aCListenerS126S0200000_24;
        aVar = aCListenerS126S0200000_24;
        if (C1848410yCV.LIZ) {
            if (aCListenerS126S0200000_24 != null) {
                fVar = new f(aCListenerS126S0200000_24);
                aVar = new mf.a(fVar);
            }
        } else if (aCListenerS126S0200000_24 != null) {
            aVar = new mf.a(fVar);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1582510rHd);
        }
        c1582510rHd.setOnClickListener(aVar);
    }

    public static void bb(C10LG c10lg, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c10lg);
        }
        c10lg.setOnClickListener(aVar);
    }

    public static void bc(C16FV c16fv, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fv);
        c16fv.setScaleX(f);
    }

    public static void bd(float f, ViewGroup viewGroup) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewGroup);
        viewGroup.setTranslationY(f);
    }

    public static void c(C1237240iIk c1237240iIk, int i) {
        int visibility = c1237240iIk.getVisibility();
        c1237240iIk.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1237240iIk);
    }

    public static void c0(C21696019va c21696019va, int i) {
        int visibility = c21696019va.getVisibility();
        c21696019va.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c21696019va);
    }

    public static void c1(C14J2 c14j2, int i) {
        int visibility = c14j2.getVisibility();
        c14j2.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c14j2);
    }

    public static void c2(C385340F8y c385340F8y, int i) {
        int visibility = c385340F8y.getVisibility();
        c385340F8y.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c385340F8y);
    }

    public static void c5(ConstraintLayout constraintLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(constraintLayout);
        constraintLayout.setAlpha(f);
    }

    public static void c6(ImageView imageView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
        imageView.setLayoutParams(layoutParams);
    }

    public static void c7(C1322110kVd c1322110kVd, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1322110kVd);
        c1322110kVd.setLayoutParams(layoutParams);
    }

    public static void c8(C1295960jpS c1295960jpS, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1295960jpS);
        }
        c1295960jpS.setOnClickListener(aVar);
    }

    public static void c9(C19M4 c19m4, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c19m4);
        }
        c19m4.setOnClickListener(onClickListener);
    }

    public static void ca(C1394730mOl c1394730mOl, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1394730mOl);
        }
        c1394730mOl.setOnClickListener(aVar);
    }

    public static void cb(1J47 r2, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(r2);
        }
        r2.setOnClickListener(aVar);
    }

    public static void cc(C986580bmS c986580bmS, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c986580bmS);
        c986580bmS.setScaleX(f);
    }

    public static void cd(float f, TextView textView) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textView);
        textView.setTranslationY(f);
    }

    public static void d(C0T8H c0t8h, int i) {
        int visibility = c0t8h.getVisibility();
        c0t8h.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0t8h);
    }

    public static void d0(C19727912Gn c19727912Gn, int i) {
        int visibility = c19727912Gn.getVisibility();
        c19727912Gn.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19727912Gn);
    }

    public static void d1(C424200GkE c424200GkE, int i) {
        int visibility = c424200GkE.getVisibility();
        c424200GkE.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c424200GkE);
    }

    public static void d2(C1249940idE c1249940idE, int i) {
        int visibility = c1249940idE.getVisibility();
        c1249940idE.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1249940idE);
    }

    public static void d5(RecyclerView recyclerView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(recyclerView);
        recyclerView.setAlpha(f);
    }

    public static void d6(LinearLayout linearLayout, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(linearLayout);
        linearLayout.setLayoutParams(layoutParams);
    }

    public static void d7(C21532619Oq c21532619Oq, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21532619Oq);
        c21532619Oq.setLayoutParams(layoutParams);
    }

    public static void d8(C1126540fQC c1126540fQC, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1126540fQC);
        }
        c1126540fQC.setOnClickListener(onClickListener);
    }

    public static void d9(C0I7D c0i7d, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0i7d);
        }
        c0i7d.setOnClickListener(onClickListener);
    }

    public static void da(C11FU c11fu, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c11fu);
        }
        c11fu.setOnClickListener(onClickListener);
    }

    public static void db(C418600GbC c418600GbC, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c418600GbC);
        }
        c418600GbC.setOnClickListener(aVar);
    }

    public static void dc(C1143100fqu c1143100fqu, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1143100fqu);
        c1143100fqu.setScaleX(f);
    }

    public static void dd(SurfaceView surfaceView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(surfaceView);
        surfaceView.setTranslationY(f);
    }

    public static void e(1MUm r1, int i) {
        int visibility = r1.getVisibility();
        r1.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, r1);
    }

    public static void e0(C0I6K c0i6k, int i) {
        int visibility = c0i6k.getVisibility();
        c0i6k.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0i6k);
    }

    public static void e1(C424190GkD c424190GkD, int i) {
        int visibility = c424190GkD.getVisibility();
        c424190GkD.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c424190GkD);
    }

    public static void e2(C21367118jd c21367118jd, int i) {
        int visibility = c21367118jd.getVisibility();
        c21367118jd.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c21367118jd);
    }

    public static ExecutorService e4(int i, ThreadFactory threadFactory) {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.FIXED);
        c2123408ToLIZ.LIZJ = i;
        c2123408ToLIZ.LJI = threadFactory;
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static void e5(b0 b0Var, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(b0Var);
        b0Var.setAlpha(f);
    }

    public static void e6(RelativeLayout relativeLayout, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(relativeLayout);
        relativeLayout.setLayoutParams(layoutParams);
    }

    public static void e7(AvatarComponentView avatarComponentView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(avatarComponentView);
        avatarComponentView.setLayoutParams(layoutParams);
    }

    public static void e8(C1324720kZq c1324720kZq, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1324720kZq);
        }
        c1324720kZq.setOnClickListener(onClickListener);
    }

    public static void e9(C1841350y17 c1841350y17, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1841350y17);
        }
        c1841350y17.setOnClickListener(onClickListener);
    }

    public static void ea(C0P08 c0p08, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0p08);
        }
        c0p08.setOnClickListener(aVar);
    }

    public static void eb(C03ZF c03zf, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c03zf);
        }
        c03zf.setOnClickListener(aVar);
    }

    public static void ed(View view, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setTranslationY(f);
    }

    public static void ee(NormalSplashAdActivity normalSplashAdActivity, int i) {
        try {
            if (C1389600mGU.LIZIZ(normalSplashAdActivity) && i != 0) {
                i = 0;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        normalSplashAdActivity.overridePendingTransition(0, i);
    }

    public static void f(1MUz r1, int i) {
        int visibility = r1.getVisibility();
        r1.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, r1);
    }

    public static void f0(C1671006gW c1671006gW, int i) {
        int visibility = c1671006gW.getVisibility();
        c1671006gW.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1671006gW);
    }

    public static void f1(C425240Glu c425240Glu, int i) {
        int visibility = c425240Glu.getVisibility();
        c425240Glu.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c425240Glu);
    }

    public static void f2(C1833080xnm c1833080xnm, int i) {
        int visibility = c1833080xnm.getVisibility();
        c1833080xnm.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1833080xnm);
    }

    public static void f3(MessageQueue.IdleHandler idleHandler, MessageQueue messageQueue) {
        C0CNB.LIZIZ();
        if (C0CNB.LIZJ && !C0CNB.LIZIZ) {
            if (C0CN5.LJII()) {
                C0CNB.LIZIZ = true;
                messageQueue.addIdleHandler(idleHandler);
                return;
            }
            List<C0CNC> list = C0CNB.LIZ;
            synchronized (list) {
                try {
                    ((ArrayList) list).add(new C0CNC(idleHandler, messageQueue));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        messageQueue.addIdleHandler(idleHandler);
    }

    public static void f5(C1295960jpS c1295960jpS, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1295960jpS);
        c1295960jpS.setAlpha(f);
    }

    public static void f6(Space space, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(space);
        space.setLayoutParams(layoutParams);
    }

    public static void f7(RemoteImageView remoteImageView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(remoteImageView);
        remoteImageView.setLayoutParams(layoutParams);
    }

    public static void f8(C20745116Ft c20745116Ft, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c20745116Ft);
        }
        c20745116Ft.setOnClickListener(onClickListener);
    }

    public static void f9(C21411818qq c21411818qq, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c21411818qq);
        }
        c21411818qq.setOnClickListener(onClickListener);
    }

    public static void fa(C1907430zjh c1907430zjh, ACListenerS89S1100000_28 aCListenerS89S1100000_28) {
        View.OnClickListener fVar = aCListenerS89S1100000_28;
        View.OnClickListener aVar = aCListenerS89S1100000_28;
        aVar = aCListenerS89S1100000_28;
        if (C1848410yCV.LIZ) {
            if (aCListenerS89S1100000_28 != null) {
                fVar = new f(aCListenerS89S1100000_28);
                aVar = new mf.a(fVar);
            }
        } else if (aCListenerS89S1100000_28 != null) {
            aVar = new mf.a(fVar);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1907430zjh);
        }
        c1907430zjh.setOnClickListener(aVar);
    }

    public static void fb(C03GO c03go, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c03go);
        }
        c03go.setOnClickListener(aVar);
    }

    public static void fc(SmartImageView smartImageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(smartImageView);
        smartImageView.setScaleX(f);
    }

    public static void fd(FrameLayout frameLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(frameLayout);
        frameLayout.setTranslationY(f);
    }

    public static void g(AvatarComponentView avatarComponentView, int i) {
        int visibility = avatarComponentView.getVisibility();
        avatarComponentView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, avatarComponentView);
    }

    public static void g0(C417460GYm c417460GYm, int i) {
        int visibility = c417460GYm.getVisibility();
        c417460GYm.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c417460GYm);
    }

    public static void g1(C19471411Fw c19471411Fw, int i) {
        int visibility = c19471411Fw.getVisibility();
        c19471411Fw.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19471411Fw);
    }

    public static void g2(C1771930wD9 c1771930wD9, int i) {
        int visibility = c1771930wD9.getVisibility();
        c1771930wD9.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1771930wD9);
    }

    public static Bundle g3(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (bundleExtra != null && context != null) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        if (Build.VERSION.SDK_INT == 29 && bundleExtra != null && bundleExtra.getClassLoader() != C786520UtG.class.getClassLoader() && ((Boolean) C0ADG.LIZ.getValue()).booleanValue()) {
            bundleExtra.setClassLoader(C786520UtG.class.getClassLoader());
        }
        return bundleExtra;
    }

    public static ScheduledExecutorService g4(int i, ThreadFactory threadFactory) {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SCHEDULED);
        c2123408ToLIZ.LIZJ = i;
        c2123408ToLIZ.LJI = threadFactory;
        return (ScheduledExecutorService) C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static void g5(C1126540fQC c1126540fQC, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126540fQC);
        c1126540fQC.setAlpha(f);
    }

    public static void g6(TextView textView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textView);
        textView.setLayoutParams(layoutParams);
    }

    public static void g7(C1353360lK2 c1353360lK2, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1353360lK2);
        c1353360lK2.setLayoutParams(layoutParams);
    }

    public static void g8(LiveIconView liveIconView, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(liveIconView);
        }
        liveIconView.setOnClickListener(onClickListener);
    }

    public static void g9(C21415018rM c21415018rM, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c21415018rM);
        }
        c21415018rM.setOnClickListener(aVar);
    }

    public static void ga(C1907300zjU c1907300zjU, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1907300zjU);
        }
        c1907300zjU.setOnClickListener(onClickListener);
    }

    public static void gb(C1249940idE c1249940idE, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1249940idE);
        }
        c1249940idE.setOnClickListener(aVar);
    }

    public static void gc(C1302030jzF c1302030jzF, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1302030jzF);
        c1302030jzF.setScaleX(f);
    }

    public static void gd(ImageView imageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
        imageView.setTranslationY(f);
    }

    public static void h(C419460Gca c419460Gca, int i) {
        int visibility = c419460Gca.getVisibility();
        c419460Gca.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c419460Gca);
    }

    public static void h0(C20577615fa c20577615fa, int i) {
        int visibility = c20577615fa.getVisibility();
        c20577615fa.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c20577615fa);
    }

    public static void h1(C03BJ c03bj, int i) {
        int visibility = c03bj.getVisibility();
        c03bj.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c03bj);
    }

    public static void h2(C0GY5 c0gy5, int i) {
        int visibility = c0gy5.getVisibility();
        c0gy5.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0gy5);
    }

    public static void h5(C1324720kZq c1324720kZq, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324720kZq);
        c1324720kZq.setAlpha(f);
    }

    public static void h6(AppCompatImageView appCompatImageView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(appCompatImageView);
        appCompatImageView.setLayoutParams(layoutParams);
    }

    public static void h7(C1353500lKG c1353500lKG, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1353500lKG);
        c1353500lKG.setLayoutParams(layoutParams);
    }

    public static void h8(C16FS c16fs, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c16fs);
        }
        c16fs.setOnClickListener(onClickListener);
    }

    public static void h9(TuxTextView tuxTextView, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(tuxTextView);
        }
        tuxTextView.setOnClickListener(onClickListener);
    }

    public static void ha(C1907570zjv c1907570zjv, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1907570zjv);
        }
        c1907570zjv.setOnClickListener(aVar);
    }

    public static void hc(TuxIconView tuxIconView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxIconView);
        tuxIconView.setScaleX(f);
    }

    public static void hd(LinearLayout linearLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(linearLayout);
        linearLayout.setTranslationY(f);
    }

    public static void i(C1303280k1G c1303280k1G, int i) {
        int visibility = c1303280k1G.getVisibility();
        c1303280k1G.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1303280k1G);
    }

    public static void i0(C477070InJ c477070InJ, int i) {
        int visibility = c477070InJ.getVisibility();
        c477070InJ.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c477070InJ);
    }

    public static void i1(C1842280y2c c1842280y2c, int i) {
        int visibility = c1842280y2c.getVisibility();
        c1842280y2c.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1842280y2c);
    }

    public static void i2(C1899490zWt c1899490zWt, int i) {
        int visibility = c1899490zWt.getVisibility();
        c1899490zWt.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1899490zWt);
    }

    public static void i5(LiveIconView liveIconView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveIconView);
        liveIconView.setAlpha(f);
    }

    public static void i6(LinearLayoutCompat linearLayoutCompat, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(linearLayoutCompat);
        linearLayoutCompat.setLayoutParams(layoutParams);
    }

    public static void i7(C708910RrN c708910RrN, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c708910RrN);
        c708910RrN.setLayoutParams(layoutParams);
    }

    public static void i8(C20744116Fj c20744116Fj, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c20744116Fj);
        }
        c20744116Fj.setOnClickListener(aVar);
    }

    public static void i9(TuxNavBar tuxNavBar, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(tuxNavBar);
        }
        tuxNavBar.setOnClickListener(aVar);
    }

    public static void ib(C427370GpL c427370GpL, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c427370GpL);
        }
        c427370GpL.setOnClickListener(onClickListener);
    }

    public static void ic(TuxTextView tuxTextView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxTextView);
        tuxTextView.setScaleX(f);
    }

    public static void id(RelativeLayout relativeLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(relativeLayout);
        relativeLayout.setTranslationY(f);
    }

    public static void j(C422820Gi0 c422820Gi0, int i) {
        int visibility = c422820Gi0.getVisibility();
        c422820Gi0.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c422820Gi0);
    }

    public static void j0(C1907300zjU c1907300zjU, int i) {
        int visibility = c1907300zjU.getVisibility();
        c1907300zjU.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1907300zjU);
    }

    public static void j1(C03EY c03ey, int i) {
        int visibility = c03ey.getVisibility();
        c03ey.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c03ey);
    }

    public static void j2(C1898700zVc c1898700zVc, int i) {
        int visibility = c1898700zVc.getVisibility();
        c1898700zVc.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1898700zVc);
    }

    public static String j4(String str, Object[] objArr) {
        if (str != null && str.contains("%d")) {
            try {
                if (C630700OoW.LIZ()) {
                    return String.format(Locale.ENGLISH, str, objArr);
                }
                return String.format(Locale.getDefault(), str, objArr);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return str;
            }
        }
        return String.format(str, objArr);
    }

    public static void j5(C16FS c16fs, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fs);
        c16fs.setAlpha(f);
    }

    public static void j6(CardView cardView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(cardView);
        cardView.setLayoutParams(layoutParams);
    }

    public static void j7(C21568919b5 c21568919b5, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21568919b5);
        c21568919b5.setLayoutParams(layoutParams);
    }

    public static void j8(LiveEditText liveEditText, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(liveEditText);
        }
        liveEditText.setOnClickListener(aVar);
    }

    public static void j9(C1066370dr9 c1066370dr9, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1066370dr9);
        }
        c1066370dr9.setOnClickListener(aVar);
    }

    public static void ja(C1202300hOO c1202300hOO, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1202300hOO);
        }
        c1202300hOO.setOnClickListener(aVar);
    }

    public static void jb(C21415118rN c21415118rN, ACListenerS149S0100000_14 aCListenerS149S0100000_14) {
        View.OnClickListener fVar = aCListenerS149S0100000_14;
        View.OnClickListener aVar = aCListenerS149S0100000_14;
        aVar = aCListenerS149S0100000_14;
        if (C1848410yCV.LIZ) {
            if (aCListenerS149S0100000_14 != null) {
                fVar = new f(aCListenerS149S0100000_14);
                aVar = new mf.a(fVar);
            }
        } else if (aCListenerS149S0100000_14 != null) {
            aVar = new mf.a(fVar);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c21415118rN);
        }
        c21415118rN.setOnClickListener(aVar);
    }

    public static void jc(C1322110kVd c1322110kVd, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1322110kVd);
        c1322110kVd.setScaleX(f);
    }

    public static void jd(ConstraintLayout constraintLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(constraintLayout);
        constraintLayout.setTranslationY(f);
    }

    public static void k(C424620Gku c424620Gku, int i) {
        int visibility = c424620Gku.getVisibility();
        c424620Gku.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c424620Gku);
    }

    public static void k0(C0DWH c0dwh, int i) {
        int visibility = c0dwh.getVisibility();
        c0dwh.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0dwh);
    }

    public static void k1(C716660S9g c716660S9g, int i) {
        int visibility = c716660S9g.getVisibility();
        c716660S9g.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c716660S9g);
    }

    public static void k2(C388170FJv c388170FJv, int i) {
        int visibility = c388170FJv.getVisibility();
        c388170FJv.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c388170FJv);
    }

    public static void k5(C16F5 c16f5, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16f5);
        c16f5.setAlpha(f);
    }

    public static void k6(ComposeView composeView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(composeView);
        composeView.setLayoutParams(layoutParams);
    }

    public static void k7(C1202300hOO c1202300hOO, C19ME c19me) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1202300hOO);
        c1202300hOO.setLayoutParams(c19me);
    }

    public static void k8(C20743716Ff c20743716Ff, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c20743716Ff);
        }
        c20743716Ff.setOnClickListener(onClickListener);
    }

    public static void k9(C20627315nb c20627315nb, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c20627315nb);
        }
        c20627315nb.setOnClickListener(aVar);
    }

    public static void ka(C1203280hPy c1203280hPy, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1203280hPy);
        }
        c1203280hPy.setOnClickListener(onClickListener);
    }

    public static void kb(C21373418ke c21373418ke, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c21373418ke);
        }
        c21373418ke.setOnClickListener(aVar);
    }

    public static void kc(RemoteImageView remoteImageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(remoteImageView);
        remoteImageView.setScaleX(f);
    }

    public static void kd(RecyclerView recyclerView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(recyclerView);
        recyclerView.setTranslationY(f);
    }

    public static void l(RemoteImageView remoteImageView, int i) {
        int visibility = remoteImageView.getVisibility();
        remoteImageView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, remoteImageView);
    }

    public static void l0(C1189860h4K c1189860h4K, int i) {
        int visibility = c1189860h4K.getVisibility();
        c1189860h4K.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1189860h4K);
    }

    public static void l1(C1177850gkx c1177850gkx, int i) {
        int visibility = c1177850gkx.getVisibility();
        c1177850gkx.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1177850gkx);
    }

    public static void l2(C418320Gak c418320Gak, int i) {
        int visibility = c418320Gak.getVisibility();
        c418320Gak.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c418320Gak);
    }

    public static ParcelFileDescriptor l4(ContentResolver contentResolver, Uri uri) {
        if (C1841607Je.LIZ == 2 && uri != null) {
            String authority = uri.getAuthority();
            if (!TextUtils.isEmpty(authority) && authority.equalsIgnoreCase("com.google.android.gms.fonts")) {
                if (C786470UtB.LIZ == null) {
                    C786470UtB.LIZ = C09NT.LIZJ(contentResolver, uri);
                }
                return C786470UtB.LIZ;
            }
        }
        return C09NT.LIZJ(contentResolver, uri);
    }

    public static void l5(C16FV c16fv, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fv);
        c16fv.setAlpha(f);
    }

    public static void l6(C19MW c19mw, C19ME c19me) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19mw);
        c19mw.setLayoutParams(c19me);
    }

    public static void l7(C786890Utr c786890Utr, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c786890Utr);
        c786890Utr.setLayoutParams(layoutParams);
    }

    public static void l8(C16F5 c16f5, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c16f5);
        }
        c16f5.setOnClickListener(onClickListener);
    }

    public static void l9(C1749280vcc c1749280vcc, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1749280vcc);
        }
        c1749280vcc.setOnClickListener(onClickListener);
    }

    public static void la(C03EB c03eb, ACListenerS153S0100000_18 aCListenerS153S0100000_18) {
        View.OnClickListener fVar = aCListenerS153S0100000_18;
        View.OnClickListener aVar = aCListenerS153S0100000_18;
        aVar = aCListenerS153S0100000_18;
        if (C1848410yCV.LIZ) {
            if (aCListenerS153S0100000_18 != null) {
                fVar = new f(aCListenerS153S0100000_18);
                aVar = new mf.a(fVar);
            }
        } else if (aCListenerS153S0100000_18 != null) {
            aVar = new mf.a(fVar);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c03eb);
        }
        c03eb.setOnClickListener(aVar);
    }

    public static void lb(C425830Gmr c425830Gmr, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c425830Gmr);
        }
        c425830Gmr.setOnClickListener(onClickListener);
    }

    public static void lc(C1898700zVc c1898700zVc, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1898700zVc);
        c1898700zVc.setScaleX(f);
    }

    public static void ld(C1295960jpS c1295960jpS, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1295960jpS);
        c1295960jpS.setTranslationY(f);
    }

    public static void m(C424600Gks c424600Gks, int i) {
        int visibility = c424600Gks.getVisibility();
        c424600Gks.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c424600Gks);
    }

    public static void m0(C786990Uu1 c786990Uu1, int i) {
        int visibility = c786990Uu1.getVisibility();
        c786990Uu1.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c786990Uu1);
    }

    public static void m1(C692980RGe c692980RGe, int i) {
        int visibility = c692980RGe.getVisibility();
        c692980RGe.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c692980RGe);
    }

    public static void m2(C1537720q7O c1537720q7O, int i) {
        int visibility = c1537720q7O.getVisibility();
        c1537720q7O.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1537720q7O);
    }

    public static void m5(C20743416Fc c20743416Fc, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20743416Fc);
        c20743416Fc.setAlpha(f);
    }

    public static void m6(ConstraintLayout constraintLayout, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(constraintLayout);
        constraintLayout.setLayoutParams(layoutParams);
    }

    public static void m7(C384240F4s c384240F4s, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c384240F4s);
        c384240F4s.setLayoutParams(layoutParams);
    }

    public static void m8(C16FV c16fv, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c16fv);
        }
        c16fv.setOnClickListener(onClickListener);
    }

    public static void m9(C1845930y8V c1845930y8V, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1845930y8V);
        }
        c1845930y8V.setOnClickListener(aVar);
    }

    public static void ma(C418460Gay c418460Gay, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c418460Gay);
        }
        c418460Gay.setOnClickListener(onClickListener);
    }

    public static void mb(C19404210vo c19404210vo, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c19404210vo);
        }
        c19404210vo.setOnClickListener(aVar);
    }

    public static void mc(float f, ViewGroup viewGroup) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewGroup);
        viewGroup.setScaleY(f);
    }

    public static void md(C1324720kZq c1324720kZq, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324720kZq);
        c1324720kZq.setTranslationY(f);
    }

    public static void me(AbstractActivityC559670LxF abstractActivityC559670LxF, int i) {
        try {
            if (C1389600mGU.LIZIZ(abstractActivityC559670LxF) && i != 0) {
                i = 0;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        abstractActivityC559670LxF.overridePendingTransition(0, i);
    }

    public static void n(C430210Gtv c430210Gtv, int i) {
        int visibility = c430210Gtv.getVisibility();
        c430210Gtv.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c430210Gtv);
    }

    public static void n0(C1202300hOO c1202300hOO, int i) {
        int visibility = c1202300hOO.getVisibility();
        c1202300hOO.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1202300hOO);
    }

    public static void n1(C0STF c0stf, int i) {
        int visibility = c0stf.getVisibility();
        c0stf.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0stf);
    }

    public static void n2(C971380bNw c971380bNw, int i) {
        int visibility = c971380bNw.getVisibility();
        c971380bNw.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c971380bNw);
    }

    public static void n5(C21538619Qy c21538619Qy, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21538619Qy);
        c21538619Qy.setAlpha(f);
    }

    public static void n6(C20742216Eq c20742216Eq, C19ME c19me) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20742216Eq);
        c20742216Eq.setLayoutParams(c19me);
    }

    public static void n7(ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnTouchListenerC1648690t0N);
        viewOnTouchListenerC1648690t0N.setLayoutParams(layoutParams);
    }

    public static void n8(C20743416Fc c20743416Fc, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c20743416Fc);
        }
        c20743416Fc.setOnClickListener(onClickListener);
    }

    public static void n9(TuxTag tuxTag, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(tuxTag);
        }
        tuxTag.setOnClickListener(onClickListener);
    }

    public static void na(C420290Gdv c420290Gdv, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c420290Gdv);
        }
        c420290Gdv.setOnClickListener(aVar);
    }

    public static void nb(C19404310vp c19404310vp, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c19404310vp);
        }
        c19404310vp.setOnClickListener(aVar);
    }

    public static void nc(float f, TextView textView) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textView);
        textView.setScaleY(f);
    }

    public static void nd(LiveIconView liveIconView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveIconView);
        liveIconView.setTranslationY(f);
    }

    public static void o(SmartAvatarImageView smartAvatarImageView, int i) {
        int visibility = smartAvatarImageView.getVisibility();
        smartAvatarImageView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, smartAvatarImageView);
    }

    public static void o1(C1358650lSZ c1358650lSZ, int i) {
        int visibility = c1358650lSZ.getVisibility();
        c1358650lSZ.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1358650lSZ);
    }

    public static ServiceLoader o4(Class cls, ClassLoader classLoader) {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
        C2107208Ni.LIZ(cls, serviceLoaderLoad);
        return serviceLoaderLoad;
    }

    public static void o5(C1844320y5u c1844320y5u, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1844320y5u);
        c1844320y5u.setAlpha(f);
    }

    public static void o6(C21578619ce c21578619ce, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21578619ce);
        c21578619ce.setLayoutParams(layoutParams);
    }

    public static void o7(C1324800kZy c1324800kZy, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324800kZy);
        c1324800kZy.setLayoutParams(layoutParams);
    }

    public static void o8(C978720bZm c978720bZm, ACListenerS148S0100000_13 aCListenerS148S0100000_13) {
        View.OnClickListener fVar = aCListenerS148S0100000_13;
        View.OnClickListener aVar = aCListenerS148S0100000_13;
        aVar = aCListenerS148S0100000_13;
        if (C1848410yCV.LIZ) {
            if (aCListenerS148S0100000_13 != null) {
                fVar = new f(aCListenerS148S0100000_13);
                aVar = new mf.a(fVar);
            }
        } else if (aCListenerS148S0100000_13 != null) {
            aVar = new mf.a(fVar);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c978720bZm);
        }
        c978720bZm.setOnClickListener(aVar);
    }

    public static void o9(C1CRB c1crb, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1crb);
        }
        c1crb.setOnClickListener(aVar);
    }

    public static void oa(C1385130m9H c1385130m9H, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1385130m9H);
        }
        c1385130m9H.setOnClickListener(onClickListener);
    }

    public static void ob(C419040Gbu c419040Gbu, ACListenerS160S0100000_26 aCListenerS160S0100000_26) {
        View.OnClickListener fVar = aCListenerS160S0100000_26;
        View.OnClickListener aVar = aCListenerS160S0100000_26;
        aVar = aCListenerS160S0100000_26;
        if (C1848410yCV.LIZ) {
            if (aCListenerS160S0100000_26 != null) {
                fVar = new f(aCListenerS160S0100000_26);
                aVar = new mf.a(fVar);
            }
        } else if (aCListenerS160S0100000_26 != null) {
            aVar = new mf.a(fVar);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c419040Gbu);
        }
        c419040Gbu.setOnClickListener(aVar);
    }

    public static void oc(SurfaceView surfaceView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(surfaceView);
        surfaceView.setScaleY(f);
    }

    public static void od(C16F5 c16f5, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16f5);
        c16f5.setTranslationY(f);
    }

    public static View oe(C19FO c19fo, int i) {
        View viewLIZIZ;
        if (C1220404q2.LIZ()) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                synchronized (C0JAD.LLIZ) {
                    try {
                        viewLIZIZ = C0JAF.LIZIZ(c19fo.findViewById(i), c19fo.getWindow().getDecorView(), i);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return viewLIZIZ;
            }
            return C0JAF.LIZIZ(c19fo.findViewById(i), c19fo.getWindow().getDecorView(), i);
        }
        return c19fo.findViewById(i);
    }

    public static void p(C424560Gko c424560Gko, int i) {
        int visibility = c424560Gko.getVisibility();
        c424560Gko.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c424560Gko);
    }

    public static void p0(C1203280hPy c1203280hPy, int i) {
        int visibility = c1203280hPy.getVisibility();
        c1203280hPy.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1203280hPy);
    }

    public static void p1(C1359990lUj c1359990lUj, int i) {
        int visibility = c1359990lUj.getVisibility();
        c1359990lUj.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1359990lUj);
    }

    public static int p4(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        C2469109lx c2469109lx = C2469009lw.LIZLLL;
        if (c2469109lx != null) {
            c2469109lx.LLILLJJLI = 0;
        }
        return audioManager.requestAudioFocus(audioFocusRequest);
    }

    public static void p5(C1143090fqt c1143090fqt, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1143090fqt);
        c1143090fqt.setAlpha(f);
    }

    public static void p6(RecyclerView recyclerView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(recyclerView);
        recyclerView.setLayoutParams(layoutParams);
    }

    public static void p7(C19561611g6 c19561611g6, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19561611g6);
        c19561611g6.setLayoutParams(layoutParams);
    }

    public static void p8(C945640aiQ c945640aiQ, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c945640aiQ);
        }
        c945640aiQ.setOnClickListener(aVar);
    }

    public static void p9(RadiusLayout radiusLayout, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(radiusLayout);
        }
        radiusLayout.setOnClickListener(onClickListener);
    }

    public static void pa(RelationButton relationButton, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(relationButton);
        }
        relationButton.setOnClickListener(onClickListener);
    }

    public static void pb(C1899490zWt c1899490zWt, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1899490zWt);
        }
        c1899490zWt.setOnClickListener(onClickListener);
    }

    public static void pc(View view, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setScaleY(f);
    }

    public static void pd(C1844320y5u c1844320y5u, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1844320y5u);
        c1844320y5u.setTranslationY(f);
    }

    public static View pe(InstallActivity installActivity, int i) {
        View viewLIZIZ;
        if (C1220404q2.LIZ()) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                synchronized (C0JAD.LLIZ) {
                    try {
                        viewLIZIZ = C0JAF.LIZIZ(installActivity.findViewById(i), installActivity.getWindow().getDecorView(), i);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return viewLIZIZ;
            }
            return C0JAF.LIZIZ(installActivity.findViewById(i), installActivity.getWindow().getDecorView(), i);
        }
        return installActivity.findViewById(i);
    }

    public static void q(C425800Gmo c425800Gmo, int i) {
        int visibility = c425800Gmo.getVisibility();
        c425800Gmo.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c425800Gmo);
    }

    public static void q0(C787880UvS c787880UvS, int i) {
        int visibility = c787880UvS.getVisibility();
        c787880UvS.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c787880UvS);
    }

    public static void q3(MediaNotificationService mediaNotificationService, Notification notification) {
        if (C294840Bh4.LIZ() && mediaNotificationService != null) {
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("service info---->:");
            sbLIZ.append(mediaNotificationService.getClass().getCanonicalName());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        }
        mediaNotificationService.startForeground(1, notification);
    }

    public static void q5(C1099610eil c1099610eil, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1099610eil);
        c1099610eil.setAlpha(f);
    }

    public static void q6(ViewPager viewPager, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewPager);
        viewPager.setLayoutParams(layoutParams);
    }

    public static void q7(C1636150sg9 c1636150sg9, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1636150sg9);
        c1636150sg9.setLayoutParams(layoutParams);
    }

    public static void q8(C931950aML c931950aML, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c931950aML);
        }
        c931950aML.setOnClickListener(aVar);
    }

    public static void q9(C1322110kVd c1322110kVd, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1322110kVd);
        }
        c1322110kVd.setOnClickListener(onClickListener);
    }

    public static void qa(RelationLabelTextView relationLabelTextView, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(relationLabelTextView);
        }
        relationLabelTextView.setOnClickListener(aVar);
    }

    public static void qb(C426290Gnb c426290Gnb, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c426290Gnb);
        }
        c426290Gnb.setOnClickListener(aVar);
    }

    public static void qc(FrameLayout frameLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(frameLayout);
        frameLayout.setScaleY(f);
    }

    public static void qd(C1846630y9d c1846630y9d, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1846630y9d);
        c1846630y9d.setTranslationY(f);
    }

    public static View qe(Window window, int i) {
        View viewLIZIZ;
        if (C1220404q2.LIZ()) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                synchronized (C0JAD.LLIZ) {
                    try {
                        viewLIZIZ = C0JAF.LIZIZ(window.findViewById(i), window.getDecorView(), i);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return viewLIZIZ;
            }
            return C0JAF.LIZIZ(window.findViewById(i), window.getDecorView(), i);
        }
        return window.findViewById(i);
    }

    public static void r(C21458918yR c21458918yR, int i) {
        int visibility = c21458918yR.getVisibility();
        c21458918yR.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c21458918yR);
    }

    public static void r0(C418460Gay c418460Gay, int i) {
        int visibility = c418460Gay.getVisibility();
        c418460Gay.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c418460Gay);
    }

    public static void r1(C1012300cRw c1012300cRw, int i) {
        int visibility = c1012300cRw.getVisibility();
        c1012300cRw.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1012300cRw);
    }

    public static void r3(BgBroadcastService bgBroadcastService, Notification notification) {
        if (C294840Bh4.LIZ() && bgBroadcastService != null) {
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("service info---->:");
            sbLIZ.append(bgBroadcastService.getClass().getCanonicalName());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        }
        bgBroadcastService.startForeground(R.id.pdp, notification);
    }

    public static boolean r4(Activity activity, String str) {
        if (Build.VERSION.SDK_INT == 31 && ((Boolean) C282490B5j.LIZ.getValue()).booleanValue()) {
            return C0VE9.LJIIJ(activity, str);
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static void r5(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.setAlpha(f);
    }

    public static void r6(C20632315oP c20632315oP, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20632315oP);
        c20632315oP.setLayoutParams(layoutParams);
    }

    public static void r7(C03ZF c03zf, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c03zf);
        c03zf.setLayoutParams(layoutParams);
    }

    public static void r8(C1844420y64 c1844420y64, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1844420y64);
        }
        c1844420y64.setOnClickListener(aVar);
    }

    public static void r9(C19S0 c19s0, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c19s0);
        }
        c19s0.setOnClickListener(aVar);
    }

    public static void ra(C427590Gph c427590Gph, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c427590Gph);
        }
        c427590Gph.setOnClickListener(aVar);
    }

    public static void rb(C421940Gga c421940Gga, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c421940Gga);
        }
        c421940Gga.setOnClickListener(aVar);
    }

    public static void rc(ImageView imageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
        imageView.setScaleY(f);
    }

    public static void rd(C1105630esT c1105630esT, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1105630esT);
        c1105630esT.setTranslationY(f);
    }

    public static void s(C1908120zko c1908120zko, int i) {
        int visibility = c1908120zko.getVisibility();
        c1908120zko.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1908120zko);
    }

    public static void s0(C1610840s1K c1610840s1K, int i) {
        int visibility = c1610840s1K.getVisibility();
        c1610840s1K.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1610840s1K);
    }

    public static void s1(C1457840o2Y c1457840o2Y, int i) {
        int visibility = c1457840o2Y.getVisibility();
        c1457840o2Y.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1457840o2Y);
    }

    public static ComponentName s3(Context context, Intent intent) {
        if (context instanceof Context) {
            try {
                try {
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("StartServiceLancet_startService", false) && Build.VERSION.SDK_INT >= 26 && C2214201BlK.LJIIJJI) {
                        C1AF0.LIZJ("dangerousStartService warning! make sure you are in forground call startService ".concat(intent.getClass().getName()));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                return context.startService(intent);
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                boolean z = false;
                for (StackTraceElement stackTraceElement : e2.getStackTrace()) {
                    if (stackTraceElement.getClassName().startsWith("com.ss.android.ugc.aweme.scheduler.PublishService") && "show".equals(stackTraceElement.getMethodName())) {
                        z = true;
                    }
                }
                if (z) {
                    return null;
                }
                throw e2;
            }
        }
        return context.startService(intent);
    }

    public static void s4(Activity activity, ComponentCallbacks componentCallbacks) {
        if (C1224204qe.LIZ()) {
            C786550UtJ.LIZIZ(componentCallbacks);
        }
        activity.registerComponentCallbacks(componentCallbacks);
    }

    public static void s5(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnAttachStateChangeListenerC20604515jv);
        viewOnAttachStateChangeListenerC20604515jv.setAlpha(f);
    }

    public static void s6(C1295960jpS c1295960jpS, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1295960jpS);
        c1295960jpS.setLayoutParams(layoutParams);
    }

    public static void s7(C1600450rkZ c1600450rkZ, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1600450rkZ);
        c1600450rkZ.setLayoutParams(layoutParams);
    }

    public static void s8(C962470b9Z c962470b9Z, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c962470b9Z);
        }
        c962470b9Z.setOnClickListener(aVar);
    }

    public static void s9(C19SE c19se, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c19se);
        }
        c19se.setOnClickListener(onClickListener);
    }

    public static void sa(C658530PsJ c658530PsJ, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c658530PsJ);
        }
        c658530PsJ.setOnClickListener(aVar);
    }

    public static void sb(C19471311Fv c19471311Fv, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c19471311Fv);
        }
        c19471311Fv.setOnClickListener(aVar);
    }

    public static void sc(LinearLayout linearLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(linearLayout);
        linearLayout.setScaleY(f);
    }

    public static void sd(C430340Gu8 c430340Gu8, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c430340Gu8);
        c430340Gu8.setTranslationY(f);
    }

    public static void se(WebSettings webSettings, String str) {
        String strLIZJ;
        if (C794280VDu.LIZIZ().forbidLancetHookEnable && C786500UtE.LIZ == webSettings.hashCode()) {
            webSettings.setUserAgentString(str);
            return;
        }
        if (C292470BdF.LIZ()) {
            if (OptIABUAExp.LIZ(C788140Uvs.LIZ.get(webSettings))) {
                strLIZJ = OptIABUAExp.LIZJ();
                if (strLIZJ == null || strLIZJ.isEmpty()) {
                    webSettings.setUserAgentString(str);
                    return;
                }
            } else {
                strLIZJ = " BytedanceWebview/d8a21c6";
            }
            if (!str.contains(strLIZJ) || !str.endsWith(strLIZJ)) {
                str = str.replace(strLIZJ, "") + strLIZJ;
            }
        }
        webSettings.setUserAgentString(str);
    }

    public static void t(C1356950lPp c1356950lPp, int i) {
        int visibility = c1356950lPp.getVisibility();
        c1356950lPp.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1356950lPp);
    }

    public static void t0(RelationButton relationButton, int i) {
        int visibility = relationButton.getVisibility();
        relationButton.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, relationButton);
    }

    public static void t1(C1324800kZy c1324800kZy, int i) {
        int visibility = c1324800kZy.getVisibility();
        c1324800kZy.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1324800kZy);
    }

    public static void t4(Activity activity, ComponentCallbacks componentCallbacks) {
        if (C1224204qe.LIZ()) {
            C786480UtC c786480UtC = C786550UtJ.LIZ;
            synchronized (c786480UtC.LIZIZ) {
                try {
                    List<ComponentCallbacks> list = c786480UtC.LIZ;
                    if (list != null && !((ArrayList) list).isEmpty()) {
                        ((ArrayList) c786480UtC.LIZ).remove(componentCallbacks);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        activity.unregisterComponentCallbacks(componentCallbacks);
    }

    public static void t5(C427870Gq9 c427870Gq9, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c427870Gq9);
        c427870Gq9.setAlpha(f);
    }

    public static void t6(C1126540fQC c1126540fQC, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126540fQC);
        c1126540fQC.setLayoutParams(layoutParams);
    }

    public static void t7(d0 d0Var, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(d0Var);
        d0Var.setLayoutParams(layoutParams);
    }

    public static void t8(C1110070ezd c1110070ezd, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1110070ezd);
        }
        c1110070ezd.setOnClickListener(aVar);
    }

    public static void t9(C21545019Tk c21545019Tk, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c21545019Tk);
        }
        c21545019Tk.setOnClickListener(onClickListener);
    }

    public static void ta(C1460640o74 c1460640o74, AbstractViewOnClickListenerC1173120gdK abstractViewOnClickListenerC1173120gdK) {
        View.OnClickListener fVar = abstractViewOnClickListenerC1173120gdK;
        if (C1848410yCV.LIZ) {
            fVar = new f(abstractViewOnClickListenerC1173120gdK);
        }
        mf.a aVar = new mf.a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1460640o74);
        }
        c1460640o74.setOnClickListener(aVar);
    }

    public static void tb(C0OM2 c0om2, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0om2);
        }
        c0om2.setOnClickListener(aVar);
    }

    public static void tc(RelativeLayout relativeLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(relativeLayout);
        relativeLayout.setScaleY(f);
    }

    public static void td(SmartImageView smartImageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(smartImageView);
        smartImageView.setTranslationY(f);
    }

    public static void te(WebView webView, WebViewClient webViewClient) {
        Integer numValueOf;
        String strLIZJ;
        C1537480q70 hybridContext;
        if (C794280VDu.LIZ(webView, "csrf")) {
            webView.setWebViewClient(webViewClient);
            return;
        }
        if (C292470BdF.LIZ() && webViewClient != null) {
            if ((webView instanceof WebKitView) && (hybridContext = ((WebKitView) webView).getHybridContext()) != null) {
                numValueOf = Integer.valueOf(hybridContext.LJ());
            } else {
                numValueOf = null;
            }
            WebSettings settings = webView.getSettings();
            if (numValueOf != null) {
                C788140Uvs.LIZ.put(settings, numValueOf);
            }
            String userAgentString = settings.getUserAgentString();
            if (OptIABUAExp.LIZ(numValueOf)) {
                strLIZJ = OptIABUAExp.LIZJ();
                if (strLIZJ == null || strLIZJ.isEmpty()) {
                    webView.setWebViewClient(webViewClient);
                    return;
                }
            } else {
                strLIZJ = " BytedanceWebview/d8a21c6";
            }
            if (!userAgentString.contains(strLIZJ)) {
                settings.setUserAgentString(userAgentString.concat(strLIZJ));
            }
        }
        webView.setWebViewClient(webViewClient);
    }

    public static void u(C1340290kyx c1340290kyx, int i) {
        int visibility = c1340290kyx.getVisibility();
        c1340290kyx.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1340290kyx);
    }

    public static void u0(C1908730zln c1908730zln, int i) {
        int visibility = c1908730zln.getVisibility();
        c1908730zln.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1908730zln);
    }

    public static void u1(C0QB7 c0qb7, int i) {
        int visibility = c0qb7.getVisibility();
        c0qb7.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0qb7);
    }

    public static void u4(Application application, ComponentCallbacks componentCallbacks) {
        if (C1224204qe.LIZ()) {
            C786550UtJ.LIZIZ(componentCallbacks);
        }
        application.registerComponentCallbacks(componentCallbacks);
    }

    public static void u5(SmartImageView smartImageView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(smartImageView);
        smartImageView.setAlpha(f);
    }

    public static void u6(C1324720kZq c1324720kZq, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324720kZq);
        c1324720kZq.setLayoutParams(layoutParams);
    }

    public static void u7(1NwN r0, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r0);
        r0.setLayoutParams(layoutParams);
    }

    public static void u8(C1112410f3P c1112410f3P, ACListenerS111S0200000_7 aCListenerS111S0200000_7) {
        View.OnClickListener fVar = aCListenerS111S0200000_7;
        View.OnClickListener aVar = aCListenerS111S0200000_7;
        aVar = aCListenerS111S0200000_7;
        if (C1848410yCV.LIZ) {
            if (aCListenerS111S0200000_7 != null) {
                fVar = new f(aCListenerS111S0200000_7);
                aVar = new mf.a(fVar);
            }
        } else if (aCListenerS111S0200000_7 != null) {
            aVar = new mf.a(fVar);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1112410f3P);
        }
        c1112410f3P.setOnClickListener(aVar);
    }

    public static void u9(C1239720iMk c1239720iMk, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1239720iMk);
        }
        c1239720iMk.setOnClickListener(aVar);
    }

    public static void ua(C530490KrH c530490KrH, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c530490KrH);
        }
        c530490KrH.setOnClickListener(aVar);
    }

    public static void ub(AdapterView adapterView, AdapterView.OnItemClickListener onItemClickListener) {
        if (C1848410yCV.LIZ) {
            onItemClickListener = new C1847850yBb(onItemClickListener);
        }
        adapterView.setOnItemClickListener(onItemClickListener);
    }

    public static void uc(ConstraintLayout constraintLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(constraintLayout);
        constraintLayout.setScaleY(f);
    }

    public static void ud(C197039127h c197039127h, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c197039127h);
        c197039127h.setTranslationY(f);
    }

    public static void ue(WebView webView, String str) {
        if (C794280VDu.LIZ(webView, "monitor")) {
            webView.loadUrl(str);
            return;
        }
        String strOnLoadUrl = C822560WOo.LIZ.onLoadUrl(webView, str);
        if (!TextUtils.isEmpty(strOnLoadUrl)) {
            str = strOnLoadUrl;
        }
        webView.loadUrl(str);
    }

    public static void v(C430440GuI c430440GuI, int i) {
        int visibility = c430440GuI.getVisibility();
        c430440GuI.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c430440GuI);
    }

    public static void v0(RelationLabelTextView relationLabelTextView, int i) {
        int visibility = relationLabelTextView.getVisibility();
        relationLabelTextView.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, relationLabelTextView);
    }

    public static void v1(C443640HaU c443640HaU, int i) {
        int visibility = c443640HaU.getVisibility();
        c443640HaU.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c443640HaU);
    }

    public static Typeface v4(AssetManager assetManager, final String str) {
        Typeface typeface;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) C2277681EDe.LJ.getValue()).booleanValue()) {
                final int iIdentityHashCode = System.identityHashCode(assetManager);
                Object obj = new Object(iIdentityHashCode, str) { // from class: X.08GL
                    public final int LIZ;
                    public final String LIZIZ;

                    public final int hashCode() {
                        return Objects.hash(Integer.valueOf(this.LIZ), this.LIZIZ);
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof C08GL)) {
                            return false;
                        }
                        C08GL c08gl = (C08GL) obj2;
                        if (this.LIZ == c08gl.LIZ && Objects.equals(this.LIZIZ, c08gl.LIZIZ)) {
                            return true;
                        }
                        return false;
                    }

                    {
                        this.LIZ = iIdentityHashCode;
                        this.LIZIZ = str;
                    }
                };
                ConcurrentHashMap<C08GL, WeakReference<Typeface>> concurrentHashMap = C2087408Fs.LIZJ;
                WeakReference<Typeface> weakReference = concurrentHashMap.get(obj);
                if (weakReference != null && (typeface = weakReference.get()) != null) {
                    return typeface;
                }
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, str);
                concurrentHashMap.put((C08GL) obj, new WeakReference<>(typefaceCreateFromAsset));
                return typefaceCreateFromAsset;
            }
            if (((Boolean) C2277681EDe.LJFF.getValue()).booleanValue()) {
                C2087408Fs.LIZ(2, 0L, str);
            }
        }
        return Typeface.createFromAsset(assetManager, str);
    }

    public static void v5(C427660Gpo c427660Gpo, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c427660Gpo);
        c427660Gpo.setAlpha(f);
    }

    public static void v6(C1091700eW0 c1091700eW0, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1091700eW0);
        c1091700eW0.setLayoutParams(layoutParams);
    }

    public static void v7(CheckBox checkBox, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (C1848410yCV.LIZ) {
            onCheckedChangeListener = new C786760Ute(onCheckedChangeListener);
        }
        checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public static void v8(C1811280xEc c1811280xEc, ACListenerS161S0100000_27 aCListenerS161S0100000_27) {
        View.OnClickListener fVar = aCListenerS161S0100000_27;
        View.OnClickListener aVar = aCListenerS161S0100000_27;
        aVar = aCListenerS161S0100000_27;
        if (C1848410yCV.LIZ) {
            if (aCListenerS161S0100000_27 != null) {
                fVar = new f(aCListenerS161S0100000_27);
                aVar = new mf.a(fVar);
            }
        } else if (aCListenerS161S0100000_27 != null) {
            aVar = new mf.a(fVar);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1811280xEc);
        }
        c1811280xEc.setOnClickListener(aVar);
    }

    public static void v9(C0DSD c0dsd, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0dsd);
        }
        c0dsd.setOnClickListener(onClickListener);
    }

    public static void va(C527360KmE c527360KmE, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c527360KmE);
        }
        c527360KmE.setOnClickListener(aVar);
    }

    public static void vb(ListView listView, AdapterView.OnItemClickListener onItemClickListener) {
        if (C1848410yCV.LIZ) {
            onItemClickListener = new C1847850yBb(onItemClickListener);
        }
        listView.setOnItemClickListener(onItemClickListener);
    }

    public static void vc(C1295960jpS c1295960jpS, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1295960jpS);
        c1295960jpS.setScaleY(f);
    }

    public static void vd(TuxIconView tuxIconView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxIconView);
        tuxIconView.setTranslationY(f);
    }

    public static void w(C1353360lK2 c1353360lK2, int i) {
        int visibility = c1353360lK2.getVisibility();
        c1353360lK2.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1353360lK2);
    }

    public static void w0(C0FJM c0fjm, int i) {
        int visibility = c0fjm.getVisibility();
        c0fjm.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0fjm);
    }

    public static void w1(C19713212Aw c19713212Aw, int i) {
        int visibility = c19713212Aw.getVisibility();
        c19713212Aw.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19713212Aw);
    }

    public static void w3(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnDrawListener onDrawListener) {
        viewTreeObserver.addOnDrawListener(onDrawListener);
        C2187701Ajg.LIZ(viewTreeObserver, onDrawListener, ViewTreeObserver.OnDrawListener.class);
    }

    public static void w5(C197039127h c197039127h, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c197039127h);
        c197039127h.setAlpha(f);
    }

    public static void w6(LiveIconView liveIconView, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveIconView);
        liveIconView.setLayoutParams(layoutParams);
    }

    public static void w7(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (C1848410yCV.LIZ) {
            onCheckedChangeListener = new C786760Ute(onCheckedChangeListener);
        }
        compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public static void w8(C1786030wZt c1786030wZt, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1786030wZt);
        }
        c1786030wZt.setOnClickListener(onClickListener);
    }

    public static void w9(C430290Gu3 c430290Gu3, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c430290Gu3);
        }
        c430290Gu3.setOnClickListener(onClickListener);
    }

    public static void wa(C1642110spl c1642110spl, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1642110spl);
        }
        c1642110spl.setOnClickListener(aVar);
    }

    public static void wb(SeekBar seekBar, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        if (C1848410yCV.LIZ) {
            onSeekBarChangeListener = new C786820Utk(onSeekBarChangeListener);
        }
        seekBar.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public static void wc(C1126540fQC c1126540fQC, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126540fQC);
        c1126540fQC.setScaleY(f);
    }

    public static void wd(TuxTextView tuxTextView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxTextView);
        tuxTextView.setTranslationY(f);
    }

    public static void x(C1340200kyo c1340200kyo, int i) {
        int visibility = c1340200kyo.getVisibility();
        c1340200kyo.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1340200kyo);
    }

    public static void x1(C1826510xdB c1826510xdB, int i) {
        int visibility = c1826510xdB.getVisibility();
        c1826510xdB.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1826510xdB);
    }

    public static void x3(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    public static void x5(TuxIconView tuxIconView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxIconView);
        tuxIconView.setAlpha(f);
    }

    public static void x6(C16FS c16fs, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fs);
        c16fs.setLayoutParams(layoutParams);
    }

    public static void x7(RadioGroup radioGroup, final RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        if (C1848410yCV.LIZ) {
            onCheckedChangeListener = new RadioGroup.OnCheckedChangeListener(onCheckedChangeListener) { // from class: X.0Utd
                public final RadioGroup.OnCheckedChangeListener LIZ;

                {
                    this.LIZ = onCheckedChangeListener;
                }

                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup2, int i) {
                    C1847860yBc.LJ(radioGroup2);
                    RadioGroup.OnCheckedChangeListener onCheckedChangeListener2 = this.LIZ;
                    if (onCheckedChangeListener2 != null) {
                        onCheckedChangeListener2.onCheckedChanged(radioGroup2, i);
                    }
                    C1847860yBc.LIZLLL(radioGroup2);
                }
            };
        }
        radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public static void x8(C0ULT c0ult, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0ult);
        }
        c0ult.setOnClickListener(aVar);
    }

    public static void x9(1MTK r2, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(r2);
        }
        r2.setOnClickListener(aVar);
    }

    public static void xa(C538480L9y c538480L9y, C19IN c19in) {
        View.OnClickListener fVar = c19in;
        if (C1848410yCV.LIZ) {
            fVar = new f(c19in);
        }
        mf.a aVar = new mf.a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c538480L9y);
        }
        c538480L9y.setOnClickListener(aVar);
    }

    public static void xb(C0GXB c0gxb, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        if (C1848410yCV.LIZ) {
            onSeekBarChangeListener = new C786820Utk(onSeekBarChangeListener);
        }
        c0gxb.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public static void xc(C1324720kZq c1324720kZq, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324720kZq);
        c1324720kZq.setScaleY(f);
    }

    public static void xd(C1749280vcc c1749280vcc, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1749280vcc);
        c1749280vcc.setTranslationY(f);
    }

    public static void y(C1341720l1G c1341720l1G, int i) {
        int visibility = c1341720l1G.getVisibility();
        c1341720l1G.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1341720l1G);
    }

    public static void y1(C370060Ef6 c370060Ef6, int i) {
        int visibility = c370060Ef6.getVisibility();
        c370060Ef6.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c370060Ef6);
    }

    public static File y2(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        File file = C786450Ut9.LIZLLL;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        C786450Ut9.LIZLLL = externalFilesDir;
        return externalFilesDir;
    }

    public static void y3(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        C2187701Ajg.LIZ(viewTreeObserver, onPreDrawListener, ViewTreeObserver.OnPreDrawListener.class);
    }

    public static NetworkInfo y4(ConnectivityManager connectivityManager, int i) {
        try {
            return connectivityManager.getNetworkInfo(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
            return C2106508Nb.LIZ();
        }
    }

    public static void y5(C0HZQ c0hzq, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0hzq);
        c0hzq.setAlpha(f);
    }

    public static void y6(C16F5 c16f5, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16f5);
        c16f5.setLayoutParams(layoutParams);
    }

    public static void y7(C21411718qp c21411718qp, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (C1848410yCV.LIZ) {
            onCheckedChangeListener = new C786760Ute(onCheckedChangeListener);
        }
        c21411718qp.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public static void y8(C1115150f7p c1115150f7p, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1115150f7p);
        }
        c1115150f7p.setOnClickListener(aVar);
    }

    public static void y9(AvatarComponentView avatarComponentView, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new mf.a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new mf.a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(avatarComponentView);
        }
        avatarComponentView.setOnClickListener(onClickListener);
    }

    public static void ya(C1399270mW5 c1399270mW5, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1399270mW5);
        }
        c1399270mW5.setOnClickListener(aVar);
    }

    public static void yb(C0GX3 c0gx3, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        if (C1848410yCV.LIZ) {
            onSeekBarChangeListener = new C786820Utk(onSeekBarChangeListener);
        }
        c0gx3.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public static void yc(C16F5 c16f5, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16f5);
        c16f5.setScaleY(f);
    }

    public static void yd(RadiusLayout radiusLayout, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(radiusLayout);
        radiusLayout.setTranslationY(f);
    }

    public static void z(C1353060lJY c1353060lJY, int i) {
        int visibility = c1353060lJY.getVisibility();
        c1353060lJY.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1353060lJY);
    }

    public static void z0(1LRv r1, int i) {
        int visibility = r1.getVisibility();
        r1.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, r1);
    }

    public static void z1(C1214150hhV c1214150hhV, int i) {
        int visibility = c1214150hhV.getVisibility();
        c1214150hhV.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1214150hhV);
    }

    public static void z3(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
        C2187701Ajg.LIZ(viewTreeObserver, onScrollChangedListener, ViewTreeObserver.OnScrollChangedListener.class);
    }

    public static NetworkInfo z4(ConnectivityManager connectivityManager, Network network) {
        try {
            return connectivityManager.getNetworkInfo(network);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
            return C2106508Nb.LIZ();
        }
    }

    public static void z5(C21411818qq c21411818qq, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21411818qq);
        c21411818qq.setAlpha(f);
    }

    public static void z6(C1146270fw1 c1146270fw1, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1146270fw1);
        c1146270fw1.setLayoutParams(layoutParams);
    }

    public static void z7(C20744116Fj c20744116Fj, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (C1848410yCV.LIZ) {
            onCheckedChangeListener = new C786760Ute(onCheckedChangeListener);
        }
        c20744116Fj.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public static void z8(C417600GZa c417600GZa, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c417600GZa);
        }
        c417600GZa.setOnClickListener(aVar);
    }

    public static void z9(C424700Gl2 c424700Gl2, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c424700Gl2);
        }
        c424700Gl2.setOnClickListener(aVar);
    }

    public static void za(C0FRP c0frp, View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        mf.a aVar = new mf.a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0frp);
        }
        c0frp.setOnClickListener(aVar);
    }

    public static void zb(C367060EaG c367060EaG, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        if (C1848410yCV.LIZ) {
            onSeekBarChangeListener = new C786820Utk(onSeekBarChangeListener);
        }
        c367060EaG.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public static void zc(C986580bmS c986580bmS, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c986580bmS);
        c986580bmS.setScaleY(f);
    }

    public static void zd(AndroidView androidView, float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(androidView);
        androidView.setTranslationY(f);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0050: INVOKE (r0 I:android.content.Intent) = (r2 I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent (m)] (LINE:50331728), block:B:22:0x0050 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0050: INVOKE (r0 I:android.content.Intent) = (r2v0 ?? I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent (m)] (LINE:50331728), block:B:22:0x0050 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.IntentFilter] */
    public static Intent LJIJI(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) throws Exception {
        ?? RegisterReceiver;
        ?? RegisterReceiver2;
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (!ReceiverRegisterCrashOptimizer.doRegisterHandler() && !ReceiverRegisterCrashOptimizer.isAsync(intentFilter)) {
                if (ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler() != null && ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler().needHookFilter(intentFilter)) {
                    ReceiverRegisterLancet.initProxyHandler();
                    return C838410Wul.LJI(application, broadcastReceiver, intentFilter, null, ReceiverRegisterLancet.sProxyHandler, 2);
                }
                return C838410Wul.LJFF(application, broadcastReceiver, intentFilter, 2);
            }
            ReceiverRegisterLancet.initHandler();
            return C838410Wul.LJI(application, broadcastReceiver, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(RegisterReceiver, RegisterReceiver2);
            }
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0050: INVOKE (r0 I:android.content.Intent) = (r2 I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent (m)] (LINE:50331728), block:B:22:0x0050 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0050: INVOKE (r0 I:android.content.Intent) = (r2v0 ?? I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent (m)] (LINE:50331728), block:B:22:0x0050 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.IntentFilter] */
    public static Intent LJIJJ(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) throws Exception {
        ?? RegisterReceiver;
        ?? RegisterReceiver2;
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (!ReceiverRegisterCrashOptimizer.doRegisterHandler() && !ReceiverRegisterCrashOptimizer.isAsync(intentFilter)) {
                if (ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler() != null && ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler().needHookFilter(intentFilter)) {
                    ReceiverRegisterLancet.initProxyHandler();
                    return C838410Wul.LJI(context, broadcastReceiver, intentFilter, null, ReceiverRegisterLancet.sProxyHandler, 2);
                }
                return C838410Wul.LJFF(context, broadcastReceiver, intentFilter, 2);
            }
            ReceiverRegisterLancet.initHandler();
            return C838410Wul.LJI(context, broadcastReceiver, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(RegisterReceiver, RegisterReceiver2);
            }
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004d: INVOKE (r2 I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent (m)] (LINE:50331725), block:B:22:0x004d */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x004d: INVOKE (r2v0 ?? I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent (m)] (LINE:50331725), block:B:22:0x004d */
    public static void LJJI(KeepWarmJobService keepWarmJobService, C2499609qs c2499609qs, IntentFilter intentFilter) throws Exception {
        BroadcastReceiver broadcastReceiverRegisterReceiver;
        IntentFilter intentFilterRegisterReceiver;
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (!ReceiverRegisterCrashOptimizer.doRegisterHandler() && !ReceiverRegisterCrashOptimizer.isAsync(intentFilter)) {
                if (ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler() != null && ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler().needHookFilter(intentFilter)) {
                    ReceiverRegisterLancet.initProxyHandler();
                    C838410Wul.LJI(keepWarmJobService, c2499609qs, intentFilter, null, ReceiverRegisterLancet.sProxyHandler, 2);
                    return;
                } else {
                    C838410Wul.LJFF(keepWarmJobService, c2499609qs, intentFilter, 2);
                    return;
                }
            }
            ReceiverRegisterLancet.initHandler();
            C838410Wul.LJI(keepWarmJobService, c2499609qs, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiverRegisterReceiver, intentFilterRegisterReceiver);
                return;
            }
            throw e;
        }
    }

    public static void LJJIIZ(Bundle bundle, IBinder iBinder, String str) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, iBinder);
        bundle.putBinder(str, iBinder);
    }

    public static void LJJIIZI(Bundle bundle, Bundle bundle2, String str) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, bundle2);
        bundle.putBundle(str, bundle2);
    }

    public static void LJJIJ(Bundle bundle, String str, byte[] bArr) {
        if (bArr != null && bArr.length > BundleAndIntentLancet.BYTE_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, bArr);
        }
        bundle.putByteArray(str, bArr);
    }

    public static void LJJIJIIJI(Bundle bundle, String str, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > BundleAndIntentLancet.CHAR_SEQUENCE_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, charSequence);
        }
        bundle.putCharSequence(str, charSequence);
    }

    public static void LJJIJIIJIL(Bundle bundle, String str, float[] fArr) {
        if (fArr != null && fArr.length > BundleAndIntentLancet.FLOAT_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, fArr);
        }
        bundle.putFloatArray(str, fArr);
    }

    public static void LJJIJIL(Bundle bundle, String str, ArrayList arrayList) {
        if (arrayList != null && arrayList.size() > BundleAndIntentLancet.INT_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, arrayList);
        }
        bundle.putIntegerArrayList(str, arrayList);
    }

    public static void LJJIJL(Bundle bundle, String str, Parcelable parcelable) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, parcelable);
        bundle.putParcelable(str, parcelable);
    }

    public static void LJJIJLIJ(Bundle bundle, String str, Parcelable[] parcelableArr) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public static void LJJIL(Bundle bundle, String str, ArrayList arrayList) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, arrayList);
        bundle.putParcelableArrayList(str, arrayList);
    }

    public static void LJJIZ(Bundle bundle, String str, Serializable serializable) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, serializable);
        bundle.putSerializable(str, serializable);
    }

    public static void LJJJ(Bundle bundle, String str, SparseArray sparseArray) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, sparseArray);
        bundle.putSparseParcelableArray(str, sparseArray);
    }

    public static void LJJJI(String str, String str2, Bundle bundle) {
        if (str2 != null && str2.length() > BundleAndIntentLancet.STRING_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, str2);
        }
        bundle.putString(str, str2);
    }

    public static void LJJJIL(Bundle bundle, String str, ArrayList arrayList) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, arrayList);
        bundle.putStringArrayList(str, arrayList);
    }

    public static void LJJZ(int i, int i2, ViewGroup viewGroup) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, null);
        viewGroup.removeViews(i, i2);
    }

    public static void LJJZZI(LinearLayout linearLayout, int i, int i2) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(linearLayout, null);
        linearLayout.removeViews(i, i2);
    }

    public static void LJLI(long j, Handler handler, Runnable runnable) {
        ThreadLocal<Boolean> threadLocal;
        try {
            if (MQCollector.shouldTrack(handler)) {
                try {
                    threadLocal = MessageQueueHook.GUARD;
                    threadLocal.set(Boolean.TRUE);
                    MQCollector.onPostMessage(handler, runnable);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    threadLocal = MessageQueueHook.GUARD;
                }
                threadLocal.remove();
            }
            handler.postAtTime(runnable, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            MessageQueueHook.GUARD.remove();
            throw th;
        }
    }

    public static boolean LJLIIL(long j, Handler handler, Runnable runnable) {
        ThreadLocal<Boolean> threadLocal;
        try {
            if (MQCollector.shouldTrack(handler)) {
                try {
                    threadLocal = MessageQueueHook.GUARD;
                    threadLocal.set(Boolean.TRUE);
                    MQCollector.onPostMessage(handler, runnable);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    threadLocal = MessageQueueHook.GUARD;
                }
                threadLocal.remove();
            }
            return handler.postDelayed(runnable, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            MessageQueueHook.GUARD.remove();
            throw th;
        }
    }

    public static void LJLJI(int i, long j, Handler handler) {
        ThreadLocal<Boolean> threadLocal;
        try {
            if (MQCollector.shouldTrack(handler)) {
                try {
                    threadLocal = MessageQueueHook.GUARD;
                    threadLocal.set(Boolean.TRUE);
                    MQCollector.onMessage(handler, null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    threadLocal = MessageQueueHook.GUARD;
                }
                threadLocal.remove();
            }
            handler.sendEmptyMessageAtTime(i, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            MessageQueueHook.GUARD.remove();
            throw th;
        }
    }

    public static void LJLJJI(int i, long j, Handler handler) {
        if (MQCollector.shouldTrack(handler) && MessageQueueHook.GUARD.get() == null) {
            MQCollector.onMessage(handler, null);
        }
        handler.sendEmptyMessageDelayed(i, j);
    }

    public static boolean LJLJL(Handler handler, Message message, long j) {
        if (MQCollector.shouldTrack(handler) && MessageQueueHook.GUARD.get() == null) {
            MQCollector.onMessage(handler, message);
        }
        return handler.sendMessageAtTime(message, j);
    }

    public static boolean LJLJLJ(Handler handler, Message message, long j) {
        if (MQCollector.shouldTrack(handler) && MessageQueueHook.GUARD.get() == null) {
            MQCollector.onMessage(handler, message);
        }
        return handler.sendMessageDelayed(message, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    public static View LJLLJ(Context context, int i, ViewGroup viewGroup) {
        String strLIZIZ;
        try {
            return View.inflate(context, i, viewGroup);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = (i >>> 24) & 127;
            if (i2 != 127) {
                int resourceName = 16;
                if (i2 > 16) {
                    a.install(context);
                    try {
                        return View.inflate(context, i, viewGroup);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        StringBuilder sb = new StringBuilder();
                        try {
                            resourceName = context.getResources().getResourceName(i);
                            strLIZIZ = resourceName;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("0x");
                            CharsKt__CharJVMKt.checkRadix(resourceName);
                            sbLIZ.append(Integer.toString(i, resourceName));
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        sb.append("Error while inflating " + strLIZIZ);
                        sb.append('\n');
                        sb.append("context class: ".concat(context.getClass().getName()));
                        sb.append('\n');
                        sb.append("tux theme variant: " + ((Object) C1308910kAL.LJIIIIZZ(context)));
                        sb.append('\n');
                        sb.append("cause (first time): " + th.getMessage());
                        sb.append('\n');
                        sb.append("cause (this time): " + th2.getMessage());
                        sb.append('\n');
                        throw new IllegalStateException(sb.toString(), th2);
                    }
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    public static View Sd(int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String strLIZIZ;
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(layoutInflater);
        }
        try {
            return layoutInflater.inflate(i, viewGroup);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = (i >>> 24) & 127;
            if (i2 != 127) {
                int resourceName = 16;
                if (i2 > 16) {
                    Context context = layoutInflater.getContext();
                    a.install(context);
                    try {
                        return layoutInflater.inflate(i, viewGroup);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        StringBuilder sb = new StringBuilder();
                        try {
                            resourceName = context.getResources().getResourceName(i);
                            strLIZIZ = resourceName;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("0x");
                            CharsKt__CharJVMKt.checkRadix(resourceName);
                            sbLIZ.append(Integer.toString(i, resourceName));
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        sb.append("Error while inflating " + strLIZIZ);
                        sb.append('\n');
                        sb.append("context class: ".concat(context.getClass().getName()));
                        sb.append('\n');
                        sb.append("tux theme variant: " + ((Object) C1308910kAL.LJIIIIZZ(context)));
                        sb.append('\n');
                        sb.append("cause (first time): " + th.getMessage());
                        sb.append('\n');
                        sb.append("cause (this time): " + th2.getMessage());
                        sb.append('\n');
                        throw new IllegalStateException(sb.toString(), th2);
                    }
                }
            }
            throw th;
        }
    }

    public static int U3(Layout layout, int i, float f) {
        if (Build.VERSION.SDK_INT > 28) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int offsetForHorizontal = layout.getOffsetForHorizontal(i, f);
            if (System.currentTimeMillis() - jCurrentTimeMillis > 2000) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("text", layout.getText().toString());
                c2344009Gk.LIZJ(layout.getWidth(), "width");
                c2344009Gk.LJ(Boolean.FALSE, "tuxlayout_anr_exp");
                C20684815ws.LJIILLIIL("rtl_long_text_error", c2344009Gk.LIZ);
            }
            return offsetForHorizontal;
        }
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            int offsetForHorizontal2 = layout.getOffsetForHorizontal(i, f);
            if (System.currentTimeMillis() - jCurrentTimeMillis2 > 2000) {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("text", layout.getText().toString());
                c2344009Gk2.LIZJ(layout.getWidth(), "width");
                c2344009Gk2.LJ(Boolean.FALSE, "tuxlayout_anr_exp");
                C20684815ws.LJIILLIIL("rtl_long_text_error", c2344009Gk2.LIZ);
            }
            return offsetForHorizontal2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344009Gk c2344009Gk3 = new C2344009Gk();
            c2344009Gk3.LJIIIIZZ("text", layout.getText().toString());
            c2344009Gk3.LIZJ(layout.getWidth(), "width");
            c2344009Gk3.LJ(Boolean.FALSE, "tuxlayout_anr_exp");
            C20684815ws.LJIILLIIL("rtl_long_text_error", c2344009Gk3.LIZ);
            return 0;
        }
    }

    public static ApplicationInfo V3(PackageManager packageManager, String str, int i) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (C786420Ut6.LJIIIZ && TextUtils.equals(str, contextLIZ.getPackageName()) && i == 128) {
            if (C786420Ut6.LIZ == null) {
                C786420Ut6.LIZ = packageManager.getApplicationInfo(str, i);
            }
            return C786420Ut6.LIZ;
        }
        if (C786420Ut6.LJIIIZ && TextUtils.equals(str, contextLIZ.getPackageName()) && i == 0) {
            if (C786420Ut6.LIZJ == null) {
                C786420Ut6.LIZJ = packageManager.getApplicationInfo(str, i);
            }
            return C786420Ut6.LIZJ;
        }
        return packageManager.getApplicationInfo(str, i);
    }

    public static PackageInfo Y3(PackageManager packageManager, String str, int i) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (C786420Ut6.LJIIIZ && TextUtils.equals(str, contextLIZ.getPackageName()) && i == 128) {
            if (C786420Ut6.LIZIZ == null) {
                C786420Ut6.LIZIZ = packageManager.getPackageInfo(str, i);
            }
            return C786420Ut6.LIZIZ;
        }
        if (C786420Ut6.LJIIIZ && TextUtils.equals(str, contextLIZ.getPackageName()) && i == 0) {
            if (C786420Ut6.LIZLLL == null) {
                C786420Ut6.LIZLLL = packageManager.getPackageInfo(str, i);
            }
            return C786420Ut6.LIZLLL;
        }
        if (C786420Ut6.LJIIIZ && TextUtils.equals(str, contextLIZ.getPackageName()) && i == 64) {
            if (C786420Ut6.LJ == null) {
                C786420Ut6.LJ = packageManager.getPackageInfo(str, i);
            }
            return C786420Ut6.LJ;
        }
        if (C786420Ut6.LJIIIZ && TextUtils.equals(str, contextLIZ.getPackageName()) && i == 8) {
            if (C786420Ut6.LJFF == null) {
                C786420Ut6.LJFF = packageManager.getPackageInfo(str, i);
            }
            return C786420Ut6.LJFF;
        }
        return packageManager.getPackageInfo(str, i);
    }

    public static void ae(int i, Activity activity, int i2) {
        try {
            if (C1389600mGU.LIZIZ(activity)) {
                if (i != 0) {
                    i = 0;
                }
                if (i2 != 0) {
                    i2 = 0;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        activity.overridePendingTransition(i, i2);
    }

    public static void be(C19GS c19gs, int i, int i2) {
        try {
            if (C1389600mGU.LIZIZ(c19gs)) {
                if (i != 0) {
                    i = 0;
                }
                if (i2 != 0) {
                    i2 = 0;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19gs.overridePendingTransition(i, i2);
    }

    public static void ce(C19EG c19eg, int i, int i2) {
        try {
            if (C1389600mGU.LIZIZ(c19eg)) {
                if (i != 0) {
                    i = 0;
                }
                if (i2 != 0) {
                    i2 = 0;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19eg.overridePendingTransition(i, i2);
    }

    public static void de(SparkActivity sparkActivity, int i, int i2) {
        try {
            if (C1389600mGU.LIZIZ(sparkActivity)) {
                if (i != 0) {
                    i = 0;
                }
                if (i2 != 0) {
                    i2 = 0;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        sparkActivity.overridePendingTransition(i, i2);
    }

    public static void fe(ChooseMusicActivity chooseMusicActivity, int i, int i2) {
        try {
            if (C1389600mGU.LIZIZ(chooseMusicActivity)) {
                if (i != 0) {
                    i = 0;
                }
                if (i2 != 0) {
                    i2 = 0;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        chooseMusicActivity.overridePendingTransition(i, i2);
    }

    public static void ge(PhotoSearchActivity photoSearchActivity, int i, int i2) {
        try {
            if (C1389600mGU.LIZIZ(photoSearchActivity)) {
                if (i != 0) {
                    i = 0;
                }
                if (i2 != 0) {
                    i2 = 0;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        photoSearchActivity.overridePendingTransition(i, i2);
    }

    public static void he(LandscapeFeedActivity landscapeFeedActivity, int i, int i2) {
        try {
            if (C1389600mGU.LIZIZ(landscapeFeedActivity)) {
                if (i != 0) {
                    i = 0;
                }
                if (i2 != 0) {
                    i2 = 0;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        landscapeFeedActivity.overridePendingTransition(i, i2);
    }

    public static void ie(com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity chooseMusicActivity, int i, int i2) {
        try {
            if (C1389600mGU.LIZIZ(chooseMusicActivity)) {
                if (i != 0) {
                    i = 0;
                }
                if (i2 != 0) {
                    i2 = 0;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        chooseMusicActivity.overridePendingTransition(i, i2);
    }

    public static String k4(Locale locale, String str, Object[] objArr) {
        try {
            if (C630700OoW.LIZ()) {
                locale = Locale.ENGLISH;
            }
            str = String.format(locale, str, objArr);
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    public static void ke(TakoChatActivity takoChatActivity, int i, int i2) {
        try {
            if (C1389600mGU.LIZIZ(takoChatActivity)) {
                if (i != 0) {
                    i = 0;
                }
                if (i2 != 0) {
                    i2 = 0;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        takoChatActivity.overridePendingTransition(i, i2);
    }

    public static Context m4(Context context, int i, String str) {
        if (i != 0) {
            try {
                boolean z = false;
                if ((C08Q0.LIZIZ(context, 0, "memory_biz_exception_type") & 1) == 1) {
                    z = true;
                }
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CreatePackageContext packageName:");
                    sbLIZ.append(str);
                    sbLIZ.append(" flags:");
                    sbLIZ.append(i);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    Npth.reportBizException("CreatePackageContext", new Throwable(strLIZIZ), Thread.currentThread().getName(), Collections.emptyMap());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return context.createPackageContext(str, i);
    }

    public static void o3(Service service, int i, Notification notification) {
        if (C294840Bh4.LIZ() && service != null) {
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("service info---->:");
            sbLIZ.append(service.getClass().getCanonicalName());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        }
        service.startForeground(i, notification);
    }

    public static void p3(ProjectionService projectionService, int i, Notification notification) {
        if (C294840Bh4.LIZ() && projectionService != null) {
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("service info---->:");
            sbLIZ.append(projectionService.getClass().getCanonicalName());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        }
        projectionService.startForeground(i, notification);
    }

    public static void ve(WebView webView, String str, Map map) {
        if (C794280VDu.LIZ(webView, "monitor")) {
            webView.loadUrl(str, map);
            return;
        }
        String strOnLoadUrl = C822560WOo.LIZ.onLoadUrl(webView, str);
        if (!TextUtils.isEmpty(strOnLoadUrl)) {
            str = strOnLoadUrl;
        }
        webView.loadUrl(str, map);
    }

    public static void we(SparkThirdWebViewInner sparkThirdWebViewInner, String str, Map map) {
        if (C794280VDu.LIZ(sparkThirdWebViewInner, "monitor")) {
            sparkThirdWebViewInner.loadUrl(str, map);
            return;
        }
        String strOnLoadUrl = C822560WOo.LIZ.onLoadUrl(sparkThirdWebViewInner, str);
        if (!TextUtils.isEmpty(strOnLoadUrl)) {
            str = strOnLoadUrl;
        }
        sparkThirdWebViewInner.loadUrl(str, map);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x002d: INVOKE (r0 I:android.content.Intent) = (r2 I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter), (r6 I:int) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter, int):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter, int):android.content.Intent (m)] (LINE:67108909), block:B:14:0x002d */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x002d: INVOKE (r0 I:android.content.Intent) = (r2v0 ?? I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter), (r6 I:int) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter, int):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter, int):android.content.Intent (m)] (LINE:67108909), block:B:14:0x002d */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x002d: INVOKE (r0 I:android.content.Intent) = (r2v0 ?? I:android.content.BroadcastReceiver), (r3v0 ?? I:android.content.IntentFilter), (r6 I:int) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter, int):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter, int):android.content.Intent (m)] (LINE:67108909), block:B:14:0x002d */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.IntentFilter] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    public static Intent LJIJJLI(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) throws Exception {
        ?? RegisterReceiver;
        ?? RegisterReceiver2;
        ?? RegisterReceiver3;
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                ReceiverRegisterLancet.initHandler();
                return C838410Wul.LJI(context, broadcastReceiver, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler, i);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(RegisterReceiver, RegisterReceiver2, RegisterReceiver3);
            }
            throw e;
        }
    }

    public static void LJLIIIL(Handler handler, Runnable runnable, Object obj, long j) {
        ThreadLocal<Boolean> threadLocal;
        try {
            if (MQCollector.shouldTrack(handler)) {
                try {
                    threadLocal = MessageQueueHook.GUARD;
                    threadLocal.set(Boolean.TRUE);
                    MQCollector.onPostMessage(handler, runnable);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    threadLocal = MessageQueueHook.GUARD;
                }
                threadLocal.remove();
            }
            handler.postAtTime(runnable, obj, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            MessageQueueHook.GUARD.remove();
            throw th;
        }
    }

    public static boolean LJLIL(Handler handler, Runnable runnable, Object obj, long j) {
        ThreadLocal<Boolean> threadLocal;
        try {
            if (MQCollector.shouldTrack(handler)) {
                try {
                    threadLocal = MessageQueueHook.GUARD;
                    threadLocal.set(Boolean.TRUE);
                    MQCollector.onPostMessage(handler, runnable);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    threadLocal = MessageQueueHook.GUARD;
                }
                threadLocal.remove();
            }
            return handler.postDelayed(runnable, obj, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            MessageQueueHook.GUARD.remove();
            throw th;
        }
    }

    public static int LJLLILLLL(Resources resources, String str, String str2, String str3) {
        if (!Intrinsics.LJFF(str2, FollowStatusChangeMethod.PARAM_UID)) {
            return Integer.valueOf(resources.getIdentifier(str, str2, str3)).intValue();
        }
        if (str3 != null && str3.length() != 0 && !Intrinsics.LJFF(str3, "android")) {
            int iIntValue = Integer.valueOf(resources.getIdentifier(str, str2, str3)).intValue();
            if (iIntValue != 0) {
                return iIntValue;
            }
            List list = (List) C08EV.LIZ.getValue();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((PluginEntity) it2.next()).getAabName());
            }
            Iterator it3 = C13LP.LJLLLL(new C512401z8(59), arrayList).iterator();
            while (it3.hasNext()) {
                int identifier = resources.getIdentifier(str, str2, str3 + '.' + ((String) it3.next()));
                if (identifier != 0) {
                    return identifier;
                }
            }
            return 0;
        }
        return Integer.valueOf(resources.getIdentifier(str, str2, str3)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    public static View LJLLL(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        String strLIZIZ;
        try {
            return layoutInflater.inflate(i, viewGroup, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = (i >>> 24) & 127;
            if (i2 != 127) {
                int resourceName = 16;
                if (i2 > 16) {
                    Context context = layoutInflater.getContext();
                    a.install(context);
                    try {
                        return layoutInflater.inflate(i, viewGroup, z);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        StringBuilder sb = new StringBuilder();
                        try {
                            resourceName = context.getResources().getResourceName(i);
                            strLIZIZ = resourceName;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("0x");
                            CharsKt__CharJVMKt.checkRadix(resourceName);
                            sbLIZ.append(Integer.toString(i, resourceName));
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        sb.append("Error while inflating " + strLIZIZ);
                        sb.append('\n');
                        sb.append("context class: ".concat(context.getClass().getName()));
                        sb.append('\n');
                        sb.append("tux theme variant: " + ((Object) C1308910kAL.LJIIIIZZ(context)));
                        sb.append('\n');
                        sb.append("cause (first time): " + th.getMessage());
                        sb.append('\n');
                        sb.append("cause (this time): " + th2.getMessage());
                        sb.append('\n');
                        throw new IllegalStateException(sb.toString(), th2);
                    }
                }
            }
            throw th;
        }
    }

    public static View Td(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        Context context;
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(layoutInflater);
        }
        if (!C2260308tN.LIZ()) {
            return LJLLL(layoutInflater, i, viewGroup, z);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        View viewLJLLL = LJLLL(layoutInflater, i, viewGroup, z);
        if (viewLJLLL != null) {
            context = viewLJLLL.getContext();
        } else {
            context = null;
        }
        C2260308tN.LIZIZ(i, SystemClock.elapsedRealtime() - jElapsedRealtime, context, "sys");
        return viewLJLLL;
    }

    public static void Zd(TakoChatActivity takoChatActivity, int i, int i2, int i3) {
        try {
            if (C1389600mGU.LIZIZ(takoChatActivity)) {
                if (i2 != 0) {
                    i2 = 0;
                }
                if (i3 != 0) {
                    i3 = 0;
                }
                if ((takoChatActivity instanceof Activity) && Build.VERSION.SDK_INT >= 34) {
                    takoChatActivity.clearOverrideActivityTransition(i);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        takoChatActivity.overrideActivityTransition(i, i2, i3);
    }

    public static void i3(PopupWindow popupWindow, View view, int i, int i2) {
        popupWindow.showAsDropDown(view, i, i2);
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
    }

    public static void m3(C423150GiX c423150GiX, View view, int i, int i2) {
        c423150GiX.showAtLocation(view, 0, i, i2);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJI(c423150GiX);
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054 A[PHI: r2
      0x0054: PHI (r2v3 ??) = (r2v11 ??), (r2v12 ??), (r2v13 ??), (r2v14 ??), (r2v15 ??) binds: [B:21:0x0035, B:23:0x003d, B:25:0x0045, B:27:0x0049, B:30:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int n3(android.content.res.Resources r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C786410Ut5.n3(android.content.res.Resources, java.lang.String, java.lang.String, java.lang.String):int");
    }

    public static int q4(AudioManager audioManager, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2) {
        C2469109lx c2469109lx = C2469009lw.LIZLLL;
        if (c2469109lx != null) {
            c2469109lx.LLILLJJLI = 0;
        }
        return audioManager.requestAudioFocus(onAudioFocusChangeListener, i, i2);
    }

    public static Intent LJIL(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) throws Exception {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            return C838410Wul.LJI(context, broadcastReceiver, intentFilter, str, handler, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler);
            }
            throw e;
        }
    }

    public static void j3(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
    }

    public static void k3(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAtLocation(view, i, i2, i3);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJI(popupWindow);
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
    }

    public static void l3(C1602840roQ c1602840roQ, View view, int i, int i2, int i3) {
        c1602840roQ.showAtLocation(view, i, i2, i3);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJI(c1602840roQ);
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
    }

    public static void o2(Spannable spannable, Object obj, int i, int i2, int i3) {
        try {
            spannable.setSpan(obj, i, i2, i3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void p2(SpannableString spannableString, Object obj, int i, int i2, int i3) {
        try {
            spannableString.setSpan(obj, i, i2, i3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void q2(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2, int i3) {
        try {
            spannableStringBuilder.setSpan(obj, i, i2, i3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void r2(C1360500lVY c1360500lVY, Object obj, int i, int i2, int i3) {
        try {
            c1360500lVY.setSpan(obj, i, i2, i3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void s2(C444910HcX c444910HcX, Object obj, int i, int i2, int i3) {
        try {
            c444910HcX.setSpan(obj, i, i2, i3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static Intent LJJ(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) throws Exception {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
            }
            throw e;
        }
    }

    public static void LIZ(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        C786530UtH c786530UtH = new C786530UtH(str, str2, str3, jSONObject);
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        btmSDK.addBtmEventParam(c786530UtH);
        btmSDK.processEventModel(c786530UtH);
        btmSDK.getService().checkEventParam(c786530UtH);
        AppLog.onEvent(context, str, str2, str3, j, j2, z, c786530UtH.LIZLLL);
    }
}
