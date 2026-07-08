package X;

import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.StrategyTriggerEvent;

/* JADX INFO: renamed from: X.0eYT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093230eYT implements InterfaceC1093320eYc, InterfaceC1093100eYG {
    public final StrategyTriggerEvent LIZ;
    public boolean LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(383));

    @Override // X.InterfaceC1093320eYc
    public final void stop() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop feature triggers, size=");
        List<String> list = this.LIZ.values;
        sbLIZ.append(list != null ? list.size() : 0);
        C227400uG.LIZ("FeatureTrigger", C2188811AlT.LIZIZ(sbLIZ));
        List<String> list2 = this.LIZ.values;
        if (list2 != null) {
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                C443120HZe c443120HZeLIZ = C206300qr.LIZ(it2.next());
                ((ILiveFeatureCenterService) this.LIZJ.getValue()).sl((String) c443120HZeLIZ.getSecond(), (String) c443120HZeLIZ.getThird(), this);
            }
        }
    }

    @Override // X.InterfaceC1093320eYc
    public final EnumC1093260eYW LIZ() {
        return EnumC1093260eYW.FEATURE;
    }

    @Override // X.InterfaceC1093320eYc
    public final boolean isFrozen() {
        return this.LIZIZ;
    }

    public C1093230eYT(StrategyTriggerEvent strategyTriggerEvent) {
        this.LIZ = strategyTriggerEvent;
        this.LIZIZ = false;
        this.LIZIZ = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start feature triggers, size=");
        List<String> list = strategyTriggerEvent.values;
        sbLIZ.append(list != null ? list.size() : 0);
        C227400uG.LIZ("FeatureTrigger", C2188811AlT.LIZIZ(sbLIZ));
        List<String> list2 = strategyTriggerEvent.values;
        if (list2 != null) {
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                C443120HZe c443120HZeLIZ = C206300qr.LIZ(it2.next());
                ((ILiveFeatureCenterService) this.LIZJ.getValue()).Ll((String) c443120HZeLIZ.getSecond(), (String) c443120HZeLIZ.getThird(), this);
            }
        }
    }

    @Override // X.InterfaceC1093320eYc
    public final boolean LIZIZ(C473440IhS c473440IhS) {
        List<String> list;
        if (!C1093310eYb.LIZ(this, c473440IhS) || (list = this.LIZ.values) == null || list.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            C443120HZe c443120HZeLIZ = C206300qr.LIZ(it2.next());
            String str = (String) c443120HZeLIZ.getSecond();
            String str2 = (String) c443120HZeLIZ.getThird();
            String str3 = c473440IhS.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('.');
            sbLIZ.append(str2);
            if (Intrinsics.LJFF(str3, C2188811AlT.LIZIZ(sbLIZ))) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1093100eYG
    public final void LIZJ(Object obj, Object obj2, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFeatureChange group=");
        sbLIZ.append(str2);
        sbLIZ.append(", key=");
        sbLIZ.append(str);
        sbLIZ.append(", oldValue=");
        sbLIZ.append(obj);
        sbLIZ.append(", newValue=");
        sbLIZ.append(obj2);
        C227400uG.LIZ("FeatureTrigger", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append('.');
        sbLIZ2.append(str);
        C1093270eYX.LIZ(new C473440IhS(C2188811AlT.LIZIZ(sbLIZ2), EnumC1093260eYW.FEATURE, C2097608Jq.LJIIJ(new Pair("oldValue", obj), new Pair("newValue", obj2))));
    }
}
