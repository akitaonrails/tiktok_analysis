package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Dhp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346270Dhp extends C0DXR {
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
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    public C346270Dhp(int i) {
        this.$t = i;
    }

    public static final void LIZIZ$0(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int iLIZIZ;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        if (C444960Hcc.LIZIZ()) {
            iLIZIZ = iLIZIZ2;
        } else if (childAdapterPosition == 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else {
            iLIZIZ = 0;
        }
        rect.left = iLIZIZ;
        if (C444960Hcc.LIZIZ()) {
            if (childAdapterPosition == 0) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ2 = 0;
            }
        }
        rect.right = iLIZIZ2;
    }

    public static final void LIZIZ$1(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition() == c21673919s1.LIZIZ() - 1) {
            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else {
            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    }

    public static final void LIZIZ$10(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
        if (C497740JfY.LJJ()) {
            if (childAdapterPosition == 0) {
                rect.right = 0;
                rect.left = iLIZIZ / 2;
                return;
            } else {
                int i = iLIZIZ / 2;
                rect.left = i;
                rect.right = i;
                return;
            }
        }
        if (childAdapterPosition == 0) {
            rect.left = 0;
            rect.right = iLIZIZ / 2;
        } else {
            int i2 = iLIZIZ / 2;
            rect.left = i2;
            rect.right = i2;
        }
    }

    public static final void LIZIZ$11(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ = c21673919s1.LIZIZ();
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        if (childAdapterPosition == 0) {
            if (C444960Hcc.LIZJ(view.getContext())) {
                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
        } else if (childAdapterPosition == iLIZIZ - 1) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        if (C444960Hcc.LIZJ(view.getContext())) {
            rect.left = iLIZIZ2;
        } else {
            rect.right = iLIZIZ2;
        }
    }

    public static final void LIZIZ$12(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    public static final void LIZIZ$13(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        } else if (recyclerView.getChildAdapterPosition(view) == c21673919s1.LIZIZ() - 1) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        } else {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        }
    }

    public static final void LIZIZ$14(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i;
        int itemCount;
        int i2;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i3 = childAdapterPosition % 2;
        if (i3 == 0) {
            i = iLIZIZ2;
        } else {
            i = iLIZIZ / 2;
        }
        rect.left = i;
        if (i3 != 1) {
            iLIZIZ2 = iLIZIZ / 2;
        }
        rect.right = iLIZIZ2;
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        int i4 = itemCount / 2;
        if (itemCount % 2 == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if ((childAdapterPosition / 2) + 1 == i4 + i2) {
            rect.bottom = 0;
        } else {
            rect.bottom = iLIZIZ;
        }
    }

    public static final void LIZIZ$15(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i;
        LinearLayoutManager linearLayoutManager;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.getOrientation() == 1) {
            rect.left = iLIZIZ3;
            rect.right = iLIZIZ3;
            if (childAdapterPosition == 0) {
                iLIZIZ = 0;
            }
            rect.top = iLIZIZ;
            return;
        }
        if (C444960Hcc.LIZIZ()) {
            i = iLIZIZ2;
        } else if (childAdapterPosition == 0) {
            i = iLIZIZ3;
        } else {
            i = 0;
        }
        rect.left = i;
        if (C444960Hcc.LIZIZ()) {
            if (childAdapterPosition == 0) {
                iLIZIZ2 = iLIZIZ3;
            } else {
                iLIZIZ2 = 0;
            }
        }
        rect.right = iLIZIZ2;
    }

    public static final void LIZIZ$2(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        rect.top = (int) C497740JfY.LIZIZ(16.0f);
    }

    public static final void LIZIZ$3(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int itemCount;
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        if (childLayoutPosition == 0) {
            rect.set(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(16.0d))), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.0d))), 0);
        } else if (childLayoutPosition == itemCount - 1) {
            rect.set(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.0d))), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(16.0d))), 0);
        } else {
            rect.set(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.0d))), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.0d))), 0);
        }
    }

    public static final void LIZIZ$4(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            rect.left = C341940Daq.LIZ(16.0d);
        }
        if (childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1) {
            rect.right = C341940Daq.LIZ(16.0d);
        } else {
            rect.right = C341940Daq.LIZ(4.0d);
        }
    }

    public static final void LIZIZ$5(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (c21673919s1.LIZIZ() == 1) {
            return;
        }
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else if (recyclerView.getChildAdapterPosition(view) == c21673919s1.LIZIZ() - 1) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
    }

    public static final void LIZIZ$6(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        C21681919tJ c21681919tJ;
        GridLayoutManager gridLayoutManager;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof C21681919tJ) && (c21681919tJ = (C21681919tJ) layoutParams) != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof WrapGridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                if (c21681919tJ.LL % gridLayoutManager.LLILLJJLI != 0) {
                    if (C444960Hcc.LIZJ(view.getContext())) {
                        rect.right = (int) C11VU.LIZ(0.5f);
                    } else {
                        rect.left = (int) C11VU.LIZ(0.5f);
                    }
                } else if (C444960Hcc.LIZJ(view.getContext())) {
                    rect.left = (int) C11VU.LIZ(0.5f);
                } else {
                    rect.right = (int) C11VU.LIZ(0.5f);
                }
                rect.bottom = (int) C11VU.LIZ(1.0f);
            }
        }
    }

    public static final void LIZIZ$7(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        if (childAdapterPosition == c21673919s1.LIZIZ() - 1) {
            i = 8;
        } else {
            i = 12;
        }
        rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
    }

    public static final void LIZIZ$8(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        rect.bottom = (int) C497740JfY.LIZIZ(20.0f);
    }

    public static final void LIZIZ$9(C346270Dhp c346270Dhp, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(-4.0f);
            if (C497740JfY.LJJ()) {
                rect.right = iLIZIZ;
            } else {
                rect.left = iLIZIZ;
            }
        }
    }
}
