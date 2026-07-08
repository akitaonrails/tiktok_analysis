package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesSettingsPage;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.1AmX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189471AmX extends ClickableSpan {
    public final int $t;
    public Object l0;

    public static final void updateDrawState$0(C2189471AmX c2189471AmX, TextPaint textPaint) {
    }

    public static final void updateDrawState$1(C2189471AmX c2189471AmX, TextPaint textPaint) {
    }

    public static final void updateDrawState$2(C2189471AmX c2189471AmX, TextPaint textPaint) {
    }

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
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C2189471AmX(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C2189471AmX c2189471AmX, View view) {
        Context context = ((ViewerWishesSettingsPage) c2189471AmX.l0).getContext();
        if (context != null) {
            LiveEditText liveEditText = ((ViewerWishesSettingsPage) c2189471AmX.l0).LLLLLLJ;
            if (liveEditText != null) {
                liveEditText.clearFocus();
            }
            C018Z.LIZJ(context, "https://www.tiktok.com/community-guidelines/en/overview");
        }
    }

    public static final void onClick$1(C2189471AmX c2189471AmX, View view) {
        Context context = ((ViewerWishesSettingsPage) c2189471AmX.l0).getContext();
        if (context != null) {
            LiveEditText liveEditText = ((ViewerWishesSettingsPage) c2189471AmX.l0).LLLLLLJ;
            if (liveEditText != null) {
                liveEditText.clearFocus();
            }
            C018Z.LIZJ(context, "https://www.tiktok.com/legal/page/global/music-terms-eea/en");
        }
    }

    public static final void onClick$2(C2189471AmX c2189471AmX, View view) {
        Context context = ((ViewerWishesSettingsPage) c2189471AmX.l0).getContext();
        if (context != null) {
            LiveEditText liveEditText = ((ViewerWishesSettingsPage) c2189471AmX.l0).LLLLLLJ;
            if (liveEditText != null) {
                liveEditText.clearFocus();
            }
            C018Z.LIZJ(context, "https://www.tiktok.com/live/creators/en-US/rules_and_guidance/live_monetization_guidelines");
        }
    }

    public static final void onClick$3(C2189471AmX c2189471AmX, View view) {
        C20441214yg.LIZIZ("LiveCenterProp", "clickSpan");
        C12OY c12oy = C12OY.LIZ;
        DataChannel dataChannel = ((C1AHJ) c2189471AmX.l0).LL.getDataChannel();
        C12OY.LJIILLIIL(c12oy, dataChannel, "flare_cards", "click", null, 0, null, null, 120);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_boost_card_know_more_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
        DataChannel dataChannel2 = ((C1AHJ) c2189471AmX.l0).LL.getDataChannel();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_boost_card_know_more_show");
        c474500IjALIZ2.LJIJJLI(dataChannel2);
        c474500IjALIZ2.LIZ();
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((C1AHJ) c2189471AmX.l0).getContext(), "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_lynx%2Ffundamental%2Fpages%2Flive-center%2Fboost-guide%2Ftemplate.js&type=popup&gravity=bottom&height=484&use_spark=1&variable_height=90%25&radius=16rpx");
    }

    public static final void updateDrawState$3(C2189471AmX c2189471AmX, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
