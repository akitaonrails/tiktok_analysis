package X;

import Y.ARunnableS4S0111000_23;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Message;
import android.util.Pair;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.model.Response;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.model.NGSettings;
import com.bytedance.geckox.settings.model.SettingsLocal;
import com.bytedance.geckox.settings.model.SettingsRequestBody;
import com.bytedance.geckox.task.HandlerTimerTask;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0qUF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551890qUF {
    public final Context LIZ;
    public final GeckoGlobalConfig LIZIZ;
    public GlobalConfigSettings LIZJ;
    public NGSettings LIZLLL;
    public final C1552400qV4 LJ;
    public int LJFF;
    public int LJI;
    public final C1551490qTb LJII;
    public final C1552090qUZ LJIIIZ;
    public boolean LJIIIIZZ = true;
    public final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public final AtomicBoolean LJIIJJI = new AtomicBoolean(false);

    public final void LIZIZ() {
        GlobalConfigSettings.GlobalConfig globalConfig;
        GlobalConfigSettings.SettingsPollingConfig checkUpdate;
        GlobalConfigSettings globalConfigSettings = this.LIZJ;
        if (globalConfigSettings == null || (globalConfig = globalConfigSettings.getGlobalConfig()) == null || globalConfig.getPollEnable() != 1 || (checkUpdate = globalConfig.getCheckUpdate()) == null) {
            return;
        }
        long interval = checkUpdate.getInterval() * 1000;
        C1552430qV7 c1552430qV7 = C1553420qWi.LIZ;
        AbstractC1552990qW1 abstractC1552990qW1 = new AbstractC1552990qW1() { // from class: X.0qWC
            @Override // X.AbstractC1552990qW1
            public final int LIZIZ() {
                return 0;
            }

            @Override // X.AbstractC1552990qW1
            public final void LIZ() {
                this.LIZJ.LIZJ(3, false);
            }
        };
        HandlerTimerTask handlerTimerTask = c1552430qV7.LIZ;
        handlerTimerTask.LIZ();
        abstractC1552990qW1.LIZ = interval;
        Message messageObtainMessage = handlerTimerTask.LIZ.obtainMessage(0);
        messageObtainMessage.obj = abstractC1552990qW1;
        messageObtainMessage.what = 0;
        C786410Ut5.LJLJLJ(handlerTimerTask.LIZ, messageObtainMessage, interval);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1551890qUF(com.bytedance.geckox.GeckoGlobalConfig r11) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1551890qUF.<init>(com.bytedance.geckox.GeckoGlobalConfig):void");
    }

    public final void LIZJ(int i, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sync global settings start,req type:");
        sbLIZ.append(i);
        sbLIZ.append(",is reset:");
        sbLIZ.append(z);
        C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
        C1551510qTd.LIZ.LIZ().execute(new ARunnableS4S0111000_23(this, i, z, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(int i, GeckoGlobalConfig geckoGlobalConfig, int i2, int i3) throws NoSuchAlgorithmException {
        C1551140qT2 c1551140qT2LIZJ;
        int i4;
        Pair<String, String> requestTagHeader;
        C1553080qWA c1553080qWA = new C1553080qWA();
        c1553080qWA.LIZ = "settings_v1";
        c1553080qWA.LJFF = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(geckoGlobalConfig.getHost());
        sbLIZ.append("/gecko/api/settings/v1");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ArrayList arrayList = new ArrayList();
        try {
            String strLIZ = LIZ(i, geckoGlobalConfig, i2, i3, arrayList);
            C1553130qWF.LIZ("gecko-debug-tag", "settings request:", strLIZ);
            InterfaceC1504290pFT netWork = geckoGlobalConfig.getNetWork();
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig2 = c1551940qUK.LIZLLL;
            if (geckoGlobalConfig2 != null && (netWork instanceof InterfaceC1504270pFR)) {
                InterfaceC1504270pFR interfaceC1504270pFR = (InterfaceC1504270pFR) netWork;
                GeckoGlobalConfig.IRequestTagHeaderProvider requestTagHeaderProvider = geckoGlobalConfig2.getRequestTagHeaderProvider();
                HashMap map = new HashMap();
                if (requestTagHeaderProvider != null && (requestTagHeader = requestTagHeaderProvider.getRequestTagHeader(true)) != null) {
                    map.put((String) requestTagHeader.first, (String) requestTagHeader.second);
                }
                c1551140qT2LIZJ = interfaceC1504270pFR.doPost(strLIZIZ, strLIZ, map);
            } else {
                c1551140qT2LIZJ = netWork.LIZJ(strLIZIZ, strLIZ);
            }
            c1553080qWA.LIZJ = c1551140qT2LIZJ.LIZJ;
            String strLIZ2 = C1336110ksD.LIZ("X-Tt-Logid", "", c1551140qT2LIZJ.LIZ);
            c1553080qWA.LIZIZ = strLIZ2;
            C1553130qWF.LIZ("gecko-debug-tag", "settings response log id", strLIZ2);
            C1551020qSq.LJI(geckoGlobalConfig.getContext(), c1551140qT2LIZJ);
            int i5 = c1551140qT2LIZJ.LIZJ;
            if (i5 == 200) {
                String str = c1551140qT2LIZJ.LIZIZ;
                try {
                    Type type = new TypeToken<Response<GlobalConfigSettings>>() { // from class: X.0qW4
                    }.getType();
                    C1551400qTS c1551400qTS = C1551400qTS.LIZIZ;
                    Response response = (Response) c1551400qTS.LIZ.LJIIIIZZ(str, type);
                    int i6 = response.status;
                    if (i6 != 2100) {
                        c1553080qWA.LIZLLL = i6;
                        c1553080qWA.LJ = response.msg;
                        C1551780qU4.LJIIJ(c1553080qWA);
                    }
                    int i7 = response.status;
                    if (i7 != 0 && i7 != 1103) {
                        this.LJIIIZ.LIZIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("request failed, , code=");
                        sbLIZ2.append(response.status);
                        sbLIZ2.append(", ");
                        sbLIZ2.append(response.msg);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C1552400qV4 c1552400qV4 = this.LJ;
                        int i8 = response.status;
                        List<AbstractC1553220qWO> list = c1552400qV4.LIZ;
                        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
                            C1553130qWF.LIZ("gecko-debug-tag", "global settings notify request error");
                            Iterator it2 = ((CopyOnWriteArrayList) c1552400qV4.LIZ).iterator();
                            while (it2.hasNext()) {
                                ((AbstractC1553220qWO) it2.next()).LIZJ(i8);
                            }
                        }
                        C1553130qWF.LIZ("gecko-debug-tag", "settings loop stop");
                        if (response.status == 2103) {
                            C1551490qTb c1551490qTb = this.LJII;
                            Context context = this.LIZ;
                            c1551490qTb.getClass();
                            C1553130qWF.LIZ("gecko-debug-tag", "settings cache deleted");
                            C1551420qTU c1551420qTU = C1551440qTW.LIZ;
                            c1551420qTU.LIZIZ(context);
                            c1551420qTU.LIZ.edit().remove("gecko_settings").apply();
                            c1551420qTU.LIZIZ(context);
                            c1551420qTU.LIZ.edit().remove("gecko_ng_settings").apply();
                            this.LIZJ = null;
                            this.LJFF = 0;
                            this.LJIIIIZZ = false;
                            HandlerTimerTask.TimeHandler timeHandler = C1553420qWi.LIZ.LIZ.LIZ;
                            if (timeHandler != null) {
                                timeHandler.removeMessages(0);
                            }
                            this.LJ.LIZIZ(null);
                            return;
                        }
                        if (this.LJIIIIZZ) {
                            this.LJIIIIZZ = false;
                            LIZIZ();
                            return;
                        }
                        return;
                    }
                    GlobalConfigSettings globalConfigSettings = (GlobalConfigSettings) response.data;
                    if (globalConfigSettings != null) {
                        String strLIZLLL = C08IP.LIZLLL(arrayList);
                        SettingsLocal settingsLocalLIZ = C1551490qTb.LIZ(geckoGlobalConfig.getContext());
                        if (settingsLocalLIZ == null) {
                            settingsLocalLIZ = new SettingsLocal(geckoGlobalConfig.getEnv().name(), geckoGlobalConfig.getAppVersion());
                        }
                        settingsLocalLIZ.setAccessKeysMd5(strLIZLLL);
                        C1551490qTb.LIZIZ(geckoGlobalConfig.getContext(), settingsLocalLIZ);
                        this.LJIIIZ.LIZIZ();
                        this.LJIIIIZZ = false;
                        NGSettings nGSettings = globalConfigSettings.ngSettings;
                        if (nGSettings != null && (i4 = nGSettings.version) > 0 && i4 != this.LJI) {
                            this.LIZLLL = nGSettings;
                            this.LJI = i4;
                            C1551490qTb c1551490qTb2 = this.LJII;
                            Context context2 = this.LIZ;
                            c1551490qTb2.getClass();
                            C1553130qWF.LIZ("gecko-debug-tag", "NG settings cache stored");
                            C1551440qTW.LIZ.LIZJ(context2, "gecko_ng_settings", GsonProtectorUtils.toJson(c1551400qTS.LIZ, nGSettings));
                        }
                        int version = globalConfigSettings.getVersion();
                        if (version > 0 && this.LJFF != version) {
                            this.LJFF = version;
                            this.LIZJ = globalConfigSettings;
                            globalConfigSettings.ngSettings = null;
                            C1551490qTb c1551490qTb3 = this.LJII;
                            Context context3 = this.LIZ;
                            c1551490qTb3.getClass();
                            C1553130qWF.LIZ("gecko-debug-tag", "settings cache stored");
                            C1551440qTW.LIZ.LIZJ(context3, "gecko_settings", GsonProtectorUtils.toJson(c1551400qTS.LIZ, globalConfigSettings));
                        }
                        HandlerTimerTask.TimeHandler timeHandler2 = C1553420qWi.LIZ.LIZ.LIZ;
                        if (timeHandler2 != null) {
                            timeHandler2.removeMessages(0);
                        }
                        GlobalConfigSettings globalConfigSettings2 = this.LIZJ;
                        globalConfigSettings2.ngSettings = this.LIZLLL;
                        this.LJ.LIZIZ(globalConfigSettings2);
                        LIZIZ();
                        return;
                    }
                    throw new C1550890qSd("get settings error,response data is null");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("json parse failed：");
                    sbLIZ3.append(str);
                    sbLIZ3.append(" caused by:");
                    sbLIZ3.append(e.getMessage());
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                    c1553080qWA.LJ = strLIZIZ2;
                    C1551780qU4.LJIIJ(c1553080qWA);
                    throw new C1553270qWT(strLIZIZ2, e);
                }
            }
            c1553080qWA.LIZLLL = i5;
            c1553080qWA.LJ = c1551140qT2LIZJ.LIZLLL;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("net work get failed, code: ");
            sbLIZ4.append(c1551140qT2LIZJ.LIZJ);
            sbLIZ4.append(", url:");
            sbLIZ4.append(strLIZIZ);
            throw new NetworkErrorException(C2188811AlT.LIZIZ(sbLIZ4));
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            c1553080qWA.LJ = e2.getMessage();
            C1551780qU4.LJIIJ(c1553080qWA);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("request failed：url:");
            sbLIZ5.append(strLIZIZ);
            throw new C1553280qWU(C2188811AlT.LIZIZ(sbLIZ5), e2);
        } catch (IllegalStateException e3) {
            TryCatchGuardChecker.doCheck(e3);
            c1553080qWA.LJ = e3.getMessage();
            C1551780qU4.LJIIJ(c1553080qWA);
            throw e3;
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            c1553080qWA.LJ = e4.getMessage();
            C1551780qU4.LJIIJ(c1553080qWA);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("request failed：url:");
            sbLIZ6.append(strLIZIZ);
            throw new C1553280qWU(C2188811AlT.LIZIZ(sbLIZ6), e4);
        }
    }

    public static String LIZ(int i, GeckoGlobalConfig geckoGlobalConfig, int i2, int i3, List list) throws NoSuchAlgorithmException {
        OptionCheckUpdateParams.CustomValue customValue;
        SettingsRequestBody settingsRequestBody = new SettingsRequestBody();
        Common common = new Common(geckoGlobalConfig.getAppId(), geckoGlobalConfig.getAppVersion(), geckoGlobalConfig.getDeviceId(), geckoGlobalConfig.getRegion());
        common.appName = C2362609No.LIZ(geckoGlobalConfig.getContext());
        settingsRequestBody.setCommon(common);
        settingsRequestBody.setSettings(new SettingsRequestBody.Settings(i2, geckoGlobalConfig.getEnv().getVal(), i3));
        Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> map = C797990VSb.LIZ.LIZIZ;
        if (map != null) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
            if (!concurrentHashMap.isEmpty()) {
                HashMap map2 = new HashMap();
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (entry.getValue() != null && (customValue = (OptionCheckUpdateParams.CustomValue) ((Map) entry.getValue()).get("business_version")) != null) {
                        Object key = entry.getKey();
                        HashMap map3 = new HashMap();
                        map3.put("business_version", customValue.getValue());
                        map2.put(key, map3);
                        ((ArrayList) list).add(key);
                    }
                }
                Collections.sort(list);
                if (i == 0) {
                    String strLIZLLL = C08IP.LIZLLL(list);
                    SettingsLocal settingsLocalLIZ = C1551490qTb.LIZ(geckoGlobalConfig.getContext());
                    if (settingsLocalLIZ != null && strLIZLLL.equals(settingsLocalLIZ.getAccessKeysMd5())) {
                        throw new IllegalStateException("business version has not been updated");
                    }
                }
                settingsRequestBody.setCustom(map2);
            }
        }
        return GsonProtectorUtils.toJson(C1551400qTS.LIZIZ.LIZ, settingsRequestBody);
    }
}
