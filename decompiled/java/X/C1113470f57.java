package X;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenSubviewSetting;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0f57, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113470f57 extends AbstractC1113530f5D {
    public final AbstractC1113400f50 LIZJ;
    public final C16F5 LIZLLL;
    public final C16F5 LJ;
    public final View LJFF;
    public final String LJI;
    public final View LJII;
    public boolean LJIIIIZZ;

    public final void LJIIJJI(boolean z) {
        this.LJ.setEnabled(z);
        if (z) {
            C786410Ut5.k5(this.LJ, 1.0f);
        } else {
            C786410Ut5.k5(this.LJ, 0.4f);
        }
    }

    public C1113470f57(AbstractC1113400f50 abstractC1113400f50, View view) {
        super(view);
        this.LIZJ = abstractC1113400f50;
        this.LIZLLL = (C16F5) view.findViewById(R.id.yf6);
        this.LJ = (C16F5) view.findViewById(R.id.a4x);
        this.LJFF = view.findViewById(R.id.fzz);
        this.LJI = ".,!?，。！？";
        this.LJII = view.findViewById(R.id.eu1);
    }

    @Override // X.AbstractC1113530f5D
    public final CharSequence LIZJ(CharSequence charSequence, final AbstractC1110800f0o<?> abstractC1110800f0o) {
        AbstractC1113400f50 abstractC1113400f50;
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic topicLIZIZ;
        if (LivePublicScreenSubviewSetting.INSTANCE.appendTag() && (abstractC1113400f50 = this.LIZJ) != null && (topicLIZIZ = abstractC1113400f50.LIZIZ(abstractC1110800f0o)) != null && topicLIZIZ.topicText != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (charSequence.length() > 0 && !a0.LJJIJ(this.LJI, charSequence.charAt(charSequence.length() - 1))) {
                spannableStringBuilder2.append((CharSequence) ",");
            }
            SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder2.append(' ').append((CharSequence) AbstractC1113530f5D.LJ(topicLIZIZ.topicText).toString()).append((CharSequence) e3.d);
            C786410Ut5.q2(spannableStringBuilderAppend, new AbstractC1098790ehR() { // from class: X.0f2B
                @Override // X.AbstractC431510Gw1
                public final void LIZ() {
                    this.LLILZIL.LJIIJ(abstractC1110800f0o.LLIIIILZ(), abstractC1110800f0o.LLJJIII(), abstractC1110800f0o.LLIIJI());
                }

                @Override // X.AbstractC1098790ehR
                public final void LIZIZ(View view) {
                    this.LLILZIL.LJIIJ(abstractC1110800f0o.LLIIIILZ(), abstractC1110800f0o.LLJJIII(), abstractC1110800f0o.LLIIJI());
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }
            }, 0, spannableStringBuilderAppend.length(), 33);
            C786410Ut5.q2(spannableStringBuilderAppend, new ForegroundColorSpan(abstractC1110800f0o.getColor()), 0, spannableStringBuilderAppend.length(), 33);
            return spannableStringBuilder.append((CharSequence) spannableStringBuilderAppend);
        }
        return charSequence;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    @Override // X.AbstractC1113530f5D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(X.AbstractC1110800f0o<?> r18, java.util.List<java.lang.Object> r19) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1113470f57.LJII(X.0f0o, java.util.List):boolean");
    }

    public final void LJIIIZ(AbstractC1110790f0n abstractC1110790f0n, PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic, String str) {
        AbstractC1113530f5D.LJFF(this, abstractC1110790f0n, topic, str, false, topic.eventTrackingFields, 8);
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton = topic.actionButton;
        if (actionButton != null && C500260Jjc.LJJIFFI(Boolean.valueOf(topic.LIZ))) {
            AbstractC1113400f50 abstractC1113400f50 = this.LIZJ;
            if (abstractC1113400f50 != null) {
                abstractC1113400f50.LIZJ(abstractC1110790f0n, topic);
            }
            LIZ(topic, actionButton, abstractC1110790f0n, this.LIZ.getContext(), true);
        }
    }

    public final void LJIIJ(C1109770ez9 c1109770ez9, long j, long j2) {
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        C500260Jjc.LJJJJJ(c1109770ez9.LIZIZ, null, new C496620Jdk(j, j2, this, c1109770ez9, null), 3);
    }
}
