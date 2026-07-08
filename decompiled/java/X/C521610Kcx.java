package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.assem.GameDrawerCategoryFullDisplayAssem;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.assem.GameDrawerCategoryMixedDisplayAssem;
import com.bytedance.android.livesdk.livesetting.skylight.LiveSkylightStyleSetting;

/* JADX INFO: renamed from: X.0Kcx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521610Kcx extends C0DXR {
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
            case 2:
                LIZIZ$2(this, rect, view, recyclerView, c21673919s1);
                break;
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    public C521610Kcx(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(C521610Kcx c521610Kcx, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        C21681919tJ c21681919tJ;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Integer numValueOf = null;
        if ((layoutParams instanceof C21681919tJ) && (c21681919tJ = (C21681919tJ) layoutParams) != null) {
            numValueOf = Integer.valueOf(c21681919tJ.LL);
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            if (C497740JfY.LJJ()) {
                rect.right = ((GameDrawerCategoryFullDisplayAssem) c521610Kcx.l0).LLJJIJIL;
            } else {
                rect.left = ((GameDrawerCategoryFullDisplayAssem) c521610Kcx.l0).LLJJIJIL;
            }
        }
        if (recyclerView.getChildAdapterPosition(view) > 1) {
            rect.top = ((GameDrawerCategoryFullDisplayAssem) c521610Kcx.l0).LLJJJ;
        }
    }

    public static final void LIZIZ$1(C521610Kcx c521610Kcx, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            if (C497740JfY.LJJ()) {
                rect.right = ((GameDrawerCategoryMixedDisplayAssem) c521610Kcx.l0).LLJJIJIL;
            } else {
                rect.left = ((GameDrawerCategoryMixedDisplayAssem) c521610Kcx.l0).LLJJIJIL;
            }
        }
    }

    public static final void LIZIZ$2(C521610Kcx c521610Kcx, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        float fLIZIZ;
        int itemCount;
        boolean zLJJ = C497740JfY.LJJ();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (LiveSkylightStyleSetting.INSTANCE.enableStyleV2()) {
            fLIZIZ = C497740JfY.LIZIZ(5.0f);
        } else {
            fLIZIZ = C497740JfY.LIZIZ(12.0f);
        }
        int i = (int) fLIZIZ;
        if (childAdapterPosition == 0) {
            if (zLJJ) {
                rect.right = i;
                return;
            } else {
                rect.left = i;
                return;
            }
        }
        C472450Ifr c472450Ifr = ((C477190InV) c521610Kcx.l0).LLIZ;
        if (c472450Ifr != null) {
            itemCount = c472450Ifr.getItemCount();
        } else {
            itemCount = 0;
        }
        if (childAdapterPosition != itemCount - 1) {
            return;
        }
        if (zLJJ) {
            rect.left = i;
        } else {
            rect.right = i;
        }
    }
}
