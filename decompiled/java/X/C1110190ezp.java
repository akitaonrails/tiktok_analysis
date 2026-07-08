package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationRequest;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ezp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110190ezp extends AbstractC1110520f0M<C1116210f9X> implements InterfaceC759280TqQ, InterfaceC1109660eyy, InterfaceC1109680ez0 {
    public final String LJJIJ;
    public final long LJJIJIIJI;
    public SpannableStringBuilder LJJIJIIJIL;
    public final ArrayList<EmoteWithIndex> LJJIJIL;
    public Map<Long, Long> LJJIJL;
    public final AwS383S0200000_17 LJJIJLIJ;
    public final AwS596S0100000_17 LJJIL;
    public final AwS596S0100000_17 LJJIZ;
    public boolean LJJJ;
    public boolean LJJJI;
    public boolean LJJJIL;
    public boolean LJJJJ;
    public CharSequence LJJJJI;

    @Override // X.InterfaceC1109660eyy
    public final void LJIIJJI() {
        this.LJJJIL = true;
    }

    @Override // X.InterfaceC759280TqQ
    public final Map<Long, Long> LJJLIIIJILLIZJL() {
        return null;
    }

    @Override // X.InterfaceC759280TqQ
    public final boolean LJLLJ() {
        return true;
    }

    @Override // X.AbstractC1110790f0n
    public final String LLIIIL() {
        return "normal";
    }

    @Override // X.AbstractC1110520f0M, X.AbstractC1110800f0o, X.AbstractC1110790f0n
    public final boolean LLJJIJIL() {
        return false;
    }

    @Override // X.AbstractC1110520f0M
    public final String LLJLLIL() {
        return "live_star_comment";
    }

    @Override // X.InterfaceC1109680ez0
    public final MGetTranslationRequest.Text LJJLIIIJLJLI() {
        MGetTranslationRequest.Text text = new MGetTranslationRequest.Text();
        text.text = ((C1116210f9X) this.LJIL).LLILLL;
        text.msgId = getMessageId();
        text.textSource = 1;
        return text;
    }

    @Override // X.InterfaceC1109660eyy
    public final boolean LJJLJLI() {
        return (this.LJJJJ || this.LJJJ || ((C1116210f9X) this.LJIL).LLIZLLLIL.length() <= 0 || Intrinsics.LJFF(((C1116210f9X) this.LJIL).LLIZLLLIL, "un") || Intrinsics.LJFF(((C1116210f9X) this.LJIL).LLIZLLLIL, this.LJJIJ) || getUser().getId() == this.LJJIJIIJI) ? false : true;
    }

    @Override // X.InterfaceC759280TqQ
    public final CharSequence LJLJLLL() {
        SpannableStringBuilder spannableStringBuilder = this.LJJIJIIJIL;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        CharSequence charSequence = this.LJJJJI;
        if (charSequence == null || ((SpannableStringBuilder) charSequence).length() == 0) {
            return "";
        }
        C1110390f09 c1110390f09 = C1110390f09.LIZ;
        SpannableStringBuilder spannableStringBuilderLIZ = C1110390f09.LIZ(this.LJJIJIL, EnumC1110450f0F.PUBLICSCREEN_MESSAGE_TYPE, String.valueOf(this.LJJJJI), LLIIIILZ().LIZ.getResources(), this.LJJIJLIJ, new C1110220ezs(this.LJJIIZ), this.LJJIL, null, false);
        this.LJJIJIIJIL = spannableStringBuilderLIZ;
        return spannableStringBuilderLIZ;
    }

    @Override // X.InterfaceC759280TqQ
    public final CharSequence LJLLI() {
        return ((C1116210f9X) this.LJIL).LLILLL;
    }

    @Override // X.AbstractC1110790f0n
    public final CharSequence LLFF() {
        SpannableStringBuilder spannableStringBuilder;
        String strLIZIZ = C1834150xpV.LIZIZ(((C1116210f9X) this.LJIL).LLILLL);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        if (!((C1116210f9X) this.LJIL).LLJJIJI.isEmpty()) {
            C1110390f09 c1110390f09 = C1110390f09.LIZ;
            spannableStringBuilder = C1110390f09.LIZ(C0165003f.LIZ(((C1116210f9X) this.LJIL).LLJJIJI), EnumC1110450f0F.PUBLICSCREEN_MESSAGE_TYPE, strLIZIZ, LLIIIILZ() == null ? Resources.getSystem() : LLIIIILZ().LIZ.getResources(), this.LJJIJLIJ, null, this.LJJIZ, LLIIIILZ().LIZIZ, false);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
        }
        C786410Ut5.q2(spannableStringBuilder, new AbstractC1098790ehR() { // from class: X.0ezq
            @Override // X.AbstractC431510Gw1
            public final void LIZ() {
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
            }

            @Override // X.AbstractC1098790ehR
            public final void LIZIZ(View view) {
                this.LLILZIL.LJJIIZ.invoke();
                C1116200f9W.LIZ(this.LLILZIL.LLIIIILZ().LJIIIZ, (C1116210f9X) this.LLILZIL.LJIL, "click", "comment");
            }
        }, 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Override // X.AbstractC1110520f0M
    public final String LLJLLL() {
        return ((C1116210f9X) this.LJIL).LLILLL;
    }

    @Override // X.AbstractC1110520f0M
    public final List<EmoteWithIndex> LLJZ() {
        MESSAGE message = this.LJIL;
        return ((C1116210f9X) message).LLJJIJI != null ? C0165003f.LIZ(((C1116210f9X) message).LLJJIJI) : new ArrayList();
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return ((C1116210f9X) this.LJIL).LLILLJJLI;
    }

    @Override // X.InterfaceC1109660eyy
    public final boolean LJIILL() {
        return this.LJJJIL;
    }

    @Override // X.InterfaceC759280TqQ
    public final boolean LJIILLIIL() {
        return this.LJJJ;
    }

    @Override // X.InterfaceC1109660eyy
    public final boolean LJL() {
        return this.LJJJI;
    }

    @Override // X.InterfaceC759280TqQ
    public final CharSequence LJLIIIL() {
        return this.LJJJJI;
    }

    @Override // X.InterfaceC759280TqQ
    public final boolean LJLLL() {
        return this.LJJJJ;
    }

    public C1110190ezp(C1116210f9X c1116210f9X) {
        super(c1116210f9X);
        this.LJJIJ = C786410Ut5.t2(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
        this.LJJIJIIJI = UserService.getInstance().user().getCurrentUserId();
        this.LJJIJIL = new ArrayList<>();
        this.LJJIJL = new LinkedHashMap();
        this.LJJIJLIJ = new AwS383S0200000_17(this, c1116210f9X, 55);
        this.LJJIL = new AwS596S0100000_17(this, 331);
        this.LJJIZ = new AwS596S0100000_17(this, 330);
    }

    @Override // X.InterfaceC1109660eyy
    public final void LJJIII(boolean z) {
        this.LJJJI = z;
    }

    @Override // X.InterfaceC759280TqQ
    public final void LJJIIJZLJL(boolean z) {
        this.LJJJJ = z;
    }

    @Override // X.InterfaceC759280TqQ
    public final void LJJLI(boolean z) {
        this.LJJJ = z;
    }

    @Override // X.InterfaceC1109680ez0
    public final void LJJLIIIJJI(Map<String, MGetTranslationResponse.Data.Translation> map) {
        MGetTranslationResponse.Data.Translation translation = map.get(((C1116210f9X) this.LJIL).LLILLL);
        if (translation != null && translation.translated) {
            this.LJJJJ = true;
            LJJZZIII(translation.translation);
        }
    }

    @Override // X.InterfaceC759280TqQ
    public final void LJJZZIII(CharSequence charSequence) {
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            C786410Ut5.q2(spannableStringBuilder, new AbstractC1098790ehR() { // from class: X.0ezr
                @Override // X.AbstractC431510Gw1
                public final void LIZ() {
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                }

                @Override // X.AbstractC1098790ehR
                public final void LIZIZ(View view) {
                    this.LLILZIL.LJJIIZ.invoke();
                }
            }, 0, spannableStringBuilder.length(), 33);
            this.LJJJJI = spannableStringBuilder;
        }
    }

    @Override // X.InterfaceC759280TqQ
    public final void LJLJI(Map<Long, Long> map) {
        this.LJJIJL = map;
        if ((!map.isEmpty()) && (!((C1116210f9X) this.LJIL).LLJJIJI.isEmpty())) {
            this.LJJIJIL.clear();
            for (com.bytedance.android.livesdk.chatroom.api.EmoteWithIndex emoteWithIndex : ((C1116210f9X) this.LJIL).LLJJIJI) {
                EmoteWithIndex emoteWithIndex2 = new EmoteWithIndex();
                Long l = this.LJJIJL.get(Long.valueOf(emoteWithIndex.index));
                if (l != null) {
                    emoteWithIndex2.index = (int) l.longValue();
                    emoteWithIndex2.emoteModel = emoteWithIndex.emote;
                    this.LJJIJIL.add(emoteWithIndex2);
                }
            }
        }
    }
}
