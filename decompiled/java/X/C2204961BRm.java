package X;

import Y.AObjectS284S0200000_8;
import Y.AObjectS383S0100000_8;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.Fragment;
import android.app.Service;
import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.bluetooth.BluetoothDevice;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.location.Address;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.AudioRecord;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.media.MediaScannerConnection;
import android.media.projection.MediaProjection;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.StatFs;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings;
import android.telephony.CellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.view.Display;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityManager;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.webview.chromium.CookieManagerAdapter;
import com.apple.android.sdk.authentication.SDKUriHandlerActivity;
import com.apple.android.sdk.authentication.StartAuthenticationActivity;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.assem.arch.core.AssemContainerBridge;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.effectcreatormobile.effectimgcreator.EffectImgCreatorActivity;
import com.bytedance.effectcreatormobile.effectimgcreator.publish.EffectImgCreatorV2Activity;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.safemode.SmartProtected.fastboot.FastBootBlankActivity;
import com.bytedance.ies.xbridge.base.activity.GetPermissionActivity;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.router.FakeFragment;
import com.bytedance.scene.SceneActivityCompatibilityLayerFragment;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.CustomTabMainActivity;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.heytap.msp.push.service.DataMessageReceivingService;
import com.spotify.sdk.android.auth.LoginActivity;
import com.ss.android.account.share.data.write.activity.ShareDataActivity;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.effectcreator.text.TextEditActivity;
import com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText;
import com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity;
import com.ss.android.ugc.aweme.prop.activity.EffectMobileTemplateEditActivity;
import com.ss.android.ugc.aweme.prop.activity.EffectMobileTplEditV2Activity;
import com.ss.android.ugc.aweme.publish.activity.EffectMobileTemplatePublishActivity;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.tako.multipletemplate.TakoTemplateActivity;
import com.ss.android.ugc.aweme.tako.otherpage.image.backstop.TakoImageBackstopActivity;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity;
import com.ss.android.ugc.profile.business.ur.ui.CropActivity;
import com.zhihu.matisse.ui.MatisseActivity;
import com.zhiliaoapp.musically.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import joo.f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.openid.appauth.AuthorizationManagementActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204961BRm {
    public static Camera LJJJLIIL(C0WZX c0wzx) throws Throwable {
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/hardware/Camera;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100100, "android/hardware/Camera", "open", Camera.class, objArr, "android.hardware.Camera", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100100, "android/hardware/Camera", "open", null, objArr, Camera.class, c0wzw, false);
            return (Camera) c0wsuLIZIZ.LIZIZ;
        }
        Camera cameraOpen = Camera.open();
        c0wst.LIZ(100100, "android/hardware/Camera", "open", cameraOpen, objArr, Camera.class, c0wzw, true);
        return cameraOpen;
    }

    public static Map Z(C0WZX c0wzx) throws Throwable {
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/util/Map;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(4069, "java/lang/Thread", "getAllStackTraces", Thread.class, objArr, "java.util.Map", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(4069, "java/lang/Thread", "getAllStackTraces", null, objArr, Thread.class, c0wzw, false);
            return (Map) c0wsuLIZIZ.LIZIZ;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        c0wst.LIZ(4069, "java/lang/Thread", "getAllStackTraces", allStackTraces, objArr, Thread.class, c0wzw, true);
        return allStackTraces;
    }

    public static Editable A(C0FL4 c0fl4, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c0fl4;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/tools/sticker/common/text/CustomInputTextView", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/common/text/CustomInputTextView", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/common/text/CustomInputTextView", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable B(C390290FRz c390290FRz, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c390290FRz;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/addyours/AddYoursEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/addyours/AddYoursEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/addyours/AddYoursEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable C(C391430FWj c391430FWj, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView = c391430FWj;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "com/ss/android/ugc/aweme/tools/sticker/core/live/LiveCDEditText", "getEditableText", textView, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "com/ss/android/ugc/aweme/tools/sticker/core/live/LiveCDEditText", "getEditableText", null, objArr, textView, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView = (TextView) obj;
        }
        Editable editableText = textView.getEditableText();
        c0wst.LIZ(999, "com/ss/android/ugc/aweme/tools/sticker/core/live/LiveCDEditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        return editableText;
    }

    public static Editable D(C391430FWj c391430FWj, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c391430FWj;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/live/LiveCDEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/live/LiveCDEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/live/LiveCDEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable E(C1842280y2c c1842280y2c, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c1842280y2c;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/poll/PollEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/poll/PollEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/poll/PollEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable F(C19631011rI c19631011rI, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c19631011rI;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/social/base/TouchableEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/social/base/TouchableEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/social/base/TouchableEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable G(C385340F8y c385340F8y, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c385340F8y;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/text/view/TextStickerView", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/text/view/TextStickerView", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/tools/sticker/core/text/view/TextStickerView", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable I(C1355330lND c1355330lND, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView = c1355330lND;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "com/ss/android/ugc/aweme/upvote/detail/input/RepostEditText", "getEditableText", textView, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "com/ss/android/ugc/aweme/upvote/detail/input/RepostEditText", "getEditableText", null, objArr, textView, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView = (TextView) obj;
        }
        Editable editableText = textView.getEditableText();
        c0wst.LIZ(999, "com/ss/android/ugc/aweme/upvote/detail/input/RepostEditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        return editableText;
    }

    public static Editable J(C1355330lND c1355330lND, C0WZX c0wzx) throws Throwable {
        Object obj;
        C1355330lND c1355330lND2 = c1355330lND;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/upvote/detail/input/RepostEditText", "getText", c1355330lND2, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/upvote/detail/input/RepostEditText", "getText", null, objArr, c1355330lND2, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c1355330lND2 = (C1355330lND) obj;
        }
        Editable text = c1355330lND2.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/upvote/detail/input/RepostEditText", "getText", text, objArr, c1355330lND2, c0wzw, true);
        return text;
    }

    public static Editable K(C0F90 c0f90, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c0f90;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/view/DetectSoftKeyEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/view/DetectSoftKeyEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/view/DetectSoftKeyEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable L(C1360570lVf c1360570lVf, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c1360570lVf;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/views/GreetingCardEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/views/GreetingCardEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/views/GreetingCardEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Account[] LIZ(AccountManager accountManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        AccountManager accountManager2 = accountManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()[Landroid/accounts/Account;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102500, "android/accounts/AccountManager", "getAccounts", accountManager2, objArr, "android.accounts.Account[]", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102500, "android/accounts/AccountManager", "getAccounts", null, objArr, accountManager2, c0wzw, false);
            return (Account[]) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            accountManager2 = (AccountManager) obj;
        }
        Account[] accounts = accountManager2.getAccounts();
        c0wst.LIZ(102500, "android/accounts/AccountManager", "getAccounts", accounts, objArr, accountManager2, c0wzw, true);
        return accounts;
    }

    public static List LJI(ActivityManager activityManager, C0WZX c0wzx) throws Throwable {
        int i;
        int iIntValue;
        ActivityManager activityManager2 = activityManager;
        C0WST c0wst = new C0WST();
        int iIntValue2 = 1;
        Object[] objArr = {1, 1};
        C0WZW c0wzw = new C0WZW(false, "(II)Ljava/util/List;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(101300, "android/app/ActivityManager", "getRecentTasks", activityManager2, objArr, "java.util.List", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(101300, "android/app/ActivityManager", "getRecentTasks", null, objArr, activityManager2, c0wzw, false);
            return (List) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activityManager2 = (ActivityManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            } else {
                iIntValue = 1;
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                iIntValue2 = ((Integer) obj3).intValue();
            }
            i = iIntValue2;
            iIntValue2 = iIntValue;
        } else {
            i = 1;
        }
        List<ActivityManager.RecentTaskInfo> recentTasks = activityManager2.getRecentTasks(iIntValue2, i);
        c0wst.LIZ(101300, "android/app/ActivityManager", "getRecentTasks", recentTasks, objArr, activityManager2, c0wzw, true);
        return recentTasks;
    }

    public static List LJII(ActivityManager activityManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        ActivityManager activityManager2 = activityManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/util/List;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2788, "android/app/ActivityManager", "getRunningAppProcesses", activityManager2, objArr, "java.util.List", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2788, "android/app/ActivityManager", "getRunningAppProcesses", null, objArr, activityManager2, c0wzw, false);
            return (List) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            activityManager2 = (ActivityManager) obj;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager2.getRunningAppProcesses();
        c0wst.LIZ(2788, "android/app/ActivityManager", "getRunningAppProcesses", runningAppProcesses, objArr, activityManager2, c0wzw, true);
        return runningAppProcesses;
    }

    public static List LJIIIZ(ActivityManager activityManager, C0WZX c0wzx) throws Throwable {
        ActivityManager activityManager2 = activityManager;
        C0WST c0wst = new C0WST();
        int iIntValue = 1;
        Object[] objArr = {1};
        C0WZW c0wzw = new C0WZW(false, "(I)Ljava/util/List;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(101301, "android/app/ActivityManager", "getRunningTasks", activityManager2, objArr, "java.util.List", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(101301, "android/app/ActivityManager", "getRunningTasks", null, objArr, activityManager2, c0wzw, false);
            return (List) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activityManager2 = (ActivityManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager2.getRunningTasks(iIntValue);
        c0wst.LIZ(101301, "android/app/ActivityManager", "getRunningTasks", runningTasks, objArr, activityManager2, c0wzw, true);
        return runningTasks;
    }

    public static String LJJIII(BluetoothDevice bluetoothDevice, C0WZX c0wzx) throws Throwable {
        Object obj;
        BluetoothDevice bluetoothDevice2 = bluetoothDevice;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100014, "android/bluetooth/BluetoothDevice", "getAddress", bluetoothDevice2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100014, "android/bluetooth/BluetoothDevice", "getAddress", null, objArr, bluetoothDevice2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            bluetoothDevice2 = (BluetoothDevice) obj;
        }
        String address = bluetoothDevice2.getAddress();
        c0wst.LIZ(100014, "android/bluetooth/BluetoothDevice", "getAddress", address, objArr, bluetoothDevice2, c0wzw, true);
        return address;
    }

    public static CharSequence LJJIIJ(ClipData.Item item, C0WZX c0wzx) throws Throwable {
        Object obj;
        ClipData.Item item2 = item;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/CharSequence;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10077, "android/content/ClipData$Item", "getText", item2, objArr, "java.lang.CharSequence", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10077, "android/content/ClipData$Item", "getText", null, objArr, item2, c0wzw, false);
            return (CharSequence) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            item2 = (ClipData.Item) obj;
        }
        CharSequence text = item2.getText();
        c0wst.LIZ(10077, "android/content/ClipData$Item", "getText", text, objArr, item2, c0wzw, true);
        return text;
    }

    public static void LJJIIZI(ClipboardManager clipboardManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        ClipboardManager clipboardManager2 = clipboardManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(101800, "android/content/ClipboardManager", "clearPrimaryClip", clipboardManager2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(101800, "android/content/ClipboardManager", "clearPrimaryClip", null, objArr, clipboardManager2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            clipboardManager2 = (ClipboardManager) obj;
        }
        clipboardManager2.clearPrimaryClip();
        c0wst.LIZ(101800, "android/content/ClipboardManager", "clearPrimaryClip", null, objArr, clipboardManager2, c0wzw, true);
    }

    public static ClipData LJJIJ(ClipboardManager clipboardManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        ClipboardManager clipboardManager2 = clipboardManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/content/ClipData;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(101803, "android/content/ClipboardManager", "getPrimaryClip", clipboardManager2, objArr, "android.content.ClipData", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(101803, "android/content/ClipboardManager", "getPrimaryClip", null, objArr, clipboardManager2, c0wzw, false);
            return (ClipData) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            clipboardManager2 = (ClipboardManager) obj;
        }
        ClipData primaryClip = clipboardManager2.getPrimaryClip();
        c0wst.LIZ(101803, "android/content/ClipboardManager", "getPrimaryClip", primaryClip, objArr, clipboardManager2, c0wzw, true);
        return primaryClip;
    }

    public static String LJJIJIIJIL(ComponentName componentName, C0WZX c0wzx) throws Throwable {
        Object obj;
        ComponentName componentName2 = componentName;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10025, "android/content/ComponentName", "getClassName", componentName2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10025, "android/content/ComponentName", "getClassName", null, objArr, componentName2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            componentName2 = (ComponentName) obj;
        }
        String className = componentName2.getClassName();
        c0wst.LIZ(10025, "android/content/ComponentName", "getClassName", className, objArr, componentName2, c0wzw, true);
        return className;
    }

    public static String LJJIJIL(ComponentName componentName, C0WZX c0wzx) throws Throwable {
        Object obj;
        ComponentName componentName2 = componentName;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10026, "android/content/ComponentName", "getPackageName", componentName2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10026, "android/content/ComponentName", "getPackageName", null, objArr, componentName2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            componentName2 = (ComponentName) obj;
        }
        String packageName = componentName2.getPackageName();
        c0wst.LIZ(10026, "android/content/ComponentName", "getPackageName", packageName, objArr, componentName2, c0wzw, true);
        return packageName;
    }

    public static Camera LJJJJZI(int i, C0WZX c0wzx) throws Throwable {
        Object obj;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(i)};
        C0WZW c0wzw = new C0WZW(false, "(I)Landroid/hardware/Camera;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100100, "android/hardware/Camera", "open", Camera.class, objArr, "android.hardware.Camera", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100100, "android/hardware/Camera", "open", null, objArr, Camera.class, c0wzw, false);
            return (Camera) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            i = ((Integer) obj).intValue();
        }
        Camera cameraOpen = Camera.open(i);
        c0wst.LIZ(100100, "android/hardware/Camera", "open", cameraOpen, objArr, Camera.class, c0wzw, true);
        return cameraOpen;
    }

    public static void LJJJLL(Camera camera, C0WZX c0wzx) throws Throwable {
        Object obj;
        Camera camera2 = camera;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100101, "android/hardware/Camera", "release", camera2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100101, "android/hardware/Camera", "release", null, objArr, camera2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            camera2 = (Camera) obj;
        }
        camera2.release();
        c0wst.LIZ(100101, "android/hardware/Camera", "release", null, objArr, camera2, c0wzw, true);
    }

    public static void LJJJLZIJ(Camera camera, C0WZX c0wzx) throws Throwable {
        Object obj;
        Camera camera2 = camera;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100102, "android/hardware/Camera", "startPreview", camera2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100102, "android/hardware/Camera", "startPreview", null, objArr, camera2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            camera2 = (Camera) obj;
        }
        camera2.startPreview();
        c0wst.LIZ(100102, "android/hardware/Camera", "startPreview", null, objArr, camera2, c0wzw, true);
    }

    public static void LJJJZ(Camera camera, C0WZX c0wzx) throws Throwable {
        Object obj;
        Camera camera2 = camera;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100103, "android/hardware/Camera", "stopPreview", camera2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            camera2 = (Camera) obj;
        }
        camera2.stopPreview();
        c0wst.LIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera2, c0wzw, true);
    }

    public static String LJJLIIIJJIZ(Sensor sensor, C0WZX c0wzx) throws Throwable {
        Object obj;
        Sensor sensor2 = sensor;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10067, "android/hardware/Sensor", "getName", sensor2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10067, "android/hardware/Sensor", "getName", null, objArr, sensor2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            sensor2 = (Sensor) obj;
        }
        String name = sensor2.getName();
        c0wst.LIZ(10067, "android/hardware/Sensor", "getName", name, objArr, sensor2, c0wzw, true);
        return name;
    }

    public static float LJJLIIIJL(Sensor sensor, C0WZX c0wzx) throws Throwable {
        Object obj;
        Sensor sensor2 = sensor;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()F", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10068, "android/hardware/Sensor", "getPower", sensor2, objArr, "float", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10068, "android/hardware/Sensor", "getPower", null, objArr, sensor2, c0wzw, false);
            return ((Float) c0wsuLIZIZ.LIZIZ).floatValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            sensor2 = (Sensor) obj;
        }
        float power = sensor2.getPower();
        c0wst.LIZ(10068, "android/hardware/Sensor", "getPower", Float.valueOf(power), objArr, sensor2, c0wzw, true);
        return power;
    }

    public static int LJJLIIIJLJLI(Sensor sensor, C0WZX c0wzx) throws Throwable {
        Object obj;
        Sensor sensor2 = sensor;
        if (C1229804rY.LIZ) {
            return sensor2.getType();
        }
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10070, "android/hardware/Sensor", "getType", sensor2, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10070, "android/hardware/Sensor", "getType", null, objArr, sensor2, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            sensor2 = (Sensor) obj;
        }
        int type = sensor2.getType();
        c0wst.LIZ(10070, "android/hardware/Sensor", "getType", Integer.valueOf(type), objArr, sensor2, c0wzw, true);
        return type;
    }

    public static void LJJLIIIJLLLLLLLZ(CameraDevice cameraDevice, C0WZX c0wzx) throws Throwable {
        Object obj;
        CameraDevice cameraDevice2 = cameraDevice;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100201, "android/hardware/camera2/CameraDevice", "close", cameraDevice2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100201, "android/hardware/camera2/CameraDevice", "close", null, objArr, cameraDevice2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            cameraDevice2 = (CameraDevice) obj;
        }
        cameraDevice2.close();
        c0wst.LIZ(100201, "android/hardware/camera2/CameraDevice", "close", null, objArr, cameraDevice2, c0wzw, true);
    }

    public static String LJJLIL(Address address, C0WZX c0wzx) throws Throwable {
        Object obj;
        Address address2 = address;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10895, "android/location/Address", "getCountryCode", address2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10895, "android/location/Address", "getCountryCode", null, objArr, address2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            address2 = (Address) obj;
        }
        String countryCode = address2.getCountryCode();
        c0wst.LIZ(10895, "android/location/Address", "getCountryCode", countryCode, objArr, address2, c0wzw, true);
        return countryCode;
    }

    public static String LJJLJ(Address address, C0WZX c0wzx) throws Throwable {
        Object obj;
        Address address2 = address;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10896, "android/location/Address", "getCountryName", address2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10896, "android/location/Address", "getCountryName", null, objArr, address2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            address2 = (Address) obj;
        }
        String countryName = address2.getCountryName();
        c0wst.LIZ(10896, "android/location/Address", "getCountryName", countryName, objArr, address2, c0wzw, true);
        return countryName;
    }

    public static double LJJZ(Location location, C0WZX c0wzx) throws Throwable {
        Object obj;
        Location location2 = location;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()D", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10154, "android/location/Location", "getLatitude", location2, objArr, "double", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10154, "android/location/Location", "getLatitude", null, objArr, location2, c0wzw, false);
            return ((Double) c0wsuLIZIZ.LIZIZ).doubleValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            location2 = (Location) obj;
        }
        double latitude = location2.getLatitude();
        c0wst.LIZ(10154, "android/location/Location", "getLatitude", Double.valueOf(latitude), objArr, location2, c0wzw, true);
        return latitude;
    }

    public static double LJJZZI(Location location, C0WZX c0wzx) throws Throwable {
        Object obj;
        Location location2 = location;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()D", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10155, "android/location/Location", "getLongitude", location2, objArr, "double", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10155, "android/location/Location", "getLongitude", null, objArr, location2, c0wzw, false);
            return ((Double) c0wsuLIZIZ.LIZIZ).doubleValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            location2 = (Location) obj;
        }
        double longitude = location2.getLongitude();
        c0wst.LIZ(10155, "android/location/Location", "getLongitude", Double.valueOf(longitude), objArr, location2, c0wzw, true);
        return longitude;
    }

    public static void LJLI(AudioRecord audioRecord, C0WZX c0wzx) throws Throwable {
        Object obj;
        AudioRecord audioRecord2 = audioRecord;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100403, "android/media/AudioRecord", "release", audioRecord2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100403, "android/media/AudioRecord", "release", null, objArr, audioRecord2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            audioRecord2 = (AudioRecord) obj;
        }
        audioRecord2.release();
        c0wst.LIZ(100403, "android/media/AudioRecord", "release", null, objArr, audioRecord2, c0wzw, true);
    }

    public static void LJLIIIL(AudioRecord audioRecord, C0WZX c0wzx) throws Throwable {
        Object obj;
        AudioRecord audioRecord2 = audioRecord;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100400, "android/media/AudioRecord", "startRecording", audioRecord2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100400, "android/media/AudioRecord", "startRecording", null, objArr, audioRecord2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            audioRecord2 = (AudioRecord) obj;
        }
        audioRecord2.startRecording();
        c0wst.LIZ(100400, "android/media/AudioRecord", "startRecording", null, objArr, audioRecord2, c0wzw, true);
    }

    public static void LJLIIL(AudioRecord audioRecord, C0WZX c0wzx) throws Throwable {
        Object obj;
        AudioRecord audioRecord2 = audioRecord;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100401, "android/media/AudioRecord", "stop", audioRecord2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100401, "android/media/AudioRecord", "stop", null, objArr, audioRecord2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            audioRecord2 = (AudioRecord) obj;
        }
        audioRecord2.stop();
        c0wst.LIZ(100401, "android/media/AudioRecord", "stop", null, objArr, audioRecord2, c0wzw, true);
    }

    public static void LJLJJL(MediaProjection mediaProjection, C0WZX c0wzx) throws Throwable {
        Object obj;
        MediaProjection mediaProjection2 = mediaProjection;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102102, "android/media/projection/MediaProjection", "stop", mediaProjection2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102102, "android/media/projection/MediaProjection", "stop", null, objArr, mediaProjection2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            mediaProjection2 = (MediaProjection) obj;
        }
        mediaProjection2.stop();
        c0wst.LIZ(102102, "android/media/projection/MediaProjection", "stop", null, objArr, mediaProjection2, c0wzw, true);
    }

    public static List LJLJLJ(LinkProperties linkProperties, C0WZX c0wzx) throws Throwable {
        Object obj;
        LinkProperties linkProperties2 = linkProperties;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/util/List;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10201, "android/net/LinkProperties", "getDnsServers", linkProperties2, objArr, "java.util.List", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10201, "android/net/LinkProperties", "getDnsServers", null, objArr, linkProperties2, c0wzw, false);
            return (List) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            linkProperties2 = (LinkProperties) obj;
        }
        List<InetAddress> dnsServers = linkProperties2.getDnsServers();
        c0wst.LIZ(10201, "android/net/LinkProperties", "getDnsServers", dnsServers, objArr, linkProperties2, c0wzw, true);
        return dnsServers;
    }

    public static String LJLJLLL(NetworkInfo networkInfo, C0WZX c0wzx) throws Throwable {
        Object obj;
        NetworkInfo networkInfo2 = networkInfo;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10218, "android/net/NetworkInfo", "getExtraInfo", networkInfo2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10218, "android/net/NetworkInfo", "getExtraInfo", null, objArr, networkInfo2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            networkInfo2 = (NetworkInfo) obj;
        }
        String extraInfo = networkInfo2.getExtraInfo();
        c0wst.LIZ(10218, "android/net/NetworkInfo", "getExtraInfo", extraInfo, objArr, networkInfo2, c0wzw, true);
        return extraInfo;
    }

    public static int LJLL(NetworkInfo networkInfo, C0WZX c0wzx) throws Throwable {
        Object obj;
        NetworkInfo networkInfo2 = networkInfo;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10214, "android/net/NetworkInfo", "getSubtype", networkInfo2, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10214, "android/net/NetworkInfo", "getSubtype", null, objArr, networkInfo2, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            networkInfo2 = (NetworkInfo) obj;
        }
        int subtype = networkInfo2.getSubtype();
        c0wst.LIZ(10214, "android/net/NetworkInfo", "getSubtype", Integer.valueOf(subtype), objArr, networkInfo2, c0wzw, true);
        return subtype;
    }

    public static String LJLLI(NetworkInfo networkInfo, C0WZX c0wzx) throws Throwable {
        Object obj;
        NetworkInfo networkInfo2 = networkInfo;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10215, "android/net/NetworkInfo", "getSubtypeName", networkInfo2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10215, "android/net/NetworkInfo", "getSubtypeName", null, objArr, networkInfo2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            networkInfo2 = (NetworkInfo) obj;
        }
        String subtypeName = networkInfo2.getSubtypeName();
        c0wst.LIZ(10215, "android/net/NetworkInfo", "getSubtypeName", subtypeName, objArr, networkInfo2, c0wzw, true);
        return subtypeName;
    }

    public static int LJLLILLLL(NetworkInfo networkInfo, C0WZX c0wzx) throws Throwable {
        Object obj;
        NetworkInfo networkInfo2 = networkInfo;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10216, "android/net/NetworkInfo", "getType", networkInfo2, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10216, "android/net/NetworkInfo", "getType", null, objArr, networkInfo2, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            networkInfo2 = (NetworkInfo) obj;
        }
        int type = networkInfo2.getType();
        c0wst.LIZ(10216, "android/net/NetworkInfo", "getType", Integer.valueOf(type), objArr, networkInfo2, c0wzw, true);
        return type;
    }

    public static String LJLLJ(NetworkInfo networkInfo, C0WZX c0wzx) throws Throwable {
        Object obj;
        NetworkInfo networkInfo2 = networkInfo;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10217, "android/net/NetworkInfo", "getTypeName", networkInfo2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10217, "android/net/NetworkInfo", "getTypeName", null, objArr, networkInfo2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            networkInfo2 = (NetworkInfo) obj;
        }
        String typeName = networkInfo2.getTypeName();
        c0wst.LIZ(10217, "android/net/NetworkInfo", "getTypeName", typeName, objArr, networkInfo2, c0wzw, true);
        return typeName;
    }

    public static String LJLLL(WifiInfo wifiInfo, C0WZX c0wzx) throws Throwable {
        Object obj;
        WifiInfo wifiInfo2 = wifiInfo;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(101100, "android/net/wifi/WifiInfo", "getBSSID", wifiInfo2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(101100, "android/net/wifi/WifiInfo", "getBSSID", null, objArr, wifiInfo2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            wifiInfo2 = (WifiInfo) obj;
        }
        String bssid = wifiInfo2.getBSSID();
        c0wst.LIZ(101100, "android/net/wifi/WifiInfo", "getBSSID", bssid, objArr, wifiInfo2, c0wzw, true);
        return bssid;
    }

    public static int LJLLLL(WifiInfo wifiInfo, C0WZX c0wzx) throws Throwable {
        Object obj;
        WifiInfo wifiInfo2 = wifiInfo;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10229, "android/net/wifi/WifiInfo", "getFrequency", wifiInfo2, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10229, "android/net/wifi/WifiInfo", "getFrequency", null, objArr, wifiInfo2, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            wifiInfo2 = (WifiInfo) obj;
        }
        int frequency = wifiInfo2.getFrequency();
        c0wst.LIZ(10229, "android/net/wifi/WifiInfo", "getFrequency", Integer.valueOf(frequency), objArr, wifiInfo2, c0wzw, true);
        return frequency;
    }

    public static int LJLLLLLL(WifiInfo wifiInfo, C0WZX c0wzx) throws Throwable {
        Object obj;
        WifiInfo wifiInfo2 = wifiInfo;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10228, "android/net/wifi/WifiInfo", "getRssi", wifiInfo2, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10228, "android/net/wifi/WifiInfo", "getRssi", null, objArr, wifiInfo2, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            wifiInfo2 = (WifiInfo) obj;
        }
        int rssi = wifiInfo2.getRssi();
        c0wst.LIZ(10228, "android/net/wifi/WifiInfo", "getRssi", Integer.valueOf(rssi), objArr, wifiInfo2, c0wzw, true);
        return rssi;
    }

    public static String LJLZ(WifiInfo wifiInfo, C0WZX c0wzx) throws Throwable {
        Object obj;
        WifiInfo wifiInfo2 = wifiInfo;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(101000, "android/net/wifi/WifiInfo", "getSSID", wifiInfo2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(101000, "android/net/wifi/WifiInfo", "getSSID", null, objArr, wifiInfo2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            wifiInfo2 = (WifiInfo) obj;
        }
        String ssid = wifiInfo2.getSSID();
        c0wst.LIZ(101000, "android/net/wifi/WifiInfo", "getSSID", ssid, objArr, wifiInfo2, c0wzw, true);
        return ssid;
    }

    public static WifiInfo LJZ(WifiManager wifiManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        WifiManager wifiManager2 = wifiManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/net/wifi/WifiInfo;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102301, "android/net/wifi/WifiManager", "getConnectionInfo", wifiManager2, objArr, "android.net.wifi.WifiInfo", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102301, "android/net/wifi/WifiManager", "getConnectionInfo", null, objArr, wifiManager2, c0wzw, false);
            return (WifiInfo) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            wifiManager2 = (WifiManager) obj;
        }
        WifiInfo connectionInfo = wifiManager2.getConnectionInfo();
        c0wst.LIZ(102301, "android/net/wifi/WifiManager", "getConnectionInfo", connectionInfo, objArr, wifiManager2, c0wzw, true);
        return connectionInfo;
    }

    public static DhcpInfo LJZI(WifiManager wifiManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        WifiManager wifiManager2 = wifiManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/net/DhcpInfo;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10974, "android/net/wifi/WifiManager", "getDhcpInfo", wifiManager2, objArr, "android.net.DhcpInfo", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10974, "android/net/wifi/WifiManager", "getDhcpInfo", null, objArr, wifiManager2, c0wzw, false);
            return (DhcpInfo) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            wifiManager2 = (WifiManager) obj;
        }
        DhcpInfo dhcpInfo = wifiManager2.getDhcpInfo();
        c0wst.LIZ(10974, "android/net/wifi/WifiManager", "getDhcpInfo", dhcpInfo, objArr, wifiManager2, c0wzw, true);
        return dhcpInfo;
    }

    public static List LJZL(WifiManager wifiManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        WifiManager wifiManager2 = wifiManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/util/List;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102300, "android/net/wifi/WifiManager", "getScanResults", wifiManager2, objArr, "java.util.List", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102300, "android/net/wifi/WifiManager", "getScanResults", null, objArr, wifiManager2, c0wzw, false);
            return (List) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            wifiManager2 = (WifiManager) obj;
        }
        List<ScanResult> scanResults = wifiManager2.getScanResults();
        c0wst.LIZ(102300, "android/net/wifi/WifiManager", "getScanResults", scanResults, objArr, wifiManager2, c0wzw, true);
        return scanResults;
    }

    public static int LLF(StatFs statFs, C0WZX c0wzx) throws Throwable {
        Object obj;
        StatFs statFs2 = statFs;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2907, "android/os/StatFs", "getAvailableBlocks", statFs2, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2907, "android/os/StatFs", "getAvailableBlocks", null, objArr, statFs2, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            statFs2 = (StatFs) obj;
        }
        int availableBlocks = statFs2.getAvailableBlocks();
        c0wst.LIZ(2907, "android/os/StatFs", "getAvailableBlocks", Integer.valueOf(availableBlocks), objArr, statFs2, c0wzw, true);
        return availableBlocks;
    }

    public static long LLFF(StatFs statFs, C0WZX c0wzx) throws Throwable {
        Object obj;
        StatFs statFs2 = statFs;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()J", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10888, "android/os/StatFs", "getAvailableBlocksLong", statFs2, objArr, "long", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10888, "android/os/StatFs", "getAvailableBlocksLong", null, objArr, statFs2, c0wzw, false);
            return ((Long) c0wsuLIZIZ.LIZIZ).longValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            statFs2 = (StatFs) obj;
        }
        long availableBlocksLong = statFs2.getAvailableBlocksLong();
        c0wst.LIZ(10888, "android/os/StatFs", "getAvailableBlocksLong", Long.valueOf(availableBlocksLong), objArr, statFs2, c0wzw, true);
        return availableBlocksLong;
    }

    public static long LLFFF(StatFs statFs, C0WZX c0wzx) throws Throwable {
        Object obj;
        StatFs statFs2 = statFs;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()J", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10889, "android/os/StatFs", "getAvailableBytes", statFs2, objArr, "long", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10889, "android/os/StatFs", "getAvailableBytes", null, objArr, statFs2, c0wzw, false);
            return ((Long) c0wsuLIZIZ.LIZIZ).longValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            statFs2 = (StatFs) obj;
        }
        long availableBytes = statFs2.getAvailableBytes();
        c0wst.LIZ(10889, "android/os/StatFs", "getAvailableBytes", Long.valueOf(availableBytes), objArr, statFs2, c0wzw, true);
        return availableBytes;
    }

    public static int LLFII(StatFs statFs, C0WZX c0wzx) throws Throwable {
        Object obj;
        StatFs statFs2 = statFs;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2918, "android/os/StatFs", "getBlockCount", statFs2, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2918, "android/os/StatFs", "getBlockCount", null, objArr, statFs2, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            statFs2 = (StatFs) obj;
        }
        int blockCount = statFs2.getBlockCount();
        c0wst.LIZ(2918, "android/os/StatFs", "getBlockCount", Integer.valueOf(blockCount), objArr, statFs2, c0wzw, true);
        return blockCount;
    }

    public static long LLFZ(StatFs statFs, C0WZX c0wzx) throws Throwable {
        Object obj;
        StatFs statFs2 = statFs;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()J", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(4164, "android/os/StatFs", "getBlockCountLong", statFs2, objArr, "long", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(4164, "android/os/StatFs", "getBlockCountLong", null, objArr, statFs2, c0wzw, false);
            return ((Long) c0wsuLIZIZ.LIZIZ).longValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            statFs2 = (StatFs) obj;
        }
        long blockCountLong = statFs2.getBlockCountLong();
        c0wst.LIZ(4164, "android/os/StatFs", "getBlockCountLong", Long.valueOf(blockCountLong), objArr, statFs2, c0wzw, true);
        return blockCountLong;
    }

    public static int LLI(StatFs statFs, C0WZX c0wzx) throws Throwable {
        Object obj;
        StatFs statFs2 = statFs;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2883, "android/os/StatFs", "getBlockSize", statFs2, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2883, "android/os/StatFs", "getBlockSize", null, objArr, statFs2, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            statFs2 = (StatFs) obj;
        }
        int blockSize = statFs2.getBlockSize();
        c0wst.LIZ(2883, "android/os/StatFs", "getBlockSize", Integer.valueOf(blockSize), objArr, statFs2, c0wzw, true);
        return blockSize;
    }

    public static long LLIFFJFJJ(StatFs statFs, C0WZX c0wzx) throws Throwable {
        Object obj;
        StatFs statFs2 = statFs;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()J", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(4163, "android/os/StatFs", "getBlockSizeLong", statFs2, objArr, "long", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(4163, "android/os/StatFs", "getBlockSizeLong", null, objArr, statFs2, c0wzw, false);
            return ((Long) c0wsuLIZIZ.LIZIZ).longValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            statFs2 = (StatFs) obj;
        }
        long blockSizeLong = statFs2.getBlockSizeLong();
        c0wst.LIZ(4163, "android/os/StatFs", "getBlockSizeLong", Long.valueOf(blockSizeLong), objArr, statFs2, c0wzw, true);
        return blockSizeLong;
    }

    public static long LLII(StatFs statFs, C0WZX c0wzx) throws Throwable {
        Object obj;
        StatFs statFs2 = statFs;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()J", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10885, "android/os/StatFs", "getFreeBytes", statFs2, objArr, "long", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10885, "android/os/StatFs", "getFreeBytes", null, objArr, statFs2, c0wzw, false);
            return ((Long) c0wsuLIZIZ.LIZIZ).longValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            statFs2 = (StatFs) obj;
        }
        long freeBytes = statFs2.getFreeBytes();
        c0wst.LIZ(10885, "android/os/StatFs", "getFreeBytes", Long.valueOf(freeBytes), objArr, statFs2, c0wzw, true);
        return freeBytes;
    }

    public static long LLIIII(StatFs statFs, C0WZX c0wzx) throws Throwable {
        Object obj;
        StatFs statFs2 = statFs;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()J", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10890, "android/os/StatFs", "getTotalBytes", statFs2, objArr, "long", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10890, "android/os/StatFs", "getTotalBytes", null, objArr, statFs2, c0wzw, false);
            return ((Long) c0wsuLIZIZ.LIZIZ).longValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            statFs2 = (StatFs) obj;
        }
        long totalBytes = statFs2.getTotalBytes();
        c0wst.LIZ(10890, "android/os/StatFs", "getTotalBytes", Long.valueOf(totalBytes), objArr, statFs2, c0wzw, true);
        return totalBytes;
    }

    public static boolean LLIIIILZ(UserManager userManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        UserManager userManager2 = userManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Z", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(1063, "android/os/UserManager", "isUserUnlocked", userManager2, objArr, "boolean", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(1063, "android/os/UserManager", "isUserUnlocked", null, objArr, userManager2, c0wzw, false);
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            userManager2 = (UserManager) obj;
        }
        boolean zIsUserUnlocked = userManager2.isUserUnlocked();
        c0wst.LIZ(1063, "android/os/UserManager", "isUserUnlocked", Boolean.valueOf(zIsUserUnlocked), objArr, userManager2, c0wzw, true);
        return zIsUserUnlocked;
    }

    public static List LLIIJI(TelephonyManager telephonyManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        TelephonyManager telephonyManager2 = telephonyManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/util/List;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100909, "android/telephony/TelephonyManager", "getAllCellInfo", telephonyManager2, objArr, "java.util.List", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100909, "android/telephony/TelephonyManager", "getAllCellInfo", null, objArr, telephonyManager2, c0wzw, false);
            return (List) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            telephonyManager2 = (TelephonyManager) obj;
        }
        List<CellInfo> allCellInfo = telephonyManager2.getAllCellInfo();
        c0wst.LIZ(100909, "android/telephony/TelephonyManager", "getAllCellInfo", allCellInfo, objArr, telephonyManager2, c0wzw, true);
        return allCellInfo;
    }

    public static String LLIIJLIL(TelephonyManager telephonyManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        TelephonyManager telephonyManager2 = telephonyManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100919, "android/telephony/TelephonyManager", "getNetworkOperator", telephonyManager2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100919, "android/telephony/TelephonyManager", "getNetworkOperator", null, objArr, telephonyManager2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            telephonyManager2 = (TelephonyManager) obj;
        }
        String networkOperator = telephonyManager2.getNetworkOperator();
        c0wst.LIZ(100919, "android/telephony/TelephonyManager", "getNetworkOperator", networkOperator, objArr, telephonyManager2, c0wzw, true);
        return networkOperator;
    }

    public static String LLIIL(TelephonyManager telephonyManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        TelephonyManager telephonyManager2 = telephonyManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100920, "android/telephony/TelephonyManager", "getNetworkOperatorName", telephonyManager2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100920, "android/telephony/TelephonyManager", "getNetworkOperatorName", null, objArr, telephonyManager2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            telephonyManager2 = (TelephonyManager) obj;
        }
        String networkOperatorName = telephonyManager2.getNetworkOperatorName();
        c0wst.LIZ(100920, "android/telephony/TelephonyManager", "getNetworkOperatorName", networkOperatorName, objArr, telephonyManager2, c0wzw, true);
        return networkOperatorName;
    }

    public static int LLIILII(TelephonyManager telephonyManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        TelephonyManager telephonyManager2 = telephonyManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", telephonyManager2, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", null, objArr, telephonyManager2, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            telephonyManager2 = (TelephonyManager) obj;
        }
        int networkType = telephonyManager2.getNetworkType();
        c0wst.LIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", Integer.valueOf(networkType), objArr, telephonyManager2, c0wzw, true);
        return networkType;
    }

    public static int LLIILZL(TelephonyManager telephonyManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        TelephonyManager telephonyManager2 = telephonyManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10907, "android/telephony/TelephonyManager", "getPhoneType", telephonyManager2, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10907, "android/telephony/TelephonyManager", "getPhoneType", null, objArr, telephonyManager2, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            telephonyManager2 = (TelephonyManager) obj;
        }
        int phoneType = telephonyManager2.getPhoneType();
        c0wst.LIZ(10907, "android/telephony/TelephonyManager", "getPhoneType", Integer.valueOf(phoneType), objArr, telephonyManager2, c0wzw, true);
        return phoneType;
    }

    public static String LLIIZ(TelephonyManager telephonyManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        TelephonyManager telephonyManager2 = telephonyManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100922, "android/telephony/TelephonyManager", "getSimCountryIso", telephonyManager2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100922, "android/telephony/TelephonyManager", "getSimCountryIso", null, objArr, telephonyManager2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            telephonyManager2 = (TelephonyManager) obj;
        }
        String simCountryIso = telephonyManager2.getSimCountryIso();
        c0wst.LIZ(100922, "android/telephony/TelephonyManager", "getSimCountryIso", simCountryIso, objArr, telephonyManager2, c0wzw, true);
        return simCountryIso;
    }

    public static String LLIL(TelephonyManager telephonyManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        TelephonyManager telephonyManager2 = telephonyManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100917, "android/telephony/TelephonyManager", "getSimOperator", telephonyManager2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100917, "android/telephony/TelephonyManager", "getSimOperator", null, objArr, telephonyManager2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            telephonyManager2 = (TelephonyManager) obj;
        }
        String simOperator = telephonyManager2.getSimOperator();
        c0wst.LIZ(100917, "android/telephony/TelephonyManager", "getSimOperator", simOperator, objArr, telephonyManager2, c0wzw, true);
        return simOperator;
    }

    public static String LLILII(TelephonyManager telephonyManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        TelephonyManager telephonyManager2 = telephonyManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100918, "android/telephony/TelephonyManager", "getSimOperatorName", telephonyManager2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100918, "android/telephony/TelephonyManager", "getSimOperatorName", null, objArr, telephonyManager2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            telephonyManager2 = (TelephonyManager) obj;
        }
        String simOperatorName = telephonyManager2.getSimOperatorName();
        c0wst.LIZ(100918, "android/telephony/TelephonyManager", "getSimOperatorName", simOperatorName, objArr, telephonyManager2, c0wzw, true);
        return simOperatorName;
    }

    public static Bitmap LLILLL(View view, C0WZX c0wzx) throws Throwable {
        Object obj;
        View view2 = view;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/graphics/Bitmap;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2826, "android/view/View", "getDrawingCache", view2, objArr, "android.graphics.Bitmap", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2826, "android/view/View", "getDrawingCache", null, objArr, view2, c0wzw, false);
            return (Bitmap) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            view2 = (View) obj;
        }
        Bitmap drawingCache = view2.getDrawingCache();
        c0wst.LIZ(2826, "android/view/View", "getDrawingCache", drawingCache, objArr, view2, c0wzw, true);
        return drawingCache;
    }

    public static WindowMetrics LLILZ(WindowManager windowManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        WindowManager windowManager2 = windowManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/view/WindowMetrics;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(3002, "android/view/WindowManager", "getCurrentWindowMetrics", windowManager2, objArr, "android.view.WindowMetrics", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(3002, "android/view/WindowManager", "getCurrentWindowMetrics", null, objArr, windowManager2, c0wzw, false);
            return (WindowMetrics) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            windowManager2 = (WindowManager) obj;
        }
        WindowMetrics currentWindowMetrics = windowManager2.getCurrentWindowMetrics();
        c0wst.LIZ(3002, "android/view/WindowManager", "getCurrentWindowMetrics", currentWindowMetrics, objArr, windowManager2, c0wzw, true);
        return currentWindowMetrics;
    }

    public static Display LLILZIL(WindowManager windowManager, C0WZX c0wzx) throws Throwable {
        Object obj;
        WindowManager windowManager2 = windowManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/view/Display;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(4068, "android/view/WindowManager", "getDefaultDisplay", windowManager2, objArr, "android.view.Display", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(4068, "android/view/WindowManager", "getDefaultDisplay", null, objArr, windowManager2, c0wzw, false);
            return (Display) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            windowManager2 = (WindowManager) obj;
        }
        Display defaultDisplay = windowManager2.getDefaultDisplay();
        c0wst.LIZ(4068, "android/view/WindowManager", "getDefaultDisplay", defaultDisplay, objArr, windowManager2, c0wzw, true);
        return defaultDisplay;
    }

    public static List LLILZLL(AccessibilityManager accessibilityManager, C0WZX c0wzx) throws Throwable {
        AccessibilityManager accessibilityManager2 = accessibilityManager;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1};
        C0WZW c0wzw = new C0WZW(false, "(I)Ljava/util/List;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(101307, "android/view/accessibility/AccessibilityManager", "getEnabledAccessibilityServiceList", accessibilityManager2, objArr, "java.util.List", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(101307, "android/view/accessibility/AccessibilityManager", "getEnabledAccessibilityServiceList", null, objArr, accessibilityManager2, c0wzw, false);
            return (List) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                accessibilityManager2 = (AccessibilityManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager2.getEnabledAccessibilityServiceList(iIntValue);
        c0wst.LIZ(101307, "android/view/accessibility/AccessibilityManager", "getEnabledAccessibilityServiceList", enabledAccessibilityServiceList, objArr, accessibilityManager2, c0wzw, true);
        return enabledAccessibilityServiceList;
    }

    public static void LLJIJIL(PermissionRequest permissionRequest, C0WZX c0wzx) throws Throwable {
        Object obj;
        PermissionRequest permissionRequest2 = permissionRequest;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102606, "android/webkit/PermissionRequest", "deny", permissionRequest2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102606, "android/webkit/PermissionRequest", "deny", null, objArr, permissionRequest2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            permissionRequest2 = (PermissionRequest) obj;
        }
        permissionRequest2.deny();
        c0wst.LIZ(102606, "android/webkit/PermissionRequest", "deny", null, objArr, permissionRequest2, c0wzw, true);
    }

    public static Editable LLJILJILJ(EditText editText, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView = editText;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "android/widget/EditText", "getEditableText", textView, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "android/widget/EditText", "getEditableText", null, objArr, textView, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView = (TextView) obj;
        }
        Editable editableText = textView.getEditableText();
        c0wst.LIZ(999, "android/widget/EditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        return editableText;
    }

    public static Editable LLJILLL(EditText editText, C0WZX c0wzx) throws Throwable {
        Object obj;
        EditText editText2 = editText;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "android/widget/EditText", "getText", editText2, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "android/widget/EditText", "getText", null, objArr, editText2, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            editText2 = (EditText) obj;
        }
        Editable text = editText2.getText();
        c0wst.LIZ(998, "android/widget/EditText", "getText", text, objArr, editText2, c0wzw, true);
        return text;
    }

    public static Editable LLJJ(TextView textView, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView2 = textView;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "android/widget/TextView", "getEditableText", textView2, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "android/widget/TextView", "getEditableText", null, objArr, textView2, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView2 = (TextView) obj;
        }
        Editable editableText = textView2.getEditableText();
        c0wst.LIZ(999, "android/widget/TextView", "getEditableText", editableText, objArr, textView2, c0wzw, true);
        return editableText;
    }

    public static Editable LLJJIII(C21410318qb c21410318qb, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb2 = c21410318qb;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "androidx/appcompat/widget/AppCompatEditText", "getText", c21410318qb2, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "androidx/appcompat/widget/AppCompatEditText", "getText", null, objArr, c21410318qb2, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb2 = (C21410318qb) obj;
        }
        Editable text = c21410318qb2.getText();
        c0wst.LIZ(998, "androidx/appcompat/widget/AppCompatEditText", "getText", text, objArr, c21410318qb2, c0wzw, true);
        return text;
    }

    public static void LLL(AppsFlyerLib appsFlyerLib, C0WZX c0wzx) throws Throwable {
        AppsFlyerLib appsFlyerLib2 = appsFlyerLib;
        C0WST c0wst = new C0WST();
        boolean zBooleanValue = true;
        Object[] objArr = {Boolean.TRUE};
        C0WZW c0wzw = new C0WZW(false, "(Z)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11510, "com/appsflyer/AppsFlyerLib", "setCollectAndroidID", appsFlyerLib2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11510, "com/appsflyer/AppsFlyerLib", "setCollectAndroidID", null, objArr, appsFlyerLib2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                appsFlyerLib2 = (AppsFlyerLib) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                zBooleanValue = ((Boolean) obj2).booleanValue();
            }
        }
        appsFlyerLib2.setCollectAndroidID(zBooleanValue);
        c0wst.LIZ(11510, "com/appsflyer/AppsFlyerLib", "setCollectAndroidID", null, objArr, appsFlyerLib2, c0wzw, true);
    }

    public static Editable LLLF(C20586215gy c20586215gy, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView = c20586215gy;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "com/bytedance/android/live/BaseCommentEditText", "getEditableText", textView, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "com/bytedance/android/live/BaseCommentEditText", "getEditableText", null, objArr, textView, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView = (TextView) obj;
        }
        Editable editableText = textView.getEditableText();
        c0wst.LIZ(999, "com/bytedance/android/live/BaseCommentEditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        return editableText;
    }

    public static Editable LLLFF(C20586215gy c20586215gy, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c20586215gy;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/bytedance/android/live/BaseCommentEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/bytedance/android/live/BaseCommentEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/bytedance/android/live/BaseCommentEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLLFFI(LiveEditText liveEditText, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView = liveEditText;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "com/bytedance/android/live/design/widget/LiveEditText", "getEditableText", textView, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "com/bytedance/android/live/design/widget/LiveEditText", "getEditableText", null, objArr, textView, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView = (TextView) obj;
        }
        Editable editableText = textView.getEditableText();
        c0wst.LIZ(999, "com/bytedance/android/live/design/widget/LiveEditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        return editableText;
    }

    public static Editable LLLFZ(LiveEditText liveEditText, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = liveEditText;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/bytedance/android/live/design/widget/LiveEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/bytedance/android/live/design/widget/LiveEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/bytedance/android/live/design/widget/LiveEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLLI(C15P4 c15p4, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c15p4;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/textheader/common/fontstyle/TextFontDslBoardEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/textheader/common/fontstyle/TextFontDslBoardEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/textheader/common/fontstyle/TextFontDslBoardEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLLII(C20586115gx c20586115gx, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView = c20586115gx;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "com/bytedance/android/livesdk/chatroom/ui/CommentEditText", "getEditableText", textView, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "com/bytedance/android/livesdk/chatroom/ui/CommentEditText", "getEditableText", null, objArr, textView, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView = (TextView) obj;
        }
        Editable editableText = textView.getEditableText();
        c0wst.LIZ(999, "com/bytedance/android/livesdk/chatroom/ui/CommentEditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        return editableText;
    }

    public static Editable LLLIIII(C20586115gx c20586115gx, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c20586115gx;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/bytedance/android/livesdk/chatroom/ui/CommentEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/bytedance/android/livesdk/chatroom/ui/CommentEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/bytedance/android/livesdk/chatroom/ui/CommentEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLLIIIIL(C1838520xwY c1838520xwY, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c1838520xwY;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/bulletinpreview/dslboard/DslBoardEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/bulletinpreview/dslboard/DslBoardEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/bulletinpreview/dslboard/DslBoardEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLLIIIL(C1836370xt5 c1836370xt5, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c1836370xt5;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/component/FullyCustomizedBoardFontEditPreviewText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/component/FullyCustomizedBoardFontEditPreviewText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/component/FullyCustomizedBoardFontEditPreviewText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLLIILIL(C20586015gw c20586015gw, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c20586015gw;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/bytedance/android/livesdk/subcription/subspaceeditor/SpaceEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/bytedance/android/livesdk/subcription/subspaceeditor/SpaceEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/bytedance/android/livesdk/subcription/subspaceeditor/SpaceEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLLILZ(1Ov8 r17, C0WZX c0wzx) throws Throwable {
        Object obj;
        1Ov8 r9 = r17;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/bytedance/effectcreatormobile/behaviour/view/card/InnerUnitTextView", "getText", r9, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/bytedance/effectcreatormobile/behaviour/view/card/InnerUnitTextView", "getText", null, objArr, r9, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            r9 = (C21410318qb) obj;
        }
        Editable text = r9.getText();
        c0wst.LIZ(998, "com/bytedance/effectcreatormobile/behaviour/view/card/InnerUnitTextView", "getText", text, objArr, r9, c0wzw, true);
        return text;
    }

    public static void LLLJIL(FastBootBlankActivity fastBootBlankActivity, C0WZX c0wzx) throws Throwable {
        Activity activity = fastBootBlankActivity;
        C0WST c0wst = new C0WST();
        int iIntValue = 2;
        Object[] objArr = {2};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/bytedance/ies/safemode/SmartProtected/fastboot/FastBootBlankActivity", "setResult", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/bytedance/ies/safemode/SmartProtected/fastboot/FastBootBlankActivity", "setResult", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        activity.setResult(iIntValue);
        c0wst.LIZ(11071, "com/bytedance/ies/safemode/SmartProtected/fastboot/FastBootBlankActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static Editable LLLL(C21397018oS c21397018oS, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView = c21397018oS;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "com/bytedance/ies/xelement/input/LynxEditText", "getEditableText", textView, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "com/bytedance/ies/xelement/input/LynxEditText", "getEditableText", null, objArr, textView, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView = (TextView) obj;
        }
        Editable editableText = textView.getEditableText();
        c0wst.LIZ(999, "com/bytedance/ies/xelement/input/LynxEditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        return editableText;
    }

    public static Editable LLLLII(C21397018oS c21397018oS, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c21397018oS;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/bytedance/ies/xelement/input/LynxEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/bytedance/ies/xelement/input/LynxEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/bytedance/ies/xelement/input/LynxEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Retrofit LLLLIIIILLL(C1515200pX4 c1515200pX4, C0WZX c0wzx) throws Throwable {
        Object obj;
        C1515200pX4 c1515200pX42 = c1515200pX4;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400200, "com/bytedance/retrofit2/Retrofit$Builder", "build", c1515200pX42, new Object[0], "com.bytedance.retrofit2.Retrofit", new C0WZW(false, "()Lcom/bytedance/retrofit2/Retrofit;", c0wzx));
        if (c0wsuLIZIZ.LIZ) {
            return (Retrofit) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            c1515200pX42 = (C1515200pX4) obj;
        }
        if (c1515200pX42.LIZJ != null) {
            if (c1515200pX42.LIZIZ != null) {
                if (c1515200pX42.LJI != null) {
                    Executor executorLIZIZ = c1515200pX42.LIZ.LIZIZ();
                    ArrayList arrayList = new ArrayList(c1515200pX42.LJFF);
                    arrayList.addAll(c1515200pX42.LIZ.LIZ(executorLIZIZ));
                    int size = ((ArrayList) c1515200pX42.LJ).size() + 1;
                    c1515200pX42.LIZ.LIZLLL();
                    ArrayList arrayList2 = new ArrayList(size);
                    arrayList2.add(new AbstractC2343909Gj() { // from class: X.09Dm
                        public boolean LIZ = true;

                        @Override // X.AbstractC2343909Gj
                        public final InterfaceC1501660pBE LIZIZ(Type type) {
                            if (type == C080U.class) {
                                return new InterfaceC1501660pBE<C080U, C080U>() { // from class: X.09Do
                                    @Override // X.InterfaceC1501660pBE
                                    public final C080U LIZ(C080U c080u) {
                                        return c080u;
                                    }
                                };
                            }
                            return null;
                        }

                        @Override // X.AbstractC2343909Gj
                        public final InterfaceC1501660pBE LIZJ(Type type) {
                            if (type == Object.class) {
                                return new InterfaceC1501660pBE<Object, Object>() { // from class: X.09Ds
                                    @Override // X.InterfaceC1501660pBE
                                    public final Object LIZ(Object obj2) {
                                        return obj2;
                                    }
                                };
                            }
                            return null;
                        }

                        @Override // X.AbstractC2343909Gj
                        public final InterfaceC1501660pBE LJFF(Type type) {
                            if (type == String.class) {
                                return new InterfaceC1501660pBE<String, String>() { // from class: X.09Dr
                                    @Override // X.InterfaceC1501660pBE
                                    public final String LIZ(String str) {
                                        return str;
                                    }
                                };
                            }
                            return null;
                        }

                        @Override // X.AbstractC2343909Gj
                        public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
                            if (type == TypedInput.class) {
                                if (C2396109aB.LJIIIIZZ(annotationArr, InterfaceC2174608fY.class)) {
                                    return new InterfaceC1501660pBE<TypedInput, TypedInput>() { // from class: X.09Dq
                                        @Override // X.InterfaceC1501660pBE
                                        public final TypedInput LIZ(TypedInput typedInput) {
                                            return typedInput;
                                        }
                                    };
                                }
                                return new InterfaceC1501660pBE<TypedInput, TypedInput>() { // from class: X.09DP
                                    @Override // X.InterfaceC1501660pBE
                                    public final TypedInput LIZ(TypedInput typedInput) {
                                        TypedInput typedByteArray = typedInput;
                                        if (typedByteArray != null && !(typedByteArray instanceof TypedByteArray)) {
                                            String strMimeType = typedByteArray.mimeType();
                                            InputStream inputStreamIn = typedByteArray.in();
                                            try {
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                if (inputStreamIn != null) {
                                                    byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                                                    while (true) {
                                                        int i = inputStreamIn.read(bArr);
                                                        if (i == -1) {
                                                            break;
                                                        }
                                                        byteArrayOutputStream.write(bArr, 0, i);
                                                    }
                                                }
                                                typedByteArray = new TypedByteArray(strMimeType, byteArrayOutputStream.toByteArray(), new String[0]);
                                                if (inputStreamIn != null) {
                                                    try {
                                                        inputStreamIn.close();
                                                        return typedByteArray;
                                                    } catch (IOException e) {
                                                        TryCatchGuardChecker.doCheck(e);
                                                        return typedByteArray;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                if (inputStreamIn != null) {
                                                    try {
                                                        inputStreamIn.close();
                                                        throw th;
                                                    } catch (IOException e2) {
                                                        TryCatchGuardChecker.doCheck(e2);
                                                        throw th;
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                        return typedByteArray;
                                    }
                                };
                            }
                            if (type == String.class) {
                                return new InterfaceC1501660pBE<TypedInput, String>() { // from class: X.09DQ
                                    @Override // X.InterfaceC1501660pBE
                                    public final String LIZ(TypedInput typedInput) {
                                        TypedInput typedInput2 = typedInput;
                                        if (typedInput2 instanceof TypedByteArray) {
                                            String charset = "UTF-8";
                                            if (typedInput2.mimeType() != null) {
                                                charset = MimeUtil.parseCharset(typedInput2.mimeType(), "UTF-8");
                                            }
                                            return new String(((TypedByteArray) typedInput2).getBytes(), charset);
                                        }
                                        return null;
                                    }
                                };
                            }
                            if (type == Void.class) {
                                return new InterfaceC1501660pBE<TypedInput, Void>() { // from class: X.09DS
                                    @Override // X.InterfaceC1501660pBE
                                    public final Void LIZ(TypedInput typedInput) throws IOException {
                                        InputStream inputStreamIn = typedInput.in();
                                        if (inputStreamIn != null) {
                                            inputStreamIn.close();
                                            return null;
                                        }
                                        return null;
                                    }
                                };
                            }
                            if (this.LIZ && type == Unit.class) {
                                try {
                                    return new InterfaceC1501660pBE<TypedInput, Unit>() { // from class: X.09DR
                                        @Override // X.InterfaceC1501660pBE
                                        public final Unit LIZ(TypedInput typedInput) {
                                            try {
                                                typedInput.in().close();
                                            } catch (IOException e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                            return Unit.LIZ;
                                        }
                                    };
                                } catch (NoClassDefFoundError e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    this.LIZ = false;
                                    return null;
                                }
                            }
                            return null;
                        }

                        @Override // X.AbstractC2343909Gj
                        public final InterfaceC1501660pBE<?, TypedOutput> LIZLLL(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
                            if (TypedOutput.class.isAssignableFrom(C2396109aB.LJFF(type))) {
                                return new InterfaceC1501660pBE<TypedOutput, TypedOutput>() { // from class: X.09Dp
                                    @Override // X.InterfaceC1501660pBE
                                    public final TypedOutput LIZ(TypedOutput typedOutput) {
                                        return typedOutput;
                                    }
                                };
                            }
                            return null;
                        }
                    });
                    arrayList2.addAll(c1515200pX42.LJ);
                    arrayList2.addAll(c1515200pX42.LIZ.LIZJ());
                    if (Retrofit.LJIIIZ != null) {
                        for (InterfaceC1904907d9 interfaceC1904907d9 : Retrofit.LJIIIZ) {
                            if (!((CopyOnWriteArrayList) c1515200pX42.LIZLLL).contains(interfaceC1904907d9)) {
                                ((CopyOnWriteArrayList) c1515200pX42.LIZLLL).add(interfaceC1904907d9);
                            }
                        }
                    }
                    return new Retrofit(c1515200pX42.LIZJ, c1515200pX42.LIZIZ, c1515200pX42.LIZLLL, arrayList2, arrayList, c1515200pX42.LJI, executorLIZIZ);
                }
                throw new IllegalStateException("HttpExecutor may not be null.");
            }
            throw new IllegalStateException("ClientProvider may not be null.");
        }
        throw new IllegalStateException("Endpoint may not be null.");
    }

    public static Editable LLLLIL(C1754690vlL c1754690vlL, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c1754690vlL;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/bytedance/tux/form/pin/PIPOTuxPinFieldEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/bytedance/tux/form/pin/PIPOTuxPinFieldEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/bytedance/tux/form/pin/PIPOTuxPinFieldEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLLLILI(C1754700vlM c1754700vlM, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c1754700vlM;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/bytedance/tux/form/pin/TuxPinFieldEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/bytedance/tux/form/pin/TuxPinFieldEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/bytedance/tux/form/pin/TuxPinFieldEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLLLJ(C0I7D c0i7d, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView = c0i7d;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "com/bytedance/tux/input/TuxEditText", "getEditableText", textView, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "com/bytedance/tux/input/TuxEditText", "getEditableText", null, objArr, textView, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView = (TextView) obj;
        }
        Editable editableText = textView.getEditableText();
        c0wst.LIZ(999, "com/bytedance/tux/input/TuxEditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        return editableText;
    }

    public static Editable LLLLJI(C0I7D c0i7d, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c0i7d;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/bytedance/tux/input/TuxEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/bytedance/tux/input/TuxEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/bytedance/tux/input/TuxEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static String LLLLLIL(AdvertisingIdClient.Info info, C0WZX c0wzx) throws Throwable {
        Object obj;
        AdvertisingIdClient.Info info2 = info;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(3085, "com/google/android/gms/ads/identifier/AdvertisingIdClient$Info", "getId", info2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(3085, "com/google/android/gms/ads/identifier/AdvertisingIdClient$Info", "getId", null, objArr, info2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            info2 = (AdvertisingIdClient.Info) obj;
        }
        String id = info2.getId();
        c0wst.LIZ(3085, "com/google/android/gms/ads/identifier/AdvertisingIdClient$Info", "getId", id, objArr, info2, c0wzw, true);
        return id;
    }

    public static AdvertisingIdClient.Info LLLLLILLIL(Context context, C0WZX c0wzx) throws Throwable {
        Object obj;
        C0WST c0wst = new C0WST();
        Object[] objArr = {context};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", AdvertisingIdClient.class, objArr, "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", null, objArr, AdvertisingIdClient.class, c0wzw, false);
            return (AdvertisingIdClient.Info) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            context = (Context) obj;
        }
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        c0wst.LIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", advertisingIdInfo, objArr, AdvertisingIdClient.class, c0wzw, true);
        return advertisingIdInfo;
    }

    public static AbstractC835450Wpz LLLLLJIL(C833030Wm5 c833030Wm5, C0WZX c0wzx) throws Throwable {
        Object obj;
        AbstractC832990Wm1 abstractC832990Wm1 = c833030Wm5;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Lcom/google/android/gms/tasks/Task;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10817, "com/google/android/gms/auth/api/phone/SmsRetrieverClient", "startSmsRetriever", abstractC832990Wm1, objArr, "com.google.android.gms.tasks.Task", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10817, "com/google/android/gms/auth/api/phone/SmsRetrieverClient", "startSmsRetriever", null, objArr, abstractC832990Wm1, c0wzw, false);
            return (AbstractC835450Wpz) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            abstractC832990Wm1 = (AbstractC832990Wm1) obj;
        }
        AbstractC835450Wpz<Void> abstractC835450WpzLIZLLL = abstractC832990Wm1.LIZLLL();
        c0wst.LIZ(10817, "com/google/android/gms/auth/api/phone/SmsRetrieverClient", "startSmsRetriever", abstractC835450WpzLIZLLL, objArr, abstractC832990Wm1, c0wzw, true);
        return abstractC835450WpzLIZLLL;
    }

    public static AbstractC835450Wpz LLLLLJLJLL(AbstractC832990Wm1 abstractC832990Wm1, C0WZX c0wzx) throws Throwable {
        AbstractC832990Wm1 abstractC832990Wm12 = abstractC832990Wm1;
        C0WST c0wst = new C0WST();
        String str = null;
        Object[] objArr = {null};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10818, "com/google/android/gms/auth/api/phone/SmsRetrieverClient", "startSmsUserConsent", abstractC832990Wm12, objArr, "com.google.android.gms.tasks.Task", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10818, "com/google/android/gms/auth/api/phone/SmsRetrieverClient", "startSmsUserConsent", null, objArr, abstractC832990Wm12, c0wzw, false);
            return (AbstractC835450Wpz) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                abstractC832990Wm12 = (AbstractC832990Wm1) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str = (String) obj2;
            }
        }
        AbstractC835450Wpz abstractC835450WpzStartSmsUserConsent = abstractC832990Wm12.startSmsUserConsent(str);
        c0wst.LIZ(10818, "com/google/android/gms/auth/api/phone/SmsRetrieverClient", "startSmsUserConsent", abstractC835450WpzStartSmsUserConsent, objArr, abstractC832990Wm12, c0wzw, true);
        return abstractC835450WpzStartSmsUserConsent;
    }

    public static void LLLLLLIL(SignInHubActivity signInHubActivity, C0WZX c0wzx) throws Throwable {
        Activity activity = signInHubActivity;
        C0WST c0wst = new C0WST();
        int iIntValue = 0;
        Object[] objArr = {0};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/google/android/gms/auth/api/signin/internal/SignInHubActivity", "setResult", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/google/android/gms/auth/api/signin/internal/SignInHubActivity", "setResult", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        activity.setResult(iIntValue);
        c0wst.LIZ(11071, "com/google/android/gms/auth/api/signin/internal/SignInHubActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static Editable LLLLZLL(C21360018iU c21360018iU, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c21360018iU;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/lynx/xelement/input/LynxEditTextView", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/lynx/xelement/input/LynxEditTextView", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/lynx/xelement/input/LynxEditTextView", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static void LLLLZLLIL(LoginActivity loginActivity, C0WZX c0wzx) throws Throwable {
        LoginActivity loginActivity2 = loginActivity;
        C0WST c0wst = new C0WST();
        int iIntValue = 0;
        Object[] objArr = {0};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/spotify/sdk/android/auth/LoginActivity", "setResult", loginActivity2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/spotify/sdk/android/auth/LoginActivity", "setResult", null, objArr, loginActivity2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                loginActivity2 = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        loginActivity2.setResult(iIntValue);
        c0wst.LIZ(11071, "com/spotify/sdk/android/auth/LoginActivity", "setResult", null, objArr, loginActivity2, c0wzw, true);
    }

    public static Editable LLLZIIL(C21407818qC c21407818qC, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c21407818qC;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/account/ui/CodeInputView", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/account/ui/CodeInputView", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/account/ui/CodeInputView", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLLZIL(C565430MFp c565430MFp, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c565430MFp;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/aiuikit/impl/input/common/AITheaterEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/aiuikit/impl/input/common/AITheaterEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/aiuikit/impl/input/common/AITheaterEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLLZL(C565430MFp c565430MFp, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView = c565430MFp;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "com/ss/android/ugc/aweme/aiuikit/impl/input/common/BaseMentionEditText", "getEditableText", textView, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "com/ss/android/ugc/aweme/aiuikit/impl/input/common/BaseMentionEditText", "getEditableText", null, objArr, textView, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView = (TextView) obj;
        }
        Editable editableText = textView.getEditableText();
        c0wst.LIZ(999, "com/ss/android/ugc/aweme/aiuikit/impl/input/common/BaseMentionEditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        return editableText;
    }

    public static Editable LLLZLL(C0MG0 c0mg0, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c0mg0;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/aiuikit/impl/input/common/BaseMentionEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/aiuikit/impl/input/common/BaseMentionEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/aiuikit/impl/input/common/BaseMentionEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLLZZ(C1353500lKG c1353500lKG, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView = c1353500lKG;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "com/ss/android/ugc/aweme/comment/widgets/CommentEditText", "getEditableText", textView, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "com/ss/android/ugc/aweme/comment/widgets/CommentEditText", "getEditableText", null, objArr, textView, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView = (TextView) obj;
        }
        Editable editableText = textView.getEditableText();
        c0wst.LIZ(999, "com/ss/android/ugc/aweme/comment/widgets/CommentEditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        return editableText;
    }

    public static Editable LLLZZIL(C1353500lKG c1353500lKG, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c1353500lKG;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/comment/widgets/CommentEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/comment/widgets/CommentEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/comment/widgets/CommentEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLZ(C1357120lQ6 c1357120lQ6, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c1357120lQ6;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/ecommerce/search/middle/ai/ui/EcSearchMiddleAIEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/ecommerce/search/middle/ai/ui/EcSearchMiddleAIEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/ecommerce/search/middle/ai/ui/EcSearchMiddleAIEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLZIL(C12K3 c12k3, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c12k3;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/editSticker/text/effect/EffectEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/editSticker/text/effect/EffectEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/editSticker/text/effect/EffectEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLZILL(C124Q c124q, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c124q;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/editSticker/text/view/TextStickerEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/editSticker/text/view/TextStickerEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/editSticker/text/view/TextStickerEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLZL(1Mxh r17, C0WZX c0wzx) throws Throwable {
        Object obj;
        1Mxh r9 = r17;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/effectcreator/text/SimpleEditText", "getText", r9, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/effectcreator/text/SimpleEditText", "getText", null, objArr, r9, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            r9 = (C21410318qb) obj;
        }
        Editable text = r9.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/effectcreator/text/SimpleEditText", "getText", text, objArr, r9, c0wzw, true);
        return text;
    }

    public static Editable LLZLLLL(C0I7E c0i7e, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView = c0i7e;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "com/ss/android/ugc/aweme/im/sdk/chat/ui/view/MentionEditText", "getEditableText", textView, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "com/ss/android/ugc/aweme/im/sdk/chat/ui/view/MentionEditText", "getEditableText", null, objArr, textView, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView = (TextView) obj;
        }
        Editable editableText = textView.getEditableText();
        c0wst.LIZ(999, "com/ss/android/ugc/aweme/im/sdk/chat/ui/view/MentionEditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        return editableText;
    }

    public static Editable LLZZ(C0I7E c0i7e, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c0i7e;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/im/sdk/chat/ui/view/MentionEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/im/sdk/chat/ui/view/MentionEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/im/sdk/chat/ui/view/MentionEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLZZJLIL(SearchableEditText searchableEditText, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = searchableEditText;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/im/sdk/chat/ui/view/SearchableEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/im/sdk/chat/ui/view/SearchableEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/im/sdk/chat/ui/view/SearchableEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable LLZZLLIL(1INk r17, C0WZX c0wzx) throws Throwable {
        Object obj;
        1INk r9 = r17;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/im/sticker/df/stickerstore/stickercreation/view/StickerLabelEditText", "getText", r9, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/im/sticker/df/stickerstore/stickercreation/view/StickerLabelEditText", "getText", null, objArr, r9, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            r9 = (C21410318qb) obj;
        }
        Editable text = r9.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/im/sticker/df/stickerstore/stickercreation/view/StickerLabelEditText", "getText", text, objArr, r9, c0wzw, true);
        return text;
    }

    public static Editable LLZZZZ(AnonymousClass1255 anonymousClass1255, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = anonymousClass1255;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/live/livehostimpl/edit/view/TextStickerEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/live/livehostimpl/edit/view/TextStickerEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/live/livehostimpl/edit/view/TextStickerEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable M(C1353510lKH c1353510lKH, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView = c1353510lKH;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "com/ss/android/ugc/aweme/views/mention/MentionEditText", "getEditableText", textView, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "com/ss/android/ugc/aweme/views/mention/MentionEditText", "getEditableText", null, objArr, textView, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView = (TextView) obj;
        }
        Editable editableText = textView.getEditableText();
        c0wst.LIZ(999, "com/ss/android/ugc/aweme/views/mention/MentionEditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        return editableText;
    }

    public static Editable N(C1353510lKH c1353510lKH, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c1353510lKH;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/views/mention/MentionEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/views/mention/MentionEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/views/mention/MentionEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable R(C385350F8z c385350F8z, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c385350F8z;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/edittext/EPAIGCEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/edittext/EPAIGCEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/edittext/EPAIGCEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable T(C196972124s c196972124s, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c196972124s;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/profile/business/ur/editprofile/pronouns/views/PronounsEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/profile/business/ur/editprofile/pronouns/views/PronounsEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/profile/business/ur/editprofile/pronouns/views/PronounsEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable U(C1355350lNF c1355350lNF, C0WZX c0wzx) throws Throwable {
        Object obj;
        C1355350lNF c1355350lNF2 = c1355350lNF;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/profile/business/ur/ui/BioMentionEditText", "getText", c1355350lNF2, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/profile/business/ur/ui/BioMentionEditText", "getText", null, objArr, c1355350lNF2, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c1355350lNF2 = (C1355350lNF) obj;
        }
        Editable text = c1355350lNF2.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/profile/business/ur/ui/BioMentionEditText", "getText", text, objArr, c1355350lNF2, c0wzw, true);
        return text;
    }

    public static void W(CropActivity cropActivity, C0WZX c0wzx) throws Throwable {
        Activity activity = cropActivity;
        C0WST c0wst = new C0WST();
        int iIntValue = 0;
        Object[] objArr = {0};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/profile/business/ur/ui/CropActivity", "setResult", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/profile/business/ur/ui/CropActivity", "setResult", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        activity.setResult(iIntValue);
        c0wst.LIZ(11071, "com/ss/android/ugc/profile/business/ur/ui/CropActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void Y(MatisseActivity matisseActivity, C0WZX c0wzx) throws Throwable {
        Activity activity = matisseActivity;
        C0WST c0wst = new C0WST();
        int iIntValue = 0;
        Object[] objArr = {0};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/zhihu/matisse/ui/MatisseActivity", "setResult", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/zhihu/matisse/ui/MatisseActivity", "setResult", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        activity.setResult(iIntValue);
        c0wst.LIZ(11071, "com/zhihu/matisse/ui/MatisseActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static Editable a(C1355400lNK c1355400lNK, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView = c1355400lNK;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "com/ss/android/ugc/aweme/live/livehostimpl/livereply/quickpost/ui/LiveQuickPostHashTagEditText", "getEditableText", textView, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "com/ss/android/ugc/aweme/live/livehostimpl/livereply/quickpost/ui/LiveQuickPostHashTagEditText", "getEditableText", null, objArr, textView, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView = (TextView) obj;
        }
        Editable editableText = textView.getEditableText();
        c0wst.LIZ(999, "com/ss/android/ugc/aweme/live/livehostimpl/livereply/quickpost/ui/LiveQuickPostHashTagEditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        return editableText;
    }

    public static Editable b(C1355400lNK c1355400lNK, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c1355400lNK;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/live/livehostimpl/livereply/quickpost/ui/LiveQuickPostHashTagEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/live/livehostimpl/livereply/quickpost/ui/LiveQuickPostHashTagEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/live/livehostimpl/livereply/quickpost/ui/LiveQuickPostHashTagEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static byte[] b0(InetAddress inetAddress, C0WZX c0wzx) throws Throwable {
        Object obj;
        InetAddress inetAddress2 = inetAddress;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()[B", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10203, "java/net/InetAddress", "getAddress", inetAddress2, objArr, "byte[]", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10203, "java/net/InetAddress", "getAddress", null, objArr, inetAddress2, c0wzw, false);
            return (byte[]) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            inetAddress2 = (InetAddress) obj;
        }
        byte[] address = inetAddress2.getAddress();
        c0wst.LIZ(10203, "java/net/InetAddress", "getAddress", address, objArr, inetAddress2, c0wzw, true);
        return address;
    }

    public static Editable c(C19655911vJ c19655911vJ, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c19655911vJ;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/ogc/news/anchor/producer/widget/NewsEditorText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/ogc/news/anchor/producer/widget/NewsEditorText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/ogc/news/anchor/producer/widget/NewsEditorText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static InetAddress[] c0(String str, C0WZX c0wzx) throws Throwable {
        Object obj;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;)[Ljava/net/InetAddress;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10204, "java/net/InetAddress", "getAllByName", InetAddress.class, objArr, "java.net.InetAddress[]", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10204, "java/net/InetAddress", "getAllByName", null, objArr, InetAddress.class, c0wzw, false);
            return (InetAddress[]) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            str = (String) obj;
        }
        InetAddress[] allByName = InetAddress.getAllByName(str);
        c0wst.LIZ(10204, "java/net/InetAddress", "getAllByName", allByName, objArr, InetAddress.class, c0wzw, true);
        return allByName;
    }

    public static String d0(InetAddress inetAddress, C0WZX c0wzx) throws Throwable {
        Object obj;
        InetAddress inetAddress2 = inetAddress;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10205, "java/net/InetAddress", "getHostAddress", inetAddress2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10205, "java/net/InetAddress", "getHostAddress", null, objArr, inetAddress2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            inetAddress2 = (InetAddress) obj;
        }
        String hostAddress = inetAddress2.getHostAddress();
        c0wst.LIZ(10205, "java/net/InetAddress", "getHostAddress", hostAddress, objArr, inetAddress2, c0wzw, true);
        return hostAddress;
    }

    public static URLConnection e0(URL url, C0WZX c0wzx) throws Throwable {
        Object obj;
        URL url2 = url;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400000, "java/net/URL", "openConnection", url2, new Object[0], "java.net.URLConnection", new C0WZW(false, "()Ljava/net/URLConnection;", c0wzx));
        if (c0wsuLIZIZ.LIZ) {
            return (URLConnection) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            url2 = (URL) obj;
        }
        return url2.openConnection();
    }

    public static String g0(Locale locale, C0WZX c0wzx) throws Throwable {
        Object obj;
        Locale locale2 = locale;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2885, "java/util/Locale", "getCountry", locale2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2885, "java/util/Locale", "getCountry", null, objArr, locale2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            locale2 = (Locale) obj;
        }
        String country = locale2.getCountry();
        c0wst.LIZ(2885, "java/util/Locale", "getCountry", country, objArr, locale2, c0wzw, true);
        return country;
    }

    public static C0XLY j0(InterfaceC1495580p1Q interfaceC1495580p1Q, C0WZX c0wzx) throws Throwable {
        Object obj;
        InterfaceC1495580p1Q interfaceC1495580p1Q2 = interfaceC1495580p1Q;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400102, "okhttp3/Call", "execute", interfaceC1495580p1Q2, new Object[0], "okhttp3.Response", new C0WZW(false, "()Lokhttp3/Response;", c0wzx));
        if (c0wsuLIZIZ.LIZ) {
            return (C0XLY) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            interfaceC1495580p1Q2 = (InterfaceC1495580p1Q) obj;
        }
        return interfaceC1495580p1Q2.execute();
    }

    public static C1495520p1K k0(C1495510p1J c1495510p1J, C0WZX c0wzx) throws Throwable {
        Object obj;
        C1495510p1J c1495510p1J2 = c1495510p1J;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400100, "okhttp3/OkHttpClient$Builder", "build", c1495510p1J2, new Object[0], "okhttp3.OkHttpClient", new C0WZW(false, "()Lokhttp3/OkHttpClient;", c0wzx));
        if (c0wsuLIZIZ.LIZ) {
            return (C1495520p1K) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            c1495510p1J2 = (C1495510p1J) obj;
        }
        return c1495510p1J2.build();
    }

    public static C1501450pAt l0(C1501920pBe c1501920pBe, C0WZX c0wzx) throws Throwable {
        Object obj;
        C1501920pBe c1501920pBe2 = c1501920pBe;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400200, "retrofit2/Retrofit$Builder", "build", c1501920pBe2, new Object[0], "retrofit2.Retrofit", new C0WZW(false, "()Lretrofit2/Retrofit;", c0wzx));
        if (c0wsuLIZIZ.LIZ) {
            return (C1501450pAt) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            c1501920pBe2 = (C1501920pBe) obj;
        }
        if (c1501920pBe2.LIZJ != null) {
            InterfaceC1496610p35 c1495520p1K = c1501920pBe2.LIZIZ;
            if (c1495520p1K == null) {
                c1495520p1K = new C1495520p1K();
            }
            Executor executorLIZIZ = c1501920pBe2.LJFF;
            if (executorLIZIZ == null) {
                executorLIZIZ = c1501920pBe2.LIZ.LIZIZ();
            }
            ArrayList arrayList = new ArrayList(c1501920pBe2.LJ);
            arrayList.addAll(c1501920pBe2.LIZ.LIZ(executorLIZIZ));
            ArrayList arrayList2 = new ArrayList(((ArrayList) c1501920pBe2.LIZLLL).size() + 1 + c1501920pBe2.LIZ.LIZLLL());
            arrayList2.add(new AbstractC1501440pAs() { // from class: X.0pA5
                public boolean LIZ = true;

                @Override // X.AbstractC1501440pAs
                public final InterfaceC1501650pBD<AbstractC842510X3h, ?> responseBodyConverter(Type type, Annotation[] annotationArr, C1501450pAt c1501450pAt) {
                    if (type == AbstractC842510X3h.class) {
                        if (C1502190pC5.LJIIIIZZ(annotationArr, C040J.class)) {
                            return new InterfaceC1501650pBD<AbstractC842510X3h, AbstractC842510X3h>() { // from class: X.0pAA
                                @Override // X.InterfaceC1501650pBD
                                public final AbstractC842510X3h LIZ(AbstractC842510X3h abstractC842510X3h) {
                                    return abstractC842510X3h;
                                }
                            };
                        }
                        return new InterfaceC1501650pBD<AbstractC842510X3h, AbstractC842510X3h>() { // from class: X.0p8u
                            @Override // X.InterfaceC1501650pBD
                            public final AbstractC842510X3h LIZ(AbstractC842510X3h abstractC842510X3h) {
                                AbstractC842510X3h abstractC842510X3h2 = abstractC842510X3h;
                                try {
                                    C1496690p3D c1496690p3D = new C1496690p3D();
                                    abstractC842510X3h2.source().LJJJJL(c1496690p3D);
                                    AbstractC842510X3h abstractC842510X3hCreate = AbstractC842510X3h.create(abstractC842510X3h2.contentType(), abstractC842510X3h2.contentLength(), c1496690p3D);
                                    abstractC842510X3h2.close();
                                    return abstractC842510X3hCreate;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    abstractC842510X3h2.close();
                                    throw th;
                                }
                            }
                        };
                    }
                    if (type == Void.class) {
                        return new InterfaceC1501650pBD<AbstractC842510X3h, Void>() { // from class: X.0p9R
                            @Override // X.InterfaceC1501650pBD
                            public final Void LIZ(AbstractC842510X3h abstractC842510X3h) {
                                abstractC842510X3h.close();
                                return null;
                            }
                        };
                    }
                    if (this.LIZ && type == Unit.class) {
                        try {
                            return new InterfaceC1501650pBD<AbstractC842510X3h, Unit>() { // from class: X.0p9S
                                @Override // X.InterfaceC1501650pBD
                                public final Unit LIZ(AbstractC842510X3h abstractC842510X3h) {
                                    abstractC842510X3h.close();
                                    return Unit.LIZ;
                                }
                            };
                        } catch (NoClassDefFoundError e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LIZ = false;
                            return null;
                        }
                    }
                    return null;
                }

                @Override // X.AbstractC1501440pAs
                public final InterfaceC1501650pBD<?, AbstractC842530X3j> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C1501450pAt c1501450pAt) {
                    if (AbstractC842530X3j.class.isAssignableFrom(C1502190pC5.LJFF(type))) {
                        return new InterfaceC1501650pBD<AbstractC842530X3j, AbstractC842530X3j>() { // from class: X.0pA9
                            @Override // X.InterfaceC1501650pBD
                            public final AbstractC842530X3j LIZ(AbstractC842530X3j abstractC842530X3j) {
                                return abstractC842530X3j;
                            }
                        };
                    }
                    return null;
                }
            });
            arrayList2.addAll(c1501920pBe2.LIZLLL);
            arrayList2.addAll(c1501920pBe2.LIZ.LIZJ());
            return new C1501450pAt(c1495520p1K, c1501920pBe2.LIZJ, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executorLIZIZ);
        }
        throw new IllegalStateException("Base URL required.");
    }

    public static Editable o(C0ZI0 c0zi0, C0WZX c0wzx) throws Throwable {
        Object obj;
        TextView textView = c0zi0;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "com/ss/android/ugc/aweme/shortvideo/view/HashTagMentionEditText", "getEditableText", textView, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "com/ss/android/ugc/aweme/shortvideo/view/HashTagMentionEditText", "getEditableText", null, objArr, textView, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            textView = (TextView) obj;
        }
        Editable editableText = textView.getEditableText();
        c0wst.LIZ(999, "com/ss/android/ugc/aweme/shortvideo/view/HashTagMentionEditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        return editableText;
    }

    public static Editable p(C0ZI0 c0zi0, C0WZX c0wzx) throws Throwable {
        Object obj;
        C0ZIH c0zih = c0zi0;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/shortvideo/view/HashTagMentionEditText", "getText", c0zih, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/shortvideo/view/HashTagMentionEditText", "getText", null, objArr, c0zih, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c0zih = (C0ZIH) obj;
        }
        Editable text = c0zih.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/shortvideo/view/HashTagMentionEditText", "getText", text, objArr, c0zih, c0wzw, true);
        return text;
    }

    public static Editable q(C0ZIH c0zih, C0WZX c0wzx) throws Throwable {
        Object obj;
        C0ZIH c0zih2 = c0zih;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/shortvideo/view/MentionEditText", "getText", c0zih2, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/shortvideo/view/MentionEditText", "getText", null, objArr, c0zih2, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c0zih2 = (C0ZIH) obj;
        }
        Editable text = c0zih2.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/shortvideo/view/MentionEditText", "getText", text, objArr, c0zih2, c0wzw, true);
        return text;
    }

    public static Editable r(C1735760vGo c1735760vGo, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c1735760vGo;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/social/thought/view/SocialThoughtBubbleEditTextView", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/social/thought/view/SocialThoughtBubbleEditTextView", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/social/thought/view/SocialThoughtBubbleEditTextView", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable s(C20584715gj c20584715gj, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c20584715gj;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/story/view/bubble/StoryThoughtBubbleEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/story/view/bubble/StoryThoughtBubbleEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/story/view/bubble/StoryThoughtBubbleEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable t(C0FWK c0fwk, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c0fwk;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/subscription/pgc/business/foundation/editor/ui/PGCSpaceEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/subscription/pgc/business/foundation/editor/ui/PGCSpaceEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/subscription/pgc/business/foundation/editor/ui/PGCSpaceEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable u(C0F96 c0f96, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c0f96;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/tablet/impl/business/feed/SearchBarEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/tablet/impl/business/feed/SearchBarEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/tablet/impl/business/feed/SearchBarEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable v(C1842270y2b c1842270y2b, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c1842270y2b;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/tako/botpage/bottombox/view/TakoEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/tako/botpage/bottombox/view/TakoEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/tako/botpage/bottombox/view/TakoEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static Editable w(C21397818oa c21397818oa, C0WZX c0wzx) throws Throwable {
        Object obj;
        C21410318qb c21410318qb = c21397818oa;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/tako/botpage/cards/questionnaire/second/TakoSecondLevelQuestionnaireEditText", "getText", c21410318qb, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/tako/botpage/cards/questionnaire/second/TakoSecondLevelQuestionnaireEditText", "getText", null, objArr, c21410318qb, c0wzw, false);
            return (Editable) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            c21410318qb = (C21410318qb) obj;
        }
        Editable text = c21410318qb.getText();
        c0wst.LIZ(998, "com/ss/android/ugc/aweme/tako/botpage/cards/questionnaire/second/TakoSecondLevelQuestionnaireEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        return text;
    }

    public static void x(TakoTemplateActivity takoTemplateActivity, C0WZX c0wzx) throws Throwable {
        Activity activity = takoTemplateActivity;
        C0WST c0wst = new C0WST();
        int iIntValue = 10001;
        Object[] objArr = {10001};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/tako/multipletemplate/TakoTemplateActivity", "setResult", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/tako/multipletemplate/TakoTemplateActivity", "setResult", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        activity.setResult(iIntValue);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/tako/multipletemplate/TakoTemplateActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void y(TakoImageBackstopActivity takoImageBackstopActivity, C0WZX c0wzx) throws Throwable {
        Activity activity = takoImageBackstopActivity;
        C0WST c0wst = new C0WST();
        int iIntValue = 10001;
        Object[] objArr = {10001};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/tako/otherpage/image/backstop/TakoImageBackstopActivity", "setResult", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/tako/otherpage/image/backstop/TakoImageBackstopActivity", "setResult", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        activity.setResult(iIntValue);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/tako/otherpage/image/backstop/TakoImageBackstopActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void H(TTEPEffectPreviewActivity tTEPEffectPreviewActivity, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {intent, -1};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)Z", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11097, "com/ss/android/ugc/aweme/ttep/TTEPEffectPreviewActivity", "startActivityIfNeeded", tTEPEffectPreviewActivity, objArr, "boolean", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11097, "com/ss/android/ugc/aweme/ttep/TTEPEffectPreviewActivity", "startActivityIfNeeded", null, objArr, tTEPEffectPreviewActivity, c0wzw, false);
            ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = tTEPEffectPreviewActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            activity = tTEPEffectPreviewActivity;
            intent2 = intent;
        }
        c0wst.LIZ(11097, "com/ss/android/ugc/aweme/ttep/TTEPEffectPreviewActivity", "startActivityIfNeeded", Boolean.valueOf(activity.startActivityIfNeeded(intent2, iIntValue)), objArr, activity, c0wzw, true);
    }

    public static Account[] LIZIZ(AccountManager accountManager, String str, C0WZX c0wzx) throws Throwable {
        String str2 = str;
        AccountManager accountManager2 = accountManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str2};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;)[Landroid/accounts/Account;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102501, "android/accounts/AccountManager", "getAccountsByType", accountManager2, objArr, "android.accounts.Account[]", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102501, "android/accounts/AccountManager", "getAccountsByType", null, objArr, accountManager2, c0wzw, false);
            return (Account[]) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                accountManager2 = (AccountManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        Account[] accountsByType = accountManager2.getAccountsByType(str2);
        c0wst.LIZ(102501, "android/accounts/AccountManager", "getAccountsByType", accountsByType, objArr, accountManager2, c0wzw, true);
        return accountsByType;
    }

    public static void LJFF(ActivityManager activityManager, ActivityManager.MemoryInfo memoryInfo, C0WZX c0wzx) {
        ActivityManager.MemoryInfo memoryInfo2 = memoryInfo;
        ActivityManager activityManager2 = activityManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = {memoryInfo2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/app/ActivityManager$MemoryInfo;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(4165, "android/app/ActivityManager", "getMemoryInfo", activityManager2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(4165, "android/app/ActivityManager", "getMemoryInfo", null, objArr, activityManager2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activityManager2 = (ActivityManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                memoryInfo2 = (ActivityManager.MemoryInfo) obj2;
            }
        }
        activityManager2.getMemoryInfo(memoryInfo2);
        c0wst.LIZ(4165, "android/app/ActivityManager", "getMemoryInfo", null, objArr, activityManager2, c0wzw, true);
    }

    public static List LJIIIIZZ(ActivityManager activityManager, int i, C0WZX c0wzx) throws Throwable {
        int iIntValue = i;
        ActivityManager activityManager2 = activityManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(I)Ljava/util/List;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(101302, "android/app/ActivityManager", "getRunningServices", activityManager2, objArr, "java.util.List", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(101302, "android/app/ActivityManager", "getRunningServices", null, objArr, activityManager2, c0wzw, false);
            return (List) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activityManager2 = (ActivityManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager2.getRunningServices(iIntValue);
        c0wst.LIZ(101302, "android/app/ActivityManager", "getRunningServices", runningServices, objArr, activityManager2, c0wzw, true);
        return runningServices;
    }

    public static void LJIIJJI(Activity activity, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        ContextWrapper contextWrapper = activity;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11080, "android/app/Activity", "sendBroadcast", contextWrapper, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11080, "android/app/Activity", "sendBroadcast", null, objArr, contextWrapper, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contextWrapper = (ContextWrapper) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        contextWrapper.sendBroadcast(intent2);
        c0wst.LIZ(11080, "android/app/Activity", "sendBroadcast", null, objArr, contextWrapper, c0wzw, true);
    }

    public static void LJIILIIL(Activity activity, int i, C0WZX c0wzx) throws Throwable {
        int iIntValue = i;
        Activity activity2 = activity;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "android/app/Activity", "setResult", activity2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "android/app/Activity", "setResult", null, objArr, activity2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity2 = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        activity2.setResult(iIntValue);
        c0wst.LIZ(11071, "android/app/Activity", "setResult", null, objArr, activity2, c0wzw, true);
    }

    public static void LJIILJJIL(Activity activity, Intent[] intentArr, C0WZX c0wzx) throws Throwable {
        Intent[] intentArr2 = intentArr;
        Activity activity2 = activity;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intentArr2};
        C0WZW c0wzw = new C0WZW(false, "([Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11093, "android/app/Activity", "startActivities", activity2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11093, "android/app/Activity", "startActivities", null, objArr, activity2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity2 = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intentArr2 = (Intent[]) obj2;
            }
        }
        activity2.startActivities(intentArr2);
        c0wst.LIZ(11093, "android/app/Activity", "startActivities", null, objArr, activity2, c0wzw, true);
    }

    public static void LJIILLIIL(Activity activity, Intent intent, C0WZX c0wzx) {
        Intent intent2 = intent;
        Activity activity2 = activity;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "android/app/Activity", "startActivity", activity2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "android/app/Activity", "startActivity", null, objArr, activity2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity2 = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity2.startActivity(intent2);
        c0wst.LIZ(11098, "android/app/Activity", "startActivity", null, objArr, activity2, c0wzw, true);
    }

    public static void LJIJI(Activity activity, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity2;
        Intent intent2;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {intent, -1};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)Z", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11097, "android/app/Activity", "startActivityIfNeeded", activity, objArr, "boolean", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11097, "android/app/Activity", "startActivityIfNeeded", null, objArr, activity, c0wzw, false);
            ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity2 = (Activity) obj;
            } else {
                activity2 = activity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            activity2 = activity;
            intent2 = intent;
        }
        c0wst.LIZ(11097, "android/app/Activity", "startActivityIfNeeded", Boolean.valueOf(activity2.startActivityIfNeeded(intent2, iIntValue)), objArr, activity2, c0wzw, true);
    }

    public static void LJIJJ(C19EG c19eg, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        Activity activity = c19eg;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)Landroid/content/ComponentName;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11084, "android/app/Activity", "startService", activity, objArr, "android.content.ComponentName", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11084, "android/app/Activity", "startService", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        c0wst.LIZ(11084, "android/app/Activity", "startService", activity.startService(intent2), objArr, activity, c0wzw, true);
    }

    public static void LJIL(Application application, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        ContextWrapper contextWrapper = application;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11080, "android/app/Application", "sendBroadcast", contextWrapper, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11080, "android/app/Application", "sendBroadcast", null, objArr, contextWrapper, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contextWrapper = (ContextWrapper) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        contextWrapper.sendBroadcast(intent2);
        c0wst.LIZ(11080, "android/app/Application", "sendBroadcast", null, objArr, contextWrapper, c0wzw, true);
    }

    public static void LJJ(Application application, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        ContextWrapper contextWrapper = application;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)Landroid/content/ComponentName;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11084, "android/app/Application", "startService", contextWrapper, objArr, "android.content.ComponentName", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11084, "android/app/Application", "startService", null, objArr, contextWrapper, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contextWrapper = (ContextWrapper) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        c0wst.LIZ(11084, "android/app/Application", "startService", contextWrapper.startService(intent2), objArr, contextWrapper, c0wzw, true);
    }

    public static void LJJI(Service service, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        Service service2 = service;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)Landroid/content/ComponentName;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11083, "android/app/Service", "startForegroundService", service2, objArr, "android.content.ComponentName", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11083, "android/app/Service", "startForegroundService", null, objArr, service2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                service2 = (Service) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        c0wst.LIZ(11083, "android/app/Service", "startForegroundService", service2.startForegroundService(intent2), objArr, service2, c0wzw, true);
    }

    public static void LJJIIJZLJL(ClipData clipData, ClipData.Item item, C0WZX c0wzx) throws Throwable {
        ClipData.Item item2 = item;
        ClipData clipData2 = clipData;
        C0WST c0wst = new C0WST();
        Object[] objArr = {item2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/ClipData$Item;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10834, "android/content/ClipData", "addItem", clipData2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10834, "android/content/ClipData", "addItem", null, objArr, clipData2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                clipData2 = (ClipData) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                item2 = (ClipData.Item) obj2;
            }
        }
        clipData2.addItem(item2);
        c0wst.LIZ(10834, "android/content/ClipData", "addItem", null, objArr, clipData2, c0wzw, true);
    }

    public static ClipData.Item LJJIIZ(ClipData clipData, int i, C0WZX c0wzx) throws Throwable {
        int iIntValue = i;
        ClipData clipData2 = clipData;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(I)Landroid/content/ClipData$Item;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10835, "android/content/ClipData", "getItemAt", clipData2, objArr, "android.content.ClipData$Item", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10835, "android/content/ClipData", "getItemAt", null, objArr, clipData2, c0wzw, false);
            return (ClipData.Item) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                clipData2 = (ClipData) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        ClipData.Item itemAt = clipData2.getItemAt(iIntValue);
        c0wst.LIZ(10835, "android/content/ClipData", "getItemAt", itemAt, objArr, clipData2, c0wzw, true);
        return itemAt;
    }

    public static void LJJIJIIJI(ClipboardManager clipboardManager, ClipData clipData, C0WZX c0wzx) throws Throwable {
        ClipData clipData2 = clipData;
        ClipboardManager clipboardManager2 = clipboardManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = {clipData2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/ClipData;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(101807, "android/content/ClipboardManager", "setPrimaryClip", clipboardManager2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(101807, "android/content/ClipboardManager", "setPrimaryClip", null, objArr, clipboardManager2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                clipboardManager2 = (ClipboardManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                clipData2 = (ClipData) obj2;
            }
        }
        clipboardManager2.setPrimaryClip(clipData2);
        c0wst.LIZ(101807, "android/content/ClipboardManager", "setPrimaryClip", null, objArr, clipboardManager2, c0wzw, true);
    }

    public static void LJJJJI(Context context, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        Context context2 = context;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11080, "android/content/Context", "sendBroadcast", context2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11080, "android/content/Context", "sendBroadcast", null, objArr, context2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                context2 = (Context) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        context2.sendBroadcast(intent2);
        c0wst.LIZ(11080, "android/content/Context", "sendBroadcast", null, objArr, context2, c0wzw, true);
    }

    public static void LJJJJIZL(Context context, Intent[] intentArr, C0WZX c0wzx) throws Throwable {
        Intent[] intentArr2 = intentArr;
        Context context2 = context;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intentArr2};
        C0WZW c0wzw = new C0WZW(false, "([Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11089, "android/content/Context", "startActivities", context2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11089, "android/content/Context", "startActivities", null, objArr, context2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                context2 = (Context) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intentArr2 = (Intent[]) obj2;
            }
        }
        context2.startActivities(intentArr2);
        c0wst.LIZ(11089, "android/content/Context", "startActivities", null, objArr, context2, c0wzw, true);
    }

    public static void LJJJJJL(Context context, Intent intent, C0WZX c0wzx) {
        Intent intent2 = intent;
        Context context2 = context;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11090, "android/content/Context", "startActivity", context2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11090, "android/content/Context", "startActivity", null, objArr, context2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                context2 = (Context) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        context2.startActivity(intent2);
        c0wst.LIZ(11090, "android/content/Context", "startActivity", null, objArr, context2, c0wzw, true);
    }

    public static ComponentName LJJJJL(Context context, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        Context context2 = context;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)Landroid/content/ComponentName;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11083, "android/content/Context", "startForegroundService", context2, objArr, "android.content.ComponentName", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11083, "android/content/Context", "startForegroundService", null, objArr, context2, c0wzw, false);
            return (ComponentName) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                context2 = (Context) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        ComponentName componentNameStartForegroundService = context2.startForegroundService(intent2);
        c0wst.LIZ(11083, "android/content/Context", "startForegroundService", componentNameStartForegroundService, objArr, context2, c0wzw, true);
        return componentNameStartForegroundService;
    }

    public static String[] LJJJJLL(PackageManager packageManager, int i, C0WZX c0wzx) throws Throwable {
        int iIntValue = i;
        PackageManager packageManager2 = packageManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(I)[Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(101310, "android/content/pm/PackageManager", "getPackagesForUid", packageManager2, objArr, "java.lang.String[]", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(101310, "android/content/pm/PackageManager", "getPackagesForUid", null, objArr, packageManager2, c0wzw, false);
            return (String[]) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                packageManager2 = (PackageManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        String[] packagesForUid = packageManager2.getPackagesForUid(iIntValue);
        c0wst.LIZ(101310, "android/content/pm/PackageManager", "getPackagesForUid", packagesForUid, objArr, packageManager2, c0wzw, true);
        return packagesForUid;
    }

    public static Sensor LJJL(SensorManager sensorManager, int i, C0WZX c0wzx) throws Throwable {
        int iIntValue = i;
        SensorManager sensorManager2 = sensorManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(I)Landroid/hardware/Sensor;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager2, objArr, "android.hardware.Sensor", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager2, c0wzw, false);
            return (Sensor) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                sensorManager2 = (SensorManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        Sensor defaultSensor = sensorManager2.getDefaultSensor(iIntValue);
        c0wst.LIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager2, c0wzw, true);
        return defaultSensor;
    }

    public static List LJJLI(SensorManager sensorManager, int i, C0WZX c0wzx) throws Throwable {
        int iIntValue = i;
        SensorManager sensorManager2 = sensorManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(I)Ljava/util/List;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100702, "android/hardware/SensorManager", "getSensorList", sensorManager2, objArr, "java.util.List", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100702, "android/hardware/SensorManager", "getSensorList", null, objArr, sensorManager2, c0wzw, false);
            return (List) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                sensorManager2 = (SensorManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        List<Sensor> sensorList = sensorManager2.getSensorList(iIntValue);
        c0wst.LIZ(100702, "android/hardware/SensorManager", "getSensorList", sensorList, objArr, sensorManager2, c0wzw, true);
        return sensorList;
    }

    public static void LJJLIIIJJI(SensorManager sensorManager, SensorEventListener sensorEventListener, C0WZX c0wzx) throws Throwable {
        SensorEventListener sensorEventListener2 = sensorEventListener;
        SensorManager sensorManager2 = sensorManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = {sensorEventListener2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/hardware/SensorEventListener;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100701, "android/hardware/SensorManager", "unregisterListener", sensorManager2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100701, "android/hardware/SensorManager", "unregisterListener", null, objArr, sensorManager2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                sensorManager2 = (SensorManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                sensorEventListener2 = (SensorEventListener) obj2;
            }
        }
        sensorManager2.unregisterListener(sensorEventListener2);
        c0wst.LIZ(100701, "android/hardware/SensorManager", "unregisterListener", null, objArr, sensorManager2, c0wzw, true);
    }

    public static Location LJJLJLI(LocationManager locationManager, String str, C0WZX c0wzx) throws Throwable {
        String str2 = str;
        LocationManager locationManager2 = locationManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str2};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;)Landroid/location/Location;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100000, "android/location/LocationManager", "getLastKnownLocation", locationManager2, objArr, "android.location.Location", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100000, "android/location/LocationManager", "getLastKnownLocation", null, objArr, locationManager2, c0wzw, false);
            return (Location) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                locationManager2 = (LocationManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        Location lastKnownLocation = locationManager2.getLastKnownLocation(str2);
        c0wst.LIZ(100000, "android/location/LocationManager", "getLastKnownLocation", lastKnownLocation, objArr, locationManager2, c0wzw, true);
        return lastKnownLocation;
    }

    public static String LJLIL(ExifInterface exifInterface, String str, C0WZX c0wzx) throws Throwable {
        String str2 = str;
        ExifInterface exifInterface2 = exifInterface;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str2};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;)Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(776, "android/media/ExifInterface", "getAttribute", exifInterface2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(776, "android/media/ExifInterface", "getAttribute", null, objArr, exifInterface2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                exifInterface2 = (ExifInterface) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        String attribute = exifInterface2.getAttribute(str2);
        c0wst.LIZ(776, "android/media/ExifInterface", "getAttribute", attribute, objArr, exifInterface2, c0wzw, true);
        return attribute;
    }

    public static int LJLILLLLZI(ExifInterface exifInterface, int i, C0WZX c0wzx) throws Throwable {
        ExifInterface exifInterface2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        String str = "Orientation";
        Object[] objArr = {"Orientation", Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;I)I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(791, "android/media/ExifInterface", "getAttributeInt", exifInterface, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(791, "android/media/ExifInterface", "getAttributeInt", null, objArr, exifInterface, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                exifInterface2 = (ExifInterface) obj;
            } else {
                exifInterface2 = exifInterface;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str = (String) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            exifInterface2 = exifInterface;
        }
        int attributeInt = exifInterface2.getAttributeInt(str, iIntValue);
        c0wst.LIZ(791, "android/media/ExifInterface", "getAttributeInt", Integer.valueOf(attributeInt), objArr, exifInterface2, c0wzw, true);
        return attributeInt;
    }

    public static String LJLJI(MediaMetadataRetriever mediaMetadataRetriever, int i, C0WZX c0wzx) throws Throwable {
        int iIntValue = i;
        MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(I)Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(800, "android/media/MediaMetadataRetriever", "extractMetadata", mediaMetadataRetriever2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(800, "android/media/MediaMetadataRetriever", "extractMetadata", null, objArr, mediaMetadataRetriever2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                mediaMetadataRetriever2 = (MediaMetadataRetriever) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        String strExtractMetadata = mediaMetadataRetriever2.extractMetadata(iIntValue);
        c0wst.LIZ(800, "android/media/MediaMetadataRetriever", "extractMetadata", strExtractMetadata, objArr, mediaMetadataRetriever2, c0wzw, true);
        return strExtractMetadata;
    }

    public static LinkProperties LJLJJLL(ConnectivityManager connectivityManager, Network network, C0WZX c0wzx) throws Throwable {
        Network network2 = network;
        ConnectivityManager connectivityManager2 = connectivityManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = {network2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/net/Network;)Landroid/net/LinkProperties;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(220, "android/net/ConnectivityManager", "getLinkProperties", connectivityManager2, objArr, "android.net.LinkProperties", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(220, "android/net/ConnectivityManager", "getLinkProperties", null, objArr, connectivityManager2, c0wzw, false);
            return (LinkProperties) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                connectivityManager2 = (ConnectivityManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                network2 = (Network) obj2;
            }
        }
        LinkProperties linkProperties = connectivityManager2.getLinkProperties(network2);
        c0wst.LIZ(220, "android/net/ConnectivityManager", "getLinkProperties", linkProperties, objArr, connectivityManager2, c0wzw, true);
        return linkProperties;
    }

    public static NetworkCapabilities LJLJL(ConnectivityManager connectivityManager, Network network, C0WZX c0wzx) throws Throwable {
        Network network2 = network;
        ConnectivityManager connectivityManager2 = connectivityManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = {network2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/net/Network;)Landroid/net/NetworkCapabilities;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(225, "android/net/ConnectivityManager", "getNetworkCapabilities", connectivityManager2, objArr, "android.net.NetworkCapabilities", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(225, "android/net/ConnectivityManager", "getNetworkCapabilities", null, objArr, connectivityManager2, c0wzw, false);
            return (NetworkCapabilities) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                connectivityManager2 = (ConnectivityManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                network2 = (Network) obj2;
            }
        }
        NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network2);
        c0wst.LIZ(225, "android/net/ConnectivityManager", "getNetworkCapabilities", networkCapabilities, objArr, connectivityManager2, c0wzw, true);
        return networkCapabilities;
    }

    public static int LL(BatteryManager batteryManager, int i, C0WZX c0wzx) throws Throwable {
        int iIntValue = i;
        BatteryManager batteryManager2 = batteryManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(I)I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10883, "android/os/BatteryManager", "getIntProperty", batteryManager2, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10883, "android/os/BatteryManager", "getIntProperty", null, objArr, batteryManager2, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                batteryManager2 = (BatteryManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        int intProperty = batteryManager2.getIntProperty(iIntValue);
        c0wst.LIZ(10883, "android/os/BatteryManager", "getIntProperty", Integer.valueOf(intProperty), objArr, batteryManager2, c0wzw, true);
        return intProperty;
    }

    public static long LLD(BatteryManager batteryManager, int i, C0WZX c0wzx) throws Throwable {
        int iIntValue = i;
        BatteryManager batteryManager2 = batteryManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(I)J", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10884, "android/os/BatteryManager", "getLongProperty", batteryManager2, objArr, "long", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10884, "android/os/BatteryManager", "getLongProperty", null, objArr, batteryManager2, c0wzw, false);
            return ((Long) c0wsuLIZIZ.LIZIZ).longValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                batteryManager2 = (BatteryManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        long longProperty = batteryManager2.getLongProperty(iIntValue);
        c0wst.LIZ(10884, "android/os/BatteryManager", "getLongProperty", Long.valueOf(longProperty), objArr, batteryManager2, c0wzw, true);
        return longProperty;
    }

    public static String LLIIIJ(ContentResolver contentResolver, String str, C0WZX c0wzx) throws Throwable {
        String str2 = str;
        ContentResolver contentResolver2 = contentResolver;
        C0WST c0wst = new C0WST();
        Object[] objArr = {contentResolver2, str2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10982, "android/provider/Settings$Global", "getString", Settings.Global.class, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10982, "android/provider/Settings$Global", "getString", null, objArr, Settings.Global.class, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contentResolver2 = (ContentResolver) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        String string = Settings.Global.getString(contentResolver2, str2);
        c0wst.LIZ(10982, "android/provider/Settings$Global", "getString", string, objArr, Settings.Global.class, c0wzw, true);
        return string;
    }

    public static String LLIIIL(ContentResolver contentResolver, String str, C0WZX c0wzx) throws Throwable {
        String str2 = str;
        ContentResolver contentResolver2 = contentResolver;
        C0WST c0wst = new C0WST();
        Object[] objArr = {contentResolver2, str2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102004, "android/provider/Settings$Secure", "getString", Settings.Secure.class, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102004, "android/provider/Settings$Secure", "getString", null, objArr, Settings.Secure.class, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contentResolver2 = (ContentResolver) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        String string = Settings.Secure.getString(contentResolver2, str2);
        c0wst.LIZ(102004, "android/provider/Settings$Secure", "getString", string, objArr, Settings.Secure.class, c0wzw, true);
        return string;
    }

    public static String LLIIIZ(ContentResolver contentResolver, String str, C0WZX c0wzx) throws Throwable {
        String str2 = str;
        ContentResolver contentResolver2 = contentResolver;
        C0WST c0wst = new C0WST();
        Object[] objArr = {contentResolver2, str2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102003, "android/provider/Settings$System", "getString", Settings.System.class, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102003, "android/provider/Settings$System", "getString", null, objArr, Settings.System.class, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contentResolver2 = (ContentResolver) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        String string = Settings.System.getString(contentResolver2, str2);
        c0wst.LIZ(102003, "android/provider/Settings$System", "getString", string, objArr, Settings.System.class, c0wzw, true);
        return string;
    }

    public static String LLIZ(CookieManager cookieManager, String str, C0WZX c0wzx) throws Throwable {
        String str2 = str;
        CookieManager cookieManager2 = cookieManager;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str2};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;)Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(103100, "android/webkit/CookieManager", "getCookie", cookieManager2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(103100, "android/webkit/CookieManager", "getCookie", null, objArr, cookieManager2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                cookieManager2 = (CookieManager) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        String cookie = cookieManager2.getCookie(str2);
        c0wst.LIZ(103100, "android/webkit/CookieManager", "getCookie", cookie, objArr, cookieManager2, c0wzw, true);
        return cookie;
    }

    public static void LLJILJIL(PermissionRequest permissionRequest, String[] strArr, C0WZX c0wzx) throws Throwable {
        String[] strArr2 = strArr;
        PermissionRequest permissionRequest2 = permissionRequest;
        C0WST c0wst = new C0WST();
        Object[] objArr = {strArr2};
        C0WZW c0wzw = new C0WZW(false, "([Ljava/lang/String;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102605, "android/webkit/PermissionRequest", "grant", permissionRequest2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102605, "android/webkit/PermissionRequest", "grant", null, objArr, permissionRequest2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                permissionRequest2 = (PermissionRequest) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr2 = (String[]) obj2;
            }
        }
        permissionRequest2.grant(strArr2);
        c0wst.LIZ(102605, "android/webkit/PermissionRequest", "grant", null, objArr, permissionRequest2, c0wzw, true);
    }

    public static void LLJJI(C19GS c19gs, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        Activity activity = c19gs;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "androidx/appcompat/app/AppCompatActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "androidx/appcompat/app/AppCompatActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "androidx/appcompat/app/AppCompatActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    public static void LLJJJ(C19EG c19eg, int i, C0WZX c0wzx) {
        int iIntValue = i;
        Activity activity = c19eg;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "androidx/fragment/app/FragmentActivity", "setResult", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "androidx/fragment/app/FragmentActivity", "setResult", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        activity.setResult(iIntValue);
        c0wst.LIZ(11071, "androidx/fragment/app/FragmentActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void LLJJJJ(C19EG c19eg, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        Activity activity = c19eg;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "androidx/fragment/app/FragmentActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "androidx/fragment/app/FragmentActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "androidx/fragment/app/FragmentActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    public static void LLJJJJLIIL(C19EG c19eg, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        Activity activity = c19eg;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)Landroid/content/ComponentName;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11083, "androidx/fragment/app/FragmentActivity", "startForegroundService", activity, objArr, "android.content.ComponentName", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11083, "androidx/fragment/app/FragmentActivity", "startForegroundService", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        c0wst.LIZ(11083, "androidx/fragment/app/FragmentActivity", "startForegroundService", activity.startForegroundService(intent2), objArr, activity, c0wzw, true);
    }

    public static void LLJJL(C19EG c19eg, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        ContextWrapper contextWrapper = c19eg;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)Landroid/content/ComponentName;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11084, "androidx/fragment/app/FragmentActivity", "startService", contextWrapper, objArr, "android.content.ComponentName", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11084, "androidx/fragment/app/FragmentActivity", "startService", null, objArr, contextWrapper, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contextWrapper = (ContextWrapper) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        c0wst.LIZ(11084, "androidx/fragment/app/FragmentActivity", "startService", contextWrapper.startService(intent2), objArr, contextWrapper, c0wzw, true);
    }

    public static void LLJLIL(ProxyBillingActivity proxyBillingActivity, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        ContextWrapper contextWrapper = proxyBillingActivity;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11080, "com/android/billingclient/api/ProxyBillingActivity", "sendBroadcast", contextWrapper, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11080, "com/android/billingclient/api/ProxyBillingActivity", "sendBroadcast", null, objArr, contextWrapper, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contextWrapper = (ContextWrapper) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        contextWrapper.sendBroadcast(intent2);
        c0wst.LIZ(11080, "com/android/billingclient/api/ProxyBillingActivity", "sendBroadcast", null, objArr, contextWrapper, c0wzw, true);
    }

    public static String LLJLILLLLZIIL(CookieManagerAdapter cookieManagerAdapter, String str, C0WZX c0wzx) throws Throwable {
        String str2 = str;
        CookieManagerAdapter cookieManagerAdapter2 = cookieManagerAdapter;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str2};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;)Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(103100, "com/android/webview/chromium/CookieManagerAdapter", "getCookie", cookieManagerAdapter2, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(103100, "com/android/webview/chromium/CookieManagerAdapter", "getCookie", null, objArr, cookieManagerAdapter2, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                cookieManagerAdapter2 = (CookieManagerAdapter) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        String cookie = cookieManagerAdapter2.getCookie(str2);
        c0wst.LIZ(103100, "com/android/webview/chromium/CookieManagerAdapter", "getCookie", cookie, objArr, cookieManagerAdapter2, c0wzw, true);
        return cookie;
    }

    public static void LLLIZZ(SparkActivity sparkActivity, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        Activity activity = sparkActivity;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/bytedance/hybrid/spark/page/SparkActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/bytedance/hybrid/spark/page/SparkActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "com/bytedance/hybrid/spark/page/SparkActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    public static void LLLJ(BaseActivity baseActivity, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        Activity activity = baseActivity;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/bytedance/ies/foundation/activity/BaseActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/bytedance/ies/foundation/activity/BaseActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "com/bytedance/ies/foundation/activity/BaseActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    public static void LLLJL(GetPermissionActivity getPermissionActivity, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        ContextWrapper contextWrapper = getPermissionActivity;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11080, "com/bytedance/ies/xbridge/base/activity/GetPermissionActivity", "sendBroadcast", contextWrapper, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11080, "com/bytedance/ies/xbridge/base/activity/GetPermissionActivity", "sendBroadcast", null, objArr, contextWrapper, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contextWrapper = (ContextWrapper) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        contextWrapper.sendBroadcast(intent2);
        c0wst.LIZ(11080, "com/bytedance/ies/xbridge/base/activity/GetPermissionActivity", "sendBroadcast", null, objArr, contextWrapper, c0wzw, true);
    }

    public static void LLLLIILL(SceneActivityCompatibilityLayerFragment sceneActivityCompatibilityLayerFragment, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        Fragment fragment = sceneActivityCompatibilityLayerFragment;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11086, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "startActivity", fragment, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11086, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "startActivity", null, objArr, fragment, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment = (Fragment) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        fragment.startActivity(intent2);
        c0wst.LIZ(11086, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "startActivity", null, objArr, fragment, c0wzw, true);
    }

    public static C2204981BRo LLLLLLL(LatLngBounds latLngBounds, int i, C0WZX c0wzx) throws Throwable {
        int iIntValue = i;
        LatLngBounds latLngBounds2 = latLngBounds;
        C0WST c0wst = new C0WST();
        Object[] objArr = {latLngBounds2, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/maps/CameraUpdate;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11523, "com/google/android/gms/maps/CameraUpdateFactory", "newLatLngBounds", C2204991BRp.class, objArr, "com.google.android.gms.maps.CameraUpdate", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11523, "com/google/android/gms/maps/CameraUpdateFactory", "newLatLngBounds", null, objArr, C2204991BRp.class, c0wzw, false);
            return (C2204981BRo) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                latLngBounds2 = (LatLngBounds) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        try {
            InterfaceC2205031BRt interfaceC2205031BRt = C2204991BRp.LIZ;
            C0W3J.LJIIIZ(interfaceC2205031BRt, "CameraUpdateFactory is not initialized");
            C2204981BRo c2204981BRo = new C2204981BRo(interfaceC2205031BRt.LLLL(latLngBounds2, iIntValue));
            c0wst.LIZ(11523, "com/google/android/gms/maps/CameraUpdateFactory", "newLatLngBounds", c2204981BRo, objArr, C2204991BRp.class, c0wzw, true);
            return c2204981BRo;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public static C2205271BSr LLLLLLLLL(C1BSM c1bsm, MarkerOptions markerOptions, C0WZX c0wzx) throws Throwable {
        C2205271BSr c2205271BSr;
        MarkerOptions markerOptions2 = markerOptions;
        C1BSM c1bsm2 = c1bsm;
        C0WST c0wst = new C0WST();
        Object[] objArr = {markerOptions2};
        C0WZW c0wzw = new C0WZW(false, "(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11528, "com/google/android/gms/maps/GoogleMap", "addMarker", c1bsm2, objArr, "com.google.android.gms.maps.model.Marker", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11528, "com/google/android/gms/maps/GoogleMap", "addMarker", null, objArr, c1bsm2, c0wzw, false);
            return (C2205271BSr) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                c1bsm2 = (C1BSM) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                markerOptions2 = (MarkerOptions) obj2;
            }
        }
        c1bsm2.getClass();
        try {
            C0W3J.LJIIIZ(markerOptions2, "MarkerOptions must not be null.");
            InterfaceC2205261BSq interfaceC2205261BSqLLZIL = c1bsm2.LIZ.LLZIL(markerOptions2);
            if (interfaceC2205261BSqLLZIL != null) {
                c2205271BSr = new C2205271BSr(interfaceC2205261BSqLLZIL);
            } else {
                c2205271BSr = null;
            }
            c0wst.LIZ(11528, "com/google/android/gms/maps/GoogleMap", "addMarker", c2205271BSr, objArr, c1bsm2, c0wzw, true);
            return c2205271BSr;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public static void LLLLLLZ(C1BSM c1bsm, C2204981BRo c2204981BRo, C0WZX c0wzx) throws Throwable {
        C2204981BRo c2204981BRo2 = c2204981BRo;
        C1BSM c1bsm2 = c1bsm;
        C0WST c0wst = new C0WST();
        Object[] objArr = {c2204981BRo2};
        C0WZW c0wzw = new C0WZW(false, "(Lcom/google/android/gms/maps/CameraUpdate;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11516, "com/google/android/gms/maps/GoogleMap", "moveCamera", c1bsm2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11516, "com/google/android/gms/maps/GoogleMap", "moveCamera", null, objArr, c1bsm2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                c1bsm2 = (C1BSM) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                c2204981BRo2 = (C2204981BRo) obj2;
            }
        }
        c1bsm2.getClass();
        try {
            C0W3J.LJIIIZ(c2204981BRo2, "CameraUpdate must not be null.");
            c1bsm2.LIZ.LLLLLLLZIL(c2204981BRo2.LIZ);
            c0wst.LIZ(11516, "com/google/android/gms/maps/GoogleMap", "moveCamera", null, objArr, c1bsm2, c0wzw, true);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public static C2204971BRn LLLLLLZZ(C2204971BRn c2204971BRn, LatLng latLng, C0WZX c0wzx) throws Throwable {
        LatLng latLng2 = latLng;
        C2204971BRn c2204971BRn2 = c2204971BRn;
        C0WST c0wst = new C0WST();
        Object[] objArr = {latLng2};
        C0WZW c0wzw = new C0WZW(false, "(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11527, "com/google/android/gms/maps/model/LatLngBounds$Builder", "include", c2204971BRn2, objArr, "com.google.android.gms.maps.model.LatLngBounds$Builder", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11527, "com/google/android/gms/maps/model/LatLngBounds$Builder", "include", null, objArr, c2204971BRn2, c0wzw, false);
            return (C2204971BRn) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                c2204971BRn2 = (C2204971BRn) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                latLng2 = (LatLng) obj2;
            }
        }
        c2204971BRn2.getClass();
        c2204971BRn2.LIZ = Math.min(c2204971BRn2.LIZ, latLng2.latitude);
        c2204971BRn2.LIZIZ = Math.max(c2204971BRn2.LIZIZ, latLng2.latitude);
        double d = latLng2.longitude;
        if (Double.isNaN(c2204971BRn2.LIZJ)) {
            c2204971BRn2.LIZJ = d;
            c2204971BRn2.LIZLLL = d;
        } else {
            double d2 = c2204971BRn2.LIZJ;
            double d3 = c2204971BRn2.LIZLLL;
            if (d2 > d3 ? !(d2 <= d || d <= d3) : !(d2 <= d && d <= d3)) {
                if (((d2 - d) + 360.0d) % 360.0d < ((d - d3) + 360.0d) % 360.0d) {
                    c2204971BRn2.LIZJ = d;
                } else {
                    c2204971BRn2.LIZLLL = d;
                }
            }
        }
        c0wst.LIZ(11527, "com/google/android/gms/maps/model/LatLngBounds$Builder", "include", c2204971BRn2, objArr, c2204971BRn2, c0wzw, true);
        return c2204971BRn2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LLLLLZ(com.google.android.gms.maps.model.LatLngBounds r18, com.google.android.gms.maps.model.LatLng r19, X.C0WZX r20) throws java.lang.Throwable {
        /*
            r6 = r19
            r2 = r18
            X.0WST r12 = new X.0WST
            r12.<init>()
            r5 = 1
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r3 = 0
            r9[r3] = r6
            X.0WZW r8 = new X.0WZW
            java.lang.String r0 = "(Lcom/google/android/gms/maps/model/LatLng;)Z"
            r1 = r20
            r8.<init>(r3, r0, r1)
            r13 = 11522(0x2d02, float:1.6146E-41)
            java.lang.String r14 = "com/google/android/gms/maps/model/LatLngBounds"
            java.lang.String r15 = "contains"
            java.lang.String r18 = "boolean"
            r12 = r12
            r13 = r13
            r16 = r2
            r17 = r9
            r19 = r8
            X.0WSU r1 = r12.LIZIZ(r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L4a
            r16 = 0
            java.lang.String r14 = "com/google/android/gms/maps/model/LatLngBounds"
            java.lang.String r15 = "contains"
            r19 = r8
            r20 = r3
            r18 = r2
            r17 = r9
            r12.LIZ(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r0 = r1.LIZIZ
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L4a:
            java.lang.Object[] r1 = r1.LIZJ
            if (r1 == 0) goto L5c
            r0 = r1[r3]
            if (r0 == 0) goto L55
            r2 = r0
            com.google.android.gms.maps.model.LatLngBounds r2 = (com.google.android.gms.maps.model.LatLngBounds) r2
        L55:
            r0 = r1[r5]
            if (r0 == 0) goto L5c
            r6 = r0
            com.google.android.gms.maps.model.LatLng r6 = (com.google.android.gms.maps.model.LatLng) r6
        L5c:
            r2.getClass()
            java.lang.String r0 = "point must not be null."
            X.C0W3J.LJIIIZ(r6, r0)
            double r3 = r6.latitude
            com.google.android.gms.maps.model.LatLng r11 = r2.southwest
            double r0 = r11.latitude
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 > 0) goto La5
            com.google.android.gms.maps.model.LatLng r10 = r2.northeast
            double r0 = r10.latitude
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 > 0) goto La5
            double r6 = r6.longitude
            double r3 = r11.longitude
            double r0 = r10.longitude
            int r11 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            int r10 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r11 > 0) goto L9e
            if (r10 > 0) goto La5
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 > 0) goto La5
        L88:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r5)
            r13 = 11522(0x2d02, float:1.6146E-41)
            java.lang.String r14 = "com/google/android/gms/maps/model/LatLngBounds"
            java.lang.String r15 = "contains"
            r20 = 1
            r19 = r8
            r18 = r2
            r17 = r9
            r12.LIZ(r13, r14, r15, r16, r17, r18, r19, r20)
            return r5
        L9e:
            if (r10 <= 0) goto L88
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 > 0) goto La5
            goto L88
        La5:
            r5 = 0
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2204961BRm.LLLLLZ(com.google.android.gms.maps.model.LatLngBounds, com.google.android.gms.maps.model.LatLng, X.0WZX):boolean");
    }

    public static MarkerOptions LLLLLZIL(MarkerOptions markerOptions, LatLng latLng, C0WZX c0wzx) throws Throwable {
        LatLng latLng2 = latLng;
        MarkerOptions markerOptions2 = markerOptions;
        C0WST c0wst = new C0WST();
        Object[] objArr = {latLng2};
        C0WZW c0wzw = new C0WZW(false, "(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11520, "com/google/android/gms/maps/model/MarkerOptions", "position", markerOptions2, objArr, "com.google.android.gms.maps.model.MarkerOptions", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11520, "com/google/android/gms/maps/model/MarkerOptions", "position", null, objArr, markerOptions2, c0wzw, false);
            return (MarkerOptions) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                markerOptions2 = (MarkerOptions) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                latLng2 = (LatLng) obj2;
            }
        }
        if (latLng2 != null) {
            markerOptions2.zza = latLng2;
            MarkerOptions markerOptions3 = markerOptions2;
            MarkerOptions markerOptions4 = markerOptions2;
            c0wst.LIZ(11520, "com/google/android/gms/maps/model/MarkerOptions", "position", markerOptions3, objArr, markerOptions4, c0wzw, true);
            return markerOptions4;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public static void LLLLLZL(C2205271BSr c2205271BSr, LatLng latLng, C0WZX c0wzx) throws Throwable {
        LatLng latLng2 = latLng;
        C2205271BSr c2205271BSr2 = c2205271BSr;
        C0WST c0wst = new C0WST();
        Object[] objArr = {latLng2};
        C0WZW c0wzw = new C0WZW(false, "(Lcom/google/android/gms/maps/model/LatLng;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11512, "com/google/android/gms/maps/model/Marker", "setPosition", c2205271BSr2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11512, "com/google/android/gms/maps/model/Marker", "setPosition", null, objArr, c2205271BSr2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                c2205271BSr2 = (C2205271BSr) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                latLng2 = (LatLng) obj2;
            }
        }
        c2205271BSr2.getClass();
        try {
            c2205271BSr2.LIZ.v(latLng2);
            c0wst.LIZ(11512, "com/google/android/gms/maps/model/Marker", "setPosition", null, objArr, c2205271BSr2, c0wzw, true);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public static ComponentName LLLLZ(DataMessageReceivingService dataMessageReceivingService, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        ContextWrapper contextWrapper = dataMessageReceivingService;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)Landroid/content/ComponentName;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11084, "com/heytap/msp/push/service/DataMessageReceivingService", "startService", contextWrapper, objArr, "android.content.ComponentName", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11084, "com/heytap/msp/push/service/DataMessageReceivingService", "startService", null, objArr, contextWrapper, c0wzw, false);
            return (ComponentName) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contextWrapper = (ContextWrapper) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        ComponentName componentNameStartService = contextWrapper.startService(intent2);
        c0wst.LIZ(11084, "com/heytap/msp/push/service/DataMessageReceivingService", "startService", componentNameStartService, objArr, contextWrapper, c0wzw, true);
        return componentNameStartService;
    }

    public static void LLLLZI(C1045790dJx c1045790dJx, C1045910dK9 c1045910dK9, C0WZX c0wzx) throws Throwable {
        C1045910dK9 c1045910dK92 = c1045910dK9;
        C1045790dJx c1045790dJx2 = c1045790dJx;
        C0WST c0wst = new C0WST();
        Object[] objArr = {c1045910dK92};
        C0WZW c0wzw = new C0WZW(false, "(Lcom/iab/omid/library/bytedance1/adsession/media/VastProperties;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11057, "com/iab/omid/library/bytedance1/adsession/AdEvents", "loaded", c1045790dJx2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11057, "com/iab/omid/library/bytedance1/adsession/AdEvents", "loaded", null, objArr, c1045790dJx2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                c1045790dJx2 = (C1045790dJx) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                c1045910dK92 = (C1045910dK9) obj2;
            }
        }
        C1045780dJw.LIZJ(c1045790dJx2.LIZ);
        C1045760dJu c1045760dJu = c1045790dJx2.LIZ.LIZIZ;
        c1045760dJu.getClass();
        if (EnumC1046030dKL.NATIVE == c1045760dJu.LIZ) {
            C1BUP c1bup = c1045790dJx2.LIZ;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("skippable", c1045910dK92.LIZ);
                if (c1045910dK92.LIZ) {
                    jSONObject.put("skipOffset", c1045910dK92.LIZIZ);
                }
                jSONObject.put("autoPlay", c1045910dK92.LIZJ);
                jSONObject.put("position", c1045910dK92.LIZLLL);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1287880jcQ.LIZ("VastProperties: JSON error");
            }
            if (!c1bup.LJIIIZ) {
                C1BUI c1bui = c1bup.LJ;
                c1bui.getClass();
                C1287860jcO.LIZ.LIZ(c1bui.LJI(), "publishLoadedEvent", jSONObject, c1bui.LIZ);
                c1bup.LJIIIZ = true;
                c0wst.LIZ(11057, "com/iab/omid/library/bytedance1/adsession/AdEvents", "loaded", null, objArr, c1045790dJx2, c0wzw, true);
                return;
            }
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    public static void LLLLZLLLI(ShareDataActivity shareDataActivity, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/account/share/data/write/activity/ShareDataActivity", "setResult", shareDataActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/account/share/data/write/activity/ShareDataActivity", "setResult", null, objArr, shareDataActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = shareDataActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = shareDataActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/account/share/data/write/activity/ShareDataActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void LLLZLZ(ChooseMusicActivity chooseMusicActivity, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/choosemusic/activity/ChooseMusicActivity", "setResult", chooseMusicActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/choosemusic/activity/ChooseMusicActivity", "setResult", null, objArr, chooseMusicActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = chooseMusicActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = chooseMusicActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/choosemusic/activity/ChooseMusicActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void LLZLLIL(FTCVideoRecordNewActivity fTCVideoRecordNewActivity, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {intent, -1};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)Z", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11097, "com/ss/android/ugc/aweme/ftc/FTCVideoRecordNewActivity", "startActivityIfNeeded", fTCVideoRecordNewActivity, objArr, "boolean", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11097, "com/ss/android/ugc/aweme/ftc/FTCVideoRecordNewActivity", "startActivityIfNeeded", null, objArr, fTCVideoRecordNewActivity, c0wzw, false);
            ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = fTCVideoRecordNewActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            activity = fTCVideoRecordNewActivity;
            intent2 = intent;
        }
        c0wst.LIZ(11097, "com/ss/android/ugc/aweme/ftc/FTCVideoRecordNewActivity", "startActivityIfNeeded", Boolean.valueOf(activity.startActivityIfNeeded(intent2, iIntValue)), objArr, activity, c0wzw, true);
    }

    public static void LLZZZIL(com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity chooseMusicActivity, Intent intent, C0WZX c0wzx) throws Throwable {
        com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity chooseMusicActivity2;
        Intent intent2;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/kids/choosemusic/activity/ChooseMusicActivity", "setResult", chooseMusicActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/kids/choosemusic/activity/ChooseMusicActivity", "setResult", null, objArr, chooseMusicActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                chooseMusicActivity2 = (Activity) obj;
            } else {
                chooseMusicActivity2 = chooseMusicActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            chooseMusicActivity2 = chooseMusicActivity;
            intent2 = intent;
        }
        chooseMusicActivity2.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/kids/choosemusic/activity/ChooseMusicActivity", "setResult", null, objArr, chooseMusicActivity2, c0wzw, true);
    }

    public static void O(AddWikiActivity addWikiActivity, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        Activity activity = addWikiActivity;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/wiki/AddWikiActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/wiki/AddWikiActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/wiki/AddWikiActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    public static void P(Intent intent, C0WZX c0wzx, AbstractActivityC559670LxF abstractActivityC559670LxF) throws Throwable {
        Intent intent2;
        Activity activity;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/cut_ui_impl/newplayer/CutPlayerActivity", "setResult", abstractActivityC559670LxF, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/cut_ui_impl/newplayer/CutPlayerActivity", "setResult", null, objArr, abstractActivityC559670LxF, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = abstractActivityC559670LxF;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            intent2 = intent;
            activity = abstractActivityC559670LxF;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/cut_ui_impl/newplayer/CutPlayerActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void S(ProfileBgVideoPreviewActivity profileBgVideoPreviewActivity, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/profile/business/profile/background/ProfileBgVideoPreviewActivity", "setResult", profileBgVideoPreviewActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/profile/business/profile/background/ProfileBgVideoPreviewActivity", "setResult", null, objArr, profileBgVideoPreviewActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = profileBgVideoPreviewActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = profileBgVideoPreviewActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/profile/business/profile/background/ProfileBgVideoPreviewActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void X(Intent intent, C0WZX c0wzx, MatisseActivity matisseActivity) throws Throwable {
        Intent intent2;
        Activity activity;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/zhihu/matisse/ui/MatisseActivity", "setResult", matisseActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/zhihu/matisse/ui/MatisseActivity", "setResult", null, objArr, matisseActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = matisseActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            intent2 = intent;
            activity = matisseActivity;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/zhihu/matisse/ui/MatisseActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void d(AwemeAuthorizeLoginActivity awemeAuthorizeLoginActivity, int i, C0WZX c0wzx) throws Throwable {
        int iIntValue = i;
        Activity activity = awemeAuthorizeLoginActivity;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/openauthorize/AwemeAuthorizeLoginActivity", "setResult", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/openauthorize/AwemeAuthorizeLoginActivity", "setResult", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        activity.setResult(iIntValue);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/openauthorize/AwemeAuthorizeLoginActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void e(C1B3N c1b3n, Intent intent, C0WZX c0wzx) throws Throwable {
        Intent intent2 = intent;
        Activity activity = c1b3n;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/openauthorize/BaseI18nAuthorizedNewActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/openauthorize/BaseI18nAuthorizedNewActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/openauthorize/BaseI18nAuthorizedNewActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    public static void f(EffectMobileTemplateEditActivity effectMobileTemplateEditActivity, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/prop/activity/EffectMobileTemplateEditActivity", "setResult", effectMobileTemplateEditActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/prop/activity/EffectMobileTemplateEditActivity", "setResult", null, objArr, effectMobileTemplateEditActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = effectMobileTemplateEditActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = effectMobileTemplateEditActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/prop/activity/EffectMobileTemplateEditActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static URLConnection f0(URL url, Proxy proxy, C0WZX c0wzx) throws Throwable {
        URL url2 = url;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400000, "java/net/URL", "openConnection", url2, new Object[]{proxy}, "java.net.URLConnection", new C0WZW(false, "(Ljava/net/Proxy;)Ljava/net/URLConnection;", c0wzx));
        if (c0wsuLIZIZ.LIZ) {
            return (URLConnection) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                url2 = (URL) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                proxy = (Proxy) obj2;
            }
        }
        return url2.openConnection(proxy);
    }

    public static void g(EffectMobileTplEditV2Activity effectMobileTplEditV2Activity, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/prop/activity/EffectMobileTplEditV2Activity", "setResult", effectMobileTplEditV2Activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/prop/activity/EffectMobileTplEditV2Activity", "setResult", null, objArr, effectMobileTplEditV2Activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = effectMobileTplEditV2Activity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = effectMobileTplEditV2Activity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/prop/activity/EffectMobileTplEditV2Activity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void h(EffectMobileTemplatePublishActivity effectMobileTemplatePublishActivity, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/publish/activity/EffectMobileTemplatePublishActivity", "setResult", effectMobileTemplatePublishActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/publish/activity/EffectMobileTemplatePublishActivity", "setResult", null, objArr, effectMobileTemplatePublishActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = effectMobileTemplatePublishActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = effectMobileTemplatePublishActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/publish/activity/EffectMobileTemplatePublishActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void i0(InterfaceC1495580p1Q interfaceC1495580p1Q, InterfaceC1495610p1T interfaceC1495610p1T, C0WZX c0wzx) throws Throwable {
        InterfaceC1495580p1Q interfaceC1495580p1Q2 = interfaceC1495580p1Q;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400103, "okhttp3/Call", "enqueue", interfaceC1495580p1Q2, new Object[]{interfaceC1495610p1T}, "void", new C0WZW(false, "(Lokhttp3/Callback;)V", c0wzx));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                interfaceC1495580p1Q2 = (InterfaceC1495580p1Q) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                interfaceC1495610p1T = (InterfaceC1495610p1T) obj2;
            }
        }
        interfaceC1495580p1Q2.LJLZ(interfaceC1495610p1T);
    }

    public static void j(ScanQRCodeActivityV2 scanQRCodeActivityV2, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/qrcode/view/ScanQRCodeActivityV2", "setResult", scanQRCodeActivityV2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/qrcode/view/ScanQRCodeActivityV2", "setResult", null, objArr, scanQRCodeActivityV2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = scanQRCodeActivityV2;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = scanQRCodeActivityV2;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/qrcode/view/ScanQRCodeActivityV2", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void k(VideoShare2GifPreviewActivity videoShare2GifPreviewActivity, int i, C0WZX c0wzx) throws Throwable {
        int iIntValue = i;
        Activity activity = videoShare2GifPreviewActivity;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/share/gif/ui/VideoShare2GifPreviewActivity", "setResult", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/share/gif/ui/VideoShare2GifPreviewActivity", "setResult", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
        }
        activity.setResult(iIntValue);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/share/gif/ui/VideoShare2GifPreviewActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void m(MentionVideoActivity mentionVideoActivity, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/shortvideo/mentionvideo/MentionVideoActivity", "setResult", mentionVideoActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/shortvideo/mentionvideo/MentionVideoActivity", "setResult", null, objArr, mentionVideoActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = mentionVideoActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = mentionVideoActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/shortvideo/mentionvideo/MentionVideoActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void z(Context context, Bundle bundle, C0WZX c0wzx) throws Throwable {
        Bundle bundle2 = bundle;
        Context context2 = context;
        C0WST c0wst = new C0WST();
        Object[] objArr = {context2, bundle2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Context;Landroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/tools/draft/DraftBoxActivity", "startActivity", DraftBoxActivity.class, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/tools/draft/DraftBoxActivity", "startActivity", null, objArr, DraftBoxActivity.class, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                context2 = (Context) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                bundle2 = (Bundle) obj2;
            }
        }
        String str = DraftBoxActivity._pnsPageId;
        if (context2 != null) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_draft_not_request_album_permission", true, false)) {
                Intent intent = new Intent(context2, (Class<?>) DraftBoxActivity.class);
                if (bundle2 != null) {
                    intent.putExtras(bundle2);
                }
                DraftBoxActivity.LLLLZLL(context2, intent);
            } else {
                DraftBoxActivity.LLLLZLLIL(context2, new AObjectS284S0200000_8(context2, bundle2, 3), new AObjectS383S0100000_8(context2, 24));
            }
        }
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/tools/draft/DraftBoxActivity", "startActivity", null, objArr, DraftBoxActivity.class, c0wzw, true);
    }

    public static String LJ(AccountManager accountManager, Account account, String str, C0WZX c0wzx) throws Throwable {
        AccountManager accountManager2;
        Account account2;
        String str2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {account, str};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(110, "android/accounts/AccountManager", "getUserData", accountManager, objArr, "java.lang.String", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(110, "android/accounts/AccountManager", "getUserData", null, objArr, accountManager, c0wzw, false);
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                accountManager2 = (AccountManager) obj;
            } else {
                accountManager2 = accountManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                account2 = (Account) obj2;
            } else {
                account2 = account;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                str2 = (String) obj3;
            } else {
                str2 = str;
            }
        } else {
            accountManager2 = accountManager;
            account2 = account;
            str2 = str;
        }
        String userData = accountManager2.getUserData(account2, str2);
        c0wst.LIZ(110, "android/accounts/AccountManager", "getUserData", userData, objArr, accountManager2, c0wzw, true);
        return userData;
    }

    public static void LJIIJ(Activity activity, String[] strArr, int i, C0WZX c0wzx) throws Throwable {
        Activity activity2;
        String[] strArr2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {strArr, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "([Ljava/lang/String;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102600, "android/app/Activity", "requestPermissions", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102600, "android/app/Activity", "requestPermissions", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity2 = (Activity) obj;
            } else {
                activity2 = activity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr2 = (String[]) obj2;
            } else {
                strArr2 = strArr;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            activity2 = activity;
            strArr2 = strArr;
        }
        activity2.requestPermissions(strArr2, iIntValue);
        c0wst.LIZ(102600, "android/app/Activity", "requestPermissions", null, objArr, activity2, c0wzw, true);
    }

    public static void LJIIL(int i, Activity activity, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity2;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "android/app/Activity", "setResult", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "android/app/Activity", "setResult", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity2 = (Activity) obj;
            } else {
                activity2 = activity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity2 = activity;
            intent2 = intent;
        }
        activity2.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "android/app/Activity", "setResult", null, objArr, activity2, c0wzw, true);
    }

    public static void LJIILL(Activity activity, Intent intent, Bundle bundle, C0WZX c0wzx) throws Throwable {
        Activity activity2;
        Intent intent2;
        Bundle bundle2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, bundle};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;Landroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "android/app/Activity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "android/app/Activity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity2 = (Activity) obj;
            } else {
                activity2 = activity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                bundle2 = (Bundle) obj3;
            } else {
                bundle2 = bundle;
            }
        } else {
            activity2 = activity;
            intent2 = intent;
            bundle2 = bundle;
        }
        activity2.startActivity(intent2, bundle2);
        c0wst.LIZ(11098, "android/app/Activity", "startActivity", null, objArr, activity2, c0wzw, true);
    }

    public static void LJIIZILJ(int i, Activity activity, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity2;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "android/app/Activity", "startActivityForResult", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11094, "android/app/Activity", "startActivityForResult", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity2 = (Activity) obj;
            } else {
                activity2 = activity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            activity2 = activity;
            intent2 = intent;
        }
        activity2.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11094, "android/app/Activity", "startActivityForResult", null, objArr, activity2, c0wzw, true);
    }

    public static boolean LJIJJLI(Application application, Intent intent, ServiceConnection serviceConnection, C0WZX c0wzx) throws Throwable {
        ContextWrapper contextWrapper;
        Intent intent2;
        ServiceConnection serviceConnection2;
        C0WST c0wst = new C0WST();
        int iIntValue = 1;
        Object[] objArr = {intent, serviceConnection, 1};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11063, "android/app/Application", "bindService", application, objArr, "boolean", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11063, "android/app/Application", "bindService", null, objArr, application, c0wzw, false);
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contextWrapper = (ContextWrapper) obj;
            } else {
                contextWrapper = application;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                serviceConnection2 = (ServiceConnection) obj3;
            } else {
                serviceConnection2 = serviceConnection;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                iIntValue = ((Integer) obj4).intValue();
            }
        } else {
            contextWrapper = application;
            intent2 = intent;
            serviceConnection2 = serviceConnection;
        }
        boolean zBindService = contextWrapper.bindService(intent2, serviceConnection2, iIntValue);
        c0wst.LIZ(11063, "android/app/Application", "bindService", Boolean.valueOf(zBindService), objArr, contextWrapper, c0wzw, true);
        return zBindService;
    }

    public static StorageStats LJJII(StorageStatsManager storageStatsManager, UUID uuid, int i, C0WZX c0wzx) throws Throwable {
        StorageStatsManager storageStatsManager2;
        UUID uuid2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {uuid, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/util/UUID;I)Landroid/app/usage/StorageStats;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10911, "android/app/usage/StorageStatsManager", "queryStatsForUid", storageStatsManager, objArr, "android.app.usage.StorageStats", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10911, "android/app/usage/StorageStatsManager", "queryStatsForUid", null, objArr, storageStatsManager, c0wzw, false);
            return (StorageStats) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                storageStatsManager2 = (StorageStatsManager) obj;
            } else {
                storageStatsManager2 = storageStatsManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                uuid2 = (UUID) obj2;
            } else {
                uuid2 = uuid;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            storageStatsManager2 = storageStatsManager;
            uuid2 = uuid;
        }
        StorageStats storageStatsQueryStatsForUid = storageStatsManager2.queryStatsForUid(uuid2, iIntValue);
        c0wst.LIZ(10911, "android/app/usage/StorageStatsManager", "queryStatsForUid", storageStatsQueryStatsForUid, objArr, storageStatsManager2, c0wzw, true);
        return storageStatsQueryStatsForUid;
    }

    public static Uri LJJIJLIJ(ContentResolver contentResolver, Uri uri, ContentValues contentValues, C0WZX c0wzx) throws Throwable {
        ContentResolver contentResolver2;
        Uri uri2;
        ContentValues contentValues2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {uri, contentValues};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10972, "android/content/ContentResolver", "insert", contentResolver, objArr, "android.net.Uri", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10972, "android/content/ContentResolver", "insert", null, objArr, contentResolver, c0wzw, false);
            return (Uri) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contentResolver2 = (ContentResolver) obj;
            } else {
                contentResolver2 = contentResolver;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                uri2 = (Uri) obj2;
            } else {
                uri2 = uri;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                contentValues2 = (ContentValues) obj3;
            } else {
                contentValues2 = contentValues;
            }
        } else {
            contentResolver2 = contentResolver;
            uri2 = uri;
            contentValues2 = contentValues;
        }
        Uri uriInsert = contentResolver2.insert(uri2, contentValues2);
        c0wst.LIZ(10972, "android/content/ContentResolver", "insert", uriInsert, objArr, contentResolver2, c0wzw, true);
        return uriInsert;
    }

    public static void LJJJJJ(Context context, Intent intent, Bundle bundle, C0WZX c0wzx) throws Throwable {
        Context context2;
        Intent intent2;
        Bundle bundle2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, bundle};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;Landroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11090, "android/content/Context", "startActivity", context, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11090, "android/content/Context", "startActivity", null, objArr, context, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                context2 = (Context) obj;
            } else {
                context2 = context;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                bundle2 = (Bundle) obj3;
            } else {
                bundle2 = bundle;
            }
        } else {
            context2 = context;
            intent2 = intent;
            bundle2 = bundle;
        }
        context2.startActivity(intent2, bundle2);
        c0wst.LIZ(11090, "android/content/Context", "startActivity", null, objArr, context2, c0wzw, true);
    }

    public static PackageInfo LJJJJLI(PackageManager packageManager, String str, PackageManager.PackageInfoFlags packageInfoFlags, C0WZX c0wzx) throws Throwable {
        PackageManager packageManager2;
        String str2;
        PackageManager.PackageInfoFlags packageInfoFlags2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str, packageInfoFlags};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10054, "android/content/pm/PackageManager", "getPackageInfo", packageManager, objArr, "android.content.pm.PackageInfo", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10054, "android/content/pm/PackageManager", "getPackageInfo", null, objArr, packageManager, c0wzw, false);
            return (PackageInfo) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                packageManager2 = (PackageManager) obj;
            } else {
                packageManager2 = packageManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            } else {
                str2 = str;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                packageInfoFlags2 = (PackageManager.PackageInfoFlags) obj3;
            } else {
                packageInfoFlags2 = packageInfoFlags;
            }
        } else {
            packageManager2 = packageManager;
            str2 = str;
            packageInfoFlags2 = packageInfoFlags;
        }
        PackageInfo packageInfo = packageManager2.getPackageInfo(str2, packageInfoFlags2);
        c0wst.LIZ(10054, "android/content/pm/PackageManager", "getPackageInfo", packageInfo, objArr, packageManager2, c0wzw, true);
        return packageInfo;
    }

    public static List LJJJJZ(PackageManager packageManager, Intent intent, int i, C0WZX c0wzx) throws Throwable {
        PackageManager packageManager2;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)Ljava/util/List;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, objArr, "java.util.List", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(101311, "android/content/pm/PackageManager", "queryIntentActivities", null, objArr, packageManager, c0wzw, false);
            return (List) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                packageManager2 = (PackageManager) obj;
            } else {
                packageManager2 = packageManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            packageManager2 = packageManager;
            intent2 = intent;
        }
        List<ResolveInfo> listQueryIntentActivities = packageManager2.queryIntentActivities(intent2, iIntValue);
        c0wst.LIZ(101311, "android/content/pm/PackageManager", "queryIntentActivities", listQueryIntentActivities, objArr, packageManager2, c0wzw, true);
        return listQueryIntentActivities;
    }

    public static void LJJLIIIJILLIZJL(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, C0WZX c0wzx) throws Throwable {
        SensorManager sensorManager2;
        SensorEventListener sensorEventListener2;
        Sensor sensor2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {sensorEventListener, sensor};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100701, "android/hardware/SensorManager", "unregisterListener", sensorManager, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100701, "android/hardware/SensorManager", "unregisterListener", null, objArr, sensorManager, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                sensorManager2 = (SensorManager) obj;
            } else {
                sensorManager2 = sensorManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                sensorEventListener2 = (SensorEventListener) obj2;
            } else {
                sensorEventListener2 = sensorEventListener;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                sensor2 = (Sensor) obj3;
            } else {
                sensor2 = sensor;
            }
        } else {
            sensorManager2 = sensorManager;
            sensorEventListener2 = sensorEventListener;
            sensor2 = sensor;
        }
        sensorManager2.unregisterListener(sensorEventListener2, sensor2);
        c0wst.LIZ(100701, "android/hardware/SensorManager", "unregisterListener", null, objArr, sensorManager2, c0wzw, true);
    }

    public static int LJJZZIII(AudioRecord audioRecord, ByteBuffer byteBuffer, int i, C0WZX c0wzx) throws Throwable {
        AudioRecord audioRecord2;
        ByteBuffer byteBuffer2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {byteBuffer, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/nio/ByteBuffer;I)I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10892, "android/media/AudioRecord", "read", audioRecord, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10892, "android/media/AudioRecord", "read", null, objArr, audioRecord, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                audioRecord2 = (AudioRecord) obj;
            } else {
                audioRecord2 = audioRecord;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                byteBuffer2 = (ByteBuffer) obj2;
            } else {
                byteBuffer2 = byteBuffer;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            audioRecord2 = audioRecord;
            byteBuffer2 = byteBuffer;
        }
        int i2 = audioRecord2.read(byteBuffer2, iIntValue);
        c0wst.LIZ(10892, "android/media/AudioRecord", "read", Integer.valueOf(i2), objArr, audioRecord2, c0wzw, true);
        return i2;
    }

    public static int LJL(AudioRecord audioRecord, byte[] bArr, int i, C0WZX c0wzx) throws Throwable {
        AudioRecord audioRecord2;
        byte[] bArr2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        int iIntValue2 = 0;
        Object[] objArr = {bArr, 0, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "([BII)I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10892, "android/media/AudioRecord", "read", audioRecord, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10892, "android/media/AudioRecord", "read", null, objArr, audioRecord, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                audioRecord2 = (AudioRecord) obj;
            } else {
                audioRecord2 = audioRecord;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                bArr2 = (byte[]) obj2;
            } else {
                bArr2 = bArr;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue2 = ((Integer) obj3).intValue();
            }
            Object obj4 = c0wsuLIZIZ.LIZJ[3];
            if (obj4 != null) {
                iIntValue = ((Integer) obj4).intValue();
            }
        } else {
            audioRecord2 = audioRecord;
            bArr2 = bArr;
        }
        int i2 = audioRecord2.read(bArr2, iIntValue2, iIntValue);
        c0wst.LIZ(10892, "android/media/AudioRecord", "read", Integer.valueOf(i2), objArr, audioRecord2, c0wzw, true);
        return i2;
    }

    public static void LLILIL(TelephonyManager telephonyManager, PhoneStateListener phoneStateListener, int i, C0WZX c0wzx) throws Throwable {
        TelephonyManager telephonyManager2;
        PhoneStateListener phoneStateListener2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {phoneStateListener, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/telephony/PhoneStateListener;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2801, "android/telephony/TelephonyManager", "listen", telephonyManager, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2801, "android/telephony/TelephonyManager", "listen", null, objArr, telephonyManager, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                telephonyManager2 = (TelephonyManager) obj;
            } else {
                telephonyManager2 = telephonyManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                phoneStateListener2 = (PhoneStateListener) obj2;
            } else {
                phoneStateListener2 = phoneStateListener;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            telephonyManager2 = telephonyManager;
            phoneStateListener2 = phoneStateListener;
        }
        telephonyManager2.listen(phoneStateListener2, iIntValue);
        c0wst.LIZ(2801, "android/telephony/TelephonyManager", "listen", null, objArr, telephonyManager2, c0wzw, true);
    }

    public static void LLJ(CookieManager cookieManager, String str, String str2, C0WZX c0wzx) throws Throwable {
        CookieManager cookieManager2;
        String str3;
        String str4;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str, str2};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11025, "android/webkit/CookieManager", "setCookie", cookieManager, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11025, "android/webkit/CookieManager", "setCookie", null, objArr, cookieManager, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                cookieManager2 = (CookieManager) obj;
            } else {
                cookieManager2 = cookieManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str3 = (String) obj2;
            } else {
                str3 = str;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                str4 = (String) obj3;
            } else {
                str4 = str2;
            }
        } else {
            cookieManager2 = cookieManager;
            str3 = str;
            str4 = str2;
        }
        cookieManager2.setCookie(str3, str4);
        c0wst.LIZ(11025, "android/webkit/CookieManager", "setCookie", null, objArr, cookieManager2, c0wzw, true);
    }

    public static void LLJI(GeolocationPermissions.Callback callback, String str, boolean z, C0WZX c0wzx) throws Throwable {
        GeolocationPermissions.Callback callback2;
        String str2;
        boolean zBooleanValue = z;
        C0WST c0wst = new C0WST();
        boolean zBooleanValue2 = false;
        Object[] objArr = {str, Boolean.valueOf(zBooleanValue), Boolean.FALSE};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;ZZ)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100012, "android/webkit/GeolocationPermissions$Callback", "invoke", callback, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100012, "android/webkit/GeolocationPermissions$Callback", "invoke", null, objArr, callback, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                callback2 = (GeolocationPermissions.Callback) obj;
            } else {
                callback2 = callback;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            } else {
                str2 = str;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                zBooleanValue = ((Boolean) obj3).booleanValue();
            }
            Object obj4 = c0wsuLIZIZ.LIZJ[3];
            if (obj4 != null) {
                zBooleanValue2 = ((Boolean) obj4).booleanValue();
            }
        } else {
            callback2 = callback;
            str2 = str;
        }
        callback2.invoke(str2, zBooleanValue, zBooleanValue2);
        c0wst.LIZ(100012, "android/webkit/GeolocationPermissions$Callback", "invoke", null, objArr, callback2, c0wzw, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLJJIJI(android.app.Activity r17, java.lang.String[] r18, int r19, X.C0WZX r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2204961BRm.LLJJIJI(android.app.Activity, java.lang.String[], int, X.0WZX):void");
    }

    public static void LLJJIJIIJIL(C19EG c19eg, Intent intent, ServiceConnection serviceConnection, C0WZX c0wzx) throws Throwable {
        ContextWrapper contextWrapper;
        Intent intent2;
        ServiceConnection serviceConnection2;
        C0WST c0wst = new C0WST();
        int iIntValue = 1;
        Object[] objArr = {intent, serviceConnection, 1};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11063, "androidx/fragment/app/FragmentActivity", "bindService", c19eg, objArr, "boolean", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11063, "androidx/fragment/app/FragmentActivity", "bindService", null, objArr, c19eg, c0wzw, false);
            ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contextWrapper = (ContextWrapper) obj;
            } else {
                contextWrapper = c19eg;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                serviceConnection2 = (ServiceConnection) obj3;
            } else {
                serviceConnection2 = serviceConnection;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                iIntValue = ((Integer) obj4).intValue();
            }
        } else {
            contextWrapper = c19eg;
            intent2 = intent;
            serviceConnection2 = serviceConnection;
        }
        c0wst.LIZ(11063, "androidx/fragment/app/FragmentActivity", "bindService", Boolean.valueOf(contextWrapper.bindService(intent2, serviceConnection2, iIntValue)), objArr, contextWrapper, c0wzw, true);
    }

    public static void LLJJIJIL(int i, Intent intent, C19EG c19eg, C0WZX c0wzx) throws Throwable {
        Intent intent2;
        Activity activity;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "androidx/fragment/app/FragmentActivity", "setResult", c19eg, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "androidx/fragment/app/FragmentActivity", "setResult", null, objArr, c19eg, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = c19eg;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            intent2 = intent;
            activity = c19eg;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "androidx/fragment/app/FragmentActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void LLJJJIL(C19EG c19eg, Intent intent, Bundle bundle, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        Bundle bundle2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, bundle};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;Landroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "androidx/fragment/app/FragmentActivity", "startActivity", c19eg, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "androidx/fragment/app/FragmentActivity", "startActivity", null, objArr, c19eg, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = c19eg;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                bundle2 = (Bundle) obj3;
            } else {
                bundle2 = bundle;
            }
        } else {
            activity = c19eg;
            intent2 = intent;
            bundle2 = bundle;
        }
        activity.startActivity(intent2, bundle2);
        c0wst.LIZ(11098, "androidx/fragment/app/FragmentActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    public static void LLJJJJJIL(int i, Intent intent, C19EG c19eg, C0WZX c0wzx) throws Throwable {
        Intent intent2;
        ComponentActivity componentActivity;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "androidx/fragment/app/FragmentActivity", "startActivityForResult", c19eg, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11094, "androidx/fragment/app/FragmentActivity", "startActivityForResult", null, objArr, c19eg, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                componentActivity = (ComponentActivity) obj;
            } else {
                componentActivity = c19eg;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            intent2 = intent;
            componentActivity = c19eg;
        }
        componentActivity.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11094, "androidx/fragment/app/FragmentActivity", "startActivityForResult", null, objArr, componentActivity, c0wzw, true);
    }

    public static void LLJL(androidx.fragment.app.Fragment fragment, Intent intent, int i, C0WZX c0wzx) throws Throwable {
        androidx.fragment.app.Fragment fragment2;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "androidx/fragment/app/Fragment", "startActivityForResult", fragment, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11087, "androidx/fragment/app/Fragment", "startActivityForResult", null, objArr, fragment, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment2 = (androidx.fragment.app.Fragment) obj;
            } else {
                fragment2 = fragment;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            fragment2 = fragment;
            intent2 = intent;
        }
        fragment2.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11087, "androidx/fragment/app/Fragment", "startActivityForResult", null, objArr, fragment2, c0wzw, true);
    }

    public static void LLJLL(SDKUriHandlerActivity sDKUriHandlerActivity, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        SDKUriHandlerActivity sDKUriHandlerActivity2;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/apple/android/sdk/authentication/SDKUriHandlerActivity", "setResult", sDKUriHandlerActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/apple/android/sdk/authentication/SDKUriHandlerActivity", "setResult", null, objArr, sDKUriHandlerActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                sDKUriHandlerActivity2 = (Activity) obj;
            } else {
                sDKUriHandlerActivity2 = sDKUriHandlerActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            sDKUriHandlerActivity2 = sDKUriHandlerActivity;
            intent2 = intent;
        }
        sDKUriHandlerActivity2.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/apple/android/sdk/authentication/SDKUriHandlerActivity", "setResult", null, objArr, sDKUriHandlerActivity2, c0wzw, true);
    }

    public static void LLJLLIL(StartAuthenticationActivity startAuthenticationActivity, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        StartAuthenticationActivity startAuthenticationActivity2;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/apple/android/sdk/authentication/StartAuthenticationActivity", "setResult", startAuthenticationActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/apple/android/sdk/authentication/StartAuthenticationActivity", "setResult", null, objArr, startAuthenticationActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                startAuthenticationActivity2 = (Activity) obj;
            } else {
                startAuthenticationActivity2 = startAuthenticationActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            startAuthenticationActivity2 = startAuthenticationActivity;
            intent2 = intent;
        }
        startAuthenticationActivity2.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/apple/android/sdk/authentication/StartAuthenticationActivity", "setResult", null, objArr, startAuthenticationActivity2, c0wzw, true);
    }

    public static AppsFlyerConsent LLJLLL(AppsFlyerConsent.Companion companion, boolean z, boolean z2, C0WZX c0wzx) throws Throwable {
        AppsFlyerConsent.Companion companion2;
        boolean zBooleanValue = z2;
        boolean zBooleanValue2 = z;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Boolean.valueOf(zBooleanValue2), Boolean.valueOf(zBooleanValue)};
        C0WZW c0wzw = new C0WZW(false, "(ZZ)Lcom/appsflyer/AppsFlyerConsent;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11419, "com/appsflyer/AppsFlyerConsent$Companion", "forGDPRUser", companion, objArr, "com.appsflyer.AppsFlyerConsent", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11419, "com/appsflyer/AppsFlyerConsent$Companion", "forGDPRUser", null, objArr, companion, c0wzw, false);
            return (AppsFlyerConsent) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                companion2 = (AppsFlyerConsent.Companion) obj;
            } else {
                companion2 = companion;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                zBooleanValue2 = ((Boolean) obj2).booleanValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                zBooleanValue = ((Boolean) obj3).booleanValue();
            }
        } else {
            companion2 = companion;
        }
        AppsFlyerConsent appsFlyerConsentForGDPRUser = companion2.forGDPRUser(zBooleanValue2, zBooleanValue);
        c0wst.LIZ(11419, "com/appsflyer/AppsFlyerConsent$Companion", "forGDPRUser", appsFlyerConsentForGDPRUser, objArr, companion2, c0wzw, true);
        return appsFlyerConsentForGDPRUser;
    }

    public static void LLLIIL(GameBroadcastFragment gameBroadcastFragment, Intent intent, int i, C0WZX c0wzx) throws Throwable {
        androidx.fragment.app.Fragment fragment;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "com/bytedance/android/livesdk/game/chatroom/ui/GameBroadcastFragment", "startActivityForResult", gameBroadcastFragment, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11087, "com/bytedance/android/livesdk/game/chatroom/ui/GameBroadcastFragment", "startActivityForResult", null, objArr, gameBroadcastFragment, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment = (androidx.fragment.app.Fragment) obj;
            } else {
                fragment = gameBroadcastFragment;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            fragment = gameBroadcastFragment;
            intent2 = intent;
        }
        fragment.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11087, "com/bytedance/android/livesdk/game/chatroom/ui/GameBroadcastFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
    }

    public static void LLLILZJ(EffectImgCreatorActivity effectImgCreatorActivity, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        EffectImgCreatorActivity effectImgCreatorActivity2;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/bytedance/effectcreatormobile/effectimgcreator/EffectImgCreatorActivity", "setResult", effectImgCreatorActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/bytedance/effectcreatormobile/effectimgcreator/EffectImgCreatorActivity", "setResult", null, objArr, effectImgCreatorActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                effectImgCreatorActivity2 = (Activity) obj;
            } else {
                effectImgCreatorActivity2 = effectImgCreatorActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            effectImgCreatorActivity2 = effectImgCreatorActivity;
            intent2 = intent;
        }
        effectImgCreatorActivity2.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/bytedance/effectcreatormobile/effectimgcreator/EffectImgCreatorActivity", "setResult", null, objArr, effectImgCreatorActivity2, c0wzw, true);
    }

    public static void LLLILZLLLI(EffectImgCreatorV2Activity effectImgCreatorV2Activity, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        EffectImgCreatorV2Activity effectImgCreatorV2Activity2;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/bytedance/effectcreatormobile/effectimgcreator/publish/EffectImgCreatorV2Activity", "setResult", effectImgCreatorV2Activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/bytedance/effectcreatormobile/effectimgcreator/publish/EffectImgCreatorV2Activity", "setResult", null, objArr, effectImgCreatorV2Activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                effectImgCreatorV2Activity2 = (Activity) obj;
            } else {
                effectImgCreatorV2Activity2 = effectImgCreatorV2Activity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            effectImgCreatorV2Activity2 = effectImgCreatorV2Activity;
            intent2 = intent;
        }
        effectImgCreatorV2Activity2.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/bytedance/effectcreatormobile/effectimgcreator/publish/EffectImgCreatorV2Activity", "setResult", null, objArr, effectImgCreatorV2Activity2, c0wzw, true);
    }

    public static void LLLLIIL(FakeFragment fakeFragment, Intent intent, int i, C0WZX c0wzx) throws Throwable {
        androidx.fragment.app.Fragment fragment;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "com/bytedance/router/FakeFragment", "startActivityForResult", fakeFragment, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11087, "com/bytedance/router/FakeFragment", "startActivityForResult", null, objArr, fakeFragment, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment = (androidx.fragment.app.Fragment) obj;
            } else {
                fragment = fakeFragment;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            fragment = fakeFragment;
            intent2 = intent;
        }
        fragment.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11087, "com/bytedance/router/FakeFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
    }

    public static void LLLLIILLL(ActivityC845760XFu activityC845760XFu, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/bytedance/sdk/account/OneTapLoginActivity", "setResult", activityC845760XFu, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/bytedance/sdk/account/OneTapLoginActivity", "setResult", null, objArr, activityC845760XFu, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = activityC845760XFu;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = activityC845760XFu;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/bytedance/sdk/account/OneTapLoginActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void LLLLL(CustomTabMainActivity customTabMainActivity, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/facebook/CustomTabMainActivity", "setResult", customTabMainActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/facebook/CustomTabMainActivity", "setResult", null, objArr, customTabMainActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = customTabMainActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = customTabMainActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/facebook/CustomTabMainActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void LLLLLL(int i, Intent intent, C0WZX c0wzx, SignInHubActivity signInHubActivity) throws Throwable {
        Intent intent2;
        Activity activity;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/google/android/gms/auth/api/signin/internal/SignInHubActivity", "setResult", signInHubActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/google/android/gms/auth/api/signin/internal/SignInHubActivity", "setResult", null, objArr, signInHubActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = signInHubActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            intent2 = intent;
            activity = signInHubActivity;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/google/android/gms/auth/api/signin/internal/SignInHubActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void LLLLLLJ(GoogleApiActivity googleApiActivity, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/google/android/gms/common/api/GoogleApiActivity", "setResult", googleApiActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/google/android/gms/common/api/GoogleApiActivity", "setResult", null, objArr, googleApiActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = googleApiActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = googleApiActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/google/android/gms/common/api/GoogleApiActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void LLLLLLLZIL(C1BSM c1bsm, C2204981BRo c2204981BRo, InterfaceC2205021BRs interfaceC2205021BRs, C0WZX c0wzx) throws Throwable {
        C1BSM c1bsm2;
        C2204981BRo c2204981BRo2;
        InterfaceC2205021BRs interfaceC2205021BRs2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {c2204981BRo, interfaceC2205021BRs};
        C0WZW c0wzw = new C0WZW(false, "(Lcom/google/android/gms/maps/CameraUpdate;Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11518, "com/google/android/gms/maps/GoogleMap", "animateCamera", c1bsm, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11518, "com/google/android/gms/maps/GoogleMap", "animateCamera", null, objArr, c1bsm, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                c1bsm2 = (C1BSM) obj;
            } else {
                c1bsm2 = c1bsm;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                c2204981BRo2 = (C2204981BRo) obj2;
            } else {
                c2204981BRo2 = c2204981BRo;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                interfaceC2205021BRs2 = (InterfaceC2205021BRs) obj3;
            } else {
                interfaceC2205021BRs2 = interfaceC2205021BRs;
            }
        } else {
            c1bsm2 = c1bsm;
            c2204981BRo2 = c2204981BRo;
            interfaceC2205021BRs2 = interfaceC2205021BRs;
        }
        c1bsm2.getClass();
        try {
            C0W3J.LJIIIZ(c2204981BRo2, "CameraUpdate must not be null.");
            c1bsm2.LIZ.N0(c2204981BRo2.LIZ, new BinderC2205001BRq(interfaceC2205021BRs2));
            c0wst.LIZ(11518, "com/google/android/gms/maps/GoogleMap", "animateCamera", null, objArr, c1bsm2, c0wzw, true);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public static void LLLLZIL(C1045770dJv c1045770dJv, float f, float f2, C0WZX c0wzx) throws Throwable {
        C1045770dJv c1045770dJv2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        C0WZW c0wzw = new C0WZW(false, "(FF)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11056, "com/iab/omid/library/bytedance1/adsession/media/MediaEvents", "start", c1045770dJv, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11056, "com/iab/omid/library/bytedance1/adsession/media/MediaEvents", "start", null, objArr, c1045770dJv, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                c1045770dJv2 = (C1045770dJv) obj;
            } else {
                c1045770dJv2 = c1045770dJv;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                f = ((Float) obj2).floatValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                f2 = ((Float) obj3).floatValue();
            }
        } else {
            c1045770dJv2 = c1045770dJv;
        }
        c1045770dJv2.getClass();
        if (f > 0.0f) {
            if (f2 >= 0.0f && f2 <= 1.0f) {
                C1045780dJw.LIZJ(c1045770dJv2.LIZ);
                JSONObject jSONObject = new JSONObject();
                C1287890jcR.LIZIZ(jSONObject, "duration", Float.valueOf(f));
                C1287890jcR.LIZIZ(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
                C1287890jcR.LIZIZ(jSONObject, "deviceVolume", Float.valueOf(C1BUX.LIZ().LIZ));
                c1045770dJv2.LIZ.LJ.LIZ("start", jSONObject);
                c0wst.LIZ(11056, "com/iab/omid/library/bytedance1/adsession/media/MediaEvents", "start", null, objArr, c1045770dJv2, c0wzw, true);
                return;
            }
            throw new IllegalArgumentException("Invalid Media volume");
        }
        throw new IllegalArgumentException("Invalid Media duration");
    }

    public static void LLLZ(AuthorizeActivity authorizeActivity, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/account/login/authorize/AuthorizeActivity", "setResult", authorizeActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/login/authorize/AuthorizeActivity", "setResult", null, objArr, authorizeActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = authorizeActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = authorizeActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/login/authorize/AuthorizeActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void LLLZI(SignUpOrLoginActivity signUpOrLoginActivity, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/account/login/v2/ui/SignUpOrLoginActivity", "setResult", signUpOrLoginActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/login/v2/ui/SignUpOrLoginActivity", "setResult", null, objArr, signUpOrLoginActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = signUpOrLoginActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = signUpOrLoginActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/login/v2/ui/SignUpOrLoginActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void LLZLI(TextEditActivity textEditActivity, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        TextEditActivity textEditActivity2;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/effectcreator/text/TextEditActivity", "setResult", textEditActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/effectcreator/text/TextEditActivity", "setResult", null, objArr, textEditActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                textEditActivity2 = (Activity) obj;
            } else {
                textEditActivity2 = textEditActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            textEditActivity2 = textEditActivity;
            intent2 = intent;
        }
        textEditActivity2.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/effectcreator/text/TextEditActivity", "setResult", null, objArr, textEditActivity2, c0wzw, true);
    }

    public static void LLZLL(PreviewUploadActivity previewUploadActivity, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/fe/method/upload/PreviewUploadActivity", "setResult", previewUploadActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/fe/method/upload/PreviewUploadActivity", "setResult", null, objArr, previewUploadActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = previewUploadActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = previewUploadActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/fe/method/upload/PreviewUploadActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void Q(NLECutCompressActivity nLECutCompressActivity, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/cut_ui_impl/process/NLECutCompressActivity", "setResult", nLECutCompressActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/cut_ui_impl/process/NLECutCompressActivity", "setResult", null, objArr, nLECutCompressActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = nLECutCompressActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = nLECutCompressActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/cut_ui_impl/process/NLECutCompressActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void V(CropActivity cropActivity, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/profile/business/ur/ui/CropActivity", "setResult", cropActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/profile/business/ur/ui/CropActivity", "setResult", null, objArr, cropActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = cropActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = cropActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/profile/business/ur/ui/CropActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static Object a0(Method method, Object obj, Object[] objArr, C0WZX c0wzx) throws Throwable {
        Object obj2;
        Object[] objArr2;
        Method method2;
        if (C0CB3.LIZ.LIZ(method)) {
            return method.invoke(obj, objArr);
        }
        C0WST c0wst = new C0WST();
        Object[] objArr3 = {obj, objArr};
        C0WZW c0wzw = new C0WZW(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(110000, "java/lang/reflect/Method", "invoke", method, objArr3, "java.lang.Object", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(110000, "java/lang/reflect/Method", "invoke", null, objArr3, method, c0wzw, false);
            return c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr4 = c0wsuLIZIZ.LIZJ;
        if (objArr4 != null) {
            Object obj3 = objArr4[0];
            if (obj3 != null) {
                method2 = (Method) obj3;
            } else {
                method2 = method;
            }
            obj2 = objArr4[1];
            if (obj2 == null) {
                obj2 = obj;
            }
            Object obj4 = objArr4[2];
            if (obj4 != null) {
                objArr2 = (Object[]) obj4;
            } else {
                objArr2 = objArr;
            }
        } else {
            obj2 = obj;
            objArr2 = objArr;
            method2 = method;
        }
        Object objInvoke = method2.invoke(obj2, objArr2);
        c0wst.LIZ(110000, "java/lang/reflect/Method", "invoke", objInvoke, objArr3, method2, c0wzw, true);
        return objInvoke;
    }

    public static void h0(AuthorizationManagementActivity authorizationManagementActivity, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "net/openid/appauth/AuthorizationManagementActivity", "setResult", authorizationManagementActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "net/openid/appauth/AuthorizationManagementActivity", "setResult", null, objArr, authorizationManagementActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = authorizationManagementActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = authorizationManagementActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "net/openid/appauth/AuthorizationManagementActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void i(Context context, boolean z, int i, C0WZX c0wzx) throws Throwable {
        Context context2;
        int iIntValue = i;
        boolean zBooleanValue = z;
        C0WST c0wst = new C0WST();
        boolean zBooleanValue2 = false;
        Object[] objArr = {context, Boolean.FALSE, Boolean.valueOf(zBooleanValue), Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Context;ZZI)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/qrcode/view/QRCodePermissionActivity", "startActivity", QRCodePermissionActivity.class, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/qrcode/view/QRCodePermissionActivity", "startActivity", null, objArr, QRCodePermissionActivity.class, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                context2 = (Context) obj;
            } else {
                context2 = context;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                zBooleanValue2 = ((Boolean) obj2).booleanValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                zBooleanValue = ((Boolean) obj3).booleanValue();
            }
            Object obj4 = c0wsuLIZIZ.LIZJ[3];
            if (obj4 != null) {
                iIntValue = ((Integer) obj4).intValue();
            }
        } else {
            context2 = context;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - QRCodePermissionActivity.LLILZIL >= 1000) {
            QRCodePermissionActivity.LLILZIL = jCurrentTimeMillis;
            Intent intent = new Intent(context2, (Class<?>) QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", zBooleanValue2);
            intent.putExtra("enter_from", zBooleanValue);
            intent.putExtra("page_from", iIntValue);
            C2443109hl.LIZ(context2, intent);
        }
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/qrcode/view/QRCodePermissionActivity", "startActivity", null, objArr, QRCodePermissionActivity.class, c0wzw, true);
    }

    public static void l(VECutVideoActivity vECutVideoActivity, int i, Intent intent, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/shortvideo/cut/VECutVideoActivity", "setResult", vECutVideoActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/shortvideo/cut/VECutVideoActivity", "setResult", null, objArr, vECutVideoActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            } else {
                activity = vECutVideoActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
        } else {
            activity = vECutVideoActivity;
            intent2 = intent;
        }
        activity.setResult(iIntValue, intent2);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/shortvideo/cut/VECutVideoActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public static void n(Activity activity, VideoPublishEditModel videoPublishEditModel, int i, C0WZX c0wzx) throws Throwable {
        Activity activity2;
        VideoPublishEditModel videoPublishEditModel2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {activity, videoPublishEditModel, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/app/Activity;Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "com/ss/android/ugc/aweme/shortvideo/vechoosecover/ChooseCoverActivity", "startActivityForResult", ChooseCoverActivity.class, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11094, "com/ss/android/ugc/aweme/shortvideo/vechoosecover/ChooseCoverActivity", "startActivityForResult", null, objArr, ChooseCoverActivity.class, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity2 = (Activity) obj;
            } else {
                activity2 = activity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                videoPublishEditModel2 = (VideoPublishEditModel) obj2;
            } else {
                videoPublishEditModel2 = videoPublishEditModel;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            activity2 = activity;
            videoPublishEditModel2 = videoPublishEditModel;
        }
        String str = ChooseCoverActivity._pnsPageId;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class);
        if (creativeToolsPluginService == null || creativeToolsPluginService.LIZJ(activity2, "ChooseCover", true)) {
            Intent intent = new Intent(activity2, (Class<?>) ChooseCoverActivity.class);
            intent.addFlags(603979776);
            if (videoPublishEditModel2 == null) {
                C1AF0.LJ(new Throwable("model is null when start choose cover activity"));
            } else {
                intent.putExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL", (Serializable) videoPublishEditModel2);
                C0MUK.LJIIIZ(intent, videoPublishEditModel2.creativeModel);
                f.LIZ.getClass();
                f.LJI(activity2, iIntValue, intent);
                C786410Ut5.ae(R.anim.a7, activity2, R.anim.a8);
            }
        }
        c0wst.LIZ(11094, "com/ss/android/ugc/aweme/shortvideo/vechoosecover/ChooseCoverActivity", "startActivityForResult", null, objArr, ChooseCoverActivity.class, c0wzw, true);
    }

    public static void LJIJ(Activity activity, Intent intent, int i, Bundle bundle, C0WZX c0wzx) throws Throwable {
        Activity activity2;
        Intent intent2;
        Bundle bundle2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(iIntValue), bundle};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;ILandroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "android/app/Activity", "startActivityForResult", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11094, "android/app/Activity", "startActivityForResult", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity2 = (Activity) obj;
            } else {
                activity2 = activity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
            Object obj4 = c0wsuLIZIZ.LIZJ[3];
            if (obj4 != null) {
                bundle2 = (Bundle) obj4;
            } else {
                bundle2 = bundle;
            }
        } else {
            activity2 = activity;
            intent2 = intent;
            bundle2 = bundle;
        }
        activity2.startActivityForResult(intent2, iIntValue, bundle2);
        c0wst.LIZ(11094, "android/app/Activity", "startActivityForResult", null, objArr, activity2, c0wzw, true);
    }

    public static StorageStats LJJIFFI(StorageStatsManager storageStatsManager, UUID uuid, String str, UserHandle userHandle, C0WZX c0wzx) throws Throwable {
        StorageStatsManager storageStatsManager2;
        UUID uuid2;
        String str2;
        UserHandle userHandle2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {uuid, str, userHandle};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/util/UUID;Ljava/lang/String;Landroid/os/UserHandle;)Landroid/app/usage/StorageStats;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10910, "android/app/usage/StorageStatsManager", "queryStatsForPackage", storageStatsManager, objArr, "android.app.usage.StorageStats", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10910, "android/app/usage/StorageStatsManager", "queryStatsForPackage", null, objArr, storageStatsManager, c0wzw, false);
            return (StorageStats) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                storageStatsManager2 = (StorageStatsManager) obj;
            } else {
                storageStatsManager2 = storageStatsManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                uuid2 = (UUID) obj2;
            } else {
                uuid2 = uuid;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                str2 = (String) obj3;
            } else {
                str2 = str;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                userHandle2 = (UserHandle) obj4;
            } else {
                userHandle2 = userHandle;
            }
        } else {
            storageStatsManager2 = storageStatsManager;
            uuid2 = uuid;
            str2 = str;
            userHandle2 = userHandle;
        }
        StorageStats storageStatsQueryStatsForPackage = storageStatsManager2.queryStatsForPackage(uuid2, str2, userHandle2);
        c0wst.LIZ(10910, "android/app/usage/StorageStatsManager", "queryStatsForPackage", storageStatsQueryStatsForPackage, objArr, storageStatsManager2, c0wzw, true);
        return storageStatsQueryStatsForPackage;
    }

    public static Cursor LJJIL(ContentResolver contentResolver, Uri uri, String[] strArr, Bundle bundle, C0WZX c0wzx) throws Throwable {
        ContentResolver contentResolver2;
        Uri uri2;
        String[] strArr2;
        Bundle bundle2;
        C0WST c0wst = new C0WST();
        CancellationSignal cancellationSignal = null;
        Object[] objArr = {uri, strArr, bundle, null};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(240004, "android/content/ContentResolver", "query", contentResolver, objArr, "android.database.Cursor", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(240004, "android/content/ContentResolver", "query", null, objArr, contentResolver, c0wzw, false);
            return (Cursor) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contentResolver2 = (ContentResolver) obj;
            } else {
                contentResolver2 = contentResolver;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                uri2 = (Uri) obj2;
            } else {
                uri2 = uri;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                strArr2 = (String[]) obj3;
            } else {
                strArr2 = strArr;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                bundle2 = (Bundle) obj4;
            } else {
                bundle2 = bundle;
            }
            Object obj5 = objArr2[4];
            if (obj5 != null) {
                cancellationSignal = (CancellationSignal) obj5;
            }
        } else {
            contentResolver2 = contentResolver;
            uri2 = uri;
            strArr2 = strArr;
            bundle2 = bundle;
        }
        Cursor cursorQuery = contentResolver2.query(uri2, strArr2, bundle2, cancellationSignal);
        c0wst.LIZ(240004, "android/content/ContentResolver", "query", cursorQuery, objArr, contentResolver2, c0wzw, true);
        return cursorQuery;
    }

    public static boolean LJJJJ(Context context, Intent intent, ServiceConnection serviceConnection, int i, C0WZX c0wzx) throws Throwable {
        Context context2;
        Intent intent2;
        ServiceConnection serviceConnection2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, serviceConnection, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11063, "android/content/Context", "bindService", context, objArr, "boolean", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11063, "android/content/Context", "bindService", null, objArr, context, c0wzw, false);
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                context2 = (Context) obj;
            } else {
                context2 = context;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                serviceConnection2 = (ServiceConnection) obj3;
            } else {
                serviceConnection2 = serviceConnection;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                iIntValue = ((Integer) obj4).intValue();
            }
        } else {
            context2 = context;
            intent2 = intent;
            serviceConnection2 = serviceConnection;
        }
        boolean zBindService = context2.bindService(intent2, serviceConnection2, iIntValue);
        c0wst.LIZ(11063, "android/content/Context", "bindService", Boolean.valueOf(zBindService), objArr, context2, c0wzw, true);
        return zBindService;
    }

    public static boolean LJJLIIIJ(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i, C0WZX c0wzx) throws Throwable {
        SensorManager sensorManager2;
        SensorEventListener sensorEventListener2;
        Sensor sensor2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {sensorEventListener, sensor, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100700, "android/hardware/SensorManager", "registerListener", sensorManager, objArr, "boolean", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100700, "android/hardware/SensorManager", "registerListener", null, objArr, sensorManager, c0wzw, false);
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                sensorManager2 = (SensorManager) obj;
            } else {
                sensorManager2 = sensorManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                sensorEventListener2 = (SensorEventListener) obj2;
            } else {
                sensorEventListener2 = sensorEventListener;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                sensor2 = (Sensor) obj3;
            } else {
                sensor2 = sensor;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                iIntValue = ((Integer) obj4).intValue();
            }
        } else {
            sensorManager2 = sensorManager;
            sensorEventListener2 = sensorEventListener;
            sensor2 = sensor;
        }
        boolean zRegisterListener = sensorManager2.registerListener(sensorEventListener2, sensor2, iIntValue);
        c0wst.LIZ(100700, "android/hardware/SensorManager", "registerListener", Boolean.valueOf(zRegisterListener), objArr, sensorManager2, c0wzw, true);
        return zRegisterListener;
    }

    public static void LJJLIIJ(CameraManager cameraManager, String str, CameraDevice.StateCallback stateCallback, Handler handler, C0WZX c0wzx) throws Throwable {
        CameraManager cameraManager2;
        String str2;
        CameraDevice.StateCallback stateCallback2;
        Handler handler2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str, stateCallback, handler};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100206, "android/hardware/camera2/CameraManager", "openCamera", cameraManager, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100206, "android/hardware/camera2/CameraManager", "openCamera", null, objArr, cameraManager, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                cameraManager2 = (CameraManager) obj;
            } else {
                cameraManager2 = cameraManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            } else {
                str2 = str;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                stateCallback2 = (CameraDevice.StateCallback) obj3;
            } else {
                stateCallback2 = stateCallback;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                handler2 = (Handler) obj4;
            } else {
                handler2 = handler;
            }
        } else {
            cameraManager2 = cameraManager;
            str2 = str;
            stateCallback2 = stateCallback;
            handler2 = handler;
        }
        cameraManager2.openCamera(str2, stateCallback2, handler2);
        c0wst.LIZ(100206, "android/hardware/camera2/CameraManager", "openCamera", null, objArr, cameraManager2, c0wzw, true);
    }

    public static void LJJLL(LocationManager locationManager, Criteria criteria, LocationListener locationListener, Looper looper, C0WZX c0wzx) throws Throwable {
        LocationManager locationManager2;
        Criteria criteria2;
        LocationListener locationListener2;
        Looper looper2;
        C0WST c0wst = new C0WST();
        long jLongValue = 0;
        float fFloatValue = 0.0f;
        Object[] objArr = {0L, Float.valueOf(0.0f), criteria, locationListener, looper};
        C0WZW c0wzw = new C0WZW(false, "(JFLandroid/location/Criteria;Landroid/location/LocationListener;Landroid/os/Looper;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100001, "android/location/LocationManager", "requestLocationUpdates", locationManager, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100001, "android/location/LocationManager", "requestLocationUpdates", null, objArr, locationManager, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                locationManager2 = (LocationManager) obj;
            } else {
                locationManager2 = locationManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                jLongValue = ((Long) obj2).longValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                fFloatValue = ((Float) obj3).floatValue();
            }
            Object[] objArr3 = c0wsuLIZIZ.LIZJ;
            Object obj4 = objArr3[3];
            if (obj4 != null) {
                criteria2 = (Criteria) obj4;
            } else {
                criteria2 = criteria;
            }
            Object obj5 = objArr3[4];
            if (obj5 != null) {
                locationListener2 = (LocationListener) obj5;
            } else {
                locationListener2 = locationListener;
            }
            Object obj6 = objArr3[5];
            if (obj6 != null) {
                looper2 = (Looper) obj6;
            } else {
                looper2 = looper;
            }
        } else {
            locationManager2 = locationManager;
            criteria2 = criteria;
            locationListener2 = locationListener;
            looper2 = looper;
        }
        locationManager2.requestLocationUpdates(jLongValue, fFloatValue, criteria2, locationListener2, looper2);
        c0wst.LIZ(100001, "android/location/LocationManager", "requestLocationUpdates", null, objArr, locationManager2, c0wzw, true);
    }

    public static void LJLJJI(Context context, String[] strArr, String[] strArr2, C766400U4o c766400U4o, C0WZX c0wzx) throws Throwable {
        Context context2;
        String[] strArr3;
        String[] strArr4;
        MediaScannerConnection.OnScanCompletedListener onScanCompletedListener;
        C0WST c0wst = new C0WST();
        Object[] objArr = {context, strArr, strArr2, c766400U4o};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10195, "android/media/MediaScannerConnection", "scanFile", MediaScannerConnection.class, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10195, "android/media/MediaScannerConnection", "scanFile", null, objArr, MediaScannerConnection.class, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                context2 = (Context) obj;
            } else {
                context2 = context;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr3 = (String[]) obj2;
            } else {
                strArr3 = strArr;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                strArr4 = (String[]) obj3;
            } else {
                strArr4 = strArr2;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                onScanCompletedListener = (MediaScannerConnection.OnScanCompletedListener) obj4;
            }
            MediaScannerConnection.scanFile(context2, strArr3, strArr4, onScanCompletedListener);
            c0wst.LIZ(10195, "android/media/MediaScannerConnection", "scanFile", null, objArr, MediaScannerConnection.class, c0wzw, true);
        }
        context2 = context;
        strArr3 = strArr;
        strArr4 = strArr2;
        onScanCompletedListener = c766400U4o;
        MediaScannerConnection.scanFile(context2, strArr3, strArr4, onScanCompletedListener);
        c0wst.LIZ(10195, "android/media/MediaScannerConnection", "scanFile", null, objArr, MediaScannerConnection.class, c0wzw, true);
    }

    public static void LLILL(Surface surface, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler, C0WZX c0wzx) throws Throwable {
        Surface surface2;
        Bitmap bitmap2;
        PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener2;
        Handler handler2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {surface, bitmap, onPixelCopyFinishedListener, handler};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/view/Surface;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2824, "android/view/PixelCopy", "request", PixelCopy.class, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2824, "android/view/PixelCopy", "request", null, objArr, PixelCopy.class, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                surface2 = (Surface) obj;
            } else {
                surface2 = surface;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                bitmap2 = (Bitmap) obj2;
            } else {
                bitmap2 = bitmap;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                onPixelCopyFinishedListener2 = (PixelCopy.OnPixelCopyFinishedListener) obj3;
            } else {
                onPixelCopyFinishedListener2 = onPixelCopyFinishedListener;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                handler2 = (Handler) obj4;
            }
            PixelCopy.request(surface2, bitmap2, onPixelCopyFinishedListener2, handler2);
            c0wst.LIZ(2824, "android/view/PixelCopy", "request", null, objArr, PixelCopy.class, c0wzw, true);
        }
        surface2 = surface;
        bitmap2 = bitmap;
        onPixelCopyFinishedListener2 = onPixelCopyFinishedListener;
        handler2 = handler;
        PixelCopy.request(surface2, bitmap2, onPixelCopyFinishedListener2, handler2);
        c0wst.LIZ(2824, "android/view/PixelCopy", "request", null, objArr, PixelCopy.class, c0wzw, true);
    }

    public static void LLILLJJLI(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler, C0WZX c0wzx) throws Throwable {
        SurfaceView surfaceView2;
        Bitmap bitmap2;
        PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener2;
        Handler handler2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {surfaceView, bitmap, onPixelCopyFinishedListener, handler};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/view/SurfaceView;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2824, "android/view/PixelCopy", "request", PixelCopy.class, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2824, "android/view/PixelCopy", "request", null, objArr, PixelCopy.class, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                surfaceView2 = (SurfaceView) obj;
            } else {
                surfaceView2 = surfaceView;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                bitmap2 = (Bitmap) obj2;
            } else {
                bitmap2 = bitmap;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                onPixelCopyFinishedListener2 = (PixelCopy.OnPixelCopyFinishedListener) obj3;
            } else {
                onPixelCopyFinishedListener2 = onPixelCopyFinishedListener;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                handler2 = (Handler) obj4;
            }
            PixelCopy.request(surfaceView2, bitmap2, onPixelCopyFinishedListener2, handler2);
            c0wst.LIZ(2824, "android/view/PixelCopy", "request", null, objArr, PixelCopy.class, c0wzw, true);
        }
        surfaceView2 = surfaceView;
        bitmap2 = bitmap;
        onPixelCopyFinishedListener2 = onPixelCopyFinishedListener;
        handler2 = handler;
        PixelCopy.request(surfaceView2, bitmap2, onPixelCopyFinishedListener2, handler2);
        c0wst.LIZ(2824, "android/view/PixelCopy", "request", null, objArr, PixelCopy.class, c0wzw, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LLIZLLLIL(CookieManager cookieManager, String str, String str2, ValueCallback valueCallback, C0WZX c0wzx) throws Throwable {
        CookieManager cookieManager2;
        String str3;
        String str4;
        ValueCallback valueCallback2;
        CookieManager cookieManager3;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str, str2, valueCallback};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/ValueCallback;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11025, "android/webkit/CookieManager", "setCookie", cookieManager, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11025, "android/webkit/CookieManager", "setCookie", null, objArr, cookieManager, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                cookieManager3 = (CookieManager) obj;
            } else {
                cookieManager3 = cookieManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str3 = (String) obj2;
            } else {
                str3 = str;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                str4 = (String) obj3;
            } else {
                str4 = str2;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                valueCallback2 = (ValueCallback) obj4;
                cookieManager2 = cookieManager3;
            } else {
                valueCallback2 = valueCallback;
                cookieManager2 = cookieManager3;
            }
        } else {
            cookieManager2 = cookieManager;
            str3 = str;
            str4 = str2;
            valueCallback2 = valueCallback;
        }
        cookieManager2.setCookie(str3, str4, valueCallback2);
        c0wst.LIZ(11025, "android/webkit/CookieManager", "setCookie", null, objArr, cookieManager2, c0wzw, true);
    }

    public static void LLJJLIIIJLLLLLLLZ(androidx.fragment.app.Fragment fragment, Intent intent, int i, Bundle bundle, C0WZX c0wzx) throws Throwable {
        androidx.fragment.app.Fragment fragment2;
        Intent intent2;
        Bundle bundle2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(iIntValue), bundle};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;ILandroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "androidx/fragment/app/Fragment", "startActivityForResult", fragment, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11087, "androidx/fragment/app/Fragment", "startActivityForResult", null, objArr, fragment, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment2 = (androidx.fragment.app.Fragment) obj;
            } else {
                fragment2 = fragment;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
            Object obj4 = c0wsuLIZIZ.LIZJ[3];
            if (obj4 != null) {
                bundle2 = (Bundle) obj4;
            } else {
                bundle2 = bundle;
            }
        } else {
            fragment2 = fragment;
            intent2 = intent;
            bundle2 = bundle;
        }
        fragment2.startActivityForResult(intent2, iIntValue, bundle2);
        c0wst.LIZ(11087, "androidx/fragment/app/Fragment", "startActivityForResult", null, objArr, fragment2, c0wzw, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LLJZ(AppsFlyerLib appsFlyerLib, Context context, String str, Map map, C0WZX c0wzx) throws Throwable {
        AppsFlyerLib appsFlyerLib2;
        Context context2;
        String str2;
        Map map2;
        AppsFlyerLib appsFlyerLib3;
        C0WST c0wst = new C0WST();
        Object[] objArr = {context, str, map};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11029, "com/appsflyer/AppsFlyerLib", "logEvent", appsFlyerLib, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11029, "com/appsflyer/AppsFlyerLib", "logEvent", null, objArr, appsFlyerLib, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                appsFlyerLib3 = (AppsFlyerLib) obj;
            } else {
                appsFlyerLib3 = appsFlyerLib;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                context2 = (Context) obj2;
            } else {
                context2 = context;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                str2 = (String) obj3;
            } else {
                str2 = str;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                map2 = (Map) obj4;
                appsFlyerLib2 = appsFlyerLib3;
            } else {
                map2 = map;
                appsFlyerLib2 = appsFlyerLib3;
            }
        } else {
            appsFlyerLib2 = appsFlyerLib;
            context2 = context;
            str2 = str;
            map2 = map;
        }
        appsFlyerLib2.logEvent(context2, str2, map2);
        c0wst.LIZ(11029, "com/appsflyer/AppsFlyerLib", "logEvent", null, objArr, appsFlyerLib2, c0wzw, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LLJZIJLIL(AppsFlyerLib appsFlyerLib, Context context, String str, Map map, C0WZX c0wzx) throws Throwable {
        AppsFlyerLib appsFlyerLib2;
        Context context2;
        String str2;
        Map map2;
        AppsFlyerLib appsFlyerLib3;
        C0WST c0wst = new C0WST();
        AppsFlyerRequestListener appsFlyerRequestListener = null;
        Object[] objArr = {context, str, map, null};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lcom/appsflyer/attribution/AppsFlyerRequestListener;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11029, "com/appsflyer/AppsFlyerLib", "logEvent", appsFlyerLib, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11029, "com/appsflyer/AppsFlyerLib", "logEvent", null, objArr, appsFlyerLib, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                appsFlyerLib3 = (AppsFlyerLib) obj;
            } else {
                appsFlyerLib3 = appsFlyerLib;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                context2 = (Context) obj2;
            } else {
                context2 = context;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                str2 = (String) obj3;
            } else {
                str2 = str;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                map2 = (Map) obj4;
            } else {
                map2 = map;
            }
            Object obj5 = objArr2[4];
            appsFlyerLib2 = appsFlyerLib3;
            if (obj5 != null) {
                appsFlyerRequestListener = (AppsFlyerRequestListener) obj5;
                appsFlyerLib2 = appsFlyerLib3;
            }
        } else {
            appsFlyerLib2 = appsFlyerLib;
            context2 = context;
            str2 = str;
            map2 = map;
        }
        appsFlyerLib2.logEvent(context2, str2, map2, appsFlyerRequestListener);
        c0wst.LIZ(11029, "com/appsflyer/AppsFlyerLib", "logEvent", null, objArr, appsFlyerLib2, c0wzw, true);
    }

    public static void LLLLLLLLLL(C1BSM c1bsm, C2204981BRo c2204981BRo, int i, InterfaceC2205021BRs interfaceC2205021BRs, C0WZX c0wzx) throws Throwable {
        C1BSM c1bsm2;
        C2204981BRo c2204981BRo2;
        InterfaceC2205021BRs interfaceC2205021BRs2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {c2204981BRo, Integer.valueOf(iIntValue), interfaceC2205021BRs};
        C0WZW c0wzw = new C0WZW(false, "(Lcom/google/android/gms/maps/CameraUpdate;ILcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11518, "com/google/android/gms/maps/GoogleMap", "animateCamera", c1bsm, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11518, "com/google/android/gms/maps/GoogleMap", "animateCamera", null, objArr, c1bsm, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                c1bsm2 = (C1BSM) obj;
            } else {
                c1bsm2 = c1bsm;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                c2204981BRo2 = (C2204981BRo) obj2;
            } else {
                c2204981BRo2 = c2204981BRo;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
            Object obj4 = c0wsuLIZIZ.LIZJ[3];
            if (obj4 != null) {
                interfaceC2205021BRs2 = (InterfaceC2205021BRs) obj4;
            } else {
                interfaceC2205021BRs2 = interfaceC2205021BRs;
            }
        } else {
            c1bsm2 = c1bsm;
            c2204981BRo2 = c2204981BRo;
            interfaceC2205021BRs2 = interfaceC2205021BRs;
        }
        c1bsm2.getClass();
        try {
            C0W3J.LJIIIZ(c2204981BRo2, "CameraUpdate must not be null.");
            c1bsm2.LIZ.V0(c2204981BRo2.LIZ, iIntValue, new BinderC2205001BRq(interfaceC2205021BRs2));
            c0wst.LIZ(11518, "com/google/android/gms/maps/GoogleMap", "animateCamera", null, objArr, c1bsm2, c0wzw, true);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AccountManagerFuture LIZJ(AccountManager accountManager, String str, String[] strArr, AccountManagerCallback accountManagerCallback, BPEAHandler bPEAHandler, C0WZX c0wzx) throws Throwable {
        AccountManager accountManager2;
        String str2;
        String[] strArr2;
        AccountManagerCallback accountManagerCallback2;
        Handler handler;
        AccountManager accountManager3;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str, strArr, accountManagerCallback, bPEAHandler};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;[Ljava/lang/String;Landroid/accounts/AccountManagerCallback;Landroid/os/Handler;)Landroid/accounts/AccountManagerFuture;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102502, "android/accounts/AccountManager", "getAccountsByTypeAndFeatures", accountManager, objArr, "android.accounts.AccountManagerFuture", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102502, "android/accounts/AccountManager", "getAccountsByTypeAndFeatures", null, objArr, accountManager, c0wzw, false);
            return (AccountManagerFuture) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                accountManager3 = (AccountManager) obj;
            } else {
                accountManager3 = accountManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            } else {
                str2 = str;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                strArr2 = (String[]) obj3;
            } else {
                strArr2 = strArr;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                accountManagerCallback2 = (AccountManagerCallback) obj4;
            } else {
                accountManagerCallback2 = accountManagerCallback;
            }
            Object obj5 = objArr2[4];
            if (obj5 != null) {
                handler = (Handler) obj5;
                accountManager2 = accountManager3;
            } else {
                handler = bPEAHandler;
                accountManager2 = accountManager3;
            }
        } else {
            accountManager2 = accountManager;
            str2 = str;
            strArr2 = strArr;
            accountManagerCallback2 = accountManagerCallback;
            handler = bPEAHandler;
        }
        AccountManagerFuture<Account[]> accountsByTypeAndFeatures = accountManager2.getAccountsByTypeAndFeatures(str2, strArr2, accountManagerCallback2, handler);
        c0wst.LIZ(102502, "android/accounts/AccountManager", "getAccountsByTypeAndFeatures", accountsByTypeAndFeatures, objArr, accountManager2, c0wzw, true);
        return accountsByTypeAndFeatures;
    }

    public static Bundle LJJIJL(ContentResolver contentResolver, Uri uri, String str, String str2, Bundle bundle, C0WZX c0wzx) throws Throwable {
        ContentResolver contentResolver2;
        Uri uri2;
        String str3;
        String str4;
        Bundle bundle2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {uri, str, str2, bundle};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11072, "android/content/ContentResolver", "call", contentResolver, objArr, "android.os.Bundle", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11072, "android/content/ContentResolver", "call", null, objArr, contentResolver, c0wzw, false);
            return (Bundle) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contentResolver2 = (ContentResolver) obj;
            } else {
                contentResolver2 = contentResolver;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                uri2 = (Uri) obj2;
            } else {
                uri2 = uri;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                str3 = (String) obj3;
            } else {
                str3 = str;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                str4 = (String) obj4;
            } else {
                str4 = str2;
            }
            Object obj5 = objArr2[4];
            if (obj5 != null) {
                bundle2 = (Bundle) obj5;
            } else {
                bundle2 = bundle;
            }
        } else {
            contentResolver2 = contentResolver;
            uri2 = uri;
            str3 = str;
            str4 = str2;
            bundle2 = bundle;
        }
        Bundle bundleCall = contentResolver2.call(uri2, str3, str4, bundle2);
        c0wst.LIZ(11072, "android/content/ContentResolver", "call", bundleCall, objArr, contentResolver2, c0wzw, true);
        return bundleCall;
    }

    public static int LJJJI(ContentResolver contentResolver, Uri uri, ContentValues contentValues, String str, String[] strArr, C0WZX c0wzx) throws Throwable {
        ContentResolver contentResolver2;
        Uri uri2;
        ContentValues contentValues2;
        String str2;
        String[] strArr2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {uri, contentValues, str, strArr};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10971, "android/content/ContentResolver", "update", contentResolver, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10971, "android/content/ContentResolver", "update", null, objArr, contentResolver, c0wzw, false);
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contentResolver2 = (ContentResolver) obj;
            } else {
                contentResolver2 = contentResolver;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                uri2 = (Uri) obj2;
            } else {
                uri2 = uri;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                contentValues2 = (ContentValues) obj3;
            } else {
                contentValues2 = contentValues;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                str2 = (String) obj4;
            } else {
                str2 = str;
            }
            Object obj5 = objArr2[4];
            if (obj5 != null) {
                strArr2 = (String[]) obj5;
            } else {
                strArr2 = strArr;
            }
        } else {
            contentResolver2 = contentResolver;
            uri2 = uri;
            contentValues2 = contentValues;
            str2 = str;
            strArr2 = strArr;
        }
        int iUpdate = contentResolver2.update(uri2, contentValues2, str2, strArr2);
        c0wst.LIZ(10971, "android/content/ContentResolver", "update", Integer.valueOf(iUpdate), objArr, contentResolver2, c0wzw, true);
        return iUpdate;
    }

    public static boolean LJJJIL(Context context, Intent intent, int i, Executor executor, ServiceConnection serviceConnection, C0WZX c0wzx) throws Throwable {
        Context context2;
        Intent intent2;
        Executor executor2;
        ServiceConnection serviceConnection2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(iIntValue), executor, serviceConnection};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;ILjava/util/concurrent/Executor;Landroid/content/ServiceConnection;)Z", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11063, "android/content/Context", "bindService", context, objArr, "boolean", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11063, "android/content/Context", "bindService", null, objArr, context, c0wzw, false);
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                context2 = (Context) obj;
            } else {
                context2 = context;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
            Object[] objArr3 = c0wsuLIZIZ.LIZJ;
            Object obj4 = objArr3[3];
            if (obj4 != null) {
                executor2 = (Executor) obj4;
            } else {
                executor2 = executor;
            }
            Object obj5 = objArr3[4];
            if (obj5 != null) {
                serviceConnection2 = (ServiceConnection) obj5;
            } else {
                serviceConnection2 = serviceConnection;
            }
        } else {
            context2 = context;
            intent2 = intent;
            executor2 = executor;
            serviceConnection2 = serviceConnection;
        }
        boolean zBindService = context2.bindService(intent2, iIntValue, executor2, serviceConnection2);
        c0wst.LIZ(11063, "android/content/Context", "bindService", Boolean.valueOf(zBindService), objArr, context2, c0wzw, true);
        return zBindService;
    }

    public static boolean LJJLIIIIJ(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i, Handler handler, C0WZX c0wzx) throws Throwable {
        SensorManager sensorManager2;
        SensorEventListener sensorEventListener2;
        Sensor sensor2;
        Handler handler2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {sensorEventListener, sensor, Integer.valueOf(iIntValue), handler};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;ILandroid/os/Handler;)Z", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100700, "android/hardware/SensorManager", "registerListener", sensorManager, objArr, "boolean", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100700, "android/hardware/SensorManager", "registerListener", null, objArr, sensorManager, c0wzw, false);
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                sensorManager2 = (SensorManager) obj;
            } else {
                sensorManager2 = sensorManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                sensorEventListener2 = (SensorEventListener) obj2;
            } else {
                sensorEventListener2 = sensorEventListener;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                sensor2 = (Sensor) obj3;
            } else {
                sensor2 = sensor;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                iIntValue = ((Integer) obj4).intValue();
            }
            Object obj5 = c0wsuLIZIZ.LIZJ[4];
            if (obj5 != null) {
                handler2 = (Handler) obj5;
            } else {
                handler2 = handler;
            }
        } else {
            sensorManager2 = sensorManager;
            sensorEventListener2 = sensorEventListener;
            sensor2 = sensor;
            handler2 = handler;
        }
        boolean zRegisterListener = sensorManager2.registerListener(sensorEventListener2, sensor2, iIntValue, handler2);
        c0wst.LIZ(100700, "android/hardware/SensorManager", "registerListener", Boolean.valueOf(zRegisterListener), objArr, sensorManager2, c0wzw, true);
        return zRegisterListener;
    }

    public static void LLILLIZIL(Surface surface, Rect rect, Bitmap bitmap, PixelCopyOnPixelCopyFinishedListenerC1310340kCe pixelCopyOnPixelCopyFinishedListenerC1310340kCe, BPEAHandler bPEAHandler, C0WZX c0wzx) throws Throwable {
        Surface surface2;
        Rect rect2;
        Bitmap bitmap2;
        PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener;
        Handler handler;
        C0WST c0wst = new C0WST();
        Object[] objArr = {surface, rect, bitmap, pixelCopyOnPixelCopyFinishedListenerC1310340kCe, bPEAHandler};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/view/Surface;Landroid/graphics/Rect;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2824, "android/view/PixelCopy", "request", PixelCopy.class, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2824, "android/view/PixelCopy", "request", null, objArr, PixelCopy.class, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                surface2 = (Surface) obj;
            } else {
                surface2 = surface;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                rect2 = (Rect) obj2;
            } else {
                rect2 = rect;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                bitmap2 = (Bitmap) obj3;
            } else {
                bitmap2 = bitmap;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                onPixelCopyFinishedListener = (PixelCopy.OnPixelCopyFinishedListener) obj4;
            } else {
                onPixelCopyFinishedListener = pixelCopyOnPixelCopyFinishedListenerC1310340kCe;
            }
            Object obj5 = objArr2[4];
            if (obj5 != null) {
                handler = (Handler) obj5;
            }
            PixelCopy.request(surface2, rect2, bitmap2, onPixelCopyFinishedListener, handler);
            c0wst.LIZ(2824, "android/view/PixelCopy", "request", null, objArr, PixelCopy.class, c0wzw, true);
        }
        surface2 = surface;
        rect2 = rect;
        bitmap2 = bitmap;
        onPixelCopyFinishedListener = pixelCopyOnPixelCopyFinishedListenerC1310340kCe;
        handler = bPEAHandler;
        PixelCopy.request(surface2, rect2, bitmap2, onPixelCopyFinishedListener, handler);
        c0wst.LIZ(2824, "android/view/PixelCopy", "request", null, objArr, PixelCopy.class, c0wzw, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(AccountManager accountManager, Account account, String str, Bundle bundle, AccountManagerCallback accountManagerCallback, BPEAHandler bPEAHandler, C0WZX c0wzx) throws Throwable {
        AccountManager accountManager2;
        Account account2;
        String str2;
        Bundle bundle2;
        AccountManagerCallback accountManagerCallback2;
        Handler handler;
        C0WST c0wst = new C0WST();
        boolean zBooleanValue = true;
        Object[] objArr = {account, str, bundle, Boolean.TRUE, accountManagerCallback, bPEAHandler};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;ZLandroid/accounts/AccountManagerCallback;Landroid/os/Handler;)Landroid/accounts/AccountManagerFuture;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10016, "android/accounts/AccountManager", "getAuthToken", accountManager, objArr, "android.accounts.AccountManagerFuture", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10016, "android/accounts/AccountManager", "getAuthToken", null, objArr, accountManager, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                accountManager2 = (AccountManager) obj;
            } else {
                accountManager2 = accountManager;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                account2 = (Account) obj2;
            } else {
                account2 = account;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                str2 = (String) obj3;
            } else {
                str2 = str;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                bundle2 = (Bundle) obj4;
            } else {
                bundle2 = bundle;
            }
            Object obj5 = objArr2[4];
            if (obj5 != null) {
                zBooleanValue = ((Boolean) obj5).booleanValue();
            }
            Object[] objArr3 = c0wsuLIZIZ.LIZJ;
            Object obj6 = objArr3[5];
            if (obj6 != null) {
                accountManagerCallback2 = (AccountManagerCallback) obj6;
            } else {
                accountManagerCallback2 = accountManagerCallback;
            }
            Object obj7 = objArr3[6];
            if (obj7 != null) {
                handler = (Handler) obj7;
            } else {
                handler = bPEAHandler;
            }
        } else {
            accountManager2 = accountManager;
            account2 = account;
            str2 = str;
            bundle2 = bundle;
            accountManagerCallback2 = accountManagerCallback;
            handler = bPEAHandler;
        }
        c0wst.LIZ(10016, "android/accounts/AccountManager", "getAuthToken", accountManager2.getAuthToken(account2, str2, bundle2, zBooleanValue, (AccountManagerCallback<Bundle>) accountManagerCallback2, handler), objArr, accountManager2, c0wzw, true);
    }

    public static Cursor LJJJ(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C0WZX c0wzx) throws Throwable {
        ContentResolver contentResolver2;
        Uri uri2;
        String[] strArr3;
        String str3;
        String[] strArr4;
        String str4;
        C0WST c0wst = new C0WST();
        Object[] objArr = {uri, strArr, str, strArr2, str2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(240004, "android/content/ContentResolver", "query", contentResolver, objArr, "android.database.Cursor", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(240004, "android/content/ContentResolver", "query", null, objArr, contentResolver, c0wzw, false);
            return (Cursor) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contentResolver2 = (ContentResolver) obj;
            } else {
                contentResolver2 = contentResolver;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                uri2 = (Uri) obj2;
            } else {
                uri2 = uri;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                strArr3 = (String[]) obj3;
            } else {
                strArr3 = strArr;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                str3 = (String) obj4;
            } else {
                str3 = str;
            }
            Object obj5 = objArr2[4];
            if (obj5 != null) {
                strArr4 = (String[]) obj5;
            } else {
                strArr4 = strArr2;
            }
            Object obj6 = objArr2[5];
            if (obj6 != null) {
                str4 = (String) obj6;
            } else {
                str4 = str2;
            }
        } else {
            contentResolver2 = contentResolver;
            uri2 = uri;
            strArr3 = strArr;
            str3 = str;
            strArr4 = strArr2;
            str4 = str2;
        }
        Cursor cursorQuery = contentResolver2.query(uri2, strArr3, str3, strArr4, str4);
        c0wst.LIZ(240004, "android/content/ContentResolver", "query", cursorQuery, objArr, contentResolver2, c0wzw, true);
        return cursorQuery;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LLLIL(AssemContainerBridge assemContainerBridge, LifecycleOwner lifecycleOwner, Intent intent, int i, Bundle bundle, InterfaceC1631620sYq interfaceC1631620sYq, C0WZX c0wzx) throws Throwable {
        final AssemContainerBridge assemContainerBridge2;
        final LifecycleOwner lifecycleOwner2;
        Intent intent2;
        Bundle bundle2;
        Object obj;
        int iIntValue;
        androidx.fragment.app.Fragment fragment;
        androidx.fragment.app.Fragment fragment2;
        final int iIntValue2 = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {lifecycleOwner, intent, Integer.valueOf(iIntValue2), bundle, interfaceC1631620sYq};
        C0WZW c0wzw = new C0WZW(false, "(Landroidx/lifecycle/LifecycleOwner;Landroid/content/Intent;ILandroid/os/Bundle;Lkotlin/jvm/functions/Function3;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "com/bytedance/assem/arch/core/AssemContainerBridge", "startActivityForResult", assemContainerBridge, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11087, "com/bytedance/assem/arch/core/AssemContainerBridge", "startActivityForResult", null, objArr, assemContainerBridge, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj2 = objArr2[0];
            if (obj2 != null) {
                assemContainerBridge2 = (AssemContainerBridge) obj2;
            } else {
                assemContainerBridge2 = assemContainerBridge;
            }
            Object obj3 = objArr2[1];
            if (obj3 != null) {
                lifecycleOwner2 = (LifecycleOwner) obj3;
            } else {
                lifecycleOwner2 = lifecycleOwner;
            }
            Object obj4 = objArr2[2];
            if (obj4 != null) {
                intent2 = (Intent) obj4;
            } else {
                intent2 = intent;
            }
            Object obj5 = objArr2[3];
            if (obj5 != null) {
                iIntValue2 = ((Integer) obj5).intValue();
            }
            Object[] objArr3 = c0wsuLIZIZ.LIZJ;
            Object obj6 = objArr3[4];
            if (obj6 != null) {
                bundle2 = (Bundle) obj6;
            } else {
                bundle2 = bundle;
            }
            obj = objArr3[5];
            if (obj == null) {
                obj = interfaceC1631620sYq;
            }
        } else {
            assemContainerBridge2 = assemContainerBridge;
            lifecycleOwner2 = lifecycleOwner;
            intent2 = intent;
            bundle2 = bundle;
            obj = interfaceC1631620sYq;
        }
        assemContainerBridge2.getClass();
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            if (C0RUZ.LIZ(assemContainerBridge2.requireActivity()) && lifecycleOwner2.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                if (iIntValue2 < 0) {
                    C1701330uNH.LIZ(intent2, assemContainerBridge2);
                    C0WZX c0wzx2 = new C0WZX("dzBzEgAjS8/YVFkiQFyFdYMFRnha5bggw7J/RCweu/jDTKJOxvekxg3iZQlc0Ah4CIo=", null);
                    C0WST c0wst2 = new C0WST();
                    Object[] objArr4 = {intent2};
                    C0WZW c0wzw2 = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx2);
                    C0WSU c0wsuLIZIZ2 = c0wst2.LIZIZ(11088, "com/bytedance/assem/arch/core/AssemContainerBridge", "startActivity", assemContainerBridge2, objArr4, "void", c0wzw2);
                    if (c0wsuLIZIZ2.LIZ) {
                        c0wst2.LIZ(11088, "com/bytedance/assem/arch/core/AssemContainerBridge", "startActivity", null, objArr4, assemContainerBridge2, c0wzw2, false);
                    } else {
                        Object[] objArr5 = c0wsuLIZIZ2.LIZJ;
                        if (objArr5 != null) {
                            Object obj7 = objArr5[0];
                            if (obj7 != null) {
                                fragment2 = (androidx.fragment.app.Fragment) obj7;
                            } else {
                                fragment2 = assemContainerBridge2;
                            }
                            Object obj8 = objArr5[1];
                            if (obj8 != null) {
                                intent2 = (Intent) obj8;
                            }
                        } else {
                            fragment2 = assemContainerBridge2;
                        }
                        fragment2.startActivity(intent2);
                        c0wst2.LIZ(11088, "com/bytedance/assem/arch/core/AssemContainerBridge", "startActivity", null, objArr4, fragment2, c0wzw2, true);
                    }
                } else {
                    if (obj != null) {
                        assemContainerBridge2.LL.LJFF(iIntValue2, obj);
                    }
                    C1701330uNH.LIZ(intent2, assemContainerBridge2);
                    C0WZX c0wzx3 = new C0WZX("dzBzEgAjS8/YVFkiQFyFdYMFRnha5bggw7J/RCweu/jDTKJOxvekxg3iZQlc0Ah4CIo=", null);
                    C0WST c0wst3 = new C0WST();
                    Object[] objArr6 = {intent2, Integer.valueOf(iIntValue2), bundle2};
                    C0WZW c0wzw3 = new C0WZW(false, "(Landroid/content/Intent;ILandroid/os/Bundle;)V", c0wzx3);
                    C0WSU c0wsuLIZIZ3 = c0wst3.LIZIZ(11087, "com/bytedance/assem/arch/core/AssemContainerBridge", "startActivityForResult", assemContainerBridge2, objArr6, "void", c0wzw3);
                    if (c0wsuLIZIZ3.LIZ) {
                        c0wst3.LIZ(11087, "com/bytedance/assem/arch/core/AssemContainerBridge", "startActivityForResult", null, objArr6, assemContainerBridge2, c0wzw3, false);
                    } else {
                        Object[] objArr7 = c0wsuLIZIZ3.LIZJ;
                        if (objArr7 != null) {
                            Object obj9 = objArr7[0];
                            if (obj9 != null) {
                                fragment = (androidx.fragment.app.Fragment) obj9;
                            } else {
                                fragment = assemContainerBridge2;
                            }
                            Object obj10 = objArr7[1];
                            if (obj10 != null) {
                                intent2 = (Intent) obj10;
                            }
                            Object obj11 = objArr7[2];
                            if (obj11 != null) {
                                iIntValue = ((Integer) obj11).intValue();
                            } else {
                                iIntValue = iIntValue2;
                            }
                            Object obj12 = c0wsuLIZIZ3.LIZJ[3];
                            if (obj12 != null) {
                                bundle2 = (Bundle) obj12;
                            }
                        } else {
                            iIntValue = iIntValue2;
                            fragment = assemContainerBridge2;
                        }
                        fragment.startActivityForResult(intent2, iIntValue, bundle2);
                        c0wst3.LIZ(11087, "com/bytedance/assem/arch/core/AssemContainerBridge", "startActivityForResult", null, objArr6, fragment, c0wzw3, true);
                    }
                    lifecycleOwner2.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.assem.arch.core.AssemContainerBridge$startActivityForResult$2
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner3, Lifecycle.Event event) {
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                onDestroy();
                            }
                        }

                        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                        public final void onDestroy() {
                            lifecycleOwner2.getLifecycle().removeObserver(this);
                            assemContainerBridge2.LL.LJI(iIntValue2);
                        }
                    });
                }
            }
            c0wst.LIZ(11087, "com/bytedance/assem/arch/core/AssemContainerBridge", "startActivityForResult", null, objArr, assemContainerBridge2, c0wzw, true);
            return;
        }
        "This method must be called on main thread".toString();
        throw new IllegalStateException("This method must be called on main thread");
    }

    public static Cursor LJJIZ(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal, C0WZX c0wzx) throws Throwable {
        ContentResolver contentResolver2;
        Uri uri2;
        String[] strArr3;
        String str3;
        String[] strArr4;
        String str4;
        CancellationSignal cancellationSignal2;
        C0WST c0wst = new C0WST();
        Object[] objArr = {uri, strArr, str, strArr2, str2, cancellationSignal};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(240004, "android/content/ContentResolver", "query", contentResolver, objArr, "android.database.Cursor", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(240004, "android/content/ContentResolver", "query", null, objArr, contentResolver, c0wzw, false);
            return (Cursor) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contentResolver2 = (ContentResolver) obj;
            } else {
                contentResolver2 = contentResolver;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                uri2 = (Uri) obj2;
            } else {
                uri2 = uri;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                strArr3 = (String[]) obj3;
            } else {
                strArr3 = strArr;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                str3 = (String) obj4;
            } else {
                str3 = str;
            }
            Object obj5 = objArr2[4];
            if (obj5 != null) {
                strArr4 = (String[]) obj5;
            } else {
                strArr4 = strArr2;
            }
            Object obj6 = objArr2[5];
            if (obj6 != null) {
                str4 = (String) obj6;
            } else {
                str4 = str2;
            }
            Object obj7 = objArr2[6];
            if (obj7 != null) {
                cancellationSignal2 = (CancellationSignal) obj7;
            } else {
                cancellationSignal2 = cancellationSignal;
            }
        } else {
            contentResolver2 = contentResolver;
            uri2 = uri;
            strArr3 = strArr;
            str3 = str;
            strArr4 = strArr2;
            str4 = str2;
            cancellationSignal2 = cancellationSignal;
        }
        Cursor cursorQuery = contentResolver2.query(uri2, strArr3, str3, strArr4, str4, cancellationSignal2);
        c0wst.LIZ(240004, "android/content/ContentResolver", "query", cursorQuery, objArr, contentResolver2, c0wzw, true);
        return cursorQuery;
    }
}
