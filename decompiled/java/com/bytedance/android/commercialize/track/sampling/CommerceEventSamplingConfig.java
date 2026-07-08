package com.bytedance.android.commercialize.track.sampling;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
public final class CommerceEventSamplingConfig {

    @C09CT("sample_events")
    public final List<String> sampleEvents;

    @C09CT("sample_method")
    public final int sampleMethod;

    @C09CT("sample_rate")
    public final double sampleRate;

    public CommerceEventSamplingConfig() {
        this(null, 0, 0.0d, 7, null);
    }

    public CommerceEventSamplingConfig(List<String> list, int i, double d) {
        this.sampleEvents = list;
        this.sampleMethod = i;
        this.sampleRate = d;
    }

    public CommerceEventSamplingConfig(List list, int i, double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0.0d : d);
    }
}
