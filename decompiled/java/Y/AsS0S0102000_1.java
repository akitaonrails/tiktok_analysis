package Y;

import X.AbstractC1585810rMx;
import X.C03DY;
import X.C1006103wZ;
import X.C1007603wo;
import X.C10517049j;
import X.C1748720vbi;
import X.C259800zU;
import X.EnumC1005903wX;
import X.EnumC949303nP;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AsS0S0102000_1 extends AbstractC1585810rMx {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$2(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (2 - this.$t != 0) {
            super.LJJIIZI(recyclerView, i, i2);
        } else {
            LJJIIZI$0(this, recyclerView, i, i2);
        }
    }

    public AsS0S0102000_1(C1006103wZ c1006103wZ, int i) {
        this.$t = i;
        this.l0 = c1006103wZ;
        this.i1 = -1;
        this.i2 = -1;
    }

    public AsS0S0102000_1(C1007603wo c1007603wo, int i) {
        this.$t = i;
        this.l0 = c1007603wo;
        this.i1 = -1;
        this.i2 = -1;
    }

    public AsS0S0102000_1(C03DY c03dy, int i) {
        this.$t = i;
        this.l0 = c03dy;
    }

    public static final void LJJIIJ$0(AsS0S0102000_1 asS0S0102000_1, RecyclerView recyclerView, int i) {
        Function1<? super EnumC1005903wX, Unit> function1;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager) || layoutManager == null || recyclerView.getChildCount() <= 0) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                View childAt = recyclerView.getChildAt(0);
                asS0S0102000_1.i1 = recyclerView.getChildAdapterPosition(childAt);
                asS0S0102000_1.i2 = Math.abs(layoutManager.getDecoratedLeft(childAt));
                return;
            }
            return;
        }
        if (asS0S0102000_1.i1 == -1 || asS0S0102000_1.i2 == -1) {
            return;
        }
        View childAt2 = recyclerView.getChildAt(0);
        C1006103wZ c1006103wZ = (C1006103wZ) asS0S0102000_1.l0;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt2);
        int iAbs = Math.abs(layoutManager.getDecoratedLeft(childAt2));
        int i2 = asS0S0102000_1.i1;
        if (childAdapterPosition > i2) {
            Function1<? super EnumC1005903wX, Unit> function12 = c1006103wZ.LLILZ;
            if (function12 != null) {
                function12.invoke(EnumC1005903wX.LEFT);
            }
        } else if (childAdapterPosition < i2) {
            Function1<? super EnumC1005903wX, Unit> function13 = c1006103wZ.LLILZ;
            if (function13 != null) {
                function13.invoke(EnumC1005903wX.RIGHT);
            }
        } else {
            int i3 = asS0S0102000_1.i2;
            if (iAbs > i3) {
                Function1<? super EnumC1005903wX, Unit> function14 = c1006103wZ.LLILZ;
                if (function14 != null) {
                    function14.invoke(EnumC1005903wX.LEFT);
                }
            } else if (iAbs < i3 && (function1 = c1006103wZ.LLILZ) != null) {
                function1.invoke(EnumC1005903wX.RIGHT);
            }
        }
        asS0S0102000_1.i1 = -1;
        asS0S0102000_1.i2 = -1;
    }

    public static final void LJJIIJ$1(AsS0S0102000_1 asS0S0102000_1, RecyclerView recyclerView, int i) {
        Function1<? super EnumC949303nP, Unit> function1;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager) || layoutManager == null || recyclerView.getChildCount() <= 0) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                View childAt = recyclerView.getChildAt(0);
                asS0S0102000_1.i1 = recyclerView.getChildAdapterPosition(childAt);
                asS0S0102000_1.i2 = Math.abs(layoutManager.getDecoratedLeft(childAt));
                return;
            }
            return;
        }
        if (asS0S0102000_1.i1 == -1 || asS0S0102000_1.i2 == -1) {
            return;
        }
        View childAt2 = recyclerView.getChildAt(0);
        C1007603wo c1007603wo = (C1007603wo) asS0S0102000_1.l0;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt2);
        int iAbs = Math.abs(layoutManager.getDecoratedLeft(childAt2));
        int i2 = asS0S0102000_1.i1;
        if (childAdapterPosition > i2) {
            Function1<? super EnumC949303nP, Unit> function12 = c1007603wo.LLILLL;
            if (function12 != null) {
                function12.invoke(EnumC949303nP.LEFT);
            }
        } else if (childAdapterPosition < i2) {
            Function1<? super EnumC949303nP, Unit> function13 = c1007603wo.LLILLL;
            if (function13 != null) {
                function13.invoke(EnumC949303nP.RIGHT);
            }
        } else {
            int i3 = asS0S0102000_1.i2;
            if (iAbs > i3) {
                Function1<? super EnumC949303nP, Unit> function14 = c1007603wo.LLILLL;
                if (function14 != null) {
                    function14.invoke(EnumC949303nP.LEFT);
                }
            } else if (iAbs < i3 && (function1 = c1007603wo.LLILLL) != null) {
                function1.invoke(EnumC949303nP.RIGHT);
            }
        }
        asS0S0102000_1.i1 = -1;
        asS0S0102000_1.i2 = -1;
    }

    public static final void LJJIIJ$2(AsS0S0102000_1 asS0S0102000_1, RecyclerView recyclerView, int i) {
        if (i == 0) {
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "more";
            int i2 = asS0S0102000_1.i2;
            if (i2 < asS0S0102000_1.i1) {
                c259800zU.element = "less";
            }
            asS0S0102000_1.i1 = i2;
            C1748720vbi.LIZLLL((C03DY) asS0S0102000_1.l0, new C10517049j(), new AwS367S0200000_1(c259800zU, (C259800zU<String>) asS0S0102000_1.l0, (C03DY) 296));
        }
    }

    public static final void LJJIIZI$0(AsS0S0102000_1 asS0S0102000_1, RecyclerView recyclerView, int i, int i2) {
        asS0S0102000_1.i2 += i;
    }
}
