package X;

import android.content.Context;
import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Vl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.CheckUpdateSettingsCellKt$CheckUpdateCell$2$1$1", f = "CheckUpdateSettingsCell.kt", l = {}, m = "invokeSuspend")
public final class C2128308Vl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2128308Vl(Context context, int i, InterfaceC1364105Vn<? super C2128308Vl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2128308Vl(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CheckUpdateSettingsCellKt@673.CheckUpdateCell$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C786410Ut5.re(Toast.makeText(this.LL, this.LLILLJJLI, 0));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckUpdateSettingsCellKt@673.CheckUpdateCell$2$1$1");
        return unit;
    }
}
