package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CSv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailModel$deleteAllSelected$1$1", f = "EffectDraftDetailModel.kt", l = {}, m = "invokeSuspend")
public final class C314070CSv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ C316080CaE LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314070CSv(List<String> list, C316080CaE c316080CaE, InterfaceC1364105Vn<? super C314070CSv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c316080CaE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314070CSv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectDraftDetailModel@a1ea.deleteAllSelected$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> list = this.LL;
        C316080CaE c316080CaE = this.LLILLJJLI;
        for (String str : list) {
            c316080CaE.getClass();
            InterfaceC318260Cdk interfaceC318260CdkLIZ = C316080CaE.LIZ();
            if (interfaceC318260CdkLIZ != null) {
                interfaceC318260CdkLIZ.LJIIIIZZ(C0CHQ.LIZ, str);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectDraftDetailModel@a1ea.deleteAllSelected$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
