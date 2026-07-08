package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.sparklite.helper.SettingInfo;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0qLP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546410qLP {
    public static final C1546410qLP LIZ = new C1546410qLP();

    public static Map LIZ(List list) {
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        boolean z;
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SettingInfo settingInfo = (SettingInfo) it2.next();
            if (settingInfo.getExposure()) {
                arrayList2.add(settingInfo.getKey());
            }
            String key = settingInfo.getKey();
            String biz = settingInfo.getBiz();
            C1201920hNm c1201920hNm = EnumC1553730qXD.Companion;
            String type = settingInfo.getType();
            c1201920hNm.getClass();
            EnumC1553730qXD enumC1553730qXDLIZ = C1201920hNm.LIZ(type);
            if (key.length() > 0 && enumC1553730qXDLIZ != EnumC1553730qXD.UNSUPPORTED) {
                C1168200gVO c1168200gVO = new C1168200gVO(key, enumC1553730qXDLIZ);
                if (biz == null) {
                    biz = "";
                }
                c1168200gVO.LIZJ = biz;
                arrayList.add(c1168200gVO);
                linkedHashSet.add(key);
            }
        }
        String name = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IHybridDependencyService.class.getName();
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
        }
        List<C1168160gVK> settings = ((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin).getSettings(arrayList);
        C0C5P.LIZJ().getClass();
        C0C5P.LIZIZ(arrayList2, false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C1168160gVK c1168160gVK : settings) {
            linkedHashMap.put(c1168160gVK.LIZ, c1168160gVK.LIZIZ);
        }
        return linkedHashMap;
    }
}
