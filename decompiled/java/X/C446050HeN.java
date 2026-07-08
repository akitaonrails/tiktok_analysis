package X;

import android.content.Context;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS78S0100000_6;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS65S2100000_27;

/* JADX INFO: renamed from: X.0HeN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446050HeN extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public C446060HeO LLILLL;
    public boolean LLILZ;

    private final TuxTextView getContentTV() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public final FrameLayout getAvatarFL() {
        return (FrameLayout) this.LL.getValue();
    }

    private final void setAvatar(Function0<Unit> function0) {
        FrameLayout avatarFL = getAvatarFL();
        if (avatarFL.getLayoutParams().width != getWidth()) {
            ViewGroup.LayoutParams layoutParams = avatarFL.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                C786410Ut5.W5(avatarFL, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        function0.invoke();
    }

    private final void setupAvatar(List<? extends User> list) {
        setAvatar(new AwS407S0200000_6((List) list, (List<? extends User>) this, (C446050HeN) 6));
    }

    private final void setupText(C446060HeO c446060HeO) {
        boolean z;
        int i;
        int i2;
        if (c446060HeO.LJFF.length() == 0) {
            getContentTV().setText(c446060HeO.LJ);
            return;
        }
        if (c446060HeO.LJI) {
            TuxTextView contentTV = getContentTV();
            String str = c446060HeO.LJ;
            String str2 = c446060HeO.LJFF;
            int childCount = getAvatarFL().getChildCount();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((childCount * 20) - ((childCount - 1) * 8)) + 2)));
            C446060HeO c446060HeO2 = this.LLILLL;
            if (c446060HeO2 != null && c446060HeO2.LIZIZ == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && c446060HeO2 != null) {
                c446060HeO2.LIZIZ = C497740JfY.LJIIZILJ() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(112));
            }
            C446060HeO c446060HeO3 = this.LLILLL;
            if (c446060HeO3 != null && c446060HeO3.LIZJ == 0) {
                c446060HeO3.LIZJ = C497740JfY.LJIIZILJ() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(112));
            }
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            C446060HeO c446060HeO4 = this.LLILLL;
            if (c446060HeO4 != null) {
                i = c446060HeO4.LIZIZ;
            } else {
                i = 0;
            }
            int i3 = ((i - iLIZIZ2) - iLIZIZ3) - iLIZIZ;
            if (c446060HeO4 != null) {
                i2 = c446060HeO4.LIZJ;
            } else {
                i2 = 0;
            }
            int i4 = ((i2 - iLIZIZ2) - iLIZIZ3) - iLIZIZ;
            String strJ4 = C786410Ut5.j4(str, Arrays.copyOf(new Object[]{str2}, 1));
            float fMeasureText = getContentTV().getPaint().measureText(strJ4);
            float f = i3;
            if (fMeasureText >= f) {
                float fMeasureText2 = getContentTV().getPaint().measureText(C786410Ut5.j4(str, Arrays.copyOf(new Object[]{"..."}, 1)));
                if (fMeasureText2 < f) {
                    int iCeil = (int) (f - ((float) Math.ceil(fMeasureText2)));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(LIZ(iCeil, str2));
                    sbLIZ.append("...");
                    strJ4 = C786410Ut5.j4(str, Arrays.copyOf(new Object[]{C444960Hcc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ))}, 1));
                } else {
                    float f2 = i4;
                    if (fMeasureText >= f2) {
                        int iCeil2 = (int) (f2 - ((float) Math.ceil(fMeasureText2)));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(LIZ(iCeil2, str2));
                        sbLIZ2.append("...");
                        strJ4 = C786410Ut5.j4(str, Arrays.copyOf(new Object[]{C444960Hcc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2))}, 1));
                    }
                }
            }
            contentTV.setText(strJ4);
            return;
        }
        getContentTV().setText(C786410Ut5.j4(c446060HeO.LJ, Arrays.copyOf(new Object[]{c446060HeO.LJFF}, 1)));
    }

    public final void LIZIZ(C446060HeO c446060HeO) {
        C446060HeO c446060HeO2;
        AwS65S2100000_27 awS65S2100000_27;
        this.LLILLL = c446060HeO;
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        List<? extends User> list = c446060HeO.LIZ;
        if (list != null) {
            setupAvatar(list);
        }
        setupText(c446060HeO);
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LJLJLJ.getValue());
        C786410Ut5.I7(new AkS78S0100000_6(c446060HeO, 1), this);
        if (this.LLILZ && isShown() && (c446060HeO2 = this.LLILLL) != null && (awS65S2100000_27 = c446060HeO2.LJII) != null) {
            awS65S2100000_27.invoke();
        }
    }

    public C446050HeN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 1065));
        this.LLILLJJLI = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 1066));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dbq, this, true);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
        setBackground(c384050F3z.LIZ(context));
    }

    public final String LIZ(int i, String str) {
        if (i >= 0 && i < getContentTV().getPaint().measureText(str)) {
            return str.substring(0, StaticLayout.Builder.obtain(str, 0, str.length(), getContentTV().getPaint(), i).build().getLineEnd(0));
        }
        return str;
    }
}
