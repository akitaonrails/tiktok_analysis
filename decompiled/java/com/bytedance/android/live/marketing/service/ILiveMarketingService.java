package com.bytedance.android.live.marketing.service;

import X.C006A;
import X.C1115940f96;
import X.C1115970f99;
import X.EnumC1115870f8z;
import X.InterfaceC1115950f97;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public interface ILiveMarketingService extends C006A {
    Class<? extends LiveRecyclableWidget> F31();

    boolean Iq();

    boolean Ot();

    void g81(EnumC1115870f8z enumC1115870f8z, InterfaceC1115950f97 interfaceC1115950f97);

    EnumC1115870f8z hc();

    boolean isAvailable();

    C1115970f99 t5(EnumC1115870f8z enumC1115870f8z, C1115940f96 c1115940f96, long j);

    Map<EnumC1115870f8z, InterfaceC1115950f97> xH1();
}
