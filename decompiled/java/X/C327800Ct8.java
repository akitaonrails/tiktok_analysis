package X;

import android.os.SystemClock;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ct8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel$setText$1$1$1$1", f = "CaptionViewModel.kt", l = {128}, m = "invokeSuspend")
public final class C327800Ct8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C327810Ct9 LLILLJJLI;
    public final /* synthetic */ ArrayList<C327770Ct5> LLILLL;
    public final /* synthetic */ CaptionViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327800Ct8(C327810Ct9 c327810Ct9, ArrayList<C327770Ct5> arrayList, CaptionViewModel captionViewModel, InterfaceC1364105Vn<? super C327800Ct8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c327810Ct9;
        this.LLILLL = arrayList;
        this.LLILZ = captionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327800Ct8(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionViewModel@f117.setText$1$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.LJ = this.LLILLL;
            CaptionViewModel captionViewModel = this.LLILZ;
            if (captionViewModel.LLIZ.alignStream && captionViewModel.LLJIJIL != 0 && this.LLILZ.LLJI != 0) {
                long jElapsedRealtime = (this.LLILLJJLI.LIZIZ - this.LLILZ.LLJI) - (SystemClock.elapsedRealtime() - this.LLILZ.LLJIJIL);
                if (jElapsedRealtime < 0) {
                    this.LLILZ.LLILZIL.setValue(this.LLILLJJLI);
                } else {
                    this.LLILLJJLI.LJFF = true;
                    this.LL = 1;
                    if (AnonymousClass0958.LIZIZ(jElapsedRealtime, this) == objLJFF) {
                        C1C7U.LIZIZ("CaptionViewModel@f117.setText$1$1$1$1");
                        return objLJFF;
                    }
                }
            } else {
                this.LLILZ.LLILZIL.setValue(this.LLILLJJLI);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CaptionViewModel@f117.setText$1$1$1$1");
            return unit;
        }
        this.LLILZ.LLILZIL.setValue(this.LLILLJJLI);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CaptionViewModel@f117.setText$1$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
