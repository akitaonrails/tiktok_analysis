package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.PreviewGameRewardsWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.guessing.PreviewGameGuessingWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.moment.PreviewGameMomentWidget;

/* JADX INFO: renamed from: X.1Ame, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class ViewOnLayoutChangeListenerC2189541Ame implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC2189541Ame(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC2189541Ame viewOnLayoutChangeListenerC2189541Ame, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C2252261DDk c2252261DDk;
        int measuredWidth;
        int measuredWidth2;
        ((View) viewOnLayoutChangeListenerC2189541Ame.l0).removeOnLayoutChangeListener(viewOnLayoutChangeListenerC2189541Ame);
        PreviewGameMomentWidget previewGameMomentWidget = (PreviewGameMomentWidget) viewOnLayoutChangeListenerC2189541Ame.l1;
        ViewGroup viewGroup = previewGameMomentWidget.LLJI;
        if (viewGroup != null && (c2252261DDk = previewGameMomentWidget.LLJIJIL) != null && (measuredWidth2 = c2252261DDk.getMeasuredWidth()) > (measuredWidth = viewGroup.getMeasuredWidth())) {
            boolean z = true;
            if (c2252261DDk.getLayoutDirection() != 1) {
                z = false;
            }
            CharSequence text = null;
            if (z) {
                TextView textView = previewGameMomentWidget.LLJILJILJ;
                if (textView != null) {
                    TextView textView2 = previewGameMomentWidget.LLJILJIL;
                    if (textView2 != null) {
                        text = textView2.getText();
                    }
                    textView.setText(text);
                }
                c2252261DDk.scrollTo((measuredWidth2 + measuredWidth2) - measuredWidth, 0);
            } else {
                TextView textView3 = previewGameMomentWidget.LLJILJILJ;
                if (textView3 != null) {
                    TextView textView4 = previewGameMomentWidget.LLJILJIL;
                    if (textView4 != null) {
                        text = textView4.getText();
                    }
                    textView3.setText(text);
                }
            }
            c2252261DDk.LIZ(measuredWidth2, (int) C497740JfY.LIZIZ(40));
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC2189541Ame viewOnLayoutChangeListenerC2189541Ame, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C2252261DDk c2252261DDk;
        int measuredWidth;
        int measuredWidth2;
        ((View) viewOnLayoutChangeListenerC2189541Ame.l0).removeOnLayoutChangeListener(viewOnLayoutChangeListenerC2189541Ame);
        PreviewGameRewardsWidget previewGameRewardsWidget = (PreviewGameRewardsWidget) viewOnLayoutChangeListenerC2189541Ame.l1;
        ViewGroup viewGroup = previewGameRewardsWidget.LLJIJIL;
        if (viewGroup != null && (c2252261DDk = previewGameRewardsWidget.LLJILJIL) != null && (measuredWidth2 = c2252261DDk.getMeasuredWidth()) > (measuredWidth = viewGroup.getMeasuredWidth())) {
            boolean z = true;
            if (c2252261DDk.getLayoutDirection() != 1) {
                z = false;
            }
            CharSequence text = null;
            if (z) {
                TextView textView = previewGameRewardsWidget.LLJILLL;
                if (textView != null) {
                    TextView textView2 = previewGameRewardsWidget.LLJILJILJ;
                    if (textView2 != null) {
                        text = textView2.getText();
                    }
                    textView.setText(text);
                }
                c2252261DDk.scrollTo((measuredWidth2 + measuredWidth2) - measuredWidth, 0);
            } else {
                TextView textView3 = previewGameRewardsWidget.LLJILLL;
                if (textView3 != null) {
                    TextView textView4 = previewGameRewardsWidget.LLJILJILJ;
                    if (textView4 != null) {
                        text = textView4.getText();
                    }
                    textView3.setText(text);
                }
            }
            c2252261DDk.LIZ(measuredWidth2, (int) C497740JfY.LIZIZ(40));
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC2189541Ame viewOnLayoutChangeListenerC2189541Ame, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C2252261DDk c2252261DDk;
        int measuredWidth;
        int measuredWidth2;
        ((View) viewOnLayoutChangeListenerC2189541Ame.l0).removeOnLayoutChangeListener(viewOnLayoutChangeListenerC2189541Ame);
        PreviewGameGuessingWidget previewGameGuessingWidget = (PreviewGameGuessingWidget) viewOnLayoutChangeListenerC2189541Ame.l1;
        ViewGroup viewGroup = previewGameGuessingWidget.LLJIJIL;
        if (viewGroup != null && (c2252261DDk = previewGameGuessingWidget.LLJILJIL) != null && (measuredWidth2 = c2252261DDk.getMeasuredWidth()) > (measuredWidth = viewGroup.getMeasuredWidth())) {
            boolean z = true;
            if (c2252261DDk.getLayoutDirection() != 1) {
                z = false;
            }
            CharSequence text = null;
            if (z) {
                TextView textView = previewGameGuessingWidget.LLJILLL;
                if (textView != null) {
                    TextView textView2 = previewGameGuessingWidget.LLJILJILJ;
                    if (textView2 != null) {
                        text = textView2.getText();
                    }
                    textView.setText(text);
                }
                c2252261DDk.scrollTo((measuredWidth2 + measuredWidth2) - measuredWidth, 0);
            } else {
                TextView textView3 = previewGameGuessingWidget.LLJILLL;
                if (textView3 != null) {
                    TextView textView4 = previewGameGuessingWidget.LLJILJILJ;
                    if (textView4 != null) {
                        text = textView4.getText();
                    }
                    textView3.setText(text);
                }
            }
            c2252261DDk.LIZ(measuredWidth2, (int) C497740JfY.LIZIZ(40));
        }
    }
}
