package X;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.DisplayInfo;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TimeInfo;
import com.bytedance.touchpoint.api.service.IMultiDomainService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS156S0400000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898260zUu {
    public static final C1898260zUu LIZ = new C1898260zUu();

    public static final Map<String, String> LIZ(C1898420zVA c1898420zVA) {
        int iIntValue;
        Map<String, String> map;
        DisplayInfo displayInfo;
        TimeInfo timeInfo;
        Integer num;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        TaskEvent taskEventLIZLLL = C2178808gE.LIZ().LIZLLL(c1898420zVA.LIZIZ);
        C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
        if (taskEventLIZLLL != null && (displayInfo = taskEventLIZLLL.displayInfo) != null && (timeInfo = displayInfo.timeInfo) != null && (num = timeInfo.timerLaunchPlayId) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C1893670zNV c1893670zNVLJI = c1894700zPALIZ.LJI(76, iIntValue);
        String strLJIJJ = null;
        if (c1893670zNVLJI == null || (map = c1893670zNVLJI.LJ) == null) {
            return null;
        }
        linkedHashMap.putAll(map);
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            strLJIJJ = abstractC1896090zRP.LJIJJ();
        }
        if (!linkedHashMap.containsKey("region") && strLJIJJ != null && strLJIJJ.length() != 0) {
            linkedHashMap.put("region", strLJIJJ);
        }
        return linkedHashMap;
    }

    public static final boolean LIZIZ(C1898420zVA c1898420zVA) {
        int iIntValue;
        IMultiDomainService iMultiDomainService;
        InterfaceC1898430zVB interfaceC1898430zVBLIZLLL;
        TimeInfo timeInfo;
        Integer num;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        TaskEvent taskEventLIZLLL = C2178808gE.LIZ().LIZLLL(c1898420zVA.LIZIZ);
        if (taskEventLIZLLL == null) {
            return false;
        }
        C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
        DisplayInfo displayInfo = taskEventLIZLLL.displayInfo;
        if (displayInfo != null && (timeInfo = displayInfo.timeInfo) != null && (num = timeInfo.timerLaunchPlayId) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (c1894700zPALIZ.LJI(76, iIntValue) == null) {
            return false;
        }
        C1898110zUf c1898110zUf = C1898110zUf.LL;
        String str = c1898420zVA.LIZIZ;
        if (str == null) {
            str = "";
        }
        c1898110zUf.getClass();
        if (!C1898110zUf.LJIIJJI(str) || (iMultiDomainService = (IMultiDomainService) PluggableExtentionKt.pluggableSpi$default(IMultiDomainService.class, false, false, false, 14, null)) == null || (interfaceC1898430zVBLIZLLL = iMultiDomainService.LIZLLL()) == null || !interfaceC1898430zVBLIZLLL.LIZ(c1898420zVA)) {
            return false;
        }
        C01U6.LIZIZ(new AwS572S0100000_28(c1898420zVA, 766));
        return true;
    }

    public static final void LIZLLL(C1898420zVA c1898420zVA) {
        C01U6.LIZIZ(new AwS572S0100000_28(c1898420zVA, 767));
    }

    public static final void LJ(C1898420zVA c1898420zVA) {
        C01U6.LIZIZ(new AwS572S0100000_28(c1898420zVA, 768));
    }

    public static final void LIZJ(ViewGroup viewGroup, LifecycleOwner lifecycleOwner, C1008900cMS c1008900cMS, C1898420zVA c1898420zVA) {
        C01U6.LIZIZ(new AwS156S0400000_28(viewGroup, lifecycleOwner, c1008900cMS, c1898420zVA, 13));
    }
}
