package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.services.ISettingExService;

/* JADX INFO: renamed from: X.1A8c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174441A8c implements ISettingExService {
    public static final C2174441A8c LIZIZ = new C2174441A8c();
    public final /* synthetic */ ISettingExService LIZ;

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingExService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingExService
    public final void LIZIZ(Intent intent) {
        this.LIZ.LIZIZ(intent);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingExService
    public final int LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingExService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingExService
    public final boolean LJ(String str) {
        return this.LIZ.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingExService
    public final boolean LJFF(Class<?> cls) {
        return this.LIZ.LJFF(cls);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingExService
    public final void LJI() {
        this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingExService
    public final boolean LJII() {
        return this.LIZ.LJII();
    }

    public C2174441A8c() {
        ISettingExService iSettingExService = (ISettingExService) PluggableExtentionKt.pluggableSpi$default(ISettingExService.class, false, false, false, 14, null);
        if (iSettingExService != null) {
            this.LIZ = iSettingExService;
        } else {
            "no impl for ISettingExService".toString();
            throw new IllegalStateException("no impl for ISettingExService");
        }
    }
}
