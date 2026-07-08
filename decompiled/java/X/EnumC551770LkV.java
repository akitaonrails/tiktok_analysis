package X;

import com.ss.android.ugc.aweme.aigc.graph.nodes.node.BuiltinNodeErrorCustomContext;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC551770LkV {
    public static final C551930Lkl Companion;
    public static final EnumC551770LkV DOWNLOAD_EMPTY_RESULT_PATH;
    public static final EnumC551770LkV DOWNLOAD_INVALID_RESPONSE;
    public static final /* synthetic */ EnumC551770LkV[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC551770LkV NETWORK_EMPTY_RESPONSE;
    public static final EnumC551770LkV NETWORK_INVALID_REQUEST_PAYLOAD;
    public static final EnumC551770LkV NETWORK_INVALID_RESPONSE;
    public static final EnumC551770LkV NETWORK_SERVER_STATUS_CODE;
    public static final EnumC551770LkV POLLING_EMPTY_RESPONSE;
    public static final EnumC551770LkV POLLING_NO_INPUT;
    public static final EnumC551770LkV POLLING_NO_SERVER_TASK_ID;
    public static final EnumC551770LkV POLLING_TASK_FAILED;
    public static final EnumC551770LkV POLLING_TIMEOUT;
    public static final EnumC551770LkV QUOTA_EMPTY_RESPONSE;
    public static final EnumC551770LkV QUOTA_LIMIT_EXCEEDED;
    public static final EnumC551770LkV QUOTA_MISSING_REQUIRED_PARAMS;
    public static final EnumC551770LkV SERVER_EMPTY_IMAGE_URLS;
    public static final EnumC551770LkV SERVER_INVALID_RESPONSE;
    public static final EnumC551770LkV SERVER_INVALID_WORKFLOW_CONFIG;
    public static final EnumC551770LkV SERVER_NO_TASK_ID;
    public static final EnumC551770LkV SERVER_UNAUTHORIZED;
    public static final EnumC551770LkV UPLOAD_EMPTY_INPUT_FILE_PATHS;
    public static final EnumC551770LkV UPLOAD_IMAGE_FAILURE;
    public static final EnumC551770LkV UPLOAD_INVALID_HOST;
    public static final EnumC551770LkV UPLOAD_INVALID_PARAMS;
    public static final EnumC551770LkV UPLOAD_IO_FAILURE;
    public static final EnumC551770LkV UPLOAD_NO_NETWORK;
    public static final EnumC551770LkV UPLOAD_UNKNOWN_FAILURE;
    public static final Map<Integer, EnumC551770LkV> byUnifiedCode;
    public final int LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;

    public static InterfaceC2044707zh<EnumC551770LkV> getEntries() {
        return LLILZLL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Lkl] */
    static {
        EnumC551770LkV enumC551770LkV = new EnumC551770LkV(0, 100001, 100001, "NETWORK_INVALID_REQUEST_PAYLOAD", "invalidRequestPayload", "invalidRequestPayload");
        NETWORK_INVALID_REQUEST_PAYLOAD = enumC551770LkV;
        EnumC551770LkV enumC551770LkV2 = new EnumC551770LkV(1, 100002, 100002, "NETWORK_INVALID_RESPONSE", "invalidResponse", "invalidResponse");
        NETWORK_INVALID_RESPONSE = enumC551770LkV2;
        EnumC551770LkV enumC551770LkV3 = new EnumC551770LkV(2, 100003, 100003, "NETWORK_EMPTY_RESPONSE", "emptyResponse", "emptyResponse");
        NETWORK_EMPTY_RESPONSE = enumC551770LkV3;
        EnumC551770LkV enumC551770LkV4 = new EnumC551770LkV(3, 100004, 100004, "NETWORK_SERVER_STATUS_CODE", "serverStatusCode", "serverStatusCode");
        NETWORK_SERVER_STATUS_CODE = enumC551770LkV4;
        EnumC551770LkV enumC551770LkV5 = new EnumC551770LkV(4, 101001, 101001, "QUOTA_MISSING_REQUIRED_PARAMS", "missingRequiredParameters", "missingRequiredParameters");
        QUOTA_MISSING_REQUIRED_PARAMS = enumC551770LkV5;
        EnumC551770LkV enumC551770LkV6 = new EnumC551770LkV(5, 101003, 7011, "QUOTA_LIMIT_EXCEEDED", "quotaLimitExceeded", "Quota exhausted");
        QUOTA_LIMIT_EXCEEDED = enumC551770LkV6;
        EnumC551770LkV enumC551770LkV7 = new EnumC551770LkV(6, 101004, 6001, "QUOTA_EMPTY_RESPONSE", "emptyResponse", "Quota result is null");
        QUOTA_EMPTY_RESPONSE = enumC551770LkV7;
        EnumC551770LkV enumC551770LkV8 = new EnumC551770LkV(7, 102001, 102001, "UPLOAD_EMPTY_INPUT_FILE_PATHS", "emptyInputFilePaths", "emptyInputFilePaths");
        UPLOAD_EMPTY_INPUT_FILE_PATHS = enumC551770LkV8;
        EnumC551770LkV enumC551770LkV9 = new EnumC551770LkV(8, 102002, 7007, "UPLOAD_INVALID_HOST", "invalidUploadHost", "upload config null");
        UPLOAD_INVALID_HOST = enumC551770LkV9;
        EnumC551770LkV enumC551770LkV10 = new EnumC551770LkV(9, 102003, 102003, "UPLOAD_NO_NETWORK", "noNetwork", "noNetwork");
        UPLOAD_NO_NETWORK = enumC551770LkV10;
        EnumC551770LkV enumC551770LkV11 = new EnumC551770LkV(10, 102004, 102004, "UPLOAD_INVALID_PARAMS", "invalidUploadParams", "invalidUploadParams");
        UPLOAD_INVALID_PARAMS = enumC551770LkV11;
        EnumC551770LkV enumC551770LkV12 = new EnumC551770LkV(11, 102005, 7008, "UPLOAD_IMAGE_FAILURE", "uploadImageFailure", "imageXId null");
        UPLOAD_IMAGE_FAILURE = enumC551770LkV12;
        EnumC551770LkV enumC551770LkV13 = new EnumC551770LkV(12, 102007, 7008, "UPLOAD_IO_FAILURE", "uploadIOFailure", "catch IO error");
        UPLOAD_IO_FAILURE = enumC551770LkV13;
        EnumC551770LkV enumC551770LkV14 = new EnumC551770LkV(13, 102008, 7008, "UPLOAD_UNKNOWN_FAILURE", "uploadUnknownFailure", "catch cast error");
        UPLOAD_UNKNOWN_FAILURE = enumC551770LkV14;
        EnumC551770LkV enumC551770LkV15 = new EnumC551770LkV(14, 103001, -47373, "POLLING_NO_SERVER_TASK_ID", "noServerTaskID", "Empty serverTaskId");
        POLLING_NO_SERVER_TASK_ID = enumC551770LkV15;
        EnumC551770LkV enumC551770LkV16 = new EnumC551770LkV(15, 103002, 103002, "POLLING_NO_INPUT", "noInput", "noInput");
        POLLING_NO_INPUT = enumC551770LkV16;
        EnumC551770LkV enumC551770LkV17 = new EnumC551770LkV(16, 103003, -47369, "POLLING_TIMEOUT", "pollingTimeout", "Polling timeout");
        POLLING_TIMEOUT = enumC551770LkV17;
        EnumC551770LkV enumC551770LkV18 = new EnumC551770LkV(17, 103004, 0, "POLLING_TASK_FAILED", "taskFailed", "Server error during polling");
        POLLING_TASK_FAILED = enumC551770LkV18;
        EnumC551770LkV enumC551770LkV19 = new EnumC551770LkV(18, 103005, -47370, "POLLING_EMPTY_RESPONSE", "emptyResponse", "No valid result URLs");
        POLLING_EMPTY_RESPONSE = enumC551770LkV19;
        EnumC551770LkV enumC551770LkV20 = new EnumC551770LkV(19, 104001, 104001, "SERVER_UNAUTHORIZED", "unauthorized", "Generate API HTTP 401");
        SERVER_UNAUTHORIZED = enumC551770LkV20;
        EnumC551770LkV enumC551770LkV21 = new EnumC551770LkV(20, 104003, -47365, "SERVER_INVALID_RESPONSE", "invalidResponse", "Create AIGC task response is null");
        SERVER_INVALID_RESPONSE = enumC551770LkV21;
        EnumC551770LkV enumC551770LkV22 = new EnumC551770LkV(21, 104004, -47365, "SERVER_NO_TASK_ID", "noServerTaskID", "Server task ID is null or empty");
        SERVER_NO_TASK_ID = enumC551770LkV22;
        EnumC551770LkV enumC551770LkV23 = new EnumC551770LkV(22, 104005, 104005, "SERVER_INVALID_WORKFLOW_CONFIG", "invalidWorkflowConfig", "businessScene or taskType missing");
        SERVER_INVALID_WORKFLOW_CONFIG = enumC551770LkV23;
        EnumC551770LkV enumC551770LkV24 = new EnumC551770LkV(23, 104006, 104006, "SERVER_EMPTY_IMAGE_URLS", "emptyImageURLs", "Legacy server input has no image URLs");
        SERVER_EMPTY_IMAGE_URLS = enumC551770LkV24;
        EnumC551770LkV enumC551770LkV25 = new EnumC551770LkV(24, 105001, 7101, "DOWNLOAD_EMPTY_RESULT_PATH", "emptyResultPath", "downloadDir is blank");
        DOWNLOAD_EMPTY_RESULT_PATH = enumC551770LkV25;
        EnumC551770LkV enumC551770LkV26 = new EnumC551770LkV(25, 105002, 7102, "DOWNLOAD_INVALID_RESPONSE", "invalidResponse", "download fail");
        DOWNLOAD_INVALID_RESPONSE = enumC551770LkV26;
        EnumC551770LkV[] enumC551770LkVArr = {enumC551770LkV, enumC551770LkV2, enumC551770LkV3, enumC551770LkV4, enumC551770LkV5, enumC551770LkV6, enumC551770LkV7, enumC551770LkV8, enumC551770LkV9, enumC551770LkV10, enumC551770LkV11, enumC551770LkV12, enumC551770LkV13, enumC551770LkV14, enumC551770LkV15, enumC551770LkV16, enumC551770LkV17, enumC551770LkV18, enumC551770LkV19, enumC551770LkV20, enumC551770LkV21, enumC551770LkV22, enumC551770LkV23, enumC551770LkV24, enumC551770LkV25, enumC551770LkV26};
        LLILZIL = enumC551770LkVArr;
        LLILZLL = new C2254308sP(enumC551770LkVArr);
        Companion = new Object() { // from class: X.0Lkl
        };
        EnumC551770LkV[] enumC551770LkVArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC551770LkVArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ >= 16 ? iLIZIZ : 16);
        for (EnumC551770LkV enumC551770LkV27 : enumC551770LkVArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC551770LkV27.LL), enumC551770LkV27);
        }
        byUnifiedCode = linkedHashMap;
    }

    public static EnumC551770LkV[] values() {
        return (EnumC551770LkV[]) LLILZIL.clone();
    }

    public final String getErrorMessage() {
        return this.LLILLJJLI;
    }

    public final int getLegacyCode() {
        return this.LLILLL;
    }

    public final String getLegacyMessage() {
        return this.LLILZ;
    }

    public final int getUnifiedCode() {
        return this.LL;
    }

    public static EnumC551770LkV valueOf(String str) {
        return (EnumC551770LkV) C08FF.LIZ(EnumC551770LkV.class, str);
    }

    public final C555610Lqh toException(Throwable th, Integer num, String str, Integer num2, Map<String, ? extends InterfaceC1406105et> map) {
        int iIntValue;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = this.LLILLL;
        }
        int i = this.LL;
        return new C555610Lqh(i, C1939107if.LIZ(this.LLILLJJLI, i, iIntValue, this.LLILZ, num, str, th), ((AIGCWorkflowArtifactFactory) ServiceManager.get().getService(AIGCWorkflowArtifactFactory.class, false, false)).LIZ(new BuiltinNodeErrorCustomContext(iIntValue, this.LLILZ, num, str)), th, map);
    }

    public EnumC551770LkV(int i, int i2, int i3, String str, String str2, String str3) {
        this.LL = i2;
        this.LLILLJJLI = str2;
        this.LLILLL = i3;
        this.LLILZ = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C555610Lqh toException$default(EnumC551770LkV enumC551770LkV, Throwable th, Integer num, String str, Integer num2, Map map, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                th = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                num2 = null;
            }
            if ((i & 16) != 0) {
                map = C2097608Jq.LJ();
            }
            return enumC551770LkV.toException(th, num, str, num2, map);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toException");
    }
}
