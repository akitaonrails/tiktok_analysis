package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tOR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663610tOR {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Effect LIZ(AbstractC1663570tON abstractC1663570tON) {
        if (abstractC1663570tON instanceof InterfaceC1663600tOQ) {
            return ((InterfaceC1663600tOQ) abstractC1663570tON).LIZ();
        }
        return new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String LIZIZ(AbstractC1663570tON abstractC1663570tON) {
        String tabName;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tabName=");
        if (abstractC1663570tON instanceof InterfaceC1663600tOQ) {
            tabName = ((InterfaceC1663600tOQ) abstractC1663570tON).getTabName();
        } else {
            tabName = "";
        }
        sbLIZ.append(tabName);
        sbLIZ.append(", effect= name=");
        sbLIZ.append(LIZ(abstractC1663570tON).getName());
        sbLIZ.append(", effect_id=");
        sbLIZ.append(LIZ(abstractC1663570tON).getEffect_id());
        sbLIZ.append(", svc_speaker_id=");
        sbLIZ.append(C1664460tPo.LJIIIIZZ(LIZ(abstractC1663570tON)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final boolean LIZJ(AbstractC1663570tON abstractC1663570tON, AbstractC1663570tON abstractC1663570tON2) {
        if (!Intrinsics.LJFF(abstractC1663570tON, abstractC1663570tON2) && !Intrinsics.LJFF(LIZ(abstractC1663570tON).getEffect_id(), LIZ(abstractC1663570tON2).getEffect_id())) {
            return false;
        }
        return true;
    }
}
