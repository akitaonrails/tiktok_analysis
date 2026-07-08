package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS620S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem$initSubscriptions$1", f = "EasterEggForShareAssem.kt", l = {}, m = "invokeSuspend")
public final class C440160HNu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EasterEggForShareAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C440160HNu(EasterEggForShareAssem easterEggForShareAssem, InterfaceC1364105Vn<? super C440160HNu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = easterEggForShareAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C440160HNu(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EasterEggForShareAssem@d88a.initSubscriptions$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EasterEggForShareAssem easterEggForShareAssem = this.LL;
        AssemVMLazy assemVMLazy = easterEggForShareAssem.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = EasterEggForShareAssem.LLJJIJIIJIL;
        AssemViewModel value = assemVMLazy.getValue();
        easterEggForShareAssem.subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, new AwS620S0100000_6(this.LL, 5));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EasterEggForShareAssem@d88a.initSubscriptions$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
