package com.bytedance.android.live.ai.impl.pitaya;

import X.InterfaceC1631620sYq;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public final class LivePitayaTaskManager$checkPkgByBusinessName$1$1 implements PTYPackageCallback {
    public final /* synthetic */ InterfaceC1631620sYq<Integer, PTYError, PTYPackageInfo, Unit> $reject;
    public final /* synthetic */ Function1<String, Unit> $resolve;

    /* JADX WARN: Multi-variable type inference failed */
    public LivePitayaTaskManager$checkPkgByBusinessName$1$1(Function1<? super String, Unit> function1, InterfaceC1631620sYq<? super Integer, ? super PTYError, ? super PTYPackageInfo, Unit> interfaceC1631620sYq) {
        this.$resolve = function1;
        this.$reject = interfaceC1631620sYq;
    }

    @Override // com.bytedance.pitaya.api.PTYPackageCallback
    public void onResult(boolean z, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
        String version;
        if (z) {
            Function1<String, Unit> function1 = this.$resolve;
            if (pTYPackageInfo == null || (version = pTYPackageInfo.getVersion()) == null) {
                version = "";
            }
            function1.invoke(version);
            return;
        }
        this.$reject.invoke(-3, pTYError, pTYPackageInfo);
    }
}
