package X;

import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtLinkMicRustLibrarianMonitorSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bGN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966690bGN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C966920bGk LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966690bGN(C966920bGk c966920bGk) {
        super(0);
        this.LL = c966920bGk;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        try {
            C966920bGk c966920bGk = this.LL;
            if (!c966920bGk.LJFF) {
                c966920bGk.LJ = c966920bGk.LIZJ.invoke();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C966920bGk c966920bGk2 = this.LL;
            c966920bGk2.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on Rust Linker init error ");
            sbLIZ.append(th);
            C1304630k3R.LJ(C2188811AlT.LIZIZ(sbLIZ), c966920bGk2.LIZIZ);
            c966920bGk2.LJI = true;
            C965700bEm.LIZIZ = true;
            C1304630k3R.LJII(6, "downgrade rust to normal live", "LinkerPlugin");
            boolean z = C965700bEm.LIZ;
            if (MtLinkMicRustLibrarianMonitorSetting.enableReport()) {
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_linkmic_librarian", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
                c474500IjALIZIZ.LJJII(Boolean.valueOf(z), "so_load_result");
                c474500IjALIZIZ.LJJII("downgrade", "so_dir_path");
                c474500IjALIZIZ.LJJII(Boolean.TRUE, "dir_exists");
                c474500IjALIZIZ.LIZ();
            }
            C1304660k3U.LIZ.LIZIZ(100001, "Rust Linker init error", th, null);
        }
        return Unit.LIZ;
    }
}
