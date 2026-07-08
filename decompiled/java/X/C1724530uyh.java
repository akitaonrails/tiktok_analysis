package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.xbridge.AbsPipoIsAppInstalledMethodIDL;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1724530uyh extends AbsPipoIsAppInstalledMethodIDL {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object c098200Yq;
        String str;
        InterfaceC1724540uyi interfaceC1724540uyi = (InterfaceC1724540uyi) xBaseParamModel;
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("pipo_check_app_installed_enable", true)) {
                Type type = new TypeToken<List<AbsPipoIsAppInstalledMethodIDL.AppInfo>>() { // from class: X.04Zg
                }.getType();
                C1227904rF c1227904rF = C1227904rF.LIZ;
                String appList = interfaceC1724540uyi.getAppList();
                c1227904rF.getClass();
                List<AbsPipoIsAppInstalledMethodIDL.AppInfo> list = (List) C1227904rF.LIZJ(appList, type);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (AbsPipoIsAppInstalledMethodIDL.AppInfo appInfo : list) {
                    if (C1948507kB.LIZ(appInfo.appName)) {
                        String str2 = appInfo.appName;
                        if (C1716300ulQ.LIZJ(appInfo.packageName, appInfo.schema)) {
                            str = "1";
                        } else {
                            str = CardStruct.IStatusCode.DEFAULT;
                        }
                        linkedHashMap.put(str2, str);
                    }
                }
                XBaseModel xBaseModelLIZLLL = C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC1724550uyj.class));
                C1227904rF.LIZ.getClass();
                ((InterfaceC1724550uyj) xBaseModelLIZLLL).setCheckResult(C1227904rF.LJI(linkedHashMap));
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZLLL, "");
            } else {
                C2382909Vj.LIZ(completionBlock, -4, "check installed is refused by settings", null, 4);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C2382909Vj.LIZ(completionBlock, -3, String.valueOf(thM5exceptionOrNullimpl.getMessage()), null, 4);
        }
    }
}
