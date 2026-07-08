package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerConfigResponse;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerStorage;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneAgreementFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Xt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19772712Xt extends ClickableSpan {
    public final int $t;
    public Object l0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            case 2:
                updateDrawState$2(this, textPaint);
                break;
            case 3:
                updateDrawState$3(this, textPaint);
                break;
            case 4:
                updateDrawState$4(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C19772712Xt(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C19772712Xt c19772712Xt, View view) {
        ((ShoutoutsPlayActivity) c19772712Xt.l0).LLLLZIL().hR2(view.getContext(), ((ShoutoutsPlayActivity) c19772712Xt.l0).LLJJI);
    }

    public static final void onClick$1(C19772712Xt c19772712Xt, View view) {
        InterfaceC19460411Bq videoDownloadClickListener;
        if (((C19459811Bk) c19772712Xt.l0).getMDownloadFailedTextView().getVisibility() == 0 && (videoDownloadClickListener = ((C19459811Bk) c19772712Xt.l0).getVideoDownloadClickListener()) != null) {
            videoDownloadClickListener.k1();
        }
    }

    public static final void onClick$2(C19772712Xt c19772712Xt, View view) {
        C11VO c11vo = ((InstantCloneAgreementFragment) c19772712Xt.l0).LLILLJJLI;
        if (c11vo != null) {
            c11vo.LIZ.LJ("agreement_detail_page");
        }
    }

    public static final void onClick$3(C19772712Xt c19772712Xt, View view) {
        C11VO c11vo = ((InstantCloneAgreementFragment) c19772712Xt.l0).LLILLJJLI;
        if (c11vo != null) {
            c11vo.LIZ.LJ("agreement_detail_page");
        }
    }

    public static final void onClick$4(C19772712Xt c19772712Xt, View view) {
        String str;
        ArticleStickerStorage.LIZ.getClass();
        ArticleStickerConfigResponse articleStickerConfigResponseLIZJ = ArticleStickerStorage.LIZJ();
        if (articleStickerConfigResponseLIZJ != null && (str = articleStickerConfigResponseLIZJ.termLink) != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), str);
            smartRouteBuildRoute.withParam("use_spark", true);
            smartRouteBuildRoute.open();
        }
    }

    public static final void updateDrawState$0(C19772712Xt c19772712Xt, TextPaint textPaint) {
        textPaint.setColor(C960203pA.LIZ(R.attr.ee, (ShoutoutsPlayActivity) c19772712Xt.l0));
        textPaint.setUnderlineText(true);
    }

    public static final void updateDrawState$1(C19772712Xt c19772712Xt, TextPaint textPaint) {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(83);
        textPaint.setTypeface(c444890HcV.getTypeface());
    }

    public static final void updateDrawState$2(C19772712Xt c19772712Xt, TextPaint textPaint) {
        Integer numLIZJ;
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        if (((InstantCloneAgreementFragment) c19772712Xt.l0).getContext() != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, new ContextThemeWrapper(((InstantCloneAgreementFragment) c19772712Xt.l0).getContext(), R.style.y0))) != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
    }

    public static final void updateDrawState$3(C19772712Xt c19772712Xt, TextPaint textPaint) {
        Integer numLIZJ;
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        if (((InstantCloneAgreementFragment) c19772712Xt.l0).getContext() != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, new ContextThemeWrapper(((InstantCloneAgreementFragment) c19772712Xt.l0).getContext(), R.style.y0))) != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
    }

    public static final void updateDrawState$4(C19772712Xt c19772712Xt, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, (Context) c19772712Xt.l0);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
        textPaint.setUnderlineText(false);
    }
}
