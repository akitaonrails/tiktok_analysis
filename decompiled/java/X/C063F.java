package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063F, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsPageKt$SettingsList$1$1", f = "SettingsPage.kt", l = {}, m = "invokeSuspend")
public final class C063F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1688880u3C LL;
    public final /* synthetic */ C05P1<Boolean> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C063F(C1688880u3C c1688880u3C, C05P1<Boolean> c05p1, InterfaceC1364105Vn<? super C063F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1688880u3C;
        this.LLILLJJLI = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C063F(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJI;
        C1C7U.LIZ("SettingsPageKt@9408.SettingsList$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LLILLJJLI.getValue().booleanValue()) {
            strLJI = C20642515q3.LJI(2131829013);
        } else {
            strLJI = "";
        }
        this.LL.LLIZ.invoke(new C063G(strLJI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SettingsPageKt@9408.SettingsList$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
