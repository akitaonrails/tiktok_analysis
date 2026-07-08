package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssem;

/* JADX INFO: renamed from: X.0g4S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151500g4S extends C0DXR {
    public final int $t;
    public Object l0;

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, rect, view, recyclerView, c21673919s1);
                break;
            case 1:
                LIZIZ$1(this, rect, view, recyclerView, c21673919s1);
                break;
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    public C1151500g4S(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(C1151500g4S c1151500g4S, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int iLJIIIIZZ;
        int iIntValue;
        C20600815jK<InterfaceC1891350zJl> state;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((GiftAnchorPanelGiftPageCenterAssem) c1151500g4S.l0).LLJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            iLJIIIIZZ = state.LJIIIIZZ();
        } else {
            iLJIIIIZZ = 0;
        }
        if (((GiftAnchorPanelGiftPageCenterAssem) c1151500g4S.l0).ip().getState().LLILLJJLI.LIZ != null) {
            if (childAdapterPosition == 0) {
                rect.set(0, 0, 0, C439101nJ.LIZ(4));
                return;
            } else {
                childAdapterPosition--;
                iLJIIIIZZ--;
            }
        }
        if ((childAdapterPosition / 4) + 1 == ((iLJIIIIZZ - 1) / 4) + 1) {
            iIntValue = ((Number) ((GiftAnchorPanelGiftPageCenterAssem) c1151500g4S.l0).LLJJIJIIJIL.getValue()).intValue();
        } else {
            iIntValue = 0;
        }
        if (C497740JfY.LJJ()) {
            int i = childAdapterPosition % 4;
            if (i != 0) {
                if (i != 1) {
                    if (i != 3) {
                        rect.set(0, 0, 0, iIntValue);
                        return;
                    } else {
                        rect.set(C439101nJ.LIZ(6), 0, 0, iIntValue);
                        return;
                    }
                }
                rect.set(0, 0, C439101nJ.LIZ(3), iIntValue);
                return;
            }
            rect.set(0, 0, C439101nJ.LIZ(6), iIntValue);
            return;
        }
        int i2 = childAdapterPosition % 4;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 3) {
                    rect.set(0, 0, 0, iIntValue);
                    return;
                } else {
                    rect.set(0, 0, C439101nJ.LIZ(6), iIntValue);
                    return;
                }
            }
            rect.set(C439101nJ.LIZ(3), 0, 0, iIntValue);
            return;
        }
        rect.set(C439101nJ.LIZ(6), 0, 0, iIntValue);
    }

    public static final void LIZIZ$1(C1151500g4S c1151500g4S, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int iLIZIZ;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        if (childAdapterPosition == 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((C1203130hPj) c1151500g4S.l0).LLILLJJLI)));
        } else {
            iLIZIZ = 0;
        }
        if (childAdapterPosition == ((C1203130hPj) c1151500g4S.l0).LL.getItemCount() - 1) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((C1203130hPj) c1151500g4S.l0).LLILLJJLI)));
        }
        if (C426750GoL.LJ((C1203130hPj) c1151500g4S.l0)) {
            rect.left = iLIZIZ2;
            rect.right = iLIZIZ;
        } else {
            rect.left = iLIZIZ;
            rect.right = iLIZIZ2;
        }
    }
}
