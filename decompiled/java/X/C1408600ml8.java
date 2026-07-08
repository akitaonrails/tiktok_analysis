package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ml8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.GeneralHighlightPopupHelper$requestHighlightStatus$1", f = "GeneralHighlightPopupHelper.kt", l = {295, 297}, m = "invokeSuspend")
public final class C1408600ml8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408600ml8(String str, InterfaceC1364105Vn<? super C1408600ml8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408600ml8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralHighlightPopupHelper@9bd1.requestHighlightStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Set<Integer> set = C1835140xr6.LLILLJJLI;
            if (set.contains(C2286608xc.LJ(16778115))) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(30000L, this) == objLJFF) {
                    C1C7U.LIZIZ("GeneralHighlightPopupHelper@9bd1.requestHighlightStatus$1");
                    return objLJFF;
                }
            } else if (set.contains(C2286608xc.LJ(134217736))) {
                this.LL = 2;
                if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                    C1C7U.LIZIZ("GeneralHighlightPopupHelper@9bd1.requestHighlightStatus$1");
                    return objLJFF;
                }
            }
        }
        C1835140xr6.LLILZ++;
        C1835140xr6 c1835140xr6 = C1835140xr6.LL;
        String str = this.LLILLJJLI;
        C1835140xr6.LIZJ(str, new C1835130xr5(str));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GeneralHighlightPopupHelper@9bd1.requestHighlightStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
