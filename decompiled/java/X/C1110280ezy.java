package X;

import Y.ARunnableS117S0100000_17;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ezy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110280ezy extends C175500lt {
    public boolean LJJJJZ;
    public boolean LJJJJZI;
    public final ForegroundColorSpan LJJJLIIL;

    @Override // X.AbstractC1110790f0n, X.InterfaceC1111840f2U
    public final void LJZ() {
        if (this.LJJJJZ) {
            return;
        }
        this.LJJJJZ = true;
        C786410Ut5.LJLIIL(400L, this.LJIJJ, new ARunnableS117S0100000_17(this, 202));
    }

    @Override // X.C1110310f01
    public final SpannableStringBuilder LLLILZ() {
        User user;
        SpannableStringBuilder spannableStringBuilder = this.LJJJI;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        String strLIZIZ = C1834150xpV.LIZIZ(((ChatMessage) this.LJIL).content);
        if (strLIZIZ == null || (user = ((ChatMessage) this.LJIL).userInfo) == null || TextUtils.isEmpty(C0KVU.LIZ(user)) || TextUtils.isEmpty(C0KVU.LIZ(user)) || TextUtils.isEmpty(strLIZIZ)) {
            strLIZIZ = "";
        }
        C1110390f09 c1110390f09 = C1110390f09.LIZ;
        SpannableStringBuilder spannableStringBuilderLIZ = C1110390f09.LIZ(((ChatMessage) this.LJIL).f314emotes, EnumC1110450f0F.PUBLICSCREEN_MESSAGE_TYPE, strLIZIZ, this.LJIILIIL.LIZ.getResources(), this.LJJJJLI, this.LJJIIZ, this.LJJJJJL, this.LJIILIIL.LIZIZ, false);
        C786410Ut5.o2(spannableStringBuilderLIZ, LJJJ(0, ((ChatMessage) this.LJIL).userInfo), 0, spannableStringBuilderLIZ.length(), 33);
        C786410Ut5.q2(spannableStringBuilderLIZ, this.LJJJLIIL, 0, spannableStringBuilderLIZ.length(), 33);
        return spannableStringBuilderLIZ;
    }

    @Override // X.C1110310f01, X.AbstractC1110520f0M, X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final void dispose() {
        super.dispose();
        this.LJIJJ.removeCallbacksAndMessages(null);
    }

    public C1110280ezy(ChatMessage chatMessage) {
        super(chatMessage);
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Fo2().getClass();
        this.LJJJLIIL = new ForegroundColorSpan(C497740JfY.LJFF(R.color.a8u));
    }

    @Override // X.C1110310f01
    public final void LLLILZLLLI(SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder != null) {
            if (!this.LJJJJZI) {
                C786410Ut5.q2(spannableStringBuilder, this.LJJJLIIL, 0, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.removeSpan(this.LJJJLIIL);
            }
        }
    }

    @Override // X.C1110310f01
    public final void LLLIZZ(SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder != null) {
            if (!this.LJJJJZI) {
                C786410Ut5.q2(spannableStringBuilder, this.LJJJLIIL, 0, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.removeSpan(this.LJJJLIIL);
            }
        }
    }
}
