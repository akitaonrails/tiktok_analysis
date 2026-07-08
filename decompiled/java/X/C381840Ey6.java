package X;

import kotlin.Unit;
import kotlin.jvm.internal.AwS90S1200000_5;

/* JADX INFO: renamed from: X.0Ey6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.core.handler.GenAIX2VHandler$startX2VTask$1$submission$2", f = "GenAIX2VHandler.kt", l = {92}, m = "invokeSuspend")
public final class C381840Ey6 extends C09AX implements InterfaceC1631620sYq<String, C381540Exc, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ C381540Exc LLILLL;
    public final /* synthetic */ AbstractC381680Exq LLILZ;
    public final /* synthetic */ EnumC378310EsP LLILZIL;
    public final /* synthetic */ EnumC381960EyI LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ InterfaceC382380Eyy LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381840Ey6(AbstractC381680Exq abstractC381680Exq, EnumC378310EsP enumC378310EsP, EnumC381960EyI enumC381960EyI, boolean z, InterfaceC382380Eyy interfaceC382380Eyy, InterfaceC1364105Vn<? super C381840Ey6> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = abstractC381680Exq;
        this.LLILZIL = enumC378310EsP;
        this.LLILZLL = enumC381960EyI;
        this.LLIZ = z;
        this.LLIZLLLIL = interfaceC382380Eyy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objLIZ = obj;
        C1C7U.LIZ("GenAIX2VHandler@1b31.startX2VTask$1$submission$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.LLILLJJLI;
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            str = (String) this.LLILLJJLI;
            if (this.LLILLL == null) {
                AbstractC381680Exq abstractC381680Exq = this.LLILZ;
                EnumC378310EsP enumC378310EsP = this.LLILZIL;
                EnumC381960EyI enumC381960EyI = this.LLILZLL;
                boolean z2 = this.LLIZ;
                this.LLILLJJLI = str;
                this.LL = 1;
                abstractC381680Exq.getClass();
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                if (!C560970LzL.LIZIZ()) {
                    InterfaceC382380Eyy interfaceC382380Eyy = abstractC381680Exq.LIZLLL;
                    if (interfaceC382380Eyy != null) {
                        interfaceC382380Eyy.LIZIZ(new C377760ErW(-47364, str, 0, "network unavailable", null, 24));
                    }
                    C189200o6.m2constructorimpl(false);
                    c23260099m.resumeWith(false);
                } else if (!z2) {
                    C189200o6.m2constructorimpl(true);
                    c23260099m.resumeWith(true);
                } else {
                    abstractC381680Exq.LIZ(enumC378310EsP, enumC381960EyI, new AwS90S1200000_5(abstractC381680Exq, str, c23260099m, 5));
                }
                objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("GenAIX2VHandler@1b31.startX2VTask$1$submission$2");
                    return objLJFF;
                }
            }
            this.LLIZLLLIL.LIZ(str);
            z = true;
            Boolean boolValueOf = Boolean.valueOf(z);
            C1C7U.LIZIZ("GenAIX2VHandler@1b31.startX2VTask$1$submission$2");
            return boolValueOf;
        }
        if (((Boolean) objLIZ).booleanValue()) {
            this.LLIZLLLIL.LIZ(str);
            z = true;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z);
        C1C7U.LIZIZ("GenAIX2VHandler@1b31.startX2VTask$1$submission$2");
        return boolValueOf2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(String str, C381540Exc c381540Exc, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C381840Ey6 c381840Ey6 = new C381840Ey6(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c381840Ey6.LLILLJJLI = str;
        c381840Ey6.LLILLL = c381540Exc;
        return c381840Ey6.invokeSuspend(Unit.LIZ);
    }
}
