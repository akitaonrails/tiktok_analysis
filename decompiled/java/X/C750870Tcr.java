package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tcr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectUtil$initVM$5$1$2", f = "TakoMultipleSelectUtil.kt", l = {424}, m = "invokeSuspend")
public final class C750870Tcr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoMultipleSelectVM LLILLJJLI;
    public final /* synthetic */ InterfaceC665370Q7z LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ C259800zU<DialogC1389620mGW> LLILZIL;
    public final /* synthetic */ Activity LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ View LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750870Tcr(TakoMultipleSelectVM takoMultipleSelectVM, InterfaceC665370Q7z interfaceC665370Q7z, Map<String, String> map, C259800zU<DialogC1389620mGW> c259800zU, Activity activity, int i, String str, View view, InterfaceC1364105Vn<? super C750870Tcr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoMultipleSelectVM;
        this.LLILLL = interfaceC665370Q7z;
        this.LLILZ = map;
        this.LLILZIL = c259800zU;
        this.LLILZLL = activity;
        this.LLIZ = i;
        this.LLIZLLLIL = str;
        this.LLJ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750870Tcr(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoMultipleSelectUtil@65f7.initVM$5$1$2");
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
            TakoMultipleSelectVM takoMultipleSelectVM = this.LLILLJJLI;
            if (takoMultipleSelectVM != null) {
                this.LL = 1;
                if (takoMultipleSelectVM.wQ2(3000L, this) == objLJFF) {
                    C1C7U.LIZIZ("TakoMultipleSelectUtil@65f7.initVM$5$1$2");
                    return objLJFF;
                }
            }
        }
        TakoMultipleSelectVM takoMultipleSelectVM2 = this.LLILLJJLI;
        if (takoMultipleSelectVM2 != null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL;
            takoMultipleSelectVM2.BQ2(interfaceC665370Q7z, new C0THR(this.LLILZIL, this.LLILZLL, interfaceC665370Q7z, this.LLIZ, this.LLILZ, this.LLIZLLLIL, this.LLJ, takoMultipleSelectVM2));
        }
        C12FB.LIZJ("save", this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoMultipleSelectUtil@65f7.initVM$5$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
