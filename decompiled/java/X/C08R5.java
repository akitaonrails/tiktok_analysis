package X;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.AsyncTask;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.keva.KevaImpl;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.appinit.PreloaderInAppInit;
import java.io.File;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.08R5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08R5 extends AsyncTask {
    public final /* synthetic */ ApplicationInfo LIZ;

    public C08R5(ApplicationInfo applicationInfo) {
        this.LIZ = applicationInfo;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.09cv] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        String str;
        try {
            ApplicationInfo applicationInfo = this.LIZ;
            if (applicationInfo == null || (str = applicationInfo.dataDir) == null || str.isEmpty()) {
                return null;
            }
            final ?? r1 = new Application() { // from class: X.09cv
                @Override // android.content.ContextWrapper, android.content.Context
                public final File getFilesDir() {
                    return null;
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public final ApplicationInfo getApplicationInfo() {
                    return this.LL.LIZ;
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public final void startActivity(Intent intent) {
                    C2413309cx.LIZ(AFwS224S0000000_33.get$arr$(611));
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, this);
                    super.startActivity(intent);
                }
            };
            KevaBuilder.setKevaBuildConfigCallBack(new KevaBuilder.IKevaBuildConfig() { // from class: X.08RO
                @Override // com.bytedance.keva.KevaBuilder.IKevaBuildConfig
                public final void setKevaConfig(KevaBuilder kevaBuilder) {
                    kevaBuilder.setContext(r1);
                    kevaBuilder.setPortedRepoName("aweme_ported_sp_repo");
                    kevaBuilder.setEnableLoadOpt(true);
                    kevaBuilder.setIsLoadFromNative(2);
                    kevaBuilder.setIsEnableMultiProcessLoadFromNative(1);
                }
            });
            PreloaderInAppInit.LIZLLL.countDown();
            KevaImpl.getRepoSync("libra_config_center_repo", 1);
            KevaImpl.getRepoSync("config_center_repo", 1);
            KevaImpl.getRepoSync("launch_center_repo", 0);
            KevaImpl.getRepoSync("config_center_meta_repo", 1);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C08R2.LIZLLL = th;
            C2116408Qw.LIZJ("cold_boot_keva_adv_opt_safety_catch_v2", 1);
            return null;
        }
    }
}
