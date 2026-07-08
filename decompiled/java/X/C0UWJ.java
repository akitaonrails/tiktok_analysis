package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UWJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UWJ {
    public static final C0UWJ DISCONNECT_TYPE_AUTO_CLICK_CON_LIVE;
    public static final C0UWJ DISCONNECT_TYPE_ON_PREPARATION_SELECT_DEFINITION;
    public static final C0UWJ DISCONNECT_TYPE_ON_PREPARATION_START_SPEED_TEST;
    public static final C0UWJ DISCONNECT_TYPE_ON_SPEED_TEST_TIME_DELAY;
    public static final C0UWJ DISCONNECT_TYPE_ON_START_PUSH_STREAM;
    public static final C0UWJ DisconnectTypeAutoDetectionClickStartLive;
    public static final C0UWJ DisconnectTypeAutoDetectionExitPreviewPage;
    public static final C0UWJ DisconnectTypeAutoDetectionOpenDefinitionDialog;
    public static final C0UWJ DisconnectTypeAutoDetectionPermissionRecycled;
    public static final C0UWJ DisconnectTypeBroadcastBlocked;
    public static final C0UWJ DisconnectTypeDetectionWithIllegalParameters;
    public static final C0UWJ DisconnectTypeManuallyDetectionClickCancel;
    public static final C0UWJ DisconnectTypeManuallyDetectionCloseDialog;
    public static final C0UWJ DisconnectTypeNormalExit;
    public static final C0UWJ DisconnectTypeServerError;
    public static final C0UWJ DisconnectTypeWaitReportTimeOut;
    public static final /* synthetic */ C0UWJ[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C0UWJ> getEntries() {
        return LLILZ;
    }

    static {
        C0UWJ c0uwj = new C0UWJ("DisconnectTypeNormalExit", 0, LSPassThroughRecordSizeConfig.DEFAULT, "normal disconnect");
        DisconnectTypeNormalExit = c0uwj;
        C0UWJ c0uwj2 = new C0UWJ("DisconnectTypeServerError", 1, 1001, "server error");
        DisconnectTypeServerError = c0uwj2;
        C0UWJ c0uwj3 = new C0UWJ("DisconnectTypeAutoDetectionClickStartLive", 2, LivePreCreateNextRoomPlayer.ENABLE, "interrupt auto speed detection because click start live");
        DisconnectTypeAutoDetectionClickStartLive = c0uwj3;
        C0UWJ c0uwj4 = new C0UWJ("DisconnectTypeAutoDetectionOpenDefinitionDialog", 3, 3001, "interrupt auto speed detection because open definition dialog");
        DisconnectTypeAutoDetectionOpenDefinitionDialog = c0uwj4;
        C0UWJ c0uwj5 = new C0UWJ("DisconnectTypeAutoDetectionExitPreviewPage", 4, 3002, "interrupt auto speed detection because exit preview page");
        DisconnectTypeAutoDetectionExitPreviewPage = c0uwj5;
        C0UWJ c0uwj6 = new C0UWJ("DisconnectTypeAutoDetectionPermissionRecycled", 5, 3003, "interrupt auto speed detection because permission was recycled");
        DisconnectTypeAutoDetectionPermissionRecycled = c0uwj6;
        C0UWJ c0uwj7 = new C0UWJ("DISCONNECT_TYPE_AUTO_CLICK_CON_LIVE", 6, 3004, "interrupt auto speed detection because click continue live");
        DISCONNECT_TYPE_AUTO_CLICK_CON_LIVE = c0uwj7;
        C0UWJ c0uwj8 = new C0UWJ("DisconnectTypeManuallyDetectionClickCancel", 7, 3500, "interrupt manually speed detection because click cancel");
        DisconnectTypeManuallyDetectionClickCancel = c0uwj8;
        C0UWJ c0uwj9 = new C0UWJ("DisconnectTypeManuallyDetectionCloseDialog", 8, 3501, "interrupt manually speed detection because close speed detection dialog");
        DisconnectTypeManuallyDetectionCloseDialog = c0uwj9;
        C0UWJ c0uwj10 = new C0UWJ("DisconnectTypeDetectionWithIllegalParameters", 9, 3502, "Speed test with illegal parameters");
        DisconnectTypeDetectionWithIllegalParameters = c0uwj10;
        C0UWJ c0uwj11 = new C0UWJ("DisconnectTypeWaitReportTimeOut", 10, 4000, "wait report timeout");
        DisconnectTypeWaitReportTimeOut = c0uwj11;
        C0UWJ c0uwj12 = new C0UWJ("DisconnectTypeBroadcastBlocked", 11, 4001, "broadcast blocked");
        DisconnectTypeBroadcastBlocked = c0uwj12;
        C0UWJ c0uwj13 = new C0UWJ("DISCONNECT_TYPE_ON_START_PUSH_STREAM", 12, 4002, "stop auto speed detection when start push stream.");
        DISCONNECT_TYPE_ON_START_PUSH_STREAM = c0uwj13;
        C0UWJ c0uwj14 = new C0UWJ("DISCONNECT_TYPE_ON_PREPARATION_START_SPEED_TEST", 13, 4003, "stop auto speed detection when start manual speed test in preparation page");
        DISCONNECT_TYPE_ON_PREPARATION_START_SPEED_TEST = c0uwj14;
        C0UWJ c0uwj15 = new C0UWJ("DISCONNECT_TYPE_ON_PREPARATION_SELECT_DEFINITION", 14, 4004, "stop auto speed detection when select definition in preparation page");
        DISCONNECT_TYPE_ON_PREPARATION_SELECT_DEFINITION = c0uwj15;
        C0UWJ c0uwj16 = new C0UWJ("DISCONNECT_TYPE_ON_SPEED_TEST_TIME_DELAY", 15, 4005, "stop auto speed detection because reaching speed test delay time ");
        DISCONNECT_TYPE_ON_SPEED_TEST_TIME_DELAY = c0uwj16;
        C0UWJ[] c0uwjArr = {c0uwj, c0uwj2, c0uwj3, c0uwj4, c0uwj5, c0uwj6, c0uwj7, c0uwj8, c0uwj9, c0uwj10, c0uwj11, c0uwj12, c0uwj13, c0uwj14, c0uwj15, c0uwj16};
        LLILLL = c0uwjArr;
        LLILZ = new C2254308sP(c0uwjArr);
    }

    public static C0UWJ[] values() {
        return (C0UWJ[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMessage() {
        return this.LLILLJJLI;
    }

    public static C0UWJ valueOf(String str) {
        return (C0UWJ) C08FF.LIZ(C0UWJ.class, str);
    }

    public C0UWJ(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
