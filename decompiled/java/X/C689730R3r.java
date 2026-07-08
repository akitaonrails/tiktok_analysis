package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.tako.botpage.components.video.videolist.TakoVideoListAssem;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0R3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C689730R3r extends C0DXR {
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
            case 3:
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
            case 4:
                LIZIZ$2(this, rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    @Override // X.C0DXR
    public final void LIZLLL(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        switch (this.$t) {
            case 2:
                LIZLLL$0(this, canvas, recyclerView, c21673919s1);
                break;
            case 3:
                LIZLLL$1(this, canvas, recyclerView, c21673919s1);
                break;
            default:
                super.LIZLLL(canvas, recyclerView, c21673919s1);
                break;
        }
    }

    public C689730R3r(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZLLL$0(C689730R3r c689730R3r, Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        ((InterfaceC650760Pfm) ((C650810Pfr) c689730R3r.l0).LJFF.getValue()).LIZJ(canvas, recyclerView);
        ((InterfaceC650760Pfm) ((C650810Pfr) c689730R3r.l0).LJI.getValue()).LIZJ(canvas, recyclerView);
        C650780Pfo c650780Pfo = ((C650810Pfr) c689730R3r.l0).LJ;
        if (c650780Pfo != null) {
            c650780Pfo.LIZJ(canvas, recyclerView);
        }
    }

    public static final void LIZLLL$1(C689730R3r c689730R3r, Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        ((C650750Pfl) c689730R3r.l0).LIZIZ().LIZJ(canvas, recyclerView);
    }

    public static final void LIZIZ$0(C689730R3r c689730R3r, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (recyclerView.getLayoutDirection() == 1) {
            if (childAdapterPosition != 0) {
                rect.right = ((C682910QqX) c689730R3r.l0).LIZ;
            }
        } else {
            if (childAdapterPosition == 0) {
                return;
            }
            rect.left = ((C682910QqX) c689730R3r.l0).LIZ;
        }
    }

    public static final void LIZIZ$1(C689730R3r c689730R3r, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        Pair pair;
        boolean zLIZ;
        Object first;
        Object second;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) ((TakoVideoListAssem) c689730R3r.l0).LLJLL.getValue();
            if (takoChatUIAbility != null) {
                takoChatUIAbility.Gx1();
            }
            pair = new Pair(Integer.valueOf(C1857750yRZ.LJFF()), Integer.valueOf(C1857750yRZ.LJ() / 2));
        } else if (childAdapterPosition == c21673919s1.LIZIZ() - 1) {
            pair = new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LIZLLL()));
        } else {
            pair = new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LJ() / 2));
        }
        if (C299000Bnm.LIZ()) {
            zLIZ = C444960Hcc.LIZIZ();
        } else {
            zLIZ = C1857280yQo.LIZ(((TakoVideoListAssem) c689730R3r.l0).sp());
        }
        if (zLIZ) {
            first = pair.getSecond();
        } else {
            first = pair.getFirst();
        }
        rect.left = ((Number) first).intValue();
        if (zLIZ) {
            second = pair.getFirst();
        } else {
            second = pair.getSecond();
        }
        rect.right = ((Number) second).intValue();
    }

    public static final void LIZIZ$2(C689730R3r c689730R3r, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (recyclerView.getLayoutDirection() == 1) {
            if (childAdapterPosition != 0) {
                rect.right = ((C682930QqZ) c689730R3r.l0).LIZ;
            }
        } else {
            if (childAdapterPosition == 0) {
                return;
            }
            rect.left = ((C682930QqZ) c689730R3r.l0).LIZ;
        }
    }
}
