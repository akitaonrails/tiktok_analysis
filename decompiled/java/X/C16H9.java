package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment;

/* JADX INFO: renamed from: X.16H9, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16H9 implements View.OnLayoutChangeListener {
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
        }
    }

    public C16H9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final void onLayoutChange$0(C16H9 c16h9, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c16h9);
        C12BX c12bx = ((C20581915gH) c16h9.l0).LLJILJILJ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = ((StoryThoughtCreationFragment) c16h9.l1).SR().LLILZ.backgroundViewMarginBottom();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12bx);
        c12bx.setLayoutParams(layoutParams);
    }

    public static final void onLayoutChange$1(C16H9 c16h9, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c16h9);
        C12BX c12bx = ((C20580115fz) c16h9.l0).LLJJJ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = ((StoryThoughtAvatarCreationFragment) c16h9.l1).WR().LLILZ.backgroundViewMarginBottom();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12bx);
        c12bx.setLayoutParams(layoutParams);
    }
}
