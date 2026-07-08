package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aiselfeffect.ScanFaceEffectComponent$updateLoadSceneUIAndPoll$4", f = "ScanFaceEffectComponent.kt", l = {}, m = "invokeSuspend")
public final class C527760Kms extends C09AX implements Function2<C527790Kmv, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0MIK LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C527760Kms(C0MIK c0mik, String str, String str2, InterfaceC1364105Vn<? super C527760Kms> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0mik;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C527760Kms c527760Kms = new C527760Kms(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c527760Kms.LL = obj;
        return c527760Kms;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScanFaceEffectComponent@ddfc.updateLoadSceneUIAndPoll$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C527790Kmv c527790Kmv = (C527790Kmv) this.LL;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI.LJFF);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C527770Kmt(this.LLILLJJLI, c527790Kmv, this.LLILLL, this.LLILZ, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScanFaceEffectComponent@ddfc.updateLoadSceneUIAndPoll$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C527790Kmv c527790Kmv, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c527790Kmv, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
