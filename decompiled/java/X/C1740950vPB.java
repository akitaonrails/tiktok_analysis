package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.BackButtonConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS570S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vPB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.action.EcMixMallDiversionAction$showBackBtn$1", f = "EcMixMallDiversionAction.kt", l = {347}, m = "invokeSuspend")
public final class C1740950vPB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ViewGroup LLILLJJLI;
    public final /* synthetic */ BackButtonConfig LLILLL;
    public final /* synthetic */ C1767790w6T LLILZ;
    public final /* synthetic */ C1767980w6m LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C1740970vPD LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1740950vPB(ViewGroup viewGroup, BackButtonConfig backButtonConfig, C1767790w6T c1767790w6T, C1767980w6m c1767980w6m, String str, C1740970vPD c1740970vPD, InterfaceC1364105Vn<? super C1740950vPB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = viewGroup;
        this.LLILLL = backButtonConfig;
        this.LLILZ = c1767790w6T;
        this.LLILZIL = c1767980w6m;
        this.LLILZLL = str;
        this.LLIZ = c1740970vPD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1740950vPB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcMixMallDiversionAction@fdbe.showBackBtn$1");
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
            if (this.LLILLJJLI.getVisibility() != 0) {
                C786410Ut5.LJLZ(0, this.LLILLJJLI);
            }
            IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
            if (iEcUgBackButtonServiceOfficial != null) {
                ViewGroup viewGroup = this.LLILLJJLI;
                BackButtonConfig backButtonConfig = this.LLILLL;
                C1767790w6T c1767790w6T = this.LLILZ;
                String str = c1767790w6T.LJI;
                String str2 = c1767790w6T.LJIIIZ;
                C1767950w6j.LIZ.getClass();
                C1740690vOl c1740690vOl = new C1740690vOl(backButtonConfig, str, str2, C1767950w6j.LJFF(), this.LLILZIL.LIZIZ);
                String str3 = this.LLILZLL;
                AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(this.LLIZ, 1296);
                C1740700vOm c1740700vOm = this.LLIZ.LJFF;
                this.LL = 1;
                if (iEcUgBackButtonServiceOfficial.LIZIZ(viewGroup, c1740690vOl, str3, awS570S0100000_26, c1740700vOm, this) == objLJFF) {
                    C1C7U.LIZIZ("EcMixMallDiversionAction@fdbe.showBackBtn$1");
                    return objLJFF;
                }
            }
        }
        this.LLIZ.LJ = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMixMallDiversionAction@fdbe.showBackBtn$1");
        return unit;
    }
}
