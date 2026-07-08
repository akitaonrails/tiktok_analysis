package X;

import com.ss.android.ugc.aweme.port.in.IToolsCPUDataService;
import com.ss.android.ugc.aweme.services.ToolsCPUDataServiceImpl;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0XpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C860580XpQ implements IToolsCPUDataService {
    public static final C860580XpQ LIZIZ = new C860580XpQ();
    public final /* synthetic */ IToolsCPUDataService LIZ = ToolsCPUDataServiceImpl.createIToolsCPUDataServicebyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public final void end() {
        this.LIZ.end();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public final HashMap<String, Double> getCpuData() {
        return this.LIZ.getCpuData();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public final HashMap<String, String> getThermalData() {
        return this.LIZ.getThermalData();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public final int isSavePowerEnable() {
        return this.LIZ.isSavePowerEnable();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public final void start() {
        this.LIZ.start();
    }
}
