package Y;

import X.C1308910kAL;
import X.C13LP;
import X.C1602160rnK;
import X.C1C7U;
import X.C418440Gaw;
import X.C420420Ge8;
import X.C427760Gpy;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC428930Grr;
import X.EnumC429060Gs4;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveShareUser;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS0S1202000_6 implements Runnable {
    public final int $t;
    public int i3;
    public int i4;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        LiveImageUrlModel liveImageUrlModel;
        List<String> list;
        C420420Ge8 c420420Ge8 = (C420420Ge8) this.l1;
        String str = this.s0;
        c420420Ge8.getClass();
        TuxTextView tuxTextView = new TuxTextView(c420420Ge8.getContext(), null, 6, 0);
        tuxTextView.setText(str);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.z_, tuxTextView.getContext());
        tuxTextView.setTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        tuxTextView.setTuxFont(72);
        tuxTextView.setGravity(16);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        tuxTextView.setGravity(16);
        C786410Ut5.R6(tuxTextView, marginLayoutParams);
        c420420Ge8.LLILLL = tuxTextView;
        C420420Ge8 c420420Ge82 = (C420420Ge8) this.l1;
        TuxTextView tuxTextView2 = c420420Ge82.LLILLL;
        if (tuxTextView2 != null) {
            c420420Ge82.addView(tuxTextView2);
        }
        C420420Ge8 c420420Ge83 = (C420420Ge8) this.l1;
        List list2 = (List) this.l2;
        int i = this.i3;
        int i2 = this.i4;
        c420420Ge83.getClass();
        int size = list2.size();
        C427760Gpy c427760Gpy = new C427760Gpy(c420420Ge83.getContext(), null, 6);
        c427760Gpy.setGravity(16);
        c427760Gpy.setMaxImageNum(i2);
        c427760Gpy.setTotalCount(i);
        c427760Gpy.setSize(EnumC428930Grr.X_SMALL);
        c427760Gpy.setStacking(EnumC429060Gs4.LAST_ON_TOP);
        for (int i3 = 0; i3 < size; i3++) {
            LiveShareUser liveShareUser = (LiveShareUser) C13LP.LJJJLZIJ(i3, list2);
            C427760Gpy.LIZ(c427760Gpy, i3, String.valueOf((liveShareUser == null || (liveImageUrlModel = liveShareUser.avatarThumb) == null || (list = liveImageUrlModel.urls) == null) ? null : ListProtector.get(list, 0)), "live tag2", null, null, false, null, 2040);
        }
        c420420Ge83.LLILLJJLI = c427760Gpy;
        C420420Ge8 c420420Ge84 = (C420420Ge8) this.l1;
        C427760Gpy c427760Gpy2 = c420420Ge84.LLILLJJLI;
        if (c427760Gpy2 != null) {
            c420420Ge84.addView(c427760Gpy2);
        }
        C420420Ge8 c420420Ge85 = (C420420Ge8) this.l1;
        int visibility = c420420Ge85.getVisibility();
        c420420Ge85.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c420420Ge85);
    }

    public static final void run$0(ARunnableS0S1202000_6 aRunnableS0S1202000_6) {
        boolean zLIZ;
        C1C7U.LIZ("DetailFragmentPanel@5b0b.makeSureViewHolderCreatedAndShowLikeFragment$1");
        try {
            ((DetailFragmentPanel) aRunnableS0S1202000_6.l2).M(aRunnableS0S1202000_6.i3, aRunnableS0S1202000_6.i4 + 1, (Aweme) aRunnableS0S1202000_6.l1, aRunnableS0S1202000_6.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DetailFragmentPanel@5b0b.makeSureViewHolderCreatedAndShowLikeFragment$1");
    }

    public static final void run$1(ARunnableS0S1202000_6 aRunnableS0S1202000_6) {
        boolean zLIZ;
        C1C7U.LIZ("LiveAvatarWithNumTagView@3427.show$1");
        try {
            aRunnableS0S1202000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveAvatarWithNumTagView@3427.show$1");
    }

    public ARunnableS0S1202000_6(Object obj, Object obj2, String str, int i, int i2, int i3) {
        this.$t = i3;
        this.l2 = obj;
        this.l1 = obj2;
        this.s0 = str;
        this.i3 = i;
        this.i4 = i2;
    }
}
