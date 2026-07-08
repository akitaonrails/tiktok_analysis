package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.LiveIntroMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;

/* JADX INFO: renamed from: X.0ezt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110230ezt extends AbstractC1110520f0M<LiveIntroMessage> implements InterfaceC759280TqQ, InterfaceC1109660eyy {
    public SpannableStringBuilder LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public CharSequence LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;

    @Override // X.InterfaceC1109660eyy
    public final void LJIIJJI() {
        this.LJJIJLIJ = true;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final int LJIJI() {
        return 1;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final long LJJII() {
        return 2000L;
    }

    @Override // X.InterfaceC759280TqQ
    public final Map<Long, Long> LJJLIIIJILLIZJL() {
        return null;
    }

    @Override // X.InterfaceC1109660eyy
    public final boolean LJJLJLI() {
        return true;
    }

    @Override // X.InterfaceC759280TqQ
    public final void LJLJI(Map<Long, Long> map) {
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final int LJLJJL() {
        return 1;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJLLILLLL() {
        return true;
    }

    @Override // X.InterfaceC759280TqQ
    public final boolean LJLLJ() {
        return true;
    }

    @Override // X.AbstractC1110520f0M, X.AbstractC1110800f0o, X.AbstractC1110790f0n
    public final boolean LLJJIJIL() {
        return false;
    }

    @Override // X.AbstractC1110520f0M
    public final boolean LLLI() {
        return false;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean instant() {
        return false;
    }

    @Override // X.AbstractC1110520f0M
    public final String LLJLLL() {
        MESSAGE message = this.LJIL;
        return ((LiveIntroMessage) message).content == null ? "" : ((LiveIntroMessage) message).content;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final boolean LJIIZILJ() {
        if (!LLIIIILZ().LJI) {
            return true;
        }
        Room room = LLIIIILZ().LJII;
        return (room != null ? room.getStreamType() : null) == LiveMode.SCREEN_RECORD;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJJJJZI() {
        return !LLIILII();
    }

    @Override // X.InterfaceC759280TqQ
    public final CharSequence LJLJLLL() {
        if (LLIILII()) {
            return this.LJJIJIL;
        }
        SpannableStringBuilder spannableStringBuilder = this.LJJIJ;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        if (TextUtils.isEmpty(this.LJJIJIL)) {
            return "";
        }
        C1110390f09 c1110390f09 = C1110390f09.LIZ;
        SpannableStringBuilder spannableStringBuilderLIZ = C1110390f09.LIZ(null, EnumC1110450f0F.PUBLICSCREEN_MESSAGE_TYPE, String.valueOf(this.LJJIJIL), this.LJIILIIL.LIZ.getResources(), null, this.LJJIIZ, null, null, false);
        this.LJJIJ = spannableStringBuilderLIZ;
        return spannableStringBuilderLIZ;
    }

    @Override // X.InterfaceC759280TqQ
    public final CharSequence LJLLI() {
        return getContent();
    }

    @Override // X.AbstractC1110790f0n
    public final CharSequence LLFF() {
        if (LLIILII()) {
            return ((LiveIntroMessage) this.LJIL).content;
        }
        C1110390f09 c1110390f09 = C1110390f09.LIZ;
        return C1110390f09.LIZ(null, EnumC1110450f0F.PUBLICSCREEN_MESSAGE_TYPE, String.valueOf(((LiveIntroMessage) this.LJIL).content), this.LJIILIIL.LIZ.getResources(), null, this.LJJIIZ, null, null, false);
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return LLIIIILZ().LJIIIIZZ;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public final void onAttach() {
        super.onAttach();
        CharSequence content = getContent();
        if (content != null) {
            if (LLIILII()) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_room_detail_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(content.toString(), "live_info_content");
                Integer num = ((LiveIntroMessage) this.LJIL).introMode;
                c474500IjALIZ.LJJII((num == null || num.intValue() != 1) ? "edit" : "default", "live_info_type");
                ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
                c474500IjALIZ.LJJIIZI(C494680Jac.LJIIZILJ(C517110KPt.LIZIZ()));
                c474500IjALIZ.LIZ();
                return;
            }
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_room_detail_audience_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
            c474500IjALIZIZ.LJJII(content.toString(), "live_info_content");
            Integer num2 = ((LiveIntroMessage) this.LJIL).introMode;
            c474500IjALIZIZ.LJJII((num2 == null || num2.intValue() != 1) ? "edit" : "default", "live_info_type");
            if (BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
                c474500IjALIZIZ.LJJIJLIJ();
                c474500IjALIZIZ.LJJIJL();
            } else {
                c474500IjALIZIZ.LJIL();
                c474500IjALIZIZ.LIZ();
            }
            System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC1109660eyy
    public final boolean LJIILL() {
        return this.LJJIJLIJ;
    }

    @Override // X.InterfaceC759280TqQ
    public final boolean LJIILLIIL() {
        return this.LJJIJIIJI;
    }

    @Override // X.InterfaceC1109660eyy
    public final boolean LJL() {
        return this.LJJIJL;
    }

    @Override // X.InterfaceC759280TqQ
    public final CharSequence LJLIIIL() {
        return this.LJJIJIL;
    }

    @Override // X.InterfaceC759280TqQ
    public final boolean LJLLL() {
        return this.LJJIJIIJIL;
    }

    public C1110230ezt(LiveIntroMessage liveIntroMessage) {
        super(liveIntroMessage);
    }

    @Override // X.InterfaceC1109660eyy
    public final void LJJIII(boolean z) {
        this.LJJIJL = z;
    }

    @Override // X.InterfaceC759280TqQ
    public final void LJJIIJZLJL(boolean z) {
        this.LJJIJIIJIL = z;
    }

    @Override // X.AbstractC1110520f0M, X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109650eyx
    public final void LJJJJZ(C1109770ez9 c1109770ez9) {
        LLJZIJLIL(((LiveIntroMessage) this.LJIL).badges, c1109770ez9, 2);
        super.LJJJJZ(c1109770ez9);
    }

    @Override // X.InterfaceC759280TqQ
    public final void LJJLI(boolean z) {
        this.LJJIJIIJI = z;
    }

    @Override // X.InterfaceC759280TqQ
    public final void LJJZZIII(CharSequence charSequence) {
        this.LJJIJIL = charSequence;
    }

    @Override // X.AbstractC1110520f0M, X.AbstractC1110790f0n, X.InterfaceC1109650eyx
    public final void LJLI(C1109770ez9 c1109770ez9) {
        LLJZIJLIL(((LiveIntroMessage) this.LJIL).badges, c1109770ez9, 2);
        super.LJLI(c1109770ez9);
    }
}
