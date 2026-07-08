package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.product.TakoProductListAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.userlist.TakoUserListAssem;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateFragment;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ycX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864550ycX extends C0DXR {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public C1864550ycX(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LIZIZ$0(C1864550ycX c1864550ycX, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        Pair pair;
        Object first;
        Object second;
        int iIntValue;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            Integer num = (Integer) c1864550ycX.l0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            pair = new Pair(Integer.valueOf(iIntValue), Integer.valueOf(C1857750yRZ.LJ() / 2));
        } else if (childAdapterPosition == c21673919s1.LIZIZ() - 1) {
            pair = new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LIZLLL()));
        } else {
            pair = new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LJ() / 2));
        }
        if (C1857280yQo.LIZ((TakoCardAbility) ((TakoUserListAssem) c1864550ycX.l1).LLJLILLLLZIIL.getValue())) {
            first = pair.getSecond();
        } else {
            first = pair.getFirst();
        }
        rect.left = ((Number) first).intValue();
        if (C1857280yQo.LIZ((TakoCardAbility) ((TakoUserListAssem) c1864550ycX.l1).LLJLILLLLZIIL.getValue())) {
            second = pair.getFirst();
        } else {
            second = pair.getSecond();
        }
        rect.right = ((Number) second).intValue();
    }

    public static final void LIZIZ$1(C1864550ycX c1864550ycX, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        Pair pair;
        Object first;
        Object second;
        int iIntValue;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            Integer num = (Integer) c1864550ycX.l0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            pair = new Pair(Integer.valueOf(iIntValue), Integer.valueOf(C1857750yRZ.LJ() / 2));
        } else if (childAdapterPosition == c21673919s1.LIZIZ() - 1) {
            pair = new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LIZLLL()));
        } else {
            pair = new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LJ() / 2));
        }
        if (C1857280yQo.LIZ((TakoCardAbility) ((TakoProductListAssem) c1864550ycX.l1).LLJLL.getValue())) {
            first = pair.getSecond();
        } else {
            first = pair.getFirst();
        }
        rect.left = ((Number) first).intValue();
        if (C1857280yQo.LIZ((TakoCardAbility) ((TakoProductListAssem) c1864550ycX.l1).LLJLL.getValue())) {
            second = pair.getFirst();
        } else {
            second = pair.getSecond();
        }
        rect.right = ((Number) second).intValue();
    }

    public static final void LIZIZ$2(C1864550ycX c1864550ycX, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ = c21673919s1.LIZIZ();
        int i = childAdapterPosition % 2;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(8 - ((i * 8) / 2))));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((i + 1) * 8) / 2)));
        if (C426750GoL.LIZLLL(((ViewOnAttachStateChangeListenerC20604515jv) c1864550ycX.l0).getContext())) {
            rect.left = iLIZIZ3;
            rect.right = iLIZIZ2;
        } else {
            rect.left = iLIZIZ2;
            rect.right = iLIZIZ3;
        }
        rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        ((TakoImageCreateFragment) c1864550ycX.l1).getClass();
        int iLIZIZ4 = 0;
        if (childAdapterPosition >= ((((iLIZIZ + 2) - 1) / 2) - 1) * 2) {
            int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)) + ((TakoImageCreateFragment) c1864550ycX.l1).WR();
            C1852670yJN.LIZ.getClass();
            if (((Number) C1852670yJN.LIZLLL.getValue()).intValue() == C1852670yJN.LIZJ) {
                iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
            }
            rect.bottom = iLIZIZ5 + iLIZIZ4;
        }
    }
}
