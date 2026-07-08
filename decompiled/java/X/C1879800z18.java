package X;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS166S0101000_28;
import njp.a;

/* JADX INFO: renamed from: X.0z18, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinepush.trigger.Strategy2Trigger$onBackground$4", f = "Strategy2Trigger.kt", l = {}, m = "invokeSuspend")
public final class C1879800z18 extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879800z18(int i, long j, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLJJLI;
        C1879800z18 c1879800z18 = new C1879800z18(this.LLILZ, this.LLILLL, str, interfaceC1364105Vn);
        c1879800z18.LL = ((Number) obj).intValue();
        return c1879800z18;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws IOException {
        C1C7U.LIZ("Strategy2Trigger@70f5.onBackground$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        C10IC.LIZ.getClass();
        AbstractC1868780yjM abstractC1868780yjMLIZ = C10IC.LIZ(2, i);
        if (abstractC1868780yjMLIZ instanceof C1868790yjN) {
            C0VQ7 c0vq7 = C0VQ7.LIZ;
            C1575430r6D.LIZ.getClass();
            long j = C1575430r6D.LIZ().pushDelayMs;
            if (j < 0) {
                j = 0;
            }
            String str = this.LLILLJJLI;
            c0vq7.getClass();
            C0VQ7.LIZIZ(2, j, str);
            C10IF.LIZIZ.LJIIJJI(new C1868810yjP(this.LLILLJJLI, this.LLILLL, this.LLILZ));
        } else if (abstractC1868780yjMLIZ instanceof C1868770yjL) {
            C10IF.LIZIZ.LJIIJJI(new AwS166S0101000_28(abstractC1868780yjMLIZ, i, 3));
        } else {
            throw new C1954807lC();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Strategy2Trigger@70f5.onBackground$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
