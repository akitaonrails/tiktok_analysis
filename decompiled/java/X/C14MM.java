package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ug.config.DynamicResource;
import com.ss.android.ugc.aweme.ug.dynamicresource.BackgroundTask;
import com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig;
import com.ss.android.ugc.aweme.ug.dynamicresource.IdleTask;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14MM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14MM<V> implements Callable {
    public static final C14MM<V> LL = new C14MM<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("DynamicResourceLoader@9eab.initDynamicResourceLoader$1");
        C1195904m5.LIZ.getClass();
        Iterator it2 = ((LinkedHashMap) C1195904m5.LIZIZ).entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                C14MJ.LIZ.getClass();
                if (C14MJ.LIZLLL) {
                    C14MJ.LIZLLL = false;
                    C14MJ.LJIIL("boot_finish_miss");
                }
                if (!C14MJ.LJ) {
                    C799900VZk.LIZ.getClass();
                    C799890VZj c799890VZj = new C799890VZj();
                    c799890VZj.LIZ(new BackgroundTask());
                    c799890VZj.LIZ(new IdleTask());
                    c799890VZj.LIZIZ();
                }
                C14MJ.LJ = true;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DynamicResourceLoader@9eab.initDynamicResourceLoader$1");
                return unit;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            DynamicResource[] dynamicResourceArr = (DynamicResource[]) SettingsManager.LIZLLL().LJIIIIZZ("ug_dynamic_resource_list", DynamicResource[].class, C14MR.LIZ);
            if (dynamicResourceArr == null || dynamicResourceArr.length == 0) {
                ConcurrentHashMap<String, C14MK<?>> concurrentHashMap = C14MJ.LIZIZ;
                C14MK<?> c14mk = concurrentHashMap.get(entry.getKey());
                if (c14mk == null) {
                    IDynamicResourceConfig iDynamicResourceConfig = (IDynamicResourceConfig) entry.getValue();
                    c14mk = new C14MK<>(iDynamicResourceConfig.key(), iDynamicResourceConfig.type(), "", iDynamicResourceConfig.priority(), "", 0, iDynamicResourceConfig.enable(), iDynamicResourceConfig.fallback());
                    c14mk.LIZJ();
                }
                concurrentHashMap.put((String) entry.getKey(), c14mk);
            } else {
                try {
                } catch (NoSuchElementException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                for (DynamicResource dynamicResource : dynamicResourceArr) {
                    if (Intrinsics.LJFF(dynamicResource.key, entry.getKey())) {
                        ConcurrentHashMap<String, C14MK<?>> concurrentHashMap2 = C14MJ.LIZIZ;
                        C14MK<?> c14mk2 = concurrentHashMap2.get(dynamicResource.key);
                        if (c14mk2 == null || !Intrinsics.LJFF(c14mk2.LLILZIL, dynamicResource.hash)) {
                            IDynamicResourceConfig iDynamicResourceConfig2 = (IDynamicResourceConfig) entry.getValue();
                            c14mk2 = new C14MK<>(iDynamicResourceConfig2.key(), iDynamicResourceConfig2.type(), dynamicResource.cdnUrl, iDynamicResourceConfig2.priority(), dynamicResource.hash, dynamicResource.size, iDynamicResourceConfig2.enable(), iDynamicResourceConfig2.fallback());
                            c14mk2.LIZJ();
                        }
                        concurrentHashMap2.put(dynamicResource.key, c14mk2);
                        C14MJ.LIZJ.add(c14mk2);
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
    }
}
