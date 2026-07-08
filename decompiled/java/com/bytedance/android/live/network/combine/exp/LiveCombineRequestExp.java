package com.bytedance.android.live.network.combine.exp;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_combine_request_exp")
public final class LiveCombineRequestExp {
    public static final LiveCombineRequestExp INSTANCE = new LiveCombineRequestExp();
    public static final LiveCombineReqeustConfig DEFAULT = new LiveCombineReqeustConfig(false, 0, false, 0, null, 0.0f, null, null, 0, 511, null);
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(98));
    public static final C01GW requestSet$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(96));
    public static final C01GW retryWhenSplitFailedSet$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(97));
    public static final C01GW enableForLog$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(95));

    private final boolean getEnableForLog() {
        return ((Boolean) enableForLog$delegate.getValue()).booleanValue();
    }

    private final Set<String> getRequestSet() {
        return (Set) requestSet$delegate.getValue();
    }

    private final Set<String> getRetryWhenSplitFailedSet() {
        return (Set) retryWhenSplitFailedSet$delegate.getValue();
    }

    public final LiveCombineReqeustConfig getValue() {
        return (LiveCombineReqeustConfig) value$delegate.getValue();
    }

    public final boolean enable() {
        return getValue().getEnableCombineRequest();
    }

    public final boolean enableForLog() {
        return getEnableForLog();
    }

    public final long getCombineRequestDelayTimeMs() {
        return getValue().getCombineRequestDelayTimeMs();
    }

    public final int maxCombineErrorCount() {
        return getValue().getMaxCombineErrorCount();
    }

    public final int maxSplitErrorCount() {
        return getValue().getMaxSplitErrorCount();
    }

    public final boolean shouldAddFailedReqWhenApiFailure() {
        return getValue().getShouldCombineFailedAddWhenApiFailure();
    }

    public static final class LiveCombineReqeustConfig {
        public static final TypeAdapter ADAPTER = new LiveCombineRequestExp_LiveCombineReqeustConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("combine_request_delay_time_ms")
        public long combineRequestDelayTimeMs;

        @C09CT("dispatch_delay_time_ms")
        public Map<String, Long> dispatchDelayTimeMs;

        @C09CT("enable")
        public boolean enableCombineRequest;

        @C09CT("log_sample_rate")
        public float logSampleRate;

        @C09CT("max_combine_error_count")
        public int maxCombineErrorCount;

        @C09CT("max_split_error_count")
        public int maxSplitErrorCount;

        @C09CT("request_list")
        public List<String> requestList;

        @C09CT("retry_when_split_failed_list")
        public List<String> retryWhenSplitFailedList;

        @C09CT("should_combine_failed_add_when_api_failure")
        public boolean shouldCombineFailedAddWhenApiFailure;

        public LiveCombineReqeustConfig() {
            this(false, 0, false, 0, null, 0.0f, null, null, 0L, 511, null);
        }

        public final long getCombineRequestDelayTimeMs() {
            return this.combineRequestDelayTimeMs;
        }

        public final Map<String, Long> getDispatchDelayTimeMs() {
            return this.dispatchDelayTimeMs;
        }

        public final boolean getEnableCombineRequest() {
            return this.enableCombineRequest;
        }

        public final float getLogSampleRate() {
            return this.logSampleRate;
        }

        public final int getMaxCombineErrorCount() {
            return this.maxCombineErrorCount;
        }

        public final int getMaxSplitErrorCount() {
            return this.maxSplitErrorCount;
        }

        public final List<String> getRequestList() {
            return this.requestList;
        }

        public final List<String> getRetryWhenSplitFailedList() {
            return this.retryWhenSplitFailedList;
        }

        public final boolean getShouldCombineFailedAddWhenApiFailure() {
            return this.shouldCombineFailedAddWhenApiFailure;
        }

        public final void setCombineRequestDelayTimeMs(long j) {
            this.combineRequestDelayTimeMs = j;
        }

        public final void setDispatchDelayTimeMs(Map<String, Long> map) {
            this.dispatchDelayTimeMs = map;
        }

        public final void setEnableCombineRequest(boolean z) {
            this.enableCombineRequest = z;
        }

        public final void setLogSampleRate(float f) {
            this.logSampleRate = f;
        }

        public final void setMaxCombineErrorCount(int i) {
            this.maxCombineErrorCount = i;
        }

        public final void setMaxSplitErrorCount(int i) {
            this.maxSplitErrorCount = i;
        }

        public final void setRequestList(List<String> list) {
            this.requestList = list;
        }

        public final void setRetryWhenSplitFailedList(List<String> list) {
            this.retryWhenSplitFailedList = list;
        }

        public final void setShouldCombineFailedAddWhenApiFailure(boolean z) {
            this.shouldCombineFailedAddWhenApiFailure = z;
        }

        public LiveCombineReqeustConfig(boolean z, int i, boolean z2, int i2, List<String> list, float f, List<String> list2, Map<String, Long> map, long j) {
            this.enableCombineRequest = z;
            this.maxCombineErrorCount = i;
            this.shouldCombineFailedAddWhenApiFailure = z2;
            this.maxSplitErrorCount = i2;
            this.requestList = list;
            this.logSampleRate = f;
            this.retryWhenSplitFailedList = list2;
            this.dispatchDelayTimeMs = map;
            this.combineRequestDelayTimeMs = j;
        }

        public LiveCombineReqeustConfig(boolean z, int i, boolean z2, int i2, List list, float f, List list2, Map map, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 3 : i, (i3 & 4) == 0 ? z2 : false, (i3 & 8) == 0 ? i2 : 3, (i3 & 16) != 0 ? C13BV.INSTANCE : list, (i3 & 32) != 0 ? 0.0f : f, (i3 & 64) != 0 ? C13BV.INSTANCE : list2, (i3 & 128) != 0 ? new LinkedHashMap() : map, (i3 & 256) != 0 ? 0L : j);
        }
    }

    public final boolean enableForRequest(String str) {
        if (getValue().getEnableCombineRequest() && getRequestSet().contains(str)) {
            return true;
        }
        return false;
    }

    public final long getDispatchDelayTimeMs(String str) {
        Long l;
        Map<String, Long> dispatchDelayTimeMs = getValue().getDispatchDelayTimeMs();
        if (dispatchDelayTimeMs != null && (l = dispatchDelayTimeMs.get(str)) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final boolean shouldRetryWhenSplitFailed(String str) {
        if (getValue().getEnableCombineRequest() && getRetryWhenSplitFailedSet().contains(str)) {
            return true;
        }
        return false;
    }
}
