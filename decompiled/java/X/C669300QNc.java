package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0QNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.middle.preload.SugInputTracker$handleInputDebounce$2", f = "SugInputTracker.kt", l = {}, m = "invokeSuspend")
public final class C669300QNc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CharSequence LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C669300QNc(CharSequence charSequence, InterfaceC1364105Vn<? super C669300QNc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = charSequence;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C669300QNc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        double d;
        C1C7U.LIZ("SugInputTracker@89a0.handleInputDebounce$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CharSequence charSequence = this.LL;
        if (charSequence == null) {
            charSequence = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = charSequence.toString();
        int length = string.length();
        if (C669340QNg.LIZ == -1 || (C669340QNg.LIZJ == 0 && length > 0)) {
            C669340QNg.LIZIZ = 0;
            C669340QNg.LIZLLL = 0;
        }
        if (length == 0) {
            C669340QNg.LIZ = -1L;
            C669340QNg.LIZIZ = 0;
            C669340QNg.LIZJ = 0;
            C669340QNg.LIZLLL = 0;
        }
        int i = length - C669340QNg.LIZJ;
        if (i > 0) {
            C669340QNg.LIZLLL += i;
        } else if (i < 0) {
            C669340QNg.LIZIZ += -i;
        }
        int i2 = C669340QNg.LIZLLL;
        double d2 = 0.0d;
        if (i2 > 0) {
            d = ((double) C669340QNg.LIZIZ) / ((double) i2);
        } else {
            d = 0.0d;
        }
        double dLIZJ = C13LZ.LIZJ(d, 0.0d, 1.0d);
        if (u.LJIIZILJ(string, " ", false)) {
            d2 = 1.0d;
        }
        double dLIZJ2 = C13LZ.LIZJ(((double) i) / 20.0d, -1.0d, 1.0d);
        double dLIZJ3 = C13LZ.LIZJ(((double) length) / 50.0d, 0.0d, 1.0d);
        C669340QNg.LIZ = jCurrentTimeMillis;
        C669340QNg.LIZJ = length;
        C669340QNg.LJ = new C669330QNf(dLIZJ, d2, dLIZJ2, dLIZJ3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SugInputTracker@89a0.handleInputDebounce$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
