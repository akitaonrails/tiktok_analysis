package X;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS166S0101000_28;
import njp.a;

/* JADX INFO: renamed from: X.0z19, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinepush.trigger.Strategy1Trigger$onBackground$3", f = "Strategy1Trigger.kt", l = {}, m = "invokeSuspend")
public final class C1879810z19 extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879810z19(long j, int i, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = j;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1879810z19 c1879810z19 = new C1879810z19(this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1879810z19.LL = ((Number) obj).intValue();
        return c1879810z19;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws IOException {
        C1C7U.LIZ("Strategy1Trigger@dc34.onBackground$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        C10IC.LIZ.getClass();
        AbstractC1868780yjM abstractC1868780yjMLIZ = C10IC.LIZ(1, i);
        if (abstractC1868780yjMLIZ instanceof C1868790yjN) {
            C0VQ7 c0vq7 = C0VQ7.LIZ;
            C1575430r6D.LIZ.getClass();
            long j = C1575430r6D.LIZ().pushDelayMs;
            if (j < 0) {
                j = 0;
            }
            String str = this.LLILLJJLI;
            c0vq7.getClass();
            C0VQ7.LIZIZ(1, j, str);
            C19319410i8 c19319410i8 = C1576970r8h.LIZIZ;
            String str2 = this.LLILLJJLI;
            String str3 = this.LLILLL;
            c19319410i8.LJIIJJI(new C1868800yjO(this.LLILZIL, str2, this.LLILZ, str3));
            C1566300qrU.LIZ = 0L;
            C1566300qrU.LIZIZ = "";
        } else if (abstractC1868780yjMLIZ instanceof C1868770yjL) {
            C1576970r8h.LIZIZ.LJIIJJI(new AwS166S0101000_28(abstractC1868780yjMLIZ, i, 2));
        } else {
            throw new C1954807lC();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Strategy1Trigger@dc34.onBackground$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
