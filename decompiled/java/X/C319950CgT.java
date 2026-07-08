package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.bottombox.speech.TakoVoiceTalkDirectlyManager$init$1", f = "TakoVoiceTalkDirectlyManager.kt", l = {31}, m = "invokeSuspend")
public final class C319950CgT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C319950CgT(InterfaceC1364105Vn<? super C319950CgT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319950CgT(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoVoiceTalkDirectlyManager@5ecb.init$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = C320490ChL.LIZIZ;
            Object obj2 = new InterfaceC346701Wf() { // from class: X.0CgU
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn) {
                    if (!((Boolean) obj3).booleanValue() && !C319970CgV.LJ) {
                        C319970CgV.LIZ();
                    } else {
                        C319970CgV.LIZ.setValue(false);
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (anonymousClass0951.collect(obj2, this) == objLJFF) {
                C1C7U.LIZIZ("TakoVoiceTalkDirectlyManager@5ecb.init$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C319950CgT(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
