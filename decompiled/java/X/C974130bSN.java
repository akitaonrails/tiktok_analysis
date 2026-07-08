package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS100S1000000_15;
import kotlin.jvm.internal.AwS18S0410000_15;
import kotlin.jvm.internal.AwS259S0300000_15;

/* JADX INFO: renamed from: X.0bSN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974130bSN extends C09AY implements InterfaceC1631630sYr<EnumC919170a1j, Boolean, String, Boolean, Unit> {
    public final /* synthetic */ C974060bSG LL;
    public final /* synthetic */ EnumC919170a1j LLILLJJLI;
    public final /* synthetic */ C974990bTl LLILLL;
    public final /* synthetic */ List<C954460awe> LLILZ;
    public final /* synthetic */ MultiMatchPrepareResponse LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C974130bSN(C974060bSG c974060bSG, EnumC919170a1j enumC919170a1j, C974990bTl c974990bTl, List list, MultiMatchPrepareResponse multiMatchPrepareResponse) {
        super(4);
        this.LL = c974060bSG;
        this.LLILLJJLI = enumC919170a1j;
        this.LLILLL = c974990bTl;
        this.LLILZ = list;
        this.LLILZIL = multiMatchPrepareResponse;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(EnumC919170a1j enumC919170a1j, Boolean bool, String str, Boolean bool2) {
        DataChannel dataChannel;
        boolean z;
        boolean z2;
        String str2;
        EnumC919170a1j enumC919170a1j2 = enumC919170a1j;
        boolean zBooleanValue = bool.booleanValue();
        String str3 = str;
        boolean zBooleanValue2 = bool2.booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openChooseModePanel");
        sbLIZ.append(", confirm matchType=");
        sbLIZ.append(enumC919170a1j2);
        sbLIZ.append(", isFromModeGuidePage=");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
        C973690bRf c973690bRf = C973690bRf.LIZ;
        LiveWidget liveWidget = this.LL.LIZIZ;
        Object obj = null;
        if (liveWidget != null) {
            dataChannel = liveWidget.dataChannel;
        } else {
            dataChannel = null;
        }
        c973690bRf.LJJIIZI(enumC919170a1j2, str3, C978440bZK.LJ(dataChannel), zBooleanValue2);
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        C974490bSx c974490bSx = new C974490bSx();
        if (enumC919170a1j2 == EnumC919170a1j.MATCH_TYPE_2V2 && size == 3) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILLJJLI == enumC919170a1j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        EnumC919170a1j.Companion.getClass();
        c974490bSx.LJIIL(C917350Zyn.LIZJ(enumC919170a1j2), "match_type", true);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c974490bSx.LJIIL(str2, "need_invite_1_more", true);
        AbstractC962030b8r.LJIIJ(c974490bSx.LIZLLL, "is_default", Boolean.valueOf(z2), true);
        AbstractC962030b8r.LJIIJ(c974490bSx.LIZLLL, "selected_match_type", C917350Zyn.LIZJ(enumC919170a1j2), true);
        List listLIZLLL = C973890bRz.LIZLLL();
        if (listLIZLLL != null) {
            Iterator it2 = listLIZLLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((GiftMode) next).giftId == C973890bRz.LJII) {
                    obj = next;
                    break;
                }
            }
            GiftMode giftMode = (GiftMode) obj;
            if (giftMode != null) {
                long j = giftMode.giftId;
                if (j > 0) {
                    AbstractC962030b8r.LJIIJ(c974490bSx.LIZLLL, "gift_id", Long.valueOf(j), true);
                }
            }
        }
        c974490bSx.LJIJJLI("model_panel_click_next");
        AwS18S0410000_15 awS18S0410000_15 = new AwS18S0410000_15(this.LL, this.LLILZ, enumC919170a1j2, this.LLILZIL, zBooleanValue, 0);
        switch (C917380Zyq.LIZ[enumC919170a1j2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                C974990bTl c974990bTl = this.LLILLL;
                c974990bTl.LIZIZ(this.LL.LIZIZ, new AwS259S0300000_15(enumC919170a1j2, awS18S0410000_15, c974990bTl, 29), new AwS100S1000000_15("openChooseModePanel", 5));
                break;
            case 5:
                awS18S0410000_15.invoke();
                this.LLILLL.LIZJ(false);
                break;
            case 6:
                awS18S0410000_15.invoke();
                this.LLILLL.LIZJ(false);
                break;
            default:
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("openChooseModePanel");
                sbLIZ2.append(" , error unknow matchType = ");
                sbLIZ2.append(enumC919170a1j2);
                sbLIZ2.append(' ');
                C20441214yg.LJ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ2));
                break;
        }
        return Unit.LIZ;
    }
}
