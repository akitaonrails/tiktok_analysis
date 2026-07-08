package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.incentive.crossplatform.experiment.IncentiveJsLogicModuleConfig;
import com.ss.android.ugc.incentive.crossplatform.experiment.IncentiveJsLogicModuleInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS143S1200000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893940zNw {
    public static final C01GW<C1893940zNw> LJI = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS217S0000000_28.get$arr$(417));
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final CopyOnWriteArraySet<String> LIZJ = new CopyOnWriteArraySet<>();
    public final C1DEV LIZLLL = C2191201ApK.LIZ();
    public final Map<String, C13E8<C1893990zO1>> LJ = new LinkedHashMap();
    public final Map<String, C13E8<C1893990zO1>> LJFF = new LinkedHashMap();

    public final void LIZ() {
        if (this.LIZ.get()) {
            return;
        }
        this.LIZ.set(true);
        ArrayList<C1893990zO1> arrayList = new ArrayList();
        Map<String, IncentiveJsLogicModuleInfo> map = ((IncentiveJsLogicModuleConfig) C1893960zNy.LIZIZ.getValue()).logicModuleInfos;
        if (map == null) {
            return;
        }
        for (Map.Entry<String, IncentiveJsLogicModuleInfo> entry : map.entrySet()) {
            String key = entry.getKey();
            IncentiveJsLogicModuleInfo value = entry.getValue();
            String str = value.jsLogicType;
            if (str != null && str.length() != 0 && value.triggerConfig != null) {
                C01U6.LIZIZ(new AwS143S1200000_28(key, (String) value, (IncentiveJsLogicModuleInfo) arrayList, (List<C1893990zO1>) 12));
            }
        }
        try {
            for (C1893990zO1 c1893990zO1 : arrayList) {
                for (EnumC1893950zNx enumC1893950zNx : c1893990zO1.LJII) {
                    String value2 = enumC1893950zNx.getValue();
                    if (Intrinsics.LJFF(value2, EnumC1893950zNx.TOUCH_POINT_WILL_SHOW.getValue())) {
                        String strLIZ = C0DUP.LIZ(c1893990zO1.LIZLLL, true);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(enumC1893950zNx.getValue());
                        sbLIZ.append('_');
                        sbLIZ.append(strLIZ);
                        value2 = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJ;
                    Object c13e8 = linkedHashMap.get(value2);
                    if (c13e8 == null) {
                        c13e8 = new C13E8();
                        linkedHashMap.put(value2, c13e8);
                    }
                    ((C13E8) c13e8).addLast(c1893990zO1);
                }
                for (String str2 : c1893990zO1.LJI) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.LJFF;
                    Object c13e82 = linkedHashMap2.get(str2);
                    if (c13e82 == null) {
                        c13e82 = new C13E8();
                        linkedHashMap2.put(str2, c13e82);
                    }
                    ((C13E8) c13e82).addLast(c1893990zO1);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
