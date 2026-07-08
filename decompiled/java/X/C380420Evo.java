package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Evo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.template.tasks.TemplateCombineEffectTaskV0$executeSerial$1", f = "TemplateCombineEffectTaskV0.kt", l = {103, 107}, m = "invokeSuspend")
public final class C380420Evo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C381300ExE LL;
    public C0FQS LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ List<C381340ExI> LLILZIL;
    public final /* synthetic */ C381300ExE LLILZLL;
    public final /* synthetic */ C0FQS LLIZ;
    public final /* synthetic */ C381330ExH LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C380420Evo(List<C381340ExI> list, C381300ExE c381300ExE, C0FQS c0fqs, C381330ExH c381330ExH, InterfaceC1364105Vn<? super C380420Evo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = list;
        this.LLILZLL = c381300ExE;
        this.LLIZ = c0fqs;
        this.LLIZLLLIL = c381330ExH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C380420Evo(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C381300ExE c381300ExE;
        C0FQS c0fqs;
        Iterator<C381340ExI> it2;
        C1C7U.LIZ("TemplateCombineEffectTaskV0@393c.executeSerial$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TemplateCombineEffectTaskV0@393c.executeSerial$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = (Iterator) this.LLILLL;
            c0fqs = this.LLILLJJLI;
            c381300ExE = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            List<C381340ExI> list = this.LLILZIL;
            c381300ExE = this.LLILZLL;
            c0fqs = this.LLIZ;
            it2 = list.iterator();
        }
        while (it2.hasNext()) {
            C381340ExI next = it2.next();
            next.LIZ.addVideoEffect(next.LIZIZ);
            C1DFB c1dfb = C0PEM.LIZJ;
            C380410Evn c380410Evn = new C380410Evn(next, c381300ExE, c0fqs, null);
            this.LL = c381300ExE;
            this.LLILLJJLI = c0fqs;
            this.LLILLL = it2;
            this.LLILZ = 1;
            if (C23250099c.LJI(this, c1dfb, c380410Evn) == objLJFF) {
                C1C7U.LIZIZ("TemplateCombineEffectTaskV0@393c.executeSerial$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C380430Evp c380430Evp = new C380430Evp(this.LLIZ, this.LLILZLL, this.LLIZLLLIL, null);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c380430Evp) == objLJFF) {
            C1C7U.LIZIZ("TemplateCombineEffectTaskV0@393c.executeSerial$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateCombineEffectTaskV0@393c.executeSerial$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
