package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS619S0100000_5;
import njp.a;

/* JADX INFO: renamed from: X.0Kmo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.PhotoModeTemplateChosenResultImpl$downloadTemplate$getTemplateUrlTask$1", f = "PhotoModeTemplateChosenResultImpl.kt", l = {269}, m = "invokeSuspend")
public final class C527720Kmo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1660260tJ2<? extends String, ? extends String, ? extends String, ? extends String>>, Object> {
    public int LL;
    public final /* synthetic */ C0L1E LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C527720Kmo(C0L1E c0l1e, String str, InterfaceC1364105Vn<? super C527720Kmo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0l1e;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C527720Kmo(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoModeTemplateChosenResultImpl@e1dd.downloadTemplate$getTemplateUrlTask$1");
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
            C0L1E c0l1e = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            c0l1e.getClass();
            C443120HZe<String, String, String> c443120HZeLIZ = C0CHQ.LIZ().LJIIIIZZ().LIZ(str);
            String first = c443120HZeLIZ.getFirst();
            if (first == null) {
                first = "";
            }
            String second = c443120HZeLIZ.getSecond();
            if (second == null) {
                second = "";
            }
            if (first.length() > 0) {
                obj = new C1660260tJ2(first, second, "", "");
            } else {
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                InterfaceC523450Kfv interfaceC523450KfvLJIIIIZZ = C0CHQ.LIZ().LJIIIIZZ();
                C1429050nI7.LIZ.getClass();
                interfaceC523450KfvLJIIIIZZ.LJII(str, C1429050nI7.LIZ(), 2, null, null, new C527730Kmp(c23260099m), new AwS619S0100000_5(c23260099m, 54));
                obj = c23260099m.LIZ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PhotoModeTemplateChosenResultImpl@e1dd.downloadTemplate$getTemplateUrlTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PhotoModeTemplateChosenResultImpl@e1dd.downloadTemplate$getTemplateUrlTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1660260tJ2<? extends String, ? extends String, ? extends String, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
