package X;

import Y.ARunnableS75S0200000_6;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hlc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C450540Hlc {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public float LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LJ;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public RecyclerView LJIIJJI;
    public C117T LJIIL;
    public Integer LJIILJJIL;
    public C0H3N LJIILL;
    public String LJIILLIIL;
    public boolean LIZLLL = true;
    public int LJFF = -1;
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());
    public final int LJII = 500;
    public final List<View> LJIIJ = new ArrayList();
    public List<? extends C451030HmP> LJIILIIL = C13BV.INSTANCE;

    public boolean LJII() {
        return false;
    }

    public final void LIZ() {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        RecyclerView recyclerView = this.LJIIJJI;
        if (recyclerView == null) {
            return;
        }
        this.LJI.removeCallbacksAndMessages(null);
        Integer num5 = this.LJIILJJIL;
        if ((num5 == null || num5.intValue() != 7) && (((num = this.LJIILJJIL) == null || num.intValue() != 9) && (((num2 = this.LJIILJJIL) == null || num2.intValue() != 10) && (((num3 = this.LJIILJJIL) == null || num3.intValue() != 11) && ((num4 = this.LJIILJJIL) == null || num4.intValue() != 12))))) {
            C0H3N c0h3n = this.LJIILL;
            if (c0h3n != null) {
                LJ(this.LJIIJ, c0h3n, recyclerView);
            } else {
                LIZLLL(this.LJIIJ, this.LJIIL, recyclerView);
            }
        }
        this.LIZIZ = System.currentTimeMillis() - this.LIZJ;
    }

    public static View LJFF(View view) {
        return view.findViewById(R.id.gzy);
    }

    public boolean LIZIZ(MotionEvent motionEvent) {
        RecyclerView recyclerView = this.LJIIJJI;
        if (recyclerView == null) {
            return false;
        }
        this.LIZJ = System.currentTimeMillis();
        this.LIZIZ = 0L;
        this.LJ = System.currentTimeMillis();
        this.LIZ = motionEvent.getX();
        ((ArrayList) this.LJIIJ).clear();
        this.LJIIIIZZ = motionEvent.getX();
        this.LJIIIZ = motionEvent.getY();
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            ((ArrayList) this.LJIIJ).add(recyclerView.getChildAt(i));
        }
        this.LJI.removeCallbacksAndMessages(null);
        if (this.LJIILL != null) {
            C786410Ut5.LJLIIL(this.LJII, this.LJI, new ARunnableS75S0200000_6(this, recyclerView, 123));
        } else {
            C786410Ut5.LJLIIL(this.LJII, this.LJI, new ARunnableS75S0200000_6(this, recyclerView, 124));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doOnActionDown mTouchStartXPosition=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" mLastTimeTouch=");
        sbLIZ.append(this.LJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZIZ < this.LJII) {
            return false;
        }
        return true;
    }

    public final void LIZJ(MotionEvent motionEvent) {
        RecyclerView recyclerView = this.LJIIJJI;
        if (recyclerView == null) {
            return;
        }
        if (this.LJIILL != null) {
            LJIIIZ(motionEvent.getX(), motionEvent.getY(), recyclerView, this.LJIIJ, this.LJIILIIL, recyclerView, this.LJIILL, this.LJIILJJIL, "move");
        } else {
            LJIIIIZZ(motionEvent.getX(), motionEvent.getY(), recyclerView, this.LJIIJ, this.LJIILIIL, recyclerView, this.LJIIL, this.LJIILJJIL, "move");
        }
    }

    public final void LIZLLL(List<? extends View> list, C117T c117t, RecyclerView recyclerView) {
        View viewLJFF;
        int i = this.LJFF;
        if (i >= 0) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size() && (viewLJFF = LJFF((View) ListProtector.get(arrayList, this.LJFF))) != null) {
                viewLJFF.setBackground(new ColorDrawable(0));
            }
        }
        this.LJFF = -1;
        this.LIZLLL = true;
        if (c117t != null) {
            c117t.setSwipeEnabled(true);
        }
        if (recyclerView instanceof C450550Hld) {
            ((C450550Hld) recyclerView).setSwipeEnabled(true);
        }
        if (recyclerView instanceof C450580Hlg) {
            ((C450580Hlg) recyclerView).setSwipeEnabled(true);
        }
        this.LJ = 0L;
    }

    public final void LJ(List<? extends View> list, C0H3N c0h3n, RecyclerView recyclerView) {
        View viewLJFF;
        int i = this.LJFF;
        if (i >= 0) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size() && (viewLJFF = LJFF((View) ListProtector.get(arrayList, this.LJFF))) != null) {
                viewLJFF.setBackground(new ColorDrawable(0));
            }
        }
        this.LJFF = -1;
        this.LIZLLL = true;
        if (c0h3n != null) {
            c0h3n.LIZ(true);
        }
        if (recyclerView instanceof C450550Hld) {
            ((C450550Hld) recyclerView).setSwipeEnabled(true);
        }
        if (recyclerView instanceof C450580Hlg) {
            ((C450580Hlg) recyclerView).setSwipeEnabled(true);
        }
        this.LJ = 0L;
    }

    public final void LJI(RecyclerView recyclerView, C0H3N c0h3n, List<? extends C451030HmP> list, Integer num, String str) {
        this.LJIIJJI = recyclerView;
        this.LJIILL = c0h3n;
        this.LJIILIIL = list;
        this.LJIILJJIL = num;
        this.LJIILLIIL = str;
    }

    public void LJIIIIZZ(float f, float f2, RecyclerView recyclerView, List list, List list2, RecyclerView recyclerView2, C117T c117t, Integer num, String str) {
        int i;
        View viewLJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePopupWindowShow eventX=");
        sbLIZ.append(f);
        sbLIZ.append(" eventY=");
        sbLIZ.append(f2);
        sbLIZ.append(" lastPosition=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" scene=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        ArrayList<View> arrayList = (ArrayList) list;
        int i2 = 0;
        for (View view : arrayList) {
            int i3 = i2 + 1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("iterate childViews i=");
            sbLIZ2.append(i2);
            sbLIZ2.append(" [");
            sbLIZ2.append(view.getLeft());
            sbLIZ2.append(", ");
            sbLIZ2.append(view.getRight());
            sbLIZ2.append(", ");
            sbLIZ2.append(view.getBottom());
            sbLIZ2.append(", ");
            sbLIZ2.append(view.getTop());
            sbLIZ2.append(']');
            C2188811AlT.LIZIZ(sbLIZ2);
            if (f > view.getLeft() && f < view.getRight() && f2 < view.getBottom() && f2 > view.getTop()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("check conditions i=");
                sbLIZ3.append(i2);
                sbLIZ3.append(" time=");
                sbLIZ3.append(System.currentTimeMillis() - this.LJ);
                sbLIZ3.append(" dist=");
                sbLIZ3.append(f - this.LIZ);
                C2188811AlT.LIZIZ(sbLIZ3);
                if (this.LJFF != i2 && ((System.currentTimeMillis() - this.LJ > this.LJII || Intrinsics.LJFF(str, "down")) && Math.abs(f - this.LIZ) < 20.0f)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("setup mPageCanScrolled size=");
                    sbLIZ4.append(list2.size());
                    C2188811AlT.LIZIZ(sbLIZ4);
                    this.LIZLLL = false;
                    if (c117t != null) {
                        c117t.setSwipeEnabled(false);
                    }
                    if (recyclerView instanceof C450550Hld) {
                        ((C450550Hld) recyclerView).setSwipeEnabled(false);
                    }
                    if (recyclerView instanceof C450580Hlg) {
                        ((C450580Hlg) recyclerView).setSwipeEnabled(false);
                    }
                    this.LJI.removeCallbacksAndMessages(null);
                }
                int i4 = this.LJFF;
                if (i4 >= 0 && i4 < arrayList.size() && i2 != (i = this.LJFF) && (viewLJFF = LJFF((View) ListProtector.get(arrayList, i))) != null) {
                    viewLJFF.setBackground(new ColorDrawable(0));
                    return;
                }
                return;
            }
            i2 = i3;
        }
    }

    public void LJIIIZ(float f, float f2, RecyclerView recyclerView, List list, List list2, RecyclerView recyclerView2, C0H3N c0h3n, Integer num, String str) {
        int i;
        View viewLJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePopupWindowShow eventX=");
        sbLIZ.append(f);
        sbLIZ.append(" eventY=");
        sbLIZ.append(f2);
        sbLIZ.append(" lastPosition=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" scene=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        ArrayList<View> arrayList = (ArrayList) list;
        int i2 = 0;
        for (View view : arrayList) {
            int i3 = i2 + 1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("iterate childViews i=");
            sbLIZ2.append(i2);
            sbLIZ2.append(" [");
            sbLIZ2.append(view.getLeft());
            sbLIZ2.append(", ");
            sbLIZ2.append(view.getRight());
            sbLIZ2.append(", ");
            sbLIZ2.append(view.getBottom());
            sbLIZ2.append(", ");
            sbLIZ2.append(view.getTop());
            sbLIZ2.append(']');
            C2188811AlT.LIZIZ(sbLIZ2);
            if (f > view.getLeft() && f < view.getRight() && f2 < view.getBottom() && f2 > view.getTop()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("check conditions i=");
                sbLIZ3.append(i2);
                sbLIZ3.append(" time=");
                sbLIZ3.append(System.currentTimeMillis() - this.LJ);
                sbLIZ3.append(" dist=");
                sbLIZ3.append(f - this.LIZ);
                C2188811AlT.LIZIZ(sbLIZ3);
                if (this.LJFF != i2 && ((System.currentTimeMillis() - this.LJ > this.LJII || Intrinsics.LJFF(str, "down")) && Math.abs(f - this.LIZ) < 20.0f)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("setup mPageCanScrolled size=");
                    sbLIZ4.append(list2.size());
                    C2188811AlT.LIZIZ(sbLIZ4);
                    this.LIZLLL = false;
                    if (c0h3n != null) {
                        c0h3n.LIZ(false);
                    }
                    if (recyclerView instanceof C450550Hld) {
                        ((C450550Hld) recyclerView).setSwipeEnabled(false);
                    }
                    if (recyclerView instanceof C450580Hlg) {
                        ((C450580Hlg) recyclerView).setSwipeEnabled(false);
                    }
                    this.LJI.removeCallbacksAndMessages(null);
                }
                int i4 = this.LJFF;
                if (i4 >= 0 && i4 < arrayList.size() && i2 != (i = this.LJFF) && (viewLJFF = LJFF((View) ListProtector.get(arrayList, i))) != null) {
                    viewLJFF.setBackground(new ColorDrawable(0));
                    return;
                }
                return;
            }
            i2 = i3;
        }
    }
}
