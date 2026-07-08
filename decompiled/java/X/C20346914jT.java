package X;

import com.bytedance.android.livesdk.comp.impl.pcs.data.playentity.ServicePlusEntity;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14jT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20346914jT extends C09AY implements Function1<AbstractC518960KWw, Unit> {
    public final /* synthetic */ ServicePlusEntity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20346914jT(ServicePlusEntity servicePlusEntity) {
        super(1);
        this.LL = servicePlusEntity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC518960KWw abstractC518960KWw) {
        String str;
        AbstractC518960KWw abstractC518960KWw2 = abstractC518960KWw;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addSMBPageActionChannelObserver observeForever ");
        sbLIZ.append(abstractC518960KWw2);
        C20441214yg.LIZIZ("ServicePlusEntity", C2188811AlT.LIZIZ(sbLIZ));
        if (abstractC518960KWw2.LIZ.isServicePlusPage()) {
            Map<String, String> map = abstractC518960KWw2.LIZIZ;
            Long lValueOf = null;
            if (map != null && map.get("state_id") != null) {
                Map<String, String> map2 = abstractC518960KWw2.LIZIZ;
                if (map2 != null) {
                    str = map2.get("state_id");
                } else {
                    str = null;
                }
                C20361214lm c20361214lm = this.LL.LLJJJJLIIL;
                if (c20361214lm != null) {
                    lValueOf = Long.valueOf(c20361214lm.LIZIZ);
                }
                if (Intrinsics.LJFF(str, String.valueOf(lValueOf))) {
                    ServicePlusEntity servicePlusEntity = this.LL;
                    C20361214lm c20361214lm2 = servicePlusEntity.LLJJJJLIIL;
                    InterfaceC20354714kj interfaceC20354714kj = servicePlusEntity.LLJJL;
                    if (c20361214lm2 != null && interfaceC20354714kj != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("addSMBPageActionChannelObserver ");
                        sbLIZ2.append(c20361214lm2);
                        sbLIZ2.append(' ');
                        sbLIZ2.append(interfaceC20354714kj);
                        C20441214yg.LIZIZ("ServicePlusEntity", C2188811AlT.LIZIZ(sbLIZ2));
                        if (abstractC518960KWw2 instanceof C518940KWu) {
                            PlayEntityUtilKt.LJ(servicePlusEntity, 2, c20361214lm2, interfaceC20354714kj);
                        } else if (abstractC518960KWw2 instanceof C518970KWx) {
                            PlayEntityUtilKt.LIZJ(servicePlusEntity, "", c20361214lm2, interfaceC20354714kj, true);
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
