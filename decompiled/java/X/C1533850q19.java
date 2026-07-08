package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q19, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533850q19 implements IResourceServiceX {
    public final Forest LIZ;
    public final Context LIZIZ;
    public final C1533560q0g LIZJ;
    public String LIZLLL;

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX, X.InterfaceC1075470e5p
    public final void onUnRegister() {
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final String getBid() {
        return this.LIZLLL;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final Forest getForest() {
        return this.LIZ;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final C1533560q0g getResourceConfig() {
        return this.LIZJ;
    }

    public C1533850q19(Forest forest) {
        Application application = forest.getApplication();
        this.LIZ = forest;
        this.LIZIZ = application;
        this.LIZJ = forest.getConfig();
        this.LIZLLL = "hybridkit_default_bid";
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final IResourceServiceX copyAndModifyConfig(AbstractC1076640e7i abstractC1076640e7i) {
        Context context = this.LIZIZ;
        C1533560q0g c1533560q0gLIZ = this.LIZJ.LIZ();
        abstractC1076640e7i.LIZ(c1533560q0gLIZ);
        C1533850q19 c1533850q19 = new C1533850q19(context, c1533560q0gLIZ);
        c1533850q19.LIZLLL = this.LIZLLL;
        return c1533850q19;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX, X.InterfaceC1075470e5p
    public final void onRegister(String str) {
        this.LIZLLL = str;
    }

    public C1533850q19(Context context, C1533560q0g c1533560q0g) {
        this(new Forest((Application) C786410Ut5.N3(context), c1533560q0g));
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final C1533910q1F createSyncRequest(String str, RequestParams requestParams) {
        return this.LIZ.createSyncRequest(str, requestParams);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final C1533910q1F fetchResourceAsync(String str, RequestParams requestParams, Function1<? super C1533790q13, Unit> function1) {
        return this.LIZ.fetchResourceAsync(str, requestParams, function1);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final C1533910q1F fetchResourceAsyncIfNeed(String str, RequestParams requestParams, Function1<? super C1533790q13, Unit> function1) {
        return this.LIZ.fetchResourceAsync(str, requestParams, function1);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final C1533910q1F preload(String str, RequestParams requestParams, Function1<? super C1533790q13, Unit> function1) {
        Forest.preload$default(this.LIZ, str, requestParams, false, null, null, 28, null);
        return null;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    @InterfaceC1294060jmO
    public final void preloadContainer(String str, RequestParams requestParams, C1537480q70 c1537480q70, boolean z) {
        String str2;
        Forest forest = this.LIZ;
        if (c1537480q70 != null) {
            str2 = c1537480q70.containerId;
        } else {
            str2 = null;
        }
        Forest.preload$default(forest, str, requestParams, z, str2, null, 16, null);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceServiceX
    public final void preloadContainer(C1534660q2S c1534660q2S, String str, String str2, String str3) {
        this.LIZ.preload(c1534660q2S, str, str2, str3);
    }
}
