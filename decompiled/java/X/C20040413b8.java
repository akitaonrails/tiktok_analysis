package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoLanguageStyleSetting;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoUpdateResult;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13b8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.languagestyle.TakoLanguageStyleHelper$handleUpdateResponse$2$1", f = "TakoLanguageStyleHelper.kt", l = {}, m = "invokeSuspend")
public final class C20040413b8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoLanguageStyleSetting LL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLJJLI;
    public final /* synthetic */ TakoUpdateResult LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20040413b8(TakoLanguageStyleSetting takoLanguageStyleSetting, Function1<? super Boolean, Unit> function1, TakoUpdateResult takoUpdateResult, InterfaceC1364105Vn<? super C20040413b8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoLanguageStyleSetting;
        this.LLILLJJLI = function1;
        this.LLILLL = takoUpdateResult;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20040413b8(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        WeakReference<IMessageAbility> weakReference;
        IMessageAbility iMessageAbility;
        C1C7U.LIZ("TakoLanguageStyleHelper@b3b.handleUpdateResponse$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C201992141u c201992141u = C201992141u.LIZ;
        TakoLanguageStyleSetting takoLanguageStyleSetting = this.LL;
        c201992141u.getClass();
        C201992141u.LJFF(takoLanguageStyleSetting, false, null);
        Function1<Boolean, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(true);
        }
        String str = this.LLILLL.toastContent;
        if (str == null) {
            str = "";
        }
        C201992141u.LJ(str);
        Message message = this.LLILLL.hintMessage;
        if (message != null && (weakReference = C201992141u.LIZIZ) != null && (iMessageAbility = weakReference.get()) != null && iMessageAbility.oj()) {
            iMessageAbility.v21(message);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoLanguageStyleHelper@b3b.handleUpdateResponse$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
