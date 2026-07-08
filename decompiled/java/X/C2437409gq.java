package X;

import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.survey.viewhelper.BottomMaskSurveyViewHelper$showView$1", f = "BottomMaskSurveyViewHelper.kt", l = {179, 192}, m = "invokeSuspend")
public final class C2437409gq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function0<Bitmap> LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ C20280814Xe LLILZ;
    public final /* synthetic */ Fragment LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2437409gq(Function0<Bitmap> function0, View view, C20280814Xe c20280814Xe, Fragment fragment, InterfaceC1364105Vn<? super C2437409gq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function0;
        this.LLILLL = view;
        this.LLILZ = c20280814Xe;
        this.LLILZIL = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2437409gq(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BottomMaskSurveyViewHelper@32a9.showView$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BottomMaskSurveyViewHelper@32a9.showView$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2437509gr c2437509gr = new C2437509gr(this.LLILLJJLI.invoke(), this.LLILZ, null);
            this.LL = 1;
            obj = C099A.LIZJ(100L, c2437509gr, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BottomMaskSurveyViewHelper@32a9.showView$1");
                return objLJFF;
            }
        }
        Integer numLIZJ = (Integer) obj;
        if (numLIZJ == null) {
            C1AF0.LIZJ("BottomMaskSurveyViewHelper: dynamicColor is null");
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, this.LLILLL.getContext());
            if (numLIZJ == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("BottomMaskSurveyViewHelper@32a9.showView$1");
                return unit2;
            }
        }
        int iIntValue = numLIZJ.intValue();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C2439509hB c2439509hB = new C2439509hB(this.LLILZ, this.LLILLL, iIntValue, this.LLILZIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c2439509hB) == objLJFF) {
            C1C7U.LIZIZ("BottomMaskSurveyViewHelper@32a9.showView$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("BottomMaskSurveyViewHelper@32a9.showView$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
