package X;

import Y.ARunnableS130S0100000_30;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.analytics.page.TrackerProcessLifecycleObserver;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.ugc.statisticlogger.config.LazyLoadLegoTask;
import com.bytedance.ies.ugc.statisticlogger.config.SetAppTrackTask;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.statistic.AppLogNetworkClient;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bf1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210291Bf1 {
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0017, B:8:0x0036, B:10:0x0040, B:11:0x0059, B:13:0x0063, B:14:0x0066, B:16:0x006e, B:17:0x0071, B:19:0x007b, B:21:0x0089, B:23:0x0095, B:24:0x009a, B:28:0x00c8, B:25:0x00a6, B:27:0x00bc, B:31:0x00d1, B:33:0x00d9, B:34:0x00ee, B:36:0x00f4, B:38:0x0102, B:40:0x0111, B:41:0x0119, B:43:0x0121, B:45:0x0130, B:47:0x0139, B:49:0x0143, B:50:0x014e, B:52:0x015d, B:53:0x0165, B:55:0x016d, B:56:0x016f, B:58:0x0177, B:59:0x017a, B:61:0x0184, B:62:0x018e, B:64:0x0196, B:65:0x0198, B:72:0x01d9, B:74:0x01e9, B:75:0x01eb, B:77:0x01f9, B:78:0x01fb, B:80:0x0209, B:81:0x020b, B:83:0x0245, B:84:0x0247, B:86:0x024f, B:87:0x0251, B:89:0x0259, B:90:0x025b, B:92:0x0285, B:93:0x0288, B:95:0x0298, B:96:0x029a, B:98:0x02c6, B:99:0x02d0, B:101:0x02de, B:102:0x02e1, B:104:0x02ef, B:105:0x02f2, B:107:0x02fa, B:108:0x02fd, B:110:0x030d, B:111:0x0310, B:113:0x031d, B:114:0x0320, B:116:0x032d, B:117:0x032f, B:119:0x033c, B:121:0x0342, B:123:0x0348, B:142:0x0400, B:144:0x0408, B:124:0x034b, B:126:0x0360, B:127:0x0362, B:129:0x0391, B:131:0x0397, B:133:0x03a9, B:135:0x03bc, B:136:0x03da, B:138:0x03de, B:139:0x03e1, B:140:0x03ea, B:141:0x03fc, B:145:0x040d, B:147:0x041b), top: B:153:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0177 A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0017, B:8:0x0036, B:10:0x0040, B:11:0x0059, B:13:0x0063, B:14:0x0066, B:16:0x006e, B:17:0x0071, B:19:0x007b, B:21:0x0089, B:23:0x0095, B:24:0x009a, B:28:0x00c8, B:25:0x00a6, B:27:0x00bc, B:31:0x00d1, B:33:0x00d9, B:34:0x00ee, B:36:0x00f4, B:38:0x0102, B:40:0x0111, B:41:0x0119, B:43:0x0121, B:45:0x0130, B:47:0x0139, B:49:0x0143, B:50:0x014e, B:52:0x015d, B:53:0x0165, B:55:0x016d, B:56:0x016f, B:58:0x0177, B:59:0x017a, B:61:0x0184, B:62:0x018e, B:64:0x0196, B:65:0x0198, B:72:0x01d9, B:74:0x01e9, B:75:0x01eb, B:77:0x01f9, B:78:0x01fb, B:80:0x0209, B:81:0x020b, B:83:0x0245, B:84:0x0247, B:86:0x024f, B:87:0x0251, B:89:0x0259, B:90:0x025b, B:92:0x0285, B:93:0x0288, B:95:0x0298, B:96:0x029a, B:98:0x02c6, B:99:0x02d0, B:101:0x02de, B:102:0x02e1, B:104:0x02ef, B:105:0x02f2, B:107:0x02fa, B:108:0x02fd, B:110:0x030d, B:111:0x0310, B:113:0x031d, B:114:0x0320, B:116:0x032d, B:117:0x032f, B:119:0x033c, B:121:0x0342, B:123:0x0348, B:142:0x0400, B:144:0x0408, B:124:0x034b, B:126:0x0360, B:127:0x0362, B:129:0x0391, B:131:0x0397, B:133:0x03a9, B:135:0x03bc, B:136:0x03da, B:138:0x03de, B:139:0x03e1, B:140:0x03ea, B:141:0x03fc, B:145:0x040d, B:147:0x041b), top: B:153:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0184 A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0017, B:8:0x0036, B:10:0x0040, B:11:0x0059, B:13:0x0063, B:14:0x0066, B:16:0x006e, B:17:0x0071, B:19:0x007b, B:21:0x0089, B:23:0x0095, B:24:0x009a, B:28:0x00c8, B:25:0x00a6, B:27:0x00bc, B:31:0x00d1, B:33:0x00d9, B:34:0x00ee, B:36:0x00f4, B:38:0x0102, B:40:0x0111, B:41:0x0119, B:43:0x0121, B:45:0x0130, B:47:0x0139, B:49:0x0143, B:50:0x014e, B:52:0x015d, B:53:0x0165, B:55:0x016d, B:56:0x016f, B:58:0x0177, B:59:0x017a, B:61:0x0184, B:62:0x018e, B:64:0x0196, B:65:0x0198, B:72:0x01d9, B:74:0x01e9, B:75:0x01eb, B:77:0x01f9, B:78:0x01fb, B:80:0x0209, B:81:0x020b, B:83:0x0245, B:84:0x0247, B:86:0x024f, B:87:0x0251, B:89:0x0259, B:90:0x025b, B:92:0x0285, B:93:0x0288, B:95:0x0298, B:96:0x029a, B:98:0x02c6, B:99:0x02d0, B:101:0x02de, B:102:0x02e1, B:104:0x02ef, B:105:0x02f2, B:107:0x02fa, B:108:0x02fd, B:110:0x030d, B:111:0x0310, B:113:0x031d, B:114:0x0320, B:116:0x032d, B:117:0x032f, B:119:0x033c, B:121:0x0342, B:123:0x0348, B:142:0x0400, B:144:0x0408, B:124:0x034b, B:126:0x0360, B:127:0x0362, B:129:0x0391, B:131:0x0397, B:133:0x03a9, B:135:0x03bc, B:136:0x03da, B:138:0x03de, B:139:0x03e1, B:140:0x03ea, B:141:0x03fc, B:145:0x040d, B:147:0x041b), top: B:153:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0196 A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0017, B:8:0x0036, B:10:0x0040, B:11:0x0059, B:13:0x0063, B:14:0x0066, B:16:0x006e, B:17:0x0071, B:19:0x007b, B:21:0x0089, B:23:0x0095, B:24:0x009a, B:28:0x00c8, B:25:0x00a6, B:27:0x00bc, B:31:0x00d1, B:33:0x00d9, B:34:0x00ee, B:36:0x00f4, B:38:0x0102, B:40:0x0111, B:41:0x0119, B:43:0x0121, B:45:0x0130, B:47:0x0139, B:49:0x0143, B:50:0x014e, B:52:0x015d, B:53:0x0165, B:55:0x016d, B:56:0x016f, B:58:0x0177, B:59:0x017a, B:61:0x0184, B:62:0x018e, B:64:0x0196, B:65:0x0198, B:72:0x01d9, B:74:0x01e9, B:75:0x01eb, B:77:0x01f9, B:78:0x01fb, B:80:0x0209, B:81:0x020b, B:83:0x0245, B:84:0x0247, B:86:0x024f, B:87:0x0251, B:89:0x0259, B:90:0x025b, B:92:0x0285, B:93:0x0288, B:95:0x0298, B:96:0x029a, B:98:0x02c6, B:99:0x02d0, B:101:0x02de, B:102:0x02e1, B:104:0x02ef, B:105:0x02f2, B:107:0x02fa, B:108:0x02fd, B:110:0x030d, B:111:0x0310, B:113:0x031d, B:114:0x0320, B:116:0x032d, B:117:0x032f, B:119:0x033c, B:121:0x0342, B:123:0x0348, B:142:0x0400, B:144:0x0408, B:124:0x034b, B:126:0x0360, B:127:0x0362, B:129:0x0391, B:131:0x0397, B:133:0x03a9, B:135:0x03bc, B:136:0x03da, B:138:0x03de, B:139:0x03e1, B:140:0x03ea, B:141:0x03fc, B:145:0x040d, B:147:0x041b), top: B:153:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9 A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0017, B:8:0x0036, B:10:0x0040, B:11:0x0059, B:13:0x0063, B:14:0x0066, B:16:0x006e, B:17:0x0071, B:19:0x007b, B:21:0x0089, B:23:0x0095, B:24:0x009a, B:28:0x00c8, B:25:0x00a6, B:27:0x00bc, B:31:0x00d1, B:33:0x00d9, B:34:0x00ee, B:36:0x00f4, B:38:0x0102, B:40:0x0111, B:41:0x0119, B:43:0x0121, B:45:0x0130, B:47:0x0139, B:49:0x0143, B:50:0x014e, B:52:0x015d, B:53:0x0165, B:55:0x016d, B:56:0x016f, B:58:0x0177, B:59:0x017a, B:61:0x0184, B:62:0x018e, B:64:0x0196, B:65:0x0198, B:72:0x01d9, B:74:0x01e9, B:75:0x01eb, B:77:0x01f9, B:78:0x01fb, B:80:0x0209, B:81:0x020b, B:83:0x0245, B:84:0x0247, B:86:0x024f, B:87:0x0251, B:89:0x0259, B:90:0x025b, B:92:0x0285, B:93:0x0288, B:95:0x0298, B:96:0x029a, B:98:0x02c6, B:99:0x02d0, B:101:0x02de, B:102:0x02e1, B:104:0x02ef, B:105:0x02f2, B:107:0x02fa, B:108:0x02fd, B:110:0x030d, B:111:0x0310, B:113:0x031d, B:114:0x0320, B:116:0x032d, B:117:0x032f, B:119:0x033c, B:121:0x0342, B:123:0x0348, B:142:0x0400, B:144:0x0408, B:124:0x034b, B:126:0x0360, B:127:0x0362, B:129:0x0391, B:131:0x0397, B:133:0x03a9, B:135:0x03bc, B:136:0x03da, B:138:0x03de, B:139:0x03e1, B:140:0x03ea, B:141:0x03fc, B:145:0x040d, B:147:0x041b), top: B:153:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f9 A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0017, B:8:0x0036, B:10:0x0040, B:11:0x0059, B:13:0x0063, B:14:0x0066, B:16:0x006e, B:17:0x0071, B:19:0x007b, B:21:0x0089, B:23:0x0095, B:24:0x009a, B:28:0x00c8, B:25:0x00a6, B:27:0x00bc, B:31:0x00d1, B:33:0x00d9, B:34:0x00ee, B:36:0x00f4, B:38:0x0102, B:40:0x0111, B:41:0x0119, B:43:0x0121, B:45:0x0130, B:47:0x0139, B:49:0x0143, B:50:0x014e, B:52:0x015d, B:53:0x0165, B:55:0x016d, B:56:0x016f, B:58:0x0177, B:59:0x017a, B:61:0x0184, B:62:0x018e, B:64:0x0196, B:65:0x0198, B:72:0x01d9, B:74:0x01e9, B:75:0x01eb, B:77:0x01f9, B:78:0x01fb, B:80:0x0209, B:81:0x020b, B:83:0x0245, B:84:0x0247, B:86:0x024f, B:87:0x0251, B:89:0x0259, B:90:0x025b, B:92:0x0285, B:93:0x0288, B:95:0x0298, B:96:0x029a, B:98:0x02c6, B:99:0x02d0, B:101:0x02de, B:102:0x02e1, B:104:0x02ef, B:105:0x02f2, B:107:0x02fa, B:108:0x02fd, B:110:0x030d, B:111:0x0310, B:113:0x031d, B:114:0x0320, B:116:0x032d, B:117:0x032f, B:119:0x033c, B:121:0x0342, B:123:0x0348, B:142:0x0400, B:144:0x0408, B:124:0x034b, B:126:0x0360, B:127:0x0362, B:129:0x0391, B:131:0x0397, B:133:0x03a9, B:135:0x03bc, B:136:0x03da, B:138:0x03de, B:139:0x03e1, B:140:0x03ea, B:141:0x03fc, B:145:0x040d, B:147:0x041b), top: B:153:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0209 A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0017, B:8:0x0036, B:10:0x0040, B:11:0x0059, B:13:0x0063, B:14:0x0066, B:16:0x006e, B:17:0x0071, B:19:0x007b, B:21:0x0089, B:23:0x0095, B:24:0x009a, B:28:0x00c8, B:25:0x00a6, B:27:0x00bc, B:31:0x00d1, B:33:0x00d9, B:34:0x00ee, B:36:0x00f4, B:38:0x0102, B:40:0x0111, B:41:0x0119, B:43:0x0121, B:45:0x0130, B:47:0x0139, B:49:0x0143, B:50:0x014e, B:52:0x015d, B:53:0x0165, B:55:0x016d, B:56:0x016f, B:58:0x0177, B:59:0x017a, B:61:0x0184, B:62:0x018e, B:64:0x0196, B:65:0x0198, B:72:0x01d9, B:74:0x01e9, B:75:0x01eb, B:77:0x01f9, B:78:0x01fb, B:80:0x0209, B:81:0x020b, B:83:0x0245, B:84:0x0247, B:86:0x024f, B:87:0x0251, B:89:0x0259, B:90:0x025b, B:92:0x0285, B:93:0x0288, B:95:0x0298, B:96:0x029a, B:98:0x02c6, B:99:0x02d0, B:101:0x02de, B:102:0x02e1, B:104:0x02ef, B:105:0x02f2, B:107:0x02fa, B:108:0x02fd, B:110:0x030d, B:111:0x0310, B:113:0x031d, B:114:0x0320, B:116:0x032d, B:117:0x032f, B:119:0x033c, B:121:0x0342, B:123:0x0348, B:142:0x0400, B:144:0x0408, B:124:0x034b, B:126:0x0360, B:127:0x0362, B:129:0x0391, B:131:0x0397, B:133:0x03a9, B:135:0x03bc, B:136:0x03da, B:138:0x03de, B:139:0x03e1, B:140:0x03ea, B:141:0x03fc, B:145:0x040d, B:147:0x041b), top: B:153:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0245 A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0017, B:8:0x0036, B:10:0x0040, B:11:0x0059, B:13:0x0063, B:14:0x0066, B:16:0x006e, B:17:0x0071, B:19:0x007b, B:21:0x0089, B:23:0x0095, B:24:0x009a, B:28:0x00c8, B:25:0x00a6, B:27:0x00bc, B:31:0x00d1, B:33:0x00d9, B:34:0x00ee, B:36:0x00f4, B:38:0x0102, B:40:0x0111, B:41:0x0119, B:43:0x0121, B:45:0x0130, B:47:0x0139, B:49:0x0143, B:50:0x014e, B:52:0x015d, B:53:0x0165, B:55:0x016d, B:56:0x016f, B:58:0x0177, B:59:0x017a, B:61:0x0184, B:62:0x018e, B:64:0x0196, B:65:0x0198, B:72:0x01d9, B:74:0x01e9, B:75:0x01eb, B:77:0x01f9, B:78:0x01fb, B:80:0x0209, B:81:0x020b, B:83:0x0245, B:84:0x0247, B:86:0x024f, B:87:0x0251, B:89:0x0259, B:90:0x025b, B:92:0x0285, B:93:0x0288, B:95:0x0298, B:96:0x029a, B:98:0x02c6, B:99:0x02d0, B:101:0x02de, B:102:0x02e1, B:104:0x02ef, B:105:0x02f2, B:107:0x02fa, B:108:0x02fd, B:110:0x030d, B:111:0x0310, B:113:0x031d, B:114:0x0320, B:116:0x032d, B:117:0x032f, B:119:0x033c, B:121:0x0342, B:123:0x0348, B:142:0x0400, B:144:0x0408, B:124:0x034b, B:126:0x0360, B:127:0x0362, B:129:0x0391, B:131:0x0397, B:133:0x03a9, B:135:0x03bc, B:136:0x03da, B:138:0x03de, B:139:0x03e1, B:140:0x03ea, B:141:0x03fc, B:145:0x040d, B:147:0x041b), top: B:153:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024f A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0017, B:8:0x0036, B:10:0x0040, B:11:0x0059, B:13:0x0063, B:14:0x0066, B:16:0x006e, B:17:0x0071, B:19:0x007b, B:21:0x0089, B:23:0x0095, B:24:0x009a, B:28:0x00c8, B:25:0x00a6, B:27:0x00bc, B:31:0x00d1, B:33:0x00d9, B:34:0x00ee, B:36:0x00f4, B:38:0x0102, B:40:0x0111, B:41:0x0119, B:43:0x0121, B:45:0x0130, B:47:0x0139, B:49:0x0143, B:50:0x014e, B:52:0x015d, B:53:0x0165, B:55:0x016d, B:56:0x016f, B:58:0x0177, B:59:0x017a, B:61:0x0184, B:62:0x018e, B:64:0x0196, B:65:0x0198, B:72:0x01d9, B:74:0x01e9, B:75:0x01eb, B:77:0x01f9, B:78:0x01fb, B:80:0x0209, B:81:0x020b, B:83:0x0245, B:84:0x0247, B:86:0x024f, B:87:0x0251, B:89:0x0259, B:90:0x025b, B:92:0x0285, B:93:0x0288, B:95:0x0298, B:96:0x029a, B:98:0x02c6, B:99:0x02d0, B:101:0x02de, B:102:0x02e1, B:104:0x02ef, B:105:0x02f2, B:107:0x02fa, B:108:0x02fd, B:110:0x030d, B:111:0x0310, B:113:0x031d, B:114:0x0320, B:116:0x032d, B:117:0x032f, B:119:0x033c, B:121:0x0342, B:123:0x0348, B:142:0x0400, B:144:0x0408, B:124:0x034b, B:126:0x0360, B:127:0x0362, B:129:0x0391, B:131:0x0397, B:133:0x03a9, B:135:0x03bc, B:136:0x03da, B:138:0x03de, B:139:0x03e1, B:140:0x03ea, B:141:0x03fc, B:145:0x040d, B:147:0x041b), top: B:153:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0259 A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0017, B:8:0x0036, B:10:0x0040, B:11:0x0059, B:13:0x0063, B:14:0x0066, B:16:0x006e, B:17:0x0071, B:19:0x007b, B:21:0x0089, B:23:0x0095, B:24:0x009a, B:28:0x00c8, B:25:0x00a6, B:27:0x00bc, B:31:0x00d1, B:33:0x00d9, B:34:0x00ee, B:36:0x00f4, B:38:0x0102, B:40:0x0111, B:41:0x0119, B:43:0x0121, B:45:0x0130, B:47:0x0139, B:49:0x0143, B:50:0x014e, B:52:0x015d, B:53:0x0165, B:55:0x016d, B:56:0x016f, B:58:0x0177, B:59:0x017a, B:61:0x0184, B:62:0x018e, B:64:0x0196, B:65:0x0198, B:72:0x01d9, B:74:0x01e9, B:75:0x01eb, B:77:0x01f9, B:78:0x01fb, B:80:0x0209, B:81:0x020b, B:83:0x0245, B:84:0x0247, B:86:0x024f, B:87:0x0251, B:89:0x0259, B:90:0x025b, B:92:0x0285, B:93:0x0288, B:95:0x0298, B:96:0x029a, B:98:0x02c6, B:99:0x02d0, B:101:0x02de, B:102:0x02e1, B:104:0x02ef, B:105:0x02f2, B:107:0x02fa, B:108:0x02fd, B:110:0x030d, B:111:0x0310, B:113:0x031d, B:114:0x0320, B:116:0x032d, B:117:0x032f, B:119:0x033c, B:121:0x0342, B:123:0x0348, B:142:0x0400, B:144:0x0408, B:124:0x034b, B:126:0x0360, B:127:0x0362, B:129:0x0391, B:131:0x0397, B:133:0x03a9, B:135:0x03bc, B:136:0x03da, B:138:0x03de, B:139:0x03e1, B:140:0x03ea, B:141:0x03fc, B:145:0x040d, B:147:0x041b), top: B:153:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0285 A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0017, B:8:0x0036, B:10:0x0040, B:11:0x0059, B:13:0x0063, B:14:0x0066, B:16:0x006e, B:17:0x0071, B:19:0x007b, B:21:0x0089, B:23:0x0095, B:24:0x009a, B:28:0x00c8, B:25:0x00a6, B:27:0x00bc, B:31:0x00d1, B:33:0x00d9, B:34:0x00ee, B:36:0x00f4, B:38:0x0102, B:40:0x0111, B:41:0x0119, B:43:0x0121, B:45:0x0130, B:47:0x0139, B:49:0x0143, B:50:0x014e, B:52:0x015d, B:53:0x0165, B:55:0x016d, B:56:0x016f, B:58:0x0177, B:59:0x017a, B:61:0x0184, B:62:0x018e, B:64:0x0196, B:65:0x0198, B:72:0x01d9, B:74:0x01e9, B:75:0x01eb, B:77:0x01f9, B:78:0x01fb, B:80:0x0209, B:81:0x020b, B:83:0x0245, B:84:0x0247, B:86:0x024f, B:87:0x0251, B:89:0x0259, B:90:0x025b, B:92:0x0285, B:93:0x0288, B:95:0x0298, B:96:0x029a, B:98:0x02c6, B:99:0x02d0, B:101:0x02de, B:102:0x02e1, B:104:0x02ef, B:105:0x02f2, B:107:0x02fa, B:108:0x02fd, B:110:0x030d, B:111:0x0310, B:113:0x031d, B:114:0x0320, B:116:0x032d, B:117:0x032f, B:119:0x033c, B:121:0x0342, B:123:0x0348, B:142:0x0400, B:144:0x0408, B:124:0x034b, B:126:0x0360, B:127:0x0362, B:129:0x0391, B:131:0x0397, B:133:0x03a9, B:135:0x03bc, B:136:0x03da, B:138:0x03de, B:139:0x03e1, B:140:0x03ea, B:141:0x03fc, B:145:0x040d, B:147:0x041b), top: B:153:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0298 A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0017, B:8:0x0036, B:10:0x0040, B:11:0x0059, B:13:0x0063, B:14:0x0066, B:16:0x006e, B:17:0x0071, B:19:0x007b, B:21:0x0089, B:23:0x0095, B:24:0x009a, B:28:0x00c8, B:25:0x00a6, B:27:0x00bc, B:31:0x00d1, B:33:0x00d9, B:34:0x00ee, B:36:0x00f4, B:38:0x0102, B:40:0x0111, B:41:0x0119, B:43:0x0121, B:45:0x0130, B:47:0x0139, B:49:0x0143, B:50:0x014e, B:52:0x015d, B:53:0x0165, B:55:0x016d, B:56:0x016f, B:58:0x0177, B:59:0x017a, B:61:0x0184, B:62:0x018e, B:64:0x0196, B:65:0x0198, B:72:0x01d9, B:74:0x01e9, B:75:0x01eb, B:77:0x01f9, B:78:0x01fb, B:80:0x0209, B:81:0x020b, B:83:0x0245, B:84:0x0247, B:86:0x024f, B:87:0x0251, B:89:0x0259, B:90:0x025b, B:92:0x0285, B:93:0x0288, B:95:0x0298, B:96:0x029a, B:98:0x02c6, B:99:0x02d0, B:101:0x02de, B:102:0x02e1, B:104:0x02ef, B:105:0x02f2, B:107:0x02fa, B:108:0x02fd, B:110:0x030d, B:111:0x0310, B:113:0x031d, B:114:0x0320, B:116:0x032d, B:117:0x032f, B:119:0x033c, B:121:0x0342, B:123:0x0348, B:142:0x0400, B:144:0x0408, B:124:0x034b, B:126:0x0360, B:127:0x0362, B:129:0x0391, B:131:0x0397, B:133:0x03a9, B:135:0x03bc, B:136:0x03da, B:138:0x03de, B:139:0x03e1, B:140:0x03ea, B:141:0x03fc, B:145:0x040d, B:147:0x041b), top: B:153:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c6 A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0017, B:8:0x0036, B:10:0x0040, B:11:0x0059, B:13:0x0063, B:14:0x0066, B:16:0x006e, B:17:0x0071, B:19:0x007b, B:21:0x0089, B:23:0x0095, B:24:0x009a, B:28:0x00c8, B:25:0x00a6, B:27:0x00bc, B:31:0x00d1, B:33:0x00d9, B:34:0x00ee, B:36:0x00f4, B:38:0x0102, B:40:0x0111, B:41:0x0119, B:43:0x0121, B:45:0x0130, B:47:0x0139, B:49:0x0143, B:50:0x014e, B:52:0x015d, B:53:0x0165, B:55:0x016d, B:56:0x016f, B:58:0x0177, B:59:0x017a, B:61:0x0184, B:62:0x018e, B:64:0x0196, B:65:0x0198, B:72:0x01d9, B:74:0x01e9, B:75:0x01eb, B:77:0x01f9, B:78:0x01fb, B:80:0x0209, B:81:0x020b, B:83:0x0245, B:84:0x0247, B:86:0x024f, B:87:0x0251, B:89:0x0259, B:90:0x025b, B:92:0x0285, B:93:0x0288, B:95:0x0298, B:96:0x029a, B:98:0x02c6, B:99:0x02d0, B:101:0x02de, B:102:0x02e1, B:104:0x02ef, B:105:0x02f2, B:107:0x02fa, B:108:0x02fd, B:110:0x030d, B:111:0x0310, B:113:0x031d, B:114:0x0320, B:116:0x032d, B:117:0x032f, B:119:0x033c, B:121:0x0342, B:123:0x0348, B:142:0x0400, B:144:0x0408, B:124:0x034b, B:126:0x0360, B:127:0x0362, B:129:0x0391, B:131:0x0397, B:133:0x03a9, B:135:0x03bc, B:136:0x03da, B:138:0x03de, B:139:0x03e1, B:140:0x03ea, B:141:0x03fc, B:145:0x040d, B:147:0x041b), top: B:153:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(android.app.Application r21) {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2210291Bf1.LIZ(android.app.Application):void");
    }

    /* JADX WARN: Type inference failed for: r0v58, types: [T, X.1BYq] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1BFI, X.1BFJ] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.1BYm, X.1BYt] */
    public static final void LIZIZ(final Application application) {
        boolean zLIZ;
        C2210441BfG c2210441BfG = C2210441BfG.LIZIZ;
        if (c2210441BfG.LIZLLL()) {
            zLIZ = c2210441BfG.LJ();
        } else {
            zLIZ = c2210441BfG.LIZ();
        }
        AppLog.setChildModeBeforeInit(zLIZ);
        C11PQ<EnumC818600W9i> c11pq = C2206831BYr.LIZ;
        final ?? r3 = new C1BFI(application) { // from class: X.1BFJ
            @Override // X.C1BFI
            public final void LIZIZ() {
            }

            @Override // X.C1BFI
            public final boolean LIZ() {
                return ((Boolean) C259820AGe.LIZ.getValue()).booleanValue();
            }
        };
        final ?? r4 = new InterfaceC2206851BYt() { // from class: X.1BYm
            @Override // X.InterfaceC2206851BYt
            public final void LIZ() {
                AppLog.setEventFilterByClient(DeviceRegisterManager.isChildMode() ? C2210441BfG.LIZIZ.LIZJ() : null, false);
                try {
                    AppLog.setUseGoogleAdId(true);
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("initApplog startLaunch:");
                    sbLIZ.append(System.currentTimeMillis() - C2206791BYn.LIZIZ.LIZIZ());
                    C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    C2344809Gs.LIZ(e);
                }
                C2206791BYn c2206791BYn = C2206791BYn.LIZIZ;
                c2206791BYn.LIZ();
                if (c2206791BYn.LIZJ()) {
                    AppLog.setStartLogReaperDelay(Mp4ScreenVideoLoadTimeout.CONTROL);
                }
            }
        };
        final boolean zIsNewUser = c2210441BfG.isNewUser();
        C313570CQx.LIZ.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C013C c013c = new C013C();
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(new InterfaceC2210981Bg8() { // from class: X.10Ue
            @Override // X.InterfaceC2210981Bg8
            public final void LIZ(boolean z) {
            }

            @Override // X.InterfaceC2210981Bg8
            public final void LIZIZ(String str, String str2) {
            }

            @Override // X.InterfaceC2210981Bg8
            public final void LIZJ(boolean z) {
                int i;
                C313570CQx c313570CQx = C313570CQx.LIZ;
                long j = jCurrentTimeMillis;
                boolean z2 = zIsNewUser;
                c313570CQx.getClass();
                String simpleName = null;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("time", System.currentTimeMillis() - j);
                    jSONObject.put("success", z);
                    WeakReference<Activity> weakReference = C2211501Bgy.LLILZIL;
                    if (weakReference != null) {
                        simpleName = weakReference.getClass().getSimpleName();
                    }
                    jSONObject.put("pageName", simpleName);
                    jSONObject.put("btm", C2211631BhB.LJII());
                    jSONObject.put("is_cold_start_first_launch", z2);
                    AppLogNewUtils.onEventV3("didCost", jSONObject);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sendDidCost isFirstInstallAndFirstLaunch:");
                    sbLIZ.append(z2);
                    C2188811AlT.LIZIZ(sbLIZ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zIsNewUser && !c013c.element) {
                    C313570CQx c313570CQx2 = C313570CQx.LIZ;
                    long j2 = jCurrentTimeMillis;
                    c313570CQx2.getClass();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("from_start_to_current_duration", System.currentTimeMillis() - j2);
                        if (z) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        jSONObject2.put("is_success", i);
                        jSONObject2.put("btm", C2211631BhB.LJII());
                        jSONObject2.put("is_cold_start_first_launch", 1);
                        jSONObject2.put("is_did_ready", !TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) ? 1 : 0);
                        jSONObject2.put("network_status", C2210691Bff.LIZIZ.getNetworkStatus().ordinal());
                        jSONObject2.put("is_hybrid_ab_recv", C2210441BfG.LIZIZ.LJFF());
                        jSONObject2.put("is_hybrid_ab_api_rev", C313570CQx.LIZIZ);
                        jSONObject2.put("is_in_nuj_process", C313570CQx.LIZJ);
                        C20684815ws.LJIJ("did_request_result", jSONObject2);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("sendDidRegisterRecv param:");
                        sbLIZ2.append(jSONObject2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                c013c.element = true;
                C313570CQx.LIZ.getClass();
            }
        });
        DeviceRegisterManager.setReleaseBuild(c2210441BfG.LIZIZ());
        AppLog.setAppContext(C0X2C.LIZ);
        AppLog.setConfigUpdateListener(C2206831BYr.LIZIZ);
        AppLog.setSensitiveApiCallback(new C0XE7() { // from class: X.0Vuk
            @Override // X.C0XE7
            public final String LIZ() {
                TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(C2213981Bky.LIZIZ.getApplicationContext(), "phone");
                AtomicBoolean atomicBoolean = C794320VDy.LIZ;
                return C1300840jxK.LJIIIIZZ(telephonyManager);
            }

            @Override // X.C0XE7
            public final String LIZIZ() {
                TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(C2213981Bky.LIZIZ.getApplicationContext(), "phone");
                AtomicBoolean atomicBoolean = C794320VDy.LIZ;
                return C1300840jxK.LJI(telephonyManager);
            }

            @Override // X.C0XE7
            public final Pair<String, Boolean> LIZJ() {
                String strLLLLLIL;
                try {
                    AdvertisingIdClient.Info infoLIZIZ = C837870Wtt.LIZIZ(C2213981Bky.LIZIZ.getApplicationContext());
                    if (infoLIZIZ == null || (strLLLLLIL = C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrijkfeD2B/wfFepR1j2pyKgKdKgpIzmvvrguAD/DkzQw4xBELtxIWGTVI58C8Ez3EDk=", null))) == null) {
                        strLLLLLIL = "";
                    }
                    return new Pair<>(strLLLLLIL, Boolean.valueOf(infoLIZIZ != null ? infoLIZIZ.LIZIZ : false));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJFF(th, "AppLogSensitiveApiCallback_getGaid_error");
                    return new Pair<>("", Boolean.FALSE);
                }
            }

            @Override // X.C0XE7
            public final String getCountry() {
                LruCache<Integer, String> lruCache = C0SRQ.LIZ;
                return C837920Wty.LIZIZ(Locale.getDefault());
            }

            @Override // X.C0XE7
            public final String getNetworkOperator() {
                TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(C2213981Bky.LIZIZ.getApplicationContext(), "phone");
                AtomicBoolean atomicBoolean = C794320VDy.LIZ;
                return C1300840jxK.LJ(telephonyManager);
            }
        });
        C0X2C.LIZIZ = true;
        AppLogNetworkClient appLogNetworkClient = new AppLogNetworkClient();
        if (appLogNetworkClient != AbstractC808800Vo6.LIZ) {
            AbstractC808800Vo6.LIZ = appLogNetworkClient;
        }
        C2206831BYr.LIZ.LJJLJLI(new C09JN() { // from class: X.00NN
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("ConfigManager@4b7a.mustConfigInMainThread$2");
                C1C7U.LIZIZ("ConfigManager@4b7a.mustConfigInMainThread$2");
            }
        });
        C827070WcT.LIZ.getClass();
        C827070WcT.LIZ();
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(C827070WcT.LJII);
        C1767060w5I.LIZ = ((Boolean) C14MU.LIZ.getValue()).booleanValue();
        C1767060w5I.LIZIZ = C1571240qzS.LIZ().fixIntent;
        C1767060w5I.LIZJ = C1571240qzS.LIZ().fixFragment;
        C1767060w5I.LIZLLL = C1571240qzS.LIZ().fixFragmentPreWhiteList;
        C1767060w5I.LJ = C1571240qzS.LIZ().fixFragmentTargetWhiteList;
        C1767060w5I.LJFF = C1571240qzS.LIZ().fixFragmentTargetWhiteList2;
        C1767060w5I.LJI = C1766910w53.LIZ();
        C1767060w5I.LJII = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(418));
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = C2211501Bgy.LL;
        C2211501Bgy.LLILLJJLI = ((Boolean) C07AF.LIZ.getValue()).booleanValue();
        C2210901Bg0 c2210901Bg0 = new C2210901Bg0();
        c2210901Bg0.LIZ = "a2270";
        c2210901Bg0.LIZIZ = C2162308dZ.LJI(application);
        c2210901Bg0.LIZJ = c2210441BfG.isNewUser() ? 1 : 0;
        C2210661Bfc c2210661Bfc = new C2210661Bfc(c2210901Bg0);
        C18ER c18er = new C18ER();
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(TrackerProcessLifecycleObserver.LL);
        if (C2211501Bgy.LLILLJJLI) {
            if (Build.VERSION.SDK_INT >= 29) {
                activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: X.1Bh0
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        C2211501Bgy.LL.onActivityDestroyed(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        C2211501Bgy.LL.onActivityPaused(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) throws Throwable {
                        C2211501Bgy.LL.onActivityResumed(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        C2211501Bgy.LL.onActivityStarted(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        C2211501Bgy.LL.onActivityStopped(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
                        C2211501Bgy.LL.onActivityCreated(activity, bundle);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
                        C482200Iva.LIZ(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        C2211501Bgy.LL.onActivitySaveInstanceState(activity, bundle);
                    }
                };
            } else {
                activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: X.1Bgz
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        C2211501Bgy.LL.onActivityDestroyed(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        C2211501Bgy.LL.onActivityPaused(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) throws Throwable {
                        C2211501Bgy.LL.onActivityResumed(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        C2211501Bgy.LL.onActivityStarted(activity);
                        C482200Iva.LIZ(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        C2211501Bgy.LL.onActivityStopped(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
                        C2211501Bgy.LL.onActivityCreated(activity, bundle);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        C2211501Bgy.LL.onActivitySaveInstanceState(activity, bundle);
                    }
                };
            }
        }
        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        C2211621BhA c2211621BhA = C2211621BhA.LIZ;
        String str = c2210661Bfc.LIZ;
        c2211621BhA.getClass();
        C2211621BhA.LIZIZ = str;
        C13E8<String> c13e8 = C1391850mK7.LIZ;
        C1391850mK7.LIZJ = String.valueOf(((long) application.hashCode()) + System.currentTimeMillis());
        C1391850mK7.LIZLLL = c2210661Bfc.LIZJ;
        C1391850mK7.LIZIZ = c18er;
        if (c2210661Bfc.LIZIZ) {
            final String string = ((Keva) C1391850mK7.LJ.getValue()).getString("btm_current_cache_page", "");
            if (string.length() != 0) {
                C823050WQl.LIZLLL().submit(new Runnable() { // from class: X.18Kc
                    public final void LIZ() {
                        Map map = (Map) C105700ad.LIZ(string, Map.class);
                        if (map != null) {
                            map.put(Scene.SCENE_SERVICE, EnumC21266118Kd.ABNORMAL.getValue());
                            Function2<? super String, ? super Map<String, String>, Unit> function2 = C1391850mK7.LIZIZ;
                            if (function2 != null) {
                                function2.invoke("btm_page_show", map);
                            }
                            ((Keva) C1391850mK7.LJ.getValue()).erase("btm_current_cache_page");
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ2;
                        C1C7U.LIZ("DataCenter@88ac.reportCachedPage$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ2) {
                            }
                        }
                        C1C7U.LIZIZ("DataCenter@88ac.reportCachedPage$1");
                    }
                });
            }
        }
        C057H.LIZ = new C1184104kB();
        C19IG.LIZ = new C19IF<Activity>() { // from class: X.19IE
            @Override // X.C19IF
            public final C10VW LIZ(Activity activity) {
                C06W3 next;
                Activity activity2 = activity;
                C10RT c10rt = new C10RT();
                c10rt.LIZ = String.valueOf(activity2.hashCode());
                c10rt.LIZLLL = EnumC2211681BhG.ACTIVITY;
                c10rt.LJI = new WeakReference<>(activity2);
                String simpleName = (String) ((Map) C0N6R.LIZ.getValue()).get(activity2.getClass().getSimpleName());
                if (simpleName == null && (simpleName = (String) C0N6R.LIZ().get(activity2.getClass().getSimpleName())) == null) {
                    if (activity2 instanceof C19DB) {
                        Iterator<C06W3> it2 = ((C19DB) activity2).provideBaseViewModel().vQ2().LIZ().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (next instanceof C1166004hG) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        if ((next instanceof C1166004hG) && next != null) {
                            throw null;
                        }
                        simpleName = activity2.getClass().getSimpleName();
                    } else {
                        simpleName = activity2.getClass().getSimpleName();
                    }
                }
                c10rt.LIZJ = simpleName;
                return new C10VW(c10rt);
            }
        };
        C2211231BgX.LIZ = new InterfaceC1740580vOa() { // from class: X.0vOZ
            @Override // X.InterfaceC1740580vOa
            public final String LIZ(Activity activity) {
                SparkContext sparkContext;
                String strLJIJI;
                C017Z.LIZ.getClass();
                if (!(activity instanceof SparkActivity) || (sparkContext = ((SparkActivity) activity).LL) == null || (strLJIJI = sparkContext.LJIJI()) == null) {
                    return null;
                }
                return C017Z.LIZ(strLJIJI);
            }
        };
        C2211241BgY.LIZ = new C10KC() { // from class: X.10Hy
            @Override // X.C10KC
            public final boolean LIZ(Activity activity) {
                if (activity instanceof InterfaceC836170Wr9) {
                    return true;
                }
                if (Intrinsics.LJFF(activity.getClass().getSimpleName(), "MainActivity") && activity.getIntent().getBooleanExtra("pre_mainactivity_first_enter", false)) {
                    return true;
                }
                return false;
            }
        };
        C2211631BhB.LIZLLL = new InterfaceC1489070oqv() { // from class: X.0w52
            @Override // X.InterfaceC1489070oqv
            public final <T extends String> Map<String, T> LIZJ(Map<String, T> map) {
                C1766930w55.LIZ.getClass();
                if (C1766910w53.LIZ().f11switch && map != null && !map.isEmpty() && !C1766910w53.LIZ().paramsAllowList.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(map);
                    for (Map.Entry<String, T> entry : map.entrySet()) {
                        String key = entry.getKey();
                        entry.getValue();
                        if (!C1766910w53.LIZ().paramsAllowList.contains(key)) {
                            linkedHashMap.remove(key);
                        }
                    }
                    return linkedHashMap;
                }
                return map;
            }

            @Override // X.InterfaceC1489070oqv
            public final <T extends String> void LIZ(String str2, View view, Map<String, T> map) throws JSONException {
                String simpleName;
                if (map == null || !C1766910w53.LIZ().f11switch) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("keys", C20485080t.LIZIZ(map.keySet()));
                Activity activityLIZ = C20663087p.LIZ(view.getContext());
                if (activityLIZ != null) {
                    simpleName = activityLIZ.getClass().getSimpleName();
                } else {
                    simpleName = null;
                }
                jSONObject.putOpt("page_name", simpleName);
                jSONObject.putOpt("type", str2);
                C20684815ws.LJIJ("tt_btm_add_params", jSONObject);
            }

            @Override // X.InterfaceC1489070oqv
            public final void LIZIZ(View view, Map<String, ? extends String> map, boolean z) {
                C1766930w55.LIZ.getClass();
                if (C1766910w53.LIZ().f11switch && map != null && !map.isEmpty()) {
                    PageFinder pageFinderVia = PageFinder.via(view);
                    BtmSDK btmSDK = BtmSDK.INSTANCE;
                    if (btmSDK.getBtmPageInfoV2(pageFinderVia) == null) {
                        pageFinderVia = PageFinder.via(btmSDK.getCurrentResumedPage());
                    }
                    if (z) {
                        BcmParams.Companion.getClass();
                        btmSDK.setBcmPageParams(pageFinderVia, C212367188v.LIZJ(map), Boolean.FALSE);
                    } else {
                        BcmParams.Companion.getClass();
                        C18BV.LIZ.appendUnitParams(pageFinderVia, "ecom_entrance", C212367188v.LIZJ(map));
                    }
                }
            }
        };
        C20089613j4 c20089613j4 = C20089413j2.LIZ;
        c20089613j4.getClass();
        if (C258120A9q.LIZ() && !c20089613j4.LIZ) {
            c20089613j4.LIZ = true;
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.13iw
                public boolean LL;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    int iHashCode = activity.hashCode();
                    ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, WeakReference<ComposeView>>> concurrentHashMap = C20089413j2.LIZIZ;
                    int i = 0;
                    if (concurrentHashMap.containsKey(Integer.valueOf(iHashCode))) {
                        ConcurrentHashMap<Integer, WeakReference<ComposeView>> concurrentHashMap2 = concurrentHashMap.get(Integer.valueOf(iHashCode));
                        if (concurrentHashMap2 != null) {
                            Iterator<Integer> it2 = concurrentHashMap2.keySet().iterator();
                            while (it2.hasNext()) {
                                i++;
                                C20089413j2.LIZJ.remove(Integer.valueOf(it2.next().intValue()));
                            }
                        }
                        C20089413j2.LIZIZ.remove(Integer.valueOf(iHashCode));
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("clearComposeViewByActivity activity: ");
                    sbLIZ.append(activity);
                    sbLIZ.append(" count: ");
                    sbLIZ.append(i);
                    C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                    ConcurrentHashMap<Integer, WeakReference<ComposeView>> concurrentHashMap = C20089413j2.LIZIZ.get(Integer.valueOf(activity.hashCode()));
                    int i = 0;
                    if (concurrentHashMap != null) {
                        Iterator<Integer> it2 = concurrentHashMap.keySet().iterator();
                        while (it2.hasNext()) {
                            List<WeakReference<C20088513it>> list = C20089413j2.LIZJ.get(Integer.valueOf(it2.next().intValue()));
                            if (list != null) {
                                Iterator<WeakReference<C20088513it>> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    i++;
                                    C20088513it c20088513it = it3.next().get();
                                    if (c20088513it != null && C258120A9q.LIZ()) {
                                        c20088513it.LLJJIII.LIZ("pauseComposeViewByActivity");
                                    }
                                }
                            }
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("pauseComposeViewByActivity activity: ");
                    sbLIZ.append(activity);
                    sbLIZ.append(" count:");
                    sbLIZ.append(i);
                    C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    View decorView;
                    if (this.LL) {
                        this.LL = false;
                        return;
                    }
                    Window window = activity.getWindow();
                    if (window != null && (decorView = window.getDecorView()) != null) {
                        HandlerHook.viewPostDelay(decorView, new ARunnableS130S0100000_30(activity, 24), 1000L);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    this.LL = true;
                }
            });
        }
        if (((Boolean) C0CE6.LIZ.getValue()).booleanValue() && ((Boolean) C0B4X.LIZ.getValue()).booleanValue() && !zLIZ) {
            C2206831BYr.LIZ(r3, r4);
            new LazyLoadLegoTask(application, null).run(application);
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(new SetAppTrackTask());
            c799890VZj.LIZIZ();
            return;
        }
        final C259800zU c259800zU = new C259800zU();
        ?? r0 = new Runnable() { // from class: X.1BYq
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ2;
                C1C7U.LIZ("ConfigManager@4b7a.config$runnable$1");
                try {
                    C11PQ<EnumC818600W9i> c11pq2 = C2206831BYr.LIZ;
                    C2206831BYr.LIZ(r3, r4);
                } finally {
                    if (!zLIZ2) {
                    }
                }
                C1C7U.LIZIZ("ConfigManager@4b7a.config$runnable$1");
            }
        };
        c259800zU.element = r0;
        r0.run();
        c259800zU.element = null;
        Runnable runnable = new Runnable() { // from class: X.1BFH
            public final void LIZ() {
                Application application2 = r3.LIZ;
                Runnable runnable2 = c259800zU.element;
                C799900VZk.LIZ.getClass();
                C0CPH c0cph = new C0CPH();
                c0cph.LIZ(new LazyLoadLegoTask(application2, runnable2));
                c0cph.LIZ(new SetAppTrackTask());
                c0cph.LIZIZ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ2;
                C1C7U.LIZ("ConfigManager@4b7a.config$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ2) {
                    }
                }
                C1C7U.LIZIZ("ConfigManager@4b7a.config$1");
            }
        };
        C11PQ<EnumC818600W9i> c11pq2 = C2206831BYr.LIZ;
        runnable.run();
        C11PQ<EnumC818600W9i> c11pq3 = C2206831BYr.LIZ;
    }
}
