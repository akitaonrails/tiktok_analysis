package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10aV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19272110aV {
    public final List<InterfaceC19271510aP> LIZ;
    public final List<InterfaceC19271510aP> LIZIZ;
    public final List<InterfaceC1791040why> LIZJ;

    public C19272110aV(final String str) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LIZIZ = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.LIZJ = arrayList3;
        arrayList.add(new InterfaceC19271510aP() { // from class: X.10Z3
            @Override // X.InterfaceC19271510aP
            public final String LIZ() {
                return "smartrouter";
            }

            @Override // X.InterfaceC19271510aP
            public final String getName() {
                return "game_live_smart_router";
            }

            @Override // X.InterfaceC19271510aP
            public final boolean LIZIZ(int i, String str2) {
                if (SmartRouter.canOpen(str2)) {
                    SmartRouter.buildRoute(C497740JfY.LJII(), str2).open();
                    return true;
                }
                if (str2 == null || TextUtils.isEmpty(str2) || (!u.LJJIIJZLJL(str2, "snssdk1180", false) && !u.LJJIIJZLJL(str2, "snssdk1233", false) && !u.LJJIIJZLJL(str2, "snssdk473824", false) && !u.LJJIIJZLJL(str2, "snssdk259", false))) {
                    return false;
                }
                ((IMainService) ServiceManager.get().getService(IMainService.class)).openDeepLinkActivity(C497740JfY.LJII(), str2, "QrCode");
                return true;
            }
        });
        arrayList2.add(new InterfaceC19271510aP() { // from class: X.0J29
            public final List<String> LIZ = C1697810uHb.LJIIJJI("dual_device", "tt_as_camera");
            public final String LIZIZ = "game_live_commom";

            @Override // X.InterfaceC19271510aP
            public final String getName() {
                return "game_scan_result_interceptor";
            }

            @Override // X.InterfaceC19271510aP
            public final String LIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC19271510aP
            public final boolean LIZIZ(int i, String str2) {
                String str3;
                String str4;
                String host = UriProtector.parse(str2).getHost();
                if (Intrinsics.LJFF(host, "dual_device")) {
                    str3 = host;
                } else if (Intrinsics.LJFF(host, "tt_as_camera")) {
                    str3 = "ls_camera_connect";
                } else {
                    str3 = null;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_phone_camera_qr_scan_status");
                c474500IjALIZ.LJJII(str3, "scan_type");
                c474500IjALIZ.LJJII(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId(), "device_id");
                if (host != null && this.LIZ.contains(host)) {
                    str4 = "success";
                } else {
                    str4 = "fail";
                }
                c474500IjALIZ.LJJII(str4, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                c474500IjALIZ.LIZ();
                if (host != null && this.LIZ.contains(host)) {
                    return false;
                }
                return true;
            }
        });
        arrayList3.add(new InterfaceC1791040why(str) { // from class: X.0whw
            public final String LIZ;

            {
                this.LIZ = str;
            }

            @Override // X.InterfaceC1791040why
            public final String LIZ(String str2) {
                if (AnonymousClass0652.LIZ(str2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append("&enter_from=");
                    sbLIZ.append(this.LIZ);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return str2;
            }
        });
    }
}
