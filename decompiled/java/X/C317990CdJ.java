package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.EffectProfileListRepository$fetchDraftList$result$1", f = "EffectProfileListRepository.kt", l = {}, m = "invokeSuspend")
public final class C317990CdJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends CKEDraftInfo>>, Object> {
    public final /* synthetic */ C318050CdP LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317990CdJ(C318050CdP c318050CdP, InterfaceC1364105Vn<? super C317990CdJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c318050CdP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317990CdJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectProfileListRepository@4ea9.fetchDraftList$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<CKEDraftInfo> listLIZJ = this.LL.LIZJ();
        C1C7U.LIZIZ("EffectProfileListRepository@4ea9.fetchDraftList$result$1");
        return listLIZJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends CKEDraftInfo>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
