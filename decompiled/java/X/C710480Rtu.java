package X;

import android.view.View;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Rtu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem$setRollbackFromWeakenButton$1", f = "TranslationStatusAssem.kt", l = {}, m = "invokeSuspend")
public final class C710480Rtu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TranslationStatusAssem LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710480Rtu(TranslationStatusAssem translationStatusAssem, boolean z, InterfaceC1364105Vn<? super C710480Rtu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = translationStatusAssem;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C710480Rtu(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TranslationStatusAssem@113f.setRollbackFromWeakenButton$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TranslationStatusAssem translationStatusAssem = this.LL;
        boolean z = this.LLILLJJLI;
        translationStatusAssem.LLLLII = z;
        if (z) {
            View viewFp = translationStatusAssem.Fp(translationStatusAssem.LLLIIL, null, null);
            if (viewFp != null) {
                C786410Ut5.LJLLLLLL(0, viewFp);
            }
        } else {
            translationStatusAssem.Vp();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TranslationStatusAssem@113f.setRollbackFromWeakenButton$1");
        return unit;
    }
}
