package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.bytedance.ies.ugc.appcontext.IAppContextService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.1Bky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213981Bky implements IAppContextService {
    public static final C2213981Bky LIZIZ = new C2213981Bky();
    public final /* synthetic */ IAppContextService LIZ;

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final String LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final long LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final String LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final int LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final String LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final int getAppId() {
        return this.LIZ.getAppId();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final String getAppName() {
        return this.LIZ.getAppName();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final Application getApplication() {
        return this.LIZ.getApplication();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final Context getApplicationContext() {
        return this.LIZ.getApplicationContext();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final String getChannel() {
        return this.LIZ.getChannel();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final Activity getCurrentActivity() {
        return this.LIZ.getCurrentActivity();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final long getUpdateVersionCode() {
        return this.LIZ.getUpdateVersionCode();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final long getVersionCode() {
        return this.LIZ.getVersionCode();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final String getVersionName() {
        return this.LIZ.getVersionName();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final boolean isAppBackground() {
        return this.LIZ.isAppBackground();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final boolean isDebug() {
        return this.LIZ.isDebug();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final boolean isOffline() {
        return this.LIZ.isOffline();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final boolean isRegressionTest() {
        return this.LIZ.isRegressionTest();
    }

    public C2213981Bky() {
        IAppContextService iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
        if (iAppContextService != null) {
            this.LIZ = iAppContextService;
        } else {
            "no impl for IAppContextService".toString();
            throw new IllegalStateException("no impl for IAppContextService");
        }
    }
}
