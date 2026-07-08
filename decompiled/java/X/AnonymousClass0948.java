package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0948, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {423}, m = "invokeSuspend")
public final class AnonymousClass0948 extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, InterfaceC346701Wf<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public AnonymousClass0954 LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0948(InterfaceC346201Wa interfaceC346201Wa, long j, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZLL = j;
        this.LLIZ = interfaceC346201Wa;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        AnonymousClass0954 anonymousClass0954LIZIZ;
        C259800zU c259800zU;
        boolean z;
        AnonymousClass0954 anonymousClass0954LIZIZ2;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                anonymousClass0954LIZIZ2 = this.LLILLJJLI;
                c259800zU = this.LL;
                anonymousClass0954LIZIZ = (AnonymousClass0954) this.LLILZIL;
                interfaceC346701Wf = (InterfaceC346701Wf) this.LLILZ;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILZIL;
            anonymousClass0954LIZIZ = C23128094k.LIZIZ(interfaceC497601wk, -1, new C23097093f(this.LLIZ, null), 1);
            c259800zU = new C259800zU();
            long j = this.LLILZLL;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (j >= 0) {
                    anonymousClass0954LIZIZ2 = C23128094k.LIZIZ(interfaceC497601wk, 0, new C457901qL(j, j, null), 1);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expected non-negative initial delay, but has ");
                    sbLIZ.append(j);
                    sbLIZ.append(" ms");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalArgumentException(strLIZIZ);
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Expected non-negative delay, but has ");
                sbLIZ2.append(j);
                sbLIZ2.append(" ms");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                strLIZIZ2.toString();
                throw new IllegalArgumentException(strLIZIZ2);
            }
        }
        while (c259800zU.element != C09AV.LIZJ) {
            C1DE8 c1de8 = new C1DE8(getContext());
            c1de8.LIZJ(anonymousClass0954LIZIZ.LJIIIZ(), new AnonymousClass0947(c259800zU, anonymousClass0954LIZIZ2, null));
            c1de8.LIZJ(anonymousClass0954LIZIZ2.LJIILJJIL(), new C23096093e(null, c259800zU, interfaceC346701Wf));
            this.LLILZ = interfaceC346701Wf;
            this.LLILZIL = anonymousClass0954LIZIZ;
            this.LL = c259800zU;
            this.LLILLJJLI = anonymousClass0954LIZIZ2;
            this.LLILLL = 1;
            if (c1de8.LJII(this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC346701Wf<Object> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        long j = this.LLILZLL;
        AnonymousClass0948 anonymousClass0948 = new AnonymousClass0948(this.LLIZ, j, interfaceC1364105Vn);
        anonymousClass0948.LLILZ = interfaceC497601wk;
        anonymousClass0948.LLILZIL = interfaceC346701Wf;
        return anonymousClass0948.invokeSuspend(Unit.LIZ);
    }
}
