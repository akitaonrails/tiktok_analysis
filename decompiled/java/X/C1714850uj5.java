package X;

import com.ss.android.ugc.aweme.verify.bio.BioVerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uj5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.bio.BioVerifyViewModel$verifySignedChallenge$2", f = "BioVerifyViewModel.kt", l = {263}, m = "invokeSuspend")
public final class C1714850uj5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BioVerifyViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714850uj5(BioVerifyViewModel bioVerifyViewModel, String str, InterfaceC1364105Vn<? super C1714850uj5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bioVerifyViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1714850uj5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1715120ujW interfaceC1715120ujW;
        C1C7U.LIZ("BioVerifyViewModel@d5f8.verifySignedChallenge$2");
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
            interfaceC1715120ujW = null;
            C1715520ukA.LIZLLL("bio_vf_vrf_req", null, null, null);
            C1714950ujF c1714950ujF = this.LLILLJJLI.LLILZLL;
            if (c1714950ujF != null) {
                String str = this.LLILLL;
                this.LL = 1;
                obj = c1714950ujF.LIZIZ(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BioVerifyViewModel@d5f8.verifySignedChallenge$2");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.xQ2(interfaceC1715120ujW);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BioVerifyViewModel@d5f8.verifySignedChallenge$2");
            return unit;
        }
        interfaceC1715120ujW = (InterfaceC1715120ujW) obj;
        this.LLILLJJLI.xQ2(interfaceC1715120ujW);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BioVerifyViewModel@d5f8.verifySignedChallenge$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
