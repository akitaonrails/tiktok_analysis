package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Geo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420840Geo extends AbstractC420810Gel {
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public int LLJI;
    public boolean LLJIJIL;

    public C420840Geo(Context context) {
        this(context, null, 6, 0);
    }

    public C420840Geo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final Drawable getGreyBarCapsuleBG() {
        return (Drawable) this.LLJ.getValue();
    }

    private final Drawable getWhiteBarCapsuleBG() {
        return (Drawable) this.LLIZLLLIL.getValue();
    }

    public final void h0() {
        if (this.LLJIJIL) {
            return;
        }
        boolean zLIZ = C07NU.LIZ();
        String string = null;
        if ((((Number) C287240BNq.LIZ.getValue()).intValue() == 2) || ((Number) C0BWS.LIZ.getValue()).intValue() > 0) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_repost_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
            tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
            Context context = getContext();
            if (context == null || !C426750GoL.LIZLLL(context)) {
                getUpvoteTV().setCompoundDrawables(tuxIconDrawableLIZ, null, null, null);
            } else {
                getUpvoteTV().setCompoundDrawables(null, null, tuxIconDrawableLIZ, null);
            }
            getUpvoteTV().setCompoundDrawablePadding(iLIZIZ);
            View touchArea = getTouchArea();
            if (touchArea != null) {
                touchArea.setBackground(zLIZ ? getGreyBarCapsuleBG() : getGreyBarBG());
            }
        } else {
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_repost_fill;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.ej);
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(getContext());
            tuxIconDrawableLIZ2.setBounds(0, 0, tuxIconDrawableLIZ2.LIZJ(), tuxIconDrawableLIZ2.LIZIZ());
            Context context2 = getContext();
            if (context2 == null || !C426750GoL.LIZLLL(context2)) {
                getUpvoteTV().setCompoundDrawables(tuxIconDrawableLIZ2, null, null, null);
            } else {
                getUpvoteTV().setCompoundDrawables(null, null, tuxIconDrawableLIZ2, null);
            }
            getUpvoteTV().setCompoundDrawablePadding(iLIZIZ2);
            View touchArea2 = getTouchArea();
            if (touchArea2 != null) {
                touchArea2.setBackground(zLIZ ? getWhiteBarCapsuleBG() : getWhiteBarBG());
            }
        }
        if (((Number) C0BWS.LIZ.getValue()).intValue() > 0) {
            getUpvoteTV().setTextColorRes(R.attr.ee);
        } else {
            getUpvoteTV().setTextColorRes(R.attr.ej);
        }
        Context context3 = getContext();
        int iIntValue = ((Number) C263800AVm.LIZ.getValue()).intValue();
        if (iIntValue == 1) {
            string = context3.getString(2131846340);
        } else if (iIntValue == 2) {
            string = context3.getString(2131846339);
        } else if (iIntValue == 3) {
            string = context3.getString(2131846338);
        }
        if (string == null) {
            string = getContext().getString(2131846378);
        }
        if (e0(string) > getMaxWidth()) {
            string = getContext().getString(2131846378);
        }
        getUpvoteTV().setText(string);
        if (zLIZ) {
            View touchArea3 = getTouchArea();
            if (touchArea3 != null) {
                C426750GoL.LJIIL(touchArea3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), null, 26);
            }
        } else {
            View touchArea4 = getTouchArea();
            if (touchArea4 != null) {
                C426750GoL.LJIIL(touchArea4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7))), null, 26);
            }
        }
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((((Number) C0B0P.LIZ.getValue()).intValue() - 20) / 2) + 6)));
        C426750GoL.LJIIIZ(getUpvoteTV(), null, Integer.valueOf(iLIZIZ3), null, Integer.valueOf(iLIZIZ3), false, 21);
        getUpvoteTV().setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        this.LLJIJIL = true;
    }

    @Override // X.AbstractC420810Gel
    public int getWhiteBarStyle() {
        return this.LLJI;
    }

    @Override // X.AbstractC420810Gel
    public void setWhiteBarStyle(int i) {
        this.LLJI = i;
    }

    public C420840Geo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C20673215v0.LIZLLL(R.layout.i72, C1388190mED.LIZ(context), this, true);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLIZLLLIL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(context, 863));
        this.LLJ = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(context, 862));
        this.LLJI = 1;
    }

    public /* synthetic */ C420840Geo(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
