package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.api.EmoteCopywritingInfo;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.List;
import webcast.data.TPText;
import wh6.AbS507S0200000_17;
import wh6.AbS698S0100000_17;

/* JADX INFO: renamed from: X.0ecI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095600ecI extends AbstractC1114240f6M {
    public final EmoteCopywritingInfo LLILZLL;
    public boolean LLIZ;

    @Override // X.AbstractC1114240f6M
    public final int I5() {
        return 3;
    }

    @Override // X.AbstractC1114240f6M
    public final void onBind() {
        EmoteCopywritingInfo emoteCopywritingInfo;
        EmoteCopywritingInfo emoteCopywritingInfo2;
        TPText tPText;
        SpannableStringBuilder spannableStringBuilderLIZLLL;
        long j;
        int i;
        ViewStub viewStub;
        if (this.LLIZ || (emoteCopywritingInfo = this.LLILZLL) == null || !C500260Jjc.LJJJI(Boolean.valueOf(emoteCopywritingInfo.shouldShowRenewalBanner)) || emoteCopywritingInfo.renewalBannerText == null) {
            View viewFindViewById = this.itemView.findViewById(R.id.wpe);
            if (viewFindViewById != null) {
                C500260Jjc.LJIILIIL(viewFindViewById);
            }
        } else {
            View viewFindViewById2 = this.itemView.findViewById(R.id.wpe);
            if ((viewFindViewById2 != null || ((viewStub = (ViewStub) this.itemView.findViewById(R.id.wpg)) != null && (viewFindViewById2 = C786410Ut5.LJLLLL(viewStub)) != null)) && (emoteCopywritingInfo2 = this.LLILZLL) != null && (tPText = emoteCopywritingInfo2.renewalBannerText) != null && (spannableStringBuilderLIZLLL = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText)) != null) {
                TextView textView = (TextView) viewFindViewById2.findViewById(R.id.wph);
                if (textView != null) {
                    textView.setText(spannableStringBuilderLIZLLL);
                    textView.setMovementMethod(C431260Gvc.LIZ);
                }
                View viewFindViewById3 = viewFindViewById2.findViewById(R.id.e1g);
                if (viewFindViewById3 != null) {
                    C786410Ut5.I7(new AbS507S0200000_17(this, viewFindViewById2, 2), viewFindViewById3);
                }
                C500260Jjc.LLFFF(viewFindViewById2);
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
                    if (c1095140ebYUw0 != null) {
                        j = c1095140ebYUw0.LIZ;
                        i = c1095140ebYUw0.LJ;
                    } else {
                        j = 0;
                        i = 0;
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_sticker_tab_notice_show");
                    c474500IjALIZ.LJJII(String.valueOf(room.getOwnerUserId()), "anchor_id");
                    c474500IjALIZ.LJJII(room.getIdStr(), "room_id");
                    c474500IjALIZ.LJJII(Long.valueOf(j), "fans_club_level");
                    c474500IjALIZ.LJJII(Integer.valueOf(j <= 0 ? 0 : !(i == 2) ? 1 : 3), "fans_club_status");
                    c474500IjALIZ.LJJII("sticker_tab", "source_page");
                    c474500IjALIZ.LJJII("stay_super_fan", "msg_type");
                    c474500IjALIZ.LIZ();
                }
            }
        }
        super.onBind();
        View viewFindViewById4 = this.itemView.findViewById(R.id.unlock_container);
        C16F5 c16f5 = (C16F5) this.itemView.findViewById(R.id.unlock_text);
        View viewFindViewById5 = this.itemView.findViewById(R.id.unlock_button);
        C1110180ezo c1110180ezo = this.LL;
        if (c1110180ezo.LLILZIL) {
            C500260Jjc.LJIILIIL(viewFindViewById4);
        } else {
            if (c1110180ezo.LLJ) {
                C500260Jjc.LJIILIIL(viewFindViewById4);
                return;
            }
            C500260Jjc.LLFFF(viewFindViewById4);
            N5(c16f5, C497740JfY.LJIIL(2131755839, this.LLILLJJLI.size(), Integer.valueOf(this.LLILLJJLI.size())), String.valueOf(this.LLILLJJLI.size()));
            C786410Ut5.I7(new AbS698S0100000_17(this, 18, 42), viewFindViewById5);
        }
    }

    public C1095600ecI(C1110180ezo c1110180ezo, List list, C1114250f6N c1114250f6N, EmoteCopywritingInfo emoteCopywritingInfo) {
        super(c1110180ezo, list, C786410Ut5.Td(C786410Ut5.ne(c1114250f6N.getContext()), R.layout.hfl, c1114250f6N, false));
        this.LLILZLL = emoteCopywritingInfo;
    }
}
