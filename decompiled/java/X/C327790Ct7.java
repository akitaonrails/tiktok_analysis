package X;

import com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ct7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel$setText$1", f = "CaptionViewModel.kt", l = {115, 117}, m = "invokeSuspend")
public final class C327790Ct7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C327810Ct9 LL;
    public CaptionViewModel LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ CaptionViewModel LLILZ;
    public final /* synthetic */ C327810Ct9 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327790Ct7(CaptionViewModel captionViewModel, C327810Ct9 c327810Ct9, InterfaceC1364105Vn<? super C327790Ct7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = captionViewModel;
        this.LLILZIL = c327810Ct9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327790Ct7(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C327810Ct9 c327810Ct9;
        CaptionViewModel captionViewModel;
        C1C7U.LIZ("CaptionViewModel@f117.setText$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CaptionViewModel@f117.setText$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            captionViewModel = this.LLILLJJLI;
            c327810Ct9 = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            CaptionViewModel captionViewModel2 = this.LLILZ;
            C327760Ct4 c327760Ct4 = new C327760Ct4(captionViewModel2.LL, captionViewModel2.LLILLJJLI);
            c327810Ct9 = this.LLILZIL;
            captionViewModel = this.LLILZ;
            String str = c327810Ct9.LIZ;
            this.LL = c327810Ct9;
            this.LLILLJJLI = captionViewModel;
            this.LLILLL = 1;
            obj = c327760Ct4.LIZJ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CaptionViewModel@f117.setText$1");
                return objLJFF;
            }
        }
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("CaptionViewModel@f117.setText$1");
            return unit2;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C327800Ct8 c327800Ct8 = new C327800Ct8(c327810Ct9, arrayList, captionViewModel, null);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c327800Ct8) == objLJFF) {
            C1C7U.LIZIZ("CaptionViewModel@f117.setText$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("CaptionViewModel@f117.setText$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
