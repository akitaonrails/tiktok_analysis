package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS0S0610000_1;
import njp.a;

/* JADX INFO: renamed from: X.03h1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess$payResultProcess$handleFailed$3", f = "PaymentResultProcess.kt", l = {}, m = "invokeSuspend")
public final class C909703h1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ C912503hT LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ C897703f5 LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;
    public final /* synthetic */ Function1<Boolean, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C909703h1(Context context, String str, String str2, boolean z, Function0<Unit> function0, C013C c013c, C912503hT c912503hT, String str3, C897703f5 c897703f5, Function0<Unit> function02, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C909703h1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = function0;
        this.LLILZLL = c013c;
        this.LLIZ = c912503hT;
        this.LLIZLLLIL = str3;
        this.LLJ = c897703f5;
        this.LLJI = function02;
        this.LLJIJIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C909703h1(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentResultProcess@6ad4.payResultProcess$handleFailed$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1397580mTM c1397580mTM = new C1397580mTM(this.LL);
        c1397580mTM.LJI(this.LLILLJJLI);
        c1397580mTM.LIZIZ(this.LLILLL);
        C985403tE.LIZ(c1397580mTM, new C909803h2(this.LLILZ, this.LL, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ));
        c1397580mTM.LIZLLL(new AwS0S0610000_1(this.LLJ, (C897703f5) this.LLIZ, (C912503hT) this.LLILZLL, (C013C) this.LLJI, (Function0<Unit>) this.LLJIJIL, (Function1<? super Boolean, Unit>) this.LLILZ, (boolean) this.LL, (Context) 0));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentResultProcess@6ad4.payResultProcess$handleFailed$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
