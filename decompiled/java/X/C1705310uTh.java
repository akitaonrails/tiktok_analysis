package X;

import android.content.Context;
import android.os.Build;
import com.bef.effectsdk.EffectSDKBuildConfig;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import com.ss.android.ugc.effectmanager.common.ChunkResponseCallback;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705310uTh extends AbstractC1704900uT2<EffectManager> implements InterfaceC1705430uTt {
    public final Map<String, n> LJ;
    public final ConcurrentHashMap<String, Effect> LIZIZ = new ConcurrentHashMap<>();
    public final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final C1705360uTm LIZJ = C1706360uVO.LIZ().LIZ();

    @Override // X.InterfaceC1705430uTt
    public final Object LJIJ(Effect effect, InterfaceC1364105Vn<? super n> interfaceC1364105Vn) {
        return LJJIIJ(this, effect, interfaceC1364105Vn);
    }

    @Override // X.AbstractC1704900uT2
    public final EffectManager LJIJJLI() {
        C1706630uVp.LJFF("DefaultResourceProvider", "createEpInstance");
        if (!DownloadableModelSupport.isInitialized()) {
            C1706630uVp.LJFF("DefaultResourceProvider", "DownloadableModelSupport init");
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            DownloadableModelConfig.Builder builder = new DownloadableModelConfig.Builder();
            builder.setAssetManager(contextLIZ.getAssets());
            builder.setJsonConverter(new IJsonConverter() { // from class: X.09Ee
                public final Gson LIZ = new Gson();

                @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
                public final <T> String convertObjToJson(T t) {
                    return GsonProtectorUtils.toJson(this.LIZ, t);
                }

                @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
                public final <T> T convertJsonToObj(InputStream inputStream, Class<T> cls) {
                    return (T) GsonProtectorUtils.fromJson(this.LIZ, (Reader) new InputStreamReader(inputStream, "UTF-8"), (Class) cls);
                }
            });
            builder.setAppId(this.LIZJ.LIZ);
            builder.setAccessKey(this.LIZJ.LJIIL);
            builder.setDeviceType(Build.MODEL);
            List<String> list = this.LIZJ.LJIIJJI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new Host(it2.next()));
            }
            builder.setHosts(arrayList);
            builder.setBid(String.valueOf(this.LIZJ.LJIIIIZZ));
            builder.setSdkVersion(EffectSDKBuildConfig.getSdkVersion());
            builder.setWorkspace(this.LIZJ.LJIIJ);
            builder.setContext(contextLIZ);
            builder.setEffectNetWorker(new IEffectNetWorker() { // from class: X.0XSB
                public final C0XSC LIZ = (C0XSC) C1706510uVd.LIZ().LIZ(C0XSC.class);

                @Override // com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
                public final /* synthetic */ void executeChunked(EffectRequest effectRequest, ChunkResponseCallback chunkResponseCallback) {
                    C0XSA.LIZ(this, effectRequest, chunkResponseCallback);
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[Catch: Exception -> 0x0072, IOException -> 0x007e, TryCatch #2 {IOException -> 0x007e, Exception -> 0x0072, blocks: (B:3:0x0006, B:5:0x0013, B:7:0x001f, B:8:0x0038, B:10:0x0044, B:12:0x0048, B:19:0x0062, B:23:0x006a, B:14:0x0056, B:16:0x005a, B:13:0x0051), top: B:31:0x0006 }] */
                @Override // com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.io.InputStream execute(com.ss.android.ugc.effectmanager.common.EffectRequest r7) {
                    /*
                        r6 = this;
                        java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                        r4.<init>()
                        r5 = 0
                        java.lang.String r1 = "GET"
                        java.lang.String r0 = r7.getHttpMethod()     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        r3 = 0
                        if (r0 == 0) goto L51
                        java.lang.String r1 = r7.getUrl()     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        java.lang.String r0 = "&app_version="
                        boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r3)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        if (r0 == 0) goto L51
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        java.lang.String r0 = r7.getUrl()     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        r1.append(r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        java.lang.String r0 = "&os_version="
                        r1.append(r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        r1.append(r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    L38:
                        java.lang.String r1 = "POST"
                        java.lang.String r0 = r7.getHttpMethod()     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        if (r0 == 0) goto L56
                        X.0XSC r1 = r6.LIZ     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        if (r1 == 0) goto L5f
                        java.util.Map r0 = r7.getParams()     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        X.0XSD r2 = r1.doPost(r2, r4, r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        goto L60
                    L51:
                        java.lang.String r2 = r7.getUrl()     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        goto L38
                    L56:
                        X.0XSC r0 = r6.LIZ     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        if (r0 == 0) goto L5f
                        X.0XSD r2 = r0.doGet(r2, r4)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        goto L60
                    L5f:
                        r2 = r5
                    L60:
                        if (r2 == 0) goto L68
                        boolean r1 = r2.LIZ     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        r0 = 1
                        if (r1 != r0) goto L68
                        r3 = 1
                    L68:
                        if (r3 == 0) goto L89
                        long r0 = r2.LIZJ     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        r7.setContentLength(r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        java.io.InputStream r0 = r2.LIZIZ     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                        return r0
                    L72:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        java.lang.String r0 = r0.getMessage()
                        r7.setErrorMsg(r0)
                        return r5
                    L7e:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        java.lang.String r0 = r0.getMessage()
                        r7.setErrorMsg(r0)
                    L89:
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0XSB.execute(com.ss.android.ugc.effectmanager.common.EffectRequest):java.io.InputStream");
                }
            });
            builder.setExecutor(new Executor() { // from class: X.059t
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C13074059s(runnable, null), 3);
                }
            });
            DownloadableModelSupport.initialize(builder.build());
        }
        EffectManager effectManager = new EffectManager();
        EffectConfiguration.Builder builder2 = new EffectConfiguration.Builder();
        builder2.accessKey(this.LIZJ.LJIIL);
        builder2.channel(this.LIZJ.LJFF);
        builder2.sdkVersion(EffectSDKBuildConfig.getSdkVersion());
        builder2.appVersion(this.LIZJ.LIZIZ);
        builder2.platform("android");
        builder2.appLanguage(this.LIZJ.LJ);
        builder2.region(this.LIZJ.LIZLLL);
        builder2.deviceType(Build.MODEL);
        builder2.setUnzipSolution(((Boolean) C04QT.LIZ.getValue()).booleanValue() ? EffectConfiguration.UnZipSolution.UNZIP3 : ((Boolean) C278810AwJ.LIZ.getValue()).booleanValue() ? EffectConfiguration.UnZipSolution.MINI_ZIP : EffectConfiguration.UnZipSolution.NEW_SOLUTION);
        builder2.deviceId(this.LIZJ.LIZJ);
        builder2.effectDir(new C0VSJ(this.LIZJ.LJIIIZ));
        builder2.JsonConverter(new IJsonConverter() { // from class: X.09Ee
            public final Gson LIZ = new Gson();

            @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
            public final <T> String convertObjToJson(T t) {
                return GsonProtectorUtils.toJson(this.LIZ, t);
            }

            @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
            public final <T> T convertJsonToObj(InputStream inputStream, Class<T> cls) {
                return (T) GsonProtectorUtils.fromJson(this.LIZ, (Reader) new InputStreamReader(inputStream, "UTF-8"), (Class) cls);
            }
        });
        builder2.effectMaxCacheSize(Long.MAX_VALUE);
        builder2.effectNetWorker(new IEffectNetWorker() { // from class: X.0XSB
            public final C0XSC LIZ = (C0XSC) C1706510uVd.LIZ().LIZ(C0XSC.class);

            @Override // com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
            public final /* synthetic */ void executeChunked(EffectRequest effectRequest, ChunkResponseCallback chunkResponseCallback) {
                C0XSA.LIZ(this, effectRequest, chunkResponseCallback);
            }

            @Override // com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
            public final InputStream execute(EffectRequest v) {
                /*
                    this = this;
                    java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                    r4.<init>()
                    r5 = 0
                    java.lang.String r1 = "GET"
                    java.lang.String r0 = r7.getHttpMethod()     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    r3 = 0
                    if (r0 == 0) goto L51
                    java.lang.String r1 = r7.getUrl()     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    java.lang.String r0 = "&app_version="
                    boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r3)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    if (r0 == 0) goto L51
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    java.lang.String r0 = r7.getUrl()     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    r1.append(r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    java.lang.String r0 = "&os_version="
                    r1.append(r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    r1.append(r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                L38:
                    java.lang.String r1 = "POST"
                    java.lang.String r0 = r7.getHttpMethod()     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    if (r0 == 0) goto L56
                    X.0XSC r1 = r6.LIZ     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    if (r1 == 0) goto L5f
                    java.util.Map r0 = r7.getParams()     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    X.0XSD r2 = r1.doPost(r2, r4, r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    goto L60
                L51:
                    java.lang.String r2 = r7.getUrl()     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    goto L38
                L56:
                    X.0XSC r0 = r6.LIZ     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    if (r0 == 0) goto L5f
                    X.0XSD r2 = r0.doGet(r2, r4)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    goto L60
                L5f:
                    r2 = r5
                L60:
                    if (r2 == 0) goto L68
                    boolean r1 = r2.LIZ     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    r0 = 1
                    if (r1 != r0) goto L68
                    r3 = 1
                L68:
                    if (r3 == 0) goto L89
                    long r0 = r2.LIZJ     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    r7.setContentLength(r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    java.io.InputStream r0 = r2.LIZIZ     // Catch: java.lang.Exception -> L72 java.io.IOException -> L7e
                    return r0
                L72:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    java.lang.String r0 = r0.getMessage()
                    r7.setErrorMsg(r0)
                    return r5
                L7e:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    java.lang.String r0 = r0.getMessage()
                    r7.setErrorMsg(r0)
                L89:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0XSB.execute(com.ss.android.ugc.effectmanager.common.EffectRequest):java.io.InputStream");
            }
        });
        List<String> list2 = this.LIZJ.LJIIJJI;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<String> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new Host(it3.next()));
        }
        builder2.hosts(arrayList2);
        if (C13Q5.LIZJ()) {
            builder2.knEffectFetcher(new InterfaceC19997313Md() { // from class: X.13Q2
                public final C13NP LIZ = C13Q5.LIZ().LIZIZ();

                @Override // X.InterfaceC19997313Md
                public final C13NN<C13NR> LIZ(C13NQ c13nq) {
                    C13NJ c13njLIZ;
                    C13QC<ResourceFinder, C13NJ> c13qcLIZ = C2174321A7q.LIZ();
                    if (c13qcLIZ != null && (c13njLIZ = c13qcLIZ.LIZ()) != null) {
                        c13nq.LIZLLL = c13njLIZ;
                    }
                    return this.LIZ.LIZ(c13nq);
                }
            });
        }
        C844470XAv.LIZ.getClass();
        builder2.context(C844470XAv.LIZ());
        builder2.retryCount(this.LIZJ.LJI);
        builder2.backupUrlRetryCount(this.LIZJ.LJII);
        builder2.appID(this.LIZJ.LIZ);
        builder2.region(this.LIZJ.LIZLLL);
        effectManager.init(builder2.build());
        return effectManager;
    }

    public C1705310uTh() {
        C1706630uVp.LJFF("DefaultResourceProvider", "appConfig");
        this.LJ = new LinkedHashMap();
    }

    public static boolean LJJIIJZLJL() {
        if (!C255870A0z.LIZ()) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        return !NetworkUtils.isNetworkAvailable(C844470XAv.LIZ());
    }

    @Override // X.InterfaceC1705430uTt
    public final EffectManager LIZLLL() {
        return LJIL();
    }

    @Override // X.InterfaceC1705430uTt
    public final Map<String, Effect> LIZIZ(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            Effect effect = this.LIZIZ.get(obj);
            if (effect != null) {
                arrayList.add(new Pair(obj, effect));
            }
        }
        return C2097608Jq.LJIILLIIL(arrayList);
    }

    @Override // X.InterfaceC1705430uTt
    public final boolean LJFF(String str) {
        try {
            Effect effect = this.LIZIZ.get(str);
            if (effect != null) {
                return LJIL().getEffectPlatform().LJIJ(effect);
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final void LJJI(CategoryPageModel categoryPageModel) {
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null) {
            LJJ(this.LIZIZ, effects);
        }
    }

    public static void LJJ(ConcurrentHashMap concurrentHashMap, List list) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Effect effect = (Effect) it2.next();
                concurrentHashMap.put(effect.getEffect_id(), effect);
            }
        }
    }

    @Override // X.InterfaceC1705430uTt
    public final void LIZ(InterfaceC1705380uTo interfaceC1705380uTo, String str) {
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C1704680uSg(this, str, interfaceC1705380uTo, null), 3);
    }

    @Override // X.InterfaceC1705430uTt
    public final Object LIZJ(String str, InterfaceC1364105Vn<? super C1704730uSl<Effect>> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        LJIL().fetchEffect(str, new C1775990wJh(this, c2252611DEt, 1));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // X.InterfaceC1705430uTt
    public final Object LJ(List<String> list, InterfaceC1364105Vn<? super C1704730uSl<List<Effect>>> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        LJIL().fetchEffectList(list, new C1776000wJi(this, c2252611DEt, 1));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // X.InterfaceC1705430uTt
    public final void LJI(final InterfaceC1705380uTo interfaceC1705380uTo, final String str) {
        String[] strArrLJIIIZ;
        if (LJJIIJZLJL()) {
            interfaceC1705380uTo.LIZIZ(str, true);
            return;
        }
        LJIL();
        DownloadableModelSupport downloadableModelSupport = DownloadableModelSupport.getInstance();
        int i = this.LIZJ.LJIIIIZZ;
        InterfaceC1736600vIA interfaceC1736600vIALIZ = C1706370uVP.LIZ();
        if (interfaceC1736600vIALIZ == null || (strArrLJIIIZ = interfaceC1736600vIALIZ.LJIIIZ(str)) == null) {
            strArrLJIIIZ = new String[0];
        }
        downloadableModelSupport.fetchResourcesWithModelNames(i, strArrLJIIIZ, new FetchResourcesListener() { // from class: X.0uTn
            @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
            public final void onSuccess() {
                interfaceC1705380uTo.LIZIZ(str, false);
            }

            @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
            public final void onFailed(Exception exc) {
                String message;
                InterfaceC1705380uTo<String> interfaceC1705380uTo2 = interfaceC1705380uTo;
                if (exc != null) {
                    message = exc.getMessage();
                } else {
                    message = null;
                }
                interfaceC1705380uTo2.LIZ(-1, message);
            }
        });
    }

    @Override // X.InterfaceC1705430uTt
    public final void LJIIJ(InterfaceC1705380uTo interfaceC1705380uTo, String str) {
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C1704670uSf(this, str, interfaceC1705380uTo, null), 3);
    }

    @Override // X.InterfaceC1705430uTt
    public final Object LJIILIIL(Effect effect, InterfaceC1364105Vn<? super C1704730uSl<Effect>> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        LJIL().fetchEffect(effect, new C1775990wJh(this, c2252611DEt, 0));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // X.InterfaceC1705430uTt
    public final Object LJIIZILJ(List<String> list, InterfaceC1364105Vn<? super C1704730uSl<List<Effect>>> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        LJIL().fetchEffectList(list, false, new IFetchEffectListListener() { // from class: X.0uT5
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
                int errorCode;
                String msg;
                if (exceptionResult != null) {
                    errorCode = exceptionResult.getErrorCode();
                } else {
                    errorCode = -1;
                }
                Integer numValueOf = Integer.valueOf(errorCode);
                if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
                    msg = "fetchEffectByIds failed";
                }
                C1704730uSl c1704730uSl = new C1704730uSl(numValueOf, msg, null);
                C189200o6.m2constructorimpl(c1704730uSl);
                c2252611DEt.resumeWith(c1704730uSl);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<Effect> list2) {
                InterfaceC20236714Gf<C1704730uSl<List<Effect>>> interfaceC20236714Gf = c2252611DEt;
                C1704730uSl c1704730uSl = new C1704730uSl(list2);
                C189200o6.m2constructorimpl(c1704730uSl);
                interfaceC20236714Gf.resumeWith(c1704730uSl);
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // X.InterfaceC1705430uTt
    public final void LJIJI(Effect effect, InterfaceC1705380uTo<? super Effect> interfaceC1705380uTo) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null) && 1 != 0) {
            if (LJIL().isEffectReady(effect)) {
                interfaceC1705380uTo.LIZIZ(effect, true);
                return;
            } else {
                C23250099c.LIZLLL(this.LIZLLL, null, null, new C1704830uSv(this, effect, interfaceC1705380uTo, null), 3);
                return;
            }
        }
        interfaceC1705380uTo.LIZ(-1, "");
    }

    public final Object LJJIFFI(Effect effect, InterfaceC1364105Vn<? super C1704730uSl<Effect>> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        if (LJIL().isEffectReady(effect)) {
            C1704730uSl c1704730uSl = new C1704730uSl(effect);
            C189200o6.m2constructorimpl(c1704730uSl);
            c2252611DEt.resumeWith(c1704730uSl);
        } else {
            if (LJIL().isEffectDownloading(effect)) {
                c2252611DEt.LJJIIZ(null);
            }
            LJIL().downloadEffectList(Collections.singletonList(effect), new C1776000wJi(this, c2252611DEt, 0));
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final Object LJJIII(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        LJIL().fetchEffectList(str, false, (IFetchEffectChannelListener) new C1776020wJk(c2252611DEt, 0));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJJIIJ(X.C1705310uTh r8, com.ss.android.ugc.effectmanager.effect.model.Effect r9, X.InterfaceC1364105Vn<? super com.google.gson.n> r10) {
        /*
            boolean r0 = r10 instanceof X.C1705000uTC
            if (r0 == 0) goto L98
            r5 = r10
            X.0uTC r5 = (X.C1705000uTC) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r1 = r5.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r4 = 2
            r7 = 1
            r3 = 0
            if (r0 == 0) goto L27
            if (r0 == r7) goto L7b
            if (r0 != r4) goto L9f
            X.C155000ia.LIZIZ(r1)
        L26:
            return r1
        L27:
            X.C155000ia.LIZIZ(r1)
            if (r9 == 0) goto La7
            java.lang.String r2 = r9.getTransResPath()
            if (r2 == 0) goto La7
            boolean r0 = kotlin.text.a0.LJJJIL(r2)
            if (r0 == 0) goto L39
            return r3
        L39:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r2)
            java.lang.String r0 = "/trans.json"
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            java.util.Map<java.lang.String, com.google.gson.n> r0 = r8.LJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L54
            return r0
        L54:
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r2)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L84
            android.app.Application r0 = X.C0CHQ.LIZ
            boolean r0 = com.ss.android.ugc.effectmanager.common.utils.NetworkUtils.isNetworkAvailable(r0)
            if (r0 == 0) goto L84
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0uTB r0 = new X.0uTB
            r0.<init>(r9, r3)
            r5.LL = r8
            r5.LLILLJJLI = r2
            r5.LLILZIL = r7
            java.lang.Object r0 = X.C23250099c.LJI(r5, r1, r0)
            if (r0 != r6) goto L84
            return r6
        L7b:
            java.lang.Object r2 = r5.LLILLJJLI
            java.lang.String r2 = (java.lang.String) r2
            X.0uTh r8 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L84:
            X.1DFB r1 = X.C0PEM.LIZJ
            X.08kE r0 = new X.08kE
            r0.<init>(r8, r2, r3)
            r5.LL = r3
            r5.LLILLJJLI = r3
            r5.LLILZIL = r4
            java.lang.Object r1 = X.C23250099c.LJI(r5, r1, r0)
            if (r1 != r6) goto L26
            return r6
        L98:
            X.0uTC r5 = new X.0uTC
            r5.<init>(r8, r10)
            goto L12
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1705310uTh.LJJIIJ(X.0uTh, com.ss.android.ugc.effectmanager.effect.model.Effect, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1705430uTt
    public final void LJII(String str, final AbstractC1705810uUV abstractC1705810uUV, final InterfaceC1705380uTo interfaceC1705380uTo) {
        LJIL().fetchPanelInfoFromCache(str, false, "", Integer.MAX_VALUE, 0, 0, new IFetchPanelInfoListener() { // from class: X.0uTl
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
            public final void onFail(ExceptionResult exceptionResult) {
                Integer numValueOf;
                InterfaceC1705380uTo<Object> interfaceC1705380uTo2 = interfaceC1705380uTo;
                if (interfaceC1705380uTo2 != null) {
                    String msg = null;
                    if (exceptionResult != null) {
                        numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                        msg = exceptionResult.getMsg();
                    } else {
                        numValueOf = null;
                    }
                    interfaceC1705380uTo2.LIZ(numValueOf, msg);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(PanelInfoModel panelInfoModel) {
                AssetsLibData assetsLibDataLJ = abstractC1705810uUV.LJ(panelInfoModel);
                InterfaceC1705380uTo<Object> interfaceC1705380uTo2 = interfaceC1705380uTo;
                if (interfaceC1705380uTo2 != null) {
                    interfaceC1705380uTo2.LIZIZ(assetsLibDataLJ, false);
                }
            }
        });
    }

    @Override // X.InterfaceC1705430uTt
    public final void LJIIIIZZ(final String str, final C1705900uUe c1705900uUe, final C1706000uUo c1706000uUo) {
        final boolean zLJJIIJZLJL = LJJIIJZLJL();
        LJIL().fetchPanelInfoFromCache(str, false, "", Integer.MAX_VALUE, 0, new IFetchPanelInfoListener() { // from class: X.0uTi
            public final /* synthetic */ int LJFF = Integer.MAX_VALUE;
            public final /* synthetic */ int LJI = 0;

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
            public final void onFail(ExceptionResult exceptionResult) {
                Integer numValueOf;
                InterfaceC1705380uTo<Object> interfaceC1705380uTo = c1706000uUo;
                if (interfaceC1705380uTo != null) {
                    String msg = null;
                    if (exceptionResult != null) {
                        numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                        msg = exceptionResult.getMsg();
                    } else {
                        numValueOf = null;
                    }
                    interfaceC1705380uTo.LIZ(numValueOf, msg);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(PanelInfoModel panelInfoModel) {
                AssetsLibData assetsLibDataLJ = c1705900uUe.LJ(panelInfoModel);
                InterfaceC1705380uTo<Object> interfaceC1705380uTo = c1706000uUo;
                if (interfaceC1705380uTo != null) {
                    interfaceC1705380uTo.LIZIZ(assetsLibDataLJ, false);
                }
                if (!zLJJIIJZLJL) {
                    C1705310uTh c1705310uTh = this;
                    C23250099c.LIZLLL(c1705310uTh.LIZLLL, null, null, new C1704840uSw(c1705310uTh, str, this.LJFF, this.LJI, null), 3);
                }
            }
        });
    }

    @Override // X.InterfaceC1705430uTt
    public final <T> void LJIIL(String str, AbstractC1705800uUU<T> abstractC1705800uUU, InterfaceC1705380uTo<? super T> interfaceC1705380uTo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("panelFetch panel ");
        sbLIZ.append(str);
        C1706630uVp.LJFF("DefaultResourceProvider", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C1704880uT0(this, str, LJJIIJZLJL(), abstractC1705800uUU, interfaceC1705380uTo, null), 3);
    }

    @Override // X.InterfaceC1705430uTt
    public final void LJIILL(String str, final AbstractC1705810uUV abstractC1705810uUV, final InterfaceC1705380uTo interfaceC1705380uTo) {
        if (LJJIIJZLJL()) {
            LJIL().fetchPanelInfoFromCache(str, false, "", Integer.MAX_VALUE, 0, 0, new IFetchPanelInfoListener() { // from class: X.0uTj
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
                public final void onFail(ExceptionResult exceptionResult) {
                    Integer numValueOf;
                    InterfaceC1705380uTo<Object> interfaceC1705380uTo2 = interfaceC1705380uTo;
                    if (interfaceC1705380uTo2 != null) {
                        String msg = null;
                        if (exceptionResult != null) {
                            numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                            msg = exceptionResult.getMsg();
                        } else {
                            numValueOf = null;
                        }
                        interfaceC1705380uTo2.LIZ(numValueOf, msg);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(PanelInfoModel panelInfoModel) {
                    AssetsLibData assetsLibDataLJ = abstractC1705810uUV.LJ(panelInfoModel);
                    InterfaceC1705380uTo<Object> interfaceC1705380uTo2 = interfaceC1705380uTo;
                    if (interfaceC1705380uTo2 != null) {
                        interfaceC1705380uTo2.LIZIZ(assetsLibDataLJ, true);
                    }
                }
            });
        } else {
            LJIL().fetchPanelInfo(str, false, "", Integer.MAX_VALUE, 0, new IFetchPanelInfoListener() { // from class: X.0uTk
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
                public final void onFail(ExceptionResult exceptionResult) {
                    Integer numValueOf;
                    InterfaceC1705380uTo<Object> interfaceC1705380uTo2 = interfaceC1705380uTo;
                    if (interfaceC1705380uTo2 != null) {
                        String msg = null;
                        if (exceptionResult != null) {
                            numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                            msg = exceptionResult.getMsg();
                        } else {
                            numValueOf = null;
                        }
                        interfaceC1705380uTo2.LIZ(numValueOf, msg);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(PanelInfoModel panelInfoModel) {
                    AssetsLibData assetsLibDataLJ = abstractC1705810uUV.LJ(panelInfoModel);
                    InterfaceC1705380uTo<Object> interfaceC1705380uTo2 = interfaceC1705380uTo;
                    if (interfaceC1705380uTo2 != null) {
                        interfaceC1705380uTo2.LIZIZ(assetsLibDataLJ, false);
                    }
                }
            }, C2097608Jq.LJ());
        }
    }

    @Override // X.InterfaceC1705430uTt
    public final void LJIILJJIL(boolean z, final String str, final int i, final String str2, final C1705880uUc c1705880uUc) {
        final boolean zLJJIIJZLJL = LJJIIJZLJL();
        if (!z && !zLJJIIJZLJL) {
            LJIL().fetchCategoryEffect("effecttoolsticker", str, 15, 0, i, str2, c1705880uUc);
        } else {
            LJIL().fetchCategoryEffectFromCache("effecttoolsticker", str, 15, 0, i, str2, new IFetchCategoryEffectListener() { // from class: X.0uSq
                public final /* synthetic */ String LIZLLL = "effecttoolsticker";
                public final /* synthetic */ int LJFF = 15;

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    c1705880uUc.onFail(exceptionResult);
                    if (!zLJJIIJZLJL) {
                        C1705310uTh c1705310uTh = this.LIZ;
                        C23250099c.LIZLLL(c1705310uTh.LIZLLL, null, null, new C1704770uSp(c1705310uTh, this.LIZLLL, str, this.LJFF, i, str2, null), 3);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel) {
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    this.LIZ.LJJI(categoryPageModel2);
                    c1705880uUc.onSuccess(categoryPageModel2);
                    if (!zLJJIIJZLJL) {
                        C1705310uTh c1705310uTh = this.LIZ;
                        C23250099c.LIZLLL(c1705310uTh.LIZLLL, null, null, new C1704750uSn(c1705310uTh, this.LIZLLL, str, this.LJFF, i, str2, null), 3);
                    }
                }
            });
        }
    }

    public final <T> Object LJJIIZ(AbstractC1705790uUT<T> abstractC1705790uUT, InterfaceC1705380uTo<? super T> interfaceC1705380uTo, CategoryPageModel categoryPageModel, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C1704920uT4(this, categoryPageModel, abstractC1705790uUT, interfaceC1705380uTo, z, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public final <T> Object LJJIIZI(AbstractC1705800uUU<T> abstractC1705800uUU, InterfaceC1705380uTo<? super T> interfaceC1705380uTo, EffectChannelResponse effectChannelResponse, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C1704910uT3(this, effectChannelResponse, abstractC1705800uUU, interfaceC1705380uTo, z, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1705430uTt
    public final void LJIIJJI(final String str, final int i, final String str2, final int i2, final String str3, final C1705980uUm c1705980uUm) {
        final boolean zLJJIIJZLJL = LJJIIJZLJL();
        LJIL().fetchCategoryEffectFromCache(str, str2, i, 0, i2, str3, new IFetchCategoryEffectListener() { // from class: X.0uSr
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                c1705980uUm.onFail(exceptionResult);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                CategoryPageModel categoryPageModel2 = categoryPageModel;
                this.LIZ.LJJI(categoryPageModel2);
                c1705980uUm.onSuccess(categoryPageModel2);
                if (!zLJJIIJZLJL) {
                    C1705310uTh c1705310uTh = this.LIZ;
                    C23250099c.LIZLLL(c1705310uTh.LIZLLL, null, null, new C1704760uSo(c1705310uTh, str, str2, i, i2, str3, null), 3);
                }
            }
        });
    }

    @Override // X.InterfaceC1705430uTt
    public final void LJIILLIIL(String str, int i, String str2, int i2, String str3, final C1705980uUm c1705980uUm) {
        LJIL().fetchCategoryEffectFromCache(str, str2, i, 0, i2, str3, new IFetchCategoryEffectListener() { // from class: X.0uSt
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                c1705980uUm.onFail(exceptionResult);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                CategoryPageModel categoryPageModel2 = categoryPageModel;
                this.LIZ.LJJI(categoryPageModel2);
                c1705980uUm.onSuccess(categoryPageModel2);
            }
        });
    }

    @Override // X.InterfaceC1705430uTt
    public final void LJIJJ(String str, int i, String str2, int i2, String str3, final C1705980uUm c1705980uUm) {
        if (LJJIIJZLJL()) {
            LJIL().fetchCategoryEffectFromCache(str, str2, i, 0, i2, str3, new IFetchCategoryEffectListener() { // from class: X.0uSs
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    c1705980uUm.onFail(exceptionResult);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel) {
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    this.LIZ.LJJI(categoryPageModel2);
                    c1705980uUm.onSuccess(categoryPageModel2);
                }
            });
        } else {
            LJIL().fetchCategoryEffect(str, str2, i, 0, i2, str3, c1705980uUm);
        }
    }

    public final Object LJJII(int i, int i2, int i3, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        LJIL().fetchCategoryEffect(str, str2, i, i2, i3, str3, new IFetchCategoryEffectListener() { // from class: X.0UEd
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                InterfaceC20236714Gf<CategoryPageModel> interfaceC20236714Gf = c2252611DEt;
                C189200o6.m2constructorimpl(null);
                interfaceC20236714Gf.resumeWith(null);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                InterfaceC20236714Gf<CategoryPageModel> interfaceC20236714Gf = c2252611DEt;
                C189200o6.m2constructorimpl(categoryPageModel);
                interfaceC20236714Gf.resumeWith(categoryPageModel);
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // X.InterfaceC1705430uTt
    public final <T> void LJIIIZ(String str, String str2, boolean z, AbstractC1705790uUT<T> abstractC1705790uUT, InterfaceC1705380uTo<? super T> interfaceC1705380uTo, int i, int i2, int i3, String str3) {
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C1704740uSm(z, LJJIIJZLJL(), this, str, str2, i2, i, i3, str3, abstractC1705790uUT, interfaceC1705380uTo, null), 3);
    }
}
