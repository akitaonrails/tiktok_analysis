package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ey4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.core.handler.BaseAIGCHandler$checkQuotaList$1", f = "BaseAIGCHandler.kt", l = {275}, m = "invokeSuspend")
public final class C381820Ey4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ AbstractC381830Ey5 LLILLL;
    public final /* synthetic */ EnumC382100EyW LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Function1<List<C381550Exd>, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C381820Ey4(AbstractC381830Ey5 abstractC381830Ey5, EnumC382100EyW enumC382100EyW, List<String> list, String str, String str2, Function1<? super List<C381550Exd>, Unit> function1, InterfaceC1364105Vn<? super C381820Ey4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC381830Ey5;
        this.LLILZ = enumC382100EyW;
        this.LLILZIL = list;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381820Ey4(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[PHI: r3 r12 r13
      0x0034: PHI (r3v3 java.util.List<X.0Exd>) = (r3v7 java.util.List<X.0Exd>), (r3v8 java.util.List<X.0Exd>), (r3v8 java.util.List<X.0Exd>) binds: [B:17:0x0032, B:14:0x002c, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r12v1 boolean) = (r12v3 boolean), (r12v4 boolean), (r12v4 boolean) binds: [B:17:0x0032, B:14:0x002c, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r13v1 java.lang.Integer) = (r13v3 java.lang.Integer), (r13v4 java.lang.Integer), (r13v4 java.lang.Integer) binds: [B:17:0x0032, B:14:0x002c, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381820Ey4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
