package com.bytedance.android.live.ai.impl.pitaya;

import X.C13LP;
import X.C2188811AlT;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public final class LivePitayaTaskManager$downloadPkgByBusinessName$1$1 implements PTYPackageCallback {
    public final /* synthetic */ Function1<String, Unit> $reject;
    public final /* synthetic */ Function1<String, Unit> $resolve;

    /* JADX WARN: Multi-variable type inference failed */
    public LivePitayaTaskManager$downloadPkgByBusinessName$1$1(Function1<? super String, Unit> function1, Function1<? super String, Unit> function12) {
        this.$resolve = function1;
        this.$reject = function12;
    }

    @Override // com.bytedance.pitaya.api.PTYPackageCallback
    public void onResult(boolean z, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
        String strLJJLIIIJ;
        String version;
        String str = "";
        if (z) {
            Function1<String, Unit> function1 = this.$resolve;
            if (pTYPackageInfo != null && (version = pTYPackageInfo.getVersion()) != null) {
                str = version;
            }
            function1.invoke(str);
            return;
        }
        Function1<String, Unit> function12 = this.$reject;
        if (pTYError != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PTYError(code: ");
            sbLIZ.append(pTYError.getCode());
            sbLIZ.append(", msg: ");
            sbLIZ.append(pTYError.getSummary());
            sbLIZ.append(", stack: ");
            List<String> stacks = pTYError.getStacks();
            if (stacks != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(stacks, "\n", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ = null;
            }
            sbLIZ.append(strLJJLIIIJ);
            sbLIZ.append(')');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                str = strLIZIZ;
            }
        }
        function12.invoke(str);
    }
}
