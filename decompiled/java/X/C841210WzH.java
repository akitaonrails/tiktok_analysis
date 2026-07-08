package X;

import com.bytedance.helios.api.config.DomainRange;
import com.bytedance.helios.api.config.PathRange;
import com.bytedance.helios.api.config.ValueCondition;
import com.bytedance.helios.network.api.config.InventoryConfig;
import com.bytedance.helios.network.api.config.NetworkCondition;
import com.bytedance.helios.network.api.config.RangeConf;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0WzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841210WzH {
    public static final NetworkCondition LIZ(com.bytedance.helios.api.config.NetworkCondition networkCondition) {
        List<ValueCondition> list = networkCondition.domainCondition;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (ValueCondition valueCondition : list) {
            arrayList.add(new com.bytedance.helios.network.api.config.ValueCondition(valueCondition.match, valueCondition.targets, valueCondition.sampleRate));
        }
        List<ValueCondition> list2 = networkCondition.pathCondition;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (ValueCondition valueCondition2 : list2) {
            arrayList2.add(new com.bytedance.helios.network.api.config.ValueCondition(valueCondition2.match, valueCondition2.targets, valueCondition2.sampleRate));
        }
        List<ValueCondition> list3 = networkCondition.urlCondition;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        for (ValueCondition valueCondition3 : list3) {
            arrayList3.add(new com.bytedance.helios.network.api.config.ValueCondition(valueCondition3.match, valueCondition3.targets, valueCondition3.sampleRate));
        }
        return new NetworkCondition(arrayList, arrayList2, arrayList3);
    }

    public static final InventoryConfig LIZIZ(com.bytedance.helios.api.config.InventoryConfig inventoryConfig) {
        return new InventoryConfig(inventoryConfig.enabled, inventoryConfig.sample, inventoryConfig.stackSample, inventoryConfig.headerSample, inventoryConfig.querySample, inventoryConfig.bodySample, inventoryConfig.cookieSample, LIZ(inventoryConfig.specified));
    }

    public static final RangeConf LIZJ(com.bytedance.helios.api.config.RangeConf rangeConf) {
        Set<Integer> set = rangeConf.targets;
        Set<String> set2 = rangeConf.schemes;
        DomainRange domainRange = rangeConf.domains;
        com.bytedance.helios.network.api.config.DomainRange domainRange2 = new com.bytedance.helios.network.api.config.DomainRange(domainRange.allowList, domainRange.blockList, domainRange.encryptBlockList, domainRange.endWithAllowList, domainRange.endWithBlockList);
        PathRange pathRange = rangeConf.paths;
        return new RangeConf(set, set2, domainRange2, new com.bytedance.helios.network.api.config.PathRange(pathRange.allowList, pathRange.blockList, pathRange.startWithAllowList, pathRange.startWithBlockList));
    }
}
