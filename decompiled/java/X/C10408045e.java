package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.045e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$openSku$1", f = "SeaPdpViewModel.kt", l = {3818}, m = "invokeSuspend")
public final class C10408045e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SeaPdpViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ View LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ Boolean LLJJIII;
    public final /* synthetic */ InterfaceC1631630sYr<Boolean, String, Object, ExceptionUX, Unit> LLJJIJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10408045e(SeaPdpViewModel seaPdpViewModel, boolean z, long j, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, int i, View view, String str, String str2, String str3, boolean z2, boolean z3, String str4, String str5, String str6, Boolean bool, InterfaceC1631630sYr<? super Boolean, ? super String, Object, ? super ExceptionUX, Unit> interfaceC1631630sYr, InterfaceC1364105Vn<? super C10408045e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = seaPdpViewModel;
        this.LLILLL = z;
        this.LLILZ = j;
        this.LLILZIL = map;
        this.LLILZLL = map2;
        this.LLIZ = i;
        this.LLIZLLLIL = view;
        this.LLJ = str;
        this.LLJI = str2;
        this.LLJIJIL = str3;
        this.LLJILJIL = z2;
        this.LLJILJILJ = z3;
        this.LLJILLL = str4;
        this.LLJJ = str5;
        this.LLJJI = str6;
        this.LLJJIII = bool;
        this.LLJJIJI = interfaceC1631630sYr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10408045e(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpViewModel@98e7.openSku$1");
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
            C1054104Ah c1054104Ah = this.LLILLJJLI.LLJLIL;
            if (c1054104Ah != null) {
                int i2 = c1054104Ah.LJJIIJZLJL;
                c1054104Ah.LJJIIJZLJL = i2 + 1;
                C2286608xc.LJ(i2);
            }
            C10480047y c10480047y = C10478047w.LIZJ;
            C10478047w.LIZJ = C10480047y.LIZ(c10480047y, null, c10480047y.LIZLLL + 1, 0, null, 55);
            SeaPdpViewModel seaPdpViewModel = this.LLILLJJLI;
            boolean z = this.LLILLL;
            C045Z c045z = new C045Z(seaPdpViewModel, z, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, null);
            this.LL = 1;
            if (seaPdpViewModel.rS2(this, c045z, z) == objLJFF) {
                C1C7U.LIZIZ("SeaPdpViewModel@98e7.openSku$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.openSku$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
