package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08sU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsComposeComponentsKt$ExposeSettingKey$1$1", f = "SettingsComposeComponents.kt", l = {241}, m = "invokeSuspend")
public final class C2254808sU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC2254908sV LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2254808sU(InterfaceC2254908sV interfaceC2254908sV, String str, Function0<Unit> function0, InterfaceC1364105Vn<? super C2254808sU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC2254908sV;
        this.LLILLL = str;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2254808sU(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SettingsComposeComponentsKt@f15e.ExposeSettingKey$1$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("SettingsComposeComponentsKt@f15e.ExposeSettingKey$1$1");
                return objLJFF;
            }
        }
        if (!this.LLILLJJLI.Lk2().contains(this.LLILLL)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Key exposed: ");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(" first time");
            C2188811AlT.LIZIZ(sbLIZ);
            this.LLILZ.invoke();
        }
        this.LLILLJJLI.Lk2().add(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SettingsComposeComponentsKt@f15e.ExposeSettingKey$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
