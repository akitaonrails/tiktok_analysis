package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.livesdkapi.avoidance.setting.LiveConflictControlDefaultSetting;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComponentAvoidRuleV2;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComponentRecoverInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0efk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097740efk {
    public final Context LIZ;
    public final Function1<List<String>, List<String>> LIZIZ;
    public final Function2<DataChannel, C474500IjA, Unit> LIZJ;
    public final InterfaceC1102170emt LIZLLL;
    public List<MsgNotifyComponentAvoidRuleV2> LJ;
    public Integer LJFF;
    public final long LJI = SystemClock.uptimeMillis();
    public final long LJII = C963140bAe.LIZIZ();
    public Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> LIZJ() {
        Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> map = this.LJIIIIZZ;
        Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> map2 = map;
        if (map == null) {
            List<MsgNotifyComponentAvoidRuleV2> list = this.LJ;
            if (list == null) {
                C1102070emj.LIZ.getClass();
                return (Map) C1102070emj.LJFF.getValue();
            }
            C1102070emj.LIZ.getClass();
            Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> mapLIZJ = C1102070emj.LIZJ(list);
            for (MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2 : LiveConflictControlDefaultSetting.getValue().componentRuleListV2) {
                if (!mapLIZJ.containsKey(Integer.valueOf(msgNotifyComponentAvoidRuleV2.componentType))) {
                    C1102070emj.LIZ.getClass();
                    Object obj = ((Map) C1102070emj.LJFF.getValue()).get(Integer.valueOf(msgNotifyComponentAvoidRuleV2.componentType));
                    if (obj != null) {
                        mapLIZJ.put(Integer.valueOf(msgNotifyComponentAvoidRuleV2.componentType), obj);
                    }
                }
            }
            this.LJIIIIZZ = mapLIZJ;
            map2 = mapLIZJ;
        }
        return map2;
    }

    public final long LIZ(InterfaceC1102120emo interfaceC1102120emo) {
        Map<Integer, MsgNotifyComponentAvoidRuleV2> map;
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2;
        int componentType = interfaceC1102120emo.getComponentType();
        interfaceC1102120emo.LJI();
        Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> mapLIZJ = LIZJ();
        if (mapLIZJ != null && (map = mapLIZJ.get(Integer.valueOf(componentType))) != null && (msgNotifyComponentAvoidRuleV2 = map.get(0)) != null) {
            return msgNotifyComponentAvoidRuleV2.avoidWatchEarlyMs;
        }
        return 0L;
    }

    public final long LIZIZ(InterfaceC1102120emo interfaceC1102120emo) {
        Map<Integer, MsgNotifyComponentAvoidRuleV2> map;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo;
        Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> mapLIZJ = LIZJ();
        if (mapLIZJ != null && (map = mapLIZJ.get(Integer.valueOf(interfaceC1102120emo.getComponentType()))) != null) {
            interfaceC1102120emo.LJI();
            MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2 = map.get(0);
            if (msgNotifyComponentAvoidRuleV2 != null && (msgNotifyComponentRecoverInfo = msgNotifyComponentAvoidRuleV2.firstRecoverInfo) != null) {
                return msgNotifyComponentRecoverInfo.delayMs;
            }
            return 0L;
        }
        return 0L;
    }

    public final long LIZLLL(InterfaceC1102120emo interfaceC1102120emo) {
        Map<Integer, MsgNotifyComponentAvoidRuleV2> map;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo;
        Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> mapLIZJ = LIZJ();
        if (mapLIZJ != null && (map = mapLIZJ.get(Integer.valueOf(interfaceC1102120emo.getComponentType()))) != null) {
            interfaceC1102120emo.LJI();
            MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2 = map.get(0);
            if (msgNotifyComponentAvoidRuleV2 != null && (msgNotifyComponentRecoverInfo = msgNotifyComponentAvoidRuleV2.interruptRecoverInfo) != null) {
                return msgNotifyComponentRecoverInfo.delayMs;
            }
            return 0L;
        }
        return 0L;
    }

    public final int LJ(InterfaceC1102120emo interfaceC1102120emo) {
        Map<Integer, MsgNotifyComponentAvoidRuleV2> map;
        Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> mapLIZJ = LIZJ();
        if (mapLIZJ != null && (map = mapLIZJ.get(Integer.valueOf(interfaceC1102120emo.getComponentType()))) != null) {
            interfaceC1102120emo.LJI();
            MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2 = map.get(0);
            if (msgNotifyComponentAvoidRuleV2 != null) {
                return msgNotifyComponentAvoidRuleV2.maxActiveCount;
            }
            return Integer.MAX_VALUE;
        }
        return Integer.MAX_VALUE;
    }

    public final long LJI(InterfaceC1102120emo interfaceC1102120emo) {
        int componentType = interfaceC1102120emo.getComponentType();
        interfaceC1102120emo.LJI();
        return LJFF(componentType, 0);
    }

    public final MsgNotifyComponentAvoidRuleV2 LJII(InterfaceC1102120emo interfaceC1102120emo) {
        Map<Integer, MsgNotifyComponentAvoidRuleV2> map;
        Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> mapLIZJ = LIZJ();
        if (mapLIZJ != null && (map = mapLIZJ.get(Integer.valueOf(interfaceC1102120emo.getComponentType()))) != null) {
            interfaceC1102120emo.LJI();
            return map.get(0);
        }
        return null;
    }

    public final boolean LJIIJ(InterfaceC1102120emo interfaceC1102120emo) {
        Map<Integer, MsgNotifyComponentAvoidRuleV2> map;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo;
        Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> mapLIZJ = LIZJ();
        if (mapLIZJ == null || (map = mapLIZJ.get(Integer.valueOf(interfaceC1102120emo.getComponentType()))) == null) {
            return false;
        }
        interfaceC1102120emo.LJI();
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2 = map.get(0);
        if (msgNotifyComponentAvoidRuleV2 == null || (msgNotifyComponentRecoverInfo = msgNotifyComponentAvoidRuleV2.firstRecoverInfo) == null || !msgNotifyComponentRecoverInfo.recover) {
            return false;
        }
        return true;
    }

    public final boolean LJIIJJI(InterfaceC1102120emo interfaceC1102120emo) {
        Map<Integer, MsgNotifyComponentAvoidRuleV2> map;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo;
        Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> mapLIZJ = LIZJ();
        if (mapLIZJ == null || (map = mapLIZJ.get(Integer.valueOf(interfaceC1102120emo.getComponentType()))) == null) {
            return false;
        }
        interfaceC1102120emo.LJI();
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2 = map.get(0);
        if (msgNotifyComponentAvoidRuleV2 == null || (msgNotifyComponentRecoverInfo = msgNotifyComponentAvoidRuleV2.interruptRecoverInfo) == null || !msgNotifyComponentRecoverInfo.recover) {
            return false;
        }
        return true;
    }

    public final boolean LJIIL(InterfaceC1102120emo interfaceC1102120emo) {
        Map<Integer, MsgNotifyComponentAvoidRuleV2> map;
        Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> mapLIZJ = LIZJ();
        if (mapLIZJ == null || (map = mapLIZJ.get(Integer.valueOf(interfaceC1102120emo.getComponentType()))) == null) {
            return false;
        }
        interfaceC1102120emo.LJI();
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2 = map.get(0);
        if (msgNotifyComponentAvoidRuleV2 == null || !msgNotifyComponentAvoidRuleV2.canBeInterrupt) {
            return false;
        }
        return true;
    }

    public final long LJFF(int i, int i2) {
        Map<Integer, MsgNotifyComponentAvoidRuleV2> map;
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2;
        Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> mapLIZJ = LIZJ();
        if (mapLIZJ != null && (map = mapLIZJ.get(Integer.valueOf(i))) != null && (msgNotifyComponentAvoidRuleV2 = map.get(Integer.valueOf(i2))) != null) {
            return msgNotifyComponentAvoidRuleV2.priority;
        }
        return Long.MAX_VALUE;
    }

    public final List<String> LJIIIIZZ(int i, int i2) {
        Map<Integer, MsgNotifyComponentAvoidRuleV2> map;
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2;
        Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> mapLIZJ = LIZJ();
        if (mapLIZJ != null && (map = mapLIZJ.get(Integer.valueOf(i))) != null && (msgNotifyComponentAvoidRuleV2 = map.get(Integer.valueOf(i2))) != null) {
            return msgNotifyComponentAvoidRuleV2.avoidScene;
        }
        return null;
    }

    public final boolean LJIIIZ(int i, int i2) {
        Map<Integer, MsgNotifyComponentAvoidRuleV2> map;
        Map<Integer, Map<Integer, MsgNotifyComponentAvoidRuleV2>> mapLIZJ = LIZJ();
        if (mapLIZJ != null && (map = mapLIZJ.get(Integer.valueOf(i))) != null && map.get(Integer.valueOf(i2)) != null) {
            return true;
        }
        return false;
    }

    public C1097740efk(Context context, Function1 function1, Function2 function2, C1097720efi c1097720efi, List list, Integer num) {
        this.LIZ = context;
        this.LIZIZ = function1;
        this.LIZJ = function2;
        this.LIZLLL = c1097720efi;
        this.LJ = list;
        this.LJFF = num;
    }
}
