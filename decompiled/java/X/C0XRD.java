package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XRD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.hybrid.jsb.impl.EcPlayAudioMethod$loadCdnAudio$1$1", f = "EcPlayAudioMethod.kt", l = {}, m = "invokeSuspend")
public final class C0XRD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ CompletionBlock<C0XRH> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XRD(LifecycleOwner lifecycleOwner, String str, String str2, boolean z, CompletionBlock<C0XRH> completionBlock, InterfaceC1364105Vn<? super C0XRD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0XRD(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcPlayAudioMethod@30c1.loadCdnAudio$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0XRL.LIZ(this.LL).LIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ);
            CompletionBlock<C0XRH> completionBlock = this.LLILZIL;
            int i = C0XRI.LLILLL;
            completionBlock.onSuccess(C0XRG.LIZ(1, this.LLILLJJLI), "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            CompletionBlock<C0XRH> completionBlock2 = this.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cannot play cdn audio ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", error: ");
            sbLIZ.append(th.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int i2 = C0XRI.LLILLL;
            completionBlock2.onFailure(0, strLIZIZ, C0XRG.LIZ(-12, this.LLILLJJLI));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcPlayAudioMethod@30c1.loadCdnAudio$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
