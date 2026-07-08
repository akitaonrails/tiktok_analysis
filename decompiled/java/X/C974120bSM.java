package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS100S1000000_15;
import kotlin.jvm.internal.AwS144S0400000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import webcast.data.multi_guest_play.ActivePlaybook;

/* JADX INFO: renamed from: X.0bSM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974120bSM extends C09AY implements InterfaceC1631630sYr<EnumC919170a1j, Boolean, String, Boolean, Unit> {
    public final /* synthetic */ C974090bSJ LL;
    public final /* synthetic */ C974990bTl LLILLJJLI;
    public final /* synthetic */ List<C954460awe> LLILLL;
    public final /* synthetic */ MultiMatchPrepareResponse LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C974120bSM(C974090bSJ c974090bSJ, C974990bTl c974990bTl, List list, MultiMatchPrepareResponse multiMatchPrepareResponse) {
        super(4);
        this.LL = c974090bSJ;
        this.LLILLJJLI = c974990bTl;
        this.LLILLL = list;
        this.LLILZ = multiMatchPrepareResponse;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(EnumC919170a1j enumC919170a1j, Boolean bool, String str, Boolean bool2) {
        DataChannel dataChannel;
        EnumC919170a1j enumC919170a1j2 = enumC919170a1j;
        bool.booleanValue();
        String str2 = str;
        boolean zBooleanValue = bool2.booleanValue();
        LiveWidget liveWidget = this.LL.LIZIZ;
        if (liveWidget != null) {
            dataChannel = liveWidget.dataChannel;
        } else {
            dataChannel = null;
        }
        ActivePlaybook activePlaybookLJ = C978440bZK.LJ(dataChannel);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openChooseModePanelDirectly");
        sbLIZ.append(", confirm matchType=");
        sbLIZ.append(enumC919170a1j2);
        C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
        C973690bRf.LIZ.LJJIIZI(enumC919170a1j2, str2, activePlaybookLJ, zBooleanValue);
        AwS144S0400000_15 awS144S0400000_15 = new AwS144S0400000_15(this.LL, (C974090bSJ) this.LLILLL, (List<C954460awe>) enumC919170a1j2, (EnumC919170a1j) this.LLILZ, (MultiMatchPrepareResponse) 5);
        switch (C917390Zyr.LIZ[enumC919170a1j2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                C974990bTl c974990bTl = this.LLILLJJLI;
                c974990bTl.LIZIZ(this.LL.LIZIZ, new AwS416S0200000_15(awS144S0400000_15, c974990bTl, 57), new AwS100S1000000_15("openChooseModePanelDirectly", 6));
                break;
            case 5:
                awS144S0400000_15.invoke();
                this.LLILLJJLI.LIZJ(false);
                break;
            case 6:
                awS144S0400000_15.invoke();
                this.LLILLJJLI.LIZJ(false);
                break;
            default:
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("openChooseModePanelDirectly");
                sbLIZ2.append(" , error unknow matchType = ");
                sbLIZ2.append(enumC919170a1j2);
                sbLIZ2.append(' ');
                C20441214yg.LJ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ2));
                break;
        }
        return Unit.LIZ;
    }
}
