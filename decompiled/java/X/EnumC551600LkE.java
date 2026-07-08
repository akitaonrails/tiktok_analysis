package X;

import com.ss.android.ugc.aweme.aigc.graph.nodes.node.BuiltinNodeErrorCustomContext;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LkE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC551600LkE {
    public static final C551730LkR Companion;
    public static final /* synthetic */ EnumC551600LkE[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC551600LkE POSTPROC_BLANK_OUTPUT_DIR;
    public static final EnumC551600LkE POSTPROC_BLANK_TEMPLATE_RESOURCE_ID;
    public static final EnumC551600LkE POSTPROC_BLANK_TEMPLATE_TYPE;
    public static final EnumC551600LkE POSTPROC_FRAME_EXTRACTION_FAILED;
    public static final EnumC551600LkE POSTPROC_INVALID_PARAMS;
    public static final EnumC551600LkE POSTPROC_NLE_COMPILE_ERROR;
    public static final EnumC551600LkE POSTPROC_NULL_CONFIG;
    public static final EnumC551600LkE POSTPROC_NULL_TEMPLATE_MODEL;
    public static final EnumC551600LkE POSTPROC_NULL_TEMPLATE_SERVICE;
    public static final EnumC551600LkE POSTPROC_TEMPLATE_DOWNLOAD_FAILED;
    public static final EnumC551600LkE POSTPROC_UNKNOWN;
    public static final EnumC551600LkE POSTPROC_UNSUPPORTED_TEMPLATE_TYPE;
    public static final EnumC551600LkE POSTPROC_VIDEO_INFO_NULL;
    public static final Map<Integer, EnumC551600LkE> byUnifiedCode;
    public final int LL;
    public final String LLILLJJLI;
    public final int LLILLL = 0;
    public final String LLILZ;

    public static InterfaceC2044707zh<EnumC551600LkE> getEntries() {
        return LLILZLL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0LkR] */
    static {
        EnumC551600LkE enumC551600LkE = new EnumC551600LkE(0, 200001, "POSTPROC_NULL_CONFIG", "config is null", "config is null");
        POSTPROC_NULL_CONFIG = enumC551600LkE;
        EnumC551600LkE enumC551600LkE2 = new EnumC551600LkE(1, 200002, "POSTPROC_BLANK_OUTPUT_DIR", "outputDir is blank", "outputDir is blank");
        POSTPROC_BLANK_OUTPUT_DIR = enumC551600LkE2;
        EnumC551600LkE enumC551600LkE3 = new EnumC551600LkE(2, 200003, "POSTPROC_BLANK_TEMPLATE_TYPE", "templateType is blank", "templateType is blank");
        POSTPROC_BLANK_TEMPLATE_TYPE = enumC551600LkE3;
        EnumC551600LkE enumC551600LkE4 = new EnumC551600LkE(3, 200004, "POSTPROC_BLANK_TEMPLATE_RESOURCE_ID", "templateResourceId is blank", "templateResourceId is blank");
        POSTPROC_BLANK_TEMPLATE_RESOURCE_ID = enumC551600LkE4;
        EnumC551600LkE enumC551600LkE5 = new EnumC551600LkE(4, 200005, "POSTPROC_INVALID_PARAMS", "invalid post-processing params", "invalid post-processing params");
        POSTPROC_INVALID_PARAMS = enumC551600LkE5;
        EnumC551600LkE enumC551600LkE6 = new EnumC551600LkE(5, 200006, "POSTPROC_NULL_TEMPLATE_SERVICE", "ITemplateResourceService is null", "template service is null");
        POSTPROC_NULL_TEMPLATE_SERVICE = enumC551600LkE6;
        EnumC551600LkE enumC551600LkE7 = new EnumC551600LkE(6, 200007, "POSTPROC_NULL_TEMPLATE_MODEL", "template model is null", "template model is null");
        POSTPROC_NULL_TEMPLATE_MODEL = enumC551600LkE7;
        EnumC551600LkE enumC551600LkE8 = new EnumC551600LkE(7, 200008, "POSTPROC_TEMPLATE_DOWNLOAD_FAILED", "template download failed", "template download failed");
        POSTPROC_TEMPLATE_DOWNLOAD_FAILED = enumC551600LkE8;
        EnumC551600LkE enumC551600LkE9 = new EnumC551600LkE(8, 200009, "POSTPROC_VIDEO_INFO_NULL", "VEUtils.getVideoFileInfo returned null", "failed to get file info");
        POSTPROC_VIDEO_INFO_NULL = enumC551600LkE9;
        EnumC551600LkE enumC551600LkE10 = new EnumC551600LkE(9, 200010, "POSTPROC_UNSUPPORTED_TEMPLATE_TYPE", "unsupported templateType", "unsupported templateType");
        POSTPROC_UNSUPPORTED_TEMPLATE_TYPE = enumC551600LkE10;
        EnumC551600LkE enumC551600LkE11 = new EnumC551600LkE(10, 200011, "POSTPROC_FRAME_EXTRACTION_FAILED", "frame extraction failed", "null frame / get frame error");
        POSTPROC_FRAME_EXTRACTION_FAILED = enumC551600LkE11;
        EnumC551600LkE enumC551600LkE12 = new EnumC551600LkE(11, 200012, "POSTPROC_NLE_COMPILE_ERROR", "NLE compile error", "compile failed");
        POSTPROC_NLE_COMPILE_ERROR = enumC551600LkE12;
        EnumC551600LkE enumC551600LkE13 = new EnumC551600LkE(12, 200013, "POSTPROC_UNKNOWN", "post-processing failed (unknown)", "I2V post-processing failed");
        POSTPROC_UNKNOWN = enumC551600LkE13;
        EnumC551600LkE[] enumC551600LkEArr = {enumC551600LkE, enumC551600LkE2, enumC551600LkE3, enumC551600LkE4, enumC551600LkE5, enumC551600LkE6, enumC551600LkE7, enumC551600LkE8, enumC551600LkE9, enumC551600LkE10, enumC551600LkE11, enumC551600LkE12, enumC551600LkE13};
        LLILZIL = enumC551600LkEArr;
        LLILZLL = new C2254308sP(enumC551600LkEArr);
        Companion = new Object() { // from class: X.0LkR
        };
        EnumC551600LkE[] enumC551600LkEArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC551600LkEArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC551600LkE enumC551600LkE14 : enumC551600LkEArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC551600LkE14.LL), enumC551600LkE14);
        }
        byUnifiedCode = linkedHashMap;
    }

    public static EnumC551600LkE[] values() {
        return (EnumC551600LkE[]) LLILZIL.clone();
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

    public static EnumC551600LkE valueOf(String str) {
        return (EnumC551600LkE) C08FF.LIZ(EnumC551600LkE.class, str);
    }

    public EnumC551600LkE(int i, int i2, String str, String str2, String str3) {
        this.LL = i2;
        this.LLILLJJLI = str2;
        this.LLILZ = str3;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C555610Lqh toException$default(EnumC551600LkE enumC551600LkE, Throwable th, Integer num, String str, Integer num2, Map map, int i, Object obj) {
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
            return enumC551600LkE.toException(th, num, str, num2, map);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toException");
    }
}
