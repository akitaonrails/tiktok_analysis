package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vKO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.preupload.logic.AmeEffectPrepareLogic$doUploadTask$2", f = "AmeEffectPrepareLogic.kt", l = {151, 152}, m = "invokeSuspend")
public final class C1737980vKO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1737970vKN LLILLL;
    public final /* synthetic */ C1737870vKD LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1737980vKO(C1737970vKN c1737970vKN, C1737870vKD c1737870vKD, InterfaceC1364105Vn<? super C1737980vKO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1737970vKN;
        this.LLILZ = c1737870vKD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1737980vKO c1737980vKO = new C1737980vKO(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1737980vKO.LLILLJJLI = obj;
        return c1737980vKO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AmeEffectPrepareLogic@b7d3.doUploadTask$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILLL.LJIIIZ = null;
                    this.LLILLL.LJIIJ = null;
                    C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AmeEffectPrepareLogic doUploadTask done: ");
                    sbLIZ.append(this.LLILLL.LIZ);
                    C201955140j.LJIILL(c830690WiJ, "AmeEffectPublisher", C2188811AlT.LIZIZ(sbLIZ));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AmeEffectPrepareLogic@b7d3.doUploadTask$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C830690WiJ c830690WiJ2 = C830690WiJ.LIZIZ;
            C201955140j.LJIILL(c830690WiJ2, "AmeEffectPublisher", "AmeEffectPrepareLogic doUploadTask");
            C1737820vK8 c1737820vK8 = this.LLILLL.LIZ;
            if (c1737820vK8.LJ.length() != 0 && c1737820vK8.LJII != null) {
                C1737970vKN c1737970vKN = this.LLILLL;
                c1737970vKN.LJIIIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1737990vKP(c1737970vKN, this.LLILZ, null), 3);
                C1737970vKN c1737970vKN2 = this.LLILLL;
                c1737970vKN2.LJIIJ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1738070vKX(c1737970vKN2, this.LLILZ, null), 3);
                C099G c099g = this.LLILLL.LJIIIZ;
                if (c099g != null) {
                    this.LL = 1;
                    if (c099g.LJLIIIL(this) == objLJFF) {
                        C1C7U.LIZIZ("AmeEffectPrepareLogic@b7d3.doUploadTask$2");
                        return objLJFF;
                    }
                }
            } else {
                C201955140j.LJIJJ(c830690WiJ2, "AmeEffectPublisher", "AmeEffectPrepareLogic prepare failed");
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("AmeEffectPrepareLogic@b7d3.doUploadTask$2");
                return unit2;
            }
        }
        C099G c099g2 = this.LLILLL.LJIIJ;
        if (c099g2 != null) {
            this.LL = 2;
            if (c099g2.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("AmeEffectPrepareLogic@b7d3.doUploadTask$2");
                return objLJFF;
            }
        }
        this.LLILLL.LJIIIZ = null;
        this.LLILLL.LJIIJ = null;
        C830690WiJ c830690WiJ3 = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AmeEffectPrepareLogic doUploadTask done: ");
        sbLIZ2.append(this.LLILLL.LIZ);
        C201955140j.LJIILL(c830690WiJ3, "AmeEffectPublisher", C2188811AlT.LIZIZ(sbLIZ2));
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AmeEffectPrepareLogic@b7d3.doUploadTask$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
