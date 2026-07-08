package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import tikcast.api.epiphron.ShareGuideBiz;
import tikcast.api.epiphron.TooltipDecision;

/* JADX INFO: renamed from: X.0eoV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103170eoV extends AbstractC1103160eoU {
    public final boolean LIZIZ;
    public C1103190eoX LIZJ;

    @Override // X.AbstractC1103160eoU
    public final boolean LJIIIIZZ() {
        return !this.LIZIZ;
    }

    @Override // X.AbstractC1103160eoU
    public final String LIZIZ(TooltipDecision tooltipDecision) {
        ShareGuideBiz shareGuideBiz = tooltipDecision.shareGuideBiz;
        if (shareGuideBiz != null) {
            return shareGuideBiz.toUserReason;
        }
        return null;
    }

    @Override // X.AbstractC1103160eoU
    public final void LJ(int i) {
        if (i != 6 && i != 8 && i != 7) {
            this.LIZJ = null;
        }
    }

    @Override // X.AbstractC1103160eoU
    public final void LJII(TooltipDecision tooltipDecision) {
        User user;
        ShareGuideBiz shareGuideBiz = tooltipDecision.shareGuideBiz;
        String str = null;
        if (shareGuideBiz != null) {
            user = shareGuideBiz.toUser;
            str = shareGuideBiz.toUserReason;
        } else {
            user = null;
        }
        this.LIZJ = new C1103190eoX(user, str);
    }

    public C1103170eoV(InterfaceC1103130eoR interfaceC1103130eoR, boolean z) {
        super(interfaceC1103130eoR);
        this.LIZIZ = z;
    }

    @Override // X.AbstractC1103160eoU
    public final String LIZ(DataChannel dataChannel, Object obj) {
        ShareGuideBiz shareGuideBiz = ((TooltipDecision) obj).shareGuideBiz;
        if (shareGuideBiz != null) {
            return shareGuideBiz.toUserReason;
        }
        return null;
    }

    @Override // X.AbstractC1103160eoU
    public final void LIZLLL(TooltipDecision tooltipDecision, Map map) {
        String str;
        map.put("show_time", tooltipDecision.triggerName);
        Text text = tooltipDecision.tooltipText;
        if (text == null || (str = text.key) == null) {
            str = "";
        }
        map.put("content", str);
    }

    @Override // X.AbstractC1103160eoU
    public final /* bridge */ /* synthetic */ void LJI(DataChannel dataChannel, TooltipDecision tooltipDecision) {
        LJII(tooltipDecision);
    }

    @Override // X.AbstractC1103160eoU
    public final boolean LJIIIZ(DataChannel dataChannel, Object obj) {
        return !this.LIZIZ;
    }

    @Override // X.AbstractC1103160eoU
    public final /* bridge */ /* synthetic */ void LIZJ(DataChannel dataChannel, Object obj, Map map) {
        LIZLLL((TooltipDecision) obj, map);
    }

    @Override // X.AbstractC1103160eoU
    public final /* bridge */ /* synthetic */ void LJFF(DataChannel dataChannel, TooltipDecision tooltipDecision, int i) {
        LJ(i);
    }
}
