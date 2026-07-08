package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0SQ0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SQ0 extends FrameLayout {
    public final TuxTextView LL;
    public Aweme LLILLJJLI;
    public C0SQ1 LLILLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C622680Oba.LIZJ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C622680Oba.LIZLLL(this);
    }

    public final boolean LIZ(Aweme aweme) {
        InteractionTagUserInfo interactionTagUserInfo;
        int size;
        InteractionTagInfo interactionTagInfo;
        List<InteractionTagUserInfo> list;
        InteractionTagInfo interactionTagInfo2;
        List<InteractionTagUserInfo> list2;
        this.LLILLJJLI = aweme;
        if (aweme != null && (interactionTagInfo2 = aweme.getInteractionTagInfo()) != null && (list2 = interactionTagInfo2.taggedUsers) != null) {
            interactionTagUserInfo = (InteractionTagUserInfo) C13LP.LJJJLL(list2);
        } else {
            interactionTagUserInfo = null;
        }
        if (aweme != null && (interactionTagInfo = aweme.getInteractionTagInfo()) != null && (list = interactionTagInfo.taggedUsers) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (!C298710BnJ.LIZ() && !C298690BnH.LIZIZ()) {
            C1351950lHl.LJIJJ(this);
            return false;
        }
        C1351950lHl.LJIJJLI(this);
        if (interactionTagUserInfo == null) {
            C1351950lHl.LJIJJ(this);
            return false;
        }
        C1351950lHl.LJIJJLI(this);
        if (size > 1) {
            this.LL.setText(C786410Ut5.j4(getContext().getResources().getString(2131849593), Arrays.copyOf(new Object[]{"", Integer.valueOf(size)}, 2)));
            return true;
        }
        TuxTextView tuxTextView = this.LL;
        String str = interactionTagUserInfo.nickname;
        if (str == null) {
            str = interactionTagUserInfo.uniqueId;
        }
        tuxTextView.setText(str);
        return true;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onInteractionTagInfoEvent(InteractionTagInfoEvent interactionTagInfoEvent) {
        if (interactionTagInfoEvent == null) {
            return;
        }
        LIZ(interactionTagInfoEvent.aweme);
    }

    public C0SQ0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.a1k, this);
        this.LL = (TuxTextView) findViewById(R.id.x2o);
    }
}
