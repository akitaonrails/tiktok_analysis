package X;

import kotlin.Unit;
import kotlin.jvm.internal.AwS90S1200000_5;

/* JADX INFO: renamed from: X.0Ey8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.core.handler.GenAIX2IHandler$startX2ITask$1$submission$1", f = "GenAIX2IHandler.kt", l = {119}, m = "invokeSuspend")
public final class C381860Ey8 extends C09AX implements InterfaceC1631620sYq<String, C381540Exc, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ C381540Exc LLILLL;
    public final /* synthetic */ AbstractC381690Exr LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ InterfaceC382380Eyy LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381860Ey8(AbstractC381690Exr abstractC381690Exr, boolean z, InterfaceC382380Eyy interfaceC382380Eyy, InterfaceC1364105Vn<? super C381860Ey8> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = abstractC381690Exr;
        this.LLILZIL = z;
        this.LLILZLL = interfaceC382380Eyy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("GenAIX2IHandler@8d6e.startX2ITask$1$submission$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            str = (String) this.LLILLJJLI;
            if (this.LLILLL == null) {
                AbstractC381690Exr abstractC381690Exr = this.LLILZ;
                boolean z2 = this.LLILZIL;
                this.LLILLJJLI = str;
                this.LL = 1;
                abstractC381690Exr.getClass();
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                if (!C560970LzL.LIZIZ()) {
                    InterfaceC382380Eyy interfaceC382380Eyy = abstractC381690Exr.LIZLLL;
                    if (interfaceC382380Eyy != null) {
                        interfaceC382380Eyy.LIZIZ(new C377760ErW(-47364, str, 0, "network unavailable", null, 24));
                    }
                    C189200o6.m2constructorimpl(false);
                    c23260099m.resumeWith(false);
                } else if (!z2) {
                    C189200o6.m2constructorimpl(true);
                    c23260099m.resumeWith(true);
                } else {
                    abstractC381690Exr.LIZ(null, EnumC381960EyI.EDITOR_PRO_AIGC_T2I, new AwS90S1200000_5(c23260099m, abstractC381690Exr, str, 6));
                }
                obj = c23260099m.LIZ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GenAIX2IHandler@8d6e.startX2ITask$1$submission$1");
                    return objLJFF;
                }
            }
            this.LLILZLL.LIZ(str);
            z = true;
            Boolean boolValueOf = Boolean.valueOf(z);
            C1C7U.LIZIZ("GenAIX2IHandler@8d6e.startX2ITask$1$submission$1");
            return boolValueOf;
        }
        if (((Boolean) obj).booleanValue()) {
            this.LLILZLL.LIZ(str);
            z = true;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z);
        C1C7U.LIZIZ("GenAIX2IHandler@8d6e.startX2ITask$1$submission$1");
        return boolValueOf2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(String str, C381540Exc c381540Exc, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C381860Ey8 c381860Ey8 = new C381860Ey8(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c381860Ey8.LLILLJJLI = str;
        c381860Ey8.LLILLL = c381540Exc;
        return c381860Ey8.invokeSuspend(Unit.LIZ);
    }
}
