package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import java.util.Map;

/* JADX INFO: renamed from: X.10jZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19328310jZ implements IUpdateSettingService {
    public static final C19328310jZ LIZIZ = new C19328310jZ();
    public final /* synthetic */ IUpdateSettingService LIZ = (IUpdateSettingService) ServiceManager.get().getService(IUpdateSettingService.class);

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final int LIZ(String str) {
        return this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void LIZIZ(PushSettings pushSettings) {
        this.LIZ.LIZIZ(pushSettings);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final int LIZLLL(String str) {
        return this.LIZ.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final PushSettings LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final boolean LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void LJI(Map<String, Integer> map) {
        this.LIZ.LJI(map);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void LJII(int i, int i2) {
        this.LIZ.LJII(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final boolean LJIIIIZZ(String str) {
        return this.LIZ.LJIIIIZZ(str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final int LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void f6(int i, String str) {
        this.LIZ.f6(i, str);
    }
}
