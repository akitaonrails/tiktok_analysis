package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.045Z, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$openSku$1$1", f = "SeaPdpViewModel.kt", l = {3860}, m = "invokeSuspend")
public final class C045Z extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ SeaPdpViewModel LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;
    public final /* synthetic */ Map<String, Object> LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ View LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ Boolean LLJJIJI;
    public final /* synthetic */ InterfaceC1631630sYr<Boolean, String, Object, ExceptionUX, Unit> LLJJIJIIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C045Z(SeaPdpViewModel seaPdpViewModel, boolean z, long j, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, int i, View view, String str, String str2, String str3, boolean z2, boolean z3, String str4, String str5, String str6, Boolean bool, InterfaceC1631630sYr<? super Boolean, ? super String, Object, ? super ExceptionUX, Unit> interfaceC1631630sYr, InterfaceC1364105Vn<? super C045Z> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLL = seaPdpViewModel;
        this.LLILZ = z;
        this.LLILZIL = j;
        this.LLILZLL = map;
        this.LLIZ = map2;
        this.LLIZLLLIL = i;
        this.LLJ = view;
        this.LLJI = str;
        this.LLJIJIL = str2;
        this.LLJILJIL = str3;
        this.LLJILJILJ = z2;
        this.LLJILLL = z3;
        this.LLJJ = str4;
        this.LLJJI = str5;
        this.LLJJIII = str6;
        this.LLJJIJI = bool;
        this.LLJJIJIIJIL = interfaceC1631630sYr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C045Z(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r82) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C045Z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
