package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.data.EventModel;
import com.ss.android.ugc.aweme.slash.data.Node;
import com.ss.android.ugc.aweme.slash.data.NodeUpdate;
import com.ss.android.ugc.aweme.slash.data.SlashEvent;
import com.ss.android.ugc.aweme.slash.data.SlashEventAction;
import com.ss.android.ugc.aweme.slash.data.SlashParam;
import com.ss.android.ugc.aweme.slash.data.UpdateStrategy;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gpu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180920gpu {
    public final String LIZ;
    public C1180090goZ LIZIZ;
    public final EnumC1181250gqR LIZJ;
    public BaseComponentData LIZLLL;
    public Map<String, EventModel> LJ;
    public List<SlashEvent> LJFF;
    public final C1180990gq1 LJI;
    public Node.Config LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashComponentModel(instanceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", componentType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nodeType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", events=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", dynamicEvents=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", attachedDataInfo=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", nodeConfig=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final SlashParam LIZLLL() {
        Collection<EventModel> collectionValues;
        EventModel eventModel;
        SlashEvent next;
        List<SlashEventAction> actions;
        SlashEventAction slashEventAction;
        SlashParam slashParam;
        List<SlashEvent> list = this.LJFF;
        if (list != null) {
            Iterator<SlashEvent> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.LJFF(next.getName(), "refresh")) {
                    break;
                }
            }
            SlashEvent slashEvent = next;
            if (slashEvent != null && (actions = slashEvent.getActions()) != null && (slashEventAction = (SlashEventAction) C13LP.LJJJLL(actions)) != null && (slashParam = slashEventAction.slashParam) != null) {
                return slashParam;
            }
        }
        Map<String, EventModel> map = this.LJ;
        if (map == null || (collectionValues = map.values()) == null || (eventModel = (EventModel) C13LP.LJJJLIIL(collectionValues)) == null) {
            return null;
        }
        return eventModel.slashParam;
    }

    public final void LIZ(C1180920gpu c1180920gpu) {
        BaseComponentData baseComponentDataLIZJ;
        Map<String, EventModel> map;
        List<SlashEvent> list;
        Node.Config config;
        BaseComponentData baseComponentData;
        InterfaceC1180980gq0<?> interfaceC1180980gq0LIZIZ;
        BaseComponentData baseComponentData2;
        BaseComponentData baseComponentData3 = this.LIZLLL;
        InterfaceC1173960geg interfaceC1173960geg = C1180170goh.LIZ;
        InterfaceC1180970gpz interfaceC1180970gpz = C1180170goh.LIZIZ.get(this.LIZIZ);
        BaseResponse.ServerTimeExtra serverTimeExtra = null;
        if (interfaceC1180970gpz != null && (interfaceC1180980gq0LIZIZ = interfaceC1180970gpz.LIZIZ()) != null) {
            if (c1180920gpu != null) {
                baseComponentData2 = c1180920gpu.LIZLLL;
            } else {
                baseComponentData2 = null;
            }
            baseComponentDataLIZJ = interfaceC1180980gq0LIZIZ.LIZJ(baseComponentData3, baseComponentData2);
        } else {
            baseComponentDataLIZJ = null;
        }
        if ((baseComponentDataLIZJ instanceof AbstractC1180940gpw) && (baseComponentData3 instanceof AbstractC1180940gpw)) {
            ((AbstractC1180940gpw) baseComponentDataLIZJ).setCustomContentType$slash_release(((AbstractC1180940gpw) baseComponentData3).getCustomContentType$slash_release());
        }
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18(baseComponentDataLIZJ, 2246));
        if (baseComponentDataLIZJ != null) {
            baseComponentDataLIZJ.instanceId = this.LIZ;
            baseComponentDataLIZJ.componentType = this.LIZIZ;
            if (c1180920gpu != null && (baseComponentData = c1180920gpu.LIZLLL) != null) {
                serverTimeExtra = baseComponentData.extra;
            }
            baseComponentDataLIZJ.extra = serverTimeExtra;
        }
        C1180170goh.LIZLLL().LIZ(new AwS419S0200000_18(baseComponentData3, c1180920gpu, 107));
        this.LIZLLL = baseComponentDataLIZJ;
        if (c1180920gpu == null || (map = c1180920gpu.LJ) == null) {
            map = this.LJ;
        }
        this.LJ = map;
        if (c1180920gpu == null || (list = c1180920gpu.LJFF) == null) {
            list = this.LJFF;
        }
        this.LJFF = list;
        if (c1180920gpu == null || (config = c1180920gpu.LJII) == null) {
            config = this.LJII;
        }
        this.LJII = config;
    }

    public final void LJ(C1180920gpu c1180920gpu) {
        BaseComponentData baseComponentData;
        Map<String, EventModel> map;
        List<SlashEvent> list;
        Node.Config config;
        BaseComponentData baseComponentData2 = this.LIZLLL;
        if (c1180920gpu == null || (baseComponentData = c1180920gpu.LIZLLL) == null) {
            baseComponentData = baseComponentData2;
        }
        if ((baseComponentData instanceof AbstractC1180940gpw) && (baseComponentData2 instanceof AbstractC1180940gpw)) {
            ((AbstractC1180940gpw) baseComponentData).setCustomContentType$slash_release(((AbstractC1180940gpw) baseComponentData2).getCustomContentType$slash_release());
        }
        this.LIZLLL = baseComponentData;
        if (c1180920gpu == null || (map = c1180920gpu.LJ) == null) {
            map = this.LJ;
        }
        this.LJ = map;
        if (c1180920gpu == null || (list = c1180920gpu.LJFF) == null) {
            list = this.LJFF;
        }
        this.LJFF = list;
        if (c1180920gpu == null || (config = c1180920gpu.LJII) == null) {
            config = this.LJII;
        }
        this.LJII = config;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1180920gpu)) {
            return false;
        }
        C1180920gpu c1180920gpu = (C1180920gpu) obj;
        if (!Intrinsics.LJFF(this.LIZ, c1180920gpu.LIZ) || !Intrinsics.LJFF(this.LIZIZ, c1180920gpu.LIZIZ) || !Intrinsics.LJFF(this.LJ, c1180920gpu.LJ)) {
            return false;
        }
        BaseComponentData baseComponentData = this.LIZLLL;
        if ((baseComponentData == null || !baseComponentData.areContentsTheSame(c1180920gpu.LIZLLL)) && (this.LIZLLL != null || c1180920gpu.LIZLLL != null)) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(C1180920gpu c1180920gpu, UpdateStrategy updateStrategy) {
        String str;
        if (c1180920gpu.LIZJ == EnumC1181250gqR.ATTACHED_DATA && Intrinsics.LJFF(c1180920gpu.LIZIZ, this.LIZIZ)) {
            if (updateStrategy != null) {
                str = updateStrategy.updateType;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "append")) {
                LIZ(c1180920gpu);
            } else {
                LJ(c1180920gpu);
            }
            BaseComponentData baseComponentData = this.LIZLLL;
            if (baseComponentData != null) {
                baseComponentData.updateType = str;
            }
        }
    }

    public final void LIZJ(C1180920gpu c1180920gpu, List<SlashParam> list) {
        List<NodeUpdate> list2;
        NodeUpdate next;
        if (c1180920gpu != null && Intrinsics.LJFF(c1180920gpu.LIZ, this.LIZ) && Intrinsics.LJFF(c1180920gpu.LIZIZ, this.LIZIZ) && c1180920gpu.LIZJ == this.LIZJ) {
            String str = null;
            if (list != null) {
                String str2 = null;
                for (SlashParam slashParam : list) {
                    if (slashParam != null && (list2 = slashParam.nodeUpdateList) != null) {
                        Iterator<NodeUpdate> it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(next.node, this.LIZ)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        NodeUpdate nodeUpdate = next;
                        if (nodeUpdate != null) {
                            str2 = nodeUpdate.type;
                        }
                    }
                }
                str = str2;
            }
            if (Intrinsics.LJFF(str, "append")) {
                LIZ(c1180920gpu);
            } else {
                LJ(c1180920gpu);
            }
            BaseComponentData baseComponentData = this.LIZLLL;
            if (baseComponentData != null) {
                baseComponentData.updateType = str;
            }
        }
    }

    public /* synthetic */ C1180920gpu(String str, C1180090goZ c1180090goZ, EnumC1181250gqR enumC1181250gqR, BaseComponentData baseComponentData) {
        this(str, c1180090goZ, enumC1181250gqR, baseComponentData, null, null, null, null);
    }

    public C1180920gpu(String str, C1180090goZ c1180090goZ, EnumC1181250gqR enumC1181250gqR, BaseComponentData baseComponentData, Map<String, EventModel> map, List<SlashEvent> list, C1180990gq1 c1180990gq1, Node.Config config) {
        this.LIZ = str;
        this.LIZIZ = c1180090goZ;
        this.LIZJ = enumC1181250gqR;
        this.LIZLLL = baseComponentData;
        this.LJ = map;
        this.LJFF = list;
        this.LJI = c1180990gq1;
        this.LJII = config;
    }
}
