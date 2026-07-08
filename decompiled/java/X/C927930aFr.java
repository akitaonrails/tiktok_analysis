package X;

import com.bytedance.android.live.liveinteract.platform.common.utils.LinkMicAppBundleUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927930aFr implements C0UVS {
    @Override // X.C0UVS
    public final void LIZ(int i, String str, boolean z) {
    }

    @Override // X.C0UVS
    public final void onFailed() {
        if (Intrinsics.LJFF(LinkMicAppBundleUtil.LIZLLL, "co_host_linkmic_icon_click")) {
            new C955490ayJ().LJIJJLI("install_fail");
        }
        LinkMicAppBundleUtil.LIZJ = null;
        LinkMicAppBundleUtil.LIZLLL = null;
        C20441214yg.LIZIZ("pluginInstallListener", "onFailed");
    }

    @Override // X.C0UVS
    public final void onSuccess() {
        C766270U4b.LIZLLL(2131855310);
        Function0<Unit> function0 = LinkMicAppBundleUtil.LIZJ;
        if (function0 != null) {
            function0.invoke();
        }
        if (Intrinsics.LJFF(LinkMicAppBundleUtil.LIZLLL, "co_host_linkmic_icon_click")) {
            new C955440ayE().LJIJJLI("install_success");
        }
        LinkMicAppBundleUtil.LIZJ = null;
        LinkMicAppBundleUtil.LIZLLL = null;
        C20441214yg.LIZIZ("pluginInstallListener", "onSuccess");
    }
}
