package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1D05, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D05 extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C2248671Czp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1D05(C2248671Czp c2248671Czp) {
        super(1);
        this.LL = c2248671Czp;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        int duration;
        Video video;
        View view2 = view;
        if (view2 instanceof TuxTextView) {
            if (this.LL.LJIJJ()) {
                TuxTextView tuxTextView = (TuxTextView) view2;
                tuxTextView.LJJJJI(16.0f);
                tuxTextView.setTuxFont(102);
                tuxTextView.setTextColor(ColorProtector.parseColor("#99FFFFFF"));
            } else {
                TuxTextView tuxTextView2 = (TuxTextView) view2;
                tuxTextView2.LJJJJI(32.0f);
                C786410Ut5.B5(tuxTextView2, 0.75f);
            }
            if (C1867340yh2.LIZ()) {
                ((TextView) view2).setFontFeatureSettings("tnum");
            }
            TextView textView = (TextView) view2;
            Aweme aweme = this.LL.LLJJ;
            if (aweme != null && (video = aweme.getVideo()) != null) {
                duration = video.getDuration();
            } else {
                duration = 0;
            }
            textView.setText(C0QBT.LIZ(C0QBT.LIZJ(duration), false));
        }
        return Unit.LIZ;
    }
}
