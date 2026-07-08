package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoLanguageStyleSetting;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13b7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.languagestyle.TakoLanguageStyleHelper$updateLanguageStyleSetting$1", f = "TakoLanguageStyleHelper.kt", l = {}, m = "invokeSuspend")
public final class C20040313b7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoLanguageStyleSetting LL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20040313b7(TakoLanguageStyleSetting takoLanguageStyleSetting, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C20040313b7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoLanguageStyleSetting;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20040313b7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IMessageAbility iMessageAbility;
        C1C7U.LIZ("TakoLanguageStyleHelper@b3b.updateLanguageStyleSetting$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C201992141u c201992141u = C201992141u.LIZ;
        C201992141u.LJFF = this.LL;
        C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
        TakoLanguageStyleSetting takoLanguageStyleSetting = this.LL;
        c1860520yW2.getClass();
        Keva kevaLJIIL = C1860520yW2.LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_language_style_setting");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C201992141u.LIZ.getClass();
        kevaLJIIL.storeString(strLIZIZ, GsonProtectorUtils.toJson(C597040NbK.LIZ(), takoLanguageStyleSetting));
        WeakReference<IMessageAbility> weakReference = C201992141u.LIZIZ;
        if (weakReference != null && (iMessageAbility = weakReference.get()) != null) {
            iMessageAbility.gC1(this.LL.selectedLanguageStyle);
        }
        Function1<Boolean, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoLanguageStyleHelper@b3b.updateLanguageStyleSetting$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
