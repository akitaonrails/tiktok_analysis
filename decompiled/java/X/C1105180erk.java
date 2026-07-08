package X;

import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridBlockGcSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridCpuBoostSetting;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0erk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105180erk {
    public static final C1105180erk LIZ = new C1105180erk();

    public static void LIZ(String str) {
        Object c098200Yq;
        EnumC1105200erm enumC1105200ermLIZ;
        if (C500260Jjc.LJIJ(DataChannelGlobal.LLILZ) || C500260Jjc.LJJLI() == null) {
            return;
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri != null && (enumC1105200ermLIZ = C1105230erp.LIZ(uri)) != null) {
            int i = C1105170erj.LIZ[enumC1105200ermLIZ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (LiveHybridCpuBoostSetting.INSTANCE.lynxEnable()) {
                        C2207291BaB.LIZIZ(EnumC1105190erl.OPEN_LYNX_PAGE.getTargetScene(), LSPassThroughRecordSizeConfig.DEFAULT);
                    }
                    if (LiveHybridBlockGcSetting.INSTANCE.lynxEnable()) {
                        JatoXL.requestBlockGc(1000L);
                        return;
                    }
                    return;
                }
                return;
            }
            if (LiveHybridCpuBoostSetting.INSTANCE.webviewEnable()) {
                C2207291BaB.LIZIZ(EnumC1105190erl.OPEN_WEBVIEW_PAGE.getTargetScene(), LSPassThroughRecordSizeConfig.DEFAULT);
            }
            if (!LiveHybridBlockGcSetting.INSTANCE.webviewEnable()) {
                return;
            }
            JatoXL.requestBlockGc(1000L);
        }
    }
}
