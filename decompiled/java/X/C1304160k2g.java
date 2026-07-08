package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.amg.minigameruntime.api.ABSetting;
import com.bytedance.amg.minigameruntime.api.GameDirectoryConfig;
import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.amg.minigameruntime.api.JsEngineType;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0k2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304160k2g {
    public final Application LIZ;
    public WeakReference<IClientAdapterService> LIZIZ;
    public final InterfaceC1304030k2T LIZJ;
    public boolean LJI;
    public final C2353409Ka LJIIIZ;
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public JsEngineType LJII = JsEngineType.V8;
    public ABSetting LJIIIIZZ = new ABSetting(false, false, 1.0f, 1, true, true, true, false, 1, true);

    public final Context LIZ() {
        return C786410Ut5.M3(this.LIZ);
    }

    public final IClientAdapterService LIZIZ() {
        return this.LIZIZ.get();
    }

    public C1304160k2g(Application application, WeakReference<IClientAdapterService> weakReference, InterfaceC1304030k2T interfaceC1304030k2T) {
        IClientAdapterService iClientAdapterService;
        GameDirectoryConfig gameArchDirectoryConfig;
        GameDirectoryConfig gameDirectoryConfigCopy;
        GameDirectoryConfig pluginDirectoryConfig;
        GameDirectoryConfig tempDirectoryConfig;
        GameDirectoryConfig userDirectoryConfig;
        GameDirectoryConfig gameSetupDirectoryConfig;
        this.LIZ = application;
        this.LIZIZ = weakReference;
        this.LIZJ = interfaceC1304030k2T;
        IClientAdapterService iClientAdapterService2 = this.LIZIZ.get();
        GameDirectoryConfig gameDirectoryConfig = (iClientAdapterService2 == null || (gameSetupDirectoryConfig = iClientAdapterService2.getGameSetupDirectoryConfig()) == null || (gameDirectoryConfig = gameSetupDirectoryConfig.copy(gameSetupDirectoryConfig.path, gameSetupDirectoryConfig.maxSize)) == null) ? new GameDirectoryConfig("", -1) : gameDirectoryConfig;
        IClientAdapterService iClientAdapterService3 = this.LIZIZ.get();
        GameDirectoryConfig gameDirectoryConfig2 = (iClientAdapterService3 == null || (userDirectoryConfig = iClientAdapterService3.getUserDirectoryConfig()) == null || (gameDirectoryConfig2 = userDirectoryConfig.copy(userDirectoryConfig.path, userDirectoryConfig.maxSize)) == null) ? new GameDirectoryConfig("", -1) : gameDirectoryConfig2;
        IClientAdapterService iClientAdapterService4 = this.LIZIZ.get();
        GameDirectoryConfig gameDirectoryConfig3 = (iClientAdapterService4 == null || (tempDirectoryConfig = iClientAdapterService4.getTempDirectoryConfig()) == null || (gameDirectoryConfig3 = tempDirectoryConfig.copy(tempDirectoryConfig.path, tempDirectoryConfig.maxSize)) == null) ? new GameDirectoryConfig("", -1) : gameDirectoryConfig3;
        IClientAdapterService iClientAdapterService5 = this.LIZIZ.get();
        GameDirectoryConfig gameDirectoryConfig4 = (iClientAdapterService5 == null || (pluginDirectoryConfig = iClientAdapterService5.getPluginDirectoryConfig()) == null || (gameDirectoryConfig4 = pluginDirectoryConfig.copy(pluginDirectoryConfig.path, pluginDirectoryConfig.maxSize)) == null) ? new GameDirectoryConfig("", -1) : gameDirectoryConfig4;
        IClientAdapterService iClientAdapterService6 = this.LIZIZ.get();
        this.LJIIIZ = new C2353409Ka(gameDirectoryConfig, gameDirectoryConfig2, gameDirectoryConfig3, gameDirectoryConfig4, (iClientAdapterService6 == null || (gameArchDirectoryConfig = iClientAdapterService6.getGameArchDirectoryConfig()) == null || (gameDirectoryConfigCopy = gameArchDirectoryConfig.copy(gameArchDirectoryConfig.path, gameArchDirectoryConfig.maxSize)) == null) ? new GameDirectoryConfig("", -1) : gameDirectoryConfigCopy);
        WeakReference<IClientAdapterService> weakReference2 = this.LIZIZ;
        if (weakReference2 != null && (iClientAdapterService = weakReference2.get()) != null) {
            interfaceC1304030k2T.LJ(iClientAdapterService);
        }
        interfaceC1304030k2T.LJIIL(this.LJIIIIZZ);
    }
}
