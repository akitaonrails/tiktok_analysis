package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS572S0100000_28;
import njp.a;

/* JADX INFO: renamed from: X.0ybE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBotHelper$fetchConversation$1", f = "TakoBotHelper.kt", l = {260, 267}, m = "invokeSuspend")
public final class C1863740ybE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863740ybE(int i, long j, String str, InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = function0;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        long j = this.LLILLJJLI;
        return new C1863740ybE(this.LLILLL, j, this.LLILZIL, interfaceC1364105Vn, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoBotHelper@93ed.fetchConversation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoBotHelper@93ed.fetchConversation$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C14TF c14tf = C14TF.LIZIZ;
            long j = this.LLILLJJLI;
            int i2 = this.LLILLL;
            this.LL = 1;
            obj = c14tf.LJJIZ(i2, j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoBotHelper@93ed.fetchConversation$1");
                return objLJFF;
            }
        }
        if (C123100dR.LIZ((String) obj)) {
            if (C1863380yae.LJJII.LJII(C2286608xc.LJ(this.LLILLL), C2286608xc.LJFF(this.LLILLJJLI), null)) {
                this.LLILZ.invoke();
            } else {
                C1863710ybB c1863710ybB = C1863710ybB.LIZ;
                long j2 = this.LLILLJJLI;
                int i3 = this.LLILLL;
                String str = this.LLILZIL;
                AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this.LLILZ, (Function0<Unit>) 718);
                this.LL = 2;
                if (c1863710ybB.LIZJ(i3, j2, str, this, awS572S0100000_28) == objLJFF) {
                    C1C7U.LIZIZ("TakoBotHelper@93ed.fetchConversation$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoBotHelper@93ed.fetchConversation$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
