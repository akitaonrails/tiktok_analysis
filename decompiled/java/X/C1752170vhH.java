package X;

import Y.ACListenerS58S0400000_26;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import c1b.m;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vhH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752170vhH extends FrameLayout {
    public C1752170vhH LL;
    public boolean LLILLJJLI;

    public C1752170vhH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = this;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.asg, this, true);
        this.LL = this;
    }

    public final void LIZ(C1406700mi4 c1406700mi4, int i, m mVar, InterfaceC1752190vhJ interfaceC1752190vhJ, Function1<? super Integer, ? extends Object> function1, Function0<Unit> function0) {
        int iIntValue;
        int iLIZLLL;
        int iLJJLIIIIJ;
        Float f;
        float fFloatValue;
        SmartImageView smartImageView = (SmartImageView) this.LL.findViewById(R.id.egf);
        C1066100dqi c1066100dqi = new C1066100dqi();
        c1066100dqi.LIZJ = "pdp_detail";
        c1066100dqi.LIZ(i);
        c1066100dqi.LIZIZ(c1406700mi4.LL);
        C426750GoL.LJIIIZ(this.LL, Integer.valueOf((int) mVar.LJLJI()), null, Integer.valueOf((int) mVar.LJLJI()), null, false, 26);
        Float fLJJLIIIJLLLLLLLZ = mVar.LJJLIIIJLLLLLLLZ();
        if (fLJJLIIIJLLLLLLLZ != null) {
            C631470Opl.LIZ(smartImageView, Float.valueOf(fLJJLIIIJLLLLLLLZ.floatValue()), null, null, null, null, 30);
        }
        c1406700mi4.LL.getUri();
        interfaceC1752190vhJ.p2();
        interfaceC1752190vhJ.h1(c1406700mi4, smartImageView, c1066100dqi);
        ((TextView) this.LL.findViewById(R.id.view_more_text)).setText(this.LL.getContext().getString(mVar.LJJLIIIJ()));
        ((TuxTextView) this.LL.findViewById(R.id.view_more_text)).setTextColorRes(mVar.LJJJJLI());
        ((TuxIconView) this.LL.findViewById(R.id.view_more_icon)).setTintColorRes(mVar.LJJJJJL());
        if (c1406700mi4.LLILLJJLI && (f = c1406700mi4.LLILLL) != null) {
            float f2 = 120;
            if (((int) f.floatValue()) < C0H9H.LIZ(f2)) {
                fFloatValue = C0H9H.LIZ(f2);
            } else {
                fFloatValue = c1406700mi4.LLILLL.floatValue();
            }
            iLIZLLL = (int) fFloatValue;
            C03DZ.LIZJ(this.LL.findViewById(R.id.view_more));
            if (!this.LLILLJJLI) {
                this.LLILLJJLI = true;
                C1748720vbi.LJFF(this.LL.findViewById(R.id.view_more), new C10515049h(), AFwS215S0000000_26.get$arr$(134), AFwS268S0000000_26.get$arr$(236));
            }
            C948503nH.LJIILIIL(this.LL.findViewById(R.id.view_more), null, new C1752180vhI(interfaceC1752190vhJ, this, null), 3);
        } else {
            C03DZ.LIZ(this.LL.findViewById(R.id.view_more));
            Image image = c1406700mi4.LL;
            Integer width = image.getWidth();
            int iIntValue2 = 100;
            if ((width == null || width.intValue() != 0) && image.getWidth() != null) {
                Integer width2 = image.getWidth();
                if (width2 != null) {
                    iIntValue = width2.intValue();
                } else {
                    return;
                }
            } else {
                iIntValue = 100;
            }
            Integer height = image.getHeight();
            if ((height == null || height.intValue() != 0) && image.getHeight() != null) {
                Integer height2 = image.getHeight();
                if (height2 != null) {
                    iIntValue2 = height2.intValue();
                } else {
                    return;
                }
            }
            iLIZLLL = ((C958103op.LIZLLL() - (((int) mVar.LJLJI()) * 2)) * iIntValue2) / iIntValue;
        }
        if (smartImageView.getLayoutParams() == null) {
            new ViewGroup.LayoutParams(-1, iLIZLLL);
        } else {
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = iLIZLLL;
            C786410Ut5.G6(smartImageView, layoutParams);
        }
        C786410Ut5.I7(new ACListenerS58S0400000_26(function0, this, c1406700mi4, interfaceC1752190vhJ, 0), this.LL);
        Object objInvoke = function1.invoke(Integer.valueOf(i + 1));
        if ((objInvoke instanceof C1406720mi6) && Intrinsics.LJFF(((C1406720mi6) objInvoke).LLILLJJLI, "sub_title")) {
            C0H9H.LIZJ((int) mVar.LLI(), this.LL);
            return;
        }
        if (objInvoke instanceof C1406700mi4) {
            C1406700mi4 c1406700mi42 = (C1406700mi4) objInvoke;
            c1406700mi42.getClass();
            if (Intrinsics.LJFF("image", "image")) {
                if (Intrinsics.LJFF(c1406700mi42.LL.getRemoveGap(), "true")) {
                    iLJJLIIIIJ = 0;
                } else {
                    iLJJLIIIIJ = (int) mVar.LJJLIIIIJ();
                }
                C0H9H.LIZJ(iLJJLIIIIJ, this.LL);
                return;
            }
        }
        C0H9H.LIZJ((int) mVar.LLIL(), this.LL);
    }
}
