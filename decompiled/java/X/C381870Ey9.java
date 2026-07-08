package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS234S0000000_5;
import njp.a;

/* JADX INFO: renamed from: X.0Ey9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.core.handler.GenAIX2IHandler$startX2ITask$1", f = "GenAIX2IHandler.kt", l = {110}, m = "invokeSuspend")
public final class C381870Ey9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC381690Exr LLILLJJLI;
    public final /* synthetic */ EnumC381980EyK LLILLL;
    public final /* synthetic */ C382170Eyd LLILZ;
    public final /* synthetic */ EnumC381960EyI LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ InterfaceC382380Eyy LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381870Ey9(AbstractC381690Exr abstractC381690Exr, EnumC381980EyK enumC381980EyK, C382170Eyd c382170Eyd, EnumC381960EyI enumC381960EyI, String str, boolean z, InterfaceC382380Eyy interfaceC382380Eyy, InterfaceC1364105Vn<? super C381870Ey9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC381690Exr;
        this.LLILLL = enumC381980EyK;
        this.LLILZ = c382170Eyd;
        this.LLILZIL = enumC381960EyI;
        this.LLILZLL = str;
        this.LLIZ = z;
        this.LLIZLLLIL = interfaceC382380Eyy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381870Ey9(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIIIIZZ = obj;
        C1C7U.LIZ("GenAIX2IHandler@8d6e.startX2ITask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIIIIZZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIIIZZ);
            InterfaceC381790Ey1 interfaceC381790Ey1 = this.LLILLJJLI.LIZJ;
            C382000EyM c382000EyM = new C382000EyM(this.LLILLL, this.LLILZ, this.LLILZIL, EnumC382140Eya.AI_IMAGE.getTaskName(), this.LLILZLL, null, null, 96);
            C381860Ey8 c381860Ey8 = new C381860Ey8(this.LLILLJJLI, this.LLIZ, this.LLIZLLLIL, null);
            this.LL = 1;
            objLJIIIIZZ = interfaceC381790Ey1.LJIIIIZZ(c382000EyM, AFwS234S0000000_5.get$arr$(565), c381860Ey8, this);
            if (objLJIIIIZZ == objLJFF) {
                C1C7U.LIZIZ("GenAIX2IHandler@8d6e.startX2ITask$1");
                return objLJFF;
            }
        }
        C382300Eyq c382300Eyq = (C382300Eyq) objLJIIIIZZ;
        if (c382300Eyq == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GenAIX2IHandler@8d6e.startX2ITask$1");
            return unit;
        }
        String str = c382300Eyq.LIZ;
        InterfaceC382380Eyy interfaceC382380Eyy = this.LLILLJJLI.LIZLLL;
        if (interfaceC382380Eyy != null) {
            interfaceC382380Eyy.onStart();
        }
        this.LLILLJJLI.LJI(str);
        AbstractC381690Exr abstractC381690Exr = this.LLILLJJLI;
        abstractC381690Exr.LIZJ.LJIIIZ(abstractC381690Exr.LIZIZ.getCreationId());
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GenAIX2IHandler@8d6e.startX2ITask$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
