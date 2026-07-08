package X;

import com.tts.oecverify.BdTuring;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Axf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196371Axf implements Serializable {
    public long activityCreateTime;
    public long activityHideTimestamp;
    public int errorCode;
    public long flowEndTime;
    public String flowId;
    public long flowStartTime;
    public boolean isHotLaunch;
    public boolean isRelaunch;
    public boolean isRetry;
    public boolean isSuccess;
    public HashMap<EnumC2196421Axk, C2196441Axm> map;
    public String netCode;
    public String netError;
    public EnumC2192711Arl versionStage;
    public static final C2196451Axn Companion = new Object() { // from class: X.1Axn
    };
    public static final int $stable = 8;
    public static final Set<Integer> META_REVAMP_ERROR_CODES = C13LQ.LJLIIL(new Integer[]{20010002, 20110003, 20110004, 20110005, 20110006, 20110007, 20120002, 200});

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2196371Axf)) {
            return false;
        }
        C2196371Axf c2196371Axf = (C2196371Axf) obj;
        return this.isSuccess == c2196371Axf.isSuccess && this.isHotLaunch == c2196371Axf.isHotLaunch && this.isRetry == c2196371Axf.isRetry && this.isRelaunch == c2196371Axf.isRelaunch && this.errorCode == c2196371Axf.errorCode && Intrinsics.LJFF(this.flowId, c2196371Axf.flowId) && this.versionStage == c2196371Axf.versionStage && Intrinsics.LJFF(this.map, c2196371Axf.map) && this.flowStartTime == c2196371Axf.flowStartTime && this.flowEndTime == c2196371Axf.flowEndTime && this.activityCreateTime == c2196371Axf.activityCreateTime && this.activityHideTimestamp == c2196371Axf.activityHideTimestamp && Intrinsics.LJFF(this.netCode, c2196371Axf.netCode) && Intrinsics.LJFF(this.netError, c2196371Axf.netError);
    }

    public String toString() {
        return "MinisLoadPerfModel(isSuccess=" + this.isSuccess + ", isHotLaunch=" + this.isHotLaunch + ", isRetry=" + this.isRetry + ", isRelaunch=" + this.isRelaunch + ", errorCode=" + this.errorCode + ", flowId=" + this.flowId + ", versionStage=" + this.versionStage + ", map=" + this.map + ", flowStartTime=" + this.flowStartTime + ", flowEndTime=" + this.flowEndTime + ", activityCreateTime=" + this.activityCreateTime + ", activityHideTimestamp=" + this.activityHideTimestamp + ", netCode=" + this.netCode + ", netError=" + this.netError + ')';
    }

    public C2196371Axf() {
        this(false, false, false, false, -1, C1017903yT.LIZ(), EnumC2192711Arl.MINIS_STAGE_PROD, new HashMap(), 0L, 0L, 0L, 0L, null, null);
    }

    public final long getDuration() {
        if (this.flowEndTime <= 0) {
            this.flowEndTime = System.currentTimeMillis();
        }
        long j = this.flowEndTime - this.flowStartTime;
        if (j >= 0) {
            return j;
        }
        return 0L;
    }

    public final boolean isHotLaunch() {
        return this.isHotLaunch;
    }

    public final boolean isRelaunch() {
        return this.isRelaunch;
    }

    public final boolean isRetry() {
        return this.isRetry;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public final C2196441Axm getStage(EnumC2196421Axk enumC2196421Axk) {
        C2196441Axm c2196441Axm;
        if (!this.map.containsKey(enumC2196421Axk) || (c2196441Axm = this.map.get(enumC2196421Axk)) == null) {
            switch (C2196431Axl.LIZ[enumC2196421Axk.ordinal()]) {
                case 1:
                    return new C2195181Avk(enumC2196421Axk, false);
                case 2:
                    return new C2196441Axm(enumC2196421Axk, true, 0, "", 0L, 0L);
                case 3:
                    return new C2196441Axm(enumC2196421Axk, true, 0, "", 0L, 0L);
                case 4:
                    return new C2196441Axm(enumC2196421Axk, true, 0, "", 0L, 0L);
                case 5:
                    return new C2195191Avl(enumC2196421Axk, false);
                case 6:
                    return new C2196391Axh(enumC2196421Axk, false, false, 0, 0);
                case 7:
                    return new C2195301Avw(enumC2196421Axk, false, false);
                case 8:
                    return new C2196441Axm(enumC2196421Axk, true, 0, "", 0L, 0L);
                case BdTuring.TYPE_ECAF /* 9 */:
                    return new C2196441Axm(enumC2196421Axk, true, 0, "", 0L, 0L);
                default:
                    throw new C1954807lC();
            }
        }
        return c2196441Axm;
    }

    public final void recordStage(C2196441Axm c2196441Axm) {
        this.map.put(c2196441Axm.getStage(), c2196441Axm);
    }

    public final void setActivityCreateTime(long j) {
        this.activityCreateTime = j;
    }

    public final void setActivityHideTimestamp(long j) {
        this.activityHideTimestamp = j;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setFlowEndTime(long j) {
        this.flowEndTime = j;
    }

    public final void setFlowId(String str) {
        this.flowId = str;
    }

    public final void setFlowStartTime(long j) {
        this.flowStartTime = j;
    }

    public final void setHotLaunch(boolean z) {
        this.isHotLaunch = z;
    }

    public final void setLaunchState(boolean z) {
        this.isHotLaunch = z;
    }

    public final void setMap(HashMap<EnumC2196421Axk, C2196441Axm> map) {
        this.map = map;
    }

    public final void setNetCode(String str) {
        this.netCode = str;
    }

    public final void setNetError(String str) {
        this.netError = str;
    }

    public final void setRelaunch(boolean z) {
        this.isRelaunch = z;
    }

    public final void setRetry(boolean z) {
        this.isRetry = z;
    }

    public final void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public final void setVersionStage(EnumC2192711Arl enumC2192711Arl) {
        this.versionStage = enumC2192711Arl;
    }

    public final void setNetError(String str, String str2) {
        this.netCode = str;
        this.netError = str2;
    }

    public final void setResult(boolean z, int i) {
        this.isSuccess = z;
        this.errorCode = i;
        this.flowEndTime = System.currentTimeMillis();
    }

    public C2196371Axf(boolean z, boolean z2, boolean z3, boolean z4, int i, String str, EnumC2192711Arl enumC2192711Arl, HashMap<EnumC2196421Axk, C2196441Axm> map, long j, long j2, long j3, long j4, String str2, String str3) {
        this.isSuccess = z;
        this.isHotLaunch = z2;
        this.isRetry = z3;
        this.isRelaunch = z4;
        this.errorCode = i;
        this.flowId = str;
        this.versionStage = enumC2192711Arl;
        this.map = map;
        this.flowStartTime = j;
        this.flowEndTime = j2;
        this.activityCreateTime = j3;
        this.activityHideTimestamp = j4;
        this.netCode = str2;
        this.netError = str3;
        String strLIZ = C1017903yT.LIZ();
        strLIZ.toString();
        this.flowId = strLIZ;
    }
}
