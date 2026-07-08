package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import tikcast.api.epiphron.TooltipDecision;

/* JADX INFO: renamed from: X.0eoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1103160eoU {
    public final InterfaceC1103130eoR LIZ;

    public String LIZIZ(TooltipDecision tooltipDecision) {
        return null;
    }

    public void LIZLLL(TooltipDecision tooltipDecision, Map map) {
    }

    public void LJ(int i) {
    }

    public void LJII(TooltipDecision tooltipDecision) {
    }

    public boolean LJIIIIZZ() {
        return true;
    }

    public AbstractC1103160eoU(InterfaceC1103130eoR interfaceC1103130eoR) {
        this.LIZ = interfaceC1103130eoR;
    }

    public /* bridge */ /* synthetic */ String LIZ(DataChannel dataChannel, Object obj) {
        return LIZIZ((TooltipDecision) obj);
    }

    public /* bridge */ /* synthetic */ void LJI(DataChannel dataChannel, TooltipDecision tooltipDecision) {
        LJII(tooltipDecision);
    }

    public /* bridge */ /* synthetic */ boolean LJIIIZ(DataChannel dataChannel, Object obj) {
        return LJIIIIZZ();
    }

    public /* bridge */ /* synthetic */ void LIZJ(DataChannel dataChannel, Object obj, Map map) {
        LIZLLL((TooltipDecision) obj, map);
    }

    public /* bridge */ /* synthetic */ void LJFF(DataChannel dataChannel, TooltipDecision tooltipDecision, int i) {
        LJ(i);
    }
}
