package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.045f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$openSku$1", f = "PdpViewModel.kt", l = {3554}, m = "invokeSuspend")
public final class C10409045f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PdpViewModel LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ HashMap<String, Object> LLILZLL;
    public final /* synthetic */ Map<String, Object> LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ View LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ InterfaceC1631630sYr<Boolean, String, Object, ExceptionUX, Unit> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10409045f(PdpViewModel pdpViewModel, boolean z, long j, HashMap<String, Object> map, Map<String, ? extends Object> map2, int i, String str, View view, String str2, boolean z2, InterfaceC1631630sYr<? super Boolean, ? super String, Object, ? super ExceptionUX, Unit> interfaceC1631630sYr, InterfaceC1364105Vn<? super C10409045f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = pdpViewModel;
        this.LLILZ = z;
        this.LLILZIL = j;
        this.LLILZLL = map;
        this.LLIZ = map2;
        this.LLIZLLLIL = i;
        this.LLJ = str;
        this.LLJI = view;
        this.LLJIJIL = str2;
        this.LLJILJIL = z2;
        this.LLJILJILJ = interfaceC1631630sYr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C10409045f c10409045f = new C10409045f(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c10409045f.LLILLJJLI = obj;
        return c10409045f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpViewModel@6cb1.openSku$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C04BW c04bw = C1054504Al.LIZJ;
            C1054504Al.LIZJ = C04BW.LIZ(c04bw, null, 0L, c04bw.LIZLLL + 1, 0, null, 55);
            PdpViewModel pdpViewModel = this.LLILLL;
            boolean z = this.LLILZ;
            C045Y c045y = new C045Y(pdpViewModel, z, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC497601wk, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, null);
            this.LL = 1;
            if (pdpViewModel.gS2(this, c045y, z) == objLJFF) {
                C1C7U.LIZIZ("PdpViewModel@6cb1.openSku$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpViewModel@6cb1.openSku$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
