package X;

import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NLH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hometab.base.tabicon.TabIconManager$onChangeAppTheme$1", f = "TabIconManager.kt", l = {269}, m = "invokeSuspend")
public final class C0NLH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NLN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NLH(C0NLN c0nln, InterfaceC1364105Vn<? super C0NLH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nln;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NLH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabIconManager@2abf.onChangeAppTheme$1");
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
            C0NLJ c0nlj = (C0NLJ) this.LLILLJJLI.LIZIZ.getValue();
            List<TabDynamicIconInfo> list = this.LLILLJJLI.LIZJ;
            this.LL = 1;
            if (c0nlj.LJFF(list, this) == objLJFF) {
                C1C7U.LIZIZ("TabIconManager@2abf.onChangeAppTheme$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TabIconManager@2abf.onChangeAppTheme$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
