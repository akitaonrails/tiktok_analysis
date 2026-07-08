package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;

/* JADX INFO: renamed from: X.0IDG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDG extends C0DXR {
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

    public C0IDG(int i) {
        this.$t = i;
    }

    public static final void LIZIZ$0(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int iLJIIZILJ;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int i = childAdapterPosition % 4;
        int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(70.0f);
        Integer numValueOf = Integer.valueOf(recyclerView.getMeasuredWidth());
        if (numValueOf.intValue() > 0) {
            iLJIIZILJ = numValueOf.intValue();
        } else {
            iLJIIZILJ = C497740JfY.LJIIZILJ();
        }
        if (iLJIIZILJ == 0) {
            return;
        }
        float f = iLJIIZILJ / 4.0f;
        float f2 = i;
        float f3 = ((iLIZIZ + (i * iLIZIZ2)) + ((((iLJIIZILJ - (iLIZIZ * 2)) - (iLIZIZ2 * 4)) / 3.0f) * f2)) - (f2 * f);
        rect.left = (int) f3;
        rect.right = (int) ((f - iLIZIZ2) - f3);
        rect.bottom = (int) C497740JfY.LIZIZ(16.0f);
    }

    public static final void LIZIZ$1(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) > 0) {
            rect.left = C0H4N.LLILLJJLI;
        }
    }

    public static final void LIZIZ$10(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        view.setTranslationZ(-recyclerView.getChildAdapterPosition(view));
    }

    public static final void LIZIZ$11(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            rect.left = (int) C418040GaI.LIZ(16);
            rect.right = (int) C418040GaI.LIZ(2);
        } else if (childAdapterPosition == c21673919s1.LIZIZ() - 1) {
            rect.left = (int) C418040GaI.LIZ(2);
            rect.right = (int) C418040GaI.LIZ(16);
        } else {
            rect.left = (int) C418040GaI.LIZ(2);
            rect.right = (int) C418040GaI.LIZ(2);
        }
    }

    public static final void LIZIZ$12(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        List<InterfaceC1891350zJl> listItems;
        int childAdapterPosition;
        C1176040gi2 c1176040gi2;
        if (!(recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) || (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView) == null || (listItems = viewOnAttachStateChangeListenerC20604515jv.getListItems()) == null || listItems.size() <= (childAdapterPosition = recyclerView.getChildAdapterPosition(view))) {
            return;
        }
        Object obj = ListProtector.get(listItems, childAdapterPosition);
        if (!(obj instanceof C1176040gi2) || (c1176040gi2 = (C1176040gi2) obj) == null || childAdapterPosition == 0) {
            return;
        }
        if (c1176040gi2.getContentType() != 50001 && c1176040gi2.getContentType() != 50002) {
            rect.set(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, 0);
        } else {
            rect.set(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), 0, 0);
        }
    }

    public static final void LIZIZ$13(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        rect.left = 20;
        rect.right = 20;
    }

    public static final void LIZIZ$14(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        boolean zLIZJ = C444960Hcc.LIZJ(view.getContext());
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (zLIZJ) {
            if (childAdapterPosition == 0) {
                rect.set((int) C418040GaI.LIZ(8), 0, (int) C418040GaI.LIZ(8), 0);
                return;
            } else {
                rect.set((int) C418040GaI.LIZ(8), 0, 0, 0);
                return;
            }
        }
        if (childAdapterPosition == 0) {
            rect.set((int) C418040GaI.LIZ(8), 0, (int) C418040GaI.LIZ(8), 0);
        } else {
            rect.set(0, 0, (int) C418040GaI.LIZ(8), 0);
        }
    }

    public static final void LIZIZ$15(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) == c21673919s1.LIZIZ() - 1) {
            rect.bottom = C0HD5.LIZ(view, 20);
        }
    }

    public static final void LIZIZ$2(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int itemCount;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            view.setTranslationZ(view.getTranslationZ() + 0.1f);
        } else {
            view.setTranslationZ(-childAdapterPosition);
        }
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 1;
        }
        int iLIZIZ = 0;
        if (C426750GoL.LIZLLL(recyclerView.getContext())) {
            if (childAdapterPosition < itemCount - 1) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(-11.25d)));
            }
            rect.left = iLIZIZ;
        } else {
            if (childAdapterPosition < itemCount - 1) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(-11.25d)));
            }
            rect.right = iLIZIZ;
        }
    }

    public static final void LIZIZ$3(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (view.getVisibility() == 8) {
            return;
        }
        rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    }

    public static final void LIZIZ$4(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        rect.set(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
    }

    public static final void LIZIZ$5(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ = c21673919s1.LIZIZ();
        if (C0H4W.LIZ()) {
            if (iLIZIZ == 1) {
                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                return;
            }
            if (childAdapterPosition > 0) {
                if (childAdapterPosition < iLIZIZ - 1) {
                    rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    return;
                }
            } else if (childAdapterPosition == 0) {
                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                return;
            }
            if (childAdapterPosition != iLIZIZ - 1) {
                return;
            }
            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            return;
        }
        if (iLIZIZ == 1) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            return;
        }
        if (childAdapterPosition > 0) {
            if (childAdapterPosition < iLIZIZ - 1) {
                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                return;
            }
        } else if (childAdapterPosition == 0) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            return;
        }
        if (childAdapterPosition == iLIZIZ - 1) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
    }

    public static final void LIZIZ$6(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int iLIZIZ;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        rect.top = iLIZIZ;
    }

    public static final void LIZIZ$7(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i = -((int) (((double) recyclerView.getWidth()) * 0.015d));
        rect.left = i;
        rect.right = i;
    }

    public static final void LIZIZ$8(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int itemCount;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        if (childAdapterPosition >= 0 && childAdapterPosition == itemCount - 1) {
            rect.bottom = C439101nJ.LIZ(16);
        }
    }

    public static final void LIZIZ$9(C0IDG c0idg, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int itemCount = 0;
        boolean z = true;
        if (recyclerView.getLayoutDirection() != 1) {
            z = false;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            if (z) {
                rect.right = C1338790kwX.LIZ(12.0f);
                return;
            } else {
                rect.left = C1338790kwX.LIZ(12.0f);
                return;
            }
        }
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        }
        if (childAdapterPosition == itemCount - 1) {
            if (z) {
                rect.left = C1338790kwX.LIZ(12.0f);
                rect.right = C1338790kwX.LIZ(8.0f);
                return;
            } else {
                rect.left = C1338790kwX.LIZ(8.0f);
                rect.right = C1338790kwX.LIZ(12.0f);
                return;
            }
        }
        if (z) {
            rect.right = C1338790kwX.LIZ(8.0f);
        } else {
            rect.left = C1338790kwX.LIZ(8.0f);
        }
    }
}
