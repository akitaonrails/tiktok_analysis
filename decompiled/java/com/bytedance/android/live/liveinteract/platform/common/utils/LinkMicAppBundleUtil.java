package com.bytedance.android.live.liveinteract.platform.common.utils;

import X.InterfaceC927900aFo;
import X.InterfaceC948500an2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS131S1200000_15;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "LINK_MIC_APP_BUNDLE_UTIL")
public final class LinkMicAppBundleUtil implements InterfaceC927900aFo {
    public static volatile Function0<Unit> LIZJ;
    public static volatile String LIZLLL;
    public int LIZ = Integer.MAX_VALUE;
    public int LIZIZ;

    @Override // X.InterfaceC927900aFo
    public final boolean LIZ() {
        if (this.LIZ == -14) {
            return false;
        }
        this.LIZIZ = 1;
        return true;
    }

    @Override // X.InterfaceC927900aFo
    public final void LIZIZ() {
        this.LIZ = Integer.MAX_VALUE;
    }

    @Override // X.InterfaceC927900aFo
    public final int LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC927900aFo
    public final void LIZJ(AwS131S1200000_15 awS131S1200000_15) {
        awS131S1200000_15.invoke();
    }
}
