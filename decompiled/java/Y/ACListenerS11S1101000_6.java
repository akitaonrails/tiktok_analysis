package Y;

import X.AbstractC456130Hud;
import X.C0H39;
import X.C0H3A;
import X.C0OBG;
import X.C13LP;
import X.C15438062q;
import X.C424370GkV;
import X.C424420Gka;
import X.C456210Hul;
import X.InterfaceC424410GkZ;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.tiktok.privacy.api.phl.model.PrivacyHighlightsForTeensVideo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ACListenerS11S1101000_6 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
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
        }
    }

    public static final void onClick$0(ACListenerS11S1101000_6 aCListenerS11S1101000_6, View view) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "//compliance/privacy_highlights_for_teens_feed");
        smartRouteBuildRoute.withParam("enter_from", aCListenerS11S1101000_6.s0);
        smartRouteBuildRoute.withParam("init_position", aCListenerS11S1101000_6.i2);
        List<PrivacyHighlightsForTeensVideo> list = ((C0H39) ((C0H3A) aCListenerS11S1101000_6.l1).getBindingAdapter()).LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (PrivacyHighlightsForTeensVideo privacyHighlightsForTeensVideo : (ArrayList) list) {
            Video video = privacyHighlightsForTeensVideo.videoInfo;
            video.setSourceId(privacyHighlightsForTeensVideo.id);
            arrayList.add(video);
        }
        smartRouteBuildRoute.withParam("video_list", (Serializable) C13LP.LLIIII(arrayList));
        smartRouteBuildRoute.open();
    }

    public static final void onClick$1(ACListenerS11S1101000_6 aCListenerS11S1101000_6, View view) {
        CharSequence text;
        AppCompatTextView appCompatTextView;
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        if (!(view instanceof TuxTextView) || (appCompatTextView = (AppCompatTextView) view) == null || (text = appCompatTextView.getText()) == null) {
            text = aCListenerS11S1101000_6.s0;
        }
        C424420Gka.LIZ().LIZJ(text.toString());
        InterfaceC424410GkZ emojiRecommendationSelectListener = ((C424370GkV) aCListenerS11S1101000_6.l1).getEmojiRecommendationSelectListener();
        if (emojiRecommendationSelectListener != null) {
            emojiRecommendationSelectListener.LIZ(view, text, aCListenerS11S1101000_6.i2);
        }
    }

    public static final void onClick$2(ACListenerS11S1101000_6 aCListenerS11S1101000_6, View view) {
        AbstractC456130Hud abstractC456130Hud = ((C456210Hul) aCListenerS11S1101000_6.l1).LLILLJJLI;
        if (abstractC456130Hud != null) {
            abstractC456130Hud.LIZ(aCListenerS11S1101000_6.i2, view, aCListenerS11S1101000_6.s0);
        }
    }

    public ACListenerS11S1101000_6(Object obj, String str, int i, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i2 = i;
    }
}
