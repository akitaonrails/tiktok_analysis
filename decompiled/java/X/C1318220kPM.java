package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.lynx.tasm.behavior.ui.scroll.LynxUIScrollViewInternal;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kPM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1318220kPM extends FrameLayout implements InterfaceC1318470kPl {
    public final RunnableC1318230kPN LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public final int[] LLIZ;
    public int LLIZLLLIL;
    public InterfaceC1318200kPK LLJ;
    public InterfaceC1318490kPn LLJI;

    public int[] getScrollOffset() {
        return new int[]{getScrollX(), getScrollY()};
    }

    @Override // X.InterfaceC1318450kPj
    public int[] getScrollRangeHorizontally() {
        return new int[]{0, Math.max(0, this.LLIZ[0] - this.LLILZ)};
    }

    @Override // X.InterfaceC1318460kPk
    public int[] getScrollRangeVertically() {
        return new int[]{0, Math.max(0, this.LLIZ[1] - this.LLILZIL)};
    }

    public final void LJIIIZ() {
        InterfaceC1318490kPn interfaceC1318490kPn = this.LLJI;
        if (interfaceC1318490kPn != null) {
            interfaceC1318490kPn.LIZ(true);
            this.LLJI = null;
        }
    }

    @Override // X.InterfaceC1318450kPj
    public int getScrollOffsetHorizontally() {
        return getScrollX();
    }

    @Override // X.InterfaceC1318460kPk
    public int getScrollOffsetVertically() {
        return getScrollY();
    }

    public int[] getScrollRange() {
        int[] scrollRangeHorizontally = getScrollRangeHorizontally();
        int[] scrollRangeVertically = getScrollRangeVertically();
        return new int[]{scrollRangeHorizontally[0], scrollRangeHorizontally[1], scrollRangeVertically[0], scrollRangeVertically[1]};
    }

    @Override // X.InterfaceC1318470kPl
    public final boolean LIZLLL() {
        return this.LLILLJJLI;
    }

    public C1318220kPM(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = true;
        this.LLILLL = true;
        this.LLILZLL = true;
        this.LLIZ = new int[2];
        this.LL = new RunnableC1318230kPN(context);
    }

    public final void LJ(int[] iArr) {
        if (this.LLILLL) {
            int i = iArr[1];
            int[] scrollRangeVertically = getScrollRangeVertically();
            final C1318190kPJ c1318190kPJ = (C1318190kPJ) this;
            this.LL.LIZ(getScrollX(), Math.min(Math.max(i, scrollRangeVertically[0]), scrollRangeVertically[1]), new InterfaceC1318490kPn() { // from class: X.0kPe
                @Override // X.InterfaceC1318490kPn
                public final void LIZ(boolean z) {
                    if (z) {
                        c1318190kPJ.LJIIIIZZ(0);
                        c1318190kPJ.LJIIIZ();
                    }
                }
            });
            LJIIIIZZ(2);
            LJIIIZ();
            return;
        }
        int i2 = iArr[0];
        int[] scrollRangeHorizontally = getScrollRangeHorizontally();
        final C1318190kPJ c1318190kPJ2 = (C1318190kPJ) this;
        this.LL.LIZ(Math.min(Math.max(i2, scrollRangeHorizontally[0]), scrollRangeHorizontally[1]), getScrollY(), new InterfaceC1318490kPn() { // from class: X.0kPd
            @Override // X.InterfaceC1318490kPn
            public final void LIZ(boolean z) {
                if (z) {
                    c1318190kPJ2.LJIIIIZZ(0);
                    c1318190kPJ2.LJIIIZ();
                }
            }
        });
        LJIIIIZZ(2);
        LJIIIZ();
    }

    public final void LJFF(int[] iArr) {
        if (this.LLILLL) {
            int i = iArr[1];
            int[] scrollRangeVertically = getScrollRangeVertically();
            LJII(Math.min(Math.max(i, scrollRangeVertically[0]), scrollRangeVertically[1]));
        } else {
            int i2 = iArr[0];
            int[] scrollRangeHorizontally = getScrollRangeHorizontally();
            LJI(Math.min(Math.max(i2, scrollRangeHorizontally[0]), scrollRangeHorizontally[1]));
        }
    }

    public final void LJI(int i) {
        scrollTo(i, getScrollY());
    }

    public final void LJII(int i) {
        scrollTo(getScrollX(), i);
    }

    public final void LJIIIIZZ(int i) {
        int i2 = this.LLIZLLLIL;
        if (i2 != i) {
            this.LLIZLLLIL = i;
            InterfaceC1318200kPK interfaceC1318200kPK = this.LLJ;
            if (interfaceC1318200kPK != null) {
                LynxUIScrollViewInternal lynxUIScrollViewInternal = (LynxUIScrollViewInternal) interfaceC1318200kPK;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2 && i2 == 0) {
                            lynxUIScrollViewInternal.LJJIJ("scrollstart", null);
                        }
                    } else {
                        lynxUIScrollViewInternal.LJJIJ("scrollstart", null);
                    }
                } else {
                    lynxUIScrollViewInternal.LJJIJ("scrollend", null);
                }
                HashMap<String, Object> map = new HashMap<>();
                map.put("previousState", Integer.valueOf(i2));
                map.put("currentState", Integer.valueOf(i));
                lynxUIScrollViewInternal.LJJIJ("scrollstatechange", map);
            }
        }
        if (i != 2) {
            LJIIIZ();
        }
    }

    public void setScrollContentSize(int[] iArr) {
        if (this.LLILLL) {
            setScrollContentSizeVertically(iArr[1]);
        } else {
            setScrollContentSizeHorizontally(iArr[0]);
        }
    }

    public void setScrollContentSizeHorizontally(int i) {
        int[] iArr = this.LLIZ;
        iArr[0] = i;
        iArr[1] = this.LLILZIL;
    }

    public void setScrollContentSizeVertically(int i) {
        int[] iArr = this.LLIZ;
        iArr[0] = this.LLILZ;
        iArr[1] = i;
    }

    public void setScrollDelegate(InterfaceC1318200kPK interfaceC1318200kPK) {
        this.LLJ = interfaceC1318200kPK;
    }
}
