package X;

import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.12YG, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YG implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void onCheckedChanged$4(C12YG c12yg, CompoundButton compoundButton, boolean z) {
        ((Function2) c12yg.l0).invoke(compoundButton, Boolean.valueOf(z));
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                break;
            case 6:
                onCheckedChanged$6(this, compoundButton, z);
                break;
        }
    }

    public C12YG(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C12YG c12yg, CompoundButton compoundButton, boolean z) {
        C127R c127r = (C127R) c12yg.l0;
        if (c127r.LLILZIL) {
            return;
        }
        if (!c127r.LLIZLLLIL) {
            c127r.LIZ(c127r.LLJI);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 1;
        if (jCurrentTimeMillis - c127r.LLILZ < c127r.LLILLL) {
            C127R c127r2 = (C127R) c12yg.l0;
            c127r2.LIZ(c127r2.LLJI);
            return;
        }
        c127r.LLILZ = jCurrentTimeMillis;
        C127R c127r3 = (C127R) c12yg.l0;
        int i2 = c127r3.LLJI;
        if (z) {
            if (c127r3.LLJJI.LJIILIIL()) {
                i = 2;
            }
        } else {
            i = 0;
        }
        ((C127R) c12yg.l0).LIZ(i);
        ((C127R) c12yg.l0).LIZIZ(i2, i, false, z);
    }

    public static final void onCheckedChanged$1(C12YG c12yg, CompoundButton compoundButton, boolean z) {
        int i;
        C127R c127r = (C127R) c12yg.l0;
        if (c127r.LLILZIL) {
            return;
        }
        if (!c127r.LLIZLLLIL) {
            c127r.LIZ(c127r.LLJI);
            return;
        }
        if (!c127r.LLJJIJI) {
            c127r.LIZ(c127r.LLJI);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - c127r.LLILZ < c127r.LLILLL) {
            C127R c127r2 = (C127R) c12yg.l0;
            c127r2.LIZ(c127r2.LLJI);
            return;
        }
        c127r.LLILZ = jCurrentTimeMillis;
        C127R c127r3 = (C127R) c12yg.l0;
        int i2 = c127r3.LLJI;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        c127r3.LIZ(i);
        ((C127R) c12yg.l0).LIZIZ(i2, i, true, z);
    }

    public static final void onCheckedChanged$2(C12YG c12yg, CompoundButton compoundButton, boolean z) {
        ((LiveData) ((C19762612Tw) c12yg.l0).LLJJ.getValue()).setValue(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$3(C12YG c12yg, CompoundButton compoundButton, boolean z) {
        ((C114K) c12yg.l0).LLLLIL().LIZJ.invoke(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$5(C12YG c12yg, CompoundButton compoundButton, boolean z) {
        AwS643S0100000_29 awS643S0100000_29;
        if (z) {
            ((TextView) ((C19734212Iy) c12yg.l0).LLILZ.getValue()).setText((String) ((C19734212Iy) c12yg.l0).LLIZLLLIL.getValue());
        } else {
            ((TextView) ((C19734212Iy) c12yg.l0).LLILZ.getValue()).setText((String) ((C19734212Iy) c12yg.l0).LLJ.getValue());
        }
        C19734212Iy c19734212Iy = (C19734212Iy) c12yg.l0;
        if (c19734212Iy.LL.LLJI && (awS643S0100000_29 = c19734212Iy.LLILZLL) != null) {
            C12JT c12jt = c19734212Iy.LLIZ;
            if (c12jt == null) {
                c12jt = null;
            }
            awS643S0100000_29.invoke(c12jt.LIZIZ, Boolean.valueOf(z));
        }
    }

    public static final void onCheckedChanged$6(C12YG c12yg, CompoundButton compoundButton, boolean z) {
        ((LiveData) ((C12U9) c12yg.l0).LLJILLL.getValue()).setValue(Boolean.valueOf(z));
    }
}
