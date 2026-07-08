package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.poplayer.core.PopupManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS413S0200000_12;
import njp.a;

/* JADX INFO: renamed from: X.09hB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.survey.viewhelper.BottomMaskSurveyViewHelper$showView$1$1", f = "BottomMaskSurveyViewHelper.kt", l = {}, m = "invokeSuspend")
public final class C2439509hB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20280814Xe LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Fragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2439509hB(C20280814Xe c20280814Xe, View view, int i, Fragment fragment, InterfaceC1364105Vn<? super C2439509hB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20280814Xe;
        this.LLILLJJLI = view;
        this.LLILLL = i;
        this.LLILZ = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2439509hB(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final InterfaceC20660615sy interfaceC20660615sy;
        View viewFindViewById;
        C1C7U.LIZ("BottomMaskSurveyViewHelper@32a9.showView$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20280814Xe c20280814Xe = this.LL;
        View view = this.LLILLJJLI;
        int i = this.LLILLL;
        c20280814Xe.getClass();
        View viewFindViewById2 = view.findViewById(R.id.o11);
        if (viewFindViewById2 != null && (viewFindViewById = view.findViewById(R.id.de4)) != null) {
            viewFindViewById.setBackgroundColor(i);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i, i & 16777215});
            gradientDrawable.setShape(0);
            viewFindViewById2.setBackground(gradientDrawable);
        }
        C20280814Xe c20280814Xe2 = this.LL;
        C128Y c128y = this.LLILZ;
        View view2 = this.LLILLJJLI;
        c20280814Xe2.getClass();
        if ((c128y instanceof InterfaceC20660615sy) && (interfaceC20660615sy = (InterfaceC20660615sy) c128y) != null) {
            final AwS413S0200000_12 awS413S0200000_12 = new AwS413S0200000_12(view2, c20280814Xe2, 49);
            PopupManager.LJIJI(new AbstractC20660115st<View>(interfaceC20660615sy, awS413S0200000_12) { // from class: X.0TRy
                public final InterfaceC20660615sy LL;
                public final Function0<View> LLILLJJLI;

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 240;
                }

                @Override // com.bytedance.poplayer.IPopupTask
                public final Object showPopup(C688120Qyw c688120Qyw) {
                    return this.LLILLJJLI.invoke();
                }

                {
                    super(interfaceC20660615sy);
                    this.LL = interfaceC20660615sy;
                    this.LLILLJJLI = awS413S0200000_12;
                }
            }, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BottomMaskSurveyViewHelper@32a9.showView$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
