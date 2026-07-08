package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.13W0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13W0 implements C0EHH, InterfaceC2239231Ckb, InterfaceC2239161CkU, InterfaceC357390Dzl, C13W3 {
    public final Context LIZ;
    public final CreativeInfo LIZIZ;

    @Override // X.InterfaceC2239161CkU
    public final boolean LJII() {
        C1442900neS.LIZ.getClass();
        return C1442900neS.LIZ();
    }

    @Override // X.InterfaceC2239231Ckb
    public final String LJIIIZ() {
        CreativeInfo creativeInfo = this.LIZIZ;
        return creativeInfo != null ? C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228014Cw.MAGIC_EFFECT_CACHE, null, 12) : "";
    }

    @Override // X.C13W3
    public final C2268951DrR LIZLLL() {
        IEffectPlatformFactory iEffectPlatformFactory = (IEffectPlatformFactory) ServiceManager.get().getService(IEffectPlatformFactory.class);
        EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
        effectPlatformBuilder.setContext(this.LIZ);
        EffectConfiguration effectConfigurationBuild = iEffectPlatformFactory.createEffectConfigurationBuilder(effectPlatformBuilder).build();
        String appID = effectConfigurationBuild.getAppID();
        String appVersion = effectConfigurationBuild.getAppVersion();
        String sdkVersion = effectConfigurationBuild.getSdkVersion();
        String accessKey = effectConfigurationBuild.getAccessKey();
        String platform = effectConfigurationBuild.getPlatform();
        String deviceId = effectConfigurationBuild.getDeviceId();
        String deviceType = effectConfigurationBuild.getDeviceType();
        String region = effectConfigurationBuild.getRegion();
        String appLanguage = effectConfigurationBuild.getAppLanguage();
        String channel = effectConfigurationBuild.getChannel();
        String absolutePath = EffectPlatform.LLILZ.getAbsolutePath();
        List<Host> hosts = effectConfigurationBuild.getHosts();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(hosts, 10));
        Iterator<Host> it2 = hosts.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getItemName());
        }
        String str = (String) C13LP.LJJJLL(arrayList);
        if (str == null) {
            str = "";
        }
        return new C2268951DrR(appID, appVersion, sdkVersion, accessKey, platform, deviceId, deviceType, region, appLanguage, channel, absolutePath, str, EffectPlatform.LLILZIL.getAbsolutePath());
    }

    @Override // X.InterfaceC2239231Ckb
    public final String LJ() {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.MAGIC_PROCESSOR, "", true).getPath();
    }

    @Override // X.InterfaceC2239161CkU
    public final boolean LJIIIIZZ() {
        return AVSettingsWrapper.enableHardEncodeForSynthetic();
    }

    @Override // X.InterfaceC357390Dzl
    public final void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("elfredMagic");
        sbLIZ.append(" -> ");
        sbLIZ.append(str);
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0EHH
    public final <T> T LIZIZ(Class<T> cls) {
        return (T) C0CHQ.LIZ().getNetworkService().createRetrofit(C0CHQ.LIZ().getNetworkService().getApiHost(), true, cls);
    }

    @Override // X.InterfaceC2239161CkU
    public final String LIZJ(String str) {
        try {
            C2471909mP c2471909mP = C2471909mP.LIZ;
            Context context = this.LIZ;
            c2471909mP.getClass();
            String strLJIIIIZZ = C2471909mP.LJIIIIZZ(context, "");
            if (!C2286708xd.LIZJ(strLJIIIIZZ)) {
                new C0VSJ(strLJIIIIZZ).mkdirs();
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LIZ("File not exist");
        }
        String strLJIIJ = C2471909mP.LJIIJ(this.LIZ, str);
        if (strLJIIJ == null) {
            return "";
        }
        return strLJIIJ;
    }

    @Override // X.InterfaceC2239161CkU
    public final C2229251CMx LJFF(String str) {
        C13W2 c13w2LIZIZ = C13W4.LIZIZ(str);
        return new C2229251CMx(c13w2LIZIZ.LIZJ, c13w2LIZIZ.LIZLLL, c13w2LIZIZ.LJ, c13w2LIZIZ.LJFF, c13w2LIZIZ.LJI, c13w2LIZIZ.LJII, c13w2LIZIZ.LJIIIIZZ, c13w2LIZIZ.LJIIIZ, c13w2LIZIZ.LIZ, c13w2LIZIZ.LIZIZ);
    }

    @Override // X.InterfaceC2239161CkU
    public final boolean LJI(String str) {
        return C2471909mP.LJJIIZI(str);
    }

    @Override // X.InterfaceC357390Dzl
    public final void i(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicLightWaveHandler");
        sbLIZ.append(" -> ");
        sbLIZ.append(str);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C13W0(Context context, CreativeInfo creativeInfo) {
        this.LIZ = context;
        this.LIZIZ = creativeInfo;
    }

    @Override // X.InterfaceC357390Dzl
    public final void d(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" -> ");
        sbLIZ.append(str2);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
