package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Iym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity$submitWelcomeMessage$1$1$1", f = "BaWelcomeMessageEditActivity.kt", l = {230, 232}, m = "invokeSuspend")
public final class C484180Iym extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaWelcomeMessageEditActivity LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C484180Iym(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, String str, InterfaceC1364105Vn<? super C484180Iym> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baWelcomeMessageEditActivity;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C484180Iym c484180Iym = new C484180Iym(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c484180Iym.LLILLJJLI = obj;
        return c484180Iym;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        boolean zBooleanValue;
        C1C7U.LIZ("BaWelcomeMessageEditActivity@83d7.submitWelcomeMessage$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            BaWelcomeMessageEditActivity baWelcomeMessageEditActivity = this.LLILLL;
            C484210Iyp c484210Iyp = baWelcomeMessageEditActivity.LLJI;
            C484210Iyp c484210Iyp2 = new C484210Iyp(2, c484210Iyp.LIZ, this.LLILZ, c484210Iyp.LIZLLL);
            if (c484210Iyp.LIZIZ == 1) {
                IBaAutoMessageService iBaAutoMessageService = baWelcomeMessageEditActivity.LLJIJIL;
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                obj = iBaAutoMessageService.LJIIIZ(c484210Iyp2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BaWelcomeMessageEditActivity@83d7.submitWelcomeMessage$1$1$1");
                    return objLJFF;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                IBaAutoMessageService iBaAutoMessageService2 = baWelcomeMessageEditActivity.LLJIJIL;
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 2;
                obj = iBaAutoMessageService2.LJIILLIIL(c484210Iyp2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BaWelcomeMessageEditActivity@83d7.submitWelcomeMessage$1$1$1");
                    return objLJFF;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
        }
        if (zBooleanValue) {
            C0J21.LJ(5);
            BaWelcomeMessageEditActivity baWelcomeMessageEditActivity2 = this.LLILLL;
            String string = baWelcomeMessageEditActivity2.getString(2131849274);
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C2130008Wc(0, baWelcomeMessageEditActivity2, string, null), 2);
            this.LLILLL.finish();
        } else {
            BaWelcomeMessageEditActivity baWelcomeMessageEditActivity3 = this.LLILLL;
            String string2 = baWelcomeMessageEditActivity3.getString(2131834210);
            C817503Hh c817503Hh2 = C817503Hh.LL;
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C23250099c.LIZLLL(c817503Hh2, abstractC2238408pq, null, new C2130008Wc(0, baWelcomeMessageEditActivity3, string2, null), 2);
            C23250099c.LIZLLL(interfaceC497601wk, abstractC2238408pq, null, new C484200Iyo(this.LLILLL, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaWelcomeMessageEditActivity@83d7.submitWelcomeMessage$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
