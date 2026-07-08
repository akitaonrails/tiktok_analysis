package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.LanguageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS18S0010000_3;
import njp.a;

/* JADX INFO: renamed from: X.08WJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.LanguageSettingsCellKt$LanguageSettingsCell$2$1", f = "LanguageSettingsCell.kt", l = {103, 104}, m = "invokeSuspend")
public final class C08WJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2016007v4 LLILLJJLI;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLL;
    public final /* synthetic */ LanguageVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08WJ(C2016007v4 c2016007v4, C1677480tko<Float, C1677280tkU> c1677480tko, LanguageVM languageVM, InterfaceC1364105Vn<? super C08WJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2016007v4;
        this.LLILLL = c1677480tko;
        this.LLILZ = languageVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08WJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LanguageSettingsCellKt@1860.LanguageSettingsCell$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    LanguageVM languageVM = this.LLILZ;
                    languageVM.getClass();
                    languageVM.setState(new AwS18S0010000_3(false, 5));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LanguageSettingsCellKt@1860.LanguageSettingsCell$2$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.LL) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                    C1C7U.LIZIZ("LanguageSettingsCellKt@1860.LanguageSettingsCell$2$1");
                    return objLJFF;
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("LanguageSettingsCellKt@1860.LanguageSettingsCell$2$1");
            return unit2;
        }
        C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLL;
        Float fLIZLLL = C2286608xc.LIZLLL(0.0f);
        C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(600, 0, null, 6);
        this.LL = 2;
        if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, c1677050tk7LIZLLL, null, null, this, 12) == objLJFF) {
            C1C7U.LIZIZ("LanguageSettingsCellKt@1860.LanguageSettingsCell$2$1");
            return objLJFF;
        }
        LanguageVM languageVM2 = this.LLILZ;
        languageVM2.getClass();
        languageVM2.setState(new AwS18S0010000_3(false, 5));
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("LanguageSettingsCellKt@1860.LanguageSettingsCell$2$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
