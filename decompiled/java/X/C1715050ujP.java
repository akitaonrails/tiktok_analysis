package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.verify.bio.BioVerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import njp.a;

/* JADX INFO: renamed from: X.0ujP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.bio.BioVerifyViewModel$userProvideSignature$2", f = "BioVerifyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1715050ujP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1715240uji LL;
    public final /* synthetic */ BioVerifyViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715050ujP(C1715240uji c1715240uji, BioVerifyViewModel bioVerifyViewModel, InterfaceC1364105Vn<? super C1715050ujP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1715240uji;
        this.LLILLJJLI = bioVerifyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1715050ujP(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BioVerifyViewModel@d5f8.userProvideSignature$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1715240uji c1715240uji = this.LL;
            c1715240uji.LIZIZ.update(c1715240uji.LIZ.getBytes(Charsets.UTF_8));
            String strEncodeToString = Base64.encodeToString(this.LL.LIZIZ.sign(), 2);
            C1715520ukA.LIZLLL("bio_vf_auth_sign", "1", null, null);
            this.LLILLJJLI.AQ2(strEncodeToString);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1715520ukA.LIZLLL("bio_vf_auth_sign", C0T8W.LIZ(e), null, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BioVerifyViewModel@d5f8.userProvideSignature$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
