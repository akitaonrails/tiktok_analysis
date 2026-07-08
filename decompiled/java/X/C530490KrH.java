package X;

import Y.ARunnableS108S0100000_8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AwS134S0201000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530490KrH extends LinearLayout {
    public View LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public int[] LLILZLL;

    public final void LIZ() {
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView == null) {
            return;
        }
        long width = (((long) tuxIconView.getWidth()) << 32) | ((long) tuxIconView.getHeight());
        int[] iArr = this.LLILZLL;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            Integer numLIZJ = C1308910kAL.LIZJ(i, tuxIconView.getContext());
            arrayList.add(Integer.valueOf(numLIZJ != null ? numLIZJ.intValue() : 0));
        }
        int[] iArrLLII = C13LP.LLII(arrayList);
        int iHashCode = Arrays.hashCode(iArrLLII);
        if (width != 0 && width == this.LLILZ && iHashCode == this.LLILZIL) {
            return;
        }
        C0F78.LIZ(tuxIconView, iArrLLII, null, 0.0f, 1.0f, 1.0f, 0.0f, 0, new AwS134S0201000_8(tuxIconView, this, iHashCode, 5));
    }

    public final void LIZIZ() {
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView == null) {
            return;
        }
        long width = (((long) tuxIconView.getWidth()) << 32) | ((long) tuxIconView.getHeight());
        int[] iArr = this.LLILZLL;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            Integer numLIZJ = C1308910kAL.LIZJ(i, tuxIconView.getContext());
            arrayList.add(Integer.valueOf(numLIZJ != null ? numLIZJ.intValue() : 0));
        }
        int iHashCode = Arrays.hashCode(C13LP.LLII(arrayList));
        if (width != 0 && width == this.LLILZ && iHashCode == this.LLILZIL) {
            return;
        }
        HandlerHook.viewPost(this, new ARunnableS108S0100000_8(this, 15));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LIZIZ();
    }

    public final void setContentAlpha(float f) {
        View view = this.LL;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    public final void setGradientColorAttrs(int[] iArr) {
        if (Arrays.equals(this.LLILZLL, iArr)) {
            return;
        }
        this.LLILZLL = Arrays.copyOf(iArr, iArr.length);
        this.LLILZ = 0L;
        this.LLILZIL = 0;
        LIZIZ();
    }

    public final void setTextColor(int i) {
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(i);
        }
    }

    public C530490KrH(Context context, AttributeSet attributeSet) {
        TuxTextView tuxTextView;
        int i;
        super(context, attributeSet, 0);
        this.LLILZLL = C0F78.LIZ;
        View viewSd = C786410Ut5.Sd(R.layout.sc, C786410Ut5.ne(getContext()), this);
        this.LL = viewSd;
        if (viewSd != null) {
            tuxTextView = (TuxTextView) viewSd.findViewById(R.id.cvr);
        } else {
            tuxTextView = null;
        }
        this.LLILLJJLI = tuxTextView;
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "auto_pick_entrance_title_key", "pick_for_me", true);
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            if (Intrinsics.LJFF(strLJJ, "auto_pick")) {
                i = 2131839979;
            } else if (Intrinsics.LJFF(strLJJ, "pick_for_me")) {
                i = 2131839980;
            } else {
                i = 2131839978;
            }
            tuxTextView2.setText(i);
        }
        View view = this.LL;
        this.LLILLL = view != null ? (TuxIconView) view.findViewById(R.id.be3) : null;
        LIZ();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.LLILZ = 0L;
            LIZIZ();
        }
    }
}
