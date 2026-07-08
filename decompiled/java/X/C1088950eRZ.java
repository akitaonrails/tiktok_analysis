package X;

import com.bytedance.android.livesdk.model.message.EpiDecision;
import com.bytedance.android.livesdk.model.message.EpiMessage;
import com.bytedance.android.livesdkapi.depend.model.live.EpiphronDecision;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eRZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088950eRZ<T> implements InterfaceC1088490eQp<T, Room> {
    public final InterfaceC1936307iD<T> LIZ;

    @Override // X.InterfaceC1088490eQp
    public final int LIZ() {
        return C001A.EPI_MESSAGE.getIntType();
    }

    public C1088950eRZ(InterfaceC1936307iD<T> interfaceC1936307iD) {
        this.LIZ = interfaceC1936307iD;
    }

    @Override // X.InterfaceC1088500eQq
    public final Object LIZIZ(Object obj, AbstractC1088260eQS abstractC1088260eQS) {
        Map<String, String> map;
        EpiphronDecision epiphronDecision = ((Room) obj).decisions;
        if (epiphronDecision != null) {
            map = epiphronDecision.serverFeatures;
        } else {
            map = null;
        }
        return LIZLLL(map, abstractC1088260eQS);
    }

    @Override // X.InterfaceC1088490eQp
    public final void LIZJ(IMessage iMessage, AbstractC1089300eS8<T> abstractC1089300eS8) {
        EpiDecision epiDecision;
        T tLIZLLL;
        if ((iMessage instanceof EpiMessage) && (epiDecision = ((EpiMessage) iMessage).decisions) != null && (tLIZLLL = LIZLLL(epiDecision.serverFeatures, abstractC1089300eS8)) != null) {
            abstractC1089300eS8.LJFF(tLIZLLL);
        }
    }

    public final T LIZLLL(Map<String, String> map, AbstractC1089300eS8<T> abstractC1089300eS8) {
        String str;
        if (map != null && (str = map.get(abstractC1089300eS8.LL.LIZ)) != null) {
            if (Intrinsics.LJFF(abstractC1089300eS8.LL.LIZ, C1089000eRe.LIZLLL.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("hot_level is ");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("publicscreen_animation", C2188811AlT.LIZIZ(sbLIZ));
            }
            return this.LIZ.parse(str);
        }
        return null;
    }
}
