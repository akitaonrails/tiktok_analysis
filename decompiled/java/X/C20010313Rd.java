package X;

import android.content.Context;
import android.os.Build;
import com.bef.effectsdk.BEFEffectNative;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.internal.v;
import com.ss.android.ugc.aweme.common.NaviEffectNetworkerImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.13Rd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20010313Rd {
    public static final C20010313Rd LIZ = new C20010313Rd();
    public static final String LIZIZ = BEFEffectNative.nativeGetEffectSDKVersion();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(446));

    public static DownloadableModelSupport LIZIZ(Context context) {
        String str;
        DownloadableModelConfig.ModelFileEnv modelFileEnv;
        if (!DownloadableModelSupport.isInitialized()) {
            DownloadableModelConfig.Builder builder = new DownloadableModelConfig.Builder();
            builder.setContext(context);
            builder.setAccessKey("142710f02c3a11e8b42429f14557854a");
            C0CHQ.LIZ().getRegionService();
            if (C20186013yc.LIZIZ().booleanValue()) {
                str = "1180";
            } else {
                str = "1233";
            }
            builder.setAppId(str);
            builder.setHosts(C1697810uHb.LJ(new Host("https://api-va.tiktokv.com")));
            builder.setSdkVersion(LIZIZ);
            builder.setDeviceType(Build.MODEL);
            builder.setJsonConverter(new IJsonConverter() { // from class: X.09CV
                @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
                public final <T> String convertObjToJson(T t) {
                    return GsonProtectorUtils.toJson(new Gson(), t);
                }

                @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
                public final <T> T convertJsonToObj(InputStream inputStream, Class<T> cls) {
                    Gson gson = new Gson();
                    try {
                        C09CU c09cu = new C09CU(new InputStreamReader(inputStream));
                        T t = (T) v.LIZ(cls).cast(gson.LJ(c09cu, cls));
                        c09cu.close();
                        inputStream.close();
                        return t;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }
            });
            if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().enableModelFileOnlyEnv()) {
                modelFileEnv = DownloadableModelConfig.ModelFileEnv.ONLINE;
            } else {
                modelFileEnv = DownloadableModelConfig.ModelFileEnv.TEST;
            }
            builder.setModelFileEnv(modelFileEnv);
            builder.setEffectNetWorker(new NaviEffectNetworkerImpl());
            builder.setAssetManager(context.getAssets());
            builder.setWorkspace(((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().effectModelDir());
            builder.setExecutor(C823050WQl.LIZLLL());
            builder.ignoreBuiltInModel(false);
            DownloadableModelSupport.initialize(builder.build());
        }
        return DownloadableModelSupport.getInstance();
    }

    public static void LIZ(final int i, final Effect effect, final Function2 function2) {
        EffectManager effectManagerLLJILJILJ = ((InterfaceC1635410sex) LIZJ.getValue()).LLJILJILJ();
        if (effectManagerLLJILJILJ == null) {
            return;
        }
        if (effectManagerLLJILJILJ.isEffectReady(effect) && effectManagerLLJILJILJ.isEffectDownloaded(effect)) {
            function2.invoke(Boolean.FALSE, effect);
        } else {
            effectManagerLLJILJILJ.fetchEffect(effect, new IFetchEffectListener() { // from class: X.10yv
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect2) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect2) {
                    C20010313Rd c20010313Rd = C20010313Rd.LIZ;
                    int i2 = i;
                    Function2<Boolean, Effect, Unit> function22 = function2;
                    c20010313Rd.getClass();
                    C20010313Rd.LIZ(i2, effect2, function22);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                    int i2 = i;
                    if (i2 >= 2) {
                        function2.invoke(Boolean.TRUE, effect2);
                        return;
                    }
                    C20010313Rd c20010313Rd = C20010313Rd.LIZ;
                    Effect effect3 = effect;
                    Function2<Boolean, Effect, Unit> function22 = function2;
                    c20010313Rd.getClass();
                    C20010313Rd.LIZ(i2 + 1, effect3, function22);
                }
            });
        }
    }
}
