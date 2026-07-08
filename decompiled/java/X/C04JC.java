package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.04JC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JC extends C0DXR {
    public final int $t;

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, rect, view, recyclerView, c21673919s1);
                break;
            case 1:
                LIZIZ$1(this, rect, view, recyclerView, c21673919s1);
                break;
            case 2:
                LIZIZ$2(this, rect, view, recyclerView, c21673919s1);
                break;
            case 3:
                LIZIZ$3(this, rect, view, recyclerView, c21673919s1);
                break;
            case 4:
                LIZIZ$4(this, rect, view, recyclerView, c21673919s1);
                break;
            case 5:
                LIZIZ$5(this, rect, view, recyclerView, c21673919s1);
                break;
            case 6:
                LIZIZ$6(this, rect, view, recyclerView, c21673919s1);
                break;
            case 7:
                LIZIZ$7(this, rect, view, recyclerView, c21673919s1);
                break;
            case 8:
                LIZIZ$8(this, rect, view, recyclerView, c21673919s1);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZIZ$9(this, rect, view, recyclerView, c21673919s1);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZIZ$10(this, rect, view, recyclerView, c21673919s1);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZIZ$11(this, rect, view, recyclerView, c21673919s1);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZIZ$12(this, rect, view, recyclerView, c21673919s1);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZIZ$13(this, rect, view, recyclerView, c21673919s1);
                break;
            case 14:
                LIZIZ$14(this, rect, view, recyclerView, c21673919s1);
                break;
            case 15:
                LIZIZ$15(this, rect, view, recyclerView, c21673919s1);
                break;
            case 16:
                LIZIZ$16(this, rect, view, recyclerView, c21673919s1);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZIZ$17(this, rect, view, recyclerView, c21673919s1);
                break;
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    public C04JC(int i) {
        this.$t = i;
    }

    public static final void LIZIZ$0(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.left = C04DQ.LLILLL;
        }
        rect.right = C04DQ.LLILLJJLI;
    }

    public static final void LIZIZ$1(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
    }

    public static final void LIZIZ$10(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
    }

    public static final void LIZIZ$11(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int itemCount;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        if (childAdapterPosition == itemCount - 1) {
            rect.right = 0;
        } else {
            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        }
    }

    public static final void LIZIZ$12(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
    }

    public static final void LIZIZ$13(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getChildAdapterPosition(view) > 0) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        } else {
            rect.left = 0;
        }
    }

    public static final void LIZIZ$14(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int itemCount;
        int iLIZIZ;
        int iLIZIZ2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        if (childAdapterPosition == 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        }
        if (childAdapterPosition == itemCount - 1) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        }
        if (C426750GoL.LIZLLL(view.getContext())) {
            rect.left = iLIZIZ2;
            rect.right = iLIZIZ;
        } else {
            rect.left = iLIZIZ;
            rect.right = iLIZIZ2;
        }
    }

    public static final void LIZIZ$15(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            return;
        }
        rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    public static final void LIZIZ$16(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    }

    public static final void LIZIZ$17(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    }

    public static final void LIZIZ$2(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        if (childAdapterPosition != 0) {
            iLIZIZ2 = iLIZIZ / 2;
        }
        rect.left = iLIZIZ2;
        rect.right = iLIZIZ / 2;
    }

    public static final void LIZIZ$3(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        if (childAdapterPosition != 0) {
            iLIZIZ2 = iLIZIZ / 2;
        }
        rect.left = iLIZIZ2;
        rect.right = iLIZIZ / 2;
    }

    public static final void LIZIZ$4(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        int i = iLIZIZ / 2;
        rect.left = i;
        rect.right = i;
        if (childAdapterPosition < 4) {
            iLIZIZ = 0;
        }
        rect.top = iLIZIZ;
    }

    public static final void LIZIZ$5(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
    }

    public static final void LIZIZ$6(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            if (recyclerView.getChildAdapterPosition(view) == adapter.getItemCount() - 1) {
                return;
            }
        }
        rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    public static final void LIZIZ$7(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getChildAdapterPosition(view) > 0) {
            rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
    }

    public static final void LIZIZ$8(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int itemCount;
        int i;
        int i2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        if (childAdapterPosition == 0) {
            i = 16;
        } else {
            i = 8;
        }
        rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
        if (childAdapterPosition == itemCount - 1) {
            i2 = 16;
        } else {
            i2 = 8;
        }
        rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
    }

    public static final void LIZIZ$9(C04JC c04jc, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }
}
