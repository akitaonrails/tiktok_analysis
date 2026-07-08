package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS119S1100000_5;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Ey7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.core.handler.GenAIX2VHandler$startX2VTask$1", f = "GenAIX2VHandler.kt", l = {79}, m = "invokeSuspend")
public final class C381850Ey7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC381680Exq LLILLJJLI;
    public final /* synthetic */ EnumC381980EyK LLILLL;
    public final /* synthetic */ C382170Eyd LLILZ;
    public final /* synthetic */ EnumC381960EyI LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C381700Exs LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ EnumC378310EsP LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ InterfaceC382380Eyy LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381850Ey7(AbstractC381680Exq abstractC381680Exq, EnumC381980EyK enumC381980EyK, C382170Eyd c382170Eyd, EnumC381960EyI enumC381960EyI, String str, C381700Exs c381700Exs, String str2, EnumC378310EsP enumC378310EsP, boolean z, InterfaceC382380Eyy interfaceC382380Eyy, InterfaceC1364105Vn<? super C381850Ey7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC381680Exq;
        this.LLILLL = enumC381980EyK;
        this.LLILZ = c382170Eyd;
        this.LLILZIL = enumC381960EyI;
        this.LLILZLL = str;
        this.LLIZ = c381700Exs;
        this.LLIZLLLIL = str2;
        this.LLJ = enumC378310EsP;
        this.LLJI = z;
        this.LLJIJIL = interfaceC382380Eyy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381850Ey7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objLJIIIIZZ = obj;
        C1C7U.LIZ("GenAIX2VHandler@1b31.startX2VTask$1");
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
            EnumC381980EyK enumC381980EyK = this.LLILLL;
            C382170Eyd c382170Eyd = this.LLILZ;
            EnumC381960EyI enumC381960EyI = this.LLILZIL;
            String taskName = EnumC382140Eya.AI_VIDEO.getTaskName();
            String str2 = this.LLILZLL;
            String taskId = this.LLIZ.LJ;
            if (taskId == null) {
                taskId = this.LLILLJJLI.LIZIZ.getAILivePhotoModel().getTaskId();
            }
            C382000EyM c382000EyM = new C382000EyM(enumC381980EyK, c382170Eyd, enumC381960EyI, taskName, str2, taskId, null, 64);
            AwS119S1100000_5 awS119S1100000_5 = new AwS119S1100000_5(this.LLIZ, this.LLIZLLLIL, 14);
            C381840Ey6 c381840Ey6 = new C381840Ey6(this.LLILLJJLI, this.LLJ, this.LLILZIL, this.LLJI, this.LLJIJIL, null);
            this.LL = 1;
            objLJIIIIZZ = interfaceC381790Ey1.LJIIIIZZ(c382000EyM, awS119S1100000_5, c381840Ey6, this);
            if (objLJIIIIZZ == objLJFF) {
                C1C7U.LIZIZ("GenAIX2VHandler@1b31.startX2VTask$1");
                return objLJFF;
            }
        }
        C382300Eyq c382300Eyq = (C382300Eyq) objLJIIIIZZ;
        if (c382300Eyq == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GenAIX2VHandler@1b31.startX2VTask$1");
            return unit;
        }
        String str3 = c382300Eyq.LIZ;
        C381540Exc c381540Exc = c382300Eyq.LIZIZ;
        if (c381540Exc != null) {
            str = c381540Exc.LJ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "FINISHED")) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GenAIX2VHandler@1b31.startX2VTask$1");
            return unit2;
        }
        InterfaceC382380Eyy interfaceC382380Eyy = this.LLILLJJLI.LIZLLL;
        if (interfaceC382380Eyy != null) {
            interfaceC382380Eyy.onStart();
        }
        this.LLILLJJLI.LJI(str3);
        AbstractC381680Exq abstractC381680Exq = this.LLILLJJLI;
        abstractC381680Exq.LIZJ.LJIIIZ(abstractC381680Exq.LIZIZ.getCreationId());
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("GenAIX2VHandler@1b31.startX2VTask$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
