package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.RightSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.vm.InnerPushRightVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS43S0001000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15tq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20666015tq extends C09AY implements Function2<UIAssem, Integer, Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ RightSlotAssem LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20666015tq(View view, RightSlotAssem rightSlotAssem, int i, Context context) {
        super(2);
        this.LL = view;
        this.LLILLJJLI = rightSlotAssem;
        this.LLILLL = i;
        this.LLILZ = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, Integer num) {
        C20671715ul c20671715ul;
        UIAssem uIAssem2 = uIAssem;
        int iIntValue = num.intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] rightType = ");
        sbLIZ.append(iIntValue);
        C19290510dT.LIZLLL("RightSlotAssem", C2188811AlT.LIZIZ(sbLIZ));
        int marginEnd = 0;
        switch (iIntValue) {
            case 0:
                C786410Ut5.LJLLLLLL(8, this.LL);
                break;
            case 1:
                C786410Ut5.LJLLLLLL(0, this.LL);
                C19329910jp c19329910jp = C19329910jp.LIZ;
                View[] viewArr = {this.LLILLJJLI.lp(), this.LLILLJJLI.op(), this.LLILLJJLI.sp()};
                c19329910jp.getClass();
                C19329910jp.LIZIZ(viewArr);
                C786410Ut5.LLFF(0, this.LLILLJJLI.mp());
                break;
            case 2:
                C786410Ut5.LJLLLLLL(0, this.LL);
                C19329910jp c19329910jp2 = C19329910jp.LIZ;
                View[] viewArr2 = {this.LLILLJJLI.op(), this.LLILLJJLI.mp(), this.LLILLJJLI.sp()};
                c19329910jp2.getClass();
                C19329910jp.LIZIZ(viewArr2);
                C19231910Lt c19231910LtLp = this.LLILLJJLI.lp();
                int visibility = c19231910LtLp.getVisibility();
                c19231910LtLp.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c19231910LtLp);
                this.LLILLJJLI.lp().LIZLLL(this.LLILLJJLI.ip());
                LifecycleOwner parent = uIAssem2.getParent();
                if ((parent instanceof C20671715ul) && (c20671715ul = (C20671715ul) parent) != null) {
                    this.LLILLJJLI.lp().LLILLJJLI = c20671715ul;
                }
                C19231910Lt c19231910LtLp2 = this.LLILLJJLI.lp();
                int i = this.LLILLL;
                ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.lp().getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
                }
                c19231910LtLp2.setViewMaxWidth(i - marginEnd);
                break;
            case 3:
                C786410Ut5.LJLLLLLL(0, this.LL);
                C19329910jp c19329910jp3 = C19329910jp.LIZ;
                View[] viewArr3 = {this.LLILLJJLI.lp(), this.LLILLJJLI.mp(), this.LLILLJJLI.sp()};
                c19329910jp3.getClass();
                C19329910jp.LIZIZ(viewArr3);
                C786410Ut5.LLLLZLL(this.LLILLJJLI.op(), 0);
                TuxTextView tuxTextViewOp = this.LLILLJJLI.op();
                int i2 = this.LLILLL;
                ViewGroup.LayoutParams layoutParams2 = this.LLILLJJLI.op().getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                }
                tuxTextViewOp.setMaxWidth(i2 - marginEnd);
                break;
            case 4:
                C786410Ut5.LJLLLLLL(0, this.LL);
                C19329910jp c19329910jp4 = C19329910jp.LIZ;
                View[] viewArr4 = {this.LLILLJJLI.lp(), this.LLILLJJLI.mp(), this.LLILLJJLI.op()};
                c19329910jp4.getClass();
                C19329910jp.LIZIZ(viewArr4);
                C786410Ut5.LLLLLLJ(this.LLILLJJLI.sp(), 0);
                C197039127h c197039127hSp = this.LLILLJJLI.sp();
                int i3 = this.LLILLL;
                ViewGroup.LayoutParams layoutParams3 = this.LLILLJJLI.sp().getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
                }
                c197039127hSp.setMaxWidth(i3 - marginEnd);
                break;
            case 5:
                C786410Ut5.LJLLLLLL(0, this.LL);
                C19329910jp c19329910jp5 = C19329910jp.LIZ;
                View[] viewArr5 = {this.LLILLJJLI.lp(), this.LLILLJJLI.mp(), this.LLILLJJLI.sp()};
                c19329910jp5.getClass();
                C19329910jp.LIZIZ(viewArr5);
                C786410Ut5.LLLLZLL(this.LLILLJJLI.op(), 0);
                TuxTextView tuxTextViewOp2 = this.LLILLJJLI.op();
                int i4 = this.LLILLL;
                ViewGroup.LayoutParams layoutParams4 = this.LLILLJJLI.op().getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd();
                }
                tuxTextViewOp2.setMaxWidth(i4 - marginEnd);
                break;
            case 6:
            default:
                C786410Ut5.LJLLLLLL(8, this.LL);
                C19290510dT.LIZIZ("inner_push_platform", " invalid right type");
                break;
            case 7:
                C786410Ut5.LJLLLLLL(0, this.LL);
                C19329910jp c19329910jp6 = C19329910jp.LIZ;
                View[] viewArr6 = {this.LLILLJJLI.lp(), this.LLILLJJLI.op(), this.LLILLJJLI.sp()};
                c19329910jp6.getClass();
                C19329910jp.LIZIZ(viewArr6);
                C786410Ut5.LLFF(0, this.LLILLJJLI.mp());
                InnerPushRightVM innerPushRightVMTp = this.LLILLJJLI.tp();
                Drawable drawableLJIIIIZZ = C1336205Ku.LIZ(false).getImSayHiService().LJIIIIZZ(this.LLILZ);
                InnerPushUITemplate innerPushUITemplateVQ2 = innerPushRightVMTp.vQ2();
                if (innerPushUITemplateVQ2 != null) {
                    innerPushUITemplateVQ2.setRightImageDrawable(drawableLJIIIIZZ);
                }
                innerPushRightVMTp.setState(new AwS610S0100000_31(drawableLJIIIIZZ, 391));
                break;
            case 8:
                if (C19331310k3.LJIIJJI(this.LLILLJJLI.ip())) {
                    C786410Ut5.LJLLLLLL(0, this.LL);
                    C19329910jp c19329910jp7 = C19329910jp.LIZ;
                    View[] viewArr7 = {this.LLILLJJLI.lp(), this.LLILLJJLI.op(), this.LLILLJJLI.sp()};
                    c19329910jp7.getClass();
                    C19329910jp.LIZIZ(viewArr7);
                    C786410Ut5.LLFF(0, this.LLILLJJLI.mp());
                    InnerPushRightVM innerPushRightVMTp2 = this.LLILLJJLI.tp();
                    Drawable drawableLJJIL = C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJJIL(this.LLILZ);
                    InnerPushUITemplate innerPushUITemplateVQ22 = innerPushRightVMTp2.vQ2();
                    if (innerPushUITemplateVQ22 != null) {
                        innerPushUITemplateVQ22.setRightImageDrawable(drawableLJJIL);
                    }
                    innerPushRightVMTp2.setState(new AwS610S0100000_31(drawableLJJIL, 391));
                } else {
                    C786410Ut5.LJLLLLLL(8, this.LL);
                }
                break;
        }
        this.LLILLJJLI.tp().setState(new AwS43S0001000_31(this.LL.getVisibility(), 2));
        return Unit.LIZ;
    }
}
