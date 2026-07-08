package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mmf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.inspiration.ui.slide.ImageInspirationSlidePanelUIComponent$loadDataAndShow$1", f = "ImageInspirationSlidePanelUIComponent.kt", l = {233, 241}, m = "invokeSuspend")
public final class C1409550mmf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1409560mmg LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409550mmf(C1409560mmg c1409560mmg, InterfaceC1364105Vn<? super C1409550mmf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1409560mmg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409550mmf(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageInspirationSlidePanelUIComponent@c629.loadDataAndShow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ImageInspirationSlidePanelUIComponent@c629.loadDataAndShow$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1409500mma interfaceC1409500mmaZ4 = this.LLILLJJLI.Z4();
            this.LL = 1;
            obj = interfaceC1409500mmaZ4.nb1(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ImageInspirationSlidePanelUIComponent@c629.loadDataAndShow$1");
                return objLJFF;
            }
        }
        if (!this.LLILLJJLI.F4((List) obj)) {
            C201955140j.LIZJ(C1421590n65.LIZIZ, "slide inspiration loadDataAndShow: label not support show");
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ImageInspirationSlidePanelUIComponent@c629.loadDataAndShow$1");
            return unit2;
        }
        InterfaceC1409500mma interfaceC1409500mmaZ42 = this.LLILLJJLI.Z4();
        EnumC1409650mmp enumC1409650mmp = EnumC1409650mmp.EDIT_BOTTOM;
        final C1409560mmg c1409560mmg = this.LLILLJJLI;
        InterfaceC1409290mmF interfaceC1409290mmF = new InterfaceC1409290mmF() { // from class: X.0mme
            @Override // X.InterfaceC1409290mmF
            public final void onLoading() {
                C201955140j.LIZJ(C1421590n65.LIZIZ, "slide inspiration loadDataAndShow: loading");
            }

            @Override // X.InterfaceC1409290mmF
            public final void LIZ(C1409400mmQ c1409400mmQ) {
                C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
                C201955140j.LIZJ(c1421590n65, "slide inspiration loadDataAndShow: success");
                C1409380mmO c1409380mmO = c1409400mmQ.LIZ;
                if (c1409380mmO != null) {
                    C1409560mmg c1409560mmg2 = c1409560mmg;
                    if (c1409380mmO.LIZ.isEmpty() && c1409380mmO.LIZIZ.isEmpty()) {
                        C201955140j.LJII(c1421590n65, "fetch inspiration data is empty");
                    } else {
                        c1409560mmg2.J6(c1409380mmO);
                        c1409560mmg2.u6();
                    }
                }
            }

            @Override // X.InterfaceC1409290mmF
            public final void onError(String str) {
                C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("slide inspiration loadDataAndShow: error ");
                sbLIZ.append(-2);
                sbLIZ.append(' ');
                sbLIZ.append(str);
                C201955140j.LIZJ(c1421590n65, C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.LL = 2;
        if (interfaceC1409500mmaZ42.d61(false, enumC1409650mmp, interfaceC1409290mmF, this) == objLJFF) {
            C1C7U.LIZIZ("ImageInspirationSlidePanelUIComponent@c629.loadDataAndShow$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("ImageInspirationSlidePanelUIComponent@c629.loadDataAndShow$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
