package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05BI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.voiceclone.EditorProVoiceCloneDataRepo$fetchVoiceCloneData$1", f = "EditorProVoiceCloneDataRepo.kt", l = {29}, m = "invokeSuspend")
public final class C05BI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<C05HK, Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05BI(InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05BI(interfaceC1364105Vn, this.LLILLL, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProVoiceCloneDataRepo@2ae.fetchVoiceCloneData$1");
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
            if (C123100dR.LIZ(C05EZ.LIZ)) {
                C05HK c05hkLIZ = C05EZ.LIZ(C05EZ.LIZ);
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C05BH c05bh = new C05BH(this.LLILLJJLI, c05hkLIZ, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c05bh) == objLJFF) {
                    C1C7U.LIZIZ("EditorProVoiceCloneDataRepo@2ae.fetchVoiceCloneData$1");
                    return objLJFF;
                }
            } else {
                C05YQ c05yq = C05YQ.LIZ;
                String strLJJIZ = C05HM.LIZIZ.LJJIZ();
                final Function1<C05HK, Unit> function1 = this.LLILLJJLI;
                final Function0<Unit> function0 = this.LLILLL;
                InterfaceC1446480nkE interfaceC1446480nkE = new InterfaceC1446480nkE() { // from class: X.05BG
                    @Override // X.InterfaceC1446480nkE
                    public final void onFailure() {
                        C1DFH c1dfh2 = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C05BE(function0, null), 3);
                    }

                    @Override // X.InterfaceC1446480nkE
                    public final void onSuccess(String str) {
                        C05EZ.LIZ = str;
                        C05HK c05hkLIZ2 = C05EZ.LIZ(str);
                        C1DFH c1dfh2 = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C05BF(function1, c05hkLIZ2, null), 3);
                    }
                };
                c05yq.getClass();
                C05YQ.LIZ("", strLJJIZ, interfaceC1446480nkE);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EditorProVoiceCloneDataRepo@2ae.fetchVoiceCloneData$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditorProVoiceCloneDataRepo@2ae.fetchVoiceCloneData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
